package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p146s.AbstractC2390l;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0949k extends AbstractC0941c {

    /* JADX INFO: renamed from: j */
    private boolean f4589j;

    /* JADX INFO: renamed from: k */
    private boolean f4590k;

    public AbstractC0949k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0941c
    /* JADX INFO: renamed from: f */
    protected void mo4041f(ConstraintLayout constraintLayout) {
        m4040e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0941c
    /* JADX INFO: renamed from: i */
    protected void mo4001i(AttributeSet attributeSet) {
        super.mo4001i(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0947i.f4463m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0947i.f4526t1) {
                    this.f4589j = true;
                } else if (index == AbstractC0947i.f4136A1) {
                    this.f4590k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC0941c, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4589j || this.f4590k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i3 = 0; i3 < this.f3979b; i3++) {
                    View viewM4016l = constraintLayout.m4016l(this.f3978a[i3]);
                    if (viewM4016l != null) {
                        if (this.f4589j) {
                            viewM4016l.setVisibility(visibility);
                        }
                        if (this.f4590k && elevation > 0.0f) {
                            viewM4016l.setTranslationZ(viewM4016l.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo4003p(AbstractC2390l abstractC2390l, int i3, int i4);

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        m4039d();
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        m4039d();
    }
}
