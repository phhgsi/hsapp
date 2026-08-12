package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p048Q.C0481a;

/* JADX INFO: renamed from: androidx.emoji2.text.p */
/* JADX INFO: loaded from: classes.dex */
public class C1025p {

    /* JADX INFO: renamed from: d */
    private static final ThreadLocal f4899d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    private final int f4900a;

    /* JADX INFO: renamed from: b */
    private final C1023n f4901b;

    /* JADX INFO: renamed from: c */
    private volatile int f4902c = 0;

    C1025p(C1023n c1023n, int i3) {
        this.f4901b = c1023n;
        this.f4900a = i3;
    }

    /* JADX INFO: renamed from: g */
    private C0481a m4623g() {
        ThreadLocal threadLocal = f4899d;
        C0481a c0481a = (C0481a) threadLocal.get();
        if (c0481a == null) {
            c0481a = new C0481a();
            threadLocal.set(c0481a);
        }
        this.f4901b.m4603d().m1785j(c0481a, this.f4900a);
        return c0481a;
    }

    /* JADX INFO: renamed from: a */
    public void m4624a(Canvas canvas, float f3, float f4, Paint paint) {
        Typeface typefaceM4606g = this.f4901b.m4606g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM4606g);
        canvas.drawText(this.f4901b.m4602c(), this.f4900a * 2, 2, f3, f4, paint);
        paint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: b */
    public int m4625b(int i3) {
        return m4623g().m1774h(i3);
    }

    /* JADX INFO: renamed from: c */
    public int m4626c() {
        return m4623g().m1775i();
    }

    /* JADX INFO: renamed from: d */
    public int m4627d() {
        return this.f4902c & 3;
    }

    /* JADX INFO: renamed from: e */
    public int m4628e() {
        return m4623g().m1777k();
    }

    /* JADX INFO: renamed from: f */
    public int m4629f() {
        return m4623g().m1778l();
    }

    /* JADX INFO: renamed from: h */
    public short m4630h() {
        return m4623g().m1779m();
    }

    /* JADX INFO: renamed from: i */
    public int m4631i() {
        return m4623g().m1780n();
    }

    /* JADX INFO: renamed from: j */
    public boolean m4632j() {
        return m4623g().m1776j();
    }

    /* JADX INFO: renamed from: k */
    public boolean m4633k() {
        return (this.f4902c & 4) > 0;
    }

    /* JADX INFO: renamed from: l */
    public void m4634l(boolean z2) {
        int iM4627d = m4627d();
        if (z2) {
            this.f4902c = iM4627d | 4;
        } else {
            this.f4902c = iM4627d;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m4635m(boolean z2) {
        int i3 = this.f4902c & 4;
        this.f4902c = z2 ? i3 | 2 : i3 | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m4629f()));
        sb.append(", codepoints:");
        int iM4626c = m4626c();
        for (int i3 = 0; i3 < iM4626c; i3++) {
            sb.append(Integer.toHexString(m4625b(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
