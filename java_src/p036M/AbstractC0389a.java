package p036M;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p036M.C0390b;

/* JADX INFO: renamed from: M.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0389a extends BaseAdapter implements Filterable, C0390b.a {

    /* JADX INFO: renamed from: a */
    protected boolean f1508a;

    /* JADX INFO: renamed from: b */
    protected boolean f1509b;

    /* JADX INFO: renamed from: c */
    protected Cursor f1510c;

    /* JADX INFO: renamed from: d */
    protected Context f1511d;

    /* JADX INFO: renamed from: e */
    protected int f1512e;

    /* JADX INFO: renamed from: f */
    protected a f1513f;

    /* JADX INFO: renamed from: g */
    protected DataSetObserver f1514g;

    /* JADX INFO: renamed from: h */
    protected C0390b f1515h;

    /* JADX INFO: renamed from: M.a$a */
    private class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            AbstractC0389a.this.m1386i();
        }
    }

    /* JADX INFO: renamed from: M.a$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0389a abstractC0389a = AbstractC0389a.this;
            abstractC0389a.f1508a = true;
            abstractC0389a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0389a abstractC0389a = AbstractC0389a.this;
            abstractC0389a.f1508a = false;
            abstractC0389a.notifyDataSetInvalidated();
        }
    }

    public AbstractC0389a(Context context, Cursor cursor, boolean z2) {
        m1383f(context, cursor, z2 ? 1 : 2);
    }

    @Override // p036M.C0390b.a
    /* JADX INFO: renamed from: a */
    public void mo1379a(Cursor cursor) {
        Cursor cursorM1387j = m1387j(cursor);
        if (cursorM1387j != null) {
            cursorM1387j.close();
        }
    }

    @Override // p036M.C0390b.a
    /* JADX INFO: renamed from: b */
    public Cursor mo1380b() {
        return this.f1510c;
    }

    @Override // p036M.C0390b.a
    /* JADX INFO: renamed from: c */
    public abstract CharSequence mo1381c(Cursor cursor);

    /* JADX INFO: renamed from: e */
    public abstract void mo1382e(View view, Context context, Cursor cursor);

    /* JADX INFO: renamed from: f */
    void m1383f(Context context, Cursor cursor, int i3) {
        if ((i3 & 1) == 1) {
            i3 |= 2;
            this.f1509b = true;
        } else {
            this.f1509b = false;
        }
        boolean z2 = cursor != null;
        this.f1510c = cursor;
        this.f1508a = z2;
        this.f1511d = context;
        this.f1512e = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i3 & 2) == 2) {
            this.f1513f = new a();
            this.f1514g = new b();
        } else {
            this.f1513f = null;
            this.f1514g = null;
        }
        if (z2) {
            a aVar = this.f1513f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1514g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract View mo1384g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f1508a || (cursor = this.f1510c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f1508a) {
            return null;
        }
        this.f1510c.moveToPosition(i3);
        if (view == null) {
            view = mo1384g(this.f1511d, this.f1510c, viewGroup);
        }
        mo1382e(view, this.f1511d, this.f1510c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1515h == null) {
            this.f1515h = new C0390b(this);
        }
        return this.f1515h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i3) {
        Cursor cursor;
        if (!this.f1508a || (cursor = this.f1510c) == null) {
            return null;
        }
        cursor.moveToPosition(i3);
        return this.f1510c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i3) {
        Cursor cursor;
        if (this.f1508a && (cursor = this.f1510c) != null && cursor.moveToPosition(i3)) {
            return this.f1510c.getLong(this.f1512e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f1508a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f1510c.moveToPosition(i3)) {
            if (view == null) {
                view = mo1385h(this.f1511d, this.f1510c, viewGroup);
            }
            mo1382e(view, this.f1511d, this.f1510c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i3);
    }

    /* JADX INFO: renamed from: h */
    public abstract View mo1385h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* JADX INFO: renamed from: i */
    protected void m1386i() {
        Cursor cursor;
        if (!this.f1509b || (cursor = this.f1510c) == null || cursor.isClosed()) {
            return;
        }
        this.f1508a = this.f1510c.requery();
    }

    /* JADX INFO: renamed from: j */
    public Cursor m1387j(Cursor cursor) {
        Cursor cursor2 = this.f1510c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f1513f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1514g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1510c = cursor;
        if (cursor == null) {
            this.f1512e = -1;
            this.f1508a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        a aVar2 = this.f1513f;
        if (aVar2 != null) {
            cursor.registerContentObserver(aVar2);
        }
        DataSetObserver dataSetObserver2 = this.f1514g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f1512e = cursor.getColumnIndexOrThrow("_id");
        this.f1508a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
