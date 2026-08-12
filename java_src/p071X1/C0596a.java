package p071X1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: X1.a */
/* JADX INFO: loaded from: classes.dex */
final class C0596a implements Iterator, InterfaceC0622a {

    /* JADX INFO: renamed from: d */
    private final Object[] f1991d;

    /* JADX INFO: renamed from: e */
    private int f1992e;

    public C0596a(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "array");
        this.f1991d = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1992e < this.f1991d.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f1991d;
            int i3 = this.f1992e;
            this.f1992e = i3 + 1;
            return objArr[i3];
        } catch (ArrayIndexOutOfBoundsException e3) {
            this.f1992e--;
            throw new NoSuchElementException(e3.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
