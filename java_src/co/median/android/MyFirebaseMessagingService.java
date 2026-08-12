package co.median.android;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import p128m0.AbstractC2218i0;
import p128m0.AbstractC2244r;
import p161x.AbstractC2513l;

/* JADX INFO: loaded from: classes.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX INFO: renamed from: v */
    private Bitmap m6971v(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (Exception e3) {
            Log.e("MyFirebaseMsgService", "Error downloading image: " + e3.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m6972w(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(AbstractC2244r.m10820a(this, "/api/save_fcm_token.php")).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            String str2 = "fcm_token=" + URLEncoder.encode(str, "UTF-8") + "&platform=android";
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(str2.getBytes("UTF-8"));
            outputStream.flush();
            outputStream.close();
            Log.d("MyFirebaseMsgService", "Token sent to server, response code: " + httpURLConnection.getResponseCode());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    Log.d("MyFirebaseMsgService", "Server response: " + sb.toString());
                    return;
                }
                sb.append(line);
            }
        } catch (Exception e3) {
            Log.e("MyFirebaseMsgService", "Error sending token to server: " + e3.getMessage());
        }
    }

    /* JADX INFO: renamed from: x */
    private void m6973x(String str, String str2, String str3, String str4, String str5, String str6) {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.addFlags(603979776);
        if (str4 != null) {
            intent.putExtra("click_url", str4);
        }
        if (str5 != null) {
            intent.putExtra("flash_msg", str5);
        }
        if (str6 != null) {
            intent.putExtra("is_external_url", str6);
        }
        PendingIntent activity = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 1140850688);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannelM10781a = AbstractC2218i0.m10781a("fcm_default_channel", "General Notifications", 4);
            notificationChannelM10781a.setDescription("Alerts from Admin");
            notificationChannelM10781a.enableVibration(true);
            notificationChannelM10781a.enableLights(true);
            notificationChannelM10781a.setShowBadge(true);
            notificationManager.createNotificationChannel(notificationChannelM10781a);
        }
        AbstractC2513l.e eVarM11967h = new AbstractC2513l.e(this, "fcm_default_channel").m11978t(R.drawable.sym_def_app_icon).m11969j(str).m11968i(str2).m11964e(true).m11976r(1).m11970k(-1).m11967h(activity);
        if (str3 != null && !str3.isEmpty()) {
            Bitmap bitmapM6971v = m6971v(str3);
            if (bitmapM6971v != null) {
                eVarM11967h.m11972n(bitmapM6971v).m11980v(new AbstractC2513l.b().m11948i(bitmapM6971v).m11947h(null).m11949j(str).m11950k(str2));
            }
        } else if (str2 != null && !str2.isEmpty()) {
            eVarM11967h.m11980v(new AbstractC2513l.c().m11956h(str2).m11957i(str));
        }
        notificationManager.notify((int) System.currentTimeMillis(), eVarM11967h.m11962b());
    }

    /* JADX INFO: renamed from: y */
    private void m6974y(final String str) {
        new Thread(new Runnable() { // from class: m0.Q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10034d.m6972w(str);
            }
        }).start();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: p */
    public void mo6975p(RemoteMessage remoteMessage) {
        String strM9355d;
        String strM9353a;
        Log.d("MyFirebaseMsgService", "From: " + remoteMessage.getFrom());
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (powerManager != null) {
            powerManager.newWakeLock(268435466, "MyApp::NotificationWakeLock").acquire(DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
        }
        Map data = remoteMessage.getData();
        strM9355d = "New Notification";
        strM9353a = "Tap to view.";
        String string = null;
        if (remoteMessage.m9351d() != null) {
            strM9355d = remoteMessage.m9351d().m9355d() != null ? remoteMessage.m9351d().m9355d() : "New Notification";
            strM9353a = remoteMessage.m9351d().m9353a() != null ? remoteMessage.m9351d().m9353a() : "Tap to view.";
            if (remoteMessage.m9351d().m9354b() != null) {
                string = remoteMessage.m9351d().m9354b().toString();
            }
        }
        String str = strM9355d;
        String str2 = strM9353a;
        String str3 = (String) data.get("click_url");
        if (str3 == null) {
            str3 = (String) data.get(ImagesContract.URL);
        }
        String str4 = str3;
        String str5 = (String) data.get("flash");
        if (str5 == null) {
            str5 = (String) data.get("flash_msg");
        }
        String str6 = str5;
        if (data.get("image_url") != null) {
            string = (String) data.get("image_url");
        }
        if (data.get("image") != null) {
            string = (String) data.get("image");
        }
        String str7 = string;
        Log.d("MyFirebaseMsgService", "Title: " + str + ", Body: " + str2);
        Log.d("MyFirebaseMsgService", "Click URL: " + str4 + ", Flash: " + str6 + ", Image: " + str7);
        String str8 = (String) data.get("is_external_url");
        if (str8 == null) {
            str8 = (String) data.get("external");
        }
        m6973x(str, str2, str7, str4, str6, str8);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: r */
    public void mo6976r(String str) {
        Log.d("MyFirebaseMsgService", "Refreshed token: " + str);
        getSharedPreferences("_median_push", 0).edit().putString("fcm_token", str).apply();
        m6974y(str);
    }
}
