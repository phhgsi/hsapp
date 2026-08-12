package p167z;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import p015F.AbstractC0138j;

/* JADX INFO: renamed from: z.B */
/* JADX INFO: loaded from: classes.dex */
public class C2565B extends C2564A {
    /* JADX INFO: renamed from: o */
    private static Typeface m12238o(String str) {
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    @Override // p167z.C2564A
    /* JADX INFO: renamed from: m */
    protected Font mo12237m(AbstractC0138j.b bVar) {
        Typeface typefaceM12238o;
        Font fontM12321j;
        String strM411c = bVar.m411c();
        if (strM411c == null || (typefaceM12238o = m12238o(strM411c)) == null || (fontM12321j = AbstractC2589v.m12321j(typefaceM12238o)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(bVar.m414f())) {
            return fontM12321j;
        }
        try {
            return new Font.Builder(fontM12321j).setFontVariationSettings(bVar.m414f()).build();
        } catch (IOException unused) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
