package p117j1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: j1.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2070d implements InterfaceC2048A {
    AbstractC2070d() {
    }

    @Override // p117j1.InterfaceC2048A
    /* JADX INFO: renamed from: a */
    public abstract Map mo10266a();

    /* JADX INFO: renamed from: b */
    public boolean mo10328b(Object obj) {
        Iterator it = mo10266a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        return AbstractC2049B.m10267a(this, obj);
    }

    public int hashCode() {
        return mo10266a().hashCode();
    }

    public String toString() {
        return mo10266a().toString();
    }
}
