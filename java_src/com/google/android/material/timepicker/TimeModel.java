package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C1643a();

    /* JADX INFO: renamed from: d */
    private final C1651c f8323d;

    /* JADX INFO: renamed from: e */
    private final C1651c f8324e;

    /* JADX INFO: renamed from: f */
    final int f8325f;

    /* JADX INFO: renamed from: g */
    int f8326g;

    /* JADX INFO: renamed from: h */
    int f8327h;

    /* JADX INFO: renamed from: i */
    int f8328i;

    /* JADX INFO: renamed from: j */
    int f8329j;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimeModel$a */
    class C1643a implements Parcelable.Creator {
        C1643a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i3) {
            return new TimeModel[i3];
        }
    }

    public TimeModel(int i3, int i4, int i5, int i6) {
        this.f8326g = i3;
        this.f8327h = i4;
        this.f8328i = i5;
        this.f8325f = i6;
        this.f8329j = m9085e(i3);
        this.f8323d = new C1651c(59);
        this.f8324e = new C1651c(i6 == 1 ? 23 : 12);
    }

    /* JADX INFO: renamed from: a */
    public static String m9083a(Resources resources, CharSequence charSequence) {
        return m9084d(resources, charSequence, "%02d");
    }

    /* JADX INFO: renamed from: d */
    public static String m9084d(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static int m9085e(int i3) {
        return i3 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f8326g == timeModel.f8326g && this.f8327h == timeModel.f8327h && this.f8325f == timeModel.f8325f && this.f8328i == timeModel.f8328i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8325f), Integer.valueOf(this.f8326g), Integer.valueOf(this.f8327h), Integer.valueOf(this.f8328i)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f8326g);
        parcel.writeInt(this.f8327h);
        parcel.writeInt(this.f8328i);
        parcel.writeInt(this.f8325f);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
