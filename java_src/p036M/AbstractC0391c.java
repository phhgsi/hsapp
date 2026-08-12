package p036M;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: M.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0391c extends AbstractC0389a {

    /* JADX INFO: renamed from: i */
    private int f1519i;

    /* JADX INFO: renamed from: j */
    private int f1520j;

    /* JADX INFO: renamed from: k */
    private LayoutInflater f1521k;

    public AbstractC0391c(Context context, int i3, Cursor cursor, boolean z2) {
        super(context, cursor, z2);
        this.f1520j = i3;
        this.f1519i = i3;
        this.f1521k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p036M.AbstractC0389a
    /* JADX INFO: renamed from: g */
    public View mo1384g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1521k.inflate(this.f1520j, viewGroup, false);
    }

    @Override // p036M.AbstractC0389a
    /* JADX INFO: renamed from: h */
    public View mo1385h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1521k.inflate(this.f1519i, viewGroup, false);
    }
}
