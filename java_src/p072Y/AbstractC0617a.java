package p072Y;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: Y.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0617a {

    /* JADX INFO: renamed from: a */
    private static final Set f2015a = new HashSet();

    /* JADX INFO: renamed from: b */
    private static final boolean f2016b = m2189n(System.getProperty("java.vm.version"));

    /* JADX INFO: renamed from: Y.a$a */
    private static final class a {
        /* JADX INFO: renamed from: a */
        static void m2191a(ClassLoader classLoader, List list, File file) throws IllegalAccessException, NoSuchFieldException, IOException {
            IOException[] iOExceptionArr;
            Object obj = AbstractC0617a.m2182g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            AbstractC0617a.m2181f(obj, "dexElements", m2192b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) obj2);
                }
                Field fieldM2182g = AbstractC0617a.m2182g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) fieldM2182g.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                fieldM2182g.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        /* JADX INFO: renamed from: b */
        private static Object[] m2192b(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
            return (Object[]) AbstractC0617a.m2183h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m2179d(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : fileArrListFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
                return;
            }
            Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m2180e(Context context, File file, File file2, String str, String str2, boolean z2) {
        Set set = f2015a;
        synchronized (set) {
            try {
                if (set.contains(file)) {
                    return;
                }
                set.add(file);
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                ClassLoader classLoaderM2185j = m2185j(context);
                if (classLoaderM2185j == null) {
                    return;
                }
                try {
                    m2179d(context);
                } catch (Throwable th) {
                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                }
                File fileM2186k = m2186k(context, file2, str);
                C0619c c0619c = new C0619c(file, fileM2186k);
                try {
                    try {
                        m2188m(classLoaderM2185j, fileM2186k, c0619c.m2203k(context, str2, false));
                    } catch (IOException e3) {
                        if (!z2) {
                            throw e3;
                        }
                        Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e3);
                        m2188m(classLoaderM2185j, fileM2186k, c0619c.m2203k(context, str2, true));
                    }
                    try {
                        e = null;
                    } catch (IOException e4) {
                        e = e4;
                    }
                    if (e != null) {
                        throw e;
                    }
                } finally {
                    try {
                        c0619c.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static void m2181f(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException {
        Field fieldM2182g = m2182g(obj, str);
        Object[] objArr2 = (Object[]) fieldM2182g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldM2182g.set(obj, objArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static Field m2182g(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static Method m2183h(Object obj, String str, Class... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* JADX INFO: renamed from: i */
    private static ApplicationInfo m2184i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e3) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    private static ClassLoader m2185j(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                return classLoader;
            }
            Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        } catch (RuntimeException e3) {
            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private static File m2186k(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            m2190o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m2190o(file2);
        }
        File file3 = new File(file2, str);
        m2190o(file3);
        return file3;
    }

    /* JADX INFO: renamed from: l */
    public static void m2187l(Context context) {
        Log.i("MultiDex", "Installing application");
        if (f2016b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        try {
            ApplicationInfo applicationInfoM2184i = m2184i(context);
            if (applicationInfoM2184i == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                m2180e(context, new File(applicationInfoM2184i.sourceDir), new File(applicationInfoM2184i.dataDir), "secondary-dexes", "", true);
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e3) {
            Log.e("MultiDex", "MultiDex installation failure", e3);
            throw new RuntimeException("MultiDex installation failed (" + e3.getMessage() + ").");
        }
    }

    /* JADX INFO: renamed from: m */
    private static void m2188m(ClassLoader classLoader, File file, List list) throws IllegalAccessException, NoSuchFieldException, IOException {
        if (list.isEmpty()) {
            return;
        }
        a.m2191a(classLoader, list, file);
    }

    /* JADX INFO: renamed from: n */
    static boolean m2189n(String str) {
        boolean z2 = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (strNextToken != null && strNextToken2 != null) {
                try {
                    int i3 = Integer.parseInt(strNextToken);
                    int i4 = Integer.parseInt(strNextToken2);
                    if (i3 > 2 || (i3 == 2 && i4 >= 1)) {
                        z2 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z2 ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z2;
    }

    /* JADX INFO: renamed from: o */
    private static void m2190o(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
