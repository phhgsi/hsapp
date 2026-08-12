package p094d2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: d2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1817c implements InterfaceC1820f {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1820f f9207a;

    /* JADX INFO: renamed from: b */
    private final boolean f9208b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0577l f9209c;

    /* JADX INFO: renamed from: d2.c$a */
    public static final class a implements Iterator, InterfaceC0622a {

        /* JADX INFO: renamed from: d */
        private final Iterator f9210d;

        /* JADX INFO: renamed from: e */
        private int f9211e = -1;

        /* JADX INFO: renamed from: f */
        private Object f9212f;

        a() {
            this.f9210d = C1817c.this.f9207a.iterator();
        }

        /* JADX INFO: renamed from: a */
        private final void m9577a() {
            while (this.f9210d.hasNext()) {
                Object next = this.f9210d.next();
                if (((Boolean) C1817c.this.f9209c.mo1406f(next)).booleanValue() == C1817c.this.f9208b) {
                    this.f9212f = next;
                    this.f9211e = 1;
                    return;
                }
            }
            this.f9211e = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9211e == -1) {
                m9577a();
            }
            return this.f9211e == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f9211e == -1) {
                m9577a();
            }
            if (this.f9211e == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f9212f;
            this.f9212f = null;
            this.f9211e = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1817c(InterfaceC1820f interfaceC1820f, boolean z2, InterfaceC0577l interfaceC0577l) {
        AbstractC0606k.m2145e(interfaceC1820f, "sequence");
        AbstractC0606k.m2145e(interfaceC0577l, "predicate");
        this.f9207a = interfaceC1820f;
        this.f9208b = z2;
        this.f9209c = interfaceC0577l;
    }

    @Override // p094d2.InterfaceC1820f
    public Iterator iterator() {
        return new a();
    }
}
