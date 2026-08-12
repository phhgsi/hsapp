package p128m0;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.WebChromeClient;
import androidx.core.content.FileProvider;
import co.median.android.jrejze.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p035L1.C0384p;
import p035L1.C0388t;
import p038M1.AbstractC0396B;
import p038M1.AbstractC0419m;
import p062U1.AbstractC0549a;
import p062U1.AbstractC0550b;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p071X1.C0612q;
import p086b2.AbstractC1304d;
import p086b2.C1303c;
import p087c.AbstractC1307a;
import p098e2.AbstractC1868d;
import p135o0.C2287a;
import p141q0.C2347a;
import p141q0.EnumC2348b;

/* JADX INFO: renamed from: m0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C2142A extends AbstractC1307a {

    /* JADX INFO: renamed from: k */
    public static final a f9941k = new a(null);

    /* JADX INFO: renamed from: a */
    private Context f9942a;

    /* JADX INFO: renamed from: b */
    private C2347a f9943b;

    /* JADX INFO: renamed from: c */
    private Uri f9944c;

    /* JADX INFO: renamed from: d */
    private Uri f9945d;

    /* JADX INFO: renamed from: e */
    private List f9946e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private C2152F f9947f;

    /* JADX INFO: renamed from: g */
    private boolean f9948g;

    /* JADX INFO: renamed from: h */
    private boolean f9949h;

    /* JADX INFO: renamed from: i */
    private boolean f9950i;

    /* JADX INFO: renamed from: j */
    private boolean f9951j;

    /* JADX INFO: renamed from: m0.A$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m10625a() {
            return Build.VERSION.SDK_INT >= 29;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m10603d(Intent intent) {
        Uri uriM10608k = m10608k(this, false, 1, null);
        this.f9944c = uriM10608k;
        intent.putExtra("output", uriM10608k);
    }

    /* JADX INFO: renamed from: e */
    private final void m10604e(Intent intent) {
        C2347a c2347a = this.f9943b;
        if (c2347a == null) {
            AbstractC0606k.m2154n("cameraConfig");
            c2347a = null;
        }
        if (c2347a.f10787c == EnumC2348b.HIGH) {
            intent.putExtra("android.intent.extra.videoQuality", 1);
        } else {
            intent.putExtra("android.intent.extra.videoQuality", 0);
        }
        Uri uriM10607j = m10607j(true);
        this.f9945d = uriM10607j;
        intent.putExtra("output", uriM10607j);
    }

    /* JADX INFO: renamed from: f */
    private final Intent m10605f() {
        return (Intent) AbstractC0419m.m1465l(m10614q() ? m10619w() : m10620x());
    }

    /* JADX INFO: renamed from: g */
    private final Uri m10606g(Uri uri, String str) {
        C0384p c0384p;
        Uri uriM4205h;
        InputStream inputStreamOpenInputStream;
        String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC0606k.m2144d(lowerCase, "toLowerCase(...)");
        if (AbstractC0606k.m2141a(lowerCase, "image")) {
            c0384p = new C0384p("IMG_" + str2 + ".jpg", "image/jpeg", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        } else {
            if (!AbstractC0606k.m2141a(lowerCase, "video")) {
                throw new IllegalArgumentException("Unsupported media type: " + str);
            }
            c0384p = new C0384p("VID_" + str2 + ".mp4", "video/mp4", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        }
        String str3 = (String) c0384p.m1375a();
        String str4 = (String) c0384p.m1376b();
        Uri uri2 = (Uri) c0384p.m1377c();
        if (f9941k.m10625a()) {
            Context context = this.f9942a;
            if (context == null) {
                AbstractC0606k.m2154n("context");
                context = null;
            }
            ContentResolver contentResolver = context.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str3);
            contentValues.put("mime_type", str4);
            contentValues.put("relative_path", Environment.DIRECTORY_DCIM + "/Camera");
            C0388t c0388t = C0388t.f1507a;
            uriM4205h = contentResolver.insert(uri2, contentValues);
        } else {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
            file.mkdirs();
            File file2 = new File(file, str3);
            Context context2 = this.f9942a;
            if (context2 == null) {
                AbstractC0606k.m2154n("context");
                context2 = null;
            }
            Context context3 = this.f9942a;
            if (context3 == null) {
                AbstractC0606k.m2154n("context");
                context3 = null;
            }
            uriM4205h = FileProvider.m4205h(context2, context3.getPackageName() + ".fileprovider", file2);
        }
        if (uriM4205h != null) {
            try {
                Context context4 = this.f9942a;
                if (context4 == null) {
                    AbstractC0606k.m2154n("context");
                    context4 = null;
                }
                inputStreamOpenInputStream = context4.getContentResolver().openInputStream(uri);
            } catch (Exception e3) {
                Log.e("FileUploadContract", "Failed to copy " + str + " to gallery", e3);
            }
            if (inputStreamOpenInputStream == null) {
                throw new IOException("Failed to open input stream for " + uri);
            }
            try {
                Context context5 = this.f9942a;
                if (context5 == null) {
                    AbstractC0606k.m2154n("context");
                    context5 = null;
                }
                OutputStream outputStreamOpenOutputStream = context5.getContentResolver().openOutputStream(uriM4205h);
                if (outputStreamOpenOutputStream == null) {
                    throw new IOException("Failed to open output stream for " + uriM4205h);
                }
                try {
                    AbstractC0549a.m2060b(inputStreamOpenInputStream, outputStreamOpenOutputStream, 0, 2, null);
                    AbstractC0550b.m2061a(outputStreamOpenOutputStream, null);
                    AbstractC0550b.m2061a(inputStreamOpenInputStream, null);
                    m10609l();
                    return uriM4205h;
                } finally {
                }
            } finally {
            }
            Log.e("FileUploadContract", "Failed to copy " + str + " to gallery", e3);
        }
        return uri;
    }

    /* JADX INFO: renamed from: j */
    private final Uri m10607j(boolean z2) {
        String str = z2 ? "temp_video_recording.mp4" : "temp_capture_image.jpg";
        Context context = this.f9942a;
        Context context2 = null;
        if (context == null) {
            AbstractC0606k.m2154n("context");
            context = null;
        }
        File file = new File(context.getCacheDir(), "downloads");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        Context context3 = this.f9942a;
        if (context3 == null) {
            AbstractC0606k.m2154n("context");
            context3 = null;
        }
        Context context4 = this.f9942a;
        if (context4 == null) {
            AbstractC0606k.m2154n("context");
        } else {
            context2 = context4;
        }
        Uri uriM4205h = FileProvider.m4205h(context3, context2.getApplicationContext().getPackageName() + ".fileprovider", file2);
        AbstractC0606k.m2142b(uriM4205h);
        return uriM4205h;
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ Uri m10608k(C2142A c2142a, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        return c2142a.m10607j(z2);
    }

    /* JADX INFO: renamed from: l */
    private final void m10609l() {
        Uri uri = this.f9944c;
        if (uri != null) {
            Context context = this.f9942a;
            if (context == null) {
                AbstractC0606k.m2154n("context");
                context = null;
            }
            context.getContentResolver().delete(uri, null, null);
            this.f9944c = null;
        }
        Uri uri2 = this.f9945d;
        if (uri2 != null) {
            Context context2 = this.f9942a;
            if (context2 == null) {
                AbstractC0606k.m2154n("context");
                context2 = null;
            }
            context2.getContentResolver().delete(uri2, null, null);
            this.f9945d = null;
        }
    }

    /* JADX INFO: renamed from: m */
    private final Intent m10610m() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType(AbstractC0419m.m1470q(this.f9946e, ", ", null, null, 0, null, null, 62, null));
        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) this.f9946e.toArray(new String[0]));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f9948g);
        intent.addCategory("android.intent.category.OPENABLE");
        if (!m10618u(intent).isEmpty() || !AbstractC1868d.m9667d(Build.MANUFACTURER, "samsung", true)) {
            return intent;
        }
        Intent intent2 = new Intent("com.sec.android.app.myfiles.PICK_DATA");
        intent2.putExtra("CONTENT_TYPE", "*/*");
        intent2.addCategory("android.intent.category.DEFAULT");
        return intent2;
    }

    /* JADX INFO: renamed from: n */
    private final Intent m10611n() {
        return m10614q() ? new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
    }

    /* JADX INFO: renamed from: o */
    private final boolean m10612o(Uri uri, Context context) {
        Cursor cursorQuery;
        int columnIndex;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
        } catch (Exception unused) {
        }
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_size")) >= 0) {
                    boolean z2 = cursorQuery.getLong(columnIndex) > 0;
                    AbstractC0550b.m2061a(cursorQuery, null);
                    return z2;
                }
                AbstractC0550b.m2061a(cursorQuery, null);
            } finally {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private final boolean m10613p(Uri uri, Context context) {
        int i3;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return false;
            }
            try {
                byte[] bArr = new byte[1024];
                C0612q c0612q = new C0612q();
                do {
                    i3 = inputStreamOpenInputStream.read(bArr);
                    c0612q.f2011d = i3;
                    if (i3 == -1) {
                        AbstractC0550b.m2061a(inputStreamOpenInputStream, null);
                        return false;
                    }
                } while (i3 <= 0);
                AbstractC0550b.m2061a(inputStreamOpenInputStream, null);
                return true;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    private final boolean m10614q() {
        C2152F c2152f;
        if (this.f9950i && (c2152f = this.f9947f) != null) {
            return c2152f.m10633g();
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m10615r() {
        return f9941k.m10625a();
    }

    /* JADX INFO: renamed from: s */
    private final boolean m10616s() {
        List listM10618u = m10618u(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
        return listM10618u.size() == 1 && AbstractC0606k.m2141a(((ResolveInfo) AbstractC0419m.m1465l(listM10618u)).activityInfo.packageName, "com.google.android.apps.photos");
    }

    /* JADX INFO: renamed from: t */
    private final boolean m10617t(Uri uri, Context context) {
        return m10612o(uri, context) || m10613p(uri, context);
    }

    /* JADX INFO: renamed from: u */
    private final List m10618u(Intent intent) {
        Context context = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Context context2 = this.f9942a;
            if (context2 == null) {
                AbstractC0606k.m2154n("context");
            } else {
                context = context2;
            }
            List listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L));
            AbstractC0606k.m2142b(listQueryIntentActivities);
            return listQueryIntentActivities;
        }
        Context context3 = this.f9942a;
        if (context3 == null) {
            AbstractC0606k.m2154n("context");
        } else {
            context = context3;
        }
        List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 65536);
        AbstractC0606k.m2142b(listQueryIntentActivities2);
        return listQueryIntentActivities2;
    }

    /* JADX INFO: renamed from: w */
    private final ArrayList m10619w() {
        ArrayList arrayList = new ArrayList();
        Context context = this.f9942a;
        if (context == null) {
            AbstractC0606k.m2154n("context");
            context = null;
        }
        if (C2287a.m10903f(context).f10512X0) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            m10603d(intent);
            for (ResolveInfo resolveInfo : m10618u(intent)) {
                String str = resolveInfo.activityInfo.packageName;
                Intent intent2 = new Intent(intent);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent2.setPackage(str);
                arrayList.add(intent2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    private final ArrayList m10620x() {
        ArrayList arrayList = new ArrayList();
        if (this.f9951j) {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            m10604e(intent);
            for (ResolveInfo resolveInfo : m10618u(intent)) {
                String str = resolveInfo.activityInfo.packageName;
                Intent intent2 = new Intent(intent);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent2.setPackage(str);
                arrayList.add(intent2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    private final boolean m10621y() {
        C2152F c2152f;
        if (this.f9950i && (c2152f = this.f9947f) != null) {
            return c2152f.m10635i();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final Intent m10622h() {
        Intent intentCreateChooser;
        ArrayList arrayList = new ArrayList();
        if (m10614q()) {
            arrayList.addAll(m10619w());
        }
        if (m10621y()) {
            arrayList.addAll(m10620x());
        }
        Context context = null;
        if (m10614q() ^ m10621y()) {
            Intent intentM10611n = m10611n();
            intentM10611n.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f9948g);
            Context context2 = this.f9942a;
            if (context2 == null) {
                AbstractC0606k.m2154n("context");
            } else {
                context = context2;
            }
            intentCreateChooser = Intent.createChooser(intentM10611n, context.getString(R.string.choose_action));
        } else {
            C2152F c2152f = this.f9947f;
            if (c2152f == null || !c2152f.m10640n() || m10616s()) {
                Intent intentM10610m = m10610m();
                Context context3 = this.f9942a;
                if (context3 == null) {
                    AbstractC0606k.m2154n("context");
                } else {
                    context = context3;
                }
                intentCreateChooser = Intent.createChooser(intentM10610m, context.getString(R.string.choose_action));
            } else {
                Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*, video/*");
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f9948g);
                Context context4 = this.f9942a;
                if (context4 == null) {
                    AbstractC0606k.m2154n("context");
                } else {
                    context = context4;
                }
                intentCreateChooser = Intent.createChooser(intent, context.getString(R.string.choose_action));
            }
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        AbstractC0606k.m2142b(intentCreateChooser);
        return intentCreateChooser;
    }

    @Override // p087c.AbstractC1307a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Intent mo4873a(Context context, C2152F c2152f) {
        AbstractC0606k.m2145e(context, "context");
        AbstractC0606k.m2145e(c2152f, "input");
        this.f9942a = context;
        this.f9947f = c2152f;
        C2287a c2287aM10903f = C2287a.m10903f(context);
        C2347a c2347a = c2287aM10903f.f10510W0;
        AbstractC0606k.m2144d(c2347a, "cameraConfig");
        this.f9943b = c2347a;
        this.f9951j = c2287aM10903f.f10512X0;
        this.f9950i = c2152f.m10637k();
        this.f9949h = c2152f.m10636j();
        this.f9946e = c2152f.m10639m();
        if (c2152f.m10638l().getMode() == 1) {
            this.f9948g = true;
        }
        return c2152f.m10638l().isCaptureEnabled() ? m10605f() : m10622h();
    }

    @Override // p087c.AbstractC1307a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public C2154G mo4874c(int i3, Intent intent) {
        Object objNormalizeScheme;
        if (i3 != -1) {
            m10609l();
            return new C2154G(false, null, false, 4, null);
        }
        C2347a c2347a = null;
        if (intent != null) {
            if (intent.getData() != null) {
                Uri uriM10606g = this.f9945d;
                if (uriM10606g != null) {
                    Context context = this.f9942a;
                    if (context == null) {
                        AbstractC0606k.m2154n("context");
                        context = null;
                    }
                    if (m10617t(uriM10606g, context)) {
                        Uri[] result = WebChromeClient.FileChooserParams.parseResult(i3, intent);
                        Uri uri = result != null ? result[0] : null;
                        Uri uriNormalizeScheme = uriM10606g.normalizeScheme();
                        if (uri == null || (objNormalizeScheme = uri.normalizeScheme()) == null) {
                            objNormalizeScheme = Boolean.FALSE;
                        }
                        if (AbstractC0606k.m2141a(uriNormalizeScheme, objNormalizeScheme)) {
                            C2347a c2347a2 = this.f9943b;
                            if (c2347a2 == null) {
                                AbstractC0606k.m2154n("cameraConfig");
                            } else {
                                c2347a = c2347a2;
                            }
                            if (c2347a.f10785a && this.f9949h) {
                                uriM10606g = m10606g(uriM10606g, "video");
                            }
                            return new C2154G(true, new Uri[]{uriM10606g}, false, 4, null);
                        }
                    }
                }
                return new C2154G(true, WebChromeClient.FileChooserParams.parseResult(i3, intent), false, 4, null);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                C1303c c1303cF = AbstractC1304d.m6636f(0, clipData.getItemCount());
                ArrayList arrayList = new ArrayList();
                Iterator it = c1303cF.iterator();
                while (it.hasNext()) {
                    Uri uri2 = clipData.getItemAt(((AbstractC0396B) it).mo1394a()).getUri();
                    if (uri2 != null) {
                        arrayList.add(uri2);
                    }
                }
                return new C2154G(true, (Uri[]) arrayList.toArray(new Uri[0]), false, 4, null);
            }
        }
        Uri uriM10606g2 = this.f9944c;
        if (uriM10606g2 != null) {
            Context context2 = this.f9942a;
            if (context2 == null) {
                AbstractC0606k.m2154n("context");
                context2 = null;
            }
            if (m10617t(uriM10606g2, context2)) {
                C2347a c2347a3 = this.f9943b;
                if (c2347a3 == null) {
                    AbstractC0606k.m2154n("cameraConfig");
                    c2347a3 = null;
                }
                if (c2347a3.f10785a && this.f9949h) {
                    uriM10606g2 = m10606g(uriM10606g2, "image");
                }
                C2347a c2347a4 = this.f9943b;
                if (c2347a4 == null) {
                    AbstractC0606k.m2154n("cameraConfig");
                } else {
                    c2347a = c2347a4;
                }
                return new C2154G(true, new Uri[]{uriM10606g2}, c2347a.f10787c == EnumC2348b.LOW);
            }
        }
        Uri uriM10606g3 = this.f9945d;
        if (uriM10606g3 != null) {
            Context context3 = this.f9942a;
            if (context3 == null) {
                AbstractC0606k.m2154n("context");
                context3 = null;
            }
            if (m10617t(uriM10606g3, context3)) {
                C2347a c2347a5 = this.f9943b;
                if (c2347a5 == null) {
                    AbstractC0606k.m2154n("cameraConfig");
                } else {
                    c2347a = c2347a5;
                }
                if (c2347a.f10785a && this.f9949h) {
                    uriM10606g3 = m10606g(uriM10606g3, "video");
                }
                return new C2154G(true, new Uri[]{uriM10606g3}, false, 4, null);
            }
        }
        m10609l();
        return new C2154G(false, null, false, 4, null);
    }
}
