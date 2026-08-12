package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.C0921a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.firebase.messaging.e0 */
/* JADX INFO: loaded from: classes.dex */
class C1728e0 {

    /* JADX INFO: renamed from: i */
    private static final long f8607i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a */
    private final Context f8608a;

    /* JADX INFO: renamed from: b */
    private final C1700I f8609b;

    /* JADX INFO: renamed from: c */
    private final C1694D f8610c;

    /* JADX INFO: renamed from: d */
    private final FirebaseMessaging f8611d;

    /* JADX INFO: renamed from: f */
    private final ScheduledExecutorService f8613f;

    /* JADX INFO: renamed from: h */
    private final C1724c0 f8615h;

    /* JADX INFO: renamed from: e */
    private final Map f8612e = new C0921a();

    /* JADX INFO: renamed from: g */
    private boolean f8614g = false;

    private C1728e0(FirebaseMessaging firebaseMessaging, C1700I c1700i, C1724c0 c1724c0, C1694D c1694d, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f8611d = firebaseMessaging;
        this.f8609b = c1700i;
        this.f8615h = c1724c0;
        this.f8610c = c1694d;
        this.f8608a = context;
        this.f8613f = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1728e0 m9431a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C1700I c1700i, C1694D c1694d) {
        return new C1728e0(firebaseMessaging, c1700i, C1724c0.m9409a(context, scheduledExecutorService), c1694d, context, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: b */
    private static void m9432b(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e4);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m9433c(String str) throws IOException {
        m9432b(this.f8610c.m9216l(this.f8611d.m9246k(), str));
    }

    /* JADX INFO: renamed from: d */
    private void m9434d(String str) throws IOException {
        m9432b(this.f8610c.m9217m(this.f8611d.m9246k(), str));
    }

    /* JADX INFO: renamed from: e */
    static Task m9435e(final FirebaseMessaging firebaseMessaging, final C1700I c1700i, final C1694D c1694d, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1728e0.m9431a(context, scheduledExecutorService, firebaseMessaging, c1700i, c1694d);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    static boolean m9436g() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: renamed from: i */
    private void m9437i(C1722b0 c1722b0) {
        synchronized (this.f8612e) {
            try {
                String strM9407e = c1722b0.m9407e();
                if (this.f8612e.containsKey(strM9407e)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f8612e.get(strM9407e);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f8612e.remove(strM9407e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private void m9438m() {
        if (m9440h()) {
            return;
        }
        m9446p(0L);
    }

    /* JADX INFO: renamed from: f */
    boolean m9439f() {
        return this.f8615h.m9411b() != null;
    }

    /* JADX INFO: renamed from: h */
    synchronized boolean m9440h() {
        return this.f8614g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m9441j(com.google.firebase.messaging.C1722b0 r7) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C1728e0.m9441j(com.google.firebase.messaging.b0):boolean");
    }

    /* JADX INFO: renamed from: k */
    void m9442k(Runnable runnable, long j3) {
        this.f8613f.schedule(runnable, j3, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: l */
    synchronized void m9443l(boolean z2) {
        this.f8614g = z2;
    }

    /* JADX INFO: renamed from: n */
    void m9444n() {
        if (m9439f()) {
            m9438m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (m9436g() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m9445o() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.c0 r0 = r2.f8615h     // Catch: java.lang.Throwable -> L17
            com.google.firebase.messaging.b0 r0 = r0.m9411b()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = m9436g()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.m9441j(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            com.google.firebase.messaging.c0 r1 = r2.f8615h
            r1.m9412d(r0)
            r2.m9437i(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C1728e0.m9445o():boolean");
    }

    /* JADX INFO: renamed from: p */
    void m9446p(long j3) {
        m9442k(new RunnableC1730f0(this, this.f8608a, this.f8609b, Math.min(Math.max(30L, 2 * j3), f8607i)), j3);
        m9443l(true);
    }
}
