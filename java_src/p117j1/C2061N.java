package p117j1;

import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.N */
/* JADX INFO: loaded from: classes.dex */
final class C2061N extends AbstractC2084r {

    /* JADX INFO: renamed from: f */
    final transient Object f9702f;

    C2061N(Object obj) {
        this.f9702f = AbstractC2035h.m10240i(obj);
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: b */
    int mo10284b(Object[] objArr, int i3) {
        objArr[i3] = this.f9702f;
        return i3 + 1;
    }

    @Override // p117j1.AbstractC2080n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f9702f.equals(obj);
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: f */
    boolean mo10288f() {
        return false;
    }

    @Override // p117j1.AbstractC2084r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9702f.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC2065S iterator() {
        return AbstractC2089w.m10465c(this.f9702f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f9702f.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
