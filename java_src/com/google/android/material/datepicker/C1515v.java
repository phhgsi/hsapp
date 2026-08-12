package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import p016F0.AbstractC0146g;

/* JADX INFO: renamed from: com.google.android.material.datepicker.v */
/* JADX INFO: loaded from: classes.dex */
class C1515v extends RecyclerView.AbstractC1197h {

    /* JADX INFO: renamed from: d */
    private final C1499f f7599d;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.v$a */
    public static class a extends RecyclerView.AbstractC1188C {

        /* JADX INFO: renamed from: u */
        final TextView f7600u;

        a(TextView textView) {
            super(textView);
            this.f7600u = textView;
        }
    }

    C1515v(C1499f c1499f) {
        this.f7599d = c1499f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a mo5726o(ViewGroup viewGroup, int i3) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC0146g.f533x, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
    /* JADX INFO: renamed from: d */
    public int mo5715d() {
        return this.f7599d.m8170t().m8111n();
    }

    /* JADX INFO: renamed from: x */
    int m8242x(int i3) {
        return i3 - this.f7599d.m8170t().m8110m().f7477f;
    }

    /* JADX INFO: renamed from: y */
    int m8243y(int i3) {
        return this.f7599d.m8170t().m8110m().f7477f + i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1197h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo5724m(a aVar, int i3) {
        int iM8243y = m8243y(i3);
        aVar.f7600u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iM8243y)));
        TextView textView = aVar.f7600u;
        textView.setContentDescription(AbstractC1497d.m8144e(textView.getContext(), iM8243y));
        C1495b c1495bM8171u = this.f7599d.m8171u();
        if (AbstractC1514u.m8235i().get(1) == iM8243y) {
            C1494a c1494a = c1495bM8171u.f7493f;
        } else {
            C1494a c1494a2 = c1495bM8171u.f7491d;
        }
        this.f7599d.m8173w();
        throw null;
    }
}
