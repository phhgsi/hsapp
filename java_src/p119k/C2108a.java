package p119k;

import java.util.HashMap;
import java.util.Map;
import p119k.C2109b;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes.dex */
public class C2108a extends C2109b {

    /* JADX INFO: renamed from: h */
    private final HashMap f9832h = new HashMap();

    @Override // p119k.C2109b
    /* JADX INFO: renamed from: c */
    protected C2109b.c mo10551c(Object obj) {
        return (C2109b.c) this.f9832h.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f9832h.containsKey(obj);
    }

    @Override // p119k.C2109b
    /* JADX INFO: renamed from: g */
    public Object mo10552g(Object obj, Object obj2) {
        C2109b.c cVarMo10551c = mo10551c(obj);
        if (cVarMo10551c != null) {
            return cVarMo10551c.f9838e;
        }
        this.f9832h.put(obj, m10558f(obj, obj2));
        return null;
    }

    @Override // p119k.C2109b
    /* JADX INFO: renamed from: h */
    public Object mo10553h(Object obj) {
        Object objMo10553h = super.mo10553h(obj);
        this.f9832h.remove(obj);
        return objMo10553h;
    }

    /* JADX INFO: renamed from: i */
    public Map.Entry m10554i(Object obj) {
        if (contains(obj)) {
            return ((C2109b.c) this.f9832h.get(obj)).f9840g;
        }
        return null;
    }
}
