package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.X */
/* JADX INFO: loaded from: classes.dex */
class C0876X {

    /* JADX INFO: renamed from: a */
    private int f3583a = 0;

    /* JADX INFO: renamed from: b */
    private int f3584b = 0;

    /* JADX INFO: renamed from: c */
    private int f3585c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    private int f3586d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    private int f3587e = 0;

    /* JADX INFO: renamed from: f */
    private int f3588f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f3589g = false;

    /* JADX INFO: renamed from: h */
    private boolean f3590h = false;

    C0876X() {
    }

    /* JADX INFO: renamed from: a */
    public int m3710a() {
        return this.f3589g ? this.f3583a : this.f3584b;
    }

    /* JADX INFO: renamed from: b */
    public int m3711b() {
        return this.f3583a;
    }

    /* JADX INFO: renamed from: c */
    public int m3712c() {
        return this.f3584b;
    }

    /* JADX INFO: renamed from: d */
    public int m3713d() {
        return this.f3589g ? this.f3584b : this.f3583a;
    }

    /* JADX INFO: renamed from: e */
    public void m3714e(int i3, int i4) {
        this.f3590h = false;
        if (i3 != Integer.MIN_VALUE) {
            this.f3587e = i3;
            this.f3583a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f3588f = i4;
            this.f3584b = i4;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m3715f(boolean z2) {
        if (z2 == this.f3589g) {
            return;
        }
        this.f3589g = z2;
        if (!this.f3590h) {
            this.f3583a = this.f3587e;
            this.f3584b = this.f3588f;
            return;
        }
        if (z2) {
            int i3 = this.f3586d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f3587e;
            }
            this.f3583a = i3;
            int i4 = this.f3585c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f3588f;
            }
            this.f3584b = i4;
            return;
        }
        int i5 = this.f3585c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = this.f3587e;
        }
        this.f3583a = i5;
        int i6 = this.f3586d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = this.f3588f;
        }
        this.f3584b = i6;
    }

    /* JADX INFO: renamed from: g */
    public void m3716g(int i3, int i4) {
        this.f3585c = i3;
        this.f3586d = i4;
        this.f3590h = true;
        if (this.f3589g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f3583a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f3584b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f3583a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f3584b = i4;
        }
    }
}
