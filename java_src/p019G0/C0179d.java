package p019G0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.collection.C0929i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: G0.d */
/* JADX INFO: loaded from: classes.dex */
public class C0179d {

    /* JADX INFO: renamed from: a */
    private final C0929i f1131a = new C0929i();

    /* JADX INFO: renamed from: b */
    private final C0929i f1132b = new C0929i();

    /* JADX INFO: renamed from: a */
    private static void m488a(C0179d c0179d, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0179d.m492e(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c0179d.m493f(objectAnimator.getPropertyName(), C0180e.m494a(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0179d m489b(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        if (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) {
            return null;
        }
        return m490c(context, resourceId);
    }

    /* JADX INFO: renamed from: c */
    public static C0179d m490c(Context context, int i3) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i3);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m491d(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m491d(arrayList);
        } catch (Exception e3) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i3), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static C0179d m491d(List list) {
        C0179d c0179d = new C0179d();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            m488a(c0179d, (Animator) list.get(i3));
        }
        return c0179d;
    }

    /* JADX INFO: renamed from: e */
    public void m492e(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f1132b.put(str, propertyValuesHolderArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0179d) {
            return this.f1131a.equals(((C0179d) obj).f1131a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m493f(String str, C0180e c0180e) {
        this.f1131a.put(str, c0180e);
    }

    public int hashCode() {
        return this.f1131a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f1131a + "}\n";
    }
}
