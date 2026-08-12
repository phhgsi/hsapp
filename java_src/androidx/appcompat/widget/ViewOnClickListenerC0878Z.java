package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.AbstractC0966b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p036M.AbstractC0391c;
import p091d.AbstractC1760a;
import p091d.AbstractC1765f;

/* JADX INFO: renamed from: androidx.appcompat.widget.Z */
/* JADX INFO: loaded from: classes.dex */
class ViewOnClickListenerC0878Z extends AbstractC0391c implements View.OnClickListener {

    /* JADX INFO: renamed from: l */
    private final SearchView f3591l;

    /* JADX INFO: renamed from: m */
    private final SearchableInfo f3592m;

    /* JADX INFO: renamed from: n */
    private final Context f3593n;

    /* JADX INFO: renamed from: o */
    private final WeakHashMap f3594o;

    /* JADX INFO: renamed from: p */
    private final int f3595p;

    /* JADX INFO: renamed from: q */
    private boolean f3596q;

    /* JADX INFO: renamed from: r */
    private int f3597r;

    /* JADX INFO: renamed from: s */
    private ColorStateList f3598s;

    /* JADX INFO: renamed from: t */
    private int f3599t;

    /* JADX INFO: renamed from: u */
    private int f3600u;

    /* JADX INFO: renamed from: v */
    private int f3601v;

    /* JADX INFO: renamed from: w */
    private int f3602w;

    /* JADX INFO: renamed from: x */
    private int f3603x;

    /* JADX INFO: renamed from: y */
    private int f3604y;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Z$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public final TextView f3605a;

        /* JADX INFO: renamed from: b */
        public final TextView f3606b;

        /* JADX INFO: renamed from: c */
        public final ImageView f3607c;

        /* JADX INFO: renamed from: d */
        public final ImageView f3608d;

        /* JADX INFO: renamed from: e */
        public final ImageView f3609e;

