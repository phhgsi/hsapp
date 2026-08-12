package androidx.loader.app;

import androidx.lifecycle.InterfaceC1110K;
import androidx.lifecycle.InterfaceC1132n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.loader.app.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1145a {
    /* JADX INFO: renamed from: b */
    public static AbstractC1145a m5195b(InterfaceC1132n interfaceC1132n) {
        return new C1146b(interfaceC1132n, ((InterfaceC1110K) interfaceC1132n).getViewModelStore());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5196a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: c */
    public abstract void mo5197c();
}
