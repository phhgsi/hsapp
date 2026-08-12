package p087c;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.AbstractC0966b;
import p071X1.AbstractC0606k;
import p087c.AbstractC1307a;

/* JADX INFO: renamed from: c.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1309c extends AbstractC1307a {
    @Override // p087c.AbstractC1307a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo4873a(Context context, String str) {
        AbstractC0606k.m2145e(context, "context");
        AbstractC0606k.m2145e(str, "input");
        return C1308b.f6372a.m6642a(new String[]{str});
    }

    @Override // p087c.AbstractC1307a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC1307a.a mo6637b(Context context, String str) {
        AbstractC0606k.m2145e(context, "context");
        AbstractC0606k.m2145e(str, "input");
        if (AbstractC0966b.checkSelfPermission(context, str) == 0) {
            return new AbstractC1307a.a(Boolean.TRUE);
        }
        return null;
    }

    @Override // p087c.AbstractC1307a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean mo4874c(int i3, Intent intent) {
        if (intent == null || i3 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z2 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (intArrayExtra[i4] == 0) {
                    z2 = true;
                    break;
                }
                i4++;
            }
        }
        return Boolean.valueOf(z2);
    }
}
