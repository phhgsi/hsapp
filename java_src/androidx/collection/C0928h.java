package androidx.collection;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import p035L1.C0388t;
import p071X1.AbstractC0606k;
import p134o.C2285b;
import p134o.C2286c;

/* JADX INFO: renamed from: androidx.collection.h */
/* JADX INFO: loaded from: classes.dex */
public class C0928h {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final C2285b lock;
    private final C2286c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public C0928h(int i3) {
        this.maxSize = i3;
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new C2286c(0, 0.75f);
        this.lock = new C2285b();
    }

    /* JADX INFO: renamed from: a */
    private final int m3938a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    protected Object create(Object obj) {
        AbstractC0606k.m2145e(obj, "key");
        return null;
    }

    public final int createCount() {
        int i3;
        synchronized (this.lock) {
            i3 = this.createCount;
        }
        return i3;
    }

    protected void entryRemoved(boolean z2, Object obj, Object obj2, Object obj3) {
        AbstractC0606k.m2145e(obj, "key");
        AbstractC0606k.m2145e(obj2, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i3;
        synchronized (this.lock) {
            i3 = this.evictionCount;
        }
        return i3;
    }

    public final Object get(Object obj) {
        Object objM10899d;
        AbstractC0606k.m2145e(obj, "key");
        synchronized (this.lock) {
            Object objM10896a = this.map.m10896a(obj);
            if (objM10896a != null) {
                this.hitCount++;
                return objM10896a;
            }
            this.missCount++;
            Object objCreate = create(obj);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    objM10899d = this.map.m10899d(obj, objCreate);
                    if (objM10899d != null) {
                        this.map.m10899d(obj, objM10899d);
                    } else {
                        this.size += m3938a(obj, objCreate);
                        C0388t c0388t = C0388t.f1507a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objM10899d != null) {
                entryRemoved(false, obj, objCreate, objM10899d);
                return objM10899d;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i3;
        synchronized (this.lock) {
            i3 = this.hitCount;
        }
        return i3;
    }

    public final int maxSize() {
        int i3;
        synchronized (this.lock) {
            i3 = this.maxSize;
        }
        return i3;
    }

    public final int missCount() {
        int i3;
        synchronized (this.lock) {
            i3 = this.missCount;
        }
        return i3;
    }

    public final Object put(Object obj, Object obj2) {
        Object objM10899d;
        AbstractC0606k.m2145e(obj, "key");
        AbstractC0606k.m2145e(obj2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += m3938a(obj, obj2);
                objM10899d = this.map.m10899d(obj, obj2);
                if (objM10899d != null) {
                    this.size -= m3938a(obj, objM10899d);
                }
                C0388t c0388t = C0388t.f1507a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objM10899d != null) {
            entryRemoved(false, obj, objM10899d, obj2);
        }
        trimToSize(this.maxSize);
        return objM10899d;
    }

    public final int putCount() {
        int i3;
        synchronized (this.lock) {
            i3 = this.putCount;
        }
        return i3;
    }

    public final Object remove(Object obj) {
        Object objM10900e;
        AbstractC0606k.m2145e(obj, "key");
        synchronized (this.lock) {
            try {
                objM10900e = this.map.m10900e(obj);
                if (objM10900e != null) {
                    this.size -= m3938a(obj, objM10900e);
                }
                C0388t c0388t = C0388t.f1507a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objM10900e != null) {
            entryRemoved(false, obj, objM10900e, null);
        }
        return objM10900e;
    }

    public void resize(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i3;
            C0388t c0388t = C0388t.f1507a;
        }
        trimToSize(i3);
    }

    public final int size() {
        int i3;
        synchronized (this.lock) {
            i3 = this.size;
        }
        return i3;
    }

    protected int sizeOf(Object obj, Object obj2) {
        AbstractC0606k.m2145e(obj, "key");
        AbstractC0606k.m2145e(obj2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            try {
                for (Map.Entry entry : this.map.m10897b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                C0388t c0388t = C0388t.f1507a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i3 = this.hitCount;
                int i4 = this.missCount + i3;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i4 != 0 ? (i3 * 100) / i4 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r6) {
        /*
            r5 = this;
        L0:
            o.b r0 = r5.lock
            monitor-enter(r0)
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 < 0) goto L57
            o.c r1 = r5.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.m10898c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L57
            goto L16
        L14:
            r6 = move-exception
            goto L5f
        L16:
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 <= r6) goto L55
            o.c r1 = r5.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.m10898c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L23
            goto L55
        L23:
            o.c r1 = r5.map     // Catch: java.lang.Throwable -> L14
            java.util.Set r1 = r1.m10897b()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = p038M1.AbstractC0419m.m1466m(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L33
            monitor-exit(r0)
            return
        L33:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L14
            o.c r3 = r5.map     // Catch: java.lang.Throwable -> L14
            r3.m10900e(r2)     // Catch: java.lang.Throwable -> L14
            int r3 = r5.size     // Catch: java.lang.Throwable -> L14
            int r4 = r5.m3938a(r2, r1)     // Catch: java.lang.Throwable -> L14
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L14
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L14
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            r0 = 0
            r5.entryRemoved(r4, r2, r1, r0)
            goto L0
        L55:
            monitor-exit(r0)
            return
        L57:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L5f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C0928h.trimToSize(int):void");
    }
}
