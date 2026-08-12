package p117j1;

import java.util.NoSuchElementException;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.a */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2067a extends AbstractC2066T {

    /* JADX INFO: renamed from: d */
    private final int f9703d;

    /* JADX INFO: renamed from: e */
    private int f9704e;

    protected AbstractC2067a(int i3, int i4) {
        AbstractC2035h.m10242k(i4, i3);
        this.f9703d = i3;
        this.f9704e = i4;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo10324a(int i3);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f9704e < this.f9703d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9704e > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f9704e;
        this.f9704e = i3 + 1;
        return mo10324a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9704e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f9704e - 1;
        this.f9704e = i3;
        return mo10324a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9704e - 1;
    }
}
