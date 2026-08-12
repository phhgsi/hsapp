package p153u0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: u0.k */
/* JADX INFO: loaded from: classes.dex */
class C2466k implements InterfaceC2460e {

    /* JADX INFO: renamed from: a */
    private final a f11458a;

    /* JADX INFO: renamed from: b */
    private final C2464i f11459b;

    /* JADX INFO: renamed from: c */
    private final Map f11460c;

    /* JADX INFO: renamed from: u0.k$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private final Context f11461a;

        /* JADX INFO: renamed from: b */
        private Map f11462b = null;

        a(Context context) {
            this.f11461a = context;
        }

        /* JADX INFO: renamed from: a */
        private Map m11777a(Context context) {
            Bundle bundleM11779d = m11779d(context);
            if (bundleM11779d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleM11779d.keySet()) {
                Object obj = bundleM11779d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        /* JADX INFO: renamed from: c */
        private Map m11778c() {
            if (this.f11462b == null) {
                this.f11462b = m11777a(this.f11461a);
            }
            return this.f11462b;
        }

        /* JADX INFO: renamed from: d */
        private static Bundle m11779d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        InterfaceC2459d m11780b(String str) {
            String str2 = (String) m11778c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC2459d) Class.forName(str2).asSubclass(InterfaceC2459d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e3) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e3);
                return null;
            } catch (IllegalAccessException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e4);
                return null;
            } catch (InstantiationException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e5);
                return null;
            } catch (NoSuchMethodException e6) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e6);
                return null;
            } catch (InvocationTargetException e7) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e7);
                return null;
            }
        }
    }

    C2466k(Context context, C2464i c2464i) {
        this(new a(context), c2464i);
    }

    @Override // p153u0.InterfaceC2460e
    /* JADX INFO: renamed from: a */
    public synchronized InterfaceC2468m mo11766a(String str) {
        if (this.f11460c.containsKey(str)) {
            return (InterfaceC2468m) this.f11460c.get(str);
        }
        InterfaceC2459d interfaceC2459dM11780b = this.f11458a.m11780b(str);
        if (interfaceC2459dM11780b == null) {
            return null;
        }
        InterfaceC2468m interfaceC2468mCreate = interfaceC2459dM11780b.create(this.f11459b.m11773a(str));
        this.f11460c.put(str, interfaceC2468mCreate);
        return interfaceC2468mCreate;
    }

    C2466k(a aVar, C2464i c2464i) {
        this.f11460c = new HashMap();
        this.f11458a = aVar;
        this.f11459b = c2464i;
    }
}
