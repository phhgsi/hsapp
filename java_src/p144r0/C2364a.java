package p144r0;

/* JADX INFO: renamed from: r0.a */
/* JADX INFO: loaded from: classes.dex */
final class C2364a extends AbstractC2367d {

    /* JADX INFO: renamed from: a */
    private final Integer f10841a;

    /* JADX INFO: renamed from: b */
    private final Object f10842b;

    /* JADX INFO: renamed from: c */
    private final EnumC2368e f10843c;

    /* JADX INFO: renamed from: d */
    private final AbstractC2369f f10844d;

    C2364a(Integer num, Object obj, EnumC2368e enumC2368e, AbstractC2369f abstractC2369f) {
        this.f10841a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f10842b = obj;
        if (enumC2368e == null) {
            throw new NullPointerException("Null priority");
        }
        this.f10843c = enumC2368e;
        this.f10844d = abstractC2369f;
    }

    @Override // p144r0.AbstractC2367d
    /* JADX INFO: renamed from: a */
    public Integer mo11208a() {
        return this.f10841a;
    }

    @Override // p144r0.AbstractC2367d
    /* JADX INFO: renamed from: b */
    public Object mo11209b() {
        return this.f10842b;
    }

    @Override // p144r0.AbstractC2367d
    /* JADX INFO: renamed from: c */
    public EnumC2368e mo11210c() {
        return this.f10843c;
    }

    @Override // p144r0.AbstractC2367d
    /* JADX INFO: renamed from: d */
    public AbstractC2369f mo11211d() {
        return this.f10844d;
    }

    public boolean equals(Object obj) {
        AbstractC2369f abstractC2369f;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2367d) {
            AbstractC2367d abstractC2367d = (AbstractC2367d) obj;
            Integer num = this.f10841a;
            if (num != null ? num.equals(abstractC2367d.mo11208a()) : abstractC2367d.mo11208a() == null) {
                if (this.f10842b.equals(abstractC2367d.mo11209b()) && this.f10843c.equals(abstractC2367d.mo11210c()) && ((abstractC2369f = this.f10844d) != null ? abstractC2369f.equals(abstractC2367d.mo11211d()) : abstractC2367d.mo11211d() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f10841a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f10842b.hashCode()) * 1000003) ^ this.f10843c.hashCode()) * 1000003;
        AbstractC2369f abstractC2369f = this.f10844d;
        return iHashCode ^ (abstractC2369f != null ? abstractC2369f.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f10841a + ", payload=" + this.f10842b + ", priority=" + this.f10843c + ", productData=" + this.f10844d + "}";
    }
}
