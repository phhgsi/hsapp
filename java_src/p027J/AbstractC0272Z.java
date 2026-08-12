package p027J;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.Objects;
import p024I.InterfaceC0212i;

/* JADX INFO: renamed from: J.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0272Z {

    /* JADX INFO: renamed from: a */
    private static Method f1301a;

    /* JADX INFO: renamed from: J.Z$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static float m892a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        /* JADX INFO: renamed from: b */
        static float m893b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: renamed from: J.Z$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static int m894a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        /* JADX INFO: renamed from: b */
        static boolean m895b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: renamed from: J.Z$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static int m896a(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i3, i4, i5);
        }

        /* JADX INFO: renamed from: b */
        static int m897b(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i3, i4, i5);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f1301a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m880a(Resources resources, int i3, InterfaceC0212i interfaceC0212i, int i4) {
        int dimensionPixelSize;
        return i3 != -1 ? (i3 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i3)) < 0) ? i4 : dimensionPixelSize : ((Integer) interfaceC0212i.get()).intValue();
    }

    /* JADX INFO: renamed from: b */
    private static float m881b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f1301a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    private static int m882c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    /* JADX INFO: renamed from: d */
    private static int m883d(Resources resources, int i3, int i4) {
        if (i3 == 4194304 && i4 == 26) {
            return m882c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    private static int m884e(Resources resources, int i3, int i4) {
        if (i3 == 4194304 && i4 == 26) {
            return m882c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static float m885f(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.m892a(viewConfiguration) : m881b(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: g */
    public static int m886g(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? b.m894a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* JADX INFO: renamed from: h */
    public static int m887h(Context context, final ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.m896a(viewConfiguration, i3, i4, i5);
        }
        if (!m890k(i3, i4, i5)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iM883d = m883d(resources, i5, i4);
        Objects.requireNonNull(viewConfiguration);
        return m880a(resources, iM883d, new InterfaceC0212i() { // from class: J.X
            @Override // p024I.InterfaceC0212i
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: i */
    public static int m888i(Context context, final ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.m897b(viewConfiguration, i3, i4, i5);
        }
        if (!m890k(i3, i4, i5)) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Resources resources = context.getResources();
        int iM884e = m884e(resources, i5, i4);
        Objects.requireNonNull(viewConfiguration);
        return m880a(resources, iM884e, new InterfaceC0212i() { // from class: J.Y
            @Override // p024I.InterfaceC0212i
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: j */
    public static float m889j(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.m893b(viewConfiguration) : m881b(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: k */
    private static boolean m890k(int i3, int i4, int i5) {
        InputDevice device = InputDevice.getDevice(i3);
        return (device == null || device.getMotionRange(i4, i5) == null) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m891l(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m895b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iM882c = m882c(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iM882c != 0 && resources.getBoolean(iM882c);
    }
}
