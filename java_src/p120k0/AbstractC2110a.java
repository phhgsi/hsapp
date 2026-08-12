package p120k0;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import p124l0.AbstractC2117a;
import p124l0.AbstractC2123g;
import p124l0.AbstractC2129m;
import p124l0.AbstractC2130n;
import p124l0.C2127k;
import p124l0.C2128l;

/* JADX INFO: renamed from: k0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2110a {
    /* JADX INFO: renamed from: a */
    private static C2127k m10565a(WebSettings webSettings) {
        try {
            return AbstractC2130n.m10593c().m10597a(webSettings);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e3;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e3);
            return new C2128l();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10566b(WebSettings webSettings, int i3) {
        AbstractC2117a.h hVar = AbstractC2129m.f9878T;
        if (hVar.mo10577c()) {
            AbstractC2123g.m10584a(webSettings, i3);
        } else {
            if (!hVar.mo10578d()) {
                throw AbstractC2129m.m10588a();
            }
            m10565a(webSettings).mo10586a(i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10567c(WebSettings webSettings, int i3) {
        if (!AbstractC2129m.f9879U.mo10578d()) {
            throw AbstractC2129m.m10588a();
        }
        m10565a(webSettings).mo10587b(i3);
    }
}
