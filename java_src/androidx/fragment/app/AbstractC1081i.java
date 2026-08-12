package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p027J.ViewTreeObserverOnPreDrawListenerC0241I;
import p054S.AbstractC0502a;

/* JADX INFO: renamed from: androidx.fragment.app.i */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1081i {
    /* JADX INFO: renamed from: a */
    private static int m4940a(Fragment fragment, boolean z2, boolean z3) {
        return z3 ? z2 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z2 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[Catch: RuntimeException -> 0x0075, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0075, blocks: (B:32:0x0069, B:34:0x006f), top: B:45:0x0069 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static androidx.fragment.app.AbstractC1081i.a m4941b(android.content.Context r4, androidx.fragment.app.Fragment r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.getNextTransition()
            int r7 = m4940a(r5, r6, r7)
            r1 = 0
            r5.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.mContainer
            r2 = 0
            if (r1 == 0) goto L1e
            int r3 = p054S.AbstractC0503b.f1743c
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L1e
            android.view.ViewGroup r1 = r5.mContainer
            r1.setTag(r3, r2)
        L1e:
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L29
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L29
            return r2
        L29:
            android.view.animation.Animation r1 = r5.onCreateAnimation(r0, r6, r7)
            if (r1 == 0) goto L35
            androidx.fragment.app.i$a r4 = new androidx.fragment.app.i$a
            r4.<init>(r1)
            return r4
        L35:
            android.animation.Animator r5 = r5.onCreateAnimator(r0, r6, r7)
            if (r5 == 0) goto L41
            androidx.fragment.app.i$a r4 = new androidx.fragment.app.i$a
            r4.<init>(r5)
            return r4
        L41:
            if (r7 != 0) goto L49
            if (r0 == 0) goto L49
            int r7 = m4943d(r4, r0, r6)
        L49:
            if (r7 == 0) goto L85
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L69
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            if (r6 == 0) goto L85
            androidx.fragment.app.i$a r0 = new androidx.fragment.app.i$a     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            return r0
        L67:
            r4 = move-exception
            throw r4
        L69:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> L75
            if (r6 == 0) goto L85
            androidx.fragment.app.i$a r0 = new androidx.fragment.app.i$a     // Catch: java.lang.RuntimeException -> L75
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> L75
            return r0
        L75:
            r6 = move-exception
            if (r5 != 0) goto L84
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L85
            androidx.fragment.app.i$a r5 = new androidx.fragment.app.i$a
            r5.<init>(r4)
            return r5
        L84:
            throw r6
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC1081i.m4941b(android.content.Context, androidx.fragment.app.Fragment, boolean, boolean):androidx.fragment.app.i$a");
    }

    /* JADX INFO: renamed from: c */
    private static int m4942c(Context context, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i3});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: d */
    private static int m4943d(Context context, int i3, boolean z2) {
        if (i3 == 4097) {
            return z2 ? AbstractC0502a.f1739e : AbstractC0502a.f1740f;
        }
        if (i3 == 8194) {
            return z2 ? AbstractC0502a.f1735a : AbstractC0502a.f1736b;
        }
        if (i3 == 8197) {
            return z2 ? m4942c(context, R.attr.activityCloseEnterAnimation) : m4942c(context, R.attr.activityCloseExitAnimation);
        }
        if (i3 == 4099) {
            return z2 ? AbstractC0502a.f1737c : AbstractC0502a.f1738d;
        }
        if (i3 != 4100) {
            return -1;
        }
        return z2 ? m4942c(context, R.attr.activityOpenEnterAnimation) : m4942c(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$a */
    static class a {

        /* JADX INFO: renamed from: a */
        public final Animation f5177a;

        /* JADX INFO: renamed from: b */
        public final Animator f5178b;

        a(Animation animation) {
            this.f5177a = animation;
            this.f5178b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f5177a = null;
            this.f5178b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$b */
    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: d */
        private final ViewGroup f5179d;

        /* JADX INFO: renamed from: e */
        private final View f5180e;

        /* JADX INFO: renamed from: f */
        private boolean f5181f;

        /* JADX INFO: renamed from: g */
        private boolean f5182g;

        /* JADX INFO: renamed from: h */
        private boolean f5183h;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f5183h = true;
            this.f5179d = viewGroup;
            this.f5180e = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j3, Transformation transformation) {
            this.f5183h = true;
            if (this.f5181f) {
                return !this.f5182g;
            }
            if (!super.getTransformation(j3, transformation)) {
                this.f5181f = true;
                ViewTreeObserverOnPreDrawListenerC0241I.m668a(this.f5179d, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5181f || !this.f5183h) {
                this.f5179d.endViewTransition(this.f5180e);
                this.f5182g = true;
            } else {
                this.f5183h = false;
                this.f5179d.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j3, Transformation transformation, float f3) {
            this.f5183h = true;
            if (this.f5181f) {
                return !this.f5182g;
            }
            if (!super.getTransformation(j3, transformation, f3)) {
                this.f5181f = true;
                ViewTreeObserverOnPreDrawListenerC0241I.m668a(this.f5179d, this);
            }
            return true;
        }
    }
}
