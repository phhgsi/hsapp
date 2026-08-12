package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', '\"'};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final zai zag = new zaa();
    private static final zai zah = new zab();
    private static final zai zai = new zac();
    private static final zai zaj = new zad();
    private static final zai zak = new zae();
    private static final zai zal = new zaf();
    private static final zai zam = new zag();
    private static final zai zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack zat = new Stack();

    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, char[] r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = r0
            r2 = r1
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L60
            r4 = r0
        L12:
            if (r4 >= r3) goto L58
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L2b
            if (r11 == 0) goto L23
            char r6 = r11[r0]
            if (r6 != r5) goto L23
            goto L2b
        L23:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L2b:
            int r6 = r4 + 1
            r7 = 34
            if (r5 != r7) goto L4f
            if (r1 != 0) goto L4d
            r10.append(r9, r0, r4)
            r8.reset()
            long r0 = (long) r6
            r8.skip(r0)
            if (r2 == 0) goto L48
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L48:
            java.lang.String r8 = r10.toString()
            return r8
        L4d:
            r1 = r0
            goto L56
        L4f:
            r4 = 92
            if (r5 != r4) goto L4d
            r1 = r1 ^ 1
            r2 = 1
        L56:
            r4 = r6
            goto L12
        L58:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L60:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaA(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    private final char zai(BufferedReader bufferedReader) {
        if (bufferedReader.read(this.zao) != -1) {
            while (Character.isWhitespace(this.zao[0])) {
                if (bufferedReader.read(this.zao) == -1) {
                }
            }
            return this.zao[0];
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) throws ParseException, IOException {
        int i3;
        int i4;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c3 = cArr[0];
        int i5 = c3 == '-' ? Integer.MIN_VALUE : -2147483647;
        int i6 = c3 == '-' ? 1 : 0;
        if (i6 < iZam) {
            i4 = i6 + 1;
            int iDigit = Character.digit(cArr[i6], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i6;
        }
        while (i4 < iZam) {
            int i7 = i4 + 1;
            int iDigit2 = Character.digit(cArr[i4], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i3 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i8 = i3 * 10;
            if (i8 < i5 + iDigit2) {
                throw new ParseException("Number too large");
            }
            i3 = i8 - iDigit2;
            i4 = i7;
        }
        if (i6 == 0) {
            return -i3;
        }
        if (i4 > 1) {
            return i3;
        }
        throw new ParseException("No digits to parse");
    }

    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i3;
        char cZai = zai(bufferedReader);
        if (cZai == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (cZai == ',') {
            throw new ParseException("Missing value");
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cZai == '\"') {
            i3 = 0;
            boolean z2 = false;
            while (i3 < 1024 && bufferedReader.read(cArr, i3, 1) != -1) {
                char c3 = cArr[i3];
                if (Character.isISOControl(c3)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i4 = i3 + 1;
                if (c3 != '\"') {
                    if (c3 == '\\') {
                        z2 = !z2;
                    }
                    i3 = i4;
                } else if (!z2) {
                    bufferedReader.reset();
                    bufferedReader.skip(i4);
                    return i3;
                }
                z2 = false;
                i3 = i4;
            }
        } else {
            cArr[0] = cZai;
            i3 = 1;
            while (i3 < 1024 && bufferedReader.read(cArr, i3, 1) != -1) {
                char c4 = cArr[i3];
                if (c4 == '}' || c4 == ',' || Character.isWhitespace(c4) || cArr[i3] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i3 - 1);
                    cArr[i3] = 0;
                    return i3;
                }
                i3++;
            }
        }
        if (i3 == 1024) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j3;
        int i3;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c3 = cArr[0];
        long j4 = c3 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i4 = c3 == '-' ? 1 : 0;
        int i5 = 10;
        if (i4 < iZam) {
            i3 = i4 + 1;
            int iDigit = Character.digit(cArr[i4], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j3 = -iDigit;
        } else {
            j3 = 0;
            i3 = i4;
        }
        while (i3 < iZam) {
            int i6 = i3 + 1;
            int iDigit2 = Character.digit(cArr[i3], i5);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j3 < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j5 = j3 * 10;
            long j6 = j4;
            long j7 = iDigit2;
            if (j5 < j6 + j7) {
                throw new ParseException("Number too large");
            }
            j3 = j5 - j7;
            i3 = i6;
            j4 = j6;
            i5 = 10;
        }
        if (i4 == 0) {
            return -j3;
        }
        if (i3 > 1) {
            return j3;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zao(BufferedReader bufferedReader) {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            return zaA(bufferedReader, cArr, sb, cArr2);
        }
        if (cZai != 'n') {
            throw new ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    @ResultIgnorabilityUnspecified
    private final String zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zat.push(2);
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            this.zat.push(3);
            String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return strZaA;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (cZai == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (cZai == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token: " + cZai);
    }

    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char cZai = zai(bufferedReader);
        int i3 = 1;
        if (cZai == '\"') {
            if (bufferedReader.read(this.zao) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c3 = this.zao[0];
            boolean z2 = false;
            do {
                if (c3 == '\"') {
                    if (z2) {
                        c3 = '\"';
                        z2 = true;
                    }
                }
                z2 = c3 == '\\' ? !z2 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c3 = this.zao[0];
            } while (!Character.isISOControl(c3));
            throw new ParseException("Unexpected control character while reading string");
        }
        if (cZai == ',') {
            throw new ParseException("Missing value");
        }
        if (cZai == '[') {
            this.zat.push(5);
            bufferedReader.mark(32);
            if (zai(bufferedReader) == ']') {
                zaw(5);
            } else {
                bufferedReader.reset();
                boolean z3 = false;
                boolean z4 = false;
                while (i3 > 0) {
                    char cZai2 = zai(bufferedReader);
                    if (cZai2 == 0) {
                        throw new ParseException("Unexpected EOF while parsing array");
                    }
                    if (Character.isISOControl(cZai2)) {
                        throw new ParseException("Unexpected control character while reading array");
                    }
                    if (cZai2 == '\"') {
                        if (!z4) {
                            z3 = !z3;
                        }
                        cZai2 = '\"';
                    }
                    if (cZai2 == '[') {
                        if (!z3) {
                            i3++;
                        }
                        cZai2 = '[';
                    }
                    if (cZai2 == ']' && !z3) {
                        i3--;
                    }
                    z4 = (cZai2 == '\\' && z3) ? !z4 : false;
                }
                zaw(5);
            }
        } else if (cZai != '{') {
            bufferedReader.reset();
            zam(bufferedReader, this.zaq);
        } else {
            this.zat.push(1);
            bufferedReader.mark(32);
            char cZai3 = zai(bufferedReader);
            if (cZai3 == '}') {
                zaw(1);
            } else {
                if (cZai3 != '\"') {
                    throw new ParseException("Unexpected token " + cZai3);
                }
                bufferedReader.reset();
                zaq(bufferedReader);
                while (zar(bufferedReader) != null) {
                }
                zaw(1);
            }
        }
        char cZai4 = zai(bufferedReader);
        if (cZai4 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (cZai4 == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token " + cZai4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zas(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zat(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, iZam));
    }

    private final ArrayList zau(BufferedReader bufferedReader, zai zaiVar) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (cZai != '[') {
            throw new ParseException("Expected start of array");
        }
        this.zat.push(5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char cZai2 = zai(bufferedReader);
            if (cZai2 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (cZai2 != ',') {
                if (cZai2 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) throws ParseException, IOException {
        ArrayList arrayList = new ArrayList();
        char cZai = zai(bufferedReader);
        if (cZai == ']') {
            zaw(5);
            return arrayList;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (cZai != '{') {
            throw new ParseException("Unexpected token: " + cZai);
        }
        this.zat.push(1);
        while (true) {
            try {
                FastJsonResponse fastJsonResponseZad = field.zad();
                if (!zaz(bufferedReader, fastJsonResponseZad)) {
                    return arrayList;
                }
                arrayList.add(fastJsonResponseZad);
                char cZai2 = zai(bufferedReader);
                if (cZai2 != ',') {
                    if (cZai2 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    throw new ParseException("Unexpected token: " + cZai2);
                }
                if (zai(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                this.zat.push(1);
            } catch (IllegalAccessException e3) {
                throw new ParseException("Error instantiating inner object", e3);
            } catch (InstantiationException e4) {
                throw new ParseException("Error instantiating inner object", e4);
            }
        }
    }

    private final void zaw(int i3) throws ParseException {
        if (this.zat.isEmpty()) {
            throw new ParseException("Expected state " + i3 + " but had empty stack");
        }
        int iIntValue = ((Integer) this.zat.pop()).intValue();
        if (iIntValue == i3) {
            return;
        }
        throw new ParseException("Expected state " + i3 + " but had " + iIntValue);
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i3 = 0;
        while (true) {
            int length = cArr.length;
            if (i3 >= length) {
                return;
            }
            int i4 = bufferedReader.read(this.zap, 0, length - i3);
            if (i4 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i5 = 0; i5 < i4; i5++) {
                if (cArr[i5 + i3] != this.zap[i5]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i3 += i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z2) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            if (z2) {
                throw new ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        }
        if (cZai == 'f') {
            zax(bufferedReader, z2 ? zae : zad);
            return false;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (cZai == 't') {
            zax(bufferedReader, z2 ? zac : zab);
            return true;
        }
        throw new ParseException("Unexpected token: " + cZai);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x025f A[SYNTHETIC] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zaz(java.io.BufferedReader r18, com.google.android.gms.common.server.response.FastJsonResponse r19) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaz(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    public void parse(InputStream inputStream, T t2) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char cZai = zai(bufferedReader);
                if (cZai == 0) {
                    throw new ParseException("No data to parse");
                }
                if (cZai == '[') {
                    this.zat.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t2.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t2.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (cZai != '{') {
                        throw new ParseException("Unexpected token: " + cZai);
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t2);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (IOException e3) {
                throw new ParseException(e3);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }
}
