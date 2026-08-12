package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: androidx.appcompat.widget.z */
/* JADX INFO: loaded from: classes.dex */
final class C0920z {

    /* JADX INFO: renamed from: a */
    private TextView f3780a;

    /* JADX INFO: renamed from: b */
    private TextClassifier f3781b;

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$a */
    private static final class a {
        /* JADX INFO: renamed from: a */
        static TextClassifier m3902a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    C0920z(TextView textView) {
        this.f3780a = (TextView) AbstractC0211h.m610g(textView);
    }

    /* JADX INFO: renamed from: a */
    public TextClassifier m3900a() {
        TextClassifier textClassifier = this.f3781b;
        return textClassifier == null ? a.m3902a(this.f3780a) : textClassifier;
    }

    /* JADX INFO: renamed from: b */
    public void m3901b(TextClassifier textClassifier) {
        this.f3781b = textClassifier;
    }
}
