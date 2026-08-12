package p012E;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import p035L1.C0380l;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: E.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0107d {
    /* JADX INFO: renamed from: a */
    public static final Bundle m326a(C0380l... c0380lArr) {
        Bundle bundle = new Bundle(c0380lArr.length);
        for (C0380l c0380l : c0380lArr) {
            String str = (String) c0380l.m1365a();
            Object objM1366b = c0380l.m1366b();
            if (objM1366b == null) {
                bundle.putString(str, null);
            } else if (objM1366b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objM1366b).booleanValue());
            } else if (objM1366b instanceof Byte) {
                bundle.putByte(str, ((Number) objM1366b).byteValue());
            } else if (objM1366b instanceof Character) {
                bundle.putChar(str, ((Character) objM1366b).charValue());
            } else if (objM1366b instanceof Double) {
                bundle.putDouble(str, ((Number) objM1366b).doubleValue());
            } else if (objM1366b instanceof Float) {
                bundle.putFloat(str, ((Number) objM1366b).floatValue());
            } else if (objM1366b instanceof Integer) {
                bundle.putInt(str, ((Number) objM1366b).intValue());
            } else if (objM1366b instanceof Long) {
                bundle.putLong(str, ((Number) objM1366b).longValue());
            } else if (objM1366b instanceof Short) {
                bundle.putShort(str, ((Number) objM1366b).shortValue());
            } else if (objM1366b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objM1366b);
            } else if (objM1366b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objM1366b);
            } else if (objM1366b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objM1366b);
            } else if (objM1366b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objM1366b);
            } else if (objM1366b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objM1366b);
            } else if (objM1366b instanceof char[]) {
                bundle.putCharArray(str, (char[]) objM1366b);
            } else if (objM1366b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objM1366b);
            } else if (objM1366b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objM1366b);
            } else if (objM1366b instanceof int[]) {
                bundle.putIntArray(str, (int[]) objM1366b);
            } else if (objM1366b instanceof long[]) {
                bundle.putLongArray(str, (long[]) objM1366b);
            } else if (objM1366b instanceof short[]) {
                bundle.putShortArray(str, (short[]) objM1366b);
            } else if (objM1366b instanceof Object[]) {
                Class<?> componentType = objM1366b.getClass().getComponentType();
                AbstractC0606k.m2142b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    AbstractC0606k.m2143c(objM1366b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) objM1366b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    AbstractC0606k.m2143c(objM1366b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) objM1366b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    AbstractC0606k.m2143c(objM1366b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) objM1366b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) objM1366b);
                }
            } else if (objM1366b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objM1366b);
            } else if (objM1366b instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objM1366b);
            } else if (objM1366b instanceof Size) {
                C0105b.m322a(bundle, str, (Size) objM1366b);
            } else {
                if (!(objM1366b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objM1366b.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                C0105b.m323b(bundle, str, (SizeF) objM1366b);
            }
        }
        return bundle;
    }
}
