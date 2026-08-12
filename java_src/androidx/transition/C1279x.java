package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.transition.x */
/* JADX INFO: loaded from: classes.dex */
public class C1279x {

    /* JADX INFO: renamed from: b */
    public View f6212b;

    /* JADX INFO: renamed from: a */
    public final Map f6211a = new HashMap();

    /* JADX INFO: renamed from: c */
    final ArrayList f6213c = new ArrayList();

    public C1279x(View view) {
        this.f6212b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1279x)) {
            return false;
        }
        C1279x c1279x = (C1279x) obj;
        return this.f6212b == c1279x.f6212b && this.f6211a.equals(c1279x.f6211a);
    }

    public int hashCode() {
        return (this.f6212b.hashCode() * 31) + this.f6211a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f6212b + "\n") + "    values:";
        for (String str2 : this.f6211a.keySet()) {
            str = str + "    " + str2 + ": " + this.f6211a.get(str2) + "\n";
        }
        return str;
    }
}
