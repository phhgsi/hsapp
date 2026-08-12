package p106g2;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p041N1.AbstractC0438a;
import p041N1.InterfaceC0446i;
import p102f2.InterfaceC1966x;

/* JADX INFO: renamed from: g2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1980b extends AbstractC0438a implements InterfaceC1966x {
    private volatile Object _preHandler;

    public C1980b() {
        super(InterfaceC1966x.f9486b);
        this._preHandler = this;
    }

    /* JADX INFO: renamed from: D */
    private final Method m10048D() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // p102f2.InterfaceC1966x
    /* JADX INFO: renamed from: C */
    public void mo10034C(InterfaceC0446i interfaceC0446i, Throwable th) {
        int i3 = Build.VERSION.SDK_INT;
        if (26 > i3 || i3 >= 28) {
            return;
        }
        Method methodM10048D = m10048D();
        Object objInvoke = methodM10048D != null ? methodM10048D.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
