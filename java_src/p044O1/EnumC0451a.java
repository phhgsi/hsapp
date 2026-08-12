package p044O1;

import p050Q1.AbstractC0488b;
import p050Q1.InterfaceC0487a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O1.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0451a {

    /* JADX INFO: renamed from: d */
    public static final EnumC0451a f1597d = new EnumC0451a("COROUTINE_SUSPENDED", 0);

    /* JADX INFO: renamed from: e */
    public static final EnumC0451a f1598e = new EnumC0451a("UNDECIDED", 1);

    /* JADX INFO: renamed from: f */
    public static final EnumC0451a f1599f = new EnumC0451a("RESUMED", 2);

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ EnumC0451a[] f1600g;

    /* JADX INFO: renamed from: h */
    private static final /* synthetic */ InterfaceC0487a f1601h;

    static {
        EnumC0451a[] enumC0451aArrM1641a = m1641a();
        f1600g = enumC0451aArrM1641a;
        f1601h = AbstractC0488b.m1799a(enumC0451aArrM1641a);
    }

    private EnumC0451a(String str, int i3) {
    }

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC0451a[] m1641a() {
        return new EnumC0451a[]{f1597d, f1598e, f1599f};
    }

    public static EnumC0451a valueOf(String str) {
        return (EnumC0451a) Enum.valueOf(EnumC0451a.class, str);
    }

    public static EnumC0451a[] values() {
        return (EnumC0451a[]) f1600g.clone();
    }
}
