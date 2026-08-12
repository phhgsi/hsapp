package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.material.datepicker.u */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1514u {

    /* JADX INFO: renamed from: a */
    static AtomicReference f7598a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    static long m8227a(long j3) {
        Calendar calendarM8237k = m8237k();
        calendarM8237k.setTimeInMillis(j3);
        return m8229c(calendarM8237k).getTimeInMillis();
    }

    /* JADX INFO: renamed from: b */
    private static DateFormat m8228b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m8236j());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    /* JADX INFO: renamed from: c */
    static Calendar m8229c(Calendar calendar) {
        Calendar calendarM8238l = m8238l(calendar);
        Calendar calendarM8237k = m8237k();
        calendarM8237k.set(calendarM8238l.get(1), calendarM8238l.get(2), calendarM8238l.get(5));
        return calendarM8237k;
    }

    /* JADX INFO: renamed from: d */
    private static java.text.DateFormat m8230d(int i3, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i3, locale);
        dateInstance.setTimeZone(m8234h());
        return dateInstance;
    }

    /* JADX INFO: renamed from: e */
    static java.text.DateFormat m8231e(Locale locale) {
        return m8230d(0, locale);
    }

    /* JADX INFO: renamed from: f */
    static DateFormat m8232f(Locale locale) {
        return m8228b("MMMMEEEEd", locale);
    }

    /* JADX INFO: renamed from: g */
    static C1508o m8233g() {
        C1508o c1508o = (C1508o) f7598a.get();
        return c1508o == null ? C1508o.m8219c() : c1508o;
    }

    /* JADX INFO: renamed from: h */
    private static TimeZone m8234h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: renamed from: i */
    static Calendar m8235i() {
        Calendar calendarM8220a = m8233g().m8220a();
        calendarM8220a.set(11, 0);
        calendarM8220a.set(12, 0);
        calendarM8220a.set(13, 0);
        calendarM8220a.set(14, 0);
        calendarM8220a.setTimeZone(m8234h());
        return calendarM8220a;
    }

    /* JADX INFO: renamed from: j */
    private static android.icu.util.TimeZone m8236j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: renamed from: k */
    static Calendar m8237k() {
        return m8238l(null);
    }

    /* JADX INFO: renamed from: l */
    static Calendar m8238l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m8234h());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    /* JADX INFO: renamed from: m */
    static DateFormat m8239m(Locale locale) {
        return m8228b("yMMMM", locale);
    }

    /* JADX INFO: renamed from: n */
    static DateFormat m8240n(Locale locale) {
        return m8228b("yMMMMEEEEd", locale);
    }
}
