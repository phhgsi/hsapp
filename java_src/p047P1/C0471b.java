package p047P1;

import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;

/* JADX INFO: renamed from: P1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0471b implements InterfaceC0442e {

    /* JADX INFO: renamed from: d */
    public static final C0471b f1679d = new C0471b();

    private C0471b() {
    }

    @Override // p041N1.InterfaceC0442e
    /* JADX INFO: renamed from: c */
    public InterfaceC0446i mo1615c() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p041N1.InterfaceC0442e
    /* JADX INFO: renamed from: j */
    public void mo1616j(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
