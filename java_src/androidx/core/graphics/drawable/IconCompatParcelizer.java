package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC1291a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC1291a abstractC1291a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4660a = abstractC1291a.m6579p(iconCompat.f4660a, 1);
        iconCompat.f4662c = abstractC1291a.m6573j(iconCompat.f4662c, 2);
        iconCompat.f4663d = abstractC1291a.m6581r(iconCompat.f4663d, 3);
        iconCompat.f4664e = abstractC1291a.m6579p(iconCompat.f4664e, 4);
        iconCompat.f4665f = abstractC1291a.m6579p(iconCompat.f4665f, 5);
        iconCompat.f4666g = (ColorStateList) abstractC1291a.m6581r(iconCompat.f4666g, 6);
        iconCompat.f4668i = abstractC1291a.m6583t(iconCompat.f4668i, 7);
        iconCompat.f4669j = abstractC1291a.m6583t(iconCompat.f4669j, 8);
        iconCompat.m4243j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC1291a abstractC1291a) {
        abstractC1291a.m6587x(true, true);
        iconCompat.m4244k(abstractC1291a.m6569f());
        int i3 = iconCompat.f4660a;
        if (-1 != i3) {
            abstractC1291a.m6559F(i3, 1);
        }
        byte[] bArr = iconCompat.f4662c;
        if (bArr != null) {
            abstractC1291a.m6555B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f4663d;
        if (parcelable != null) {
            abstractC1291a.m6561H(parcelable, 3);
        }
        int i4 = iconCompat.f4664e;
        if (i4 != 0) {
            abstractC1291a.m6559F(i4, 4);
        }
        int i5 = iconCompat.f4665f;
        if (i5 != 0) {
            abstractC1291a.m6559F(i5, 5);
        }
        ColorStateList colorStateList = iconCompat.f4666g;
        if (colorStateList != null) {
            abstractC1291a.m6561H(colorStateList, 6);
        }
        String str = iconCompat.f4668i;
        if (str != null) {
            abstractC1291a.m6563J(str, 7);
        }
        String str2 = iconCompat.f4669j;
        if (str2 != null) {
            abstractC1291a.m6563J(str2, 8);
        }
    }
}
