package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1285d {
    /* JADX INFO: renamed from: a */
    public static Interpolator m6486a(Context context, int i3) {
        return AnimationUtils.loadInterpolator(context, i3);
    }
}
