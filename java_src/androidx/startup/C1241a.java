package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p104g0.AbstractC1976b;
import p104g0.C1977c;
import p104g0.InterfaceC1975a;
import p112i0.AbstractC2025a;

/* JADX INFO: renamed from: androidx.startup.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1241a {

    /* JADX INFO: renamed from: d */
    private static volatile C1241a f6050d;

    /* JADX INFO: renamed from: e */
    private static final Object f6051e = new Object();

    /* JADX INFO: renamed from: c */
    final Context f6054c;

    /* JADX INFO: renamed from: b */
    final Set f6053b = new HashSet();

    /* JADX INFO: renamed from: a */
    final Map f6052a = new HashMap();

    C1241a(Context context) {
        this.f6054c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: d */
    private Object m6297d(Class cls, Set set) {
        Object objMo4491b;
        if (AbstractC2025a.m10213d()) {
            try {
                AbstractC2025a.m10210a(cls.getSimpleName());
            } catch (Throwable th) {
                AbstractC2025a.m10211b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f6052a.containsKey(cls)) {
            objMo4491b = this.f6052a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC1975a interfaceC1975a = (InterfaceC1975a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo4490a = interfaceC1975a.mo4490a();
                if (!listMo4490a.isEmpty()) {
                    for (Class cls2 : listMo4490a) {
                        if (!this.f6052a.containsKey(cls2)) {
                            m6297d(cls2, set);
                        }
                    }
                }
                objMo4491b = interfaceC1975a.mo4491b(this.f6054c);
                set.remove(cls);
                this.f6052a.put(cls, objMo4491b);
            } catch (Throwable th2) {
                throw new C1977c(th2);
            }
        }
        AbstractC2025a.m10211b();
        return objMo4491b;
    }

    /* JADX INFO: renamed from: e */
    public static C1241a m6298e(Context context) {
        if (f6050d == null) {
            synchronized (f6051e) {
                try {
                    if (f6050d == null) {
                        f6050d = new C1241a(context);
                    }
                } finally {
                }
            }
        }
        return f6050d;
    }

    /* JADX INFO: renamed from: a */
    void m6299a() {
        try {
            try {
                AbstractC2025a.m10210a("Startup");
                m6300b(this.f6054c.getPackageManager().getProviderInfo(new ComponentName(this.f6054c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e3) {
                throw new C1977c(e3);
            }
        } finally {
            AbstractC2025a.m10211b();
        }
    }

    /* JADX INFO: renamed from: b */
    void m6300b(Bundle bundle) {
        String string = this.f6054c.getString(AbstractC1976b.f9510a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC1975a.class.isAssignableFrom(cls)) {
                            this.f6053b.add(cls);
                        }
                    }
                }
                Iterator it = this.f6053b.iterator();
                while (it.hasNext()) {
                    m6297d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e3) {
                throw new C1977c(e3);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    Object m6301c(Class cls) {
        Object objM6297d;
        synchronized (f6051e) {
            try {
                objM6297d = this.f6052a.get(cls);
                if (objM6297d == null) {
                    objM6297d = m6297d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objM6297d;
    }

    /* JADX INFO: renamed from: f */
    public Object m6302f(Class cls) {
        return m6301c(cls);
    }

    /* JADX INFO: renamed from: g */
    public boolean m6303g(Class cls) {
        return this.f6053b.contains(cls);
    }
}
