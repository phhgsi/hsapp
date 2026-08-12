package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p027J.C0279d;
import p027J.InterfaceC0237G;

/* JADX INFO: renamed from: androidx.core.widget.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0989j implements InterfaceC0237G {
    /* JADX INFO: renamed from: b */
    private static CharSequence m4416b(Context context, ClipData.Item item, int i3) {
        if ((i3 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    /* JADX INFO: renamed from: c */
    private static void m4417c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // p027J.InterfaceC0237G
    /* JADX INFO: renamed from: a */
    public C0279d mo664a(View view, C0279d c0279d) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0279d);
        }
        if (c0279d.m944d() == 2) {
            return c0279d;
        }
        ClipData clipDataM942b = c0279d.m942b();
        int iM943c = c0279d.m943c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i3 = 0; i3 < clipDataM942b.getItemCount(); i3++) {
            CharSequence charSequenceM4416b = m4416b(context, clipDataM942b.getItemAt(i3), iM943c);
            if (charSequenceM4416b != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceM4416b);
                } else {
                    m4417c(editable, charSequenceM4416b);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
