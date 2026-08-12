package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import p126l2.AbstractC2139a;

/* JADX INFO: loaded from: classes.dex */
public interface WebViewBuilderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    public static class Config implements Consumer<BiConsumer<Integer, Object>> {
        public int baseline = 0;

        /* JADX INFO: renamed from: a */
        List f10607a = new ArrayList();

        /* JADX INFO: renamed from: b */
        List f10608b = new ArrayList();

        /* JADX INFO: renamed from: c */
        List f10609c = new ArrayList();

        @Override // java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(BiConsumer<Integer, Object> biConsumer) {
            accept2(AbstractC2139a.m10601a(biConsumer));
        }

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            this.f10607a.add(obj);
            this.f10608b.add(str);
            this.f10609c.add(list);
        }

        /* JADX INFO: renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(1, new Object[]{this.f10607a, this.f10608b, this.f10609c});
        }
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
}
