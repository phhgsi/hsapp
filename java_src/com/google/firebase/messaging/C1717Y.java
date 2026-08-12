package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.Y */
/* JADX INFO: loaded from: classes.dex */
final class C1717Y {

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f8550a;

    /* JADX INFO: renamed from: b */
    private final String f8551b;

    /* JADX INFO: renamed from: c */
    private final String f8552c;

    /* JADX INFO: renamed from: e */
    private final Executor f8554e;

    /* JADX INFO: renamed from: d */
    final ArrayDeque f8553d = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    private boolean f8555f = false;

    private C1717Y(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f8550a = sharedPreferences;
        this.f8551b = str;
        this.f8552c = str2;
        this.f8554e = executor;
    }

    /* JADX INFO: renamed from: b */
    private boolean m9370b(boolean z2) {
        if (z2 && !this.f8555f) {
            m9374i();
        }
        return z2;
    }

    /* JADX INFO: renamed from: c */
    static C1717Y m9371c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C1717Y c1717y = new C1717Y(sharedPreferences, str, str2, executor);
        c1717y.m9372d();
        return c1717y;
    }

    /* JADX INFO: renamed from: d */
    private void m9372d() {
        synchronized (this.f8553d) {
            try {
                this.f8553d.clear();
                String string = this.f8550a.getString(this.f8551b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f8552c)) {
                    String[] strArrSplit = string.split(this.f8552c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f8553d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m9373h() {
        synchronized (this.f8553d) {
            this.f8550a.edit().putString(this.f8551b, m9377g()).commit();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m9374i() {
        this.f8554e.execute(new Runnable() { // from class: com.google.firebase.messaging.X
            @Override // java.lang.Runnable
            public final void run() {
                this.f8549d.m9373h();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public String m9375e() {
        String str;
        synchronized (this.f8553d) {
            str = (String) this.f8553d.peek();
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    public boolean m9376f(Object obj) {
        boolean zM9370b;
        synchronized (this.f8553d) {
            zM9370b = m9370b(this.f8553d.remove(obj));
        }
        return zM9370b;
    }

    /* JADX INFO: renamed from: g */
    public String m9377g() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f8553d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f8552c);
        }
        return sb.toString();
    }
}
