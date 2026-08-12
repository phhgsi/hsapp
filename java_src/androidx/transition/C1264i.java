package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: renamed from: androidx.transition.i */
/* JADX INFO: loaded from: classes.dex */
class C1264i implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    private Rect f6142a;

    C1264i() {
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f3, Rect rect, Rect rect2) {
        int i3 = rect.left + ((int) ((rect2.left - r0) * f3));
        int i4 = rect.top + ((int) ((rect2.top - r1) * f3));
        int i5 = rect.right + ((int) ((rect2.right - r2) * f3));
        int i6 = rect.bottom + ((int) ((rect2.bottom - r6) * f3));
        Rect rect3 = this.f6142a;
        if (rect3 == null) {
            return new Rect(i3, i4, i5, i6);
        }
        rect3.set(i3, i4, i5, i6);
        return this.f6142a;
    }
}
