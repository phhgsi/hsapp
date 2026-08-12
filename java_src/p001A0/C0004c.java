package p001A0;

import java.util.Set;
import p001A0.AbstractC0007f;

/* JADX INFO: renamed from: A0.c */
/* JADX INFO: loaded from: classes.dex */
final class C0004c extends AbstractC0007f.b {

    /* JADX INFO: renamed from: a */
    private final long f2a;

    /* JADX INFO: renamed from: b */
    private final long f3b;

    /* JADX INFO: renamed from: c */
    private final Set f4c;

    /* JADX INFO: renamed from: A0.c$b */
    static final class b extends AbstractC0007f.b.a {

        /* JADX INFO: renamed from: a */
        private Long f5a;

        /* JADX INFO: renamed from: b */
        private Long f6b;

        /* JADX INFO: renamed from: c */
        private Set f7c;

        b() {
        }

        @Override // p001A0.AbstractC0007f.b.a
        /* JADX INFO: renamed from: a */
        public AbstractC0007f.b mo36a() {
            String str = "";
            if (this.f5a == null) {
                str = " delta";
            }
            if (this.f6b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f7c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C0004c(this.f5a.longValue(), this.f6b.longValue(), this.f7c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001A0.AbstractC0007f.b.a
        /* JADX INFO: renamed from: b */
        public AbstractC0007f.b.a mo37b(long j3) {
            this.f5a = Long.valueOf(j3);
            return this;
        }

        @Override // p001A0.AbstractC0007f.b.a
        /* JADX INFO: renamed from: c */
        public AbstractC0007f.b.a mo38c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f7c = set;
            return this;
        }

        @Override // p001A0.AbstractC0007f.b.a
        /* JADX INFO: renamed from: d */
        public AbstractC0007f.b.a mo39d(long j3) {
            this.f6b = Long.valueOf(j3);
            return this;
        }
    }

    @Override // p001A0.AbstractC0007f.b
    /* JADX INFO: renamed from: b */
    long mo33b() {
        return this.f2a;
    }

    @Override // p001A0.AbstractC0007f.b
    /* JADX INFO: renamed from: c */
    Set mo34c() {
        return this.f4c;
    }

    @Override // p001A0.AbstractC0007f.b
    /* JADX INFO: renamed from: d */
    long mo35d() {
        return this.f3b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0007f.b) {
            AbstractC0007f.b bVar = (AbstractC0007f.b) obj;
            if (this.f2a == bVar.mo33b() && this.f3b == bVar.mo35d() && this.f4c.equals(bVar.mo34c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j3 = this.f2a;
        int i3 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        long j4 = this.f3b;
        return ((i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f4c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f2a + ", maxAllowedDelay=" + this.f3b + ", flags=" + this.f4c + "}";
    }

    private C0004c(long j3, long j4, Set set) {
        this.f2a = j3;
        this.f3b = j4;
        this.f4c = set;
    }
}
