package p117j1;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2080n extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: d */
    private static final Object[] f9740d = new Object[0];

    /* JADX INFO: renamed from: j1.n$a */
    static abstract class a extends b {

        /* JADX INFO: renamed from: a */
        Object[] f9741a;

        /* JADX INFO: renamed from: b */
        int f9742b;

        /* JADX INFO: renamed from: c */
        boolean f9743c;

        a(int i3) {
            AbstractC2073g.m10330b(i3, "initialCapacity");
            this.f9741a = new Object[i3];
            this.f9742b = 0;
        }

        /* JADX INFO: renamed from: d */
        private void m10401d(int i3) {
            Object[] objArr = this.f9741a;
            if (objArr.length < i3) {
                this.f9741a = Arrays.copyOf(objArr, b.m10404a(objArr.length, i3));
                this.f9743c = false;
            } else if (this.f9743c) {
                this.f9741a = (Object[]) objArr.clone();
                this.f9743c = false;
            }
        }

        /* JADX INFO: renamed from: b */
        public b m10402b(Object... objArr) {
            m10403c(objArr, objArr.length);
            return this;
        }

        /* JADX INFO: renamed from: c */
        final void m10403c(Object[] objArr, int i3) {
            AbstractC2053F.m10274c(objArr, i3);
            m10401d(this.f9742b + i3);
            System.arraycopy(objArr, 0, this.f9741a, this.f9742b, i3);
            this.f9742b += i3;
        }
    }

    /* JADX INFO: renamed from: j1.n$b */
    public static abstract class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        static int m10404a(int i3, int i4) {
            if (i4 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i3 + (i3 >> 1) + 1;
            if (iHighestOneBit < i4) {
                iHighestOneBit = Integer.highestOneBit(i4 - 1) << 1;
            }
            return iHighestOneBit < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iHighestOneBit;
        }
    }

    AbstractC2080n() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    abstract int mo10284b(Object[] objArr, int i3);

    /* JADX INFO: renamed from: c */
    Object[] mo10285c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* JADX INFO: renamed from: d */
    int mo10286d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    int mo10287e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: f */
    abstract boolean mo10288f();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f9740d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC2035h.m10240i(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo10285c = mo10285c();
            if (objArrMo10285c != null) {
                return AbstractC2055H.m10281a(objArrMo10285c, mo10287e(), mo10286d(), objArr);
            }
            objArr = AbstractC2053F.m10275d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo10284b(objArr, 0);
        return objArr;
    }
}
