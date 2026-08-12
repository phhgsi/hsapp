package p001A0;

import java.util.Map;
import p010D0.InterfaceC0092a;

/* JADX INFO: renamed from: A0.b */
/* JADX INFO: loaded from: classes.dex */
final class C0003b extends AbstractC0007f {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0092a f0a;

    /* JADX INFO: renamed from: b */
    private final Map f1b;

    C0003b(InterfaceC0092a interfaceC0092a, Map map) {
        if (interfaceC0092a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f0a = interfaceC0092a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f1b = map;
    }

    @Override // p001A0.AbstractC0007f
    /* JADX INFO: renamed from: e */
    InterfaceC0092a mo31e() {
        return this.f0a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0007f) {
            AbstractC0007f abstractC0007f = (AbstractC0007f) obj;
            if (this.f0a.equals(abstractC0007f.mo31e()) && this.f1b.equals(abstractC0007f.mo32h())) {
                return true;
            }
        }
        return false;
    }

    @Override // p001A0.AbstractC0007f
    /* JADX INFO: renamed from: h */
    Map mo32h() {
        return this.f1b;
    }

    public int hashCode() {
        return ((this.f0a.hashCode() ^ 1000003) * 1000003) ^ this.f1b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f0a + ", values=" + this.f1b + "}";
    }
}
