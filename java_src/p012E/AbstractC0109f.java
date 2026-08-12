package p012E;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: renamed from: E.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0109f {

    /* JADX INFO: renamed from: E.f$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static LocaleList m333a(Configuration configuration) {
            return configuration.getLocales();
        }

        /* JADX INFO: renamed from: b */
        static void m334b(Configuration configuration, C0112i c0112i) {
            configuration.setLocales((LocaleList) c0112i.m345i());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0112i m331a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C0112i.m340j(a.m333a(configuration)) : C0112i.m336a(configuration.locale);
    }

    /* JADX INFO: renamed from: b */
    public static void m332b(Configuration configuration, C0112i c0112i) {
        if (Build.VERSION.SDK_INT >= 24) {
            a.m334b(configuration, c0112i);
        } else {
            if (c0112i.m342f()) {
                return;
            }
            configuration.setLocale(c0112i.m341d(0));
        }
    }
}
