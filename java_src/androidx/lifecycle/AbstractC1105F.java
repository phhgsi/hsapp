package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.lifecycle.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1105F {

    /* JADX INFO: renamed from: a */
    private final Map f5270a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Set f5271b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    private volatile boolean f5272c = false;

    /* JADX INFO: renamed from: b */
    private static void m5071b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m5072a() {
        this.f5272c = true;
        Map map = this.f5270a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f5270a.values().iterator();
                    while (it.hasNext()) {
                        m5071b(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.f5271b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.f5271b.iterator();
                    while (it2.hasNext()) {
                        m5071b((Closeable) it2.next());
                    }
                } finally {
                }
            }
        }
        mo4984d();
    }

    /* JADX INFO: renamed from: c */
    Object m5073c(String str) {
        Object obj;
        Map map = this.f5270a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f5270a.get(str);
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    protected void mo4984d() {
    }

    /* JADX INFO: renamed from: e */
    Object m5074e(String str, Object obj) {
        Object obj2;
        synchronized (this.f5270a) {
            try {
                obj2 = this.f5270a.get(str);
                if (obj2 == null) {
                    this.f5270a.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f5272c) {
            m5071b(obj);
        }
        return obj;
    }
}
