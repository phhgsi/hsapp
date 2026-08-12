package com.google.android.gms.common.util;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public final class HexDumpUtils {
    @ResultIgnorabilityUnspecified
    public static String dump(byte[] bArr, int i3, int i4, boolean z2) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i3 < 0 || i4 <= 0 || i3 + i4 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder((z2 ? 75 : 57) * ((i4 + 15) / 16));
        int i5 = i4;
        int i6 = 0;
        int i7 = 0;
        while (i5 > 0) {
            if (i6 == 0) {
                if (i4 < 65536) {
                    sb.append(String.format("%04X:", Integer.valueOf(i3)));
                } else {
                    sb.append(String.format("%08X:", Integer.valueOf(i3)));
                }
                i7 = i3;
            } else if (i6 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[i3] & 255)));
            i5--;
            i6++;
            if (z2 && (i6 == 16 || i5 == 0)) {
                int i8 = 16 - i6;
                if (i8 > 0) {
                    for (int i9 = 0; i9 < i8; i9++) {
                        sb.append("   ");
                    }
                }
                if (i8 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int i10 = 0; i10 < i6; i10++) {
                    char c3 = (char) bArr[i7 + i10];
                    if (c3 < ' ' || c3 > '~') {
                        c3 = '.';
                    }
                    sb.append(c3);
                }
            }
            if (i6 == 16 || i5 == 0) {
                sb.append('\n');
                i6 = 0;
            }
            i3++;
        }
        return sb.toString();
    }
}
