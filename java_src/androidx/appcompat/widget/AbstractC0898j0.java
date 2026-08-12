package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.widget.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0898j0 {

    /* JADX INFO: renamed from: androidx.appcompat.widget.j0$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m3830a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3829a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.m3830a(view, charSequence);
        } else {
            ViewOnLongClickListenerC0904m0.m3852g(view, charSequence);
        }
    }
}
