package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C0907o;
import androidx.customview.view.AbsSavedState;
import p027J.AbstractC0268W;
import p027J.C0273a;
import p030K.C0356y;
import p091d.AbstractC1760a;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0907o implements Checkable {

    /* JADX INFO: renamed from: g */
    private static final int[] f7619g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    private boolean f7620d;

    /* JADX INFO: renamed from: e */
    private boolean f7621e;

    /* JADX INFO: renamed from: f */
    private boolean f7622f;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1526a();

        /* JADX INFO: renamed from: f */
        boolean f7623f;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        class C1526a implements Parcelable.ClassLoaderCreator {
            C1526a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: d */
        private void m8289d(Parcel parcel) {
            this.f7623f = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f7623f ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m8289d(parcel);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C1527a extends C0273a {
        C1527a() {
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: f */
        public void mo904f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo904f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            c0356y.m1283q0(CheckableImageButton.this.m8288a());
            c0356y.m1285r0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8686D);
    }

    /* JADX INFO: renamed from: a */
    public boolean m8288a() {
        return this.f7621e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7620d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i3) {
        if (!this.f7620d) {
            return super.onCreateDrawableState(i3);
        }
        int[] iArr = f7619g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i3 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m4418a());
        setChecked(savedState.f7623f);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7623f = this.f7620d;
        return savedState;
    }

    public void setCheckable(boolean z2) {
        if (this.f7621e != z2) {
            this.f7621e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f7621e || this.f7620d == z2) {
            return;
        }
        this.f7620d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f7622f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f7622f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f7620d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f7621e = true;
        this.f7622f = true;
        AbstractC0268W.m775i0(this, new C1527a());
    }
}
