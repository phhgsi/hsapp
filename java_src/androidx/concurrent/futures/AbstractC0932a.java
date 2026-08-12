package androidx.concurrent.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p125l1.InterfaceFutureC2137d;

/* JADX INFO: renamed from: androidx.concurrent.futures.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0932a implements InterfaceFutureC2137d {

    /* JADX INFO: renamed from: g */
    static final boolean f3816g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: h */
    private static final Logger f3817h = Logger.getLogger(AbstractC0932a.class.getName());

    /* JADX INFO: renamed from: i */
    static final b f3818i;

    /* JADX INFO: renamed from: j */
    private static final Object f3819j;

    /* JADX INFO: renamed from: d */
    volatile Object f3820d;

    /* JADX INFO: renamed from: e */
    volatile e f3821e;

    /* JADX INFO: renamed from: f */
    volatile h f3822f;

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$b */
    private static abstract class b {
        private b() {
        }

        /* JADX INFO: renamed from: a */
        abstract boolean mo3982a(AbstractC0932a abstractC0932a, e eVar, e eVar2);

        /* JADX INFO: renamed from: b */
        abstract boolean mo3983b(AbstractC0932a abstractC0932a, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        abstract boolean mo3984c(AbstractC0932a abstractC0932a, h hVar, h hVar2);

        /* JADX INFO: renamed from: d */
        abstract void mo3985d(h hVar, h hVar2);

        /* JADX INFO: renamed from: e */
        abstract void mo3986e(h hVar, Thread thread);
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$c */
    private static final class c {

        /* JADX INFO: renamed from: c */
        static final c f3823c;

        /* JADX INFO: renamed from: d */
        static final c f3824d;

        /* JADX INFO: renamed from: a */
        final boolean f3825a;

        /* JADX INFO: renamed from: b */
        final Throwable f3826b;

        static {
            if (AbstractC0932a.f3816g) {
                f3824d = null;
                f3823c = null;
            } else {
                f3824d = new c(false, null);
                f3823c = new c(true, null);
            }
        }

        c(boolean z2, Throwable th) {
            this.f3825a = z2;
            this.f3826b = th;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$d */
    private static final class d {

        /* JADX INFO: renamed from: b */
        static final d f3827b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        final Throwable f3828a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f3828a = (Throwable) AbstractC0932a.m3966e(th);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$e */
    private static final class e {

        /* JADX INFO: renamed from: d */
        static final e f3829d = new e(null, null);

        /* JADX INFO: renamed from: a */
        final Runnable f3830a;

        /* JADX INFO: renamed from: b */
        final Executor f3831b;

        /* JADX INFO: renamed from: c */
        e f3832c;

        e(Runnable runnable, Executor executor) {
            this.f3830a = runnable;
            this.f3831b = executor;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$f */
    private static final class f extends b {

        /* JADX INFO: renamed from: a */
        final AtomicReferenceFieldUpdater f3833a;

        /* JADX INFO: renamed from: b */
        final AtomicReferenceFieldUpdater f3834b;

        /* JADX INFO: renamed from: c */
        final AtomicReferenceFieldUpdater f3835c;

        /* JADX INFO: renamed from: d */
        final AtomicReferenceFieldUpdater f3836d;

        /* JADX INFO: renamed from: e */
        final AtomicReferenceFieldUpdater f3837e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f3833a = atomicReferenceFieldUpdater;
            this.f3834b = atomicReferenceFieldUpdater2;
            this.f3835c = atomicReferenceFieldUpdater3;
            this.f3836d = atomicReferenceFieldUpdater4;
            this.f3837e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractC0932a.b
        /* JADX INFO: renamed from: a */
        boolean mo3982a(AbstractC0932a abstractC0932a, e eVar, e eVar2) {
            return AbstractC0933b.m3989a(this.f3836d, abstractC0932a, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC0932a.b
        /* JADX INFO: renamed from: b */
        boolean mo3983b(AbstractC0932a abstractC0932a, Object obj, Object obj2) {
            return AbstractC0933b.m3989a(this.f3837e, abstractC0932a, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractC0932a.b
        /* JADX INFO: renamed from: c */
        boolean mo3984c(AbstractC0932a abstractC0932a, h hVar, h hVar2) {
            return AbstractC0933b.m3989a(this.f3835c, abstractC0932a, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC0932a.b
        /* JADX INFO: renamed from: d */
        void mo3985d(h hVar, h hVar2) {
            this.f3834b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC0932a.b
        /* JADX INFO: renamed from: e */
        void mo3986e(h hVar, Thread thread) {
            this.f3833a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$g */
    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractC0932a.b
        /* JADX INFO: renamed from: a */
        boolean mo3982a(AbstractC0932a abstractC0932a, e eVar, e eVar2) {
            synchronized (abstractC0932a) {
                try {
                    if (abstractC0932a.f3821e != eVar) {
                        return false;
                    }
                    abstractC0932a.f3821e = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0932a.b
        /* JADX INFO: renamed from: b */
        boolean mo3983b(AbstractC0932a abstractC0932a, Object obj, Object obj2) {
            synchronized (abstractC0932a) {
                try {
                    if (abstractC0932a.f3820d != obj) {
                        return false;
                    }
                    abstractC0932a.f3820d = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0932a.b
        /* JADX INFO: renamed from: c */
        boolean mo3984c(AbstractC0932a abstractC0932a, h hVar, h hVar2) {
            synchronized (abstractC0932a) {
                try {
                    if (abstractC0932a.f3822f != hVar) {
                        return false;
                    }
                    abstractC0932a.f3822f = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0932a.b
        /* JADX INFO: renamed from: d */
        void mo3985d(h hVar, h hVar2) {
            hVar.f3840b = hVar2;
        }

        @Override // androidx.concurrent.futures.AbstractC0932a.b
        /* JADX INFO: renamed from: e */
        void mo3986e(h hVar, Thread thread) {
            hVar.f3839a = thread;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$h */
    private static final class h {

        /* JADX INFO: renamed from: c */
        static final h f3838c = new h(false);

        /* JADX INFO: renamed from: a */
        volatile Thread f3839a;

        /* JADX INFO: renamed from: b */
        volatile h f3840b;

        h(boolean z2) {
        }

        /* JADX INFO: renamed from: a */
        void m3987a(h hVar) {
            AbstractC0932a.f3818i.mo3985d(this, hVar);
        }

        /* JADX INFO: renamed from: b */
        void m3988b() {
            Thread thread = this.f3839a;
            if (thread != null) {
                this.f3839a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            AbstractC0932a.f3818i.mo3986e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0932a.class, h.class, "f"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0932a.class, e.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0932a.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f3818i = gVar;
        if (th != null) {
            f3817h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3819j = new Object();
    }

    protected AbstractC0932a() {
    }

    /* JADX INFO: renamed from: b */
    private void m3964b(StringBuilder sb) {
        try {
            Object objM3971j = m3971j(this);
            sb.append("SUCCESS, result=[");
            sb.append(m3974q(objM3971j));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    /* JADX INFO: renamed from: d */
    private static CancellationException m3965d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: renamed from: e */
    static Object m3966e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: f */
    private e m3967f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f3821e;
        } while (!f3818i.mo3982a(this, eVar2, e.f3829d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f3832c;
            eVar4.f3832c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX INFO: renamed from: g */
    static void m3968g(AbstractC0932a abstractC0932a) {
        abstractC0932a.m3972m();
        abstractC0932a.mo3976c();
        e eVarM3967f = abstractC0932a.m3967f(null);
        while (eVarM3967f != null) {
            e eVar = eVarM3967f.f3832c;
            m3969h(eVarM3967f.f3830a, eVarM3967f.f3831b);
            eVarM3967f = eVar;
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m3969h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f3817h.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    /* JADX INFO: renamed from: i */
    private Object m3970i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m3965d("Task was cancelled.", ((c) obj).f3826b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f3828a);
        }
        if (obj == f3819j) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: j */
    static Object m3971j(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: m */
    private void m3972m() {
        h hVar;
        do {
            hVar = this.f3822f;
        } while (!f3818i.mo3984c(this, hVar, h.f3838c));
        while (hVar != null) {
            hVar.m3988b();
            hVar = hVar.f3840b;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m3973n(h hVar) {
        hVar.f3839a = null;
        while (true) {
            h hVar2 = this.f3822f;
            if (hVar2 == h.f3838c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f3840b;
                if (hVar2.f3839a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f3840b = hVar4;
                    if (hVar3.f3839a == null) {
                        break;
                    }
                } else if (!f3818i.mo3984c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: q */
    private String m3974q(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // p125l1.InterfaceFutureC2137d
    /* JADX INFO: renamed from: a */
    public final void mo3975a(Runnable runnable, Executor executor) {
        m3966e(runnable);
        m3966e(executor);
        e eVar = this.f3821e;
        if (eVar != e.f3829d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f3832c = eVar;
                if (f3818i.mo3982a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f3821e;
                }
            } while (eVar != e.f3829d);
        }
        m3969h(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    protected void mo3976c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f3820d;
        if (obj == null) {
            if (f3818i.mo3983b(this, obj, f3816g ? new c(z2, new CancellationException("Future.cancel() was called.")) : z2 ? c.f3823c : c.f3824d)) {
                if (z2) {
                    m3977k();
                }
                m3968g(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3820d;
        if (obj != null) {
            return m3970i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f3822f;
            if (hVar != h.f3838c) {
                h hVar2 = new h();
                do {
                    hVar2.m3987a(hVar);
                    if (f3818i.mo3984c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m3973n(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3820d;
                            if (obj2 != null) {
                                return m3970i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m3973n(hVar2);
                    } else {
                        hVar = this.f3822f;
                    }
                } while (hVar != h.f3838c);
            }
            return m3970i(this.f3820d);
        }
        while (nanos > 0) {
            Object obj3 = this.f3820d;
            if (obj3 != null) {
                return m3970i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j4 = -nanos;
            long jConvert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z2) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z2) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3820d instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3820d != null;
    }

    /* JADX INFO: renamed from: k */
    protected void m3977k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    protected String mo3978l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: o */
    protected boolean mo3979o(Object obj) {
        if (obj == null) {
            obj = f3819j;
        }
        if (!f3818i.mo3983b(this, null, obj)) {
            return false;
        }
        m3968g(this);
        return true;
    }

    /* JADX INFO: renamed from: p */
    protected boolean mo3980p(Throwable th) {
        if (!f3818i.mo3983b(this, null, new d((Throwable) m3966e(th)))) {
            return false;
        }
        m3968g(this);
        return true;
    }

    /* JADX INFO: renamed from: r */
    protected final boolean m3981r() {
        Object obj = this.f3820d;
        return (obj instanceof c) && ((c) obj).f3825a;
    }

    public String toString() {
        String strMo3978l;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m3964b(sb);
        } else {
            try {
                strMo3978l = mo3978l();
            } catch (RuntimeException e3) {
                strMo3978l = "Exception thrown from implementation: " + e3.getClass();
            }
            if (strMo3978l != null && !strMo3978l.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo3978l);
                sb.append("]");
            } else if (isDone()) {
                m3964b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3820d;
            if (obj2 != null) {
                return m3970i(obj2);
            }
            h hVar = this.f3822f;
            if (hVar != h.f3838c) {
                h hVar2 = new h();
                do {
                    hVar2.m3987a(hVar);
                    if (f3818i.mo3984c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3820d;
                            } else {
                                m3973n(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return m3970i(obj);
                    }
                    hVar = this.f3822f;
                } while (hVar != h.f3838c);
            }
            return m3970i(this.f3820d);
        }
        throw new InterruptedException();
    }
}
