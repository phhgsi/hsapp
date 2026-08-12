package p094d2;

import java.util.Iterator;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: d2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1831q implements InterfaceC1820f {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1820f f9229a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0577l f9230b;

    /* JADX INFO: renamed from: d2.q$a */
    public static final class a implements Iterator, InterfaceC0622a {

        /* JADX INFO: renamed from: d */
        private final Iterator f9231d;

        a() {
            this.f9231d = C1831q.this.f9229a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9231d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C1831q.this.f9230b.mo1406f(this.f9231d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1831q(InterfaceC1820f interfaceC1820f, InterfaceC0577l interfaceC0577l) {
        AbstractC0606k.m2145e(interfaceC1820f, "sequence");
        AbstractC0606k.m2145e(interfaceC0577l, "transformer");
        this.f9229a = interfaceC1820f;
        this.f9230b = interfaceC0577l;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1820f m9607c(InterfaceC0577l interfaceC0577l) {
        AbstractC0606k.m2145e(interfaceC0577l, "iterator");
        return new C1818d(this.f9229a, this.f9230b, interfaceC0577l);
    }

    @Override // p094d2.InterfaceC1820f
    public Iterator iterator() {
        return new a();
    }
}
