package p046P0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: P0.a */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnTouchListenerC0467a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    private final Dialog f1669a;

    /* JADX INFO: renamed from: b */
    private final int f1670b;

    /* JADX INFO: renamed from: c */
    private final int f1671c;

    /* JADX INFO: renamed from: d */
    private final int f1672d;

    public ViewOnTouchListenerC0467a(Dialog dialog, Rect rect) {
        this.f1669a = dialog;
        this.f1670b = rect.left;
        this.f1671c = rect.top;
        this.f1672d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f1670b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f1671c + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i3 = this.f1672d;
            motionEventObtain.setLocation((-i3) - 1, (-i3) - 1);
        }
        view.performClick();
        return this.f1669a.onTouchEvent(motionEventObtain);
    }
}
