package p167z;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: z.z */
/* JADX INFO: loaded from: classes.dex */
public class C2593z extends C2592y {
    @Override // p167z.C2592y
    /* JADX INFO: renamed from: j */
    protected Typeface mo12337j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f11921g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f11927m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // p167z.C2592y
    /* JADX INFO: renamed from: v */
    protected Method mo12341v(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
