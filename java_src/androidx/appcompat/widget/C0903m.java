package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import p051R.C0495f;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: androidx.appcompat.widget.m */
/* JADX INFO: loaded from: classes.dex */
class C0903m {

    /* JADX INFO: renamed from: a */
    private final TextView f3722a;

    /* JADX INFO: renamed from: b */
    private final C0495f f3723b;

    C0903m(TextView textView) {
        this.f3722a = textView;
        this.f3723b = new C0495f(textView, false);
    }

    /* JADX INFO: renamed from: a */
    InputFilter[] m3841a(InputFilter[] inputFilterArr) {
        return this.f3723b.m1818a(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public boolean m3842b() {
        return this.f3723b.m1819b();
    }

    /* JADX INFO: renamed from: c */
    void m3843c(AttributeSet attributeSet, int i3) {
        TypedArray typedArrayObtainStyledAttributes = this.f3722a.getContext().obtainStyledAttributes(attributeSet, AbstractC1769j.f9043g0, i3, 0);
        try {
            int i4 = AbstractC1769j.f9113u0;
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(i4) ? typedArrayObtainStyledAttributes.getBoolean(i4, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m3845e(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    void m3844d(boolean z2) {
        this.f3723b.m1820c(z2);
    }

    /* JADX INFO: renamed from: e */
    void m3845e(boolean z2) {
        this.f3723b.m1821d(z2);
    }

    /* JADX INFO: renamed from: f */
    public TransformationMethod m3846f(TransformationMethod transformationMethod) {
        return this.f3723b.m1822e(transformationMethod);
    }
}
