package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p091d.AbstractC1769j;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a */
    private int f3578a;

    /* JADX INFO: renamed from: b */
    private int f3579b;

    /* JADX INFO: renamed from: c */
    private WeakReference f3580c;

    /* JADX INFO: renamed from: d */
    private LayoutInflater f3581d;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface InterfaceC0874a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    public View m3708a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f3578a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f3581d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f3578a, viewGroup, false);
        int i3 = this.f3579b;
        if (i3 != -1) {
            viewInflate.setId(i3);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f3580c = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f3579b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f3581d;
    }

    public int getLayoutResource() {
        return this.f3578a;
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.f3579b = i3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f3581d = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f3578a = i3;
    }

    public void setOnInflateListener(InterfaceC0874a interfaceC0874a) {
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        WeakReference weakReference = this.f3580c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i3);
            return;
        }
        super.setVisibility(i3);
        if (i3 == 0 || i3 == 4) {
            m3708a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3578a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1769j.f9023c4, i3, 0);
        this.f3579b = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f9041f4, -1);
        this.f3578a = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f9035e4, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f9029d4, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
