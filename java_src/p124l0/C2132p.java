package p124l0;

import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p130m2.AbstractC2276a;

/* JADX INFO: renamed from: l0.p */
/* JADX INFO: loaded from: classes.dex */
public class C2132p implements InterfaceC2131o {

    /* JADX INFO: renamed from: a */
    final WebViewProviderFactoryBoundaryInterface f9935a;

    public C2132p(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f9935a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // p124l0.InterfaceC2131o
    /* JADX INFO: renamed from: a */
    public String[] mo10585a() {
        return this.f9935a.getSupportedFeatures();
    }

    @Override // p124l0.InterfaceC2131o
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) AbstractC2276a.m10867a(StaticsBoundaryInterface.class, this.f9935a.getStatics());
    }

    @Override // p124l0.InterfaceC2131o
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) AbstractC2276a.m10867a(WebkitToCompatConverterBoundaryInterface.class, this.f9935a.getWebkitToCompatConverter());
    }
}
