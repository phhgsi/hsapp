package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.lifecycle.J */
/* JADX INFO: loaded from: classes.dex */
public class C1109J {

    /* JADX INFO: renamed from: a */
    private final Map f5285a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m5087a() {
        Iterator it = this.f5285a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC1105F) it.next()).m5072a();
        }
        this.f5285a.clear();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1105F m5088b(String str) {
        AbstractC0606k.m2145e(str, "key");
        return (AbstractC1105F) this.f5285a.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final Set m5089c() {
        return new HashSet(this.f5285a.keySet());
    }

    /* JADX INFO: renamed from: d */
    public final void m5090d(String str, AbstractC1105F abstractC1105F) {
        AbstractC0606k.m2145e(str, "key");
        AbstractC0606k.m2145e(abstractC1105F, "viewModel");
        AbstractC1105F abstractC1105F2 = (AbstractC1105F) this.f5285a.put(str, abstractC1105F);
        if (abstractC1105F2 != null) {
            abstractC1105F2.mo4984d();
        }
    }
}
