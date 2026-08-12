package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.C1382d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p010D0.InterfaceC0092a;
import p144r0.C2366c;
import p147s0.AbstractC2392a;
import p147s0.AbstractC2401j;
import p147s0.AbstractC2402k;
import p147s0.AbstractC2403l;
import p147s0.AbstractC2404m;
import p147s0.AbstractC2405n;
import p147s0.AbstractC2406o;
import p147s0.EnumC2407p;
import p150t0.AbstractC2433i;
import p150t0.C2432h;
import p151t1.C2448b;
import p151t1.InterfaceC2447a;
import p153u0.AbstractC2461f;
import p153u0.AbstractC2462g;
import p153u0.InterfaceC2468m;
import p162x0.AbstractC2523a;
import p165y0.AbstractC2544b;
import p165y0.InterfaceC2543a;
import p165y0.InterfaceC2545c;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.d */
/* JADX INFO: loaded from: classes.dex */
final class C1382d implements InterfaceC2468m {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2447a f6871a;

    /* JADX INFO: renamed from: b */
    private final ConnectivityManager f6872b;

    /* JADX INFO: renamed from: c */
    private final Context f6873c;

    /* JADX INFO: renamed from: d */
    final URL f6874d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0092a f6875e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0092a f6876f;

    /* JADX INFO: renamed from: g */
    private final int f6877g;

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.d$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        final URL f6878a;

        /* JADX INFO: renamed from: b */
        final AbstractC2401j f6879b;

        /* JADX INFO: renamed from: c */
        final String f6880c;

        a(URL url, AbstractC2401j abstractC2401j, String str) {
            this.f6878a = url;
            this.f6879b = abstractC2401j;
            this.f6880c = str;
        }

