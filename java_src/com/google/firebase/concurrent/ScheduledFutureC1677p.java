package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractC0932a;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.concurrent.p */
/* JADX INFO: loaded from: classes.dex */
class ScheduledFutureC1677p extends AbstractC0932a implements ScheduledFuture {

    /* JADX INFO: renamed from: k */
    private final ScheduledFuture f8419k;

    /* JADX INFO: renamed from: com.google.firebase.concurrent.p$a */
    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.ScheduledFutureC1677p.b
        /* JADX INFO: renamed from: a */
        public void mo9146a(Throwable th) {
            ScheduledFutureC1677p.this.mo3980p(th);
        }

        @Override // com.google.firebase.concurrent.ScheduledFutureC1677p.b
        public void set(Object obj) {
            ScheduledFutureC1677p.this.mo3979o(obj);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.concurrent.p$b */
    interface b {
        /* JADX INFO: renamed from: a */
        void mo9146a(Throwable th);

        void set(Object obj);
    }

    /* JADX INFO: renamed from: com.google.firebase.concurrent.p$c */
    interface c {
        /* JADX INFO: renamed from: a */
        ScheduledFuture mo9130a(b bVar);
    }

    ScheduledFutureC1677p(c cVar) {
        this.f8419k = cVar.mo9130a(new a());
    }

    @Override // androidx.concurrent.futures.AbstractC0932a
    /* JADX INFO: renamed from: c */
    protected void mo3976c() {
        this.f8419k.cancel(m3981r());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f8419k.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f8419k.compareTo(delayed);
    }
}
