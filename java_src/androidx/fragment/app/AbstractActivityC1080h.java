package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0681I;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.content.InterfaceC0967c;
import androidx.core.content.InterfaceC0968d;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.C1109J;
import androidx.lifecycle.C1133o;
import androidx.lifecycle.InterfaceC1110K;
import androidx.loader.app.AbstractC1145a;
import androidx.savedstate.C1240a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p024I.InterfaceC0204a;
import p027J.InterfaceC0315v;
import p027J.InterfaceC0321y;
import p078a.InterfaceC0655b;
import p083b.AbstractC1296d;
import p083b.InterfaceC1297e;
import p100f0.InterfaceC1890d;
import p161x.AbstractC2503b;
import p161x.InterfaceC2517p;
import p161x.InterfaceC2518q;

/* JADX INFO: renamed from: androidx.fragment.app.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1080h extends ComponentActivity implements AbstractC2503b.d {

    /* JADX INFO: renamed from: y */
    boolean f5174y;

    /* JADX INFO: renamed from: z */
    boolean f5175z;

    /* JADX INFO: renamed from: w */
    final C1083k f5172w = C1083k.m4945b(new a());

    /* JADX INFO: renamed from: x */
    final C1133o f5173x = new C1133o(this);

    /* JADX INFO: renamed from: A */
    boolean f5171A = true;

    /* JADX INFO: renamed from: androidx.fragment.app.h$a */
    class a extends AbstractC1085m implements InterfaceC0967c, InterfaceC0968d, InterfaceC2517p, InterfaceC2518q, InterfaceC1110K, InterfaceC0681I, InterfaceC1297e, InterfaceC1890d, InterfaceC1095w, InterfaceC0315v {
        public a() {
            super(AbstractActivityC1080h.this);
        }

        @Override // androidx.fragment.app.AbstractC1085m
        /* JADX INFO: renamed from: A */
        public void mo4933A() {
            m4934B();
        }

        /* JADX INFO: renamed from: B */
        public void m4934B() {
            AbstractActivityC1080h.this.invalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.AbstractC1085m
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC1080h mo4937u() {
            return AbstractActivityC1080h.this;
        }

        @Override // androidx.fragment.app.InterfaceC1095w
        /* JADX INFO: renamed from: a */
        public void mo4870a(FragmentManager fragmentManager, Fragment fragment) {
            AbstractActivityC1080h.this.m4931h0(fragment);
        }

        @Override // androidx.activity.InterfaceC0681I
        /* JADX INFO: renamed from: c */
        public OnBackPressedDispatcher mo2527c() {
            return AbstractActivityC1080h.this.mo2527c();
        }

        @Override // p161x.InterfaceC2517p
        /* JADX INFO: renamed from: d */
        public void mo2528d(InterfaceC0204a interfaceC0204a) {
            AbstractActivityC1080h.this.mo2528d(interfaceC0204a);
        }

        @Override // androidx.fragment.app.AbstractC1082j
        /* JADX INFO: renamed from: e */
        public View mo4736e(int i3) {
            return AbstractActivityC1080h.this.findViewById(i3);
        }

        @Override // androidx.core.content.InterfaceC0968d
        /* JADX INFO: renamed from: f */
        public void mo2529f(InterfaceC0204a interfaceC0204a) {
            AbstractActivityC1080h.this.mo2529f(interfaceC0204a);
        }

        @Override // androidx.fragment.app.AbstractC1082j
        /* JADX INFO: renamed from: g */
        public boolean mo4737g() {
            Window window = AbstractActivityC1080h.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.InterfaceC1132n
        public AbstractC1126h getLifecycle() {
            return AbstractActivityC1080h.this.f5173x;
        }

        @Override // p100f0.InterfaceC1890d
        public C1240a getSavedStateRegistry() {
            return AbstractActivityC1080h.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC1110K
        public C1109J getViewModelStore() {
            return AbstractActivityC1080h.this.getViewModelStore();
        }

        @Override // androidx.core.content.InterfaceC0968d
        /* JADX INFO: renamed from: i */
        public void mo2530i(InterfaceC0204a interfaceC0204a) {
            AbstractActivityC1080h.this.mo2530i(interfaceC0204a);
        }

        @Override // p161x.InterfaceC2518q
        /* JADX INFO: renamed from: j */
        public void mo2531j(InterfaceC0204a interfaceC0204a) {
            AbstractActivityC1080h.this.mo2531j(interfaceC0204a);
        }

        @Override // p027J.InterfaceC0315v
        /* JADX INFO: renamed from: k */
        public void mo1065k(InterfaceC0321y interfaceC0321y) {
            AbstractActivityC1080h.this.mo1065k(interfaceC0321y);
        }

        @Override // p161x.InterfaceC2517p
        /* JADX INFO: renamed from: l */
        public void mo2532l(InterfaceC0204a interfaceC0204a) {
            AbstractActivityC1080h.this.mo2532l(interfaceC0204a);
        }

        @Override // p027J.InterfaceC0315v
        /* JADX INFO: renamed from: n */
        public void mo1066n(InterfaceC0321y interfaceC0321y) {
            AbstractActivityC1080h.this.mo1066n(interfaceC0321y);
        }

        @Override // p161x.InterfaceC2518q
        /* JADX INFO: renamed from: p */
        public void mo2533p(InterfaceC0204a interfaceC0204a) {
            AbstractActivityC1080h.this.mo2533p(interfaceC0204a);
        }

        @Override // androidx.core.content.InterfaceC0967c
        /* JADX INFO: renamed from: q */
        public void mo2534q(InterfaceC0204a interfaceC0204a) {
            AbstractActivityC1080h.this.mo2534q(interfaceC0204a);
        }

        @Override // androidx.core.content.InterfaceC0967c
        /* JADX INFO: renamed from: r */
        public void mo2535r(InterfaceC0204a interfaceC0204a) {
            AbstractActivityC1080h.this.mo2535r(interfaceC0204a);
        }

        @Override // p083b.InterfaceC1297e
        /* JADX INFO: renamed from: s */
        public AbstractC1296d mo2536s() {
            return AbstractActivityC1080h.this.mo2536s();
        }

        @Override // androidx.fragment.app.AbstractC1085m
        /* JADX INFO: renamed from: t */
        public void mo4936t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC1080h.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC1085m
        /* JADX INFO: renamed from: v */
        public LayoutInflater mo4938v() {
            return AbstractActivityC1080h.this.getLayoutInflater().cloneInContext(AbstractActivityC1080h.this);
        }

        @Override // androidx.fragment.app.AbstractC1085m
        /* JADX INFO: renamed from: x */
        public boolean mo4939x(String str) {
            return AbstractC2503b.m11893e(AbstractActivityC1080h.this, str);
        }
    }

    public AbstractActivityC1080h() {
        m4925e0();
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ Bundle m4923a0(AbstractActivityC1080h abstractActivityC1080h) {
        abstractActivityC1080h.m4930f0();
        abstractActivityC1080h.f5173x.m5152h(AbstractC1126h.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: renamed from: e0 */
    private void m4925e0() {
        getSavedStateRegistry().m6295h("android:support:lifecycle", new C1240a.c() { // from class: androidx.fragment.app.d
            @Override // androidx.savedstate.C1240a.c
            /* JADX INFO: renamed from: a */
            public final Bundle mo2629a() {
                return AbstractActivityC1080h.m4923a0(this.f5167a);
            }
        });
        mo2535r(new InterfaceC0204a() { // from class: androidx.fragment.app.e
            @Override // p024I.InterfaceC0204a
            public final void accept(Object obj) {
                this.f5168a.f5172w.m4957m();
            }
        });
        m2520O(new InterfaceC0204a() { // from class: androidx.fragment.app.f
            @Override // p024I.InterfaceC0204a
            public final void accept(Object obj) {
                this.f5169a.f5172w.m4957m();
            }
        });
        m2519N(new InterfaceC0655b() { // from class: androidx.fragment.app.g
            @Override // p078a.InterfaceC0655b
            /* JADX INFO: renamed from: a */
            public final void mo2494a(Context context) {
                this.f5170a.f5172w.m4946a(null);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    private static boolean m4926g0(FragmentManager fragmentManager, AbstractC1126h.b bVar) {
        boolean zM4926g0 = false;
        for (Fragment fragment : fragmentManager.m4853t0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zM4926g0 |= m4926g0(fragment.getChildFragmentManager(), bVar);
                }
                C1036D c1036d = fragment.mViewLifecycleOwner;
                if (c1036d != null && c1036d.getLifecycle().mo5133b().m5141b(AbstractC1126h.b.STARTED)) {
                    fragment.mViewLifecycleOwner.m4688g(bVar);
                    zM4926g0 = true;
                }
                if (fragment.mLifecycleRegistry.mo5133b().m5141b(AbstractC1126h.b.STARTED)) {
                    fragment.mLifecycleRegistry.m5153m(bVar);
                    zM4926g0 = true;
                }
            }
        }
        return zM4926g0;
    }

    @Override // p161x.AbstractC2503b.d
    /* JADX INFO: renamed from: b */
    public final void mo4927b(int i3) {
    }

    /* JADX INFO: renamed from: c0 */
    final View m4928c0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f5172w.m4958n(view, str, context, attributeSet);
    }

    /* JADX INFO: renamed from: d0 */
    public FragmentManager m4929d0() {
        return this.f5172w.m4956l();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (m11921v(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f5174y);
            printWriter.print(" mResumed=");
            printWriter.print(this.f5175z);
            printWriter.print(" mStopped=");
            printWriter.print(this.f5171A);
            if (getApplication() != null) {
                AbstractC1145a.m5195b(this).mo5196a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f5172w.m4956l().m4821X(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: renamed from: f0 */
    void m4930f0() {
        while (m4926g0(m4929d0(), AbstractC1126h.b.CREATED)) {
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m4931h0(Fragment fragment) {
    }

    /* JADX INFO: renamed from: i0 */
    protected void m4932i0() {
        this.f5173x.m5152h(AbstractC1126h.a.ON_RESUME);
        this.f5172w.m4952h();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i3, int i4, Intent intent) {
        this.f5172w.m4957m();
        super.onActivityResult(i3, i4, intent);
    }

    @Override // androidx.activity.ComponentActivity, p161x.AbstractActivityC2508g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5173x.m5152h(AbstractC1126h.a.ON_CREATE);
        this.f5172w.m4949e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewM4928c0 = m4928c0(view, str, context, attributeSet);
        return viewM4928c0 == null ? super.onCreateView(view, str, context, attributeSet) : viewM4928c0;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f5172w.m4950f();
        this.f5173x.m5152h(AbstractC1126h.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 6) {
            return this.f5172w.m4948d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f5175z = false;
        this.f5172w.m4951g();
        this.f5173x.m5152h(AbstractC1126h.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        m4932i0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        this.f5172w.m4957m();
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f5172w.m4957m();
        super.onResume();
        this.f5175z = true;
        this.f5172w.m4955k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f5172w.m4957m();
        super.onStart();
        this.f5171A = false;
        if (!this.f5174y) {
            this.f5174y = true;
            this.f5172w.m4947c();
        }
        this.f5172w.m4955k();
        this.f5173x.m5152h(AbstractC1126h.a.ON_START);
        this.f5172w.m4953i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f5172w.m4957m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f5171A = true;
        m4930f0();
        this.f5172w.m4954j();
        this.f5173x.m5152h(AbstractC1126h.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewM4928c0 = m4928c0(null, str, context, attributeSet);
        return viewM4928c0 == null ? super.onCreateView(str, context, attributeSet) : viewM4928c0;
    }
}
