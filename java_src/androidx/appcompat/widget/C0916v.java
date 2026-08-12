package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: androidx.appcompat.widget.v */
/* JADX INFO: loaded from: classes.dex */
public class C0916v extends RatingBar {

    /* JADX INFO: renamed from: a */
    private final C0914t f3772a;

    public C0916v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8691I);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        Bitmap bitmapM3886b = this.f3772a.m3886b();
        if (bitmapM3886b != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM3886b.getWidth() * getNumStars(), i3, 0), getMeasuredHeight());
        }
    }

    public C0916v(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        AbstractC0880a0.m3741a(this, getContext());
        C0914t c0914t = new C0914t(this);
        this.f3772a = c0914t;
        c0914t.mo3887c(attributeSet, i3);
    }
}
