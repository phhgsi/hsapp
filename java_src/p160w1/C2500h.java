package p160w1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p151t1.C2448b;
import p151t1.InterfaceC2450d;
import p151t1.InterfaceC2451e;
import p154u1.InterfaceC2469a;
import p154u1.InterfaceC2470b;
import p160w1.C2500h;

/* JADX INFO: renamed from: w1.h */
/* JADX INFO: loaded from: classes.dex */
public class C2500h {

    /* JADX INFO: renamed from: a */
    private final Map f11663a;

    /* JADX INFO: renamed from: b */
    private final Map f11664b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2450d f11665c;

    /* JADX INFO: renamed from: w1.h$a */
    public static final class a implements InterfaceC2470b {

        /* JADX INFO: renamed from: d */
        private static final InterfaceC2450d f11666d = new InterfaceC2450d() { // from class: w1.g
            @Override // p151t1.InterfaceC2450d
            /* JADX INFO: renamed from: a */
            public final void mo9388a(Object obj, Object obj2) {
                C2500h.a.m11883b(obj, (InterfaceC2451e) obj2);
            }
        };

        /* JADX INFO: renamed from: a */
        private final Map f11667a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Map f11668b = new HashMap();

        /* JADX INFO: renamed from: c */
        private InterfaceC2450d f11669c = f11666d;

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m11883b(Object obj, InterfaceC2451e interfaceC2451e) {
            throw new C2448b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* JADX INFO: renamed from: c */
        public C2500h m11884c() {
            return new C2500h(new HashMap(this.f11667a), new HashMap(this.f11668b), this.f11669c);
        }

        /* JADX INFO: renamed from: d */
        public a m11885d(InterfaceC2469a interfaceC2469a) {
            interfaceC2469a.mo9387a(this);
            return this;
        }

        @Override // p154u1.InterfaceC2470b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a mo11784a(Class cls, InterfaceC2450d interfaceC2450d) {
            this.f11667a.put(cls, interfaceC2450d);
            this.f11668b.remove(cls);
            return this;
        }
    }

    C2500h(Map map, Map map2, InterfaceC2450d interfaceC2450d) {
        this.f11663a = map;
        this.f11664b = map2;
        this.f11665c = interfaceC2450d;
    }

    /* JADX INFO: renamed from: a */
    public static a m11880a() {
        return new a();
    }

    /* JADX INFO: renamed from: b */
    public void m11881b(Object obj, OutputStream outputStream) {
        new C2498f(outputStream, this.f11663a, this.f11664b, this.f11665c).m11879q(obj);
    }

    /* JADX INFO: renamed from: c */
    public byte[] m11882c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m11881b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
