package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0943e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0146g;
import p016F0.AbstractC0150k;
import p076Z0.C0637h;
import p076Z0.C0639j;

/* JADX INFO: renamed from: com.google.android.material.timepicker.e */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1653e extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    private C0637h f8343A;

    /* JADX INFO: renamed from: y */
    private final Runnable f8344y;

    /* JADX INFO: renamed from: z */
    private int f8345z;

    public AbstractC1653e(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        LayoutInflater.from(context).inflate(AbstractC0146g.f523n, this);
        setBackground(m9095C());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f771T5, i3, 0);
        this.f8345z = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0150k.f780U5, 0);
        this.f8344y = new Runnable() { // from class: com.google.android.material.timepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f8342d.mo9063H();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: B */
    private void m9094B(List list, C0943e c0943e, int i3) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            c0943e.m4066g(((View) it.next()).getId(), AbstractC0144e.f483c, i3, size);
            size += 360.0f / list.size();
        }
    }

    /* JADX INFO: renamed from: C */
    private Drawable m9095C() {
        C0637h c0637h = new C0637h();
        this.f8343A = c0637h;
        c0637h.m2271Z(new C0639j(0.5f));
        this.f8343A.m2274c0(ColorStateList.valueOf(-1));
        return this.f8343A;
    }

    /* JADX INFO: renamed from: G */
    private static boolean m9096G(View view) {
        return "skip".equals(view.getTag());
    }

    /* JADX INFO: renamed from: I */
    private void m9097I() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f8344y);
            handler.post(this.f8344y);
        }
    }

    /* JADX INFO: renamed from: D */
    int m9098D(int i3) {
        return i3 == 2 ? Math.round(this.f8345z * 0.66f) : this.f8345z;
    }

    /* JADX INFO: renamed from: E */
    public int m9099E() {
        return this.f8345z;
    }

    /* JADX INFO: renamed from: F */
    public void mo9062F(int i3) {
        this.f8345z = i3;
        mo9063H();
    }

    /* JADX INFO: renamed from: H */
    protected void mo9063H() {
        C0943e c0943e = new C0943e();
        c0943e.m4065f(this);
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != AbstractC0144e.f483c && !m9096G(childAt)) {
                int i4 = (Integer) childAt.getTag(AbstractC0144e.f491k);
                if (i4 == null) {
                    i4 = 1;
                }
                if (!map.containsKey(i4)) {
                    map.put(i4, new ArrayList());
                }
                ((List) map.get(i4)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            m9094B((List) entry.getValue(), c0943e, m9098D(((Integer) entry.getKey()).intValue()));
        }
        c0943e.m4062c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        m9097I();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        mo9063H();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m9097I();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        this.f8343A.m2274c0(ColorStateList.valueOf(i3));
    }
}
