package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.C0788g;
import androidx.appcompat.view.menu.InterfaceC0791j;
import androidx.appcompat.view.menu.SubMenuC0794m;
import com.google.android.material.badge.AbstractC1435b;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes.dex */
public class NavigationBarPresenter implements InterfaceC0791j {

    /* JADX INFO: renamed from: a */
    private AbstractC1574k f7812a;

    /* JADX INFO: renamed from: b */
    private boolean f7813b = false;

    /* JADX INFO: renamed from: c */
    private int f7814c;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1554a();

        /* JADX INFO: renamed from: d */
        int f7815d;

        /* JADX INFO: renamed from: e */
        ParcelableSparseArray f7816e;

        /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        class C1554a implements Parcelable.Creator {
            C1554a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeInt(this.f7815d);
            parcel.writeParcelable(this.f7816e, 0);
        }

        SavedState(Parcel parcel) {
            this.f7815d = parcel.readInt();
            this.f7816e = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: a */
    public void mo3061a(C0786e c0786e, boolean z2) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: b */
    public int mo3062b() {
        return this.f7814c;
    }

    /* JADX INFO: renamed from: c */
    public void m8513c(int i3) {
        this.f7814c = i3;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: d */
    public void mo3064d(Context context, C0786e c0786e) {
        this.f7812a.mo3054b(c0786e);
    }

    /* JADX INFO: renamed from: e */
    public void m8514e(AbstractC1574k abstractC1574k) {
        this.f7812a = abstractC1574k;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: f */
    public void mo3087f(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7812a.m8612p(savedState.f7815d);
            this.f7812a.m8610n(AbstractC1435b.m7523c(this.f7812a.getContext(), savedState.f7816e));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m8515g(boolean z2) {
        this.f7813b = z2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: h */
    public boolean mo3067h(SubMenuC0794m subMenuC0794m) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: i */
    public void mo3068i(boolean z2) {
        if (this.f7813b) {
            return;
        }
        if (z2) {
            this.f7812a.m8607d();
        } else {
            this.f7812a.m8613q();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: j */
    public boolean mo3089j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: k */
    public Parcelable mo3090k() {
        SavedState savedState = new SavedState();
        savedState.f7815d = this.f7812a.getSelectedItemId();
        savedState.f7816e = AbstractC1435b.m7524d(this.f7812a.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: l */
    public boolean mo3069l(C0786e c0786e, C0788g c0788g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: m */
    public boolean mo3070m(C0786e c0786e, C0788g c0788g) {
        return false;
    }
}
