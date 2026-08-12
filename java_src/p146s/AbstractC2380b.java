package p146s;

import java.util.ArrayList;
import p137p.C2306d;

/* JADX INFO: renamed from: s.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2380b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[PHI: r15 r16
  0x0033: PHI (r15v28 boolean) = (r15v1 boolean), (r15v30 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[PHI: r15 r16
  0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v30 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a  */
    /* JADX WARN: Type inference failed for: r0v27, types: [p.d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [p.d] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [s.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [p.i] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void m11233a(p146s.C2384f r37, p137p.C2306d r38, int r39, int r40, p146s.C2381c r41) {
        /*
            Method dump skipped, instruction units count: 1287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p146s.AbstractC2380b.m11233a(s.f, p.d, int, int, s.c):void");
    }

    /* JADX INFO: renamed from: b */
    public static void m11234b(C2384f c2384f, C2306d c2306d, ArrayList arrayList, int i3) {
        int i4;
        C2381c[] c2381cArr;
        int i5;
        if (i3 == 0) {
            i4 = c2384f.f11001U0;
            c2381cArr = c2384f.f11004X0;
            i5 = 0;
        } else {
            i4 = c2384f.f11002V0;
            c2381cArr = c2384f.f11003W0;
            i5 = 2;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            C2381c c2381c = c2381cArr[i6];
            c2381c.m11237a();
            if (arrayList == null || arrayList.contains(c2381c.f10855a)) {
                m11233a(c2384f, c2306d, i3, i5, c2381c);
            }
        }
    }
}
