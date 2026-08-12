package p027J;

import android.view.MotionEvent;

/* JADX INFO: renamed from: J.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0323z {
    /* JADX INFO: renamed from: a */
    public static boolean m1164a(MotionEvent motionEvent, int i3) {
        return (motionEvent.getSource() & i3) == i3;
    }
}
