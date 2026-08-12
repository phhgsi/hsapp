.class public Lm0/V;
.super Landroid/widget/BaseExpandableListAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ExpandableListView$OnGroupClickListener;
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


# static fields
.field private static final l:Ljava/lang/String; = "m0.V"


# instance fields
.field private final a:Lco/median/android/MainActivity;

.field private final b:Landroid/widget/ExpandableListView;

.field private final c:I

.field private final d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Lorg/json/JSONArray;

.field private i:Z

.field private j:Z

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method constructor <init>(Lco/median/android/MainActivity;Landroid/widget/ExpandableListView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lm0/V;->i:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lm0/V;->j:Z

    .line 8
    .line 9
    iput-object p1, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    new-instance v0, Lorg/json/JSONArray;

    .line 12
    .line 13
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const v1, 0x7f0a004d

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lm0/V;->c:I

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const v1, 0x7f0a004c

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Lm0/V;->d:I

    .line 43
    .line 44
    iput-object p2, p0, Lm0/V;->b:Landroid/widget/ExpandableListView;

    .line 45
    .line 46
    const v0, 0x7f0603c2

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v0}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iput v0, p0, Lm0/V;->f:I

    .line 54
    .line 55
    const v0, 0x7f0603c1

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v0}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p0, Lm0/V;->g:I

    .line 63
    .line 64
    const v0, 0x7f0603c3

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v0}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iput p1, p0, Lm0/V;->e:I

    .line 72
    .line 73
    invoke-virtual {p2, p0}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p0}, Landroid/widget/ExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, p0}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x5

    .line 83
    invoke-virtual {p2, p1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method private b()Landroid/graphics/drawable/RippleDrawable;
    .locals 4

    .line 1
    invoke-direct {p0}, Lm0/V;->c()Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 8
    .line 9
    .line 10
    const v2, 0x10102fe

    .line 11
    .line 12
    .line 13
    filled-new-array {v2}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    const v2, 0x10100a1

    .line 21
    .line 22
    .line 23
    filled-new-array {v2}, [I

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Lm0/V;->d()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 39
    .line 40
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 41
    .line 42
    .line 43
    const/high16 v3, 0x42c80000    # 100.0f

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 49
    .line 50
    .line 51
    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    .line 52
    .line 53
    invoke-direct {v3, v0, v1, v2}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    return-object v3
.end method

.method private c()Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x42c80000    # 100.0f

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lm0/V;->e:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x64

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method private d()I
    .locals 7

    .line 1
    iget-object v0, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/e1;->d(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const v0, 0x3e4ccccd    # 0.2f

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const v0, -0x41b33333    # -0.2f

    .line 14
    .line 15
    .line 16
    :goto_0
    iget v1, p0, Lm0/V;->g:I

    .line 17
    .line 18
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget v2, p0, Lm0/V;->g:I

    .line 23
    .line 24
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget v3, p0, Lm0/V;->g:I

    .line 29
    .line 30
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget v4, p0, Lm0/V;->g:I

    .line 35
    .line 36
    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x0

    .line 41
    cmpl-float v5, v0, v5

    .line 42
    .line 43
    if-lez v5, :cond_1

    .line 44
    .line 45
    int-to-float v5, v2

    .line 46
    const/16 v6, 0xff

    .line 47
    .line 48
    rsub-int v2, v2, 0xff

    .line 49
    .line 50
    int-to-float v2, v2

    .line 51
    mul-float/2addr v2, v0

    .line 52
    add-float/2addr v5, v2

    .line 53
    float-to-int v2, v5

    .line 54
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    int-to-float v5, v3

    .line 59
    rsub-int v3, v3, 0xff

    .line 60
    .line 61
    int-to-float v3, v3

    .line 62
    mul-float/2addr v3, v0

    .line 63
    add-float/2addr v5, v3

    .line 64
    float-to-int v3, v5

    .line 65
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    int-to-float v5, v4

    .line 70
    rsub-int v4, v4, 0xff

    .line 71
    .line 72
    int-to-float v4, v4

    .line 73
    mul-float/2addr v4, v0

    .line 74
    add-float/2addr v5, v4

    .line 75
    float-to-int v0, v5

    .line 76
    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    int-to-float v2, v2

    .line 82
    const/high16 v5, 0x3f800000    # 1.0f

    .line 83
    .line 84
    add-float/2addr v0, v5

    .line 85
    mul-float/2addr v2, v0

    .line 86
    float-to-int v2, v2

    .line 87
    const/4 v5, 0x0

    .line 88
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    int-to-float v3, v3

    .line 93
    mul-float/2addr v3, v0

    .line 94
    float-to-int v3, v3

    .line 95
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    int-to-float v4, v4

    .line 100
    mul-float/2addr v4, v0

    .line 101
    float-to-int v0, v4

    .line 102
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    :goto_1
    invoke-static {v1, v2, v3, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    return v0
.end method

.method private e(I)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "label"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lm0/V;->j(Ljava/lang/String;I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method private f(II)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "label"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, Lm0/V;->k(Ljava/lang/String;II)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method private g(I)Landroid/util/Pair;
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lm0/V;->j(Ljava/lang/String;I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "javascript"

    .line 8
    .line 9
    invoke-direct {p0, v1, p1}, Lm0/V;->j(Ljava/lang/String;I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v1, Landroid/util/Pair;

    .line 14
    .line 15
    invoke-direct {v1, v0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object v1
.end method

.method private h(II)Landroid/util/Pair;
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, Lm0/V;->k(Ljava/lang/String;II)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "javascript"

    .line 8
    .line 9
    invoke-direct {p0, v1, p1, p2}, Lm0/V;->k(Ljava/lang/String;II)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance p2, Landroid/util/Pair;

    .line 14
    .line 15
    invoke-direct {p2, v0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p2
.end method

.method private i(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 3
    .line 4
    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lorg/json/JSONObject;

    .line 9
    .line 10
    const-string v1, "isGrouping"

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return p1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget-object v2, Lm0/V;->l:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v1, v2, v3, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return v0
.end method

.method private j(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-object p1

    .line 24
    :catch_0
    move-exception p1

    .line 25
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    sget-object v0, Lm0/V;->l:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p2, v0, v1, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    return-object p1
.end method

.method private k(Ljava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lorg/json/JSONObject;

    .line 8
    .line 9
    const-string v0, "subLinks"

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2, p3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-nez p3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-object p1

    .line 34
    :catch_0
    move-exception p1

    .line 35
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    sget-object p3, Lm0/V;->l:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p2, p3, v0, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    const/4 p1, 0x0

    .line 49
    return-object p1
.end method

.method private l(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lm0/f1;->a()Lm0/f1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lm0/f1;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lm0/f1;->a()Lm0/f1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lm0/f1;->b()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "GONATIVE_USERID"

    .line 20
    .line 21
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_0
    const/4 v0, 0x1

    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    iget-object p2, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 29
    .line 30
    invoke-virtual {p2}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2, p1, v0}, Lco/median/android/A;->d(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v1, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 39
    .line 40
    invoke-virtual {v1}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-virtual {v1, p1, p2, v0, v2}, Lco/median/android/A;->f(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iget-object p1, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 49
    .line 50
    invoke-virtual {p1}, Lco/median/android/MainActivity;->w1()V

    .line 51
    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "/$"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v2, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    iget-object v3, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 16
    .line 17
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ge v2, v3, :cond_2

    .line 22
    .line 23
    iget-object v3, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-string v4, "url"

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    iget-object p1, p0, Lm0/V;->b:Landroid/widget/ExpandableListView;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-virtual {p1, v2, v0}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 49
    .line 50
    .line 51
    iput v2, p0, Lm0/V;->k:I

    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    return-void
.end method

.method public getChild(II)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public getChildId(II)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    return-wide p1
.end method

.method public getChildType(II)I
    .locals 0

    .line 1
    iget-boolean p1, p0, Lm0/V;->i:Z

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Lm0/V;->j:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public getChildTypeCount()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 1
    const/4 p3, 0x0

    .line 2
    if-nez p4, :cond_2

    .line 3
    .line 4
    iget-object p4, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 5
    .line 6
    invoke-virtual {p4}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    iget-boolean v0, p0, Lm0/V;->i:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-boolean v0, p0, Lm0/V;->j:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const v0, 0x7f0c004b

    .line 20
    .line 21
    .line 22
    invoke-virtual {p4, v0, p5, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const v0, 0x7f0c004a

    .line 28
    .line 29
    .line 30
    invoke-virtual {p4, v0, p5, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    :cond_2
    :goto_1
    const p5, 0x7f09012d

    .line 35
    .line 36
    .line 37
    invoke-virtual {p4, p5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object p5

    .line 41
    check-cast p5, Landroid/widget/RelativeLayout;

    .line 42
    .line 43
    invoke-direct {p0}, Lm0/V;->b()Landroid/graphics/drawable/RippleDrawable;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p5, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    iget-object p5, p0, Lm0/V;->b:Landroid/widget/ExpandableListView;

    .line 51
    .line 52
    invoke-static {p1, p2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    invoke-virtual {p5, v0, v1}, Landroid/widget/ExpandableListView;->getFlatListPosition(J)I

    .line 57
    .line 58
    .line 59
    move-result p5

    .line 60
    iget v0, p0, Lm0/V;->k:I

    .line 61
    .line 62
    if-ne v0, p5, :cond_3

    .line 63
    .line 64
    const/4 p5, 0x1

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move p5, p3

    .line 67
    :goto_2
    if-eqz p5, :cond_4

    .line 68
    .line 69
    iget v0, p0, Lm0/V;->e:I

    .line 70
    .line 71
    const-string v1, "activeIcon"

    .line 72
    .line 73
    invoke-direct {p0, v1, p1, p2}, Lm0/V;->k(Ljava/lang/String;II)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    iget v0, p0, Lm0/V;->f:I

    .line 79
    .line 80
    const-string v1, "inactiveIcon"

    .line 81
    .line 82
    invoke-direct {p0, v1, p1, p2}, Lm0/V;->k(Ljava/lang/String;II)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :goto_3
    if-eqz v1, :cond_5

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    :cond_5
    const-string v1, "icon"

    .line 95
    .line 96
    invoke-direct {p0, v1, p1, p2}, Lm0/V;->k(Ljava/lang/String;II)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :cond_6
    const v2, 0x7f09012f

    .line 101
    .line 102
    .line 103
    invoke-virtual {p4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Landroid/widget/TextView;

    .line 108
    .line 109
    invoke-direct {p0, p1, p2}, Lm0/V;->f(II)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 117
    .line 118
    .line 119
    const-string p1, "sans-serif-medium"

    .line 120
    .line 121
    invoke-static {p1, p5}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 126
    .line 127
    .line 128
    const p1, 0x7f09012e

    .line 129
    .line 130
    .line 131
    invoke-virtual {p4, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Landroid/widget/ImageView;

    .line 136
    .line 137
    if-eqz p1, :cond_8

    .line 138
    .line 139
    if-eqz v1, :cond_7

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    if-nez p2, :cond_7

    .line 146
    .line 147
    new-instance p2, Ln0/a;

    .line 148
    .line 149
    iget-object p5, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 150
    .line 151
    iget v2, p0, Lm0/V;->c:I

    .line 152
    .line 153
    invoke-direct {p2, p5, v1, v2, v0}, Ln0/a;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2}, Ln0/a;->a()Landroid/graphics/drawable/Drawable;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 164
    .line 165
    .line 166
    return-object p4

    .line 167
    :cond_7
    const/4 p2, 0x4

    .line 168
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 169
    .line 170
    .line 171
    :cond_8
    return-object p4
.end method

.method public getChildrenCount(I)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 3
    .line 4
    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lorg/json/JSONObject;

    .line 9
    .line 10
    const-string v1, "isGrouping"

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const-string v1, "subLinks"

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 25
    .line 26
    .line 27
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return p1

    .line 29
    :catch_0
    move-exception p1

    .line 30
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lm0/V;->l:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v1, v2, v3, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return v0
.end method

.method public getGroup(I)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public getGroupCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getGroupId(I)J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method

.method public getGroupType(I)I
    .locals 0

    .line 1
    iget-boolean p1, p0, Lm0/V;->i:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x1

    .line 8
    return p1
.end method

.method public getGroupTypeCount()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    iget-object p3, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-virtual {p3}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    iget-boolean p4, p0, Lm0/V;->i:Z

    .line 10
    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    const p4, 0x7f0c004c

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const p4, 0x7f0c004d

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p3, p4, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    :cond_1
    const p4, 0x7f09012d

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    check-cast p4, Landroid/widget/RelativeLayout;

    .line 33
    .line 34
    invoke-direct {p0}, Lm0/V;->b()Landroid/graphics/drawable/RippleDrawable;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 39
    .line 40
    .line 41
    iget p4, p0, Lm0/V;->k:I

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    if-ne p4, p1, :cond_2

    .line 45
    .line 46
    const/4 p4, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move p4, v0

    .line 49
    :goto_1
    if-eqz p4, :cond_3

    .line 50
    .line 51
    iget v1, p0, Lm0/V;->e:I

    .line 52
    .line 53
    const-string v2, "activeIcon"

    .line 54
    .line 55
    invoke-direct {p0, v2, p1}, Lm0/V;->j(Ljava/lang/String;I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    iget v1, p0, Lm0/V;->f:I

    .line 61
    .line 62
    const-string v2, "inactiveIcon"

    .line 63
    .line 64
    invoke-direct {p0, v2, p1}, Lm0/V;->j(Ljava/lang/String;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :goto_2
    if-eqz v2, :cond_4

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_5

    .line 75
    .line 76
    :cond_4
    const-string v2, "icon"

    .line 77
    .line 78
    invoke-direct {p0, v2, p1}, Lm0/V;->j(Ljava/lang/String;I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    :cond_5
    const v3, 0x7f09012c

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-direct {p0, p1}, Lm0/V;->i(I)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_7

    .line 96
    .line 97
    if-eqz p2, :cond_6

    .line 98
    .line 99
    const-string p2, "fas fa-angle-up"

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    const-string p2, "fas fa-angle-down"

    .line 103
    .line 104
    :goto_3
    new-instance v4, Ln0/a;

    .line 105
    .line 106
    iget-object v5, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 107
    .line 108
    iget v6, p0, Lm0/V;->d:I

    .line 109
    .line 110
    invoke-direct {v4, v5, p2, v6, v1}, Ln0/a;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Ln0/a;->a()Landroid/graphics/drawable/Drawable;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    const/16 p2, 0x8

    .line 125
    .line 126
    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 127
    .line 128
    .line 129
    :goto_4
    const p2, 0x7f09012f

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    check-cast p2, Landroid/widget/TextView;

    .line 137
    .line 138
    invoke-direct {p0, p1}, Lm0/V;->e(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 146
    .line 147
    .line 148
    const-string p1, "sans-serif-medium"

    .line 149
    .line 150
    invoke-static {p1, p4}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 155
    .line 156
    .line 157
    const p1, 0x7f09012e

    .line 158
    .line 159
    .line 160
    invoke-virtual {p3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    check-cast p1, Landroid/widget/ImageView;

    .line 165
    .line 166
    if-eqz p1, :cond_9

    .line 167
    .line 168
    if-eqz v2, :cond_8

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-nez p2, :cond_8

    .line 175
    .line 176
    new-instance p2, Ln0/a;

    .line 177
    .line 178
    iget-object p4, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 179
    .line 180
    iget v3, p0, Lm0/V;->c:I

    .line 181
    .line 182
    invoke-direct {p2, p4, v2, v3, v1}, Ln0/a;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2}, Ln0/a;->a()Landroid/graphics/drawable/Drawable;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 193
    .line 194
    .line 195
    return-object p3

    .line 196
    :cond_8
    const/4 p2, 0x4

    .line 197
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 198
    .line 199
    .line 200
    :cond_9
    return-object p3
.end method

.method public hasStableIds()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public m()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const v2, 0x7f0603c2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iput v1, p0, Lm0/V;->f:I

    .line 21
    .line 22
    iget-object v1, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const v2, 0x7f0603c1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput v1, p0, Lm0/V;->g:I

    .line 36
    .line 37
    iget-object v1, p0, Lm0/V;->a:Lco/median/android/MainActivity;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const v2, 0x7f0603c3

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iput v0, p0, Lm0/V;->e:I

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/widget/BaseExpandableListAdapter;->notifyDataSetChanged()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public declared-synchronized n(Lorg/json/JSONArray;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    new-instance p1, Lorg/json/JSONArray;

    .line 7
    .line 8
    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto/16 :goto_5

    .line 16
    .line 17
    :cond_0
    :goto_0
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Lm0/V;->i:Z

    .line 19
    .line 20
    iput-boolean p1, p0, Lm0/V;->j:Z

    .line 21
    .line 22
    move v0, p1

    .line 23
    :goto_1
    iget-object v1, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 24
    .line 25
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-ge v0, v1, :cond_7

    .line 30
    .line 31
    iget-object v1, p0, Lm0/V;->h:Lorg/json/JSONArray;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_1
    const-string v2, "icon"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "activeIcon"

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    const/4 v4, 0x1

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_3

    .line 64
    .line 65
    :cond_2
    iput-boolean v4, p0, Lm0/V;->i:Z

    .line 66
    .line 67
    :cond_3
    const-string v2, "isGrouping"

    .line 68
    .line 69
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_6

    .line 74
    .line 75
    const-string v2, "subLinks"

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_6

    .line 82
    .line 83
    move v2, p1

    .line 84
    :goto_2
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-ge v2, v3, :cond_6

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const-string v5, "icon"

    .line 95
    .line 96
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    const-string v6, "activeIcon"

    .line 101
    .line 102
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_5

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-nez v3, :cond_4

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    :goto_3
    iput-boolean v4, p0, Lm0/V;->j:Z

    .line 123
    .line 124
    :cond_6
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_7
    invoke-virtual {p0}, Landroid/widget/BaseExpandableListAdapter;->notifyDataSetChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    .line 129
    .line 130
    monitor-exit p0

    .line 131
    return-void

    .line 132
    :goto_5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    throw p1
.end method

.method public onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 0

    .line 1
    invoke-static {p3, p4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 2
    .line 3
    .line 4
    move-result-wide p5

    .line 5
    invoke-virtual {p1, p5, p6}, Landroid/widget/ExpandableListView;->getFlatListPosition(J)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 p5, 0x1

    .line 10
    invoke-virtual {p1, p2, p5}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 11
    .line 12
    .line 13
    iput p2, p0, Lm0/V;->k:I

    .line 14
    .line 15
    invoke-direct {p0, p3, p4}, Lm0/V;->h(II)Landroid/util/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/String;

    .line 22
    .line 23
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {p0, p2, p1}, Lm0/V;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return p5
.end method

.method public onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_0
    invoke-direct {p0, p3}, Lm0/V;->i(I)Z

    .line 3
    .line 4
    .line 5
    move-result p2

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    invoke-direct {p0, p3}, Lm0/V;->g(I)Landroid/util/Pair;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object p3, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p3, Ljava/lang/String;

    .line 16
    .line 17
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/String;

    .line 20
    .line 21
    invoke-direct {p0, p3, p2}, Lm0/V;->l(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :catch_0
    move-exception p2

    .line 27
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    sget-object p4, Lm0/V;->l:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p5

    .line 37
    invoke-virtual {p3, p4, p5, p2}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 38
    .line 39
    .line 40
    return p1
.end method
