package p156v0;

/* JADX INFO: renamed from: v0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2476c implements InterfaceC2475b {

    /* JADX INFO: renamed from: b */
    private static final C2476c f11486b = new C2476c(null);

    /* JADX INFO: renamed from: a */
    private final Object f11487a;

    private C2476c(Object obj) {
        this.f11487a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2475b m11787a(Object obj) {
        return new C2476c(AbstractC2477d.m11790c(obj, "instance cannot be null"));
    }

    @Override // p032K1.InterfaceC0359a
    public Object get() {
        return this.f11487a;
    }
}
