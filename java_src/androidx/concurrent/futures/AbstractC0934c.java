package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p125l1.InterfaceFutureC2137d;

/* JADX INFO: renamed from: androidx.concurrent.futures.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0934c {

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        Object f3841a;

        /* JADX INFO: renamed from: b */
        d f3842b;

        /* JADX INFO: renamed from: c */
        private C0935d f3843c = C0935d.m4000s();

        /* JADX INFO: renamed from: d */
        private boolean f3844d;

        a() {
        }

        /* JADX INFO: renamed from: d */
        private void m3991d() {
            this.f3841a = null;
            this.f3842b = null;
            this.f3843c = null;
        }

        /* JADX INFO: renamed from: a */
        void m3992a() {
            this.f3841a = null;
            this.f3842b = null;
            this.f3843c.mo3979o(null);
        }

        /* JADX INFO: renamed from: b */
        public boolean m3993b(Object obj) {
            this.f3844d = true;
            d dVar = this.f3842b;
            boolean z2 = dVar != null && dVar.m3998c(obj);
            if (z2) {
                m3991d();
            }
            return z2;
        }

        /* JADX INFO: renamed from: c */
        public boolean m3994c() {
            this.f3844d = true;
            d dVar = this.f3842b;
            boolean z2 = dVar != null && dVar.m3997b(true);
            if (z2) {
                m3991d();
            }
            return z2;
        }

        /* JADX INFO: renamed from: e */
        public boolean m3995e(Throwable th) {
            this.f3844d = true;
            d dVar = this.f3842b;
            boolean z2 = dVar != null && dVar.m3999d(th);
            if (z2) {
                m3991d();
            }
            return z2;
        }

        protected void finalize() {
            C0935d c0935d;
            d dVar = this.f3842b;
            if (dVar != null && !dVar.isDone()) {
                dVar.m3999d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3841a));
            }
            if (this.f3844d || (c0935d = this.f3843c) == null) {
                return;
            }
            c0935d.mo3979o(null);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$b */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        Object mo3996a(a aVar);
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$d */
    private static final class d implements InterfaceFutureC2137d {

        /* JADX INFO: renamed from: d */
        final WeakReference f3845d;

        /* JADX INFO: renamed from: e */
        private final AbstractC0932a f3846e = new a();

        /* JADX INFO: renamed from: androidx.concurrent.futures.c$d$a */
        class a extends AbstractC0932a {
            a() {
            }

            @Override // androidx.concurrent.futures.AbstractC0932a
            /* JADX INFO: renamed from: l */
            protected String mo3978l() {
                a aVar = (a) d.this.f3845d.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f3841a + "]";
            }
        }

        d(a aVar) {
            this.f3845d = new WeakReference(aVar);
        }

        @Override // p125l1.InterfaceFutureC2137d
        /* JADX INFO: renamed from: a */
        public void mo3975a(Runnable runnable, Executor executor) {
            this.f3846e.mo3975a(runnable, executor);
        }

        /* JADX INFO: renamed from: b */
        boolean m3997b(boolean z2) {
            return this.f3846e.cancel(z2);
        }

        /* JADX INFO: renamed from: c */
        boolean m3998c(Object obj) {
            return this.f3846e.mo3979o(obj);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z2) {
            a aVar = (a) this.f3845d.get();
            boolean zCancel = this.f3846e.cancel(z2);
            if (zCancel && aVar != null) {
                aVar.m3992a();
            }
            return zCancel;
        }

        /* JADX INFO: renamed from: d */
        boolean m3999d(Throwable th) {
            return this.f3846e.mo3980p(th);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f3846e.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f3846e.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f3846e.isDone();
        }

        public String toString() {
            return this.f3846e.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j3, TimeUnit timeUnit) {
            return this.f3846e.get(j3, timeUnit);
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceFutureC2137d m3990a(c cVar) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f3842b = dVar;
        aVar.f3841a = cVar.getClass();
        try {
            Object objMo3996a = cVar.mo3996a(aVar);
            if (objMo3996a != null) {
                aVar.f3841a = objMo3996a;
                return dVar;
            }
        } catch (Exception e3) {
            dVar.m3999d(e3);
        }
        return dVar;
    }
}
