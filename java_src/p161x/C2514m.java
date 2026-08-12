package p161x;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.appcompat.app.AbstractC0740E;
import androidx.collection.C0922b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p161x.AbstractC2513l;

/* JADX INFO: renamed from: x.m */
/* JADX INFO: loaded from: classes.dex */
class C2514m implements InterfaceC2512k {

    /* JADX INFO: renamed from: a */
    private final Context f11769a;

    /* JADX INFO: renamed from: b */
    private final Notification.Builder f11770b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2513l.e f11771c;

    /* JADX INFO: renamed from: d */
    private RemoteViews f11772d;

    /* JADX INFO: renamed from: e */
    private RemoteViews f11773e;

    /* JADX INFO: renamed from: f */
    private final List f11774f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final Bundle f11775g = new Bundle();

    /* JADX INFO: renamed from: h */
    private int f11776h;

    /* JADX INFO: renamed from: i */
    private RemoteViews f11777i;

    /* JADX INFO: renamed from: x.m$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static Notification.Builder m12000a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Action.Builder m12001b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Action.Builder m12002c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        /* JADX INFO: renamed from: d */
        static Notification.Action m12003d(Notification.Action.Builder builder) {
            return builder.build();
        }

        /* JADX INFO: renamed from: e */
        static String m12004e(Notification notification) {
            return notification.getGroup();
        }

        /* JADX INFO: renamed from: f */
        static Notification.Builder m12005f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        /* JADX INFO: renamed from: g */
        static Notification.Builder m12006g(Notification.Builder builder, boolean z2) {
            return builder.setGroupSummary(z2);
        }

        /* JADX INFO: renamed from: h */
        static Notification.Builder m12007h(Notification.Builder builder, boolean z2) {
            return builder.setLocalOnly(z2);
        }

        /* JADX INFO: renamed from: i */
        static Notification.Builder m12008i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: renamed from: x.m$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static Notification.Builder m12009a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m12010b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Builder m12011c(Notification.Builder builder, int i3) {
            return builder.setColor(i3);
        }

