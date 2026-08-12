package p161x;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.AbstractC0966b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: x.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2522u implements Iterable {

    /* JADX INFO: renamed from: d */
    private final ArrayList f11787d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final Context f11788e;

    /* JADX INFO: renamed from: x.u$a */
    public interface a {
        /* JADX INFO: renamed from: t */
        Intent mo2807t();
    }

    private C2522u(Context context) {
        this.f11788e = context;
    }

    /* JADX INFO: renamed from: e */
    public static C2522u m12047e(Context context) {
        return new C2522u(context);
    }

    /* JADX INFO: renamed from: b */
    public C2522u m12048b(Intent intent) {
        this.f11787d.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public C2522u m12049c(Activity activity) {
        Intent intentMo2807t = activity instanceof a ? ((a) activity).mo2807t() : null;
        if (intentMo2807t == null) {
            intentMo2807t = AbstractC2511j.m11926a(activity);
        }
        if (intentMo2807t != null) {
            ComponentName component = intentMo2807t.getComponent();
            if (component == null) {
                component = intentMo2807t.resolveActivity(this.f11788e.getPackageManager());
            }
            m12050d(component);
            m12048b(intentMo2807t);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C2522u m12050d(ComponentName componentName) {
        int size = this.f11787d.size();
        try {
            Intent intentM11927b = AbstractC2511j.m11927b(this.f11788e, componentName);
            while (intentM11927b != null) {
                this.f11787d.add(size, intentM11927b);
                intentM11927b = AbstractC2511j.m11927b(this.f11788e, intentM11927b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e3) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e3);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m12051f() {
        m12052g(null);
    }

    /* JADX INFO: renamed from: g */
    public void m12052g(Bundle bundle) {
        if (this.f11787d.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f11787d.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (AbstractC0966b.startActivities(this.f11788e, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f11788e.startActivity(intent);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f11787d.iterator();
    }
}