        /* JADX INFO: renamed from: a */
        a m7206a(URL url) {
            return new a(url, this.f6879b, this.f6880c);
        }
    }

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.d$b */
    static final class b {

        /* JADX INFO: renamed from: a */
        final int f6881a;

        /* JADX INFO: renamed from: b */
        final URL f6882b;

        /* JADX INFO: renamed from: c */
        final long f6883c;

        b(int i3, URL url, long j3) {
            this.f6881a = i3;
            this.f6882b = url;
            this.f6883c = j3;
        }
    }

    C1382d(Context context, InterfaceC0092a interfaceC0092a, InterfaceC0092a interfaceC0092a2, int i3) {
        this.f6871a = AbstractC2401j.m11573b();
        this.f6873c = context;
        this.f6872b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f6874d = m7203m(C1379a.f6862c);
        this.f6875e = interfaceC0092a2;
        this.f6876f = interfaceC0092a;
        this.f6877g = i3;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ a m7194d(a aVar, b bVar) {
        URL url = bVar.f6882b;
        if (url == null) {
            return null;
        }
        AbstractC2523a.m12054b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m7206a(bVar.f6882b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public b m7195e(a aVar) throws IOException {
        AbstractC2523a.m12058f("CctTransportBackend", "Making request to: %s", aVar.f6878a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f6878a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f6877g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f6880c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f6871a.mo11741a(aVar.f6879b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC2523a.m12058f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC2523a.m12054b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC2523a.m12054b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM7202l = m7202l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC2405n.m11582b(new BufferedReader(new InputStreamReader(inputStreamM7202l))).mo11566c());
                            if (inputStreamM7202l != null) {
                                inputStreamM7202l.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e3) {
            e = e3;
            AbstractC2523a.m12056d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            AbstractC2523a.m12056d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e5) {
            e = e5;
            AbstractC2523a.m12056d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (C2448b e6) {
            e = e6;
            AbstractC2523a.m12056d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* JADX INFO: renamed from: f */
    private static int m7196f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC2406o.b.UNKNOWN_MOBILE_SUBTYPE.m11585b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC2406o.b.COMBINED.m11585b();
        }
        if (AbstractC2406o.b.m11584a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    private static int m7197g(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC2406o.c.NONE.m11587b() : networkInfo.getType();
    }

    /* JADX INFO: renamed from: h */
    private static int m7198h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e3) {
            AbstractC2523a.m12056d("CctTransportBackend", "Unable to find version code for package", e3);
            return -1;
        }
    }

    /* JADX INFO: renamed from: i */
    private AbstractC2401j m7199i(AbstractC2461f abstractC2461f) {
        AbstractC2403l.a aVarM11577j;
        HashMap map = new HashMap();
        for (AbstractC2433i abstractC2433i : abstractC2461f.mo11755b()) {
            String strMo11672j = abstractC2433i.mo11672j();
            if (map.containsKey(strMo11672j)) {
                ((List) map.get(strMo11672j)).add(abstractC2433i);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC2433i);
                map.put(strMo11672j, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            AbstractC2433i abstractC2433i2 = (AbstractC2433i) ((List) entry.getValue()).get(0);
            AbstractC2404m.a aVarMo11559b = AbstractC2404m.m11578a().mo11563f(EnumC2407p.DEFAULT).mo11564g(this.f6876f.mo259a()).mo11565h(this.f6875e.mo259a()).mo11559b(AbstractC2402k.m11574a().mo11535c(AbstractC2402k.b.ANDROID_FIREBASE).mo11534b(AbstractC2392a.m11498a().mo11523m(Integer.valueOf(abstractC2433i2.m11711g("sdk-version"))).mo11520j(abstractC2433i2.m11710b("model")).mo11516f(abstractC2433i2.m11710b("hardware")).mo11514d(abstractC2433i2.m11710b("device")).mo11522l(abstractC2433i2.m11710b("product")).mo11521k(abstractC2433i2.m11710b("os-uild")).mo11518h(abstractC2433i2.m11710b("manufacturer")).mo11515e(abstractC2433i2.m11710b("fingerprint")).mo11513c(abstractC2433i2.m11710b("country")).mo11517g(abstractC2433i2.m11710b("locale")).mo11519i(abstractC2433i2.m11710b("mcc_mnc")).mo11512b(abstractC2433i2.m11710b("application_build")).mo11511a()).mo11533a());
            try {
                aVarMo11559b.m11579i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarMo11559b.m11580j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC2433i abstractC2433i3 : (List) entry.getValue()) {
                C2432h c2432hMo11670e = abstractC2433i3.mo11670e();
                C2366c c2366cM11708b = c2432hMo11670e.m11708b();
                if (c2366cM11708b.equals(C2366c.m11213b("proto"))) {
                    aVarM11577j = AbstractC2403l.m11577j(c2432hMo11670e.m11707a());
                } else if (c2366cM11708b.equals(C2366c.m11213b("json"))) {
                    aVarM11577j = AbstractC2403l.m11576i(new String(c2432hMo11670e.m11707a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC2523a.m12059g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", c2366cM11708b);
                }
                aVarM11577j.mo11545c(abstractC2433i3.mo11671f()).mo11546d(abstractC2433i3.mo11673k()).mo11550h(abstractC2433i3.m11712h("tz-offset")).mo11547e(AbstractC2406o.m11583a().mo11571c(AbstractC2406o.c.m11586a(abstractC2433i3.m11711g("net-type"))).mo11570b(AbstractC2406o.b.m11584a(abstractC2433i3.m11711g("mobile-subtype"))).mo11569a());
                if (abstractC2433i3.mo11669d() != null) {
                    aVarM11577j.mo11544b(abstractC2433i3.mo11669d());
                }
                arrayList3.add(aVarM11577j.mo11543a());
            }
            aVarMo11559b.mo11560c(arrayList3);
            arrayList2.add(aVarMo11559b.mo11558a());
        }
        return AbstractC2401j.m11572a(arrayList2);
    }

    /* JADX INFO: renamed from: j */
    private static TelephonyManager m7200j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: renamed from: k */
    static long m7201k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: renamed from: l */
    private static InputStream m7202l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* JADX INFO: renamed from: m */
    private static URL m7203m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e3) {
            throw new IllegalArgumentException("Invalid url: " + str, e3);
        }
    }

    @Override // p153u0.InterfaceC2468m
    /* JADX INFO: renamed from: a */
    public AbstractC2433i mo7204a(AbstractC2433i abstractC2433i) {
        NetworkInfo activeNetworkInfo = this.f6872b.getActiveNetworkInfo();
        return abstractC2433i.m11714l().m11715a("sdk-version", Build.VERSION.SDK_INT).m11717c("model", Build.MODEL).m11717c("hardware", Build.HARDWARE).m11717c("device", Build.DEVICE).m11717c("product", Build.PRODUCT).m11717c("os-uild", Build.ID).m11717c("manufacturer", Build.MANUFACTURER).m11717c("fingerprint", Build.FINGERPRINT).m11716b("tz-offset", m7201k()).m11715a("net-type", m7197g(activeNetworkInfo)).m11715a("mobile-subtype", m7196f(activeNetworkInfo)).m11717c("country", Locale.getDefault().getCountry()).m11717c("locale", Locale.getDefault().getLanguage()).m11717c("mcc_mnc", m7200j(this.f6873c).getSimOperator()).m11717c("application_build", Integer.toString(m7198h(this.f6873c))).mo11674d();
    }

    @Override // p153u0.InterfaceC2468m
    /* JADX INFO: renamed from: b */
    public AbstractC2462g mo7205b(AbstractC2461f abstractC2461f) {
        AbstractC2401j abstractC2401jM7199i = m7199i(abstractC2461f);
        URL urlM7203m = this.f6874d;
        if (abstractC2461f.mo11756c() != null) {
            try {
                C1379a c1379aM7187c = C1379a.m7187c(abstractC2461f.mo11756c());
                strM7190d = c1379aM7187c.m7190d() != null ? c1379aM7187c.m7190d() : null;
                if (c1379aM7187c.m7191e() != null) {
                    urlM7203m = m7203m(c1379aM7187c.m7191e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC2462g.m11768a();
            }
        }
        try {
            b bVar = (b) AbstractC2544b.m12193a(5, new a(urlM7203m, abstractC2401jM7199i, strM7190d), new InterfaceC2543a() { // from class: com.google.android.datatransport.cct.b
                @Override // p165y0.InterfaceC2543a
                public final Object apply(Object obj) {
                    return this.f6870a.m7195e((C1382d.a) obj);
                }
            }, new InterfaceC2545c() { // from class: com.google.android.datatransport.cct.c
                @Override // p165y0.InterfaceC2545c
                /* JADX INFO: renamed from: a */
                public final Object mo7192a(Object obj, Object obj2) {
                    return C1382d.m7194d((C1382d.a) obj, (C1382d.b) obj2);
                }
            });
            int i3 = bVar.f6881a;
            if (i3 == 200) {
                return AbstractC2462g.m11770e(bVar.f6883c);
            }
            if (i3 < 500 && i3 != 404) {
                return i3 == 400 ? AbstractC2462g.m11769d() : AbstractC2462g.m11768a();
            }
            return AbstractC2462g.m11771f();
        } catch (IOException e3) {
            AbstractC2523a.m12056d("CctTransportBackend", "Could not make request to the backend", e3);
            return AbstractC2462g.m11771f();
        }
    }

    C1382d(Context context, InterfaceC0092a interfaceC0092a, InterfaceC0092a interfaceC0092a2) {
        this(context, interfaceC0092a, interfaceC0092a2, 130000);
    }
}
