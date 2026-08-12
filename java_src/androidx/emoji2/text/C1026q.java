package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: androidx.emoji2.text.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1026q extends AbstractC1019j {

    /* JADX INFO: renamed from: g */
    private static Paint f4903g;

    /* JADX INFO: renamed from: f */
    private TextPaint f4904f;

    public C1026q(C1025p c1025p) {
        super(c1025p);
    }

    /* JADX INFO: renamed from: c */
    private TextPaint m4636c(CharSequence charSequence, int i3, int i4, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i3, i4, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f4904f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f4904f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private static Paint m4637e() {
        if (f4903g == null) {
            TextPaint textPaint = new TextPaint();
            f4903g = textPaint;
            textPaint.setColor(C1015f.m4527c().m4534d());
            f4903g.setStyle(Paint.Style.FILL);
        }
        return f4903g;
    }

    /* JADX INFO: renamed from: d */
    void m4638d(Canvas canvas, TextPaint textPaint, float f3, float f4, float f5, float f6) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f3, f5, f4, f6, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f3, int i5, int i6, int i7, Paint paint) {
        TextPaint textPaintM4636c = m4636c(charSequence, i3, i4, paint);
        if (textPaintM4636c != null && textPaintM4636c.bgColor != 0) {
            m4638d(canvas, textPaintM4636c, f3, f3 + m4581b(), i5, i7);
        }
        Paint paint2 = textPaintM4636c;
        if (C1015f.m4527c().m4536j()) {
            canvas.drawRect(f3, i5, f3 + m4581b(), i7, m4637e());
        }
        C1025p c1025pM4580a = m4580a();
        float f4 = i6;
        if (paint2 == null) {
            paint2 = paint;
        }
        c1025pM4580a.m4624a(canvas, f3, f4, paint2);
    }
}
