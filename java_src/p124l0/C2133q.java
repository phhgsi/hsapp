package p124l0;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p130m2.AbstractC2276a;

/* JADX INFO: renamed from: l0.q */
/* JADX INFO: loaded from: classes.dex */
public class C2133q {

    /* JADX INFO: renamed from: a */
    private final WebkitToCompatConverterBoundaryInterface f9936a;

    public C2133q(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f9936a = webkitToCompatConverterBoundaryInterface;
    }

    /* JADX INFO: renamed from: a */
    public C2127k m10597a(WebSettings webSettings) {
        return new C2127k((WebSettingsBoundaryInterface) AbstractC2276a.m10867a(WebSettingsBoundaryInterface.class, this.f9936a.convertSettings(webSettings)));
    }
}
