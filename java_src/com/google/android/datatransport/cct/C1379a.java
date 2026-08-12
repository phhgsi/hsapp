package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p144r0.C2366c;
import p150t0.InterfaceC2431g;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1379a implements InterfaceC2431g {

    /* JADX INFO: renamed from: c */
    static final String f6862c;

    /* JADX INFO: renamed from: d */
    static final String f6863d;

    /* JADX INFO: renamed from: e */
    private static final String f6864e;

    /* JADX INFO: renamed from: f */
    private static final Set f6865f;

    /* JADX INFO: renamed from: g */
    public static final C1379a f6866g;

    /* JADX INFO: renamed from: h */
    public static final C1379a f6867h;

    /* JADX INFO: renamed from: a */
    private final String f6868a;

    /* JADX INFO: renamed from: b */
    private final String f6869b;

    static {
        String strM7207a = AbstractC1383e.m7207a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f6862c = strM7207a;
        String strM7207a2 = AbstractC1383e.m7207a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f6863d = strM7207a2;
        String strM7207a3 = AbstractC1383e.m7207a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f6864e = strM7207a3;
        f6865f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C2366c.m11213b("proto"), C2366c.m11213b("json"))));
        f6866g = new C1379a(strM7207a, null);
        f6867h = new C1379a(strM7207a2, strM7207a3);
    }

    public C1379a(String str, String str2) {
        this.f6868a = str;
        this.f6869b = str2;
    }

    /* JADX INFO: renamed from: c */
    public static C1379a m7187c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C1379a(str2, str3);
    }

    @Override // p150t0.InterfaceC2431g
    /* JADX INFO: renamed from: a */
    public Set mo7188a() {
        return f6865f;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m7189b() {
        String str = this.f6869b;
        if (str == null && this.f6868a == null) {
            return null;
        }
        String str2 = this.f6868a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    /* JADX INFO: renamed from: d */
    public String m7190d() {
        return this.f6869b;
    }

    /* JADX INFO: renamed from: e */
    public String m7191e() {
        return this.f6868a;
    }

    @Override // p150t0.InterfaceC2430f
    public byte[] getExtras() {
        return m7189b();
    }

    @Override // p150t0.InterfaceC2430f
    public String getName() {
        return "cct";
    }
}