        public a(View view) {
            this.f3605a = (TextView) view.findViewById(R.id.text1);
            this.f3606b = (TextView) view.findViewById(R.id.text2);
            this.f3607c = (ImageView) view.findViewById(R.id.icon1);
            this.f3608d = (ImageView) view.findViewById(R.id.icon2);
            this.f3609e = (ImageView) view.findViewById(AbstractC1765f.f8825q);
        }
    }

    public ViewOnClickListenerC0878Z(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f3596q = false;
        this.f3597r = 1;
        this.f3599t = -1;
        this.f3600u = -1;
        this.f3601v = -1;
        this.f3602w = -1;
        this.f3603x = -1;
        this.f3604y = -1;
        this.f3591l = searchView;
        this.f3592m = searchableInfo;
        this.f3595p = searchView.getSuggestionCommitIconResId();
        this.f3593n = context;
        this.f3594o = weakHashMap;
    }

    /* JADX INFO: renamed from: A */
    private void m3717A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f3594o.put(str, drawable.getConstantState());
        }
    }

    /* JADX INFO: renamed from: B */
    private void m3718B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* JADX INFO: renamed from: k */
    private Drawable m3719k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f3594o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* JADX INFO: renamed from: l */
    private CharSequence m3720l(CharSequence charSequence) {
        if (this.f3598s == null) {
            TypedValue typedValue = new TypedValue();
            this.f3593n.getTheme().resolveAttribute(AbstractC1760a.f8696N, typedValue, true);
            this.f3598s = this.f3593n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f3598s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: m */
    private Drawable m3721m(ComponentName componentName) {
        PackageManager packageManager = this.f3593n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("SuggestionsAdapter", e3.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    private Drawable m3722n(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f3594o.containsKey(strFlattenToShortString)) {
            Drawable drawableM3721m = m3721m(componentName);
            this.f3594o.put(strFlattenToShortString, drawableM3721m != null ? drawableM3721m.getConstantState() : null);
            return drawableM3721m;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f3594o.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f3593n.getResources());
    }

    /* JADX INFO: renamed from: o */
    public static String m3723o(Cursor cursor, String str) {
        return m3729w(cursor, cursor.getColumnIndex(str));
    }

    /* JADX INFO: renamed from: p */
    private Drawable m3724p() {
        Drawable drawableM3722n = m3722n(this.f3592m.getSearchActivity());
        return drawableM3722n != null ? drawableM3722n : this.f3593n.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX INFO: renamed from: q */
    private Drawable m3725q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m3732r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f3593n.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    return drawableCreateFromStream;
                } catch (IOException e3) {
                    return drawableCreateFromStream;
                }
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e32) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e32);
                }
            }
        } catch (FileNotFoundException e4) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e4.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e4.getMessage());
        return null;
    }

    /* JADX INFO: renamed from: s */
    private Drawable m3726s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i3 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f3593n.getPackageName() + "/" + i3;
            Drawable drawableM3719k = m3719k(str2);
            if (drawableM3719k != null) {
                return drawableM3719k;
            }
            Drawable drawable = AbstractC0966b.getDrawable(this.f3593n, i3);
            m3717A(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableM3719k2 = m3719k(str);
            if (drawableM3719k2 != null) {
                return drawableM3719k2;
            }
            Drawable drawableM3725q = m3725q(Uri.parse(str));
            m3717A(str, drawableM3725q);
            return drawableM3725q;
        }
    }

    /* JADX INFO: renamed from: t */
    private Drawable m3727t(Cursor cursor) {
        int i3 = this.f3602w;
        if (i3 == -1) {
            return null;
        }
        Drawable drawableM3726s = m3726s(cursor.getString(i3));
        return drawableM3726s != null ? drawableM3726s : m3724p();
    }

    /* JADX INFO: renamed from: u */
    private Drawable m3728u(Cursor cursor) {
        int i3 = this.f3603x;
        if (i3 == -1) {
            return null;
        }
        return m3726s(cursor.getString(i3));
    }

    /* JADX INFO: renamed from: w */
    private static String m3729w(Cursor cursor, int i3) {
        if (i3 == -1) {
            return null;
        }
        try {
            return cursor.getString(i3);
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m3730y(ImageView imageView, Drawable drawable, int i3) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i3);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* JADX INFO: renamed from: z */
    private void m3731z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // p036M.AbstractC0389a, p036M.C0390b.a
    /* JADX INFO: renamed from: a */
    public void mo1379a(Cursor cursor) {
        if (this.f3596q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1379a(cursor);
            if (cursor != null) {
                this.f3599t = cursor.getColumnIndex("suggest_text_1");
                this.f3600u = cursor.getColumnIndex("suggest_text_2");
                this.f3601v = cursor.getColumnIndex("suggest_text_2_url");
                this.f3602w = cursor.getColumnIndex("suggest_icon_1");
                this.f3603x = cursor.getColumnIndex("suggest_icon_2");
                this.f3604y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e3);
        }
    }

    @Override // p036M.AbstractC0389a, p036M.C0390b.a
    /* JADX INFO: renamed from: c */
    public CharSequence mo1381c(Cursor cursor) {
        String strM3723o;
        String strM3723o2;
        if (cursor == null) {
            return null;
        }
        String strM3723o3 = m3723o(cursor, "suggest_intent_query");
        if (strM3723o3 != null) {
            return strM3723o3;
        }
        if (this.f3592m.shouldRewriteQueryFromData() && (strM3723o2 = m3723o(cursor, "suggest_intent_data")) != null) {
            return strM3723o2;
        }
        if (!this.f3592m.shouldRewriteQueryFromText() || (strM3723o = m3723o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strM3723o;
    }

    @Override // p036M.C0390b.a
    /* JADX INFO: renamed from: d */
    public Cursor mo1388d(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f3591l.getVisibility() == 0 && this.f3591l.getWindowVisibility() == 0) {
            try {
                Cursor cursorM3733v = m3733v(this.f3592m, string, 50);
                if (cursorM3733v != null) {
                    cursorM3733v.getCount();
                    return cursorM3733v;
                }
            } catch (RuntimeException e3) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e3);
            }
        }
        return null;
    }

    @Override // p036M.AbstractC0389a
    /* JADX INFO: renamed from: e */
    public void mo1382e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i3 = this.f3604y;
        int i4 = i3 != -1 ? cursor.getInt(i3) : 0;
        if (aVar.f3605a != null) {
            m3731z(aVar.f3605a, m3729w(cursor, this.f3599t));
        }
        if (aVar.f3606b != null) {
            String strM3729w = m3729w(cursor, this.f3601v);
            CharSequence charSequenceM3720l = strM3729w != null ? m3720l(strM3729w) : m3729w(cursor, this.f3600u);
            if (TextUtils.isEmpty(charSequenceM3720l)) {
                TextView textView = aVar.f3605a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f3605a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f3605a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f3605a.setMaxLines(1);
                }
            }
            m3731z(aVar.f3606b, charSequenceM3720l);
        }
        ImageView imageView = aVar.f3607c;
        if (imageView != null) {
            m3730y(imageView, m3727t(cursor), 4);
        }
        ImageView imageView2 = aVar.f3608d;
        if (imageView2 != null) {
            m3730y(imageView2, m3728u(cursor), 8);
        }
        int i5 = this.f3597r;
        if (i5 != 2 && (i5 != 1 || (i4 & 1) == 0)) {
            aVar.f3609e.setVisibility(8);
            return;
        }
        aVar.f3609e.setVisibility(0);
        aVar.f3609e.setTag(aVar.f3605a.getText());
        aVar.f3609e.setOnClickListener(this);
    }

    @Override // p036M.AbstractC0389a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View viewMo1384g = mo1384g(this.f3593n, mo1380b(), viewGroup);
            if (viewMo1384g != null) {
                ((a) viewMo1384g.getTag()).f3605a.setText(e3.toString());
            }
            return viewMo1384g;
        }
    }

    @Override // p036M.AbstractC0389a, android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View viewMo1385h = mo1385h(this.f3593n, mo1380b(), viewGroup);
            if (viewMo1385h != null) {
                ((a) viewMo1385h.getTag()).f3605a.setText(e3.toString());
            }
            return viewMo1385h;
        }
    }

    @Override // p036M.AbstractC0391c, p036M.AbstractC0389a
    /* JADX INFO: renamed from: h */
    public View mo1385h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewMo1385h = super.mo1385h(context, cursor, viewGroup);
        viewMo1385h.setTag(new a(viewMo1385h));
        ((ImageView) viewMo1385h.findViewById(AbstractC1765f.f8825q)).setImageResource(this.f3595p);
        return viewMo1385h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m3718B(mo1380b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m3718B(mo1380b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3591l.m3572U((CharSequence) tag);
        }
    }

    /* JADX INFO: renamed from: r */
    Drawable m3732r(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f3593n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX INFO: renamed from: v */
    Cursor m3733v(SearchableInfo searchableInfo, String str, int i3) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i3 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i3));
        }
        return this.f3593n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    /* JADX INFO: renamed from: x */
    public void m3734x(int i3) {
        this.f3597r = i3;
    }
}
