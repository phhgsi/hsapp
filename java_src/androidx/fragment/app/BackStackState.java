package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C1034a();

    /* JADX INFO: renamed from: d */
    final List f4939d;

    /* JADX INFO: renamed from: e */
    final List f4940e;

    /* JADX INFO: renamed from: androidx.fragment.app.BackStackState$a */
    class C1034a implements Parcelable.Creator {
        C1034a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i3) {
            return new BackStackState[i3];
        }
    }

    BackStackState(Parcel parcel) {
        this.f4939d = parcel.createStringArrayList();
        this.f4940e = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f4939d);
        parcel.writeTypedList(this.f4940e);
    }
}
