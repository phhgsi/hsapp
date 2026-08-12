package p144r0;

/* JADX INFO: renamed from: r0.b */
/* JADX INFO: loaded from: classes.dex */
final class C2365b extends AbstractC2369f {

    /* JADX INFO: renamed from: a */
    private final Integer f10845a;

    C2365b(Integer num) {
        this.f10845a = num;
    }

    @Override // p144r0.AbstractC2369f
    /* JADX INFO: renamed from: a */
    public Integer mo11212a() {
        return this.f10845a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2369f)) {
            return false;
        }
        Integer num = this.f10845a;
        Integer numMo11212a = ((AbstractC2369f) obj).mo11212a();
        return num == null ? numMo11212a == null : num.equals(numMo11212a);
    }

    public int hashCode() {
        Integer num = this.f10845a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f10845a + "}";
    }
}
