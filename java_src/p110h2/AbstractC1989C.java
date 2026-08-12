package p110h2;

import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0607l;
import p102f2.InterfaceC1965w0;

/* JADX INFO: renamed from: h2.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1989C {

    /* JADX INFO: renamed from: a */
    public static final C2018y f9554a = new C2018y("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0581p f9555b = a.f9558e;

    /* JADX INFO: renamed from: c */
    private static final InterfaceC0581p f9556c = b.f9559e;

    /* JADX INFO: renamed from: d */
    private static final InterfaceC0581p f9557d = c.f9560e;

    /* JADX INFO: renamed from: h2.C$a */
    static final class a extends AbstractC0607l implements InterfaceC0581p {

        /* JADX INFO: renamed from: e */
        public static final a f9558e = new a();

        a() {
            super(2);
        }

        @Override // p068W1.InterfaceC0581p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object mo1609d(Object obj, InterfaceC0446i.b bVar) {
            if (!(bVar instanceof InterfaceC1965w0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    /* JADX INFO: renamed from: h2.C$b */
    static final class b extends AbstractC0607l implements InterfaceC0581p {

        /* JADX INFO: renamed from: e */
        public static final b f9559e = new b();

        b() {
            super(2);
        }

        @Override // p068W1.InterfaceC0581p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1965w0 mo1609d(InterfaceC1965w0 interfaceC1965w0, InterfaceC0446i.b bVar) {
            if (interfaceC1965w0 != null) {
                return interfaceC1965w0;
            }
            if (bVar instanceof InterfaceC1965w0) {
                return (InterfaceC1965w0) bVar;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: h2.C$c */
    static final class c extends AbstractC0607l implements InterfaceC0581p {

        /* JADX INFO: renamed from: e */
        public static final c f9560e = new c();

        c() {
            super(2);
        }

        @Override // p068W1.InterfaceC0581p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C1993G mo1609d(C1993G c1993g, InterfaceC0446i.b bVar) {
            if (bVar instanceof InterfaceC1965w0) {
                InterfaceC1965w0 interfaceC1965w0 = (InterfaceC1965w0) bVar;
                c1993g.m10113a(interfaceC1965w0, interfaceC1965w0.m10033x(c1993g.f9561a));
            }
            return c1993g;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m10102a(InterfaceC0446i interfaceC0446i, Object obj) {
        if (obj == f9554a) {
            return;
        }
        if (obj instanceof C1993G) {
            ((C1993G) obj).m10114b(interfaceC0446i);
            return;
        }
        Object objMo1604i = interfaceC0446i.mo1604i(null, f9556c);
        AbstractC0606k.m2143c(objMo1604i, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC1965w0) objMo1604i).m10032w(interfaceC0446i, obj);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m10103b(InterfaceC0446i interfaceC0446i) {
        Object objMo1604i = interfaceC0446i.mo1604i(0, f9555b);
        AbstractC0606k.m2142b(objMo1604i);
        return objMo1604i;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m10104c(InterfaceC0446i interfaceC0446i, Object obj) {
        if (obj == null) {
            obj = m10103b(interfaceC0446i);
        }
        if (obj == 0) {
            return f9554a;
        }
        if (obj instanceof Integer) {
            return interfaceC0446i.mo1604i(new C1993G(interfaceC0446i, ((Number) obj).intValue()), f9557d);
        }
        AbstractC0606k.m2143c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC1965w0) obj).m10033x(interfaceC0446i);
    }
}
