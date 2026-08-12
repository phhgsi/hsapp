package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: androidx.emoji2.text.t */
/* JADX INFO: loaded from: classes.dex */
class C1029t implements Spannable {

    /* JADX INFO: renamed from: d */
    private boolean f4905d = false;

    /* JADX INFO: renamed from: e */
    private Spannable f4906e;

    /* JADX INFO: renamed from: androidx.emoji2.text.t$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static IntStream m4644a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* JADX INFO: renamed from: b */
        static IntStream m4645b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.t$b */
    static class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        boolean mo4646a(CharSequence charSequence) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.t$c */
    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.C1029t.b
        /* JADX INFO: renamed from: a */
        boolean mo4646a(CharSequence charSequence) {
            return AbstractC1030u.m4647a(charSequence);
        }
    }

    C1029t(Spannable spannable) {
        this.f4906e = spannable;
    }

    /* JADX INFO: renamed from: a */
    private void m4641a() {
        Spannable spannable = this.f4906e;
        if (!this.f4905d && m4642c().mo4646a(spannable)) {
            this.f4906e = new SpannableString(spannable);
        }
        this.f4905d = true;
    }

    /* JADX INFO: renamed from: c */
    static b m4642c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    /* JADX INFO: renamed from: b */
    Spannable m4643b() {
        return this.f4906e;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i3) {
        return this.f4906e.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.m4644a(this.f4906e);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.m4645b(this.f4906e);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f4906e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f4906e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f4906e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i3, int i4, Class cls) {
        return this.f4906e.getSpans(i3, i4, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f4906e.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i3, int i4, Class cls) {
        return this.f4906e.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m4641a();
        this.f4906e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i3, int i4, int i5) {
        m4641a();
        this.f4906e.setSpan(obj, i3, i4, i5);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i3, int i4) {
        return this.f4906e.subSequence(i3, i4);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f4906e.toString();
    }

    C1029t(CharSequence charSequence) {
        this.f4906e = new SpannableString(charSequence);
    }
}
