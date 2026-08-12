package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.common.api.Api;
import p075Z.AbstractC0629g;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private int f5485a;

    /* JADX INFO: renamed from: b */
    private int f5486b;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f5486b;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f5485a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i3);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i3 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i4);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i4 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i3) {
        this.f5486b = i3;
        super.setMaxHeight(i3);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i3) {
        this.f5485a = i3;
        super.setMaxWidth(i3);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f5485a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f5486b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2158y0, i3, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0629g.f2053A0, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0629g.f2160z0, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        typedArrayObtainStyledAttributes.recycle();
    }
}
