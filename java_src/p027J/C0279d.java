package p027J;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: J.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0279d {

    /* JADX INFO: renamed from: a */
    private final f f1313a;

    /* JADX INFO: renamed from: J.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final c f1314a;

        public a(ClipData clipData, int i3) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f1314a = new b(clipData, i3);
            } else {
                this.f1314a = new d(clipData, i3);
            }
        }

        /* JADX INFO: renamed from: a */
        public C0279d m946a() {
            return this.f1314a.mo950a();
        }

        /* JADX INFO: renamed from: b */
        public a m947b(Bundle bundle) {
            this.f1314a.setExtras(bundle);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m948c(int i3) {
            this.f1314a.mo952c(i3);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m949d(Uri uri) {
            this.f1314a.mo951b(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: J.d$b */
    private static final class b implements c {

        /* JADX INFO: renamed from: a */
        private final ContentInfo.Builder f1315a;

        b(ClipData clipData, int i3) {
            this.f1315a = AbstractC0285g.m974a(clipData, i3);
        }

        @Override // p027J.C0279d.c
        /* JADX INFO: renamed from: a */
        public C0279d mo950a() {
            return new C0279d(new e(this.f1315a.build()));
        }

        @Override // p027J.C0279d.c
        /* JADX INFO: renamed from: b */
        public void mo951b(Uri uri) {
            this.f1315a.setLinkUri(uri);
        }

        @Override // p027J.C0279d.c
        /* JADX INFO: renamed from: c */
        public void mo952c(int i3) {
            this.f1315a.setFlags(i3);
        }

        @Override // p027J.C0279d.c
        public void setExtras(Bundle bundle) {
            this.f1315a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: J.d$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        C0279d mo950a();

        /* JADX INFO: renamed from: b */
        void mo951b(Uri uri);

        /* JADX INFO: renamed from: c */
        void mo952c(int i3);

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: J.d$d */
    private static final class d implements c {

        /* JADX INFO: renamed from: a */
        ClipData f1316a;

        /* JADX INFO: renamed from: b */
        int f1317b;

        /* JADX INFO: renamed from: c */
        int f1318c;

        /* JADX INFO: renamed from: d */
        Uri f1319d;

        /* JADX INFO: renamed from: e */
        Bundle f1320e;

        d(ClipData clipData, int i3) {
            this.f1316a = clipData;
            this.f1317b = i3;
        }

        @Override // p027J.C0279d.c
        /* JADX INFO: renamed from: a */
        public C0279d mo950a() {
            return new C0279d(new g(this));
        }

        @Override // p027J.C0279d.c
        /* JADX INFO: renamed from: b */
        public void mo951b(Uri uri) {
            this.f1319d = uri;
        }

        @Override // p027J.C0279d.c
        /* JADX INFO: renamed from: c */
        public void mo952c(int i3) {
            this.f1318c = i3;
        }

        @Override // p027J.C0279d.c
        public void setExtras(Bundle bundle) {
            this.f1320e = bundle;
        }
    }

    /* JADX INFO: renamed from: J.d$e */
    private static final class e implements f {

        /* JADX INFO: renamed from: a */
        private final ContentInfo f1321a;

        e(ContentInfo contentInfo) {
            this.f1321a = AbstractC0277c.m924a(AbstractC0211h.m610g(contentInfo));
        }

        @Override // p027J.C0279d.f
        /* JADX INFO: renamed from: a */
        public ClipData mo953a() {
            return this.f1321a.getClip();
        }

        @Override // p027J.C0279d.f
        /* JADX INFO: renamed from: b */
        public int mo954b() {
            return this.f1321a.getFlags();
        }

        @Override // p027J.C0279d.f
        /* JADX INFO: renamed from: c */
        public ContentInfo mo955c() {
            return this.f1321a;
        }

        @Override // p027J.C0279d.f
        /* JADX INFO: renamed from: d */
        public int mo956d() {
            return this.f1321a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f1321a + "}";
        }
    }

    /* JADX INFO: renamed from: J.d$f */
    private interface f {
        /* JADX INFO: renamed from: a */
        ClipData mo953a();

        /* JADX INFO: renamed from: b */
        int mo954b();

        /* JADX INFO: renamed from: c */
        ContentInfo mo955c();

        /* JADX INFO: renamed from: d */
        int mo956d();
    }

    /* JADX INFO: renamed from: J.d$g */
    private static final class g implements f {

        /* JADX INFO: renamed from: a */
        private final ClipData f1322a;

        /* JADX INFO: renamed from: b */
        private final int f1323b;

        /* JADX INFO: renamed from: c */
        private final int f1324c;

        /* JADX INFO: renamed from: d */
        private final Uri f1325d;

        /* JADX INFO: renamed from: e */
        private final Bundle f1326e;

        g(d dVar) {
            this.f1322a = (ClipData) AbstractC0211h.m610g(dVar.f1316a);
            this.f1323b = AbstractC0211h.m606c(dVar.f1317b, 0, 5, "source");
            this.f1324c = AbstractC0211h.m609f(dVar.f1318c, 1);
            this.f1325d = dVar.f1319d;
            this.f1326e = dVar.f1320e;
        }

        @Override // p027J.C0279d.f
        /* JADX INFO: renamed from: a */
        public ClipData mo953a() {
            return this.f1322a;
        }

        @Override // p027J.C0279d.f
        /* JADX INFO: renamed from: b */
        public int mo954b() {
            return this.f1324c;
        }

        @Override // p027J.C0279d.f
        /* JADX INFO: renamed from: c */
        public ContentInfo mo955c() {
            return null;
        }

        @Override // p027J.C0279d.f
        /* JADX INFO: renamed from: d */
        public int mo956d() {
            return this.f1323b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f1322a.getDescription());
            sb.append(", source=");
            sb.append(C0279d.m940e(this.f1323b));
            sb.append(", flags=");
            sb.append(C0279d.m939a(this.f1324c));
            if (this.f1325d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f1325d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f1326e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    C0279d(f fVar) {
        this.f1313a = fVar;
    }

    /* JADX INFO: renamed from: a */
    static String m939a(int i3) {
        return (i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3);
    }

    /* JADX INFO: renamed from: e */
    static String m940e(int i3) {
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? String.valueOf(i3) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* JADX INFO: renamed from: g */
    public static C0279d m941g(ContentInfo contentInfo) {
        return new C0279d(new e(contentInfo));
    }

    /* JADX INFO: renamed from: b */
    public ClipData m942b() {
        return this.f1313a.mo953a();
    }

    /* JADX INFO: renamed from: c */
    public int m943c() {
        return this.f1313a.mo954b();
    }

    /* JADX INFO: renamed from: d */
    public int m944d() {
        return this.f1313a.mo956d();
    }

    /* JADX INFO: renamed from: f */
    public ContentInfo m945f() {
        ContentInfo contentInfoMo955c = this.f1313a.mo955c();
        Objects.requireNonNull(contentInfoMo955c);
        return AbstractC0277c.m924a(contentInfoMo955c);
    }

    public String toString() {
        return this.f1313a.toString();
    }
}
