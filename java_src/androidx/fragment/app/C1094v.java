package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC1105F;
import androidx.lifecycle.AbstractC1107H;
import androidx.lifecycle.C1106G;
import androidx.lifecycle.C1109J;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p069X.AbstractC0589a;

/* JADX INFO: renamed from: androidx.fragment.app.v */
/* JADX INFO: loaded from: classes.dex */
final class C1094v extends AbstractC1105F {

    /* JADX INFO: renamed from: k */
    private static final C1106G.b f5201k = new a();

    /* JADX INFO: renamed from: g */
    private final boolean f5205g;

    /* JADX INFO: renamed from: d */
    private final HashMap f5202d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final HashMap f5203e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final HashMap f5204f = new HashMap();

    /* JADX INFO: renamed from: h */
    private boolean f5206h = false;

    /* JADX INFO: renamed from: i */
    private boolean f5207i = false;

    /* JADX INFO: renamed from: j */
    private boolean f5208j = false;

    /* JADX INFO: renamed from: androidx.fragment.app.v$a */
    class a implements C1106G.b {
        a() {
        }

        @Override // androidx.lifecycle.C1106G.b
        /* JADX INFO: renamed from: a */
        public AbstractC1105F mo2118a(Class cls) {
            return new C1094v(true);
        }

        @Override // androidx.lifecycle.C1106G.b
        /* JADX INFO: renamed from: b */
        public /* synthetic */ AbstractC1105F mo2119b(Class cls, AbstractC0589a abstractC0589a) {
            return AbstractC1107H.m5085b(this, cls, abstractC0589a);
        }
    }

    C1094v(boolean z2) {
        this.f5205g = z2;
    }

    /* JADX INFO: renamed from: i */
    private void m4982i(String str) {
        C1094v c1094v = (C1094v) this.f5203e.get(str);
        if (c1094v != null) {
            c1094v.mo4984d();
            this.f5203e.remove(str);
        }
        C1109J c1109j = (C1109J) this.f5204f.get(str);
        if (c1109j != null) {
            c1109j.m5087a();
            this.f5204f.remove(str);
        }
    }

    /* JADX INFO: renamed from: l */
    static C1094v m4983l(C1109J c1109j) {
        return (C1094v) new C1106G(c1109j, f5201k).m5075a(C1094v.class);
    }

    @Override // androidx.lifecycle.AbstractC1105F
    /* JADX INFO: renamed from: d */
    protected void mo4984d() {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f5206h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1094v.class == obj.getClass()) {
            C1094v c1094v = (C1094v) obj;
            if (this.f5202d.equals(c1094v.f5202d) && this.f5203e.equals(c1094v.f5203e) && this.f5204f.equals(c1094v.f5204f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    void m4985f(Fragment fragment) {
        if (this.f5208j) {
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f5202d.containsKey(fragment.mWho)) {
                return;
            }
            this.f5202d.put(fragment.mWho, fragment);
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    void m4986g(Fragment fragment) {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m4982i(fragment.mWho);
    }

    /* JADX INFO: renamed from: h */
    void m4987h(String str) {
        if (FragmentManager.m4744H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m4982i(str);
    }

    public int hashCode() {
        return (((this.f5202d.hashCode() * 31) + this.f5203e.hashCode()) * 31) + this.f5204f.hashCode();
    }

    /* JADX INFO: renamed from: j */
    Fragment m4988j(String str) {
        return (Fragment) this.f5202d.get(str);
    }

    /* JADX INFO: renamed from: k */
    C1094v m4989k(Fragment fragment) {
        C1094v c1094v = (C1094v) this.f5203e.get(fragment.mWho);
        if (c1094v != null) {
            return c1094v;
        }
        C1094v c1094v2 = new C1094v(this.f5205g);
        this.f5203e.put(fragment.mWho, c1094v2);
        return c1094v2;
    }

    /* JADX INFO: renamed from: m */
    Collection m4990m() {
        return new ArrayList(this.f5202d.values());
    }

    /* JADX INFO: renamed from: n */
    C1109J m4991n(Fragment fragment) {
        C1109J c1109j = (C1109J) this.f5204f.get(fragment.mWho);
        if (c1109j != null) {
            return c1109j;
        }
        C1109J c1109j2 = new C1109J();
        this.f5204f.put(fragment.mWho, c1109j2);
        return c1109j2;
    }

    /* JADX INFO: renamed from: o */
    boolean m4992o() {
        return this.f5206h;
    }

    /* JADX INFO: renamed from: p */
    void m4993p(Fragment fragment) {
        if (this.f5208j) {
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f5202d.remove(fragment.mWho) == null || !FragmentManager.m4744H0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: renamed from: q */
    void m4994q(boolean z2) {
        this.f5208j = z2;
    }

    /* JADX INFO: renamed from: r */
    boolean m4995r(Fragment fragment) {
        if (this.f5202d.containsKey(fragment.mWho)) {
            return this.f5205g ? this.f5206h : !this.f5207i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f5202d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f5203e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f5204f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
