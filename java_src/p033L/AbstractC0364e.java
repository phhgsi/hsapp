package p033L;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p024I.AbstractC0206c;
import p024I.AbstractC0211h;
import p027J.AbstractC0268W;
import p027J.C0279d;

/* JADX INFO: renamed from: L.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0364e {

    /* JADX INFO: renamed from: L.e$a */
    class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f1480a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z2, c cVar) {
            super(inputConnection, z2);
            this.f1480a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
            if (this.f1480a.mo1339a(C0365f.m1345f(inputContentInfo), i3, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i3, bundle);
        }
    }

    /* JADX INFO: renamed from: L.e$b */
    class b extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f1481a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z2, c cVar) {
            super(inputConnection, z2);
            this.f1481a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (AbstractC0364e.m1344e(str, bundle, this.f1481a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* JADX INFO: renamed from: L.e$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        boolean mo1339a(C0365f c0365f, int i3, Bundle bundle);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m1340a(View view, C0365f c0365f, int i3, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i3 & 1) != 0) {
            try {
                c0365f.m1349d();
                Parcelable parcelable = (Parcelable) c0365f.m1350e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e3) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e3);
                return false;
            }
        }
        return AbstractC0268W.m756Y(view, new C0279d.a(new ClipData(c0365f.m1347b(), new ClipData.Item(c0365f.m1346a())), 2).m949d(c0365f.m1348c()).m947b(bundle).m946a()) == null;
    }

    /* JADX INFO: renamed from: b */
    private static c m1341b(final View view) {
        AbstractC0211h.m610g(view);
        return new c() { // from class: L.d
            @Override // p033L.AbstractC0364e.c
            /* JADX INFO: renamed from: a */
            public final boolean mo1339a(C0365f c0365f, int i3, Bundle bundle) {
                return AbstractC0364e.m1340a(view, c0365f, i3, bundle);
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public static InputConnection m1342c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m1343d(inputConnection, editorInfo, m1341b(view));
    }

    /* JADX INFO: renamed from: d */
    public static InputConnection m1343d(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        AbstractC0206c.m599d(inputConnection, "inputConnection must be non-null");
        AbstractC0206c.m599d(editorInfo, "editorInfo must be non-null");
        AbstractC0206c.m599d(cVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, cVar) : AbstractC0362c.m1330a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: e */
    static boolean m1344e(String str, Bundle bundle, c cVar) throws Throwable {
        boolean z2;
        ResultReceiver resultReceiver;
        ?? Mo1339a = 0;
        Mo1339a = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z2 = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z2 = true;
        }
        try {
            ResultReceiver resultReceiver2 = (ResultReceiver) bundle.getParcelable(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i3 = bundle.getInt(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z2 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    Mo1339a = cVar.mo1339a(new C0365f(uri, clipDescription, uri2), i3, bundle2);
                }
                if (resultReceiver2 != 0) {
                    resultReceiver2.send(Mo1339a, null);
                }
                return Mo1339a;
            } catch (Throwable th) {
                th = th;
                resultReceiver = resultReceiver2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = null;
        }
    }
}
