package p135o0;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p135o0.C2290d;
import p141q0.C2347a;
import p141q0.C2349c;
import p141q0.C2350d;

/* JADX INFO: renamed from: o0.a */
/* JADX INFO: loaded from: classes.dex */
public class C2287a {

    /* JADX INFO: renamed from: r1 */
    private static C2287a f10464r1;

    /* JADX INFO: renamed from: A */
    public String f10465A;

    /* JADX INFO: renamed from: B */
    public String f10467B;

    /* JADX INFO: renamed from: C */
    public String f10469C;

    /* JADX INFO: renamed from: D */
    public String f10471D;

    /* JADX INFO: renamed from: E */
    public JSONObject f10473E;

    /* JADX INFO: renamed from: F */
    public List f10475F;

    /* JADX INFO: renamed from: G */
    public List f10477G;

    /* JADX INFO: renamed from: I */
    public Map f10481I;

    /* JADX INFO: renamed from: J */
    public String f10483J;

    /* JADX INFO: renamed from: O */
    public String f10493O;

    /* JADX INFO: renamed from: P */
    public String f10495P;

    /* JADX INFO: renamed from: Q */
    public String f10497Q;

    /* JADX INFO: renamed from: R0 */
    public JSONObject f10500R0;

    /* JADX INFO: renamed from: Z0 */
    public JSONObject f10516Z0;

    /* JADX INFO: renamed from: a */
    public Exception f10517a;

    /* JADX INFO: renamed from: a0 */
    public JSONArray f10518a0;

    /* JADX INFO: renamed from: a1 */
    public JSONObject f10519a1;

    /* JADX INFO: renamed from: b0 */
    public ArrayList f10521b0;

    /* JADX INFO: renamed from: b1 */
    public JSONArray f10522b1;

    /* JADX INFO: renamed from: c */
    public String f10523c;

    /* JADX INFO: renamed from: c0 */
    public ArrayList f10524c0;

    /* JADX INFO: renamed from: c1 */
    public JSONObject f10525c1;

    /* JADX INFO: renamed from: d */
    public String f10526d;

    /* JADX INFO: renamed from: e */
    public String f10529e;

    /* JADX INFO: renamed from: f */
    public String f10532f;

    /* JADX INFO: renamed from: g */
    public String f10535g;

    /* JADX INFO: renamed from: g0 */
    public ArrayList f10536g0;

    /* JADX INFO: renamed from: h1 */
    public JSONObject f10540h1;

    /* JADX INFO: renamed from: i0 */
    public ArrayList f10542i0;

    /* JADX INFO: renamed from: j */
    public String f10544j;

    /* JADX INFO: renamed from: j0 */
    public ArrayList f10545j0;

    /* JADX INFO: renamed from: j1 */
    private List f10546j1;

    /* JADX INFO: renamed from: k */
    public String f10547k;

    /* JADX INFO: renamed from: k0 */
    public C2297k f10548k0;

    /* JADX INFO: renamed from: l */
    public String f10550l;

    /* JADX INFO: renamed from: l0 */
    public JSONArray f10551l0;

    /* JADX INFO: renamed from: m */
    public String f10553m;

    /* JADX INFO: renamed from: o0 */
    public JSONArray f10560o0;

    /* JADX INFO: renamed from: p1 */
    public JSONArray f10564p1;

    /* JADX INFO: renamed from: q1 */
    private Map f10567q1;

    /* JADX INFO: renamed from: r0 */
    public List f10569r0;

    /* JADX INFO: renamed from: s0 */
    public List f10571s0;

    /* JADX INFO: renamed from: u0 */
    public ArrayList f10575u0;

    /* JADX INFO: renamed from: v */
    public List f10576v;

    /* JADX INFO: renamed from: v0 */
    public ArrayList f10577v0;

    /* JADX INFO: renamed from: w */
    public JSONArray f10578w;

    /* JADX INFO: renamed from: w0 */
    public Map f10579w0;

    /* JADX INFO: renamed from: x */
    public JSONArray f10580x;

    /* JADX INFO: renamed from: y */
    public JSONArray f10582y;

