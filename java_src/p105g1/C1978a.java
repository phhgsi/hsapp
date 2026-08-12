package p105g1;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import p109h1.AbstractC1986a;

/* JADX INFO: renamed from: g1.a */
/* JADX INFO: loaded from: classes.dex */
public class C1978a extends ApiException {
    public C1978a(int i3) {
        super(new Status(i3, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i3), AbstractC1986a.m10093a(i3))));
        if (i3 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
