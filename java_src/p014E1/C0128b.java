package p014E1;

/* JADX INFO: renamed from: E1.b */
/* JADX INFO: loaded from: classes.dex */
public class C0128b implements InterfaceC0127a {

    /* JADX INFO: renamed from: a */
    private static C0128b f250a;

    private C0128b() {
    }

    /* JADX INFO: renamed from: a */
    public static C0128b m365a() {
        if (f250a == null) {
            f250a = new C0128b();
        }
        return f250a;
    }

    @Override // p014E1.InterfaceC0127a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
