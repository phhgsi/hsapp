package androidx.activity;

import android.window.BackEvent;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.activity.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0701a {

    /* JADX INFO: renamed from: a */
    public static final C0701a f2442a = new C0701a();

    private C0701a() {
    }

    /* JADX INFO: renamed from: a */
    public final BackEvent m2622a(float f3, float f4, float f5, int i3) {
        return new BackEvent(f3, f4, f5, i3);
    }

    /* JADX INFO: renamed from: b */
    public final float m2623b(BackEvent backEvent) {
        AbstractC0606k.m2145e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: c */
    public final int m2624c(BackEvent backEvent) {
        AbstractC0606k.m2145e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: d */
    public final float m2625d(BackEvent backEvent) {
        AbstractC0606k.m2145e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: e */
    public final float m2626e(BackEvent backEvent) {
        AbstractC0606k.m2145e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
