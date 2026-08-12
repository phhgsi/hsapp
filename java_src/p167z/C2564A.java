package p167z;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import p015F.AbstractC0138j;
import p164y.AbstractC2535h;

/* JADX INFO: renamed from: z.A */
/* JADX INFO: loaded from: classes.dex */
public class C2564A extends AbstractC2566C {
    /* JADX INFO: renamed from: i */
    private Font m12227i(FontFamily fontFamily, int i3) {
        FontStyle fontStyle = new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM12230n = m12230n(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int iM12230n2 = m12230n(fontStyle, font2.getStyle());
            if (iM12230n2 < iM12230n) {
                font = font2;
                iM12230n = iM12230n2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: j */
    private Font m12228j(CancellationSignal cancellationSignal, AbstractC0138j.b bVar, ContentResolver contentResolver) {
        return bVar.m417i() ? mo12237m(bVar) : m12229l(cancellationSignal, bVar, contentResolver);
    }

    /* JADX INFO: renamed from: l */
    private Font m12229l(CancellationSignal cancellationSignal, AbstractC0138j.b bVar, ContentResolver contentResolver) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.m413e(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return null;
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            try {
                Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.m415g()).setSlant(bVar.m416h() ? 1 : 0).setTtcIndex(bVar.m412d());
                if (!TextUtils.isEmpty(bVar.m414f())) {
                    ttcIndex.setFontVariationSettings(bVar.m414f());
                }
                Font fontBuild = ttcIndex.build();
                parcelFileDescriptorOpenFileDescriptor.close();
                return fontBuild;
            } finally {
            }
        } catch (IOException e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    private static int m12230n(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p167z.AbstractC2566C
    /* JADX INFO: renamed from: a */
    public Typeface mo12231a(Context context, AbstractC2535h.c cVar, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (AbstractC2535h.d dVar : cVar.m12117a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, dVar.m12119b()).setWeight(dVar.m12122e()).setSlant(dVar.m12123f() ? 1 : 0).setTtcIndex(dVar.m12120c()).setFontVariationSettings(dVar.m12121d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m12227i(fontFamilyBuild, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // p167z.AbstractC2566C
    /* JADX INFO: renamed from: b */
    public Typeface mo12232b(Context context, CancellationSignal cancellationSignal, AbstractC0138j.b[] bVarArr, int i3) {
        try {
            FontFamily fontFamilyM12236k = m12236k(cancellationSignal, bVarArr, context.getContentResolver());
            if (fontFamilyM12236k == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM12236k).setStyle(m12227i(fontFamilyM12236k, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // p167z.AbstractC2566C
    /* JADX INFO: renamed from: c */
    public Typeface mo12233c(Context context, CancellationSignal cancellationSignal, List list, int i3) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM12236k = m12236k(cancellationSignal, (AbstractC0138j.b[]) list.get(0), contentResolver);
            if (fontFamilyM12236k == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM12236k);
            for (int i4 = 1; i4 < list.size(); i4++) {
                FontFamily fontFamilyM12236k2 = m12236k(cancellationSignal, (AbstractC0138j.b[]) list.get(i4), contentResolver);
                if (fontFamilyM12236k2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM12236k2);
                }
            }
            return customFallbackBuilder.setStyle(m12227i(fontFamilyM12236k, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // p167z.AbstractC2566C
    /* JADX INFO: renamed from: e */
    public Typeface mo12234e(Context context, Resources resources, int i3, String str, int i4) {
        try {
            Font fontBuild = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // p167z.AbstractC2566C
    /* JADX INFO: renamed from: h */
    protected AbstractC0138j.b mo12235h(AbstractC0138j.b[] bVarArr, int i3) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: renamed from: k */
    protected FontFamily m12236k(CancellationSignal cancellationSignal, AbstractC0138j.b[] bVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (AbstractC0138j.b bVar : bVarArr) {
            Font fontM12228j = m12228j(cancellationSignal, bVar, contentResolver);
            if (fontM12228j != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontM12228j);
                } else {
                    builder.addFont(fontM12228j);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: m */
    protected Font mo12237m(AbstractC0138j.b bVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
