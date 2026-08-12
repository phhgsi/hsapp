package com.google.firebase.messaging;

import com.google.android.gms.common.api.Api;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: renamed from: com.google.firebase.messaging.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1721b {
    /* JADX INFO: renamed from: a */
    private static byte[] m9398a(Queue queue, int i3) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i3) {
            return bArr;
        }
        int length = i3 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i3 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    public static InputStream m9399b(InputStream inputStream, long j3) {
        return new a(inputStream, j3);
    }

    /* JADX INFO: renamed from: c */
    private static int m9400c(long j3) {
        if (j3 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j3 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j3;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m9401d(InputStream inputStream) {
        return m9402e(inputStream, new ArrayDeque(20), 0);
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m9402e(InputStream inputStream, Queue queue, int i3) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i3) * 2));
        while (i3 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i3);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i4 = 0;
            while (i4 < iMin2) {
                int i5 = inputStream.read(bArr, i4, iMin2 - i4);
                if (i5 == -1) {
                    return m9398a(queue, i3);
                }
                i4 += i5;
                i3 += i5;
            }
            iMin = m9400c(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return m9398a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.b$a */
    private static final class a extends FilterInputStream {

        /* JADX INFO: renamed from: d */
        private long f8587d;

        /* JADX INFO: renamed from: e */
        private long f8588e;

        a(InputStream inputStream, long j3) {
            super(inputStream);
            this.f8588e = -1L;
            this.f8587d = j3;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f8587d);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i3) {
            ((FilterInputStream) this).in.mark(i3);
            this.f8588e = this.f8587d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f8587d == 0) {
                return -1;
            }
            int i3 = ((FilterInputStream) this).in.read();
            if (i3 != -1) {
                this.f8587d--;
            }
            return i3;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f8588e == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f8587d = this.f8588e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j3) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j3, this.f8587d));
            this.f8587d -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i3, int i4) throws IOException {
            long j3 = this.f8587d;
            if (j3 == 0) {
                return -1;
            }
            int i5 = ((FilterInputStream) this).in.read(bArr, i3, (int) Math.min(i4, j3));
            if (i5 != -1) {
                this.f8587d -= (long) i5;
            }
            return i5;
        }
    }
}
