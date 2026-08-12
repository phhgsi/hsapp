package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1222a;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h */
/* JADX INFO: loaded from: classes.dex */
class C1229h {

    /* JADX INFO: renamed from: a */
    final a f6010a;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo6088a(C1222a.b bVar);

        /* JADX INFO: renamed from: b */
        C1222a.b mo6089b(int i3, int i4, int i5, Object obj);
    }

    C1229h(a aVar) {
        this.f6010a = aVar;
    }

    /* JADX INFO: renamed from: a */
    private int m6195a(List list) {
        boolean z2 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C1222a.b) list.get(size)).f5882a != 8) {
                z2 = true;
            } else if (z2) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    private void m6196c(List list, int i3, C1222a.b bVar, int i4, C1222a.b bVar2) {
        int i5 = bVar.f5885d;
        int i6 = bVar2.f5883b;
        int i7 = i5 < i6 ? -1 : 0;
        int i8 = bVar.f5883b;
        if (i8 < i6) {
            i7++;
        }
        if (i6 <= i8) {
            bVar.f5883b = i8 + bVar2.f5885d;
        }
        int i9 = bVar2.f5883b;
        if (i9 <= i5) {
            bVar.f5885d = i5 + bVar2.f5885d;
        }
        bVar2.f5883b = i9 + i7;
        list.set(i3, bVar2);
        list.set(i4, bVar);
    }

    /* JADX INFO: renamed from: d */
    private void m6197d(List list, int i3, int i4) {
        C1222a.b bVar = (C1222a.b) list.get(i3);
        C1222a.b bVar2 = (C1222a.b) list.get(i4);
        int i5 = bVar2.f5882a;
        if (i5 == 1) {
            m6196c(list, i3, bVar, i4, bVar2);
        } else if (i5 == 2) {
            m6199e(list, i3, bVar, i4, bVar2);
        } else {
            if (i5 != 4) {
                return;
            }
            m6200f(list, i3, bVar, i4, bVar2);
        }
    }

    /* JADX INFO: renamed from: b */
    void m6198b(List list) {
        while (true) {
            int iM6195a = m6195a(list);
            if (iM6195a == -1) {
                return;
            } else {
                m6197d(list, iM6195a, iM6195a + 1);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    void m6199e(List list, int i3, C1222a.b bVar, int i4, C1222a.b bVar2) {
        boolean z2;
        int i5 = bVar.f5883b;
        int i6 = bVar.f5885d;
        boolean z3 = false;
        if (i5 < i6) {
            if (bVar2.f5883b == i5 && bVar2.f5885d == i6 - i5) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
            }
        } else if (bVar2.f5883b == i6 + 1 && bVar2.f5885d == i5 - i6) {
            z2 = true;
            z3 = true;
        } else {
            z2 = true;
        }
        int i7 = bVar2.f5883b;
        if (i6 < i7) {
            bVar2.f5883b = i7 - 1;
        } else {
            int i8 = bVar2.f5885d;
            if (i6 < i7 + i8) {
                bVar2.f5885d = i8 - 1;
                bVar.f5882a = 2;
                bVar.f5885d = 1;
                if (bVar2.f5885d == 0) {
                    list.remove(i4);
                    this.f6010a.mo6088a(bVar2);
                    return;
                }
                return;
            }
        }
        int i9 = bVar.f5883b;
        int i10 = bVar2.f5883b;
        C1222a.b bVarMo6089b = null;
        if (i9 <= i10) {
            bVar2.f5883b = i10 + 1;
        } else {
            int i11 = bVar2.f5885d;
            if (i9 < i10 + i11) {
                bVarMo6089b = this.f6010a.mo6089b(2, i9 + 1, (i10 + i11) - i9, null);
                bVar2.f5885d = bVar.f5883b - bVar2.f5883b;
            }
        }
        if (z3) {
            list.set(i3, bVar2);
            list.remove(i4);
            this.f6010a.mo6088a(bVar);
            return;
        }
        if (z2) {
            if (bVarMo6089b != null) {
                int i12 = bVar.f5883b;
                if (i12 > bVarMo6089b.f5883b) {
                    bVar.f5883b = i12 - bVarMo6089b.f5885d;
                }
                int i13 = bVar.f5885d;
                if (i13 > bVarMo6089b.f5883b) {
                    bVar.f5885d = i13 - bVarMo6089b.f5885d;
                }
            }
            int i14 = bVar.f5883b;
            if (i14 > bVar2.f5883b) {
                bVar.f5883b = i14 - bVar2.f5885d;
            }
            int i15 = bVar.f5885d;
            if (i15 > bVar2.f5883b) {
                bVar.f5885d = i15 - bVar2.f5885d;
            }
        } else {
            if (bVarMo6089b != null) {
                int i16 = bVar.f5883b;
                if (i16 >= bVarMo6089b.f5883b) {
                    bVar.f5883b = i16 - bVarMo6089b.f5885d;
                }
                int i17 = bVar.f5885d;
                if (i17 >= bVarMo6089b.f5883b) {
                    bVar.f5885d = i17 - bVarMo6089b.f5885d;
                }
            }
            int i18 = bVar.f5883b;
            if (i18 >= bVar2.f5883b) {
                bVar.f5883b = i18 - bVar2.f5885d;
            }
            int i19 = bVar.f5885d;
            if (i19 >= bVar2.f5883b) {
                bVar.f5885d = i19 - bVar2.f5885d;
            }
        }
        list.set(i3, bVar2);
        if (bVar.f5883b != bVar.f5885d) {
            list.set(i4, bVar);
        } else {
            list.remove(i4);
        }
        if (bVarMo6089b != null) {
            list.add(i3, bVarMo6089b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m6200f(java.util.List r9, int r10, androidx.recyclerview.widget.C1222a.b r11, int r12, androidx.recyclerview.widget.C1222a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f5885d
            int r1 = r13.f5883b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f5883b = r1
            goto L20
        Ld:
            int r5 = r13.f5885d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f5885d = r5
            androidx.recyclerview.widget.h$a r0 = r8.f6010a
            int r1 = r11.f5883b
            java.lang.Object r5 = r13.f5884c
            androidx.recyclerview.widget.a$b r0 = r0.mo6089b(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f5883b
            int r5 = r13.f5883b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f5883b = r5
            goto L41
        L2b:
            int r6 = r13.f5885d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r4 = r8.f6010a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f5884c
            androidx.recyclerview.widget.a$b r4 = r4.mo6089b(r2, r1, r5, r3)
            int r1 = r13.f5885d
            int r1 = r1 - r5
            r13.f5885d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f5885d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f6010a
            r11.mo6088a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1229h.m6200f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
