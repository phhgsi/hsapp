package p135o0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o0.d */
/* JADX INFO: loaded from: classes.dex */
public class C2290d {

    /* JADX INFO: renamed from: a */
    private final List f10599a = new ArrayList();

    /* JADX INFO: renamed from: o0.d$a */
    public static abstract class a {
    }

    /* JADX INFO: renamed from: a */
    public void m10954a(a aVar) {
        if (aVar == null || this.f10599a.contains(aVar)) {
            return;
        }
        this.f10599a.add(aVar);
    }
}
