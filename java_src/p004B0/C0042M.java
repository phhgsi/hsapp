package p004B0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007C0.C0085a;
import p007C0.InterfaceC0086b;
import p010D0.InterfaceC0092a;
import p013E0.AbstractC0126a;
import p032K1.InterfaceC0359a;
import p144r0.C2366c;
import p144r0.EnumC2368e;
import p150t0.AbstractC2433i;
import p150t0.AbstractC2439o;
import p150t0.C2432h;
import p159w0.C2487a;
import p159w0.C2488b;
import p159w0.C2489c;
import p159w0.C2490d;
import p159w0.C2491e;
import p159w0.C2492f;
import p162x0.AbstractC2523a;

/* JADX INFO: renamed from: B0.M */
/* JADX INFO: loaded from: classes.dex */
public class C0042M implements InterfaceC0054d, InterfaceC0086b, InterfaceC0053c, AutoCloseable {

    /* JADX INFO: renamed from: i */
    private static final C2366c f85i = C2366c.m11213b("proto");

    /* JADX INFO: renamed from: d */
    private final C0049U f86d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0092a f87e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0092a f88f;

    /* JADX INFO: renamed from: g */
    private final AbstractC0055e f89g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC0359a f90h;

    /* JADX INFO: renamed from: B0.M$b */
    interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0.M$c */
    static class c {

        /* JADX INFO: renamed from: a */
        final String f91a;

        /* JADX INFO: renamed from: b */
        final String f92b;

        private c(String str, String str2) {
            this.f91a = str;
            this.f92b = str2;
        }
    }

    /* JADX INFO: renamed from: B0.M$d */
    interface d {
        /* JADX INFO: renamed from: a */
        Object mo82a();
    }

