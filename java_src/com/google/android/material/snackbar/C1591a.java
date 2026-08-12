package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.app.AbstractC0740E;

/* JADX INFO: renamed from: com.google.android.material.snackbar.a */
/* JADX INFO: loaded from: classes.dex */
class C1591a {

    /* JADX INFO: renamed from: c */
    private static C1591a f8048c;

    /* JADX INFO: renamed from: a */
    private final Object f8049a = new Object();

    /* JADX INFO: renamed from: b */
    private final Handler f8050b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C1591a c1591a = C1591a.this;
            AbstractC0740E.m2693a(message.obj);
            c1591a.m8712c(null);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$b */
    interface b {
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$c */
    private static class c {
    }

    private C1591a() {
    }

    /* JADX INFO: renamed from: a */
    private boolean m8709a(c cVar, int i3) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    static C1591a m8710b() {
        if (f8048c == null) {
            f8048c = new C1591a();
        }
        return f8048c;
    }

    /* JADX INFO: renamed from: d */
    private boolean m8711d(b bVar) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    void m8712c(c cVar) {
        synchronized (this.f8049a) {
            m8709a(cVar, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m8713e(b bVar) {
        synchronized (this.f8049a) {
            try {
                if (m8711d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8714f(b bVar) {
        synchronized (this.f8049a) {
            try {
                if (m8711d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