    /* JADX INFO: renamed from: z */
    public String f10584z;

    /* JADX INFO: renamed from: b */
    private final C2290d f10520b = new C2290d();

    /* JADX INFO: renamed from: h */
    public boolean f10538h = false;

    /* JADX INFO: renamed from: i */
    public boolean f10541i = true;

    /* JADX INFO: renamed from: n */
    public boolean f10556n = true;

    /* JADX INFO: renamed from: o */
    public int f10559o = 0;

    /* JADX INFO: renamed from: p */
    public boolean f10562p = false;

    /* JADX INFO: renamed from: q */
    public int f10565q = 0;

    /* JADX INFO: renamed from: r */
    public boolean f10568r = true;

    /* JADX INFO: renamed from: s */
    public boolean f10570s = false;

    /* JADX INFO: renamed from: t */
    public a f10572t = a.DEFAULT;

    /* JADX INFO: renamed from: u */
    public int f10574u = -1;

    /* JADX INFO: renamed from: H */
    public boolean f10479H = false;

    /* JADX INFO: renamed from: K */
    public boolean f10485K = false;

    /* JADX INFO: renamed from: L */
    public boolean f10487L = false;

    /* JADX INFO: renamed from: M */
    public boolean f10489M = false;

    /* JADX INFO: renamed from: N */
    public boolean f10491N = true;

    /* JADX INFO: renamed from: R */
    public int f10499R = 10;

    /* JADX INFO: renamed from: S */
    public float f10501S = 1.0f;

    /* JADX INFO: renamed from: T */
    public b f10503T = null;

    /* JADX INFO: renamed from: U */
    public b f10505U = null;

    /* JADX INFO: renamed from: V */
    public b f10507V = null;

    /* JADX INFO: renamed from: W */
    public boolean f10509W = false;

    /* JADX INFO: renamed from: X */
    public Map f10511X = new HashMap();

    /* JADX INFO: renamed from: Y */
    public Map f10513Y = new HashMap();

    /* JADX INFO: renamed from: Z */
    public boolean f10515Z = false;

    /* JADX INFO: renamed from: d0 */
    public boolean f10527d0 = true;

    /* JADX INFO: renamed from: e0 */
    public boolean f10530e0 = false;

    /* JADX INFO: renamed from: f0 */
    public boolean f10533f0 = true;

    /* JADX INFO: renamed from: h0 */
    public boolean f10539h0 = true;

    /* JADX INFO: renamed from: m0 */
    public boolean f10554m0 = false;

    /* JADX INFO: renamed from: n0 */
    public boolean f10557n0 = false;

    /* JADX INFO: renamed from: p0 */
    public boolean f10563p0 = true;

    /* JADX INFO: renamed from: q0 */
    public int f10566q0 = 10;

    /* JADX INFO: renamed from: t0 */
    public boolean f10573t0 = false;

    /* JADX INFO: renamed from: x0 */
    public boolean f10581x0 = false;

    /* JADX INFO: renamed from: y0 */
    public boolean f10583y0 = false;

    /* JADX INFO: renamed from: z0 */
    public boolean f10585z0 = false;

    /* JADX INFO: renamed from: A0 */
    public float f10466A0 = 0.5f;

    /* JADX INFO: renamed from: B0 */
    public double f10468B0 = 0.2d;

    /* JADX INFO: renamed from: C0 */
    public boolean f10470C0 = false;

    /* JADX INFO: renamed from: D0 */
    public boolean f10472D0 = false;

    /* JADX INFO: renamed from: E0 */
    public String f10474E0 = "auto";

    /* JADX INFO: renamed from: F0 */
    public String f10476F0 = "auto";

    /* JADX INFO: renamed from: G0 */
    public String f10478G0 = "auto";

    /* JADX INFO: renamed from: H0 */
    public boolean f10480H0 = false;

    /* JADX INFO: renamed from: I0 */
    public boolean f10482I0 = false;

    /* JADX INFO: renamed from: J0 */
    public boolean f10484J0 = true;

    /* JADX INFO: renamed from: K0 */
    public boolean f10486K0 = true;

