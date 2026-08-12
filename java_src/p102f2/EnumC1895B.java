package p102f2;

import p035L1.C0379k;
import p041N1.AbstractC0444g;
import p041N1.InterfaceC0442e;
import p050Q1.AbstractC0488b;
import p050Q1.InterfaceC0487a;
import p068W1.InterfaceC0581p;
import p114i2.AbstractC2040a;
import p114i2.AbstractC2041b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f2.B */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1895B {

    /* JADX INFO: renamed from: d */
    public static final EnumC1895B f9398d = new EnumC1895B("DEFAULT", 0);

    /* JADX INFO: renamed from: e */
    public static final EnumC1895B f9399e = new EnumC1895B("LAZY", 1);

    /* JADX INFO: renamed from: f */
    public static final EnumC1895B f9400f = new EnumC1895B("ATOMIC", 2);

    /* JADX INFO: renamed from: g */
    public static final EnumC1895B f9401g = new EnumC1895B("UNDISPATCHED", 3);

    /* JADX INFO: renamed from: h */
    private static final /* synthetic */ EnumC1895B[] f9402h;

    /* JADX INFO: renamed from: i */
    private static final /* synthetic */ InterfaceC0487a f9403i;

    /* JADX INFO: renamed from: f2.B$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9404a;

        static {
            int[] iArr = new int[EnumC1895B.values().length];
            try {
                iArr[EnumC1895B.f9398d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1895B.f9400f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1895B.f9401g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1895B.f9399e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9404a = iArr;
        }
    }

    static {
        EnumC1895B[] enumC1895BArrM9778a = m9778a();
        f9402h = enumC1895BArrM9778a;
        f9403i = AbstractC0488b.m1799a(enumC1895BArrM9778a);
    }

    private EnumC1895B(String str, int i3) {
    }

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC1895B[] m9778a() {
        return new EnumC1895B[]{f9398d, f9399e, f9400f, f9401g};
    }

    public static EnumC1895B valueOf(String str) {
        return (EnumC1895B) Enum.valueOf(EnumC1895B.class, str);
    }

    public static EnumC1895B[] values() {
        return (EnumC1895B[]) f9402h.clone();
    }

    /* JADX INFO: renamed from: b */
    public final void m9779b(InterfaceC0581p interfaceC0581p, Object obj, InterfaceC0442e interfaceC0442e) throws Throwable {
        int i3 = a.f9404a[ordinal()];
        if (i3 == 1) {
            AbstractC2040a.m10255d(interfaceC0581p, obj, interfaceC0442e, null, 4, null);
            return;
        }
        if (i3 == 2) {
            AbstractC0444g.m1621a(interfaceC0581p, obj, interfaceC0442e);
        } else if (i3 == 3) {
            AbstractC2041b.m10256a(interfaceC0581p, obj, interfaceC0442e);
        } else if (i3 != 4) {
            throw new C0379k();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9780c() {
        return this == f9399e;
    }
}
