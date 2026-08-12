package androidx.fragment.app;

import android.view.View;
import androidx.collection.C0921a;
import androidx.transition.C1260e;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.A */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1031A {

    /* JADX INFO: renamed from: a */
    static final AbstractC1035C f4907a = new C1032B();

    /* JADX INFO: renamed from: b */
    static final AbstractC1035C f4908b = m4649b();

    /* JADX INFO: renamed from: a */
    static void m4648a(Fragment fragment, Fragment fragment2, boolean z2, C0921a c0921a, boolean z3) {
        if (z2) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    /* JADX INFO: renamed from: b */
    private static AbstractC1035C m4649b() {
        try {
            return (AbstractC1035C) C1260e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    static void m4650c(C0921a c0921a, C0921a c0921a2) {
        for (int size = c0921a.size() - 1; size >= 0; size--) {
            if (!c0921a2.containsKey((String) c0921a.m3948j(size))) {
                c0921a.m3946h(size);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    static void m4651d(ArrayList arrayList, int i3) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i3);
        }
    }
}
