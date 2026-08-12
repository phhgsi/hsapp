package p153u0;

import java.util.Arrays;
import p153u0.AbstractC2461f;

/* JADX INFO: renamed from: u0.a */
/* JADX INFO: loaded from: classes.dex */
final class C2456a extends AbstractC2461f {

    /* JADX INFO: renamed from: a */
    private final Iterable f11437a;

    /* JADX INFO: renamed from: b */
    private final byte[] f11438b;

    /* JADX INFO: renamed from: u0.a$b */
    static final class b extends AbstractC2461f.a {

        /* JADX INFO: renamed from: a */
        private Iterable f11439a;

        /* JADX INFO: renamed from: b */
        private byte[] f11440b;

        b() {
        }

        @Override // p153u0.AbstractC2461f.a
        /* JADX INFO: renamed from: a */
        public AbstractC2461f mo11757a() {
            String str = "";
            if (this.f11439a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C2456a(this.f11439a, this.f11440b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p153u0.AbstractC2461f.a
        /* JADX INFO: renamed from: b */
        public AbstractC2461f.a mo11758b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f11439a = iterable;
            return this;
        }

        @Override // p153u0.AbstractC2461f.a
        /* JADX INFO: renamed from: c */
        public AbstractC2461f.a mo11759c(byte[] bArr) {
            this.f11440b = bArr;
            return this;
        }
    }

    @Override // p153u0.AbstractC2461f
    /* JADX INFO: renamed from: b */
    public Iterable mo11755b() {
        return this.f11437a;
    }

    @Override // p153u0.AbstractC2461f
    /* JADX INFO: renamed from: c */
    public byte[] mo11756c() {
        return this.f11438b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2461f) {
            AbstractC2461f abstractC2461f = (AbstractC2461f) obj;
            if (this.f11437a.equals(abstractC2461f.mo11755b())) {
                if (Arrays.equals(this.f11438b, abstractC2461f instanceof C2456a ? ((C2456a) abstractC2461f).f11438b : abstractC2461f.mo11756c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11437a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11438b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f11437a + ", extras=" + Arrays.toString(this.f11438b) + "}";
    }

    private C2456a(Iterable iterable, byte[] bArr) {
        this.f11437a = iterable;
        this.f11438b = bArr;
    }
}
