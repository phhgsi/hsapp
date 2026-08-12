package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0740E;

/* JADX INFO: renamed from: com.google.android.material.datepicker.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1502i<S> extends AbstractC1506m {

    /* JADX INFO: renamed from: b */
    private int f7577b;

    /* JADX INFO: renamed from: c */
    private CalendarConstraints f7578c;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.i$a */
    class a extends AbstractC1505l {
        a() {
        }
    }

    /* JADX INFO: renamed from: k */
    static C1502i m8195k(DateSelector dateSelector, int i3, CalendarConstraints calendarConstraints) {
        C1502i c1502i = new C1502i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        c1502i.setArguments(bundle);
        return c1502i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f7577b = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC0740E.m2693a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f7578c = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f7577b));
        new a();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7577b);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7578c);
    }
}
