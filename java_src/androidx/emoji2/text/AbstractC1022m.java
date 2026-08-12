package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p048Q.C0482b;

/* JADX INFO: renamed from: androidx.emoji2.text.m */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1022m {

    /* JADX INFO: renamed from: androidx.emoji2.text.m$a */
    private static class a implements c {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f4886a;

        a(ByteBuffer byteBuffer) {
            this.f4886a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.AbstractC1022m.c
        /* JADX INFO: renamed from: a */
        public void mo4595a(int i3) {
            ByteBuffer byteBuffer = this.f4886a;
            byteBuffer.position(byteBuffer.position() + i3);
        }

        @Override // androidx.emoji2.text.AbstractC1022m.c
        /* JADX INFO: renamed from: b */
        public int mo4596b() {
            return AbstractC1022m.m4594d(this.f4886a.getShort());
        }

        @Override // androidx.emoji2.text.AbstractC1022m.c
        /* JADX INFO: renamed from: c */
        public long mo4597c() {
            return AbstractC1022m.m4593c(this.f4886a.getInt());
        }

        @Override // androidx.emoji2.text.AbstractC1022m.c
        /* JADX INFO: renamed from: d */
        public int mo4598d() {
            return this.f4886a.getInt();
        }

        @Override // androidx.emoji2.text.AbstractC1022m.c
        public long getPosition() {
            return this.f4886a.position();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.m$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final long f4887a;

        /* JADX INFO: renamed from: b */
        private final long f4888b;

        b(long j3, long j4) {
            this.f4887a = j3;
            this.f4888b = j4;
        }

        /* JADX INFO: renamed from: a */
        long m4599a() {
            return this.f4887a;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.m$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        void mo4595a(int i3);

        /* JADX INFO: renamed from: b */
        int mo4596b();

        /* JADX INFO: renamed from: c */
        long mo4597c();

        /* JADX INFO: renamed from: d */
        int mo4598d();

        long getPosition();
    }

    /* JADX INFO: renamed from: a */
    private static b m4591a(c cVar) throws IOException {
        long jMo4597c;
        cVar.mo4595a(4);
        int iMo4596b = cVar.mo4596b();
        if (iMo4596b > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.mo4595a(6);
        int i3 = 0;
        while (true) {
            if (i3 >= iMo4596b) {
                jMo4597c = -1;
                break;
            }
            int iMo4598d = cVar.mo4598d();
            cVar.mo4595a(4);
            jMo4597c = cVar.mo4597c();
            cVar.mo4595a(4);
            if (1835365473 == iMo4598d) {
                break;
            }
            i3++;
        }
        if (jMo4597c != -1) {
            cVar.mo4595a((int) (jMo4597c - cVar.getPosition()));
            cVar.mo4595a(12);
            long jMo4597c2 = cVar.mo4597c();
            for (int i4 = 0; i4 < jMo4597c2; i4++) {
                int iMo4598d2 = cVar.mo4598d();
                long jMo4597c3 = cVar.mo4597c();
                long jMo4597c4 = cVar.mo4597c();
                if (1164798569 == iMo4598d2 || 1701669481 == iMo4598d2) {
                    return new b(jMo4597c3 + jMo4597c, jMo4597c4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: b */
    static C0482b m4592b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) m4591a(new a(byteBufferDuplicate)).m4599a());
        return C0482b.m1781h(byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: c */
    static long m4593c(int i3) {
        return ((long) i3) & 4294967295L;
    }

    /* JADX INFO: renamed from: d */
    static int m4594d(short s2) {
        return s2 & 65535;
    }
}
