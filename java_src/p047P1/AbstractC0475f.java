package p047P1;

import java.lang.reflect.Field;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: P1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0475f {
    /* JADX INFO: renamed from: a */
    private static final void m1761a(int i3, int i4) {
        if (i4 <= i3) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i3 + ", got " + i4 + ". Please update the Kotlin standard library.").toString());
    }

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0474e m1762b(AbstractC0470a abstractC0470a) {
        return (InterfaceC0474e) abstractC0470a.getClass().getAnnotation(InterfaceC0474e.class);
    }

    /* JADX INFO: renamed from: c */
    private static final int m1763c(AbstractC0470a abstractC0470a) {
        try {
            Field declaredField = abstractC0470a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC0470a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final StackTraceElement m1764d(AbstractC0470a abstractC0470a) {
        String strM1756c;
        AbstractC0606k.m2145e(abstractC0470a, "<this>");
        InterfaceC0474e interfaceC0474eM1762b = m1762b(abstractC0470a);
        if (interfaceC0474eM1762b == null) {
            return null;
        }
        m1761a(1, interfaceC0474eM1762b.m1760v());
        int iM1763c = m1763c(abstractC0470a);
        int i3 = iM1763c < 0 ? -1 : interfaceC0474eM1762b.m1758l()[iM1763c];
        String strM1769b = C0477h.f1682a.m1769b(abstractC0470a);
        if (strM1769b == null) {
            strM1756c = interfaceC0474eM1762b.m1756c();
        } else {
            strM1756c = strM1769b + '/' + interfaceC0474eM1762b.m1756c();
        }
        return new StackTraceElement(strM1756c, interfaceC0474eM1762b.m1759m(), interfaceC0474eM1762b.m1757f(), i3);
    }
}
