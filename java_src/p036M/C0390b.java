package p036M;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: renamed from: M.b */
/* JADX INFO: loaded from: classes.dex */
class C0390b extends Filter {

    /* JADX INFO: renamed from: a */
    a f1518a;

    /* JADX INFO: renamed from: M.b$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo1379a(Cursor cursor);

        /* JADX INFO: renamed from: b */
        Cursor mo1380b();

        /* JADX INFO: renamed from: c */
        CharSequence mo1381c(Cursor cursor);

        /* JADX INFO: renamed from: d */
        Cursor mo1388d(CharSequence charSequence);
    }

    C0390b(a aVar) {
        this.f1518a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f1518a.mo1381c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorMo1388d = this.f1518a.mo1388d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorMo1388d != null) {
            filterResults.count = cursorMo1388d.getCount();
            filterResults.values = cursorMo1388d;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorMo1380b = this.f1518a.mo1380b();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorMo1380b) {
            return;
        }
        this.f1518a.mo1379a((Cursor) obj);
    }
}
