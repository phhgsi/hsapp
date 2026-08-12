package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.C1015f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p015F.C0134f;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1013d {

    /* JADX INFO: renamed from: androidx.emoji2.text.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final b f4813a;

        public a(b bVar) {
            this.f4813a = bVar == null ? m4515e() : bVar;
        }

        /* JADX INFO: renamed from: a */
        private C1015f.c m4512a(Context context, C0134f c0134f) {
            if (c0134f == null) {
                return null;
            }
            return new C1020k(context, c0134f);
        }

        /* JADX INFO: renamed from: b */
        private List m4513b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* JADX INFO: renamed from: d */
        private C0134f m4514d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C0134f(str, str2, "emojicompat-emoji-font", m4513b(this.f4813a.mo4521b(packageManager, str2)));
        }

        /* JADX INFO: renamed from: e */
        private static b m4515e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new c();
        }

        /* JADX INFO: renamed from: f */
        private boolean m4516f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* JADX INFO: renamed from: g */
        private ProviderInfo m4517g(PackageManager packageManager) {
            Iterator it = this.f4813a.mo4522c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoMo4520a = this.f4813a.mo4520a((ResolveInfo) it.next());
                if (m4516f(providerInfoMo4520a)) {
                    return providerInfoMo4520a;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public C1015f.c m4518c(Context context) {
            return m4512a(context, m4519h(context));
        }

        /* JADX INFO: renamed from: h */
        C0134f m4519h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            AbstractC0211h.m611h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoM4517g = m4517g(packageManager);
            if (providerInfoM4517g == null) {
                return null;
            }
            try {
                return m4514d(providerInfoM4517g, packageManager);
            } catch (PackageManager.NameNotFoundException e3) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e3);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public abstract ProviderInfo mo4520a(ResolveInfo resolveInfo);

        /* JADX INFO: renamed from: b */
        public Signature[] mo4521b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* JADX INFO: renamed from: c */
        public abstract List mo4522c(PackageManager packageManager, Intent intent, int i3);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$c */
    public static class c extends b {
        @Override // androidx.emoji2.text.AbstractC1013d.b
        /* JADX INFO: renamed from: a */
        public ProviderInfo mo4520a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.AbstractC1013d.b
        /* JADX INFO: renamed from: c */
        public List mo4522c(PackageManager packageManager, Intent intent, int i3) {
            return packageManager.queryIntentContentProviders(intent, i3);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d */
    public static class d extends c {
        @Override // androidx.emoji2.text.AbstractC1013d.b
        /* JADX INFO: renamed from: b */
        public Signature[] mo4521b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1020k m4511a(Context context) {
        return (C1020k) new a(null).m4518c(context);
    }
}
