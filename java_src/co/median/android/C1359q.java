package co.median.android;

import android.content.DialogInterface;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.RelativeLayout;
import co.median.android.C1362t;
import co.median.android.MainActivity;
import co.median.android.jrejze.R;
import java.util.ArrayList;
import p046P0.C0468b;
import p135o0.C2287a;
import p135o0.C2292f;

/* JADX INFO: renamed from: co.median.android.q */
/* JADX INFO: loaded from: classes.dex */
class C1359q extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    private final MainActivity f6688a;

    /* JADX INFO: renamed from: b */
    private final C1321B f6689b;

    /* JADX INFO: renamed from: c */
    private final boolean f6690c;

    /* JADX INFO: renamed from: d */
    private View f6691d;

    /* JADX INFO: renamed from: e */
    private WebChromeClient.CustomViewCallback f6692e;

    /* JADX INFO: renamed from: f */
    private boolean f6693f = false;

    /* JADX INFO: renamed from: g */
    private long f6694g = 0;

    /* JADX INFO: renamed from: co.median.android.q$a */
    class a implements MainActivity.InterfaceC1338j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ PermissionRequest f6695a;

        a(PermissionRequest permissionRequest) {
            this.f6695a = permissionRequest;
        }

        @Override // co.median.android.MainActivity.InterfaceC1338j
        /* JADX INFO: renamed from: a */
        public void mo6964a(String[] strArr, int[] iArr) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (iArr[i3] == 0) {
                    if (strArr[i3].equals("android.permission.RECORD_AUDIO")) {
                        arrayList.add("android.webkit.resource.AUDIO_CAPTURE");
                    } else if (strArr[i3].equals("android.permission.CAMERA")) {
                        arrayList.add("android.webkit.resource.VIDEO_CAPTURE");
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.f6695a.deny();
            } else {
                this.f6695a.grant((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        }
    }

    /* JADX INFO: renamed from: co.median.android.q$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6697a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            f6697a = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6697a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6697a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6697a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6697a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C1359q(MainActivity mainActivity, C1321B c1321b) {
        this.f6688a = mainActivity;
        this.f6689b = c1321b;
        boolean z2 = C2287a.m10903f(mainActivity).f10528d1;
        this.f6690c = z2;
        if (z2) {
            Log.d("GoNative WebView", "Web Console logs enabled");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m7047k(GeolocationPermissions.Callback callback, String str, boolean z2) {
        if (z2) {
            callback.invoke(str, true, false);
        } else {
            callback.invoke(str, false, false);
            this.f6694g = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m7048j() {
        if (!this.f6693f) {
            return false;
        }
        onHideCustomView();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        if (this.f6688a.m6937m2()) {
            this.f6688a.finish();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (this.f6690c) {
            int i3 = b.f6697a[consoleMessage.messageLevel().ordinal()];
            if (i3 == 1) {
                Log.i("[console.log]", consoleMessage.message());
            } else if (i3 == 2 || i3 == 3) {
                Log.d("[console.debug]", consoleMessage.message());
            } else if (i3 == 4) {
                Log.w("[console.warn]", consoleMessage.message());
            } else if (i3 == 5) {
                C2292f.m10956b().m10961g("[console.error]", consoleMessage.message(), new Exception(consoleMessage.message()), 2);
            }
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z2, boolean z3, Message message) {
        this.f6689b.m6725q(webView, message);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        if (!C2287a.m10903f(this.f6688a).f10508V0.m11197d()) {
            callback.invoke(str, false, false);
        } else if (SystemClock.uptimeMillis() - this.f6694g < 1000) {
            callback.invoke(str, false, false);
        } else {
            this.f6688a.m6903P1().m7099h(new C1362t.a() { // from class: co.median.android.h
                @Override // co.median.android.C1362t.a
                /* JADX INFO: renamed from: a */
                public final void mo7037a(boolean z2) {
                    this.f6614a.m7047k(callback, str, z2);
                }
            });
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        this.f6691d = null;
        this.f6693f = false;
        RelativeLayout relativeLayoutM6895K1 = this.f6688a.m6895K1();
        if (relativeLayoutM6895K1 != null) {
            relativeLayoutM6895K1.setVisibility(4);
            relativeLayoutM6895K1.removeAllViews();
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f6692e;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        this.f6688a.m6885C3(this.f6693f);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        new C0468b(this.f6688a).m1742u(str2).m1746y(R.string.ok, new DialogInterface.OnClickListener() { // from class: co.median.android.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                jsResult.confirm();
            }
        }).m1744w(new DialogInterface.OnDismissListener() { // from class: co.median.android.m
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                jsResult.cancel();
            }
        }).m2794n();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        this.f6689b.m6724n();
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        new C0468b(this.f6688a).m1742u(str2).m1746y(R.string.ok, new DialogInterface.OnClickListener() { // from class: co.median.android.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                jsResult.confirm();
            }
        }).m1743v(R.string.cancel, new DialogInterface.OnClickListener() { // from class: co.median.android.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                jsResult.cancel();
            }
        }).m1744w(new DialogInterface.OnDismissListener() { // from class: co.median.android.p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                jsResult.cancel();
            }
        }).m2794n();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        final EditText editText = new EditText(this.f6688a);
        editText.setText(str3);
        new C0468b(this.f6688a).m1742u(str2).m1731B(editText).m1746y(R.string.ok, new DialogInterface.OnClickListener() { // from class: co.median.android.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                jsPromptResult.confirm(editText.getText().toString());
            }
        }).m1743v(R.string.cancel, new DialogInterface.OnClickListener() { // from class: co.median.android.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                jsPromptResult.cancel();
            }
        }).m1744w(new DialogInterface.OnDismissListener() { // from class: co.median.android.k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                jsPromptResult.cancel();
            }
        }).m2794n();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        String[] resources = permissionRequest.getResources();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < resources.length; i3++) {
            if (resources[i3].equals("android.webkit.resource.AUDIO_CAPTURE")) {
                arrayList.add("android.permission.RECORD_AUDIO");
                arrayList.add("android.permission.MODIFY_AUDIO_SETTINGS");
            } else if (resources[i3].equals("android.webkit.resource.VIDEO_CAPTURE")) {
                arrayList.add("android.permission.CAMERA");
            }
        }
        this.f6688a.m6906R1((String[]) arrayList.toArray(new String[arrayList.size()]), new a(permissionRequest));
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        super.onPermissionRequestCanceled(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        this.f6688a.m6888F3();
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        RelativeLayout relativeLayoutM6895K1 = this.f6688a.m6895K1();
        if (relativeLayoutM6895K1 == null) {
            return;
        }
        this.f6691d = view;
        this.f6692e = customViewCallback;
        this.f6693f = true;
        relativeLayoutM6895K1.setVisibility(0);
        relativeLayoutM6895K1.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        this.f6688a.m6885C3(this.f6693f);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.f6689b.m6723m();
        if (fileChooserParams.getMode() == 3) {
            valueCallback.onReceiveValue(null);
            return false;
        }
        this.f6689b.m6709H(valueCallback, fileChooserParams);
        return true;
    }
}
