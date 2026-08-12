package p098e2;

import java.io.IOException;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: e2.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1869e {
    /* JADX INFO: renamed from: a */
    public static void m9664a(Appendable appendable, Object obj, InterfaceC0577l interfaceC0577l) throws IOException {
        AbstractC0606k.m2145e(appendable, "<this>");
        if (interfaceC0577l != null) {
            appendable.append((CharSequence) interfaceC0577l.mo1406f(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
