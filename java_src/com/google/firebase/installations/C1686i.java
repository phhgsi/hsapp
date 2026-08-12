package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p008C1.AbstractC0090d;
import p014E1.C0128b;
import p014E1.InterfaceC0127a;

/* JADX INFO: renamed from: com.google.firebase.installations.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1686i {

    /* JADX INFO: renamed from: b */
    public static final long f8454b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c */
    private static final Pattern f8455c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d */
    private static C1686i f8456d;

    /* JADX INFO: renamed from: a */
    private final InterfaceC0127a f8457a;

    private C1686i(InterfaceC0127a interfaceC0127a) {
        this.f8457a = interfaceC0127a;
    }

    /* JADX INFO: renamed from: c */
    public static C1686i m9192c() {
        return m9193d(C0128b.m365a());
    }

    /* JADX INFO: renamed from: d */
    public static C1686i m9193d(InterfaceC0127a interfaceC0127a) {
        if (f8456d == null) {
            f8456d = new C1686i(interfaceC0127a);
        }
        return f8456d;
    }

    /* JADX INFO: renamed from: g */
    static boolean m9194g(String str) {
        return f8455c.matcher(str).matches();
    }

    /* JADX INFO: renamed from: h */
    static boolean m9195h(String str) {
        return str.contains(":");
    }

    /* JADX INFO: renamed from: a */
    public long m9196a() {
        return this.f8457a.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public long m9197b() {
        return TimeUnit.MILLISECONDS.toSeconds(m9196a());
    }

    /* JADX INFO: renamed from: e */
    public long m9198e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* JADX INFO: renamed from: f */
    public boolean m9199f(AbstractC0090d abstractC0090d) {
        return TextUtils.isEmpty(abstractC0090d.mo215b()) || abstractC0090d.mo221h() + abstractC0090d.mo216c() < m9197b() + f8454b;
    }
}
