package p076Z0;

/* JADX INFO: renamed from: Z0.f */
/* JADX INFO: loaded from: classes.dex */
public class C0635f extends AbstractC0634e {

    /* JADX INFO: renamed from: a */
    float f2165a = -1.0f;

    @Override // p076Z0.AbstractC0634e
    /* JADX INFO: renamed from: a */
    public void mo2217a(C0643n c0643n, float f3, float f4, float f5) {
        float f6 = f5 * f4;
        c0643n.m2399o(0.0f, f6, 180.0f, 180.0f - f3);
        double d3 = f6;
        c0643n.m2397m((float) (Math.sin(Math.toRadians(f3)) * d3), (float) (Math.sin(Math.toRadians(90.0f - f3)) * d3));
    }
}
