package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p027J.AbstractC0268W;
import p027J.C0279d;

/* JADX INFO: renamed from: androidx.appcompat.widget.w */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0917w {

    /* JADX INFO: renamed from: androidx.appcompat.widget.w$a */
    private static final class a {
        /* JADX INFO: renamed from: a */
        static boolean m3893a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                AbstractC0268W.m756Y(textView, new C0279d.a(dragEvent.getClipData(), 3).m946a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* JADX INFO: renamed from: b */
        static boolean m3894b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            AbstractC0268W.m756Y(view, new C0279d.a(dragEvent.getClipData(), 3).m946a());
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m3890a(View view, DragEvent dragEvent) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 && i3 >= 24 && dragEvent.getLocalState() == null && AbstractC0268W.m732B(view) != null) {
            Activity activityM3892c = m3892c(view);
            if (activityM3892c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.m3893a(dragEvent, (TextView) view, activityM3892c) : a.m3894b(dragEvent, view, activityM3892c);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    static boolean m3891b(TextView textView, int i3) {
        if (Build.VERSION.SDK_INT >= 31 || AbstractC0268W.m732B(textView) == null || !(i3 == 16908322 || i3 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            AbstractC0268W.m756Y(textView, new C0279d.a(primaryClip, 1).m948c(i3 != 16908322 ? 1 : 0).m946a());
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    static Activity m3892c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
