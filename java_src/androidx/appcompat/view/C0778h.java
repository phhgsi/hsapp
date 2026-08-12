package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import p027J.AbstractC0286g0;
import p027J.C0282e0;
import p027J.InterfaceC0284f0;

/* JADX INFO: renamed from: androidx.appcompat.view.h */
/* JADX INFO: loaded from: classes.dex */
public class C0778h {

    /* JADX INFO: renamed from: c */
    private Interpolator f2880c;

    /* JADX INFO: renamed from: d */
    InterfaceC0284f0 f2881d;

    /* JADX INFO: renamed from: e */
    private boolean f2882e;

    /* JADX INFO: renamed from: b */
    private long f2879b = -1;

    /* JADX INFO: renamed from: f */
    private final AbstractC0286g0 f2883f = new a();

    /* JADX INFO: renamed from: a */
    final ArrayList f2878a = new ArrayList();

    /* JADX INFO: renamed from: androidx.appcompat.view.h$a */
    class a extends AbstractC0286g0 {

        /* JADX INFO: renamed from: a */
        private boolean f2884a = false;

        /* JADX INFO: renamed from: b */
        private int f2885b = 0;

        a() {
        }

        @Override // p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: b */
        public void mo972b(View view) {
            int i3 = this.f2885b + 1;
            this.f2885b = i3;
            if (i3 == C0778h.this.f2878a.size()) {
                InterfaceC0284f0 interfaceC0284f0 = C0778h.this.f2881d;
                if (interfaceC0284f0 != null) {
                    interfaceC0284f0.mo972b(null);
                }
                m3037d();
            }
        }

        @Override // p027J.AbstractC0286g0, p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: c */
        public void mo973c(View view) {
            if (this.f2884a) {
                return;
            }
            this.f2884a = true;
            InterfaceC0284f0 interfaceC0284f0 = C0778h.this.f2881d;
            if (interfaceC0284f0 != null) {
                interfaceC0284f0.mo973c(null);
            }
        }

        /* JADX INFO: renamed from: d */
        void m3037d() {
            this.f2885b = 0;
            this.f2884a = false;
            C0778h.this.m3030b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3029a() {
        if (this.f2882e) {
            ArrayList arrayList = this.f2878a;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((C0282e0) obj).m961c();
            }
            this.f2882e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    void m3030b() {
        this.f2882e = false;
    }

    /* JADX INFO: renamed from: c */
    public C0778h m3031c(C0282e0 c0282e0) {
        if (!this.f2882e) {
            this.f2878a.add(c0282e0);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C0778h m3032d(C0282e0 c0282e0, C0282e0 c0282e02) {
        this.f2878a.add(c0282e0);
        c0282e02.m966i(c0282e0.m962d());
        this.f2878a.add(c0282e02);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C0778h m3033e(long j3) {
        if (!this.f2882e) {
            this.f2879b = j3;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C0778h m3034f(Interpolator interpolator) {
        if (!this.f2882e) {
            this.f2880c = interpolator;
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C0778h m3035g(InterfaceC0284f0 interfaceC0284f0) {
        if (!this.f2882e) {
            this.f2881d = interfaceC0284f0;
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void m3036h() {
        if (this.f2882e) {
            return;
        }
        ArrayList arrayList = this.f2878a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C0282e0 c0282e0 = (C0282e0) obj;
            long j3 = this.f2879b;
            if (j3 >= 0) {
                c0282e0.m963e(j3);
            }
            Interpolator interpolator = this.f2880c;
            if (interpolator != null) {
                c0282e0.m964f(interpolator);
            }
            if (this.f2881d != null) {
                c0282e0.m965g(this.f2883f);
            }
            c0282e0.m968k();
        }
        this.f2882e = true;
    }
}
