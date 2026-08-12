package p128m0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.AbstractC0966b;
import co.median.android.jrejze.R;
import java.util.List;
import org.json.JSONObject;
import p071X1.AbstractC0606k;
import p098e2.AbstractC1868d;
import p132n0.C2279a;

/* JADX INFO: renamed from: m0.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2176R0 extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    private final boolean f10036a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2176R0(Context context, List list, boolean z2) {
        super(context, 0, list);
        AbstractC0606k.m2145e(context, "context");
        AbstractC0606k.m2145e(list, "items");
        this.f10036a = z2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        AbstractC0606k.m2145e(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.overflow_menu_item, viewGroup, false);
        }
        JSONObject jSONObject = (JSONObject) getItem(i3);
        TextView textView = (TextView) view.findViewById(R.id.overFlowItemTextView);
        ImageView imageView = (ImageView) view.findViewById(R.id.overFlowItemDrawable);
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("label");
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.action_menu_icon_size);
            int color = AbstractC0966b.getColor(getContext(), R.color.titleTextColor);
            textView.setText(strOptString);
            if (this.f10036a) {
                String strOptString2 = jSONObject.optString("icon");
                AbstractC0606k.m2142b(strOptString2);
                if (AbstractC1868d.m9686s(strOptString2)) {
                    imageView.setVisibility(4);
                } else {
                    imageView.setImageDrawable(new C2279a(getContext(), strOptString2, dimensionPixelSize, color).m10885a());
                    imageView.setVisibility(0);
                }
            } else {
                imageView.setVisibility(8);
            }
        }
        AbstractC0606k.m2142b(view);
        return view;
    }
}
