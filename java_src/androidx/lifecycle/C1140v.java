package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.FragmentC1141w;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.lifecycle.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1140v implements InterfaceC1132n {

    /* JADX INFO: renamed from: i */
    public static final b f5367i = new b(null);

    /* JADX INFO: renamed from: j */
    private static final C1140v f5368j = new C1140v();

    /* JADX INFO: renamed from: a */
    private int f5369a;

    /* JADX INFO: renamed from: b */
    private int f5370b;

    /* JADX INFO: renamed from: e */
    private Handler f5373e;

    /* JADX INFO: renamed from: c */
    private boolean f5371c = true;

    /* JADX INFO: renamed from: d */
    private boolean f5372d = true;

    /* JADX INFO: renamed from: f */
    private final C1133o f5374f = new C1133o(this);

    /* JADX INFO: renamed from: g */
    private final Runnable f5375g = new Runnable() { // from class: androidx.lifecycle.u
        @Override // java.lang.Runnable
        public final void run() {
            C1140v.m5167j(this.f5366d);
        }
    };

    /* JADX INFO: renamed from: h */
    private final FragmentC1141w.a f5376h = new d();

    /* JADX INFO: renamed from: androidx.lifecycle.v$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f5377a = new a();

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public static final void m5175a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            AbstractC0606k.m2145e(activity, "activity");
            AbstractC0606k.m2145e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.v$b */
    public static final class b {
        public /* synthetic */ b(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC1132n m5176a() {
            return C1140v.f5368j;
        }

        /* JADX INFO: renamed from: b */
        public final void m5177b(Context context) {
            AbstractC0606k.m2145e(context, "context");
            C1140v.f5368j.m5172i(context);
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.v$c */
    public static final class c extends AbstractC1123e {

        /* JADX INFO: renamed from: androidx.lifecycle.v$c$a */
        public static final class a extends AbstractC1123e {
            final /* synthetic */ C1140v this$0;

            a(C1140v c1140v) {
                this.this$0 = c1140v;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                AbstractC0606k.m2145e(activity, "activity");
                this.this$0.m5169f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                AbstractC0606k.m2145e(activity, "activity");
                this.this$0.m5170g();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC1123e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC0606k.m2145e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC1141w.f5379b.m5184b(activity).m5182e(C1140v.this.f5376h);
            }
        }

        @Override // androidx.lifecycle.AbstractC1123e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
            C1140v.this.m5168e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            AbstractC0606k.m2145e(activity, "activity");
            a.m5175a(activity, new a(C1140v.this));
        }

        @Override // androidx.lifecycle.AbstractC1123e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
            C1140v.this.m5171h();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.v$d */
    public static final class d implements FragmentC1141w.a {
        d() {
        }

        @Override // androidx.lifecycle.FragmentC1141w.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.FragmentC1141w.a
        public void onResume() {
            C1140v.this.m5169f();
        }

        @Override // androidx.lifecycle.FragmentC1141w.a
        public void onStart() {
            C1140v.this.m5170g();
        }
    }

    private C1140v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m5167j(C1140v c1140v) {
        AbstractC0606k.m2145e(c1140v, "this$0");
        c1140v.m5173k();
        c1140v.m5174l();
    }

    /* JADX INFO: renamed from: e */
    public final void m5168e() {
        int i3 = this.f5370b - 1;
        this.f5370b = i3;
        if (i3 == 0) {
            Handler handler = this.f5373e;
            AbstractC0606k.m2142b(handler);
            handler.postDelayed(this.f5375g, 700L);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5169f() {
        int i3 = this.f5370b + 1;
        this.f5370b = i3;
        if (i3 == 1) {
            if (this.f5371c) {
                this.f5374f.m5152h(AbstractC1126h.a.ON_RESUME);
                this.f5371c = false;
            } else {
                Handler handler = this.f5373e;
                AbstractC0606k.m2142b(handler);
                handler.removeCallbacks(this.f5375g);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5170g() {
        int i3 = this.f5369a + 1;
        this.f5369a = i3;
        if (i3 == 1 && this.f5372d) {
            this.f5374f.m5152h(AbstractC1126h.a.ON_START);
            this.f5372d = false;
        }
    }

    @Override // androidx.lifecycle.InterfaceC1132n
    public AbstractC1126h getLifecycle() {
        return this.f5374f;
    }

    /* JADX INFO: renamed from: h */
    public final void m5171h() {
        this.f5369a--;
        m5174l();
    }

    /* JADX INFO: renamed from: i */
    public final void m5172i(Context context) {
        AbstractC0606k.m2145e(context, "context");
        this.f5373e = new Handler();
        this.f5374f.m5152h(AbstractC1126h.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        AbstractC0606k.m2143c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* JADX INFO: renamed from: k */
    public final void m5173k() {
        if (this.f5370b == 0) {
            this.f5371c = true;
            this.f5374f.m5152h(AbstractC1126h.a.ON_PAUSE);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5174l() {
        if (this.f5369a == 0 && this.f5371c) {
            this.f5374f.m5152h(AbstractC1126h.a.ON_STOP);
            this.f5372d = true;
        }
    }
}
