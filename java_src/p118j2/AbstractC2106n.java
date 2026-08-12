package p118j2;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: j2.n */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2106n {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m10531a(AtomicReferenceArray atomicReferenceArray, int i3, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }
}
