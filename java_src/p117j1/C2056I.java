package p117j1;

import java.util.Objects;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.I */
/* JADX INFO: loaded from: classes.dex */
class C2056I extends AbstractC2081o {

    /* JADX INFO: renamed from: h */
    static final AbstractC2081o f9671h = new C2056I(new Object[0], 0);

    /* JADX INFO: renamed from: f */
    final transient Object[] f9672f;

    /* JADX INFO: renamed from: g */
    private final transient int f9673g;

    C2056I(Object[] objArr, int i3) {
        this.f9672f = objArr;
        this.f9673g = i3;
    }

    @Override // p117j1.AbstractC2081o, p117j1.AbstractC2080n
    /* JADX INFO: renamed from: b */
    int mo10284b(Object[] objArr, int i3) {
        System.arraycopy(this.f9672f, 0, objArr, i3, this.f9673g);
        return i3 + this.f9673g;
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: c */
    Object[] mo10285c() {
        return this.f9672f;
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: d */
    int mo10286d() {
        return this.f9673g;
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: e */
    int mo10287e() {
        return 0;
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: f */
    boolean mo10288f() {
        return false;
    }

    @Override // java.util.List
    public Object get(int i3) {
        AbstractC2035h.m10238g(i3, this.f9673g);
        Object obj = this.f9672f[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9673g;
    }
}
