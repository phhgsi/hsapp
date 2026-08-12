package p018G;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import p018G.C0172u;
import p035L1.AbstractC0376h;
import p035L1.InterfaceC0375g;
import p068W1.InterfaceC0566a;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: G.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0172u {

    /* JADX INFO: renamed from: a */
    private final b f1120a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G.u$b */
    static class b {

        /* JADX INFO: renamed from: a */
        private final Activity f1122a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0375g f1123b;

        public b(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
            this.f1122a = activity;
            this.f1123b = AbstractC0376h.m1364a(new InterfaceC0566a() { // from class: G.s
                @Override // p068W1.InterfaceC0566a
                /* JADX INFO: renamed from: a */
                public final Object mo464a() {
                    return C0172u.b.m475b(this.f1119d);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final ViewGroup m475b(b bVar) {
            View viewInflate = View.inflate(bVar.f1122a, AbstractC0157f.f1092a, null);
            AbstractC0606k.m2143c(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
            return (ViewGroup) viewInflate;
        }

        /* JADX INFO: renamed from: f */
        private final ViewGroup m476f() {
            return (ViewGroup) this.f1123b.getValue();
        }

        /* JADX INFO: renamed from: c */
        public void mo468c() {
            View rootView = ((ViewGroup) this.f1122a.findViewById(R.id.content)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView(m476f());
            }
        }

        /* JADX INFO: renamed from: d */
        public final Activity m477d() {
            return this.f1122a;
        }

        /* JADX INFO: renamed from: e */
        public ViewGroup mo469e() {
            return m476f();
        }

        /* JADX INFO: renamed from: g */
        public void mo470g() {
            ViewParent parent = mo469e().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(mo469e());
            }
        }
    }

    public C0172u(Activity activity) {
        AbstractC0606k.m2145e(activity, "ctx");
        b aVar = Build.VERSION.SDK_INT >= 31 ? new a(activity) : new b(activity);
        aVar.mo468c();
        this.f1120a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final View m466a() {
        return this.f1120a.mo469e();
    }

    /* JADX INFO: renamed from: b */
    public final void m467b() {
        this.f1120a.mo470g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0172u(SplashScreenView splashScreenView, Activity activity) {
        this(activity);
        AbstractC0606k.m2145e(splashScreenView, "platformView");
        AbstractC0606k.m2145e(activity, "ctx");
        b bVar = this.f1120a;
        AbstractC0606k.m2143c(bVar, "null cannot be cast to non-null type androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl31");
        ((a) bVar).m473j(splashScreenView);
    }

    /* JADX INFO: renamed from: G.u$a */
    private static final class a extends b {

        /* JADX INFO: renamed from: c */
        public SplashScreenView f1121c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(activity);
            AbstractC0606k.m2145e(activity, "activity");
        }

        @Override // p018G.C0172u.b
        /* JADX INFO: renamed from: g */
        public void mo470g() {
            m471h().remove();
            if (Build.VERSION.SDK_INT < 33) {
                Resources.Theme theme = m477d().getTheme();
                AbstractC0606k.m2144d(theme, "getTheme(...)");
                View decorView = m477d().getWindow().getDecorView();
                AbstractC0606k.m2144d(decorView, "getDecorView(...)");
                C0175x.m481b(theme, decorView, null, 4, null);
            }
        }

        /* JADX INFO: renamed from: h */
        public final SplashScreenView m471h() {
            SplashScreenView splashScreenView = this.f1121c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            AbstractC0606k.m2154n("platformView");
            return null;
        }

        @Override // p018G.C0172u.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public SplashScreenView mo469e() {
            return m471h();
        }

        /* JADX INFO: renamed from: j */
        public final void m473j(SplashScreenView splashScreenView) {
            AbstractC0606k.m2145e(splashScreenView, "<set-?>");
            this.f1121c = splashScreenView;
        }

        @Override // p018G.C0172u.b
        /* JADX INFO: renamed from: c */
        public void mo468c() {
        }
    }
}
