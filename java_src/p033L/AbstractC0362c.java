package p033L;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: L.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0362c {

    /* JADX INFO: renamed from: a */
    private static final String[] f1478a = new String[0];

    /* JADX INFO: renamed from: L.c$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static void m1338a(EditorInfo editorInfo, CharSequence charSequence, int i3) {
            editorInfo.setInitialSurroundingSubText(charSequence, i3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String[] m1330a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f1478a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f1478a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f1478a;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m1331b(CharSequence charSequence, int i3, int i4) {
        if (i4 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i3));
        }
        if (i4 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i3));
    }

    /* JADX INFO: renamed from: c */
    private static boolean m1332c(int i3) {
        int i4 = i3 & 4095;
        return i4 == 129 || i4 == 225 || i4 == 18;
    }

    /* JADX INFO: renamed from: d */
    public static void m1333d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m1334e(EditorInfo editorInfo, CharSequence charSequence, int i3) {
        AbstractC0211h.m610g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.m1338a(editorInfo, charSequence, i3);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        int i6 = i4 > i5 ? i5 - i3 : i4 - i3;
        int i7 = i4 > i5 ? i4 - i3 : i5 - i3;
        int length = charSequence.length();
        if (i3 < 0 || i6 < 0 || i7 > length) {
            m1336g(editorInfo, null, 0, 0);
            return;
        }
        if (m1332c(editorInfo.inputType)) {
            m1336g(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m1336g(editorInfo, charSequence, i6, i7);
        } else {
            m1337h(editorInfo, charSequence, i6, i7);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1335f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.m1338a(editorInfo, charSequence, 0);
        } else {
            m1334e(editorInfo, charSequence, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m1336g(EditorInfo editorInfo, CharSequence charSequence, int i3, int i4) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i3);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i4);
    }

    /* JADX INFO: renamed from: h */
    private static void m1337h(EditorInfo editorInfo, CharSequence charSequence, int i3, int i4) {
        int i5 = i4 - i3;
        int i6 = i5 > 1024 ? 0 : i5;
        int i7 = 2048 - i6;
        int iMin = Math.min(charSequence.length() - i4, i7 - Math.min(i3, (int) (((double) i7) * 0.8d)));
        int iMin2 = Math.min(i3, i7 - iMin);
        int i8 = i3 - iMin2;
        if (m1331b(charSequence, i8, 0)) {
            i8++;
            iMin2--;
        }
        if (m1331b(charSequence, (i4 + iMin) - 1, 1)) {
            iMin--;
        }
        m1336g(editorInfo, i6 != i5 ? TextUtils.concat(charSequence.subSequence(i8, i8 + iMin2), charSequence.subSequence(i4, iMin + i4)) : charSequence.subSequence(i8, iMin2 + i6 + iMin + i8), iMin2, i6 + iMin2);
    }
}
