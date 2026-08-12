package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.core.widget.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0987h {

    /* JADX INFO: renamed from: androidx.core.widget.h$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m4380a(PopupWindow popupWindow, boolean z2) {
            popupWindow.setOverlapAnchor(z2);
        }

        /* JADX INFO: renamed from: b */
        static void m4381b(PopupWindow popupWindow, int i3) {
            popupWindow.setWindowLayoutType(i3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4377a(PopupWindow popupWindow, boolean z2) {
        a.m4380a(popupWindow, z2);
    }

    /* JADX INFO: renamed from: b */
    public static void m4378b(PopupWindow popupWindow, int i3) {
        a.m4381b(popupWindow, i3);
    }

    /* JADX INFO: renamed from: c */
    public static void m4379c(PopupWindow popupWindow, View view, int i3, int i4, int i5) {
        popupWindow.showAsDropDown(view, i3, i4, i5);
    }
}
