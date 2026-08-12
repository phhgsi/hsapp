package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import p075Z.AbstractC0625c;
import p075Z.AbstractC0629g;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: G */
    int f5458G;

    /* JADX INFO: renamed from: H */
    int f5459H;

    /* JADX INFO: renamed from: I */
    private int f5460I;

    /* JADX INFO: renamed from: J */
    private int f5461J;

    /* JADX INFO: renamed from: K */
    boolean f5462K;

    /* JADX INFO: renamed from: L */
    SeekBar f5463L;

    /* JADX INFO: renamed from: M */
    private TextView f5464M;

    /* JADX INFO: renamed from: N */
    boolean f5465N;

    /* JADX INFO: renamed from: O */
    private boolean f5466O;

    /* JADX INFO: renamed from: P */
    boolean f5467P;

    /* JADX INFO: renamed from: Q */
    private final SeekBar.OnSeekBarChangeListener f5468Q;

    /* JADX INFO: renamed from: R */
    private final View.OnKeyListener f5469R;

    /* JADX INFO: renamed from: androidx.preference.SeekBarPreference$a */
    class C1154a implements SeekBar.OnSeekBarChangeListener {
        C1154a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i3, boolean z2) {
            if (z2) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f5467P || !seekBarPreference.f5462K) {
                    seekBarPreference.m5255I(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.m5256J(i3 + seekBarPreference2.f5459H);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f5462K = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f5462K = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f5459H != seekBarPreference.f5458G) {
                seekBarPreference.m5255I(seekBar);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.preference.SeekBarPreference$b */
    class ViewOnKeyListenerC1155b implements View.OnKeyListener {
        ViewOnKeyListenerC1155b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i3, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f5465N && (i3 == 21 || i3 == 22)) || i3 == 23 || i3 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f5463L;
            if (seekBar != null) {
                return seekBar.onKeyDown(i3, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f5468Q = new C1154a();
        this.f5469R = new ViewOnKeyListenerC1155b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2057C0, i3, i4);
        this.f5459H = typedArrayObtainStyledAttributes.getInt(AbstractC0629g.f2063F0, 0);
        m5253F(typedArrayObtainStyledAttributes.getInt(AbstractC0629g.f2059D0, 100));
        m5254G(typedArrayObtainStyledAttributes.getInt(AbstractC0629g.f2065G0, 0));
        this.f5465N = typedArrayObtainStyledAttributes.getBoolean(AbstractC0629g.f2061E0, true);
        this.f5466O = typedArrayObtainStyledAttributes.getBoolean(AbstractC0629g.f2067H0, false);
        this.f5467P = typedArrayObtainStyledAttributes.getBoolean(AbstractC0629g.f2069I0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: H */
    private void m5252H(int i3, boolean z2) {
        int i4 = this.f5459H;
        if (i3 < i4) {
            i3 = i4;
        }
        int i5 = this.f5460I;
        if (i3 > i5) {
            i3 = i5;
        }
        if (i3 != this.f5458G) {
            this.f5458G = i3;
            m5256J(i3);
            m5224A(i3);
            if (z2) {
                mo5207r();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m5253F(int i3) {
        int i4 = this.f5459H;
        if (i3 < i4) {
            i3 = i4;
        }
        if (i3 != this.f5460I) {
            this.f5460I = i3;
            mo5207r();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m5254G(int i3) {
        if (i3 != this.f5461J) {
            this.f5461J = Math.min(this.f5460I - this.f5459H, Math.abs(i3));
            mo5207r();
        }
    }

    /* JADX INFO: renamed from: I */
    void m5255I(SeekBar seekBar) {
        int progress = this.f5459H + seekBar.getProgress();
        if (progress != this.f5458G) {
            if (m5228a(Integer.valueOf(progress))) {
                m5252H(progress, false);
            } else {
                seekBar.setProgress(this.f5458G - this.f5459H);
                m5256J(this.f5458G);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    void m5256J(int i3) {
        TextView textView = this.f5464M;
        if (textView != null) {
            textView.setText(String.valueOf(i3));
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: v */
    protected Object mo5210v(TypedArray typedArray, int i3) {
        return Integer.valueOf(typedArray.getInt(i3, 0));
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0625c.f2046h);
    }
}
