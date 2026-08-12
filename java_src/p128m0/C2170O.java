package p128m0;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;
import p135o0.C2287a;
import p135o0.C2292f;
import p135o0.InterfaceC2294h;

/* JADX INFO: renamed from: m0.O */
/* JADX INFO: loaded from: classes.dex */
public class C2170O {

    /* JADX INFO: renamed from: c */
    private static final String f9996c = "m0.O";

    /* JADX INFO: renamed from: a */
    private String f9997a;

    /* JADX INFO: renamed from: b */
    private boolean f9998b = false;

    /* JADX INFO: renamed from: a */
    private static String m10653a(String str) {
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split("; *")) {
                if (str2.startsWith("charset=")) {
                    return str2.substring(8);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m10654d(String str, String str2) {
        return str == null ? str2 != null : !str.equals(str2);
    }

    /* JADX INFO: renamed from: e */
    private static boolean m10655e(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                URL url = new URL(str);
                URL url2 = new URL(str2);
                if (m10654d(url.getProtocol(), url2.getProtocol()) || m10654d(url.getAuthority(), url2.getAuthority()) || m10654d(url.getQuery(), url2.getQuery())) {
                    return false;
                }
                String path = url.getPath();
                String path2 = url2.getPath();
                if (path == null) {
                    path = "";
                }
                if (path2 == null) {
                    path2 = "";
                }
                int length = path2.length() - path2.length();
                if (length <= 1 && length >= -1) {
                    if (length == 0) {
                        return path.equals(path2);
                    }
                    if (length == 1) {
                        return path2.equals(path + "/");
                    }
                    return path.equals(path2 + "/");
                }
            } catch (MalformedURLException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX INFO: renamed from: b */
    public WebResourceResponse m10656b(Activity activity, InterfaceC2294h interfaceC2294h, String str, String str2) throws Throwable {
        Closeable closeable;
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        String string;
        Map map;
        ?? r2 = str2;
        C2287a c2287aM10903f = C2287a.m10903f(activity);
        ?? r8 = 0;
        if (!c2287aM10903f.f10479H && ((map = c2287aM10903f.f10481I) == null || map.isEmpty())) {
            return null;
        }
        if (!this.f9998b) {
            this.f9997a = str;
            this.f9998b = true;
        }
        try {
            if (!m10655e(this.f9997a, str)) {
                return null;
            }
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                if (!protocol.equalsIgnoreCase("http") && !protocol.equalsIgnoreCase("https")) {
                    AbstractC2172P.m10664a(null);
                    AbstractC2172P.m10664a(null);
                    return null;
                }
                ?? r9 = (HttpURLConnection) url.openConnection();
                r9.setInstanceFollowRedirects(false);
                String strM10922v = c2287aM10903f.m10922v(url.toString());
                if (strM10922v != null) {
                    r9.setRequestProperty("User-Agent", strM10922v);
                } else if (TextUtils.isEmpty(c2287aM10903f.f10584z)) {
                    r9.setRequestProperty("User-Agent", interfaceC2294h.getDefaultUserAgent() + " " + c2287aM10903f.f10547k);
                } else {
                    r9.setRequestProperty("User-Agent", c2287aM10903f.f10584z);
                }
                r9.setRequestProperty("Cache-Control", "no-cache");
                if (r2 != 0) {
                    r9.setRequestProperty("Referer", r2);
                }
                r9.setRequestProperty("Accept-Language", Locale.getDefault().toLanguageTag());
                Map mapM10818a = AbstractC2241q.m10818a(activity);
                if (mapM10818a != null) {
                    for (Map.Entry entry : mapM10818a.entrySet()) {
                        r9.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                r9.connect();
                int responseCode = r9.getResponseCode();
                if (responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307) {
                    String contentType = r9.getContentType();
                    if (contentType == null) {
                        try {
                            bufferedInputStream = new BufferedInputStream(r9.getInputStream());
                        } catch (IOException unused) {
                            bufferedInputStream = new BufferedInputStream(r9.getErrorStream());
                        }
                        r2 = bufferedInputStream;
                        try {
                            contentType = URLConnection.guessContentTypeFromStream(r2);
                            r2 = r2;
                        } catch (Exception e3) {
                            e = e3;
                            byteArrayOutputStream = null;
                            C2292f.m10956b().m10960f(f9996c, e.toString(), e);
                            AbstractC2172P.m10664a(r2);
                            AbstractC2172P.m10664a(byteArrayOutputStream);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            closeable = null;
                            r8 = r2;
                            AbstractC2172P.m10664a(r8);
                            AbstractC2172P.m10664a(closeable);
                            throw th;
                        }
                    } else {
                        r2 = 0;
                    }
                    if (contentType != null && contentType.startsWith("text/html")) {
                        String strM10653a = m10653a(contentType);
                        if (strM10653a == null) {
                            strM10653a = "UTF-8";
                        } else if (strM10653a.toLowerCase().equals("iso-8859-1")) {
                            strM10653a = "windows-1252";
                        }
                        if (r2 == 0) {
                            try {
                                bufferedInputStream2 = new BufferedInputStream(r9.getInputStream());
                            } catch (IOException unused2) {
                                bufferedInputStream2 = new BufferedInputStream(r9.getErrorStream());
                            }
                            r2 = bufferedInputStream2;
                        }
                        int contentLength = r9.getContentLength();
                        if (contentLength < 0) {
                            contentLength = 10240;
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream(contentLength);
                        try {
                            AbstractC2172P.m10665b(r2, byteArrayOutputStream);
                            try {
                                string = byteArrayOutputStream.toString(strM10653a);
                            } catch (UnsupportedEncodingException unused3) {
                                string = byteArrayOutputStream.toString("UTF-8");
                            }
                            int iIndexOf = string.indexOf("</head>");
                            if (iIndexOf >= 0) {
                                StringBuilder sb = new StringBuilder(contentLength);
                                sb.append(string.substring(0, iIndexOf));
                                if (c2287aM10903f.f10483J != null) {
                                    sb.append("<meta name=\"viewport\" content=\"");
                                    sb.append(TextUtils.htmlEncode(c2287aM10903f.f10483J));
                                    sb.append("\" />");
                                }
                                if (!Double.isNaN(c2287aM10903f.f10492N0)) {
                                    if (c2287aM10903f.f10485K) {
                                        sb.append(String.format(Locale.US, "<meta name=\"viewport\" content=\"width=%f,maximum-scale=1.0\" />", Double.valueOf(c2287aM10903f.f10492N0)));
                                    } else {
                                        double width = interfaceC2294h.getWidth() / activity.getResources().getDisplayMetrics().density;
                                        double d3 = c2287aM10903f.f10492N0;
                                        double d4 = width / d3;
                                        sb.append(String.format(Locale.US, "<meta name=\"viewport\" content=\"width=%f,initial-scale=%f,minimum-scale=%f,maximum-scale=%f\" />", Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d4), Double.valueOf(d4)));
                                    }
                                }
                                sb.append(string.substring(iIndexOf));
                                string = sb.toString();
                            } else {
                                Log.d(f9996c, "could not find closing </head> tag");
                            }
                            WebResourceResponse webResourceResponse = new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(string.getBytes("UTF-8")));
                            AbstractC2172P.m10664a(r2);
                            AbstractC2172P.m10664a(byteArrayOutputStream);
                            return webResourceResponse;
                        } catch (Exception e4) {
                            e = e4;
                            C2292f.m10956b().m10960f(f9996c, e.toString(), e);
                            AbstractC2172P.m10664a(r2);
                            AbstractC2172P.m10664a(byteArrayOutputStream);
                            return null;
                        }
                    }
                    AbstractC2172P.m10664a(r2);
                    AbstractC2172P.m10664a(null);
                    return null;
                }
                String headerField = r9.getHeaderField("Location");
                r9.disconnect();
                try {
                    new URL(headerField);
                } catch (MalformedURLException unused4) {
                    headerField = new URL(new URL(str), headerField).toString();
                }
                if (TextUtils.isEmpty(headerField)) {
                    AbstractC2172P.m10664a(null);
                    AbstractC2172P.m10664a(null);
                    return null;
                }
                WebResourceResponse webResourceResponseM10656b = m10656b(activity, interfaceC2294h, headerField, str);
                AbstractC2172P.m10664a(null);
                AbstractC2172P.m10664a(null);
                return webResourceResponseM10656b;
            } catch (Exception e5) {
                e = e5;
                r2 = 0;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                AbstractC2172P.m10664a(r8);
                AbstractC2172P.m10664a(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m10657c(String str) {
        this.f9997a = str;
    }
}
