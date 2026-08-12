package p065V1;

import p071X1.AbstractC0606k;
import p071X1.InterfaceC0599d;
import p090c2.InterfaceC1315b;

/* JADX INFO: renamed from: V1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0553a {
    /* JADX INFO: renamed from: a */
    public static final Class m2062a(InterfaceC1315b interfaceC1315b) {
        AbstractC0606k.m2145e(interfaceC1315b, "<this>");
        Class clsMo2138a = ((InterfaceC0599d) interfaceC1315b).mo2138a();
        AbstractC0606k.m2143c(clsMo2138a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo2138a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static final Class m2063b(InterfaceC1315b interfaceC1315b) {
        AbstractC0606k.m2145e(interfaceC1315b, "<this>");
        Class clsMo2138a = ((InterfaceC0599d) interfaceC1315b).mo2138a();
        if (!clsMo2138a.isPrimitive()) {
            AbstractC0606k.m2143c(clsMo2138a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsMo2138a;
        }
        String name = clsMo2138a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsMo2138a = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsMo2138a = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsMo2138a = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsMo2138a = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsMo2138a = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsMo2138a = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsMo2138a = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsMo2138a = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsMo2138a = Short.class;
                }
                break;
        }
        AbstractC0606k.m2143c(clsMo2138a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsMo2138a;
    }
}
