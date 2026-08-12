package p117j1;

/* JADX INFO: renamed from: j1.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2049B {
    /* JADX INFO: renamed from: a */
    static boolean m10267a(InterfaceC2048A interfaceC2048A, Object obj) {
        if (obj == interfaceC2048A) {
            return true;
        }
        if (obj instanceof InterfaceC2048A) {
            return interfaceC2048A.mo10266a().equals(((InterfaceC2048A) obj).mo10266a());
        }
        return false;
    }
}
