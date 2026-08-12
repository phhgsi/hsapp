package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.content.AbstractC0966b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p024I.AbstractC0211h;
import p161x.AbstractC2503b;

/* JADX INFO: renamed from: androidx.fragment.app.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1085m extends AbstractC1082j {

    /* JADX INFO: renamed from: a */
    private final Activity f5186a;

    /* JADX INFO: renamed from: b */
    private final Context f5187b;

    /* JADX INFO: renamed from: c */
    private final Handler f5188c;

    /* JADX INFO: renamed from: d */
    private final int f5189d;

    /* JADX INFO: renamed from: e */
    final FragmentManager f5190e;

    AbstractC1085m(AbstractActivityC1080h abstractActivityC1080h) {
        this(abstractActivityC1080h, abstractActivityC1080h, new Handler(), 0);
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo4933A();

    /* JADX INFO: renamed from: h */
    Activity m4962h() {
        return this.f5186a;
    }

    /* JADX INFO: renamed from: m */
    Context m4963m() {
        return this.f5187b;
    }

    /* JADX INFO: renamed from: o */
    public Handler m4964o() {
        return this.f5188c;
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo4936t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: u */
    public abstract Object mo4937u();

    /* JADX INFO: renamed from: v */
    public abstract LayoutInflater mo4938v();

    /* JADX INFO: renamed from: w */
    public void m4965w(Fragment fragment, String[] strArr, int i3) {
    }

    /* JADX INFO: renamed from: x */
    public abstract boolean mo4939x(String str);

    /* JADX INFO: renamed from: y */
    public void m4966y(Fragment fragment, Intent intent, int i3, Bundle bundle) {
        if (i3 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC0966b.startActivity(this.f5187b, intent, bundle);
    }

    /* JADX INFO: renamed from: z */
    public void m4967z(Fragment fragment, IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) throws IntentSender.SendIntentException {
        if (i3 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        AbstractC2503b.m11895g(this.f5186a, intentSender, i3, intent, i4, i5, i6, bundle);
    }

    AbstractC1085m(Activity activity, Context context, Handler handler, int i3) {
        this.f5190e = new C1093u();
        this.f5186a = activity;
        this.f5187b = (Context) AbstractC0211h.m611h(context, "context == null");
        this.f5188c = (Handler) AbstractC0211h.m611h(handler, "handler == null");
        this.f5189d = i3;
    }
}
