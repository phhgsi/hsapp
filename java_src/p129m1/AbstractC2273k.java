package p129m1;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: m1.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2273k extends Exception {
    protected AbstractC2273k() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2273k(String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
