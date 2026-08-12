package p038M1;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p086b2.AbstractC1304d;

/* JADX INFO: renamed from: M1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0412f extends AbstractC0410d {

    /* JADX INFO: renamed from: g */
    public static final a f1533g = new a(null);

    /* JADX INFO: renamed from: h */
    private static final Object[] f1534h = new Object[0];

    /* JADX INFO: renamed from: d */
    private int f1535d;

    /* JADX INFO: renamed from: e */
    private Object[] f1536e = f1534h;

    /* JADX INFO: renamed from: f */
    private int f1537f;

    /* JADX INFO: renamed from: M1.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m1421d(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1536e.length;
        while (i3 < length && it.hasNext()) {
            this.f1536e[i3] = it.next();
            i3++;
        }
        int i4 = this.f1535d;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f1536e[i5] = it.next();
        }
        this.f1537f = size() + collection.size();
    }

    /* JADX INFO: renamed from: e */
    private final void m1422e(int i3) {
        Object[] objArr = new Object[i3];
        Object[] objArr2 = this.f1536e;
        AbstractC0416j.m1438f(objArr2, objArr, 0, this.f1535d, objArr2.length);
        Object[] objArr3 = this.f1536e;
        int length = objArr3.length;
        int i4 = this.f1535d;
        AbstractC0416j.m1438f(objArr3, objArr, length - i4, 0, i4);
        this.f1535d = 0;
        this.f1536e = objArr;
    }

    /* JADX INFO: renamed from: f */
    private final int m1423f(int i3) {
        return i3 == 0 ? AbstractC0417k.m1447o(this.f1536e) : i3 - 1;
    }

    /* JADX INFO: renamed from: g */
    private final void m1424g(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1536e;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f1534h) {
            this.f1536e = new Object[AbstractC1304d.m6631a(i3, 10)];
        } else {
            m1422e(AbstractC0409c.f1524d.m1413d(objArr.length, i3));
        }
    }

    /* JADX INFO: renamed from: h */
    private final int m1425h(int i3) {
        if (i3 == AbstractC0417k.m1447o(this.f1536e)) {
            return 0;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: i */
    private final int m1426i(int i3) {
        return i3 < 0 ? i3 + this.f1536e.length : i3;
    }

    /* JADX INFO: renamed from: j */
    private final void m1427j(int i3, int i4) {
        if (i3 < i4) {
            AbstractC0416j.m1442j(this.f1536e, null, i3, i4);
            return;
        }
        Object[] objArr = this.f1536e;
        AbstractC0416j.m1442j(objArr, null, i3, objArr.length);
        AbstractC0416j.m1442j(this.f1536e, null, 0, i4);
    }

    /* JADX INFO: renamed from: k */
    private final int m1428k(int i3) {
        Object[] objArr = this.f1536e;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    /* JADX INFO: renamed from: l */
    private final void m1429l() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: n */
    private final void m1430n(int i3, int i4) {
        int iM1428k = m1428k(this.f1535d + (i3 - 1));
        int iM1428k2 = m1428k(this.f1535d + (i4 - 1));
        while (i3 > 0) {
            int i5 = iM1428k + 1;
            int iMin = Math.min(i3, Math.min(i5, iM1428k2 + 1));
            Object[] objArr = this.f1536e;
            int i6 = iM1428k2 - iMin;
            int i7 = iM1428k - iMin;
            AbstractC0416j.m1438f(objArr, objArr, i6 + 1, i7 + 1, i5);
            iM1428k = m1426i(i7);
            iM1428k2 = m1426i(i6);
            i3 -= iMin;
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m1431o(int i3, int i4) {
        int iM1428k = m1428k(this.f1535d + i4);
        int iM1428k2 = m1428k(this.f1535d + i3);
        int size = size();
        while (true) {
            size -= i4;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f1536e;
            i4 = Math.min(size, Math.min(objArr.length - iM1428k, objArr.length - iM1428k2));
            Object[] objArr2 = this.f1536e;
            int i5 = iM1428k + i4;
            AbstractC0416j.m1438f(objArr2, objArr2, iM1428k2, iM1428k, i5);
            iM1428k = m1428k(i5);
            iM1428k2 = m1428k(iM1428k2 + i4);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        AbstractC0606k.m2145e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m1429l();
        m1424g(size() + collection.size());
        m1421d(m1428k(this.f1535d + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m1429l();
        m1424g(size() + 1);
        int iM1423f = m1423f(this.f1535d);
        this.f1535d = iM1423f;
        this.f1536e[iM1423f] = obj;
        this.f1537f = size() + 1;
    }

    public final void addLast(Object obj) {
        m1429l();
        m1424g(size() + 1);
        this.f1536e[m1428k(this.f1535d + size())] = obj;
        this.f1537f = size() + 1;
    }

    @Override // p038M1.AbstractC0410d
    /* JADX INFO: renamed from: b */
    public int mo1418b() {
        return this.f1537f;
    }

    @Override // p038M1.AbstractC0410d
    /* JADX INFO: renamed from: c */
    public Object mo1419c(int i3) {
        AbstractC0409c.f1524d.m1410a(i3, size());
        if (i3 == AbstractC0421o.m1460g(this)) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        m1429l();
        int iM1428k = m1428k(this.f1535d + i3);
        Object obj = this.f1536e[iM1428k];
        if (i3 < (size() >> 1)) {
            int i4 = this.f1535d;
            if (iM1428k >= i4) {
                Object[] objArr = this.f1536e;
                AbstractC0416j.m1438f(objArr, objArr, i4 + 1, i4, iM1428k);
            } else {
                Object[] objArr2 = this.f1536e;
                AbstractC0416j.m1438f(objArr2, objArr2, 1, 0, iM1428k);
                Object[] objArr3 = this.f1536e;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i5 = this.f1535d;
                AbstractC0416j.m1438f(objArr3, objArr3, i5 + 1, i5, objArr3.length - 1);
            }
            Object[] objArr4 = this.f1536e;
            int i6 = this.f1535d;
            objArr4[i6] = null;
            this.f1535d = m1425h(i6);
        } else {
            int iM1428k2 = m1428k(this.f1535d + AbstractC0421o.m1460g(this));
            if (iM1428k <= iM1428k2) {
                Object[] objArr5 = this.f1536e;
                AbstractC0416j.m1438f(objArr5, objArr5, iM1428k, iM1428k + 1, iM1428k2 + 1);
            } else {
                Object[] objArr6 = this.f1536e;
                AbstractC0416j.m1438f(objArr6, objArr6, iM1428k, iM1428k + 1, objArr6.length);
                Object[] objArr7 = this.f1536e;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC0416j.m1438f(objArr7, objArr7, 0, 1, iM1428k2 + 1);
            }
            this.f1536e[iM1428k2] = null;
        }
        this.f1537f = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            m1429l();
            m1427j(this.f1535d, m1428k(this.f1535d + size()));
        }
        this.f1535d = 0;
        this.f1537f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i3) {
        AbstractC0409c.f1524d.m1410a(i3, size());
        return this.f1536e[m1428k(this.f1535d + i3)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i3;
        int iM1428k = m1428k(this.f1535d + size());
        int length = this.f1535d;
        if (length < iM1428k) {
            while (length < iM1428k) {
                if (AbstractC0606k.m2141a(obj, this.f1536e[length])) {
                    i3 = this.f1535d;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM1428k) {
            return -1;
        }
        int length2 = this.f1536e.length;
        while (true) {
            if (length >= length2) {
                for (int i4 = 0; i4 < iM1428k; i4++) {
                    if (AbstractC0606k.m2141a(obj, this.f1536e[i4])) {
                        length = i4 + this.f1536e.length;
                        i3 = this.f1535d;
                    }
                }
                return -1;
            }
            if (AbstractC0606k.m2141a(obj, this.f1536e[length])) {
                i3 = this.f1535d;
                break;
            }
            length++;
        }
        return length - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iM1447o;
        int i3;
        int iM1428k = m1428k(this.f1535d + size());
        int i4 = this.f1535d;
        if (i4 < iM1428k) {
            iM1447o = iM1428k - 1;
            if (i4 <= iM1447o) {
                while (!AbstractC0606k.m2141a(obj, this.f1536e[iM1447o])) {
                    if (iM1447o != i4) {
                        iM1447o--;
                    }
                }
                i3 = this.f1535d;
                return iM1447o - i3;
            }
            return -1;
        }
        if (i4 > iM1428k) {
            int i5 = iM1428k - 1;
            while (true) {
                if (-1 >= i5) {
                    iM1447o = AbstractC0417k.m1447o(this.f1536e);
                    int i6 = this.f1535d;
                    if (i6 <= iM1447o) {
                        while (!AbstractC0606k.m2141a(obj, this.f1536e[iM1447o])) {
                            if (iM1447o != i6) {
                                iM1447o--;
                            }
                        }
                        i3 = this.f1535d;
                    }
                } else {
                    if (AbstractC0606k.m2141a(obj, this.f1536e[i5])) {
                        iM1447o = i5 + this.f1536e.length;
                        i3 = this.f1535d;
                        break;
                    }
                    i5--;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final Object m1432m() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo1419c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int iM1428k;
        AbstractC0606k.m2145e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1536e.length != 0) {
            int iM1428k2 = m1428k(this.f1535d + size());
            int i3 = this.f1535d;
            if (i3 < iM1428k2) {
                iM1428k = i3;
                while (i3 < iM1428k2) {
                    Object obj = this.f1536e[i3];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f1536e[iM1428k] = obj;
                        iM1428k++;
                    }
                    i3++;
                }
                AbstractC0416j.m1442j(this.f1536e, null, iM1428k, iM1428k2);
            } else {
                int length = this.f1536e.length;
                boolean z3 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f1536e;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f1536e[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                iM1428k = m1428k(i4);
                for (int i5 = 0; i5 < iM1428k2; i5++) {
                    Object[] objArr2 = this.f1536e;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f1536e[iM1428k] = obj3;
                        iM1428k = m1425h(iM1428k);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                m1429l();
                this.f1537f = m1426i(iM1428k - this.f1535d);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m1429l();
        Object[] objArr = this.f1536e;
        int i3 = this.f1535d;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f1535d = m1425h(i3);
        this.f1537f = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m1429l();
        int iM1428k = m1428k(this.f1535d + AbstractC0421o.m1460g(this));
        Object[] objArr = this.f1536e;
        Object obj = objArr[iM1428k];
        objArr[iM1428k] = null;
        this.f1537f = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i3, int i4) {
        AbstractC0409c.f1524d.m1412c(i3, i4, size());
        int i5 = i4 - i3;
        if (i5 == 0) {
            return;
        }
        if (i5 == size()) {
            clear();
            return;
        }
        if (i5 == 1) {
            mo1419c(i3);
            return;
        }
        m1429l();
        if (i3 < size() - i4) {
            m1430n(i3, i4);
            int iM1428k = m1428k(this.f1535d + i5);
            m1427j(this.f1535d, iM1428k);
            this.f1535d = iM1428k;
        } else {
            m1431o(i3, i4);
            int iM1428k2 = m1428k(this.f1535d + size());
            m1427j(m1426i(iM1428k2 - i5), iM1428k2);
        }
        this.f1537f = size() - i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int iM1428k;
        AbstractC0606k.m2145e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1536e.length != 0) {
            int iM1428k2 = m1428k(this.f1535d + size());
            int i3 = this.f1535d;
            if (i3 < iM1428k2) {
                iM1428k = i3;
                while (i3 < iM1428k2) {
                    Object obj = this.f1536e[i3];
                    if (collection.contains(obj)) {
                        this.f1536e[iM1428k] = obj;
                        iM1428k++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                AbstractC0416j.m1442j(this.f1536e, null, iM1428k, iM1428k2);
            } else {
                int length = this.f1536e.length;
                boolean z3 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f1536e;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (collection.contains(obj2)) {
                        this.f1536e[i4] = obj2;
                        i4++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                iM1428k = m1428k(i4);
                for (int i5 = 0; i5 < iM1428k2; i5++) {
                    Object[] objArr2 = this.f1536e;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj3)) {
                        this.f1536e[iM1428k] = obj3;
                        iM1428k = m1425h(iM1428k);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                m1429l();
                this.f1537f = m1426i(iM1428k - this.f1535d);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i3, Object obj) {
        AbstractC0409c.f1524d.m1410a(i3, size());
        int iM1428k = m1428k(this.f1535d + i3);
        Object[] objArr = this.f1536e;
        Object obj2 = objArr[iM1428k];
        objArr[iM1428k] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "array");
        if (objArr.length < size()) {
            objArr = AbstractC0414h.m1433a(objArr, size());
        }
        Object[] objArr2 = objArr;
        int iM1428k = m1428k(this.f1535d + size());
        int i3 = this.f1535d;
        if (i3 < iM1428k) {
            AbstractC0416j.m1440h(this.f1536e, objArr2, 0, i3, iM1428k, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.f1536e;
            AbstractC0416j.m1438f(objArr3, objArr2, 0, this.f1535d, objArr3.length);
            Object[] objArr4 = this.f1536e;
            AbstractC0416j.m1438f(objArr4, objArr2, objArr4.length - this.f1535d, 0, iM1428k);
        }
        return AbstractC0420n.m1456c(size(), objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i3, Object obj) {
        AbstractC0409c.f1524d.m1411b(i3, size());
        if (i3 == size()) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        m1429l();
        m1424g(size() + 1);
        int iM1428k = m1428k(this.f1535d + i3);
        if (i3 < ((size() + 1) >> 1)) {
            int iM1423f = m1423f(iM1428k);
            int iM1423f2 = m1423f(this.f1535d);
            int i4 = this.f1535d;
            if (iM1423f >= i4) {
                Object[] objArr = this.f1536e;
                objArr[iM1423f2] = objArr[i4];
                AbstractC0416j.m1438f(objArr, objArr, i4, i4 + 1, iM1423f + 1);
            } else {
                Object[] objArr2 = this.f1536e;
                AbstractC0416j.m1438f(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                Object[] objArr3 = this.f1536e;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC0416j.m1438f(objArr3, objArr3, 0, 1, iM1423f + 1);
            }
            this.f1536e[iM1423f] = obj;
            this.f1535d = iM1423f2;
        } else {
            int iM1428k2 = m1428k(this.f1535d + size());
            if (iM1428k < iM1428k2) {
                Object[] objArr4 = this.f1536e;
                AbstractC0416j.m1438f(objArr4, objArr4, iM1428k + 1, iM1428k, iM1428k2);
            } else {
                Object[] objArr5 = this.f1536e;
                AbstractC0416j.m1438f(objArr5, objArr5, 1, 0, iM1428k2);
                Object[] objArr6 = this.f1536e;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC0416j.m1438f(objArr6, objArr6, iM1428k + 1, iM1428k, objArr6.length - 1);
            }
            this.f1536e[iM1428k] = obj;
        }
        this.f1537f = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i3, Collection collection) {
        AbstractC0606k.m2145e(collection, "elements");
        AbstractC0409c.f1524d.m1411b(i3, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i3 == size()) {
            return addAll(collection);
        }
        m1429l();
        m1424g(size() + collection.size());
        int iM1428k = m1428k(this.f1535d + size());
        int iM1428k2 = m1428k(this.f1535d + i3);
        int size = collection.size();
        if (i3 < ((size() + 1) >> 1)) {
            int i4 = this.f1535d;
            int length = i4 - size;
            if (iM1428k2 < i4) {
                Object[] objArr = this.f1536e;
                AbstractC0416j.m1438f(objArr, objArr, length, i4, objArr.length);
                if (size >= iM1428k2) {
                    Object[] objArr2 = this.f1536e;
                    AbstractC0416j.m1438f(objArr2, objArr2, objArr2.length - size, 0, iM1428k2);
                } else {
                    Object[] objArr3 = this.f1536e;
                    AbstractC0416j.m1438f(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f1536e;
                    AbstractC0416j.m1438f(objArr4, objArr4, 0, size, iM1428k2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f1536e;
                AbstractC0416j.m1438f(objArr5, objArr5, length, i4, iM1428k2);
            } else {
                Object[] objArr6 = this.f1536e;
                length += objArr6.length;
                int i5 = iM1428k2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    AbstractC0416j.m1438f(objArr6, objArr6, length, i4, iM1428k2);
                } else {
                    AbstractC0416j.m1438f(objArr6, objArr6, length, i4, i4 + length2);
                    Object[] objArr7 = this.f1536e;
                    AbstractC0416j.m1438f(objArr7, objArr7, 0, this.f1535d + length2, iM1428k2);
                }
            }
            this.f1535d = length;
            m1421d(m1426i(iM1428k2 - size), collection);
        } else {
            int i6 = iM1428k2 + size;
            if (iM1428k2 < iM1428k) {
                int i7 = size + iM1428k;
                Object[] objArr8 = this.f1536e;
                if (i7 <= objArr8.length) {
                    AbstractC0416j.m1438f(objArr8, objArr8, i6, iM1428k2, iM1428k);
                } else if (i6 >= objArr8.length) {
                    AbstractC0416j.m1438f(objArr8, objArr8, i6 - objArr8.length, iM1428k2, iM1428k);
                } else {
                    int length3 = iM1428k - (i7 - objArr8.length);
                    AbstractC0416j.m1438f(objArr8, objArr8, 0, length3, iM1428k);
                    Object[] objArr9 = this.f1536e;
                    AbstractC0416j.m1438f(objArr9, objArr9, i6, iM1428k2, length3);
                }
            } else {
                Object[] objArr10 = this.f1536e;
                AbstractC0416j.m1438f(objArr10, objArr10, size, 0, iM1428k);
                Object[] objArr11 = this.f1536e;
                if (i6 >= objArr11.length) {
                    AbstractC0416j.m1438f(objArr11, objArr11, i6 - objArr11.length, iM1428k2, objArr11.length);
                } else {
                    AbstractC0416j.m1438f(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f1536e;
                    AbstractC0416j.m1438f(objArr12, objArr12, i6, iM1428k2, objArr12.length - size);
                }
            }
            m1421d(iM1428k2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
