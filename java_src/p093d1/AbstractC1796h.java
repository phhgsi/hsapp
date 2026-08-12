package p093d1;

import android.content.Context;
import p097e1.AbstractC1838C;

/* JADX INFO: renamed from: d1.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1796h {

    /* JADX INFO: renamed from: a */
    private static InterfaceC1793e f9170a;

    /* JADX INFO: renamed from: a */
    static synchronized InterfaceC1793e m9554a(Context context) {
        try {
            if (f9170a == null) {
                C1795g c1795g = new C1795g(null);
                c1795g.m9553b(new C1802n(AbstractC1838C.m9633a(context)));
                f9170a = c1795g.m9552a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9170a;
    }
}
