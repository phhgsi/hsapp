package p004B0;

import p156v0.AbstractC2477d;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: B0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0057g implements InterfaceC2475b {

    /* JADX INFO: renamed from: B0.g$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private static final C0057g f125a = new C0057g();
    }

    /* JADX INFO: renamed from: a */
    public static C0057g m177a() {
        return a.f125a;
    }

    /* JADX INFO: renamed from: b */
    public static String m178b() {
        return (String) AbstractC2477d.m11790c(AbstractC0056f.m173a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m178b();
    }
}
