package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1283b {

    /* JADX INFO: renamed from: a */
    Animatable2.AnimationCallback f6231a;

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.b$a */
    class a extends Animatable2.AnimationCallback {
        a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            AbstractC1283b.this.mo1933b(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            AbstractC1283b.this.mo6476c(drawable);
        }
    }

    /* JADX INFO: renamed from: a */
    Animatable2.AnimationCallback m6475a() {
        if (this.f6231a == null) {
            this.f6231a = new a();
        }
        return this.f6231a;
    }

    /* JADX INFO: renamed from: b */
    public void mo1933b(Drawable drawable) {
    }

    /* JADX INFO: renamed from: c */
    public void mo6476c(Drawable drawable) {
    }
}
