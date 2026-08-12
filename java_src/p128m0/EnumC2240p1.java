package p128m0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 m0.p1, still in use, count: 1, list:
  (r0v1 m0.p1) from 0x0024: SPUT (r0v1 m0.p1) (LINE:37) m0.p1.g m0.p1
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: m0.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2240p1 {
    Always,
    Reload,
    Never;


    /* JADX INFO: renamed from: g */
    public static EnumC2240p1 f10371g = new EnumC2240p1();

    static {
    }

    private EnumC2240p1() {
    }

    public static EnumC2240p1 valueOf(String str) {
        return (EnumC2240p1) Enum.valueOf(EnumC2240p1.class, str);
    }

    public static EnumC2240p1[] values() {
        return (EnumC2240p1[]) f10372h.clone();
    }
}
