package p128m0;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import p035L1.AbstractC0382n;
import p035L1.C0388t;
import p041N1.InterfaceC0442e;
import p044O1.AbstractC0452b;
import p047P1.AbstractC0480k;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;
import p102f2.AbstractC1893A;
import p102f2.AbstractC1932g;
import p102f2.C1907M;
import p102f2.InterfaceC1970z;

/* JADX INFO: renamed from: m0.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2171O0 {

    /* JADX INFO: renamed from: a */
    public static final C2171O0 f9999a = new C2171O0();

    /* JADX INFO: renamed from: m0.O0$a */
    static final class a extends AbstractC0480k implements InterfaceC0581p {

        /* JADX INFO: renamed from: h */
        Object f10000h;

        /* JADX INFO: renamed from: i */
        Object f10001i;

        /* JADX INFO: renamed from: j */
        Object f10002j;

        /* JADX INFO: renamed from: k */
        Object f10003k;

        /* JADX INFO: renamed from: l */
        Object f10004l;

        /* JADX INFO: renamed from: m */
        int f10005m;

        /* JADX INFO: renamed from: n */
        int f10006n;

        /* JADX INFO: renamed from: o */
        int f10007o;

        /* JADX INFO: renamed from: p */
        int f10008p;

        /* JADX INFO: renamed from: q */
        int f10009q;

        /* JADX INFO: renamed from: r */
        int f10010r;

        /* JADX INFO: renamed from: s */
        int f10011s;

        /* JADX INFO: renamed from: t */
        int f10012t;

        /* JADX INFO: renamed from: u */
        int f10013u;

        /* JADX INFO: renamed from: v */
        float f10014v;

        /* JADX INFO: renamed from: w */
        int f10015w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Context f10016x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Uri f10017y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2247s f10018z;

        /* JADX INFO: renamed from: m0.O0$a$a, reason: collision with other inner class name */
        static final class C2633a extends AbstractC0480k implements InterfaceC0581p {

            /* JADX INFO: renamed from: h */
            int f10019h;

            /* JADX INFO: renamed from: i */
            final /* synthetic */ InterfaceC2247s f10020i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2633a(InterfaceC2247s interfaceC2247s, InterfaceC0442e interfaceC0442e) {
                super(2, interfaceC0442e);
                this.f10020i = interfaceC2247s;
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: g */
            public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
                return new C2633a(this.f10020i, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: k */
            public final Object mo1646k(Object obj) {
                AbstractC0452b.m1647e();
                if (this.f10019h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0382n.m1373b(obj);
                InterfaceC2247s interfaceC2247s = this.f10020i;
                if (interfaceC2247s == null) {
                    return null;
                }
                interfaceC2247s.onFailure(new Exception("Failed to decode image"));
                return C0388t.f1507a;
            }

            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
                return ((C2633a) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
            }
        }

        /* JADX INFO: renamed from: m0.O0$a$b */
        static final class b extends AbstractC0480k implements InterfaceC0581p {

            /* JADX INFO: renamed from: h */
            int f10021h;

            /* JADX INFO: renamed from: i */
            final /* synthetic */ InterfaceC2247s f10022i;

            /* JADX INFO: renamed from: j */
            final /* synthetic */ Context f10023j;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ File f10024k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC2247s interfaceC2247s, Context context, File file, InterfaceC0442e interfaceC0442e) {
                super(2, interfaceC0442e);
                this.f10022i = interfaceC2247s;
                this.f10023j = context;
                this.f10024k = file;
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: g */
            public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
                return new b(this.f10022i, this.f10023j, this.f10024k, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: k */
            public final Object mo1646k(Object obj) {
                AbstractC0452b.m1647e();
                if (this.f10021h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0382n.m1373b(obj);
                InterfaceC2247s interfaceC2247s = this.f10022i;
                if (interfaceC2247s == null) {
                    return null;
                }
                interfaceC2247s.mo6730a(C2171O0.m10658a(this.f10023j, this.f10024k));
                return C0388t.f1507a;
            }

            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
                return ((b) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
            }
        }

        /* JADX INFO: renamed from: m0.O0$a$c */
        static final class c extends AbstractC0480k implements InterfaceC0581p {

            /* JADX INFO: renamed from: h */
            int f10025h;

            /* JADX INFO: renamed from: i */
            final /* synthetic */ InterfaceC2247s f10026i;

            /* JADX INFO: renamed from: j */
            final /* synthetic */ Exception f10027j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC2247s interfaceC2247s, Exception exc, InterfaceC0442e interfaceC0442e) {
                super(2, interfaceC0442e);
                this.f10026i = interfaceC2247s;
                this.f10027j = exc;
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: g */
            public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
                return new c(this.f10026i, this.f10027j, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: k */
            public final Object mo1646k(Object obj) {
                AbstractC0452b.m1647e();
                if (this.f10025h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0382n.m1373b(obj);
                InterfaceC2247s interfaceC2247s = this.f10026i;
                if (interfaceC2247s == null) {
                    return null;
                }
                interfaceC2247s.onFailure(this.f10027j);
                return C0388t.f1507a;
            }

            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
                return ((c) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, Uri uri, InterfaceC2247s interfaceC2247s, InterfaceC0442e interfaceC0442e) {
            super(2, interfaceC0442e);
            this.f10016x = context;
            this.f10017y = uri;
            this.f10018z = interfaceC2247s;
        }

        @Override // p047P1.AbstractC0470a
        /* JADX INFO: renamed from: g */
        public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
            return new a(this.f10016x, this.f10017y, this.f10018z, interfaceC0442e);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0157, code lost:
        
            if (r0 == r2) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x018a, code lost:
        
            if (r0 != r2) goto L83;
         */
        @Override // p047P1.AbstractC0470a
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo1646k(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 402
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p128m0.C2171O0.a.mo1646k(java.lang.Object):java.lang.Object");
        }

        @Override // p068W1.InterfaceC0581p
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
            return ((a) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
        }
    }

    private C2171O0() {
    }

    /* JADX INFO: renamed from: a */
    public static final Uri m10658a(Context context, File file) {
        AbstractC0606k.m2145e(context, "context");
        AbstractC0606k.m2145e(file, "file");
        Uri uriM4205h = FileProvider.m4205h(context, context.getApplicationContext().getPackageName() + ".fileprovider", file);
        AbstractC0606k.m2144d(uriM4205h, "getUriForFile(...)");
        return uriM4205h;
    }

    /* JADX INFO: renamed from: b */
    public static final void m10659b(Context context, Uri uri, InterfaceC2247s interfaceC2247s) {
        AbstractC0606k.m2145e(context, "context");
        AbstractC0606k.m2145e(uri, "imageUri");
        AbstractC1932g.m9877d(AbstractC1893A.m9776a(C1907M.m9813b()), null, null, new a(context, uri, interfaceC2247s, null), 3, null);
    }
}
