package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityResult implements Parcelable {

    /* JADX INFO: renamed from: d */
    private final int f2473d;

    /* JADX INFO: renamed from: e */
    private final Intent f2474e;

    /* JADX INFO: renamed from: f */
    public static final C0720b f2472f = new C0720b(null);
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C0719a();

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResult$a */
    public static final class C0719a implements Parcelable.Creator {
        C0719a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(Parcel parcel) {
            AbstractC0606k.m2145e(parcel, "parcel");
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i3) {
            return new ActivityResult[i3];
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResult$b */
    public static final class C0720b {
        public /* synthetic */ C0720b(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m2640a(int i3) {
            return i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK";
        }

        private C0720b() {
        }
    }

    public ActivityResult(int i3, Intent intent) {
        this.f2473d = i3;
        this.f2474e = intent;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m2636a() {
        return this.f2474e;
    }

    /* JADX INFO: renamed from: d */
    public final int m2637d() {
        return this.f2473d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f2472f.m2640a(this.f2473d) + ", data=" + this.f2474e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        AbstractC0606k.m2145e(parcel, "dest");
        parcel.writeInt(this.f2473d);
        parcel.writeInt(this.f2474e == null ? 0 : 1);
        Intent intent = this.f2474e;
        if (intent != null) {
            intent.writeToParcel(parcel, i3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityResult(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        AbstractC0606k.m2145e(parcel, "parcel");
    }
}
