package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: androidx.emoji2.text.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1019j extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    private final C1025p f4870b;

    /* JADX INFO: renamed from: a */
    private final Paint.FontMetricsInt f4869a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    private short f4871c = -1;

    /* JADX INFO: renamed from: d */
    private short f4872d = -1;

    /* JADX INFO: renamed from: e */
    private float f4873e = 1.0f;

    AbstractC1019j(C1025p c1025p) {
        AbstractC0211h.m611h(c1025p, "rasterizer cannot be null");
        this.f4870b = c1025p;
    }

    /* JADX INFO: renamed from: a */
    public final C1025p m4580a() {
        return this.f4870b;
    }

    /* JADX INFO: renamed from: b */
    final int m4581b() {
        return this.f4871c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f4869a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f4869a;
        this.f4873e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f4870b.m4628e();
        this.f4872d = (short) (this.f4870b.m4628e() * this.f4873e);
        short sM4631i = (short) (this.f4870b.m4631i() * this.f4873e);
        this.f4871c = sM4631i;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f4869a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sM4631i;
    }
}
