package p004B0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: B0.U */
/* JADX INFO: loaded from: classes.dex */
final class C0049U extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: f */
    private static final String f98f = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: g */
    static int f99g = 5;

    /* JADX INFO: renamed from: h */
    private static final a f100h;

    /* JADX INFO: renamed from: i */
    private static final a f101i;

    /* JADX INFO: renamed from: j */
    private static final a f102j;

    /* JADX INFO: renamed from: k */
    private static final a f103k;

    /* JADX INFO: renamed from: l */
    private static final a f104l;

    /* JADX INFO: renamed from: m */
    private static final List f105m;

    /* JADX INFO: renamed from: d */
    private final int f106d;

    /* JADX INFO: renamed from: e */
    private boolean f107e;

    /* JADX INFO: renamed from: B0.U$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo146a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: B0.O
            @Override // p004B0.C0049U.a
            /* JADX INFO: renamed from: a */
            public final void mo146a(SQLiteDatabase sQLiteDatabase) {
                C0049U.m147a(sQLiteDatabase);
            }
        };
        f100h = aVar;
        a aVar2 = new a() { // from class: B0.P
            @Override // p004B0.C0049U.a
            /* JADX INFO: renamed from: a */
            public final void mo146a(SQLiteDatabase sQLiteDatabase) {
                C0049U.m150d(sQLiteDatabase);
            }
        };
        f101i = aVar2;
        a aVar3 = new a() { // from class: B0.Q
            @Override // p004B0.C0049U.a
            /* JADX INFO: renamed from: a */
            public final void mo146a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f102j = aVar3;
        a aVar4 = new a() { // from class: B0.S
            @Override // p004B0.C0049U.a
            /* JADX INFO: renamed from: a */
            public final void mo146a(SQLiteDatabase sQLiteDatabase) {
                C0049U.m151g(sQLiteDatabase);
            }
        };
        f103k = aVar4;
        a aVar5 = new a() { // from class: B0.T
            @Override // p004B0.C0049U.a
            /* JADX INFO: renamed from: a */
            public final void mo146a(SQLiteDatabase sQLiteDatabase) {
                C0049U.m149c(sQLiteDatabase);
            }
        };
        f104l = aVar5;
        f105m = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    C0049U(Context context, String str, int i3) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i3);
        this.f107e = false;
        this.f106d = i3;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m147a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m149c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f98f);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m150d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m151g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: renamed from: h */
    private void m152h(SQLiteDatabase sQLiteDatabase) {
        if (this.f107e) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: renamed from: i */
    private void m153i(SQLiteDatabase sQLiteDatabase, int i3) {
        m152h(sQLiteDatabase);
        m154k(sQLiteDatabase, 0, i3);
    }

    /* JADX INFO: renamed from: k */
    private void m154k(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        List list = f105m;
        if (i4 <= list.size()) {
            while (i3 < i4) {
                ((a) f105m.get(i3)).mo146a(sQLiteDatabase);
                i3++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i3 + " to " + i4 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f107e = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m153i(sQLiteDatabase, this.f106d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m153i(sQLiteDatabase, i4);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m152h(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        m152h(sQLiteDatabase);
        m154k(sQLiteDatabase, i3, i4);
    }
}
