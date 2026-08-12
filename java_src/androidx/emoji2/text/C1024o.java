package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: androidx.emoji2.text.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1024o extends SpannableStringBuilder {

    /* JADX INFO: renamed from: d */
    private final Class f4895d;

    /* JADX INFO: renamed from: e */
    private final List f4896e;

    /* JADX INFO: renamed from: androidx.emoji2.text.o$a */
    private static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a */
        final Object f4897a;

        /* JADX INFO: renamed from: b */
        private final AtomicInteger f4898b = new AtomicInteger(0);

        a(Object obj) {
            this.f4897a = obj;
        }

        /* JADX INFO: renamed from: b */
        private boolean m4620b(Object obj) {
            return obj instanceof AbstractC1019j;
        }

        /* JADX INFO: renamed from: a */
        final void m4621a() {
            this.f4898b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f4897a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            ((TextWatcher) this.f4897a).beforeTextChanged(charSequence, i3, i4, i5);
        }

        /* JADX INFO: renamed from: c */
        final void m4622c() {
            this.f4898b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i3, int i4) {
            if (this.f4898b.get() <= 0 || !m4620b(obj)) {
                ((SpanWatcher) this.f4897a).onSpanAdded(spannable, obj, i3, i4);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[PHI: r11
  0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
            /*
                r8 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r8.f4898b
                int r0 = r0.get()
                if (r0 <= 0) goto Lf
                boolean r0 = r8.m4620b(r10)
                if (r0 == 0) goto Lf
                return
            Lf:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L1e
                r0 = 0
                if (r11 <= r12) goto L19
                r11 = r0
            L19:
                if (r13 <= r14) goto L1e
                r4 = r11
                r6 = r0
                goto L20
            L1e:
                r4 = r11
                r6 = r13
            L20:
                java.lang.Object r11 = r8.f4897a
                r1 = r11
                android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
                r2 = r9
                r3 = r10
                r5 = r12
                r7 = r14
                r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C1024o.a.onSpanChanged(android.text.Spannable, java.lang.Object, int, int, int, int):void");
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i3, int i4) {
            if (this.f4898b.get() <= 0 || !m4620b(obj)) {
                ((SpanWatcher) this.f4897a).onSpanRemoved(spannable, obj, i3, i4);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            ((TextWatcher) this.f4897a).onTextChanged(charSequence, i3, i4, i5);
        }
    }

    C1024o(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f4896e = new ArrayList();
        AbstractC0211h.m611h(cls, "watcherClass cannot be null");
        this.f4895d = cls;
    }

    /* JADX INFO: renamed from: b */
    private void m4611b() {
        for (int i3 = 0; i3 < this.f4896e.size(); i3++) {
            ((a) this.f4896e.get(i3)).m4621a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1024o m4612c(Class cls, CharSequence charSequence) {
        return new C1024o(cls, charSequence);
    }

    /* JADX INFO: renamed from: e */
    private void m4613e() {
        for (int i3 = 0; i3 < this.f4896e.size(); i3++) {
            ((a) this.f4896e.get(i3)).onTextChanged(this, 0, length(), length());
        }
    }

    /* JADX INFO: renamed from: f */
    private a m4614f(Object obj) {
        for (int i3 = 0; i3 < this.f4896e.size(); i3++) {
            a aVar = (a) this.f4896e.get(i3);
            if (aVar.f4897a == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private boolean m4615g(Class cls) {
        return this.f4895d == cls;
    }

    /* JADX INFO: renamed from: h */
    private boolean m4616h(Object obj) {
        return obj != null && m4615g(obj.getClass());
    }

    /* JADX INFO: renamed from: i */
    private void m4617i() {
        for (int i3 = 0; i3 < this.f4896e.size(); i3++) {
            ((a) this.f4896e.get(i3)).m4622c();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4618a() {
        m4611b();
    }

    /* JADX INFO: renamed from: d */
    public void m4619d() {
        m4617i();
        m4613e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a aVarM4614f;
        if (m4616h(obj) && (aVarM4614f = m4614f(obj)) != null) {
            obj = aVarM4614f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a aVarM4614f;
        if (m4616h(obj) && (aVarM4614f = m4614f(obj)) != null) {
            obj = aVarM4614f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a aVarM4614f;
        if (m4616h(obj) && (aVarM4614f = m4614f(obj)) != null) {
            obj = aVarM4614f;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i3, int i4, Class cls) {
        if (!m4615g(cls)) {
            return super.getSpans(i3, i4, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i3, i4, a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aVarArr.length);
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            objArr[i5] = aVarArr[i5].f4897a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i3, int i4, Class cls) {
        if (cls == null || m4615g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVarM4614f;
        if (m4616h(obj)) {
            aVarM4614f = m4614f(obj);
            if (aVarM4614f != null) {
                obj = aVarM4614f;
            }
        } else {
            aVarM4614f = null;
        }
        super.removeSpan(obj);
        if (aVarM4614f != null) {
            this.f4896e.remove(aVarM4614f);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i3, int i4, int i5) {
        if (m4616h(obj)) {
            a aVar = new a(obj);
            this.f4896e.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i3, i4, i5);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i3, int i4) {
        return new C1024o(this.f4895d, this, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i3, int i4) {
        super.delete(i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence) {
        m4611b();
        super.replace(i3, i4, charSequence);
        m4617i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i3, CharSequence charSequence, int i4, int i5) {
        super.insert(i3, charSequence, i4, i5);
        return this;
    }

    C1024o(Class cls, CharSequence charSequence, int i3, int i4) {
        super(charSequence, i3, i4);
        this.f4896e = new ArrayList();
        AbstractC0211h.m611h(cls, "watcherClass cannot be null");
        this.f4895d = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        m4611b();
        super.replace(i3, i4, charSequence, i5, i6);
        m4617i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i3, int i4) {
        super.append(charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i3) {
        super.append(charSequence, obj, i3);
        return this;
    }
}
