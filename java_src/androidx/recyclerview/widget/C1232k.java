package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p027J.AbstractC0268W;
import p027J.C0273a;
import p030K.C0356y;
import p030K.C0357z;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k */
/* JADX INFO: loaded from: classes.dex */
public class C1232k extends C0273a {

    /* JADX INFO: renamed from: d */
    final RecyclerView f6017d;

    /* JADX INFO: renamed from: e */
    private final a f6018e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$a */
    public static class a extends C0273a {

        /* JADX INFO: renamed from: d */
        final C1232k f6019d;

        /* JADX INFO: renamed from: e */
        private Map f6020e = new WeakHashMap();

        public a(C1232k c1232k) {
            this.f6019d = c1232k;
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: a */
        public boolean mo901a(View view, AccessibilityEvent accessibilityEvent) {
            C0273a c0273a = (C0273a) this.f6020e.get(view);
            return c0273a != null ? c0273a.mo901a(view, accessibilityEvent) : super.mo901a(view, accessibilityEvent);
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: b */
        public C0357z mo902b(View view) {
            C0273a c0273a = (C0273a) this.f6020e.get(view);
            return c0273a != null ? c0273a.mo902b(view) : super.mo902b(view);
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: f */
        public void mo904f(View view, AccessibilityEvent accessibilityEvent) {
            C0273a c0273a = (C0273a) this.f6020e.get(view);
            if (c0273a != null) {
                c0273a.mo904f(view, accessibilityEvent);
            } else {
                super.mo904f(view, accessibilityEvent);
            }
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            if (this.f6019d.m6232o() || this.f6019d.f6017d.getLayoutManager() == null) {
                super.mo905g(view, c0356y);
                return;
            }
            this.f6019d.f6017d.getLayoutManager().m5815S0(view, c0356y);
            C0273a c0273a = (C0273a) this.f6020e.get(view);
            if (c0273a != null) {
                c0273a.mo905g(view, c0356y);
            } else {
                super.mo905g(view, c0356y);
            }
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: h */
        public void mo906h(View view, AccessibilityEvent accessibilityEvent) {
            C0273a c0273a = (C0273a) this.f6020e.get(view);
            if (c0273a != null) {
                c0273a.mo906h(view, accessibilityEvent);
            } else {
                super.mo906h(view, accessibilityEvent);
            }
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: i */
        public boolean mo907i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0273a c0273a = (C0273a) this.f6020e.get(viewGroup);
            return c0273a != null ? c0273a.mo907i(viewGroup, view, accessibilityEvent) : super.mo907i(viewGroup, view, accessibilityEvent);
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: j */
        public boolean mo908j(View view, int i3, Bundle bundle) {
            if (this.f6019d.m6232o() || this.f6019d.f6017d.getLayoutManager() == null) {
                return super.mo908j(view, i3, bundle);
            }
            C0273a c0273a = (C0273a) this.f6020e.get(view);
            if (c0273a != null) {
                if (c0273a.mo908j(view, i3, bundle)) {
                    return true;
                }
            } else if (super.mo908j(view, i3, bundle)) {
                return true;
            }
            return this.f6019d.f6017d.getLayoutManager().m5850m1(view, i3, bundle);
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: l */
        public void mo909l(View view, int i3) {
            C0273a c0273a = (C0273a) this.f6020e.get(view);
            if (c0273a != null) {
                c0273a.mo909l(view, i3);
            } else {
                super.mo909l(view, i3);
            }
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: m */
        public void mo910m(View view, AccessibilityEvent accessibilityEvent) {
            C0273a c0273a = (C0273a) this.f6020e.get(view);
            if (c0273a != null) {
                c0273a.mo910m(view, accessibilityEvent);
            } else {
                super.mo910m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: renamed from: n */
        C0273a m6233n(View view) {
            return (C0273a) this.f6020e.remove(view);
        }

        /* JADX INFO: renamed from: o */
        void m6234o(View view) {
            C0273a c0273aM778k = AbstractC0268W.m778k(view);
            if (c0273aM778k == null || c0273aM778k == this) {
                return;
            }
            this.f6020e.put(view, c0273aM778k);
        }
    }

    public C1232k(RecyclerView recyclerView) {
        this.f6017d = recyclerView;
        C0273a c0273aM6231n = m6231n();
        if (c0273aM6231n == null || !(c0273aM6231n instanceof a)) {
            this.f6018e = new a(this);
        } else {
            this.f6018e = (a) c0273aM6231n;
        }
    }

    @Override // p027J.C0273a
    /* JADX INFO: renamed from: f */
    public void mo904f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo904f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m6232o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo5470O0(accessibilityEvent);
        }
    }

    @Override // p027J.C0273a
    /* JADX INFO: renamed from: g */
    public void mo905g(View view, C0356y c0356y) {
        super.mo905g(view, c0356y);
        if (m6232o() || this.f6017d.getLayoutManager() == null) {
            return;
        }
        this.f6017d.getLayoutManager().m5812Q0(c0356y);
    }

    @Override // p027J.C0273a
    /* JADX INFO: renamed from: j */
    public boolean mo908j(View view, int i3, Bundle bundle) {
        if (super.mo908j(view, i3, bundle)) {
            return true;
        }
        if (m6232o() || this.f6017d.getLayoutManager() == null) {
            return false;
        }
        return this.f6017d.getLayoutManager().m5846k1(i3, bundle);
    }

    /* JADX INFO: renamed from: n */
    public C0273a m6231n() {
        return this.f6018e;
    }

    /* JADX INFO: renamed from: o */
    boolean m6232o() {
        return this.f6017d.m5610l0();
    }
}
