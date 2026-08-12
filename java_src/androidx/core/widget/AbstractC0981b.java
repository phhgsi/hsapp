package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: androidx.core.widget.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0981b {

    /* JADX INFO: renamed from: androidx.core.widget.b$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static void m4348a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* JADX INFO: renamed from: b */
        static void m4349b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m4345a(CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    /* JADX INFO: renamed from: b */
    public static void m4346b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        a.m4348a(checkedTextView, colorStateList);
    }

    /* JADX INFO: renamed from: c */
    public static void m4347c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        a.m4349b(checkedTextView, mode);
    }
}
