package p128m0;

import android.webkit.MimeTypeMap;
import android.webkit.WebChromeClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p038M1.AbstractC0413g;
import p038M1.AbstractC0419m;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p094d2.AbstractC1821g;
import p098e2.AbstractC1868d;

/* JADX INFO: renamed from: m0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C2152F {

    /* JADX INFO: renamed from: a */
    private final WebChromeClient.FileChooserParams f9966a;

    /* JADX INFO: renamed from: b */
    private List f9967b;

    /* JADX INFO: renamed from: c */
    private boolean f9968c;

    /* JADX INFO: renamed from: d */
    private boolean f9969d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2152F(WebChromeClient.FileChooserParams fileChooserParams) {
        this(fileChooserParams, null, false, false, 14, null);
        AbstractC0606k.m2145e(fileChooserParams, "fileChooserParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final List m10630d(String str) {
        AbstractC0606k.m2142b(str);
        return AbstractC1868d.m9675C(str, new String[]{"[,;\\s]"}, false, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final boolean m10631e(String str) {
        AbstractC0606k.m2145e(str, "it");
        return AbstractC1868d.m9679l(str, "/", false, 2, null) || AbstractC1868d.m9672i(str, ".", false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final String m10632f(String str) {
        AbstractC0606k.m2145e(str, "it");
        if (!AbstractC1868d.m9672i(str, ".", false, 2, null)) {
            return str;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String strSubstring = str.substring(1);
        AbstractC0606k.m2144d(strSubstring, "substring(...)");
        return singleton.getMimeTypeFromExtension(strSubstring);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2152F)) {
            return false;
        }
        C2152F c2152f = (C2152F) obj;
        return AbstractC0606k.m2141a(this.f9966a, c2152f.f9966a) && AbstractC0606k.m2141a(this.f9967b, c2152f.f9967b) && this.f9968c == c2152f.f9968c && this.f9969d == c2152f.f9969d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10633g() {
        if (this.f9967b.contains("*/*")) {
            return true;
        }
        List list = this.f9967b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC1868d.m9679l((String) it.next(), "image/", false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10634h() {
        return m10633g() || m10635i();
    }

    public int hashCode() {
        return (((((this.f9966a.hashCode() * 31) + this.f9967b.hashCode()) * 31) + AbstractC2144B.m10626a(this.f9968c)) * 31) + AbstractC2144B.m10626a(this.f9969d);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10635i() {
        if (this.f9967b.contains("*/*")) {
            return true;
        }
        List list = this.f9967b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC1868d.m9679l((String) it.next(), "video/", false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10636j() {
        return this.f9969d;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m10637k() {
        return this.f9968c;
    }

    /* JADX INFO: renamed from: l */
    public final WebChromeClient.FileChooserParams m10638l() {
        return this.f9966a;
    }

    /* JADX INFO: renamed from: m */
    public final List m10639m() {
        return this.f9967b;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m10640n() {
        List<String> list = this.f9967b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (String str : list) {
            if (!AbstractC1868d.m9672i(str, "image/", false, 2, null) && !AbstractC1868d.m9672i(str, "video/", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m10641o(boolean z2) {
        this.f9969d = z2;
    }

    /* JADX INFO: renamed from: p */
    public final void m10642p(boolean z2) {
        this.f9968c = z2;
    }

    public String toString() {
        return "FileUploadOptions(fileChooserParams=" + this.f9966a + ", mimeTypes=" + this.f9967b + ", canUseCamera=" + this.f9968c + ", canSaveToPublicStorage=" + this.f9969d + ")";
    }

    public C2152F(WebChromeClient.FileChooserParams fileChooserParams, List list, boolean z2, boolean z3) {
        AbstractC0606k.m2145e(fileChooserParams, "fileChooserParams");
        AbstractC0606k.m2145e(list, "mimeTypes");
        this.f9966a = fileChooserParams;
        this.f9967b = list;
        this.f9968c = z2;
        this.f9969d = z3;
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        AbstractC0606k.m2142b(acceptTypes);
        List listT = AbstractC0419m.m1473t(AbstractC1821g.m9604t(AbstractC1821g.m9601q(AbstractC1821g.m9603s(AbstractC1821g.m9599o(AbstractC1821g.m9594j(AbstractC1821g.m9603s(AbstractC0413g.m1443k(acceptTypes), new InterfaceC0577l() { // from class: m0.C
            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: f */
            public final Object mo1406f(Object obj) {
                return C2152F.m10630d((String) obj);
            }
        })), new InterfaceC0577l() { // from class: m0.D
            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: f */
            public final Object mo1406f(Object obj) {
                return Boolean.valueOf(C2152F.m10631e((String) obj));
            }
        }), new InterfaceC0577l() { // from class: m0.E
            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: f */
            public final Object mo1406f(Object obj) {
                return C2152F.m10632f((String) obj);
            }
        }))));
        this.f9967b = listT;
        if (listT.isEmpty()) {
            this.f9967b.add("*/*");
        }
    }

    public /* synthetic */ C2152F(WebChromeClient.FileChooserParams fileChooserParams, List list, boolean z2, boolean z3, int i3, AbstractC0602g abstractC0602g) {
        this(fileChooserParams, (i3 & 2) != 0 ? new ArrayList() : list, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? false : z3);
    }
}
