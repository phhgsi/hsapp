package p150t0;

import java.util.concurrent.Executor;
import p156v0.AbstractC2477d;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: t0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2435k implements InterfaceC2475b {

    /* JADX INFO: renamed from: t0.k$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private static final C2435k f11410a = new C2435k();
    }

    /* JADX INFO: renamed from: a */
    public static C2435k m11719a() {
        return a.f11410a;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m11720b() {
        return (Executor) AbstractC2477d.m11790c(AbstractC2434j.m11718a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m11720b();
    }
}
