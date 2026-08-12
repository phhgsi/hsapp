package p137p;

/* JADX INFO: renamed from: p.g */
/* JADX INFO: loaded from: classes.dex */
class C2309g implements InterfaceC2308f {

    /* JADX INFO: renamed from: a */
    private final Object[] f10658a;

    /* JADX INFO: renamed from: b */
    private int f10659b;

    C2309g(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f10658a = new Object[i3];
    }

    @Override // p137p.InterfaceC2308f
    /* JADX INFO: renamed from: a */
    public boolean mo11049a(Object obj) {
        int i3 = this.f10659b;
        Object[] objArr = this.f10658a;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f10659b = i3 + 1;
        return true;
    }

    @Override // p137p.InterfaceC2308f
    /* JADX INFO: renamed from: b */
    public Object mo11050b() {
        int i3 = this.f10659b;
        if (i3 <= 0) {
            return null;
        }
        int i4 = i3 - 1;
        Object[] objArr = this.f10658a;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f10659b = i3 - 1;
        return obj;
    }

    @Override // p137p.InterfaceC2308f
    /* JADX INFO: renamed from: c */
    public void mo11051c(Object[] objArr, int i3) {
        if (i3 > objArr.length) {
            i3 = objArr.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            Object obj = objArr[i4];
            int i5 = this.f10659b;
            Object[] objArr2 = this.f10658a;
            if (i5 < objArr2.length) {
                objArr2[i5] = obj;
                this.f10659b = i5 + 1;
            }
        }
    }
}
