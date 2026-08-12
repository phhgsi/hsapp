package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1499f;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0146g;
import p027J.AbstractC0268W;

/* JADX INFO: renamed from: com.google.android.material.datepicker.k */
/* JADX INFO: loaded from: classes.dex */
class C1504k extends RecyclerView.AbstractC1197h {

    /* JADX INFO: renamed from: d */
    private final CalendarConstraints f7586d;

    /* JADX INFO: renamed from: e */
    private final C1499f.m f7587e;

    /* JADX INFO: renamed from: f */
    private final int f7588f;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.k$a */
    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaterialCalendarGridView f7589a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f7589a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
            if (this.f7589a.getAdapter().m8211p(i3)) {
                C1504k.this.f7587e.mo8175a(this.f7589a.getAdapter().getItem(i3).longValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.k$b */
    public static class b extends RecyclerView.AbstractC1188C {

        /* JADX INFO: renamed from: u */
        final TextView f7591u;

        /* JADX INFO: renamed from: v */
        final MaterialCalendarGridView f7592v;

        b(LinearLayout linearLayout, boolean z2) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(AbstractC0144e.f501u);
            this.f7591u = textView;
            AbstractC0268W.m777j0(textView, true);
            this.f7592v = (MaterialCalendarGridView) linearLayout.findViewById(AbstractC0144e.f497q);
            if (z2) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    C1504k(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, C1499f.m mVar) {
        Month monthM8110m = calendarConstraints.m8110m();
        Month monthM8106i = calendarConstraints.m8106i();
        Month monthM8109l = calendarConstraints.m8109l();
        if (monthM8110m.compareTo(monthM8109l) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthM8109l.compareTo(monthM8106i) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f7588f = (C1503j.f7580e * C1499f.m8164x(context)) + (C1501h.m8188u(context) ? C1499f.m8164x(context) : 0);
        this.f7586d = calendarConstraints;
        this.f7587e = mVar;
        m5733v(true);
    }

    /* JADX INFO: renamed from: A */
    int m8213A(Month month) {
        return this.f7586d.m8110m().m8133m(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo5724m(b bVar, int i3) {
        Month monthM8132l = this.f7586d.m8110m().m8132l(i3);
        bVar.f7591u.setText(monthM8132l.m8130j());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f7592v.findViewById(AbstractC0144e.f497q);
        if (materialCalendarGridView.getAdapter() == null || !monthM8132l.equals(materialCalendarGridView.getAdapter().f7582a)) {
            C1503j c1503j = new C1503j(monthM8132l, null, this.f7586d, null);
            materialCalendarGridView.setNumColumns(monthM8132l.f7478g);
            materialCalendarGridView.setAdapter((ListAdapter) c1503j);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m8210o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public b mo5726o(ViewGroup viewGroup, int i3) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC0146g.f531v, viewGroup, false);
        if (!C1501h.m8188u(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C1206q(-1, this.f7588f));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
    /* JADX INFO: renamed from: d */
    public int mo5715d() {
        return this.f7586d.m8108k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
    /* JADX INFO: renamed from: e */
    public long mo5716e(int i3) {
        return this.f7586d.m8110m().m8132l(i3).m8131k();
    }

    /* JADX INFO: renamed from: y */
    Month m8216y(int i3) {
        return this.f7586d.m8110m().m8132l(i3);
    }

    /* JADX INFO: renamed from: z */
    CharSequence m8217z(int i3) {
        return m8216y(i3).m8130j();
    }
}
