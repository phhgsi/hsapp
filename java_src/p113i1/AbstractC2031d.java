package p113i1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: i1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2031d {

    /* JADX INFO: renamed from: i1.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final String f9644a;

        /* JADX INFO: renamed from: b */
        private final a f9645b;

        /* JADX INFO: renamed from: c */
        private a f9646c;

        /* JADX INFO: renamed from: d */
        private boolean f9647d;

        /* JADX INFO: renamed from: e */
        private boolean f9648e;

        /* JADX INFO: renamed from: i1.d$b$a */
        private static class a {

            /* JADX INFO: renamed from: a */
            String f9649a;

            /* JADX INFO: renamed from: b */
            Object f9650b;

            /* JADX INFO: renamed from: c */
            a f9651c;

            private a() {
            }
        }

        /* JADX INFO: renamed from: a */
        private a m10223a() {
            a aVar = new a();
            this.f9646c.f9651c = aVar;
            this.f9646c = aVar;
            return aVar;
        }

        /* JADX INFO: renamed from: b */
        private b m10224b(Object obj) {
            m10223a().f9650b = obj;
            return this;
        }

        /* JADX INFO: renamed from: d */
        private static boolean m10225d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof AbstractC2034g ? !((AbstractC2034g) obj).mo10221c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        /* JADX INFO: renamed from: c */
        public b m10226c(Object obj) {
            return m10224b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                r0 = 1
                boolean r1 = r8.f9647d
                boolean r2 = r8.f9648e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = 32
                r3.<init>(r4)
                java.lang.String r4 = r8.f9644a
                r3.append(r4)
                r4 = 123(0x7b, float:1.72E-43)
                r3.append(r4)
                i1.d$b$a r4 = r8.f9645b
                i1.d$b$a r4 = r4.f9651c
                java.lang.String r5 = ""
            L1c:
                if (r4 == 0) goto L62
                java.lang.Object r6 = r4.f9650b
                if (r6 != 0) goto L25
                if (r1 != 0) goto L5f
                goto L2d
            L25:
                if (r2 == 0) goto L2d
                boolean r7 = m10225d(r6)
                if (r7 != 0) goto L5f
            L2d:
                r3.append(r5)
                java.lang.String r5 = r4.f9649a
                if (r5 == 0) goto L3c
                r3.append(r5)
                r5 = 61
                r3.append(r5)
            L3c:
                if (r6 == 0) goto L5a
                java.lang.Class r5 = r6.getClass()
                boolean r5 = r5.isArray()
                if (r5 == 0) goto L5a
                java.lang.Object[] r5 = new java.lang.Object[r0]
                r7 = 0
                r5[r7] = r6
                java.lang.String r5 = java.util.Arrays.deepToString(r5)
                int r6 = r5.length()
                int r6 = r6 - r0
                r3.append(r5, r0, r6)
                goto L5d
            L5a:
                r3.append(r6)
            L5d:
                java.lang.String r5 = ", "
            L5f:
                i1.d$b$a r4 = r4.f9651c
                goto L1c
            L62:
                r0 = 125(0x7d, float:1.75E-43)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p113i1.AbstractC2031d.b.toString():java.lang.String");
        }

        private b(String str) {
            a aVar = new a();
            this.f9645b = aVar;
            this.f9646c = aVar;
            this.f9647d = false;
            this.f9648e = false;
            this.f9644a = (String) AbstractC2035h.m10240i(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m10222a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
