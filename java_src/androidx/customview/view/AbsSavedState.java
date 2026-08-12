package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* JADX INFO: renamed from: d */
    private final Parcelable f4743d;

    /* JADX INFO: renamed from: e */
    public static final AbsSavedState f4742e = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0993a();

    /* JADX INFO: renamed from: androidx.customview.view.AbsSavedState$a */
    class C0993a implements Parcelable.ClassLoaderCreator {
        C0993a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f4742e;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbsSavedState[] newArray(int i3) {
            return new AbsSavedState[i3];
        }
    }

    /* JADX INFO: renamed from: a */
    public final Parcelable m4418a() {
        return this.f4743d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f4743d, i3);
    }

    private AbsSavedState() {
        this.f4743d = null;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4743d = parcelable == f4742e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f4743d = parcelable == null ? f4742e : parcelable;
    }
}
