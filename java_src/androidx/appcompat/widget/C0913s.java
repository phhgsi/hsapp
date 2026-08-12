package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.AbstractC0987h;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: androidx.appcompat.widget.s */
/* JADX INFO: loaded from: classes.dex */
class C0913s extends PopupWindow {

    /* JADX INFO: renamed from: b */
    private static final boolean f3763b = false;

    /* JADX INFO: renamed from: a */
    private boolean f3764a;

    public C0913s(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        m3882a(context, attributeSet, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    private void m3882a(Context context, AttributeSet attributeSet, int i3, int i4) {
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context, attributeSet, AbstractC1769j.f9045g2, i3, i4);
        int i5 = AbstractC1769j.f9055i2;
        if (c0888e0M3765v.m3784s(i5)) {
            m3883b(c0888e0M3765v.m3766a(i5, false));
        }
        setBackgroundDrawable(c0888e0M3765v.m3772g(AbstractC1769j.f9050h2));
        c0888e0M3765v.m3786x();
    }

    /* JADX INFO: renamed from: b */
    private void m3883b(boolean z2) {
        if (f3763b) {
            this.f3764a = z2;
        } else {
            AbstractC0987h.m4377a(this, z2);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i3, int i4) {
        if (f3763b && this.f3764a) {
            i4 -= view.getHeight();
        }
        super.showAsDropDown(view, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i3, int i4, int i5, int i6) {
        if (f3763b && this.f3764a) {
            i4 -= view.getHeight();
        }
        super.update(view, i3, i4, i5, i6);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i3, int i4, int i5) {
        if (f3763b && this.f3764a) {
            i4 -= view.getHeight();
        }
        super.showAsDropDown(view, i3, i4, i5);
    }
}
