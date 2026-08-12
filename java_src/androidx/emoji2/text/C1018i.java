package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C1015f;
import androidx.emoji2.text.C1023n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: androidx.emoji2.text.i */
/* JADX INFO: loaded from: classes.dex */
final class C1018i {

    /* JADX INFO: renamed from: a */
    private final C1015f.j f4853a;

    /* JADX INFO: renamed from: b */
    private final C1023n f4854b;

    /* JADX INFO: renamed from: c */
    private C1015f.e f4855c;

    /* JADX INFO: renamed from: d */
    private final boolean f4856d;

    /* JADX INFO: renamed from: e */
    private final int[] f4857e;

    /* JADX INFO: renamed from: androidx.emoji2.text.i$a */
    private static final class a {
        /* JADX INFO: renamed from: a */
        static int m4566a(CharSequence charSequence, int i3, int i4) {
            int length = charSequence.length();
            if (i3 < 0 || length < i3 || i4 < 0) {
                return -1;
            }
            while (true) {
                boolean z2 = false;
                while (i4 != 0) {
                    i3--;
                    if (i3 < 0) {
                        return z2 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i3);
                    if (z2) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i4--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i4--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z2 = true;
                    }
                }
                return i3;
            }
        }

        /* JADX INFO: renamed from: b */
        static int m4567b(CharSequence charSequence, int i3, int i4) {
            int length = charSequence.length();
            if (i3 < 0 || length < i3 || i4 < 0) {
                return -1;
            }
            while (true) {
                boolean z2 = false;
                while (i4 != 0) {
                    if (i3 >= length) {
                        if (z2) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i3);
                    if (z2) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i4--;
                        i3++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i4--;
                        i3++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i3++;
                        z2 = true;
                    }
                }
                return i3;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.i$b */
    private static class b implements c {

        /* JADX INFO: renamed from: a */
        public C1029t f4858a;

        /* JADX INFO: renamed from: b */
        private final C1015f.j f4859b;

        b(C1029t c1029t, C1015f.j jVar) {
            this.f4858a = c1029t;
            this.f4859b = jVar;
        }

        @Override // androidx.emoji2.text.C1018i.c
        /* JADX INFO: renamed from: b */
        public boolean mo4569b(CharSequence charSequence, int i3, int i4, C1025p c1025p) {
            if (c1025p.m4633k()) {
                return true;
            }
            if (this.f4858a == null) {
                this.f4858a = new C1029t(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f4858a.setSpan(this.f4859b.mo4553a(c1025p), i3, i4, 33);
            return true;
        }

        @Override // androidx.emoji2.text.C1018i.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1029t mo4568a() {
            return this.f4858a;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.i$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        Object mo4568a();

        /* JADX INFO: renamed from: b */
        boolean mo4569b(CharSequence charSequence, int i3, int i4, C1025p c1025p);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.i$d */
    private static class d implements c {

        /* JADX INFO: renamed from: a */
        private final String f4860a;

        d(String str) {
            this.f4860a = str;
        }

        @Override // androidx.emoji2.text.C1018i.c
        /* JADX INFO: renamed from: b */
        public boolean mo4569b(CharSequence charSequence, int i3, int i4, C1025p c1025p) {
            if (!TextUtils.equals(charSequence.subSequence(i3, i4), this.f4860a)) {
                return true;
            }
            c1025p.m4634l(true);
            return false;
        }

        @Override // androidx.emoji2.text.C1018i.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d mo4568a() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.i$e */
    static final class e {

        /* JADX INFO: renamed from: a */
        private int f4861a = 1;

        /* JADX INFO: renamed from: b */
        private final C1023n.a f4862b;

        /* JADX INFO: renamed from: c */
        private C1023n.a f4863c;

        /* JADX INFO: renamed from: d */
        private C1023n.a f4864d;

        /* JADX INFO: renamed from: e */
        private int f4865e;

        /* JADX INFO: renamed from: f */
        private int f4866f;

        /* JADX INFO: renamed from: g */
        private final boolean f4867g;

        /* JADX INFO: renamed from: h */
        private final int[] f4868h;

        e(C1023n.a aVar, boolean z2, int[] iArr) {
            this.f4862b = aVar;
            this.f4863c = aVar;
            this.f4867g = z2;
            this.f4868h = iArr;
        }

        /* JADX INFO: renamed from: d */
        private static boolean m4572d(int i3) {
            return i3 == 65039;
        }

        /* JADX INFO: renamed from: f */
        private static boolean m4573f(int i3) {
            return i3 == 65038;
        }

        /* JADX INFO: renamed from: g */
        private int m4574g() {
            this.f4861a = 1;
            this.f4863c = this.f4862b;
            this.f4866f = 0;
            return 1;
        }

        /* JADX INFO: renamed from: h */
        private boolean m4575h() {
            if (this.f4863c.m4609b().m4632j() || m4572d(this.f4865e)) {
                return true;
            }
            if (this.f4867g) {
                if (this.f4868h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f4868h, this.f4863c.m4609b().m4625b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        int m4576a(int i3) {
            C1023n.a aVarM4608a = this.f4863c.m4608a(i3);
            int iM4574g = 2;
            if (this.f4861a != 2) {
                if (aVarM4608a == null) {
                    iM4574g = m4574g();
                } else {
                    this.f4861a = 2;
                    this.f4863c = aVarM4608a;
                    this.f4866f = 1;
                }
            } else if (aVarM4608a != null) {
                this.f4863c = aVarM4608a;
                this.f4866f++;
            } else if (m4573f(i3)) {
                iM4574g = m4574g();
            } else if (!m4572d(i3)) {
                if (this.f4863c.m4609b() != null) {
                    iM4574g = 3;
                    if (this.f4866f != 1 || m4575h()) {
                        this.f4864d = this.f4863c;
                        m4574g();
                    } else {
                        iM4574g = m4574g();
                    }
                } else {
                    iM4574g = m4574g();
                }
            }
            this.f4865e = i3;
            return iM4574g;
        }

        /* JADX INFO: renamed from: b */
        C1025p m4577b() {
            return this.f4863c.m4609b();
        }

        /* JADX INFO: renamed from: c */
        C1025p m4578c() {
            return this.f4864d.m4609b();
        }

        /* JADX INFO: renamed from: e */
        boolean m4579e() {
            if (this.f4861a != 2 || this.f4863c.m4609b() == null) {
                return false;
            }
            return this.f4866f > 1 || m4575h();
        }
    }

    C1018i(C1023n c1023n, C1015f.j jVar, C1015f.e eVar, boolean z2, int[] iArr, Set set) {
        this.f4853a = jVar;
        this.f4854b = c1023n;
        this.f4855c = eVar;
        this.f4856d = z2;
        this.f4857e = iArr;
        m4563g(set);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4557a(Editable editable, KeyEvent keyEvent, boolean z2) {
        AbstractC1019j[] abstractC1019jArr;
        if (m4562f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m4561e(selectionStart, selectionEnd) && (abstractC1019jArr = (AbstractC1019j[]) editable.getSpans(selectionStart, selectionEnd, AbstractC1019j.class)) != null && abstractC1019jArr.length > 0) {
            for (AbstractC1019j abstractC1019j : abstractC1019jArr) {
                int spanStart = editable.getSpanStart(abstractC1019j);
                int spanEnd = editable.getSpanEnd(abstractC1019j);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    static boolean m4558b(InputConnection inputConnection, Editable editable, int i3, int i4, boolean z2) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i3 >= 0 && i4 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m4561e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z2) {
                iMax = a.m4566a(editable, selectionStart, Math.max(i3, 0));
                iMin = a.m4567b(editable, selectionEnd, Math.max(i4, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i3, 0);
                iMin = Math.min(selectionEnd + i4, editable.length());
            }
            AbstractC1019j[] abstractC1019jArr = (AbstractC1019j[]) editable.getSpans(iMax, iMin, AbstractC1019j.class);
            if (abstractC1019jArr != null && abstractC1019jArr.length > 0) {
                for (AbstractC1019j abstractC1019j : abstractC1019jArr) {
                    int spanStart = editable.getSpanStart(abstractC1019j);
                    int spanEnd = editable.getSpanEnd(abstractC1019j);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    static boolean m4559c(Editable editable, int i3, KeyEvent keyEvent) {
        if (!(i3 != 67 ? i3 != 112 ? false : m4557a(editable, keyEvent, true) : m4557a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: d */
    private boolean m4560d(CharSequence charSequence, int i3, int i4, C1025p c1025p) {
        if (c1025p.m4627d() == 0) {
            c1025p.m4635m(this.f4855c.mo4524a(charSequence, i3, i4, c1025p.m4630h()));
        }
        return c1025p.m4627d() == 2;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m4561e(int i3, int i4) {
        return i3 == -1 || i4 == -1 || i3 != i4;
    }

    /* JADX INFO: renamed from: f */
    private static boolean m4562f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: renamed from: g */
    private void m4563g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m4564i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    /* JADX INFO: renamed from: i */
    private Object m4564i(CharSequence charSequence, int i3, int i4, int i5, boolean z2, c cVar) {
        int iCharCount;
        e eVar = new e(this.f4854b.m4605f(), this.f4856d, this.f4857e);
        int i6 = 0;
        boolean zMo4569b = true;
        int iCodePointAt = Character.codePointAt(charSequence, i3);
        loop0: while (true) {
            iCharCount = i3;
            while (i3 < i4 && i6 < i5 && zMo4569b) {
                int iM4576a = eVar.m4576a(iCodePointAt);
                if (iM4576a == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i4) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i3 = iCharCount;
                } else if (iM4576a == 2) {
                    i3 += Character.charCount(iCodePointAt);
                    if (i3 < i4) {
                        iCodePointAt = Character.codePointAt(charSequence, i3);
                    }
                } else if (iM4576a == 3) {
                    if (z2 || !m4560d(charSequence, iCharCount, i3, eVar.m4578c())) {
                        zMo4569b = cVar.mo4569b(charSequence, iCharCount, i3, eVar.m4578c());
                        i6++;
                    }
                }
            }
            break loop0;
        }
        if (eVar.m4579e() && i6 < i5 && zMo4569b && (z2 || !m4560d(charSequence, iCharCount, i3, eVar.m4577b()))) {
            cVar.mo4569b(charSequence, iCharCount, i3, eVar.m4577b());
        }
        return cVar.mo4568a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:35:0x0069, B:44:0x0085, B:19:0x0031), top: B:65:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.CharSequence m4565h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r1 = r11 instanceof androidx.emoji2.text.C1024o
            if (r1 == 0) goto La
            r0 = r11
            androidx.emoji2.text.o r0 = (androidx.emoji2.text.C1024o) r0
            r0.m4618a()
        La:
            java.lang.Class<androidx.emoji2.text.j> r0 = androidx.emoji2.text.AbstractC1019j.class
            if (r1 != 0) goto L31
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L31
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2f
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r0)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2f
            androidx.emoji2.text.t r2 = new androidx.emoji2.text.t     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L39
        L2a:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto Lb7
        L2f:
            r2 = 0
            goto L39
        L31:
            androidx.emoji2.text.t r2 = new androidx.emoji2.text.t     // Catch: java.lang.Throwable -> Lb0
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> Lb0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb0
        L39:
            r3 = 0
            if (r2 == 0) goto L65
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r0)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.j[] r4 = (androidx.emoji2.text.AbstractC1019j[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = r3
        L49:
            if (r6 >= r5) goto L65
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L5a
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L5a:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L49
        L65:
            r4 = r12
            r5 = r13
            if (r4 == r5) goto L6f
            int r12 = r11.length()     // Catch: java.lang.Throwable -> Lb0
            if (r4 < r12) goto L71
        L6f:
            r3 = r11
            goto Lb3
        L71:
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r12) goto L84
            if (r2 == 0) goto L84
            int r12 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r12 = r2.getSpans(r3, r12, r0)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.j[] r12 = (androidx.emoji2.text.AbstractC1019j[]) r12     // Catch: java.lang.Throwable -> L2a
            int r12 = r12.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r12
        L84:
            r6 = r14
            androidx.emoji2.text.i$b r8 = new androidx.emoji2.text.i$b     // Catch: java.lang.Throwable -> Lb0
            androidx.emoji2.text.f$j r12 = r10.f4853a     // Catch: java.lang.Throwable -> Lb0
            r8.<init>(r2, r12)     // Catch: java.lang.Throwable -> Lb0
            r2 = r10
            r3 = r11
            r7 = r15
            java.lang.Object r11 = r2.m4564i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La4
            androidx.emoji2.text.t r11 = (androidx.emoji2.text.C1029t) r11     // Catch: java.lang.Throwable -> La4
            if (r11 == 0) goto La7
            android.text.Spannable r11 = r11.m4643b()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto La3
            r12 = r3
            androidx.emoji2.text.o r12 = (androidx.emoji2.text.C1024o) r12
            r12.m4619d()
        La3:
            return r11
        La4:
            r0 = move-exception
        La5:
            r12 = r0
            goto Lb7
        La7:
            if (r1 == 0) goto Laf
        La9:
            r11 = r3
            androidx.emoji2.text.o r11 = (androidx.emoji2.text.C1024o) r11
            r11.m4619d()
        Laf:
            return r3
        Lb0:
            r0 = move-exception
            r3 = r11
            goto La5
        Lb3:
            if (r1 == 0) goto Lb6
            goto La9
        Lb6:
            return r3
        Lb7:
            if (r1 == 0) goto Lbf
            r11 = r3
            androidx.emoji2.text.o r11 = (androidx.emoji2.text.C1024o) r11
            r11.m4619d()
        Lbf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C1018i.m4565h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
