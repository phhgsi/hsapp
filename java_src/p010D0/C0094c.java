package p010D0;

import p156v0.AbstractC2477d;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: D0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0094c implements InterfaceC2475b {

    /* JADX INFO: renamed from: D0.c$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private static final C0094c f185a = new C0094c();
    }

    /* JADX INFO: renamed from: a */
    public static C0094c m262a() {
        return a.f185a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0092a m263b() {
        return (InterfaceC0092a) AbstractC2477d.m11790c(AbstractC0093b.m260a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0092a get() {
        return m263b();
    }
}
