package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: androidx.core.widget.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0982c {

    /* JADX INFO: renamed from: androidx.core.widget.c$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static ColorStateList m4355a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* JADX INFO: renamed from: b */
        static PorterDuff.Mode m4356b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* JADX INFO: renamed from: c */
        static void m4357c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* JADX INFO: renamed from: d */
        static void m4358d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.c$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static Drawable m4359a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m4350a(CompoundButton compoundButton) {
        return b.m4359a(compoundButton);
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m4351b(CompoundButton compoundButton) {
        return a.m4355a(compoundButton);
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m4352c(CompoundButton compoundButton) {
        return a.m4356b(compoundButton);
    }

    /* JADX INFO: renamed from: d */
    public static void m4353d(CompoundButton compoundButton, ColorStateList colorStateList) {
        a.m4357c(compoundButton, colorStateList);
    }

    /* JADX INFO: renamed from: e */
    public static void m4354e(CompoundButton compoundButton, PorterDuff.Mode mode) {
        a.m4358d(compoundButton, mode);
    }
}
