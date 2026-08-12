package p038M1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: M1.z */
/* JADX INFO: loaded from: classes.dex */
final class C0432z implements Map, Serializable, InterfaceC0622a {

    /* JADX INFO: renamed from: d */
    public static final C0432z f1541d = new C0432z();

    private C0432z() {
    }

    /* JADX INFO: renamed from: a */
    public boolean m1482a(Void r2) {
        AbstractC0606k.m2145e(r2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Set m1484c() {
        return C0395A.f1522d;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m1482a((Void) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public Set m1485d() {
        return C0395A.f1522d;
    }

    /* JADX INFO: renamed from: e */
    public int m1486e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m1484c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public Collection m1487f() {
        return C0431y.f1540d;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m1485d();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m1486e();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m1487f();
    }
}
