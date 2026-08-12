package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable, AutoCloseable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    private final String[] zag;
    private final CursorWindow[] zah;
    private final int zai;
    private final Bundle zaj;
    private boolean zak;

    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i3) {
            return new DataHolder(this, i3);
        }

        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap map = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        public Builder zaa(HashMap map) {
            Asserts.checkNotNull(map);
            this.zab.add(map);
            return this;
        }

        public DataHolder build(int i3, Bundle bundle) {
            return new DataHolder(this, i3, bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    public static DataHolder empty(int i3) {
        return new DataHolder(zaf, i3, (Bundle) null);
    }

    private final void zae(String str, int i3) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i3 < 0 || i3 >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i3, this.zad);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        if (r5 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
    
        android.util.Log.d("DataHolder", "Couldn't populate window data for row " + r4 + " - allocating new window.");
        r2.freeLastRow();
        r2 = new android.database.CursorWindow(false);
        r2.setStartPosition(r4);
        r2.setNumColumns(r13.zaa.length);
        r3.add(r2);
        r4 = r4 - 1;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0174, code lost:
    
        throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.database.CursorWindow[] zaf(com.google.android.gms.common.data.DataHolder.Builder r13, int r14) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.zaf(com.google.android.gms.common.data.DataHolder$Builder, int):android.database.CursorWindow[]");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i3 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zah;
                        if (i3 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i3].close();
                        i3++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public boolean getBoolean(String str, int i3, int i4) {
        zae(str, i3);
        return this.zah[i4].getLong(i3, this.zab.getInt(str)) == 1;
    }

    public byte[] getByteArray(String str, int i3, int i4) {
        zae(str, i3);
        return this.zah[i4].getBlob(i3, this.zab.getInt(str));
    }

    public int getCount() {
        return this.zad;
    }

    public int getInteger(String str, int i3, int i4) {
        zae(str, i3);
        return this.zah[i4].getInt(i3, this.zab.getInt(str));
    }

    public long getLong(String str, int i3, int i4) {
        zae(str, i3);
        return this.zah[i4].getLong(i3, this.zab.getInt(str));
    }

    public Bundle getMetadata() {
        return this.zaj;
    }

    public int getStatusCode() {
        return this.zai;
    }

    public String getString(String str, int i3, int i4) {
        zae(str, i3);
        return this.zah[i4].getString(i3, this.zab.getInt(str));
    }

    public int getWindowIndex(int i3) {
        int length;
        int i4 = 0;
        Preconditions.checkState(i3 >= 0 && i3 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i4 >= length) {
                break;
            }
            if (i3 < iArr[i4]) {
                i4--;
                break;
            }
            i4++;
        }
        return i4 == length ? i4 - 1 : i4;
    }

    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    public boolean hasNull(String str, int i3, int i4) {
        zae(str, i3);
        return this.zah[i4].isNull(i3, this.zab.getInt(str));
    }

    public boolean isClosed() {
        boolean z2;
        synchronized (this) {
            z2 = this.zae;
        }
        return z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        String[] strArr = this.zag;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i3, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i3 & 1) != 0) {
            close();
        }
    }

    public final double zaa(String str, int i3, int i4) {
        zae(str, i3);
        return this.zah[i4].getDouble(i3, this.zab.getInt(str));
    }

    public final float zab(String str, int i3, int i4) {
        zae(str, i3);
        return this.zah[i4].getFloat(i3, this.zab.getInt(str));
    }

    public final void zac(String str, int i3, int i4, CharArrayBuffer charArrayBuffer) {
        zae(str, i3);
        this.zah[i4].copyStringToBuffer(i3, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i4 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i4], i4);
            i4++;
        }
        this.zac = new int[this.zah.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i3 >= cursorWindowArr.length) {
                this.zad = numRows;
                return;
            }
            this.zac[i3] = numRows;
            numRows += this.zah[i3].getNumRows() - (numRows - cursorWindowArr[i3].getStartPosition());
            i3++;
        }
    }

    DataHolder(int i3, String[] strArr, CursorWindow[] cursorWindowArr, int i4, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i3;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i4;
        this.zaj = bundle;
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i3;
        this.zaj = bundle;
        zad();
    }

    /* JADX WARN: Finally extract failed */
    public DataHolder(Cursor cursor, int i3, Bundle bundle) {
        int startPosition;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count) {
                if (!cursorWrapper.moveToPosition(startPosition)) {
                    break;
                }
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            this(columnNames, (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]), i3, bundle);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private DataHolder(Builder builder, int i3, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i3, (Bundle) null);
    }
}
