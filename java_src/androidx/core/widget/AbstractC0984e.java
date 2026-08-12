package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: androidx.core.widget.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0984e {

    /* JADX INFO: renamed from: androidx.core.widget.e$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static ColorStateList m4372a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* JADX INFO: renamed from: b */
        static PorterDuff.Mode m4373b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* JADX INFO: renamed from: c */
        static void m4374c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* JADX INFO: renamed from: d */
        static void m4375d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m4368a(ImageView imageView) {
        return a.m4372a(imageView);
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m4369b(ImageView imageView) {
        return a.m4373b(imageView);
    }

    /* JADX INFO: renamed from: c */
    public static void m4370c(ImageView imageView, ColorStateList colorStateList) {
        a.m4374c(imageView, colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m4371d(ImageView imageView, PorterDuff.Mode mode) {
        a.m4375d(imageView, mode);
    }
}
