package p161x;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import p158w.AbstractC2484b;

/* JADX INFO: renamed from: x.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2513l {

    /* JADX INFO: renamed from: x.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        final Bundle f11699a;

        /* JADX INFO: renamed from: b */
        private IconCompat f11700b;

        /* JADX INFO: renamed from: c */
        private final AbstractC2520s[] f11701c;

        /* JADX INFO: renamed from: d */
        private final AbstractC2520s[] f11702d;

        /* JADX INFO: renamed from: e */
        private boolean f11703e;

        /* JADX INFO: renamed from: f */
        boolean f11704f;

        /* JADX INFO: renamed from: g */
        private final int f11705g;

        /* JADX INFO: renamed from: h */
        private final boolean f11706h;

        /* JADX INFO: renamed from: i */
        public int f11707i;

        /* JADX INFO: renamed from: j */
        public CharSequence f11708j;

        /* JADX INFO: renamed from: k */
        public PendingIntent f11709k;

        /* JADX INFO: renamed from: l */
        private boolean f11710l;

        public a(int i3, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i3 != 0 ? IconCompat.m4235c(null, "", i3) : null, charSequence, pendingIntent);
        }

        /* JADX INFO: renamed from: a */
        public PendingIntent m11935a() {
            return this.f11709k;
        }

        /* JADX INFO: renamed from: b */
        public boolean m11936b() {
            return this.f11703e;
        }

        /* JADX INFO: renamed from: c */
        public Bundle m11937c() {
            return this.f11699a;
        }

        /* JADX INFO: renamed from: d */
        public IconCompat m11938d() {
            int i3;
            if (this.f11700b == null && (i3 = this.f11707i) != 0) {
                this.f11700b = IconCompat.m4235c(null, "", i3);
            }
            return this.f11700b;
        }

        /* JADX INFO: renamed from: e */
        public AbstractC2520s[] m11939e() {
            return this.f11701c;
        }

        /* JADX INFO: renamed from: f */
        public int m11940f() {
            return this.f11705g;
        }

        /* JADX INFO: renamed from: g */
        public boolean m11941g() {
            return this.f11704f;
        }

        /* JADX INFO: renamed from: h */
        public CharSequence m11942h() {
            return this.f11708j;
        }

        /* JADX INFO: renamed from: i */
        public boolean m11943i() {
            return this.f11710l;
        }

        /* JADX INFO: renamed from: j */
        public boolean m11944j() {
            return this.f11706h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, AbstractC2520s[] abstractC2520sArr, AbstractC2520s[] abstractC2520sArr2, boolean z2, int i3, boolean z3, boolean z4, boolean z5) {
            this.f11704f = true;
            this.f11700b = iconCompat;
            if (iconCompat != null && iconCompat.m4240g() == 2) {
                this.f11707i = iconCompat.m4238e();
            }
            this.f11708j = e.m11959d(charSequence);
            this.f11709k = pendingIntent;
            this.f11699a = bundle == null ? new Bundle() : bundle;
            this.f11701c = abstractC2520sArr;
            this.f11702d = abstractC2520sArr2;
            this.f11703e = z2;
            this.f11705g = i3;
            this.f11704f = z3;
            this.f11706h = z4;
            this.f11710l = z5;
        }
    }

    /* JADX INFO: renamed from: x.l$b */
    public static class b extends f {

        /* JADX INFO: renamed from: e */
        private IconCompat f11711e;

        /* JADX INFO: renamed from: f */
        private IconCompat f11712f;

        /* JADX INFO: renamed from: g */
        private boolean f11713g;

        /* JADX INFO: renamed from: h */
        private CharSequence f11714h;

        /* JADX INFO: renamed from: i */
        private boolean f11715i;

        /* JADX INFO: renamed from: x.l$b$a */
        private static class a {
            /* JADX INFO: renamed from: a */
            static void m11951a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: x.l$b$b, reason: collision with other inner class name */
        private static class C2634b {
            /* JADX INFO: renamed from: a */
            static void m11952a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* JADX INFO: renamed from: b */
            static void m11953b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* JADX INFO: renamed from: c */
            static void m11954c(Notification.BigPictureStyle bigPictureStyle, boolean z2) {
                bigPictureStyle.showBigPictureWhenCollapsed(z2);
            }
        }

        @Override // p161x.AbstractC2513l.f
        /* JADX INFO: renamed from: b */
        public void mo11945b(InterfaceC2512k interfaceC2512k) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(interfaceC2512k.mo11932a()).setBigContentTitle(this.f11766b);
            IconCompat iconCompat = this.f11711e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C2634b.m11952a(bigContentTitle, this.f11711e.m4246m(interfaceC2512k instanceof C2514m ? ((C2514m) interfaceC2512k).m11999f() : null));
                } else if (iconCompat.m4240g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f11711e.m4237d());
                }
            }
            if (this.f11713g) {
                if (this.f11712f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.m11951a(bigContentTitle, this.f11712f.m4246m(interfaceC2512k instanceof C2514m ? ((C2514m) interfaceC2512k).m11999f() : null));
                }
            }
            if (this.f11768d) {
                bigContentTitle.setSummaryText(this.f11767c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C2634b.m11954c(bigContentTitle, this.f11715i);
                C2634b.m11953b(bigContentTitle, this.f11714h);
            }
        }

        @Override // p161x.AbstractC2513l.f
        /* JADX INFO: renamed from: c */
        protected String mo11946c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* JADX INFO: renamed from: h */
        public b m11947h(Bitmap bitmap) {
            this.f11712f = bitmap == null ? null : IconCompat.m4234b(bitmap);
            this.f11713g = true;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public b m11948i(Bitmap bitmap) {
            this.f11711e = bitmap == null ? null : IconCompat.m4234b(bitmap);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m11949j(CharSequence charSequence) {
            this.f11766b = e.m11959d(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public b m11950k(CharSequence charSequence) {
            this.f11767c = e.m11959d(charSequence);
            this.f11768d = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: x.l$c */
    public static class c extends f {

        /* JADX INFO: renamed from: e */
        private CharSequence f11716e;

        @Override // p161x.AbstractC2513l.f
        /* JADX INFO: renamed from: a */
        public void mo11955a(Bundle bundle) {
            super.mo11955a(bundle);
        }

        @Override // p161x.AbstractC2513l.f
        /* JADX INFO: renamed from: b */
        public void mo11945b(InterfaceC2512k interfaceC2512k) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC2512k.mo11932a()).setBigContentTitle(this.f11766b).bigText(this.f11716e);
            if (this.f11768d) {
                bigTextStyleBigText.setSummaryText(this.f11767c);
            }
        }

        @Override // p161x.AbstractC2513l.f
        /* JADX INFO: renamed from: c */
        protected String mo11946c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* JADX INFO: renamed from: h */
        public c m11956h(CharSequence charSequence) {
            this.f11716e = e.m11959d(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public c m11957i(CharSequence charSequence) {
            this.f11766b = e.m11959d(charSequence);
            return this;
        }
    }

    /* JADX INFO: renamed from: x.l$d */
    public static final class d {
        /* JADX INFO: renamed from: a */
        public static Notification.BubbleMetadata m11958a(d dVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: x.l$f */
    public static abstract class f {

        /* JADX INFO: renamed from: a */
        protected e f11765a;

        /* JADX INFO: renamed from: b */
        CharSequence f11766b;

        /* JADX INFO: renamed from: c */
        CharSequence f11767c;

        /* JADX INFO: renamed from: d */
        boolean f11768d = false;

        /* JADX INFO: renamed from: a */
        public void mo11955a(Bundle bundle) {
            if (this.f11768d) {
                bundle.putCharSequence("android.summaryText", this.f11767c);
            }
            CharSequence charSequence = this.f11766b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strMo11946c = mo11946c();
            if (strMo11946c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo11946c);
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo11945b(InterfaceC2512k interfaceC2512k);

        /* JADX INFO: renamed from: c */
        protected abstract String mo11946c();

        /* JADX INFO: renamed from: d */
        public RemoteViews m11989d(InterfaceC2512k interfaceC2512k) {
            return null;
        }

        /* JADX INFO: renamed from: e */
        public RemoteViews m11990e(InterfaceC2512k interfaceC2512k) {
            return null;
        }

        /* JADX INFO: renamed from: f */
        public RemoteViews m11991f(InterfaceC2512k interfaceC2512k) {
            return null;
        }

        /* JADX INFO: renamed from: g */
        public void m11992g(e eVar) {
            if (this.f11765a != eVar) {
                this.f11765a = eVar;
                if (eVar != null) {
                    eVar.m11980v(this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m11933a(Notification notification) {
        return notification.extras;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m11934b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC2484b.f11509b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC2484b.f11508a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    /* JADX INFO: renamed from: x.l$e */
    public static class e {

        /* JADX INFO: renamed from: A */
        boolean f11717A;

        /* JADX INFO: renamed from: B */
        boolean f11718B;

        /* JADX INFO: renamed from: C */
        boolean f11719C;

        /* JADX INFO: renamed from: D */
        String f11720D;

        /* JADX INFO: renamed from: E */
        Bundle f11721E;

        /* JADX INFO: renamed from: F */
        int f11722F;

        /* JADX INFO: renamed from: G */
        int f11723G;

        /* JADX INFO: renamed from: H */
        Notification f11724H;

        /* JADX INFO: renamed from: I */
        RemoteViews f11725I;

        /* JADX INFO: renamed from: J */
        RemoteViews f11726J;

        /* JADX INFO: renamed from: K */
        RemoteViews f11727K;

        /* JADX INFO: renamed from: L */
        String f11728L;

        /* JADX INFO: renamed from: M */
        int f11729M;

        /* JADX INFO: renamed from: N */
        String f11730N;

        /* JADX INFO: renamed from: O */
        long f11731O;

        /* JADX INFO: renamed from: P */
        int f11732P;

        /* JADX INFO: renamed from: Q */
        int f11733Q;

        /* JADX INFO: renamed from: R */
        boolean f11734R;

        /* JADX INFO: renamed from: S */
        Notification f11735S;

        /* JADX INFO: renamed from: T */
        boolean f11736T;

        /* JADX INFO: renamed from: U */
        Object f11737U;

        /* JADX INFO: renamed from: V */
        public ArrayList f11738V;

        /* JADX INFO: renamed from: a */
        public Context f11739a;

        /* JADX INFO: renamed from: b */
        public ArrayList f11740b;

        /* JADX INFO: renamed from: c */
        public ArrayList f11741c;

        /* JADX INFO: renamed from: d */
        ArrayList f11742d;

        /* JADX INFO: renamed from: e */
        CharSequence f11743e;

        /* JADX INFO: renamed from: f */
        CharSequence f11744f;

        /* JADX INFO: renamed from: g */
        String f11745g;

        /* JADX INFO: renamed from: h */
        PendingIntent f11746h;

        /* JADX INFO: renamed from: i */
        PendingIntent f11747i;

        /* JADX INFO: renamed from: j */
        RemoteViews f11748j;

        /* JADX INFO: renamed from: k */
        IconCompat f11749k;

        /* JADX INFO: renamed from: l */
        CharSequence f11750l;

        /* JADX INFO: renamed from: m */
        int f11751m;

        /* JADX INFO: renamed from: n */
        int f11752n;

        /* JADX INFO: renamed from: o */
        boolean f11753o;

        /* JADX INFO: renamed from: p */
        boolean f11754p;

        /* JADX INFO: renamed from: q */
        f f11755q;

        /* JADX INFO: renamed from: r */
        CharSequence f11756r;

        /* JADX INFO: renamed from: s */
        CharSequence f11757s;

        /* JADX INFO: renamed from: t */
        CharSequence[] f11758t;

        /* JADX INFO: renamed from: u */
        int f11759u;

        /* JADX INFO: renamed from: v */
        int f11760v;

        /* JADX INFO: renamed from: w */
        boolean f11761w;

        /* JADX INFO: renamed from: x */
        String f11762x;

        /* JADX INFO: renamed from: y */
        boolean f11763y;

        /* JADX INFO: renamed from: z */
        String f11764z;

        /* JADX INFO: renamed from: x.l$e$a */
        static class a {
            /* JADX INFO: renamed from: a */
            static AudioAttributes m11985a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            /* JADX INFO: renamed from: b */
            static AudioAttributes.Builder m11986b() {
                return new AudioAttributes.Builder();
            }

            /* JADX INFO: renamed from: c */
            static AudioAttributes.Builder m11987c(AudioAttributes.Builder builder, int i3) {
                return builder.setContentType(i3);
            }

            /* JADX INFO: renamed from: d */
            static AudioAttributes.Builder m11988d(AudioAttributes.Builder builder, int i3) {
                return builder.setUsage(i3);
            }
        }

        public e(Context context, String str) {
            this.f11740b = new ArrayList();
            this.f11741c = new ArrayList();
            this.f11742d = new ArrayList();
            this.f11753o = true;
            this.f11717A = false;
            this.f11722F = 0;
            this.f11723G = 0;
            this.f11729M = 0;
            this.f11732P = 0;
            this.f11733Q = 0;
            Notification notification = new Notification();
            this.f11735S = notification;
            this.f11739a = context;
            this.f11728L = str;
            notification.when = System.currentTimeMillis();
            this.f11735S.audioStreamType = -1;
            this.f11752n = 0;
            this.f11738V = new ArrayList();
            this.f11734R = true;
        }

        /* JADX INFO: renamed from: d */
        protected static CharSequence m11959d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* JADX INFO: renamed from: m */
        private void m11960m(int i3, boolean z2) {
            if (z2) {
                Notification notification = this.f11735S;
                notification.flags = i3 | notification.flags;
            } else {
                Notification notification2 = this.f11735S;
                notification2.flags = (~i3) & notification2.flags;
            }
        }

        /* JADX INFO: renamed from: a */
        public e m11961a(int i3, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f11740b.add(new a(i3, charSequence, pendingIntent));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public Notification m11962b() {
            return new C2514m(this).m11997c();
        }

        /* JADX INFO: renamed from: c */
        public Bundle m11963c() {
            if (this.f11721E == null) {
                this.f11721E = new Bundle();
            }
            return this.f11721E;
        }

        /* JADX INFO: renamed from: e */
        public e m11964e(boolean z2) {
            m11960m(16, z2);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public e m11965f(String str) {
            this.f11728L = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public e m11966g(int i3) {
            this.f11722F = i3;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public e m11967h(PendingIntent pendingIntent) {
            this.f11746h = pendingIntent;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public e m11968i(CharSequence charSequence) {
            this.f11744f = m11959d(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public e m11969j(CharSequence charSequence) {
            this.f11743e = m11959d(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public e m11970k(int i3) {
            Notification notification = this.f11735S;
            notification.defaults = i3;
            if ((i3 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* JADX INFO: renamed from: l */
        public e m11971l(PendingIntent pendingIntent) {
            this.f11735S.deleteIntent = pendingIntent;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public e m11972n(Bitmap bitmap) {
            this.f11749k = bitmap == null ? null : IconCompat.m4234b(AbstractC2513l.m11934b(this.f11739a, bitmap));
            return this;
        }

        /* JADX INFO: renamed from: o */
        public e m11973o(int i3, int i4, int i5) {
            Notification notification = this.f11735S;
            notification.ledARGB = i3;
            notification.ledOnMS = i4;
            notification.ledOffMS = i5;
            notification.flags = ((i4 == 0 || i5 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        /* JADX INFO: renamed from: p */
        public e m11974p(boolean z2) {
            this.f11717A = z2;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public e m11975q(int i3) {
            this.f11751m = i3;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public e m11976r(int i3) {
            this.f11752n = i3;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public e m11977s(boolean z2) {
            this.f11753o = z2;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public e m11978t(int i3) {
            this.f11735S.icon = i3;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public e m11979u(Uri uri) {
            Notification notification = this.f11735S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderM11988d = a.m11988d(a.m11987c(a.m11986b(), 4), 5);
            this.f11735S.audioAttributes = a.m11985a(builderM11988d);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public e m11980v(f fVar) {
            if (this.f11755q != fVar) {
                this.f11755q = fVar;
                if (fVar != null) {
                    fVar.m11992g(this);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: w */
        public e m11981w(CharSequence charSequence) {
            this.f11735S.tickerText = m11959d(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public e m11982x(long[] jArr) {
            this.f11735S.vibrate = jArr;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public e m11983y(int i3) {
            this.f11723G = i3;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public e m11984z(long j3) {
            this.f11735S.when = j3;
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
