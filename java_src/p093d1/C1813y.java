package p093d1;

import p093d1.AbstractC1792d;

/* JADX INFO: renamed from: d1.y */
/* JADX INFO: loaded from: classes.dex */
final class C1813y extends AbstractC1792d.a {

    /* JADX INFO: renamed from: a */
    private int f9202a;

    /* JADX INFO: renamed from: b */
    private boolean f9203b;

    /* JADX INFO: renamed from: c */
    private byte f9204c;

    C1813y() {
    }

    @Override // p093d1.AbstractC1792d.a
    /* JADX INFO: renamed from: a */
    public final AbstractC1792d mo9550a() {
        if (this.f9204c == 3) {
            return new C1786A(this.f9202a, this.f9203b, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f9204c & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.f9204c & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // p093d1.AbstractC1792d.a
    /* JADX INFO: renamed from: b */
    public final AbstractC1792d.a mo9551b(boolean z2) {
        this.f9203b = z2;
        this.f9204c = (byte) (this.f9204c | 2);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC1792d.a m9573c(int i3) {
        this.f9202a = i3;
        this.f9204c = (byte) (this.f9204c | 1);
        return this;
    }
}
