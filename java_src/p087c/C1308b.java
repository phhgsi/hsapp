package p087c;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.AbstractC0966b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p035L1.AbstractC0385q;
import p035L1.C0380l;
import p038M1.AbstractC0397C;
import p038M1.AbstractC0413g;
import p038M1.AbstractC0419m;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p086b2.AbstractC1304d;
import p087c.AbstractC1307a;

/* JADX INFO: renamed from: c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1308b extends AbstractC1307a {

    /* JADX INFO: renamed from: a */
    public static final a f6372a = new a(null);

    /* JADX INFO: renamed from: c.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Intent m6642a(String[] strArr) {
            AbstractC0606k.m2145e(strArr, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            AbstractC0606k.m2144d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        private a() {
        }
    }

    @Override // p087c.AbstractC1307a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo4873a(Context context, String[] strArr) {
        AbstractC0606k.m2145e(context, "context");
        AbstractC0606k.m2145e(strArr, "input");
        return f6372a.m6642a(strArr);
    }

    @Override // p087c.AbstractC1307a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC1307a.a mo6637b(Context context, String[] strArr) {
        AbstractC0606k.m2145e(context, "context");
        AbstractC0606k.m2145e(strArr, "input");
        if (strArr.length == 0) {
            return new AbstractC1307a.a(AbstractC0397C.m1398d());
        }
        for (String str : strArr) {
            if (AbstractC0966b.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1304d.m6631a(AbstractC0397C.m1395a(strArr.length), 16));
        for (String str2 : strArr) {
            C0380l c0380lM1378a = AbstractC0385q.m1378a(str2, Boolean.TRUE);
            linkedHashMap.put(c0380lM1378a.m1367c(), c0380lM1378a.m1368d());
        }
        return new AbstractC1307a.a(linkedHashMap);
    }

    @Override // p087c.AbstractC1307a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map mo4874c(int i3, Intent intent) {
        if (i3 != -1) {
            return AbstractC0397C.m1398d();
        }
        if (intent == null) {
            return AbstractC0397C.m1398d();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return AbstractC0397C.m1398d();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i4 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i4 == 0));
        }
        return AbstractC0397C.m1401g(AbstractC0419m.m1474u(AbstractC0413g.m1445m(stringArrayExtra), arrayList));
    }
}
