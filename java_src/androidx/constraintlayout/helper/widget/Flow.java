package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC0947i;
import androidx.constraintlayout.widget.AbstractC0949k;
import p146s.AbstractC2390l;
import p146s.C2383e;
import p146s.C2385g;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC0949k {

    /* JADX INFO: renamed from: l */
    private C2385g f3848l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0949k, androidx.constraintlayout.widget.AbstractC0941c
    /* JADX INFO: renamed from: i */
    protected void mo4001i(AttributeSet attributeSet) {
        super.mo4001i(attributeSet);
        this.f3848l = new C2385g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0947i.f4463m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0947i.f4472n1) {
                    this.f3848l.m11442w2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0947i.f4481o1) {
                    this.f3848l.m11475C1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0947i.f4571y1) {
                    this.f3848l.m11480H1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0947i.f4580z1) {
                    this.f3848l.m11477E1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0947i.f4490p1) {
                    this.f3848l.m11478F1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0947i.f4499q1) {
                    this.f3848l.m11481I1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0947i.f4508r1) {
                    this.f3848l.m11479G1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0947i.f4517s1) {
                    this.f3848l.m11476D1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0947i.f4339Y1) {
                    this.f3848l.m11427B2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0947i.f4259O1) {
                    this.f3848l.m11435q2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0947i.f4331X1) {
                    this.f3848l.m11426A2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0947i.f4208I1) {
                    this.f3848l.m11429k2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0947i.f4275Q1) {
                    this.f3848l.m11437s2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0947i.f4226K1) {
                    this.f3848l.m11431m2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0947i.f4291S1) {
                    this.f3848l.m11439u2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0947i.f4243M1) {
                    this.f3848l.m11433o2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0947i.f4199H1) {
                    this.f3848l.m11428j2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0947i.f4267P1) {
                    this.f3848l.m11436r2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0947i.f4217J1) {
                    this.f3848l.m11430l2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0947i.f4283R1) {
                    this.f3848l.m11438t2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0947i.f4315V1) {
                    this.f3848l.m11444y2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0947i.f4235L1) {
                    this.f3848l.m11432n2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == AbstractC0947i.f4307U1) {
                    this.f3848l.m11443x2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == AbstractC0947i.f4251N1) {
                    this.f3848l.m11434p2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0947i.f4323W1) {
                    this.f3848l.m11445z2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0947i.f4299T1) {
                    this.f3848l.m11440v2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f3981d = this.f3848l;
        m4046o();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0941c
    /* JADX INFO: renamed from: j */
    public void mo4002j(C2383e c2383e, boolean z2) {
        this.f3848l.m11482n1(z2);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0941c, android.view.View
    protected void onMeasure(int i3, int i4) {
        mo4003p(this.f3848l, i3, i4);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0949k
    /* JADX INFO: renamed from: p */
    public void mo4003p(AbstractC2390l abstractC2390l, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (abstractC2390l == null) {
            setMeasuredDimension(0, 0);
        } else {
            abstractC2390l.mo11441w1(mode, size, mode2, size2);
            setMeasuredDimension(abstractC2390l.m11486r1(), abstractC2390l.m11485q1());
        }
    }

    public void setFirstHorizontalBias(float f3) {
        this.f3848l.m11428j2(f3);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i3) {
        this.f3848l.m11429k2(i3);
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.f3848l.m11430l2(f3);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i3) {
        this.f3848l.m11431m2(i3);
        requestLayout();
    }

    public void setHorizontalAlign(int i3) {
        this.f3848l.m11432n2(i3);
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.f3848l.m11433o2(f3);
        requestLayout();
    }

    public void setHorizontalGap(int i3) {
        this.f3848l.m11434p2(i3);
        requestLayout();
    }

    public void setHorizontalStyle(int i3) {
        this.f3848l.m11435q2(i3);
        requestLayout();
    }

    public void setMaxElementsWrap(int i3) {
        this.f3848l.m11440v2(i3);
        requestLayout();
    }

    public void setOrientation(int i3) {
        this.f3848l.m11442w2(i3);
        requestLayout();
    }

    public void setPadding(int i3) {
        this.f3848l.m11475C1(i3);
        requestLayout();
    }

    public void setPaddingBottom(int i3) {
        this.f3848l.m11476D1(i3);
        requestLayout();
    }

    public void setPaddingLeft(int i3) {
        this.f3848l.m11478F1(i3);
        requestLayout();
    }

    public void setPaddingRight(int i3) {
        this.f3848l.m11479G1(i3);
        requestLayout();
    }

    public void setPaddingTop(int i3) {
        this.f3848l.m11481I1(i3);
        requestLayout();
    }

    public void setVerticalAlign(int i3) {
        this.f3848l.m11443x2(i3);
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.f3848l.m11444y2(f3);
        requestLayout();
    }

    public void setVerticalGap(int i3) {
        this.f3848l.m11445z2(i3);
        requestLayout();
    }

    public void setVerticalStyle(int i3) {
        this.f3848l.m11426A2(i3);
        requestLayout();
    }

    public void setWrapMode(int i3) {
        this.f3848l.m11427B2(i3);
        requestLayout();
    }
}
