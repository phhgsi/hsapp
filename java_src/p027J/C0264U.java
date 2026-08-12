package p027J;

import android.view.MotionEvent;

/* JADX INFO: renamed from: J.U */
/* JADX INFO: loaded from: classes.dex */
class C0264U {

    /* JADX INFO: renamed from: a */
    private final float[] f1268a = new float[20];

    /* JADX INFO: renamed from: b */
    private final long[] f1269b = new long[20];

    /* JADX INFO: renamed from: c */
    private float f1270c = 0.0f;

    /* JADX INFO: renamed from: d */
    private int f1271d = 0;

    /* JADX INFO: renamed from: e */
    private int f1272e = 0;

    C0264U() {
    }

    /* JADX INFO: renamed from: b */
    private void m704b() {
        this.f1271d = 0;
        this.f1270c = 0.0f;
    }

    /* JADX INFO: renamed from: e */
    private float m705e() {
        long[] jArr;
        long j3;
        int i3 = this.f1271d;
        if (i3 < 2) {
            return 0.0f;
        }
        int i4 = this.f1272e;
        int i5 = ((i4 + 20) - (i3 - 1)) % 20;
        long j4 = this.f1269b[i4];
        while (true) {
            jArr = this.f1269b;
            j3 = jArr[i5];
            if (j4 - j3 <= 100) {
                break;
            }
            this.f1271d--;
            i5 = (i5 + 1) % 20;
        }
        int i6 = this.f1271d;
        if (i6 < 2) {
            return 0.0f;
        }
        if (i6 == 2) {
            int i7 = (i5 + 1) % 20;
            if (j3 == jArr[i7]) {
                return 0.0f;
            }
            return this.f1268a[i7] / (r2 - j3);
        }
        float fAbs = 0.0f;
        int i8 = 0;
        for (int i9 = 0; i9 < this.f1271d - 1; i9++) {
            int i10 = i9 + i5;
            long[] jArr2 = this.f1269b;
            long j5 = jArr2[i10 % 20];
            int i11 = (i10 + 1) % 20;
            if (jArr2[i11] != j5) {
                i8++;
                float fM706f = m706f(fAbs);
                float f3 = this.f1268a[i11] / (this.f1269b[i11] - j5);
                fAbs += (f3 - fM706f) * Math.abs(f3);
                if (i8 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return m706f(fAbs);
    }

    /* JADX INFO: renamed from: f */
    private static float m706f(float f3) {
        return (f3 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f3) * 2.0f));
    }

    /* JADX INFO: renamed from: a */
    void m707a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f1271d != 0 && eventTime - this.f1269b[this.f1272e] > 40) {
            m704b();
        }
        int i3 = (this.f1272e + 1) % 20;
        this.f1272e = i3;
        int i4 = this.f1271d;
        if (i4 != 20) {
            this.f1271d = i4 + 1;
        }
        this.f1268a[i3] = motionEvent.getAxisValue(26);
        this.f1269b[this.f1272e] = eventTime;
    }

    /* JADX INFO: renamed from: c */
    void m708c(int i3, float f3) {
        float fM705e = m705e() * i3;
        this.f1270c = fM705e;
        if (fM705e < (-Math.abs(f3))) {
            this.f1270c = -Math.abs(f3);
        } else if (this.f1270c > Math.abs(f3)) {
            this.f1270c = Math.abs(f3);
        }
    }

    /* JADX INFO: renamed from: d */
    float m709d(int i3) {
        if (i3 != 26) {
            return 0.0f;
        }
        return this.f1270c;
    }
}
