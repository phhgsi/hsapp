package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o */
/* JADX INFO: loaded from: classes.dex */
class C1236o {

    /* JADX INFO: renamed from: a */
    final b f6027a;

    /* JADX INFO: renamed from: b */
    a f6028b = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.o$a */
    static class a {

        /* JADX INFO: renamed from: a */
        int f6029a = 0;

        /* JADX INFO: renamed from: b */
        int f6030b;

        /* JADX INFO: renamed from: c */
        int f6031c;

        /* JADX INFO: renamed from: d */
        int f6032d;

        /* JADX INFO: renamed from: e */
        int f6033e;

        a() {
        }

        /* JADX INFO: renamed from: a */
        void m6261a(int i3) {
            this.f6029a = i3 | this.f6029a;
        }

        /* JADX INFO: renamed from: b */
        boolean m6262b() {
            int i3 = this.f6029a;
            if ((i3 & 7) != 0 && (i3 & m6263c(this.f6032d, this.f6030b)) == 0) {
                return false;
            }
            int i4 = this.f6029a;
            if ((i4 & 112) != 0 && (i4 & (m6263c(this.f6032d, this.f6031c) << 4)) == 0) {
                return false;
            }
            int i5 = this.f6029a;
            if ((i5 & 1792) != 0 && (i5 & (m6263c(this.f6033e, this.f6030b) << 8)) == 0) {
                return false;
            }
            int i6 = this.f6029a;
            return (i6 & 28672) == 0 || (i6 & (m6263c(this.f6033e, this.f6031c) << 12)) != 0;
        }

        /* JADX INFO: renamed from: c */
        int m6263c(int i3, int i4) {
            if (i3 > i4) {
                return 1;
            }
            return i3 == i4 ? 2 : 4;
        }

        /* JADX INFO: renamed from: d */
        void m6264d() {
            this.f6029a = 0;
        }

        /* JADX INFO: renamed from: e */
        void m6265e(int i3, int i4, int i5, int i6) {
            this.f6030b = i3;
            this.f6031c = i4;
            this.f6032d = i5;
            this.f6033e = i6;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.o$b */
    interface b {
        /* JADX INFO: renamed from: a */
        View mo5875a(int i3);

        /* JADX INFO: renamed from: b */
        int mo5876b();

        /* JADX INFO: renamed from: c */
        int mo5877c(View view);

        /* JADX INFO: renamed from: d */
        int mo5878d();

        /* JADX INFO: renamed from: e */
        int mo5879e(View view);
    }

    C1236o(b bVar) {
        this.f6027a = bVar;
    }

    /* JADX INFO: renamed from: a */
    View m6259a(int i3, int i4, int i5, int i6) {
        int iMo5878d = this.f6027a.mo5878d();
        int iMo5876b = this.f6027a.mo5876b();
        int i7 = i4 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i4) {
            View viewMo5875a = this.f6027a.mo5875a(i3);
            this.f6028b.m6265e(iMo5878d, iMo5876b, this.f6027a.mo5877c(viewMo5875a), this.f6027a.mo5879e(viewMo5875a));
            if (i5 != 0) {
                this.f6028b.m6264d();
                this.f6028b.m6261a(i5);
                if (this.f6028b.m6262b()) {
                    return viewMo5875a;
                }
            }
            if (i6 != 0) {
                this.f6028b.m6264d();
                this.f6028b.m6261a(i6);
                if (this.f6028b.m6262b()) {
                    view = viewMo5875a;
                }
            }
            i3 += i7;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    boolean m6260b(View view, int i3) {
        this.f6028b.m6265e(this.f6027a.mo5878d(), this.f6027a.mo5876b(), this.f6027a.mo5877c(view), this.f6027a.mo5879e(view));
        if (i3 == 0) {
            return false;
        }
        this.f6028b.m6264d();
        this.f6028b.m6261a(i3);
        return this.f6028b.m6262b();
    }
}
