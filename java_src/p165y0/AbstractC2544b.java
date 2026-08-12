package p165y0;

/* JADX INFO: renamed from: y0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2544b {
    /* JADX INFO: renamed from: a */
    public static Object m12193a(int i3, Object obj, InterfaceC2543a interfaceC2543a, InterfaceC2545c interfaceC2545c) {
        Object objApply;
        if (i3 < 1) {
            return interfaceC2543a.apply(obj);
        }
        do {
            objApply = interfaceC2543a.apply(obj);
            obj = interfaceC2545c.mo7192a(obj, objApply);
            if (obj == null) {
                break;
            }
            i3--;
        } while (i3 >= 1);
        return objApply;
    }
}
