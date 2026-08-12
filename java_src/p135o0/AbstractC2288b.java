package p135o0;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.appcompat.app.AbstractC0740E;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p018G.C0172u;
import p138p0.AbstractC2313a;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2288b {

    /* JADX INFO: renamed from: a */
    private final Application f10598a;

    public AbstractC2288b(Application application) {
        this.f10598a = application;
    }

    /* JADX INFO: renamed from: A */
    public boolean m10927A() {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m10929a(InterfaceC2293g interfaceC2293g, C0172u c0172u, Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public Map m10930b() {
        List listMo6779e = mo6779e();
        if (listMo6779e != null) {
            Iterator it = listMo6779e.iterator();
            if (it.hasNext()) {
                AbstractC0740E.m2693a(it.next());
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Map m10931c(InterfaceC2293g interfaceC2293g) {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: d */
    public Map m10932d(InterfaceC2293g interfaceC2293g, boolean z2) {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: e */
    protected abstract List mo6779e();

    /* JADX INFO: renamed from: f */
    public AbstractC2313a m10933f(InterfaceC2293g interfaceC2293g) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public WebResourceResponse m10937j(InterfaceC2293g interfaceC2293g, WebResourceRequest webResourceRequest) {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public void m10946s(Application application) {
        C2292f.m10956b().m10958c(application);
    }

    /* JADX INFO: renamed from: v */
    public boolean m10949v(int i3, KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: B */
    public void m10928B(String str) {
    }

    /* JADX INFO: renamed from: i */
    public void m10936i(InterfaceC2293g interfaceC2293g) {
    }

    /* JADX INFO: renamed from: l */
    public void m10939l(InterfaceC2293g interfaceC2293g) {
    }

    /* JADX INFO: renamed from: n */
    public void m10941n(InterfaceC2293g interfaceC2293g) {
    }

    /* JADX INFO: renamed from: p */
    public void m10943p(InterfaceC2293g interfaceC2293g) {
    }

    /* JADX INFO: renamed from: q */
    public void m10944q(InterfaceC2293g interfaceC2293g) {
    }

    /* JADX INFO: renamed from: r */
    public void m10945r(InterfaceC2293g interfaceC2293g) {
    }

    /* JADX INFO: renamed from: t */
    public void m10947t(InterfaceC2293g interfaceC2293g) {
    }

    /* JADX INFO: renamed from: u */
    public void m10948u(InterfaceC2293g interfaceC2293g) {
    }

    /* JADX INFO: renamed from: g */
    public void m10934g(InterfaceC2293g interfaceC2293g, Uri uri) {
    }

    /* JADX INFO: renamed from: h */
    public void m10935h(InterfaceC2293g interfaceC2293g, JSONObject jSONObject) {
    }

    /* JADX INFO: renamed from: k */
    public void m10938k(InterfaceC2293g interfaceC2293g, boolean z2) {
    }

    /* JADX INFO: renamed from: m */
    public void m10940m(InterfaceC2293g interfaceC2293g, Intent intent) {
    }

    /* JADX INFO: renamed from: w */
    public void m10950w(InterfaceC2293g interfaceC2293g, boolean z2) {
    }

    /* JADX INFO: renamed from: z */
    public void m10953z(InterfaceC2293g interfaceC2293g, WebView webView) {
    }

    /* JADX INFO: renamed from: x */
    public void m10951x(InterfaceC2293g interfaceC2293g, Bundle bundle, boolean z2) {
    }

    /* JADX INFO: renamed from: o */
    public void m10942o(InterfaceC2293g interfaceC2293g, int i3, int i4, Intent intent) {
    }

    /* JADX INFO: renamed from: y */
    public void m10952y(InterfaceC2293g interfaceC2293g, int i3, String[] strArr, int[] iArr) {
    }
}