        /* JADX INFO: renamed from: d */
        static Notification.Builder m12012d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        /* JADX INFO: renamed from: e */
        static Notification.Builder m12013e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        /* JADX INFO: renamed from: f */
        static Notification.Builder m12014f(Notification.Builder builder, int i3) {
            return builder.setVisibility(i3);
        }
    }

    /* JADX INFO: renamed from: x.m$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static Notification.Action.Builder m12015a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m12016b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Builder m12017c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: renamed from: x.m$d */
    static class d {
        /* JADX INFO: renamed from: a */
        static Notification.Action.Builder m12018a(Notification.Action.Builder builder, boolean z2) {
            return builder.setAllowGeneratedReplies(z2);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m12019b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Builder m12020c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        /* JADX INFO: renamed from: d */
        static Notification.Builder m12021d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        /* JADX INFO: renamed from: e */
        static Notification.Builder m12022e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: renamed from: x.m$e */
    static class e {
        /* JADX INFO: renamed from: a */
        static Notification.Builder m12023a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m12024b(Notification.Builder builder, int i3) {
            return builder.setBadgeIconType(i3);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Builder m12025c(Notification.Builder builder, boolean z2) {
            return builder.setColorized(z2);
        }

        /* JADX INFO: renamed from: d */
        static Notification.Builder m12026d(Notification.Builder builder, int i3) {
            return builder.setGroupAlertBehavior(i3);
        }

        /* JADX INFO: renamed from: e */
        static Notification.Builder m12027e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        /* JADX INFO: renamed from: f */
        static Notification.Builder m12028f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        /* JADX INFO: renamed from: g */
        static Notification.Builder m12029g(Notification.Builder builder, long j3) {
            return builder.setTimeoutAfter(j3);
        }
    }

    /* JADX INFO: renamed from: x.m$f */
    static class f {
        /* JADX INFO: renamed from: a */
        static Notification.Action.Builder m12030a(Notification.Action.Builder builder, int i3) {
            return builder.setSemanticAction(i3);
        }
    }

    /* JADX INFO: renamed from: x.m$g */
    static class g {
        /* JADX INFO: renamed from: a */
        static Notification.Builder m12031a(Notification.Builder builder, boolean z2) {
            return builder.setAllowSystemGeneratedContextualActions(z2);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m12032b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Action.Builder m12033c(Notification.Action.Builder builder, boolean z2) {
            return builder.setContextual(z2);
        }
    }

    /* JADX INFO: renamed from: x.m$h */
    static class h {
        /* JADX INFO: renamed from: a */
        static Notification.Action.Builder m12034a(Notification.Action.Builder builder, boolean z2) {
            return builder.setAuthenticationRequired(z2);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m12035b(Notification.Builder builder, int i3) {
            return builder.setForegroundServiceBehavior(i3);
        }
    }

    /* JADX INFO: renamed from: x.m$i */
    static final class i {
        /* JADX INFO: renamed from: a */
        static Notification.Builder m12036a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    C2514m(AbstractC2513l.e eVar) {
        int i3;
        this.f11771c = eVar;
        Context context = eVar.f11739a;
        this.f11769a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11770b = e.m12023a(context, eVar.f11728L);
        } else {
            this.f11770b = new Notification.Builder(eVar.f11739a);
        }
        Notification notification = eVar.f11735S;
        this.f11770b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f11748j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f11743e).setContentText(eVar.f11744f).setContentInfo(eVar.f11750l).setContentIntent(eVar.f11746h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f11747i, (notification.flags & 128) != 0).setNumber(eVar.f11751m).setProgress(eVar.f11759u, eVar.f11760v, eVar.f11761w);
        Notification.Builder builder = this.f11770b;
        IconCompat iconCompat = eVar.f11749k;
        c.m12016b(builder, iconCompat == null ? null : iconCompat.m4246m(context));
        this.f11770b.setSubText(eVar.f11756r).setUsesChronometer(eVar.f11754p).setPriority(eVar.f11752n);
        ArrayList arrayList = eVar.f11740b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            m11993b((AbstractC2513l.a) obj);
        }
        Bundle bundle = eVar.f11721E;
        if (bundle != null) {
            this.f11775g.putAll(bundle);
        }
        int i5 = Build.VERSION.SDK_INT;
        this.f11772d = eVar.f11725I;
        this.f11773e = eVar.f11726J;
        this.f11770b.setShowWhen(eVar.f11753o);
        a.m12007h(this.f11770b, eVar.f11717A);
        a.m12005f(this.f11770b, eVar.f11762x);
        a.m12008i(this.f11770b, eVar.f11764z);
        a.m12006g(this.f11770b, eVar.f11763y);
        this.f11776h = eVar.f11732P;
        b.m12010b(this.f11770b, eVar.f11720D);
        b.m12011c(this.f11770b, eVar.f11722F);
        b.m12014f(this.f11770b, eVar.f11723G);
        b.m12012d(this.f11770b, eVar.f11724H);
        b.m12013e(this.f11770b, notification.sound, notification.audioAttributes);
        List listM11994e = i5 < 28 ? m11994e(m11995g(eVar.f11741c), eVar.f11738V) : eVar.f11738V;
        if (listM11994e != null && !listM11994e.isEmpty()) {
            Iterator it = listM11994e.iterator();
            while (it.hasNext()) {
                b.m12009a(this.f11770b, (String) it.next());
            }
        }
        this.f11777i = eVar.f11727K;
        if (eVar.f11742d.size() > 0) {
            Bundle bundle2 = eVar.m11963c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i6 = 0; i6 < eVar.f11742d.size(); i6++) {
                bundle4.putBundle(Integer.toString(i6), AbstractC2515n.m12037a((AbstractC2513l.a) eVar.f11742d.get(i6)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.m11963c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f11775g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj2 = eVar.f11737U;
        if (obj2 != null) {
            c.m12017c(this.f11770b, obj2);
        }
        if (i7 >= 24) {
            this.f11770b.setExtras(eVar.f11721E);
            d.m12022e(this.f11770b, eVar.f11758t);
            RemoteViews remoteViews = eVar.f11725I;
            if (remoteViews != null) {
                d.m12020c(this.f11770b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f11726J;
            if (remoteViews2 != null) {
                d.m12019b(this.f11770b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f11727K;
            if (remoteViews3 != null) {
                d.m12021d(this.f11770b, remoteViews3);
            }
        }
        if (i7 >= 26) {
            e.m12024b(this.f11770b, eVar.f11729M);
            e.m12027e(this.f11770b, eVar.f11757s);
            e.m12028f(this.f11770b, eVar.f11730N);
            e.m12029g(this.f11770b, eVar.f11731O);
            e.m12026d(this.f11770b, eVar.f11732P);
            if (eVar.f11719C) {
                e.m12025c(this.f11770b, eVar.f11718B);
            }
            if (!TextUtils.isEmpty(eVar.f11728L)) {
                this.f11770b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator it2 = eVar.f11741c.iterator();
            if (it2.hasNext()) {
                AbstractC0740E.m2693a(it2.next());
                throw null;
            }
        }
        if (i7 >= 29) {
            g.m12031a(this.f11770b, eVar.f11734R);
            g.m12032b(this.f11770b, AbstractC2513l.d.m11958a(null));
        }
        if (i7 >= 31 && (i3 = eVar.f11733Q) != 0) {
            h.m12035b(this.f11770b, i3);
        }
        if (i7 >= 36) {
            i.m12036a(this.f11770b, eVar.f11745g);
        }
        if (eVar.f11736T) {
            if (this.f11771c.f11763y) {
                this.f11776h = 2;
            } else {
                this.f11776h = 1;
            }
            this.f11770b.setVibrate(null);
            this.f11770b.setSound(null);
            int i8 = notification.defaults & (-4);
            notification.defaults = i8;
            this.f11770b.setDefaults(i8);
            if (i7 >= 26) {
                if (TextUtils.isEmpty(this.f11771c.f11762x)) {
                    a.m12005f(this.f11770b, "silent");
                }
                e.m12026d(this.f11770b, this.f11776h);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11993b(AbstractC2513l.a aVar) {
        IconCompat iconCompatM11938d = aVar.m11938d();
        Notification.Action.Builder builderM12015a = c.m12015a(iconCompatM11938d != null ? iconCompatM11938d.m4245l() : null, aVar.m11942h(), aVar.m11935a());
        if (aVar.m11939e() != null) {
            for (RemoteInput remoteInput : AbstractC2520s.m12045b(aVar.m11939e())) {
                a.m12002c(builderM12015a, remoteInput);
            }
        }
        Bundle bundle = aVar.m11937c() != null ? new Bundle(aVar.m11937c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m11936b());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            d.m12018a(builderM12015a, aVar.m11936b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.m11940f());
        if (i3 >= 28) {
            f.m12030a(builderM12015a, aVar.m11940f());
        }
        if (i3 >= 29) {
            g.m12033c(builderM12015a, aVar.m11944j());
        }
        if (i3 >= 31) {
            h.m12034a(builderM12015a, aVar.m11943i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.m11941g());
        a.m12001b(builderM12015a, bundle);
        a.m12000a(this.f11770b, a.m12003d(builderM12015a));
    }

    /* JADX INFO: renamed from: e */
    private static List m11994e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C0922b c0922b = new C0922b(list.size() + list2.size());
        c0922b.addAll(list);
        c0922b.addAll(list2);
        return new ArrayList(c0922b);
    }

    /* JADX INFO: renamed from: g */
    private static List m11995g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        AbstractC0740E.m2693a(it.next());
        throw null;
    }

    /* JADX INFO: renamed from: h */
    private void m11996h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // p161x.InterfaceC2512k
    /* JADX INFO: renamed from: a */
    public Notification.Builder mo11932a() {
        return this.f11770b;
    }

    /* JADX INFO: renamed from: c */
    public Notification m11997c() {
        Bundle bundleM11933a;
        RemoteViews remoteViewsM11991f;
        RemoteViews remoteViewsM11989d;
        AbstractC2513l.f fVar = this.f11771c.f11755q;
        if (fVar != null) {
            fVar.mo11945b(this);
        }
        RemoteViews remoteViewsM11990e = fVar != null ? fVar.m11990e(this) : null;
        Notification notificationM11998d = m11998d();
        if (remoteViewsM11990e != null) {
            notificationM11998d.contentView = remoteViewsM11990e;
        } else {
            RemoteViews remoteViews = this.f11771c.f11725I;
            if (remoteViews != null) {
                notificationM11998d.contentView = remoteViews;
            }
        }
        if (fVar != null && (remoteViewsM11989d = fVar.m11989d(this)) != null) {
            notificationM11998d.bigContentView = remoteViewsM11989d;
        }
        if (fVar != null && (remoteViewsM11991f = this.f11771c.f11755q.m11991f(this)) != null) {
            notificationM11998d.headsUpContentView = remoteViewsM11991f;
        }
        if (fVar != null && (bundleM11933a = AbstractC2513l.m11933a(notificationM11998d)) != null) {
            fVar.mo11955a(bundleM11933a);
        }
        return notificationM11998d;
    }

    /* JADX INFO: renamed from: d */
    protected Notification m11998d() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            return this.f11770b.build();
        }
        if (i3 >= 24) {
            Notification notificationBuild = this.f11770b.build();
            if (this.f11776h != 0) {
                if (a.m12004e(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f11776h == 2) {
                    m11996h(notificationBuild);
                }
                if (a.m12004e(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f11776h == 1) {
                    m11996h(notificationBuild);
                }
            }
            return notificationBuild;
        }
        this.f11770b.setExtras(this.f11775g);
        Notification notificationBuild2 = this.f11770b.build();
        RemoteViews remoteViews = this.f11772d;
        if (remoteViews != null) {
            notificationBuild2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f11773e;
        if (remoteViews2 != null) {
            notificationBuild2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f11777i;
        if (remoteViews3 != null) {
            notificationBuild2.headsUpContentView = remoteViews3;
        }
        if (this.f11776h != 0) {
            if (a.m12004e(notificationBuild2) != null && (notificationBuild2.flags & 512) != 0 && this.f11776h == 2) {
                m11996h(notificationBuild2);
            }
            if (a.m12004e(notificationBuild2) != null && (notificationBuild2.flags & 512) == 0 && this.f11776h == 1) {
                m11996h(notificationBuild2);
            }
        }
        return notificationBuild2;
    }

    /* JADX INFO: renamed from: f */
    Context m11999f() {
        return this.f11769a;
    }
}
