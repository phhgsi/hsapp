package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: com.google.android.material.internal.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1551v {

    /* JADX INFO: renamed from: com.google.android.material.internal.v$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static Rect m8509a(WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.v$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        static Rect m8510a(WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Rect m8508a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? b.m8510a(windowManager) : a.m8509a(windowManager);
    }
}
