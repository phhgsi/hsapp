package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p024I.AbstractC0206c;

/* JADX INFO: loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C1489a();

    /* JADX INFO: renamed from: d */
    private final Month f7457d;

    /* JADX INFO: renamed from: e */
    private final Month f7458e;

    /* JADX INFO: renamed from: f */
    private final DateValidator f7459f;

    /* JADX INFO: renamed from: g */
    private Month f7460g;

    /* JADX INFO: renamed from: h */
    private final int f7461h;

    /* JADX INFO: renamed from: i */
    private final int f7462i;

    /* JADX INFO: renamed from: j */
    private final int f7463j;

    public interface DateValidator extends Parcelable {
        /* JADX INFO: renamed from: b */
        boolean mo8112b(long j3);
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    class C1489a implements Parcelable.Creator {
        C1489a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i3) {
            return new CalendarConstraints[i3];
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C1490b {

        /* JADX INFO: renamed from: f */
        static final long f7464f = AbstractC1514u.m8227a(Month.m8123d(1900, 0).f7480i);

        /* JADX INFO: renamed from: g */
        static final long f7465g = AbstractC1514u.m8227a(Month.m8123d(2100, 11).f7480i);

        /* JADX INFO: renamed from: a */
        private long f7466a;

        /* JADX INFO: renamed from: b */
        private long f7467b;

        /* JADX INFO: renamed from: c */
        private Long f7468c;

        /* JADX INFO: renamed from: d */
        private int f7469d;

        /* JADX INFO: renamed from: e */
        private DateValidator f7470e;

        C1490b(CalendarConstraints calendarConstraints) {
            this.f7466a = f7464f;
            this.f7467b = f7465g;
            this.f7470e = DateValidatorPointForward.m8118a(Long.MIN_VALUE);
            this.f7466a = calendarConstraints.f7457d.f7480i;
            this.f7467b = calendarConstraints.f7458e.f7480i;
            this.f7468c = Long.valueOf(calendarConstraints.f7460g.f7480i);
            this.f7469d = calendarConstraints.f7461h;
            this.f7470e = calendarConstraints.f7459f;
        }

        /* JADX INFO: renamed from: a */
        public CalendarConstraints m8115a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f7470e);
            Month monthM8124e = Month.m8124e(this.f7466a);
            Month monthM8124e2 = Month.m8124e(this.f7467b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l3 = this.f7468c;
            return new CalendarConstraints(monthM8124e, monthM8124e2, dateValidator, l3 == null ? null : Month.m8124e(l3.longValue()), this.f7469d, null);
        }

        /* JADX INFO: renamed from: b */
        public C1490b m8116b(long j3) {
            this.f7468c = Long.valueOf(j3);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i3, C1489a c1489a) {
        this(month, month2, dateValidator, month3, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f7457d.equals(calendarConstraints.f7457d) && this.f7458e.equals(calendarConstraints.f7458e) && AbstractC0206c.m596a(this.f7460g, calendarConstraints.f7460g) && this.f7461h == calendarConstraints.f7461h && this.f7459f.equals(calendarConstraints.f7459f);
    }

    /* JADX INFO: renamed from: h */
    public DateValidator m8105h() {
        return this.f7459f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7457d, this.f7458e, this.f7460g, Integer.valueOf(this.f7461h), this.f7459f});
    }

    /* JADX INFO: renamed from: i */
    Month m8106i() {
        return this.f7458e;
    }

    /* JADX INFO: renamed from: j */
    int m8107j() {
        return this.f7461h;
    }

    /* JADX INFO: renamed from: k */
    int m8108k() {
        return this.f7463j;
    }

    /* JADX INFO: renamed from: l */
    Month m8109l() {
        return this.f7460g;
    }

    /* JADX INFO: renamed from: m */
    Month m8110m() {
        return this.f7457d;
    }

    /* JADX INFO: renamed from: n */
    int m8111n() {
        return this.f7462i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f7457d, 0);
        parcel.writeParcelable(this.f7458e, 0);
        parcel.writeParcelable(this.f7460g, 0);
        parcel.writeParcelable(this.f7459f, 0);
        parcel.writeInt(this.f7461h);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i3) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f7457d = month;
        this.f7458e = month2;
        this.f7460g = month3;
        this.f7461h = i3;
        this.f7459f = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i3 < 0 || i3 > AbstractC1514u.m8237k().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f7463j = month.m8133m(month2) + 1;
        this.f7462i = (month2.f7477f - month.f7477f) + 1;
    }
}
