package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p127m.AbstractC2141a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private final int f3782a;

    /* JADX INFO: renamed from: b */
    private final int f3783b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3782a = getResources().getDimensionPixelOffset(AbstractC2141a.f9940b);
        this.f3783b = getResources().getDimensionPixelOffset(AbstractC2141a.f9939a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f3782a * 2), this.f3783b), 1073741824), i4);
    }
}