    /* JADX INFO: renamed from: L0 */
    public int f10488L0 = 1;

    /* JADX INFO: renamed from: M0 */
    public Integer f10490M0 = null;

    /* JADX INFO: renamed from: N0 */
    public double f10492N0 = Double.NaN;

    /* JADX INFO: renamed from: O0 */
    public Boolean f10494O0 = null;

    /* JADX INFO: renamed from: P0 */
    public String f10496P0 = null;

    /* JADX INFO: renamed from: Q0 */
    public c f10498Q0 = new c();

    /* JADX INFO: renamed from: S0 */
    public boolean f10502S0 = false;

    /* JADX INFO: renamed from: T0 */
    public boolean f10504T0 = false;

    /* JADX INFO: renamed from: U0 */
    public boolean f10506U0 = true;

    /* JADX INFO: renamed from: V0 */
    public C2350d f10508V0 = new C2350d();

    /* JADX INFO: renamed from: W0 */
    public C2347a f10510W0 = new C2347a();

    /* JADX INFO: renamed from: X0 */
    public boolean f10512X0 = false;

    /* JADX INFO: renamed from: Y0 */
    public C2349c f10514Y0 = new C2349c();

    /* JADX INFO: renamed from: d1 */
    public boolean f10528d1 = false;

    /* JADX INFO: renamed from: e1 */
    public int f10531e1 = 5;

    /* JADX INFO: renamed from: f1 */
    public int f10534f1 = 5;

    /* JADX INFO: renamed from: g1 */
    public boolean f10537g1 = false;

    /* JADX INFO: renamed from: i1 */
    private boolean f10543i1 = false;

    /* JADX INFO: renamed from: k1 */
    private boolean f10549k1 = true;

    /* JADX INFO: renamed from: l1 */
    public boolean f10552l1 = false;

    /* JADX INFO: renamed from: m1 */
    public boolean f10555m1 = false;

    /* JADX INFO: renamed from: n1 */
    public boolean f10558n1 = false;

    /* JADX INFO: renamed from: o1 */
    public boolean f10561o1 = false;

    /* JADX INFO: renamed from: o0.a$a */
    public enum a {
        DEFAULT,
        NO_CACHE,
        CACHE_ONLY,
        CACHE_ELSE_NETWORK;

        /* JADX INFO: renamed from: b */
        public int m10924b() {
            int iOrdinal = ordinal();
            if (iOrdinal == 1) {
                return 2;
            }
            if (iOrdinal != 2) {
                return iOrdinal != 3 ? -1 : 1;
            }
            return 3;
        }
    }

    /* JADX INFO: renamed from: o0.a$b */
    public enum b {
        UNSPECIFIED,
        PORTRAIT,
        LANDSCAPE,
        SENSOR
    }

    /* JADX INFO: renamed from: o0.a$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f10596a = true;

        /* JADX INFO: renamed from: b */
        public boolean f10597b = false;

