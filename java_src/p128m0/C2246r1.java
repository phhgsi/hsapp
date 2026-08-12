package p128m0;

import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p135o0.AbstractC2296j;
import p135o0.C2287a;

/* JADX INFO: renamed from: m0.r1 */
/* JADX INFO: loaded from: classes.dex */
public class C2246r1 extends CookieManager {

    /* JADX INFO: renamed from: a */
    private android.webkit.CookieManager f10379a;

    public C2246r1() {
        this(null, null);
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public Map get(URI uri, Map map) {
        if (uri == null || map == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        String string = uri.toString();
        HashMap map2 = new HashMap();
        String cookie = this.f10379a.getCookie(string);
        if (cookie != null) {
            map2.put("Cookie", Arrays.asList(cookie));
        }
        return map2;
    }

    @Override // java.net.CookieManager
    public CookieStore getCookieStore() {
        return null;
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public void put(URI uri, Map map) {
        if (uri == null || map == null) {
            return;
        }
        String string = uri.toString();
        String str = null;
        int i3 = C2287a.m10903f(null).f10559o;
        for (String str2 : map.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase("Set-Cookie")) {
                for (String str3 : (List) map.get(str2)) {
                    boolean z2 = true;
                    if (i3 > 0) {
                        for (HttpCookie httpCookie : HttpCookie.parse(str3)) {
                            if (httpCookie.getMaxAge() < 0 || httpCookie.getDiscard()) {
                                httpCookie.setMaxAge(i3);
                                z2 = false;
                                httpCookie.setDiscard(false);
                                if (str == null) {
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.add(13, i3);
                                    str = "; expires=" + AbstractC2296j.m10967d(calendar.getTime()) + "; Max-Age=" + Integer.toString(i3);
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(httpCookie.toString());
                                sb.append(str);
                                if (httpCookie.getPath() != null) {
                                    sb.append("; path=");
                                    sb.append(httpCookie.getPath());
                                }
                                if (httpCookie.getDomain() != null) {
                                    sb.append("; domain=");
                                    sb.append(httpCookie.getDomain());
                                }
                                if (httpCookie.getSecure()) {
                                    sb.append("; secure");
                                }
                                this.f10379a.setCookie(string, sb.toString());
                            }
                        }
                    }
                    if (z2) {
                        this.f10379a.setCookie(string, str3);
                    }
                }
            }
        }
    }

    C2246r1(CookieStore cookieStore, CookiePolicy cookiePolicy) {
        super(null, cookiePolicy);
        this.f10379a = android.webkit.CookieManager.getInstance();
    }
}
