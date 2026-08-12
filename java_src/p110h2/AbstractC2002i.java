package p110h2;

import p041N1.InterfaceC0442e;
import p068W1.InterfaceC0577l;

/* JADX INFO: renamed from: h2.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2002i {

    /* JADX INFO: renamed from: a */
    private static final C2018y f9576a = new C2018y("UNDEFINED");

    /* JADX INFO: renamed from: b */
    public static final C2018y f9577b = new C2018y("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: all -> 0x0068, DONT_GENERATE, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x003f, B:13:0x004d, B:15:0x0053, B:28:0x0092, B:18:0x006a, B:20:0x007a, B:25:0x0089, B:27:0x008f, B:33:0x009f, B:36:0x00a8, B:35:0x00a5, B:23:0x0080), top: B:45:0x003f, inners: #1 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10131b(p041N1.InterfaceC0442e r6, java.lang.Object r7, p068W1.InterfaceC0577l r8) {
        /*
            boolean r0 = r6 instanceof p110h2.C2001h
            if (r0 == 0) goto Lb3
            h2.h r6 = (p110h2.C2001h) r6
            java.lang.Object r8 = p102f2.AbstractC1960u.m10016b(r7, r8)
            f2.w r0 = r6.f9572g
            N1.i r1 = r6.mo1615c()
            boolean r0 = r0.mo10029E(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6.f9574i = r8
            r6.f9411f = r1
            f2.w r7 = r6.f9572g
            N1.i r8 = r6.mo1615c()
            r7.mo9836D(r8, r6)
            goto Lad
        L26:
            f2.x0 r0 = p102f2.C1967x0.f9488a
            f2.P r0 = r0.m10035a()
            boolean r2 = r0.m9824M()
            if (r2 == 0) goto L3b
            r6.f9574i = r8
            r6.f9411f = r1
            r0.m9821I(r6)
            goto Lad
        L3b:
            r0.m9823K(r1)
            r2 = 0
            N1.i r3 = r6.mo1615c()     // Catch: java.lang.Throwable -> L68
            f2.f0$b r4 = p102f2.InterfaceC1931f0.f9437c     // Catch: java.lang.Throwable -> L68
            N1.i$b r3 = r3.mo1603b(r4)     // Catch: java.lang.Throwable -> L68
            f2.f0 r3 = (p102f2.InterfaceC1931f0) r3     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L6a
            boolean r4 = r3.mo9853a()     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L6a
            java.util.concurrent.CancellationException r7 = r3.mo9868v()     // Catch: java.lang.Throwable -> L68
            r6.mo9801a(r8, r7)     // Catch: java.lang.Throwable -> L68
            L1.m$a r8 = p035L1.AbstractC0381m.f1498d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = p035L1.AbstractC0382n.m1372a(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = p035L1.AbstractC0381m.m1369a(r7)     // Catch: java.lang.Throwable -> L68
            r6.mo1616j(r7)     // Catch: java.lang.Throwable -> L68
            goto L92
        L68:
            r7 = move-exception
            goto La9
        L6a:
            N1.e r8 = r6.f9573h     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = r6.f9575j     // Catch: java.lang.Throwable -> L68
            N1.i r4 = r8.mo1615c()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = p110h2.AbstractC1989C.m10104c(r4, r3)     // Catch: java.lang.Throwable -> L68
            h2.y r5 = p110h2.AbstractC1989C.f9554a     // Catch: java.lang.Throwable -> L68
            if (r3 == r5) goto L7f
            f2.z0 r8 = p102f2.AbstractC1962v.m10025g(r8, r4, r3)     // Catch: java.lang.Throwable -> L68
            goto L80
        L7f:
            r8 = r2
        L80:
            N1.e r5 = r6.f9573h     // Catch: java.lang.Throwable -> L9c
            r5.mo1616j(r7)     // Catch: java.lang.Throwable -> L9c
            L1.t r7 = p035L1.C0388t.f1507a     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L8f
            boolean r7 = r8.m10040E0()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L92
        L8f:
            p110h2.AbstractC1989C.m10102a(r4, r3)     // Catch: java.lang.Throwable -> L68
        L92:
            boolean r7 = r0.m9826O()     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L92
        L98:
            r0.m9820G(r1)
            goto Lad
        L9c:
            r7 = move-exception
            if (r8 == 0) goto La5
            boolean r8 = r8.m10040E0()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto La8
        La5:
            p110h2.AbstractC1989C.m10102a(r4, r3)     // Catch: java.lang.Throwable -> L68
        La8:
            throw r7     // Catch: java.lang.Throwable -> L68
        La9:
            r6.m9805g(r7, r2)     // Catch: java.lang.Throwable -> Lae
            goto L98
        Lad:
            return
        Lae:
            r6 = move-exception
            r0.m9820G(r1)
            throw r6
        Lb3:
            r6.mo1616j(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p110h2.AbstractC2002i.m10131b(N1.e, java.lang.Object, W1.l):void");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10132c(InterfaceC0442e interfaceC0442e, Object obj, InterfaceC0577l interfaceC0577l, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            interfaceC0577l = null;
        }
        m10131b(interfaceC0442e, obj, interfaceC0577l);
    }
}
