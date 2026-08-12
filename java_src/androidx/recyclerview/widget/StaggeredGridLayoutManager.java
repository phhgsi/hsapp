package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC1205p implements RecyclerView.AbstractC1214y.b {

    /* JADX INFO: renamed from: B */
    private BitSet f5819B;

    /* JADX INFO: renamed from: G */
    private boolean f5824G;

    /* JADX INFO: renamed from: H */
    private boolean f5825H;

    /* JADX INFO: renamed from: I */
    private SavedState f5826I;

    /* JADX INFO: renamed from: J */
    private int f5827J;

    /* JADX INFO: renamed from: O */
    private int[] f5832O;

    /* JADX INFO: renamed from: t */
    C1221d[] f5835t;

    /* JADX INFO: renamed from: u */
    AbstractC1230i f5836u;

    /* JADX INFO: renamed from: v */
    AbstractC1230i f5837v;

    /* JADX INFO: renamed from: w */
    private int f5838w;

    /* JADX INFO: renamed from: x */
    private int f5839x;

    /* JADX INFO: renamed from: y */
    private final C1227f f5840y;

    /* JADX INFO: renamed from: s */
    private int f5834s = -1;

    /* JADX INFO: renamed from: z */
    boolean f5841z = false;

    /* JADX INFO: renamed from: A */
    boolean f5818A = false;

    /* JADX INFO: renamed from: C */
    int f5820C = -1;

    /* JADX INFO: renamed from: D */
    int f5821D = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: E */
    LazySpanLookup f5822E = new LazySpanLookup();

    /* JADX INFO: renamed from: F */
    private int f5823F = 2;

    /* JADX INFO: renamed from: K */
    private final Rect f5828K = new Rect();

    /* JADX INFO: renamed from: L */
    private final C1219b f5829L = new C1219b();

    /* JADX INFO: renamed from: M */
    private boolean f5830M = false;

    /* JADX INFO: renamed from: N */
    private boolean f5831N = true;

    /* JADX INFO: renamed from: P */
    private final Runnable f5833P = new RunnableC1218a();

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1217a();

        /* JADX INFO: renamed from: d */
        int f5848d;

        /* JADX INFO: renamed from: e */
        int f5849e;

        /* JADX INFO: renamed from: f */
        int f5850f;

        /* JADX INFO: renamed from: g */
        int[] f5851g;

        /* JADX INFO: renamed from: h */
        int f5852h;

        /* JADX INFO: renamed from: i */
        int[] f5853i;

        /* JADX INFO: renamed from: j */
        List f5854j;

        /* JADX INFO: renamed from: k */
        boolean f5855k;

        /* JADX INFO: renamed from: l */
        boolean f5856l;

        /* JADX INFO: renamed from: m */
        boolean f5857m;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        class C1217a implements Parcelable.Creator {
            C1217a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        public SavedState() {
        }

        /* JADX INFO: renamed from: a */
        void m6049a() {
            this.f5851g = null;
            this.f5850f = 0;
            this.f5848d = -1;
            this.f5849e = -1;
        }

        /* JADX INFO: renamed from: d */
        void m6050d() {
            this.f5851g = null;
            this.f5850f = 0;
            this.f5852h = 0;
            this.f5853i = null;
            this.f5854j = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeInt(this.f5848d);
            parcel.writeInt(this.f5849e);
            parcel.writeInt(this.f5850f);
            if (this.f5850f > 0) {
                parcel.writeIntArray(this.f5851g);
            }
            parcel.writeInt(this.f5852h);
            if (this.f5852h > 0) {
                parcel.writeIntArray(this.f5853i);
            }
            parcel.writeInt(this.f5855k ? 1 : 0);
            parcel.writeInt(this.f5856l ? 1 : 0);
            parcel.writeInt(this.f5857m ? 1 : 0);
            parcel.writeList(this.f5854j);
        }

        SavedState(Parcel parcel) {
            this.f5848d = parcel.readInt();
            this.f5849e = parcel.readInt();
            int i3 = parcel.readInt();
            this.f5850f = i3;
            if (i3 > 0) {
                int[] iArr = new int[i3];
                this.f5851g = iArr;
                parcel.readIntArray(iArr);
            }
            int i4 = parcel.readInt();
            this.f5852h = i4;
            if (i4 > 0) {
                int[] iArr2 = new int[i4];
                this.f5853i = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f5855k = parcel.readInt() == 1;
            this.f5856l = parcel.readInt() == 1;
            this.f5857m = parcel.readInt() == 1;
            this.f5854j = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f5850f = savedState.f5850f;
            this.f5848d = savedState.f5848d;
            this.f5849e = savedState.f5849e;
            this.f5851g = savedState.f5851g;
            this.f5852h = savedState.f5852h;
            this.f5853i = savedState.f5853i;
            this.f5855k = savedState.f5855k;
            this.f5856l = savedState.f5856l;
            this.f5857m = savedState.f5857m;
            this.f5854j = savedState.f5854j;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class RunnableC1218a implements Runnable {
        RunnableC1218a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m6022W1();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C1219b {

        /* JADX INFO: renamed from: a */
        int f5859a;

        /* JADX INFO: renamed from: b */
        int f5860b;

        /* JADX INFO: renamed from: c */
        boolean f5861c;

        /* JADX INFO: renamed from: d */
        boolean f5862d;

        /* JADX INFO: renamed from: e */
        boolean f5863e;

        /* JADX INFO: renamed from: f */
        int[] f5864f;

        C1219b() {
            m6055c();
        }

        /* JADX INFO: renamed from: a */
        void m6053a() {
            this.f5860b = this.f5861c ? StaggeredGridLayoutManager.this.f5836u.mo6209i() : StaggeredGridLayoutManager.this.f5836u.mo6213m();
        }

        /* JADX INFO: renamed from: b */
        void m6054b(int i3) {
            if (this.f5861c) {
                this.f5860b = StaggeredGridLayoutManager.this.f5836u.mo6209i() - i3;
            } else {
                this.f5860b = StaggeredGridLayoutManager.this.f5836u.mo6213m() + i3;
            }
        }

        /* JADX INFO: renamed from: c */
        void m6055c() {
            this.f5859a = -1;
            this.f5860b = Integer.MIN_VALUE;
            this.f5861c = false;
            this.f5862d = false;
            this.f5863e = false;
            int[] iArr = this.f5864f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* JADX INFO: renamed from: d */
        void m6056d(C1221d[] c1221dArr) {
            int length = c1221dArr.length;
            int[] iArr = this.f5864f;
            if (iArr == null || iArr.length < length) {
                this.f5864f = new int[StaggeredGridLayoutManager.this.f5835t.length];
            }
            for (int i3 = 0; i3 < length; i3++) {
                this.f5864f[i3] = c1221dArr[i3].m6073p(Integer.MIN_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C1220c extends RecyclerView.C1206q {

        /* JADX INFO: renamed from: e */
        C1221d f5866e;

        /* JADX INFO: renamed from: f */
        boolean f5867f;

        public C1220c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: renamed from: e */
        public boolean m6057e() {
            return this.f5867f;
        }

        public C1220c(int i3, int i4) {
            super(i3, i4);
        }

        public C1220c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1220c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    class C1221d {

        /* JADX INFO: renamed from: a */
        ArrayList f5868a = new ArrayList();

        /* JADX INFO: renamed from: b */
        int f5869b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c */
        int f5870c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d */
        int f5871d = 0;

        /* JADX INFO: renamed from: e */
        final int f5872e;

        C1221d(int i3) {
            this.f5872e = i3;
        }

        /* JADX INFO: renamed from: a */
        void m6058a(View view) {
            C1220c c1220cM6071n = m6071n(view);
            c1220cM6071n.f5866e = this;
            this.f5868a.add(view);
            this.f5870c = Integer.MIN_VALUE;
            if (this.f5868a.size() == 1) {
                this.f5869b = Integer.MIN_VALUE;
            }
            if (c1220cM6071n.m5883c() || c1220cM6071n.m5882b()) {
                this.f5871d += StaggeredGridLayoutManager.this.f5836u.mo6205e(view);
            }
        }

        /* JADX INFO: renamed from: b */
        void m6059b(boolean z2, int i3) {
            int iM6069l = z2 ? m6069l(Integer.MIN_VALUE) : m6073p(Integer.MIN_VALUE);
            m6062e();
            if (iM6069l == Integer.MIN_VALUE) {
                return;
            }
            if (!z2 || iM6069l >= StaggeredGridLayoutManager.this.f5836u.mo6209i()) {
                if (z2 || iM6069l <= StaggeredGridLayoutManager.this.f5836u.mo6213m()) {
                    if (i3 != Integer.MIN_VALUE) {
                        iM6069l += i3;
                    }
                    this.f5870c = iM6069l;
                    this.f5869b = iM6069l;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        void m6060c() {
            LazySpanLookup.FullSpanItem fullSpanItemM6039f;
            ArrayList arrayList = this.f5868a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            C1220c c1220cM6071n = m6071n(view);
            this.f5870c = StaggeredGridLayoutManager.this.f5836u.mo6204d(view);
            if (c1220cM6071n.f5867f && (fullSpanItemM6039f = StaggeredGridLayoutManager.this.f5822E.m6039f(c1220cM6071n.m5881a())) != null && fullSpanItemM6039f.f5845e == 1) {
                this.f5870c += fullSpanItemM6039f.m6046a(this.f5872e);
            }
        }

        /* JADX INFO: renamed from: d */
        void m6061d() {
            LazySpanLookup.FullSpanItem fullSpanItemM6039f;
            View view = (View) this.f5868a.get(0);
            C1220c c1220cM6071n = m6071n(view);
            this.f5869b = StaggeredGridLayoutManager.this.f5836u.mo6207g(view);
            if (c1220cM6071n.f5867f && (fullSpanItemM6039f = StaggeredGridLayoutManager.this.f5822E.m6039f(c1220cM6071n.m5881a())) != null && fullSpanItemM6039f.f5845e == -1) {
                this.f5869b -= fullSpanItemM6039f.m6046a(this.f5872e);
            }
        }

        /* JADX INFO: renamed from: e */
        void m6062e() {
            this.f5868a.clear();
            m6074q();
            this.f5871d = 0;
        }

        /* JADX INFO: renamed from: f */
        public int m6063f() {
            return StaggeredGridLayoutManager.this.f5841z ? m6066i(this.f5868a.size() - 1, -1, true) : m6066i(0, this.f5868a.size(), true);
        }

        /* JADX INFO: renamed from: g */
        public int m6064g() {
            return StaggeredGridLayoutManager.this.f5841z ? m6066i(0, this.f5868a.size(), true) : m6066i(this.f5868a.size() - 1, -1, true);
        }

        /* JADX INFO: renamed from: h */
        int m6065h(int i3, int i4, boolean z2, boolean z3, boolean z4) {
            int iMo6213m = StaggeredGridLayoutManager.this.f5836u.mo6213m();
            int iMo6209i = StaggeredGridLayoutManager.this.f5836u.mo6209i();
            int i5 = i4 > i3 ? 1 : -1;
            while (i3 != i4) {
                View view = (View) this.f5868a.get(i3);
                int iMo6207g = StaggeredGridLayoutManager.this.f5836u.mo6207g(view);
                int iMo6204d = StaggeredGridLayoutManager.this.f5836u.mo6204d(view);
                boolean z5 = false;
                boolean z6 = !z4 ? iMo6207g >= iMo6209i : iMo6207g > iMo6209i;
                if (!z4 ? iMo6204d > iMo6213m : iMo6204d >= iMo6213m) {
                    z5 = true;
                }
                if (z6 && z5) {
                    if (z2 && z3) {
                        if (iMo6207g >= iMo6213m && iMo6204d <= iMo6209i) {
                            return StaggeredGridLayoutManager.this.m5847l0(view);
                        }
                    } else {
                        if (z3) {
                            return StaggeredGridLayoutManager.this.m5847l0(view);
                        }
                        if (iMo6207g < iMo6213m || iMo6204d > iMo6209i) {
                            return StaggeredGridLayoutManager.this.m5847l0(view);
                        }
                    }
                }
                i3 += i5;
            }
            return -1;
        }

        /* JADX INFO: renamed from: i */
        int m6066i(int i3, int i4, boolean z2) {
            return m6065h(i3, i4, false, false, z2);
        }

        /* JADX INFO: renamed from: j */
        public int m6067j() {
            return this.f5871d;
        }

        /* JADX INFO: renamed from: k */
        int m6068k() {
            int i3 = this.f5870c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            m6060c();
            return this.f5870c;
        }

        /* JADX INFO: renamed from: l */
        int m6069l(int i3) {
            int i4 = this.f5870c;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            if (this.f5868a.size() == 0) {
                return i3;
            }
            m6060c();
            return this.f5870c;
        }

        /* JADX INFO: renamed from: m */
        public View m6070m(int i3, int i4) {
            View view = null;
            if (i4 != -1) {
                int size = this.f5868a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f5868a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f5841z && staggeredGridLayoutManager.m5847l0(view2) >= i3) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f5841z && staggeredGridLayoutManager2.m5847l0(view2) <= i3) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f5868a.size();
            int i5 = 0;
            while (i5 < size2) {
                View view3 = (View) this.f5868a.get(i5);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f5841z && staggeredGridLayoutManager3.m5847l0(view3) <= i3) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f5841z && staggeredGridLayoutManager4.m5847l0(view3) >= i3) || !view3.hasFocusable()) {
                    break;
                }
                i5++;
                view = view3;
            }
            return view;
        }

        /* JADX INFO: renamed from: n */
        C1220c m6071n(View view) {
            return (C1220c) view.getLayoutParams();
        }

        /* JADX INFO: renamed from: o */
        int m6072o() {
            int i3 = this.f5869b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            m6061d();
            return this.f5869b;
        }

        /* JADX INFO: renamed from: p */
        int m6073p(int i3) {
            int i4 = this.f5869b;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            if (this.f5868a.size() == 0) {
                return i3;
            }
            m6061d();
            return this.f5869b;
        }

        /* JADX INFO: renamed from: q */
        void m6074q() {
            this.f5869b = Integer.MIN_VALUE;
            this.f5870c = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: r */
        void m6075r(int i3) {
            int i4 = this.f5869b;
            if (i4 != Integer.MIN_VALUE) {
                this.f5869b = i4 + i3;
            }
            int i5 = this.f5870c;
            if (i5 != Integer.MIN_VALUE) {
                this.f5870c = i5 + i3;
            }
        }

        /* JADX INFO: renamed from: s */
        void m6076s() {
            int size = this.f5868a.size();
            View view = (View) this.f5868a.remove(size - 1);
            C1220c c1220cM6071n = m6071n(view);
            c1220cM6071n.f5866e = null;
            if (c1220cM6071n.m5883c() || c1220cM6071n.m5882b()) {
                this.f5871d -= StaggeredGridLayoutManager.this.f5836u.mo6205e(view);
            }
            if (size == 1) {
                this.f5869b = Integer.MIN_VALUE;
            }
            this.f5870c = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: t */
        void m6077t() {
            View view = (View) this.f5868a.remove(0);
            C1220c c1220cM6071n = m6071n(view);
            c1220cM6071n.f5866e = null;
            if (this.f5868a.size() == 0) {
                this.f5870c = Integer.MIN_VALUE;
            }
            if (c1220cM6071n.m5883c() || c1220cM6071n.m5882b()) {
                this.f5871d -= StaggeredGridLayoutManager.this.f5836u.mo6205e(view);
            }
            this.f5869b = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: u */
        void m6078u(View view) {
            C1220c c1220cM6071n = m6071n(view);
            c1220cM6071n.f5866e = this;
            this.f5868a.add(0, view);
            this.f5869b = Integer.MIN_VALUE;
            if (this.f5868a.size() == 1) {
                this.f5870c = Integer.MIN_VALUE;
            }
            if (c1220cM6071n.m5883c() || c1220cM6071n.m5882b()) {
                this.f5871d += StaggeredGridLayoutManager.this.f5836u.mo6205e(view);
            }
        }

        /* JADX INFO: renamed from: v */
        void m6079v(int i3) {
            this.f5869b = i3;
            this.f5870c = i3;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        RecyclerView.AbstractC1205p.d dVarM5778m0 = RecyclerView.AbstractC1205p.m5778m0(context, attributeSet, i3, i4);
        m6014L2(dVarM5778m0.f5763a);
        m6016N2(dVarM5778m0.f5764b);
        m6015M2(dVarM5778m0.f5765c);
        this.f5840y = new C1227f();
        m5998e2();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX INFO: renamed from: A2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5973A2(androidx.recyclerview.widget.RecyclerView.C1211v r9, androidx.recyclerview.widget.RecyclerView.C1215z r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5973A2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    /* JADX INFO: renamed from: B2 */
    private boolean m5974B2(int i3) {
        if (this.f5838w == 0) {
            return (i3 == -1) != this.f5818A;
        }
        return ((i3 == -1) == this.f5818A) == m6030x2();
    }

    /* JADX INFO: renamed from: D2 */
    private void m5975D2(View view) {
        for (int i3 = this.f5834s - 1; i3 >= 0; i3--) {
            this.f5835t[i3].m6078u(view);
        }
    }

    /* JADX INFO: renamed from: E2 */
    private void m5976E2(RecyclerView.C1211v c1211v, C1227f c1227f) {
        if (!c1227f.f5993a || c1227f.f6001i) {
            return;
        }
        if (c1227f.f5994b == 0) {
            if (c1227f.f5997e == -1) {
                m5977F2(c1211v, c1227f.f5999g);
                return;
            } else {
                m5978G2(c1211v, c1227f.f5998f);
                return;
            }
        }
        if (c1227f.f5997e != -1) {
            int iM6006r2 = m6006r2(c1227f.f5999g) - c1227f.f5999g;
            m5978G2(c1211v, iM6006r2 < 0 ? c1227f.f5998f : Math.min(iM6006r2, c1227f.f5994b) + c1227f.f5998f);
        } else {
            int i3 = c1227f.f5998f;
            int iM6005q2 = i3 - m6005q2(i3);
            m5977F2(c1211v, iM6005q2 < 0 ? c1227f.f5999g : c1227f.f5999g - Math.min(iM6005q2, c1227f.f5994b));
        }
    }

    /* JADX INFO: renamed from: F2 */
    private void m5977F2(RecyclerView.C1211v c1211v, int i3) {
        for (int iM5809O = m5809O() - 1; iM5809O >= 0; iM5809O--) {
            View viewM5807N = m5807N(iM5809O);
            if (this.f5836u.mo6207g(viewM5807N) < i3 || this.f5836u.mo6217q(viewM5807N) < i3) {
                return;
            }
            C1220c c1220c = (C1220c) viewM5807N.getLayoutParams();
            if (c1220c.f5867f) {
                for (int i4 = 0; i4 < this.f5834s; i4++) {
                    if (this.f5835t[i4].f5868a.size() == 1) {
                        return;
                    }
                }
                for (int i5 = 0; i5 < this.f5834s; i5++) {
                    this.f5835t[i5].m6076s();
                }
            } else if (c1220c.f5866e.f5868a.size() == 1) {
                return;
            } else {
                c1220c.f5866e.m6076s();
            }
            m5859q1(viewM5807N, c1211v);
        }
    }

    /* JADX INFO: renamed from: G2 */
    private void m5978G2(RecyclerView.C1211v c1211v, int i3) {
        while (m5809O() > 0) {
            View viewM5807N = m5807N(0);
            if (this.f5836u.mo6204d(viewM5807N) > i3 || this.f5836u.mo6216p(viewM5807N) > i3) {
                return;
            }
            C1220c c1220c = (C1220c) viewM5807N.getLayoutParams();
            if (c1220c.f5867f) {
                for (int i4 = 0; i4 < this.f5834s; i4++) {
                    if (this.f5835t[i4].f5868a.size() == 1) {
                        return;
                    }
                }
                for (int i5 = 0; i5 < this.f5834s; i5++) {
                    this.f5835t[i5].m6077t();
                }
            } else if (c1220c.f5866e.f5868a.size() == 1) {
                return;
            } else {
                c1220c.f5866e.m6077t();
            }
            m5859q1(viewM5807N, c1211v);
        }
    }

    /* JADX INFO: renamed from: H2 */
    private void m5979H2() {
        if (this.f5837v.mo6211k() == 1073741824) {
            return;
        }
        int iM5809O = m5809O();
        float fMax = 0.0f;
        for (int i3 = 0; i3 < iM5809O; i3++) {
            View viewM5807N = m5807N(i3);
            float fMo6205e = this.f5837v.mo6205e(viewM5807N);
            if (fMo6205e >= fMax) {
                if (((C1220c) viewM5807N.getLayoutParams()).m6057e()) {
                    fMo6205e = (fMo6205e * 1.0f) / this.f5834s;
                }
                fMax = Math.max(fMax, fMo6205e);
            }
        }
        int i4 = this.f5839x;
        int iRound = Math.round(fMax * this.f5834s);
        if (this.f5837v.mo6211k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f5837v.mo6214n());
        }
        m6021T2(iRound);
        if (this.f5839x == i4) {
            return;
        }
        for (int i5 = 0; i5 < iM5809O; i5++) {
            View viewM5807N2 = m5807N(i5);
            C1220c c1220c = (C1220c) viewM5807N2.getLayoutParams();
            if (!c1220c.f5867f) {
                if (m6030x2() && this.f5838w == 1) {
                    int i6 = this.f5834s;
                    int i7 = c1220c.f5866e.f5872e;
                    viewM5807N2.offsetLeftAndRight(((-((i6 - 1) - i7)) * this.f5839x) - ((-((i6 - 1) - i7)) * i4));
                } else {
                    int i8 = c1220c.f5866e.f5872e;
                    int i9 = this.f5839x * i8;
                    int i10 = i8 * i4;
                    if (this.f5838w == 1) {
                        viewM5807N2.offsetLeftAndRight(i9 - i10);
                    } else {
                        viewM5807N2.offsetTopAndBottom(i9 - i10);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: I2 */
    private void m5980I2() {
        if (this.f5838w == 1 || !m6030x2()) {
            this.f5818A = this.f5841z;
        } else {
            this.f5818A = !this.f5841z;
        }
    }

    /* JADX INFO: renamed from: K2 */
    private void m5981K2(int i3) {
        C1227f c1227f = this.f5840y;
        c1227f.f5997e = i3;
        c1227f.f5996d = this.f5818A != (i3 == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: O2 */
    private void m5982O2(int i3, int i4) {
        for (int i5 = 0; i5 < this.f5834s; i5++) {
            if (!this.f5835t[i5].f5868a.isEmpty()) {
                m5988U2(this.f5835t[i5], i3, i4);
            }
        }
    }

    /* JADX INFO: renamed from: P2 */
    private boolean m5983P2(RecyclerView.C1215z c1215z, C1219b c1219b) {
        c1219b.f5859a = this.f5824G ? m6001k2(c1215z.m5967b()) : m6000g2(c1215z.m5967b());
        c1219b.f5860b = Integer.MIN_VALUE;
        return true;
    }

    /* JADX INFO: renamed from: Q1 */
    private void m5984Q1(View view) {
        for (int i3 = this.f5834s - 1; i3 >= 0; i3--) {
            this.f5835t[i3].m6058a(view);
        }
    }

    /* JADX INFO: renamed from: R1 */
    private void m5985R1(C1219b c1219b) {
        SavedState savedState = this.f5826I;
        int i3 = savedState.f5850f;
        if (i3 > 0) {
            if (i3 == this.f5834s) {
                for (int i4 = 0; i4 < this.f5834s; i4++) {
                    this.f5835t[i4].m6062e();
                    SavedState savedState2 = this.f5826I;
                    int iMo6209i = savedState2.f5851g[i4];
                    if (iMo6209i != Integer.MIN_VALUE) {
                        iMo6209i += savedState2.f5856l ? this.f5836u.mo6209i() : this.f5836u.mo6213m();
                    }
                    this.f5835t[i4].m6079v(iMo6209i);
                }
            } else {
                savedState.m6050d();
                SavedState savedState3 = this.f5826I;
                savedState3.f5848d = savedState3.f5849e;
            }
        }
        SavedState savedState4 = this.f5826I;
        this.f5825H = savedState4.f5857m;
        m6015M2(savedState4.f5855k);
        m5980I2();
        SavedState savedState5 = this.f5826I;
        int i5 = savedState5.f5848d;
        if (i5 != -1) {
            this.f5820C = i5;
            c1219b.f5861c = savedState5.f5856l;
        } else {
            c1219b.f5861c = this.f5818A;
        }
        if (savedState5.f5852h > 1) {
            LazySpanLookup lazySpanLookup = this.f5822E;
            lazySpanLookup.f5842a = savedState5.f5853i;
            lazySpanLookup.f5843b = savedState5.f5854j;
        }
    }

    /* JADX INFO: renamed from: S2 */
    private void m5986S2(int i3, RecyclerView.C1215z c1215z) {
        int iMo6214n;
        int iMo6214n2;
        int iM5968c;
        C1227f c1227f = this.f5840y;
        boolean z2 = false;
        c1227f.f5994b = 0;
        c1227f.f5995c = i3;
        if (!m5783B0() || (iM5968c = c1215z.m5968c()) == -1) {
            iMo6214n = 0;
            iMo6214n2 = 0;
        } else {
            if (this.f5818A == (iM5968c < i3)) {
                iMo6214n = this.f5836u.mo6214n();
                iMo6214n2 = 0;
            } else {
                iMo6214n2 = this.f5836u.mo6214n();
                iMo6214n = 0;
            }
        }
        if (m5813R()) {
            this.f5840y.f5998f = this.f5836u.mo6213m() - iMo6214n2;
            this.f5840y.f5999g = this.f5836u.mo6209i() + iMo6214n;
        } else {
            this.f5840y.f5999g = this.f5836u.mo6208h() + iMo6214n;
            this.f5840y.f5998f = -iMo6214n2;
        }
        C1227f c1227f2 = this.f5840y;
        c1227f2.f6000h = false;
        c1227f2.f5993a = true;
        if (this.f5836u.mo6211k() == 0 && this.f5836u.mo6208h() == 0) {
            z2 = true;
        }
        c1227f2.f6001i = z2;
    }

    /* JADX INFO: renamed from: U1 */
    private void m5987U1(View view, C1220c c1220c, C1227f c1227f) {
        if (c1227f.f5997e == 1) {
            if (c1220c.f5867f) {
                m5984Q1(view);
                return;
            } else {
                c1220c.f5866e.m6058a(view);
                return;
            }
        }
        if (c1220c.f5867f) {
            m5975D2(view);
        } else {
            c1220c.f5866e.m6078u(view);
        }
    }

    /* JADX INFO: renamed from: U2 */
    private void m5988U2(C1221d c1221d, int i3, int i4) {
        int iM6067j = c1221d.m6067j();
        if (i3 == -1) {
            if (c1221d.m6072o() + iM6067j <= i4) {
                this.f5819B.set(c1221d.f5872e, false);
            }
        } else if (c1221d.m6068k() - iM6067j >= i4) {
            this.f5819B.set(c1221d.f5872e, false);
        }
    }

    /* JADX INFO: renamed from: V1 */
    private int m5989V1(int i3) {
        if (m5809O() == 0) {
            return this.f5818A ? 1 : -1;
        }
        return (i3 < m6026n2()) != this.f5818A ? -1 : 1;
    }

    /* JADX INFO: renamed from: V2 */
    private int m5990V2(int i3, int i4, int i5) {
        int mode;
        return (!(i4 == 0 && i5 == 0) && ((mode = View.MeasureSpec.getMode(i3)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - i4) - i5), mode) : i3;
    }

    /* JADX INFO: renamed from: X1 */
    private boolean m5991X1(C1221d c1221d) {
        if (this.f5818A) {
            if (c1221d.m6068k() < this.f5836u.mo6209i()) {
                ArrayList arrayList = c1221d.f5868a;
                return !c1221d.m6071n((View) arrayList.get(arrayList.size() - 1)).f5867f;
            }
        } else if (c1221d.m6072o() > this.f5836u.mo6213m()) {
            return !c1221d.m6071n((View) c1221d.f5868a.get(0)).f5867f;
        }
        return false;
    }

    /* JADX INFO: renamed from: Y1 */
    private int m5992Y1(RecyclerView.C1215z c1215z) {
        if (m5809O() == 0) {
            return 0;
        }
        return AbstractC1233l.m6235a(c1215z, this.f5836u, m6024i2(!this.f5831N), m6023h2(!this.f5831N), this, this.f5831N);
    }

    /* JADX INFO: renamed from: Z1 */
    private int m5993Z1(RecyclerView.C1215z c1215z) {
        if (m5809O() == 0) {
            return 0;
        }
        return AbstractC1233l.m6236b(c1215z, this.f5836u, m6024i2(!this.f5831N), m6023h2(!this.f5831N), this, this.f5831N, this.f5818A);
    }

    /* JADX INFO: renamed from: a2 */
    private int m5994a2(RecyclerView.C1215z c1215z) {
        if (m5809O() == 0) {
            return 0;
        }
        return AbstractC1233l.m6237c(c1215z, this.f5836u, m6024i2(!this.f5831N), m6023h2(!this.f5831N), this, this.f5831N);
    }

    /* JADX INFO: renamed from: b2 */
    private int m5995b2(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 17 ? i3 != 33 ? i3 != 66 ? (i3 == 130 && this.f5838w == 1) ? 1 : Integer.MIN_VALUE : this.f5838w == 0 ? 1 : Integer.MIN_VALUE : this.f5838w == 1 ? -1 : Integer.MIN_VALUE : this.f5838w == 0 ? -1 : Integer.MIN_VALUE : (this.f5838w != 1 && m6030x2()) ? -1 : 1 : (this.f5838w != 1 && m6030x2()) ? 1 : -1;
    }

    /* JADX INFO: renamed from: c2 */
    private LazySpanLookup.FullSpanItem m5996c2(int i3) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f5846f = new int[this.f5834s];
        for (int i4 = 0; i4 < this.f5834s; i4++) {
            fullSpanItem.f5846f[i4] = i3 - this.f5835t[i4].m6069l(i3);
        }
        return fullSpanItem;
    }

    /* JADX INFO: renamed from: d2 */
    private LazySpanLookup.FullSpanItem m5997d2(int i3) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f5846f = new int[this.f5834s];
        for (int i4 = 0; i4 < this.f5834s; i4++) {
            fullSpanItem.f5846f[i4] = this.f5835t[i4].m6073p(i3) - i3;
        }
        return fullSpanItem;
    }

    /* JADX INFO: renamed from: e2 */
    private void m5998e2() {
        this.f5836u = AbstractC1230i.m6202b(this, this.f5838w);
        this.f5837v = AbstractC1230i.m6202b(this, 1 - this.f5838w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX INFO: renamed from: f2 */
    private int m5999f2(RecyclerView.C1211v c1211v, C1227f c1227f, RecyclerView.C1215z c1215z) {
        C1221d c1221dM6008t2;
        int iM6007s2;
        int iMo6205e;
        int iMo6213m;
        int iMo6205e2;
        ?? r02;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r8 = 0;
        staggeredGridLayoutManager.f5819B.set(0, staggeredGridLayoutManager.f5834s, true);
        int i3 = staggeredGridLayoutManager.f5840y.f6001i ? c1227f.f5997e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE : c1227f.f5997e == 1 ? c1227f.f5999g + c1227f.f5994b : c1227f.f5998f - c1227f.f5994b;
        staggeredGridLayoutManager.m5982O2(c1227f.f5997e, i3);
        int iMo6209i = staggeredGridLayoutManager.f5818A ? staggeredGridLayoutManager.f5836u.mo6209i() : staggeredGridLayoutManager.f5836u.mo6213m();
        boolean z2 = false;
        ?? r03 = staggeredGridLayoutManager;
        while (c1227f.m6182a(c1215z) && (r03.f5840y.f6001i || !r03.f5819B.isEmpty())) {
            View viewM6183b = c1227f.m6183b(c1211v);
            C1220c c1220c = (C1220c) viewM6183b.getLayoutParams();
            int iM5881a = c1220c.m5881a();
            int iM6040g = r03.f5822E.m6040g(iM5881a);
            ?? r5 = iM6040g == -1 ? 1 : r8;
            if (r5 != 0) {
                c1221dM6008t2 = c1220c.f5867f ? r03.f5835t[r8] : r03.m6008t2(c1227f);
                r03.f5822E.m6044n(iM5881a, c1221dM6008t2);
            } else {
                c1221dM6008t2 = r03.f5835t[iM6040g];
            }
            C1221d c1221d = c1221dM6008t2;
            c1220c.f5866e = c1221d;
            if (c1227f.f5997e == 1) {
                r03.m5839i(viewM6183b);
            } else {
                r03.m5842j(viewM6183b, r8);
            }
            r03.m6011z2(viewM6183b, c1220c, r8);
            if (c1227f.f5997e == 1) {
                iMo6205e = c1220c.f5867f ? r03.m6004p2(iMo6209i) : c1221d.m6069l(iMo6209i);
                iM6007s2 = r03.f5836u.mo6205e(viewM6183b) + iMo6205e;
                if (r5 != 0 && c1220c.f5867f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM5996c2 = r03.m5996c2(iMo6205e);
                    fullSpanItemM5996c2.f5845e = -1;
                    fullSpanItemM5996c2.f5844d = iM5881a;
                    r03.f5822E.m6034a(fullSpanItemM5996c2);
                }
            } else {
                iM6007s2 = c1220c.f5867f ? r03.m6007s2(iMo6209i) : c1221d.m6073p(iMo6209i);
                iMo6205e = iM6007s2 - r03.f5836u.mo6205e(viewM6183b);
                if (r5 != 0 && c1220c.f5867f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM5997d2 = r03.m5997d2(iM6007s2);
                    fullSpanItemM5997d2.f5845e = 1;
                    fullSpanItemM5997d2.f5844d = iM5881a;
                    r03.f5822E.m6034a(fullSpanItemM5997d2);
                }
            }
            if (c1220c.f5867f && c1227f.f5996d == -1) {
                if (r5 != 0) {
                    r03.f5830M = true;
                } else {
                    if (!(c1227f.f5997e == 1 ? r03.m6019S1() : r03.m6020T1())) {
                        LazySpanLookup.FullSpanItem fullSpanItemM6039f = r03.f5822E.m6039f(iM5881a);
                        if (fullSpanItemM6039f != null) {
                            fullSpanItemM6039f.f5847g = true;
                        }
                        r03.f5830M = true;
                    }
                }
            }
            r03.m5987U1(viewM6183b, c1220c, c1227f);
            if (r03.m6030x2() && r03.f5838w == 1) {
                iMo6205e2 = c1220c.f5867f ? r03.f5837v.mo6209i() : r03.f5837v.mo6209i() - (((r03.f5834s - 1) - c1221d.f5872e) * r03.f5839x);
                iMo6213m = iMo6205e2 - r03.f5837v.mo6205e(viewM6183b);
            } else {
                iMo6213m = c1220c.f5867f ? r03.f5837v.mo6213m() : (c1221d.f5872e * r03.f5839x) + r03.f5837v.mo6213m();
                iMo6205e2 = r03.f5837v.mo6205e(viewM6183b) + iMo6213m;
            }
            int i4 = iMo6205e2;
            int i5 = iMo6213m;
            if (r03.f5838w == 1) {
                r03.m5786D0(viewM6183b, i5, iMo6205e, i4, iM6007s2);
                r02 = this;
            } else {
                r03.m5786D0(viewM6183b, iMo6205e, i5, iM6007s2, i4);
                r02 = r03;
            }
            if (c1220c.f5867f) {
                r02.m5982O2(r02.f5840y.f5997e, i3);
            } else {
                r02.m5988U2(c1221d, r02.f5840y.f5997e, i3);
            }
            r02.m5976E2(c1211v, r02.f5840y);
            if (r02.f5840y.f6000h && viewM6183b.hasFocusable()) {
                if (c1220c.f5867f) {
                    r02.f5819B.clear();
                } else {
                    r02.f5819B.set(c1221d.f5872e, false);
                }
            }
            z2 = true;
            r8 = 0;
            r03 = r02;
        }
        if (!z2) {
            r03.m5976E2(c1211v, r03.f5840y);
        }
        int iMo6213m2 = r03.f5840y.f5997e == -1 ? r03.f5836u.mo6213m() - r03.m6007s2(r03.f5836u.mo6213m()) : r03.m6004p2(r03.f5836u.mo6209i()) - r03.f5836u.mo6209i();
        if (iMo6213m2 > 0) {
            return Math.min(c1227f.f5994b, iMo6213m2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g2 */
    private int m6000g2(int i3) {
        int iM5809O = m5809O();
        for (int i4 = 0; i4 < iM5809O; i4++) {
            int iM5847l0 = m5847l0(m5807N(i4));
            if (iM5847l0 >= 0 && iM5847l0 < i3) {
                return iM5847l0;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: k2 */
    private int m6001k2(int i3) {
        for (int iM5809O = m5809O() - 1; iM5809O >= 0; iM5809O--) {
            int iM5847l0 = m5847l0(m5807N(iM5809O));
            if (iM5847l0 >= 0 && iM5847l0 < i3) {
                return iM5847l0;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: l2 */
    private void m6002l2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, boolean z2) {
        int iMo6209i;
        int iM6004p2 = m6004p2(Integer.MIN_VALUE);
        if (iM6004p2 != Integer.MIN_VALUE && (iMo6209i = this.f5836u.mo6209i() - iM6004p2) > 0) {
            int i3 = iMo6209i - (-m6013J2(-iMo6209i, c1211v, c1215z));
            if (!z2 || i3 <= 0) {
                return;
            }
            this.f5836u.mo6218r(i3);
        }
    }

    /* JADX INFO: renamed from: m2 */
    private void m6003m2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, boolean z2) {
        int iMo6213m;
        int iM6007s2 = m6007s2(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iM6007s2 != Integer.MAX_VALUE && (iMo6213m = iM6007s2 - this.f5836u.mo6213m()) > 0) {
            int iM6013J2 = iMo6213m - m6013J2(iMo6213m, c1211v, c1215z);
            if (!z2 || iM6013J2 <= 0) {
                return;
            }
            this.f5836u.mo6218r(-iM6013J2);
        }
    }

    /* JADX INFO: renamed from: p2 */
    private int m6004p2(int i3) {
        int iM6069l = this.f5835t[0].m6069l(i3);
        for (int i4 = 1; i4 < this.f5834s; i4++) {
            int iM6069l2 = this.f5835t[i4].m6069l(i3);
            if (iM6069l2 > iM6069l) {
                iM6069l = iM6069l2;
            }
        }
        return iM6069l;
    }

    /* JADX INFO: renamed from: q2 */
    private int m6005q2(int i3) {
        int iM6073p = this.f5835t[0].m6073p(i3);
        for (int i4 = 1; i4 < this.f5834s; i4++) {
            int iM6073p2 = this.f5835t[i4].m6073p(i3);
            if (iM6073p2 > iM6073p) {
                iM6073p = iM6073p2;
            }
        }
        return iM6073p;
    }

    /* JADX INFO: renamed from: r2 */
    private int m6006r2(int i3) {
        int iM6069l = this.f5835t[0].m6069l(i3);
        for (int i4 = 1; i4 < this.f5834s; i4++) {
            int iM6069l2 = this.f5835t[i4].m6069l(i3);
            if (iM6069l2 < iM6069l) {
                iM6069l = iM6069l2;
            }
        }
        return iM6069l;
    }

    /* JADX INFO: renamed from: s2 */
    private int m6007s2(int i3) {
        int iM6073p = this.f5835t[0].m6073p(i3);
        for (int i4 = 1; i4 < this.f5834s; i4++) {
            int iM6073p2 = this.f5835t[i4].m6073p(i3);
            if (iM6073p2 < iM6073p) {
                iM6073p = iM6073p2;
            }
        }
        return iM6073p;
    }

    /* JADX INFO: renamed from: t2 */
    private C1221d m6008t2(C1227f c1227f) {
        int i3;
        int i4;
        int i5;
        if (m5974B2(c1227f.f5997e)) {
            i4 = this.f5834s - 1;
            i3 = -1;
            i5 = -1;
        } else {
            i3 = this.f5834s;
            i4 = 0;
            i5 = 1;
        }
        C1221d c1221d = null;
        if (c1227f.f5997e == 1) {
            int iMo6213m = this.f5836u.mo6213m();
            int i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            while (i4 != i3) {
                C1221d c1221d2 = this.f5835t[i4];
                int iM6069l = c1221d2.m6069l(iMo6213m);
                if (iM6069l < i6) {
                    c1221d = c1221d2;
                    i6 = iM6069l;
                }
                i4 += i5;
            }
            return c1221d;
        }
        int iMo6209i = this.f5836u.mo6209i();
        int i7 = Integer.MIN_VALUE;
        while (i4 != i3) {
            C1221d c1221d3 = this.f5835t[i4];
            int iM6073p = c1221d3.m6073p(iMo6209i);
            if (iM6073p > i7) {
                c1221d = c1221d3;
                i7 = iM6073p;
            }
            i4 += i5;
        }
        return c1221d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: u2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m6009u2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f5818A
            if (r0 == 0) goto L9
            int r0 = r6.m6027o2()
            goto Ld
        L9:
            int r0 = r6.m6026n2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f5822E
            r4.m6041h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5822E
            r9.m6043k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f5822E
            r7.m6042j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5822E
            r9.m6043k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5822E
            r9.m6042j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.f5818A
            if (r7 == 0) goto L4e
            int r7 = r6.m6026n2()
            goto L52
        L4e:
            int r7 = r6.m6027o2()
        L52:
            if (r3 > r7) goto L57
            r6.m5871x1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6009u2(int, int, int):void");
    }

    /* JADX INFO: renamed from: y2 */
    private void m6010y2(View view, int i3, int i4, boolean z2) {
        m5854o(view, this.f5828K);
        C1220c c1220c = (C1220c) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) c1220c).leftMargin;
        Rect rect = this.f5828K;
        int iM5990V2 = m5990V2(i3, i5 + rect.left, ((ViewGroup.MarginLayoutParams) c1220c).rightMargin + rect.right);
        int i6 = ((ViewGroup.MarginLayoutParams) c1220c).topMargin;
        Rect rect2 = this.f5828K;
        int iM5990V22 = m5990V2(i4, i6 + rect2.top, ((ViewGroup.MarginLayoutParams) c1220c).bottomMargin + rect2.bottom);
        if (z2 ? m5805L1(view, iM5990V2, iM5990V22, c1220c) : m5801J1(view, iM5990V2, iM5990V22, c1220c)) {
            view.measure(iM5990V2, iM5990V22);
        }
    }

    /* JADX INFO: renamed from: z2 */
    private void m6011z2(View view, C1220c c1220c, boolean z2) {
        if (c1220c.f5867f) {
            if (this.f5838w == 1) {
                m6010y2(view, this.f5827J, RecyclerView.AbstractC1205p.m5775P(m5826b0(), m5827c0(), m5845k0() + m5838h0(), ((ViewGroup.MarginLayoutParams) c1220c).height, true), z2);
                return;
            } else {
                m6010y2(view, RecyclerView.AbstractC1205p.m5775P(m5862s0(), m5864t0(), m5840i0() + m5843j0(), ((ViewGroup.MarginLayoutParams) c1220c).width, true), this.f5827J, z2);
                return;
            }
        }
        if (this.f5838w == 1) {
            m6010y2(view, RecyclerView.AbstractC1205p.m5775P(this.f5839x, m5864t0(), 0, ((ViewGroup.MarginLayoutParams) c1220c).width, false), RecyclerView.AbstractC1205p.m5775P(m5826b0(), m5827c0(), m5845k0() + m5838h0(), ((ViewGroup.MarginLayoutParams) c1220c).height, true), z2);
        } else {
            m6010y2(view, RecyclerView.AbstractC1205p.m5775P(m5862s0(), m5864t0(), m5840i0() + m5843j0(), ((ViewGroup.MarginLayoutParams) c1220c).width, true), RecyclerView.AbstractC1205p.m5775P(this.f5839x, m5827c0(), 0, ((ViewGroup.MarginLayoutParams) c1220c).height, false), z2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: A */
    public int mo5397A(RecyclerView.C1215z c1215z) {
        return m5994a2(c1215z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: A1 */
    public int mo5398A1(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        return m6013J2(i3, c1211v, c1215z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: B1 */
    public void mo5462B1(int i3) {
        SavedState savedState = this.f5826I;
        if (savedState != null && savedState.f5848d != i3) {
            savedState.m6049a();
        }
        this.f5820C = i3;
        this.f5821D = Integer.MIN_VALUE;
        m5871x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: C1 */
    public int mo5399C1(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        return m6013J2(i3, c1211v, c1215z);
    }

    /* JADX INFO: renamed from: C2 */
    void m6012C2(int i3, RecyclerView.C1215z c1215z) {
        int iM6026n2;
        int i4;
        if (i3 > 0) {
            iM6026n2 = m6027o2();
            i4 = 1;
        } else {
            iM6026n2 = m6026n2();
            i4 = -1;
        }
        this.f5840y.f5993a = true;
        m5986S2(iM6026n2, c1215z);
        m5981K2(i4);
        C1227f c1227f = this.f5840y;
        c1227f.f5995c = iM6026n2 + c1227f.f5996d;
        c1227f.f5994b = Math.abs(i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: G0 */
    public void mo5795G0(int i3) {
        super.mo5795G0(i3);
        for (int i4 = 0; i4 < this.f5834s; i4++) {
            this.f5835t[i4].m6075r(i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: G1 */
    public void mo5401G1(Rect rect, int i3, int i4) {
        int iM5779s;
        int iM5779s2;
        int iM5840i0 = m5840i0() + m5843j0();
        int iM5845k0 = m5845k0() + m5838h0();
        if (this.f5838w == 1) {
            iM5779s2 = RecyclerView.AbstractC1205p.m5779s(i4, rect.height() + iM5845k0, m5833f0());
            iM5779s = RecyclerView.AbstractC1205p.m5779s(i3, (this.f5839x * this.f5834s) + iM5840i0, m5836g0());
        } else {
            iM5779s = RecyclerView.AbstractC1205p.m5779s(i3, rect.width() + iM5840i0, m5836g0());
            iM5779s2 = RecyclerView.AbstractC1205p.m5779s(i4, (this.f5839x * this.f5834s) + iM5845k0, m5833f0());
        }
        m5793F1(iM5779s, iM5779s2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: H0 */
    public void mo5796H0(int i3) {
        super.mo5796H0(i3);
        for (int i4 = 0; i4 < this.f5834s; i4++) {
            this.f5835t[i4].m6075r(i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: I */
    public RecyclerView.C1206q mo5402I() {
        return this.f5838w == 0 ? new C1220c(-2, -1) : new C1220c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: I0 */
    public void mo5798I0(RecyclerView.AbstractC1197h abstractC1197h, RecyclerView.AbstractC1197h abstractC1197h2) {
        this.f5822E.m6035b();
        for (int i3 = 0; i3 < this.f5834s; i3++) {
            this.f5835t[i3].m6062e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: J */
    public RecyclerView.C1206q mo5403J(Context context, AttributeSet attributeSet) {
        return new C1220c(context, attributeSet);
    }

    /* JADX INFO: renamed from: J2 */
    int m6013J2(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        if (m5809O() == 0 || i3 == 0) {
            return 0;
        }
        m6012C2(i3, c1215z);
        int iM5999f2 = m5999f2(c1211v, this.f5840y, c1215z);
        if (this.f5840y.f5994b >= iM5999f2) {
            i3 = i3 < 0 ? -iM5999f2 : iM5999f2;
        }
        this.f5836u.mo6218r(-i3);
        this.f5824G = this.f5818A;
        C1227f c1227f = this.f5840y;
        c1227f.f5994b = 0;
        m5976E2(c1211v, c1227f);
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: K */
    public RecyclerView.C1206q mo5404K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1220c((ViewGroup.MarginLayoutParams) layoutParams) : new C1220c(layoutParams);
    }

    /* JADX INFO: renamed from: L2 */
    public void m6014L2(int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo5485l(null);
        if (i3 == this.f5838w) {
            return;
        }
        this.f5838w = i3;
        AbstractC1230i abstractC1230i = this.f5836u;
        this.f5836u = this.f5837v;
        this.f5837v = abstractC1230i;
        m5871x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: M0 */
    public void mo5468M0(RecyclerView recyclerView, RecyclerView.C1211v c1211v) {
        super.mo5468M0(recyclerView, c1211v);
        m5863s1(this.f5833P);
        for (int i3 = 0; i3 < this.f5834s; i3++) {
            this.f5835t[i3].m6062e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: M1 */
    public void mo5469M1(RecyclerView recyclerView, RecyclerView.C1215z c1215z, int i3) {
        C1228g c1228g = new C1228g(recyclerView.getContext());
        c1228g.m5958p(i3);
        m5808N1(c1228g);
    }

    /* JADX INFO: renamed from: M2 */
    public void m6015M2(boolean z2) {
        mo5485l(null);
        SavedState savedState = this.f5826I;
        if (savedState != null && savedState.f5855k != z2) {
            savedState.f5855k = z2;
        }
        this.f5841z = z2;
        m5871x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: N0 */
    public View mo5405N0(View view, int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        View viewM5794G;
        View viewM6070m;
        if (m5809O() == 0 || (viewM5794G = m5794G(view)) == null) {
            return null;
        }
        m5980I2();
        int iM5995b2 = m5995b2(i3);
        if (iM5995b2 == Integer.MIN_VALUE) {
            return null;
        }
        C1220c c1220c = (C1220c) viewM5794G.getLayoutParams();
        boolean z2 = c1220c.f5867f;
        C1221d c1221d = c1220c.f5866e;
        int iM6027o2 = iM5995b2 == 1 ? m6027o2() : m6026n2();
        m5986S2(iM6027o2, c1215z);
        m5981K2(iM5995b2);
        C1227f c1227f = this.f5840y;
        c1227f.f5995c = c1227f.f5996d + iM6027o2;
        c1227f.f5994b = (int) (this.f5836u.mo6214n() * 0.33333334f);
        C1227f c1227f2 = this.f5840y;
        c1227f2.f6000h = true;
        c1227f2.f5993a = false;
        m5999f2(c1211v, c1227f2, c1215z);
        this.f5824G = this.f5818A;
        if (!z2 && (viewM6070m = c1221d.m6070m(iM6027o2, iM5995b2)) != null && viewM6070m != viewM5794G) {
            return viewM6070m;
        }
        if (m5974B2(iM5995b2)) {
            for (int i4 = this.f5834s - 1; i4 >= 0; i4--) {
                View viewM6070m2 = this.f5835t[i4].m6070m(iM6027o2, iM5995b2);
                if (viewM6070m2 != null && viewM6070m2 != viewM5794G) {
                    return viewM6070m2;
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f5834s; i5++) {
                View viewM6070m3 = this.f5835t[i5].m6070m(iM6027o2, iM5995b2);
                if (viewM6070m3 != null && viewM6070m3 != viewM5794G) {
                    return viewM6070m3;
                }
            }
        }
        boolean z3 = (this.f5841z ^ true) == (iM5995b2 == -1);
        if (!z2) {
            View viewMo5466H = mo5466H(z3 ? c1221d.m6063f() : c1221d.m6064g());
            if (viewMo5466H != null && viewMo5466H != viewM5794G) {
                return viewMo5466H;
            }
        }
        if (m5974B2(iM5995b2)) {
            for (int i6 = this.f5834s - 1; i6 >= 0; i6--) {
                if (i6 != c1221d.f5872e) {
                    View viewMo5466H2 = mo5466H(z3 ? this.f5835t[i6].m6063f() : this.f5835t[i6].m6064g());
                    if (viewMo5466H2 != null && viewMo5466H2 != viewM5794G) {
                        return viewMo5466H2;
                    }
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f5834s; i7++) {
                View viewMo5466H3 = mo5466H(z3 ? this.f5835t[i7].m6063f() : this.f5835t[i7].m6064g());
                if (viewMo5466H3 != null && viewMo5466H3 != viewM5794G) {
                    return viewMo5466H3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: N2 */
    public void m6016N2(int i3) {
        mo5485l(null);
        if (i3 != this.f5834s) {
            m6029w2();
            this.f5834s = i3;
            this.f5819B = new BitSet(this.f5834s);
            this.f5835t = new C1221d[this.f5834s];
            for (int i4 = 0; i4 < this.f5834s; i4++) {
                this.f5835t[i4] = new C1221d(i4);
            }
            m5871x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: O0 */
    public void mo5470O0(AccessibilityEvent accessibilityEvent) {
        super.mo5470O0(accessibilityEvent);
        if (m5809O() > 0) {
            View viewM6024i2 = m6024i2(false);
            View viewM6023h2 = m6023h2(false);
            if (viewM6024i2 == null || viewM6023h2 == null) {
                return;
            }
            int iM5847l0 = m5847l0(viewM6024i2);
            int iM5847l02 = m5847l0(viewM6023h2);
            if (iM5847l0 < iM5847l02) {
                accessibilityEvent.setFromIndex(iM5847l0);
                accessibilityEvent.setToIndex(iM5847l02);
            } else {
                accessibilityEvent.setFromIndex(iM5847l02);
                accessibilityEvent.setToIndex(iM5847l0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: P1 */
    public boolean mo5406P1() {
        return this.f5826I == null;
    }

    /* JADX INFO: renamed from: Q2 */
    boolean m6017Q2(RecyclerView.C1215z c1215z, C1219b c1219b) {
        int i3;
        if (!c1215z.m5970e() && (i3 = this.f5820C) != -1) {
            if (i3 >= 0 && i3 < c1215z.m5967b()) {
                SavedState savedState = this.f5826I;
                if (savedState == null || savedState.f5848d == -1 || savedState.f5850f < 1) {
                    View viewMo5466H = mo5466H(this.f5820C);
                    if (viewMo5466H != null) {
                        c1219b.f5859a = this.f5818A ? m6027o2() : m6026n2();
                        if (this.f5821D != Integer.MIN_VALUE) {
                            if (c1219b.f5861c) {
                                c1219b.f5860b = (this.f5836u.mo6209i() - this.f5821D) - this.f5836u.mo6204d(viewMo5466H);
                            } else {
                                c1219b.f5860b = (this.f5836u.mo6213m() + this.f5821D) - this.f5836u.mo6207g(viewMo5466H);
                            }
                            return true;
                        }
                        if (this.f5836u.mo6205e(viewMo5466H) > this.f5836u.mo6214n()) {
                            c1219b.f5860b = c1219b.f5861c ? this.f5836u.mo6209i() : this.f5836u.mo6213m();
                            return true;
                        }
                        int iMo6207g = this.f5836u.mo6207g(viewMo5466H) - this.f5836u.mo6213m();
                        if (iMo6207g < 0) {
                            c1219b.f5860b = -iMo6207g;
                            return true;
                        }
                        int iMo6209i = this.f5836u.mo6209i() - this.f5836u.mo6204d(viewMo5466H);
                        if (iMo6209i < 0) {
                            c1219b.f5860b = iMo6209i;
                            return true;
                        }
                        c1219b.f5860b = Integer.MIN_VALUE;
                    } else {
                        int i4 = this.f5820C;
                        c1219b.f5859a = i4;
                        int i5 = this.f5821D;
                        if (i5 == Integer.MIN_VALUE) {
                            c1219b.f5861c = m5989V1(i4) == 1;
                            c1219b.m6053a();
                        } else {
                            c1219b.m6054b(i5);
                        }
                        c1219b.f5862d = true;
                    }
                } else {
                    c1219b.f5860b = Integer.MIN_VALUE;
                    c1219b.f5859a = this.f5820C;
                }
                return true;
            }
            this.f5820C = -1;
            this.f5821D = Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: R2 */
    void m6018R2(RecyclerView.C1215z c1215z, C1219b c1219b) {
        if (m6017Q2(c1215z, c1219b) || m5983P2(c1215z, c1219b)) {
            return;
        }
        c1219b.m6053a();
        c1219b.f5859a = 0;
    }

    /* JADX INFO: renamed from: S1 */
    boolean m6019S1() {
        int iM6069l = this.f5835t[0].m6069l(Integer.MIN_VALUE);
        for (int i3 = 1; i3 < this.f5834s; i3++) {
            if (this.f5835t[i3].m6069l(Integer.MIN_VALUE) != iM6069l) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: T1 */
    boolean m6020T1() {
        int iM6073p = this.f5835t[0].m6073p(Integer.MIN_VALUE);
        for (int i3 = 1; i3 < this.f5834s; i3++) {
            if (this.f5835t[i3].m6073p(Integer.MIN_VALUE) != iM6073p) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: T2 */
    void m6021T2(int i3) {
        this.f5839x = i3 / this.f5834s;
        this.f5827J = View.MeasureSpec.makeMeasureSpec(i3, this.f5837v.mo6211k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: V0 */
    public void mo5410V0(RecyclerView recyclerView, int i3, int i4) {
        m6009u2(i3, i4, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: W0 */
    public void mo5411W0(RecyclerView recyclerView) {
        this.f5822E.m6035b();
        m5871x1();
    }

    /* JADX INFO: renamed from: W1 */
    boolean m6022W1() {
        int iM6026n2;
        int iM6027o2;
        if (m5809O() == 0 || this.f5823F == 0 || !m5868v0()) {
            return false;
        }
        if (this.f5818A) {
            iM6026n2 = m6027o2();
            iM6027o2 = m6026n2();
        } else {
            iM6026n2 = m6026n2();
            iM6027o2 = m6027o2();
        }
        if (iM6026n2 == 0 && m6028v2() != null) {
            this.f5822E.m6035b();
            m5873y1();
            m5871x1();
            return true;
        }
        if (!this.f5830M) {
            return false;
        }
        int i3 = this.f5818A ? -1 : 1;
        int i4 = iM6027o2 + 1;
        LazySpanLookup.FullSpanItem fullSpanItemM6038e = this.f5822E.m6038e(iM6026n2, i4, i3, true);
        if (fullSpanItemM6038e == null) {
            this.f5830M = false;
            this.f5822E.m6037d(i4);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemM6038e2 = this.f5822E.m6038e(iM6026n2, fullSpanItemM6038e.f5844d, i3 * (-1), true);
        if (fullSpanItemM6038e2 == null) {
            this.f5822E.m6037d(fullSpanItemM6038e.f5844d);
        } else {
            this.f5822E.m6037d(fullSpanItemM6038e2.f5844d + 1);
        }
        m5873y1();
        m5871x1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: X0 */
    public void mo5413X0(RecyclerView recyclerView, int i3, int i4, int i5) {
        m6009u2(i3, i4, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: Y0 */
    public void mo5414Y0(RecyclerView recyclerView, int i3, int i4) {
        m6009u2(i3, i4, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: a1 */
    public void mo5415a1(RecyclerView recyclerView, int i3, int i4, Object obj) {
        m6009u2(i3, i4, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: b1 */
    public void mo5416b1(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        m5973A2(c1211v, c1215z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: c1 */
    public void mo5417c1(RecyclerView.C1215z c1215z) {
        super.mo5417c1(c1215z);
        this.f5820C = -1;
        this.f5821D = Integer.MIN_VALUE;
        this.f5826I = null;
        this.f5829L.m6055c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1214y.b
    /* JADX INFO: renamed from: d */
    public PointF mo5479d(int i3) {
        int iM5989V1 = m5989V1(i3);
        PointF pointF = new PointF();
        if (iM5989V1 == 0) {
            return null;
        }
        if (this.f5838w == 0) {
            pointF.x = iM5989V1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iM5989V1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: g1 */
    public void mo5482g1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f5826I = savedState;
            if (this.f5820C != -1) {
                savedState.m6049a();
                this.f5826I.m6050d();
            }
            m5871x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: h1 */
    public Parcelable mo5484h1() {
        int iM6073p;
        int iMo6213m;
        int[] iArr;
        if (this.f5826I != null) {
            return new SavedState(this.f5826I);
        }
        SavedState savedState = new SavedState();
        savedState.f5855k = this.f5841z;
        savedState.f5856l = this.f5824G;
        savedState.f5857m = this.f5825H;
        LazySpanLookup lazySpanLookup = this.f5822E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f5842a) == null) {
            savedState.f5852h = 0;
        } else {
            savedState.f5853i = iArr;
            savedState.f5852h = iArr.length;
            savedState.f5854j = lazySpanLookup.f5843b;
        }
        if (m5809O() <= 0) {
            savedState.f5848d = -1;
            savedState.f5849e = -1;
            savedState.f5850f = 0;
            return savedState;
        }
        savedState.f5848d = this.f5824G ? m6027o2() : m6026n2();
        savedState.f5849e = m6025j2();
        int i3 = this.f5834s;
        savedState.f5850f = i3;
        savedState.f5851g = new int[i3];
        for (int i4 = 0; i4 < this.f5834s; i4++) {
            if (this.f5824G) {
                iM6073p = this.f5835t[i4].m6069l(Integer.MIN_VALUE);
                if (iM6073p != Integer.MIN_VALUE) {
                    iMo6213m = this.f5836u.mo6209i();
                    iM6073p -= iMo6213m;
                }
            } else {
                iM6073p = this.f5835t[i4].m6073p(Integer.MIN_VALUE);
                if (iM6073p != Integer.MIN_VALUE) {
                    iMo6213m = this.f5836u.mo6213m();
                    iM6073p -= iMo6213m;
                }
            }
            savedState.f5851g[i4] = iM6073p;
        }
        return savedState;
    }

    /* JADX INFO: renamed from: h2 */
    View m6023h2(boolean z2) {
        int iMo6213m = this.f5836u.mo6213m();
        int iMo6209i = this.f5836u.mo6209i();
        View view = null;
        for (int iM5809O = m5809O() - 1; iM5809O >= 0; iM5809O--) {
            View viewM5807N = m5807N(iM5809O);
            int iMo6207g = this.f5836u.mo6207g(viewM5807N);
            int iMo6204d = this.f5836u.mo6204d(viewM5807N);
            if (iMo6204d > iMo6213m && iMo6207g < iMo6209i) {
                if (iMo6204d <= iMo6209i || !z2) {
                    return viewM5807N;
                }
                if (view == null) {
                    view = viewM5807N;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: i1 */
    public void mo5841i1(int i3) {
        if (i3 == 0) {
            m6022W1();
        }
    }

    /* JADX INFO: renamed from: i2 */
    View m6024i2(boolean z2) {
        int iMo6213m = this.f5836u.mo6213m();
        int iMo6209i = this.f5836u.mo6209i();
        int iM5809O = m5809O();
        View view = null;
        for (int i3 = 0; i3 < iM5809O; i3++) {
            View viewM5807N = m5807N(i3);
            int iMo6207g = this.f5836u.mo6207g(viewM5807N);
            if (this.f5836u.mo6204d(viewM5807N) > iMo6213m && iMo6207g < iMo6209i) {
                if (iMo6207g >= iMo6213m || !z2) {
                    return viewM5807N;
                }
                if (view == null) {
                    view = viewM5807N;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: j2 */
    int m6025j2() {
        View viewM6023h2 = this.f5818A ? m6023h2(true) : m6024i2(true);
        if (viewM6023h2 == null) {
            return -1;
        }
        return m5847l0(viewM6023h2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: l */
    public void mo5485l(String str) {
        if (this.f5826I == null) {
            super.mo5485l(str);
        }
    }

    /* JADX INFO: renamed from: n2 */
    int m6026n2() {
        if (m5809O() == 0) {
            return 0;
        }
        return m5847l0(m5807N(0));
    }

    /* JADX INFO: renamed from: o2 */
    int m6027o2() {
        int iM5809O = m5809O();
        if (iM5809O == 0) {
            return 0;
        }
        return m5847l0(m5807N(iM5809O - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: p */
    public boolean mo5487p() {
        return this.f5838w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: q */
    public boolean mo5489q() {
        return this.f5838w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: r */
    public boolean mo5421r(RecyclerView.C1206q c1206q) {
        return c1206q instanceof C1220c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: t */
    public void mo5492t(int i3, int i4, RecyclerView.C1215z c1215z, RecyclerView.AbstractC1205p.c cVar) {
        int iM6069l;
        int iM6073p;
        if (this.f5838w != 0) {
            i3 = i4;
        }
        if (m5809O() == 0 || i3 == 0) {
            return;
        }
        m6012C2(i3, c1215z);
        int[] iArr = this.f5832O;
        if (iArr == null || iArr.length < this.f5834s) {
            this.f5832O = new int[this.f5834s];
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f5834s; i6++) {
            C1227f c1227f = this.f5840y;
            if (c1227f.f5996d == -1) {
                iM6069l = c1227f.f5998f;
                iM6073p = this.f5835t[i6].m6073p(iM6069l);
            } else {
                iM6069l = this.f5835t[i6].m6069l(c1227f.f5999g);
                iM6073p = this.f5840y.f5999g;
            }
            int i7 = iM6069l - iM6073p;
            if (i7 >= 0) {
                this.f5832O[i5] = i7;
                i5++;
            }
        }
        Arrays.sort(this.f5832O, 0, i5);
        for (int i8 = 0; i8 < i5 && this.f5840y.m6182a(c1215z); i8++) {
            cVar.mo5880a(this.f5840y.f5995c, this.f5832O[i8]);
            C1227f c1227f2 = this.f5840y;
            c1227f2.f5995c += c1227f2.f5996d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: v */
    public int mo5494v(RecyclerView.C1215z c1215z) {
        return m5992Y1(c1215z);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX INFO: renamed from: v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View m6028v2() {
        /*
            r12 = this;
            int r0 = r12.m5809O()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f5834s
            r2.<init>(r3)
            int r3 = r12.f5834s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f5838w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.m6030x2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f5818A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.m5807N(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1220c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f5866e
            int r9 = r9.f5872e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f5866e
            boolean r9 = r12.m5991X1(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f5866e
            int r9 = r9.f5872e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f5867f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.m5807N(r9)
            boolean r10 = r12.f5818A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.i r10 = r12.f5836u
            int r10 = r10.mo6204d(r7)
            androidx.recyclerview.widget.i r11 = r12.f5836u
            int r11 = r11.mo6204d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.i r10 = r12.f5836u
            int r10 = r10.mo6207g(r7)
            androidx.recyclerview.widget.i r11 = r12.f5836u
            int r11 = r11.mo6207g(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1220c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f5866e
            int r8 = r8.f5872e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f5866e
            int r9 = r9.f5872e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6028v2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: w */
    public int mo5424w(RecyclerView.C1215z c1215z) {
        return m5993Z1(c1215z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: w0 */
    public boolean mo5495w0() {
        return this.f5823F != 0;
    }

    /* JADX INFO: renamed from: w2 */
    public void m6029w2() {
        this.f5822E.m6035b();
        m5871x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: x */
    public int mo5425x(RecyclerView.C1215z c1215z) {
        return m5994a2(c1215z);
    }

    /* JADX INFO: renamed from: x2 */
    boolean m6030x2() {
        return m5828d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: y */
    public int mo5496y(RecyclerView.C1215z c1215z) {
        return m5992Y1(c1215z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: z */
    public int mo5426z(RecyclerView.C1215z c1215z) {
        return m5993Z1(c1215z);
    }

    static class LazySpanLookup {

        /* JADX INFO: renamed from: a */
        int[] f5842a;

        /* JADX INFO: renamed from: b */
        List f5843b;

        LazySpanLookup() {
        }

        /* JADX INFO: renamed from: i */
        private int m6031i(int i3) {
            if (this.f5843b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemM6039f = m6039f(i3);
            if (fullSpanItemM6039f != null) {
                this.f5843b.remove(fullSpanItemM6039f);
            }
            int size = this.f5843b.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                }
                if (((FullSpanItem) this.f5843b.get(i4)).f5844d >= i3) {
                    break;
                }
                i4++;
            }
            if (i4 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f5843b.get(i4);
            this.f5843b.remove(i4);
            return fullSpanItem.f5844d;
        }

        /* JADX INFO: renamed from: l */
        private void m6032l(int i3, int i4) {
            List list = this.f5843b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f5843b.get(size);
                int i5 = fullSpanItem.f5844d;
                if (i5 >= i3) {
                    fullSpanItem.f5844d = i5 + i4;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        private void m6033m(int i3, int i4) {
            List list = this.f5843b;
            if (list == null) {
                return;
            }
            int i5 = i3 + i4;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f5843b.get(size);
                int i6 = fullSpanItem.f5844d;
                if (i6 >= i3) {
                    if (i6 < i5) {
                        this.f5843b.remove(size);
                    } else {
                        fullSpanItem.f5844d = i6 - i4;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m6034a(FullSpanItem fullSpanItem) {
            if (this.f5843b == null) {
                this.f5843b = new ArrayList();
            }
            int size = this.f5843b.size();
            for (int i3 = 0; i3 < size; i3++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f5843b.get(i3);
                if (fullSpanItem2.f5844d == fullSpanItem.f5844d) {
                    this.f5843b.remove(i3);
                }
                if (fullSpanItem2.f5844d >= fullSpanItem.f5844d) {
                    this.f5843b.add(i3, fullSpanItem);
                    return;
                }
            }
            this.f5843b.add(fullSpanItem);
        }

        /* JADX INFO: renamed from: b */
        void m6035b() {
            int[] iArr = this.f5842a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5843b = null;
        }

        /* JADX INFO: renamed from: c */
        void m6036c(int i3) {
            int[] iArr = this.f5842a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i3, 10) + 1];
                this.f5842a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[m6045o(i3)];
                this.f5842a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5842a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX INFO: renamed from: d */
        int m6037d(int i3) {
            List list = this.f5843b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f5843b.get(size)).f5844d >= i3) {
                        this.f5843b.remove(size);
                    }
                }
            }
            return m6041h(i3);
        }

        /* JADX INFO: renamed from: e */
        public FullSpanItem m6038e(int i3, int i4, int i5, boolean z2) {
            List list = this.f5843b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f5843b.get(i6);
                int i7 = fullSpanItem.f5844d;
                if (i7 >= i4) {
                    return null;
                }
                if (i7 >= i3 && (i5 == 0 || fullSpanItem.f5845e == i5 || (z2 && fullSpanItem.f5847g))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public FullSpanItem m6039f(int i3) {
            List list = this.f5843b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f5843b.get(size);
                if (fullSpanItem.f5844d == i3) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        int m6040g(int i3) {
            int[] iArr = this.f5842a;
            if (iArr == null || i3 >= iArr.length) {
                return -1;
            }
            return iArr[i3];
        }

        /* JADX INFO: renamed from: h */
        int m6041h(int i3) {
            int[] iArr = this.f5842a;
            if (iArr == null || i3 >= iArr.length) {
                return -1;
            }
            int iM6031i = m6031i(i3);
            if (iM6031i == -1) {
                int[] iArr2 = this.f5842a;
                Arrays.fill(iArr2, i3, iArr2.length, -1);
                return this.f5842a.length;
            }
            int iMin = Math.min(iM6031i + 1, this.f5842a.length);
            Arrays.fill(this.f5842a, i3, iMin, -1);
            return iMin;
        }

        /* JADX INFO: renamed from: j */
        void m6042j(int i3, int i4) {
            int[] iArr = this.f5842a;
            if (iArr == null || i3 >= iArr.length) {
                return;
            }
            int i5 = i3 + i4;
            m6036c(i5);
            int[] iArr2 = this.f5842a;
            System.arraycopy(iArr2, i3, iArr2, i5, (iArr2.length - i3) - i4);
            Arrays.fill(this.f5842a, i3, i5, -1);
            m6032l(i3, i4);
        }

        /* JADX INFO: renamed from: k */
        void m6043k(int i3, int i4) {
            int[] iArr = this.f5842a;
            if (iArr == null || i3 >= iArr.length) {
                return;
            }
            int i5 = i3 + i4;
            m6036c(i5);
            int[] iArr2 = this.f5842a;
            System.arraycopy(iArr2, i5, iArr2, i3, (iArr2.length - i3) - i4);
            int[] iArr3 = this.f5842a;
            Arrays.fill(iArr3, iArr3.length - i4, iArr3.length, -1);
            m6033m(i3, i4);
        }

        /* JADX INFO: renamed from: n */
        void m6044n(int i3, C1221d c1221d) {
            m6036c(i3);
            this.f5842a[i3] = c1221d.f5872e;
        }

        /* JADX INFO: renamed from: o */
        int m6045o(int i3) {
            int length = this.f5842a.length;
            while (length <= i3) {
                length *= 2;
            }
            return length;
        }

        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C1216a();

            /* JADX INFO: renamed from: d */
            int f5844d;

            /* JADX INFO: renamed from: e */
            int f5845e;

            /* JADX INFO: renamed from: f */
            int[] f5846f;

            /* JADX INFO: renamed from: g */
            boolean f5847g;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            class C1216a implements Parcelable.Creator {
                C1216a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i3) {
                    return new FullSpanItem[i3];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f5844d = parcel.readInt();
                this.f5845e = parcel.readInt();
                this.f5847g = parcel.readInt() == 1;
                int i3 = parcel.readInt();
                if (i3 > 0) {
                    int[] iArr = new int[i3];
                    this.f5846f = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* JADX INFO: renamed from: a */
            int m6046a(int i3) {
                int[] iArr = this.f5846f;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i3];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f5844d + ", mGapDir=" + this.f5845e + ", mHasUnwantedGapAfter=" + this.f5847g + ", mGapPerSpan=" + Arrays.toString(this.f5846f) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i3) {
                parcel.writeInt(this.f5844d);
                parcel.writeInt(this.f5845e);
                parcel.writeInt(this.f5847g ? 1 : 0);
                int[] iArr = this.f5846f;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f5846f);
                }
            }

            FullSpanItem() {
            }
        }
    }
}
