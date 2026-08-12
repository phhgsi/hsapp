package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C0899k;
import com.google.android.material.internal.AbstractC1535f;
import com.google.android.material.internal.AbstractC1546q;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p089c1.AbstractC1313a;
import p091d.AbstractC1760a;

/* JADX INFO: loaded from: classes.dex */
public class TextInputEditText extends C0899k {

    /* JADX INFO: renamed from: g */
    private final Rect f8064g;

    /* JADX INFO: renamed from: h */
    private boolean f8065h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8684B);
    }

    /* JADX INFO: renamed from: e */
    private boolean m8752e(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f8065h;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m8752e(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f8064g);
        rect.bottom = this.f8064g.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m8752e(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.m8823T()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m8823T() && super.getHint() == null && AbstractC1535f.m8383b()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.C0899k, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m8752e(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f8064g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f8064g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z2) {
        this.f8065h = z2;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i3) {
        super(AbstractC1313a.m6668d(context, attributeSet, i3, 0), attributeSet, i3);
        this.f8064g = new Rect();
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context, attributeSet, AbstractC0150k.f709M6, i3, AbstractC0149j.f577j, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayM8488i.getBoolean(AbstractC0150k.f718N6, false));
        typedArrayM8488i.recycle();
    }
}
