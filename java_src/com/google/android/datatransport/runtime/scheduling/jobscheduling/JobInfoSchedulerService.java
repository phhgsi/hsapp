package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p013E0.AbstractC0126a;
import p150t0.AbstractC2439o;
import p150t0.C2444t;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i3 = jobParameters.getExtras().getInt("priority");
        int i4 = jobParameters.getExtras().getInt("attemptNumber");
        C2444t.m11735f(getApplicationContext());
        AbstractC2439o.a aVarMo11699d = AbstractC2439o.m11726a().mo11697b(string).mo11699d(AbstractC0126a.m364b(i3));
        if (string2 != null) {
            aVarMo11699d.mo11698c(Base64.decode(string2, 0));
        }
        C2444t.m11733c().m11736e().m69m(aVarMo11699d.mo11696a(), i4, new Runnable() { // from class: A0.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f11d.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
