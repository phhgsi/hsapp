package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes.dex */
@NullMarked
abstract class zzj implements Iterator {
    private Object zza;
    private int zzb = 2;

    protected zzj() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.zzb;
        if (i3 == 4) {
            throw new IllegalStateException();
        }
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 0) {
            return true;
        }
        if (i4 != 2) {
            this.zzb = 4;
            this.zza = zza();
            if (this.zzb != 3) {
                this.zzb = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zzb = 2;
        Object obj = this.zza;
        this.zza = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected abstract Object zza();

    protected final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
