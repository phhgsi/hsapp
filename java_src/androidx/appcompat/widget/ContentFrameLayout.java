package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private TypedValue f3275a;

    /* JADX INFO: renamed from: b */
    private TypedValue f3276b;

    /* JADX INFO: renamed from: c */
    private TypedValue f3277c;

    /* JADX INFO: renamed from: d */
    private TypedValue f3278d;

    /* JADX INFO: renamed from: e */
    private TypedValue f3279e;

    /* JADX INFO: renamed from: f */
    private TypedValue f3280f;

    /* JADX INFO: renamed from: g */
    private final Rect f3281g;

    /* JADX INFO: renamed from: h */
    private InterfaceC0826a f3282h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC0826a {
        /* JADX INFO: renamed from: a */
        void mo2928a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public void m3417a(int i3, int i4, int i5, int i6) {
        this.f3281g.set(i3, i4, i5, i6);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3279e == null) {
            this.f3279e = new TypedValue();
        }
        return this.f3279e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3280f == null) {
            this.f3280f = new TypedValue();
        }
        return this.f3280f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3277c == null) {
            this.f3277c = new TypedValue();
        }
        return this.f3277c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3278d == null) {
            this.f3278d = new TypedValue();
        }
        return this.f3278d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3275a == null) {
            this.f3275a = new TypedValue();
        }
        return this.f3275a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3276b == null) {
            this.f3276b = new TypedValue();
        }
        return this.f3276b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0826a interfaceC0826a = this.f3282h;
        if (interfaceC0826a != null) {
            interfaceC0826a.mo2928a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0826a interfaceC0826a = this.f3282h;
        if (interfaceC0826a != null) {
            interfaceC0826a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0826a interfaceC0826a) {
        this.f3282h = interfaceC0826a;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3281g = new Rect();
    }
}
