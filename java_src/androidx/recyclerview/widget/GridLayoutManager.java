package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p030K.C0356y;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: I */
    boolean f5551I;

    /* JADX INFO: renamed from: J */
    int f5552J;

    /* JADX INFO: renamed from: K */
    int[] f5553K;

    /* JADX INFO: renamed from: L */
    View[] f5554L;

    /* JADX INFO: renamed from: M */
    final SparseIntArray f5555M;

    /* JADX INFO: renamed from: N */
    final SparseIntArray f5556N;

    /* JADX INFO: renamed from: O */
    AbstractC1181c f5557O;

    /* JADX INFO: renamed from: P */
    final Rect f5558P;

    /* JADX INFO: renamed from: Q */
    private boolean f5559Q;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1179a extends AbstractC1181c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1181c
        /* JADX INFO: renamed from: e */
        public int mo5427e(int i3, int i4) {
            return i3 % i4;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1181c
        /* JADX INFO: renamed from: f */
        public int mo5428f(int i3) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC1181c {

        /* JADX INFO: renamed from: a */
        final SparseIntArray f5562a = new SparseIntArray();

        /* JADX INFO: renamed from: b */
        final SparseIntArray f5563b = new SparseIntArray();

        /* JADX INFO: renamed from: c */
        private boolean f5564c = false;

        /* JADX INFO: renamed from: d */
        private boolean f5565d = false;

        /* JADX INFO: renamed from: a */
        static int m5431a(SparseIntArray sparseIntArray, int i3) {
            int size = sparseIntArray.size() - 1;
            int i4 = 0;
            while (i4 <= size) {
                int i5 = (i4 + size) >>> 1;
                if (sparseIntArray.keyAt(i5) < i3) {
                    i4 = i5 + 1;
                } else {
                    size = i5 - 1;
                }
            }
            int i6 = i4 - 1;
            if (i6 < 0 || i6 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i6);
        }

        /* JADX INFO: renamed from: b */
        int m5432b(int i3, int i4) {
            if (!this.f5565d) {
                return m5434d(i3, i4);
            }
            int i5 = this.f5563b.get(i3, -1);
            if (i5 != -1) {
                return i5;
            }
            int iM5434d = m5434d(i3, i4);
            this.f5563b.put(i3, iM5434d);
            return iM5434d;
        }

        /* JADX INFO: renamed from: c */
        int m5433c(int i3, int i4) {
            if (!this.f5564c) {
                return mo5427e(i3, i4);
            }
            int i5 = this.f5562a.get(i3, -1);
            if (i5 != -1) {
                return i5;
            }
            int iMo5427e = mo5427e(i3, i4);
            this.f5562a.put(i3, iMo5427e);
            return iMo5427e;
        }

        /* JADX INFO: renamed from: d */
        public int m5434d(int i3, int i4) {
            int i5;
            int i6;
            int iM5433c;
            int iM5431a;
            if (!this.f5565d || (iM5431a = m5431a(this.f5563b, i3)) == -1) {
                i5 = 0;
                i6 = 0;
                iM5433c = 0;
            } else {
                i5 = this.f5563b.get(iM5431a);
                i6 = iM5431a + 1;
                iM5433c = m5433c(iM5431a, i4) + mo5428f(iM5431a);
                if (iM5433c == i4) {
                    i5++;
                    iM5433c = 0;
                }
            }
            int iMo5428f = mo5428f(i3);
            while (i6 < i3) {
                int iMo5428f2 = mo5428f(i6);
                iM5433c += iMo5428f2;
                if (iM5433c == i4) {
                    i5++;
                    iM5433c = 0;
                } else if (iM5433c > i4) {
                    i5++;
                    iM5433c = iMo5428f2;
                }
                i6++;
            }
            return iM5433c + iMo5428f > i4 ? i5 + 1 : i5;
        }

        /* JADX INFO: renamed from: e */
        public abstract int mo5427e(int i3, int i4);

        /* JADX INFO: renamed from: f */
        public abstract int mo5428f(int i3);

        /* JADX INFO: renamed from: g */
        public void m5435g() {
            this.f5563b.clear();
        }

        /* JADX INFO: renamed from: h */
        public void m5436h() {
            this.f5562a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f5551I = false;
        this.f5552J = -1;
        this.f5555M = new SparseIntArray();
        this.f5556N = new SparseIntArray();
        this.f5557O = new C1179a();
        this.f5558P = new Rect();
        m5418d3(RecyclerView.AbstractC1205p.m5778m0(context, attributeSet, i3, i4).f5764b);
    }

    /* JADX INFO: renamed from: N2 */
    private void m5381N2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, int i3, boolean z2) {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (z2) {
            i6 = 1;
            i5 = i3;
            i4 = 0;
        } else {
            i4 = i3 - 1;
            i5 = -1;
            i6 = -1;
        }
        while (i4 != i5) {
            View view = this.f5554L[i4];
            C1180b c1180b = (C1180b) view.getLayoutParams();
            int iM5392Z2 = m5392Z2(c1211v, c1215z, m5847l0(view));
            c1180b.f5561f = iM5392Z2;
            c1180b.f5560e = i7;
            i7 += iM5392Z2;
            i4 += i6;
        }
    }

    /* JADX INFO: renamed from: O2 */
    private void m5382O2() {
        int iM5809O = m5809O();
        for (int i3 = 0; i3 < iM5809O; i3++) {
            C1180b c1180b = (C1180b) m5807N(i3).getLayoutParams();
            int iM5881a = c1180b.m5881a();
            this.f5555M.put(iM5881a, c1180b.m5430f());
            this.f5556N.put(iM5881a, c1180b.m5429e());
        }
    }

    /* JADX INFO: renamed from: P2 */
    private void m5383P2(int i3) {
        this.f5553K = m5384Q2(this.f5553K, this.f5552J, i3);
    }

    /* JADX INFO: renamed from: Q2 */
    static int[] m5384Q2(int[] iArr, int i3, int i4) {
        int i5;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i4) {
            iArr = new int[i3 + 1];
        }
        int i6 = 0;
        iArr[0] = 0;
        int i7 = i4 / i3;
        int i8 = i4 % i3;
        int i9 = 0;
        for (int i10 = 1; i10 <= i3; i10++) {
            i6 += i8;
            if (i6 <= 0 || i3 - i6 >= i8) {
                i5 = i7;
            } else {
                i5 = i7 + 1;
                i6 -= i3;
            }
            i9 += i5;
            iArr[i10] = i9;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: R2 */
    private void m5385R2() {
        this.f5555M.clear();
        this.f5556N.clear();
    }

    /* JADX INFO: renamed from: S2 */
    private int m5386S2(RecyclerView.C1215z c1215z) {
        if (m5809O() != 0 && c1215z.m5967b() != 0) {
            m5474X1();
            boolean zM5491r2 = m5491r2();
            View viewM5477b2 = m5477b2(!zM5491r2, true);
            View viewM5476a2 = m5476a2(!zM5491r2, true);
            if (viewM5477b2 != null && viewM5476a2 != null) {
                int iM5432b = this.f5557O.m5432b(m5847l0(viewM5477b2), this.f5552J);
                int iM5432b2 = this.f5557O.m5432b(m5847l0(viewM5476a2), this.f5552J);
                int iMax = this.f5579x ? Math.max(0, ((this.f5557O.m5432b(c1215z.m5967b() - 1, this.f5552J) + 1) - Math.max(iM5432b, iM5432b2)) - 1) : Math.max(0, Math.min(iM5432b, iM5432b2));
                if (zM5491r2) {
                    return Math.round((iMax * (Math.abs(this.f5576u.mo6204d(viewM5476a2) - this.f5576u.mo6207g(viewM5477b2)) / ((this.f5557O.m5432b(m5847l0(viewM5476a2), this.f5552J) - this.f5557O.m5432b(m5847l0(viewM5477b2), this.f5552J)) + 1))) + (this.f5576u.mo6213m() - this.f5576u.mo6207g(viewM5477b2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: T2 */
    private int m5387T2(RecyclerView.C1215z c1215z) {
        if (m5809O() != 0 && c1215z.m5967b() != 0) {
            m5474X1();
            View viewM5477b2 = m5477b2(!m5491r2(), true);
            View viewM5476a2 = m5476a2(!m5491r2(), true);
            if (viewM5477b2 != null && viewM5476a2 != null) {
                if (!m5491r2()) {
                    return this.f5557O.m5432b(c1215z.m5967b() - 1, this.f5552J) + 1;
                }
                int iMo6204d = this.f5576u.mo6204d(viewM5476a2) - this.f5576u.mo6207g(viewM5477b2);
                int iM5432b = this.f5557O.m5432b(m5847l0(viewM5477b2), this.f5552J);
                return (int) ((iMo6204d / ((this.f5557O.m5432b(m5847l0(viewM5476a2), this.f5552J) - iM5432b) + 1)) * (this.f5557O.m5432b(c1215z.m5967b() - 1, this.f5552J) + 1));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: U2 */
    private void m5388U2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, LinearLayoutManager.C1183a c1183a, int i3) {
        boolean z2 = i3 == 1;
        int iM5391Y2 = m5391Y2(c1211v, c1215z, c1183a.f5586b);
        if (z2) {
            while (iM5391Y2 > 0) {
                int i4 = c1183a.f5586b;
                if (i4 <= 0) {
                    return;
                }
                int i5 = i4 - 1;
                c1183a.f5586b = i5;
                iM5391Y2 = m5391Y2(c1211v, c1215z, i5);
            }
            return;
        }
        int iM5967b = c1215z.m5967b() - 1;
        int i6 = c1183a.f5586b;
        while (i6 < iM5967b) {
            int i7 = i6 + 1;
            int iM5391Y22 = m5391Y2(c1211v, c1215z, i7);
            if (iM5391Y22 <= iM5391Y2) {
                break;
            }
            i6 = i7;
            iM5391Y2 = iM5391Y22;
        }
        c1183a.f5586b = i6;
    }

    /* JADX INFO: renamed from: V2 */
    private void m5389V2() {
        View[] viewArr = this.f5554L;
        if (viewArr == null || viewArr.length != this.f5552J) {
            this.f5554L = new View[this.f5552J];
        }
    }

    /* JADX INFO: renamed from: X2 */
    private int m5390X2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, int i3) {
        if (!c1215z.m5970e()) {
            return this.f5557O.m5432b(i3, this.f5552J);
        }
        int iM5923f = c1211v.m5923f(i3);
        if (iM5923f != -1) {
            return this.f5557O.m5432b(iM5923f, this.f5552J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    /* JADX INFO: renamed from: Y2 */
    private int m5391Y2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, int i3) {
        if (!c1215z.m5970e()) {
            return this.f5557O.m5433c(i3, this.f5552J);
        }
        int i4 = this.f5556N.get(i3, -1);
        if (i4 != -1) {
            return i4;
        }
        int iM5923f = c1211v.m5923f(i3);
        if (iM5923f != -1) {
            return this.f5557O.m5433c(iM5923f, this.f5552J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
        return 0;
    }

    /* JADX INFO: renamed from: Z2 */
    private int m5392Z2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, int i3) {
        if (!c1215z.m5970e()) {
            return this.f5557O.mo5428f(i3);
        }
        int i4 = this.f5555M.get(i3, -1);
        if (i4 != -1) {
            return i4;
        }
        int iM5923f = c1211v.m5923f(i3);
        if (iM5923f != -1) {
            return this.f5557O.mo5428f(iM5923f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
        return 1;
    }

    /* JADX INFO: renamed from: a3 */
    private void m5393a3(float f3, int i3) {
        m5383P2(Math.max(Math.round(f3 * this.f5552J), i3));
    }

    /* JADX INFO: renamed from: b3 */
    private void m5394b3(View view, int i3, boolean z2) {
        int iM5775P;
        int iM5775P2;
        C1180b c1180b = (C1180b) view.getLayoutParams();
        Rect rect = c1180b.f5768b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1180b).topMargin + ((ViewGroup.MarginLayoutParams) c1180b).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1180b).leftMargin + ((ViewGroup.MarginLayoutParams) c1180b).rightMargin;
        int iM5412W2 = m5412W2(c1180b.f5560e, c1180b.f5561f);
        if (this.f5574s == 1) {
            iM5775P2 = RecyclerView.AbstractC1205p.m5775P(iM5412W2, i3, i5, ((ViewGroup.MarginLayoutParams) c1180b).width, false);
            iM5775P = RecyclerView.AbstractC1205p.m5775P(this.f5576u.mo6214n(), m5827c0(), i4, ((ViewGroup.MarginLayoutParams) c1180b).height, true);
        } else {
            int iM5775P3 = RecyclerView.AbstractC1205p.m5775P(iM5412W2, i3, i4, ((ViewGroup.MarginLayoutParams) c1180b).height, false);
            int iM5775P4 = RecyclerView.AbstractC1205p.m5775P(this.f5576u.mo6214n(), m5864t0(), i5, ((ViewGroup.MarginLayoutParams) c1180b).width, true);
            iM5775P = iM5775P3;
            iM5775P2 = iM5775P4;
        }
        m5395c3(view, iM5775P2, iM5775P, z2);
    }

    /* JADX INFO: renamed from: c3 */
    private void m5395c3(View view, int i3, int i4, boolean z2) {
        RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
        if (z2 ? m5805L1(view, i3, i4, c1206q) : m5801J1(view, i3, i4, c1206q)) {
            view.measure(i3, i4);
        }
    }

    /* JADX INFO: renamed from: e3 */
    private void m5396e3() {
        int iM5826b0;
        int iM5845k0;
        if (m5488p2() == 1) {
            iM5826b0 = m5862s0() - m5843j0();
            iM5845k0 = m5840i0();
        } else {
            iM5826b0 = m5826b0() - m5838h0();
            iM5845k0 = m5845k0();
        }
        m5383P2(iM5826b0 - iM5845k0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: A */
    public int mo5397A(RecyclerView.C1215z c1215z) {
        return this.f5559Q ? m5387T2(c1215z) : super.mo5397A(c1215z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: A1 */
    public int mo5398A1(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        m5396e3();
        m5389V2();
        return super.mo5398A1(i3, c1211v, c1215z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: C1 */
    public int mo5399C1(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        m5396e3();
        m5389V2();
        return super.mo5399C1(i3, c1211v, c1215z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: E2 */
    public void mo5400E2(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo5400E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: G1 */
    public void mo5401G1(Rect rect, int i3, int i4) {
        int iM5779s;
        int iM5779s2;
        if (this.f5553K == null) {
            super.mo5401G1(rect, i3, i4);
        }
        int iM5840i0 = m5840i0() + m5843j0();
        int iM5845k0 = m5845k0() + m5838h0();
        if (this.f5574s == 1) {
            iM5779s2 = RecyclerView.AbstractC1205p.m5779s(i4, rect.height() + iM5845k0, m5833f0());
            int[] iArr = this.f5553K;
            iM5779s = RecyclerView.AbstractC1205p.m5779s(i3, iArr[iArr.length - 1] + iM5840i0, m5836g0());
        } else {
            iM5779s = RecyclerView.AbstractC1205p.m5779s(i3, rect.width() + iM5840i0, m5836g0());
            int[] iArr2 = this.f5553K;
            iM5779s2 = RecyclerView.AbstractC1205p.m5779s(i4, iArr2[iArr2.length - 1] + iM5845k0, m5833f0());
        }
        m5793F1(iM5779s, iM5779s2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: I */
    public RecyclerView.C1206q mo5402I() {
        return this.f5574s == 0 ? new C1180b(-2, -1) : new C1180b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: J */
    public RecyclerView.C1206q mo5403J(Context context, AttributeSet attributeSet) {
        return new C1180b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: K */
    public RecyclerView.C1206q mo5404K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1180b((ViewGroup.MarginLayoutParams) layoutParams) : new C1180b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo5405N0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1211v r26, androidx.recyclerview.widget.RecyclerView.C1215z r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo5405N0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: P1 */
    public boolean mo5406P1() {
        return this.f5569D == null && !this.f5551I;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: R1 */
    void mo5407R1(RecyclerView.C1215z c1215z, LinearLayoutManager.C1185c c1185c, RecyclerView.AbstractC1205p.c cVar) {
        int iMo5428f = this.f5552J;
        for (int i3 = 0; i3 < this.f5552J && c1185c.m5511c(c1215z) && iMo5428f > 0; i3++) {
            int i4 = c1185c.f5597d;
            cVar.mo5880a(i4, Math.max(0, c1185c.f5600g));
            iMo5428f -= this.f5557O.mo5428f(i4);
            c1185c.f5597d += c1185c.f5598e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: S */
    public int mo5408S(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        if (this.f5574s == 1) {
            return this.f5552J;
        }
        if (c1215z.m5967b() < 1) {
            return 0;
        }
        return m5390X2(c1211v, c1215z, c1215z.m5967b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: T0 */
    public void mo5409T0(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, View view, C0356y c0356y) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1180b)) {
            super.m5815S0(view, c0356y);
            return;
        }
        C1180b c1180b = (C1180b) layoutParams;
        int iM5390X2 = m5390X2(c1211v, c1215z, c1180b.m5881a());
        if (this.f5574s == 0) {
            c0356y.m1292v0(C0356y.g.m1319a(c1180b.m5429e(), c1180b.m5430f(), iM5390X2, 1, false, false));
        } else {
            c0356y.m1292v0(C0356y.g.m1319a(iM5390X2, 1, c1180b.m5429e(), c1180b.m5430f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: V0 */
    public void mo5410V0(RecyclerView recyclerView, int i3, int i4) {
        this.f5557O.m5436h();
        this.f5557O.m5435g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: W0 */
    public void mo5411W0(RecyclerView recyclerView) {
        this.f5557O.m5436h();
        this.f5557O.m5435g();
    }

    /* JADX INFO: renamed from: W2 */
    int m5412W2(int i3, int i4) {
        if (this.f5574s != 1 || !m5490q2()) {
            int[] iArr = this.f5553K;
            return iArr[i4 + i3] - iArr[i3];
        }
        int[] iArr2 = this.f5553K;
        int i5 = this.f5552J;
        return iArr2[i5 - i3] - iArr2[(i5 - i3) - i4];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: X0 */
    public void mo5413X0(RecyclerView recyclerView, int i3, int i4, int i5) {
        this.f5557O.m5436h();
        this.f5557O.m5435g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: Y0 */
    public void mo5414Y0(RecyclerView recyclerView, int i3, int i4) {
        this.f5557O.m5436h();
        this.f5557O.m5435g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: a1 */
    public void mo5415a1(RecyclerView recyclerView, int i3, int i4, Object obj) {
        this.f5557O.m5436h();
        this.f5557O.m5435g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: b1 */
    public void mo5416b1(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        if (c1215z.m5970e()) {
            m5382O2();
        }
        super.mo5416b1(c1211v, c1215z);
        m5385R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: c1 */
    public void mo5417c1(RecyclerView.C1215z c1215z) {
        super.mo5417c1(c1215z);
        this.f5551I = false;
    }

    /* JADX INFO: renamed from: d3 */
    public void m5418d3(int i3) {
        if (i3 == this.f5552J) {
            return;
        }
        this.f5551I = true;
        if (i3 >= 1) {
            this.f5552J = i3;
            this.f5557O.m5436h();
            m5871x1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i3);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: j2 */
    View mo5419j2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, boolean z2, boolean z3) {
        int i3;
        int iM5809O;
        int iM5809O2 = m5809O();
        int i4 = 1;
        if (z3) {
            iM5809O = m5809O() - 1;
            i3 = -1;
            i4 = -1;
        } else {
            i3 = iM5809O2;
            iM5809O = 0;
        }
        int iM5967b = c1215z.m5967b();
        m5474X1();
        int iMo6213m = this.f5576u.mo6213m();
        int iMo6209i = this.f5576u.mo6209i();
        View view = null;
        View view2 = null;
        while (iM5809O != i3) {
            View viewM5807N = m5807N(iM5809O);
            int iM5847l0 = m5847l0(viewM5807N);
            if (iM5847l0 >= 0 && iM5847l0 < iM5967b && m5391Y2(c1211v, c1215z, iM5847l0) == 0) {
                if (((RecyclerView.C1206q) viewM5807N.getLayoutParams()).m5883c()) {
                    if (view2 == null) {
                        view2 = viewM5807N;
                    }
                } else {
                    if (this.f5576u.mo6207g(viewM5807N) < iMo6209i && this.f5576u.mo6204d(viewM5807N) >= iMo6213m) {
                        return viewM5807N;
                    }
                    if (view == null) {
                        view = viewM5807N;
                    }
                }
            }
            iM5809O += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: o0 */
    public int mo5420o0(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        if (this.f5574s == 0) {
            return this.f5552J;
        }
        if (c1215z.m5967b() < 1) {
            return 0;
        }
        return m5390X2(c1211v, c1215z, c1215z.m5967b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: r */
    public boolean mo5421r(RecyclerView.C1206q c1206q) {
        return c1206q instanceof C1180b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: s2 */
    void mo5422s2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, LinearLayoutManager.C1185c c1185c, LinearLayoutManager.C1184b c1184b) {
        int i3;
        int i4;
        int iM5840i0;
        int iM5845k0;
        int iMo6206f;
        int iMo6206f2;
        int i5;
        int iM5775P;
        int iM5775P2;
        View viewM5512d;
        int iMo6212l = this.f5576u.mo6212l();
        boolean z2 = iMo6212l != 1073741824;
        int i6 = m5809O() > 0 ? this.f5553K[this.f5552J] : 0;
        if (z2) {
            m5396e3();
        }
        boolean z3 = c1185c.f5598e == 1;
        int iM5391Y2 = this.f5552J;
        if (!z3) {
            iM5391Y2 = m5391Y2(c1211v, c1215z, c1185c.f5597d) + m5392Z2(c1211v, c1215z, c1185c.f5597d);
        }
        int i7 = 0;
        while (i7 < this.f5552J && c1185c.m5511c(c1215z) && iM5391Y2 > 0) {
            int i8 = c1185c.f5597d;
            int iM5392Z2 = m5392Z2(c1211v, c1215z, i8);
            if (iM5392Z2 > this.f5552J) {
                throw new IllegalArgumentException("Item at position " + i8 + " requires " + iM5392Z2 + " spans but GridLayoutManager has only " + this.f5552J + " spans.");
            }
            iM5391Y2 -= iM5392Z2;
            if (iM5391Y2 < 0 || (viewM5512d = c1185c.m5512d(c1211v)) == null) {
                break;
            }
            this.f5554L[i7] = viewM5512d;
            i7++;
        }
        if (i7 == 0) {
            c1184b.f5591b = true;
            return;
        }
        m5381N2(c1211v, c1215z, i7, z3);
        float f3 = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            View view = this.f5554L[i10];
            if (c1185c.f5605l == null) {
                if (z3) {
                    m5839i(view);
                } else {
                    m5842j(view, 0);
                }
            } else if (z3) {
                m5835g(view);
            } else {
                m5837h(view, 0);
            }
            m5854o(view, this.f5558P);
            m5394b3(view, iMo6212l, false);
            int iMo6205e = this.f5576u.mo6205e(view);
            if (iMo6205e > i9) {
                i9 = iMo6205e;
            }
            float fMo6206f = (this.f5576u.mo6206f(view) * 1.0f) / ((C1180b) view.getLayoutParams()).f5561f;
            if (fMo6206f > f3) {
                f3 = fMo6206f;
            }
        }
        if (z2) {
            m5393a3(f3, i6);
            i9 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                View view2 = this.f5554L[i11];
                m5394b3(view2, 1073741824, true);
                int iMo6205e2 = this.f5576u.mo6205e(view2);
                if (iMo6205e2 > i9) {
                    i9 = iMo6205e2;
                }
            }
        }
        for (int i12 = 0; i12 < i7; i12++) {
            View view3 = this.f5554L[i12];
            if (this.f5576u.mo6205e(view3) != i9) {
                C1180b c1180b = (C1180b) view3.getLayoutParams();
                Rect rect = c1180b.f5768b;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1180b).topMargin + ((ViewGroup.MarginLayoutParams) c1180b).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1180b).leftMargin + ((ViewGroup.MarginLayoutParams) c1180b).rightMargin;
                int iM5412W2 = m5412W2(c1180b.f5560e, c1180b.f5561f);
                if (this.f5574s == 1) {
                    iM5775P2 = RecyclerView.AbstractC1205p.m5775P(iM5412W2, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c1180b).width, false);
                    iM5775P = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM5775P = RecyclerView.AbstractC1205p.m5775P(iM5412W2, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c1180b).height, false);
                    iM5775P2 = iMakeMeasureSpec;
                }
                m5395c3(view3, iM5775P2, iM5775P, true);
            }
        }
        c1184b.f5590a = i9;
        if (this.f5574s == 1) {
            if (c1185c.f5599f == -1) {
                iMo6206f2 = c1185c.f5595b;
                i5 = iMo6206f2 - i9;
            } else {
                i5 = c1185c.f5595b;
                iMo6206f2 = i5 + i9;
            }
            iM5845k0 = i5;
            iMo6206f = 0;
            iM5840i0 = 0;
        } else {
            if (c1185c.f5599f == -1) {
                i4 = c1185c.f5595b;
                i3 = i4 - i9;
            } else {
                i3 = c1185c.f5595b;
                i4 = i3 + i9;
            }
            iM5840i0 = i3;
            iM5845k0 = 0;
            iMo6206f = i4;
            iMo6206f2 = 0;
        }
        for (int i15 = 0; i15 < i7; i15++) {
            View view4 = this.f5554L[i15];
            C1180b c1180b2 = (C1180b) view4.getLayoutParams();
            if (this.f5574s != 1) {
                iM5845k0 = this.f5553K[c1180b2.f5560e] + m5845k0();
                iMo6206f2 = this.f5576u.mo6206f(view4) + iM5845k0;
            } else if (m5490q2()) {
                iMo6206f = m5840i0() + this.f5553K[this.f5552J - c1180b2.f5560e];
                iM5840i0 = iMo6206f - this.f5576u.mo6206f(view4);
            } else {
                iM5840i0 = this.f5553K[c1180b2.f5560e] + m5840i0();
                iMo6206f = this.f5576u.mo6206f(view4) + iM5840i0;
            }
            int i16 = iMo6206f2;
            int i17 = iM5845k0;
            int i18 = iMo6206f;
            int i19 = iM5840i0;
            m5786D0(view4, i19, i17, i18, i16);
            iMo6206f2 = i16;
            iM5840i0 = i19;
            iMo6206f = i18;
            iM5845k0 = i17;
            if (c1180b2.m5883c() || c1180b2.m5882b()) {
                c1184b.f5592c = true;
            }
            c1184b.f5593d = view4.hasFocusable() | c1184b.f5593d;
        }
        Arrays.fill(this.f5554L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: u2 */
    void mo5423u2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, LinearLayoutManager.C1183a c1183a, int i3) {
        super.mo5423u2(c1211v, c1215z, c1183a, i3);
        m5396e3();
        if (c1215z.m5967b() > 0 && !c1215z.m5970e()) {
            m5388U2(c1211v, c1215z, c1183a, i3);
        }
        m5389V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: w */
    public int mo5424w(RecyclerView.C1215z c1215z) {
        return this.f5559Q ? m5386S2(c1215z) : super.mo5424w(c1215z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: x */
    public int mo5425x(RecyclerView.C1215z c1215z) {
        return this.f5559Q ? m5387T2(c1215z) : super.mo5425x(c1215z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: z */
    public int mo5426z(RecyclerView.C1215z c1215z) {
        return this.f5559Q ? m5386S2(c1215z) : super.mo5426z(c1215z);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C1180b extends RecyclerView.C1206q {

        /* JADX INFO: renamed from: e */
        int f5560e;

        /* JADX INFO: renamed from: f */
        int f5561f;

        public C1180b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5560e = -1;
            this.f5561f = 0;
        }

        /* JADX INFO: renamed from: e */
        public int m5429e() {
            return this.f5560e;
        }

        /* JADX INFO: renamed from: f */
        public int m5430f() {
            return this.f5561f;
        }

        public C1180b(int i3, int i4) {
            super(i3, i4);
            this.f5560e = -1;
            this.f5561f = 0;
        }

        public C1180b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5560e = -1;
            this.f5561f = 0;
        }

        public C1180b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5560e = -1;
            this.f5561f = 0;
        }
    }

    public GridLayoutManager(Context context, int i3, int i4, boolean z2) {
        super(context, i4, z2);
        this.f5551I = false;
        this.f5552J = -1;
        this.f5555M = new SparseIntArray();
        this.f5556N = new SparseIntArray();
        this.f5557O = new C1179a();
        this.f5558P = new Rect();
        m5418d3(i3);
    }
}
