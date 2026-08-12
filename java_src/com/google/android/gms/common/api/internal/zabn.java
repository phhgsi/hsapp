package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class zabn implements Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ zabq zab;

    zabn(zabq zabqVar, int i3) {
        this.zab = zabqVar;
        this.zaa = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaI(this.zaa);
    }
}
