package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0792k;
import androidx.appcompat.widget.C0888e0;
import p091d.AbstractC1760a;
import p091d.AbstractC1765f;
import p091d.AbstractC1766g;
import p091d.AbstractC1769j;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0792k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a */
    private C0788g f2903a;

    /* JADX INFO: renamed from: b */
    private ImageView f2904b;

    /* JADX INFO: renamed from: c */
    private RadioButton f2905c;

    /* JADX INFO: renamed from: d */
    private TextView f2906d;

    /* JADX INFO: renamed from: e */
    private CheckBox f2907e;

    /* JADX INFO: renamed from: f */
    private TextView f2908f;

    /* JADX INFO: renamed from: g */
    private ImageView f2909g;

    /* JADX INFO: renamed from: h */
    private ImageView f2910h;

    /* JADX INFO: renamed from: i */
    private LinearLayout f2911i;

    /* JADX INFO: renamed from: j */
    private Drawable f2912j;

    /* JADX INFO: renamed from: k */
    private int f2913k;

    /* JADX INFO: renamed from: l */
    private Context f2914l;

    /* JADX INFO: renamed from: m */
    private boolean f2915m;

    /* JADX INFO: renamed from: n */
    private Drawable f2916n;

    /* JADX INFO: renamed from: o */
    private boolean f2917o;

    /* JADX INFO: renamed from: p */
    private LayoutInflater f2918p;

    /* JADX INFO: renamed from: q */
    private boolean f2919q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8687E);
    }

    /* JADX INFO: renamed from: a */
    private void m3055a(View view) {
        m3056b(view, -1);
    }

    /* JADX INFO: renamed from: b */
    private void m3056b(View view, int i3) {
        LinearLayout linearLayout = this.f2911i;
        if (linearLayout != null) {
            linearLayout.addView(view, i3);
        } else {
            addView(view, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3057c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC1766g.f8842h, (ViewGroup) this, false);
        this.f2907e = checkBox;
        m3055a(checkBox);
    }

    /* JADX INFO: renamed from: f */
    private void m3058f() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC1766g.f8843i, (ViewGroup) this, false);
        this.f2904b = imageView;
        m3056b(imageView, 0);
    }

    /* JADX INFO: renamed from: g */
    private void m3059g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC1766g.f8845k, (ViewGroup) this, false);
        this.f2905c = radioButton;
        m3055a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f2918p == null) {
            this.f2918p = LayoutInflater.from(getContext());
        }
        return this.f2918p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f2909g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2910h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2910h.getLayoutParams();
        rect.top += this.f2910h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: d */
    public boolean mo3047d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: e */
    public void mo3048e(C0788g c0788g, int i3) {
        this.f2903a = c0788g;
        setVisibility(c0788g.isVisible() ? 0 : 8);
        setTitle(c0788g.m3184i(this));
        setCheckable(c0788g.isCheckable());
        m3060h(c0788g.m3178A(), c0788g.m3182g());
        setIcon(c0788g.getIcon());
        setEnabled(c0788g.isEnabled());
        setSubMenuArrowVisible(c0788g.hasSubMenu());
        setContentDescription(c0788g.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    public C0788g getItemData() {
        return this.f2903a;
    }

    /* JADX INFO: renamed from: h */
    public void m3060h(boolean z2, char c3) {
        int i3 = (z2 && this.f2903a.m3178A()) ? 0 : 8;
        if (i3 == 0) {
            this.f2908f.setText(this.f2903a.m3183h());
        }
        if (this.f2908f.getVisibility() != i3) {
            this.f2908f.setVisibility(i3);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f2912j);
        TextView textView = (TextView) findViewById(AbstractC1765f.f8805M);
        this.f2906d = textView;
        int i3 = this.f2913k;
        if (i3 != -1) {
            textView.setTextAppearance(this.f2914l, i3);
        }
        this.f2908f = (TextView) findViewById(AbstractC1765f.f8798F);
        ImageView imageView = (ImageView) findViewById(AbstractC1765f.f8801I);
        this.f2909g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2916n);
        }
        this.f2910h = (ImageView) findViewById(AbstractC1765f.f8826r);
        this.f2911i = (LinearLayout) findViewById(AbstractC1765f.f8820l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        if (this.f2904b != null && this.f2915m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2904b.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f2905c == null && this.f2907e == null) {
            return;
        }
        if (this.f2903a.m3188m()) {
            if (this.f2905c == null) {
                m3059g();
            }
            compoundButton = this.f2905c;
            view = this.f2907e;
        } else {
            if (this.f2907e == null) {
                m3057c();
            }
            compoundButton = this.f2907e;
            view = this.f2905c;
        }
        if (z2) {
            compoundButton.setChecked(this.f2903a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f2907e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f2905c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if (this.f2903a.m3188m()) {
            if (this.f2905c == null) {
                m3059g();
            }
            compoundButton = this.f2905c;
        } else {
            if (this.f2907e == null) {
                m3057c();
            }
            compoundButton = this.f2907e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f2919q = z2;
        this.f2915m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f2910h;
        if (imageView != null) {
            imageView.setVisibility((this.f2917o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z2 = this.f2903a.m3201z() || this.f2919q;
        if (z2 || this.f2915m) {
            ImageView imageView = this.f2904b;
            if (imageView == null && drawable == null && !this.f2915m) {
                return;
            }
            if (imageView == null) {
                m3058f();
            }
            if (drawable == null && !this.f2915m) {
                this.f2904b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f2904b;
            if (!z2) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f2904b.getVisibility() != 0) {
                this.f2904b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f2906d.getVisibility() != 8) {
                this.f2906d.setVisibility(8);
            }
        } else {
            this.f2906d.setText(charSequence);
            if (this.f2906d.getVisibility() != 0) {
                this.f2906d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet);
        C0888e0 c0888e0M3765v = C0888e0.m3765v(getContext(), attributeSet, AbstractC1769j.f9015b2, i3, 0);
        this.f2912j = c0888e0M3765v.m3772g(AbstractC1769j.f9027d2);
        this.f2913k = c0888e0M3765v.m3779n(AbstractC1769j.f9021c2, -1);
        this.f2915m = c0888e0M3765v.m3766a(AbstractC1769j.f9033e2, false);
        this.f2914l = context;
        this.f2916n = c0888e0M3765v.m3772g(AbstractC1769j.f9039f2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC1760a.f8683A, 0);
        this.f2917o = typedArrayObtainStyledAttributes.hasValue(0);
        c0888e0M3765v.m3786x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
