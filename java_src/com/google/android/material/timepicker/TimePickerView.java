package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0146g;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    private final ClockHandView f8330A;

    /* JADX INFO: renamed from: B */
    private final ClockFaceView f8331B;

    /* JADX INFO: renamed from: C */
    private final MaterialButtonToggleGroup f8332C;

    /* JADX INFO: renamed from: D */
    private final View.OnClickListener f8333D;

    /* JADX INFO: renamed from: y */
    private final Chip f8334y;

    /* JADX INFO: renamed from: z */
    private final Chip f8335z;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$a */
    class ViewOnClickListenerC1644a implements View.OnClickListener {
        ViewOnClickListenerC1644a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.m9089C(TimePickerView.this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$b */
    class C1645b extends GestureDetector.SimpleOnGestureListener {
        C1645b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.m9090D(TimePickerView.this);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$c */
    class ViewOnTouchListenerC1646c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ GestureDetector f8338a;

        ViewOnTouchListenerC1646c(GestureDetector gestureDetector) {
            this.f8338a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f8338a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$d */
    interface InterfaceC1647d {
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$e */
    interface InterfaceC1648e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: C */
    static /* synthetic */ InterfaceC1648e m9089C(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: D */
    static /* synthetic */ InterfaceC1647d m9090D(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: E */
    private void m9091E() {
        Chip chip = this.f8334y;
        int i3 = AbstractC0144e.f469N;
        chip.setTag(i3, 12);
        this.f8335z.setTag(i3, 10);
        this.f8334y.setOnClickListener(this.f8333D);
        this.f8335z.setOnClickListener(this.f8333D);
        this.f8334y.setAccessibilityClassName("android.view.View");
        this.f8335z.setAccessibilityClassName("android.view.View");
    }

    /* JADX INFO: renamed from: F */
    private void m9092F() {
        ViewOnTouchListenerC1646c viewOnTouchListenerC1646c = new ViewOnTouchListenerC1646c(new GestureDetector(getContext(), new C1645b()));
        this.f8334y.setOnTouchListener(viewOnTouchListenerC1646c);
        this.f8335z.setOnTouchListener(viewOnTouchListenerC1646c);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i3) {
        super.onVisibilityChanged(view, i3);
        if (view == this && i3 == 0) {
            this.f8335z.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f8333D = new ViewOnClickListenerC1644a();
        LayoutInflater.from(context).inflate(AbstractC0146g.f526q, this);
        this.f8331B = (ClockFaceView) findViewById(AbstractC0144e.f489i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(AbstractC0144e.f492l);
        this.f8332C = materialButtonToggleGroup;
        materialButtonToggleGroup.m7708q(new MaterialButtonToggleGroup.InterfaceC1466b() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC1466b
            /* JADX INFO: renamed from: a */
            public final void mo7712a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i4, boolean z2) {
                this.f8346a.getClass();
            }
        });
        this.f8334y = (Chip) findViewById(AbstractC0144e.f495o);
        this.f8335z = (Chip) findViewById(AbstractC0144e.f493m);
        this.f8330A = (ClockHandView) findViewById(AbstractC0144e.f490j);
        m9092F();
        m9091E();
    }
}
