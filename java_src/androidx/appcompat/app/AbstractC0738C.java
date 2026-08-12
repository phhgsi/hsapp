package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;
import p012E.C0112i;

/* JADX INFO: renamed from: androidx.appcompat.app.C */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0738C {
    /* JADX INFO: renamed from: a */
    private static C0112i m2687a(C0112i c0112i, C0112i c0112i2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i3 = 0;
        while (i3 < c0112i.m343g() + c0112i2.m343g()) {
            Locale localeM341d = i3 < c0112i.m343g() ? c0112i.m341d(i3) : c0112i2.m341d(i3 - c0112i.m343g());
            if (localeM341d != null) {
                linkedHashSet.add(localeM341d);
            }
            i3++;
        }
        return C0112i.m336a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* JADX INFO: renamed from: b */
    static C0112i m2688b(C0112i c0112i, C0112i c0112i2) {
        return (c0112i == null || c0112i.m342f()) ? C0112i.m339e() : m2687a(c0112i, c0112i2);
    }
}
