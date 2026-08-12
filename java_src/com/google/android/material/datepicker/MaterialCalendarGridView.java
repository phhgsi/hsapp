package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import p016F0.AbstractC0144e;
import p027J.AbstractC0268W;
import p027J.C0273a;
import p030K.C0356y;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    private final Calendar f7472a;

    /* JADX INFO: renamed from: b */
    private final boolean f7473b;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C1492a extends C0273a {
        C1492a() {
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            c0356y.m1290u0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    private void m8121a(int i3, Rect rect) {
        if (i3 == 33) {
            setSelection(getAdapter().m8208k());
        } else if (i3 == 130) {
            setSelection(getAdapter().m8203b());
        } else {
            super.onFocusChanged(true, i3, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1503j getAdapter() {
        return (C1503j) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1503j adapter = getAdapter();
        adapter.getClass();
        int iMax = Math.max(adapter.m8203b(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.m8208k(), getLastVisiblePosition());
        adapter.getItem(iMax);
        adapter.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z2, int i3, Rect rect) {
        if (z2) {
            m8121a(i3, rect);
        } else {
            super.onFocusChanged(false, i3, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (!super.onKeyDown(i3, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().m8203b() && selectedItemPosition <= getAdapter().m8208k())) {
            return true;
        }
        if (19 != i3) {
            return false;
        }
        setSelection(getAdapter().m8203b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i3, int i4) {
        if (!this.f7473b) {
            super.onMeasure(i3, i4);
            return;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i3) {
        if (i3 < getAdapter().m8203b()) {
            super.setSelection(getAdapter().m8203b());
        } else {
            super.setSelection(i3);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f7472a = AbstractC1514u.m8237k();
        if (C1501h.m8188u(getContext())) {
            setNextFocusLeftId(AbstractC0144e.f481a);
            setNextFocusRightId(AbstractC0144e.f484d);
        }
        this.f7473b = C1501h.m8190w(getContext());
        AbstractC0268W.m775i0(this, new C1492a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C1503j)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C1503j.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
