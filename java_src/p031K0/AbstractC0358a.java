package p031K0;

import android.graphics.Canvas;

/* JADX INFO: renamed from: K0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0358a {

    /* JADX INFO: renamed from: K0.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1327a(Canvas canvas);
    }

    /* JADX INFO: renamed from: a */
    public static int m1326a(Canvas canvas, float f3, float f4, float f5, float f6, int i3) {
        return canvas.saveLayerAlpha(f3, f4, f5, f6, i3);
    }
}
