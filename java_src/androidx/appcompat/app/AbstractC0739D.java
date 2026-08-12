package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: androidx.appcompat.app.D */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0739D {

    /* JADX INFO: renamed from: a */
    private static Field f2587a;

    /* JADX INFO: renamed from: b */
    private static boolean f2588b;

    /* JADX INFO: renamed from: c */
    private static Class f2589c;

    /* JADX INFO: renamed from: d */
    private static boolean f2590d;

    /* JADX INFO: renamed from: e */
    private static Field f2591e;

    /* JADX INFO: renamed from: f */
    private static boolean f2592f;

    /* JADX INFO: renamed from: g */
    private static Field f2593g;

    /* JADX INFO: renamed from: h */
    private static boolean f2594h;

    /* JADX INFO: renamed from: a */
    static void m2689a(Resources resources) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return;
        }
        if (i3 >= 24) {
            m2691c(resources);
        } else {
            m2690b(resources);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m2690b(Resources resources) {
        Object obj;
        if (!f2588b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2587a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e3);
            }
            f2588b = true;
        }
        Field field = f2587a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e4);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        m2692d(obj);
    }

    /* JADX INFO: renamed from: c */
    private static void m2691c(Resources resources) {
        Object obj;
        if (!f2594h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f2593g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e3);
            }
            f2594h = true;
        }
        Field field = f2593g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e4);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f2588b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f2587a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e5);
            }
            f2588b = true;
        }
        Field field2 = f2587a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e6) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e6);
            }
        }
        if (obj2 != null) {
            m2692d(obj2);
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m2692d(Object obj) {
        LongSparseArray longSparseArray;
        if (!f2590d) {
            try {
                f2589c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e3) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e3);
            }
            f2590d = true;
        }
        Class cls = f2589c;
        if (cls == null) {
            return;
        }
        if (!f2592f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f2591e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e4);
            }
            f2592f = true;
        }
        Field field = f2591e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e5) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e5);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
