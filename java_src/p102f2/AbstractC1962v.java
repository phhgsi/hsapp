package p102f2;

import p041N1.C0447j;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0443f;
import p041N1.InterfaceC0446i;
import p047P1.InterfaceC0473d;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0607l;
import p071X1.C0613r;

/* JADX INFO: renamed from: f2.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1962v {

    /* JADX INFO: renamed from: f2.v$a */
    static final class a extends AbstractC0607l implements InterfaceC0581p {

        /* JADX INFO: renamed from: e */
        public static final a f9480e = new a();

        a() {
            super(2);
        }

        @Override // p068W1.InterfaceC0581p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0446i mo1609d(InterfaceC0446i interfaceC0446i, InterfaceC0446i.b bVar) {
            return interfaceC0446i.mo1605p(bVar);
        }
    }

    /* JADX INFO: renamed from: f2.v$b */
    static final class b extends AbstractC0607l implements InterfaceC0581p {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C0613r f9481e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f9482f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0613r c0613r, boolean z2) {
            super(2);
            this.f9481e = c0613r;
            this.f9482f = z2;
        }

        @Override // p068W1.InterfaceC0581p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0446i mo1609d(InterfaceC0446i interfaceC0446i, InterfaceC0446i.b bVar) {
            return interfaceC0446i.mo1605p(bVar);
        }
    }

    /* JADX INFO: renamed from: f2.v$c */
    static final class c extends AbstractC0607l implements InterfaceC0581p {

        /* JADX INFO: renamed from: e */
        public static final c f9483e = new c();

        c() {
            super(2);
        }

        /* JADX INFO: renamed from: c */
        public final Boolean m10028c(boolean z2, InterfaceC0446i.b bVar) {
            return Boolean.valueOf(z2);
        }

        @Override // p068W1.InterfaceC0581p
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ Object mo1609d(Object obj, Object obj2) {
            return m10028c(((Boolean) obj).booleanValue(), (InterfaceC0446i.b) obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0446i m10019a(InterfaceC0446i interfaceC0446i, InterfaceC0446i interfaceC0446i2, boolean z2) {
        boolean zM10021c = m10021c(interfaceC0446i);
        boolean zM10021c2 = m10021c(interfaceC0446i2);
        if (!zM10021c && !zM10021c2) {
            return interfaceC0446i.mo1605p(interfaceC0446i2);
        }
        C0613r c0613r = new C0613r();
        c0613r.f2012d = interfaceC0446i2;
        C0447j c0447j = C0447j.f1593d;
        InterfaceC0446i interfaceC0446i3 = (InterfaceC0446i) interfaceC0446i.mo1604i(c0447j, new b(c0613r, z2));
        if (zM10021c2) {
            c0613r.f2012d = ((InterfaceC0446i) c0613r.f2012d).mo1604i(c0447j, a.f9480e);
        }
        return interfaceC0446i3.mo1605p((InterfaceC0446i) c0613r.f2012d);
    }

    /* JADX INFO: renamed from: b */
    public static final String m10020b(InterfaceC0446i interfaceC0446i) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static final boolean m10021c(InterfaceC0446i interfaceC0446i) {
        return ((Boolean) interfaceC0446i.mo1604i(Boolean.FALSE, c.f9483e)).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0446i m10022d(InterfaceC0446i interfaceC0446i, InterfaceC0446i interfaceC0446i2) {
        return !m10021c(interfaceC0446i2) ? interfaceC0446i.mo1605p(interfaceC0446i2) : m10019a(interfaceC0446i, interfaceC0446i2, false);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC0446i m10023e(InterfaceC1970z interfaceC1970z, InterfaceC0446i interfaceC0446i) {
        InterfaceC0446i interfaceC0446iM10019a = m10019a(interfaceC1970z.mo5096f(), interfaceC0446i, true);
        return (interfaceC0446iM10019a == C1907M.m9812a() || interfaceC0446iM10019a.mo1603b(InterfaceC0443f.f1591a) != null) ? interfaceC0446iM10019a : interfaceC0446iM10019a.mo1605p(C1907M.m9812a());
    }

    /* JADX INFO: renamed from: f */
    public static final C1971z0 m10024f(InterfaceC0473d interfaceC0473d) {
        while (!(interfaceC0473d instanceof C1904J) && (interfaceC0473d = interfaceC0473d.mo1750e()) != null) {
            if (interfaceC0473d instanceof C1971z0) {
                return (C1971z0) interfaceC0473d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final C1971z0 m10025g(InterfaceC0442e interfaceC0442e, InterfaceC0446i interfaceC0446i, Object obj) {
        if (!(interfaceC0442e instanceof InterfaceC0473d) || interfaceC0446i.mo1603b(C1894A0.f9397d) == null) {
            return null;
        }
        C1971z0 c1971z0M10024f = m10024f((InterfaceC0473d) interfaceC0442e);
        if (c1971z0M10024f != null) {
            c1971z0M10024f.m10041F0(interfaceC0446i, obj);
        }
        return c1971z0M10024f;
    }
}
