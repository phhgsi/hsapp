package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C1069a();

    /* JADX INFO: renamed from: d */
    ArrayList f5090d;

    /* JADX INFO: renamed from: e */
    ArrayList f5091e;

    /* JADX INFO: renamed from: f */
    BackStackRecordState[] f5092f;

    /* JADX INFO: renamed from: g */
    int f5093g;

    /* JADX INFO: renamed from: h */
    String f5094h;

    /* JADX INFO: renamed from: i */
    ArrayList f5095i;

    /* JADX INFO: renamed from: j */
    ArrayList f5096j;

    /* JADX INFO: renamed from: k */
    ArrayList f5097k;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManagerState$a */
    class C1069a implements Parcelable.Creator {
        C1069a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i3) {
            return new FragmentManagerState[i3];
        }
    }

    public FragmentManagerState() {
        this.f5094h = null;
        this.f5095i = new ArrayList();
        this.f5096j = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f5090d);
        parcel.writeStringList(this.f5091e);
        parcel.writeTypedArray(this.f5092f, i3);
        parcel.writeInt(this.f5093g);
        parcel.writeString(this.f5094h);
        parcel.writeStringList(this.f5095i);
        parcel.writeTypedList(this.f5096j);
        parcel.writeTypedList(this.f5097k);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f5094h = null;
        this.f5095i = new ArrayList();
        this.f5096j = new ArrayList();
        this.f5090d = parcel.createStringArrayList();
        this.f5091e = parcel.createStringArrayList();
        this.f5092f = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f5093g = parcel.readInt();
        this.f5094h = parcel.readString();
        this.f5095i = parcel.createStringArrayList();
        this.f5096j = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f5097k = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
