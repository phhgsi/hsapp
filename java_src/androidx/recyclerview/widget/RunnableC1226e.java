package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p012E.AbstractC0124u;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1226e implements Runnable {

    /* JADX INFO: renamed from: h */
    static final ThreadLocal f5978h = new ThreadLocal();

    /* JADX INFO: renamed from: i */
    static Comparator f5979i = new a();

    /* JADX INFO: renamed from: e */
    long f5981e;

    /* JADX INFO: renamed from: f */
    long f5982f;

    /* JADX INFO: renamed from: d */
    ArrayList f5980d = new ArrayList();

    /* JADX INFO: renamed from: g */
    private ArrayList f5983g = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f5991d;
            if ((recyclerView == null) != (cVar2.f5991d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z2 = cVar.f5988a;
            if (z2 != cVar2.f5988a) {
                return z2 ? -1 : 1;
            }
            int i3 = cVar2.f5989b - cVar.f5989b;
            if (i3 != 0) {
                return i3;
            }
            int i4 = cVar.f5990c - cVar2.f5990c;
            if (i4 != 0) {
                return i4;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$b */
    static class b implements RecyclerView.AbstractC1205p.c {

        /* JADX INFO: renamed from: a */
        int f5984a;

        /* JADX INFO: renamed from: b */
        int f5985b;

        /* JADX INFO: renamed from: c */
        int[] f5986c;

        /* JADX INFO: renamed from: d */
        int f5987d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p.c
        /* JADX INFO: renamed from: a */
        public void mo5880a(int i3, int i4) {
            if (i3 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i4 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i5 = this.f5987d;
            int i6 = i5 * 2;
            int[] iArr = this.f5986c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f5986c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i6 >= iArr.length) {
                int[] iArr3 = new int[i5 * 4];
                this.f5986c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f5986c;
            iArr4[i6] = i3;
            iArr4[i6 + 1] = i4;
            this.f5987d++;
        }

        /* JADX INFO: renamed from: b */
        void m6177b() {
            int[] iArr = this.f5986c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5987d = 0;
        }

        /* JADX INFO: renamed from: c */
        void m6178c(RecyclerView recyclerView, boolean z2) {
            this.f5987d = 0;
            int[] iArr = this.f5986c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC1205p abstractC1205p = recyclerView.f5663m;
            if (recyclerView.f5661l == null || abstractC1205p == null || !abstractC1205p.m5872y0()) {
                return;
            }
            if (z2) {
                if (!recyclerView.f5645d.m6097p()) {
                    abstractC1205p.mo5493u(recyclerView.f5661l.mo5715d(), this);
                }
            } else if (!recyclerView.m5610l0()) {
                abstractC1205p.mo5492t(this.f5984a, this.f5985b, recyclerView.f5654h0, this);
            }
            int i3 = this.f5987d;
            if (i3 > abstractC1205p.f5755m) {
                abstractC1205p.f5755m = i3;
                abstractC1205p.f5756n = z2;
                recyclerView.f5641b.m5916K();
            }
        }

        /* JADX INFO: renamed from: d */
        boolean m6179d(int i3) {
            if (this.f5986c != null) {
                int i4 = this.f5987d * 2;
                for (int i5 = 0; i5 < i4; i5 += 2) {
                    if (this.f5986c[i5] == i3) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        void m6180e(int i3, int i4) {
            this.f5984a = i3;
            this.f5985b = i4;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$c */
    static class c {

        /* JADX INFO: renamed from: a */
        public boolean f5988a;

        /* JADX INFO: renamed from: b */
        public int f5989b;

        /* JADX INFO: renamed from: c */
        public int f5990c;

        /* JADX INFO: renamed from: d */
        public RecyclerView f5991d;

        /* JADX INFO: renamed from: e */
        public int f5992e;

        c() {
        }

        /* JADX INFO: renamed from: a */
        public void m6181a() {
            this.f5988a = false;
            this.f5989b = 0;
            this.f5990c = 0;
            this.f5991d = null;
            this.f5992e = 0;
        }
    }

    RunnableC1226e() {
    }

    /* JADX INFO: renamed from: b */
    private void m6166b() {
        c cVar;
        int size = this.f5980d.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView = (RecyclerView) this.f5980d.get(i4);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f5652g0.m6178c(recyclerView, false);
                i3 += recyclerView.f5652g0.f5987d;
            }
        }
        this.f5983g.ensureCapacity(i3);
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f5980d.get(i6);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f5652g0;
                int iAbs = Math.abs(bVar.f5984a) + Math.abs(bVar.f5985b);
                for (int i7 = 0; i7 < bVar.f5987d * 2; i7 += 2) {
                    if (i5 >= this.f5983g.size()) {
                        cVar = new c();
                        this.f5983g.add(cVar);
                    } else {
                        cVar = (c) this.f5983g.get(i5);
                    }
                    int[] iArr = bVar.f5986c;
                    int i8 = iArr[i7 + 1];
                    cVar.f5988a = i8 <= iAbs;
                    cVar.f5989b = iAbs;
                    cVar.f5990c = i8;
                    cVar.f5991d = recyclerView2;
                    cVar.f5992e = iArr[i7];
                    i5++;
                }
            }
        }
        Collections.sort(this.f5983g, f5979i);
    }

    /* JADX INFO: renamed from: c */
    private void m6167c(c cVar, long j3) {
        RecyclerView.AbstractC1188C abstractC1188CM6171i = m6171i(cVar.f5991d, cVar.f5992e, cVar.f5988a ? Long.MAX_VALUE : j3);
        if (abstractC1188CM6171i == null || abstractC1188CM6171i.f5700b == null || !abstractC1188CM6171i.m5676s() || abstractC1188CM6171i.m5677t()) {
            return;
        }
        m6170h((RecyclerView) abstractC1188CM6171i.f5700b.get(), j3);
    }

    /* JADX INFO: renamed from: d */
    private void m6168d(long j3) {
        for (int i3 = 0; i3 < this.f5983g.size(); i3++) {
            c cVar = (c) this.f5983g.get(i3);
            if (cVar.f5991d == null) {
                return;
            }
            m6167c(cVar, j3);
            cVar.m6181a();
        }
    }

    /* JADX INFO: renamed from: e */
    static boolean m6169e(RecyclerView recyclerView, int i3) {
        int iM6115j = recyclerView.f5647e.m6115j();
        for (int i4 = 0; i4 < iM6115j; i4++) {
            RecyclerView.AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(recyclerView.f5647e.m6114i(i4));
            if (abstractC1188CM5537f0.f5701c == i3 && !abstractC1188CM5537f0.m5677t()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private void m6170h(RecyclerView recyclerView, long j3) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f5619D && recyclerView.f5647e.m6115j() != 0) {
            recyclerView.m5583U0();
        }
        b bVar = recyclerView.f5652g0;
        bVar.m6178c(recyclerView, true);
        if (bVar.f5987d != 0) {
            try {
                AbstractC0124u.m359a("RV Nested Prefetch");
                recyclerView.f5654h0.m5971f(recyclerView.f5661l);
                for (int i3 = 0; i3 < bVar.f5987d * 2; i3 += 2) {
                    m6171i(recyclerView, bVar.f5986c[i3], j3);
                }
            } finally {
                AbstractC0124u.m360b();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private RecyclerView.AbstractC1188C m6171i(RecyclerView recyclerView, int i3, long j3) {
        if (m6169e(recyclerView, i3)) {
            return null;
        }
        RecyclerView.C1211v c1211v = recyclerView.f5641b;
        try {
            recyclerView.m5564G0();
            RecyclerView.AbstractC1188C abstractC1188CM5914I = c1211v.m5914I(i3, false, j3);
            if (abstractC1188CM5914I != null) {
                if (!abstractC1188CM5914I.m5676s() || abstractC1188CM5914I.m5677t()) {
                    c1211v.m5919a(abstractC1188CM5914I, false);
                } else {
                    c1211v.m5908B(abstractC1188CM5914I.f5699a);
                }
            }
            recyclerView.m5568I0(false);
            return abstractC1188CM5914I;
        } catch (Throwable th) {
            recyclerView.m5568I0(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6172a(RecyclerView recyclerView) {
        this.f5980d.add(recyclerView);
    }

    /* JADX INFO: renamed from: f */
    void m6173f(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.isAttachedToWindow() && this.f5981e == 0) {
            this.f5981e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f5652g0.m6180e(i3, i4);
    }

    /* JADX INFO: renamed from: g */
    void m6174g(long j3) {
        m6166b();
        m6168d(j3);
    }

    /* JADX INFO: renamed from: j */
    public void m6175j(RecyclerView recyclerView) {
        this.f5980d.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AbstractC0124u.m359a("RV Prefetch");
            if (!this.f5980d.isEmpty()) {
                int size = this.f5980d.size();
                long jMax = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    RecyclerView recyclerView = (RecyclerView) this.f5980d.get(i3);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m6174g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f5982f);
                }
            }
        } finally {
            this.f5981e = 0L;
            AbstractC0124u.m360b();
        }
    }
}
