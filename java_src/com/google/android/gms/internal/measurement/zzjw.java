package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzjw extends zzie<Integer> implements zzka, zzlo, RandomAccess {
    private static final int[] zza;
    private static final zzjw zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzjw(iArr, 0, false);
    }

    zzjw() {
        this(zza, 0, true);
    }

    public static zzjw zzd() {
        return zzb;
    }

    private static int zzf(int i3) {
        return Math.max(((i3 * 3) / 2) + 1, 10);
    }

    private final String zzg(int i3) {
        return "Index:" + i3 + ", Size:" + this.zzd;
    }

    private final void zzh(int i3) {
        if (i3 < 0 || i3 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzg(i3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i3, Object obj) {
        int i4;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i3 < 0 || i3 > (i4 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzg(i3));
        }
        int[] iArr = this.zzc;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i3, iArr, i3 + 1, i4 - i3);
        } else {
            int[] iArr2 = new int[zzf(iArr.length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i3);
            System.arraycopy(this.zzc, i3, iArr2, i3 + 1, this.zzd - i3);
            this.zzc = iArr2;
        }
        this.zzc[i3] = iIntValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        zza();
        zzjv.zza(collection);
        if (!(collection instanceof zzjw)) {
            return super.addAll(collection);
        }
        zzjw zzjwVar = (zzjw) collection;
        int i3 = zzjwVar.zzd;
        if (i3 == 0) {
            return false;
        }
        int i4 = this.zzd;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i4 < i3) {
            throw new OutOfMemoryError();
        }
        int i5 = i4 + i3;
        int[] iArr = this.zzc;
        if (i5 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i5);
        }
        System.arraycopy(zzjwVar.zzc, 0, this.zzc, this.zzd, zzjwVar.zzd);
        this.zzd = i5;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjw)) {
            return super.equals(obj);
        }
        zzjw zzjwVar = (zzjw) obj;
        if (this.zzd != zzjwVar.zzd) {
            return false;
        }
        int[] iArr = zzjwVar.zzc;
        for (int i3 = 0; i3 < this.zzd; i3++) {
            if (this.zzc[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        return Integer.valueOf(zzb(i3));
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i4 = 0; i4 < this.zzd; i4++) {
            i3 = (i3 * 31) + this.zzc[i4];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.zzc[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i3) {
        zza();
        zzh(i3);
        int[] iArr = this.zzc;
        int i4 = iArr[i3];
        if (i3 < this.zzd - 1) {
            System.arraycopy(iArr, i3 + 1, iArr, i3, (r2 - i3) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i3, int i4) {
        zza();
        if (i4 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i4, iArr, i3, this.zzd - i4);
        this.zzd -= i4 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i3, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        zzh(i3);
        int[] iArr = this.zzc;
        int i4 = iArr[i3];
        iArr[i3] = iIntValue;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final int zzb(int i3) {
        zzh(i3);
        return this.zzc[i3];
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzka zza(int i3) {
        if (i3 >= this.zzd) {
            return new zzjw(i3 == 0 ? zza : Arrays.copyOf(this.zzc, i3), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    final void zze(int i3) {
        int[] iArr = this.zzc;
        if (i3 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.zzc = new int[Math.max(i3, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i3) {
            length = zzf(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzjw(int[] iArr, int i3, boolean z2) {
        super(z2);
        this.zzc = iArr;
        this.zzd = i3;
    }

    public final void zzd(int i3) {
        zza();
        int i4 = this.zzd;
        int[] iArr = this.zzc;
        if (i4 == iArr.length) {
            int[] iArr2 = new int[zzf(iArr.length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, this.zzd);
            this.zzc = iArr2;
        }
        int[] iArr3 = this.zzc;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        iArr3[i5] = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzd(((Integer) obj).intValue());
        return true;
    }
}
