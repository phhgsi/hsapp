package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzlp<E> extends zzie<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzlp<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzlp<>(objArr, 0, false);
    }

    zzlp() {
        this(zza, 0, true);
    }

    private static int zzc(int i3) {
        return Math.max(((i3 * 3) / 2) + 1, 10);
    }

    public static <E> zzlp<E> zzd() {
        return (zzlp<E>) zzb;
    }

    private final void zze(int i3) {
        if (i3 < 0 || i3 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzd(i3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final void add(int i3, E e3) {
        int i4;
        zza();
        if (i3 < 0 || i3 > (i4 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzd(i3));
        }
        E[] eArr = this.zzc;
        if (i4 < eArr.length) {
            System.arraycopy(eArr, i3, eArr, i3 + 1, i4 - i3);
        } else {
            E[] eArr2 = (E[]) new Object[zzc(eArr.length)];
            System.arraycopy(this.zzc, 0, eArr2, 0, i3);
            System.arraycopy(this.zzc, i3, eArr2, i3 + 1, this.zzd - i3);
            this.zzc = eArr2;
        }
        this.zzc[i3] = e3;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i3) {
        zze(i3);
        return this.zzc[i3];
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final E remove(int i3) {
        zza();
        zze(i3);
        E[] eArr = this.zzc;
        E e3 = eArr[i3];
        if (i3 < this.zzd - 1) {
            System.arraycopy(eArr, i3 + 1, eArr, i3, (r2 - i3) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final E set(int i3, E e3) {
        zza();
        zze(i3);
        E[] eArr = this.zzc;
        E e4 = eArr[i3];
        eArr[i3] = e3;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    public final /* synthetic */ zzkc zza(int i3) {
        if (i3 >= this.zzd) {
            return new zzlp(i3 == 0 ? zza : Arrays.copyOf(this.zzc, i3), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    final void zzb(int i3) {
        E[] eArr = this.zzc;
        if (i3 <= eArr.length) {
            return;
        }
        if (eArr.length == 0) {
            this.zzc = (E[]) new Object[Math.max(i3, 10)];
            return;
        }
        int length = eArr.length;
        while (length < i3) {
            length = zzc(length);
        }
        this.zzc = (E[]) Arrays.copyOf(this.zzc, length);
    }

    private zzlp(E[] eArr, int i3, boolean z2) {
        super(z2);
        this.zzc = eArr;
        this.zzd = i3;
    }

    private final String zzd(int i3) {
        return "Index:" + i3 + ", Size:" + this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e3) {
        zza();
        int i3 = this.zzd;
        E[] eArr = this.zzc;
        if (i3 == eArr.length) {
            this.zzc = (E[]) Arrays.copyOf(this.zzc, zzc(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i4 = this.zzd;
        this.zzd = i4 + 1;
        eArr2[i4] = e3;
        ((AbstractList) this).modCount++;
        return true;
    }
}
