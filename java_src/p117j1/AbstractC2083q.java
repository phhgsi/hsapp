package p117j1;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: j1.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2083q extends AbstractC2071e implements Serializable {

    /* JADX INFO: renamed from: d */
    final transient AbstractC2082p f9762d;

    /* JADX INFO: renamed from: e */
    final transient int f9763e;

    /* JADX INFO: renamed from: j1.q$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        final Map f9764a = AbstractC2055H.m10283c();

        /* JADX INFO: renamed from: b */
        Comparator f9765b;

        /* JADX INFO: renamed from: c */
        Comparator f9766c;
    }

    AbstractC2083q(AbstractC2082p abstractC2082p, int i3) {
        this.f9762d = abstractC2082p;
        this.f9763e = i3;
    }

    @Override // p117j1.AbstractC2070d
    /* JADX INFO: renamed from: b */
    public boolean mo10328b(Object obj) {
        return obj != null && super.mo10328b(obj);
    }

    @Override // p117j1.AbstractC2070d, p117j1.InterfaceC2048A
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC2082p mo10266a() {
        return this.f9762d;
    }

    @Override // p117j1.AbstractC2070d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p117j1.AbstractC2070d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p117j1.AbstractC2070d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
