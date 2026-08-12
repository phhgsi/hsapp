package p044O1;

import p035L1.AbstractC0382n;
import p041N1.C0447j;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;
import p047P1.AbstractC0470a;
import p047P1.AbstractC0472c;
import p047P1.AbstractC0476g;
import p047P1.AbstractC0478i;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0616u;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: O1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0453c {

    /* JADX INFO: renamed from: O1.c$a */
    public static final class a extends AbstractC0478i {

        /* JADX INFO: renamed from: e */
        private int f1602e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC0581p f1603f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Object f1604g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0442e interfaceC0442e, InterfaceC0581p interfaceC0581p, Object obj) {
            super(interfaceC0442e);
            this.f1603f = interfaceC0581p;
            this.f1604g = obj;
            AbstractC0606k.m2143c(interfaceC0442e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p047P1.AbstractC0470a
        /* JADX INFO: renamed from: k */
        protected Object mo1646k(Object obj) {
            int i3 = this.f1602e;
            if (i3 == 0) {
                this.f1602e = 1;
                AbstractC0382n.m1373b(obj);
                AbstractC0606k.m2143c(this.f1603f, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((InterfaceC0581p) AbstractC0616u.m2168b(this.f1603f, 2)).mo1609d(this.f1604g, this);
            }
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f1602e = 2;
            AbstractC0382n.m1373b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: O1.c$b */
    public static final class b extends AbstractC0472c {

        /* JADX INFO: renamed from: g */
        private int f1605g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ InterfaceC0581p f1606h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ Object f1607i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0442e interfaceC0442e, InterfaceC0446i interfaceC0446i, InterfaceC0581p interfaceC0581p, Object obj) {
            super(interfaceC0442e, interfaceC0446i);
            this.f1606h = interfaceC0581p;
            this.f1607i = obj;
            AbstractC0606k.m2143c(interfaceC0442e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p047P1.AbstractC0470a
        /* JADX INFO: renamed from: k */
        protected Object mo1646k(Object obj) {
            int i3 = this.f1605g;
            if (i3 == 0) {
                this.f1605g = 1;
                AbstractC0382n.m1373b(obj);
                AbstractC0606k.m2143c(this.f1606h, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((InterfaceC0581p) AbstractC0616u.m2168b(this.f1606h, 2)).mo1609d(this.f1607i, this);
            }
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f1605g = 2;
            AbstractC0382n.m1373b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: O1.c$c */
    public static final class c extends AbstractC0478i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC0442e interfaceC0442e) {
            super(interfaceC0442e);
            AbstractC0606k.m2143c(interfaceC0442e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p047P1.AbstractC0470a
        /* JADX INFO: renamed from: k */
        protected Object mo1646k(Object obj) {
            AbstractC0382n.m1373b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: O1.c$d */
    public static final class d extends AbstractC0472c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC0442e interfaceC0442e, InterfaceC0446i interfaceC0446i) {
            super(interfaceC0442e, interfaceC0446i);
            AbstractC0606k.m2143c(interfaceC0442e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p047P1.AbstractC0470a
        /* JADX INFO: renamed from: k */
        protected Object mo1646k(Object obj) {
            AbstractC0382n.m1373b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static InterfaceC0442e m1642a(InterfaceC0581p interfaceC0581p, Object obj, InterfaceC0442e interfaceC0442e) {
        AbstractC0606k.m2145e(interfaceC0581p, "<this>");
        AbstractC0606k.m2145e(interfaceC0442e, "completion");
        InterfaceC0442e interfaceC0442eM1765a = AbstractC0476g.m1765a(interfaceC0442e);
        if (interfaceC0581p instanceof AbstractC0470a) {
            return ((AbstractC0470a) interfaceC0581p).mo1751g(obj, interfaceC0442eM1765a);
        }
        InterfaceC0446i interfaceC0446iMo1615c = interfaceC0442eM1765a.mo1615c();
        return interfaceC0446iMo1615c == C0447j.f1593d ? new a(interfaceC0442eM1765a, interfaceC0581p, obj) : new b(interfaceC0442eM1765a, interfaceC0446iMo1615c, interfaceC0581p, obj);
    }

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0442e m1643b(InterfaceC0442e interfaceC0442e) {
        InterfaceC0446i interfaceC0446iMo1615c = interfaceC0442e.mo1615c();
        return interfaceC0446iMo1615c == C0447j.f1593d ? new c(interfaceC0442e) : new d(interfaceC0442e, interfaceC0446iMo1615c);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0442e m1644c(InterfaceC0442e interfaceC0442e) {
        InterfaceC0442e interfaceC0442eM1755m;
        AbstractC0606k.m2145e(interfaceC0442e, "<this>");
        AbstractC0472c abstractC0472c = interfaceC0442e instanceof AbstractC0472c ? (AbstractC0472c) interfaceC0442e : null;
        return (abstractC0472c == null || (interfaceC0442eM1755m = abstractC0472c.m1755m()) == null) ? interfaceC0442e : interfaceC0442eM1755m;
    }

    /* JADX INFO: renamed from: d */
    public static Object m1645d(InterfaceC0581p interfaceC0581p, Object obj, InterfaceC0442e interfaceC0442e) {
        AbstractC0606k.m2145e(interfaceC0581p, "<this>");
        AbstractC0606k.m2145e(interfaceC0442e, "completion");
        return ((InterfaceC0581p) AbstractC0616u.m2168b(interfaceC0581p, 2)).mo1609d(obj, m1643b(AbstractC0476g.m1765a(interfaceC0442e)));
    }
}
