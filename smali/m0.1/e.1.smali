.class public final Lm0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/e$a;
    }
.end annotation


# static fields
.field public static final o:Lm0/e$a;


# instance fields
.field private final a:Lco/median/android/MainActivity;

.field private b:Z

.field private c:Landroidx/appcompat/app/a;

.field private final d:Lcom/google/android/material/appbar/MaterialToolbar;

.field private final e:Landroid/widget/ImageView;

.field private final f:Ljava/util/HashMap;

.field private final g:I

.field private final h:I

.field private i:I

.field private j:Landroid/view/Menu;

.field private k:Landroidx/appcompat/widget/SearchView;

.field private l:Ljava/lang/String;

.field private m:Z

.field private n:Landroid/widget/PopupWindow;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm0/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lm0/e$a;-><init>(LX1/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm0/e;->o:Lm0/e$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 3

    .line 1
    const-string v0, "main"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lm0/e;->b:Z

    .line 13
    .line 14
    const v0, 0x7f090212

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "findViewById(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast v0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 27
    .line 28
    iput-object v0, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 29
    .line 30
    const v1, 0x7f09020f

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v1}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroid/widget/ImageView;

    .line 38
    .line 39
    iput-object v1, p0, Lm0/e;->e:Landroid/widget/ImageView;

    .line 40
    .line 41
    new-instance v1, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lm0/e;->f:Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const v2, 0x7f070055

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iput v1, p0, Lm0/e;->g:I

    .line 60
    .line 61
    invoke-virtual {p1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const v2, 0x7f070053

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iput v1, p0, Lm0/e;->h:I

    .line 73
    .line 74
    const v1, 0x7f0603d4

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v1}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    iput v1, p0, Lm0/e;->i:I

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/d;->t0(Landroidx/appcompat/widget/Toolbar;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method private static final A(Lm0/e;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-static {p1}, LX1/k;->b(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lm0/e;->r(Landroid/view/MenuItem;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method private final B(Landroid/view/Menu;Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getOverflowIcon()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v0, v1

    .line 35
    :goto_0
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget v2, p0, Lm0/e;->i:I

    .line 38
    .line 39
    sget-object v3, Lz/b;->m:Lz/b;

    .line 40
    .line 41
    invoke-static {v2, v3}, Lz/a;->a(ILz/b;)Landroid/graphics/ColorFilter;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    const/16 v2, 0x63

    .line 49
    .line 50
    const-string v3, "Overflow"

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-interface {p1, v4, v2, v4, v3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const/4 v0, 0x2

    .line 62
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string v0, "setShowAsActionFlags(...)"

    .line 67
    .line 68
    invoke-static {p1, v0}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lm0/e;->f:Ljava/util/HashMap;

    .line 72
    .line 73
    const-string v2, "overflow"

    .line 74
    .line 75
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 79
    .line 80
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const v0, 0x7f0c0075

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const v0, 0x7f09012b

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Landroid/widget/ListView;

    .line 99
    .line 100
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    const/4 v3, 0x1

    .line 109
    if-eqz v2, :cond_5

    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Lorg/json/JSONObject;

    .line 116
    .line 117
    const-string v5, "icon"

    .line 118
    .line 119
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    if-eqz v2, :cond_3

    .line 124
    .line 125
    invoke-static {v2}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    move v4, v3

    .line 133
    :cond_5
    new-instance v1, Lm0/R0;

    .line 134
    .line 135
    iget-object v2, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 136
    .line 137
    invoke-direct {v1, v2, p2, v4}, Lm0/R0;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 141
    .line 142
    .line 143
    new-instance v1, Landroid/widget/PopupWindow;

    .line 144
    .line 145
    const/4 v2, -0x2

    .line 146
    invoke-direct {v1, p1, v2, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 147
    .line 148
    .line 149
    iget p1, p0, Lm0/e;->h:I

    .line 150
    .line 151
    invoke-virtual {v1, p1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 152
    .line 153
    .line 154
    const/high16 p1, 0x41200000    # 10.0f

    .line 155
    .line 156
    invoke-virtual {v1, p1}, Landroid/widget/PopupWindow;->setElevation(F)V

    .line 157
    .line 158
    .line 159
    iput-object v1, p0, Lm0/e;->n:Landroid/widget/PopupWindow;

    .line 160
    .line 161
    new-instance p1, Lm0/b;

    .line 162
    .line 163
    invoke-direct {p1, p2, p0}, Lm0/b;-><init>(Ljava/util/List;Lm0/e;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method private static final C(Ljava/util/List;Lm0/e;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    invoke-interface {p0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lorg/json/JSONObject;

    .line 6
    .line 7
    const-string p2, "system"

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const-string p3, "url"

    .line 14
    .line 15
    invoke-virtual {p0, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    invoke-static {p2}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-eqz p3, :cond_6

    .line 26
    .line 27
    :cond_0
    if-eqz p2, :cond_6

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    const p4, -0x36059a58    # -2051253.0f

    .line 34
    .line 35
    .line 36
    if-eq p3, p4, :cond_4

    .line 37
    .line 38
    const p4, 0x6854fdf

    .line 39
    .line 40
    .line 41
    if-eq p3, p4, :cond_3

    .line 42
    .line 43
    const p4, 0x40b292db

    .line 44
    .line 45
    .line 46
    if-eq p3, p4, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const-string p3, "refresh"

    .line 50
    .line 51
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-nez p2, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object p0, p3

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const-string p3, "share"

    .line 61
    .line 62
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-nez p2, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const-string p3, "search"

    .line 70
    .line 71
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-nez p2, :cond_5

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    const-string p0, "ActionManager"

    .line 79
    .line 80
    const-string p2, "setupOverflowMenu: The \"search\" system menu is not supported on the custom overflow menu yet."

    .line 81
    .line 82
    invoke-static {p0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    const-string p0, ""

    .line 86
    .line 87
    :cond_6
    :goto_0
    invoke-static {p0}, LX1/k;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-nez p2, :cond_7

    .line 95
    .line 96
    invoke-direct {p1, p0}, Lm0/e;->q(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    :cond_7
    iget-object p0, p1, Lm0/e;->n:Landroid/widget/PopupWindow;

    .line 100
    .line 101
    if-eqz p0, :cond_8

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 104
    .line 105
    .line 106
    :cond_8
    return-void
.end method

.method private final D(ZLjava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lm0/e;->e:Landroid/widget/ImageView;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 10
    .line 11
    const-string p2, ""

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object p1, p0, Lm0/e;->e:Landroid/widget/ImageView;

    .line 18
    .line 19
    const/16 v0, 0x8

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private final E()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm0/e;->n:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lm0/e;->h:I

    .line 6
    .line 7
    iget-object v2, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sub-int/2addr v2, v1

    .line 14
    add-int/lit8 v2, v2, -0xf

    .line 15
    .line 16
    iget-object v1, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static synthetic a(LX1/r;Lm0/e;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lm0/e;->i(LX1/r;Lm0/e;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lm0/e;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm0/e;->A(Lm0/e;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Landroidx/appcompat/widget/SearchView;Lm0/e;Landroid/view/View;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lm0/e;->p(Landroidx/appcompat/widget/SearchView;Lm0/e;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic d(Ljava/util/List;Lm0/e;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lm0/e;->C(Ljava/util/List;Lm0/e;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method public static final synthetic e(Lm0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm0/e;->n()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic f(Lm0/e;)Lco/median/android/MainActivity;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    return-object p0
.end method

.method private final h(Lorg/json/JSONObject;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-boolean v1, p0, Lm0/e;->b:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    new-instance v1, LX1/r;

    .line 12
    .line 13
    invoke-direct {v1}, LX1/r;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v3, "url"

    .line 17
    .line 18
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iput-object v3, v1, LX1/r;->d:Ljava/lang/Object;

    .line 23
    .line 24
    const-string v3, "icon"

    .line 25
    .line 26
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "system"

    .line 31
    .line 32
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_b

    .line 37
    .line 38
    invoke-static {p1}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    if-eqz p1, :cond_b

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const v5, -0x36059a58    # -2051253.0f

    .line 52
    .line 53
    .line 54
    if-eq v4, v5, :cond_9

    .line 55
    .line 56
    const v0, 0x6854fdf

    .line 57
    .line 58
    .line 59
    if-eq v4, v0, :cond_6

    .line 60
    .line 61
    const v0, 0x40b292db

    .line 62
    .line 63
    .line 64
    if-eq v4, v0, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const-string v0, "refresh"

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    iput-object v0, v1, LX1/r;->d:Ljava/lang/Object;

    .line 77
    .line 78
    if-eqz v3, :cond_b

    .line 79
    .line 80
    invoke-static {v3}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    const-string v3, "fa-rotate-right"

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_6
    const-string v0, "share"

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_7

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_7
    iput-object v0, v1, LX1/r;->d:Ljava/lang/Object;

    .line 100
    .line 101
    if-eqz v3, :cond_b

    .line 102
    .line 103
    invoke-static {v3}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_8

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_8
    const-string v3, "fa fa-search"

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_9
    const-string v4, "search"

    .line 114
    .line 115
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_a

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_a
    const-string p1, "ActionManager"

    .line 123
    .line 124
    const-string v1, "addAsLeftActionMenu: The \"search\" system menu is not supported as a left-menu yet."

    .line 125
    .line 126
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    return v0

    .line 130
    :cond_b
    :goto_0
    new-instance p1, Ln0/a;

    .line 131
    .line 132
    iget-object v0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 133
    .line 134
    iget v4, p0, Lm0/e;->g:I

    .line 135
    .line 136
    iget v5, p0, Lm0/e;->i:I

    .line 137
    .line 138
    invoke-direct {p1, v0, v3, v4, v5}, Ln0/a;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Ln0/a;->a()Landroid/graphics/drawable/Drawable;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iget-object v0, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 146
    .line 147
    invoke-virtual {v0, p1}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 151
    .line 152
    iget v0, p0, Lm0/e;->i:I

    .line 153
    .line 154
    invoke-virtual {p1, v0}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIconTint(I)V

    .line 155
    .line 156
    .line 157
    iget-object p1, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 158
    .line 159
    new-instance v0, Lm0/d;

    .line 160
    .line 161
    invoke-direct {v0, v1, p0}, Lm0/d;-><init>(LX1/r;Lm0/e;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 165
    .line 166
    .line 167
    return v2
.end method

.method private static final i(LX1/r;Lm0/e;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p0, LX1/r;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/String;

    .line 4
    .line 5
    const-string v0, "share"

    .line 6
    .line 7
    invoke-static {p2, v0}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p1, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1, p1}, Lco/median/android/MainActivity;->s3(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string v0, "refresh"

    .line 21
    .line 22
    invoke-static {p2, v0}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    iget-object p0, p1, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 29
    .line 30
    invoke-virtual {p0}, Lco/median/android/MainActivity;->m()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object p1, p1, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 35
    .line 36
    invoke-virtual {p1}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p0, p0, LX1/r;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Ljava/lang/String;

    .line 43
    .line 44
    const/4 p2, 0x1

    .line 45
    invoke-virtual {p1, p0, p2}, Lco/median/android/A;->d(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private final j(Landroid/view/Menu;ILorg/json/JSONObject;)V
    .locals 6

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p3, p2}, Lm0/e;->k(Landroid/view/Menu;Lorg/json/JSONObject;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    const-string v0, "label"

    .line 12
    .line 13
    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "icon"

    .line 18
    .line 19
    invoke-virtual {p3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "url"

    .line 24
    .line 25
    invoke-virtual {p3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    new-instance v2, Ln0/a;

    .line 30
    .line 31
    iget-object v3, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 32
    .line 33
    iget v4, p0, Lm0/e;->g:I

    .line 34
    .line 35
    iget v5, p0, Lm0/e;->i:I

    .line 36
    .line 37
    invoke-direct {v2, v3, v1, v4, v5}, Ln0/a;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ln0/a;->a()Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-interface {p1, v2, p2, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/4 p2, 0x2

    .line 54
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string p2, "setShowAsActionFlags(...)"

    .line 59
    .line 60
    invoke-static {p1, p2}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Lm0/e;->f:Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private final k(Landroid/view/Menu;Lorg/json/JSONObject;I)Z
    .locals 9

    .line 1
    const-string v0, "system"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    const-string v1, "label"

    .line 16
    .line 17
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v3, "icon"

    .line 22
    .line 23
    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "url"

    .line 28
    .line 29
    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    if-eqz v0, :cond_a

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    const v5, -0x36059a58    # -2051253.0f

    .line 40
    .line 41
    .line 42
    const-string v6, "search"

    .line 43
    .line 44
    if-eq v4, v5, :cond_5

    .line 45
    .line 46
    const v5, 0x6854fdf

    .line 47
    .line 48
    .line 49
    if-eq v4, v5, :cond_3

    .line 50
    .line 51
    const v5, 0x40b292db

    .line 52
    .line 53
    .line 54
    if-eq v4, v5, :cond_1

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_1
    const-string v4, "refresh"

    .line 59
    .line 60
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    goto/16 :goto_1

    .line 67
    .line 68
    :cond_2
    new-instance v0, LL1/p;

    .line 69
    .line 70
    const-string v5, "fa-rotate-right"

    .line 71
    .line 72
    const-string v7, "Refresh"

    .line 73
    .line 74
    invoke-direct {v0, v4, v5, v7}, LL1/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    const-string v4, "share"

    .line 79
    .line 80
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    new-instance v0, LL1/p;

    .line 88
    .line 89
    const-string v5, "fa-share"

    .line 90
    .line 91
    const-string v7, "Share"

    .line 92
    .line 93
    invoke-direct {v0, v4, v5, v7}, LL1/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_6

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    new-instance v0, LL1/p;

    .line 105
    .line 106
    const-string v4, "fa fa-search"

    .line 107
    .line 108
    const-string v5, "Search"

    .line 109
    .line 110
    invoke-direct {v0, v6, v4, v5}, LL1/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :goto_0
    invoke-virtual {v0}, LL1/p;->a()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v0}, LL1/p;->b()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    check-cast v5, Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v0}, LL1/p;->c()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_7

    .line 136
    .line 137
    move-object v1, v0

    .line 138
    :cond_7
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    move-object v3, v5

    .line 145
    :cond_8
    new-instance v0, Ln0/a;

    .line 146
    .line 147
    iget-object v5, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 148
    .line 149
    iget v7, p0, Lm0/e;->g:I

    .line 150
    .line 151
    iget v8, p0, Lm0/e;->i:I

    .line 152
    .line 153
    invoke-direct {v0, v5, v3, v7, v8}, Ln0/a;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ln0/a;->a()Landroid/graphics/drawable/Drawable;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-interface {p1, v2, p3, v2, v1}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    const/4 p3, 0x1

    .line 169
    invoke-interface {p1, p3}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    const-string v1, "setShowAsActionFlags(...)"

    .line 174
    .line 175
    invoke-static {p1, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v4, v6}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_9

    .line 183
    .line 184
    invoke-static {p2}, LX1/k;->b(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-direct {p0, p1, p2, v0}, Lm0/e;->o(Landroid/view/MenuItem;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 188
    .line 189
    .line 190
    :cond_9
    iget-object p2, p0, Lm0/e;->f:Ljava/util/HashMap;

    .line 191
    .line 192
    invoke-interface {p2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    return p3

    .line 196
    :cond_a
    :goto_1
    return v2
.end method

.method private final n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/e;->k:Landroidx/appcompat/widget/SearchView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/appcompat/app/d;->invalidateOptionsMenu()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final o(Landroid/view/MenuItem;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    new-instance p3, Landroidx/appcompat/widget/SearchView;

    .line 2
    .line 3
    iget-object v0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-direct {p3, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroidx/appcompat/widget/Toolbar$g;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    const/4 v2, -0x2

    .line 12
    invoke-direct {v0, v1, v2}, Landroidx/appcompat/widget/Toolbar$g;-><init>(II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    const v0, 0x7fffffff

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3, v0}, Landroidx/appcompat/widget/SearchView;->setMaxWidth(I)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lm0/e$b;

    .line 25
    .line 26
    invoke-direct {v0, p0, p2}, Lm0/e$b;-><init>(Lm0/e;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, v0}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$m;)V

    .line 30
    .line 31
    .line 32
    new-instance p2, Lm0/a;

    .line 33
    .line 34
    invoke-direct {p2, p3, p0}, Lm0/a;-><init>(Landroidx/appcompat/widget/SearchView;Lm0/e;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3, p2}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 38
    .line 39
    .line 40
    const p2, 0x7f0901b7

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    check-cast p2, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 48
    .line 49
    if-eqz p2, :cond_0

    .line 50
    .line 51
    iget v0, p0, Lm0/e;->i:I

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 54
    .line 55
    .line 56
    iget v0, p0, Lm0/e;->i:I

    .line 57
    .line 58
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/16 v3, 0xc0

    .line 71
    .line 72
    invoke-static {v3, v1, v2, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 77
    .line 78
    .line 79
    :cond_0
    const p2, 0x7f0901b2

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    check-cast p2, Landroid/widget/ImageView;

    .line 87
    .line 88
    if-eqz p2, :cond_1

    .line 89
    .line 90
    iget v0, p0, Lm0/e;->i:I

    .line 91
    .line 92
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 93
    .line 94
    .line 95
    :cond_1
    iput-object p3, p0, Lm0/e;->k:Landroidx/appcompat/widget/SearchView;

    .line 96
    .line 97
    invoke-interface {p1, p3}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    .line 98
    .line 99
    .line 100
    const/16 p2, 0x9

    .line 101
    .line 102
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 103
    .line 104
    .line 105
    new-instance p2, Lm0/e$c;

    .line 106
    .line 107
    invoke-direct {p2, p0, p1}, Lm0/e$c;-><init>(Lm0/e;Landroid/view/MenuItem;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method private static final p(Landroidx/appcompat/widget/SearchView;Lm0/e;Landroid/view/View;Z)V
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->L()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    invoke-direct {p1}, Lm0/e;->n()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private final q(Ljava/lang/String;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    sparse-switch v0, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :sswitch_0
    const-string v0, "refresh"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p1, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 22
    .line 23
    invoke-virtual {p1}, Lco/median/android/MainActivity;->m()V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :sswitch_1
    const-string v0, "overflow"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-direct {p0}, Lm0/e;->E()V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :sswitch_2
    const-string v0, "share"

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object p1, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-virtual {p1, v0, v0}, Lco/median/android/MainActivity;->s3(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :sswitch_3
    const-string v0, "search"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    :cond_2
    :goto_0
    iget-object v0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 64
    .line 65
    invoke-virtual {v0}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0, p1, v1}, Lco/median/android/A;->d(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    return v1

    .line 73
    :cond_4
    const/4 p1, 0x0

    .line 74
    return p1

    .line 75
    :sswitch_data_0
    .sparse-switch
        -0x36059a58 -> :sswitch_3
        0x6854fdf -> :sswitch_2
        0x1f91b402 -> :sswitch_1
        0x40b292db -> :sswitch_0
    .end sparse-switch
.end method

.method private final r(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/e;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lm0/e;->q(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method private final t()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lm0/e;->m:Z

    .line 12
    .line 13
    return-void
.end method

.method private final u(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/e;->l:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return-void

    .line 9
    :cond_1
    invoke-static {v0, p1}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    :goto_0
    iput-object p1, p0, Lm0/e;->l:Ljava/lang/String;

    .line 16
    .line 17
    iget-object p1, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/appcompat/app/d;->invalidateOptionsMenu()V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
.end method

.method public static synthetic y(Lm0/e;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lm0/e;->x(Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Landroid/view/Menu;)V
    .locals 11

    .line 1
    const-string v0, "menu"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lm0/e;->j:Landroid/view/Menu;

    .line 7
    .line 8
    iget-object v0, p0, Lm0/e;->f:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, Lm0/e;->m:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lm0/e;->t()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 21
    .line 22
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, v0, Lo0/a;->w0:Ljava/util/Map;

    .line 27
    .line 28
    if-eqz v1, :cond_8

    .line 29
    .line 30
    iget-object v2, p0, Lm0/e;->l:Ljava/lang/String;

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_1
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lorg/json/JSONObject;

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const-string v2, "items"

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_8

    .line 52
    .line 53
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    const-string v3, "allowLeftMenu"

    .line 61
    .line 62
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    new-instance v3, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    const/4 v5, 0x0

    .line 76
    move v6, v5

    .line 77
    :goto_0
    if-ge v5, v4, :cond_7

    .line 78
    .line 79
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    sub-int/2addr v8, v5

    .line 88
    const/4 v9, 0x1

    .line 89
    if-nez v6, :cond_4

    .line 90
    .line 91
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-ne v10, v9, :cond_4

    .line 96
    .line 97
    if-le v8, v9, :cond_4

    .line 98
    .line 99
    move v6, v9

    .line 100
    :cond_4
    if-eqz v6, :cond_5

    .line 101
    .line 102
    invoke-static {v7}, LX1/k;->b(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    if-nez v5, :cond_6

    .line 110
    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    iget-boolean v8, p0, Lm0/e;->m:Z

    .line 114
    .line 115
    if-nez v8, :cond_6

    .line 116
    .line 117
    iget-boolean v8, v0, Lo0/a;->W:Z

    .line 118
    .line 119
    if-nez v8, :cond_6

    .line 120
    .line 121
    invoke-direct {p0, v7}, Lm0/e;->h(Lorg/json/JSONObject;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_6

    .line 126
    .line 127
    iput-boolean v9, p0, Lm0/e;->m:Z

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    invoke-direct {p0, p1, v5, v7}, Lm0/e;->j(Landroid/view/Menu;ILorg/json/JSONObject;)V

    .line 131
    .line 132
    .line 133
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_7
    invoke-direct {p0, p1, v3}, Lm0/e;->B(Landroid/view/Menu;Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    :goto_2
    return-void
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/e;->k:Landroidx/appcompat/widget/SearchView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lm0/e;->n()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public final m(Ljava/lang/String;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    invoke-static {p1}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    const/4 v0, 0x2

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {p0, p1, v1, v0, v2}, Lm0/e;->y(Lm0/e;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 17
    .line 18
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v3, v0, Lo0/a;->u0:Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object v0, v0, Lo0/a;->v0:Ljava/util/ArrayList;

    .line 25
    .line 26
    if-eqz v3, :cond_4

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    :goto_0
    if-ge v1, v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ljava/util/regex/Pattern;

    .line 42
    .line 43
    invoke-virtual {v4, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Ljava/lang/String;

    .line 58
    .line 59
    invoke-direct {p0, p1}, Lm0/e;->u(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    return-void

    .line 67
    :cond_4
    :goto_1
    invoke-direct {p0, v2}, Lm0/e;->u(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_5
    :goto_2
    return-void
.end method

.method public final s()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 8
    .line 9
    const v2, 0x7f0603d4

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iput v1, p0, Lm0/e;->i:I

    .line 17
    .line 18
    iget-object v1, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 19
    .line 20
    iget-object v2, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const v3, 0x7f060037

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    iget v1, p0, Lm0/e;->i:I

    .line 43
    .line 44
    sget-object v2, Lz/b;->m:Lz/b;

    .line 45
    .line 46
    invoke-static {v1, v2}, Lz/a;->a(ILz/b;)Landroid/graphics/ColorFilter;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lm0/e;->e:Landroid/widget/ImageView;

    .line 54
    .line 55
    iget-object v1, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 56
    .line 57
    const v2, 0x7f08009f

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2}, Le/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroidx/appcompat/app/d;->invalidateOptionsMenu()V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final v(ZLandroid/view/MenuItem;)V
    .locals 5

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/e;->j:Landroid/view/Menu;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/view/Menu;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_2

    .line 19
    .line 20
    invoke-interface {v0, v2}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "getItem(...)"

    .line 25
    .line 26
    invoke-static {v3, v4}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    if-ne v3, p2, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-interface {v3, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 33
    .line 34
    .line 35
    invoke-interface {v3, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 36
    .line 37
    .line 38
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_2
    return-void
.end method

.method public final w(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lm0/e;->e:Landroid/widget/ImageView;

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final x(Ljava/lang/String;Z)V
    .locals 12

    .line 1
    iget-object v0, p0, Lm0/e;->c:Landroidx/appcompat/app/a;

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    if-eqz p1, :cond_10

    .line 6
    .line 7
    invoke-static {p1}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_b

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 16
    .line 17
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lo0/a;->g(Ljava/lang/String;)Ljava/util/HashMap;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x1

    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    move v4, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v4, v3

    .line 32
    :goto_0
    iget-object v5, v0, Lo0/a;->u0:Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v6, v0, Lo0/a;->v0:Ljava/util/ArrayList;

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v5, :cond_4

    .line 38
    .line 39
    if-eqz v6, :cond_4

    .line 40
    .line 41
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    move v9, v3

    .line 46
    :goto_1
    if-ge v9, v8, :cond_4

    .line 47
    .line 48
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    const-string v11, "get(...)"

    .line 53
    .line 54
    invoke-static {v10, v11}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast v10, Ljava/util/regex/Pattern;

    .line 58
    .line 59
    invoke-virtual {v10, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-eqz v10, :cond_3

    .line 68
    .line 69
    iget-object v5, v0, Lo0/a;->w0:Ljava/util/Map;

    .line 70
    .line 71
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Lorg/json/JSONObject;

    .line 80
    .line 81
    if-eqz v5, :cond_2

    .line 82
    .line 83
    const-string v6, "items"

    .line 84
    .line 85
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    move-object v5, v7

    .line 91
    :goto_2
    if-eqz v5, :cond_4

    .line 92
    .line 93
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-lez v5, :cond_4

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move v2, v3

    .line 104
    :goto_3
    iget-boolean v5, v0, Lo0/a;->x0:Z

    .line 105
    .line 106
    if-nez v5, :cond_5

    .line 107
    .line 108
    iget-boolean v5, v0, Lo0/a;->W:Z

    .line 109
    .line 110
    if-nez v5, :cond_5

    .line 111
    .line 112
    if-nez v4, :cond_5

    .line 113
    .line 114
    if-nez v2, :cond_5

    .line 115
    .line 116
    iget-object p1, p0, Lm0/e;->c:Landroidx/appcompat/app/a;

    .line 117
    .line 118
    if-eqz p1, :cond_10

    .line 119
    .line 120
    invoke-virtual {p1}, Landroidx/appcompat/app/a;->l()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_5
    iget-object v2, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 125
    .line 126
    invoke-virtual {v2}, Lco/median/android/MainActivity;->X1()Lo0/h;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-interface {v2}, Lo0/h;->getTitle()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    if-eqz v2, :cond_6

    .line 135
    .line 136
    iget-object v2, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 137
    .line 138
    invoke-virtual {v2}, Lco/median/android/MainActivity;->X1()Lo0/h;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-interface {v2}, Lo0/h;->getTitle()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const-string v5, "getTitle(...)"

    .line 147
    .line 148
    :goto_4
    invoke-static {v2, v5}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_6
    iget-object v2, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 153
    .line 154
    const v5, 0x7f120024

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const-string v5, "getString(...)"

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :goto_5
    if-nez v4, :cond_7

    .line 165
    .line 166
    invoke-virtual {v0, p1}, Lo0/a;->t(Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    invoke-direct {p0, p1, v2}, Lm0/e;->D(ZLjava/lang/String;)V

    .line 171
    .line 172
    .line 173
    goto :goto_a

    .line 174
    :cond_7
    if-eqz v1, :cond_8

    .line 175
    .line 176
    const-string p1, "title"

    .line 177
    .line 178
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    goto :goto_6

    .line 183
    :cond_8
    move-object p1, v7

    .line 184
    :goto_6
    instance-of v0, p1, Ljava/lang/String;

    .line 185
    .line 186
    if-eqz v0, :cond_9

    .line 187
    .line 188
    check-cast p1, Ljava/lang/String;

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_9
    move-object p1, v7

    .line 192
    :goto_7
    if-nez p1, :cond_a

    .line 193
    .line 194
    const-string p1, ""

    .line 195
    .line 196
    :cond_a
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-nez v0, :cond_b

    .line 201
    .line 202
    if-nez p2, :cond_b

    .line 203
    .line 204
    goto :goto_b

    .line 205
    :cond_b
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    if-nez p2, :cond_c

    .line 210
    .line 211
    goto :goto_8

    .line 212
    :cond_c
    move-object v2, p1

    .line 213
    :goto_8
    iget-object p1, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 214
    .line 215
    invoke-virtual {p1, v2}, Lco/median/android/MainActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 216
    .line 217
    .line 218
    if-eqz v1, :cond_d

    .line 219
    .line 220
    const-string p1, "showImage"

    .line 221
    .line 222
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    goto :goto_9

    .line 227
    :cond_d
    move-object p1, v7

    .line 228
    :goto_9
    instance-of p2, p1, Ljava/lang/Boolean;

    .line 229
    .line 230
    if-eqz p2, :cond_e

    .line 231
    .line 232
    move-object v7, p1

    .line 233
    check-cast v7, Ljava/lang/Boolean;

    .line 234
    .line 235
    :cond_e
    if-eqz v7, :cond_f

    .line 236
    .line 237
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    :cond_f
    invoke-direct {p0, v3, v2}, Lm0/e;->D(ZLjava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :goto_a
    iget-object p1, p0, Lm0/e;->c:Landroidx/appcompat/app/a;

    .line 245
    .line 246
    if-eqz p1, :cond_10

    .line 247
    .line 248
    invoke-virtual {p1}, Landroidx/appcompat/app/a;->z()V

    .line 249
    .line 250
    .line 251
    :cond_10
    :goto_b
    return-void
.end method

.method public final z(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lm0/e;->b:Z

    .line 2
    .line 3
    iget-object v0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/d;->k0()Landroidx/appcompat/app/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iput-object v0, p0, Lm0/e;->c:Landroidx/appcompat/app/a;

    .line 13
    .line 14
    iget-object v0, p0, Lm0/e;->a:Lco/median/android/MainActivity;

    .line 15
    .line 16
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lm0/e;->c:Landroidx/appcompat/app/a;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-boolean p1, v0, Lo0/a;->W:Z

    .line 27
    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-virtual {v1, p1}, Landroidx/appcompat/app/a;->t(Z)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p1, 0x1

    .line 36
    invoke-virtual {v1, p1}, Landroidx/appcompat/app/a;->t(Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Landroidx/appcompat/app/a;->u(Z)V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_0
    iget-object p1, p0, Lm0/e;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 43
    .line 44
    new-instance v0, Lm0/c;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lm0/c;-><init>(Lm0/e;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Landroidx/appcompat/widget/Toolbar$h;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    iget v0, p0, Lm0/e;->i:I

    .line 59
    .line 60
    sget-object v1, Lz/b;->m:Lz/b;

    .line 61
    .line 62
    invoke-static {v0, v1}, Lz/a;->a(ILz/b;)Landroid/graphics/ColorFilter;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    :goto_1
    return-void
.end method
