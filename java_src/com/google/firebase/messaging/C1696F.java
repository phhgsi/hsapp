package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.firebase.messaging.F */
/* JADX INFO: loaded from: classes.dex */
public class C1696F implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: d */
    private final URL f8473d;

    /* JADX INFO: renamed from: e */
    private volatile Future f8474e;

    /* JADX INFO: renamed from: f */
    private Task f8475f;

    private C1696F(URL url) {
        this.f8473d = url;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9218a(C1696F c1696f, TaskCompletionSource taskCompletionSource) {
        c1696f.getClass();
        try {
            taskCompletionSource.setResult(c1696f.m9221b());
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: renamed from: c */
    private byte[] m9219c() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f8473d.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrM9401d = AbstractC1721b.m9401d(AbstractC1721b.m9399b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrM9401d.length + " bytes from " + this.f8473d);
            }
            if (bArrM9401d.length <= 1048576) {
                return bArrM9401d;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C1696F m9220d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C1696F(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m9221b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f8473d);
        }
        byte[] bArrM9219c = m9219c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM9219c, 0, bArrM9219c.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f8473d);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f8473d);
        }
        return bitmapDecodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8474e.cancel(true);
    }

    /* JADX INFO: renamed from: g */
    public Task m9222g() {
        return (Task) Preconditions.checkNotNull(this.f8475f);
    }

    /* JADX INFO: renamed from: h */
    public void m9223h(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f8474e = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.E
            @Override // java.lang.Runnable
            public final void run() {
                C1696F.m9218a(this.f8471d, taskCompletionSource);
            }
        });
        this.f8475f = taskCompletionSource.getTask();
    }
}
