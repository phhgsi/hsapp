package p029J1;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p139p1.C2322c;
import p139p1.InterfaceC2324e;
import p139p1.InterfaceC2327h;
import p139p1.InterfaceC2329j;

/* JADX INFO: renamed from: J1.b */
/* JADX INFO: loaded from: classes.dex */
public class C0328b implements InterfaceC2329j {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m1168b(String str, C2322c c2322c, InterfaceC2324e interfaceC2324e) {
        try {
            AbstractC0329c.m1171b(str);
            return c2322c.m11103h().mo195a(interfaceC2324e);
        } finally {
            AbstractC0329c.m1170a();
        }
    }

    @Override // p139p1.InterfaceC2329j
    /* JADX INFO: renamed from: a */
    public List mo1169a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C2322c c2322cM11110r : componentRegistrar.getComponents()) {
            final String strM11104i = c2322cM11110r.m11104i();
            if (strM11104i != null) {
                c2322cM11110r = c2322cM11110r.m11110r(new InterfaceC2327h() { // from class: J1.a
                    @Override // p139p1.InterfaceC2327h
                    /* JADX INFO: renamed from: a */
                    public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                        return C0328b.m1168b(strM11104i, c2322cM11110r, interfaceC2324e);
                    }
                });
            }
            arrayList.add(c2322cM11110r);
        }
        return arrayList;
    }
}
