package p139p1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: p1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2322c {

    /* JADX INFO: renamed from: a */
    private final String f10725a;

    /* JADX INFO: renamed from: b */
    private final Set f10726b;

    /* JADX INFO: renamed from: c */
    private final Set f10727c;

    /* JADX INFO: renamed from: d */
    private final int f10728d;

    /* JADX INFO: renamed from: e */
    private final int f10729e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC2327h f10730f;

    /* JADX INFO: renamed from: g */
    private final Set f10731g;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m11093a(Object obj, InterfaceC2324e interfaceC2324e) {
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m11094b(Object obj, InterfaceC2324e interfaceC2324e) {
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static b m11095c(Class cls) {
        return new b(cls, new Class[0]);
    }

    /* JADX INFO: renamed from: d */
    public static b m11096d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    /* JADX INFO: renamed from: e */
    public static b m11097e(C2318E c2318e) {
        return new b(c2318e, new C2318E[0]);
    }

    /* JADX INFO: renamed from: f */
    public static b m11098f(C2318E c2318e, C2318E... c2318eArr) {
        return new b(c2318e, c2318eArr);
    }

    /* JADX INFO: renamed from: l */
    public static C2322c m11099l(final Object obj, Class cls) {
        return m11100m(cls).m11119f(new InterfaceC2327h() { // from class: p1.a
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return C2322c.m11094b(obj, interfaceC2324e);
            }
        }).m11117d();
    }

    /* JADX INFO: renamed from: m */
    public static b m11100m(Class cls) {
        return m11095c(cls).m11112g();
    }

    /* JADX INFO: renamed from: q */
    public static C2322c m11101q(final Object obj, Class cls, Class... clsArr) {
        return m11096d(cls, clsArr).m11119f(new InterfaceC2327h() { // from class: p1.b
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return C2322c.m11093a(obj, interfaceC2324e);
            }
        }).m11117d();
    }

    /* JADX INFO: renamed from: g */
    public Set m11102g() {
        return this.f10727c;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC2327h m11103h() {
        return this.f10730f;
    }

    /* JADX INFO: renamed from: i */
    public String m11104i() {
        return this.f10725a;
    }

    /* JADX INFO: renamed from: j */
    public Set m11105j() {
        return this.f10726b;
    }

    /* JADX INFO: renamed from: k */
    public Set m11106k() {
        return this.f10731g;
    }

    /* JADX INFO: renamed from: n */
    public boolean m11107n() {
        return this.f10728d == 1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m11108o() {
        return this.f10728d == 2;
    }

    /* JADX INFO: renamed from: p */
    public boolean m11109p() {
        return this.f10729e == 0;
    }

    /* JADX INFO: renamed from: r */
    public C2322c m11110r(InterfaceC2327h interfaceC2327h) {
        return new C2322c(this.f10725a, this.f10726b, this.f10727c, this.f10728d, this.f10729e, interfaceC2327h, this.f10731g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f10726b.toArray()) + ">{" + this.f10728d + ", type=" + this.f10729e + ", deps=" + Arrays.toString(this.f10727c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: p1.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private String f10732a;

        /* JADX INFO: renamed from: b */
        private final Set f10733b;

        /* JADX INFO: renamed from: c */
        private final Set f10734c;

        /* JADX INFO: renamed from: d */
        private int f10735d;

        /* JADX INFO: renamed from: e */
        private int f10736e;

        /* JADX INFO: renamed from: f */
        private InterfaceC2327h f10737f;

        /* JADX INFO: renamed from: g */
        private final Set f10738g;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public b m11112g() {
            this.f10736e = 1;
            return this;
        }

        /* JADX INFO: renamed from: i */
        private b m11113i(int i3) {
            AbstractC2317D.m11083d(this.f10735d == 0, "Instantiation type has already been set.");
            this.f10735d = i3;
            return this;
        }

        /* JADX INFO: renamed from: j */
        private void m11114j(C2318E c2318e) {
            AbstractC2317D.m11080a(!this.f10733b.contains(c2318e), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* JADX INFO: renamed from: b */
        public b m11115b(C2337r c2337r) {
            AbstractC2317D.m11082c(c2337r, "Null dependency");
            m11114j(c2337r.m11170b());
            this.f10734c.add(c2337r);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m11116c() {
            return m11113i(1);
        }

        /* JADX INFO: renamed from: d */
        public C2322c m11117d() {
            AbstractC2317D.m11083d(this.f10737f != null, "Missing required property: factory.");
            return new C2322c(this.f10732a, new HashSet(this.f10733b), new HashSet(this.f10734c), this.f10735d, this.f10736e, this.f10737f, this.f10738g);
        }

        /* JADX INFO: renamed from: e */
        public b m11118e() {
            return m11113i(2);
        }

        /* JADX INFO: renamed from: f */
        public b m11119f(InterfaceC2327h interfaceC2327h) {
            this.f10737f = (InterfaceC2327h) AbstractC2317D.m11082c(interfaceC2327h, "Null factory");
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m11120h(String str) {
            this.f10732a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f10732a = null;
            HashSet hashSet = new HashSet();
            this.f10733b = hashSet;
            this.f10734c = new HashSet();
            this.f10735d = 0;
            this.f10736e = 0;
            this.f10738g = new HashSet();
            AbstractC2317D.m11082c(cls, "Null interface");
            hashSet.add(C2318E.m11085b(cls));
            for (Class cls2 : clsArr) {
                AbstractC2317D.m11082c(cls2, "Null interface");
                this.f10733b.add(C2318E.m11085b(cls2));
            }
        }

        private b(C2318E c2318e, C2318E... c2318eArr) {
            this.f10732a = null;
            HashSet hashSet = new HashSet();
            this.f10733b = hashSet;
            this.f10734c = new HashSet();
            this.f10735d = 0;
            this.f10736e = 0;
            this.f10738g = new HashSet();
            AbstractC2317D.m11082c(c2318e, "Null interface");
            hashSet.add(c2318e);
            for (C2318E c2318e2 : c2318eArr) {
                AbstractC2317D.m11082c(c2318e2, "Null interface");
            }
            Collections.addAll(this.f10733b, c2318eArr);
        }
    }

    private C2322c(String str, Set set, Set set2, int i3, int i4, InterfaceC2327h interfaceC2327h, Set set3) {
        this.f10725a = str;
        this.f10726b = Collections.unmodifiableSet(set);
        this.f10727c = Collections.unmodifiableSet(set2);
        this.f10728d = i3;
        this.f10729e = i4;
        this.f10730f = interfaceC2327h;
        this.f10731g = Collections.unmodifiableSet(set3);
    }
}
