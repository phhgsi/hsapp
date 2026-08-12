package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.google.android.material.datepicker.m */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1506m extends Fragment {

    /* JADX INFO: renamed from: a */
    protected final LinkedHashSet f7593a = new LinkedHashSet();

    AbstractC1506m() {
    }

    /* JADX INFO: renamed from: i */
    boolean mo8169i(AbstractC1505l abstractC1505l) {
        return this.f7593a.add(abstractC1505l);
    }

    /* JADX INFO: renamed from: j */
    void m8218j() {
        this.f7593a.clear();
    }
}
