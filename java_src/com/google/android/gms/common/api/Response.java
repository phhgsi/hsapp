package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    protected T getResult() {
        return (T) this.zza;
    }

    public void setResult(T t2) {
        this.zza = t2;
    }

    protected Response(T t2) {
        this.zza = t2;
    }
}