        /* JADX INFO: renamed from: a */
        public boolean m10926a() {
            return this.f10597b;
        }
    }

    private C2287a(Context context) {
        try {
            m10906l(new JSONObject(m10913s(context, "appConfig.json")), context);
        } catch (Exception e3) {
            this.f10517a = e3;
            Log.e("AppConfig", "Error parsing appConfig.json", e3);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m10901b(Context context, String str) {
        try {
            context.getAssets().open(str).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m10902c(Context context) {
        this.f10552l1 = m10901b(context, "customCSS.css");
        this.f10555m1 = m10901b(context, "customJS.js");
        this.f10558n1 = m10901b(context, "androidCustomCSS.css");
        this.f10561o1 = m10901b(context, "androidCustomJS.js");
    }

    /* JADX INFO: renamed from: f */
    public static synchronized C2287a m10903f(Context context) {
        try {
            if (f10464r1 == null) {
                f10464r1 = new C2287a(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10464r1;
    }

    /* JADX INFO: renamed from: j */
    public static String m10904j(JSONObject jSONObject, String str) {
        return AbstractC2296j.m10970g(jSONObject, str);
    }

    /* JADX INFO: renamed from: k */
    private void m10905k(JSONObject jSONObject) {
        String strM10970g;
        if (jSONObject.optBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, false)) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actions");
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("actionSelection");
            if (jSONArrayOptJSONArray != null) {
                this.f10579w0 = new HashMap();
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i3);
                    if (jSONObjectOptJSONObject != null && (strM10970g = AbstractC2296j.m10970g(jSONObjectOptJSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME)) != null) {
                        this.f10579w0.put(strM10970g, jSONObjectOptJSONObject);
                    }
                }
            }
            if (jSONArrayOptJSONArray2 != null) {
                this.f10575u0 = new ArrayList();
                this.f10577v0 = new ArrayList();
                for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i4);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strM10970g2 = AbstractC2296j.m10970g(jSONObjectOptJSONObject2, "regex");
                        String strM10970g3 = AbstractC2296j.m10970g(jSONObjectOptJSONObject2, "id");
                        if (strM10970g2 != null && strM10970g3 != null) {
                            try {
                                this.f10575u0.add(Pattern.compile(strM10970g2));
                                this.f10577v0.add(strM10970g3);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m10906l(JSONObject jSONObject, Context context) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("general");
            if (jSONObjectOptJSONObject != null) {
                m10908n(jSONObjectOptJSONObject);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("navigation");
            if (jSONObjectOptJSONObject2 != null) {
                m10909o(jSONObjectOptJSONObject2);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("styling");
            if (jSONObjectOptJSONObject3 != null) {
                m10912r(jSONObjectOptJSONObject3);
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("permissions");
            if (jSONObjectOptJSONObject4 != null) {
                m10910p(jSONObjectOptJSONObject4);
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("contextMenu");
            if (jSONObjectOptJSONObject5 != null) {
                m10907m(jSONObjectOptJSONObject5);
            }
            this.f10525c1 = jSONObject.optJSONObject("services");
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("developmentTools");
            if (jSONObjectOptJSONObject6 != null) {
                this.f10528d1 = jSONObjectOptJSONObject6.optBoolean("enableWebConsoleLogs", false);
            }
            m10902c(context);
        } catch (Exception e3) {
            this.f10517a = e3;
            Log.e("AppConfig", "Error in parseConfig", e3);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m10907m(JSONObject jSONObject) {
        C2349c c2349c = new C2349c();
        this.f10514Y0 = c2349c;
        c2349c.f10791a = jSONObject.optBoolean("enabled", false);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("linkActions");
        if (jSONArrayOptJSONArray != null) {
            this.f10514Y0.f10792b = new String[jSONArrayOptJSONArray.length()];
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                this.f10514Y0.f10792b[i3] = jSONArrayOptJSONArray.optString(i3);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private void m10908n(JSONObject jSONObject) {
        String strM10970g;
        this.f10523c = AbstractC2296j.m10970g(jSONObject, "publicKey");
        this.f10526d = AbstractC2296j.m10970g(jSONObject, "deviceRegKey");
        this.f10529e = AbstractC2296j.m10970g(jSONObject, "appName");
        this.f10532f = AbstractC2296j.m10970g(jSONObject, "initialUrl");
        this.f10535g = AbstractC2296j.m10970g(jSONObject, "androidPackageName");
        this.f10538h = jSONObject.optBoolean("keepScreenOn", false);
        this.f10541i = jSONObject.optBoolean("enableWindowOpen", true);
        this.f10544j = AbstractC2296j.m10970g(jSONObject, "forceUserAgent");
        this.f10547k = AbstractC2296j.m10970g(jSONObject, "userAgentAdd");
        this.f10550l = AbstractC2296j.m10970g(jSONObject, "androidForceUserAgent");
        this.f10553m = AbstractC2296j.m10970g(jSONObject, "androidUserAgentAdd");
        this.f10556n = jSONObject.optBoolean("injectMedianJS", true);
        this.f10559o = jSONObject.optInt("forceSessionCookieExpiry", 0);
        this.f10562p = jSONObject.optBoolean("androidFullScreen", false);
        this.f10565q = jSONObject.optInt("version", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("nativeBridgeUrls");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            this.f10576v = AbstractC2296j.m10966c(jSONArrayOptJSONArray);
        }
        this.f10578w = jSONObject.optJSONArray("userAgentRegexes");
        this.f10580x = jSONObject.optJSONArray("replaceStrings");
        this.f10582y = jSONObject.optJSONArray("languages");
        String strM10970g2 = AbstractC2296j.m10970g(jSONObject, "androidForceUserAgent");
        this.f10550l = strM10970g2;
        if (strM10970g2 != null) {
            this.f10584z = strM10970g2;
        } else {
            String str = this.f10544j;
            if (str != null) {
                this.f10584z = str;
            }
        }
        this.f10465A = AbstractC2296j.m10970g(jSONObject, "loginDetectionUrl");
        this.f10469C = AbstractC2296j.m10970g(jSONObject, "loginUrl");
        this.f10467B = AbstractC2296j.m10970g(jSONObject, "signupUrl");
        this.f10471D = AbstractC2296j.m10970g(jSONObject, "userIdRegex");
        this.f10473E = jSONObject.optJSONObject("loginConfig");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("loginDetect");
        if (jSONArrayOptJSONArray2 != null) {
            this.f10475F = new ArrayList();
            this.f10477G = new ArrayList();
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null && (strM10970g = AbstractC2296j.m10970g(jSONObjectOptJSONObject, "regex")) != null) {
                    try {
                        this.f10475F.add(Pattern.compile(strM10970g));
                        this.f10477G.add(jSONObjectOptJSONObject);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        this.f10479H = jSONObject.optBoolean("interceptHtml", false);
        this.f10487L = jSONObject.optBoolean("clearCache", false);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("screenOrientation");
        if (jSONObjectOptJSONObject2 != null) {
            String strM10970g3 = AbstractC2296j.m10970g(jSONObjectOptJSONObject2, "androidPhone");
            String strM10970g4 = AbstractC2296j.m10970g(jSONObjectOptJSONObject2, "androidTablet");
            if (strM10970g3 != null) {
                b bVarM10911q = m10911q(strM10970g3);
                this.f10505U = bVarM10911q;
                this.f10503T = bVarM10911q;
            }
            if (strM10970g4 != null) {
                this.f10507V = m10911q(strM10970g4);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private void m10909o(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tabNavigation");
        if (jSONObjectOptJSONObject != null) {
            this.f10515Z = jSONObjectOptJSONObject.optBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, false);
            this.f10518a0 = jSONObjectOptJSONObject.optJSONArray("tabSelectionConfig");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("tabMenus");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i3);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strM10970g = AbstractC2296j.m10970g(jSONObjectOptJSONObject2, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("items");
                        if (strM10970g != null) {
                            this.f10513Y.put(strM10970g, jSONArrayOptJSONArray3);
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject.optJSONArray("tabSelectionConfig");
            if (jSONArrayOptJSONArray4 != null) {
                this.f10521b0 = new ArrayList();
                this.f10524c0 = new ArrayList();
                for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray4.optJSONObject(i4);
                    if (jSONObjectOptJSONObject3 != null) {
                        String strM10970g2 = AbstractC2296j.m10970g(jSONObjectOptJSONObject3, "regex");
                        String strM10970g3 = AbstractC2296j.m10970g(jSONObjectOptJSONObject3, "id");
                        if (strM10970g2 != null && strM10970g3 != null) {
                            try {
                                this.f10521b0.add(Pattern.compile(strM10970g2));
                                this.f10524c0.add(strM10970g3);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("sidebarNavigation");
        if (jSONObjectOptJSONObject4 != null) {
            this.f10540h1 = jSONObjectOptJSONObject4.optJSONObject("menuSelectionConfig");
            JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject4.optJSONArray("menus");
            if (jSONArrayOptJSONArray5 != null) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray5.length(); i5++) {
                    JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray5.optJSONObject(i5);
                    if (jSONObjectOptJSONObject5 != null) {
                        boolean zOptBoolean = jSONObjectOptJSONObject5.optBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, false);
                        String strM10970g4 = AbstractC2296j.m10970g(jSONObjectOptJSONObject5, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        JSONArray jSONArrayOptJSONArray6 = jSONObjectOptJSONObject5.optJSONArray("items");
                        if (strM10970g4 != null) {
                            this.f10511X.put(strM10970g4, jSONArrayOptJSONArray6);
                            if (zOptBoolean && jSONArrayOptJSONArray6 != null && jSONArrayOptJSONArray6.length() > 0) {
                                this.f10509W = true;
                            }
                        }
                    }
                }
            }
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("regexInternalExternal");
        if (jSONObjectOptJSONObject6 != null && jSONObjectOptJSONObject6.optBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, false)) {
            this.f10548k0 = new C2297k(jSONObjectOptJSONObject6.optJSONArray("rules"));
        }
        this.f10527d0 = jSONObject.optBoolean("androidPullToRefresh", true);
        this.f10530e0 = jSONObject.optBoolean("androidShowRefreshButton", false);
        this.f10533f0 = jSONObject.optBoolean("swipeGestures", true);
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("navigationTitles");
        if (jSONObjectOptJSONObject7 != null && jSONObjectOptJSONObject7.optBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, false)) {
            this.f10539h0 = true;
            JSONArray jSONArrayOptJSONArray7 = jSONObjectOptJSONObject7.optJSONArray("titles");
            if (jSONArrayOptJSONArray7 != null) {
                this.f10536g0 = new ArrayList();
                for (int i6 = 0; i6 < jSONArrayOptJSONArray7.length(); i6++) {
                    JSONObject jSONObjectOptJSONObject8 = jSONArrayOptJSONArray7.optJSONObject(i6);
                    if (jSONObjectOptJSONObject8 != null) {
                        HashMap map = new HashMap();
                        String strM10970g5 = AbstractC2296j.m10970g(jSONObjectOptJSONObject8, "regex");
                        String strM10970g6 = AbstractC2296j.m10970g(jSONObjectOptJSONObject8, "title");
                        boolean zOptBoolean2 = jSONObjectOptJSONObject8.optBoolean("showImage", false);
                        if (strM10970g5 != null) {
                            map.put("regex", strM10970g5);
                        }
                        if (strM10970g6 != null) {
                            map.put("title", strM10970g6);
                        }
                        map.put("showImage", Boolean.valueOf(zOptBoolean2));
                        this.f10536g0.add(map);
                    }
                }
            }
        }
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("navigationLevels");
        if (jSONObjectOptJSONObject9 != null && jSONObjectOptJSONObject9.optBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, false) && (jSONArrayOptJSONArray = jSONObjectOptJSONObject9.optJSONArray("levels")) != null) {
            this.f10542i0 = new ArrayList();
            this.f10545j0 = new ArrayList();
            for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                JSONObject jSONObjectOptJSONObject10 = jSONArrayOptJSONArray.optJSONObject(i7);
                if (jSONObjectOptJSONObject10 != null) {
                    String strM10970g7 = AbstractC2296j.m10970g(jSONObjectOptJSONObject10, "regex");
                    int iOptInt = jSONObjectOptJSONObject10.optInt("level", 0);
                    if (strM10970g7 != null) {
                        try {
                            this.f10542i0.add(Pattern.compile(strM10970g7));
                            this.f10545j0.add(Integer.valueOf(iOptInt));
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        }
        JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("deepLinkDomains");
        if (jSONObjectOptJSONObject11 != null) {
            JSONArray jSONArrayOptJSONArray8 = jSONObjectOptJSONObject11.optJSONArray("domains");
            if (jSONArrayOptJSONArray8 != null) {
                this.f10571s0 = new ArrayList();
                for (int i8 = 0; i8 < jSONArrayOptJSONArray8.length(); i8++) {
                    String strOptString = jSONArrayOptJSONArray8.optString(i8);
                    if (strOptString != null && !strOptString.isEmpty()) {
                        this.f10571s0.add(strOptString);
                    }
                }
            }
            this.f10573t0 = jSONObjectOptJSONObject11.optBoolean("enableAndroidApplinks", false);
        }
        this.f10560o0 = jSONObject.optJSONArray("redirects");
        JSONArray jSONArrayOptJSONArray9 = jSONObject.optJSONArray("ignorePageFinishedRegexes");
        if (jSONArrayOptJSONArray9 != null) {
            this.f10569r0 = new ArrayList();
            for (int i9 = 0; i9 < jSONArrayOptJSONArray9.length(); i9++) {
                String strOptString2 = jSONArrayOptJSONArray9.optString(i9);
                if (strOptString2 != null && !strOptString2.isEmpty()) {
                    try {
                        this.f10569r0.add(Pattern.compile(strOptString2));
                    } catch (Exception unused3) {
                    }
                }
            }
        }
        JSONObject jSONObjectOptJSONObject12 = jSONObject.optJSONObject("maxWindows");
        if (jSONObjectOptJSONObject12 != null) {
            this.f10537g1 = jSONObjectOptJSONObject12.optBoolean("enabled", false);
            int iOptInt2 = jSONObjectOptJSONObject12.optInt("numWindows", 5);
            this.f10531e1 = iOptInt2;
            this.f10534f1 = iOptInt2;
            this.f10554m0 = jSONObjectOptJSONObject12.optBoolean("autoClose", false);
        }
        this.f10563p0 = jSONObject.optBoolean("androidShowOfflinePage", true);
        this.f10566q0 = jSONObject.optInt("androidConnectionOfflineTime", 10);
        this.f10516Z0 = jSONObject.optJSONObject("toolbarNavigation");
        JSONObject jSONObjectOptJSONObject13 = jSONObject.optJSONObject("actionConfig");
        if (jSONObjectOptJSONObject13 != null) {
            this.f10519a1 = jSONObjectOptJSONObject13;
            this.f10522b1 = jSONObjectOptJSONObject13.optJSONArray("actionSelection");
            m10905k(jSONObjectOptJSONObject13);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m10910p(JSONObject jSONObject) {
        this.f10504T0 = jSONObject.optBoolean("usesGeolocation", false);
        this.f10506U0 = jSONObject.optBoolean("androidDownloadToPublicStorage", true);
        C2350d c2350d = new C2350d();
        this.f10508V0 = c2350d;
        c2350d.f10802f = this.f10504T0;
        c2350d.f10797a = jSONObject.optBoolean("enableWebRTCamera", false);
        this.f10508V0.f10798b = jSONObject.optBoolean("enableWebRTCMicrophone", false);
        this.f10508V0.f10800d = this.f10506U0;
        this.f10510W0.m11187c(jSONObject.optBoolean("saveToGallery", false));
        boolean zOptBoolean = jSONObject.optBoolean("directCameraUploads", true);
        this.f10512X0 = zOptBoolean;
        this.f10510W0.m11186b(zOptBoolean);
    }

    /* JADX INFO: renamed from: q */
    private b m10911q(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "sensor":
                return b.SENSOR;
            case "portrait":
                return b.PORTRAIT;
            case "landscape":
                return b.LANDSCAPE;
            default:
                return b.UNSPECIFIED;
        }
    }

    /* JADX INFO: renamed from: r */
    private void m10912r(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f10581x0 = jSONObject.optBoolean("showActionBar", false);
        this.f10583y0 = jSONObject.optBoolean("showNavigationBar", false);
        this.f10585z0 = jSONObject.optBoolean("disableAnimations", false);
        this.f10466A0 = (float) jSONObject.optDouble("hideWebviewAlpha", 0.5d);
        this.f10468B0 = jSONObject.optDouble("transitionInteractiveDelayMax", 0.2d);
        this.f10470C0 = jSONObject.optBoolean("navigationTitleImage", false);
        this.f10472D0 = jSONObject.optBoolean("androidHideTitleInActionBar", false);
        this.f10474E0 = jSONObject.optString("androidTheme", "auto");
        this.f10476F0 = jSONObject.optString("androidStatusBarStyle", "auto");
        this.f10478G0 = jSONObject.optString("androidSystemNavBarStyle", "auto");
        this.f10480H0 = jSONObject.optBoolean("androidEnableOverlayInStatusBar", false);
        this.f10482I0 = jSONObject.optBoolean("androidEnableOverlayInSystemNavBar", false);
        this.f10484J0 = jSONObject.optBoolean("androidShowLogoInSideBar", true);
        this.f10486K0 = jSONObject.optBoolean("androidShowAppNameInSideBar", true);
        this.f10488L0 = jSONObject.optInt("androidInitialZoom", 1);
        if (!jSONObject.isNull("androidWebviewTextZoom")) {
            this.f10490M0 = Integer.valueOf(jSONObject.optInt("androidWebviewTextZoom", 100));
        }
        if (!jSONObject.isNull("forceViewportWidth")) {
            this.f10492N0 = jSONObject.optDouble("forceViewportWidth", Double.NaN);
        }
        if (!jSONObject.isNull("pinchToZoom")) {
            this.f10494O0 = Boolean.valueOf(jSONObject.optBoolean("pinchToZoom", false));
        }
        this.f10483J = AbstractC2296j.m10970g(jSONObject, "stringViewport");
        this.f10485K = jSONObject.optBoolean("zoomableForceViewport", false);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("splashScreen");
        this.f10500R0 = jSONObjectOptJSONObject2;
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("android")) == null) {
            return;
        }
        c cVar = new c();
        this.f10498Q0 = cVar;
        cVar.f10596a = jSONObjectOptJSONObject.optBoolean("showSplash", true);
        this.f10498Q0.f10597b = jSONObjectOptJSONObject.optBoolean("animated", false);
    }

    /* JADX INFO: renamed from: s */
    private String m10913s(Context context, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str));
        AbstractC2295i.m10963b(bufferedInputStream, byteArrayOutputStream);
        AbstractC2295i.m10962a(bufferedInputStream);
        String string = byteArrayOutputStream.toString();
        AbstractC2295i.m10962a(byteArrayOutputStream);
        return string;
    }

    /* JADX INFO: renamed from: a */
    public void m10914a(C2290d.a aVar) {
        this.f10520b.m10954a(aVar);
    }

    /* JADX INFO: renamed from: e */
    public String m10916e() {
        String str = this.f10532f;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: g */
    public HashMap m10917g(String str) {
        ArrayList arrayList = this.f10536g0;
        if (arrayList != null && str != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                HashMap map = (HashMap) obj;
                Object obj2 = map.get("regex");
                if (obj2 instanceof String) {
                    try {
                        if (Pattern.compile((String) obj2).matcher(str).matches()) {
                            return map;
                        }
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public Map m10918h() {
        return this.f10567q1;
    }

    /* JADX INFO: renamed from: i */
    public boolean m10919i() {
        return this.f10543i1;
    }

    /* JADX INFO: renamed from: t */
    public boolean m10920t(String str) {
        return this.f10470C0 && str != null;
    }

    /* JADX INFO: renamed from: u */
    public boolean m10921u(String str) {
        if (!this.f10509W) {
            return false;
        }
        if (str == null) {
            return this.f10549k1;
        }
        List list = this.f10546j1;
        if (list == null || list.isEmpty()) {
            return this.f10549k1;
        }
        Iterator it = this.f10546j1.iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public String m10922v(String str) {
        if (this.f10578w != null && str != null) {
            for (int i3 = 0; i3 < this.f10578w.length(); i3++) {
                JSONObject jSONObjectOptJSONObject = this.f10578w.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    String strM10970g = AbstractC2296j.m10970g(jSONObjectOptJSONObject, "regex");
                    String strM10970g2 = AbstractC2296j.m10970g(jSONObjectOptJSONObject, "userAgent");
                    if (strM10970g != null && strM10970g2 != null) {
                        try {
                            if (Pattern.compile(strM10970g).matcher(str).matches()) {
                                return strM10970g2;
                            }
                        } catch (Exception unused) {
                            continue;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m10915d() {
    }
}
