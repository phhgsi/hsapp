package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.C1015f;
import p167z.AbstractC2573f;

/* JADX INFO: renamed from: androidx.emoji2.text.e */
/* JADX INFO: loaded from: classes.dex */
class C1014e implements C1015f.e {

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal f4814b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    private final TextPaint f4815a;

    C1014e() {
        TextPaint textPaint = new TextPaint();
        this.f4815a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* JADX INFO: renamed from: b */
    private static StringBuilder m4523b() {
        ThreadLocal threadLocal = f4814b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.C1015f.e
    /* JADX INFO: renamed from: a */
    public boolean mo4524a(CharSequence charSequence, int i3, int i4, int i5) {
        StringBuilder sbM4523b = m4523b();
        sbM4523b.setLength(0);
        while (i3 < i4) {
            sbM4523b.append(charSequence.charAt(i3));
            i3++;
        }
        return AbstractC2573f.m12276a(this.f4815a, sbM4523b.toString());
    }
}
