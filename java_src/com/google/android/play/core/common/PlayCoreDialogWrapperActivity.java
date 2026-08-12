package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private ResultReceiver f8354a;

    /* JADX INFO: renamed from: a */
    private final void m9101a() {
        ResultReceiver resultReceiver = this.f8354a;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i3, int i4, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i3, i4, intent);
        if (i3 == 0 && (resultReceiver = this.f8354a) != null) {
            if (i4 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i4 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f8354a = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f8354a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            m9101a();
            finish();
        } else {
            try {
                try {
                    startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
                } catch (IntentSender.SendIntentException unused) {
                    m9101a();
                    finish();
                }
            } catch (IntentSender.SendIntentException unused2) {
            }
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f8354a);
    }
}
