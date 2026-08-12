package p167z;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import p167z.AbstractC2570c;

/* JADX INFO: renamed from: z.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2568a {

    /* JADX INFO: renamed from: z.a$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static ColorFilter m12255a(int i3, Object obj) {
            return new BlendModeColorFilter(i3, (BlendMode) obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ColorFilter m12254a(int i3, EnumC2569b enumC2569b) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objM12258a = AbstractC2570c.b.m12258a(enumC2569b);
            if (objM12258a != null) {
                return a.m12255a(i3, objM12258a);
            }
            return null;
        }
        PorterDuff.Mode modeM12257a = AbstractC2570c.m12257a(enumC2569b);
        if (modeM12257a != null) {
            return new PorterDuffColorFilter(i3, modeM12257a);
        }
        return null;
    }
}
