package p094d2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: d2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1815a implements InterfaceC1820f {

    /* JADX INFO: renamed from: a */
    private final AtomicReference f9205a;

    public C1815a(InterfaceC1820f interfaceC1820f) {
        AbstractC0606k.m2145e(interfaceC1820f, "sequence");
        this.f9205a = new AtomicReference(interfaceC1820f);
    }

    @Override // p094d2.InterfaceC1820f
    public Iterator iterator() {
        InterfaceC1820f interfaceC1820f = (InterfaceC1820f) this.f9205a.getAndSet(null);
        if (interfaceC1820f != null) {
            return interfaceC1820f.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
