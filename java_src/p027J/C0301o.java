package p027J;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: J.o */
/* JADX INFO: loaded from: classes.dex */
public class C0301o {

    /* JADX INFO: renamed from: a */
    private final Context f1368a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0303p f1369b;

    /* JADX INFO: renamed from: c */
    private final b f1370c;

    /* JADX INFO: renamed from: d */
    private final a f1371d;

    /* JADX INFO: renamed from: e */
    private VelocityTracker f1372e;

    /* JADX INFO: renamed from: f */
    private float f1373f;

    /* JADX INFO: renamed from: g */
    private int f1374g;

    /* JADX INFO: renamed from: h */
    private int f1375h;

    /* JADX INFO: renamed from: i */
    private int f1376i;

    /* JADX INFO: renamed from: j */
    private final int[] f1377j;

    /* JADX INFO: renamed from: J.o$a */
    interface a {
        /* JADX INFO: renamed from: a */
        float mo1026a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i3);
    }

    /* JADX INFO: renamed from: J.o$b */
    interface b {
        /* JADX INFO: renamed from: a */
        void mo1024a(Context context, int[] iArr, MotionEvent motionEvent, int i3);
    }

    public C0301o(Context context, InterfaceC0303p interfaceC0303p) {
        this(context, interfaceC0303p, new b() { // from class: J.m
            @Override // p027J.C0301o.b
            /* JADX INFO: renamed from: a */
            public final void mo1024a(Context context2, int[] iArr, MotionEvent motionEvent, int i3) {
                C0301o.m1030c(context2, iArr, motionEvent, i3);
            }
        }, new a() { // from class: J.n
            @Override // p027J.C0301o.a
            /* JADX INFO: renamed from: a */
            public final float mo1026a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i3) {
                return C0301o.m1033f(velocityTracker, motionEvent, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m1030c(Context context, int[] iArr, MotionEvent motionEvent, int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC0272Z.m888i(context, viewConfiguration, motionEvent.getDeviceId(), i3, motionEvent.getSource());
        iArr[1] = AbstractC0272Z.m887h(context, viewConfiguration, motionEvent.getDeviceId(), i3, motionEvent.getSource());
    }

    /* JADX INFO: renamed from: d */
    private boolean m1031d(MotionEvent motionEvent, int i3) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f1375h == source && this.f1376i == deviceId && this.f1374g == i3) {
            return false;
        }
        this.f1370c.mo1024a(this.f1368a, this.f1377j, motionEvent, i3);
        this.f1375h = source;
        this.f1376i = deviceId;
        this.f1374g = i3;
        return true;
    }

    /* JADX INFO: renamed from: e */
    private float m1032e(MotionEvent motionEvent, int i3) {
        if (this.f1372e == null) {
            this.f1372e = VelocityTracker.obtain();
        }
        return this.f1371d.mo1026a(this.f1372e, motionEvent, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static float m1033f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i3) {
        AbstractC0262T.m697a(velocityTracker, motionEvent);
        AbstractC0262T.m698b(velocityTracker, 1000);
        return AbstractC0262T.m700d(velocityTracker, i3);
    }

    /* JADX INFO: renamed from: g */
    public void m1034g(MotionEvent motionEvent, int i3) {
        boolean zM1031d = m1031d(motionEvent, i3);
        if (this.f1377j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f1372e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1372e = null;
                return;
            }
            return;
        }
        float fM1032e = m1032e(motionEvent, i3) * this.f1369b.mo1037b();
        float fSignum = Math.signum(fM1032e);
        if (zM1031d || (fSignum != Math.signum(this.f1373f) && fSignum != 0.0f)) {
            this.f1369b.mo1038c();
        }
        float fAbs = Math.abs(fM1032e);
        int[] iArr = this.f1377j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fM1032e, iArr[1]));
        this.f1373f = this.f1369b.mo1036a(fMax) ? fMax : 0.0f;
    }

    C0301o(Context context, InterfaceC0303p interfaceC0303p, b bVar, a aVar) {
        this.f1374g = -1;
        this.f1375h = -1;
        this.f1376i = -1;
        this.f1377j = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, 0};
        this.f1368a = context;
        this.f1369b = interfaceC0303p;
        this.f1370c = bVar;
        this.f1371d = aVar;
    }
}
