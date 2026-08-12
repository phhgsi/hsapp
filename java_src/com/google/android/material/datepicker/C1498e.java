package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p016F0.AbstractC0146g;
import p016F0.AbstractC0148i;

/* JADX INFO: renamed from: com.google.android.material.datepicker.e */
/* JADX INFO: loaded from: classes.dex */
class C1498e extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    private static final int f7496d;

    /* JADX INFO: renamed from: a */
    private final Calendar f7497a;

    /* JADX INFO: renamed from: b */
    private final int f7498b;

    /* JADX INFO: renamed from: c */
    private final int f7499c;

    static {
        f7496d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C1498e() {
        Calendar calendarM8237k = AbstractC1514u.m8237k();
        this.f7497a = calendarM8237k;
        this.f7498b = calendarM8237k.getMaximum(7);
        this.f7499c = calendarM8237k.getFirstDayOfWeek();
    }

    /* JADX INFO: renamed from: b */
    private int m8149b(int i3) {
        int i4 = i3 + this.f7499c;
        int i5 = this.f7498b;
        return i4 > i5 ? i4 - i5 : i4;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i3) {
        if (i3 >= this.f7498b) {
            return null;
        }
        return Integer.valueOf(m8149b(i3));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7498b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i3) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC0146g.f529t, viewGroup, false);
        }
        this.f7497a.set(7, m8149b(i3));
        textView.setText(this.f7497a.getDisplayName(7, f7496d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(AbstractC0148i.f557q), this.f7497a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C1498e(int i3) {
        Calendar calendarM8237k = AbstractC1514u.m8237k();
        this.f7497a = calendarM8237k;
        this.f7498b = calendarM8237k.getMaximum(7);
        this.f7499c = i3;
    }
}
