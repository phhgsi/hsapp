package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p051R.C0490a;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: androidx.appcompat.widget.l */
/* JADX INFO: loaded from: classes.dex */
class C0901l {

    /* JADX INFO: renamed from: a */
    private final EditText f3719a;

    /* JADX INFO: renamed from: b */
    private final C0490a f3720b;

    C0901l(EditText editText) {
        this.f3719a = editText;
        this.f3720b = new C0490a(editText, false);
    }

    /* JADX INFO: renamed from: a */
    KeyListener m3836a(KeyListener keyListener) {
        return m3837b(keyListener) ? this.f3720b.m1804a(keyListener) : keyListener;
    }

    /* JADX INFO: renamed from: b */
    boolean m3837b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: renamed from: c */
    void m3838c(AttributeSet attributeSet, int i3) {
        TypedArray typedArrayObtainStyledAttributes = this.f3719a.getContext().obtainStyledAttributes(attributeSet, AbstractC1769j.f9043g0, i3, 0);
        try {
            int i4 = AbstractC1769j.f9113u0;
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(i4) ? typedArrayObtainStyledAttributes.getBoolean(i4, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m3840e(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    InputConnection m3839d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f3720b.m1805b(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: e */
    void m3840e(boolean z2) {
        this.f3720b.m1806c(z2);
    }
}
