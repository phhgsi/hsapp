package p072Y;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: Y.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0620d {

    /* JADX INFO: renamed from: Y.d$a */
    static class a {

        /* JADX INFO: renamed from: a */
        long f2025a;

        /* JADX INFO: renamed from: b */
        long f2026b;

        a() {
        }
    }

    /* JADX INFO: renamed from: a */
    static long m2204a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j3 = aVar.f2026b;
        randomAccessFile.seek(aVar.f2025a);
        byte[] bArr = new byte[16384];
        int i3 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j3));
        while (i3 != -1) {
            crc32.update(bArr, 0, i3);
            j3 -= (long) i3;
            if (j3 == 0) {
                break;
            }
            i3 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j3));
        }
        return crc32.getValue();
    }

    /* JADX INFO: renamed from: b */
    static a m2205b(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j3 = length - 22;
        if (j3 < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j4 = length - 65558;
        long j5 = j4 >= 0 ? j4 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j3);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f2026b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                aVar.f2025a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return aVar;
            }
            j3--;
        } while (j3 >= j5);
        throw new ZipException("End Of Central Directory signature not found");
    }

    /* JADX INFO: renamed from: c */
    static long m2206c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m2204a(randomAccessFile, m2205b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
