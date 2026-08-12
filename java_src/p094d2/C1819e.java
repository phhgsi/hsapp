package p094d2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p068W1.InterfaceC0566a;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: d2.e */
/* JADX INFO: loaded from: classes.dex */
final class C1819e implements InterfaceC1820f {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0566a f9221a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0577l f9222b;

    /* JADX INFO: renamed from: d2.e$a */
    public static final class a implements Iterator, InterfaceC0622a {

        /* JADX INFO: renamed from: d */
        private Object f9223d;

        /* JADX INFO: renamed from: e */
        private int f9224e = -2;

        a() {
        }

        /* JADX INFO: renamed from: a */
        private final void m9584a() {
            Object objMo1406f;
            if (this.f9224e == -2) {
                objMo1406f = C1819e.this.f9221a.mo464a();
            } else {
                InterfaceC0577l interfaceC0577l = C1819e.this.f9222b;
                Object obj = this.f9223d;
                AbstractC0606k.m2142b(obj);
                objMo1406f = interfaceC0577l.mo1406f(obj);
            }
            this.f9223d = objMo1406f;
            this.f9224e = objMo1406f == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9224e < 0) {
                m9584a();
            }
            return this.f9224e == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f9224e < 0) {
                m9584a();
            }
            if (this.f9224e == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f9223d;
            AbstractC0606k.m2143c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f9224e = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1819e(InterfaceC0566a interfaceC0566a, InterfaceC0577l interfaceC0577l) {
        AbstractC0606k.m2145e(interfaceC0566a, "getInitialValue");
        AbstractC0606k.m2145e(interfaceC0577l, "getNextValue");
        this.f9221a = interfaceC0566a;
        this.f9222b = interfaceC0577l;
    }

    @Override // p094d2.InterfaceC1820f
    public Iterator iterator() {
        return new a();
    }
}
