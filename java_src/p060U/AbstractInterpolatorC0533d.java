package p060U;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: U.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractInterpolatorC0533d implements Interpolator {

    /* JADX INFO: renamed from: a */
    private final float[] f1804a;

    /* JADX INFO: renamed from: b */
    private final float f1805b;

    protected AbstractInterpolatorC0533d(float[] fArr) {
        this.f1804a = fArr;
        this.f1805b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1804a;
        int iMin = Math.min((int) ((fArr.length - 1) * f3), fArr.length - 2);
        float f4 = this.f1805b;
        float f5 = (f3 - (iMin * f4)) / f4;
        float[] fArr2 = this.f1804a;
        float f6 = fArr2[iMin];
        return f6 + (f5 * (fArr2[iMin + 1] - f6));
    }
}
