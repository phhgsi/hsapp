package p124l0;

import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: l0.i */
/* JADX INFO: loaded from: classes.dex */
public class C2125i implements InterfaceC2131o {

    /* JADX INFO: renamed from: a */
    private static final String[] f9854a = new String[0];

    @Override // p124l0.InterfaceC2131o
    /* JADX INFO: renamed from: a */
    public String[] mo10585a() {
        return f9854a;
    }

    @Override // p124l0.InterfaceC2131o
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // p124l0.InterfaceC2131o
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
