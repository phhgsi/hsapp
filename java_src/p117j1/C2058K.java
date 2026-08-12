package p117j1;

/* JADX INFO: renamed from: j1.K */
/* JADX INFO: loaded from: classes.dex */
final class C2058K extends AbstractC2084r {

    /* JADX INFO: renamed from: k */
    private static final Object[] f9688k;

    /* JADX INFO: renamed from: l */
    static final C2058K f9689l;

    /* JADX INFO: renamed from: f */
    final transient Object[] f9690f;

    /* JADX INFO: renamed from: g */
    private final transient int f9691g;

    /* JADX INFO: renamed from: h */
    final transient Object[] f9692h;

    /* JADX INFO: renamed from: i */
    private final transient int f9693i;

    /* JADX INFO: renamed from: j */
    private final transient int f9694j;

    static {
        Object[] objArr = new Object[0];
        f9688k = objArr;
        f9689l = new C2058K(objArr, 0, objArr, 0, 0);
    }

    C2058K(Object[] objArr, int i3, Object[] objArr2, int i4, int i5) {
        this.f9690f = objArr;
        this.f9691g = i3;
        this.f9692h = objArr2;
        this.f9693i = i4;
        this.f9694j = i5;
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: b */
    int mo10284b(Object[] objArr, int i3) {
        System.arraycopy(this.f9690f, 0, objArr, i3, this.f9694j);
        return i3 + this.f9694j;
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: c */
    Object[] mo10285c() {
        return this.f9690f;
    }

    @Override // p117j1.AbstractC2080n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f9692h;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iM10400c = AbstractC2079m.m10400c(obj);
        while (true) {
            int i3 = iM10400c & this.f9693i;
            Object obj2 = objArr[i3];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iM10400c = i3 + 1;
        }
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: d */
    int mo10286d() {
        return this.f9694j;
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

    @Override // p117j1.AbstractC2084r, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f9691g;
    }

    @Override // p117j1.AbstractC2084r
    /* JADX INFO: renamed from: k */
    AbstractC2081o mo10298k() {
        return AbstractC2081o.m10406h(this.f9690f, this.f9694j);
    }

    @Override // p117j1.AbstractC2084r
    /* JADX INFO: renamed from: l */
    boolean mo10303l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC2065S iterator() {
        return mo10301g().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f9694j;
    }
}
