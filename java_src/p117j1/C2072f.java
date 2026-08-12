package p117j1;

import java.io.Serializable;
import p113i1.AbstractC2033f;
import p113i1.AbstractC2035h;
import p113i1.InterfaceC2030c;

/* JADX INFO: renamed from: j1.f */
/* JADX INFO: loaded from: classes.dex */
final class C2072f extends AbstractC2054G implements Serializable {

    /* JADX INFO: renamed from: d */
    final InterfaceC2030c f9713d;

    /* JADX INFO: renamed from: e */
    final AbstractC2054G f9714e;

    C2072f(InterfaceC2030c interfaceC2030c, AbstractC2054G abstractC2054G) {
        this.f9713d = (InterfaceC2030c) AbstractC2035h.m10240i(interfaceC2030c);
        this.f9714e = (AbstractC2054G) AbstractC2035h.m10240i(abstractC2054G);
    }

    @Override // p117j1.AbstractC2054G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f9714e.compare(this.f9713d.apply(obj), this.f9713d.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2072f) {
            C2072f c2072f = (C2072f) obj;
            if (this.f9713d.equals(c2072f.f9713d) && this.f9714e.equals(c2072f.f9714e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC2033f.m10229b(this.f9713d, this.f9714e);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f9714e);
        String strValueOf2 = String.valueOf(this.f9713d);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
