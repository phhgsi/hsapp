package p113i1;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: i1.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2037j {
    /* JADX INFO: renamed from: a */
    public static String m10248a(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i3 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                objArr[i4] = m10249b(objArr[i4]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i5 = 0;
        while (i3 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i5)) != -1) {
            sb.append((CharSequence) strValueOf, i5, iIndexOf);
            sb.append(objArr[i3]);
            i5 = iIndexOf + 2;
            i3++;
        }
        sb.append((CharSequence) strValueOf, i5, strValueOf.length());
        if (i3 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i3]);
            for (int i6 = i3 + 1; i6 < objArr.length; i6++) {
                sb.append(", ");
                sb.append(objArr[i6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private static String m10249b(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e3) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String string = sb.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(string);
            logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e3);
            String name2 = e3.getClass().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 9 + name2.length());
            sb2.append("<");
            sb2.append(string);
            sb2.append(" threw ");
            sb2.append(name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}
