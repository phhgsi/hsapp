package p117j1;

import java.util.Collection;

/* JADX INFO: renamed from: j1.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2088v {
    /* JADX INFO: renamed from: a */
    private static Collection m10461a(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : AbstractC2090x.m10472g(iterable.iterator());
    }

    /* JADX INFO: renamed from: b */
    static Object[] m10462b(Iterable iterable) {
        return m10461a(iterable).toArray();
    }
}
