package p038M1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p035L1.AbstractC0385q;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;
import p098e2.AbstractC1868d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: M1.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0429w extends AbstractC0428v {
    /* JADX INFO: renamed from: k */
    public static boolean m1464k(Iterable iterable, Object obj) {
        AbstractC0606k.m2145e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : m1467n(iterable, obj) >= 0;
    }

    /* JADX INFO: renamed from: l */
    public static Object m1465l(List list) {
        AbstractC0606k.m2145e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: m */
    public static Object m1466m(Iterable iterable) {
        AbstractC0606k.m2145e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final int m1467n(Iterable iterable, Object obj) {
        AbstractC0606k.m2145e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i3 = 0;
        for (Object obj2 : iterable) {
            if (i3 < 0) {
                AbstractC0421o.m1462i();
            }
            if (AbstractC0606k.m2141a(obj, obj2)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public static final Appendable m1468o(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, InterfaceC0577l interfaceC0577l) throws IOException {
        AbstractC0606k.m2145e(iterable, "<this>");
        AbstractC0606k.m2145e(appendable, "buffer");
        AbstractC0606k.m2145e(charSequence, "separator");
        AbstractC0606k.m2145e(charSequence2, "prefix");
        AbstractC0606k.m2145e(charSequence3, "postfix");
        AbstractC0606k.m2145e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i4 = 0;
        for (Object obj : iterable) {
            i4++;
            if (i4 > 1) {
                appendable.append(charSequence);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            AbstractC1868d.m9664a(appendable, obj, interfaceC0577l);
        }
        if (i3 >= 0 && i4 > i3) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* JADX INFO: renamed from: p */
    public static final String m1469p(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, InterfaceC0577l interfaceC0577l) {
        AbstractC0606k.m2145e(iterable, "<this>");
        AbstractC0606k.m2145e(charSequence, "separator");
        AbstractC0606k.m2145e(charSequence2, "prefix");
        AbstractC0606k.m2145e(charSequence3, "postfix");
        AbstractC0606k.m2145e(charSequence4, "truncated");
        return ((StringBuilder) m1468o(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i3, charSequence4, interfaceC0577l)).toString();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m1470q(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, InterfaceC0577l interfaceC0577l, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i4 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i4 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i4 & 32) != 0) {
            interfaceC0577l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC0577l interfaceC0577l2 = interfaceC0577l;
        return m1469p(iterable, charSequence, charSequence2, charSequence3, i3, charSequence5, interfaceC0577l2);
    }

    /* JADX INFO: renamed from: r */
    public static Object m1471r(Iterable iterable) {
        AbstractC0606k.m2145e(iterable, "<this>");
        if (iterable instanceof List) {
            return m1472s((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m1472s(List list) {
        AbstractC0606k.m2145e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* JADX INFO: renamed from: t */
    public static List m1473t(Collection collection) {
        AbstractC0606k.m2145e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX INFO: renamed from: u */
    public static List m1474u(Iterable iterable, Iterable iterable2) {
        AbstractC0606k.m2145e(iterable, "<this>");
        AbstractC0606k.m2145e(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC0422p.m1463j(iterable, 10), AbstractC0422p.m1463j(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(AbstractC0385q.m1378a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
