package p004B0;

import p156v0.AbstractC2477d;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: B0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0060j implements InterfaceC2475b {

    /* JADX INFO: renamed from: B0.j$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private static final C0060j f128a = new C0060j();
    }

    /* JADX INFO: renamed from: a */
    public static C0060j m188a() {
        return a.f128a;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0055e m189c() {
        return (AbstractC0055e) AbstractC2477d.m11790c(AbstractC0056f.m176d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0055e get() {
        return m189c();
    }
}
