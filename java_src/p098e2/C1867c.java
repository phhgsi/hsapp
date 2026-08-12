package p098e2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;
import p086b2.AbstractC1304d;
import p086b2.C1303c;
import p094d2.InterfaceC1820f;

/* JADX INFO: renamed from: e2.c */
/* JADX INFO: loaded from: classes.dex */
final class C1867c implements InterfaceC1820f {

    /* JADX INFO: renamed from: a */
    private final CharSequence f9299a;

    /* JADX INFO: renamed from: b */
    private final int f9300b;

    /* JADX INFO: renamed from: c */
    private final int f9301c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0581p f9302d;

    /* JADX INFO: renamed from: e2.c$a */
    public static final class a implements Iterator, InterfaceC0622a {

        /* JADX INFO: renamed from: d */
        private int f9303d = -1;

        /* JADX INFO: renamed from: e */
        private int f9304e;

        /* JADX INFO: renamed from: f */
        private int f9305f;

        /* JADX INFO: renamed from: g */
        private C1303c f9306g;

        /* JADX INFO: renamed from: h */
        private int f9307h;

        a() {
            int iD = AbstractC1304d.m6634d(C1867c.this.f9300b, 0, C1867c.this.f9299a.length());
            this.f9304e = iD;
            this.f9305f = iD;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void m9662a() {
            /*
                r6 = this;
                int r0 = r6.f9305f
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.f9303d = r1
                r0 = 0
                r6.f9306g = r0
                return
            Lb:
                e2.c r0 = p098e2.C1867c.this
                int r0 = p098e2.C1867c.m9660c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.f9307h
                int r0 = r0 + r3
                r6.f9307h = r0
                e2.c r4 = p098e2.C1867c.this
                int r4 = p098e2.C1867c.m9660c(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.f9305f
                e2.c r4 = p098e2.C1867c.this
                java.lang.CharSequence r4 = p098e2.C1867c.m9659b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                b2.c r0 = new b2.c
                int r1 = r6.f9304e
                e2.c r4 = p098e2.C1867c.this
                java.lang.CharSequence r4 = p098e2.C1867c.m9659b(r4)
                int r4 = p098e2.AbstractC1879o.m9681n(r4)
                r0.<init>(r1, r4)
                r6.f9306g = r0
                r6.f9305f = r2
                goto L9b
            L46:
                e2.c r0 = p098e2.C1867c.this
                W1.p r0 = p098e2.C1867c.m9658a(r0)
                e2.c r4 = p098e2.C1867c.this
                java.lang.CharSequence r4 = p098e2.C1867c.m9659b(r4)
                int r5 = r6.f9305f
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo1609d(r4, r5)
                L1.l r0 = (p035L1.C0380l) r0
                if (r0 != 0) goto L76
                b2.c r0 = new b2.c
                int r1 = r6.f9304e
                e2.c r4 = p098e2.C1867c.this
                java.lang.CharSequence r4 = p098e2.C1867c.m9659b(r4)
                int r4 = p098e2.AbstractC1879o.m9681n(r4)
                r0.<init>(r1, r4)
                r6.f9306g = r0
                r6.f9305f = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.m1365a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m1366b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f9304e
                b2.c r4 = p086b2.AbstractC1304d.m6636f(r4, r2)
                r6.f9306g = r4
                int r2 = r2 + r0
                r6.f9304e = r2
                if (r0 != 0) goto L98
                r1 = r3
            L98:
                int r2 = r2 + r1
                r6.f9305f = r2
            L9b:
                r6.f9303d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p098e2.C1867c.a.m9662a():void");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1303c next() {
            if (this.f9303d == -1) {
                m9662a();
            }
            if (this.f9303d == 0) {
                throw new NoSuchElementException();
            }
            C1303c c1303c = this.f9306g;
            AbstractC0606k.m2143c(c1303c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f9306g = null;
            this.f9303d = -1;
            return c1303c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9303d == -1) {
                m9662a();
            }
            return this.f9303d == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1867c(CharSequence charSequence, int i3, int i4, InterfaceC0581p interfaceC0581p) {
        AbstractC0606k.m2145e(charSequence, "input");
        AbstractC0606k.m2145e(interfaceC0581p, "getNextMatch");
        this.f9299a = charSequence;
        this.f9300b = i3;
        this.f9301c = i4;
        this.f9302d = interfaceC0581p;
    }

    @Override // p094d2.InterfaceC1820f
    public Iterator iterator() {
        return new a();
    }
}
