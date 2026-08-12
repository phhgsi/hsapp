package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.AbstractC0966b;
import com.google.android.material.internal.AbstractC1546q;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p067W0.AbstractC0557c;
import p076Z0.C0637h;
import p089c1.AbstractC1313a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: f */
    private static final int f7601f = AbstractC0149j.f591x;

    /* JADX INFO: renamed from: a */
    private final C0637h f7602a;

    /* JADX INFO: renamed from: b */
    private int f7603b;

    /* JADX INFO: renamed from: c */
    private int f7604c;

    /* JADX INFO: renamed from: d */
    private int f7605d;

    /* JADX INFO: renamed from: e */
    private int f7606e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f353u);
    }

    public int getDividerColor() {
        return this.f7604c;
    }

    public int getDividerInsetEnd() {
        return this.f7606e;
    }

    public int getDividerInsetStart() {
        return this.f7605d;
    }

    public int getDividerThickness() {
        return this.f7603b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i3;
        super.onDraw(canvas);
        boolean z2 = getLayoutDirection() == 1;
        int i4 = z2 ? this.f7606e : this.f7605d;
        if (z2) {
            width = getWidth();
            i3 = this.f7605d;
        } else {
            width = getWidth();
            i3 = this.f7606e;
        }
        this.f7602a.setBounds(i4, 0, width - i3, getBottom() - getTop());
        this.f7602a.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i4);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i5 = this.f7603b;
            if (i5 > 0 && measuredHeight != i5) {
                measuredHeight = i5;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i3) {
        if (this.f7604c != i3) {
            this.f7604c = i3;
            this.f7602a.m2274c0(ColorStateList.valueOf(i3));
            invalidate();
        }
    }

    public void setDividerColorResource(int i3) {
        setDividerColor(AbstractC0966b.getColor(getContext(), i3));
    }

    public void setDividerInsetEnd(int i3) {
        this.f7606e = i3;
    }

    public void setDividerInsetEndResource(int i3) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i3));
    }

    public void setDividerInsetStart(int i3) {
        this.f7605d = i3;
    }

    public void setDividerInsetStartResource(int i3) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i3));
    }

    public void setDividerThickness(int i3) {
        if (this.f7603b != i3) {
            this.f7603b = i3;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i3) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i3));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i3) {
        int i4 = f7601f;
        super(AbstractC1313a.m6668d(context, attributeSet, i3, i4), attributeSet, i3);
        Context context2 = getContext();
        this.f7602a = new C0637h();
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context2, attributeSet, AbstractC0150k.f742Q3, i3, i4, new int[0]);
        this.f7603b = typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f778U3, getResources().getDimensionPixelSize(AbstractC0142c.f376J));
        this.f7605d = typedArrayM8488i.getDimensionPixelOffset(AbstractC0150k.f769T3, 0);
        this.f7606e = typedArrayM8488i.getDimensionPixelOffset(AbstractC0150k.f760S3, 0);
        setDividerColor(AbstractC0557c.m2077a(context2, typedArrayM8488i, AbstractC0150k.f751R3).getDefaultColor());
        typedArrayM8488i.recycle();
    }
}
