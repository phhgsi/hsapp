package p015F;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.C0928h;
import androidx.collection.C0929i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p015F.AbstractC0138j;
import p024I.InterfaceC0204a;
import p112i0.AbstractC2025a;
import p167z.AbstractC2589v;

/* JADX INFO: renamed from: F.i */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0137i {

    /* JADX INFO: renamed from: a */
    static final C0928h f274a = new C0928h(16);

    /* JADX INFO: renamed from: b */
    private static final ExecutorService f275b = AbstractC0139k.m420a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c */
    static final Object f276c = new Object();

    /* JADX INFO: renamed from: d */
    static final C0929i f277d = new C0929i();

    /* JADX INFO: renamed from: F.i$a */
    class a implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f278a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f279b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C0134f f280c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f281d;

        a(String str, Context context, C0134f c0134f, int i3) {
            this.f278a = str;
            this.f279b = context;
            this.f280c = c0134f;
            this.f281d = i3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return AbstractC0137i.m392c(this.f278a, this.f279b, AbstractC0136h.m389a(new Object[]{this.f280c}), this.f281d);
        }
    }

    /* JADX INFO: renamed from: F.i$b */
    class b implements InterfaceC0204a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0129a f282a;

        b(C0129a c0129a) {
            this.f282a = c0129a;
        }

        @Override // p024I.InterfaceC0204a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f282a.m368b(eVar);
        }
    }

    /* JADX INFO: renamed from: F.i$c */
    class c implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f283a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f284b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f285c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f286d;

        c(String str, Context context, List list, int i3) {
            this.f283a = str;
            this.f284b = context;
            this.f285c = list;
            this.f286d = i3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return AbstractC0137i.m392c(this.f283a, this.f284b, this.f285c, this.f286d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: renamed from: F.i$d */
    class d implements InterfaceC0204a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f287a;

        d(String str) {
            this.f287a = str;
        }

        @Override // p024I.InterfaceC0204a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (AbstractC0137i.f276c) {
                try {
                    C0929i c0929i = AbstractC0137i.f277d;
                    ArrayList arrayList = (ArrayList) c0929i.get(this.f287a);
                    if (arrayList == null) {
                        return;
                    }
                    c0929i.remove(this.f287a);
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        ((InterfaceC0204a) arrayList.get(i3)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m390a(List list, int i3) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            sb.append(((C0134f) list.get(i4)).m382d());
            sb.append("-");
            sb.append(i3);
            if (i4 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private static int m391b(AbstractC0138j.a aVar) {
        int i3 = 1;
        if (aVar.m407e() != 0) {
            return aVar.m407e() != 1 ? -3 : -2;
        }
        AbstractC0138j.b[] bVarArrM405c = aVar.m405c();
        if (bVarArrM405c != null && bVarArrM405c.length != 0) {
            i3 = 0;
            for (AbstractC0138j.b bVar : bVarArrM405c) {
                int iM410b = bVar.m410b();
                if (iM410b != 0) {
                    if (iM410b < 0) {
                        return -3;
                    }
                    return iM410b;
                }
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    static e m392c(String str, Context context, List list, int i3) {
        AbstractC2025a.m10210a("getFontSync");
        try {
            C0928h c0928h = f274a;
            Typeface typeface = (Typeface) c0928h.get(str);
            if (typeface != null) {
                return new e(typeface);
            }
            AbstractC0138j.a aVarM375e = AbstractC0133e.m375e(context, list, null);
            int iM391b = m391b(aVarM375e);
            if (iM391b != 0) {
                return new e(iM391b);
            }
            Typeface typefaceM12313b = (!aVarM375e.m408f() || Build.VERSION.SDK_INT < 29) ? AbstractC2589v.m12313b(context, null, aVarM375e.m405c(), i3) : AbstractC2589v.m12314c(context, null, aVarM375e.m406d(), i3);
            if (typefaceM12313b == null) {
                return new e(-3);
            }
            c0928h.put(str, typefaceM12313b);
            return new e(typefaceM12313b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            AbstractC2025a.m10211b();
        }
    }

    /* JADX INFO: renamed from: d */
    static Typeface m393d(Context context, List list, int i3, Executor executor, C0129a c0129a) {
        String strM390a = m390a(list, i3);
        Typeface typeface = (Typeface) f274a.get(strM390a);
        if (typeface != null) {
            c0129a.m368b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c0129a);
        synchronized (f276c) {
            try {
                C0929i c0929i = f277d;
                ArrayList arrayList = (ArrayList) c0929i.get(strM390a);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                c0929i.put(strM390a, arrayList2);
                c cVar = new c(strM390a, context, list, i3);
                if (executor == null) {
                    executor = f275b;
                }
                AbstractC0139k.m422c(executor, cVar, new d(strM390a));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    static Typeface m394e(Context context, C0134f c0134f, C0129a c0129a, int i3, int i4) {
        String strM390a = m390a(AbstractC0136h.m389a(new Object[]{c0134f}), i3);
        Typeface typeface = (Typeface) f274a.get(strM390a);
        if (typeface != null) {
            c0129a.m368b(new e(typeface));
            return typeface;
        }
        if (i4 == -1) {
            e eVarM392c = m392c(strM390a, context, AbstractC0136h.m389a(new Object[]{c0134f}), i3);
            c0129a.m368b(eVarM392c);
            return eVarM392c.f288a;
        }
        try {
            e eVar = (e) AbstractC0139k.m423d(f275b, new a(strM390a, context, c0134f, i3), i4);
            c0129a.m368b(eVar);
            return eVar.f288a;
        } catch (InterruptedException unused) {
            c0129a.m368b(new e(-3));
            return null;
        }
    }

    /* JADX INFO: renamed from: F.i$e */
    static final class e {

        /* JADX INFO: renamed from: a */
        final Typeface f288a;

        /* JADX INFO: renamed from: b */
        final int f289b;

        e(int i3) {
            this.f288a = null;
            this.f289b = i3;
        }

        /* JADX INFO: renamed from: a */
        boolean m399a() {
            return this.f289b == 0;
        }

        e(Typeface typeface) {
            this.f288a = typeface;
            this.f289b = 0;
        }
    }
}
