package p093d1;

/* JADX INFO: renamed from: d1.A */
/* JADX INFO: loaded from: classes.dex */
final class C1786A extends AbstractC1792d {

    /* JADX INFO: renamed from: a */
    private final int f9144a;

    /* JADX INFO: renamed from: b */
    private final boolean f9145b;

    /* synthetic */ C1786A(int i3, boolean z2, AbstractC1814z abstractC1814z) {
        this.f9144a = i3;
        this.f9145b = z2;
    }

    @Override // p093d1.AbstractC1792d
    /* JADX INFO: renamed from: a */
    public final boolean mo9535a() {
        return this.f9145b;
    }

    @Override // p093d1.AbstractC1792d
    /* JADX INFO: renamed from: b */
    public final int mo9536b() {
        return this.f9144a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1792d) {
            AbstractC1792d abstractC1792d = (AbstractC1792d) obj;
            if (this.f9144a == abstractC1792d.mo9536b() && this.f9145b == abstractC1792d.mo9535a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9144a ^ 1000003) * 1000003) ^ (true != this.f9145b ? 1237 : 1231);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f9144a + ", allowAssetPackDeletion=" + this.f9145b + "}";
    }
}
