package p027J;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: J.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0311t {

    /* JADX INFO: renamed from: a */
    private static boolean f1379a = false;

    /* JADX INFO: renamed from: b */
    private static Method f1380b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f1381c = false;

    /* JADX INFO: renamed from: d */
    private static Field f1382d;

    /* JADX INFO: renamed from: J.t$a */
    public interface a {
        /* JADX INFO: renamed from: e */
        boolean mo1061e(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1055a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f1379a) {
            try {
                f1380b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f1379a = true;
        }
        Method method = f1380b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m1056b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m1055a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC0268W.m772h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* JADX INFO: renamed from: c */
    private static boolean m1057c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerM1060f = m1060f(dialog);
        if (onKeyListenerM1060f != null && onKeyListenerM1060f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC0268W.m772h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1058d(View view, KeyEvent keyEvent) {
        return AbstractC0268W.m774i(view, keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1059e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo1061e(keyEvent) : callback instanceof Activity ? m1056b((Activity) callback, keyEvent) : callback instanceof Dialog ? m1057c((Dialog) callback, keyEvent) : (view != null && AbstractC0268W.m772h(view, keyEvent)) || aVar.mo1061e(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    private static DialogInterface.OnKeyListener m1060f(Dialog dialog) {
        if (!f1381c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f1382d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1381c = true;
        }
        Field field = f1382d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
