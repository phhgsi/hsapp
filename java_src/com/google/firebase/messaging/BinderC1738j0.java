package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ServiceConnectionC1744m0;
import p092d0.ExecutorC1782m;

/* JADX INFO: renamed from: com.google.firebase.messaging.j0 */
/* JADX INFO: loaded from: classes.dex */
class BinderC1738j0 extends Binder {

    /* JADX INFO: renamed from: a */
    private final a f8647a;

    /* JADX INFO: renamed from: com.google.firebase.messaging.j0$a */
    interface a {
        /* JADX INFO: renamed from: a */
        Task mo9477a(Intent intent);
    }

    BinderC1738j0(a aVar) {
        this.f8647a = aVar;
    }

    /* JADX INFO: renamed from: b */
    void m9479b(final ServiceConnectionC1744m0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f8647a.mo9477a(aVar.f8659a).addOnCompleteListener(new ExecutorC1782m(), new OnCompleteListener() { // from class: com.google.firebase.messaging.i0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                aVar.m9488d();
            }
        });
    }
}
