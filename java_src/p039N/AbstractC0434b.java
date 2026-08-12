package p039N;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: N.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0434b {

    /* JADX INFO: renamed from: N.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1524a(Object obj, Rect rect);
    }

    /* JADX INFO: renamed from: N.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        Object mo1526a(Object obj, int i3);

        /* JADX INFO: renamed from: b */
        int mo1527b(Object obj);
    }

    /* JADX INFO: renamed from: N.b$c */
    private static class c implements Comparator {

        /* JADX INFO: renamed from: d */
        private final Rect f1556d = new Rect();

        /* JADX INFO: renamed from: e */
        private final Rect f1557e = new Rect();

        /* JADX INFO: renamed from: f */
        private final boolean f1558f;

        /* JADX INFO: renamed from: g */
        private final a f1559g;

        c(boolean z2, a aVar) {
            this.f1558f = z2;
            this.f1559g = aVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f1556d;
            Rect rect2 = this.f1557e;
            this.f1559g.mo1524a(obj, rect);
            this.f1559g.mo1524a(obj2, rect2);
            int i3 = rect.top;
            int i4 = rect2.top;
            if (i3 < i4) {
                return -1;
            }
            if (i3 > i4) {
                return 1;
            }
            int i5 = rect.left;
            int i6 = rect2.left;
            if (i5 < i6) {
                return this.f1558f ? 1 : -1;
            }
            if (i5 > i6) {
                return this.f1558f ? -1 : 1;
            }
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            if (i7 < i8) {
                return -1;
            }
            if (i7 > i8) {
                return 1;
            }
            int i9 = rect.right;
            int i10 = rect2.right;
            if (i9 < i10) {
                return this.f1558f ? 1 : -1;
            }
            if (i9 > i10) {
                return this.f1558f ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1530a(int i3, Rect rect, Rect rect2, Rect rect3) {
        boolean zM1531b = m1531b(i3, rect, rect2);
        if (m1531b(i3, rect, rect3) || !zM1531b) {
            return false;
        }
        return !m1539j(i3, rect, rect3) || i3 == 17 || i3 == 66 || m1540k(i3, rect, rect2) < m1542m(i3, rect, rect3);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m1531b(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: c */
    public static Object m1532c(Object obj, b bVar, a aVar, Object obj2, Rect rect, int i3) {
        Rect rect2 = new Rect(rect);
        if (i3 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i3 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i3 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i3 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iMo1527b = bVar.mo1527b(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i4 = 0; i4 < iMo1527b; i4++) {
            Object objMo1526a = bVar.mo1526a(obj, i4);
            if (objMo1526a != obj2) {
                aVar.mo1524a(objMo1526a, rect3);
                if (m1537h(i3, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = objMo1526a;
                }
            }
        }
        return obj3;
    }

    /* JADX INFO: renamed from: d */
    public static Object m1533d(Object obj, b bVar, a aVar, Object obj2, int i3, boolean z2, boolean z3) {
        int iMo1527b = bVar.mo1527b(obj);
        ArrayList arrayList = new ArrayList(iMo1527b);
        for (int i4 = 0; i4 < iMo1527b; i4++) {
            arrayList.add(bVar.mo1526a(obj, i4));
        }
        Collections.sort(arrayList, new c(z2, aVar));
        if (i3 == 1) {
            return m1535f(obj2, arrayList, z3);
        }
        if (i3 == 2) {
            return m1534e(obj2, arrayList, z3);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* JADX INFO: renamed from: e */
    private static Object m1534e(Object obj, ArrayList arrayList, boolean z2) {
        int size = arrayList.size();
        int iLastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z2 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* JADX INFO: renamed from: f */
    private static Object m1535f(Object obj, ArrayList arrayList, boolean z2) {
        int size = arrayList.size();
        int iIndexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z2 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* JADX INFO: renamed from: g */
    private static int m1536g(int i3, int i4) {
        return (i3 * 13 * i3) + (i4 * i4);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m1537h(int i3, Rect rect, Rect rect2, Rect rect3) {
        if (!m1538i(rect, rect2, i3)) {
            return false;
        }
        if (m1538i(rect, rect3, i3) && !m1530a(i3, rect, rect2, rect3)) {
            return !m1530a(i3, rect, rect3, rect2) && m1536g(m1540k(i3, rect, rect2), m1544o(i3, rect, rect2)) < m1536g(m1540k(i3, rect, rect3), m1544o(i3, rect, rect3));
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m1538i(Rect rect, Rect rect2, int i3) {
        if (i3 == 17) {
            int i4 = rect.right;
            int i5 = rect2.right;
            return (i4 > i5 || rect.left >= i5) && rect.left > rect2.left;
        }
        if (i3 == 33) {
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            return (i6 > i7 || rect.top >= i7) && rect.top > rect2.top;
        }
        if (i3 == 66) {
            int i8 = rect.left;
            int i9 = rect2.left;
            return (i8 < i9 || rect.right <= i9) && rect.right < rect2.right;
        }
        if (i3 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i10 = rect.top;
        int i11 = rect2.top;
        return (i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: j */
    private static boolean m1539j(int i3, Rect rect, Rect rect2) {
        if (i3 == 17) {
            return rect.left >= rect2.right;
        }
        if (i3 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i3 == 66) {
            return rect.right <= rect2.left;
        }
        if (i3 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: k */
    private static int m1540k(int i3, Rect rect, Rect rect2) {
        return Math.max(0, m1541l(i3, rect, rect2));
    }

    /* JADX INFO: renamed from: l */
    private static int m1541l(int i3, Rect rect, Rect rect2) {
        int i4;
        int i5;
        if (i3 == 17) {
            i4 = rect.left;
            i5 = rect2.right;
        } else if (i3 == 33) {
            i4 = rect.top;
            i5 = rect2.bottom;
        } else if (i3 == 66) {
            i4 = rect2.left;
            i5 = rect.right;
        } else {
            if (i3 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i4 = rect2.top;
            i5 = rect.bottom;
        }
        return i4 - i5;
    }

    /* JADX INFO: renamed from: m */
    private static int m1542m(int i3, Rect rect, Rect rect2) {
        return Math.max(1, m1543n(i3, rect, rect2));
    }

    /* JADX INFO: renamed from: n */
    private static int m1543n(int i3, Rect rect, Rect rect2) {
        int i4;
        int i5;
        if (i3 == 17) {
            i4 = rect.left;
            i5 = rect2.left;
        } else if (i3 == 33) {
            i4 = rect.top;
            i5 = rect2.top;
        } else if (i3 == 66) {
            i4 = rect2.right;
            i5 = rect.right;
        } else {
            if (i3 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i4 = rect2.bottom;
            i5 = rect.bottom;
        }
        return i4 - i5;
    }

    /* JADX INFO: renamed from: o */
    private static int m1544o(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
