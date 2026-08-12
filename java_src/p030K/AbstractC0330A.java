package p030K;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: renamed from: K.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0330A {
    /* JADX INFO: renamed from: a */
    public static void m1172a(AccessibilityRecord accessibilityRecord, int i3) {
        accessibilityRecord.setMaxScrollX(i3);
    }

    /* JADX INFO: renamed from: b */
    public static void m1173b(AccessibilityRecord accessibilityRecord, int i3) {
        accessibilityRecord.setMaxScrollY(i3);
    }

    /* JADX INFO: renamed from: c */
    public static void m1174c(AccessibilityRecord accessibilityRecord, View view, int i3) {
        accessibilityRecord.setSource(view, i3);
    }
}
