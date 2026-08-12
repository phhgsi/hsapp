package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC1205p implements RecyclerView.AbstractC1214y.b {

    /* JADX INFO: renamed from: A */
    int f5566A;

    /* JADX INFO: renamed from: B */
    int f5567B;

    /* JADX INFO: renamed from: C */
    private boolean f5568C;

    /* JADX INFO: renamed from: D */
    SavedState f5569D;

    /* JADX INFO: renamed from: E */
    final C1183a f5570E;

    /* JADX INFO: renamed from: F */
    private final C1184b f5571F;

    /* JADX INFO: renamed from: G */
    private int f5572G;

    /* JADX INFO: renamed from: H */
    private int[] f5573H;

    /* JADX INFO: renamed from: s */
    int f5574s;

    /* JADX INFO: renamed from: t */
    private C1185c f5575t;

    /* JADX INFO: renamed from: u */
    AbstractC1230i f5576u;

    /* JADX INFO: renamed from: v */
    private boolean f5577v;

    /* JADX INFO: renamed from: w */
    private boolean f5578w;

    /* JADX INFO: renamed from: x */
    boolean f5579x;

    /* JADX INFO: renamed from: y */
    private boolean f5580y;

    /* JADX INFO: renamed from: z */
    private boolean f5581z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1182a();

        /* JADX INFO: renamed from: d */
        int f5582d;

        /* JADX INFO: renamed from: e */
        int f5583e;

        /* JADX INFO: renamed from: f */
        boolean f5584f;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        class C1182a implements Parcelable.Creator {
            C1182a() {
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
        boolean m5498a() {
            return this.f5582d >= 0;
        }

        /* JADX INFO: renamed from: d */
        void m5499d() {
            this.f5582d = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeInt(this.f5582d);
            parcel.writeInt(this.f5583e);
            parcel.writeInt(this.f5584f ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f5582d = parcel.readInt();
            this.f5583e = parcel.readInt();
            this.f5584f = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f5582d = savedState.f5582d;
            this.f5583e = savedState.f5583e;
            this.f5584f = savedState.f5584f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C1183a {

        /* JADX INFO: renamed from: a */
        AbstractC1230i f5585a;

        /* JADX INFO: renamed from: b */
        int f5586b;

        /* JADX INFO: renamed from: c */
        int f5587c;

        /* JADX INFO: renamed from: d */
        boolean f5588d;

        /* JADX INFO: renamed from: e */
        boolean f5589e;

        C1183a() {
            m5506e();
        }

        /* JADX INFO: renamed from: a */
        void m5502a() {
            this.f5587c = this.f5588d ? this.f5585a.mo6209i() : this.f5585a.mo6213m();
        }

        /* JADX INFO: renamed from: b */
        public void m5503b(View view, int i3) {
            if (this.f5588d) {
                this.f5587c = this.f5585a.mo6204d(view) + this.f5585a.m6215o();
            } else {
                this.f5587c = this.f5585a.mo6207g(view);
            }
            this.f5586b = i3;
        }

        /* JADX INFO: renamed from: c */
        public void m5504c(View view, int i3) {
            int iM6215o = this.f5585a.m6215o();
            if (iM6215o >= 0) {
                m5503b(view, i3);
                return;
            }
            this.f5586b = i3;
            if (this.f5588d) {
                int iMo6209i = (this.f5585a.mo6209i() - iM6215o) - this.f5585a.mo6204d(view);
                this.f5587c = this.f5585a.mo6209i() - iMo6209i;
                if (iMo6209i > 0) {
                    int iMo6205e = this.f5587c - this.f5585a.mo6205e(view);
                    int iMo6213m = this.f5585a.mo6213m();
                    int iMin = iMo6205e - (iMo6213m + Math.min(this.f5585a.mo6207g(view) - iMo6213m, 0));
                    if (iMin < 0) {
                        this.f5587c += Math.min(iMo6209i, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo6207g = this.f5585a.mo6207g(view);
            int iMo6213m2 = iMo6207g - this.f5585a.mo6213m();
            this.f5587c = iMo6207g;
            if (iMo6213m2 > 0) {
                int iMo6209i2 = (this.f5585a.mo6209i() - Math.min(0, (this.f5585a.mo6209i() - iM6215o) - this.f5585a.mo6204d(view))) - (iMo6207g + this.f5585a.mo6205e(view));
                if (iMo6209i2 < 0) {
                    this.f5587c -= Math.min(iMo6213m2, -iMo6209i2);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        boolean m5505d(View view, RecyclerView.C1215z c1215z) {
            RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
            return !c1206q.m5883c() && c1206q.m5881a() >= 0 && c1206q.m5881a() < c1215z.m5967b();
        }

        /* JADX INFO: renamed from: e */
        void m5506e() {
            this.f5586b = -1;
            this.f5587c = Integer.MIN_VALUE;
            this.f5588d = false;
            this.f5589e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f5586b + ", mCoordinate=" + this.f5587c + ", mLayoutFromEnd=" + this.f5588d + ", mValid=" + this.f5589e + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C1184b {

        /* JADX INFO: renamed from: a */
        public int f5590a;

        /* JADX INFO: renamed from: b */
        public boolean f5591b;

        /* JADX INFO: renamed from: c */
        public boolean f5592c;

        /* JADX INFO: renamed from: d */
        public boolean f5593d;

        protected C1184b() {
        }

        /* JADX INFO: renamed from: a */
        void m5507a() {
            this.f5590a = 0;
            this.f5591b = false;
            this.f5592c = false;
            this.f5593d = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C1185c {

        /* JADX INFO: renamed from: b */
        int f5595b;

        /* JADX INFO: renamed from: c */
        int f5596c;

        /* JADX INFO: renamed from: d */
        int f5597d;

        /* JADX INFO: renamed from: e */
        int f5598e;

        /* JADX INFO: renamed from: f */
        int f5599f;

        /* JADX INFO: renamed from: g */
        int f5600g;

        /* JADX INFO: renamed from: k */
        int f5604k;

        /* JADX INFO: renamed from: m */
        boolean f5606m;

        /* JADX INFO: renamed from: a */
        boolean f5594a = true;

        /* JADX INFO: renamed from: h */
        int f5601h = 0;

        /* JADX INFO: renamed from: i */
        int f5602i = 0;

        /* JADX INFO: renamed from: j */
        boolean f5603j = false;

        /* JADX INFO: renamed from: l */
        List f5605l = null;

        C1185c() {
        }

        /* JADX INFO: renamed from: e */
        private View m5508e() {
            int size = this.f5605l.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = ((RecyclerView.AbstractC1188C) this.f5605l.get(i3)).f5699a;
                RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
                if (!c1206q.m5883c() && this.f5597d == c1206q.m5881a()) {
                    m5510b(view);
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public void m5509a() {
            m5510b(null);
        }

        /* JADX INFO: renamed from: b */
        public void m5510b(View view) {
            View viewM5513f = m5513f(view);
            if (viewM5513f == null) {
                this.f5597d = -1;
            } else {
                this.f5597d = ((RecyclerView.C1206q) viewM5513f.getLayoutParams()).m5881a();
            }
        }

        /* JADX INFO: renamed from: c */
        boolean m5511c(RecyclerView.C1215z c1215z) {
            int i3 = this.f5597d;
            return i3 >= 0 && i3 < c1215z.m5967b();
        }

        /* JADX INFO: renamed from: d */
        View m5512d(RecyclerView.C1211v c1211v) {
            if (this.f5605l != null) {
                return m5508e();
            }
            View viewM5932o = c1211v.m5932o(this.f5597d);
            this.f5597d += this.f5598e;
            return viewM5932o;
        }

        /* JADX INFO: renamed from: f */
        public View m5513f(View view) {
            int iM5881a;
            int size = this.f5605l.size();
            View view2 = null;
            int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i4 = 0; i4 < size; i4++) {
                View view3 = ((RecyclerView.AbstractC1188C) this.f5605l.get(i4)).f5699a;
                RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view3.getLayoutParams();
                if (view3 != view && !c1206q.m5883c() && (iM5881a = (c1206q.m5881a() - this.f5597d) * this.f5598e) >= 0 && iM5881a < i3) {
                    if (iM5881a == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i3 = iM5881a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context, int i3, boolean z2) {
        this.f5574s = 1;
        this.f5578w = false;
        this.f5579x = false;
        this.f5580y = false;
        this.f5581z = true;
        this.f5566A = -1;
        this.f5567B = Integer.MIN_VALUE;
        this.f5569D = null;
        this.f5570E = new C1183a();
        this.f5571F = new C1184b();
        this.f5572G = 2;
        this.f5573H = new int[2];
        m5464C2(i3);
        m5465D2(z2);
    }

    /* JADX INFO: renamed from: A2 */
    private void m5437A2() {
        if (this.f5574s == 1 || !m5490q2()) {
            this.f5579x = this.f5578w;
        } else {
            this.f5579x = !this.f5578w;
        }
    }

    /* JADX INFO: renamed from: F2 */
    private boolean m5438F2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, C1183a c1183a) {
        View viewMo5419j2;
        boolean z2 = false;
        if (m5809O() == 0) {
            return false;
        }
        View viewM5825a0 = m5825a0();
        if (viewM5825a0 != null && c1183a.m5505d(viewM5825a0, c1215z)) {
            c1183a.m5504c(viewM5825a0, m5847l0(viewM5825a0));
            return true;
        }
        boolean z3 = this.f5577v;
        boolean z4 = this.f5580y;
        if (z3 != z4 || (viewMo5419j2 = mo5419j2(c1211v, c1215z, c1183a.f5588d, z4)) == null) {
            return false;
        }
        c1183a.m5503b(viewMo5419j2, m5847l0(viewMo5419j2));
        if (!c1215z.m5970e() && mo5406P1()) {
            int iMo6207g = this.f5576u.mo6207g(viewMo5419j2);
            int iMo6204d = this.f5576u.mo6204d(viewMo5419j2);
            int iMo6213m = this.f5576u.mo6213m();
            int iMo6209i = this.f5576u.mo6209i();
            boolean z5 = iMo6204d <= iMo6213m && iMo6207g < iMo6213m;
            if (iMo6207g >= iMo6209i && iMo6204d > iMo6209i) {
                z2 = true;
            }
            if (z5 || z2) {
                if (c1183a.f5588d) {
                    iMo6213m = iMo6209i;
                }
                c1183a.f5587c = iMo6213m;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: G2 */
    private boolean m5439G2(RecyclerView.C1215z c1215z, C1183a c1183a) {
        int i3;
        if (!c1215z.m5970e() && (i3 = this.f5566A) != -1) {
            if (i3 >= 0 && i3 < c1215z.m5967b()) {
                c1183a.f5586b = this.f5566A;
                SavedState savedState = this.f5569D;
                if (savedState != null && savedState.m5498a()) {
                    boolean z2 = this.f5569D.f5584f;
                    c1183a.f5588d = z2;
                    if (z2) {
                        c1183a.f5587c = this.f5576u.mo6209i() - this.f5569D.f5583e;
                    } else {
                        c1183a.f5587c = this.f5576u.mo6213m() + this.f5569D.f5583e;
                    }
                    return true;
                }
                if (this.f5567B != Integer.MIN_VALUE) {
                    boolean z3 = this.f5579x;
                    c1183a.f5588d = z3;
                    if (z3) {
                        c1183a.f5587c = this.f5576u.mo6209i() - this.f5567B;
                    } else {
                        c1183a.f5587c = this.f5576u.mo6213m() + this.f5567B;
                    }
                    return true;
                }
                View viewMo5466H = mo5466H(this.f5566A);
                if (viewMo5466H == null) {
                    if (m5809O() > 0) {
                        c1183a.f5588d = (this.f5566A < m5847l0(m5807N(0))) == this.f5579x;
                    }
                    c1183a.m5502a();
                } else {
                    if (this.f5576u.mo6205e(viewMo5466H) > this.f5576u.mo6214n()) {
                        c1183a.m5502a();
                        return true;
                    }
                    if (this.f5576u.mo6207g(viewMo5466H) - this.f5576u.mo6213m() < 0) {
                        c1183a.f5587c = this.f5576u.mo6213m();
                        c1183a.f5588d = false;
                        return true;
                    }
                    if (this.f5576u.mo6209i() - this.f5576u.mo6204d(viewMo5466H) < 0) {
                        c1183a.f5587c = this.f5576u.mo6209i();
                        c1183a.f5588d = true;
                        return true;
                    }
                    c1183a.f5587c = c1183a.f5588d ? this.f5576u.mo6204d(viewMo5466H) + this.f5576u.m6215o() : this.f5576u.mo6207g(viewMo5466H);
                }
                return true;
            }
            this.f5566A = -1;
            this.f5567B = Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: H2 */
    private void m5440H2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, C1183a c1183a) {
        if (m5439G2(c1215z, c1183a) || m5438F2(c1211v, c1215z, c1183a)) {
            return;
        }
        c1183a.m5502a();
        c1183a.f5586b = this.f5580y ? c1215z.m5967b() - 1 : 0;
    }

    /* JADX INFO: renamed from: I2 */
    private void m5441I2(int i3, int i4, boolean z2, RecyclerView.C1215z c1215z) {
        int iMo6213m;
        this.f5575t.f5606m = m5497z2();
        this.f5575t.f5599f = i3;
        int[] iArr = this.f5573H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo5471Q1(c1215z, iArr);
        int iMax = Math.max(0, this.f5573H[0]);
        int iMax2 = Math.max(0, this.f5573H[1]);
        boolean z3 = i3 == 1;
        C1185c c1185c = this.f5575t;
        int i5 = z3 ? iMax2 : iMax;
        c1185c.f5601h = i5;
        if (!z3) {
            iMax = iMax2;
        }
        c1185c.f5602i = iMax;
        if (z3) {
            c1185c.f5601h = i5 + this.f5576u.mo6210j();
            View viewM5455m2 = m5455m2();
            C1185c c1185c2 = this.f5575t;
            c1185c2.f5598e = this.f5579x ? -1 : 1;
            int iM5847l0 = m5847l0(viewM5455m2);
            C1185c c1185c3 = this.f5575t;
            c1185c2.f5597d = iM5847l0 + c1185c3.f5598e;
            c1185c3.f5595b = this.f5576u.mo6204d(viewM5455m2);
            iMo6213m = this.f5576u.mo6204d(viewM5455m2) - this.f5576u.mo6209i();
        } else {
            View viewM5456n2 = m5456n2();
            this.f5575t.f5601h += this.f5576u.mo6213m();
            C1185c c1185c4 = this.f5575t;
            c1185c4.f5598e = this.f5579x ? 1 : -1;
            int iM5847l02 = m5847l0(viewM5456n2);
            C1185c c1185c5 = this.f5575t;
            c1185c4.f5597d = iM5847l02 + c1185c5.f5598e;
            c1185c5.f5595b = this.f5576u.mo6207g(viewM5456n2);
            iMo6213m = (-this.f5576u.mo6207g(viewM5456n2)) + this.f5576u.mo6213m();
        }
        C1185c c1185c6 = this.f5575t;
        c1185c6.f5596c = i4;
        if (z2) {
            c1185c6.f5596c = i4 - iMo6213m;
        }
        c1185c6.f5600g = iMo6213m;
    }

    /* JADX INFO: renamed from: J2 */
    private void m5442J2(int i3, int i4) {
        this.f5575t.f5596c = this.f5576u.mo6209i() - i4;
        C1185c c1185c = this.f5575t;
        c1185c.f5598e = this.f5579x ? -1 : 1;
        c1185c.f5597d = i3;
        c1185c.f5599f = 1;
        c1185c.f5595b = i4;
        c1185c.f5600g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: K2 */
    private void m5443K2(C1183a c1183a) {
        m5442J2(c1183a.f5586b, c1183a.f5587c);
    }

    /* JADX INFO: renamed from: L2 */
    private void m5444L2(int i3, int i4) {
        this.f5575t.f5596c = i4 - this.f5576u.mo6213m();
        C1185c c1185c = this.f5575t;
        c1185c.f5597d = i3;
        c1185c.f5598e = this.f5579x ? 1 : -1;
        c1185c.f5599f = -1;
        c1185c.f5595b = i4;
        c1185c.f5600g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: M2 */
    private void m5445M2(C1183a c1183a) {
        m5444L2(c1183a.f5586b, c1183a.f5587c);
    }

    /* JADX INFO: renamed from: S1 */
    private int m5446S1(RecyclerView.C1215z c1215z) {
        if (m5809O() == 0) {
            return 0;
        }
        m5474X1();
        return AbstractC1233l.m6235a(c1215z, this.f5576u, m5477b2(!this.f5581z, true), m5476a2(!this.f5581z, true), this, this.f5581z);
    }

    /* JADX INFO: renamed from: T1 */
    private int m5447T1(RecyclerView.C1215z c1215z) {
        if (m5809O() == 0) {
            return 0;
        }
        m5474X1();
        return AbstractC1233l.m6236b(c1215z, this.f5576u, m5477b2(!this.f5581z, true), m5476a2(!this.f5581z, true), this, this.f5581z, this.f5579x);
    }

    /* JADX INFO: renamed from: U1 */
    private int m5448U1(RecyclerView.C1215z c1215z) {
        if (m5809O() == 0) {
            return 0;
        }
        m5474X1();
        return AbstractC1233l.m6237c(c1215z, this.f5576u, m5477b2(!this.f5581z, true), m5476a2(!this.f5581z, true), this, this.f5581z);
    }

    /* JADX INFO: renamed from: Z1 */
    private View m5449Z1() {
        return m5481f2(0, m5809O());
    }

    /* JADX INFO: renamed from: d2 */
    private View m5450d2() {
        return m5481f2(m5809O() - 1, -1);
    }

    /* JADX INFO: renamed from: h2 */
    private View m5451h2() {
        return this.f5579x ? m5449Z1() : m5450d2();
    }

    /* JADX INFO: renamed from: i2 */
    private View m5452i2() {
        return this.f5579x ? m5450d2() : m5449Z1();
    }

    /* JADX INFO: renamed from: k2 */
    private int m5453k2(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, boolean z2) {
        int iMo6209i;
        int iMo6209i2 = this.f5576u.mo6209i() - i3;
        if (iMo6209i2 <= 0) {
            return 0;
        }
        int i4 = -m5463B2(-iMo6209i2, c1211v, c1215z);
        int i5 = i3 + i4;
        if (!z2 || (iMo6209i = this.f5576u.mo6209i() - i5) <= 0) {
            return i4;
        }
        this.f5576u.mo6218r(iMo6209i);
        return iMo6209i + i4;
    }

    /* JADX INFO: renamed from: l2 */
    private int m5454l2(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, boolean z2) {
        int iMo6213m;
        int iMo6213m2 = i3 - this.f5576u.mo6213m();
        if (iMo6213m2 <= 0) {
            return 0;
        }
        int i4 = -m5463B2(iMo6213m2, c1211v, c1215z);
        int i5 = i3 + i4;
        if (!z2 || (iMo6213m = i5 - this.f5576u.mo6213m()) <= 0) {
            return i4;
        }
        this.f5576u.mo6218r(-iMo6213m);
        return i4 - iMo6213m;
    }

    /* JADX INFO: renamed from: m2 */
    private View m5455m2() {
        return m5807N(this.f5579x ? 0 : m5809O() - 1);
    }

    /* JADX INFO: renamed from: n2 */
    private View m5456n2() {
        return m5807N(this.f5579x ? m5809O() - 1 : 0);
    }

    /* JADX INFO: renamed from: t2 */
    private void m5457t2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, int i3, int i4) {
        if (!c1215z.m5972g() || m5809O() == 0 || c1215z.m5970e() || !mo5406P1()) {
            return;
        }
        List listM5928k = c1211v.m5928k();
        int size = listM5928k.size();
        int iM5847l0 = m5847l0(m5807N(0));
        int iMo6205e = 0;
        int iMo6205e2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.AbstractC1188C abstractC1188C = (RecyclerView.AbstractC1188C) listM5928k.get(i5);
            if (!abstractC1188C.m5679v()) {
                if ((abstractC1188C.m5670m() < iM5847l0) != this.f5579x) {
                    iMo6205e += this.f5576u.mo6205e(abstractC1188C.f5699a);
                } else {
                    iMo6205e2 += this.f5576u.mo6205e(abstractC1188C.f5699a);
                }
            }
        }
        this.f5575t.f5605l = listM5928k;
        if (iMo6205e > 0) {
            m5444L2(m5847l0(m5456n2()), i3);
            C1185c c1185c = this.f5575t;
            c1185c.f5601h = iMo6205e;
            c1185c.f5596c = 0;
            c1185c.m5509a();
            m5475Y1(c1211v, this.f5575t, c1215z, false);
        }
        if (iMo6205e2 > 0) {
            m5442J2(m5847l0(m5455m2()), i4);
            C1185c c1185c2 = this.f5575t;
            c1185c2.f5601h = iMo6205e2;
            c1185c2.f5596c = 0;
            c1185c2.m5509a();
            m5475Y1(c1211v, this.f5575t, c1215z, false);
        }
        this.f5575t.f5605l = null;
    }

    /* JADX INFO: renamed from: v2 */
    private void m5458v2(RecyclerView.C1211v c1211v, C1185c c1185c) {
        if (!c1185c.f5594a || c1185c.f5606m) {
            return;
        }
        int i3 = c1185c.f5600g;
        int i4 = c1185c.f5602i;
        if (c1185c.f5599f == -1) {
            m5460x2(c1211v, i3, i4);
        } else {
            m5461y2(c1211v, i3, i4);
        }
    }

    /* JADX INFO: renamed from: w2 */
    private void m5459w2(RecyclerView.C1211v c1211v, int i3, int i4) {
        if (i3 == i4) {
            return;
        }
        if (i4 <= i3) {
            while (i3 > i4) {
                m5861r1(i3, c1211v);
                i3--;
            }
        } else {
            for (int i5 = i4 - 1; i5 >= i3; i5--) {
                m5861r1(i5, c1211v);
            }
        }
    }

    /* JADX INFO: renamed from: x2 */
    private void m5460x2(RecyclerView.C1211v c1211v, int i3, int i4) {
        int iM5809O = m5809O();
        if (i3 < 0) {
            return;
        }
        int iMo6208h = (this.f5576u.mo6208h() - i3) + i4;
        if (this.f5579x) {
            for (int i5 = 0; i5 < iM5809O; i5++) {
                View viewM5807N = m5807N(i5);
                if (this.f5576u.mo6207g(viewM5807N) < iMo6208h || this.f5576u.mo6217q(viewM5807N) < iMo6208h) {
                    m5459w2(c1211v, 0, i5);
                    return;
                }
            }
            return;
        }
        int i6 = iM5809O - 1;
        for (int i7 = i6; i7 >= 0; i7--) {
            View viewM5807N2 = m5807N(i7);
            if (this.f5576u.mo6207g(viewM5807N2) < iMo6208h || this.f5576u.mo6217q(viewM5807N2) < iMo6208h) {
                m5459w2(c1211v, i6, i7);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: y2 */
    private void m5461y2(RecyclerView.C1211v c1211v, int i3, int i4) {
        if (i3 < 0) {
            return;
        }
        int i5 = i3 - i4;
        int iM5809O = m5809O();
        if (!this.f5579x) {
            for (int i6 = 0; i6 < iM5809O; i6++) {
                View viewM5807N = m5807N(i6);
                if (this.f5576u.mo6204d(viewM5807N) > i5 || this.f5576u.mo6216p(viewM5807N) > i5) {
                    m5459w2(c1211v, 0, i6);
                    return;
                }
            }
            return;
        }
        int i7 = iM5809O - 1;
        for (int i8 = i7; i8 >= 0; i8--) {
            View viewM5807N2 = m5807N(i8);
            if (this.f5576u.mo6204d(viewM5807N2) > i5 || this.f5576u.mo6216p(viewM5807N2) > i5) {
                m5459w2(c1211v, i7, i8);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: A */
    public int mo5397A(RecyclerView.C1215z c1215z) {
        return m5448U1(c1215z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: A1 */
    public int mo5398A1(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        if (this.f5574s == 1) {
            return 0;
        }
        return m5463B2(i3, c1211v, c1215z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: B1 */
    public void mo5462B1(int i3) {
        this.f5566A = i3;
        this.f5567B = Integer.MIN_VALUE;
        SavedState savedState = this.f5569D;
        if (savedState != null) {
            savedState.m5499d();
        }
        m5871x1();
    }

    /* JADX INFO: renamed from: B2 */
    int m5463B2(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        if (m5809O() == 0 || i3 == 0) {
            return 0;
        }
        m5474X1();
        this.f5575t.f5594a = true;
        int i4 = i3 > 0 ? 1 : -1;
        int iAbs = Math.abs(i3);
        m5441I2(i4, iAbs, true, c1215z);
        C1185c c1185c = this.f5575t;
        int iM5475Y1 = c1185c.f5600g + m5475Y1(c1211v, c1185c, c1215z, false);
        if (iM5475Y1 < 0) {
            return 0;
        }
        if (iAbs > iM5475Y1) {
            i3 = i4 * iM5475Y1;
        }
        this.f5576u.mo6218r(-i3);
        this.f5575t.f5604k = i3;
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: C1 */
    public int mo5399C1(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        if (this.f5574s == 0) {
            return 0;
        }
        return m5463B2(i3, c1211v, c1215z);
    }

    /* JADX INFO: renamed from: C2 */
    public void m5464C2(int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i3);
        }
        mo5485l(null);
        if (i3 != this.f5574s || this.f5576u == null) {
            AbstractC1230i abstractC1230iM6202b = AbstractC1230i.m6202b(this, i3);
            this.f5576u = abstractC1230iM6202b;
            this.f5570E.f5585a = abstractC1230iM6202b;
            this.f5574s = i3;
            m5871x1();
        }
    }

    /* JADX INFO: renamed from: D2 */
    public void m5465D2(boolean z2) {
        mo5485l(null);
        if (z2 == this.f5578w) {
            return;
        }
        this.f5578w = z2;
        m5871x1();
    }

    /* JADX INFO: renamed from: E2 */
    public void mo5400E2(boolean z2) {
        mo5485l(null);
        if (this.f5580y == z2) {
            return;
        }
        this.f5580y = z2;
        m5871x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: H */
    public View mo5466H(int i3) {
        int iM5809O = m5809O();
        if (iM5809O == 0) {
            return null;
        }
        int iM5847l0 = i3 - m5847l0(m5807N(0));
        if (iM5847l0 >= 0 && iM5847l0 < iM5809O) {
            View viewM5807N = m5807N(iM5847l0);
            if (m5847l0(viewM5807N) == i3) {
                return viewM5807N;
            }
        }
        return super.mo5466H(i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: I */
    public RecyclerView.C1206q mo5402I() {
        return new RecyclerView.C1206q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: K1 */
    boolean mo5467K1() {
        return (m5827c0() == 1073741824 || m5864t0() == 1073741824 || !m5866u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: M0 */
    public void mo5468M0(RecyclerView recyclerView, RecyclerView.C1211v c1211v) {
        super.mo5468M0(recyclerView, c1211v);
        if (this.f5568C) {
            m5855o1(c1211v);
            c1211v.m5920c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: M1 */
    public void mo5469M1(RecyclerView recyclerView, RecyclerView.C1215z c1215z, int i3) {
        C1228g c1228g = new C1228g(recyclerView.getContext());
        c1228g.m5958p(i3);
        m5808N1(c1228g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: N0 */
    public View mo5405N0(View view, int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        int iM5472V1;
        m5437A2();
        if (m5809O() == 0 || (iM5472V1 = m5472V1(i3)) == Integer.MIN_VALUE) {
            return null;
        }
        m5474X1();
        m5441I2(iM5472V1, (int) (this.f5576u.mo6214n() * 0.33333334f), false, c1215z);
        C1185c c1185c = this.f5575t;
        c1185c.f5600g = Integer.MIN_VALUE;
        c1185c.f5594a = false;
        m5475Y1(c1211v, c1185c, c1215z, true);
        View viewM5452i2 = iM5472V1 == -1 ? m5452i2() : m5451h2();
        View viewM5456n2 = iM5472V1 == -1 ? m5456n2() : m5455m2();
        if (!viewM5456n2.hasFocusable()) {
            return viewM5452i2;
        }
        if (viewM5452i2 == null) {
            return null;
        }
        return viewM5456n2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: O0 */
    public void mo5470O0(AccessibilityEvent accessibilityEvent) {
        super.mo5470O0(accessibilityEvent);
        if (m5809O() > 0) {
            accessibilityEvent.setFromIndex(m5478c2());
            accessibilityEvent.setToIndex(m5480e2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: P1 */
    public boolean mo5406P1() {
        return this.f5569D == null && this.f5577v == this.f5580y;
    }

    /* JADX INFO: renamed from: Q1 */
    protected void mo5471Q1(RecyclerView.C1215z c1215z, int[] iArr) {
        int i3;
        int iM5486o2 = m5486o2(c1215z);
        if (this.f5575t.f5599f == -1) {
            i3 = 0;
        } else {
            i3 = iM5486o2;
            iM5486o2 = 0;
        }
        iArr[0] = iM5486o2;
        iArr[1] = i3;
    }

    /* JADX INFO: renamed from: R1 */
    void mo5407R1(RecyclerView.C1215z c1215z, C1185c c1185c, RecyclerView.AbstractC1205p.c cVar) {
        int i3 = c1185c.f5597d;
        if (i3 < 0 || i3 >= c1215z.m5967b()) {
            return;
        }
        cVar.mo5880a(i3, Math.max(0, c1185c.f5600g));
    }

    /* JADX INFO: renamed from: V1 */
    int m5472V1(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 17 ? i3 != 33 ? i3 != 66 ? (i3 == 130 && this.f5574s == 1) ? 1 : Integer.MIN_VALUE : this.f5574s == 0 ? 1 : Integer.MIN_VALUE : this.f5574s == 1 ? -1 : Integer.MIN_VALUE : this.f5574s == 0 ? -1 : Integer.MIN_VALUE : (this.f5574s != 1 && m5490q2()) ? -1 : 1 : (this.f5574s != 1 && m5490q2()) ? 1 : -1;
    }

    /* JADX INFO: renamed from: W1 */
    C1185c m5473W1() {
        return new C1185c();
    }

    /* JADX INFO: renamed from: X1 */
    void m5474X1() {
        if (this.f5575t == null) {
            this.f5575t = m5473W1();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    int m5475Y1(RecyclerView.C1211v c1211v, C1185c c1185c, RecyclerView.C1215z c1215z, boolean z2) {
        int i3 = c1185c.f5596c;
        int i4 = c1185c.f5600g;
        if (i4 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                c1185c.f5600g = i4 + i3;
            }
            m5458v2(c1211v, c1185c);
        }
        int i5 = c1185c.f5596c + c1185c.f5601h;
        C1184b c1184b = this.f5571F;
        while (true) {
            if ((!c1185c.f5606m && i5 <= 0) || !c1185c.m5511c(c1215z)) {
                break;
            }
            c1184b.m5507a();
            mo5422s2(c1211v, c1215z, c1185c, c1184b);
            if (!c1184b.f5591b) {
                c1185c.f5595b += c1184b.f5590a * c1185c.f5599f;
                if (!c1184b.f5592c || c1185c.f5605l != null || !c1215z.m5970e()) {
                    int i6 = c1185c.f5596c;
                    int i7 = c1184b.f5590a;
                    c1185c.f5596c = i6 - i7;
                    i5 -= i7;
                }
                int i8 = c1185c.f5600g;
                if (i8 != Integer.MIN_VALUE) {
                    int i9 = i8 + c1184b.f5590a;
                    c1185c.f5600g = i9;
                    int i10 = c1185c.f5596c;
                    if (i10 < 0) {
                        c1185c.f5600g = i9 + i10;
                    }
                    m5458v2(c1211v, c1185c);
                }
                if (z2 && c1184b.f5593d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - c1185c.f5596c;
    }

    /* JADX INFO: renamed from: a2 */
    View m5476a2(boolean z2, boolean z3) {
        return this.f5579x ? m5483g2(0, m5809O(), z2, z3) : m5483g2(m5809O() - 1, -1, z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: b1 */
    public void mo5416b1(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iM5453k2;
        int i7;
        View viewMo5466H;
        int iMo6207g;
        int iMo6209i;
        int i8 = -1;
        if (!(this.f5569D == null && this.f5566A == -1) && c1215z.m5967b() == 0) {
            m5855o1(c1211v);
            return;
        }
        SavedState savedState = this.f5569D;
        if (savedState != null && savedState.m5498a()) {
            this.f5566A = this.f5569D.f5582d;
        }
        m5474X1();
        this.f5575t.f5594a = false;
        m5437A2();
        View viewM5825a0 = m5825a0();
        C1183a c1183a = this.f5570E;
        if (!c1183a.f5589e || this.f5566A != -1 || this.f5569D != null) {
            c1183a.m5506e();
            C1183a c1183a2 = this.f5570E;
            c1183a2.f5588d = this.f5579x ^ this.f5580y;
            m5440H2(c1211v, c1215z, c1183a2);
            this.f5570E.f5589e = true;
        } else if (viewM5825a0 != null && (this.f5576u.mo6207g(viewM5825a0) >= this.f5576u.mo6209i() || this.f5576u.mo6204d(viewM5825a0) <= this.f5576u.mo6213m())) {
            this.f5570E.m5504c(viewM5825a0, m5847l0(viewM5825a0));
        }
        C1185c c1185c = this.f5575t;
        c1185c.f5599f = c1185c.f5604k >= 0 ? 1 : -1;
        int[] iArr = this.f5573H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo5471Q1(c1215z, iArr);
        int iMax = Math.max(0, this.f5573H[0]) + this.f5576u.mo6213m();
        int iMax2 = Math.max(0, this.f5573H[1]) + this.f5576u.mo6210j();
        if (c1215z.m5970e() && (i7 = this.f5566A) != -1 && this.f5567B != Integer.MIN_VALUE && (viewMo5466H = mo5466H(i7)) != null) {
            if (this.f5579x) {
                iMo6209i = this.f5576u.mo6209i() - this.f5576u.mo6204d(viewMo5466H);
                iMo6207g = this.f5567B;
            } else {
                iMo6207g = this.f5576u.mo6207g(viewMo5466H) - this.f5576u.mo6213m();
                iMo6209i = this.f5567B;
            }
            int i9 = iMo6209i - iMo6207g;
            if (i9 > 0) {
                iMax += i9;
            } else {
                iMax2 -= i9;
            }
        }
        C1183a c1183a3 = this.f5570E;
        if (!c1183a3.f5588d ? !this.f5579x : this.f5579x) {
            i8 = 1;
        }
        mo5423u2(c1211v, c1215z, c1183a3, i8);
        m5782B(c1211v);
        this.f5575t.f5606m = m5497z2();
        this.f5575t.f5603j = c1215z.m5970e();
        this.f5575t.f5602i = 0;
        C1183a c1183a4 = this.f5570E;
        if (c1183a4.f5588d) {
            m5445M2(c1183a4);
            C1185c c1185c2 = this.f5575t;
            c1185c2.f5601h = iMax;
            m5475Y1(c1211v, c1185c2, c1215z, false);
            C1185c c1185c3 = this.f5575t;
            i4 = c1185c3.f5595b;
            int i10 = c1185c3.f5597d;
            int i11 = c1185c3.f5596c;
            if (i11 > 0) {
                iMax2 += i11;
            }
            m5443K2(this.f5570E);
            C1185c c1185c4 = this.f5575t;
            c1185c4.f5601h = iMax2;
            c1185c4.f5597d += c1185c4.f5598e;
            m5475Y1(c1211v, c1185c4, c1215z, false);
            C1185c c1185c5 = this.f5575t;
            i3 = c1185c5.f5595b;
            int i12 = c1185c5.f5596c;
            if (i12 > 0) {
                m5444L2(i10, i4);
                C1185c c1185c6 = this.f5575t;
                c1185c6.f5601h = i12;
                m5475Y1(c1211v, c1185c6, c1215z, false);
                i4 = this.f5575t.f5595b;
            }
        } else {
            m5443K2(c1183a4);
            C1185c c1185c7 = this.f5575t;
            c1185c7.f5601h = iMax2;
            m5475Y1(c1211v, c1185c7, c1215z, false);
            C1185c c1185c8 = this.f5575t;
            i3 = c1185c8.f5595b;
            int i13 = c1185c8.f5597d;
            int i14 = c1185c8.f5596c;
            if (i14 > 0) {
                iMax += i14;
            }
            m5445M2(this.f5570E);
            C1185c c1185c9 = this.f5575t;
            c1185c9.f5601h = iMax;
            c1185c9.f5597d += c1185c9.f5598e;
            m5475Y1(c1211v, c1185c9, c1215z, false);
            C1185c c1185c10 = this.f5575t;
            i4 = c1185c10.f5595b;
            int i15 = c1185c10.f5596c;
            if (i15 > 0) {
                m5442J2(i13, i3);
                C1185c c1185c11 = this.f5575t;
                c1185c11.f5601h = i15;
                m5475Y1(c1211v, c1185c11, c1215z, false);
                i3 = this.f5575t.f5595b;
            }
        }
        if (m5809O() > 0) {
            if (this.f5579x ^ this.f5580y) {
                int iM5453k22 = m5453k2(i3, c1211v, c1215z, true);
                i5 = i4 + iM5453k22;
                i6 = i3 + iM5453k22;
                iM5453k2 = m5454l2(i5, c1211v, c1215z, false);
            } else {
                int iM5454l2 = m5454l2(i4, c1211v, c1215z, true);
                i5 = i4 + iM5454l2;
                i6 = i3 + iM5454l2;
                iM5453k2 = m5453k2(i6, c1211v, c1215z, false);
            }
            i4 = i5 + iM5453k2;
            i3 = i6 + iM5453k2;
        }
        m5457t2(c1211v, c1215z, i4, i3);
        if (c1215z.m5970e()) {
            this.f5570E.m5506e();
        } else {
            this.f5576u.m6219s();
        }
        this.f5577v = this.f5580y;
    }

    /* JADX INFO: renamed from: b2 */
    View m5477b2(boolean z2, boolean z3) {
        return this.f5579x ? m5483g2(m5809O() - 1, -1, z2, z3) : m5483g2(0, m5809O(), z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: c1 */
    public void mo5417c1(RecyclerView.C1215z c1215z) {
        super.mo5417c1(c1215z);
        this.f5569D = null;
        this.f5566A = -1;
        this.f5567B = Integer.MIN_VALUE;
        this.f5570E.m5506e();
    }

    /* JADX INFO: renamed from: c2 */
    public int m5478c2() {
        View viewM5483g2 = m5483g2(0, m5809O(), false, true);
        if (viewM5483g2 == null) {
            return -1;
        }
        return m5847l0(viewM5483g2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1214y.b
    /* JADX INFO: renamed from: d */
    public PointF mo5479d(int i3) {
        if (m5809O() == 0) {
            return null;
        }
        int i4 = (i3 < m5847l0(m5807N(0))) != this.f5579x ? -1 : 1;
        return this.f5574s == 0 ? new PointF(i4, 0.0f) : new PointF(0.0f, i4);
    }

    /* JADX INFO: renamed from: e2 */
    public int m5480e2() {
        View viewM5483g2 = m5483g2(m5809O() - 1, -1, false, true);
        if (viewM5483g2 == null) {
            return -1;
        }
        return m5847l0(viewM5483g2);
    }

    /* JADX INFO: renamed from: f2 */
    View m5481f2(int i3, int i4) {
        int i5;
        int i6;
        m5474X1();
        if (i4 <= i3 && i4 >= i3) {
            return m5807N(i3);
        }
        if (this.f5576u.mo6207g(m5807N(i3)) < this.f5576u.mo6213m()) {
            i5 = 16644;
            i6 = 16388;
        } else {
            i5 = 4161;
            i6 = 4097;
        }
        return this.f5574s == 0 ? this.f5747e.m6259a(i3, i4, i5, i6) : this.f5748f.m6259a(i3, i4, i5, i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: g1 */
    public void mo5482g1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f5569D = savedState;
            if (this.f5566A != -1) {
                savedState.m5499d();
            }
            m5871x1();
        }
    }

    /* JADX INFO: renamed from: g2 */
    View m5483g2(int i3, int i4, boolean z2, boolean z3) {
        m5474X1();
        int i5 = z2 ? 24579 : 320;
        int i6 = z3 ? 320 : 0;
        return this.f5574s == 0 ? this.f5747e.m6259a(i3, i4, i5, i6) : this.f5748f.m6259a(i3, i4, i5, i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: h1 */
    public Parcelable mo5484h1() {
        if (this.f5569D != null) {
            return new SavedState(this.f5569D);
        }
        SavedState savedState = new SavedState();
        if (m5809O() <= 0) {
            savedState.m5499d();
            return savedState;
        }
        m5474X1();
        boolean z2 = this.f5577v ^ this.f5579x;
        savedState.f5584f = z2;
        if (z2) {
            View viewM5455m2 = m5455m2();
            savedState.f5583e = this.f5576u.mo6209i() - this.f5576u.mo6204d(viewM5455m2);
            savedState.f5582d = m5847l0(viewM5455m2);
            return savedState;
        }
        View viewM5456n2 = m5456n2();
        savedState.f5582d = m5847l0(viewM5456n2);
        savedState.f5583e = this.f5576u.mo6207g(viewM5456n2) - this.f5576u.mo6213m();
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX INFO: renamed from: j2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View mo5419j2(androidx.recyclerview.widget.RecyclerView.C1211v r17, androidx.recyclerview.widget.RecyclerView.C1215z r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.m5474X1()
            int r1 = r0.m5809O()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.m5809O()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.m5967b()
            androidx.recyclerview.widget.i r7 = r0.f5576u
            int r7 = r7.mo6213m()
            androidx.recyclerview.widget.i r8 = r0.f5576u
            int r8 = r8.mo6209i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.m5807N(r1)
            int r13 = r0.m5847l0(r12)
            androidx.recyclerview.widget.i r14 = r0.f5576u
            int r14 = r14.mo6207g(r12)
            androidx.recyclerview.widget.i r15 = r0.f5576u
            int r15 = r15.mo6204d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$q r13 = (androidx.recyclerview.widget.RecyclerView.C1206q) r13
            boolean r13 = r13.m5883c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo5419j2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: l */
    public void mo5485l(String str) {
        if (this.f5569D == null) {
            super.mo5485l(str);
        }
    }

    /* JADX INFO: renamed from: o2 */
    protected int m5486o2(RecyclerView.C1215z c1215z) {
        if (c1215z.m5969d()) {
            return this.f5576u.mo6214n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: p */
    public boolean mo5487p() {
        return this.f5574s == 0;
    }

    /* JADX INFO: renamed from: p2 */
    public int m5488p2() {
        return this.f5574s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: q */
    public boolean mo5489q() {
        return this.f5574s == 1;
    }

    /* JADX INFO: renamed from: q2 */
    protected boolean m5490q2() {
        return m5828d0() == 1;
    }

    /* JADX INFO: renamed from: r2 */
    public boolean m5491r2() {
        return this.f5581z;
    }

    /* JADX INFO: renamed from: s2 */
    void mo5422s2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, C1185c c1185c, C1184b c1184b) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iM5840i0;
        int iMo6206f;
        int i7;
        int i8;
        View viewM5512d = c1185c.m5512d(c1211v);
        if (viewM5512d == null) {
            c1184b.f5591b = true;
            return;
        }
        RecyclerView.C1206q c1206q = (RecyclerView.C1206q) viewM5512d.getLayoutParams();
        if (c1185c.f5605l == null) {
            if (this.f5579x == (c1185c.f5599f == -1)) {
                m5839i(viewM5512d);
            } else {
                m5842j(viewM5512d, 0);
            }
        } else {
            if (this.f5579x == (c1185c.f5599f == -1)) {
                m5835g(viewM5512d);
            } else {
                m5837h(viewM5512d, 0);
            }
        }
        mo5789E0(viewM5512d, 0, 0);
        c1184b.f5590a = this.f5576u.mo6205e(viewM5512d);
        if (this.f5574s == 1) {
            if (m5490q2()) {
                iMo6206f = m5862s0() - m5843j0();
                iM5840i0 = iMo6206f - this.f5576u.mo6206f(viewM5512d);
            } else {
                iM5840i0 = m5840i0();
                iMo6206f = this.f5576u.mo6206f(viewM5512d) + iM5840i0;
            }
            if (c1185c.f5599f == -1) {
                i8 = c1185c.f5595b;
                i7 = i8 - c1184b.f5590a;
            } else {
                i7 = c1185c.f5595b;
                i8 = c1184b.f5590a + i7;
            }
            int i9 = iM5840i0;
            i6 = i7;
            i5 = i9;
            i4 = i8;
            i3 = iMo6206f;
        } else {
            int iM5845k0 = m5845k0();
            int iMo6206f2 = this.f5576u.mo6206f(viewM5512d) + iM5845k0;
            if (c1185c.f5599f == -1) {
                int i10 = c1185c.f5595b;
                i5 = i10 - c1184b.f5590a;
                i3 = i10;
                i4 = iMo6206f2;
            } else {
                int i11 = c1185c.f5595b;
                i3 = c1184b.f5590a + i11;
                i4 = iMo6206f2;
                i5 = i11;
            }
            i6 = iM5845k0;
        }
        m5786D0(viewM5512d, i5, i6, i3, i4);
        if (c1206q.m5883c() || c1206q.m5882b()) {
            c1184b.f5592c = true;
        }
        c1184b.f5593d = viewM5512d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: t */
    public void mo5492t(int i3, int i4, RecyclerView.C1215z c1215z, RecyclerView.AbstractC1205p.c cVar) {
        if (this.f5574s != 0) {
            i3 = i4;
        }
        if (m5809O() == 0 || i3 == 0) {
            return;
        }
        m5474X1();
        m5441I2(i3 > 0 ? 1 : -1, Math.abs(i3), true, c1215z);
        mo5407R1(c1215z, this.f5575t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: u */
    public void mo5493u(int i3, RecyclerView.AbstractC1205p.c cVar) {
        boolean z2;
        int i4;
        SavedState savedState = this.f5569D;
        if (savedState == null || !savedState.m5498a()) {
            m5437A2();
            z2 = this.f5579x;
            i4 = this.f5566A;
            if (i4 == -1) {
                i4 = z2 ? i3 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f5569D;
            z2 = savedState2.f5584f;
            i4 = savedState2.f5582d;
        }
        int i5 = z2 ? -1 : 1;
        for (int i6 = 0; i6 < this.f5572G && i4 >= 0 && i4 < i3; i6++) {
            cVar.mo5880a(i4, 0);
            i4 += i5;
        }
    }

    /* JADX INFO: renamed from: u2 */
    void mo5423u2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, C1183a c1183a, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: v */
    public int mo5494v(RecyclerView.C1215z c1215z) {
        return m5446S1(c1215z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: w */
    public int mo5424w(RecyclerView.C1215z c1215z) {
        return m5447T1(c1215z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: w0 */
    public boolean mo5495w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: x */
    public int mo5425x(RecyclerView.C1215z c1215z) {
        return m5448U1(c1215z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: y */
    public int mo5496y(RecyclerView.C1215z c1215z) {
        return m5446S1(c1215z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: z */
    public int mo5426z(RecyclerView.C1215z c1215z) {
        return m5447T1(c1215z);
    }

    /* JADX INFO: renamed from: z2 */
    boolean m5497z2() {
        return this.f5576u.mo6211k() == 0 && this.f5576u.mo6208h() == 0;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f5574s = 1;
        this.f5578w = false;
        this.f5579x = false;
        this.f5580y = false;
        this.f5581z = true;
        this.f5566A = -1;
        this.f5567B = Integer.MIN_VALUE;
        this.f5569D = null;
        this.f5570E = new C1183a();
        this.f5571F = new C1184b();
        this.f5572G = 2;
        this.f5573H = new int[2];
        RecyclerView.AbstractC1205p.d dVarM5778m0 = RecyclerView.AbstractC1205p.m5778m0(context, attributeSet, i3, i4);
        m5464C2(dVarM5778m0.f5763a);
        m5465D2(dVarM5778m0.f5765c);
        mo5400E2(dVarM5778m0.f5766d);
    }
}
