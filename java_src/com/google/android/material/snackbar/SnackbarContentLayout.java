package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0144e;
import p019G0.AbstractC0176a;
import p058T0.AbstractC0528h;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private TextView f8044a;

    /* JADX INFO: renamed from: b */
    private Button f8045b;

    /* JADX INFO: renamed from: c */
    private final TimeInterpolator f8046c;

    /* JADX INFO: renamed from: d */
    private int f8047d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8046c = AbstractC0528h.m1911g(context, AbstractC0140a.f314G, AbstractC0176a.f1126b);
    }

    /* JADX INFO: renamed from: a */
    private static void m8707a(View view, int i3, int i4) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i3, view.getPaddingEnd(), i4);
        } else {
            view.setPadding(view.getPaddingLeft(), i3, view.getPaddingRight(), i4);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m8708b(int i3, int i4, int i5) {
        boolean z2;
        if (i3 != getOrientation()) {
            setOrientation(i3);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f8044a.getPaddingTop() == i4 && this.f8044a.getPaddingBottom() == i5) {
            return z2;
        }
        m8707a(this.f8044a, i4, i5);
        return true;
    }

    public Button getActionView() {
        return this.f8045b;
    }

    public TextView getMessageView() {
        return this.f8044a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f8044a = (TextView) findViewById(AbstractC0144e.f471P);
        this.f8045b = (Button) findViewById(AbstractC0144e.f470O);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC0142c.f417m);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(AbstractC0142c.f415l);
        Layout layout = this.f8044a.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f8047d <= 0 || this.f8045b.getMeasuredWidth() <= this.f8047d) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m8708b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m8708b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i3, i4);
    }

    public void setMaxInlineActionWidth(int i3) {
        this.f8047d = i3;
    }
}
