package p124l0;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2126j {

    /* JADX INFO: renamed from: c */
    private static final Set f9855c = new HashSet();

    /* JADX INFO: renamed from: a */
    private final String f9856a;

    /* JADX INFO: renamed from: b */
    private final String f9857b;

    /* JADX INFO: renamed from: l0.j$a */
    public static class a extends AbstractC2126j {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: renamed from: l0.j$b */
    public static class b extends AbstractC2126j {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    AbstractC2126j(String str, String str2) {
        this.f9856a = str;
        this.f9857b = str2;
        f9855c.add(this);
    }
}
