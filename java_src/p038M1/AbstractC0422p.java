package p038M1;

import java.util.Collection;
import p071X1.AbstractC0606k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: M1.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0422p extends AbstractC0421o {
    /* JADX INFO: renamed from: j */
    public static int m1463j(Iterable iterable, int i3) {
        AbstractC0606k.m2145e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i3;
    }
}
