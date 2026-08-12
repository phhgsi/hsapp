package p021H;

import java.util.Locale;

/* JADX INFO: renamed from: H.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0197o {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0196n f1215a = new e(null, false);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0196n f1216b = new e(null, true);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0196n f1217c;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0196n f1218d;

    /* JADX INFO: renamed from: e */
    public static final InterfaceC0196n f1219e;

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0196n f1220f;

    /* JADX INFO: renamed from: H.o$a */
    private static class a implements c {

        /* JADX INFO: renamed from: b */
        static final a f1221b = new a(true);

        /* JADX INFO: renamed from: a */
        private final boolean f1222a;

        private a(boolean z2) {
            this.f1222a = z2;
        }

        @Override // p021H.AbstractC0197o.c
        /* JADX INFO: renamed from: a */
        public int mo585a(CharSequence charSequence, int i3, int i4) {
            int i5 = i4 + i3;
            boolean z2 = false;
            while (i3 < i5) {
                int iM583a = AbstractC0197o.m583a(Character.getDirectionality(charSequence.charAt(i3)));
                if (iM583a != 0) {
                    if (iM583a != 1) {
                        continue;
                        i3++;
                        z2 = z2;
                    } else if (!this.f1222a) {
                        return 1;
                    }
                } else if (this.f1222a) {
                    return 0;
                }
                z2 = true;
                i3++;
                z2 = z2;
            }
            if (z2) {
                return this.f1222a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: renamed from: H.o$b */
    private static class b implements c {

        /* JADX INFO: renamed from: a */
        static final b f1223a = new b();

        private b() {
        }

        @Override // p021H.AbstractC0197o.c
        /* JADX INFO: renamed from: a */
        public int mo585a(CharSequence charSequence, int i3, int i4) {
            int i5 = i4 + i3;
            int iM584b = 2;
            while (i3 < i5 && iM584b == 2) {
                iM584b = AbstractC0197o.m584b(Character.getDirectionality(charSequence.charAt(i3)));
                i3++;
            }
            return iM584b;
        }
    }

    /* JADX INFO: renamed from: H.o$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        int mo585a(CharSequence charSequence, int i3, int i4);
    }

    /* JADX INFO: renamed from: H.o$d */
    private static abstract class d implements InterfaceC0196n {

        /* JADX INFO: renamed from: a */
        private final c f1224a;

        d(c cVar) {
            this.f1224a = cVar;
        }

        /* JADX INFO: renamed from: c */
        private boolean m586c(CharSequence charSequence, int i3, int i4) {
            int iMo585a = this.f1224a.mo585a(charSequence, i3, i4);
            if (iMo585a == 0) {
                return true;
            }
            if (iMo585a != 1) {
                return mo587b();
            }
            return false;
        }

        @Override // p021H.InterfaceC0196n
        /* JADX INFO: renamed from: a */
        public boolean mo582a(CharSequence charSequence, int i3, int i4) {
            if (charSequence == null || i3 < 0 || i4 < 0 || charSequence.length() - i4 < i3) {
                throw new IllegalArgumentException();
            }
            return this.f1224a == null ? mo587b() : m586c(charSequence, i3, i4);
        }

        /* JADX INFO: renamed from: b */
        protected abstract boolean mo587b();
    }

    /* JADX INFO: renamed from: H.o$e */
    private static class e extends d {

        /* JADX INFO: renamed from: b */
        private final boolean f1225b;

        e(c cVar, boolean z2) {
            super(cVar);
            this.f1225b = z2;
        }

        @Override // p021H.AbstractC0197o.d
        /* JADX INFO: renamed from: b */
        protected boolean mo587b() {
            return this.f1225b;
        }
    }

    /* JADX INFO: renamed from: H.o$f */
    private static class f extends d {

        /* JADX INFO: renamed from: b */
        static final f f1226b = new f();

        f() {
            super(null);
        }

        @Override // p021H.AbstractC0197o.d
        /* JADX INFO: renamed from: b */
        protected boolean mo587b() {
            return AbstractC0198p.m588a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f1223a;
        f1217c = new e(bVar, false);
        f1218d = new e(bVar, true);
        f1219e = new e(a.f1221b, false);
        f1220f = f.f1226b;
    }

    /* JADX INFO: renamed from: a */
    static int m583a(int i3) {
        if (i3 != 0) {
            return (i3 == 1 || i3 == 2) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    static int m584b(int i3) {
        if (i3 != 0) {
            if (i3 == 1 || i3 == 2) {
                return 0;
            }
            switch (i3) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
