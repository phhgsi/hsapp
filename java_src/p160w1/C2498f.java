package p160w1;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p151t1.C2448b;
import p151t1.C2449c;
import p151t1.InterfaceC2450d;
import p151t1.InterfaceC2451e;
import p151t1.InterfaceC2452f;
import p160w1.InterfaceC2496d;

/* JADX INFO: renamed from: w1.f */
/* JADX INFO: loaded from: classes.dex */
final class C2498f implements InterfaceC2451e {

    /* JADX INFO: renamed from: f */
    private static final Charset f11653f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    private static final C2449c f11654g = C2449c.m11742a("key").m11747b(C2493a.m11858b().m11860c(1).m11859a()).m11746a();

    /* JADX INFO: renamed from: h */
    private static final C2449c f11655h = C2449c.m11742a(AppMeasurementSdk.ConditionalUserProperty.VALUE).m11747b(C2493a.m11858b().m11860c(2).m11859a()).m11746a();

    /* JADX INFO: renamed from: i */
    private static final InterfaceC2450d f11656i = new InterfaceC2450d() { // from class: w1.e
        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: a */
        public final void mo9388a(Object obj, Object obj2) {
            C2498f.m11862b((Map.Entry) obj, (InterfaceC2451e) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    private OutputStream f11657a;

    /* JADX INFO: renamed from: b */
    private final Map f11658b;

    /* JADX INFO: renamed from: c */
    private final Map f11659c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2450d f11660d;

    /* JADX INFO: renamed from: e */
    private final C2501i f11661e = new C2501i(this);

    /* JADX INFO: renamed from: w1.f$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f11662a;

        static {
            int[] iArr = new int[InterfaceC2496d.a.values().length];
            f11662a = iArr;
            try {
                iArr[InterfaceC2496d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11662a[InterfaceC2496d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11662a[InterfaceC2496d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C2498f(OutputStream outputStream, Map map, Map map2, InterfaceC2450d interfaceC2450d) {
        this.f11657a = outputStream;
        this.f11658b = map;
        this.f11659c = map2;
        this.f11660d = interfaceC2450d;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11862b(Map.Entry entry, InterfaceC2451e interfaceC2451e) {
        interfaceC2451e.mo11748a(f11654g, entry.getKey());
        interfaceC2451e.mo11748a(f11655h, entry.getValue());
    }

    /* JADX INFO: renamed from: m */
    private static ByteBuffer m11863m(int i3) {
        return ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX INFO: renamed from: n */
    private long m11864n(InterfaceC2450d interfaceC2450d, Object obj) throws IOException {
        C2494b c2494b = new C2494b();
        try {
            OutputStream outputStream = this.f11657a;
            this.f11657a = c2494b;
            try {
                interfaceC2450d.mo9388a(obj, this);
                this.f11657a = outputStream;
                long jM11861a = c2494b.m11861a();
                c2494b.close();
                return jM11861a;
            } catch (Throwable th) {
                this.f11657a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c2494b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: o */
    private C2498f m11865o(InterfaceC2450d interfaceC2450d, C2449c c2449c, Object obj, boolean z2) throws IOException {
        long jM11864n = m11864n(interfaceC2450d, obj);
        if (z2 && jM11864n == 0) {
            return this;
        }
        m11869t((m11868s(c2449c) << 3) | 2);
        m11870u(jM11864n);
        interfaceC2450d.mo9388a(obj, this);
        return this;
    }

    /* JADX INFO: renamed from: p */
    private C2498f m11866p(InterfaceC2452f interfaceC2452f, C2449c c2449c, Object obj, boolean z2) {
        this.f11661e.m11888d(c2449c, z2);
        interfaceC2452f.mo11751a(obj, this.f11661e);
        return this;
    }

    /* JADX INFO: renamed from: r */
    private static InterfaceC2496d m11867r(C2449c c2449c) {
        InterfaceC2496d interfaceC2496d = (InterfaceC2496d) c2449c.m11745c(InterfaceC2496d.class);
        if (interfaceC2496d != null) {
            return interfaceC2496d;
        }
        throw new C2448b("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: s */
    private static int m11868s(C2449c c2449c) {
        InterfaceC2496d interfaceC2496d = (InterfaceC2496d) c2449c.m11745c(InterfaceC2496d.class);
        if (interfaceC2496d != null) {
            return interfaceC2496d.tag();
        }
        throw new C2448b("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: t */
    private void m11869t(int i3) throws IOException {
        while ((i3 & (-128)) != 0) {
            this.f11657a.write((i3 & ModuleDescriptor.MODULE_VERSION) | 128);
            i3 >>>= 7;
        }
        this.f11657a.write(i3 & ModuleDescriptor.MODULE_VERSION);
    }

    /* JADX INFO: renamed from: u */
    private void m11870u(long j3) throws IOException {
        while (((-128) & j3) != 0) {
            this.f11657a.write((((int) j3) & ModuleDescriptor.MODULE_VERSION) | 128);
            j3 >>>= 7;
        }
        this.f11657a.write(((int) j3) & ModuleDescriptor.MODULE_VERSION);
    }

    @Override // p151t1.InterfaceC2451e
    /* JADX INFO: renamed from: a */
    public InterfaceC2451e mo11748a(C2449c c2449c, Object obj) {
        return m11873g(c2449c, obj, true);
    }

    /* JADX INFO: renamed from: c */
    InterfaceC2451e m11871c(C2449c c2449c, double d3, boolean z2) throws IOException {
        if (z2 && d3 == 0.0d) {
            return this;
        }
        m11869t((m11868s(c2449c) << 3) | 1);
        this.f11657a.write(m11863m(8).putDouble(d3).array());
        return this;
    }

    /* JADX INFO: renamed from: f */
    InterfaceC2451e m11872f(C2449c c2449c, float f3, boolean z2) throws IOException {
        if (z2 && f3 == 0.0f) {
            return this;
        }
        m11869t((m11868s(c2449c) << 3) | 5);
        this.f11657a.write(m11863m(4).putFloat(f3).array());
        return this;
    }

    /* JADX INFO: renamed from: g */
    InterfaceC2451e m11873g(C2449c c2449c, Object obj, boolean z2) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z2 || charSequence.length() != 0) {
                    m11869t((m11868s(c2449c) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f11653f);
                    m11869t(bytes.length);
                    this.f11657a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m11873g(c2449c, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    m11865o(f11656i, c2449c, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return m11871c(c2449c, ((Double) obj).doubleValue(), z2);
                }
                if (obj instanceof Float) {
                    return m11872f(c2449c, ((Float) obj).floatValue(), z2);
                }
                if (obj instanceof Number) {
                    return m11877k(c2449c, ((Number) obj).longValue(), z2);
                }
                if (obj instanceof Boolean) {
                    return m11878l(c2449c, ((Boolean) obj).booleanValue(), z2);
                }
                if (!(obj instanceof byte[])) {
                    InterfaceC2450d interfaceC2450d = (InterfaceC2450d) this.f11658b.get(obj.getClass());
                    if (interfaceC2450d != null) {
                        return m11865o(interfaceC2450d, c2449c, obj, z2);
                    }
                    InterfaceC2452f interfaceC2452f = (InterfaceC2452f) this.f11659c.get(obj.getClass());
                    return interfaceC2452f != null ? m11866p(interfaceC2452f, c2449c, obj, z2) : obj instanceof InterfaceC2495c ? mo11749d(c2449c, ((InterfaceC2495c) obj).mo531a()) : obj instanceof Enum ? mo11749d(c2449c, ((Enum) obj).ordinal()) : m11865o(this.f11660d, c2449c, obj, z2);
                }
                byte[] bArr = (byte[]) obj;
                if (!z2 || bArr.length != 0) {
                    m11869t((m11868s(c2449c) << 3) | 2);
                    m11869t(bArr.length);
                    this.f11657a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // p151t1.InterfaceC2451e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C2498f mo11749d(C2449c c2449c, int i3) {
        return m11875i(c2449c, i3, true);
    }

    /* JADX INFO: renamed from: i */
    C2498f m11875i(C2449c c2449c, int i3, boolean z2) throws IOException {
        if (!z2 || i3 != 0) {
            InterfaceC2496d interfaceC2496dM11867r = m11867r(c2449c);
            int i4 = a.f11662a[interfaceC2496dM11867r.intEncoding().ordinal()];
            if (i4 == 1) {
                m11869t(interfaceC2496dM11867r.tag() << 3);
                m11869t(i3);
                return this;
            }
            if (i4 == 2) {
                m11869t(interfaceC2496dM11867r.tag() << 3);
                m11869t((i3 << 1) ^ (i3 >> 31));
                return this;
            }
            if (i4 == 3) {
                m11869t((interfaceC2496dM11867r.tag() << 3) | 5);
                this.f11657a.write(m11863m(4).putInt(i3).array());
                return this;
            }
        }
        return this;
    }

    @Override // p151t1.InterfaceC2451e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C2498f mo11750e(C2449c c2449c, long j3) {
        return m11877k(c2449c, j3, true);
    }

    /* JADX INFO: renamed from: k */
    C2498f m11877k(C2449c c2449c, long j3, boolean z2) throws IOException {
        if (!z2 || j3 != 0) {
            InterfaceC2496d interfaceC2496dM11867r = m11867r(c2449c);
            int i3 = a.f11662a[interfaceC2496dM11867r.intEncoding().ordinal()];
            if (i3 == 1) {
                m11869t(interfaceC2496dM11867r.tag() << 3);
                m11870u(j3);
                return this;
            }
            if (i3 == 2) {
                m11869t(interfaceC2496dM11867r.tag() << 3);
                m11870u((j3 >> 63) ^ (j3 << 1));
                return this;
            }
            if (i3 == 3) {
                m11869t((interfaceC2496dM11867r.tag() << 3) | 1);
                this.f11657a.write(m11863m(8).putLong(j3).array());
                return this;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    C2498f m11878l(C2449c c2449c, boolean z2, boolean z3) {
        return m11875i(c2449c, z2 ? 1 : 0, z3);
    }

    /* JADX INFO: renamed from: q */
    C2498f m11879q(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC2450d interfaceC2450d = (InterfaceC2450d) this.f11658b.get(obj.getClass());
        if (interfaceC2450d != null) {
            interfaceC2450d.mo9388a(obj, this);
            return this;
        }
        throw new C2448b("No encoder for " + obj.getClass());
    }
}
