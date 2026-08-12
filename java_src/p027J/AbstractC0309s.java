package p027J;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: renamed from: J.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0309s {
    /* JADX INFO: renamed from: a */
    public static void m1052a(int i3, int i4, int i5, Rect rect, Rect rect2, int i6) {
        Gravity.apply(i3, i4, i5, rect, rect2, i6);
    }

    /* JADX INFO: renamed from: b */
    public static int m1053b(int i3, int i4) {
        return Gravity.getAbsoluteGravity(i3, i4);
    }
}
