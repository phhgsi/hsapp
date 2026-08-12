package p139p1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p002A1.InterfaceC0027b;
import p163x1.InterfaceC2526c;

/* JADX INFO: renamed from: p1.F */
/* JADX INFO: loaded from: classes.dex */
final class C2319F implements InterfaceC2324e {

    /* JADX INFO: renamed from: a */
    private final Set f10714a;

    /* JADX INFO: renamed from: b */
    private final Set f10715b;

    /* JADX INFO: renamed from: c */
    private final Set f10716c;

    /* JADX INFO: renamed from: d */
    private final Set f10717d;

    /* JADX INFO: renamed from: e */
    private final Set f10718e;

    /* JADX INFO: renamed from: f */
    private final Set f10719f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC2324e f10720g;

    /* JADX INFO: renamed from: p1.F$a */
    private static class a implements InterfaceC2526c {

        /* JADX INFO: renamed from: a */
        private final Set f10721a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC2526c f10722b;

        public a(Set set, InterfaceC2526c interfaceC2526c) {
            this.f10721a = set;
            this.f10722b = interfaceC2526c;
        }
    }

    C2319F(C2322c c2322c, InterfaceC2324e interfaceC2324e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C2337r c2337r : c2322c.m11102g()) {
            if (c2337r.m11172d()) {
                if (c2337r.m11174f()) {
                    hashSet4.add(c2337r.m11170b());
                } else {
                    hashSet.add(c2337r.m11170b());
                }
            } else if (c2337r.m11171c()) {
                hashSet3.add(c2337r.m11170b());
            } else if (c2337r.m11174f()) {
                hashSet5.add(c2337r.m11170b());
            } else {
                hashSet2.add(c2337r.m11170b());
            }
        }
        if (!c2322c.m11106k().isEmpty()) {
            hashSet.add(C2318E.m11085b(InterfaceC2526c.class));
        }
        this.f10714a = Collections.unmodifiableSet(hashSet);
        this.f10715b = Collections.unmodifiableSet(hashSet2);
        this.f10716c = Collections.unmodifiableSet(hashSet3);
        this.f10717d = Collections.unmodifiableSet(hashSet4);
        this.f10718e = Collections.unmodifiableSet(hashSet5);
        this.f10719f = c2322c.m11106k();
        this.f10720g = interfaceC2324e;
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: a */
    public Object mo11086a(Class cls) {
        if (!this.f10714a.contains(C2318E.m11085b(cls))) {
            throw new C2339t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objMo11086a = this.f10720g.mo11086a(cls);
        return !cls.equals(InterfaceC2526c.class) ? objMo11086a : new a(this.f10719f, (InterfaceC2526c) objMo11086a);
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: b */
    public Set mo11087b(C2318E c2318e) {
        if (this.f10717d.contains(c2318e)) {
            return this.f10720g.mo11087b(c2318e);
        }
        throw new C2339t(String.format("Attempting to request an undeclared dependency Set<%s>.", c2318e));
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: c */
    public /* synthetic */ Set mo11088c(Class cls) {
        return AbstractC2323d.m11124d(this, cls);
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: d */
    public InterfaceC0027b mo11089d(Class cls) {
        return mo11090e(C2318E.m11085b(cls));
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: e */
    public InterfaceC0027b mo11090e(C2318E c2318e) {
        if (this.f10715b.contains(c2318e)) {
            return this.f10720g.mo11090e(c2318e);
        }
        throw new C2339t(String.format("Attempting to request an undeclared dependency Provider<%s>.", c2318e));
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: f */
    public Object mo11091f(C2318E c2318e) {
        if (this.f10714a.contains(c2318e)) {
            return this.f10720g.mo11091f(c2318e);
        }
        throw new C2339t(String.format("Attempting to request an undeclared dependency %s.", c2318e));
    }

    @Override // p139p1.InterfaceC2324e
    /* JADX INFO: renamed from: g */
    public InterfaceC0027b mo11092g(C2318E c2318e) {
        if (this.f10718e.contains(c2318e)) {
            return this.f10720g.mo11092g(c2318e);
        }
        throw new C2339t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c2318e));
    }
}
