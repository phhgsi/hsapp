package p150t0;

import p144r0.AbstractC2367d;
import p144r0.C2366c;
import p144r0.InterfaceC2370g;
import p150t0.AbstractC2438n;

/* JADX INFO: renamed from: t0.c */
/* JADX INFO: loaded from: classes.dex */
final class C2427c extends AbstractC2438n {

    /* JADX INFO: renamed from: a */
    private final AbstractC2439o f11378a;

    /* JADX INFO: renamed from: b */
    private final String f11379b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2367d f11380c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2370g f11381d;

    /* JADX INFO: renamed from: e */
    private final C2366c f11382e;

    /* JADX INFO: renamed from: t0.c$b */
    static final class b extends AbstractC2438n.a {

        /* JADX INFO: renamed from: a */
        private AbstractC2439o f11383a;

        /* JADX INFO: renamed from: b */
        private String f11384b;

        /* JADX INFO: renamed from: c */
        private AbstractC2367d f11385c;

        /* JADX INFO: renamed from: d */
        private InterfaceC2370g f11386d;

        /* JADX INFO: renamed from: e */
        private C2366c f11387e;

        b() {
        }

        @Override // p150t0.AbstractC2438n.a
        /* JADX INFO: renamed from: a */
        public AbstractC2438n mo11687a() {
            String str = "";
            if (this.f11383a == null) {
                str = " transportContext";
            }
            if (this.f11384b == null) {
                str = str + " transportName";
            }
            if (this.f11385c == null) {
                str = str + " event";
            }
            if (this.f11386d == null) {
                str = str + " transformer";
            }
            if (this.f11387e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C2427c(this.f11383a, this.f11384b, this.f11385c, this.f11386d, this.f11387e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p150t0.AbstractC2438n.a
        /* JADX INFO: renamed from: b */
        AbstractC2438n.a mo11688b(C2366c c2366c) {
            if (c2366c == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f11387e = c2366c;
            return this;
        }

        @Override // p150t0.AbstractC2438n.a
        /* JADX INFO: renamed from: c */
        AbstractC2438n.a mo11689c(AbstractC2367d abstractC2367d) {
            if (abstractC2367d == null) {
                throw new NullPointerException("Null event");
            }
            this.f11385c = abstractC2367d;
            return this;
        }

        @Override // p150t0.AbstractC2438n.a
        /* JADX INFO: renamed from: d */
        AbstractC2438n.a mo11690d(InterfaceC2370g interfaceC2370g) {
            if (interfaceC2370g == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f11386d = interfaceC2370g;
            return this;
        }

        @Override // p150t0.AbstractC2438n.a
        /* JADX INFO: renamed from: e */
        public AbstractC2438n.a mo11691e(AbstractC2439o abstractC2439o) {
            if (abstractC2439o == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f11383a = abstractC2439o;
            return this;
        }

        @Override // p150t0.AbstractC2438n.a
        /* JADX INFO: renamed from: f */
        public AbstractC2438n.a mo11692f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f11384b = str;
            return this;
        }
    }

    @Override // p150t0.AbstractC2438n
    /* JADX INFO: renamed from: b */
    public C2366c mo11682b() {
        return this.f11382e;
    }

    @Override // p150t0.AbstractC2438n
    /* JADX INFO: renamed from: c */
    AbstractC2367d mo11683c() {
        return this.f11380c;
    }

    @Override // p150t0.AbstractC2438n
    /* JADX INFO: renamed from: e */
    InterfaceC2370g mo11684e() {
        return this.f11381d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2438n) {
            AbstractC2438n abstractC2438n = (AbstractC2438n) obj;
            if (this.f11378a.equals(abstractC2438n.mo11685f()) && this.f11379b.equals(abstractC2438n.mo11686g()) && this.f11380c.equals(abstractC2438n.mo11683c()) && this.f11381d.equals(abstractC2438n.mo11684e()) && this.f11382e.equals(abstractC2438n.mo11682b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p150t0.AbstractC2438n
    /* JADX INFO: renamed from: f */
    public AbstractC2439o mo11685f() {
        return this.f11378a;
    }

    @Override // p150t0.AbstractC2438n
    /* JADX INFO: renamed from: g */
    public String mo11686g() {
        return this.f11379b;
    }

    public int hashCode() {
        return ((((((((this.f11378a.hashCode() ^ 1000003) * 1000003) ^ this.f11379b.hashCode()) * 1000003) ^ this.f11380c.hashCode()) * 1000003) ^ this.f11381d.hashCode()) * 1000003) ^ this.f11382e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f11378a + ", transportName=" + this.f11379b + ", event=" + this.f11380c + ", transformer=" + this.f11381d + ", encoding=" + this.f11382e + "}";
    }

    private C2427c(AbstractC2439o abstractC2439o, String str, AbstractC2367d abstractC2367d, InterfaceC2370g interfaceC2370g, C2366c c2366c) {
        this.f11378a = abstractC2439o;
        this.f11379b = str;
        this.f11380c = abstractC2367d;
        this.f11381d = interfaceC2370g;
        this.f11382e = c2366c;
    }
}
