package p004B0;

import p150t0.AbstractC2433i;
import p150t0.AbstractC2439o;

/* JADX INFO: renamed from: B0.b */
/* JADX INFO: loaded from: classes.dex */
final class C0052b extends AbstractC0061k {

    /* JADX INFO: renamed from: a */
    private final long f121a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2439o f122b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2433i f123c;

    C0052b(long j3, AbstractC2439o abstractC2439o, AbstractC2433i abstractC2433i) {
        this.f121a = j3;
        if (abstractC2439o == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f122b = abstractC2439o;
        if (abstractC2433i == null) {
            throw new NullPointerException("Null event");
        }
        this.f123c = abstractC2433i;
    }

    @Override // p004B0.AbstractC0061k
    /* JADX INFO: renamed from: b */
    public AbstractC2433i mo169b() {
        return this.f123c;
    }

    @Override // p004B0.AbstractC0061k
    /* JADX INFO: renamed from: c */
    public long mo170c() {
        return this.f121a;
    }

    @Override // p004B0.AbstractC0061k
    /* JADX INFO: renamed from: d */
    public AbstractC2439o mo171d() {
        return this.f122b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0061k) {
            AbstractC0061k abstractC0061k = (AbstractC0061k) obj;
            if (this.f121a == abstractC0061k.mo170c() && this.f122b.equals(abstractC0061k.mo171d()) && this.f123c.equals(abstractC0061k.mo169b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j3 = this.f121a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f122b.hashCode()) * 1000003) ^ this.f123c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f121a + ", transportContext=" + this.f122b + ", event=" + this.f123c + "}";
    }
}
