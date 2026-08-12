package p010D0;

import p156v0.AbstractC2477d;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: D0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0095d implements InterfaceC2475b {

    /* JADX INFO: renamed from: D0.d$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private static final C0095d f186a = new C0095d();
    }

    /* JADX INFO: renamed from: a */
    public static C0095d m266a() {
        return a.f186a;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0092a m267c() {
        return (InterfaceC0092a) AbstractC2477d.m11790c(AbstractC0093b.m261b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC0092a get() {
        return m267c();
    }
}
