package p087c;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: c.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1311e extends AbstractC1307a {

    /* JADX INFO: renamed from: a */
    public static final a f6374a = new a(null);

    /* JADX INFO: renamed from: c.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
        }
    }

    @Override // p087c.AbstractC1307a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo4873a(Context context, IntentSenderRequest intentSenderRequest) {
        AbstractC0606k.m2145e(context, "context");
        AbstractC0606k.m2145e(intentSenderRequest, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        AbstractC0606k.m2144d(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // p087c.AbstractC1307a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult mo4874c(int i3, Intent intent) {
        return new ActivityResult(i3, intent);
    }
}
