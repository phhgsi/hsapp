package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C1491a();

    /* JADX INFO: renamed from: d */
    private final long f7471d;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    class C1491a implements Parcelable.Creator {
        C1491a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward[] newArray(int i3) {
            return new DateValidatorPointForward[i3];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j3, C1491a c1491a) {
        this(j3);
    }

    /* JADX INFO: renamed from: a */
    public static DateValidatorPointForward m8118a(long j3) {
        return new DateValidatorPointForward(j3);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* JADX INFO: renamed from: b */
    public boolean mo8112b(long j3) {
        return j3 >= this.f7471d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f7471d == ((DateValidatorPointForward) obj).f7471d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7471d)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f7471d);
    }

    private DateValidatorPointForward(long j3) {
        this.f7471d = j3;
    }
}
