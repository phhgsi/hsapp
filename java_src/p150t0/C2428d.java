package p150t0;

import java.util.Arrays;
import p144r0.EnumC2368e;
import p150t0.AbstractC2439o;

/* JADX INFO: renamed from: t0.d */
/* JADX INFO: loaded from: classes.dex */
final class C2428d extends AbstractC2439o {

    /* JADX INFO: renamed from: a */
    private final String f11388a;

    /* JADX INFO: renamed from: b */
    private final byte[] f11389b;

    /* JADX INFO: renamed from: c */
    private final EnumC2368e f11390c;

    /* JADX INFO: renamed from: t0.d$b */
    static final class b extends AbstractC2439o.a {

        /* JADX INFO: renamed from: a */
        private String f11391a;

        /* JADX INFO: renamed from: b */
        private byte[] f11392b;

        /* JADX INFO: renamed from: c */
        private EnumC2368e f11393c;

        b() {
        }

        @Override // p150t0.AbstractC2439o.a
        /* JADX INFO: renamed from: a */
        public AbstractC2439o mo11696a() {
            String str = "";
            if (this.f11391a == null) {
                str = " backendName";
            }
            if (this.f11393c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C2428d(this.f11391a, this.f11392b, this.f11393c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p150t0.AbstractC2439o.a
        /* JADX INFO: renamed from: b */
        public AbstractC2439o.a mo11697b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f11391a = str;
            return this;
        }

        @Override // p150t0.AbstractC2439o.a
        /* JADX INFO: renamed from: c */
        public AbstractC2439o.a mo11698c(byte[] bArr) {
            this.f11392b = bArr;
            return this;
        }

        @Override // p150t0.AbstractC2439o.a
        /* JADX INFO: renamed from: d */
        public AbstractC2439o.a mo11699d(EnumC2368e enumC2368e) {
            if (enumC2368e == null) {
                throw new NullPointerException("Null priority");
            }
            this.f11393c = enumC2368e;
            return this;
        }
    }

    @Override // p150t0.AbstractC2439o
    /* JADX INFO: renamed from: b */
    public String mo11693b() {
        return this.f11388a;
    }

    @Override // p150t0.AbstractC2439o
    /* JADX INFO: renamed from: c */
    public byte[] mo11694c() {
        return this.f11389b;
    }

    @Override // p150t0.AbstractC2439o
    /* JADX INFO: renamed from: d */
    public EnumC2368e mo11695d() {
        return this.f11390c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2439o) {
            AbstractC2439o abstractC2439o = (AbstractC2439o) obj;
            if (this.f11388a.equals(abstractC2439o.mo11693b())) {
                if (Arrays.equals(this.f11389b, abstractC2439o instanceof C2428d ? ((C2428d) abstractC2439o).f11389b : abstractC2439o.mo11694c()) && this.f11390c.equals(abstractC2439o.mo11695d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11388a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11389b)) * 1000003) ^ this.f11390c.hashCode();
    }

    private C2428d(String str, byte[] bArr, EnumC2368e enumC2368e) {
        this.f11388a = str;
        this.f11389b = bArr;
        this.f11390c = enumC2368e;
    }
}
