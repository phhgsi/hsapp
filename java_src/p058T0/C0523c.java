package p058T0;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0702b;
import java.util.Objects;

/* JADX INFO: renamed from: T0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0523c {

    /* JADX INFO: renamed from: a */
    private final d f1783a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0522b f1784b;

    /* JADX INFO: renamed from: c */
    private final View f1785c;

    /* JADX INFO: renamed from: T0.c$b */
    private static class b implements d {

        /* JADX INFO: renamed from: a */
        private OnBackInvokedCallback f1786a;

        private b() {
        }

        @Override // p058T0.C0523c.d
        /* JADX INFO: renamed from: a */
        public void mo1886a(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f1786a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f1786a);
            this.f1786a = null;
        }

        @Override // p058T0.C0523c.d
        /* JADX INFO: renamed from: b */
        public void mo1887b(InterfaceC0522b interfaceC0522b, View view, boolean z2) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f1786a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackMo1888c = mo1888c(interfaceC0522b);
                this.f1786a = onBackInvokedCallbackMo1888c;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z2 ? 1000000 : 0, onBackInvokedCallbackMo1888c);
            }
        }

        /* JADX INFO: renamed from: c */
        OnBackInvokedCallback mo1888c(final InterfaceC0522b interfaceC0522b) {
            Objects.requireNonNull(interfaceC0522b);
            return new OnBackInvokedCallback() { // from class: T0.e
                public final void onBackInvoked() {
                    interfaceC0522b.mo1877a();
                }
            };
        }

        /* JADX INFO: renamed from: d */
        boolean m1889d() {
            return this.f1786a != null;
        }
    }

    /* JADX INFO: renamed from: T0.c$c */
    private static class c extends b {

        /* JADX INFO: renamed from: T0.c$c$a */
        class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC0522b f1787a;

            a(InterfaceC0522b interfaceC0522b) {
                this.f1787a = interfaceC0522b;
            }

            public void onBackCancelled() {
                if (c.this.m1889d()) {
                    this.f1787a.mo1880d();
                }
            }

            public void onBackInvoked() {
                this.f1787a.mo1877a();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (c.this.m1889d()) {
                    this.f1787a.mo1879c(new C0702b(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (c.this.m1889d()) {
                    this.f1787a.mo1878b(new C0702b(backEvent));
                }
            }
        }

        private c() {
            super();
        }

        @Override // p058T0.C0523c.b
        /* JADX INFO: renamed from: c */
        OnBackInvokedCallback mo1888c(InterfaceC0522b interfaceC0522b) {
            return new a(interfaceC0522b);
        }
    }

    /* JADX INFO: renamed from: T0.c$d */
    private interface d {
        /* JADX INFO: renamed from: a */
        void mo1886a(View view);

        /* JADX INFO: renamed from: b */
        void mo1887b(InterfaceC0522b interfaceC0522b, View view, boolean z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0523c(View view) {
        this((InterfaceC0522b) view, view);
    }

    /* JADX INFO: renamed from: a */
    private static d m1881a() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            return new c();
        }
        if (i3 >= 33) {
            return new b();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private void m1882c(boolean z2) {
        d dVar = this.f1783a;
        if (dVar != null) {
            dVar.mo1887b(this.f1784b, this.f1785c, z2);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m1883b() {
        return this.f1783a != null;
    }

    /* JADX INFO: renamed from: d */
    public void m1884d() {
        m1882c(true);
    }

    /* JADX INFO: renamed from: e */
    public void m1885e() {
        d dVar = this.f1783a;
        if (dVar != null) {
            dVar.mo1886a(this.f1785c);
        }
    }

    public C0523c(InterfaceC0522b interfaceC0522b, View view) {
        this.f1783a = m1881a();
        this.f1784b = interfaceC0522b;
        this.f1785c = view;
    }
}
