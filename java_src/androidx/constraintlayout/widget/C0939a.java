package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p146s.C2379a;
import p146s.C2383e;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.a */
/* JADX INFO: loaded from: classes.dex */
public class C0939a extends AbstractC0941c {

    /* JADX INFO: renamed from: j */
    private int f3957j;

    /* JADX INFO: renamed from: k */
    private int f3958k;

    /* JADX INFO: renamed from: l */
    private C2379a f3959l;

    public C0939a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX INFO: renamed from: p */
    private void m4029p(C2383e c2383e, int i3, boolean z2) {
        this.f3958k = i3;
        if (z2) {
            int i4 = this.f3957j;
            if (i4 == 5) {
                this.f3958k = 1;
            } else if (i4 == 6) {
                this.f3958k = 0;
            }
        } else {
            int i5 = this.f3957j;
            if (i5 == 5) {
                this.f3958k = 0;
            } else if (i5 == 6) {
                this.f3958k = 1;
            }
        }
        if (c2383e instanceof C2379a) {
            ((C2379a) c2383e).m11231u1(this.f3958k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f3959l.m11225o1();
    }

    public int getMargin() {
        return this.f3959l.m11227q1();
    }

    public int getType() {
        return this.f3957j;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0941c
    /* JADX INFO: renamed from: i */
    protected void mo4001i(AttributeSet attributeSet) {
        super.mo4001i(attributeSet);
        this.f3959l = new C2379a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0947i.f4463m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0947i.f4154C1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0947i.f4145B1) {
                    this.f3959l.m11230t1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == AbstractC0947i.f4163D1) {
                    this.f3959l.m11232v1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f3981d = this.f3959l;
        m4046o();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0941c
    /* JADX INFO: renamed from: j */
    public void mo4002j(C2383e c2383e, boolean z2) {
        m4029p(c2383e, this.f3957j, z2);
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3959l.m11230t1(z2);
    }

    public void setDpMargin(int i3) {
        this.f3959l.m11232v1((int) ((i3 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i3) {
        this.f3959l.m11232v1(i3);
    }

    public void setType(int i3) {
        this.f3957j = i3;
    }
}
