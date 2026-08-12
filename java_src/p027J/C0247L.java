package p027J;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: J.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0247L {

    /* JADX INFO: renamed from: a */
    private final c f1262a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J.L$a */
    static class a extends c {

        /* JADX INFO: renamed from: a */
        private final View f1263a;

        a(View view) {
            this.f1263a = view;
        }

        @Override // p027J.C0247L.c
        /* JADX INFO: renamed from: a */
        void mo681a() {
            View view = this.f1263a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f1263a.getWindowToken(), 0);
            }
        }

        @Override // p027J.C0247L.c
        /* JADX INFO: renamed from: b */
        void mo682b() {
            final View viewFindViewById = this.f1263a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f1263a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: J.K
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J.L$c */
    private static class c {
        c() {
        }

        /* JADX INFO: renamed from: a */
        abstract void mo681a();

        /* JADX INFO: renamed from: b */
        abstract void mo682b();
    }

    public C0247L(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1262a = new b(view);
        } else {
            this.f1262a = new a(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m678a() {
        this.f1262a.mo681a();
    }

    /* JADX INFO: renamed from: b */
    public void m679b() {
        this.f1262a.mo682b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J.L$b */
    static class b extends a {

        /* JADX INFO: renamed from: b */
        private View f1264b;

        /* JADX INFO: renamed from: c */
        private WindowInsetsController f1265c;

        b(View view) {
            super(view);
            this.f1264b = view;
        }

        @Override // p027J.C0247L.a, p027J.C0247L.c
        /* JADX INFO: renamed from: a */
        void mo681a() {
            View view;
            WindowInsetsController windowInsetsController = this.f1265c;
            if (windowInsetsController == null) {
                View view2 = this.f1264b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.mo681a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: J.S
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i3) {
                    atomicBoolean.set((i3 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f1264b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f1264b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // p027J.C0247L.a, p027J.C0247L.c
        /* JADX INFO: renamed from: b */
        void mo682b() {
            View view = this.f1264b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f1265c;
            if (windowInsetsController == null) {
                View view2 = this.f1264b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.mo682b();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f1265c = windowInsetsController;
        }
    }

    C0247L(WindowInsetsController windowInsetsController) {
        this.f1262a = new b(windowInsetsController);
    }
}
