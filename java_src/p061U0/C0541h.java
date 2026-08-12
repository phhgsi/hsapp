package p061U0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.AbstractC1546q;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0150k;
import p067W0.AbstractC0557c;

/* JADX INFO: renamed from: U0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0541h extends AbstractC0536c {

    /* JADX INFO: renamed from: o */
    public int f1883o;

    /* JADX INFO: renamed from: p */
    public int f1884p;

    /* JADX INFO: renamed from: q */
    public int f1885q;

    /* JADX INFO: renamed from: r */
    public int f1886r;

    /* JADX INFO: renamed from: s */
    public boolean f1887s;

    public C0541h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f338f);
    }

    public C0541h(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, C0540g.f1882q);
    }

    public C0541h(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC0142c.f434u0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(AbstractC0142c.f432t0);
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context, attributeSet, AbstractC0150k.f623D1, i3, i4, new int[0]);
        this.f1883o = typedArrayM8488i.getInt(AbstractC0150k.f632E1, 0);
        this.f1884p = Math.max(AbstractC0557c.m2080d(context, typedArrayM8488i, AbstractC0150k.f668I1, dimensionPixelSize), this.f1826a * 2);
        this.f1885q = AbstractC0557c.m2080d(context, typedArrayM8488i, AbstractC0150k.f659H1, dimensionPixelSize2);
        this.f1886r = typedArrayM8488i.getInt(AbstractC0150k.f650G1, 0);
        this.f1887s = typedArrayM8488i.getBoolean(AbstractC0150k.f641F1, true);
        typedArrayM8488i.recycle();
        m1941h();
    }
}
