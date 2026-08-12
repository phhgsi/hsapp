package p021H;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import p024I.AbstractC0206c;

/* JADX INFO: renamed from: H.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0195m implements Spannable {

    /* JADX INFO: renamed from: H.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final TextPaint f1206a;

        /* JADX INFO: renamed from: b */
        private final TextDirectionHeuristic f1207b;

        /* JADX INFO: renamed from: c */
        private final int f1208c;

        /* JADX INFO: renamed from: d */
        private final int f1209d;

        /* JADX INFO: renamed from: e */
        final PrecomputedText.Params f1210e;

        /* JADX INFO: renamed from: H.m$a$a, reason: collision with other inner class name */
        public static class C2606a {

            /* JADX INFO: renamed from: a */
            private final TextPaint f1211a;

            /* JADX INFO: renamed from: c */
            private int f1213c = 1;

            /* JADX INFO: renamed from: d */
            private int f1214d = 1;

            /* JADX INFO: renamed from: b */
            private TextDirectionHeuristic f1212b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C2606a(TextPaint textPaint) {
                this.f1211a = textPaint;
            }

            /* JADX INFO: renamed from: a */
            public a m578a() {
                return new a(this.f1211a, this.f1212b, this.f1213c, this.f1214d);
            }

            /* JADX INFO: renamed from: b */
            public C2606a m579b(int i3) {
                this.f1213c = i3;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public C2606a m580c(int i3) {
                this.f1214d = i3;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public C2606a m581d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f1212b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i3, int i4) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f1210e = AbstractC0185c.m563a(textPaint).setBreakStrategy(i3).setHyphenationFrequency(i4).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f1210e = null;
            }
            this.f1206a = textPaint;
            this.f1207b = textDirectionHeuristic;
            this.f1208c = i3;
            this.f1209d = i4;
        }

        /* JADX INFO: renamed from: a */
        public boolean m573a(a aVar) {
            int i3 = Build.VERSION.SDK_INT;
            if (this.f1208c != aVar.m574b() || this.f1209d != aVar.m575c() || this.f1206a.getTextSize() != aVar.m577e().getTextSize() || this.f1206a.getTextScaleX() != aVar.m577e().getTextScaleX() || this.f1206a.getTextSkewX() != aVar.m577e().getTextSkewX() || this.f1206a.getLetterSpacing() != aVar.m577e().getLetterSpacing() || !TextUtils.equals(this.f1206a.getFontFeatureSettings(), aVar.m577e().getFontFeatureSettings()) || this.f1206a.getFlags() != aVar.m577e().getFlags()) {
                return false;
            }
            if (i3 >= 24) {
                if (!this.f1206a.getTextLocales().equals(aVar.m577e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f1206a.getTextLocale().equals(aVar.m577e().getTextLocale())) {
                return false;
            }
            return this.f1206a.getTypeface() == null ? aVar.m577e().getTypeface() == null : this.f1206a.getTypeface().equals(aVar.m577e().getTypeface());
        }

        /* JADX INFO: renamed from: b */
        public int m574b() {
            return this.f1208c;
        }

        /* JADX INFO: renamed from: c */
        public int m575c() {
            return this.f1209d;
        }

        /* JADX INFO: renamed from: d */
        public TextDirectionHeuristic m576d() {
            return this.f1207b;
        }

        /* JADX INFO: renamed from: e */
        public TextPaint m577e() {
            return this.f1206a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m573a(aVar) && this.f1207b == aVar.m576d();
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? AbstractC0206c.m597b(Float.valueOf(this.f1206a.getTextSize()), Float.valueOf(this.f1206a.getTextScaleX()), Float.valueOf(this.f1206a.getTextSkewX()), Float.valueOf(this.f1206a.getLetterSpacing()), Integer.valueOf(this.f1206a.getFlags()), this.f1206a.getTextLocales(), this.f1206a.getTypeface(), Boolean.valueOf(this.f1206a.isElegantTextHeight()), this.f1207b, Integer.valueOf(this.f1208c), Integer.valueOf(this.f1209d)) : AbstractC0206c.m597b(Float.valueOf(this.f1206a.getTextSize()), Float.valueOf(this.f1206a.getTextScaleX()), Float.valueOf(this.f1206a.getTextSkewX()), Float.valueOf(this.f1206a.getLetterSpacing()), Integer.valueOf(this.f1206a.getFlags()), this.f1206a.getTextLocale(), this.f1206a.getTypeface(), Boolean.valueOf(this.f1206a.isElegantTextHeight()), this.f1207b, Integer.valueOf(this.f1208c), Integer.valueOf(this.f1209d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f1206a.getTextSize());
            sb.append(", textScaleX=" + this.f1206a.getTextScaleX());
            sb.append(", textSkewX=" + this.f1206a.getTextSkewX());
            int i3 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f1206a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f1206a.isElegantTextHeight());
            if (i3 >= 24) {
                sb.append(", textLocale=" + this.f1206a.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.f1206a.getTextLocale());
            }
            sb.append(", typeface=" + this.f1206a.getTypeface());
            if (i3 >= 26) {
                sb.append(", variationSettings=" + this.f1206a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f1207b);
            sb.append(", breakStrategy=" + this.f1208c);
            sb.append(", hyphenationFrequency=" + this.f1209d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f1206a = params.getTextPaint();
            this.f1207b = params.getTextDirection();
            this.f1208c = params.getBreakStrategy();
            this.f1209d = params.getHyphenationFrequency();
            this.f1210e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
