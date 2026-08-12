package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private InterfaceC0838O f3287a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0838O interfaceC0838O = this.f3287a;
        if (interfaceC0838O != null) {
            interfaceC0838O.m3481a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC0838O interfaceC0838O) {
        this.f3287a = interfaceC0838O;
    }
}
