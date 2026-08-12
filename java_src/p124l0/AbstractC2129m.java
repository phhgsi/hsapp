package p124l0;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p120k0.AbstractC2111b;
import p120k0.AbstractC2112c;
import p124l0.AbstractC2117a;
import p124l0.AbstractC2126j;

/* JADX INFO: renamed from: l0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2129m {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2117a.b f9885a = new AbstractC2117a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* JADX INFO: renamed from: b */
    public static final AbstractC2117a.b f9887b = new AbstractC2117a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* JADX INFO: renamed from: c */
    public static final AbstractC2117a.e f9889c = new AbstractC2117a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* JADX INFO: renamed from: d */
    public static final AbstractC2117a.c f9891d = new AbstractC2117a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: e */
    public static final AbstractC2117a.f f9893e = new AbstractC2117a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* JADX INFO: renamed from: f */
    public static final AbstractC2117a.f f9895f = new AbstractC2117a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: g */
    public static final AbstractC2117a.f f9897g = new AbstractC2117a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: h */
    public static final AbstractC2117a.f f9899h = new AbstractC2117a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: i */
    public static final AbstractC2117a.f f9901i = new AbstractC2117a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: j */
    public static final AbstractC2117a.f f9903j = new AbstractC2117a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* JADX INFO: renamed from: k */
    public static final AbstractC2117a.c f9905k = new AbstractC2117a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* JADX INFO: renamed from: l */
    public static final AbstractC2117a.c f9907l = new AbstractC2117a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* JADX INFO: renamed from: m */
    public static final AbstractC2117a.c f9909m = new AbstractC2117a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* JADX INFO: renamed from: n */
    public static final AbstractC2117a.c f9911n = new AbstractC2117a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* JADX INFO: renamed from: o */
    public static final AbstractC2117a.c f9913o = new AbstractC2117a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* JADX INFO: renamed from: p */
    public static final AbstractC2117a.c f9915p = new AbstractC2117a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* JADX INFO: renamed from: q */
    public static final AbstractC2117a.b f9917q = new AbstractC2117a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: r */
    public static final AbstractC2117a.b f9919r = new AbstractC2117a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: s */
    public static final AbstractC2117a.c f9921s = new AbstractC2117a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* JADX INFO: renamed from: t */
    public static final AbstractC2117a.f f9923t = new AbstractC2117a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* JADX INFO: renamed from: u */
    public static final AbstractC2117a.c f9925u = new AbstractC2117a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: v */
    public static final AbstractC2117a.b f9927v = new AbstractC2117a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* JADX INFO: renamed from: w */
    public static final AbstractC2117a.b f9928w = new AbstractC2117a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* JADX INFO: renamed from: x */
    public static final AbstractC2117a.f f9929x = new AbstractC2117a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* JADX INFO: renamed from: y */
    public static final AbstractC2117a.f f9930y = new AbstractC2117a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* JADX INFO: renamed from: z */
    public static final AbstractC2117a.f f9931z = new AbstractC2117a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* JADX INFO: renamed from: A */
    public static final AbstractC2117a.b f9859A = new AbstractC2117a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* JADX INFO: renamed from: B */
    public static final AbstractC2117a.b f9860B = new AbstractC2117a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* JADX INFO: renamed from: C */
    public static final AbstractC2117a.d f9861C = new AbstractC2117a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* JADX INFO: renamed from: D */
    public static final AbstractC2117a.b f9862D = new AbstractC2117a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* JADX INFO: renamed from: E */
    public static final AbstractC2117a.b f9863E = new AbstractC2117a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* JADX INFO: renamed from: F */
    public static final AbstractC2117a.b f9864F = new AbstractC2117a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* JADX INFO: renamed from: G */
    public static final AbstractC2117a.b f9865G = new AbstractC2117a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* JADX INFO: renamed from: H */
    public static final AbstractC2117a.e f9866H = new AbstractC2117a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* JADX INFO: renamed from: I */
    public static final AbstractC2117a.e f9867I = new AbstractC2117a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* JADX INFO: renamed from: J */
    public static final AbstractC2117a.h f9868J = new AbstractC2117a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* JADX INFO: renamed from: K */
    public static final AbstractC2117a.h f9869K = new AbstractC2117a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* JADX INFO: renamed from: L */
    public static final AbstractC2117a.g f9870L = new AbstractC2117a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* JADX INFO: renamed from: M */
    public static final AbstractC2126j.b f9871M = new AbstractC2126j.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* JADX INFO: renamed from: N */
    public static final AbstractC2126j.a f9872N = new AbstractC2126j.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* JADX INFO: renamed from: O */
    public static final AbstractC2126j.a f9873O = new AbstractC2126j.a("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES");

    /* JADX INFO: renamed from: P */
    public static final AbstractC2117a.h f9874P = new AbstractC2117a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* JADX INFO: renamed from: Q */
    public static final AbstractC2117a.i f9875Q = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* JADX INFO: renamed from: R */
    public static final AbstractC2117a.d f9876R = new AbstractC2117a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* JADX INFO: renamed from: S */
    public static final AbstractC2117a.d f9877S = new AbstractC2117a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* JADX INFO: renamed from: T */
    public static final AbstractC2117a.h f9878T = new AbstractC2117a.h("FORCE_DARK", "FORCE_DARK");

    /* JADX INFO: renamed from: U */
    public static final AbstractC2117a.d f9879U = new AbstractC2117a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* JADX INFO: renamed from: V */
    public static final AbstractC2117a.d f9880V = new AbstractC2117a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* JADX INFO: renamed from: W */
    public static final AbstractC2117a.d f9881W = new AbstractC2117a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* JADX INFO: renamed from: X */
    public static final AbstractC2117a.d f9882X = new AbstractC2117a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* JADX INFO: renamed from: Y */
    public static final AbstractC2117a.d f9883Y = new AbstractC2117a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* JADX INFO: renamed from: Z */
    public static final AbstractC2117a.d f9884Z = new AbstractC2117a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* JADX INFO: renamed from: a0 */
    public static final AbstractC2117a.d f9886a0 = new AbstractC2117a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* JADX INFO: renamed from: b0 */
    public static final AbstractC2117a.d f9888b0 = new AbstractC2117a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* JADX INFO: renamed from: c0 */
    public static final AbstractC2117a.d f9890c0 = new AbstractC2117a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: d0 */
    public static final AbstractC2117a.d f9892d0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* JADX INFO: renamed from: e0 */
    public static final AbstractC2117a.d f9894e0 = new AbstractC2117a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* JADX INFO: renamed from: f0 */
    public static final AbstractC2117a.d f9896f0 = new AbstractC2117a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* JADX INFO: renamed from: g0 */
    public static final AbstractC2117a.d f9898g0 = new AbstractC2117a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* JADX INFO: renamed from: h0 */
    public static final AbstractC2117a.d f9900h0 = new AbstractC2117a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* JADX INFO: renamed from: i0 */
    public static final AbstractC2117a.d f9902i0 = new AbstractC2117a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* JADX INFO: renamed from: j0 */
    public static final AbstractC2117a.d f9904j0 = new AbstractC2117a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* JADX INFO: renamed from: k0 */
    public static final AbstractC2117a.d f9906k0 = new AbstractC2117a.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");

    /* JADX INFO: renamed from: l0 */
    public static final AbstractC2117a.d f9908l0 = new c("PREFETCH_URL_V4", "PREFETCH_URL_V4");

    /* JADX INFO: renamed from: m0 */
    public static final AbstractC2117a.d f9910m0 = new AbstractC2117a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");

    /* JADX INFO: renamed from: n0 */
    public static final AbstractC2117a.d f9912n0 = new AbstractC2117a.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");

    /* JADX INFO: renamed from: o0 */
    public static final AbstractC2117a.d f9914o0 = new AbstractC2117a.d("PRERENDER_URL_V2", "PRERENDER_URL_V2");

    /* JADX INFO: renamed from: p0 */
    public static final AbstractC2117a.d f9916p0 = new AbstractC2117a.d("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");

    /* JADX INFO: renamed from: q0 */
    public static final AbstractC2117a.d f9918q0 = new AbstractC2117a.d("SAVE_STATE", "SAVE_STATE");

    /* JADX INFO: renamed from: r0 */
    public static final AbstractC2117a.d f9920r0 = new AbstractC2117a.d("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");

    /* JADX INFO: renamed from: s0 */
    public static final AbstractC2117a.d f9922s0 = new AbstractC2117a.d("CACHE_PROVIDER", "PROVIDER_WEAKLY_REF_WEBVIEW");

    /* JADX INFO: renamed from: t0 */
    public static final AbstractC2117a.d f9924t0 = new AbstractC2117a.d("PAYMENT_REQUEST", "PAYMENT_REQUEST");

    /* JADX INFO: renamed from: u0 */
    public static final AbstractC2117a.d f9926u0 = new AbstractC2117a.d("WEBVIEW_BUILDER", "WEBVIEW_BUILDER");

    /* JADX INFO: renamed from: l0.m$a */
    class a extends AbstractC2117a.i {

        /* JADX INFO: renamed from: d */
        private final Pattern f9932d;

        a(String str, String str2) {
            super(str, str2);
            this.f9932d = Pattern.compile("\\A\\d+");
        }

        @Override // p124l0.AbstractC2117a
        /* JADX INFO: renamed from: d */
        public boolean mo10578d() {
            boolean zMo10578d = super.mo10578d();
            if (!zMo10578d || Build.VERSION.SDK_INT >= 29) {
                return zMo10578d;
            }
            PackageInfo packageInfoM10568a = AbstractC2111b.m10568a();
            if (packageInfoM10568a == null) {
                return false;
            }
            Matcher matcher = this.f9932d.matcher(packageInfoM10568a.versionName);
            return matcher.find() && Integer.parseInt(packageInfoM10568a.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    /* JADX INFO: renamed from: l0.m$b */
    class b extends AbstractC2117a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // p124l0.AbstractC2117a
        /* JADX INFO: renamed from: d */
        public boolean mo10578d() {
            if (super.mo10578d() && AbstractC2112c.m10572a("MULTI_PROCESS")) {
                return AbstractC2111b.m10571d();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l0.m$c */
    class c extends AbstractC2117a.d {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // p124l0.AbstractC2117a
        /* JADX INFO: renamed from: d */
        public boolean mo10578d() {
            if (AbstractC2112c.m10572a("MULTI_PROFILE")) {
                return super.mo10578d();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static UnsupportedOperationException m10588a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10589b(String str) {
        return m10590c(str, AbstractC2117a.m10574e());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10590c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC2124h interfaceC2124h = (InterfaceC2124h) it.next();
            if (interfaceC2124h.mo10575a().equals(str)) {
                hashSet.add(interfaceC2124h);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((InterfaceC2124h) it2.next()).mo10576b()) {
                return true;
            }
        }
        return false;
    }
}
