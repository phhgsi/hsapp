package co.median.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public class GoNativeDrawerLayout extends DrawerLayout {

    /* JADX INFO: renamed from: S */
    private boolean f6730S;

    public GoNativeDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f6730S) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        Log.d("SWIPE", "GNDrawerLayout disabled touch");
        return false;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6730S) {
            return super.onTouchEvent(motionEvent);
        }
        Log.d("SWIPE", "GNDrawerLayout disabled touch");
        return false;
    }

    public void setDisableTouch(boolean z2) {
        this.f6730S = z2;
    }

    public GoNativeDrawerLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f6730S = false;
    }
}
