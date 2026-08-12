package p038M1;

import java.util.Iterator;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: M1.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0396B implements Iterator, InterfaceC0622a {
    /* JADX INFO: renamed from: a */
    public abstract int mo1394a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(mo1394a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
