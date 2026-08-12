package p167z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.C0928h;
import java.util.List;
import p015F.AbstractC0138j;
import p112i0.AbstractC2025a;
import p164y.AbstractC2535h;
import p164y.AbstractC2538k;

/* JADX INFO: renamed from: z.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2589v {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2566C f11908a;

    /* JADX INFO: renamed from: b */
    private static final C0928h f11909b;

    /* JADX INFO: renamed from: c */
    private static Paint f11910c;

    /* JADX INFO: renamed from: z.v$a */
    public static class a extends AbstractC0138j.c {

        /* JADX INFO: renamed from: a */
        private AbstractC2538k.e f11911a;

        public a(AbstractC2538k.e eVar) {
            this.f11911a = eVar;
        }

        @Override // p015F.AbstractC0138j.c
        /* JADX INFO: renamed from: a */
        public void mo418a(int i3) {
            AbstractC2538k.e eVar = this.f11911a;
            if (eVar != null) {
                eVar.mo2108f(i3);
            }
        }

        @Override // p015F.AbstractC0138j.c
        /* JADX INFO: renamed from: b */
        public void mo419b(Typeface typeface) {
            AbstractC2538k.e eVar = this.f11911a;
            if (eVar != null) {
                eVar.mo2109g(typeface);
            }
        }
    }

    static {
        AbstractC2025a.m10210a("TypefaceCompat static init");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            f11908a = new C2565B();
        } else if (i3 >= 29) {
            f11908a = new C2564A();
        } else if (i3 >= 28) {
            f11908a = new C2593z();
        } else if (i3 >= 26) {
            f11908a = new C2592y();
        } else if (i3 < 24 || !C2591x.m12329k()) {
            f11908a = new C2590w();
        } else {
            f11908a = new C2591x();
        }
        f11909b = new C0928h(16);
        f11910c = null;
        AbstractC2025a.m10211b();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m12312a(Context context, Typeface typeface, int i3) {
        if (context != null) {
            return Typeface.create(typeface, i3);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m12313b(Context context, CancellationSignal cancellationSignal, AbstractC0138j.b[] bVarArr, int i3) {
        AbstractC2025a.m10210a("TypefaceCompat.createFromFontInfo");
        try {
            return f11908a.mo12232b(context, cancellationSignal, bVarArr, i3);
        } finally {
            AbstractC2025a.m10211b();
        }
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m12314c(Context context, CancellationSignal cancellationSignal, List list, int i3) {
        AbstractC2025a.m10210a("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f11908a.mo12233c(context, cancellationSignal, list, i3);
        } finally {
            AbstractC2025a.m10211b();
        }
    }

    /* JADX INFO: renamed from: d */
    public static Typeface m12315d(Context context, AbstractC2535h.b bVar, Resources resources, int i3, String str, int i4, int i5, AbstractC2538k.e eVar, Handler handler, boolean z2) {
        Typeface typefaceMo12231a;
        if (bVar instanceof AbstractC2535h.e) {
            AbstractC2535h.e eVar2 = (AbstractC2535h.e) bVar;
            Typeface typefaceM12320i = m12320i(eVar2);
            if (typefaceM12320i != null) {
                if (eVar != null) {
                    eVar.m12158d(typefaceM12320i, handler);
                }
                f11909b.put(m12317f(resources, i3, str, i4, i5), typefaceM12320i);
                return typefaceM12320i;
            }
            typefaceMo12231a = AbstractC0138j.m402c(context, eVar2.m12125b(), i5, !z2 ? eVar != null : eVar2.m12124a() != 0, z2 ? eVar2.m12127d() : -1, AbstractC2538k.e.m12156e(handler), new a(eVar));
        } else {
            typefaceMo12231a = f11908a.mo12231a(context, (AbstractC2535h.c) bVar, resources, i5);
            if (eVar != null) {
                if (typefaceMo12231a != null) {
                    eVar.m12158d(typefaceMo12231a, handler);
                } else {
                    eVar.m12157c(-3, handler);
                }
            }
        }
        if (typefaceMo12231a != null) {
            f11909b.put(m12317f(resources, i3, str, i4, i5), typefaceMo12231a);
        }
        return typefaceMo12231a;
    }

    /* JADX INFO: renamed from: e */
    public static Typeface m12316e(Context context, Resources resources, int i3, String str, int i4, int i5) {
        Typeface typefaceMo12234e = f11908a.mo12234e(context, resources, i3, str, i5);
        if (typefaceMo12234e != null) {
            f11909b.put(m12317f(resources, i3, str, i4, i5), typefaceMo12234e);
        }
        return typefaceMo12234e;
    }

    /* JADX INFO: renamed from: f */
    private static String m12317f(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }

    /* JADX INFO: renamed from: g */
    public static Typeface m12318g(Resources resources, int i3, String str, int i4, int i5) {
        return (Typeface) f11909b.get(m12317f(resources, i3, str, i4, i5));
    }

    /* JADX INFO: renamed from: h */
    public static Typeface m12319h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
    
        return r0.build();
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface m12320i(p164y.AbstractC2535h.e r8) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p167z.AbstractC2589v.m12320i(y.h$e):android.graphics.Typeface");
    }

    /* JADX INFO: renamed from: j */
    public static Font m12321j(Typeface typeface) {
        if (f11910c == null) {
            f11910c = new Paint();
        }
        f11910c.setTextSize(10.0f);
        f11910c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f11910c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
