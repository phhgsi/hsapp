package p027J;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p003B.InterfaceMenuItemC0029b;

/* JADX INFO: renamed from: J.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0319x {

    /* JADX INFO: renamed from: J.x$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static MenuItem m1152a(MenuItem menuItem, char c3, int i3) {
            return menuItem.setAlphabeticShortcut(c3, i3);
        }

        /* JADX INFO: renamed from: b */
        static MenuItem m1153b(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* JADX INFO: renamed from: c */
        static MenuItem m1154c(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* JADX INFO: renamed from: d */
        static MenuItem m1155d(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* JADX INFO: renamed from: e */
        static MenuItem m1156e(MenuItem menuItem, char c3, int i3) {
            return menuItem.setNumericShortcut(c3, i3);
        }

        /* JADX INFO: renamed from: f */
        static MenuItem m1157f(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a */
    public static MenuItem m1145a(MenuItem menuItem, AbstractC0275b abstractC0275b) {
        if (menuItem instanceof InterfaceMenuItemC0029b) {
            return ((InterfaceMenuItemC0029b) menuItem).mo81b(abstractC0275b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* JADX INFO: renamed from: b */
    public static void m1146b(MenuItem menuItem, char c3, int i3) {
        if (menuItem instanceof InterfaceMenuItemC0029b) {
            ((InterfaceMenuItemC0029b) menuItem).setAlphabeticShortcut(c3, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1152a(menuItem, c3, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1147c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0029b) {
            ((InterfaceMenuItemC0029b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1153b(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1148d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC0029b) {
            ((InterfaceMenuItemC0029b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1154c(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1149e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC0029b) {
            ((InterfaceMenuItemC0029b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1155d(menuItem, mode);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1150f(MenuItem menuItem, char c3, int i3) {
        if (menuItem instanceof InterfaceMenuItemC0029b) {
            ((InterfaceMenuItemC0029b) menuItem).setNumericShortcut(c3, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1156e(menuItem, c3, i3);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1151g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0029b) {
            ((InterfaceMenuItemC0029b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1157f(menuItem, charSequence);
        }
    }
}
