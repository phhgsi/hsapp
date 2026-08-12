package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p104g0.InterfaceC1975a;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1975a {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    static class C1159a {
        /* JADX INFO: renamed from: b */
        public static void m5282b(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.m
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j3) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    private static class C1160b {
        /* JADX INFO: renamed from: a */
        public static Handler m5283a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    public static class C1161c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static void m5277i(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.l
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1170i.m5329h(context);
            }
        });
    }

    @Override // p104g0.InterfaceC1975a
    /* JADX INFO: renamed from: a */
    public List mo4490a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p104g0.InterfaceC1975a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1161c mo4491b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C1161c();
        }
        m5279g(context.getApplicationContext());
        return new C1161c();
    }

    /* JADX INFO: renamed from: g */
    void m5279g(final Context context) {
        C1159a.m5282b(new Runnable() { // from class: androidx.profileinstaller.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f5523d.m5280h(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: h */
    public void m5280h(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? C1160b.m5283a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: androidx.profileinstaller.k
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m5277i(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
