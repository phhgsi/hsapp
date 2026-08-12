package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p016F0.AbstractC0148i;

/* JADX INFO: renamed from: com.google.android.material.datepicker.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1497d {
    /* JADX INFO: renamed from: a */
    static String m8140a(Context context, long j3, boolean z2, boolean z3, boolean z4) {
        String strM8143d = m8143d(j3);
        if (z2) {
            strM8143d = String.format(context.getString(AbstractC0148i.f562v), strM8143d);
        }
        return z3 ? String.format(context.getString(AbstractC0148i.f561u), strM8143d) : z4 ? String.format(context.getString(AbstractC0148i.f558r), strM8143d) : strM8143d;
    }

    /* JADX INFO: renamed from: b */
    static String m8141b(long j3) {
        return m8142c(j3, Locale.getDefault());
    }

    /* JADX INFO: renamed from: c */
    static String m8142c(long j3, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC1514u.m8232f(locale).format(new Date(j3)) : AbstractC1514u.m8231e(locale).format(new Date(j3));
    }

    /* JADX INFO: renamed from: d */
    static String m8143d(long j3) {
        return m8148i(j3) ? m8141b(j3) : m8146g(j3);
    }

    /* JADX INFO: renamed from: e */
    static String m8144e(Context context, int i3) {
        return AbstractC1514u.m8235i().get(1) == i3 ? String.format(context.getString(AbstractC0148i.f559s), Integer.valueOf(i3)) : String.format(context.getString(AbstractC0148i.f560t), Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: f */
    static String m8145f(long j3) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC1514u.m8239m(Locale.getDefault()).format(new Date(j3)) : DateUtils.formatDateTime(null, j3, 8228);
    }

    /* JADX INFO: renamed from: g */
    static String m8146g(long j3) {
        return m8147h(j3, Locale.getDefault());
    }

    /* JADX INFO: renamed from: h */
    static String m8147h(long j3, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC1514u.m8240n(locale).format(new Date(j3)) : AbstractC1514u.m8231e(locale).format(new Date(j3));
    }

    /* JADX INFO: renamed from: i */
    private static boolean m8148i(long j3) {
        Calendar calendarM8235i = AbstractC1514u.m8235i();
        Calendar calendarM8237k = AbstractC1514u.m8237k();
        calendarM8237k.setTimeInMillis(j3);
        return calendarM8235i.get(1) == calendarM8237k.get(1);
    }
}
