package p146s;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p137p.C2305c;
import p137p.C2311i;
import p149t.AbstractC2417i;
import p149t.C2423o;

/* JADX INFO: renamed from: s.d */
/* JADX INFO: loaded from: classes.dex */
public class C2382d {

    /* JADX INFO: renamed from: b */
    private int f10878b;

    /* JADX INFO: renamed from: c */
    private boolean f10879c;

    /* JADX INFO: renamed from: d */
    public final C2383e f10880d;

    /* JADX INFO: renamed from: e */
    public final b f10881e;

    /* JADX INFO: renamed from: f */
    public C2382d f10882f;

    /* JADX INFO: renamed from: i */
    C2311i f10885i;

    /* JADX INFO: renamed from: a */
    private HashSet f10877a = null;

    /* JADX INFO: renamed from: g */
    public int f10883g = 0;

    /* JADX INFO: renamed from: h */
    int f10884h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: s.d$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f10886a;

        static {
            int[] iArr = new int[b.values().length];
            f10886a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10886a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10886a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10886a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10886a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10886a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10886a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10886a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10886a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: s.d$b */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C2382d(C2383e c2383e, b bVar) {
        this.f10880d = c2383e;
        this.f10881e = bVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m11238a(C2382d c2382d, int i3) {
        return m11239b(c2382d, i3, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public boolean m11239b(C2382d c2382d, int i3, int i4, boolean z2) {
        if (c2382d == null) {
            m11254q();
            return true;
        }
        if (!z2 && !m11253p(c2382d)) {
            return false;
        }
        this.f10882f = c2382d;
        if (c2382d.f10877a == null) {
            c2382d.f10877a = new HashSet();
        }
        HashSet hashSet = this.f10882f.f10877a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f10883g = i3;
        this.f10884h = i4;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m11240c(int i3, ArrayList arrayList, C2423o c2423o) {
        HashSet hashSet = this.f10877a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC2417i.m11628a(((C2382d) it.next()).f10880d, i3, arrayList, c2423o);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public HashSet m11241d() {
        return this.f10877a;
    }

    /* JADX INFO: renamed from: e */
    public int m11242e() {
        if (this.f10879c) {
            return this.f10878b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public int m11243f() {
        C2382d c2382d;
        if (this.f10880d.m11298S() == 8) {
            return 0;
        }
        return (this.f10884h == Integer.MIN_VALUE || (c2382d = this.f10882f) == null || c2382d.f10880d.m11298S() != 8) ? this.f10883g : this.f10884h;
    }

    /* JADX INFO: renamed from: g */
    public final C2382d m11244g() {
        switch (a.f10886a[this.f10881e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return null;
            case 2:
                return this.f10880d.f10921P;
            case 3:
                return this.f10880d.f10919N;
            case 4:
                return this.f10880d.f10922Q;
            case 5:
                return this.f10880d.f10920O;
            default:
                throw new AssertionError(this.f10881e.name());
        }
    }

    /* JADX INFO: renamed from: h */
    public C2383e m11245h() {
        return this.f10880d;
    }

    /* JADX INFO: renamed from: i */
    public C2311i m11246i() {
        return this.f10885i;
    }

    /* JADX INFO: renamed from: j */
    public C2382d m11247j() {
        return this.f10882f;
    }

    /* JADX INFO: renamed from: k */
    public b m11248k() {
        return this.f10881e;
    }

    /* JADX INFO: renamed from: l */
    public boolean m11249l() {
        HashSet hashSet = this.f10877a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C2382d) it.next()).m11244g().m11252o()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public boolean m11250m() {
        HashSet hashSet = this.f10877a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m11251n() {
        return this.f10879c;
    }

    /* JADX INFO: renamed from: o */
    public boolean m11252o() {
        return this.f10882f != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m11253p(C2382d c2382d) {
        if (c2382d == null) {
            return false;
        }
        b bVarM11248k = c2382d.m11248k();
        b bVar = this.f10881e;
        if (bVarM11248k == bVar) {
            return bVar != b.BASELINE || (c2382d.m11245h().m11306W() && m11245h().m11306W());
        }
        switch (a.f10886a[bVar.ordinal()]) {
            case 1:
                return (bVarM11248k == b.BASELINE || bVarM11248k == b.CENTER_X || bVarM11248k == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = bVarM11248k == b.LEFT || bVarM11248k == b.RIGHT;
                return c2382d.m11245h() instanceof C2386h ? z2 || bVarM11248k == b.CENTER_X : z2;
            case 4:
            case 5:
                boolean z3 = bVarM11248k == b.TOP || bVarM11248k == b.BOTTOM;
                return c2382d.m11245h() instanceof C2386h ? z3 || bVarM11248k == b.CENTER_Y : z3;
            case 6:
                return (bVarM11248k == b.LEFT || bVarM11248k == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return false;
            default:
                throw new AssertionError(this.f10881e.name());
        }
    }

    /* JADX INFO: renamed from: q */
    public void m11254q() {
        HashSet hashSet;
        C2382d c2382d = this.f10882f;
        if (c2382d != null && (hashSet = c2382d.f10877a) != null) {
            hashSet.remove(this);
            if (this.f10882f.f10877a.size() == 0) {
                this.f10882f.f10877a = null;
            }
        }
        this.f10877a = null;
        this.f10882f = null;
        this.f10883g = 0;
        this.f10884h = Integer.MIN_VALUE;
        this.f10879c = false;
        this.f10878b = 0;
    }

    /* JADX INFO: renamed from: r */
    public void m11255r() {
        this.f10879c = false;
        this.f10878b = 0;
    }

    /* JADX INFO: renamed from: s */
    public void m11256s(C2305c c2305c) {
        C2311i c2311i = this.f10885i;
        if (c2311i == null) {
            this.f10885i = new C2311i(C2311i.a.UNRESTRICTED, null);
        } else {
            c2311i.m11065e();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m11257t(int i3) {
        this.f10878b = i3;
        this.f10879c = true;
    }

    public String toString() {
        return this.f10880d.m11353t() + ":" + this.f10881e.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m11258u(int i3) {
        if (m11252o()) {
            this.f10884h = i3;
        }
    }
}
