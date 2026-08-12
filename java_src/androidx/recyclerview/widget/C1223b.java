package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b */
/* JADX INFO: loaded from: classes.dex */
class C1223b {

    /* JADX INFO: renamed from: a */
    final b f5886a;

    /* JADX INFO: renamed from: b */
    final a f5887b = new a();

    /* JADX INFO: renamed from: c */
    final List f5888c = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$a */
    static class a {

        /* JADX INFO: renamed from: a */
        long f5889a = 0;

        /* JADX INFO: renamed from: b */
        a f5890b;

        a() {
        }

        /* JADX INFO: renamed from: c */
        private void m6124c() {
            if (this.f5890b == null) {
                this.f5890b = new a();
            }
        }

        /* JADX INFO: renamed from: a */
        void m6125a(int i3) {
            if (i3 < 64) {
                this.f5889a &= ~(1 << i3);
                return;
            }
            a aVar = this.f5890b;
            if (aVar != null) {
                aVar.m6125a(i3 - 64);
            }
        }

        /* JADX INFO: renamed from: b */
        int m6126b(int i3) {
            a aVar = this.f5890b;
            return aVar == null ? i3 >= 64 ? Long.bitCount(this.f5889a) : Long.bitCount(this.f5889a & ((1 << i3) - 1)) : i3 < 64 ? Long.bitCount(this.f5889a & ((1 << i3) - 1)) : aVar.m6126b(i3 - 64) + Long.bitCount(this.f5889a);
        }

        /* JADX INFO: renamed from: d */
        boolean m6127d(int i3) {
            if (i3 < 64) {
                return (this.f5889a & (1 << i3)) != 0;
            }
            m6124c();
            return this.f5890b.m6127d(i3 - 64);
        }

        /* JADX INFO: renamed from: e */
        void m6128e(int i3, boolean z2) {
            if (i3 >= 64) {
                m6124c();
                this.f5890b.m6128e(i3 - 64, z2);
                return;
            }
            long j3 = this.f5889a;
            boolean z3 = (Long.MIN_VALUE & j3) != 0;
            long j4 = (1 << i3) - 1;
            this.f5889a = ((j3 & (~j4)) << 1) | (j3 & j4);
            if (z2) {
                m6131h(i3);
            } else {
                m6125a(i3);
            }
            if (z3 || this.f5890b != null) {
                m6124c();
                this.f5890b.m6128e(0, z3);
            }
        }

        /* JADX INFO: renamed from: f */
        boolean m6129f(int i3) {
            if (i3 >= 64) {
                m6124c();
                return this.f5890b.m6129f(i3 - 64);
            }
            long j3 = 1 << i3;
            long j4 = this.f5889a;
            boolean z2 = (j4 & j3) != 0;
            long j5 = j4 & (~j3);
            this.f5889a = j5;
            long j6 = j3 - 1;
            this.f5889a = (j5 & j6) | Long.rotateRight((~j6) & j5, 1);
            a aVar = this.f5890b;
            if (aVar != null) {
                if (aVar.m6127d(0)) {
                    m6131h(63);
                }
                this.f5890b.m6129f(0);
            }
            return z2;
        }

        /* JADX INFO: renamed from: g */
        void m6130g() {
            this.f5889a = 0L;
            a aVar = this.f5890b;
            if (aVar != null) {
                aVar.m6130g();
            }
        }

        /* JADX INFO: renamed from: h */
        void m6131h(int i3) {
            if (i3 < 64) {
                this.f5889a |= 1 << i3;
            } else {
                m6124c();
                this.f5890b.m6131h(i3 - 64);
            }
        }

