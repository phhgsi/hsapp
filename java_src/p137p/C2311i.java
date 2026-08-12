package p137p;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: p.i */
/* JADX INFO: loaded from: classes.dex */
public class C2311i implements Comparable {

    /* JADX INFO: renamed from: u */
    private static int f10670u = 1;

    /* JADX INFO: renamed from: d */
    public boolean f10671d;

    /* JADX INFO: renamed from: e */
    private String f10672e;

    /* JADX INFO: renamed from: i */
    public float f10676i;

    /* JADX INFO: renamed from: m */
    a f10680m;

    /* JADX INFO: renamed from: f */
    public int f10673f = -1;

    /* JADX INFO: renamed from: g */
    int f10674g = -1;

    /* JADX INFO: renamed from: h */
    public int f10675h = 0;

    /* JADX INFO: renamed from: j */
    public boolean f10677j = false;

    /* JADX INFO: renamed from: k */
    float[] f10678k = new float[9];

    /* JADX INFO: renamed from: l */
    float[] f10679l = new float[9];

    /* JADX INFO: renamed from: n */
    C2304b[] f10681n = new C2304b[16];

    /* JADX INFO: renamed from: o */
    int f10682o = 0;

    /* JADX INFO: renamed from: p */
    public int f10683p = 0;

    /* JADX INFO: renamed from: q */
    boolean f10684q = false;

    /* JADX INFO: renamed from: r */
    int f10685r = -1;

    /* JADX INFO: renamed from: s */
    float f10686s = 0.0f;

    /* JADX INFO: renamed from: t */
    HashSet f10687t = null;

    /* JADX INFO: renamed from: p.i$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C2311i(a aVar, String str) {
        this.f10680m = aVar;
    }

    /* JADX INFO: renamed from: c */
    static void m11061c() {
        f10670u++;
    }

    /* JADX INFO: renamed from: a */
    public final void m11062a(C2304b c2304b) {
        int i3 = 0;
        while (true) {
            int i4 = this.f10682o;
            if (i3 >= i4) {
                C2304b[] c2304bArr = this.f10681n;
                if (i4 >= c2304bArr.length) {
                    this.f10681n = (C2304b[]) Arrays.copyOf(c2304bArr, c2304bArr.length * 2);
                }
                C2304b[] c2304bArr2 = this.f10681n;
                int i5 = this.f10682o;
                c2304bArr2[i5] = c2304b;
                this.f10682o = i5 + 1;
                return;
            }
            if (this.f10681n[i3] == c2304b) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2311i c2311i) {
        return this.f10673f - c2311i.f10673f;
    }

    /* JADX INFO: renamed from: d */
    public final void m11064d(C2304b c2304b) {
        int i3 = this.f10682o;
        int i4 = 0;
        while (i4 < i3) {
            if (this.f10681n[i4] == c2304b) {
                while (i4 < i3 - 1) {
                    C2304b[] c2304bArr = this.f10681n;
                    int i5 = i4 + 1;
                    c2304bArr[i4] = c2304bArr[i5];
                    i4 = i5;
                }
                this.f10682o--;
                return;
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m11065e() {
        this.f10672e = null;
        this.f10680m = a.UNKNOWN;
        this.f10675h = 0;
        this.f10673f = -1;
        this.f10674g = -1;
        this.f10676i = 0.0f;
        this.f10677j = false;
        this.f10684q = false;
        this.f10685r = -1;
        this.f10686s = 0.0f;
        int i3 = this.f10682o;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f10681n[i4] = null;
        }
        this.f10682o = 0;
        this.f10683p = 0;
        this.f10671d = false;
        Arrays.fill(this.f10679l, 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public void m11066f(C2306d c2306d, float f3) {
        this.f10676i = f3;
        this.f10677j = true;
        this.f10684q = false;
        this.f10685r = -1;
        this.f10686s = 0.0f;
        int i3 = this.f10682o;
        this.f10674g = -1;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f10681n[i4].m10991A(c2306d, this, false);
        }
        this.f10682o = 0;
    }

    /* JADX INFO: renamed from: g */
    public void m11067g(a aVar, String str) {
        this.f10680m = aVar;
    }

    /* JADX INFO: renamed from: h */
    public final void m11068h(C2306d c2306d, C2304b c2304b) {
        int i3 = this.f10682o;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f10681n[i4].mo10992B(c2306d, c2304b, false);
        }
        this.f10682o = 0;
    }

    public String toString() {
        if (this.f10672e != null) {
            return "" + this.f10672e;
        }
        return "" + this.f10673f;
    }
}
