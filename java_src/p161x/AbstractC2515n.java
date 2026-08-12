package p161x;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import p161x.AbstractC2513l;

/* JADX INFO: renamed from: x.n */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2515n {

    /* JADX INFO: renamed from: a */
    private static final Object f11778a = new Object();

    /* JADX INFO: renamed from: b */
    private static final Object f11779b = new Object();

    /* JADX INFO: renamed from: a */
    static Bundle m12037a(AbstractC2513l.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatM11938d = aVar.m11938d();
        bundle.putInt("icon", iconCompatM11938d != null ? iconCompatM11938d.m4238e() : 0);
        bundle.putCharSequence("title", aVar.m11942h());
        bundle.putParcelable("actionIntent", aVar.m11935a());
        Bundle bundle2 = aVar.m11937c() != null ? new Bundle(aVar.m11937c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.m11936b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m12039c(aVar.m11939e()));
        bundle.putBoolean("showsUserInterface", aVar.m11941g());
        bundle.putInt("semanticAction", aVar.m11940f());
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    private static Bundle m12038b(AbstractC2520s abstractC2520s) {
        new Bundle();
        throw null;
    }

    /* JADX INFO: renamed from: c */
    private static Bundle[] m12039c(AbstractC2520s[] abstractC2520sArr) {
        if (abstractC2520sArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[abstractC2520sArr.length];
        for (int i3 = 0; i3 < abstractC2520sArr.length; i3++) {
            AbstractC2520s abstractC2520s = abstractC2520sArr[i3];
            bundleArr[i3] = m12038b(null);
        }
        return bundleArr;
    }
}
