package p033L;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: L.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0365f {

    /* JADX INFO: renamed from: a */
    private final c f1482a;

    /* JADX INFO: renamed from: L.f$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        Object mo1351a();

        /* JADX INFO: renamed from: b */
        Uri mo1352b();

        /* JADX INFO: renamed from: c */
        void mo1353c();

        /* JADX INFO: renamed from: d */
        Uri mo1354d();

        ClipDescription getDescription();
    }

    public C0365f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f1482a = new a(uri, clipDescription, uri2);
        } else {
            this.f1482a = new b(uri, clipDescription, uri2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static C0365f m1345f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C0365f(new a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Uri m1346a() {
        return this.f1482a.mo1352b();
    }

    /* JADX INFO: renamed from: b */
    public ClipDescription m1347b() {
        return this.f1482a.getDescription();
    }

    /* JADX INFO: renamed from: c */
    public Uri m1348c() {
        return this.f1482a.mo1354d();
    }

    /* JADX INFO: renamed from: d */
    public void m1349d() {
        this.f1482a.mo1353c();
    }

    /* JADX INFO: renamed from: e */
    public Object m1350e() {
        return this.f1482a.mo1351a();
    }

    /* JADX INFO: renamed from: L.f$a */
    private static final class a implements c {

        /* JADX INFO: renamed from: a */
        final InputContentInfo f1483a;

        a(Object obj) {
            this.f1483a = (InputContentInfo) obj;
        }

        @Override // p033L.C0365f.c
        /* JADX INFO: renamed from: a */
        public Object mo1351a() {
            return this.f1483a;
        }

        @Override // p033L.C0365f.c
        /* JADX INFO: renamed from: b */
        public Uri mo1352b() {
            return this.f1483a.getContentUri();
        }

        @Override // p033L.C0365f.c
        /* JADX INFO: renamed from: c */
        public void mo1353c() {
            this.f1483a.requestPermission();
        }

        @Override // p033L.C0365f.c
        /* JADX INFO: renamed from: d */
        public Uri mo1354d() {
            return this.f1483a.getLinkUri();
        }

        @Override // p033L.C0365f.c
        public ClipDescription getDescription() {
            return this.f1483a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f1483a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C0365f(c cVar) {
        this.f1482a = cVar;
    }

    /* JADX INFO: renamed from: L.f$b */
    private static final class b implements c {

        /* JADX INFO: renamed from: a */
        private final Uri f1484a;

        /* JADX INFO: renamed from: b */
        private final ClipDescription f1485b;

        /* JADX INFO: renamed from: c */
        private final Uri f1486c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f1484a = uri;
            this.f1485b = clipDescription;
            this.f1486c = uri2;
        }

        @Override // p033L.C0365f.c
        /* JADX INFO: renamed from: a */
        public Object mo1351a() {
            return null;
        }

        @Override // p033L.C0365f.c
        /* JADX INFO: renamed from: b */
        public Uri mo1352b() {
            return this.f1484a;
        }

        @Override // p033L.C0365f.c
        /* JADX INFO: renamed from: d */
        public Uri mo1354d() {
            return this.f1486c;
        }

        @Override // p033L.C0365f.c
        public ClipDescription getDescription() {
            return this.f1485b;
        }

        @Override // p033L.C0365f.c
        /* JADX INFO: renamed from: c */
        public void mo1353c() {
        }
    }
}
