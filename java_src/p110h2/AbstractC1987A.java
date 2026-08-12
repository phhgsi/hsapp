package p110h2;

/* JADX INFO: renamed from: h2.A */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC1987A {

    /* JADX INFO: renamed from: a */
    private static final int f9553a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static final int m10094a() {
        return f9553a;
    }

    /* JADX INFO: renamed from: b */
    public static final String m10095b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
