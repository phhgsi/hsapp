package p005B1;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: renamed from: B1.g */
/* JADX INFO: loaded from: classes.dex */
public class C0083g {

    /* JADX INFO: renamed from: a */
    private static final byte f157a = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b */
    private static final byte f158b = Byte.parseByte("00001111", 2);

    /* JADX INFO: renamed from: b */
    private static String m196b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* JADX INFO: renamed from: c */
    private static byte[] m197c(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    /* JADX INFO: renamed from: a */
    public String m198a() {
        byte[] bArrM197c = m197c(UUID.randomUUID(), new byte[17]);
        byte b3 = bArrM197c[0];
        bArrM197c[16] = b3;
        bArrM197c[0] = (byte) ((b3 & f158b) | f157a);
        return m196b(bArrM197c);
    }
}