        public String toString() {
            if (this.f5890b == null) {
                return Long.toBinaryString(this.f5889a);
            }
            return this.f5890b.toString() + "xx" + Long.toBinaryString(this.f5889a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b */
    interface b {
        /* JADX INFO: renamed from: a */
        View mo5692a(int i3);

        /* JADX INFO: renamed from: b */
        void mo5693b(View view);

        /* JADX INFO: renamed from: c */
        RecyclerView.AbstractC1188C mo5694c(View view);

        /* JADX INFO: renamed from: d */
        void mo5695d(int i3);

        /* JADX INFO: renamed from: e */
        void mo5696e(View view);

        /* JADX INFO: renamed from: f */
        void mo5697f(View view, int i3);

        /* JADX INFO: renamed from: g */
        int mo5698g();

        /* JADX INFO: renamed from: h */
        void mo5699h(int i3);

        /* JADX INFO: renamed from: i */
        void mo5700i();

        /* JADX INFO: renamed from: j */
        void mo5701j(View view, int i3, ViewGroup.LayoutParams layoutParams);

        /* JADX INFO: renamed from: k */
        int mo5702k(View view);
    }

    C1223b(b bVar) {
        this.f5886a = bVar;
    }

    /* JADX INFO: renamed from: h */
    private int m6104h(int i3) {
        if (i3 < 0) {
            return -1;
        }
        int iMo5698g = this.f5886a.mo5698g();
        int i4 = i3;
        while (i4 < iMo5698g) {
            int iM6126b = i3 - (i4 - this.f5887b.m6126b(i4));
            if (iM6126b == 0) {
                while (this.f5887b.m6127d(i4)) {
                    i4++;
                }
                return i4;
            }
            i4 += iM6126b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    private void m6105l(View view) {
        this.f5888c.add(view);
        this.f5886a.mo5693b(view);
    }

    /* JADX INFO: renamed from: t */
    private boolean m6106t(View view) {
        if (!this.f5888c.remove(view)) {
            return false;
        }
        this.f5886a.mo5696e(view);
        return true;
    }

    /* JADX INFO: renamed from: a */
    void m6107a(View view, int i3, boolean z2) {
        int iMo5698g = i3 < 0 ? this.f5886a.mo5698g() : m6104h(i3);
        this.f5887b.m6128e(iMo5698g, z2);
        if (z2) {
            m6105l(view);
        }
        this.f5886a.mo5697f(view, iMo5698g);
    }

    /* JADX INFO: renamed from: b */
    void m6108b(View view, boolean z2) {
        m6107a(view, -1, z2);
    }

    /* JADX INFO: renamed from: c */
    void m6109c(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z2) {
        int iMo5698g = i3 < 0 ? this.f5886a.mo5698g() : m6104h(i3);
        this.f5887b.m6128e(iMo5698g, z2);
        if (z2) {
            m6105l(view);
        }
        this.f5886a.mo5701j(view, iMo5698g, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    void m6110d(int i3) {
        int iM6104h = m6104h(i3);
        this.f5887b.m6129f(iM6104h);
        this.f5886a.mo5695d(iM6104h);
    }

    /* JADX INFO: renamed from: e */
    View m6111e(int i3) {
        int size = this.f5888c.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) this.f5888c.get(i4);
            RecyclerView.AbstractC1188C abstractC1188CMo5694c = this.f5886a.mo5694c(view);
            if (abstractC1188CMo5694c.m5670m() == i3 && !abstractC1188CMo5694c.m5677t() && !abstractC1188CMo5694c.m5679v()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    View m6112f(int i3) {
        return this.f5886a.mo5692a(m6104h(i3));
    }

    /* JADX INFO: renamed from: g */
    int m6113g() {
        return this.f5886a.mo5698g() - this.f5888c.size();
    }

    /* JADX INFO: renamed from: i */
    View m6114i(int i3) {
        return this.f5886a.mo5692a(i3);
    }

    /* JADX INFO: renamed from: j */
    int m6115j() {
        return this.f5886a.mo5698g();
    }

    /* JADX INFO: renamed from: k */
    void m6116k(View view) {
        int iMo5702k = this.f5886a.mo5702k(view);
        if (iMo5702k >= 0) {
            this.f5887b.m6131h(iMo5702k);
            m6105l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: m */
    int m6117m(View view) {
        int iMo5702k = this.f5886a.mo5702k(view);
        if (iMo5702k == -1 || this.f5887b.m6127d(iMo5702k)) {
            return -1;
        }
        return iMo5702k - this.f5887b.m6126b(iMo5702k);
    }

    /* JADX INFO: renamed from: n */
    boolean m6118n(View view) {
        return this.f5888c.contains(view);
    }

    /* JADX INFO: renamed from: o */
    void m6119o() {
        this.f5887b.m6130g();
        for (int size = this.f5888c.size() - 1; size >= 0; size--) {
            this.f5886a.mo5696e((View) this.f5888c.get(size));
            this.f5888c.remove(size);
        }
        this.f5886a.mo5700i();
    }

    /* JADX INFO: renamed from: p */
    void m6120p(View view) {
        int iMo5702k = this.f5886a.mo5702k(view);
        if (iMo5702k < 0) {
            return;
        }
        if (this.f5887b.m6129f(iMo5702k)) {
            m6106t(view);
        }
        this.f5886a.mo5699h(iMo5702k);
    }

    /* JADX INFO: renamed from: q */
    void m6121q(int i3) {
        int iM6104h = m6104h(i3);
        View viewMo5692a = this.f5886a.mo5692a(iM6104h);
        if (viewMo5692a == null) {
            return;
        }
        if (this.f5887b.m6129f(iM6104h)) {
            m6106t(viewMo5692a);
        }
        this.f5886a.mo5699h(iM6104h);
    }

    /* JADX INFO: renamed from: r */
    boolean m6122r(View view) {
        int iMo5702k = this.f5886a.mo5702k(view);
        if (iMo5702k == -1) {
            m6106t(view);
            return true;
        }
        if (!this.f5887b.m6127d(iMo5702k)) {
            return false;
        }
        this.f5887b.m6129f(iMo5702k);
        m6106t(view);
        this.f5886a.mo5699h(iMo5702k);
        return true;
    }

    /* JADX INFO: renamed from: s */
    void m6123s(View view) {
        int iMo5702k = this.f5886a.mo5702k(view);
        if (iMo5702k < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f5887b.m6127d(iMo5702k)) {
            this.f5887b.m6125a(iMo5702k);
            m6106t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f5887b.toString() + ", hidden list:" + this.f5888c.size();
    }
}
