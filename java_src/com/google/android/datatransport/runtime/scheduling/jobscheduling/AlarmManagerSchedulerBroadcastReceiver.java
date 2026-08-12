package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p013E0.AbstractC0126a;
import p150t0.AbstractC2439o;
import p150t0.C2444t;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7208a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i3 = intent.getExtras().getInt("attemptNumber");
        C2444t.m11735f(context);
        AbstractC2439o.a aVarMo11699d = AbstractC2439o.m11726a().mo11697b(queryParameter).mo11699d(AbstractC0126a.m364b(iIntValue));
        if (queryParameter2 != null) {
            aVarMo11699d.mo11698c(Base64.decode(queryParameter2, 0));
        }
        C2444t.m11733c().m11736e().m69m(aVarMo11699d.mo11696a(), i3, new Runnable() { // from class: A0.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m7208a();
            }
        });
    }
}
