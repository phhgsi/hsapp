package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.google.android.material.datepicker.o */
/* JADX INFO: loaded from: classes.dex */
class C1508o {

    /* JADX INFO: renamed from: c */
    private static final C1508o f7595c = new C1508o(null, null);

    /* JADX INFO: renamed from: a */
    private final Long f7596a;

    /* JADX INFO: renamed from: b */
    private final TimeZone f7597b;

    private C1508o(Long l3, TimeZone timeZone) {
        this.f7596a = l3;
        this.f7597b = timeZone;
    }

    /* JADX INFO: renamed from: c */
    static C1508o m8219c() {
        return f7595c;
    }

    /* JADX INFO: renamed from: a */
    Calendar m8220a() {
        return m8221b(this.f7597b);
    }

    /* JADX INFO: renamed from: b */
    Calendar m8221b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l3 = this.f7596a;
        if (l3 != null) {
            calendar.setTimeInMillis(l3.longValue());
        }
        return calendar;
    }
}
