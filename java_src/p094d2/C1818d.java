package p094d2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: d2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1818d implements InterfaceC1820f {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1820f f9214a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0577l f9215b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0577l f9216c;

    /* JADX INFO: renamed from: d2.d$a */
    public static final class a implements Iterator, InterfaceC0622a {

        /* JADX INFO: renamed from: d */
        private final Iterator f9217d;

        /* JADX INFO: renamed from: e */
        private Iterator f9218e;

        /* JADX INFO: renamed from: f */
        private int f9219f;

        a() {
            this.f9217d = C1818d.this.f9214a.iterator();
        }

        /* JADX INFO: renamed from: a */
        private final boolean m9581a() {
            Iterator it = this.f9218e;
            if (it != null && it.hasNext()) {
                this.f9219f = 1;
                return true;
            }
            while (this.f9217d.hasNext()) {
                Iterator it2 = (Iterator) C1818d.this.f9216c.mo1406f(C1818d.this.f9215b.mo1406f(this.f9217d.next()));
                if (it2.hasNext()) {
                    this.f9218e = it2;
                    this.f9219f = 1;
                    return true;
                }
            }
            this.f9219f = 2;
            this.f9218e = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i3 = this.f9219f;
            if (i3 == 1) {
                return true;
            }
            if (i3 == 2) {
                return false;
            }
            return m9581a();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i3 = this.f9219f;
            if (i3 == 2) {
                throw new NoSuchElementException();
            }
            if (i3 == 0 && !m9581a()) {
                throw new NoSuchElementException();
            }
            this.f9219f = 0;
            Iterator it = this.f9218e;
            AbstractC0606k.m2142b(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1818d(InterfaceC1820f interfaceC1820f, InterfaceC0577l interfaceC0577l, InterfaceC0577l interfaceC0577l2) {
        AbstractC0606k.m2145e(interfaceC1820f, "sequence");
        AbstractC0606k.m2145e(interfaceC0577l, "transformer");
        AbstractC0606k.m2145e(interfaceC0577l2, "iterator");
        this.f9214a = interfaceC1820f;
        this.f9215b = interfaceC0577l;
        this.f9216c = interfaceC0577l2;
    }

    @Override // p094d2.InterfaceC1820f
    public Iterator iterator() {
        return new a();
    }
}
