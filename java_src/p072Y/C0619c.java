package p072Y;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: Y.c */
/* JADX INFO: loaded from: classes.dex */
final class C0619c implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: d */
    private final File f2017d;

    /* JADX INFO: renamed from: e */
    private final long f2018e;

    /* JADX INFO: renamed from: f */
    private final File f2019f;

    /* JADX INFO: renamed from: g */
    private final RandomAccessFile f2020g;

    /* JADX INFO: renamed from: h */
    private final FileChannel f2021h;

    /* JADX INFO: renamed from: i */
    private final FileLock f2022i;

    /* JADX INFO: renamed from: Y.c$a */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* JADX INFO: renamed from: Y.c$b */
    private static class b extends File {

        /* JADX INFO: renamed from: d */
        public long f2024d;

        public b(File file, String str) {
            super(file, str);
            this.f2024d = -1L;
        }
    }

    C0619c(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f2017d = file;
        this.f2019f = file2;
        this.f2018e = m2198h(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f2020g = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f2021h = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f2022i = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e3) {
                e = e3;
                m2194b(this.f2021h);
                throw e;
            } catch (Error e4) {
                e = e4;
                m2194b(this.f2021h);
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                m2194b(this.f2021h);
                throw e;
            }
        } catch (IOException e6) {
            e = e6;
            m2194b(this.f2020g);
            throw e;
        } catch (Error e7) {
            e = e7;
            m2194b(this.f2020g);
            throw e;
        } catch (RuntimeException e8) {
            e = e8;
            m2194b(this.f2020g);
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2193a() {
        File[] fileArrListFiles = this.f2019f.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f2019f.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m2194b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e3) {
            Log.w("MultiDex", "Failed to close resource", e3);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m2195c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i3 = inputStream.read(bArr); i3 != -1; i3 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i3);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    m2194b(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            m2194b(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    private static SharedPreferences m2196d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* JADX INFO: renamed from: g */
    private static long m2197g(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    /* JADX INFO: renamed from: h */
    private static long m2198h(File file) throws IOException {
        long jM2206c = AbstractC0620d.m2206c(file);
        return jM2206c == -1 ? jM2206c - 1 : jM2206c;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m2199i(Context context, File file, long j3, String str) {
        SharedPreferences sharedPreferencesM2196d = m2196d(context);
        if (sharedPreferencesM2196d.getLong(str + "timestamp", -1L) != m2197g(file)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("crc");
        return sharedPreferencesM2196d.getLong(sb.toString(), -1L) != j3;
    }

    /* JADX INFO: renamed from: l */
    private List m2200l(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f2017d.getName() + ".classes";
        SharedPreferences sharedPreferencesM2196d = m2196d(context);
        int i3 = sharedPreferencesM2196d.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i3 + (-1));
        int i4 = 2;
        while (i4 <= i3) {
            b bVar = new b(this.f2019f, str2 + i4 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f2024d = m2198h(bVar);
            long j3 = sharedPreferencesM2196d.getLong(str + "dex.crc." + i4, -1L);
            long j4 = sharedPreferencesM2196d.getLong(str + "dex.time." + i4, -1L);
            long jLastModified = bVar.lastModified();
            if (j4 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesM2196d;
                if (j3 == bVar.f2024d) {
                    arrayList.add(bVar);
                    i4++;
                    sharedPreferencesM2196d = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j4 + ", modification time: " + jLastModified + ", expected crc: " + j3 + ", file crc: " + bVar.f2024d);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    private List m2201p() {
        boolean z2;
        String str = this.f2017d.getName() + ".classes";
        m2193a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f2017d);
        try {
            int i3 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                b bVar = new b(this.f2019f, str + i3 + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i4 = 0;
                boolean z3 = false;
                while (i4 < 3 && !z3) {
                    int i5 = i4 + 1;
                    m2195c(zipFile, entry, bVar, str);
                    try {
                        bVar.f2024d = m2198h(bVar);
                        z2 = true;
                    } catch (IOException e3) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e3);
                        z2 = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z2 ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(bVar.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(bVar.length());
                    sb.append(" - crc: ");
                    sb.append(bVar.f2024d);
                    Log.i("MultiDex", sb.toString());
                    if (!z2) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z3 = z2;
                    i4 = i5;
                }
                if (!z3) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i3 + ")");
                }
                i3++;
                entry = zipFile.getEntry("classes" + i3 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e4) {
                Log.w("MultiDex", "Failed to close resource", e4);
            }
            return arrayList;
        } finally {
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m2202q(Context context, String str, long j3, long j4, List list) {
        SharedPreferences.Editor editorEdit = m2196d(context).edit();
        editorEdit.putLong(str + "timestamp", j3);
        editorEdit.putLong(str + "crc", j4);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i3 = 2;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            editorEdit.putLong(str + "dex.crc." + i3, bVar.f2024d);
            editorEdit.putLong(str + "dex.time." + i3, bVar.lastModified());
            i3++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2022i.release();
        this.f2021h.close();
        this.f2020g.close();
    }

    /* JADX INFO: renamed from: k */
    List m2203k(Context context, String str, boolean z2) {
        List listM2201p;
        List listM2200l;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f2017d.getPath() + ", " + z2 + ", " + str + ")");
        if (!this.f2022i.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z2 && !m2199i(context, this.f2017d, this.f2018e, str)) {
            try {
                listM2200l = m2200l(context, str);
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e3);
                listM2201p = m2201p();
                m2202q(context, str, m2197g(this.f2017d), this.f2018e, listM2201p);
                listM2200l = listM2201p;
            }
            Log.i("MultiDex", "load found " + listM2200l.size() + " secondary dex files");
            return listM2200l;
        }
        if (z2) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        listM2201p = m2201p();
        m2202q(context, str, m2197g(this.f2017d), this.f2018e, listM2201p);
        listM2200l = listM2201p;
        Log.i("MultiDex", "load found " + listM2200l.size() + " secondary dex files");
        return listM2200l;
    }
}
