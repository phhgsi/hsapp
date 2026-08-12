package co.median.android;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Message;
import android.util.Base64;
import android.widget.Toast;
import androidx.appcompat.app.AbstractC0751g;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p072Y.AbstractApplicationC0618b;
import p075Z.AbstractC0624b;
import p128m0.AbstractC2207e1;
import p128m0.C2178S0;
import p128m0.C2237o1;
import p135o0.AbstractC2288b;
import p135o0.AbstractC2295i;
import p135o0.C2287a;
import p135o0.C2292f;

/* JADX INFO: loaded from: classes.dex */
public class GoNativeApplication extends AbstractApplicationC0618b {

    /* JADX INFO: renamed from: p */
    private static final String f6471p = "GoNativeApplication";

    /* JADX INFO: renamed from: e */
    private C1363u f6476e;

    /* JADX INFO: renamed from: f */
    private C1377y f6477f;

    /* JADX INFO: renamed from: g */
    private C2237o1 f6478g;

    /* JADX INFO: renamed from: h */
    private Message f6479h;

    /* JADX INFO: renamed from: i */
    private C1360r f6480i;

    /* JADX INFO: renamed from: j */
    private List f6481j;

    /* JADX INFO: renamed from: n */
    private String f6485n;

    /* JADX INFO: renamed from: o */
    private String f6486o;

    /* JADX INFO: renamed from: a */
    private final String f6472a = "customCSS.css";

    /* JADX INFO: renamed from: b */
    private final String f6473b = "customJS.js";

    /* JADX INFO: renamed from: c */
    private final String f6474c = "androidCustomCSS.css";

    /* JADX INFO: renamed from: d */
    private final String f6475d = "androidCustomJS.js";

    /* JADX INFO: renamed from: k */
    private boolean f6482k = false;

    /* JADX INFO: renamed from: l */
    public final AbstractC2288b f6483l = new C1328a(this);

    /* JADX INFO: renamed from: m */
    private boolean f6484m = false;

    /* JADX INFO: renamed from: co.median.android.GoNativeApplication$a */
    class C1328a extends AbstractC2288b {
        C1328a(Application application) {
            super(application);
        }

        @Override // p135o0.AbstractC2288b
        /* JADX INFO: renamed from: e */
        protected List mo6779e() {
            if (GoNativeApplication.this.f6481j == null) {
                GoNativeApplication goNativeApplication = GoNativeApplication.this;
                goNativeApplication.f6481j = new C2178S0(goNativeApplication).m10671a();
            }
            return GoNativeApplication.this.f6481j;
        }
    }

    /* JADX INFO: renamed from: l */
    private void m6764l(C2287a c2287a) {
        if (c2287a.f10552l1 || c2287a.f10558n1) {
            ArrayList arrayList = new ArrayList();
            if (c2287a.f10552l1) {
                arrayList.add("customCSS.css");
            }
            if (c2287a.f10558n1) {
                arrayList.add("androidCustomCSS.css");
            }
            if (arrayList.size() == 0) {
                return;
            }
            try {
                this.f6485n = Base64.encodeToString(m6766n(arrayList).getBytes(StandardCharsets.UTF_8), 2);
            } catch (Exception e3) {
                C2292f.m10956b().m10960f(f6471p, "Error loading custom CSS files", e3);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private void m6765m(C2287a c2287a) {
        if (c2287a.f10555m1 || c2287a.f10561o1) {
            ArrayList arrayList = new ArrayList();
            if (c2287a.f10555m1) {
                arrayList.add("customJS.js");
            }
            if (c2287a.f10561o1) {
                arrayList.add("androidCustomJS.js");
            }
            if (arrayList.size() == 0) {
                return;
            }
            try {
                this.f6486o = Base64.encodeToString(m6766n(arrayList).getBytes(StandardCharsets.UTF_8), 2);
            } catch (Exception e3) {
                C2292f.m10956b().m10960f(f6471p, "Error loading custom JS files", e3);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private String m6766n(List list) {
        StringBuilder sb = new StringBuilder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AbstractC2295i.m10963b(new BufferedInputStream(getAssets().open(str)), byteArrayOutputStream);
                sb.append(byteArrayOutputStream);
                byteArrayOutputStream.reset();
            } catch (IOException e3) {
                C2292f.m10956b().m10960f(f6471p, "Error reading " + str, e3);
            }
        }
        AbstractC2295i.m10962a(byteArrayOutputStream);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    private void m6767q() {
        String strM10762a = AbstractC2207e1.m10762a(this);
        if (AbstractC2207e1.m10766e(this)) {
            return;
        }
        AbstractC2207e1.m10768g(this, strM10762a);
        AbstractC2207e1.m10764c(this);
    }

    /* JADX INFO: renamed from: c */
    public Map m6768c() {
        return this.f6483l.m10930b();
    }

    /* JADX INFO: renamed from: d */
    public String m6769d() {
        return this.f6485n;
    }

    /* JADX INFO: renamed from: e */
    public String m6770e() {
        return this.f6486o;
    }

    /* JADX INFO: renamed from: f */
    public C1363u m6771f() {
        return this.f6476e;
    }

    /* JADX INFO: renamed from: g */
    public C1377y m6772g() {
        return this.f6477f;
    }

    /* JADX INFO: renamed from: h */
    public C2237o1 m6773h() {
        return this.f6478g;
    }

    /* JADX INFO: renamed from: i */
    public Message m6774i() {
        return this.f6479h;
    }

    /* JADX INFO: renamed from: j */
    public C1360r m6775j() {
        return this.f6480i;
    }

    /* JADX INFO: renamed from: k */
    public boolean m6776k() {
        return this.f6482k;
    }

    /* JADX INFO: renamed from: o */
    public void m6777o(boolean z2) {
        this.f6484m = z2;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 31) {
            m6767q();
        }
        AbstractC0751g.m2814J(true);
        this.f6483l.m10946s(this);
        C2287a c2287aM10903f = C2287a.m10903f(this);
        if (c2287aM10903f.f10517a != null) {
            Toast.makeText(this, "Invalid appConfig json", 1).show();
            C2292f.m10956b().m10960f(f6471p, "AppConfig error", c2287aM10903f.f10517a);
        }
        this.f6476e = new C1363u(this);
        if (c2287aM10903f.f10551l0 != null) {
            C1377y c1377y = new C1377y(this);
            this.f6477f = c1377y;
            c1377y.m7165e(c2287aM10903f.f10551l0);
        }
        AbstractC1323D.m6737d(this);
        this.f6478g = new C2237o1();
        this.f6480i = new C1360r();
        m6764l(c2287aM10903f);
        m6765m(c2287aM10903f);
        SharedPreferences sharedPreferencesM2211a = AbstractC0624b.m2211a(this);
        if (sharedPreferencesM2211a.getBoolean("hasLaunched", false)) {
            return;
        }
        this.f6482k = true;
        sharedPreferencesM2211a.edit().putBoolean("hasLaunched", true).apply();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (i3 == 20) {
            m6777o(true);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m6778p(Message message) {
        this.f6479h = message;
    }
}
