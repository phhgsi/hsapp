package p139p1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p002A1.InterfaceC0027b;

/* JADX INFO: renamed from: p1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2326g {

    /* JADX INFO: renamed from: a */
    private final Object f10740a;

    /* JADX INFO: renamed from: b */
    private final c f10741b;

    /* JADX INFO: renamed from: p1.g$b */
    private static class b implements c {

        /* JADX INFO: renamed from: a */
        private final Class f10742a;

        /* JADX INFO: renamed from: b */
        private Bundle m11130b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f10742a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f10742a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // p139p1.C2326g.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List mo11131a(Context context) {
            Bundle bundleM11130b = m11130b(context);
            if (bundleM11130b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleM11130b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleM11130b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class cls) {
            this.f10742a = cls;
        }
    }

    /* JADX INFO: renamed from: p1.g$c */
    interface c {
        /* JADX INFO: renamed from: a */
        List mo11131a(Object obj);
    }

    C2326g(Object obj, c cVar) {
        this.f10740a = obj;
        this.f10741b = cVar;
    }

    /* JADX INFO: renamed from: c */
    public static C2326g m11127c(Context context, Class cls) {
        return new C2326g(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static ComponentRegistrar m11128d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new C2342w(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e3) {
            throw new C2342w(String.format("Could not instantiate %s.", str), e3);
        } catch (InstantiationException e4) {
            throw new C2342w(String.format("Could not instantiate %s.", str), e4);
        } catch (NoSuchMethodException e5) {
            throw new C2342w(String.format("Could not instantiate %s", str), e5);
        } catch (InvocationTargetException e6) {
            throw new C2342w(String.format("Could not instantiate %s", str), e6);
        }
    }

    /* JADX INFO: renamed from: b */
    public List m11129b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f10741b.mo11131a(this.f10740a)) {
            arrayList.add(new InterfaceC0027b() { // from class: p1.f
                @Override // p002A1.InterfaceC0027b
                public final Object get() {
                    return C2326g.m11128d(str);
                }
            });
        }
        return arrayList;
    }
}
