package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.lifecycle.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1129k {

    /* JADX INFO: renamed from: a */
    public static final C1129k f5349a = new C1129k();

    /* JADX INFO: renamed from: b */
    private static final AtomicBoolean f5350b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    public static final class a extends AbstractC1123e {
        @Override // androidx.lifecycle.AbstractC1123e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC0606k.m2145e(activity, "activity");
            FragmentC1141w.f5379b.m5185c(activity);
        }
    }

    private C1129k() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m5142a(Context context) {
        AbstractC0606k.m2145e(context, "context");
        if (f5350b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        AbstractC0606k.m2143c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
