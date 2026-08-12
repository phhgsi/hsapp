package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.j */
/* JADX INFO: loaded from: classes.dex */
class C1503j extends BaseAdapter {

    /* JADX INFO: renamed from: e */
    static final int f7580e = AbstractC1514u.m8237k().getMaximum(4);

    /* JADX INFO: renamed from: f */
    private static final int f7581f = (AbstractC1514u.m8237k().getMaximum(5) + AbstractC1514u.m8237k().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: a */
    final Month f7582a;

    /* JADX INFO: renamed from: b */
    private Collection f7583b;

    /* JADX INFO: renamed from: c */
    C1495b f7584c;

    /* JADX INFO: renamed from: d */
    final CalendarConstraints f7585d;

    C1503j(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f7582a = month;
        this.f7585d = calendarConstraints;
        this.f7583b = dateSelector.m8117c();
    }

    /* JADX INFO: renamed from: c */
    private String m8196c(Context context, long j3) {
        return AbstractC1497d.m8140a(context, j3, m8199j(j3), m8207i(j3), m8206g(j3));
    }

    /* JADX INFO: renamed from: f */
    private void m8197f(Context context) {
        if (this.f7584c == null) {
            this.f7584c = new C1495b(context);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m8198h(long j3) {
        throw null;
    }

    /* JADX INFO: renamed from: j */
    private boolean m8199j(long j3) {
        return AbstractC1514u.m8235i().getTimeInMillis() == j3;
    }

    /* JADX INFO: renamed from: m */
    private void m8200m(TextView textView, long j3, int i3) {
        C1494a c1494a;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(m8196c(textView.getContext(), j3));
        if (this.f7585d.m8105h().mo8112b(j3)) {
            textView.setEnabled(true);
            boolean zM8198h = m8198h(j3);
            textView.setSelected(zM8198h);
            c1494a = zM8198h ? this.f7584c.f7489b : m8199j(j3) ? this.f7584c.f7490c : this.f7584c.f7488a;
        } else {
            textView.setEnabled(false);
            c1494a = this.f7584c.f7494g;
        }
        c1494a.m8137b(textView);
    }

    /* JADX INFO: renamed from: n */
    private void m8201n(MaterialCalendarGridView materialCalendarGridView, long j3) {
        if (Month.m8124e(j3).equals(this.f7582a)) {
            int iM8129i = this.f7582a.m8129i(j3);
            m8200m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().m8202a(iM8129i) - materialCalendarGridView.getFirstVisiblePosition()), j3, iM8129i);
        }
    }

    /* JADX INFO: renamed from: a */
    int m8202a(int i3) {
        return m8203b() + (i3 - 1);
    }

    /* JADX INFO: renamed from: b */
    int m8203b() {
        return this.f7582a.m8127g(this.f7585d.m8107j());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i3) {
        if (i3 < m8203b() || i3 > m8208k()) {
            return null;
        }
        return Long.valueOf(this.f7582a.m8128h(m8209l(i3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            android.content.Context r1 = r8.getContext()
            r5.m8197f(r1)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r7 != 0) goto L1f
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r1 = p016F0.AbstractC0146g.f528s
            android.view.View r7 = r7.inflate(r1, r8, r2)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
        L1f:
            int r7 = r5.m8203b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.Month r8 = r5.f7582a
            int r3 = r8.f7479h
            if (r7 < r3) goto L2e
            goto L54
        L2e:
            int r7 = r7 + r0
            r1.setTag(r8)
            android.content.res.Resources r8 = r1.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r1.setText(r8)
            r1.setVisibility(r2)
            r1.setEnabled(r0)
            goto L5d
        L54:
            r7 = 8
            r1.setVisibility(r7)
            r1.setEnabled(r2)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r1
        L64:
            long r2 = r6.longValue()
            r5.m8200m(r1, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C1503j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: renamed from: g */
    boolean m8206g(long j3) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f7581f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i3) {
        return i3 / this.f7582a.f7478g;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    boolean m8207i(long j3) {
        throw null;
    }

    /* JADX INFO: renamed from: k */
    int m8208k() {
        return (m8203b() + this.f7582a.f7479h) - 1;
    }

    /* JADX INFO: renamed from: l */
    int m8209l(int i3) {
        return (i3 - m8203b()) + 1;
    }

    /* JADX INFO: renamed from: o */
    public void m8210o(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f7583b.iterator();
        while (it.hasNext()) {
            m8201n(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    /* JADX INFO: renamed from: p */
    boolean m8211p(int i3) {
        return i3 >= m8203b() && i3 <= m8208k();
    }
}
