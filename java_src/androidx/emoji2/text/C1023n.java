package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import p012E.AbstractC0124u;
import p024I.AbstractC0211h;
import p048Q.C0482b;

/* JADX INFO: renamed from: androidx.emoji2.text.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1023n {

    /* JADX INFO: renamed from: a */
    private final C0482b f4889a;

    /* JADX INFO: renamed from: b */
    private final char[] f4890b;

    /* JADX INFO: renamed from: c */
    private final a f4891c = new a(1024);

    /* JADX INFO: renamed from: d */
    private final Typeface f4892d;

    /* JADX INFO: renamed from: androidx.emoji2.text.n$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private final SparseArray f4893a;

        /* JADX INFO: renamed from: b */
        private C1025p f4894b;

        private a() {
            this(1);
        }

        /* JADX INFO: renamed from: a */
        a m4608a(int i3) {
            SparseArray sparseArray = this.f4893a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i3);
        }

        /* JADX INFO: renamed from: b */
        final C1025p m4609b() {
            return this.f4894b;
        }

        /* JADX INFO: renamed from: c */
        void m4610c(C1025p c1025p, int i3, int i4) {
            a aVarM4608a = m4608a(c1025p.m4625b(i3));
            if (aVarM4608a == null) {
                aVarM4608a = new a();
                this.f4893a.put(c1025p.m4625b(i3), aVarM4608a);
            }
            if (i4 > i3) {
                aVarM4608a.m4610c(c1025p, i3 + 1, i4);
            } else {
                aVarM4608a.f4894b = c1025p;
            }
        }

        a(int i3) {
            this.f4893a = new SparseArray(i3);
        }
    }

    private C1023n(Typeface typeface, C0482b c0482b) {
        this.f4892d = typeface;
        this.f4889a = c0482b;
        this.f4890b = new char[c0482b.m1786k() * 2];
        m4600a(c0482b);
    }

    /* JADX INFO: renamed from: a */
    private void m4600a(C0482b c0482b) {
        int iM1786k = c0482b.m1786k();
        for (int i3 = 0; i3 < iM1786k; i3++) {
            C1025p c1025p = new C1025p(this, i3);
            Character.toChars(c1025p.m4629f(), this.f4890b, i3 * 2);
            m4607h(c1025p);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1023n m4601b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            AbstractC0124u.m359a("EmojiCompat.MetadataRepo.create");
            return new C1023n(typeface, AbstractC1022m.m4592b(byteBuffer));
        } finally {
            AbstractC0124u.m360b();
        }
    }

    /* JADX INFO: renamed from: c */
    public char[] m4602c() {
        return this.f4890b;
    }

    /* JADX INFO: renamed from: d */
    public C0482b m4603d() {
        return this.f4889a;
    }

    /* JADX INFO: renamed from: e */
    int m4604e() {
        return this.f4889a.m1787l();
    }

    /* JADX INFO: renamed from: f */
    a m4605f() {
        return this.f4891c;
    }

    /* JADX INFO: renamed from: g */
    Typeface m4606g() {
        return this.f4892d;
    }

    /* JADX INFO: renamed from: h */
    void m4607h(C1025p c1025p) {
        AbstractC0211h.m611h(c1025p, "emoji metadata cannot be null");
        AbstractC0211h.m605b(c1025p.m4626c() > 0, "invalid metadata codepoint length");
        this.f4891c.m4610c(c1025p, 0, c1025p.m4626c() - 1);
    }
}
