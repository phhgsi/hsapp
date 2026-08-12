package p161x;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: x.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2505d {

    /* JADX INFO: renamed from: a */
    protected static final Class f11675a;

    /* JADX INFO: renamed from: b */
    protected static final Field f11676b;

    /* JADX INFO: renamed from: c */
    protected static final Field f11677c;

    /* JADX INFO: renamed from: d */
    protected static final Method f11678d;

    /* JADX INFO: renamed from: e */
    protected static final Method f11679e;

    /* JADX INFO: renamed from: f */
    protected static final Method f11680f;

    /* JADX INFO: renamed from: g */
    private static final Handler f11681g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: x.d$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ d f11682d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Object f11683e;

        a(d dVar, Object obj) {
            this.f11682d = dVar;
            this.f11683e = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11682d.f11688a = this.f11683e;
        }
    }

    /* JADX INFO: renamed from: x.d$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Application f11684d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ d f11685e;

        b(Application application, d dVar) {
            this.f11684d = application;
            this.f11685e = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11684d.unregisterActivityLifecycleCallbacks(this.f11685e);
        }
    }

    /* JADX INFO: renamed from: x.d$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Object f11686d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Object f11687e;

        c(Object obj, Object obj2) {
            this.f11686d = obj;
            this.f11687e = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = AbstractC2505d.f11678d;
                if (method != null) {
                    method.invoke(this.f11686d, this.f11687e, Boolean.FALSE, "AppCompat recreation");
                } else {
                    AbstractC2505d.f11679e.invoke(this.f11686d, this.f11687e, Boolean.FALSE);
                }
            } catch (RuntimeException e3) {
                if (e3.getClass() == RuntimeException.class && e3.getMessage() != null && e3.getMessage().startsWith("Unable to stop")) {
                    throw e3;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class clsM11900a = m11900a();
        f11675a = clsM11900a;
        f11676b = m11901b();
        f11677c = m11905f();
        f11678d = m11903d(clsM11900a);
        f11679e = m11902c(clsM11900a);
        f11680f = m11904e(clsM11900a);
    }

    /* JADX INFO: renamed from: a */
    private static Class m11900a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static Field m11901b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static Method m11902c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static Method m11903d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static Method m11904e(Class cls) {
        if (m11906g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static Field m11905f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m11906g() {
        int i3 = Build.VERSION.SDK_INT;
        return i3 == 26 || i3 == 27;
    }

    /* JADX INFO: renamed from: h */
    protected static boolean m11907h(Object obj, int i3, Activity activity) {
        try {
            Object obj2 = f11677c.get(activity);
            if (obj2 == obj && activity.hashCode() == i3) {
                f11681g.postAtFrontOfQueue(new c(f11676b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    static boolean m11908i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m11906g() && f11680f == null) {
            return false;
        }
        if (f11679e == null && f11678d == null) {
            return false;
        }
        try {
            Object obj2 = f11677c.get(activity);
            if (obj2 == null || (obj = f11676b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f11681g;
            handler.post(new a(dVar, obj2));
            try {
                if (m11906g()) {
                    Method method = f11680f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f11681g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: x.d$d */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        Object f11688a;

        /* JADX INFO: renamed from: b */
        private Activity f11689b;

        /* JADX INFO: renamed from: c */
        private final int f11690c;

        /* JADX INFO: renamed from: d */
        private boolean f11691d = false;

        /* JADX INFO: renamed from: e */
        private boolean f11692e = false;

        /* JADX INFO: renamed from: f */
        private boolean f11693f = false;

        d(Activity activity) {
            this.f11689b = activity;
            this.f11690c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f11689b == activity) {
                this.f11689b = null;
                this.f11692e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f11692e || this.f11693f || this.f11691d || !AbstractC2505d.m11907h(this.f11688a, this.f11690c, activity)) {
                return;
            }
            this.f11693f = true;
            this.f11688a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f11689b == activity) {
                this.f11691d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
