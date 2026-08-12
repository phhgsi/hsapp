package p051R;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C1015f;

/* JADX INFO: renamed from: R.h */
/* JADX INFO: loaded from: classes.dex */
class C0497h implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    private final TransformationMethod f1730a;

    C0497h(TransformationMethod transformationMethod) {
        this.f1730a = transformationMethod;
    }

    /* JADX INFO: renamed from: a */
    public TransformationMethod m1841a() {
        return this.f1730a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1730a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C1015f.m4527c().m4535e() != 1) ? charSequence : C1015f.m4527c().m4540p(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i3, Rect rect) {
        TransformationMethod transformationMethod = this.f1730a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i3, rect);
        }
    }
}
