package p098e2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p035L1.AbstractC0385q;
import p035L1.C0380l;
import p038M1.AbstractC0413g;
import p038M1.AbstractC0419m;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;
import p086b2.AbstractC1304d;
import p086b2.C1301a;
import p086b2.C1303c;
import p094d2.AbstractC1821g;
import p094d2.InterfaceC1820f;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: e2.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1879o extends AbstractC1877m {
    /* JADX INFO: renamed from: A */
    public static final List m9673A(CharSequence charSequence, String[] strArr, boolean z2, int i3) {
        AbstractC0606k.m2145e(charSequence, "<this>");
        AbstractC0606k.m2145e(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m9674B(charSequence, str, z2, i3);
            }
        }
        Iterable iterableN = AbstractC1821g.m9598n(m9690w(charSequence, strArr, 0, z2, i3, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC0419m.m1463j(iterableN, 10));
        Iterator it = iterableN.iterator();
        while (it.hasNext()) {
            arrayList.add(m9676D(charSequence, (C1303c) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    private static final List m9674B(CharSequence charSequence, String str, boolean z2, int i3) {
        m9693z(i3);
        int length = 0;
        int iM9682o = m9682o(charSequence, str, 0, z2);
        if (iM9682o == -1 || i3 == 1) {
            return AbstractC0419m.m1455b(charSequence.toString());
        }
        boolean z3 = i3 > 0;
        ArrayList arrayList = new ArrayList(z3 ? AbstractC1304d.m6632b(i3, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iM9682o).toString());
            length = str.length() + iM9682o;
            if (z3 && arrayList.size() == i3 - 1) {
                break;
            }
            iM9682o = m9682o(charSequence, str, length, z2);
        } while (iM9682o != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ List m9675C(CharSequence charSequence, String[] strArr, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z2 = false;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        return m9673A(charSequence, strArr, z2, i3);
    }

    /* JADX INFO: renamed from: D */
    public static final String m9676D(CharSequence charSequence, C1303c c1303c) {
        AbstractC0606k.m2145e(charSequence, "<this>");
        AbstractC0606k.m2145e(c1303c, "range");
        return charSequence.subSequence(c1303c.m6629h().intValue(), c1303c.m6628g().intValue() + 1).toString();
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m9678k(CharSequence charSequence, CharSequence charSequence2, boolean z2) {
        AbstractC0606k.m2145e(charSequence, "<this>");
        AbstractC0606k.m2145e(charSequence2, "other");
        return charSequence2 instanceof String ? m9685r(charSequence, (String) charSequence2, 0, z2, 2, null) >= 0 : m9684q(charSequence, charSequence2, 0, charSequence.length(), z2, false, 16, null) >= 0;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m9679l(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return m9678k(charSequence, charSequence2, z2);
    }

    /* JADX INFO: renamed from: m */
    private static final C0380l m9680m(CharSequence charSequence, Collection collection, int i3, boolean z2, boolean z3) {
        CharSequence charSequence2;
        Object next;
        boolean z4;
        Object next2;
        if (!z2 && collection.size() == 1) {
            String str = (String) AbstractC0419m.m1471r(collection);
            int iM9685r = !z3 ? m9685r(charSequence, str, i3, false, 4, null) : m9688u(charSequence, str, i3, false, 4, null);
            if (iM9685r < 0) {
                return null;
            }
            return AbstractC0385q.m1378a(Integer.valueOf(iM9685r), str);
        }
        CharSequence charSequence3 = charSequence;
        C1301a c1303c = !z3 ? new C1303c(AbstractC1304d.m6631a(i3, 0), charSequence3.length()) : AbstractC1304d.m6635e(AbstractC1304d.m6632b(i3, m9681n(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iM6622b = c1303c.m6622b();
            int iM6623c = c1303c.m6623c();
            int iM6624d = c1303c.m6624d();
            if ((iM6624d > 0 && iM6622b <= iM6623c) || (iM6624d < 0 && iM6623c <= iM6622b)) {
                int i4 = iM6622b;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z4 = z2;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z4 = z2;
                        if (AbstractC1877m.m9668e(str2, 0, (String) charSequence3, i4, str2.length(), z4)) {
                            break;
                        }
                        z2 = z4;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i4 == iM6623c) {
                            break;
                        }
                        i4 += iM6624d;
                        z2 = z4;
                    } else {
                        return AbstractC0385q.m1378a(Integer.valueOf(i4), str3);
                    }
                }
            }
        } else {
            boolean z5 = z2;
            int iM6622b2 = c1303c.m6622b();
            int iM6623c2 = c1303c.m6623c();
            int iM6624d2 = c1303c.m6624d();
            if ((iM6624d2 > 0 && iM6622b2 <= iM6623c2) || (iM6624d2 < 0 && iM6623c2 <= iM6622b2)) {
                int i5 = iM6622b2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z6 = z5;
                        charSequence2 = charSequence3;
                        z5 = z6;
                        if (m9692y(str4, 0, charSequence2, i5, str4.length(), z6)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i5 == iM6623c2) {
                            break;
                        }
                        i5 += iM6624d2;
                        charSequence3 = charSequence2;
                    } else {
                        return AbstractC0385q.m1378a(Integer.valueOf(i5), str5);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final int m9681n(CharSequence charSequence) {
        AbstractC0606k.m2145e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: o */
    public static final int m9682o(CharSequence charSequence, String str, int i3, boolean z2) {
        AbstractC0606k.m2145e(charSequence, "<this>");
        AbstractC0606k.m2145e(str, "string");
        return (z2 || !(charSequence instanceof String)) ? m9684q(charSequence, str, i3, charSequence.length(), z2, false, 16, null) : ((String) charSequence).indexOf(str, i3);
    }

    /* JADX INFO: renamed from: p */
    private static final int m9683p(CharSequence charSequence, CharSequence charSequence2, int i3, int i4, boolean z2, boolean z3) {
        C1301a c1303c = !z3 ? new C1303c(AbstractC1304d.m6631a(i3, 0), AbstractC1304d.m6632b(i4, charSequence.length())) : AbstractC1304d.m6635e(AbstractC1304d.m6632b(i3, m9681n(charSequence)), AbstractC1304d.m6631a(i4, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iM6622b = c1303c.m6622b();
            int iM6623c = c1303c.m6623c();
            int iM6624d = c1303c.m6624d();
            if ((iM6624d <= 0 || iM6622b > iM6623c) && (iM6624d >= 0 || iM6623c > iM6622b)) {
                return -1;
            }
            int i5 = iM6622b;
            while (true) {
                String str = (String) charSequence2;
                boolean z4 = z2;
                if (AbstractC1877m.m9668e(str, 0, (String) charSequence, i5, str.length(), z4)) {
                    return i5;
                }
                if (i5 == iM6623c) {
                    return -1;
                }
                i5 += iM6624d;
                z2 = z4;
            }
        } else {
            boolean z5 = z2;
            int iM6622b2 = c1303c.m6622b();
            int iM6623c2 = c1303c.m6623c();
            int iM6624d2 = c1303c.m6624d();
            if ((iM6624d2 <= 0 || iM6622b2 > iM6623c2) && (iM6624d2 >= 0 || iM6623c2 > iM6622b2)) {
                return -1;
            }
            int i6 = iM6622b2;
            while (true) {
                boolean z6 = z5;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z5 = z6;
                if (m9692y(charSequence4, 0, charSequence3, i6, charSequence2.length(), z6)) {
                    return i6;
                }
                if (i6 == iM6623c2) {
                    return -1;
                }
                i6 += iM6624d2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ int m9684q(CharSequence charSequence, CharSequence charSequence2, int i3, int i4, boolean z2, boolean z3, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            z3 = false;
        }
        return m9683p(charSequence, charSequence2, i3, i4, z2, z3);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m9685r(CharSequence charSequence, String str, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return m9682o(charSequence, str, i3, z2);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m9686s(CharSequence charSequence) {
        AbstractC0606k.m2145e(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (!AbstractC1865a.m9656c(charSequence.charAt(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static final int m9687t(CharSequence charSequence, String str, int i3, boolean z2) {
        AbstractC0606k.m2145e(charSequence, "<this>");
        AbstractC0606k.m2145e(str, "string");
        return (z2 || !(charSequence instanceof String)) ? m9683p(charSequence, str, i3, 0, z2, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m9688u(CharSequence charSequence, String str, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = m9681n(charSequence);
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return m9687t(charSequence, str, i3, z2);
    }

    /* JADX INFO: renamed from: v */
    private static final InterfaceC1820f m9689v(CharSequence charSequence, String[] strArr, int i3, final boolean z2, int i4) {
        m9693z(i4);
        final List listC = AbstractC0413g.m1435c(strArr);
        return new C1867c(charSequence, i3, i4, new InterfaceC0581p() { // from class: e2.n
            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: d */
            public final Object mo1609d(Object obj, Object obj2) {
                return AbstractC1879o.m9691x(listC, z2, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: w */
    static /* synthetic */ InterfaceC1820f m9690w(CharSequence charSequence, String[] strArr, int i3, boolean z2, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            z2 = false;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return m9689v(charSequence, strArr, i3, z2, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C0380l m9691x(List list, boolean z2, CharSequence charSequence, int i3) {
        AbstractC0606k.m2145e(charSequence, "$this$DelimitedRangesSequence");
        C0380l c0380lM9680m = m9680m(charSequence, list, i3, z2, false);
        if (c0380lM9680m != null) {
            return AbstractC0385q.m1378a(c0380lM9680m.m1367c(), Integer.valueOf(((String) c0380lM9680m.m1368d()).length()));
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m9692y(CharSequence charSequence, int i3, CharSequence charSequence2, int i4, int i5, boolean z2) {
        AbstractC0606k.m2145e(charSequence, "<this>");
        AbstractC0606k.m2145e(charSequence2, "other");
        if (i4 < 0 || i3 < 0 || i3 > charSequence.length() - i5 || i4 > charSequence2.length() - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!AbstractC1866b.m9657d(charSequence.charAt(i3 + i6), charSequence2.charAt(i4 + i6), z2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static final void m9693z(int i3) {
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3).toString());
    }
}
