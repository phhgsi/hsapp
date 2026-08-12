package co.median.android;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.provider.Settings;
import android.telephony.SignalStrength;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.activity.AbstractC0678F;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AbstractActivityC0748d;
import androidx.appcompat.app.AbstractC0745a;
import androidx.core.content.AbstractC0966b;
import co.median.android.C1360r;
import co.median.android.MainActivity;
import co.median.android.MySwipeRefreshLayout;
import co.median.android.jrejze.R;
import co.median.android.widget.AbstractC1369b;
import co.median.android.widget.MedianProgressView;
import co.median.android.widget.SwipeHistoryNavigationLayout;
import co.median.android.widget.WebViewContainerView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p018G.C0158g;
import p018G.C0172u;
import p083b.AbstractC1294b;
import p083b.InterfaceC1293a;
import p087c.C1309c;
import p087c.C1310d;
import p093d1.AbstractC1791c;
import p093d1.C1789a;
import p093d1.InterfaceC1790b;
import p120k0.AbstractC2110a;
import p120k0.AbstractC2112c;
import p128m0.AbstractC2181U;
import p128m0.AbstractC2207e1;
import p128m0.AbstractC2218i0;
import p128m0.AbstractC2235o;
import p128m0.AbstractC2244r;
import p128m0.C2142A;
import p128m0.C2154G;
import p128m0.C2173P0;
import p128m0.C2186W0;
import p128m0.C2187X;
import p128m0.C2190Y0;
import p128m0.C2205e;
import p128m0.C2210f1;
import p128m0.C2246r1;
import p131n.C2277a;
import p131n.C2278b;
import p135o0.AbstractC2288b;
import p135o0.AbstractC2296j;
import p135o0.C2287a;
import p135o0.C2290d;
import p135o0.C2292f;
import p135o0.InterfaceC2293g;
import p135o0.InterfaceC2294h;
import p141q0.C2349c;
import p161x.AbstractC2503b;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends AbstractActivityC0748d implements Observer, InterfaceC2293g, AbstractC1369b.j, LocationListener {

    /* JADX INFO: renamed from: I0 */
    private static final String f6488I0 = "co.median.android.MainActivity";

    /* JADX INFO: renamed from: A0 */
    private C2173P0 f6489A0;

    /* JADX INFO: renamed from: B0 */
    private String f6490B0;

    /* JADX INFO: renamed from: C0 */
    private String f6491C0;

    /* JADX INFO: renamed from: D0 */
    private C1320A f6493D0;

    /* JADX INFO: renamed from: E */
    private WebViewContainerView f6494E;

    /* JADX INFO: renamed from: F */
    private InterfaceC2294h f6496F;

    /* JADX INFO: renamed from: F0 */
    private C2190Y0 f6497F0;

    /* JADX INFO: renamed from: I */
    private View f6502I;

    /* JADX INFO: renamed from: J */
    private String f6503J;

    /* JADX INFO: renamed from: K */
    private MedianProgressView f6504K;

    /* JADX INFO: renamed from: L */
    private MySwipeRefreshLayout f6505L;

    /* JADX INFO: renamed from: M */
    private SwipeHistoryNavigationLayout f6506M;

    /* JADX INFO: renamed from: N */
    private RelativeLayout f6507N;

    /* JADX INFO: renamed from: P */
    private C1378z f6509P;

    /* JADX INFO: renamed from: Q */
    private C2205e f6510Q;

    /* JADX INFO: renamed from: R */
    private C2186W0 f6511R;

    /* JADX INFO: renamed from: S */
    private boolean f6512S;

    /* JADX INFO: renamed from: X */
    private String f6517X;

    /* JADX INFO: renamed from: Z */
    private C1346d f6519Z;

    /* JADX INFO: renamed from: a0 */
    private C1349g f6520a0;

    /* JADX INFO: renamed from: b0 */
    private C1363u f6521b0;

    /* JADX INFO: renamed from: c0 */
    private C1377y f6522c0;

    /* JADX INFO: renamed from: d0 */
    private C1337i f6523d0;

    /* JADX INFO: renamed from: e0 */
    private C2187X f6524e0;

    /* JADX INFO: renamed from: g0 */
    protected String f6526g0;

    /* JADX INFO: renamed from: h0 */
    protected String f6527h0;

    /* JADX INFO: renamed from: i0 */
    private Stack f6528i0;

    /* JADX INFO: renamed from: j0 */
    private C1362t f6529j0;

    /* JADX INFO: renamed from: m0 */
    private String f6532m0;

    /* JADX INFO: renamed from: n0 */
    private SignalStrength f6533n0;

    /* JADX INFO: renamed from: p0 */
    private AbstractC1294b f6535p0;

    /* JADX INFO: renamed from: q0 */
    private AbstractC1294b f6536q0;

    /* JADX INFO: renamed from: r0 */
    private AbstractC1294b f6537r0;

    /* JADX INFO: renamed from: s0 */
    private C1321B f6538s0;

    /* JADX INFO: renamed from: v0 */
    private boolean f6541v0;

    /* JADX INFO: renamed from: w0 */
    private C0172u f6542w0;

    /* JADX INFO: renamed from: x0 */
    private String f6543x0;

    /* JADX INFO: renamed from: D */
    private boolean f6492D = false;

    /* JADX INFO: renamed from: G */
    boolean f6498G = false;

    /* JADX INFO: renamed from: H */
    private Stack f6500H = new Stack();

    /* JADX INFO: renamed from: O */
    private ConnectivityManager f6508O = null;

    /* JADX INFO: renamed from: T */
    private boolean f6513T = false;

    /* JADX INFO: renamed from: U */
    private Handler f6514U = new Handler();

    /* JADX INFO: renamed from: V */
    private float f6515V = 0.0f;

    /* JADX INFO: renamed from: W */
    private boolean f6516W = false;

    /* JADX INFO: renamed from: Y */
    private final Runnable f6518Y = new RunnableC1331c();

    /* JADX INFO: renamed from: f0 */
    private boolean f6525f0 = false;

    /* JADX INFO: renamed from: k0 */
    private ArrayList f6530k0 = new ArrayList();

    /* JADX INFO: renamed from: l0 */
    private ArrayList f6531l0 = new ArrayList();

    /* JADX INFO: renamed from: o0 */
    private boolean f6534o0 = false;

    /* JADX INFO: renamed from: t0 */
    private String f6539t0 = "";

    /* JADX INFO: renamed from: u0 */
    private boolean f6540u0 = false;

    /* JADX INFO: renamed from: y0 */
    private String f6544y0 = null;

    /* JADX INFO: renamed from: z0 */
    private boolean f6545z0 = false;

    /* JADX INFO: renamed from: E0 */
    private boolean f6495E0 = false;

    /* JADX INFO: renamed from: G0 */
    private float f6499G0 = 3.0f;

    /* JADX INFO: renamed from: H0 */
    private float f6501H0 = -1.0f;

    /* JADX INFO: renamed from: co.median.android.MainActivity$a */
    class DialogInterfaceOnClickListenerC1329a implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC1329a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i3) {
            MainActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$b */
    static /* synthetic */ class C1330b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6547a;

        static {
            int[] iArr = new int[C2287a.b.values().length];
            f6547a = iArr;
            try {
                iArr[C2287a.b.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6547a[C2287a.b.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6547a[C2287a.b.LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$c */
    class RunnableC1331c implements Runnable {
        RunnableC1331c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void m6955b() {
            MainActivity.this.m6945r1();
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() { // from class: co.median.android.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6834d.m6955b();
                }
            });
            MainActivity.this.f6514U.postDelayed(MainActivity.this.f6518Y, 100L);
        }
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$d */
    class C1332d implements SwipeHistoryNavigationLayout.InterfaceC1366a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2287a f6549a;

        C1332d(C2287a c2287a) {
            this.f6549a = c2287a;
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: a */
        public boolean mo6956a() {
            if (MainActivity.this.f6496F.getMaxHorizontalScroll() <= 0 || MainActivity.this.f6496F.getScrollX() >= MainActivity.this.f6496F.getMaxHorizontalScroll()) {
                return MainActivity.this.m6856n1();
            }
            return false;
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: b */
        public boolean mo6957b() {
            if (!this.f6549a.f10533f0 || !MainActivity.this.m6936m1()) {
                return false;
            }
            MainActivity.this.m6918Y1();
            return true;
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: c */
        public boolean mo6958c() {
            return this.f6549a.f10533f0;
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: d */
        public void mo6959d() {
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: e */
        public void mo6960e() {
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: f */
        public String mo6961f() {
            return "";
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: g */
        public boolean mo6962g() {
            if (!this.f6549a.f10533f0 || !MainActivity.this.m6856n1()) {
                return false;
            }
            MainActivity.this.m6832Z1();
            return true;
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: h */
        public boolean mo6963h() {
            if (MainActivity.this.f6496F.getMaxHorizontalScroll() <= 0 || MainActivity.this.f6496F.getScrollX() <= 0) {
                return MainActivity.this.m6936m1();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$e */
    class C1333e extends C2290d.a {
        C1333e() {
        }
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$f */
    class C1334f extends AbstractC0678F {
        C1334f(boolean z2) {
            super(z2);
        }

        @Override // androidx.activity.AbstractC0678F
        /* JADX INFO: renamed from: d */
        public void mo2566d() {
            if (MainActivity.this.m6819Q2()) {
                return;
            }
            m2572j(false);
            MainActivity.this.mo2527c().m2607l();
            m2572j(true);
        }
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$g */
    class RunnableC1335g implements Runnable {
        RunnableC1335g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.f6505L.setRefreshing(false);
        }
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$h */
    class C1336h extends AnimatorListenerAdapter {
        C1336h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (MainActivity.this.f6542w0 != null) {
                MainActivity.this.f6542w0.m467b();
                MainActivity.this.f6542w0 = null;
            }
            MainActivity mainActivity = MainActivity.this;
            mainActivity.m6890G3(C2287a.m10903f(mainActivity).f10476F0);
            MainActivity mainActivity2 = MainActivity.this;
            mainActivity2.m6892H3(C2287a.m10903f(mainActivity2).f10478G0);
        }
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$i */
    private class C1337i extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MainActivity.this.m6830Y2();
            if (MainActivity.this.f6532m0 != null) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.m6836b3(mainActivity.f6532m0);
            }
        }

        private C1337i() {
        }
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$j */
    public interface InterfaceC1338j {
        /* JADX INFO: renamed from: a */
        void mo6964a(String[] strArr, int[] iArr);
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$k */
    private class C1339k {

        /* JADX INFO: renamed from: a */
        String[] f6556a;

        /* JADX INFO: renamed from: b */
        InterfaceC1338j f6557b;

        C1339k(String[] strArr, InterfaceC1338j interfaceC1338j) {
            this.f6556a = strArr;
            this.f6557b = interfaceC1338j;
        }
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$l */
    public class C1340l {
        public C1340l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReadyState$0(String str) {
            MainActivity.this.m6863s1(str);
        }

        @JavascriptInterface
        public void onReadyState(final String str) {
            MainActivity.this.runOnUiThread(new Runnable() { // from class: m0.K0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9981d.lambda$onReadyState$0(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: co.median.android.MainActivity$m */
    public class C1341m {
        public C1341m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void m6968c(String str, String str2) {
            new AlertDialog.Builder(MainActivity.this).setTitle(str).setMessage(str2).setPositiveButton("OK", (DialogInterface.OnClickListener) null).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public /* synthetic */ void m6969d(String str) {
            Toast.makeText(MainActivity.this, str, 0).show();
        }

        @JavascriptInterface
        public void onUserLoggedIn(String str) {
            Log.d(MainActivity.f6488I0, "User logged in: " + str);
            String string = MainActivity.this.getSharedPreferences("_median_push", 0).getString("fcm_token", null);
            if (string == null || str == null || str.isEmpty()) {
                return;
            }
            MainActivity.this.m6841d3(string, str);
        }

        @JavascriptInterface
        public void showDialog(final String str, final String str2) {
            MainActivity.this.runOnUiThread(new Runnable() { // from class: m0.L0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9986d.m6968c(str, str2);
                }
            });
        }

        @JavascriptInterface
        public void showToast(final String str) {
            MainActivity.this.runOnUiThread(new Runnable() { // from class: m0.M0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9991d.m6969d(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A1 */
    private void m6781A1(final String str) {
        final String strM10821b = AbstractC2244r.m10821b(this);
        if (AbstractC2244r.m10823d(this)) {
            m6866t2(str, strM10821b);
        } else {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: m0.s0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10380d.m6868u2(str, strM10821b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m6782A2(GoNativeApplication goNativeApplication, C0172u c0172u) {
        this.f6542w0 = c0172u;
        goNativeApplication.f6483l.m10929a(this, c0172u, new Runnable() { // from class: m0.F0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9970d.m6881z2();
            }
        });
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: m0.G0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9974d.m6827W2();
            }
        }, 7000L);
    }

    /* JADX INFO: renamed from: A3 */
    private void m6783A3(boolean z2, int i3) {
        if (z2 && C2287a.m10903f(this).f10585z0) {
            new Handler().postDelayed(new RunnableC1335g(), i3);
        } else {
            this.f6505L.setRefreshing(false);
        }
    }

    /* JADX INFO: renamed from: B1 */
    private String m6785B1(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.setReadTimeout(3000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() != 200) {
                return null;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    String strOptString = jSONObject.optString("active_url", "https://hamareshikshak.educationportal3.mp.gov.in");
                    AbstractC2244r.m10825f(this, strOptString, jSONObject.optInt("cache_duration_minutes", 1));
                    return strOptString;
                }
                sb.append(line);
            }
        } catch (Exception e3) {
            Log.e(f6488I0, "Error fetching dynamic route from " + str, e3);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ boolean m6786B2() {
        return !this.f6541v0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public /* synthetic */ void m6788C2(Boolean bool) {
        m6919Z2(this.f6539t0, false);
    }

    /* JADX INFO: renamed from: D1 */
    private int m6790D1(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeValue(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public /* synthetic */ void m6791D2(ActivityResult activityResult) {
        mo6920a(AbstractC2296j.m10965b("median_appbrowser_closed", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public /* synthetic */ void m6793E2(C2154G c2154g) {
        C1321B c1321b = this.f6538s0;
        if (c1321b != null) {
            c1321b.m6728t(c2154g);
        }
    }

    /* JADX INFO: renamed from: E3 */
    private void m6794E3(boolean z2) {
        C2186W0 c2186w0 = this.f6511R;
        if (c2186w0 == null) {
            return;
        }
        try {
            if (z2) {
                c2186w0.m10710r("loggedIn");
            } else {
                c2186w0.m10710r("default");
            }
        } catch (Exception e3) {
            C2292f.m10956b().m10960f(f6488I0, e3.getMessage(), e3);
        }
    }

    /* JADX INFO: renamed from: F1 */
    private String m6796F1() {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfoResolveActivity = getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 65536);
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return null;
        }
        return activityInfo.packageName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public /* synthetic */ boolean m6797F2() {
        return this.f6496F.getWebViewScrollY() > 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public /* synthetic */ boolean m6799G2(String str) {
        if (TextUtils.isEmpty(str)) {
            if (m6898M1().m7057i(this.f6517X)) {
                return false;
            }
            finish();
            return true;
        }
        if (!str.equals(this.f6517X)) {
            return false;
        }
        finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public /* synthetic */ void m6801H2(DialogInterface dialogInterface, int i3) {
        finishAffinity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public /* synthetic */ void m6803I2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Security Alert");
        builder.setMessage("Do not use Fake/Mock GPS location.\n\nPlease disable mock locations in your developer settings to continue.");
        builder.setCancelable(false);
        builder.setPositiveButton("Exit App", new DialogInterface.OnClickListener() { // from class: m0.z0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f10403a.m6801H2(dialogInterface, i3);
            }
        });
        builder.show();
    }

    /* JADX INFO: renamed from: I3 */
    private void m6804I3(Configuration configuration) {
        int i3 = configuration.uiMode & 48;
        this.f6497F0.m10721f(i3 != 16 ? i3 != 32 ? "" : "dark" : "light");
        this.f6510Q.m10756s();
        this.f6509P.m7183l();
        this.f6511R.m10705j();
        m6862r3(this.f6490B0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public /* synthetic */ void m6806J2(String str, C1360r c1360r) {
        this.f6496F.loadUrl(str);
        c1360r.m7063o(null);
    }

    /* JADX INFO: renamed from: J3 */
    private boolean m6807J3(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        if (str.startsWith("http://")) {
            str = "https://" + str.substring(7);
        }
        return str.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public /* synthetic */ void m6809K2(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(AbstractC2244r.m10820a(this, "/api/save_fcm_token.php")).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            String str2 = "fcm_token=" + URLEncoder.encode(str, "UTF-8") + "&platform=android";
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(str2.getBytes("UTF-8"));
            outputStream.flush();
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            Log.d(f6488I0, "FCM Token sent to server, response: " + responseCode);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    Log.d(f6488I0, "Server response: " + sb.toString());
                    return;
                }
                sb.append(line);
            }
        } catch (Exception e3) {
            Log.e(f6488I0, "Error sending FCM token: " + e3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public /* synthetic */ void m6811L2(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(AbstractC2244r.m10820a(this, "/api/save_fcm_token.php")).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            String str3 = "fcm_token=" + URLEncoder.encode(str, "UTF-8") + "&platform=android&username=" + URLEncoder.encode(str2, "UTF-8");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(str3.getBytes("UTF-8"));
            outputStream.flush();
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            Log.d(f6488I0, "FCM Token sent with username, response: " + responseCode);
        } catch (Exception e3) {
            Log.e(f6488I0, "Error sending FCM token with username: " + e3.getMessage());
        }
    }

    /* JADX INFO: renamed from: L3 */
    private void m6812L3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m6866t2(String str, String str2) {
        String strM10826g = AbstractC2244r.m10826g(this, str);
        this.f6503J = strM10826g;
        if (this.f6496F != null) {
            Log.d(f6488I0, "Loading URL: " + strM10826g);
            this.f6496F.loadUrl(strM10826g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public boolean m6819Q2() {
        if (C2287a.m10903f(this).f10557n0 || this.f6496F.mo7081d()) {
            return true;
        }
        C2186W0 c2186w0 = this.f6511R;
        if (c2186w0 != null && c2186w0.m10703h()) {
            this.f6511R.m10701e();
            return true;
        }
        if (m6936m1()) {
            m6918Y1();
            return true;
        }
        if (this.f6528i0.isEmpty()) {
            return false;
        }
        Bundle bundle = (Bundle) this.f6528i0.pop();
        C1361s c1361s = new C1361s(this);
        c1361s.mo7082e(bundle);
        m6883B3(c1361s, false, true);
        return true;
    }

    /* JADX INFO: renamed from: U1 */
    private String m6824U1(Intent intent) {
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("targetUrl");
        if (stringExtra != null && !stringExtra.isEmpty()) {
            return stringExtra;
        }
        if (!"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null || !(data.getScheme().endsWith(".http") || data.getScheme().endsWith(".https"))) {
            return intent.getDataString();
        }
        Uri.Builder builderBuildUpon = data.buildUpon();
        if (data.getScheme().endsWith(".https")) {
            builderBuildUpon.scheme("https");
        } else if (data.getScheme().endsWith(".http")) {
            builderBuildUpon.scheme("http");
        }
        return builderBuildUpon.build().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public void m6827W2() {
        C0172u c0172u = this.f6542w0;
        if (c0172u != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0172u.m466a(), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.addListener(new C1336h());
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public void m6830Y2() {
        InterfaceC2294h interfaceC2294h = this.f6496F;
        if (interfaceC2294h != null && interfaceC2294h.getProgress() >= 100) {
            String url = this.f6496F.getUrl();
            if ((url != null && !url.equals("file:///android_asset/offline.html")) || this.f6500H.isEmpty() || m6929i2()) {
                return;
            }
            m6900N2((String) this.f6500H.pop());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public void m6832Z1() {
        if (C1361s.m7077h()) {
            m6923d2();
        }
        this.f6496F.goForward();
    }

    /* JADX INFO: renamed from: b2 */
    private boolean m6835b2(Intent intent) {
        if (intent == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra("click_url");
        String stringExtra2 = intent.getStringExtra("is_external_url");
        final String stringExtra3 = intent.getStringExtra("flash_msg");
        if (stringExtra3 != null && !stringExtra3.isEmpty()) {
            runOnUiThread(new Runnable() { // from class: m0.t0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10385d.m6872w2(stringExtra3);
                }
            });
        }
        if (stringExtra != null && !stringExtra.isEmpty()) {
            Log.d(f6488I0, "Processing notification URL: " + stringExtra);
            boolean z2 = "true".equalsIgnoreCase(stringExtra2) || "1".equals(stringExtra2);
            if (!z2 && stringExtra.startsWith("http")) {
                z2 = !AbstractC2244r.m10824e(this, stringExtra);
            }
            if (!z2) {
                if (!stringExtra.startsWith("http")) {
                    if (!stringExtra.startsWith("/")) {
                        stringExtra = "/" + stringExtra;
                    }
                    stringExtra = AbstractC2244r.m10820a(this, stringExtra);
                }
                this.f6503J = stringExtra;
                return true;
            }
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(stringExtra)));
                return false;
            } catch (Exception e3) {
                Log.e(f6488I0, "Error opening external URL", e3);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public void m6836b3(String str) {
        NetworkInfo activeNetworkInfo = this.f6508O.getActiveNetworkInfo();
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        String typeName = activeNetworkInfo != null ? activeNetworkInfo.getTypeName() : "DISCONNECTED";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("connected", z2);
            jSONObject.put("type", typeName);
            if (this.f6533n0 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cdmaDbm", this.f6533n0.getCdmaDbm());
                jSONObject2.put("cdmaEcio", this.f6533n0.getCdmaEcio());
                jSONObject2.put("evdoDbm", this.f6533n0.getEvdoDbm());
                jSONObject2.put("evdoEcio", this.f6533n0.getEvdoEcio());
                jSONObject2.put("evdoSnr", this.f6533n0.getEvdoSnr());
                jSONObject2.put("gsmBitErrorRate", this.f6533n0.getGsmBitErrorRate());
                jSONObject2.put("gsmSignalStrength", this.f6533n0.getGsmSignalStrength());
                jSONObject2.put("level", this.f6533n0.getLevel());
                jSONObject.put("cellSignalStrength", jSONObject2);
            }
            mo6920a(AbstractC2296j.m10965b(str, jSONObject));
        } catch (JSONException e3) {
            C2292f.m10956b().m10960f(f6488I0, "JSON error sending connectivity", e3);
        }
    }

    /* JADX INFO: renamed from: c2 */
    private void m6838c2(Intent intent) {
        if (intent == null) {
            return;
        }
        final String stringExtra = intent.getStringExtra("load_url");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("click_url");
        }
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra(ImagesContract.URL);
        }
        String stringExtra2 = intent.getStringExtra("is_external_url");
        if (stringExtra != null && !stringExtra.isEmpty()) {
            String str = f6488I0;
            Log.d(str, "Notification URL received: " + stringExtra);
            boolean z2 = "true".equalsIgnoreCase(stringExtra2) || "1".equals(stringExtra2);
            if (!z2 && stringExtra.startsWith("http")) {
                z2 = !AbstractC2244r.m10824e(this, stringExtra);
            }
            if (z2) {
                Log.d(str, "Opening external URL in browser: " + stringExtra);
                try {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(stringExtra)));
                } catch (Exception e3) {
                    Log.e(f6488I0, "Error opening external URL: " + e3.getMessage());
                }
            } else {
                if (!stringExtra.startsWith("http")) {
                    if (!stringExtra.startsWith("/")) {
                        stringExtra = "/" + stringExtra;
                    }
                    stringExtra = AbstractC2244r.m10820a(this, stringExtra);
                }
                Log.d(str, "Loading internal URL in WebView: " + stringExtra);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: m0.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10373d.m6877y2(stringExtra);
                    }
                }, 500L);
            }
            intent.removeExtra("load_url");
            intent.removeExtra("click_url");
            intent.removeExtra(ImagesContract.URL);
            intent.removeExtra("is_external_url");
        }
        final String stringExtra3 = intent.getStringExtra("flash_msg");
        if (stringExtra3 == null) {
            stringExtra3 = intent.getStringExtra("flash");
        }
        if (stringExtra3 == null || stringExtra3.isEmpty()) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: m0.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10377d.m6875x2(stringExtra3);
            }
        });
        intent.removeExtra("flash_msg");
        intent.removeExtra("flash");
    }

    /* JADX INFO: renamed from: c3 */
    private void m6839c3(final String str) {
        new Thread(new Runnable() { // from class: m0.B0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9955d.m6809K2(str);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public void m6841d3(final String str, final String str2) {
        new Thread(new Runnable() { // from class: m0.C0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9957d.m6811L2(str, str2);
            }
        }).start();
    }

    /* JADX INFO: renamed from: e2 */
    private void m6843e2() {
        File file = new File(getCacheDir(), "webviewDatabase");
        if (file.mkdirs()) {
            Log.v(f6488I0, "databasePath " + file.toString() + " exists");
        }
        C2210f1.m10771a().m10774c(this);
        new C1343a(this).m6980b();
        this.f6522c0 = m6897L1().m6772g();
    }

    /* JADX INFO: renamed from: g2 */
    private boolean m6846g2(Uri uri) {
        List list;
        if (uri == null || (list = C2287a.m10903f(this).f10571s0) == null || list.isEmpty()) {
            return false;
        }
        return list.contains(uri.getHost());
    }

    /* JADX INFO: renamed from: h2 */
    private boolean m6848h2() {
        return Settings.Global.getInt(getContentResolver(), "development_settings_enabled", 0) == 1;
    }

    /* JADX INFO: renamed from: k2 */
    private boolean m6852k2(Location location) {
        if (location == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider();
    }

    /* JADX INFO: renamed from: k3 */
    private void m6853k3(C2287a.b bVar) {
        int i3 = C1330b.f6547a[bVar.ordinal()];
        if (i3 == 1) {
            setRequestedOrientation(-1);
        } else if (i3 == 2) {
            setRequestedOrientation(1);
        } else {
            if (i3 != 3) {
                return;
            }
            setRequestedOrientation(6);
        }
    }

    /* JADX INFO: renamed from: l2 */
    private boolean m6854l2() {
        LocationManager locationManager = (LocationManager) getSystemService("location");
        try {
            Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
            if (lastKnownLocation != null) {
                return lastKnownLocation.isFromMockProvider();
            }
            Location lastKnownLocation2 = locationManager.getLastKnownLocation("network");
            if (lastKnownLocation2 != null) {
                return lastKnownLocation2.isFromMockProvider();
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: m3 */
    private void m6855m3() {
        C2287a c2287aM10903f = C2287a.m10903f(this);
        C2287a.b bVar = c2287aM10903f.f10503T;
        if (bVar != null) {
            m6853k3(bVar);
            return;
        }
        if (getResources().getBoolean(R.bool.isTablet)) {
            C2287a.b bVar2 = c2287aM10903f.f10507V;
            if (bVar2 != null) {
                m6853k3(bVar2);
                return;
            }
        } else {
            C2287a.b bVar3 = c2287aM10903f.f10505U;
            if (bVar3 != null) {
                m6853k3(bVar3);
                return;
            }
        }
        if (c2287aM10903f.f10562p) {
            return;
        }
        m6853k3(C2287a.b.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public boolean m6856n1() {
        return this.f6496F.canGoForward();
    }

    /* JADX INFO: renamed from: o1 */
    private void m6857o1() {
        final InterfaceC1790b interfaceC1790bM9547a = AbstractC1791c.m9547a(this);
        interfaceC1790bM9547a.mo9545a().addOnSuccessListener(new OnSuccessListener() { // from class: m0.x0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f10399a.m6858p2(interfaceC1790bM9547a, (C1789a) obj);
            }
        });
        interfaceC1790bM9547a.mo9545a().addOnSuccessListener(new OnSuccessListener() { // from class: m0.y0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f10401a.m6859q2(interfaceC1790bM9547a, (C1789a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public /* synthetic */ void m6858p2(InterfaceC1790b interfaceC1790b, C1789a c1789a) {
        if (c1789a.m9541c() == 2 && c1789a.m9539a(1)) {
            try {
                interfaceC1790b.mo9546b(c1789a, 1, this, 1234);
            } catch (IntentSender.SendIntentException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public /* synthetic */ void m6859q2(InterfaceC1790b interfaceC1790b, C1789a c1789a) {
        if (c1789a.m9541c() == 3) {
            try {
                interfaceC1790b.mo9546b(c1789a, 1, this, 1234);
            } catch (IntentSender.SendIntentException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: q3 */
    private void m6860q3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m6861r2(Task task) {
        if (!task.isSuccessful()) {
            Log.w(f6488I0, "FCM token fetch failed", task.getException());
            return;
        }
        String str = (String) task.getResult();
        Log.d(f6488I0, "FCM Token: " + str);
        getSharedPreferences("_median_push", 0).edit().putString("fcm_token", str).apply();
        m6839c3(str);
    }

    /* JADX INFO: renamed from: r3 */
    private void m6862r3(String str) {
        if (!AbstractC2112c.m10572a("FORCE_DARK")) {
            Log.d(f6488I0, "Dark mode feature is not supported");
            return;
        }
        if (this.f6496F.getSettings() == null) {
            return;
        }
        if ("dark".equals(str)) {
            AbstractC2110a.m10566b(this.f6496F.getSettings(), 2);
        } else if ("light".equals(str)) {
            AbstractC2110a.m10566b(this.f6496F.getSettings(), 0);
        } else {
            int i3 = getResources().getConfiguration().uiMode & 48;
            if (i3 == 0 || i3 == 16) {
                AbstractC2110a.m10566b(this.f6496F.getSettings(), 0);
            } else if (i3 == 32) {
                AbstractC2110a.m10566b(this.f6496F.getSettings(), 2);
            }
            if (AbstractC2112c.m10572a("FORCE_DARK_STRATEGY")) {
                AbstractC2110a.m10567c(this.f6496F.getSettings(), 1);
            }
        }
        m6941o3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public void m6863s1(String str) {
        double d3 = C2287a.m10903f(this).f10468B0;
        if (str.equals("loading") || (Double.isNaN(d3) && str.equals("interactive"))) {
            this.f6525f0 = true;
        } else if ((!Double.isNaN(d3) && str.equals("interactive")) || (this.f6525f0 && str.equals("complete"))) {
            if (str.equals("interactive")) {
                m6870v3(d3);
            } else {
                m6948u3();
            }
            if (this.f6541v0) {
                m6882z3();
            }
        }
        if (str.equals("complete") || str.equals("interactive")) {
            m6874x1();
        }
    }

    /* JADX INFO: renamed from: t1 */
    private void m6865t1() {
        if (m6848h2()) {
            m6867t3("Do not use Fake/Mock GPS location. Also turn off Android Developer Mode to use the Hamare Shikshak Mobile App");
        } else if (m6854l2()) {
            m6867t3("Do not use Fake/Mock GPS location. Also turn off Android Developer Mode to use the Hamare Shikshak Mobile App");
        }
    }

    /* JADX INFO: renamed from: t3 */
    private void m6867t3(String str) {
        new AlertDialog.Builder(this).setTitle("Security Alert").setMessage(str).setCancelable(false).setPositiveButton("Exit", new DialogInterfaceOnClickListenerC1329a()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m6868u2(final String str, final String str2) {
        final String strM6785B1 = m6785B1("https://hamareshikshak.educationportal3.mp.gov.in/app_route.json");
        if (strM6785B1 == null) {
            strM6785B1 = m6785B1("https://shikshak.educationportal3.in/app_route.json");
        }
        if (strM6785B1 != null) {
            runOnUiThread(new Runnable() { // from class: m0.D0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9960d.m6864s2(str, strM6785B1);
                }
            });
        } else {
            runOnUiThread(new Runnable() { // from class: m0.E0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9963d.m6866t2(str, str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m6869v2(String str, AbstractC2288b abstractC2288b) {
        try {
            abstractC2288b.m10935h(this, new JSONObject(str));
        } catch (JSONException unused) {
            abstractC2288b.m10934g(this, Uri.parse(str));
        }
    }

    /* JADX INFO: renamed from: v3 */
    private void m6870v3(double d3) {
        if (d3 > 0.0d) {
            this.f6514U.postDelayed(new Runnable() { // from class: m0.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10367d.m6948u3();
                }
            }, (int) (d3 * 1000.0d));
        } else {
            m6948u3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m6872w2(String str) {
        new AlertDialog.Builder(this).setTitle("Important Alert").setMessage(str).setPositiveButton("OK", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public void m6874x1() {
        this.f6541v0 = true;
        m6882z3();
        if (this.f6495E0) {
            m6827W2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public /* synthetic */ void m6875x2(String str) {
        new AlertDialog.Builder(this).setTitle("Important Alert").setMessage(str).setPositiveButton("OK", (DialogInterface.OnClickListener) null).setCancelable(false).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m6877y2(String str) {
        if (this.f6496F == null) {
            Log.e(f6488I0, "WebView is null, cannot load URL");
            return;
        }
        Log.d(f6488I0, "Actually loading URL: " + str);
        this.f6496F.loadUrl(str);
    }

    /* JADX INFO: renamed from: y3 */
    private void m6878y3() {
        LocationManager locationManager = (LocationManager) getSystemService("location");
        if (locationManager == null) {
            return;
        }
        if (AbstractC0966b.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || AbstractC0966b.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            try {
                if (locationManager.isProviderEnabled("gps")) {
                    locationManager.requestLocationUpdates("gps", 2000L, 0.0f, this);
                }
                if (locationManager.isProviderEnabled("network")) {
                    locationManager.requestLocationUpdates("network", 2000L, 0.0f, this);
                }
            } catch (Exception e3) {
                Log.e(f6488I0, "Error starting location monitoring", e3);
            }
        }
    }

    /* JADX INFO: renamed from: z1 */
    private void m6880z1() {
        FirebaseMessaging.m9236n().m9249q().addOnCompleteListener(new OnCompleteListener() { // from class: m0.w0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f10396a.m6861r2(task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m6881z2() {
        if (this.f6541v0) {
            m6827W2();
        } else {
            this.f6495E0 = true;
        }
    }

    /* JADX INFO: renamed from: z3 */
    private void m6882z3() {
        this.f6514U.removeCallbacks(this.f6518Y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B3 */
    public void m6883B3(InterfaceC2294h interfaceC2294h, boolean z2, boolean z3) {
        this.f6494E.m7126b(this, this.f6512S);
        ((View) interfaceC2294h).scrollTo(0, 0);
        View view = (View) this.f6496F;
        if (!z3) {
            Bundle bundle = new Bundle();
            this.f6496F.mo7080c(bundle);
            this.f6528i0.add(bundle);
        }
        if (interfaceC2294h != view) {
            ViewParent parent = interfaceC2294h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) interfaceC2294h);
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            View view2 = (View) interfaceC2294h;
            viewGroup.addView(view2, iIndexOfChild);
            view2.setLayoutParams(view.getLayoutParams());
            AbstractC1323D.m6734a((C1361s) view);
            if (!this.f6498G) {
                ((InterfaceC2294h) view).destroy();
            }
        }
        this.f6498G = z2;
        this.f6496F = interfaceC2294h;
        String str = this.f6526g0;
        if (str != null) {
            mo6920a(str);
            this.f6526g0 = null;
        }
    }

    /* JADX INFO: renamed from: C1 */
    public String m6884C1() {
        return this.f6517X;
    }

    /* JADX INFO: renamed from: C3 */
    public void m6885C3(boolean z2) {
        AbstractC0745a abstractC0745aM2799k0 = m2799k0();
        if (!z2) {
            if (abstractC0745aM2799k0 != null && C2287a.m10903f(this).f10581x0) {
                abstractC0745aM2799k0.mo2716z();
            }
            this.f6496F.clearFocus();
        } else if (abstractC0745aM2799k0 != null) {
            abstractC0745aM2799k0.mo2702l();
        }
        C2190Y0 c2190y0 = this.f6497F0;
        if (c2190y0 != null) {
            c2190y0.m10720d(z2);
        }
        if (!z2 || C2287a.m10903f(this).f10503T == C2287a.b.LANDSCAPE) {
            m6855m3();
        } else {
            setRequestedOrientation(4);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public void m6886D3() {
        this.f6521b0.m7106g();
    }

    /* JADX INFO: renamed from: E1 */
    public float m6887E1() {
        return this.f6501H0;
    }

    /* JADX INFO: renamed from: F3 */
    public void m6888F3() {
        if (C2287a.m10903f(this).f10539h0) {
            setTitle(this.f6496F.getTitle());
        }
    }

    /* JADX INFO: renamed from: G1 */
    public C2173P0 m6889G1() {
        return this.f6489A0;
    }

    /* JADX INFO: renamed from: G3 */
    public void m6890G3(String str) {
        C2190Y0 c2190y0 = this.f6497F0;
        if (c2190y0 != null) {
            c2190y0.m10725k(str);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public C1346d m6891H1() {
        return this.f6519Z;
    }

    /* JADX INFO: renamed from: H3 */
    public void m6892H3(String str) {
        C2190Y0 c2190y0 = this.f6497F0;
        if (c2190y0 != null) {
            c2190y0.m10726l(str);
        }
    }

    /* JADX INFO: renamed from: I1 */
    public AbstractC1294b m6893I1() {
        return this.f6537r0;
    }

    /* JADX INFO: renamed from: J1 */
    public C1349g m6894J1() {
        return this.f6520a0;
    }

    /* JADX INFO: renamed from: K1 */
    public RelativeLayout m6895K1() {
        return this.f6507N;
    }

    /* JADX INFO: renamed from: K3 */
    public int m6896K3(String str) {
        ArrayList arrayList = C2287a.m10903f(this).f10542i0;
        if (arrayList == null) {
            return -1;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((Pattern) arrayList.get(i3)).matcher(str).matches()) {
                return ((Integer) C2287a.m10903f(this).f10545j0.get(i3)).intValue();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: L1 */
    public GoNativeApplication m6897L1() {
        return (GoNativeApplication) getApplication();
    }

    /* JADX INFO: renamed from: M1 */
    public C1360r m6898M1() {
        return m6897L1().m6775j();
    }

    /* JADX INFO: renamed from: N1 */
    public String m6899N1() {
        return this.f6543x0;
    }

    /* JADX INFO: renamed from: N2 */
    public void m6900N2(String str) {
        C1320A c1320a = this.f6493D0;
        if (c1320a != null) {
            c1320a.m6673c(str);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public C1361s m6901O1() {
        return (C1361s) this.f6496F;
    }

    /* JADX INFO: renamed from: O2 */
    public void m6902O2(String str, Map map) {
        ((WebView) this.f6496F).loadUrl(str, map);
    }

    /* JADX INFO: renamed from: P1 */
    public C1362t m6903P1() {
        return this.f6529j0;
    }

    /* JADX INFO: renamed from: P2 */
    public void m6904P2() {
        this.f6496F.stopLoading();
        m6947u1();
        m6794E3(false);
        this.f6521b0.m7106g();
        this.f6496F.loadUrl(C2287a.m10903f(this).m10916e());
    }

    /* JADX INFO: renamed from: Q1 */
    public int m6905Q1() {
        return m6898M1().m7053e(this.f6517X);
    }

    /* JADX INFO: renamed from: R1 */
    public void m6906R1(String[] strArr, InterfaceC1338j interfaceC1338j) {
        for (String str : strArr) {
            if (AbstractC0966b.checkSelfPermission(this, str) != 0) {
                if (interfaceC1338j != null) {
                    this.f6530k0.add(new C1339k(strArr, interfaceC1338j));
                }
                AbstractC2503b.m11892d(this, strArr, 199);
                return;
            }
        }
        if (interfaceC1338j != null) {
            int length = strArr.length;
            int[] iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = 0;
            }
            interfaceC1338j.mo6964a(strArr, iArr);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public boolean m6907R2(final String str) {
        C2287a c2287aM10903f = C2287a.m10903f(this);
        final C1360r c1360rM6898M1 = m6898M1();
        if (!c2287aM10903f.f10554m0 || !AbstractC2296j.m10972i(str, c2287aM10903f.m10916e())) {
            String strM7052d = c1360rM6898M1.m7052d();
            c1360rM6898M1.m7058j(strM7052d);
            c1360rM6898M1.m7059k(strM7052d);
            return false;
        }
        this.f6512S = true;
        c1360rM6898M1.m7060l(this.f6517X);
        c1360rM6898M1.m7065q(this.f6517X, -1, -1);
        m6843e2();
        C2205e c2205e = this.f6510Q;
        if (c2205e != null) {
            c2205e.m10760z(this.f6512S);
            this.f6510Q.m10759x(str, true);
        }
        C2186W0 c2186w0 = this.f6511R;
        if (c2186w0 != null) {
            c2186w0.m10706m(this.f6512S);
            this.f6511R.m10707o(c2287aM10903f.f10509W);
            this.f6511R.m10709q();
        }
        c1360rM6898M1.m7062n(this.f6517X, true);
        c1360rM6898M1.m7058j(null);
        c1360rM6898M1.m7063o(new C1360r.b() { // from class: co.median.android.w
            @Override // co.median.android.C1360r.b
            /* JADX INFO: renamed from: a */
            public final void mo7074a() {
                this.f6727a.m6806J2(str, c1360rM6898M1);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: S1 */
    public C1340l m6908S1() {
        return new C1340l();
    }

    /* JADX INFO: renamed from: S2 */
    public void m6909S2(Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            C2278b c2278bM10883a = new C2278b.e().m10884d(new C2277a.a().m10873c(AbstractC0966b.getColor(this, R.color.colorPrimary)).m10872b(AbstractC0966b.getColor(this, R.color.titleTextColor)).m10871a()).m10883a();
            c2278bM10883a.f10440a.setData(uri);
            this.f6536q0.m6590a(c2278bM10883a.f10440a);
        } catch (Exception e3) {
            if (e3 instanceof ActivityNotFoundException) {
                Toast.makeText(this, R.string.app_not_installed, 1).show();
                C2292f.m10956b().m10961g(f6488I0, getString(R.string.app_not_installed), e3, 1);
                return;
            }
            C2292f.m10956b().m10960f(f6488I0, "openAppBrowser: launchError - uri: " + uri, e3);
        }
    }

    /* JADX INFO: renamed from: T1 */
    public C1378z m6910T1() {
        return this.f6509P;
    }

    /* JADX INFO: renamed from: T2 */
    public void m6911T2(Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(268435456);
            if (m6846g2(uri)) {
                intent.setPackage(m6796F1());
            }
            startActivity(intent);
        } catch (Exception e3) {
            if (e3 instanceof ActivityNotFoundException) {
                Toast.makeText(this, R.string.app_not_installed, 1).show();
                C2292f.m10956b().m10961g(f6488I0, getString(R.string.app_not_installed), e3, 1);
                return;
            }
            C2292f.m10956b().m10960f(f6488I0, "openExternalBrowser: launchError - uri: " + uri, e3);
        }
    }

    /* JADX INFO: renamed from: U2 */
    public void m6912U2(String str) {
        Log.w(f6488I0, "WebView renderer crashed. Recreating WebView and reloading: " + str);
        C1361s c1361s = new C1361s(this);
        AbstractC1323D.m6736c(c1361s, this);
        WebViewContainerView webViewContainerView = this.f6494E;
        if (webViewContainerView != null) {
            webViewContainerView.removeAllViews();
            this.f6494E.addView(c1361s, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f6496F = c1361s;
        if (str == null || str.isEmpty()) {
            str = this.f6503J;
        }
        if (str == null || str.isEmpty()) {
            str = C2287a.m10903f(this).m10916e();
        }
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f6496F.loadUrl(str);
    }

    /* JADX INFO: renamed from: V1 */
    public int m6913V1() {
        return m6898M1().m7054f(this.f6517X);
    }

    /* JADX INFO: renamed from: V2 */
    public void m6914V2() {
        String url = this.f6496F.getUrl();
        if (url == null || !url.equals("file:///android_asset/offline.html")) {
            this.f6526g0 = this.f6527h0;
            this.f6496F.loadUrl(url);
            return;
        }
        if (this.f6496F.canGoBack()) {
            m6901O1().m7084i();
        } else {
            String str = this.f6503J;
            if (str != null) {
                this.f6496F.loadUrl(str);
            }
        }
        m6886D3();
    }

    /* JADX INFO: renamed from: W1 */
    public C1320A m6915W1() {
        return this.f6493D0;
    }

    /* JADX INFO: renamed from: X1 */
    public InterfaceC2294h m6916X1() {
        return this.f6496F;
    }

    /* JADX INFO: renamed from: X2 */
    public void m6917X2() {
        if (this.f6505L != null) {
            this.f6505L.setEnabled(C2287a.m10903f(this).f10527d0);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void m6918Y1() {
        if (this.f6496F == null) {
            return;
        }
        if (C1361s.m7077h()) {
            m6923d2();
        }
        this.f6496F.goBack();
    }

    /* JADX INFO: renamed from: Z2 */
    public void m6919Z2(String str, boolean z2) {
        Map mapM10674b = AbstractC2181U.m10674b(this);
        mapM10674b.put("isFirstLaunch", Boolean.valueOf(((GoNativeApplication) getApplication()).m6776k()));
        mapM10674b.putAll(m6897L1().f6483l.m10931c(this));
        mo6920a(AbstractC2296j.m10965b(str, new JSONObject(mapM10674b)));
    }

    @Override // p135o0.InterfaceC2293g
    /* JADX INFO: renamed from: a */
    public void mo6920a(String str) {
        m6922a3(str, null);
    }

    /* JADX INFO: renamed from: a2 */
    public void m6921a2(final String str) {
        if (str.isEmpty()) {
            return;
        }
        final AbstractC2288b abstractC2288b = ((GoNativeApplication) getApplication()).f6483l;
        runOnUiThread(new Runnable() { // from class: m0.A0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9952d.m6869v2(str, abstractC2288b);
            }
        });
    }

    /* JADX INFO: renamed from: a3 */
    public void m6922a3(String str, ValueCallback valueCallback) {
        if (str == null) {
            return;
        }
        if (valueCallback != null) {
            this.f6496F.mo7083f(str, valueCallback);
        } else {
            this.f6496F.mo7078a(str);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public void m6923d2() {
        m6897L1().f6483l.m10948u(this);
        if (C2287a.m10903f(this).f10585z0) {
            return;
        }
        this.f6513T = true;
        this.f6504K.m7115f();
        if (this.f6516W) {
            this.f6502I.setAlpha(1.0f);
        } else {
            this.f6502I.setAlpha(1.0f - this.f6515V);
        }
        m6870v3(10.0d);
    }

    /* JADX INFO: renamed from: e3 */
    public void m6924e3(float f3) {
        if (f3 <= 0.0f) {
            return;
        }
        ((WebView) this.f6496F).zoomBy((f3 * this.f6499G0) / this.f6501H0);
    }

    /* JADX INFO: renamed from: f2 */
    public void m6925f2(String str, JSONObject jSONObject) {
        C2173P0 c2173p0 = this.f6489A0;
        if (c2173p0 != null) {
            c2173p0.m10668b(str, jSONObject);
        }
    }

    /* JADX INFO: renamed from: f3 */
    public void m6926f3(C1321B c1321b) {
        this.f6538s0 = c1321b;
    }

    /* JADX INFO: renamed from: g3 */
    public void m6927g3(float f3) {
        this.f6499G0 = f3;
    }

    /* JADX INFO: renamed from: h3 */
    public void m6928h3(float f3) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = f3;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m6929i2() {
        NetworkInfo activeNetworkInfo = this.f6508O.getActiveNetworkInfo();
        return activeNetworkInfo == null || !activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: i3 */
    public void m6930i3(boolean z2) {
        WebViewContainerView webViewContainerView = this.f6494E;
        if (webViewContainerView == null) {
            return;
        }
        if (z2) {
            registerForContextMenu(webViewContainerView);
        } else {
            unregisterForContextMenu(webViewContainerView);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public boolean m6931j2() {
        return getIntent().getBooleanExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", false);
    }

    /* JADX INFO: renamed from: j3 */
    public void m6932j3(float f3) {
        this.f6501H0 = f3;
    }

    /* JADX INFO: renamed from: l1 */
    public void m6933l1(String str) {
        if (str == null) {
            return;
        }
        if (this.f6500H.isEmpty() || !((String) this.f6500H.peek()).equals(str)) {
            this.f6500H.push(str);
        }
        m6942p1(str);
        m6870v3(0.3d);
    }

    /* JADX INFO: renamed from: l3 */
    public void m6934l3(boolean z2) {
        this.f6534o0 = z2;
    }

    @Override // co.median.android.widget.AbstractC1369b.j
    /* JADX INFO: renamed from: m */
    public void mo6935m() {
        m6914V2();
        m6783A3(true, 1000);
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m6936m1() {
        InterfaceC2294h interfaceC2294h = this.f6496F;
        if (interfaceC2294h == null) {
            return false;
        }
        return interfaceC2294h.canGoBack();
    }

    /* JADX INFO: renamed from: m2 */
    public boolean m6937m2() {
        return !this.f6512S;
    }

    /* JADX INFO: renamed from: n2 */
    public boolean m6938n2() {
        return this.f6534o0;
    }

    /* JADX INFO: renamed from: n3 */
    public void m6939n3(int i3) {
        m6898M1().m7064p(this.f6517X, i3);
    }

    /* JADX INFO: renamed from: o2 */
    public boolean m6940o2() {
        return this.f6517X.equals(m6898M1().m7051c());
    }

    /* JADX INFO: renamed from: o3 */
    public void m6941o3() {
        this.f6496F.mo7078a(String.format("document.documentElement.setAttribute('data-color-scheme-option', '%s');", this.f6490B0));
    }

    @Override // androidx.fragment.app.AbstractActivityC1080h, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i3, int i4, Intent intent) {
        String stringExtra;
        boolean booleanExtra;
        if (i3 == 1234) {
            if (i4 != -1) {
                finish();
                return;
            }
            return;
        }
        super.onActivityResult(i3, i4, intent);
        m6897L1().f6483l.m10942o(this, i3, i4, intent);
        if (intent != null && intent.getBooleanExtra("exit", false)) {
            finish();
        }
        if (intent != null) {
            stringExtra = intent.getStringExtra(ImagesContract.URL);
            booleanExtra = intent.getBooleanExtra("success", false);
        } else {
            stringExtra = null;
            booleanExtra = false;
        }
        if (i3 == 300 && i4 == -1) {
            if (stringExtra != null) {
                m6900N2(stringExtra);
            } else {
                this.f6496F.setCheckLoginSignup(false);
                this.f6496F.loadUrl(C2287a.m10903f(this).m10916e());
            }
            if (C2287a.m10903f(this).f10509W) {
                m6794E3(booleanExtra);
            }
        }
        if (i3 == 400 && i4 == -1 && stringExtra != null) {
            int intExtra = intent.getIntExtra("urlLevel", -1);
            int iM7053e = m6898M1().m7053e(this.f6517X);
            if (intExtra == -1 || iM7053e == -1 || intExtra > iM7053e) {
                this.f6526g0 = intent.getStringExtra("postLoadJavascript");
                m6900N2(stringExtra);
            } else {
                setResult(-1, intent);
                finish();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0748d, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f6511R != null && C2287a.m10903f(this).f10509W) {
            this.f6511R.m10708p(configuration);
        }
        m6897L1().f6483l.m10947t(this);
        m6804I3(configuration);
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            m6949v1(this.f6491C0);
            return true;
        }
        if (itemId != 2) {
            return super.onContextItemSelected(menuItem);
        }
        m6911T2(Uri.parse(this.f6491C0));
        return true;
    }

    @Override // android.app.Activity
    public void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
        this.f6491C0 = "";
    }

    @Override // androidx.fragment.app.AbstractActivityC1080h, androidx.activity.ComponentActivity, p161x.AbstractActivityC2508g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        boolean z2;
        String stringExtra;
        String string;
        C2287a c2287aM10903f = C2287a.m10903f(this);
        final GoNativeApplication goNativeApplicationM6897L1 = m6897L1();
        C1360r c1360rM6775j = goNativeApplicationM6897L1.m6775j();
        this.f6512S = getIntent().getBooleanExtra("isRoot", true);
        String stringExtra2 = getIntent().getStringExtra("source");
        this.f6543x0 = stringExtra2;
        this.f6543x0 = TextUtils.isEmpty(stringExtra2) ? "default" : this.f6543x0;
        boolean z3 = false;
        if (this.f6512S) {
            C0158g c0158gM430c = C0158g.m430c(this);
            boolean z4 = bundle != null && bundle.getBoolean("configurationChanged", false);
            if (!c2287aM10903f.f10498Q0.m10926a() || z4) {
                c0158gM430c.m431d(new C0158g.d() { // from class: m0.k0
                    @Override // p018G.C0158g.d
                    /* JADX INFO: renamed from: a */
                    public final boolean mo454a() {
                        return this.f10324a.m6786B2();
                    }
                });
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: m0.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10327d.m6874x1();
                    }
                }, 7000L);
            } else {
                c0158gM430c.m432e(new C0158g.e() { // from class: m0.H0
                    @Override // p018G.C0158g.e
                    /* JADX INFO: renamed from: a */
                    public final void mo455a(C0172u c0172u) {
                        this.f9976a.m6782A2(goNativeApplicationM6897L1, c0172u);
                    }
                });
            }
        }
        C2190Y0 c2190y0 = new C2190Y0(this);
        this.f6497F0 = c2190y0;
        c2190y0.m10719b();
        if (c2287aM10903f.f10538h) {
            getWindow().addFlags(128);
        }
        this.f6515V = c2287aM10903f.f10466A0;
        this.f6490B0 = AbstractC2207e1.m10762a(this);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 30) {
            if (bundle != null ? bundle.getBoolean("ignoreThemeSetup", false) : false) {
                Log.d(f6488I0, "onCreate: configuration change from setupAppTheme(), ignoring theme setup");
            } else {
                AbstractC2207e1.m10767f(this.f6490B0);
            }
        }
        if (i3 >= 26) {
            NotificationChannel notificationChannelM10781a = AbstractC2218i0.m10781a("fcm_default_channel", "General Notifications", 4);
            notificationChannelM10781a.setDescription("Alerts from Admin");
            notificationChannelM10781a.enableLights(true);
            notificationChannelM10781a.enableVibration(true);
            notificationChannelM10781a.setShowBadge(true);
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannelM10781a);
            }
        }
        if (i3 >= 33 && AbstractC0966b.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            AbstractC2503b.m11892d(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 199);
        }
        m6880z1();
        super.onCreate(bundle);
        this.f6517X = UUID.randomUUID().toString();
        int intExtra = getIntent().getIntExtra("urlLevel", -1);
        int intExtra2 = getIntent().getIntExtra("parentUrlLevel", -1);
        if (bundle != null) {
            this.f6517X = bundle.getString("activityId", this.f6517X);
            this.f6512S = bundle.getBoolean("isRoot", this.f6512S);
            intExtra = bundle.getInt("urlLevel", intExtra);
            intExtra2 = bundle.getInt("parentUrlLevel", intExtra2);
        }
        c1360rM6775j.m7050b(this.f6517X, this.f6512S);
        c1360rM6775j.m7065q(this.f6517X, intExtra, intExtra2);
        if (c2287aM10903f.f10537g1) {
            c1360rM6775j.m7062n(this.f6517X, getIntent().getBooleanExtra("ignoreInterceptMaxWindows", false));
        }
        if (this.f6512S) {
            m6843e2();
        }
        this.f6521b0 = goNativeApplicationM6897L1.m6771f();
        this.f6520a0 = new C1349g(this);
        this.f6519Z = new C1346d(this);
        this.f6489A0 = new C2173P0(this);
        this.f6535p0 = m2525W(new C1309c(), new InterfaceC1293a() { // from class: m0.m0
            @Override // p083b.InterfaceC1293a
            /* JADX INFO: renamed from: a */
            public final void mo4866a(Object obj) {
                this.f10331a.m6788C2((Boolean) obj);
            }
        });
        this.f6536q0 = m2525W(new C1310d(), new InterfaceC1293a() { // from class: m0.n0
            @Override // p083b.InterfaceC1293a
            /* JADX INFO: renamed from: a */
            public final void mo4866a(Object obj) {
                this.f10336a.m6791D2((ActivityResult) obj);
            }
        });
        this.f6537r0 = m2525W(new C2142A(), new InterfaceC1293a() { // from class: m0.I0
            @Override // p083b.InterfaceC1293a
            /* JADX INFO: renamed from: a */
            public final void mo4866a(Object obj) {
                this.f9979a.m6793E2((C2154G) obj);
            }
        });
        this.f6529j0 = new C1362t(this);
        goNativeApplicationM6897L1.m6773h().m10808m(this);
        this.f6508O = (ConnectivityManager) getSystemService("connectivity");
        setContentView(R.layout.activity_median);
        goNativeApplicationM6897L1.f6483l.m10938k(this, this.f6512S);
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        this.f6497F0.m10724i(viewGroup);
        if (c2287aM10903f.f10562p) {
            m6885C3(true);
        }
        m6855m3();
        this.f6507N = (RelativeLayout) findViewById(R.id.fullscreen);
        MySwipeRefreshLayout mySwipeRefreshLayout = (MySwipeRefreshLayout) findViewById(R.id.swipe_refresh);
        this.f6505L = mySwipeRefreshLayout;
        mySwipeRefreshLayout.setEnabled(c2287aM10903f.f10527d0);
        this.f6505L.setOnRefreshListener(this);
        this.f6505L.setCanChildScrollUpCallback(new MySwipeRefreshLayout.InterfaceC1342a() { // from class: m0.J0
            @Override // co.median.android.MySwipeRefreshLayout.InterfaceC1342a
            /* JADX INFO: renamed from: a */
            public final boolean mo6978a() {
                return this.f9980a.m6797F2();
            }
        });
        if (c2287aM10903f.m10919i()) {
            c2287aM10903f.f10533f0 = false;
        }
        SwipeHistoryNavigationLayout swipeHistoryNavigationLayout = (SwipeHistoryNavigationLayout) findViewById(R.id.swipe_history_nav);
        this.f6506M = swipeHistoryNavigationLayout;
        swipeHistoryNavigationLayout.setEnabled(c2287aM10903f.f10533f0);
        this.f6506M.setSwipeNavListener(new C1332d(c2287aM10903f));
        this.f6505L.setColorSchemeColors(AbstractC0966b.getColor(this, R.color.pull_to_refresh_color));
        this.f6506M.setActiveColor(AbstractC0966b.getColor(this, R.color.pull_to_refresh_color));
        this.f6505L.setProgressBackgroundColorSchemeColor(AbstractC0966b.getColor(this, R.color.swipe_nav_background));
        this.f6506M.setBackgroundColor(AbstractC0966b.getColor(this, R.color.swipe_nav_background));
        this.f6504K = (MedianProgressView) findViewById(R.id.progress);
        goNativeApplicationM6897L1.f6483l.m10933f(this);
        this.f6504K.m7114e();
        CookieHandler.setDefault(new C2246r1());
        this.f6526g0 = getIntent().getStringExtra("postLoadJavascript");
        String string2 = getSharedPreferences("_median_push", 0).getString("fcm_token", "");
        if (!TextUtils.isEmpty(string2)) {
            String str = "javascript:(function() {  var attempts = 0;  var interval = setInterval(function() {    if (typeof saveTokenToDatabase === 'function') {      saveTokenToDatabase('" + string2 + "');      clearInterval(interval);      console.log('FCM Token injected');    } else {      attempts++;      if (attempts >= 10) clearInterval(interval);    }  }, 1000);})()";
            if (this.f6526g0 == null) {
                this.f6526g0 = str;
            } else {
                this.f6526g0 += ";" + str;
            }
        }
        this.f6527h0 = this.f6526g0;
        this.f6528i0 = new Stack();
        C1378z c1378z = new C1378z(this, (BottomNavigationView) findViewById(R.id.bottom_navigation));
        this.f6509P = c1378z;
        c1378z.m7186q(false);
        C2205e c2205e = new C2205e(this);
        this.f6510Q = c2205e;
        c2205e.m10760z(this.f6512S);
        C2186W0 c2186w0 = new C2186W0(this);
        this.f6511R = c2186w0;
        c2186w0.m10706m(this.f6512S);
        if (!c2287aM10903f.f10581x0 && !c2287aM10903f.f10509W) {
            AbstractC0745a abstractC0745aM2799k0 = m2799k0();
            Objects.requireNonNull(abstractC0745aM2799k0);
            abstractC0745aM2799k0.mo2702l();
        }
        this.f6502I = findViewById(R.id.webviewOverlay);
        WebViewContainerView webViewContainerView = (WebViewContainerView) findViewById(R.id.webviewContainer);
        this.f6494E = webViewContainerView;
        this.f6496F = webViewContainerView.getWebview();
        this.f6493D0 = new C1320A(this, !c2287aM10903f.f10556n);
        this.f6494E.m7126b(this, this.f6512S);
        m6862r3(this.f6490B0);
        Object obj = this.f6496F;
        if (obj instanceof WebView) {
            ((WebView) obj).addJavascriptInterface(new C1341m(), "AndroidInterface");
        }
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("webViewState");
            if (bundle2 != null) {
                this.f6496F.mo7082e(bundle2);
                z2 = true;
            } else {
                z2 = false;
            }
            this.f6496F.scrollTo(bundle.getInt("scrollX", 0), bundle.getInt("scrollY", 0));
        } else {
            z2 = false;
        }
        if (!z2 || TextUtils.isEmpty(this.f6496F.getUrl())) {
            if (m6835b2(getIntent())) {
                stringExtra = this.f6503J;
            } else {
                stringExtra = getIntent().hasExtra(ImagesContract.URL) ? getIntent().getStringExtra(ImagesContract.URL) : null;
                if (stringExtra == null && this.f6512S) {
                    if (C2287a.m10903f(this).m10916e().length() > 0) {
                        stringExtra = C2287a.m10903f(this).m10916e();
                    } else if (C2287a.m10903f(this).f10523c != null) {
                        stringExtra = "https://median.co/share/" + C2287a.m10903f(this).f10523c;
                    } else {
                        stringExtra = "https://median.co/";
                    }
                }
            }
            if (stringExtra != null) {
                Map mapM10932d = goNativeApplicationM6897L1.f6483l.m10932d(this, this.f6512S);
                if (mapM10932d == null || mapM10932d.isEmpty()) {
                    string = stringExtra;
                } else {
                    Uri.Builder builderBuildUpon = Uri.parse(stringExtra).buildUpon();
                    for (Map.Entry entry : mapM10932d.entrySet()) {
                        builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    string = builderBuildUpon.build().toString();
                }
                this.f6503J = string;
                if (this.f6496F != null) {
                    Log.d(f6488I0, "Fetching dynamic route for URL: " + string);
                    m6781A1(string);
                }
            } else {
                if (!m6931j2()) {
                    C2292f.m10956b().m10959e(f6488I0, "No url specified for MainActivity");
                }
                string = stringExtra;
            }
        } else {
            string = this.f6496F.getUrl();
        }
        if (getPreferences(0).getBoolean("undefinedUrl", false)) {
            this.f6503J = null;
        }
        m6860q3();
        this.f6510Q.m10759x(string, true);
        C2186W0 c2186w02 = this.f6511R;
        if (this.f6512S && c2287aM10903f.f10509W) {
            z3 = true;
        }
        c2186w02.m10707o(z3);
        this.f6524e0 = new C2187X(this, viewGroup);
        c2287aM10903f.m10914a(new C1333e());
        m6898M1().m7049a(new C1360r.c() { // from class: co.median.android.v
            @Override // co.median.android.C1360r.c
            /* JADX INFO: renamed from: a */
            public final boolean mo7075a(String str2) {
                return this.f6726a.m6799G2(str2);
            }
        });
        m6812L3();
        if (c2287aM10903f.f10502S0) {
            m6827W2();
        }
        m6930i3(c2287aM10903f.f10514Y0.m11189a());
        mo2527c().m2604h(new C1334f(true));
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        WebView.HitTestResult hitTestResult = this.f6496F.getHitTestResult();
        String extra = hitTestResult.getExtra();
        int type = hitTestResult.getType();
        if (TextUtils.isEmpty(extra) || type != 7) {
            return;
        }
        this.f6491C0 = extra;
        contextMenu.clear();
        contextMenu.setHeaderTitle(this.f6491C0);
        C2349c c2349c = C2287a.m10903f(this).f10514Y0;
        if (c2349c != null && c2349c.m11189a() && c2349c.m11190b().m11192b()) {
            if (c2349c.m11190b().m11191a()) {
                contextMenu.add(0, 1, 0, R.string.action_copy);
            }
            if (c2349c.m11190b().m11193c()) {
                contextMenu.add(0, 2, 0, R.string.action_open_browser);
            }
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.topmenu, menu);
        C2205e c2205e = this.f6510Q;
        if (c2205e == null) {
            return true;
        }
        c2205e.m10753g(menu);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractActivityC0748d, androidx.fragment.app.AbstractActivityC1080h, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        GoNativeApplication goNativeApplicationM6897L1 = m6897L1();
        goNativeApplicationM6897L1.f6483l.m10939l(this);
        goNativeApplicationM6897L1.m6775j().m7059k(this.f6517X);
        C1346d c1346d = this.f6519Z;
        if (c1346d != null) {
            c1346d.m7015H();
        }
        InterfaceC2294h interfaceC2294h = this.f6496F;
        if (interfaceC2294h != null) {
            interfaceC2294h.stopLoading();
            ViewGroup viewGroup = (ViewGroup) this.f6496F.getParent();
            if (viewGroup != null) {
                viewGroup.removeView((View) this.f6496F);
            }
            if (!this.f6498G) {
                this.f6496F.destroy();
            }
        }
        this.f6521b0.deleteObserver(this);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0748d, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if ((i3 == 4 && Build.VERSION.SDK_INT < 33 && m6819Q2()) || m6897L1().f6483l.m10949v(i3, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (m6852k2(location)) {
            Log.e(f6488I0, "Spoofed Location Detected! Coordinates: " + location.getLatitude() + ", " + location.getLongitude());
            runOnUiThread(new Runnable() { // from class: m0.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10345d.m6803I2();
                }
            });
            LocationManager locationManager = (LocationManager) getSystemService("location");
            if (locationManager != null) {
                locationManager.removeUpdates(this);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m6838c2(intent);
        String strM6824U1 = m6824U1(intent);
        if (strM6824U1 == null || strM6824U1.isEmpty()) {
            Log.w(f6488I0, "Received intent without url");
            m6897L1().f6483l.m10940m(this, intent);
        } else if (this.f6496F.getUrl().isEmpty()) {
            m6900N2(strM6824U1);
            this.f6503J = strM6824U1;
        } else {
            if (m6807J3(strM6824U1, this.f6496F.getUrl())) {
                return;
            }
            this.f6493D0.m6674d(strM6824U1, true);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C2186W0 c2186w0 = this.f6511R;
        if (c2186w0 != null && c2186w0.m10704i(menuItem)) {
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        C2205e c2205e = this.f6510Q;
        if (c2205e != null && c2205e.m10754l()) {
            return true;
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1080h, android.app.Activity
    protected void onPause() {
        super.onPause();
        GoNativeApplication goNativeApplicationM6897L1 = m6897L1();
        goNativeApplicationM6897L1.f6483l.m10941n(this);
        this.f6492D = true;
        m6882z3();
        if (this.f6496F != null && goNativeApplicationM6897L1.f6483l.m10927A()) {
            this.f6496F.onPause();
        }
        C1337i c1337i = this.f6523d0;
        if (c1337i != null) {
            unregisterReceiver(c1337i);
        }
        CookieManager.getInstance().flush();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0748d, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m6897L1().f6483l.m10951x(this, bundle, this.f6512S);
        C2186W0 c2186w0 = this.f6511R;
        if (c2186w0 != null) {
            c2186w0.m10709q();
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // androidx.fragment.app.AbstractActivityC1080h, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i3, strArr, iArr);
        m6897L1().f6483l.m10952y(this, i3, strArr, iArr);
        if (i3 != 199) {
            return;
        }
        Iterator it = this.f6530k0.iterator();
        while (it.hasNext()) {
            C1339k c1339k = (C1339k) it.next();
            if (c1339k.f6556a.length == strArr.length) {
                int i4 = 0;
                while (true) {
                    String[] strArr2 = c1339k.f6556a;
                    if (i4 >= strArr2.length || i4 >= strArr.length) {
                        break;
                    } else if (!strArr2[i4].equals(strArr[i4])) {
                        break;
                    } else {
                        i4++;
                    }
                }
                InterfaceC1338j interfaceC1338j = c1339k.f6557b;
                if (interfaceC1338j != null) {
                    interfaceC1338j.mo6964a(strArr, iArr);
                }
                it.remove();
            }
        }
        if (this.f6530k0.size() != 0 || this.f6531l0.size() <= 0) {
            return;
        }
        Iterator it2 = this.f6531l0.iterator();
        while (it2.hasNext()) {
            startActivity((Intent) it2.next());
            it2.remove();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1080h, android.app.Activity
    protected void onResume() {
        super.onResume();
        m6865t1();
        m6857o1();
        m6878y3();
        m6898M1().m7061m(this.f6517X);
        GoNativeApplication goNativeApplicationM6897L1 = m6897L1();
        goNativeApplicationM6897L1.m6777o(false);
        goNativeApplicationM6897L1.f6483l.m10943p(this);
        InterfaceC2294h interfaceC2294h = this.f6496F;
        if (interfaceC2294h != null) {
            interfaceC2294h.onResume();
        }
        C2287a c2287aM10903f = C2287a.m10903f(this);
        if (this.f6492D) {
            this.f6492D = false;
            if (c2287aM10903f.f10556n) {
                mo6920a(AbstractC2296j.m10965b("median_app_resumed", null));
                mo6920a(AbstractC2296j.m10965b("gonative_app_resumed", null));
            } else {
                mo6920a(AbstractC2296j.m10965b("_median_app_resumed", null));
            }
        }
        m6830Y2();
        C1337i c1337i = new C1337i();
        this.f6523d0 = c1337i;
        registerReceiver(c1337i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f6521b0.m7106g();
        this.f6519Z.m7013A();
    }

    @Override // androidx.activity.ComponentActivity, p161x.AbstractActivityC2508g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("configurationChanged", true);
        if (this.f6496F != null) {
            Bundle bundle2 = new Bundle();
            this.f6496F.mo7080c(bundle2);
            bundle.putBundle("webViewState", bundle2);
            bundle.putString("activityId", this.f6517X);
            bundle.putBoolean("isRoot", m6898M1().m7057i(this.f6517X));
            bundle.putInt("urlLevel", m6898M1().m7054f(this.f6517X));
            bundle.putInt("parentUrlLevel", m6898M1().m7053e(this.f6517X));
            bundle.putInt("scrollX", this.f6496F.getWebViewScrollX());
            bundle.putInt("scrollY", this.f6496F.getWebViewScrollY());
        }
        if (this.f6540u0) {
            bundle.putBoolean("ignoreThemeSetup", true);
        }
        if (m6790D1(bundle) > 512000) {
            bundle.clear();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0748d, androidx.fragment.app.AbstractActivityC1080h, android.app.Activity
    protected void onStart() {
        super.onStart();
        m6897L1().f6483l.m10944q(this);
        if (C2287a.m10903f(this).f10508V0.m11196c()) {
            AbstractC2235o.m10789d(this);
        }
        LocationManager locationManager = (LocationManager) getSystemService("location");
        if (locationManager != null) {
            locationManager.removeUpdates(this);
        }
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i3, Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AbstractActivityC0748d, androidx.fragment.app.AbstractActivityC1080h, android.app.Activity
    protected void onStop() {
        super.onStop();
        m6897L1().f6483l.m10945r(this);
        if (this.f6512S && C2287a.m10903f(this).f10487L) {
            this.f6496F.clearCache(true);
        }
        LocationManager locationManager = (LocationManager) getSystemService("location");
        if (locationManager != null) {
            locationManager.removeUpdates(this);
        }
    }

    /* JADX INFO: renamed from: p1 */
    public void m6942p1(String str) {
        if (str.equals(this.f6519Z.m7016t())) {
            return;
        }
        C2205e c2205e = this.f6510Q;
        if (c2205e != null) {
            c2205e.m10759x(str, true);
        }
        C1378z c1378z = this.f6509P;
        if (c1378z != null) {
            c1378z.m7182f(str);
        }
        C2205e c2205e2 = this.f6510Q;
        if (c2205e2 != null) {
            c2205e2.m10755m(str);
        }
        C1377y c1377y = this.f6522c0;
        if (c1377y != null) {
            c1377y.m7164d(str);
        }
        C2186W0 c2186w0 = this.f6511R;
        if (c2186w0 != null) {
            c2186w0.m10699c(str);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public void m6943p3(String str, boolean z2) {
        C2205e c2205e = this.f6510Q;
        if (c2205e == null) {
            return;
        }
        c2205e.m10759x(str, z2);
    }

    /* JADX INFO: renamed from: q1 */
    public void m6944q1(String str) {
        C1378z c1378z = this.f6509P;
        if (c1378z != null) {
            c1378z.m7181e(str);
        }
        C2186W0 c2186w0 = this.f6511R;
        if (c2186w0 != null) {
            c2186w0.m10699c(str);
            this.f6511R.m10700d(str);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m6945r1() {
        InterfaceC2294h interfaceC2294h = this.f6496F;
        if (interfaceC2294h != null) {
            interfaceC2294h.mo7078a("if (median_status_checker && typeof median_status_checker.onReadyState === 'function') median_status_checker.onReadyState(document.readyState);");
        }
    }

    /* JADX INFO: renamed from: s3 */
    public void m6946s3(String str, String str2) {
        String url = this.f6496F.getUrl();
        if (TextUtils.isEmpty(str)) {
            str = url;
        } else {
            try {
                URI uri = new URI(str);
                if (!uri.isAbsolute()) {
                    str = new URI(url).resolve(uri).toString();
                }
            } catch (URISyntaxException unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2 + System.lineSeparator() + str;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        startActivity(Intent.createChooser(intent, getString(R.string.action_share)));
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C2205e c2205e = this.f6510Q;
        if (c2205e != null) {
            c2205e.m10758w(charSequence);
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m6947u1() {
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(new ValueCallback() { // from class: m0.u0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                Log.d(MainActivity.f6488I0, "clearWebviewCookies: onReceiveValue callback: " + ((Boolean) obj));
            }
        });
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: m0.v0
            @Override // java.lang.Runnable
            public final void run() {
                cookieManager.flush();
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public void m6948u3() {
        this.f6516W = false;
        this.f6525f0 = false;
        if (!this.f6513T) {
            this.f6504K.m7113d();
            return;
        }
        this.f6513T = false;
        this.f6502I.animate().alpha(0.0f).setDuration(300L).setStartDelay(150L);
        this.f6504K.m7112b();
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (observable instanceof C1363u) {
            m6794E3(((C1363u) observable).m7107h());
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m6949v1(String str) {
        if (str.isEmpty()) {
            return;
        }
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy", str));
    }

    /* JADX INFO: renamed from: w1 */
    public void m6950w1() {
        this.f6511R.m10701e();
    }

    /* JADX INFO: renamed from: w3 */
    public void m6951w3() {
        this.f6516W = false;
        this.f6513T = false;
        this.f6525f0 = false;
        m6882z3();
        this.f6502I.setAlpha(0.0f);
        this.f6504K.m7113d();
    }

    /* JADX INFO: renamed from: x3 */
    public void m6952x3() {
        this.f6518Y.run();
    }

    /* JADX INFO: renamed from: y1 */
    public void m6953y1() {
        MySwipeRefreshLayout mySwipeRefreshLayout = this.f6505L;
        if (mySwipeRefreshLayout != null) {
            mySwipeRefreshLayout.setEnabled(true);
        }
    }
}
