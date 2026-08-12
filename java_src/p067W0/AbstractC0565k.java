package p067W0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import p009D.AbstractC0091a;

/* JADX INFO: renamed from: W0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0565k {
    /* JADX INFO: renamed from: a */
    public static Typeface m2114a(Context context, Typeface typeface) {
        return m2115b(context.getResources().getConfiguration(), typeface);
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m2115b(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC0091a.m258b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
