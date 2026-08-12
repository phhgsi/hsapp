package androidx.lifecycle;

import androidx.lifecycle.AbstractC1126h;
import p071X1.AbstractC0606k;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC1130l {

    /* JADX INFO: renamed from: d */
    private final InterfaceC1122d f5265d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1130l f5266e;

    /* JADX INFO: renamed from: androidx.lifecycle.DefaultLifecycleObserverAdapter$a */
    public /* synthetic */ class C1103a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5267a;

        static {
            int[] iArr = new int[AbstractC1126h.a.values().length];
            try {
                iArr[AbstractC1126h.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1126h.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1126h.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1126h.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1126h.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1126h.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1126h.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f5267a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(InterfaceC1122d interfaceC1122d, InterfaceC1130l interfaceC1130l) {
        AbstractC0606k.m2145e(interfaceC1122d, "defaultLifecycleObserver");
        this.f5265d = interfaceC1122d;
        this.f5266e = interfaceC1130l;
    }

    @Override // androidx.lifecycle.InterfaceC1130l
    /* JADX INFO: renamed from: d */
    public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(interfaceC1132n, "source");
        AbstractC0606k.m2145e(aVar, "event");
        switch (C1103a.f5267a[aVar.ordinal()]) {
            case 1:
                this.f5265d.mo4497c(interfaceC1132n);
                break;
            case 2:
                this.f5265d.mo4499g(interfaceC1132n);
                break;
            case 3:
                this.f5265d.mo4495a(interfaceC1132n);
                break;
            case 4:
                this.f5265d.mo4498e(interfaceC1132n);
                break;
            case 5:
                this.f5265d.mo4500h(interfaceC1132n);
                break;
            case 6:
                this.f5265d.mo4496b(interfaceC1132n);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1130l interfaceC1130l = this.f5266e;
        if (interfaceC1130l != null) {
            interfaceC1130l.mo2537d(interfaceC1132n, aVar);
        }
    }
}
