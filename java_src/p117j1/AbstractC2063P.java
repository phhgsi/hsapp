package p117j1;

import java.util.Comparator;
import java.util.SortedSet;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.P */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2063P {
    /* JADX INFO: renamed from: a */
    public static Comparator m10322a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        return comparator == null ? AbstractC2054G.m10277c() : comparator;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10323b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        AbstractC2035h.m10240i(comparator);
        AbstractC2035h.m10240i(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m10322a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof InterfaceC2062O)) {
                return false;
            }
            comparator2 = ((InterfaceC2062O) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
