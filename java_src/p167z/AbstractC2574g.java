package p167z;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: z.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2574g {

    /* JADX INFO: renamed from: z.g$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        int f11904a;

        /* JADX INFO: renamed from: b */
        boolean f11905b;

        a() {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m12278a(ArrayList arrayList, char c3, float[] fArr) {
        arrayList.add(new b(c3, fArr));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12279b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i3 = 0; i3 < bVarArr.length; i3++) {
            if (bVarArr[i3].f11906a != bVarArr2[i3].f11906a || bVarArr[i3].f11907b.length != bVarArr2[i3].f11907b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    static float[] m12280c(float[] fArr, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i3 < 0 || i3 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i5 = i4 - i3;
        int iMin = Math.min(i5, length - i3);
        float[] fArr2 = new float[i5];
        System.arraycopy(fArr, i3, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: d */
    public static b[] m12281d(String str) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            int iM12286i = m12286i(str, i4);
            String strTrim = str.substring(i3, iM12286i).trim();
            if (!strTrim.isEmpty()) {
                m12278a(arrayList, strTrim.charAt(0), m12285h(strTrim));
            }
            i3 = iM12286i;
            i4 = iM12286i + 1;
        }
        if (i4 - i3 == 1 && i3 < str.length()) {
            m12278a(arrayList, str.charAt(i3), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    /* JADX INFO: renamed from: e */
    public static Path m12282e(String str) {
        Path path = new Path();
        try {
            b.m12296i(m12281d(str), path);
            return path;
        } catch (RuntimeException e3) {
            throw new RuntimeException("Error in parsing " + str, e3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static b[] m12283f(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i3 = 0; i3 < bVarArr.length; i3++) {
            bVarArr2[i3] = new b(bVarArr[i3]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m12284g(java.lang.String r8, int r9, p167z.AbstractC2574g.a r10) {
        /*
            r0 = 0
            r10.f11905b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.f11905b = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.f11905b = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.f11904a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p167z.AbstractC2574g.m12284g(java.lang.String, int, z.g$a):void");
    }

    /* JADX INFO: renamed from: h */
    private static float[] m12285h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i3 = 1;
            int i4 = 0;
            while (i3 < length) {
                m12284g(str, i3, aVar);
                int i5 = aVar.f11904a;
                if (i3 < i5) {
                    fArr[i4] = Float.parseFloat(str.substring(i3, i5));
                    i4++;
                }
                i3 = aVar.f11905b ? i5 : i5 + 1;
            }
            return m12280c(fArr, 0, i4);
        } catch (NumberFormatException e3) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e3);
        }
    }

    /* JADX INFO: renamed from: i */
    private static int m12286i(String str, int i3) {
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i3++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: j */
    public static void m12287j(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c3 = 'm';
        for (b bVar : bVarArr) {
            b.m12293e(path, fArr, c3, bVar.f11906a, bVar.f11907b);
            c3 = bVar.f11906a;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m12288k(b[] bVarArr, b[] bVarArr2) {
        for (int i3 = 0; i3 < bVarArr2.length; i3++) {
            bVarArr[i3].f11906a = bVarArr2[i3].f11906a;
            for (int i4 = 0; i4 < bVarArr2[i3].f11907b.length; i4++) {
                bVarArr[i3].f11907b[i4] = bVarArr2[i3].f11907b[i4];
            }
        }
    }

    /* JADX INFO: renamed from: z.g$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private char f11906a;

        /* JADX INFO: renamed from: b */
        private final float[] f11907b;

        b(char c3, float[] fArr) {
            this.f11906a = c3;
            this.f11907b = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX INFO: renamed from: e */
        public static void m12293e(Path path, float[] fArr, char c3, char c4, float[] fArr2) {
            int i3;
            int i4;
            boolean z2;
            boolean z3;
            char c5;
            char c6;
            int i5;
            float f3;
            boolean z4;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            boolean z5;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            Path path2 = path;
            boolean z6 = false;
            float f19 = fArr[0];
            boolean z7 = true;
            float f20 = fArr[1];
            char c7 = 2;
            float f21 = fArr[2];
            char c8 = 3;
            float f22 = fArr[3];
            float f23 = fArr[4];
            float f24 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i3 = 7;
                    i4 = i3;
                    break;
                case 'C':
                case 'c':
                    i3 = 6;
                    i4 = i3;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i4 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i4 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i4 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                    i4 = 2;
                    break;
            }
            float f25 = f19;
            float f26 = f20;
            float f27 = f23;
            float f28 = f24;
            int i6 = 0;
            char c9 = c3;
            while (i6 < fArr2.length) {
                if (c4 == 'A') {
                    float f29 = f25;
                    float f30 = f26;
                    z2 = z6;
                    z3 = z7;
                    c5 = c7;
                    c6 = c8;
                    i5 = i6;
                    int i7 = i5 + 5;
                    float f31 = fArr2[i7];
                    int i8 = i5 + 6;
                    float f32 = fArr2[i8];
                    float f33 = fArr2[i5];
                    float f34 = fArr2[i5 + 1];
                    float f35 = fArr2[i5 + 2];
                    if (fArr2[i5 + 3] != 0.0f) {
                        f3 = 0.0f;
                        z4 = z3;
                    } else {
                        f3 = 0.0f;
                        z4 = z2;
                    }
                    m12295g(path, f29, f30, f31, f32, f33, f34, f35, z4, fArr2[i5 + 4] != f3 ? z3 : z2);
                    f21 = fArr2[i7];
                    f25 = f21;
                    f22 = fArr2[i8];
                    f26 = f22;
                } else if (c4 == 'C') {
                    z2 = z6;
                    z3 = z7;
                    c5 = c7;
                    c6 = c8;
                    i5 = i6;
                    int i9 = i5 + 2;
                    int i10 = i5 + 3;
                    int i11 = i5 + 4;
                    int i12 = i5 + 5;
                    path2.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i9], fArr2[i10], fArr2[i11], fArr2[i12]);
                    float f36 = fArr2[i11];
                    float f37 = fArr2[i12];
                    float f38 = fArr2[i9];
                    float f39 = fArr2[i10];
                    f25 = f36;
                    f26 = f37;
                    f22 = f39;
                    f21 = f38;
                } else if (c4 != 'H') {
                    if (c4 != 'Q') {
                        z2 = z6;
                        if (c4 == 'V') {
                            z3 = z7;
                            c5 = c7;
                            c6 = c8;
                            i5 = i6;
                            path2.lineTo(f25, fArr2[i5]);
                            f6 = fArr2[i5];
                        } else if (c4 != 'a') {
                            if (c4 != 'c') {
                                z3 = z7;
                                if (c4 != 'h') {
                                    if (c4 != 'q') {
                                        c5 = c7;
                                        if (c4 != 'v') {
                                            if (c4 != 'L') {
                                                if (c4 != 'M') {
                                                    c6 = c8;
                                                    if (c4 == 'S') {
                                                        if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                            f25 = (f25 * 2.0f) - f21;
                                                            f26 = (f26 * 2.0f) - f22;
                                                        }
                                                        float f40 = f25;
                                                        float f41 = f26;
                                                        int i13 = i6 + 1;
                                                        int i14 = i6 + 2;
                                                        int i15 = i6 + 3;
                                                        path2.cubicTo(f40, f41, fArr2[i6], fArr2[i13], fArr2[i14], fArr2[i15]);
                                                        f4 = fArr2[i6];
                                                        f5 = fArr2[i13];
                                                        f25 = fArr2[i14];
                                                        f26 = fArr2[i15];
                                                        i5 = i6;
                                                    } else if (c4 == 'T') {
                                                        if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                            f25 = (f25 * 2.0f) - f21;
                                                            f26 = (f26 * 2.0f) - f22;
                                                        }
                                                        int i16 = i6 + 1;
                                                        path2.quadTo(f25, f26, fArr2[i6], fArr2[i16]);
                                                        float f42 = fArr2[i6];
                                                        f6 = fArr2[i16];
                                                        f21 = f25;
                                                        f22 = f26;
                                                        i5 = i6;
                                                        f25 = f42;
                                                    } else if (c4 == 'l') {
                                                        int i17 = i6 + 1;
                                                        path2.rLineTo(fArr2[i6], fArr2[i17]);
                                                        f25 += fArr2[i6];
                                                        f12 = fArr2[i17];
                                                    } else if (c4 == 'm') {
                                                        float f43 = fArr2[i6];
                                                        f25 += f43;
                                                        float f44 = fArr2[i6 + 1];
                                                        f26 += f44;
                                                        if (i6 > 0) {
                                                            path2.rLineTo(f43, f44);
                                                        } else {
                                                            path2.rMoveTo(f43, f44);
                                                            f27 = f25;
                                                        }
                                                    } else if (c4 == 's') {
                                                        if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                            f15 = f26 - f22;
                                                            f16 = f25 - f21;
                                                        } else {
                                                            f16 = 0.0f;
                                                            f15 = 0.0f;
                                                        }
                                                        int i18 = i6 + 1;
                                                        int i19 = i6 + 2;
                                                        int i20 = i6 + 3;
                                                        path2.rCubicTo(f16, f15, fArr2[i6], fArr2[i18], fArr2[i19], fArr2[i20]);
                                                        f9 = fArr2[i6] + f25;
                                                        f10 = fArr2[i18] + f26;
                                                        f25 += fArr2[i19];
                                                        f11 = fArr2[i20];
                                                    } else if (c4 == 't') {
                                                        if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                            f17 = f25 - f21;
                                                            f18 = f26 - f22;
                                                        } else {
                                                            f18 = 0.0f;
                                                            f17 = 0.0f;
                                                        }
                                                        int i21 = i6 + 1;
                                                        path2.rQuadTo(f17, f18, fArr2[i6], fArr2[i21]);
                                                        float f45 = f17 + f25;
                                                        float f46 = f18 + f26;
                                                        f25 += fArr2[i6];
                                                        f26 += fArr2[i21];
                                                        f22 = f46;
                                                        f21 = f45;
                                                    }
                                                } else {
                                                    c6 = c8;
                                                    f13 = fArr2[i6];
                                                    f14 = fArr2[i6 + 1];
                                                    if (i6 > 0) {
                                                        path2.lineTo(f13, f14);
                                                    } else {
                                                        path2.moveTo(f13, f14);
                                                        f25 = f13;
                                                        f27 = f25;
                                                        f26 = f14;
                                                    }
                                                }
                                                f28 = f26;
                                            } else {
                                                c6 = c8;
                                                int i22 = i6 + 1;
                                                path2.lineTo(fArr2[i6], fArr2[i22]);
                                                f13 = fArr2[i6];
                                                f14 = fArr2[i22];
                                            }
                                            f25 = f13;
                                            f26 = f14;
                                        } else {
                                            c6 = c8;
                                            path2.rLineTo(0.0f, fArr2[i6]);
                                            f12 = fArr2[i6];
                                        }
                                        f26 += f12;
                                    } else {
                                        c5 = c7;
                                        c6 = c8;
                                        int i23 = i6 + 1;
                                        int i24 = i6 + 2;
                                        int i25 = i6 + 3;
                                        path2.rQuadTo(fArr2[i6], fArr2[i23], fArr2[i24], fArr2[i25]);
                                        f9 = fArr2[i6] + f25;
                                        f10 = fArr2[i23] + f26;
                                        f25 += fArr2[i24];
                                        f11 = fArr2[i25];
                                    }
                                    f26 += f11;
                                    f21 = f9;
                                    f22 = f10;
                                } else {
                                    c5 = c7;
                                    c6 = c8;
                                    path2.rLineTo(fArr2[i6], 0.0f);
                                    f25 += fArr2[i6];
                                }
                            } else {
                                z3 = z7;
                                c5 = c7;
                                c6 = c8;
                                int i26 = i6 + 2;
                                int i27 = i6 + 3;
                                int i28 = i6 + 4;
                                int i29 = i6 + 5;
                                path2.rCubicTo(fArr2[i6], fArr2[i6 + 1], fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                                float f47 = fArr2[i26] + f25;
                                float f48 = fArr2[i27] + f26;
                                f25 += fArr2[i28];
                                f26 += fArr2[i29];
                                f21 = f47;
                                f22 = f48;
                            }
                            i5 = i6;
                        } else {
                            z3 = z7;
                            c5 = c7;
                            c6 = c8;
                            int i30 = i6 + 5;
                            float f49 = fArr2[i30] + f25;
                            int i31 = i6 + 6;
                            float f50 = fArr2[i31] + f26;
                            float f51 = fArr2[i6];
                            float f52 = fArr2[i6 + 1];
                            float f53 = fArr2[i6 + 2];
                            if (fArr2[i6 + 3] != 0.0f) {
                                f7 = 0.0f;
                                f8 = f26;
                                z5 = z3;
                            } else {
                                f7 = 0.0f;
                                f8 = f26;
                                z5 = z2;
                            }
                            i5 = i6;
                            boolean z8 = fArr2[i6 + 4] != f7 ? z3 : z2;
                            float f54 = f25;
                            m12295g(path, f54, f8, f49, f50, f51, f52, f53, z5, z8);
                            f25 = f54 + fArr2[i30];
                            f26 = f8 + fArr2[i31];
                            f21 = f25;
                            f22 = f26;
                        }
                        f26 = f6;
                    } else {
                        z2 = z6;
                        z3 = z7;
                        c5 = c7;
                        c6 = c8;
                        i5 = i6;
                        int i32 = i5 + 1;
                        int i33 = i5 + 2;
                        int i34 = i5 + 3;
                        path2.quadTo(fArr2[i5], fArr2[i32], fArr2[i33], fArr2[i34]);
                        f4 = fArr2[i5];
                        f5 = fArr2[i32];
                        f25 = fArr2[i33];
                        f26 = fArr2[i34];
                    }
                    f21 = f4;
                    f22 = f5;
                } else {
                    z2 = z6;
                    z3 = z7;
                    c5 = c7;
                    c6 = c8;
                    i5 = i6;
                    path2.lineTo(fArr2[i5], f26);
                    f25 = fArr2[i5];
                }
                i6 = i5 + i4;
                path2 = path;
                c9 = c4;
                z6 = z2;
                z7 = z3;
                c7 = c5;
                c8 = c6;
            }
            fArr[z6 ? 1 : 0] = f25;
            fArr[z7 ? 1 : 0] = f26;
            fArr[c7] = f21;
            fArr[c8] = f22;
            fArr[4] = f27;
            fArr[5] = f28;
        }

        /* JADX INFO: renamed from: f */
        private static void m12294f(Path path, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
            double d12 = d5;
            int iCeil = (int) Math.ceil(Math.abs((d11 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d9);
            double dSin = Math.sin(d9);
            double dCos2 = Math.cos(d10);
            double dSin2 = Math.sin(d10);
            double d13 = -d12;
            double d14 = d13 * dCos;
            double d15 = d6 * dSin;
            double d16 = (d14 * dSin2) - (d15 * dCos2);
            double d17 = d13 * dSin;
            double d18 = d6 * dCos;
            double d19 = (dSin2 * d17) + (dCos2 * d18);
            double d20 = d11 / ((double) iCeil);
            double d21 = d19;
            double d22 = d16;
            int i3 = 0;
            double d23 = d7;
            double d24 = d8;
            double d25 = d10;
            while (i3 < iCeil) {
                double d26 = d25 + d20;
                double dSin3 = Math.sin(d26);
                double dCos3 = Math.cos(d26);
                double d27 = (d3 + ((d12 * dCos) * dCos3)) - (d15 * dSin3);
                int i4 = i3;
                double d28 = d4 + (d5 * dSin * dCos3) + (d18 * dSin3);
                double d29 = (d14 * dSin3) - (d15 * dCos3);
                double d30 = (dSin3 * d17) + (dCos3 * d18);
                double d31 = d26 - d25;
                double dTan = Math.tan(d31 / 2.0d);
                double dSin4 = (Math.sin(d31) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d32 = d23 + (d22 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d32, (float) (d24 + (d21 * dSin4)), (float) (d27 - (dSin4 * d29)), (float) (d28 - (dSin4 * d30)), (float) d27, (float) d28);
                dSin = dSin;
                d20 = d20;
                d23 = d27;
                d17 = d17;
                d25 = d26;
                d21 = d30;
                dCos = dCos;
                d12 = d5;
                d24 = d28;
                i3 = i4 + 1;
                iCeil = iCeil;
                d22 = d29;
            }
        }

        /* JADX INFO: renamed from: g */
        private static void m12295g(Path path, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z2, boolean z3) {
            double d3;
            double d4;
            double radians = Math.toRadians(f9);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d5 = f3;
            double d6 = f4;
            double d7 = f7;
            double d8 = ((d5 * dCos) + (d6 * dSin)) / d7;
            double d9 = f8;
            double d10 = ((((double) (-f3)) * dSin) + (d6 * dCos)) / d9;
            double d11 = f6;
            double d12 = ((((double) f5) * dCos) + (d11 * dSin)) / d7;
            double d13 = ((((double) (-f5)) * dSin) + (d11 * dCos)) / d9;
            double d14 = d8 - d12;
            double d15 = d10 - d13;
            double d16 = (d8 + d12) / 2.0d;
            double d17 = (d10 + d13) / 2.0d;
            double d18 = (d14 * d14) + (d15 * d15);
            if (d18 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d18);
                float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
                m12295g(path, f3, f4, f5, f6, f7 * fSqrt, fSqrt * f8, f9, z2, z3);
                return;
            }
            double dSqrt = Math.sqrt(d19);
            double d20 = d14 * dSqrt;
            double d21 = dSqrt * d15;
            if (z2 == z3) {
                d3 = d16 - d21;
                d4 = d17 + d20;
            } else {
                d3 = d16 + d21;
                d4 = d17 - d20;
            }
            double dAtan2 = Math.atan2(d10 - d4, d8 - d3);
            double dAtan22 = Math.atan2(d13 - d4, d12 - d3) - dAtan2;
            if (z3 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d22 = d3 * d7;
            double d23 = d4 * d9;
            m12294f(path, (d22 * dCos) - (d23 * dSin), (d22 * dSin) + (d23 * dCos), d7, d9, d5, d6, radians, dAtan2, dAtan22);
        }

        /* JADX INFO: renamed from: i */
        public static void m12296i(b[] bVarArr, Path path) {
            AbstractC2574g.m12287j(bVarArr, path);
        }

        /* JADX INFO: renamed from: h */
        public void m12297h(b bVar, b bVar2, float f3) {
            this.f11906a = bVar.f11906a;
            int i3 = 0;
            while (true) {
                float[] fArr = bVar.f11907b;
                if (i3 >= fArr.length) {
                    return;
                }
                this.f11907b[i3] = (fArr[i3] * (1.0f - f3)) + (bVar2.f11907b[i3] * f3);
                i3++;
            }
        }

        b(b bVar) {
            this.f11906a = bVar.f11906a;
            float[] fArr = bVar.f11907b;
            this.f11907b = AbstractC2574g.m12280c(fArr, 0, fArr.length);
        }
    }
}
