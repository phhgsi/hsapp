package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: com.google.android.material.internal.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1541l {

    /* JADX INFO: renamed from: o */
    static final int f7776o = 1;

    /* JADX INFO: renamed from: a */
    private CharSequence f7777a;

    /* JADX INFO: renamed from: b */
    private final TextPaint f7778b;

    /* JADX INFO: renamed from: c */
    private final int f7779c;

    /* JADX INFO: renamed from: e */
    private int f7781e;

    /* JADX INFO: renamed from: l */
    private boolean f7788l;

    /* JADX INFO: renamed from: n */
    private InterfaceC1542m f7790n;

    /* JADX INFO: renamed from: d */
    private int f7780d = 0;

    /* JADX INFO: renamed from: f */
    private Layout.Alignment f7782f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g */
    private int f7783g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: h */
    private float f7784h = 0.0f;

    /* JADX INFO: renamed from: i */
    private float f7785i = 1.0f;

    /* JADX INFO: renamed from: j */
    private int f7786j = f7776o;

    /* JADX INFO: renamed from: k */
    private boolean f7787k = true;

    /* JADX INFO: renamed from: m */
    private TextUtils.TruncateAt f7789m = null;

    /* JADX INFO: renamed from: com.google.android.material.internal.l$a */
    public static class a extends Exception {
    }

    private C1541l(CharSequence charSequence, TextPaint textPaint, int i3) {
        this.f7777a = charSequence;
        this.f7778b = textPaint;
        this.f7779c = i3;
        this.f7781e = charSequence.length();
    }

    /* JADX INFO: renamed from: b */
    public static C1541l m8454b(CharSequence charSequence, TextPaint textPaint, int i3) {
        return new C1541l(charSequence, textPaint, i3);
    }

    /* JADX INFO: renamed from: a */
    public StaticLayout m8455a() {
        if (this.f7777a == null) {
            this.f7777a = "";
        }
        int iMax = Math.max(0, this.f7779c);
        CharSequence charSequenceEllipsize = this.f7777a;
        if (this.f7783g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f7778b, iMax, this.f7789m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f7781e);
        this.f7781e = iMin;
        if (this.f7788l && this.f7783g == 1) {
            this.f7782f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f7780d, iMin, this.f7778b, iMax);
        builderObtain.setAlignment(this.f7782f);
        builderObtain.setIncludePad(this.f7787k);
        builderObtain.setTextDirection(this.f7788l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f7789m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f7783g);
        float f3 = this.f7784h;
        if (f3 != 0.0f || this.f7785i != 1.0f) {
            builderObtain.setLineSpacing(f3, this.f7785i);
        }
        if (this.f7783g > 1) {
            builderObtain.setHyphenationFrequency(this.f7786j);
        }
        InterfaceC1542m interfaceC1542m = this.f7790n;
        if (interfaceC1542m != null) {
            interfaceC1542m.mo8464a(builderObtain);
        }
        return builderObtain.build();
    }

    /* JADX INFO: renamed from: c */
    public C1541l m8456c(Layout.Alignment alignment) {
        this.f7782f = alignment;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C1541l m8457d(TextUtils.TruncateAt truncateAt) {
        this.f7789m = truncateAt;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C1541l m8458e(int i3) {
        this.f7786j = i3;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C1541l m8459f(boolean z2) {
        this.f7787k = z2;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C1541l m8460g(boolean z2) {
        this.f7788l = z2;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C1541l m8461h(float f3, float f4) {
        this.f7784h = f3;
        this.f7785i = f4;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C1541l m8462i(int i3) {
        this.f7783g = i3;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C1541l m8463j(InterfaceC1542m interfaceC1542m) {
        this.f7790n = interfaceC1542m;
        return this;
    }
}
