package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: androidx.appcompat.widget.x */
/* JADX INFO: loaded from: classes.dex */
public class C0918x extends SeekBar {

    /* JADX INFO: renamed from: a */
    private final C0919y f3773a;

    public C0918x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8693K);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f3773a.m3897h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f3773a.m3898i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3773a.m3896g(canvas);
    }

    public C0918x(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        AbstractC0880a0.m3741a(this, getContext());
        C0919y c0919y = new C0919y(this);
        this.f3773a = c0919y;
        c0919y.mo3887c(attributeSet, i3);
    }
}
