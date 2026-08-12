package p167z;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p015F.AbstractC0138j;

/* JADX INFO: renamed from: z.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2567D {
    /* JADX INFO: renamed from: a */
    public static void m12246a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static ByteBuffer m12247b(Context context, Resources resources, int i3) {
        File fileM12250e = m12250e(context);
        if (fileM12250e == null) {
            return null;
        }
        try {
            if (m12248c(fileM12250e, resources, i3)) {
                return m12252g(fileM12250e);
            }
            return null;
        } finally {
            fileM12250e.delete();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12248c(File file, Resources resources, int i3) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i3);
            try {
                boolean zM12249d = m12249d(file, inputStreamOpenRawResource);
                m12246a(inputStreamOpenRawResource);
                return zM12249d;
            } catch (Throwable th) {
                th = th;
                m12246a(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12249d(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    m12246a(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i3);
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m12246a(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m12246a(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static File m12250e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i3 = 0; i3 < 100; i3++) {
            File file = new File(cacheDir, str + i3);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static ByteBuffer m12251f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private static ByteBuffer m12252g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Map m12253h(Context context, AbstractC0138j.b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (AbstractC0138j.b bVar : bVarArr) {
            if (bVar.m410b() == 0) {
                Uri uriM413e = bVar.m413e();
                if (!map.containsKey(uriM413e)) {
                    map.put(uriM413e, m12251f(context, cancellationSignal, uriM413e));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
