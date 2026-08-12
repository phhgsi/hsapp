package p139p1;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: p1.s */
/* JADX INFO: loaded from: classes.dex */
public class C2338s extends C2339t {

    /* JADX INFO: renamed from: d */
    private final List f10772d;

    public C2338s(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f10772d = list;
    }
}
