package p001A0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;
import p004B0.InterfaceC0054d;
import p013E0.AbstractC0126a;
import p150t0.AbstractC2439o;
import p162x0.AbstractC2523a;

/* JADX INFO: renamed from: A0.d */
/* JADX INFO: loaded from: classes.dex */
public class C0005d implements InterfaceC0025x {

    /* JADX INFO: renamed from: a */
    private final Context f8a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0054d f9b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0007f f10c;

    public C0005d(Context context, InterfaceC0054d interfaceC0054d, AbstractC0007f abstractC0007f) {
        this.f8a = context;
        this.f9b = interfaceC0054d;
        this.f10c = abstractC0007f;
    }

    /* JADX INFO: renamed from: d */
    private boolean m40d(JobScheduler jobScheduler, int i3, int i4) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i5 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i3) {
                if (i5 >= i4) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p001A0.InterfaceC0025x
    /* JADX INFO: renamed from: a */
    public void mo41a(AbstractC2439o abstractC2439o, int i3, boolean z2) {
        ComponentName componentName = new ComponentName(this.f8a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f8a.getSystemService("jobscheduler");
        int iM43c = m43c(abstractC2439o);
        if (!z2 && m40d(jobScheduler, iM43c, i3)) {
            AbstractC2523a.m12054b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC2439o);
            return;
        }
        long jMo141t = this.f9b.mo141t(abstractC2439o);
        JobInfo.Builder builderM50c = this.f10c.m50c(new JobInfo.Builder(iM43c, componentName), abstractC2439o.mo11695d(), jMo141t, i3);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i3);
        persistableBundle.putString("backendName", abstractC2439o.mo11693b());
        persistableBundle.putInt("priority", AbstractC0126a.m363a(abstractC2439o.mo11695d()));
        if (abstractC2439o.mo11694c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC2439o.mo11694c(), 0));
        }
        builderM50c.setExtras(persistableBundle);
        AbstractC2523a.m12055c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC2439o, Integer.valueOf(iM43c), Long.valueOf(this.f10c.m51g(abstractC2439o.mo11695d(), jMo141t, i3)), Long.valueOf(jMo141t), Integer.valueOf(i3));
        jobScheduler.schedule(builderM50c.build());
    }

    @Override // p001A0.InterfaceC0025x
    /* JADX INFO: renamed from: b */
    public void mo42b(AbstractC2439o abstractC2439o, int i3) {
        mo41a(abstractC2439o, i3, false);
    }

    /* JADX INFO: renamed from: c */
    int m43c(AbstractC2439o abstractC2439o) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f8a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC2439o.mo11693b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC0126a.m363a(abstractC2439o.mo11695d())).array());
        if (abstractC2439o.mo11694c() != null) {
            adler32.update(abstractC2439o.mo11694c());
        }
        return (int) adler32.getValue();
    }
}
