package p069X;

import androidx.lifecycle.C1106G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p065V1.AbstractC0553a;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;
import p090c2.InterfaceC1315b;

/* JADX INFO: renamed from: X.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0591c {

    /* JADX INFO: renamed from: a */
    private final List f1981a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m2120a(InterfaceC1315b interfaceC1315b, InterfaceC0577l interfaceC0577l) {
        AbstractC0606k.m2145e(interfaceC1315b, "clazz");
        AbstractC0606k.m2145e(interfaceC0577l, "initializer");
        this.f1981a.add(new C0594f(AbstractC0553a.m2062a(interfaceC1315b), interfaceC0577l));
    }

    /* JADX INFO: renamed from: b */
    public final C1106G.b m2121b() {
        C0594f[] c0594fArr = (C0594f[]) this.f1981a.toArray(new C0594f[0]);
        return new C0590b((C0594f[]) Arrays.copyOf(c0594fArr, c0594fArr.length));
    }
}
