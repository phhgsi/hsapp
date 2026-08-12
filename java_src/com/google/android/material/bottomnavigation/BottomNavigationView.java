package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.C0888e0;
import com.google.android.material.internal.AbstractC1546q;
import com.google.android.material.internal.AbstractC1549t;
import com.google.android.material.navigation.AbstractC1574k;
import com.google.android.material.navigation.NavigationBarView;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p027J.C0318w0;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends NavigationBarView {

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    class C1448a implements AbstractC1549t.c {
        C1448a() {
        }

        @Override // com.google.android.material.internal.AbstractC1549t.c
        /* JADX INFO: renamed from: a */
        public C0318w0 mo7586a(View view, C0318w0 c0318w0, AbstractC1549t.d dVar) {
            dVar.f7811d += c0318w0.m1085i();
            boolean z2 = view.getLayoutDirection() == 1;
            int iM1086j = c0318w0.m1086j();
            int iM1087k = c0318w0.m1087k();
            dVar.f7808a += z2 ? iM1087k : iM1086j;
            int i3 = dVar.f7810c;
            if (!z2) {
                iM1086j = iM1087k;
            }
            dVar.f7810c = i3 + iM1086j;
            dVar.m8507a(view);
            return c0318w0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface InterfaceC1449b extends NavigationBarView.InterfaceC1557b {
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface InterfaceC1450c extends NavigationBarView.InterfaceC1558c {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f335c);
    }

    /* JADX INFO: renamed from: h */
    private void m7583h() {
        AbstractC1549t.m8497b(this, new C1448a());
    }

    /* JADX INFO: renamed from: i */
    private int m7584i(int i3) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i3) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i3;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i3), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), Integer.MIN_VALUE);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    /* JADX INFO: renamed from: c */
    protected AbstractC1574k mo7585c(Context context) {
        return new C1452b(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(i3, m7584i(i4));
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        C1452b c1452b = (C1452b) getMenuView();
        if (c1452b.m7588r() != z2) {
            c1452b.setItemHorizontalTranslationEnabled(z2);
            getPresenter().mo3068i(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC1449b interfaceC1449b) {
        setOnItemReselectedListener(interfaceC1449b);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC1450c interfaceC1450c) {
        setOnItemSelectedListener(interfaceC1450c);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, AbstractC0149j.f573f);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        C0888e0 c0888e0M8489j = AbstractC1546q.m8489j(getContext(), attributeSet, AbstractC0150k.f919j0, i3, i4, new int[0]);
        setItemHorizontalTranslationEnabled(c0888e0M8489j.m3766a(AbstractC0150k.f939l0, true));
        int i5 = AbstractC0150k.f929k0;
        if (c0888e0M8489j.m3784s(i5)) {
            setMinimumHeight(c0888e0M8489j.m3771f(i5, 0));
        }
        c0888e0M8489j.m3786x();
        m7583h();
    }
}
