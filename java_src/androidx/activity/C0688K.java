package androidx.activity;

import android.content.res.Resources;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0607l;

/* JADX INFO: renamed from: androidx.activity.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0688K {

    /* JADX INFO: renamed from: e */
    public static final a f2410e = new a(null);

    /* JADX INFO: renamed from: a */
    private final int f2411a;

    /* JADX INFO: renamed from: b */
    private final int f2412b;

    /* JADX INFO: renamed from: c */
    private final int f2413c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0577l f2414d;

    /* JADX INFO: renamed from: androidx.activity.K$a */
    public static final class a {

        /* JADX INFO: renamed from: androidx.activity.K$a$a, reason: collision with other inner class name */
        static final class C2609a extends AbstractC0607l implements InterfaceC0577l {

            /* JADX INFO: renamed from: e */
            public static final C2609a f2415e = new C2609a();

            C2609a() {
                super(1);
            }

            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean mo1406f(Resources resources) {
                AbstractC0606k.m2145e(resources, "<anonymous parameter 0>");
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: androidx.activity.K$a$b */
        static final class b extends AbstractC0607l implements InterfaceC0577l {

            /* JADX INFO: renamed from: e */
            public static final b f2416e = new b();

            b() {
                super(1);
            }

            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean mo1406f(Resources resources) {
                AbstractC0606k.m2145e(resources, "<anonymous parameter 0>");
                return Boolean.FALSE;
            }
        }

        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0688K m2586a(int i3) {
            return new C0688K(i3, i3, 2, C2609a.f2415e, null);
        }

        /* JADX INFO: renamed from: b */
        public final C0688K m2587b(int i3, int i4) {
            return new C0688K(i3, i4, 1, b.f2416e, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C0688K(int i3, int i4, int i5, InterfaceC0577l interfaceC0577l, AbstractC0602g abstractC0602g) {
        this(i3, i4, i5, interfaceC0577l);
    }

    /* JADX INFO: renamed from: a */
    public final int m2581a() {
        return this.f2412b;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0577l m2582b() {
        return this.f2414d;
    }

    /* JADX INFO: renamed from: c */
    public final int m2583c() {
        return this.f2413c;
    }

    /* JADX INFO: renamed from: d */
    public final int m2584d(boolean z2) {
        return z2 ? this.f2412b : this.f2411a;
    }

    /* JADX INFO: renamed from: e */
    public final int m2585e(boolean z2) {
        if (this.f2413c == 0) {
            return 0;
        }
        return z2 ? this.f2412b : this.f2411a;
    }

    private C0688K(int i3, int i4, int i5, InterfaceC0577l interfaceC0577l) {
        this.f2411a = i3;
        this.f2412b = i4;
        this.f2413c = i5;
        this.f2414d = interfaceC0577l;
    }
}
