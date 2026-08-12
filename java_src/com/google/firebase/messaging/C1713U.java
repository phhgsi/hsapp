package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.C0921a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.U */
/* JADX INFO: loaded from: classes.dex */
class C1713U {

    /* JADX INFO: renamed from: a */
    private final Executor f8541a;

    /* JADX INFO: renamed from: b */
    private final Map f8542b = new C0921a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.U$a */
    interface a {
        Task start();
    }

    C1713U(Executor executor) {
        this.f8541a = executor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m9359a(C1713U c1713u, String str, Task task) {
        synchronized (c1713u) {
            c1713u.f8542b.remove(str);
        }
        return task;
    }

    /* JADX INFO: renamed from: b */
    synchronized Task m9360b(final String str, a aVar) {
        Task task = (Task) this.f8542b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task taskContinueWithTask = aVar.start().continueWithTask(this.f8541a, new Continuation() { // from class: com.google.firebase.messaging.T
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return C1713U.m9359a(this.f8539a, str, task2);
            }
        });
        this.f8542b.put(str, taskContinueWithTask);
        return taskContinueWithTask;
    }
}
