package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.g */
/* JADX INFO: loaded from: classes.dex */
public class C0945g extends View {
    public C0945g(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i3) {
        ConstraintLayout.C0937b c0937b = (ConstraintLayout.C0937b) getLayoutParams();
        c0937b.f3900a = i3;
        setLayoutParams(c0937b);
    }

    public void setGuidelineEnd(int i3) {
        ConstraintLayout.C0937b c0937b = (ConstraintLayout.C0937b) getLayoutParams();
        c0937b.f3902b = i3;
        setLayoutParams(c0937b);
    }

    public void setGuidelinePercent(float f3) {
        ConstraintLayout.C0937b c0937b = (ConstraintLayout.C0937b) getLayoutParams();
        c0937b.f3904c = f3;
        setLayoutParams(c0937b);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
    }
}
