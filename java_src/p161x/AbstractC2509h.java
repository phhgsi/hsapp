package p161x;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import p012E.C0112i;

/* JADX INFO: renamed from: x.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2509h {

    /* JADX INFO: renamed from: x.h$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static LocaleList m11924a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0112i m11922a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return C0112i.m338c(AbstractC2506e.m11910b(context));
        }
        Object objM11923b = m11923b(context);
        return objM11923b != null ? C0112i.m340j(a.m11924a(objM11923b)) : C0112i.m339e();
    }

    /* JADX INFO: renamed from: b */
    private static Object m11923b(Context context) {
        return context.getSystemService("locale");
    }
}
