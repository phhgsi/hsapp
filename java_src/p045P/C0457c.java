package p045P;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.C0929i;
import java.util.ArrayList;

/* JADX INFO: renamed from: P.c */
/* JADX INFO: loaded from: classes.dex */
public class C0457c {

    /* JADX INFO: renamed from: j */
    private static final ThreadLocal f1609j = new ThreadLocal();

    /* JADX INFO: renamed from: e */
    private InterfaceC0464j f1614e;

    /* JADX INFO: renamed from: i */
    public e f1618i;

    /* JADX INFO: renamed from: a */
    private final C0929i f1610a = new C0929i();

    /* JADX INFO: renamed from: b */
    final ArrayList f1611b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final b f1612c = new b();

    /* JADX INFO: renamed from: d */
    private final Runnable f1613d = new Runnable() { // from class: P.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f1608d.f1612c.m1660a();
        }
    };

    /* JADX INFO: renamed from: f */
    long f1615f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f1616g = false;

    /* JADX INFO: renamed from: h */
    public float f1617h = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P.c$b */
    class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: a */
        public void m1660a() {
            C0457c.this.f1615f = SystemClock.uptimeMillis();
            C0457c c0457c = C0457c.this;
            c0457c.m1656f(c0457c.f1615f);
            if (C0457c.this.f1611b.size() > 0) {
                C0457c.this.f1614e.mo1666a(C0457c.this.f1613d);
            }
        }
    }

    /* JADX INFO: renamed from: P.c$c */
    interface c {
        /* JADX INFO: renamed from: a */
        boolean mo1661a(long j3);
    }

    /* JADX INFO: renamed from: P.c$d */
    public class d implements e {

        /* JADX INFO: renamed from: a */
        ValueAnimator.DurationScaleChangeListener f1620a;

        public d() {
        }

        @Override // p045P.C0457c.e
        /* JADX INFO: renamed from: a */
        public boolean mo1663a() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f1620a);
            this.f1620a = null;
            return zUnregisterDurationScaleChangeListener;
        }

        @Override // p045P.C0457c.e
        /* JADX INFO: renamed from: b */
        public boolean mo1664b() {
            if (this.f1620a != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: P.f
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f3) {
                    C0457c.this.f1617h = f3;
                }
            };
            this.f1620a = durationScaleChangeListener;
            return ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
        }
    }

    /* JADX INFO: renamed from: P.c$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean mo1663a();

        /* JADX INFO: renamed from: b */
        boolean mo1664b();
    }

    /* JADX INFO: renamed from: P.c$f */
    static final class f implements InterfaceC0464j {

        /* JADX INFO: renamed from: a */
        private final Choreographer f1622a = Choreographer.getInstance();

        /* JADX INFO: renamed from: b */
        private final Looper f1623b = Looper.myLooper();

        f() {
        }

        @Override // p045P.InterfaceC0464j
        /* JADX INFO: renamed from: a */
        public void mo1666a(final Runnable runnable) {
            this.f1622a.postFrameCallback(new Choreographer.FrameCallback() { // from class: P.g
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j3) {
                    runnable.run();
                }
            });
        }

        @Override // p045P.InterfaceC0464j
        /* JADX INFO: renamed from: b */
        public boolean mo1667b() {
            return Thread.currentThread() == this.f1623b.getThread();
        }
    }

    public C0457c(InterfaceC0464j interfaceC0464j) {
        this.f1614e = interfaceC0464j;
    }

    /* JADX INFO: renamed from: e */
    private void m1652e() {
        if (this.f1616g) {
            for (int size = this.f1611b.size() - 1; size >= 0; size--) {
                if (this.f1611b.get(size) == null) {
                    this.f1611b.remove(size);
                }
            }
            if (this.f1611b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.f1618i.mo1663a();
            }
            this.f1616g = false;
        }
    }

    /* JADX INFO: renamed from: h */
    static C0457c m1653h() {
        ThreadLocal threadLocal = f1609j;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0457c(new f()));
        }
        return (C0457c) threadLocal.get();
    }

    /* JADX INFO: renamed from: i */
    private boolean m1654i(c cVar, long j3) {
        Long l3 = (Long) this.f1610a.get(cVar);
        if (l3 == null) {
            return true;
        }
        if (l3.longValue() >= j3) {
            return false;
        }
        this.f1610a.remove(cVar);
        return true;
    }

    /* JADX INFO: renamed from: d */
    void m1655d(c cVar, long j3) {
        if (this.f1611b.size() == 0) {
            this.f1614e.mo1666a(this.f1613d);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f1617h = ValueAnimator.getDurationScale();
                if (this.f1618i == null) {
                    this.f1618i = new d();
                }
                this.f1618i.mo1664b();
            }
        }
        if (!this.f1611b.contains(cVar)) {
            this.f1611b.add(cVar);
        }
        if (j3 > 0) {
            this.f1610a.put(cVar, Long.valueOf(SystemClock.uptimeMillis() + j3));
        }
    }

    /* JADX INFO: renamed from: f */
    void m1656f(long j3) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i3 = 0; i3 < this.f1611b.size(); i3++) {
            c cVar = (c) this.f1611b.get(i3);
            if (cVar != null && m1654i(cVar, jUptimeMillis)) {
                cVar.mo1661a(j3);
            }
        }
        m1652e();
    }

    /* JADX INFO: renamed from: g */
    public float m1657g() {
        return this.f1617h;
    }

    /* JADX INFO: renamed from: j */
    boolean m1658j() {
        return this.f1614e.mo1667b();
    }

    /* JADX INFO: renamed from: k */
    void m1659k(c cVar) {
        this.f1610a.remove(cVar);
        int iIndexOf = this.f1611b.indexOf(cVar);
        if (iIndexOf >= 0) {
            this.f1611b.set(iIndexOf, null);
            this.f1616g = true;
        }
    }
}
