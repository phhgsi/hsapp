package androidx.lifecycle;

import androidx.lifecycle.AbstractC1126h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: loaded from: classes.dex */
final class C1120b {

    /* JADX INFO: renamed from: c */
    static C1120b f5333c = new C1120b();

    /* JADX INFO: renamed from: a */
    private final Map f5334a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f5335b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.b$a */
    static class a {

        /* JADX INFO: renamed from: a */
        final Map f5336a = new HashMap();

        /* JADX INFO: renamed from: b */
        final Map f5337b;

        a(Map map) {
            this.f5337b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1126h.a aVar = (AbstractC1126h.a) entry.getValue();
                List arrayList = (List) this.f5336a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f5336a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        /* JADX INFO: renamed from: b */
        private static void m5124b(List list, InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).m5126a(interfaceC1132n, aVar, obj);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void m5125a(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar, Object obj) {
            m5124b((List) this.f5336a.get(aVar), interfaceC1132n, aVar, obj);
            m5124b((List) this.f5336a.get(AbstractC1126h.a.ON_ANY), interfaceC1132n, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b$b */
    static final class b {

        /* JADX INFO: renamed from: a */
        final int f5338a;

        /* JADX INFO: renamed from: b */
        final Method f5339b;

        b(int i3, Method method) {
            this.f5338a = i3;
            this.f5339b = method;
            method.setAccessible(true);
        }

        /* JADX INFO: renamed from: a */
        void m5126a(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar, Object obj) {
            try {
                int i3 = this.f5338a;
                if (i3 == 0) {
                    this.f5339b.invoke(obj, null);
                } else if (i3 == 1) {
                    this.f5339b.invoke(obj, interfaceC1132n);
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    this.f5339b.invoke(obj, interfaceC1132n, aVar);
                }
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to call observer method", e4.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5338a == bVar.f5338a && this.f5339b.getName().equals(bVar.f5339b.getName());
        }

        public int hashCode() {
            return (this.f5338a * 31) + this.f5339b.getName().hashCode();
        }
    }

    C1120b() {
    }

    /* JADX INFO: renamed from: a */
    private a m5119a(Class cls, Method[] methodArr) {
        int i3;
        a aVarM5122c;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarM5122c = m5122c(superclass)) != null) {
            map.putAll(aVarM5122c.f5337b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m5122c(cls2).f5337b.entrySet()) {
                m5121e(map, (b) entry.getKey(), (AbstractC1126h.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m5120b(cls);
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            InterfaceC1138t interfaceC1138t = (InterfaceC1138t) method.getAnnotation(InterfaceC1138t.class);
            if (interfaceC1138t != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!InterfaceC1132n.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                AbstractC1126h.a aVarValue = interfaceC1138t.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1126h.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC1126h.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m5121e(map, new b(i3, method), aVarValue, cls);
                z2 = true;
            }
        }
        a aVar = new a(map);
        this.f5334a.put(cls, aVar);
        this.f5335b.put(cls, Boolean.valueOf(z2));
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    private Method[] m5120b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e3) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m5121e(Map map, b bVar, AbstractC1126h.a aVar, Class cls) {
        AbstractC1126h.a aVar2 = (AbstractC1126h.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f5339b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* JADX INFO: renamed from: c */
    a m5122c(Class cls) {
        a aVar = (a) this.f5334a.get(cls);
        return aVar != null ? aVar : m5119a(cls, null);
    }

    /* JADX INFO: renamed from: d */
    boolean m5123d(Class cls) {
        Boolean bool = (Boolean) this.f5335b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrM5120b = m5120b(cls);
        for (Method method : methodArrM5120b) {
            if (((InterfaceC1138t) method.getAnnotation(InterfaceC1138t.class)) != null) {
                m5119a(cls, methodArrM5120b);
                return true;
            }
        }
        this.f5335b.put(cls, Boolean.FALSE);
        return false;
    }
}
