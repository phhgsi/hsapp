package co.median.android;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AbstractActivityC0748d;

/* JADX INFO: loaded from: classes.dex */
public class AppLinksActivity extends AbstractActivityC0748d {
    /* JADX INFO: renamed from: w0 */
    private void m6681w0() {
        Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
        if (getIntent().getData() != null) {
            intent.setData(getIntent().getData());
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(872415232);
            intent.putExtra("source", "app_links");
        }
        startActivity(intent);
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1080h, androidx.activity.ComponentActivity, p161x.AbstractActivityC2508g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m6681w0();
    }
}
