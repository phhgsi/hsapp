package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    protected EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                        for (int i3 = 1; i3 < count; i3++) {
                            int windowIndex = this.mDataHolder.getWindowIndex(i3);
                            String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i3, windowIndex);
                            if (string2 == null) {
                                throw new NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i3 + ", for window: " + windowIndex);
                            }
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i3));
                                string = string2;
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @ResultIgnorabilityUnspecified
    public final T get(int i3) {
        int iIntValue;
        int iIntValue2;
        zab();
        int iZaa = zaa(i3);
        int i4 = 0;
        if (i3 >= 0 && i3 != this.zab.size()) {
            if (i3 == this.zab.size() - 1) {
                iIntValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                iIntValue2 = ((Integer) this.zab.get(i3)).intValue();
            } else {
                iIntValue = ((Integer) this.zab.get(i3 + 1)).intValue();
                iIntValue2 = ((Integer) this.zab.get(i3)).intValue();
            }
            int i5 = iIntValue - iIntValue2;
            if (i5 == 1) {
                int iZaa2 = zaa(i3);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(iZaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, iZaa2, windowIndex) != null) {
                    i4 = 1;
                }
            } else {
                i4 = i5;
            }
        }
        return getEntry(iZaa, i4);
    }

    protected String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        zab();
        return this.zab.size();
    }

    protected abstract T getEntry(int i3, int i4);

    protected abstract String getPrimaryDataMarkerColumn();

    final int zaa(int i3) {
        if (i3 >= 0 && i3 < this.zab.size()) {
            return ((Integer) this.zab.get(i3)).intValue();
        }
        throw new IllegalArgumentException("Position " + i3 + " is out of bounds for this buffer");
    }
}
