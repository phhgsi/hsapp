package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1228g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.n */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1507n extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$a */
    class a extends C1228g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1228g
        /* JADX INFO: renamed from: v */
        protected float mo6191v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    AbstractC1507n(Context context, int i3, boolean z2) {
        super(context, i3, z2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: M1 */
    public void mo5469M1(RecyclerView recyclerView, RecyclerView.C1215z c1215z, int i3) {
        a aVar = new a(recyclerView.getContext());
        aVar.m5958p(i3);
        m5808N1(aVar);
    }
}
