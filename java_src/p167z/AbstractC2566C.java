package p167z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p015F.AbstractC0138j;
import p164y.AbstractC2535h;

/* JADX INFO: renamed from: z.C */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2566C {

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap f11864a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: z.C$a */
    class a implements b {
        a() {
        }

        @Override // p167z.AbstractC2566C.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo12242a(AbstractC0138j.b bVar) {
            return bVar.m415g();
        }

        @Override // p167z.AbstractC2566C.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo12243b(AbstractC0138j.b bVar) {
            return bVar.m416h();
        }
    }

    /* JADX INFO: renamed from: z.C$b */
    private interface b {
        /* JADX INFO: renamed from: a */
        int mo12242a(Object obj);

        /* JADX INFO: renamed from: b */
        boolean mo12243b(Object obj);
    }

    AbstractC2566C() {
    }

    /* JADX INFO: renamed from: f */
    private static Object m12239f(Object[] objArr, int i3, b bVar) {
        return m12240g(objArr, (i3 & 1) == 0 ? 400 : 700, (i3 & 2) != 0, bVar);
    }

    /* JADX INFO: renamed from: g */
    private static Object m12240g(Object[] objArr, int i3, boolean z2, b bVar) {
        Object obj = null;
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.mo12242a(obj2) - i3) * 2) + (bVar.mo12243b(obj2) == z2 ? 0 : 1);
            if (obj == null || i4 > iAbs) {
                obj = obj2;
                i4 = iAbs;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract Typeface mo12231a(Context context, AbstractC2535h.c cVar, Resources resources, int i3);

    /* JADX INFO: renamed from: b */
    public abstract Typeface mo12232b(Context context, CancellationSignal cancellationSignal, AbstractC0138j.b[] bVarArr, int i3);

    /* JADX INFO: renamed from: c */
    public Typeface mo12233c(Context context, CancellationSignal cancellationSignal, List list, int i3) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: d */
    protected Typeface m12241d(Context context, InputStream inputStream) {
        File fileM12250e = AbstractC2567D.m12250e(context);
        if (fileM12250e == null) {
            return null;
        }
        try {
            if (AbstractC2567D.m12249d(fileM12250e, inputStream)) {
                return Typeface.createFromFile(fileM12250e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM12250e.delete();
        }
    }

    /* JADX INFO: renamed from: e */
    public Typeface mo12234e(Context context, Resources resources, int i3, String str, int i4) {
        File fileM12250e = AbstractC2567D.m12250e(context);
        if (fileM12250e == null) {
            return null;
        }
        try {
            if (AbstractC2567D.m12248c(fileM12250e, resources, i3)) {
                return Typeface.createFromFile(fileM12250e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM12250e.delete();
        }
    }

    /* JADX INFO: renamed from: h */
    protected AbstractC0138j.b mo12235h(AbstractC0138j.b[] bVarArr, int i3) {
        return (AbstractC0138j.b) m12239f(bVarArr, i3, new a());
    }
}
