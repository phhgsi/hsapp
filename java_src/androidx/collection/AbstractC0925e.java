package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: androidx.collection.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0925e implements Iterator, InterfaceC0622a {

    /* JADX INFO: renamed from: d */
    private int f3800d;

    /* JADX INFO: renamed from: e */
    private int f3801e;

    /* JADX INFO: renamed from: f */
    private boolean f3802f;

    public AbstractC0925e(int i3) {
        this.f3800d = i3;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo3907a(int i3);

    /* JADX INFO: renamed from: b */
    protected abstract void mo3908b(int i3);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3801e < this.f3800d;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objMo3907a = mo3907a(this.f3801e);
        this.f3801e++;
        this.f3802f = true;
        return objMo3907a;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f3802f) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i3 = this.f3801e - 1;
        this.f3801e = i3;
        mo3908b(i3);
        this.f3800d--;
        this.f3802f = false;
    }
}
