package p015F;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p024I.AbstractC0211h;
import p167z.AbstractC2589v;

/* JADX INFO: renamed from: F.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0138j {

    /* JADX INFO: renamed from: F.j$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final Uri f292a;

        /* JADX INFO: renamed from: b */
        private final int f293b;

        /* JADX INFO: renamed from: c */
        private final int f294c;

        /* JADX INFO: renamed from: d */
        private final boolean f295d;

        /* JADX INFO: renamed from: e */
        private final String f296e;

        /* JADX INFO: renamed from: f */
        private final int f297f;

        public b(Uri uri, int i3, int i4, boolean z2, int i5) {
            this(uri, i3, i4, z2, null, i5);
        }

        /* JADX INFO: renamed from: a */
        static b m409a(Uri uri, int i3, int i4, boolean z2, int i5) {
            return new b(uri, i3, i4, z2, i5);
        }

        /* JADX INFO: renamed from: b */
        public int m410b() {
            return this.f297f;
        }

        /* JADX INFO: renamed from: c */
        public String m411c() {
            if (m417i()) {
                return this.f292a.getAuthority();
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public int m412d() {
            return this.f293b;
        }

        /* JADX INFO: renamed from: e */
        public Uri m413e() {
            return this.f292a;
        }

        /* JADX INFO: renamed from: f */
        public String m414f() {
            return this.f296e;
        }

        /* JADX INFO: renamed from: g */
        public int m415g() {
            return this.f294c;
        }

        /* JADX INFO: renamed from: h */
        public boolean m416h() {
            return this.f295d;
        }

        /* JADX INFO: renamed from: i */
        public boolean m417i() {
            return Objects.equals(this.f292a.getScheme(), "systemfont");
        }

        public b(Uri uri, int i3, int i4, boolean z2, String str, int i5) {
            this.f292a = (Uri) AbstractC0211h.m610g(uri);
            this.f293b = i3;
            this.f294c = i4;
            this.f295d = z2;
            this.f296e = str;
            this.f297f = i5;
        }

        public b(String str, String str2) {
            this.f292a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.f293b = 0;
            this.f294c = 400;
            this.f295d = false;
            this.f296e = str2;
            this.f297f = 0;
        }
    }

    /* JADX INFO: renamed from: F.j$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public abstract void mo418a(int i3);

        /* JADX INFO: renamed from: b */
        public abstract void mo419b(Typeface typeface);
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m400a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return AbstractC2589v.m12313b(context, cancellationSignal, bVarArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public static a m401b(Context context, CancellationSignal cancellationSignal, C0134f c0134f) {
        return AbstractC0133e.m375e(context, AbstractC0136h.m389a(new Object[]{c0134f}), cancellationSignal);
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m402c(Context context, List list, int i3, boolean z2, int i4, Handler handler, c cVar) {
        C0129a c0129a = new C0129a(cVar, AbstractC0139k.m421b(handler));
        if (!z2) {
            return AbstractC0137i.m393d(context, list, i3, null, c0129a);
        }
        if (list.size() <= 1) {
            return AbstractC0137i.m394e(context, (C0134f) list.get(0), c0129a, i3, i4);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    /* JADX INFO: renamed from: F.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final int f290a;

        /* JADX INFO: renamed from: b */
        private final List f291b;

        public a(int i3, b[] bVarArr) {
            this.f290a = i3;
            this.f291b = Collections.singletonList(bVarArr);
        }

        /* JADX INFO: renamed from: a */
        static a m403a(int i3, List list) {
            return new a(i3, list);
        }

        /* JADX INFO: renamed from: b */
        static a m404b(int i3, b[] bVarArr) {
            return new a(i3, bVarArr);
        }

        /* JADX INFO: renamed from: c */
        public b[] m405c() {
            return (b[]) this.f291b.get(0);
        }

        /* JADX INFO: renamed from: d */
        public List m406d() {
            return this.f291b;
        }

        /* JADX INFO: renamed from: e */
        public int m407e() {
            return this.f290a;
        }

        /* JADX INFO: renamed from: f */
        boolean m408f() {
            return this.f291b.size() > 1;
        }

        a(int i3, List list) {
            this.f290a = i3;
            this.f291b = list;
        }
    }
}
