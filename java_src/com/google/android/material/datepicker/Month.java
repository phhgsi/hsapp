package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C1493a();

    /* JADX INFO: renamed from: d */
    private final Calendar f7475d;

    /* JADX INFO: renamed from: e */
    final int f7476e;

    /* JADX INFO: renamed from: f */
    final int f7477f;

    /* JADX INFO: renamed from: g */
    final int f7478g;

    /* JADX INFO: renamed from: h */
    final int f7479h;

    /* JADX INFO: renamed from: i */
    final long f7480i;

    /* JADX INFO: renamed from: j */
    private String f7481j;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.Month$a */
    class C1493a implements Parcelable.Creator {
        C1493a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.m8123d(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i3) {
            return new Month[i3];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM8229c = AbstractC1514u.m8229c(calendar);
        this.f7475d = calendarM8229c;
        this.f7476e = calendarM8229c.get(2);
        this.f7477f = calendarM8229c.get(1);
        this.f7478g = calendarM8229c.getMaximum(7);
        this.f7479h = calendarM8229c.getActualMaximum(5);
        this.f7480i = calendarM8229c.getTimeInMillis();
    }

    /* JADX INFO: renamed from: d */
    static Month m8123d(int i3, int i4) {
        Calendar calendarM8237k = AbstractC1514u.m8237k();
        calendarM8237k.set(1, i3);
        calendarM8237k.set(2, i4);
        return new Month(calendarM8237k);
    }

    /* JADX INFO: renamed from: e */
    static Month m8124e(long j3) {
        Calendar calendarM8237k = AbstractC1514u.m8237k();
        calendarM8237k.setTimeInMillis(j3);
        return new Month(calendarM8237k);
    }

    /* JADX INFO: renamed from: f */
    static Month m8125f() {
        return new Month(AbstractC1514u.m8235i());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f7475d.compareTo(month.f7475d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f7476e == month.f7476e && this.f7477f == month.f7477f;
    }

    /* JADX INFO: renamed from: g */
    int m8127g(int i3) {
        int i4 = this.f7475d.get(7);
        if (i3 <= 0) {
            i3 = this.f7475d.getFirstDayOfWeek();
        }
        int i5 = i4 - i3;
        return i5 < 0 ? i5 + this.f7478g : i5;
    }

    /* JADX INFO: renamed from: h */
    long m8128h(int i3) {
        Calendar calendarM8229c = AbstractC1514u.m8229c(this.f7475d);
        calendarM8229c.set(5, i3);
        return calendarM8229c.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7476e), Integer.valueOf(this.f7477f)});
    }

    /* JADX INFO: renamed from: i */
    int m8129i(long j3) {
        Calendar calendarM8229c = AbstractC1514u.m8229c(this.f7475d);
        calendarM8229c.setTimeInMillis(j3);
        return calendarM8229c.get(5);
    }

    /* JADX INFO: renamed from: j */
    String m8130j() {
        if (this.f7481j == null) {
            this.f7481j = AbstractC1497d.m8145f(this.f7475d.getTimeInMillis());
        }
        return this.f7481j;
    }

    /* JADX INFO: renamed from: k */
    long m8131k() {
        return this.f7475d.getTimeInMillis();
    }

    /* JADX INFO: renamed from: l */
    Month m8132l(int i3) {
        Calendar calendarM8229c = AbstractC1514u.m8229c(this.f7475d);
        calendarM8229c.add(2, i3);
        return new Month(calendarM8229c);
    }

    /* JADX INFO: renamed from: m */
    int m8133m(Month month) {
        if (this.f7475d instanceof GregorianCalendar) {
            return ((month.f7477f - this.f7477f) * 12) + (month.f7476e - this.f7476e);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f7477f);
        parcel.writeInt(this.f7476e);
    }
}
