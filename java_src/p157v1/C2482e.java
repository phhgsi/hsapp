package p157v1;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p151t1.C2448b;
import p151t1.C2449c;
import p151t1.InterfaceC2450d;
import p151t1.InterfaceC2451e;
import p151t1.InterfaceC2452f;
import p151t1.InterfaceC2453g;

/* JADX INFO: renamed from: v1.e */
/* JADX INFO: loaded from: classes.dex */
final class C2482e implements InterfaceC2451e, InterfaceC2453g {

    /* JADX INFO: renamed from: a */
    private C2482e f11498a = null;

    /* JADX INFO: renamed from: b */
    private boolean f11499b = true;

    /* JADX INFO: renamed from: c */
    private final JsonWriter f11500c;

    /* JADX INFO: renamed from: d */
    private final Map f11501d;

    /* JADX INFO: renamed from: e */
    private final Map f11502e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC2450d f11503f;

    /* JADX INFO: renamed from: g */
    private final boolean f11504g;

    C2482e(Writer writer, Map map, Map map2, InterfaceC2450d interfaceC2450d, boolean z2) {
        this.f11500c = new JsonWriter(writer);
        this.f11501d = map;
        this.f11502e = map2;
        this.f11503f = interfaceC2450d;
        this.f11504g = z2;
    }

    /* JADX INFO: renamed from: o */
    private boolean m11804o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* JADX INFO: renamed from: r */
    private C2482e m11805r(String str, Object obj) throws IOException {
        m11807t();
        this.f11500c.name(str);
        if (obj != null) {
            return m11810h(obj, false);
        }
        this.f11500c.nullValue();
        return this;
    }

    /* JADX INFO: renamed from: s */
    private C2482e m11806s(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        m11807t();
        this.f11500c.name(str);
        return m11810h(obj, false);
    }

    /* JADX INFO: renamed from: t */
    private void m11807t() throws IOException {
        if (!this.f11499b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C2482e c2482e = this.f11498a;
        if (c2482e != null) {
            c2482e.m11807t();
            this.f11498a.f11499b = false;
            this.f11498a = null;
            this.f11500c.endObject();
        }
    }

    @Override // p151t1.InterfaceC2451e
    /* JADX INFO: renamed from: a */
    public InterfaceC2451e mo11748a(C2449c c2449c, Object obj) {
        return m11814l(c2449c.m11744b(), obj);
    }

    @Override // p151t1.InterfaceC2451e
    /* JADX INFO: renamed from: d */
    public InterfaceC2451e mo11749d(C2449c c2449c, int i3) {
        return m11812j(c2449c.m11744b(), i3);
    }

    @Override // p151t1.InterfaceC2451e
    /* JADX INFO: renamed from: e */
    public InterfaceC2451e mo11750e(C2449c c2449c, long j3) {
        return m11813k(c2449c.m11744b(), j3);
    }

    /* JADX INFO: renamed from: f */
    public C2482e m11808f(int i3) throws IOException {
        m11807t();
        this.f11500c.value(i3);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C2482e m11809g(long j3) throws IOException {
        m11807t();
        this.f11500c.value(j3);
        return this;
    }

    /* JADX INFO: renamed from: h */
    C2482e m11810h(Object obj, boolean z2) {
        int i3 = 0;
        if (z2 && m11804o(obj)) {
            throw new C2448b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f11500c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f11500c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f11500c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m11810h(it.next(), false);
                }
                this.f11500c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f11500c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m11814l((String) key, entry.getValue());
                    } catch (ClassCastException e3) {
                        throw new C2448b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e3);
                    }
                }
                this.f11500c.endObject();
                return this;
            }
            InterfaceC2450d interfaceC2450d = (InterfaceC2450d) this.f11501d.get(obj.getClass());
            if (interfaceC2450d != null) {
                return m11818q(interfaceC2450d, obj, z2);
            }
            InterfaceC2452f interfaceC2452f = (InterfaceC2452f) this.f11502e.get(obj.getClass());
            if (interfaceC2452f != null) {
                interfaceC2452f.mo11751a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return m11818q(this.f11503f, obj, z2);
            }
            mo11752b(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return m11816n((byte[]) obj);
        }
        this.f11500c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i3 < length) {
                this.f11500c.value(r7[i3]);
                i3++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i3 < length2) {
                m11809g(jArr[i3]);
                i3++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i3 < length3) {
                this.f11500c.value(dArr[i3]);
                i3++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i3 < length4) {
                this.f11500c.value(zArr[i3]);
                i3++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m11810h(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m11810h(obj2, false);
            }
        }
        this.f11500c.endArray();
        return this;
    }

    @Override // p151t1.InterfaceC2453g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C2482e mo11752b(String str) throws IOException {
        m11807t();
        this.f11500c.value(str);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C2482e m11812j(String str, int i3) throws IOException {
        m11807t();
        this.f11500c.name(str);
        return m11808f(i3);
    }

    /* JADX INFO: renamed from: k */
    public C2482e m11813k(String str, long j3) throws IOException {
        m11807t();
        this.f11500c.name(str);
        return m11809g(j3);
    }

    /* JADX INFO: renamed from: l */
    public C2482e m11814l(String str, Object obj) {
        return this.f11504g ? m11806s(str, obj) : m11805r(str, obj);
    }

    @Override // p151t1.InterfaceC2453g
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2482e mo11753c(boolean z2) throws IOException {
        m11807t();
        this.f11500c.value(z2);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C2482e m11816n(byte[] bArr) throws IOException {
        m11807t();
        if (bArr == null) {
            this.f11500c.nullValue();
            return this;
        }
        this.f11500c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    /* JADX INFO: renamed from: p */
    void m11817p() {
        m11807t();
        this.f11500c.flush();
    }

    /* JADX INFO: renamed from: q */
    C2482e m11818q(InterfaceC2450d interfaceC2450d, Object obj, boolean z2) throws IOException {
        if (!z2) {
            this.f11500c.beginObject();
        }
        interfaceC2450d.mo9388a(obj, this);
        if (!z2) {
            this.f11500c.endObject();
        }
        return this;
    }
}
