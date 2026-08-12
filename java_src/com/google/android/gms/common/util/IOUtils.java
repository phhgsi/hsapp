package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class IOUtils {
    private IOUtils() {
    }

    public static void closeQuietly(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static long copyStream(InputStream inputStream, OutputStream outputStream) {
        return copyStream(inputStream, outputStream, false, 1024);
    }

    public static boolean isGzipByteBuffer(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static byte[] readInputStreamFully(InputStream inputStream) {
        return readInputStreamFully(inputStream, true);
    }

    @Deprecated
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i3);
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static long copyStream(InputStream inputStream, OutputStream outputStream, boolean z2, int i3) {
        byte[] bArr = new byte[i3];
        long j3 = 0;
        while (true) {
            try {
                int i4 = inputStream.read(bArr, 0, i3);
                if (i4 == -1) {
                    break;
                }
                j3 += (long) i4;
                outputStream.write(bArr, 0, i4);
            } catch (Throwable th) {
                if (z2) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th;
            }
        }
        if (z2) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j3;
    }

    @Deprecated
    public static byte[] readInputStreamFully(InputStream inputStream, boolean z2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z2, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
