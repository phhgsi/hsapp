package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private int f7617a;

    /* JADX INFO: renamed from: b */
    private boolean f7618b;

    public BaselineLayout(Context context) {
        super(context, null, 0);
        this.f7617a = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f7617a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i5 - i3) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f7617a == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f7617a + paddingTop) - childAt.getBaseline();
                childAt.layout(i8, baseline, measuredWidth + i8, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        int childCount = getChildCount();
        int iMax = 0;
        int paddingBottom = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        int iMax3 = -1;
        int iMax4 = -1;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i3, i4);
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    iMax3 = Math.max(iMax3, baseline);
                    iMax4 = Math.max(iMax4, childAt.getMeasuredHeight() - baseline);
                }
                iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                paddingBottom = Math.max(paddingBottom, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        if (iMax3 != -1) {
            if (this.f7618b) {
                paddingBottom = Math.max(paddingBottom, Math.max(iMax4, getPaddingBottom()) + iMax3);
            }
            this.f7617a = iMax3;
        }
        if (!this.f7618b) {
            paddingBottom = iMax + getPaddingBottom();
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax2, getSuggestedMinimumWidth()), i3, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates << 16));
    }

    public void setMeasurePaddingFromBaseline(boolean z2) {
        this.f7618b = z2;
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7617a = -1;
    }
}
