package p107h;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: renamed from: h.a */
/* JADX INFO: loaded from: classes.dex */
public class C1984a implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    private Locale f9516a;

    public C1984a(Context context) {
        this.f9516a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f9516a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i3, Rect rect) {
    }
}
