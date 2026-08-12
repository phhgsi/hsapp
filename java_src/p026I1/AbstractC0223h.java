package p026I1;

import android.content.Context;
import p139p1.C2322c;
import p139p1.C2337r;
import p139p1.InterfaceC2324e;
import p139p1.InterfaceC2327h;

/* JADX INFO: renamed from: I1.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0223h {

    /* JADX INFO: renamed from: I1.h$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        String mo627a(Object obj);
    }

    /* JADX INFO: renamed from: b */
    public static C2322c m625b(String str, String str2) {
        return C2322c.m11099l(AbstractC0221f.m623a(str, str2), AbstractC0221f.class);
    }

    /* JADX INFO: renamed from: c */
    public static C2322c m626c(final String str, final a aVar) {
        return C2322c.m11100m(AbstractC0221f.class).m11115b(C2337r.m11166j(Context.class)).m11119f(new InterfaceC2327h() { // from class: I1.g
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return AbstractC0221f.m623a(str, aVar.mo627a((Context) interfaceC2324e.mo11086a(Context.class)));
            }
        }).m11117d();
    }
}
