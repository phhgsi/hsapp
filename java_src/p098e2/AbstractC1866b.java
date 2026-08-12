package p098e2;

/* JADX INFO: renamed from: e2.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1866b extends AbstractC1865a {
    /* JADX INFO: renamed from: d */
    public static final boolean m9657d(char c3, char c4, boolean z2) {
        if (c3 == c4) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c3);
        char upperCase2 = Character.toUpperCase(c4);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
