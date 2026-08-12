package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p038M1.AbstractC0413g;
import p038M1.AbstractC0419m;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.lifecycle.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1104E {

    /* JADX INFO: renamed from: a */
    private static final List f5268a = AbstractC0419m.m1461h(Application.class, C1144z.class);

    /* JADX INFO: renamed from: b */
    private static final List f5269b = AbstractC0419m.m1455b(C1144z.class);

    /* JADX INFO: renamed from: c */
    public static final Constructor m5069c(Class cls, List list) {
        AbstractC0606k.m2145e(cls, "modelClass");
        AbstractC0606k.m2145e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC0606k.m2144d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC0606k.m2144d(parameterTypes, "constructor.parameterTypes");
            List listS = AbstractC0413g.m1451s(parameterTypes);
            if (AbstractC0606k.m2141a(list, listS)) {
                AbstractC0606k.m2143c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == listS.size() && listS.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC1105F m5070d(Class cls, Constructor constructor, Object... objArr) {
        AbstractC0606k.m2145e(cls, "modelClass");
        AbstractC0606k.m2145e(constructor, "constructor");
        AbstractC0606k.m2145e(objArr, "params");
        try {
            return (AbstractC1105F) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Failed to access " + cls, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e5.getCause());
        }
    }
}
