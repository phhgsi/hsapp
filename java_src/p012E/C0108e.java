package p012E;

import android.os.CancellationSignal;

/* JADX INFO: renamed from: E.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0108e {

    /* JADX INFO: renamed from: a */
    private boolean f227a;

    /* JADX INFO: renamed from: b */
    private a f228b;

    /* JADX INFO: renamed from: c */
    private Object f229c;

    /* JADX INFO: renamed from: d */
    private boolean f230d;

    /* JADX INFO: renamed from: E.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo330a();
    }

    /* JADX INFO: renamed from: c */
    private void m327c() {
        while (this.f230d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m328a() {
        synchronized (this) {
            try {
                if (this.f227a) {
                    return;
                }
                this.f227a = true;
                this.f230d = true;
                a aVar = this.f228b;
                Object obj = this.f229c;
                if (aVar != null) {
                    try {
                        aVar.mo330a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f230d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f230d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m329b(a aVar) {
        synchronized (this) {
            try {
                m327c();
                if (this.f228b == aVar) {
                    return;
                }
                this.f228b = aVar;
                if (this.f227a && aVar != null) {
                    aVar.mo330a();
                }
            } finally {
            }
        }
    }
}
