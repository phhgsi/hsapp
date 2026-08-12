package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p027J.AbstractC0268W;
import p091d.AbstractC1765f;
import p091d.AbstractC1769j;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private boolean f3259a;

    /* JADX INFO: renamed from: b */
    private boolean f3260b;

    /* JADX INFO: renamed from: c */
    private int f3261c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3261c = -1;
        int[] iArr = AbstractC1769j.f8942N0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC0268W.m771g0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f3259a = typedArrayObtainStyledAttributes.getBoolean(AbstractC1769j.f8947O0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f3259a);
        }
    }

    /* JADX INFO: renamed from: a */
    private int m3386a(int i3) {
        int childCount = getChildCount();
        while (i3 < childCount) {
            if (getChildAt(i3).getVisibility() == 0) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    private boolean m3387b() {
        return this.f3260b;
    }

    private void setStacked(boolean z2) {
        if (this.f3260b != z2) {
            if (!z2 || this.f3259a) {
                this.f3260b = z2;
                setOrientation(z2 ? 1 : 0);
                setGravity(z2 ? 8388613 : 80);
                View viewFindViewById = findViewById(AbstractC1765f.f8799G);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z2 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        int iMakeMeasureSpec;
        boolean z2;
        int size = View.MeasureSpec.getSize(i3);
        int paddingBottom = 0;
        if (this.f3259a) {
            if (size > this.f3261c && m3387b()) {
                setStacked(false);
            }
            this.f3261c = size;
        }
        if (m3387b() || View.MeasureSpec.getMode(i3) != 1073741824) {
            iMakeMeasureSpec = i3;
            z2 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i4);
        if (this.f3259a && !m3387b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(i3, i4);
        }
        int iM3386a = m3386a(0);
        if (iM3386a >= 0) {
            View childAt = getChildAt(iM3386a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (m3387b()) {
                int iM3386a2 = m3386a(iM3386a + 1);
                if (iM3386a2 >= 0) {
                    paddingTop += getChildAt(iM3386a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (AbstractC0268W.m808z(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i4 == 0) {
                super.onMeasure(i3, i4);
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f3259a != z2) {
            this.f3259a = z2;
            if (!z2 && m3387b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
