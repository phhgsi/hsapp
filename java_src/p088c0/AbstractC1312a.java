package p088c0;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import p035L1.AbstractC0382n;
import p035L1.C0388t;
import p041N1.InterfaceC0442e;
import p044O1.AbstractC0452b;
import p047P1.AbstractC0480k;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p084b0.AbstractC1299b;
import p092d0.AbstractC1770a;
import p092d0.AbstractC1783n;
import p092d0.AbstractC1784o;
import p092d0.AbstractC1785p;
import p102f2.AbstractC1893A;
import p102f2.AbstractC1932g;
import p102f2.C1907M;
import p102f2.InterfaceC1970z;
import p125l1.InterfaceFutureC2137d;

/* JADX INFO: renamed from: c0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1312a {

    /* JADX INFO: renamed from: a */
    public static final b f6375a = new b(null);

    /* JADX INFO: renamed from: c0.a$a */
    private static final class a extends AbstractC1312a {

        /* JADX INFO: renamed from: b */
        private final AbstractC1783n f6376b;

        /* JADX INFO: renamed from: c0.a$a$a, reason: collision with other inner class name */
        static final class C2619a extends AbstractC0480k implements InterfaceC0581p {

            /* JADX INFO: renamed from: h */
            int f6377h;

            C2619a(AbstractC1770a abstractC1770a, InterfaceC0442e interfaceC0442e) {
                super(2, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: g */
            public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
                return a.this.new C2619a(null, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: k */
            public final Object mo1646k(Object obj) {
                Object objE = AbstractC0452b.m1647e();
                int i3 = this.f6377h;
                if (i3 == 0) {
                    AbstractC0382n.m1373b(obj);
                    AbstractC1783n abstractC1783n = a.this.f6376b;
                    this.f6377h = 1;
                    if (abstractC1783n.mo9521a(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0382n.m1373b(obj);
                }
                return C0388t.f1507a;
            }

            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
                return ((C2619a) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
            }
        }

        /* JADX INFO: renamed from: c0.a$a$b */
        static final class b extends AbstractC0480k implements InterfaceC0581p {

            /* JADX INFO: renamed from: h */
            int f6379h;

            b(InterfaceC0442e interfaceC0442e) {
                super(2, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: g */
            public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
                return a.this.new b(interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: k */
            public final Object mo1646k(Object obj) {
                Object objE = AbstractC0452b.m1647e();
                int i3 = this.f6379h;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0382n.m1373b(obj);
                    return obj;
                }
                AbstractC0382n.m1373b(obj);
                AbstractC1783n abstractC1783n = a.this.f6376b;
                this.f6379h = 1;
                Object objMo9522b = abstractC1783n.mo9522b(this);
                return objMo9522b == objE ? objE : objMo9522b;
            }

            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
                return ((b) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
            }
        }

        /* JADX INFO: renamed from: c0.a$a$c */
        static final class c extends AbstractC0480k implements InterfaceC0581p {

            /* JADX INFO: renamed from: h */
            int f6381h;

            /* JADX INFO: renamed from: j */
            final /* synthetic */ Uri f6383j;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InputEvent f6384k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, InterfaceC0442e interfaceC0442e) {
                super(2, interfaceC0442e);
                this.f6383j = uri;
                this.f6384k = inputEvent;
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: g */
            public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
                return a.this.new c(this.f6383j, this.f6384k, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: k */
            public final Object mo1646k(Object obj) {
                Object objE = AbstractC0452b.m1647e();
                int i3 = this.f6381h;
                if (i3 == 0) {
                    AbstractC0382n.m1373b(obj);
                    AbstractC1783n abstractC1783n = a.this.f6376b;
                    Uri uri = this.f6383j;
                    InputEvent inputEvent = this.f6384k;
                    this.f6381h = 1;
                    if (abstractC1783n.mo9523c(uri, inputEvent, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0382n.m1373b(obj);
                }
                return C0388t.f1507a;
            }

            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
                return ((c) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
            }
        }

        /* JADX INFO: renamed from: c0.a$a$d */
        static final class d extends AbstractC0480k implements InterfaceC0581p {

            /* JADX INFO: renamed from: h */
            int f6385h;

            /* JADX INFO: renamed from: j */
            final /* synthetic */ Uri f6387j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, InterfaceC0442e interfaceC0442e) {
                super(2, interfaceC0442e);
                this.f6387j = uri;
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: g */
            public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
                return a.this.new d(this.f6387j, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: k */
            public final Object mo1646k(Object obj) {
                Object objE = AbstractC0452b.m1647e();
                int i3 = this.f6385h;
                if (i3 == 0) {
                    AbstractC0382n.m1373b(obj);
                    AbstractC1783n abstractC1783n = a.this.f6376b;
                    Uri uri = this.f6387j;
                    this.f6385h = 1;
                    if (abstractC1783n.mo9524d(uri, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0382n.m1373b(obj);
                }
                return C0388t.f1507a;
            }

            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
                return ((d) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
            }
        }

        /* JADX INFO: renamed from: c0.a$a$e */
        static final class e extends AbstractC0480k implements InterfaceC0581p {

            /* JADX INFO: renamed from: h */
            int f6388h;

            e(AbstractC1784o abstractC1784o, InterfaceC0442e interfaceC0442e) {
                super(2, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: g */
            public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
                return a.this.new e(null, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: k */
            public final Object mo1646k(Object obj) {
                Object objE = AbstractC0452b.m1647e();
                int i3 = this.f6388h;
                if (i3 == 0) {
                    AbstractC0382n.m1373b(obj);
                    AbstractC1783n abstractC1783n = a.this.f6376b;
                    this.f6388h = 1;
                    if (abstractC1783n.mo9525e(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0382n.m1373b(obj);
                }
                return C0388t.f1507a;
            }

            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
                return ((e) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
            }
        }

        /* JADX INFO: renamed from: c0.a$a$f */
        static final class f extends AbstractC0480k implements InterfaceC0581p {

            /* JADX INFO: renamed from: h */
            int f6390h;

            f(AbstractC1785p abstractC1785p, InterfaceC0442e interfaceC0442e) {
                super(2, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: g */
            public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
                return a.this.new f(null, interfaceC0442e);
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: k */
            public final Object mo1646k(Object obj) {
                Object objE = AbstractC0452b.m1647e();
                int i3 = this.f6390h;
                if (i3 == 0) {
                    AbstractC0382n.m1373b(obj);
                    AbstractC1783n abstractC1783n = a.this.f6376b;
                    this.f6390h = 1;
                    if (abstractC1783n.mo9526f(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0382n.m1373b(obj);
                }
                return C0388t.f1507a;
            }

            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
                return ((f) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
            }
        }

        public a(AbstractC1783n abstractC1783n) {
            AbstractC0606k.m2145e(abstractC1783n, "mMeasurementManager");
            this.f6376b = abstractC1783n;
        }

        @Override // p088c0.AbstractC1312a
        /* JADX INFO: renamed from: b */
        public InterfaceFutureC2137d mo6651b() {
            return AbstractC1299b.m6613c(AbstractC1932g.m9875b(AbstractC1893A.m9776a(C1907M.m9812a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // p088c0.AbstractC1312a
        /* JADX INFO: renamed from: c */
        public InterfaceFutureC2137d mo6652c(Uri uri) {
            AbstractC0606k.m2145e(uri, "trigger");
            return AbstractC1299b.m6613c(AbstractC1932g.m9875b(AbstractC1893A.m9776a(C1907M.m9812a()), null, null, new d(uri, null), 3, null), null, 1, null);
        }

        /* JADX INFO: renamed from: e */
        public InterfaceFutureC2137d m6654e(AbstractC1770a abstractC1770a) {
            AbstractC0606k.m2145e(abstractC1770a, "deletionRequest");
            return AbstractC1299b.m6613c(AbstractC1932g.m9875b(AbstractC1893A.m9776a(C1907M.m9812a()), null, null, new C2619a(abstractC1770a, null), 3, null), null, 1, null);
        }

        /* JADX INFO: renamed from: f */
        public InterfaceFutureC2137d m6655f(Uri uri, InputEvent inputEvent) {
            AbstractC0606k.m2145e(uri, "attributionSource");
            return AbstractC1299b.m6613c(AbstractC1932g.m9875b(AbstractC1893A.m9776a(C1907M.m9812a()), null, null, new c(uri, inputEvent, null), 3, null), null, 1, null);
        }

        /* JADX INFO: renamed from: g */
        public InterfaceFutureC2137d m6656g(AbstractC1784o abstractC1784o) {
            AbstractC0606k.m2145e(abstractC1784o, "request");
            return AbstractC1299b.m6613c(AbstractC1932g.m9875b(AbstractC1893A.m9776a(C1907M.m9812a()), null, null, new e(abstractC1784o, null), 3, null), null, 1, null);
        }

        /* JADX INFO: renamed from: h */
        public InterfaceFutureC2137d m6657h(AbstractC1785p abstractC1785p) {
            AbstractC0606k.m2145e(abstractC1785p, "request");
            return AbstractC1299b.m6613c(AbstractC1932g.m9875b(AbstractC1893A.m9776a(C1907M.m9812a()), null, null, new f(abstractC1785p, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: c0.a$b */
    public static final class b {
        public /* synthetic */ b(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC1312a m6664a(Context context) {
            AbstractC0606k.m2145e(context, "context");
            AbstractC1783n abstractC1783nM9534a = AbstractC1783n.f9142a.m9534a(context);
            if (abstractC1783nM9534a != null) {
                return new a(abstractC1783nM9534a);
            }
            return null;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC1312a m6650a(Context context) {
        return f6375a.m6664a(context);
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceFutureC2137d mo6651b();

    /* JADX INFO: renamed from: c */
    public abstract InterfaceFutureC2137d mo6652c(Uri uri);
}
