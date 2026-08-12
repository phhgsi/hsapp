package androidx.lifecycle;

import androidx.appcompat.app.AbstractC0740E;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p038M1.AbstractC0419m;
import p071X1.AbstractC0606k;
import p098e2.AbstractC1868d;

/* JADX INFO: renamed from: androidx.lifecycle.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1134p {

    /* JADX INFO: renamed from: a */
    public static final C1134p f5362a = new C1134p();

    /* JADX INFO: renamed from: b */
    private static final Map f5363b = new HashMap();

    /* JADX INFO: renamed from: c */
    private static final Map f5364c = new HashMap();

    private C1134p() {
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC1124f m5157a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            AbstractC0606k.m2144d(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            AbstractC0740E.m2693a(objNewInstance);
            return null;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private final Constructor m5158b(Class cls) {
        try {
            Package r12 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r12 != null ? r12.getName() : "";
            AbstractC0606k.m2144d(name, "fullPackage");
            if (name.length() != 0) {
                AbstractC0606k.m2144d(canonicalName, AppMeasurementSdk.ConditionalUserProperty.NAME);
                canonicalName = canonicalName.substring(name.length() + 1);
                AbstractC0606k.m2144d(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            AbstractC0606k.m2144d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strM5159c = m5159c(canonicalName);
            if (name.length() != 0) {
                strM5159c = name + '.' + strM5159c;
            }
            Class<?> cls2 = Class.forName(strM5159c);
            AbstractC0606k.m2143c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m5159c(String str) {
        AbstractC0606k.m2145e(str, "className");
        return AbstractC1868d.m9670g(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    /* JADX INFO: renamed from: d */
    private final int m5160d(Class cls) {
        Map map = f5363b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iM5163g = m5163g(cls);
        map.put(cls, Integer.valueOf(iM5163g));
        return iM5163g;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m5161e(Class cls) {
        return cls != null && InterfaceC1131m.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC1130l m5162f(Object obj) {
        AbstractC0606k.m2145e(obj, "object");
        boolean z2 = obj instanceof InterfaceC1130l;
        boolean z3 = obj instanceof InterfaceC1122d;
        if (z2 && z3) {
            return new DefaultLifecycleObserverAdapter((InterfaceC1122d) obj, (InterfaceC1130l) obj);
        }
        if (z3) {
            return new DefaultLifecycleObserverAdapter((InterfaceC1122d) obj, null);
        }
        if (z2) {
            return (InterfaceC1130l) obj;
        }
        Class<?> cls = obj.getClass();
        C1134p c1134p = f5362a;
        if (c1134p.m5160d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        Object obj2 = f5364c.get(cls);
        AbstractC0606k.m2142b(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            c1134p.m5157a((Constructor) list.get(0), obj);
            return new SingleGeneratedAdapterObserver(null);
        }
        int size = list.size();
        InterfaceC1124f[] interfaceC1124fArr = new InterfaceC1124f[size];
        for (int i3 = 0; i3 < size; i3++) {
            f5362a.m5157a((Constructor) list.get(i3), obj);
            interfaceC1124fArr[i3] = null;
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC1124fArr);
    }

    /* JADX INFO: renamed from: g */
    private final int m5163g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorM5158b = m5158b(cls);
        if (constructorM5158b != null) {
            f5364c.put(cls, AbstractC0419m.m1455b(constructorM5158b));
            return 2;
        }
        if (C1120b.f5333c.m5123d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (m5161e(superclass)) {
            AbstractC0606k.m2144d(superclass, "superclass");
            if (m5160d(superclass) == 1) {
                return 1;
            }
            Object obj = f5364c.get(superclass);
            AbstractC0606k.m2142b(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        AbstractC0606k.m2144d(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (m5161e(cls2)) {
                AbstractC0606k.m2144d(cls2, "intrface");
                if (m5160d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f5364c.get(cls2);
                AbstractC0606k.m2142b(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f5364c.put(cls, arrayList);
        return 2;
    }
}
