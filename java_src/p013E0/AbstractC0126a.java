package p013E0;

import android.util.SparseArray;
import java.util.HashMap;
import p144r0.EnumC2368e;

/* JADX INFO: renamed from: E0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0126a {

    /* JADX INFO: renamed from: a */
    private static SparseArray f248a = new SparseArray();

    /* JADX INFO: renamed from: b */
    private static HashMap f249b;

    static {
        HashMap map = new HashMap();
        f249b = map;
        map.put(EnumC2368e.DEFAULT, 0);
        f249b.put(EnumC2368e.VERY_LOW, 1);
        f249b.put(EnumC2368e.HIGHEST, 2);
        for (EnumC2368e enumC2368e : f249b.keySet()) {
            f248a.append(((Integer) f249b.get(enumC2368e)).intValue(), enumC2368e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m363a(EnumC2368e enumC2368e) {
        Integer num = (Integer) f249b.get(enumC2368e);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC2368e);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC2368e m364b(int i3) {
        EnumC2368e enumC2368e = (EnumC2368e) f248a.get(i3);
        if (enumC2368e != null) {
            return enumC2368e;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i3);
    }
}
