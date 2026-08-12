.class public final Lm0/X;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lco/median/android/MainActivity;

.field private final b:Landroid/view/ViewGroup;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Z

.field private i:I


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rootLayout"

    .line 7
    .line 8
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lm0/X;->a:Lco/median/android/MainActivity;

    .line 15
    .line 16
    iput-object p2, p0, Lm0/X;->b:Landroid/view/ViewGroup;

    .line 17
    .line 18
    const-string p1, ""

    .line 19
    .line 20
    iput-object p1, p0, Lm0/X;->c:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Lm0/W;

    .line 27
    .line 28
    invoke-direct {p2, p0}, Lm0/W;-><init>(Lm0/X;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static synthetic a(Lm0/X;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lm0/X;->b(Lm0/X;)V

    return-void
.end method

.method private static final b(Lm0/X;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lm0/X;->b:Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lm0/X;->i:I

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lm0/X;->b:Landroid/view/ViewGroup;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 26
    .line 27
    sub-int/2addr v1, v2

    .line 28
    iput v1, p0, Lm0/X;->i:I

    .line 29
    .line 30
    :cond_0
    iget-object v1, p0, Lm0/X;->b:Landroid/view/ViewGroup;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iput v1, p0, Lm0/X;->f:I

    .line 41
    .line 42
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 43
    .line 44
    iget v1, p0, Lm0/X;->i:I

    .line 45
    .line 46
    add-int/2addr v0, v1

    .line 47
    iput v0, p0, Lm0/X;->g:I

    .line 48
    .line 49
    iget-object v0, p0, Lm0/X;->b:Landroid/view/ViewGroup;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget v1, p0, Lm0/X;->g:I

    .line 60
    .line 61
    sub-int/2addr v0, v1

    .line 62
    iput v0, p0, Lm0/X;->e:I

    .line 63
    .line 64
    iget v1, p0, Lm0/X;->i:I

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    if-ne v0, v1, :cond_1

    .line 68
    .line 69
    iput v2, p0, Lm0/X;->e:I

    .line 70
    .line 71
    :cond_1
    iget v0, p0, Lm0/X;->e:I

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    iget v0, p0, Lm0/X;->f:I

    .line 76
    .line 77
    iput v0, p0, Lm0/X;->d:I

    .line 78
    .line 79
    iget-boolean v0, p0, Lm0/X;->h:Z

    .line 80
    .line 81
    if-nez v0, :cond_3

    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Lm0/X;->h:Z

    .line 85
    .line 86
    invoke-direct {p0}, Lm0/X;->d()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    iput v2, p0, Lm0/X;->d:I

    .line 91
    .line 92
    iget-boolean v0, p0, Lm0/X;->h:Z

    .line 93
    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    iput-boolean v2, p0, Lm0/X;->h:Z

    .line 97
    .line 98
    invoke-direct {p0}, Lm0/X;->d()V

    .line 99
    .line 100
    .line 101
    :cond_3
    return-void
.end method

.method private final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/X;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lm0/X;->a:Lco/median/android/MainActivity;

    .line 11
    .line 12
    iget-object v1, p0, Lm0/X;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p0}, Lm0/X;->c()Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v1, v2}, Lo0/j;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final c()Lorg/json/JSONObject;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lm0/X;->d:I

    .line 7
    .line 8
    const-string v2, "width"

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    iget v1, p0, Lm0/X;->e:I

    .line 14
    .line 15
    const-string v3, "height"

    .line 16
    .line 17
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    new-instance v1, Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 23
    .line 24
    .line 25
    iget v4, p0, Lm0/X;->f:I

    .line 26
    .line 27
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    iget v2, p0, Lm0/X;->g:I

    .line 31
    .line 32
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    new-instance v2, Lorg/json/JSONObject;

    .line 36
    .line 37
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "visible"

    .line 41
    .line 42
    iget-boolean v4, p0, Lm0/X;->h:Z

    .line 43
    .line 44
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    const-string v3, "keyboardWindowSize"

    .line 48
    .line 49
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    const-string v0, "visibleWindowSize"

    .line 53
    .line 54
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    return-object v2
.end method
