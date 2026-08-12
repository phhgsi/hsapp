package co.median.android;

import android.content.Context;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Observable;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p128m0.C2210f1;
import p135o0.C2287a;
import p135o0.C2292f;

/* JADX INFO: renamed from: co.median.android.u */
/* JADX INFO: loaded from: classes.dex */
public class C1363u extends Observable {

    /* JADX INFO: renamed from: d */
    private static final String f6721d = "co.median.android.u";

    /* JADX INFO: renamed from: a */
    private Context f6722a;

    /* JADX INFO: renamed from: b */
    private a f6723b = null;

    /* JADX INFO: renamed from: c */
    private boolean f6724c = false;

    /* JADX INFO: renamed from: co.median.android.u$a */
    private static class a extends AsyncTask {

        /* JADX INFO: renamed from: a */
        private WeakReference f6725a;

        public a(C1363u c1363u) {
            this.f6725a = new WeakReference(c1363u);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            C1363u c1363u = (C1363u) this.f6725a.get();
            if (c1363u == null) {
                return null;
            }
            try {
                URL url = new URL(strArr[0]);
                HttpURLConnection httpURLConnection = null;
                int i3 = 0;
                do {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    boolean z2 = true;
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setRequestProperty("User-Agent", C2287a.m10903f(c1363u.f6722a).f10584z);
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 301 || responseCode == 302) {
                        i3++;
                        url = new URL(url, httpURLConnection.getHeaderField("Location"));
                    } else {
                        z2 = false;
                    }
                    if (isCancelled() || !z2) {
                        break;
                    }
                } while (i3 < 10);
                String string = httpURLConnection.getURL().toString();
                httpURLConnection.disconnect();
                return string;
            } catch (Exception e3) {
                C2292f.m10956b().m10960f(C1363u.f6721d, e3.getMessage(), e3);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            C1363u c1363u = (C1363u) this.f6725a.get();
            if (c1363u == null) {
                return;
            }
            C2210f1.m10771a().m10775d(str);
            if (str == null) {
                c1363u.f6724c = false;
                c1363u.setChanged();
                c1363u.notifyObservers();
                return;
            }
            C2287a c2287aM10903f = C2287a.m10903f(c1363u.f6722a);
            List list = c2287aM10903f.f10475F;
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (((Pattern) list.get(i3)).matcher(str).matches()) {
                    JSONObject jSONObject = (JSONObject) c2287aM10903f.f10477G.get(i3);
                    c1363u.f6724c = jSONObject.optBoolean("loggedIn", false);
                    if (C2287a.m10904j(jSONObject, "menuName") == null) {
                        boolean unused = c1363u.f6724c;
                    }
                    c1363u.setChanged();
                    c1363u.notifyObservers();
                    return;
                }
            }
        }
    }

    C1363u(Context context) {
        this.f6722a = context;
        m7106g();
    }

    /* JADX INFO: renamed from: g */
    public void m7106g() {
        a aVar = this.f6723b;
        if (aVar != null) {
            aVar.cancel(true);
        }
        if (C2287a.m10903f(this.f6722a).f10465A == null) {
            return;
        }
        a aVar2 = new a(this);
        this.f6723b = aVar2;
        aVar2.execute(C2287a.m10903f(this.f6722a).f10465A);
    }

    /* JADX INFO: renamed from: h */
    public boolean m7107h() {
        return this.f6724c;
    }
}
