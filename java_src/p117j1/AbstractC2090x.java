package p117j1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p113i1.AbstractC2033f;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2090x {
    /* JADX INFO: renamed from: a */
    static boolean m10466a(List list, Object obj) {
        if (obj == AbstractC2035h.m10240i(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return AbstractC2089w.m10464b(list.iterator(), list2.iterator());
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (!AbstractC2033f.m10228a(list.get(i3), list2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    static int m10467b(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return m10468c(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (AbstractC2033f.m10228a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    private static int m10468c(List list, Object obj) {
        int size = list.size();
        int i3 = 0;
        if (obj == null) {
            while (i3 < size) {
                if (list.get(i3) == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        while (i3 < size) {
            if (obj.equals(list.get(i3))) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    static int m10469d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return m10470e(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (AbstractC2033f.m10228a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    private static int m10470e(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m10471f() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m10472g(Iterator it) {
        ArrayList arrayListM10471f = m10471f();
        AbstractC2089w.m10463a(arrayListM10471f, it);
        return arrayListM10471f;
    }
}
