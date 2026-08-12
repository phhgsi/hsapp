package p019G0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* JADX INFO: renamed from: G0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0177b {
    /* JADX INFO: renamed from: a */
    public static void m485a(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long jMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Animator animator = (Animator) list.get(i3);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
