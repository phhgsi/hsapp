package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p116j0.InterfaceC2047a;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1290a();

    /* JADX INFO: renamed from: d */
    private final InterfaceC2047a f6320d;

    /* JADX INFO: renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C1290a implements Parcelable.Creator {
        C1290a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i3) {
            return new ParcelImpl[i3];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f6320d = new C1292b(parcel).m6584u();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        new C1292b(parcel).m6565L(this.f6320d);
    }
}
