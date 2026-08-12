package com.google.android.gms.common.data;

/* JADX INFO: loaded from: classes.dex */
public interface DataBufferObserver {

    public interface Observable {
        void addObserver(DataBufferObserver dataBufferObserver);

        void removeObserver(DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i3, int i4);

    void onDataRangeInserted(int i3, int i4);

    void onDataRangeMoved(int i3, int i4, int i5);

    void onDataRangeRemoved(int i3, int i4);
}
