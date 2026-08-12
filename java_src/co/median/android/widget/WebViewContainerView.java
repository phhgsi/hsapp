package co.median.android.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import co.median.android.AbstractC1323D;
import co.median.android.C1361s;
import co.median.android.GoNativeApplication;
import co.median.android.MainActivity;
import co.median.android.jrejze.R;
import java.lang.reflect.InvocationTargetException;
import p135o0.AbstractC2288b;
import p135o0.C2287a;
import p135o0.InterfaceC2294h;

/* JADX INFO: loaded from: classes.dex */
public class WebViewContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private ViewGroup f6764a;

    /* JADX INFO: renamed from: b */
    private boolean f6765b;

    public WebViewContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6765b = false;
        m7125a(context);
    }

    /* JADX INFO: renamed from: a */
    private void m7125a(Context context) {
        if (C2287a.m10903f(context).f10502S0) {
            try {
                this.f6764a = (ViewGroup) Class.forName("co.median.plugins.android.geckoview.GNGeckoView").getConstructor(Context.class).newInstance(context);
                this.f6765b = true;
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        } else {
            this.f6764a = new C1361s(context);
        }
        this.f6764a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f6764a.setId(R.id.webview);
        addView(this.f6764a);
    }

    /* JADX INFO: renamed from: b */
    public void m7126b(MainActivity mainActivity, boolean z2) {
        if (!this.f6765b) {
            AbstractC1323D.m6736c(getWebview(), mainActivity);
            return;
        }
        try {
            Class<?> cls = Class.forName("co.median.plugins.android.geckoview.WebViewSetup");
            cls.getMethod("setupWebviewForActivity", Activity.class, InterfaceC2294h.class, AbstractC2288b.class, Boolean.TYPE).invoke(cls, mainActivity, (InterfaceC2294h) this.f6764a, ((GoNativeApplication) mainActivity.getApplication()).f6483l, Boolean.valueOf(z2));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public InterfaceC2294h getWebview() {
        return (InterfaceC2294h) this.f6764a;
    }
}
