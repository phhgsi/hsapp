package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.AbstractC0772b;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: androidx.appcompat.app.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0745a {
    /* JADX INFO: renamed from: A */
    public AbstractC0772b mo2738A(AbstractC0772b.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo2697g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo2698h();

    /* JADX INFO: renamed from: i */
    public abstract void mo2699i(boolean z2);

    /* JADX INFO: renamed from: j */
    public abstract int mo2700j();

    /* JADX INFO: renamed from: k */
    public abstract Context mo2701k();

    /* JADX INFO: renamed from: l */
    public abstract void mo2702l();

    /* JADX INFO: renamed from: m */
    public boolean mo2703m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void mo2704n(Configuration configuration) {
    }

    /* JADX INFO: renamed from: o */
    void mo2705o() {
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo2706p(int i3, KeyEvent keyEvent);

    /* JADX INFO: renamed from: q */
    public boolean mo2707q(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo2708r() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo2709s(boolean z2);

    /* JADX INFO: renamed from: t */
    public abstract void mo2710t(boolean z2);

    /* JADX INFO: renamed from: u */
    public abstract void mo2711u(boolean z2);

    /* JADX INFO: renamed from: v */
    public abstract void mo2712v(int i3);

    /* JADX INFO: renamed from: w */
    public abstract void mo2713w(Drawable drawable);

    /* JADX INFO: renamed from: x */
    public abstract void mo2714x(boolean z2);

    /* JADX INFO: renamed from: y */
    public abstract void mo2715y(CharSequence charSequence);

    /* JADX INFO: renamed from: z */
    public abstract void mo2716z();

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f2659a;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2659a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1769j.f9107t);
            this.f2659a = typedArrayObtainStyledAttributes.getInt(AbstractC1769j.f9112u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i3, int i4) {
            super(i3, i4);
            this.f2659a = 8388627;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f2659a = 0;
            this.f2659a = aVar.f2659a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2659a = 0;
        }
    }
}
