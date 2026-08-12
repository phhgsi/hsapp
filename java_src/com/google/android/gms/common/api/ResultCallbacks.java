package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r2) {
        Status status = r2.getStatus();
        if (status.isSuccess()) {
            onSuccess(r2);
            return;
        }
        onFailure(status);
        if (r2 instanceof Releasable) {
            try {
                ((Releasable) r2).release();
            } catch (RuntimeException e3) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r2)), e3);
            }
        }
    }

    public abstract void onSuccess(R r2);
}
