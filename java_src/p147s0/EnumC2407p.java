package p147s0;

import android.util.SparseArray;

/* JADX INFO: renamed from: s0.p */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2407p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: k */
    private static final SparseArray f11245k;

    /* JADX INFO: renamed from: d */
    private final int f11247d;

    static {
        EnumC2407p enumC2407p = DEFAULT;
        EnumC2407p enumC2407p2 = UNMETERED_ONLY;
        EnumC2407p enumC2407p3 = UNMETERED_OR_DAILY;
        EnumC2407p enumC2407p4 = FAST_IF_RADIO_AWAKE;
        EnumC2407p enumC2407p5 = NEVER;
        EnumC2407p enumC2407p6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        f11245k = sparseArray;
        sparseArray.put(0, enumC2407p);
        sparseArray.put(1, enumC2407p2);
        sparseArray.put(2, enumC2407p3);
        sparseArray.put(3, enumC2407p4);
        sparseArray.put(4, enumC2407p5);
        sparseArray.put(-1, enumC2407p6);
    }

    EnumC2407p(int i3) {
        this.f11247d = i3;
    }
}
