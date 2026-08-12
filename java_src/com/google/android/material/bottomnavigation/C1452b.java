package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.AbstractC1570g;
import com.google.android.material.navigation.AbstractC1574k;
import java.util.ArrayList;
import java.util.List;
import p016F0.AbstractC0142c;

/* JADX INFO: renamed from: com.google.android.material.bottomnavigation.b */
/* JADX INFO: loaded from: classes.dex */
public class C1452b extends AbstractC1574k {

    /* JADX INFO: renamed from: b0 */
    private final int f7092b0;

    /* JADX INFO: renamed from: c0 */
    private final int f7093c0;

    /* JADX INFO: renamed from: d0 */
    private final int f7094d0;

    /* JADX INFO: renamed from: e0 */
    private final int f7095e0;

    /* JADX INFO: renamed from: f0 */
    private boolean f7096f0;

    /* JADX INFO: renamed from: g0 */
    private final List f7097g0;

    public C1452b(Context context) {
        super(context);
        this.f7097g0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f7092b0 = resources.getDimensionPixelSize(AbstractC0142c.f403f);
        this.f7093c0 = resources.getDimensionPixelSize(AbstractC0142c.f405g);
        this.f7094d0 = resources.getDimensionPixelSize(AbstractC0142c.f399d);
        this.f7095e0 = resources.getDimensionPixelSize(AbstractC0142c.f401e);
    }

    @Override // com.google.android.material.navigation.AbstractC1574k
    /* JADX INFO: renamed from: h */
    protected AbstractC1570g mo7587h(Context context) {
        return new C1451a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int i7 = i5 - i3;
        int i8 = i6 - i4;
        int measuredWidth = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i10 = i7 - measuredWidth;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i8);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i8);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        int measuredWidth;
        int iMax;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i3);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        this.f7097g0.clear();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), Integer.MIN_VALUE);
        int i7 = 0;
        if (getItemIconGravity() == 0) {
            if (m8609j(getLabelVisibilityMode(), currentVisibleContentItemCount) && m7588r()) {
                View childAt = getChildAt(getSelectedItemPosition());
                int iMax2 = this.f7095e0;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f7094d0, Integer.MIN_VALUE), iMakeMeasureSpec);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                }
                int i8 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int iMin = Math.min(size - (this.f7093c0 * i8), Math.min(iMax2, this.f7094d0));
                int i9 = size - iMin;
                int iMin2 = Math.min(i9 / (i8 != 0 ? i8 : 1), this.f7092b0);
                int i10 = i9 - (i8 * iMin2);
                int i11 = 0;
                while (i11 < childCount) {
                    if (getChildAt(i11).getVisibility() != 8) {
                        i6 = i11 == getSelectedItemPosition() ? iMin : iMin2;
                        if (i10 > 0) {
                            i6++;
                            i10--;
                        }
                    } else {
                        i6 = 0;
                    }
                    this.f7097g0.add(Integer.valueOf(i6));
                    i11++;
                }
            } else {
                int iMin3 = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), this.f7094d0);
                int i12 = size - (currentVisibleContentItemCount * iMin3);
                for (int i13 = 0; i13 < childCount; i13++) {
                    if (getChildAt(i13).getVisibility() == 8) {
                        i5 = 0;
                    } else if (i12 > 0) {
                        i5 = iMin3 + 1;
                        i12--;
                    } else {
                        i5 = iMin3;
                    }
                    this.f7097g0.add(Integer.valueOf(i5));
                }
            }
            measuredWidth = 0;
            iMax = 0;
            while (i7 < childCount) {
                View childAt2 = getChildAt(i7);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) this.f7097g0.get(i7)).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    measuredWidth += childAt2.getMeasuredWidth();
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight());
                }
                i7++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f3 = size;
            float fMin = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f3;
            float f4 = currentVisibleContentItemCount;
            int iRound = Math.round(fMin / f4);
            int iRound2 = Math.round(f3 / f4);
            int measuredWidth2 = 0;
            int iMax3 = 0;
            while (i7 < childCount) {
                View childAt3 = getChildAt(i7);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound2, Integer.MIN_VALUE), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    measuredWidth2 += childAt3.getMeasuredWidth();
                    iMax3 = Math.max(iMax3, childAt3.getMeasuredHeight());
                }
                i7++;
            }
            measuredWidth = measuredWidth2;
            iMax = iMax3;
        }
        setMeasuredDimension(measuredWidth, Math.max(iMax, getSuggestedMinimumHeight()));
    }

    /* JADX INFO: renamed from: r */
    public boolean m7588r() {
        return this.f7096f0;
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        this.f7096f0 = z2;
    }
}
