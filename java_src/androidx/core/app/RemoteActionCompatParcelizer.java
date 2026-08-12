package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC1291a;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1291a abstractC1291a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f4644a = (IconCompat) abstractC1291a.m6585v(remoteActionCompat.f4644a, 1);
        remoteActionCompat.f4645b = abstractC1291a.m6575l(remoteActionCompat.f4645b, 2);
        remoteActionCompat.f4646c = abstractC1291a.m6575l(remoteActionCompat.f4646c, 3);
        remoteActionCompat.f4647d = (PendingIntent) abstractC1291a.m6581r(remoteActionCompat.f4647d, 4);
        remoteActionCompat.f4648e = abstractC1291a.m6571h(remoteActionCompat.f4648e, 5);
        remoteActionCompat.f4649f = abstractC1291a.m6571h(remoteActionCompat.f4649f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1291a abstractC1291a) {
        abstractC1291a.m6587x(false, false);
        abstractC1291a.m6566M(remoteActionCompat.f4644a, 1);
        abstractC1291a.m6557D(remoteActionCompat.f4645b, 2);
        abstractC1291a.m6557D(remoteActionCompat.f4646c, 3);
        abstractC1291a.m6561H(remoteActionCompat.f4647d, 4);
        abstractC1291a.m6589z(remoteActionCompat.f4648e, 5);
        abstractC1291a.m6589z(remoteActionCompat.f4649f, 6);
    }
}
