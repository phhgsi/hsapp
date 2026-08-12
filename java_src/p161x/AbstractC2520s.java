package p161x;

import android.app.RemoteInput;

/* JADX INFO: renamed from: x.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2520s {

    /* JADX INFO: renamed from: x.s$a */
    static class a {
        /* JADX INFO: renamed from: a */
        public static RemoteInput m12046a(AbstractC2520s abstractC2520s) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    static RemoteInput m12044a(AbstractC2520s abstractC2520s) {
        return a.m12046a(abstractC2520s);
    }

    /* JADX INFO: renamed from: b */
    static RemoteInput[] m12045b(AbstractC2520s[] abstractC2520sArr) {
        if (abstractC2520sArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[abstractC2520sArr.length];
        for (int i3 = 0; i3 < abstractC2520sArr.length; i3++) {
            AbstractC2520s abstractC2520s = abstractC2520sArr[i3];
            remoteInputArr[i3] = m12044a(null);
        }
        return remoteInputArr;
    }
}