    C0042M(InterfaceC0092a interfaceC0092a, InterfaceC0092a interfaceC0092a2, AbstractC0055e abstractC0055e, C0049U c0049u, InterfaceC0359a interfaceC0359a) {
        this.f86d = c0049u;
        this.f87e = interfaceC0092a;
        this.f88f = interfaceC0092a2;
        this.f89g = abstractC0055e;
        this.f90h = interfaceC0359a;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Object m83A(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Long m84C(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Object m85D(Throwable th) {
        throw new C0085a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ Object m86E(String str, C2489c.b bVar, long j3, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) m114h0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo531a())}), new b() { // from class: B0.v
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j3 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo531a())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.mo531a()));
        contentValues.put("events_dropped_count", Long.valueOf(j3));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Object m87F(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j3 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j3));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j3), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Integer m88G(final C0042M c0042m, long j3, SQLiteDatabase sQLiteDatabase) {
        c0042m.getClass();
        String[] strArr = {String.valueOf(j3)};
        m114h0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: B0.q
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m118p(this.f138a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Object m89H(C0042M c0042m, List list, AbstractC2439o abstractC2439o, Cursor cursor) {
        c0042m.getClass();
        while (cursor.moveToNext()) {
            long j3 = cursor.getLong(0);
            boolean z2 = cursor.getInt(7) != 0;
            AbstractC2433i.a aVarMo11681k = AbstractC2433i.m11709a().mo11680j(cursor.getString(1)).mo11679i(cursor.getLong(2)).mo11681k(cursor.getLong(3));
            if (z2) {
                aVarMo11681k.mo11678h(new C2432h(m110f0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarMo11681k.mo11678h(new C2432h(m110f0(cursor.getString(4)), c0042m.m108d0(j3)));
            }
            if (!cursor.isNull(6)) {
                aVarMo11681k.mo11677g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC0061k.m192a(j3, abstractC2439o, aVarMo11681k.mo11674d()));
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ Object m90I(C0042M c0042m, SQLiteDatabase sQLiteDatabase) {
        c0042m.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c0042m.f87e.mo259a()).execute();
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ C2487a m91J(final C0042M c0042m, String str, final Map map, final C2487a.a aVar, SQLiteDatabase sQLiteDatabase) {
        c0042m.getClass();
        return (C2487a) m114h0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: B0.A
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m124w(this.f72a, map, aVar, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ Long m92K(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ C2492f m93L(final long j3, SQLiteDatabase sQLiteDatabase) {
        return (C2492f) m114h0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: B0.D
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m111g(j3, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    private C2489c.b m94M(int i3) {
        C2489c.b bVar = C2489c.b.REASON_UNKNOWN;
        if (i3 == bVar.mo531a()) {
            return bVar;
        }
        C2489c.b bVar2 = C2489c.b.MESSAGE_TOO_OLD;
        if (i3 == bVar2.mo531a()) {
            return bVar2;
        }
        C2489c.b bVar3 = C2489c.b.CACHE_FULL;
        if (i3 == bVar3.mo531a()) {
            return bVar3;
        }
        C2489c.b bVar4 = C2489c.b.PAYLOAD_TOO_BIG;
        if (i3 == bVar4.mo531a()) {
            return bVar4;
        }
        C2489c.b bVar5 = C2489c.b.MAX_RETRIES_REACHED;
        if (i3 == bVar5.mo531a()) {
            return bVar5;
        }
        C2489c.b bVar6 = C2489c.b.INVALID_PAYLOD;
        if (i3 == bVar6.mo531a()) {
            return bVar6;
        }
        C2489c.b bVar7 = C2489c.b.SERVER_ERROR;
        if (i3 == bVar7.mo531a()) {
            return bVar7;
        }
        AbstractC2523a.m12054b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i3));
        return bVar;
    }

    /* JADX INFO: renamed from: N */
    private void m95N(final SQLiteDatabase sQLiteDatabase) {
        m109e0(new d() { // from class: B0.l
            @Override // p004B0.C0042M.d
            /* JADX INFO: renamed from: a */
            public final Object mo82a() {
                return C0042M.m83A(sQLiteDatabase);
            }
        }, new b() { // from class: B0.w
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m85D((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    private long m96O(SQLiteDatabase sQLiteDatabase, AbstractC2439o abstractC2439o) {
        Long lM101V = m101V(sQLiteDatabase, abstractC2439o);
        if (lM101V != null) {
            return lM101V.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC2439o.mo11693b());
        contentValues.put("priority", Integer.valueOf(AbstractC0126a.m363a(abstractC2439o.mo11695d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC2439o.mo11694c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC2439o.mo11694c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* JADX INFO: renamed from: R */
    private C2488b m97R() {
        return C2488b.m11830b().m11833b(C2491e.m11846c().m11850b(m128P()).m11851c(AbstractC0055e.f124a.mo162f()).m11849a()).m11832a();
    }

    /* JADX INFO: renamed from: S */
    private long m98S() {
        return m129Q().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* JADX INFO: renamed from: T */
    private long m99T() {
        return m129Q().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* JADX INFO: renamed from: U */
    private C2492f m100U() {
        final long jMo259a = this.f87e.mo259a();
        return (C2492f) m130W(new b() { // from class: B0.C
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m93L(jMo259a, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    private Long m101V(SQLiteDatabase sQLiteDatabase, AbstractC2439o abstractC2439o) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC2439o.mo11693b(), String.valueOf(AbstractC0126a.m363a(abstractC2439o.mo11695d()))));
        if (abstractC2439o.mo11694c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC2439o.mo11694c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m114h0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: B0.y
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m84C((Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    private boolean m102X() {
        return m98S() * m99T() >= this.f89g.mo162f();
    }

    /* JADX INFO: renamed from: Y */
    private List m103Y(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC0061k abstractC0061k = (AbstractC0061k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC0061k.mo170c()))) {
                AbstractC2433i.a aVarM11714l = abstractC0061k.mo169b().m11714l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC0061k.mo170c()))) {
                    aVarM11714l.m11717c(cVar.f91a, cVar.f92b);
                }
                listIterator.set(AbstractC0061k.m192a(abstractC0061k.mo170c(), abstractC0061k.mo171d(), aVarM11714l.mo11674d()));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: Z */
    private List m104Z(SQLiteDatabase sQLiteDatabase, final AbstractC2439o abstractC2439o, int i3) {
        final ArrayList arrayList = new ArrayList();
        Long lM101V = m101V(sQLiteDatabase, abstractC2439o);
        if (lM101V == null) {
            return arrayList;
        }
        m114h0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lM101V.toString()}, null, null, null, String.valueOf(i3)), new b() { // from class: B0.u
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m89H(this.f144a, arrayList, abstractC2439o, (Cursor) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: a0 */
    private Map m105a0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i3 = 0; i3 < list.size(); i3++) {
            sb.append(((AbstractC0061k) list.get(i3)).mo170c());
            if (i3 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m114h0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new b() { // from class: B0.x
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m87F(map, (Cursor) obj);
            }
        });
        return map;
    }

    /* JADX INFO: renamed from: b0 */
    private static byte[] m106b0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* JADX INFO: renamed from: c0 */
    private void m107c0(C2487a.a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.m11825a(C2490d.m11840c().m11845c((String) entry.getKey()).m11844b((List) entry.getValue()).m11843a());
        }
    }

    /* JADX INFO: renamed from: d0 */
    private byte[] m108d0(long j3) {
        return (byte[]) m114h0(m129Q().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j3)}, null, null, "sequence_num"), new b() { // from class: B0.B
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m122u((Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    private Object m109e0(d dVar, b bVar) {
        long jMo259a = this.f88f.mo259a();
        while (true) {
            try {
                return dVar.mo82a();
            } catch (SQLiteDatabaseLockedException e3) {
                if (this.f88f.mo259a() >= ((long) this.f89g.mo158b()) + jMo259a) {
                    return bVar.apply(e3);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    private static C2366c m110f0(String str) {
        return str == null ? f85i : C2366c.m11213b(str);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C2492f m111g(long j3, Cursor cursor) {
        cursor.moveToNext();
        return C2492f.m11852c().m11857c(cursor.getLong(0)).m11856b(j3).m11855a();
    }

    /* JADX INFO: renamed from: g0 */
    private static String m112g0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC0061k) it.next()).mo170c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ List m113h(C0042M c0042m, AbstractC2439o abstractC2439o, SQLiteDatabase sQLiteDatabase) {
        List listM104Z = c0042m.m104Z(sQLiteDatabase, abstractC2439o, c0042m.f89g.mo160d());
        for (EnumC2368e enumC2368e : EnumC2368e.values()) {
            if (enumC2368e != abstractC2439o.mo11695d()) {
                int iMo160d = c0042m.f89g.mo160d() - listM104Z.size();
                if (iMo160d <= 0) {
                    break;
                }
                listM104Z.addAll(c0042m.m104Z(sQLiteDatabase, abstractC2439o.m11728f(enumC2368e), iMo160d));
            }
        }
        return c0042m.m103Y(listM104Z, c0042m.m105a0(sQLiteDatabase, listM104Z));
    }

    /* JADX INFO: renamed from: h0 */
    static Object m114h0(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ List m115i(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC2439o.m11726a().mo11697b(cursor.getString(1)).mo11699d(AbstractC0126a.m364b(cursor.getInt(2))).mo11698c(m106b0(cursor.getString(3))).mo11696a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m116k(C0042M c0042m, Cursor cursor) {
        c0042m.getClass();
        while (cursor.moveToNext()) {
            c0042m.mo132b(cursor.getInt(0), C2489c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ SQLiteDatabase m117l(Throwable th) {
        throw new C0085a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Object m118p(C0042M c0042m, Cursor cursor) {
        c0042m.getClass();
        while (cursor.moveToNext()) {
            c0042m.mo132b(cursor.getInt(0), C2489c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m119q(final C0042M c0042m, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        c0042m.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        m114h0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: B0.t
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m116k(this.f143a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Boolean m120r(C0042M c0042m, AbstractC2439o abstractC2439o, SQLiteDatabase sQLiteDatabase) {
        Long lM101V = c0042m.m101V(sQLiteDatabase, abstractC2439o);
        return lM101V == null ? Boolean.FALSE : (Boolean) m114h0(c0042m.m129Q().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM101V.toString()}), new b() { // from class: B0.s
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Object m121s(long j3, AbstractC2439o abstractC2439o, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j3));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC2439o.mo11693b(), String.valueOf(AbstractC0126a.m363a(abstractC2439o.mo11695d()))}) < 1) {
            contentValues.put("backend_name", abstractC2439o.mo11693b());
            contentValues.put("priority", Integer.valueOf(AbstractC0126a.m363a(abstractC2439o.mo11695d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ byte[] m122u(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ List m123v(SQLiteDatabase sQLiteDatabase) {
        return (List) m114h0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: B0.J
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m115i((Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C2487a m124w(C0042M c0042m, Map map, C2487a.a aVar, Cursor cursor) {
        c0042m.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C2489c.b bVarM94M = c0042m.m94M(cursor.getInt(1));
            long j3 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C2489c.m11834c().m11839c(bVarM94M).m11838b(j3).m11837a());
        }
        c0042m.m107c0(aVar, map);
        aVar.m11829e(c0042m.m100U());
        aVar.m11828d(c0042m.m97R());
        aVar.m11827c((String) c0042m.f90h.get());
        return aVar.m11826b();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Long m126y(C0042M c0042m, AbstractC2433i abstractC2433i, AbstractC2439o abstractC2439o, SQLiteDatabase sQLiteDatabase) {
        if (c0042m.m102X()) {
            c0042m.mo132b(1L, C2489c.b.CACHE_FULL, abstractC2433i.mo11672j());
            return -1L;
        }
        long jM96O = c0042m.m96O(sQLiteDatabase, abstractC2439o);
        int iMo161e = c0042m.f89g.mo161e();
        byte[] bArrM11707a = abstractC2433i.mo11670e().m11707a();
        boolean z2 = bArrM11707a.length <= iMo161e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jM96O));
        contentValues.put("transport_name", abstractC2433i.mo11672j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC2433i.mo11671f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC2433i.mo11673k()));
        contentValues.put("payload_encoding", abstractC2433i.mo11670e().m11708b().m11214a());
        contentValues.put("code", abstractC2433i.mo11669d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z2));
        contentValues.put("payload", z2 ? bArrM11707a : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z2) {
            int iCeil = (int) Math.ceil(((double) bArrM11707a.length) / ((double) iMo161e));
            for (int i3 = 1; i3 <= iCeil; i3++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrM11707a, (i3 - 1) * iMo161e, Math.min(i3 * iMo161e, bArrM11707a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i3));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : abstractC2433i.m11713i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry.getKey());
            contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    @Override // p004B0.InterfaceC0054d
    /* JADX INFO: renamed from: B */
    public void mo127B(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m112g0(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m130W(new b() { // from class: B0.K
                @Override // p004B0.C0042M.b
                public final Object apply(Object obj) {
                    return C0042M.m119q(this.f80a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    long m128P() {
        return m98S() * m99T();
    }

    /* JADX INFO: renamed from: Q */
    SQLiteDatabase m129Q() {
        final C0049U c0049u = this.f86d;
        Objects.requireNonNull(c0049u);
        return (SQLiteDatabase) m109e0(new d() { // from class: B0.E
            @Override // p004B0.C0042M.d
            /* JADX INFO: renamed from: a */
            public final Object mo82a() {
                return c0049u.getWritableDatabase();
            }
        }, new b() { // from class: B0.F
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m117l((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    Object m130W(b bVar) {
        SQLiteDatabase sQLiteDatabaseM129Q = m129Q();
        sQLiteDatabaseM129Q.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseM129Q);
            sQLiteDatabaseM129Q.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM129Q.endTransaction();
        }
    }

    @Override // p004B0.InterfaceC0053c
    /* JADX INFO: renamed from: a */
    public C2487a mo131a() {
        final C2487a.a aVarM11819e = C2487a.m11819e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C2487a) m130W(new b() { // from class: B0.r
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m91J(this.f139a, str, map, aVarM11819e, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p004B0.InterfaceC0053c
    /* JADX INFO: renamed from: b */
    public void mo132b(final long j3, final C2489c.b bVar, final String str) {
        m130W(new b() { // from class: B0.p
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m86E(str, bVar, j3, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p004B0.InterfaceC0053c
    /* JADX INFO: renamed from: c */
    public void mo133c() {
        m130W(new b() { // from class: B0.o
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m90I(this.f134a, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f86d.close();
    }

    @Override // p007C0.InterfaceC0086b
    /* JADX INFO: renamed from: d */
    public Object mo134d(InterfaceC0086b.a aVar) {
        SQLiteDatabase sQLiteDatabaseM129Q = m129Q();
        m95N(sQLiteDatabaseM129Q);
        try {
            Object objMo56a = aVar.mo56a();
            sQLiteDatabaseM129Q.setTransactionSuccessful();
            return objMo56a;
        } finally {
            sQLiteDatabaseM129Q.endTransaction();
        }
    }

    @Override // p004B0.InterfaceC0054d
    /* JADX INFO: renamed from: e */
    public int mo135e() {
        final long jMo259a = this.f87e.mo259a() - this.f89g.mo159c();
        return ((Integer) m130W(new b() { // from class: B0.I
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m88G(this.f78a, jMo259a, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // p004B0.InterfaceC0054d
    /* JADX INFO: renamed from: f */
    public void mo136f(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            m129Q().compileStatement("DELETE FROM events WHERE _id in " + m112g0(iterable)).execute();
        }
    }

    @Override // p004B0.InterfaceC0054d
    /* JADX INFO: renamed from: j */
    public AbstractC0061k mo137j(final AbstractC2439o abstractC2439o, final AbstractC2433i abstractC2433i) {
        AbstractC2523a.m12055c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC2439o.mo11695d(), abstractC2433i.mo11672j(), abstractC2439o.mo11693b());
        long jLongValue = ((Long) m130W(new b() { // from class: B0.z
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m126y(this.f148a, abstractC2433i, abstractC2439o, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC0061k.m192a(jLongValue, abstractC2439o, abstractC2433i);
    }

    @Override // p004B0.InterfaceC0054d
    /* JADX INFO: renamed from: m */
    public void mo138m(final AbstractC2439o abstractC2439o, final long j3) {
        m130W(new b() { // from class: B0.n
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m121s(j3, abstractC2439o, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p004B0.InterfaceC0054d
    /* JADX INFO: renamed from: n */
    public Iterable mo139n() {
        return (Iterable) m130W(new b() { // from class: B0.G
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m123v((SQLiteDatabase) obj);
            }
        });
    }

    @Override // p004B0.InterfaceC0054d
    /* JADX INFO: renamed from: o */
    public boolean mo140o(final AbstractC2439o abstractC2439o) {
        return ((Boolean) m130W(new b() { // from class: B0.m
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m120r(this.f130a, abstractC2439o, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // p004B0.InterfaceC0054d
    /* JADX INFO: renamed from: t */
    public long mo141t(AbstractC2439o abstractC2439o) {
        return ((Long) m114h0(m129Q().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC2439o.mo11693b(), String.valueOf(AbstractC0126a.m363a(abstractC2439o.mo11695d()))}), new b() { // from class: B0.H
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m92K((Cursor) obj);
            }
        })).longValue();
    }

    @Override // p004B0.InterfaceC0054d
    /* JADX INFO: renamed from: z */
    public Iterable mo142z(final AbstractC2439o abstractC2439o) {
        return (Iterable) m130W(new b() { // from class: B0.L
            @Override // p004B0.C0042M.b
            public final Object apply(Object obj) {
                return C0042M.m113h(this.f83a, abstractC2439o, (SQLiteDatabase) obj);
            }
        });
    }
}
