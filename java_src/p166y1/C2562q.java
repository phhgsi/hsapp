package p166y1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: y1.q */
/* JADX INFO: loaded from: classes.dex */
class C2562q {

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f11863a;

    public C2562q(Context context, String str) {
        this.f11863a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m12213a() {
        try {
            long j3 = this.f11863a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f11863a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f11863a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f11863a.edit().putStringSet(key, hashSet).putLong("fire-count", j3 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    private synchronized String m12214d(long j3) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j3).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j3));
    }

    /* JADX INFO: renamed from: e */
    private synchronized String m12215e(String str) {
        for (Map.Entry<String, ?> entry : this.f11863a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private synchronized void m12216h(String str) {
        try {
            String strM12215e = m12215e(str);
            if (strM12215e == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f11863a.getStringSet(strM12215e, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f11863a.edit().remove(strM12215e).commit();
            } else {
                this.f11863a.edit().putStringSet(strM12215e, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    private synchronized void m12217m(String str, String str2) {
        m12216h(str2);
        HashSet hashSet = new HashSet(this.f11863a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f11863a.edit().putStringSet(str, hashSet).commit();
    }

    /* JADX INFO: renamed from: b */
    synchronized void m12218b() {
        try {
            SharedPreferences.Editor editorEdit = this.f11863a.edit();
            int i3 = 0;
            for (Map.Entry<String, ?> entry : this.f11863a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strM12214d = m12214d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strM12214d)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strM12214d);
                        i3++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i3 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i3);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    synchronized List m12219c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f11863a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(m12214d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(AbstractC2563r.m12226a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            m12225l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    synchronized boolean m12220f(long j3, long j4) {
        return m12214d(j3).equals(m12214d(j4));
    }

    /* JADX INFO: renamed from: g */
    synchronized void m12221g() {
        String strM12214d = m12214d(System.currentTimeMillis());
        this.f11863a.edit().putString("last-used-date", strM12214d).commit();
        m12216h(strM12214d);
    }

    /* JADX INFO: renamed from: i */
    synchronized boolean m12222i(long j3) {
        return m12223j("fire-global", j3);
    }

    /* JADX INFO: renamed from: j */
    synchronized boolean m12223j(String str, long j3) {
        if (!this.f11863a.contains(str)) {
            this.f11863a.edit().putLong(str, j3).commit();
            return true;
        }
        if (m12220f(this.f11863a.getLong(str, -1L), j3)) {
            return false;
        }
        this.f11863a.edit().putLong(str, j3).commit();
        return true;
    }

    /* JADX INFO: renamed from: k */
    synchronized void m12224k(long j3, String str) {
        String strM12214d = m12214d(j3);
        if (this.f11863a.getString("last-used-date", "").equals(strM12214d)) {
            String strM12215e = m12215e(strM12214d);
            if (strM12215e == null) {
                return;
            }
            if (strM12215e.equals(str)) {
                return;
            }
            m12217m(str, strM12214d);
            return;
        }
        long j4 = this.f11863a.getLong("fire-count", 0L);
        if (j4 + 1 == 30) {
            m12213a();
            j4 = this.f11863a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f11863a.getStringSet(str, new HashSet()));
        hashSet.add(strM12214d);
        this.f11863a.edit().putStringSet(str, hashSet).putLong("fire-count", j4 + 1).putString("last-used-date", strM12214d).commit();
    }

    /* JADX INFO: renamed from: l */
    synchronized void m12225l(long j3) {
        this.f11863a.edit().putLong("fire-global", j3).commit();
    }
}
