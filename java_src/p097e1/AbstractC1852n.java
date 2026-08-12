package p097e1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: e1.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1852n {

    /* JADX INFO: renamed from: a */
    private static final Set f9277a = new HashSet(Arrays.asList("app_update", "review"));

    /* JADX INFO: renamed from: b */
    private static final Set f9278b = new HashSet(Arrays.asList("native", "unity"));

    /* JADX INFO: renamed from: c */
    private static final Map f9279c = new HashMap();

    /* JADX INFO: renamed from: d */
    private static final C1854p f9280d = new C1854p("PlayCoreVersion");

    /* JADX INFO: renamed from: a */
    public static synchronized Map m9646a(String str) {
        Map map;
        try {
            map = f9279c;
            if (!map.containsKey("app_update")) {
                HashMap map2 = new HashMap();
                map2.put("java", 11004);
                map.put("app_update", map2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) map.get("app_update");
    }
}
