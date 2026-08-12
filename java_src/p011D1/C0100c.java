package p011D1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C1681d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p002A1.InterfaceC0027b;
import p011D1.AbstractC0101d;
import p011D1.AbstractC0103f;
import p166y1.InterfaceC2554i;

/* JADX INFO: renamed from: D1.c */
/* JADX INFO: loaded from: classes.dex */
public class C0100c {

    /* JADX INFO: renamed from: d */
    private static final Pattern f203d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e */
    private static final Charset f204e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    private final Context f205a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0027b f206b;

    /* JADX INFO: renamed from: c */
    private final C0102e f207c = new C0102e();

    public C0100c(Context context, InterfaceC0027b interfaceC0027b) {
        this.f205a = context;
        this.f206b = interfaceC0027b;
    }

    /* JADX INFO: renamed from: a */
    private static String m288a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    /* JADX INFO: renamed from: b */
    private static JSONObject m289b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (JSONException e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* JADX INFO: renamed from: c */
    private static JSONObject m290c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* JADX INFO: renamed from: f */
    private String m291f() {
        try {
            Context context = this.f205a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f205a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e3) {
            Log.e("ContentValues", "No such package: " + this.f205a.getPackageName(), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private URL m292g(String str) throws C1681d {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e3) {
            throw new C1681d(e3.getMessage(), C1681d.a.UNAVAILABLE);
        }
    }

    /* JADX INFO: renamed from: h */
    private static byte[] m293h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* JADX INFO: renamed from: i */
    private static boolean m294i(int i3) {
        return i3 >= 200 && i3 < 300;
    }

    /* JADX INFO: renamed from: j */
    private static void m295j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* JADX INFO: renamed from: k */
    private static void m296k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String strM300o = m300o(httpURLConnection);
        if (TextUtils.isEmpty(strM300o)) {
            return;
        }
        Log.w("Firebase-Installations", strM300o);
        Log.w("Firebase-Installations", m288a(str, str2, str3));
    }

    /* JADX INFO: renamed from: l */
    private HttpURLConnection m297l(URL url, String str) throws C1681d {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f205a.getPackageName());
            InterfaceC2554i interfaceC2554i = (InterfaceC2554i) this.f206b.get();
            if (interfaceC2554i != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(interfaceC2554i.mo12201a()));
                } catch (InterruptedException e3) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e3);
                } catch (ExecutionException e4) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e4);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m291f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C1681d("Firebase Installations Service is unavailable. Please try again later.", C1681d.a.UNAVAILABLE);
        }
    }

    /* JADX INFO: renamed from: m */
    static long m298m(String str) {
        Preconditions.checkArgument(f203d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX INFO: renamed from: n */
    private AbstractC0101d m299n(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f204e));
        AbstractC0103f.a aVarM315a = AbstractC0103f.m315a();
        AbstractC0101d.a aVarM307a = AbstractC0101d.m307a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                aVarM307a.mo280f(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarM307a.mo277c(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarM307a.mo278d(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarM315a.mo286c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarM315a.mo287d(m298m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarM307a.mo276b(aVarM315a.mo284a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarM307a.mo279e(AbstractC0101d.b.OK).mo275a();
    }

    /* JADX INFO: renamed from: o */
    private static String m300o(HttpURLConnection httpURLConnection) {
        StringBuilder sb;
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f204e));
        try {
            try {
                sb = new StringBuilder();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            sb.append('\n');
            return null;
        }
        String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
        try {
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        return str;
    }

    /* JADX INFO: renamed from: p */
    private AbstractC0103f m301p(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f204e));
        AbstractC0103f.a aVarM315a = AbstractC0103f.m315a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarM315a.mo286c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarM315a.mo287d(m298m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarM315a.mo285b(AbstractC0103f.b.OK).mo284a();
    }

    /* JADX INFO: renamed from: q */
    private void m302q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m304s(httpURLConnection, m293h(m289b(str, str2)));
    }

    /* JADX INFO: renamed from: r */
    private void m303r(HttpURLConnection httpURLConnection) throws IOException {
        m304s(httpURLConnection, m293h(m290c()));
    }

    /* JADX INFO: renamed from: s */
    private static void m304s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public AbstractC0101d m305d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC0101d abstractC0101dM299n;
        if (!this.f207c.m313b()) {
            throw new C1681d("Firebase Installations Service is unavailable. Please try again later.", C1681d.a.UNAVAILABLE);
        }
        URL urlM292g = m292g(String.format("projects/%s/installations", str3));
        for (int i3 = 0; i3 <= 1; i3++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM297l = m297l(urlM292g, str);
            try {
                try {
                    httpURLConnectionM297l.setRequestMethod("POST");
                    httpURLConnectionM297l.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionM297l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m302q(httpURLConnectionM297l, str2, str4);
                    responseCode = httpURLConnectionM297l.getResponseCode();
                    this.f207c.m314f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (m294i(responseCode)) {
                    abstractC0101dM299n = m299n(httpURLConnectionM297l);
                } else {
                    m296k(httpURLConnectionM297l, str4, str, str3);
                    if (responseCode == 429) {
                        throw new C1681d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C1681d.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        m295j();
                        abstractC0101dM299n = AbstractC0101d.m307a().mo279e(AbstractC0101d.b.BAD_CONFIG).mo275a();
                    }
                    httpURLConnectionM297l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                httpURLConnectionM297l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return abstractC0101dM299n;
            } catch (Throwable th) {
                httpURLConnectionM297l.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new C1681d("Firebase Installations Service is unavailable. Please try again later.", C1681d.a.UNAVAILABLE);
    }

    /* JADX INFO: renamed from: e */
    public AbstractC0103f m306e(String str, String str2, String str3, String str4) {
        int responseCode;
        AbstractC0103f abstractC0103fM301p;
        if (!this.f207c.m313b()) {
            throw new C1681d("Firebase Installations Service is unavailable. Please try again later.", C1681d.a.UNAVAILABLE);
        }
        URL urlM292g = m292g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i3 = 0; i3 <= 1; i3++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionM297l = m297l(urlM292g, str);
            try {
                try {
                    httpURLConnectionM297l.setRequestMethod("POST");
                    httpURLConnectionM297l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionM297l.setDoOutput(true);
                    m303r(httpURLConnectionM297l);
                    responseCode = httpURLConnectionM297l.getResponseCode();
                    this.f207c.m314f(responseCode);
                } finally {
                    httpURLConnectionM297l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (m294i(responseCode)) {
                abstractC0103fM301p = m301p(httpURLConnectionM297l);
            } else {
                m296k(httpURLConnectionM297l, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    abstractC0103fM301p = AbstractC0103f.m315a().mo285b(AbstractC0103f.b.AUTH_ERROR).mo284a();
                } else {
                    if (responseCode == 429) {
                        throw new C1681d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C1681d.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        m295j();
                        abstractC0103fM301p = AbstractC0103f.m315a().mo285b(AbstractC0103f.b.BAD_CONFIG).mo284a();
                    }
                }
            }
            return abstractC0103fM301p;
        }
        throw new C1681d("Firebase Installations Service is unavailable. Please try again later.", C1681d.a.UNAVAILABLE);
    }
}
