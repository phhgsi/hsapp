package co.median.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.AbstractC0966b;
import co.median.android.jrejze.R;
import p061U0.C0540g;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p138p0.AbstractC2313a;

/* JADX INFO: loaded from: classes.dex */
public final class MedianProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final long f6731a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MedianProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC0606k.m2145e(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m7111c(MedianProgressView medianProgressView) {
        medianProgressView.setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    public final void m7112b() {
        animate().alpha(0.0f).setDuration(this.f6731a).withEndAction(new Runnable() { // from class: co.median.android.widget.h
            @Override // java.lang.Runnable
            public final void run() {
                MedianProgressView.m7111c(this.f6833d);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m7113d() {
        setAlpha(1.0f);
        setVisibility(4);
    }

    /* JADX INFO: renamed from: e */
    public final void m7114e() {
        C0540g c0540g = new C0540g(getContext());
        c0540g.setIndeterminate(true);
        c0540g.setIndicatorColor(AbstractC0966b.getColor(c0540g.getContext(), R.color.progress_indicator));
        addView(c0540g);
    }

    /* JADX INFO: renamed from: f */
    public final void m7115f() {
        setVisibility(0);
        setAlpha(1.0f);
    }

    public final void setProgressView(AbstractC2313a abstractC2313a) {
        AbstractC0606k.m2145e(abstractC2313a, "progressViewItem");
        throw null;
    }

    public /* synthetic */ MedianProgressView(Context context, AttributeSet attributeSet, int i3, int i4, AbstractC0602g abstractC0602g) {
        this(context, (i4 & 2) != 0 ? null : attributeSet, (i4 & 4) != 0 ? 0 : i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MedianProgressView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        AbstractC0606k.m2145e(context, "context");
        this.f6731a = 60L;
    }
}
