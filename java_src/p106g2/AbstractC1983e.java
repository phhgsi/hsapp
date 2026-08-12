package p106g2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import p035L1.AbstractC0381m;
import p035L1.AbstractC0382n;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: g2.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1983e {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1982d f9515a;
    private static volatile Choreographer choreographer;

    static {
        Object objM1369a;
        try {
            AbstractC0381m.a aVar = AbstractC0381m.f1498d;
            objM1369a = AbstractC0381m.m1369a(new C1981c(m10051a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            AbstractC0381m.a aVar2 = AbstractC0381m.f1498d;
            objM1369a = AbstractC0381m.m1369a(AbstractC0382n.m1372a(th));
        }
        f9515a = (AbstractC1982d) (AbstractC0381m.m1371c(objM1369a) ? null : objM1369a);
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m10051a(Looper looper, boolean z2) throws IllegalAccessException, InvocationTargetException {
        if (!z2) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        AbstractC0606k.m2143c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
