package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.lifecycle.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1126h {

    /* JADX INFO: renamed from: a */
    private AtomicReference f5340a = new AtomicReference();

    /* JADX INFO: renamed from: androidx.lifecycle.h$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C2615a Companion = new C2615a(null);

        /* JADX INFO: renamed from: androidx.lifecycle.h$a$a, reason: collision with other inner class name */
        public static final class C2615a {

            /* JADX INFO: renamed from: androidx.lifecycle.h$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2616a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f5341a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f5341a = iArr;
                }
            }

            public /* synthetic */ C2615a(AbstractC0602g abstractC0602g) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m5137a(b bVar) {
                AbstractC0606k.m2145e(bVar, "state");
                int i3 = C2616a.f5341a[bVar.ordinal()];
                if (i3 == 1) {
                    return a.ON_DESTROY;
                }
                if (i3 == 2) {
                    return a.ON_STOP;
                }
                if (i3 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            /* JADX INFO: renamed from: b */
            public final a m5138b(b bVar) {
                AbstractC0606k.m2145e(bVar, "state");
                int i3 = C2616a.f5341a[bVar.ordinal()];
                if (i3 == 1) {
                    return a.ON_START;
                }
                if (i3 == 2) {
                    return a.ON_RESUME;
                }
                if (i3 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            /* JADX INFO: renamed from: c */
            public final a m5139c(b bVar) {
                AbstractC0606k.m2145e(bVar, "state");
                int i3 = C2616a.f5341a[bVar.ordinal()];
                if (i3 == 1) {
                    return a.ON_CREATE;
                }
                if (i3 == 2) {
                    return a.ON_START;
                }
                if (i3 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private C2615a() {
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.h$a$b */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f5342a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f5342a = iArr;
            }
        }

        /* JADX INFO: renamed from: b */
        public final b m5136b() {
            switch (b.f5342a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.h$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* JADX INFO: renamed from: b */
        public final boolean m5141b(b bVar) {
            AbstractC0606k.m2145e(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5132a(InterfaceC1131m interfaceC1131m);

    /* JADX INFO: renamed from: b */
    public abstract b mo5133b();

    /* JADX INFO: renamed from: c */
    public abstract void mo5134c(InterfaceC1131m interfaceC1131m);
}
