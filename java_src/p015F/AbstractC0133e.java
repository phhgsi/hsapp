package p015F;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.C0928h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p015F.AbstractC0138j;
import p112i0.AbstractC2025a;
import p164y.AbstractC2532e;
import p164y.AbstractC2535h;
import p167z.AbstractC2589v;

/* JADX INFO: renamed from: F.e */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0133e {

    /* JADX INFO: renamed from: a */
    private static final C0928h f259a = new C0928h(2);

    /* JADX INFO: renamed from: b */
    private static final Comparator f260b = new Comparator() { // from class: F.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC0133e.m371a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F.e$a */
    interface a {
        /* JADX INFO: renamed from: a */
        Cursor mo378a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F.e$b */
    static class b implements a {

        /* JADX INFO: renamed from: a */
        private final ContentProviderClient f261a;

        b(Context context, Uri uri) {
            this.f261a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p015F.AbstractC0133e.a
        /* JADX INFO: renamed from: a */
        public Cursor mo378a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f261a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e3) {
                Log.w("FontsProvider", "Unable to query the content provider", e3);
                return null;
            }
        }

        @Override // p015F.AbstractC0133e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f261a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F.e$c */
    static class c implements a {

        /* JADX INFO: renamed from: a */
        private final ContentProviderClient f262a;

        c(Context context, Uri uri) {
            this.f262a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p015F.AbstractC0133e.a
        /* JADX INFO: renamed from: a */
        public Cursor mo378a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f262a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e3) {
                Log.w("FontsProvider", "Unable to query the content provider", e3);
                return null;
            }
        }

        @Override // p015F.AbstractC0133e.a
        public void close() throws Exception {
            ContentProviderClient contentProviderClient = this.f262a;
            if (contentProviderClient != null) {
                AbstractC2532e.m12104a(contentProviderClient);
            }
        }
    }

    /* JADX INFO: renamed from: F.e$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        String f263a;

        /* JADX INFO: renamed from: b */
        String f264b;

        /* JADX INFO: renamed from: c */
        List f265c;

        d(String str, String str2, List list) {
            this.f263a = str;
            this.f264b = str2;
            this.f265c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Objects.equals(this.f263a, dVar.f263a) && Objects.equals(this.f264b, dVar.f264b) && Objects.equals(this.f265c, dVar.f265c);
        }

        public int hashCode() {
            return Objects.hash(this.f263a, this.f264b, this.f265c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m371a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b3 = bArr[i3];
            byte b4 = bArr2[i3];
            if (b3 != b4) {
                return b3 - b4;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    private static List m372b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m373c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!Arrays.equals((byte[]) list.get(i3), (byte[]) list2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private static List m374d(C0134f c0134f, Resources resources) {
        return c0134f.m380b() != null ? c0134f.m380b() : AbstractC2535h.m12109c(resources, c0134f.m381c());
    }

    /* JADX INFO: renamed from: e */
    static AbstractC0138j.a m375e(Context context, List list, CancellationSignal cancellationSignal) {
        String strM386h;
        Typeface typefaceM12319h;
        AbstractC2025a.m10210a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                C0134f c0134f = (C0134f) list.get(i3);
                if (Build.VERSION.SDK_INT < 31 || (typefaceM12319h = AbstractC2589v.m12319h((strM386h = c0134f.m386h()))) == null || AbstractC2589v.m12321j(typefaceM12319h) == null) {
                    ProviderInfo providerInfoM376f = m376f(context.getPackageManager(), c0134f, context.getResources());
                    if (providerInfoM376f == null) {
                        return AbstractC0138j.a.m404b(1, null);
                    }
                    arrayList.add(m377g(context, c0134f, providerInfoM376f.authority, cancellationSignal));
                } else {
                    arrayList.add(new AbstractC0138j.b[]{new AbstractC0138j.b(strM386h, c0134f.m387i())});
                }
            }
            return AbstractC0138j.a.m403a(0, arrayList);
        } finally {
            AbstractC2025a.m10211b();
        }
    }

    /* JADX INFO: renamed from: f */
    static ProviderInfo m376f(PackageManager packageManager, C0134f c0134f, Resources resources) {
        AbstractC2025a.m10210a("FontProvider.getProvider");
        try {
            List listM374d = m374d(c0134f, resources);
            d dVar = new d(c0134f.m383e(), c0134f.m384f(), listM374d);
            ProviderInfo providerInfo = (ProviderInfo) f259a.get(dVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String strM383e = c0134f.m383e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM383e, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strM383e);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(c0134f.m384f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strM383e + ", but package was not " + c0134f.m384f());
            }
            List listM372b = m372b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listM372b, f260b);
            for (int i3 = 0; i3 < listM374d.size(); i3++) {
                ArrayList arrayList = new ArrayList((Collection) listM374d.get(i3));
                Collections.sort(arrayList, f260b);
                if (m373c(listM372b, arrayList)) {
                    f259a.put(dVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            AbstractC2025a.m10211b();
            return null;
        } finally {
            AbstractC2025a.m10211b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2, types: [F.e$a] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static p015F.AbstractC0138j.b[] m377g(android.content.Context r16, p015F.C0134f r17, java.lang.String r18, android.os.CancellationSignal r19) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p015F.AbstractC0133e.m377g(android.content.Context, F.f, java.lang.String, android.os.CancellationSignal):F.j$b[]");
    }
}
