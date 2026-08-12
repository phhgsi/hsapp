package p019G0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: G0.e */
/* JADX INFO: loaded from: classes.dex */
public class C0180e {

    /* JADX INFO: renamed from: a */
    private long f1133a;

    /* JADX INFO: renamed from: b */
    private long f1134b;

    /* JADX INFO: renamed from: c */
    private TimeInterpolator f1135c;

    /* JADX INFO: renamed from: d */
    private int f1136d;

    /* JADX INFO: renamed from: e */
    private int f1137e;

    public C0180e(long j3, long j4) {
        this.f1135c = null;
        this.f1136d = 0;
        this.f1137e = 1;
        this.f1133a = j3;
        this.f1134b = j4;
    }

    /* JADX INFO: renamed from: a */
    static C0180e m494a(ValueAnimator valueAnimator) {
        C0180e c0180e = new C0180e(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        c0180e.f1136d = valueAnimator.getRepeatCount();
        c0180e.f1137e = valueAnimator.getRepeatMode();
        return c0180e;
    }

    /* JADX INFO: renamed from: b */
    public long m495b() {
        return this.f1133a;
    }

    /* JADX INFO: renamed from: c */
    public long m496c() {
        return this.f1134b;
    }

    /* JADX INFO: renamed from: d */
    public TimeInterpolator m497d() {
        TimeInterpolator timeInterpolator = this.f1135c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0176a.f1126b;
    }

    /* JADX INFO: renamed from: e */
    public int m498e() {
        return this.f1136d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0180e)) {
            return false;
        }
        C0180e c0180e = (C0180e) obj;
        if (m495b() == c0180e.m495b() && m496c() == c0180e.m496c() && m498e() == c0180e.m498e() && m499f() == c0180e.m499f()) {
            return m497d().getClass().equals(c0180e.m497d().getClass());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m499f() {
        return this.f1137e;
    }

    public int hashCode() {
        return (((((((((int) (m495b() ^ (m495b() >>> 32))) * 31) + ((int) (m496c() ^ (m496c() >>> 32)))) * 31) + m497d().getClass().hashCode()) * 31) + m498e()) * 31) + m499f();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m495b() + " duration: " + m496c() + " interpolator: " + m497d().getClass() + " repeatCount: " + m498e() + " repeatMode: " + m499f() + "}\n";
    }

    public C0180e(long j3, long j4, TimeInterpolator timeInterpolator) {
        this.f1136d = 0;
        this.f1137e = 1;
        this.f1133a = j3;
        this.f1134b = j4;
        this.f1135c = timeInterpolator;
    }
}
