package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: androidx.transition.f */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1261f {

    /* JADX INFO: renamed from: androidx.transition.f$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static <T, V> ObjectAnimator m6382a(T t2, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t2, property, (TypeConverter) null, path);
        }
    }

    /* JADX INFO: renamed from: a */
    static ObjectAnimator m6381a(Object obj, Property property, Path path) {
        return a.m6382a(obj, property, path);
    }
}
