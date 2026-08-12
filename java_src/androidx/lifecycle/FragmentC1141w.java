package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1126h;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.lifecycle.w */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC1141w extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final b f5379b = new b(null);

    /* JADX INFO: renamed from: a */
    private a f5380a;

    /* JADX INFO: renamed from: androidx.lifecycle.w$a */
    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* JADX INFO: renamed from: androidx.lifecycle.w$b */
    public static final class b {
        public /* synthetic */ b(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m5183a(Activity activity, AbstractC1126h.a aVar) {
            AbstractC0606k.m2145e(activity, "activity");
            AbstractC0606k.m2145e(aVar, "event");
            if (activity instanceof InterfaceC1132n) {
                AbstractC1126h lifecycle = ((InterfaceC1132n) activity).getLifecycle();
                if (lifecycle instanceof C1133o) {
                    ((C1133o) lifecycle).m5152h(aVar);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final FragmentC1141w m5184b(Activity activity) {
            AbstractC0606k.m2145e(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC0606k.m2143c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (FragmentC1141w) fragmentFindFragmentByTag;
        }

        /* JADX INFO: renamed from: c */
        public final void m5185c(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.m5186a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC1141w(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.w$c */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        /* JADX INFO: renamed from: androidx.lifecycle.w$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC0602g abstractC0602g) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final void m5186a(Activity activity) {
                AbstractC0606k.m2145e(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }

            private a() {
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.m5186a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC0606k.m2145e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC0606k.m2145e(activity, "activity");
            FragmentC1141w.f5379b.m5183a(activity, AbstractC1126h.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
            FragmentC1141w.f5379b.m5183a(activity, AbstractC1126h.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
            FragmentC1141w.f5379b.m5183a(activity, AbstractC1126h.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
            FragmentC1141w.f5379b.m5183a(activity, AbstractC1126h.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
            FragmentC1141w.f5379b.m5183a(activity, AbstractC1126h.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
            FragmentC1141w.f5379b.m5183a(activity, AbstractC1126h.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC0606k.m2145e(activity, "activity");
            AbstractC0606k.m2145e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m5178a(AbstractC1126h.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f5379b;
            Activity activity = getActivity();
            AbstractC0606k.m2144d(activity, "activity");
            bVar.m5183a(activity, aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m5179b(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m5180c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m5181d(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5182e(a aVar) {
        this.f5380a = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m5179b(this.f5380a);
        m5178a(AbstractC1126h.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m5178a(AbstractC1126h.a.ON_DESTROY);
        this.f5380a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m5178a(AbstractC1126h.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m5180c(this.f5380a);
        m5178a(AbstractC1126h.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m5181d(this.f5380a);
        m5178a(AbstractC1126h.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m5178a(AbstractC1126h.a.ON_STOP);
    }
}
