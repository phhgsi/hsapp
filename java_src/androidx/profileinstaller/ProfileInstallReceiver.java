package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.AbstractC1170i;
import p092d0.ExecutorC1782m;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    class C1158a implements AbstractC1170i.c {
        C1158a() {
        }

        @Override // androidx.profileinstaller.AbstractC1170i.c
        /* JADX INFO: renamed from: a */
        public void mo5272a(int i3, Object obj) {
            AbstractC1170i.f5522b.mo5272a(i3, obj);
        }

        @Override // androidx.profileinstaller.AbstractC1170i.c
        /* JADX INFO: renamed from: b */
        public void mo5273b(int i3, Object obj) {
            AbstractC1170i.f5522b.mo5273b(i3, obj);
            ProfileInstallReceiver.this.setResultCode(i3);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m5271a(AbstractC1170i.c cVar) {
        if (Build.VERSION.SDK_INT < 24) {
            cVar.mo5273b(13, null);
        } else {
            Process.sendSignal(Process.myPid(), 10);
            cVar.mo5273b(12, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC1170i.m5331j(context, new ExecutorC1782m(), new C1158a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    AbstractC1170i.m5332k(context, new ExecutorC1782m(), new C1158a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        AbstractC1170i.m5324c(context, new ExecutorC1782m(), new C1158a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            m5271a(new C1158a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C1158a c1158a = new C1158a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            AbstractC1162a.m5285b(context, c1158a);
        } else {
            c1158a.mo5273b(16, null);
        }
    }
}
