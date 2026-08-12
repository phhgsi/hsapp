package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC1735i {

    /* JADX INFO: renamed from: g */
    private static final Queue f8496g = new ArrayDeque(10);

    /* JADX INFO: renamed from: f */
    private Rpc f8497f;

    /* JADX INFO: renamed from: j */
    private boolean m9259j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f8496g;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    /* JADX INFO: renamed from: k */
    private void m9260k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C1701J.m9311t(extras)) {
            C1701J c1701j = new C1701J(extras);
            ExecutorService executorServiceM9502e = AbstractC1746o.m9502e();
            try {
                if (new C1729f(this, c1701j, executorServiceM9502e).m9451a()) {
                    return;
                }
                executorServiceM9502e.shutdown();
                if (AbstractC1699H.m9273D(intent)) {
                    AbstractC1699H.m9297w(intent);
                }
            } finally {
                executorServiceM9502e.shutdown();
            }
        }
        mo6975p(new RemoteMessage(extras));
    }

    /* JADX INFO: renamed from: l */
    private String m9261l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* JADX INFO: renamed from: m */
    private Rpc m9262m(Context context) {
        if (this.f8497f == null) {
            this.f8497f = new Rpc(context.getApplicationContext());
        }
        return this.f8497f;
    }

    /* JADX INFO: renamed from: n */
    private void m9263n(Intent intent) {
        if (!m9259j(intent.getStringExtra("google.message_id"))) {
            m9264t(intent);
        }
        m9262m(this).messageHandled(new CloudMessage(intent));
    }

    /* JADX INFO: renamed from: t */
    private void m9264t(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                m9267o();
                break;
            case "gcm":
                AbstractC1699H.m9299y(intent);
                m9260k(intent);
                break;
            case "send_error":
                m9269s(m9261l(intent), new C1714V(intent.getStringExtra("error")));
                break;
            case "send_event":
                m9268q(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC1735i
    /* JADX INFO: renamed from: e */
    protected Intent mo9265e(Intent intent) {
        return C1715W.m9363b().m9365c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC1735i
    /* JADX INFO: renamed from: f */
    public void mo9266f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            m9263n(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            mo6976r(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    /* JADX INFO: renamed from: o */
    public void m9267o() {
    }

    /* JADX INFO: renamed from: p */
    public void mo6975p(RemoteMessage remoteMessage) {
    }

    /* JADX INFO: renamed from: q */
    public void m9268q(String str) {
    }

    /* JADX INFO: renamed from: r */
    public void mo6976r(String str) {
    }

    /* JADX INFO: renamed from: s */
    public void m9269s(String str, Exception exc) {
    }
}
