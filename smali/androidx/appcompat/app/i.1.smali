.class Landroidx/appcompat/app/i;
.super Landroidx/appcompat/app/g;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/e$a;
.implements Landroid/view/LayoutInflater$Factory2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/i$m;,
        Landroidx/appcompat/app/i$n;,
        Landroidx/appcompat/app/i$g;,
        Landroidx/appcompat/app/i$p;,
        Landroidx/appcompat/app/i$s;,
        Landroidx/appcompat/app/i$i;,
        Landroidx/appcompat/app/i$r;,
        Landroidx/appcompat/app/i$t;,
        Landroidx/appcompat/app/i$h;,
        Landroidx/appcompat/app/i$j;,
        Landroidx/appcompat/app/i$k;,
        Landroidx/appcompat/app/i$q;,
        Landroidx/appcompat/app/i$o;,
        Landroidx/appcompat/app/i$f;,
        Landroidx/appcompat/app/i$l;
    }
.end annotation


# static fields
.field private static final j0:Landroidx/collection/i;

.field private static final k0:Z

.field private static final l0:[I

.field private static final m0:Z


# instance fields
.field private A:Z

.field B:Landroid/view/ViewGroup;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/view/View;

.field private E:Z

.field private F:Z

.field G:Z

.field H:Z

.field I:Z

.field J:Z

.field K:Z

.field private L:Z

.field private M:[Landroidx/appcompat/app/i$s;

.field private N:Landroidx/appcompat/app/i$s;

.field private O:Z

.field private P:Z

.field private Q:Z

.field R:Z

.field private S:Landroid/content/res/Configuration;

.field private T:I

.field private U:I

.field private V:I

.field private W:Z

.field private X:Landroidx/appcompat/app/i$p;

.field private Y:Landroidx/appcompat/app/i$p;

.field Z:Z

.field a0:I

.field private final b0:Ljava/lang/Runnable;

.field private c0:Z

.field private d0:Landroid/graphics/Rect;

.field private e0:Landroid/graphics/Rect;

.field private f0:Landroidx/appcompat/app/z;

.field private g0:Landroidx/appcompat/app/B;

.field private h0:Landroid/window/OnBackInvokedDispatcher;

.field private i0:Landroid/window/OnBackInvokedCallback;

.field final j:Ljava/lang/Object;

.field final k:Landroid/content/Context;

.field l:Landroid/view/Window;

.field private m:Landroidx/appcompat/app/i$n;

.field final n:Landroidx/appcompat/app/e;

.field o:Landroidx/appcompat/app/a;

.field p:Landroid/view/MenuInflater;

.field private q:Ljava/lang/CharSequence;

.field private r:Landroidx/appcompat/widget/G;

.field private s:Landroidx/appcompat/app/i$h;

.field private t:Landroidx/appcompat/app/i$t;

.field u:Landroidx/appcompat/view/b;

.field v:Landroidx/appcompat/widget/ActionBarContextView;

.field w:Landroid/widget/PopupWindow;

.field x:Ljava/lang/Runnable;

.field y:LJ/e0;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/collection/i;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/collection/i;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/appcompat/app/i;->j0:Landroidx/collection/i;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-boolean v0, Landroidx/appcompat/app/i;->k0:Z

    .line 10
    .line 11
    const v0, 0x1010054

    .line 12
    .line 13
    .line 14
    filled-new-array {v0}, [I

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Landroidx/appcompat/app/i;->l0:[I

    .line 19
    .line 20
    const-string v0, "robolectric"

    .line 21
    .line 22
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    xor-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    sput-boolean v0, Landroidx/appcompat/app/i;->m0:Z

    .line 31
    .line 32
    return-void
.end method

.method constructor <init>(Landroid/app/Activity;Landroidx/appcompat/app/e;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, p2, p1}, Landroidx/appcompat/app/i;-><init>(Landroid/content/Context;Landroid/view/Window;Landroidx/appcompat/app/e;Ljava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Landroid/app/Dialog;Landroidx/appcompat/app/e;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-direct {p0, v0, v1, p2, p1}, Landroidx/appcompat/app/i;-><init>(Landroid/content/Context;Landroid/view/Window;Landroidx/appcompat/app/e;Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/view/Window;Landroidx/appcompat/app/e;Ljava/lang/Object;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Landroidx/appcompat/app/g;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Landroidx/appcompat/app/i;->y:LJ/e0;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/appcompat/app/i;->z:Z

    const/16 v0, -0x64

    .line 6
    iput v0, p0, Landroidx/appcompat/app/i;->T:I

    .line 7
    new-instance v1, Landroidx/appcompat/app/i$a;

    invoke-direct {v1, p0}, Landroidx/appcompat/app/i$a;-><init>(Landroidx/appcompat/app/i;)V

    iput-object v1, p0, Landroidx/appcompat/app/i;->b0:Ljava/lang/Runnable;

    .line 8
    iput-object p1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 9
    iput-object p3, p0, Landroidx/appcompat/app/i;->n:Landroidx/appcompat/app/e;

    .line 10
    iput-object p4, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 11
    iget p1, p0, Landroidx/appcompat/app/i;->T:I

    if-ne p1, v0, :cond_0

    instance-of p1, p4, Landroid/app/Dialog;

    if-eqz p1, :cond_0

    .line 12
    invoke-direct {p0}, Landroidx/appcompat/app/i;->c1()Landroidx/appcompat/app/d;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {p1}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/g;->q()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/app/i;->T:I

    .line 14
    :cond_0
    iget p1, p0, Landroidx/appcompat/app/i;->T:I

    if-ne p1, v0, :cond_1

    .line 15
    sget-object p1, Landroidx/appcompat/app/i;->j0:Landroidx/collection/i;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroidx/collection/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_1

    .line 16
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iput p3, p0, Landroidx/appcompat/app/i;->T:I

    .line 17
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroidx/collection/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p2, :cond_2

    .line 18
    invoke-direct {p0, p2}, Landroidx/appcompat/app/i;->X(Landroid/view/Window;)V

    .line 19
    :cond_2
    invoke-static {}, Landroidx/appcompat/widget/j;->h()V

    return-void
.end method

.method private A0(Landroidx/appcompat/app/i$s;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->q0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/i$s;->d(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroidx/appcompat/app/i$r;

    .line 9
    .line 10
    iget-object v1, p1, Landroidx/appcompat/app/i$s;->l:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/app/i$r;-><init>(Landroidx/appcompat/app/i;Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p1, Landroidx/appcompat/app/i$s;->g:Landroid/view/ViewGroup;

    .line 16
    .line 17
    const/16 v0, 0x51

    .line 18
    .line 19
    iput v0, p1, Landroidx/appcompat/app/i$s;->c:I

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1
.end method

.method private B0(Landroidx/appcompat/app/i$s;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 2
    .line 3
    iget v1, p1, Landroidx/appcompat/app/i$s;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/16 v3, 0x6c

    .line 9
    .line 10
    if-ne v1, v3, :cond_4

    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 13
    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    new-instance v1, Landroid/util/TypedValue;

    .line 17
    .line 18
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget v4, Ld/a;->d:I

    .line 26
    .line 27
    invoke-virtual {v3, v4, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 28
    .line 29
    .line 30
    iget v4, v1, Landroid/util/TypedValue;->resourceId:I

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 43
    .line 44
    .line 45
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    .line 46
    .line 47
    invoke-virtual {v4, v5, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 48
    .line 49
    .line 50
    sget v5, Ld/a;->e:I

    .line 51
    .line 52
    invoke-virtual {v4, v5, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    sget v4, Ld/a;->e:I

    .line 57
    .line 58
    invoke-virtual {v3, v4, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 59
    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    :goto_0
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    .line 63
    .line 64
    if-eqz v5, :cond_3

    .line 65
    .line 66
    if-nez v4, :cond_2

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    .line 80
    .line 81
    invoke-virtual {v4, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 82
    .line 83
    .line 84
    :cond_3
    if-eqz v4, :cond_4

    .line 85
    .line 86
    new-instance v1, Landroidx/appcompat/view/d;

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    invoke-direct {v1, v0, v3}, Landroidx/appcompat/view/d;-><init>(Landroid/content/Context;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 97
    .line 98
    .line 99
    move-object v0, v1

    .line 100
    :cond_4
    new-instance v1, Landroidx/appcompat/view/menu/e;

    .line 101
    .line 102
    invoke-direct {v1, v0}, Landroidx/appcompat/view/menu/e;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p0}, Landroidx/appcompat/view/menu/e;->W(Landroidx/appcompat/view/menu/e$a;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v1}, Landroidx/appcompat/app/i$s;->c(Landroidx/appcompat/view/menu/e;)V

    .line 109
    .line 110
    .line 111
    return v2
.end method

.method private C0(I)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/app/i;->a0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-int p1, v1, p1

    .line 5
    .line 6
    or-int/2addr p1, v0

    .line 7
    iput p1, p0, Landroidx/appcompat/app/i;->a0:I

    .line 8
    .line 9
    iget-boolean p1, p0, Landroidx/appcompat/app/i;->Z:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Landroidx/appcompat/app/i;->b0:Ljava/lang/Runnable;

    .line 20
    .line 21
    invoke-static {p1, v0}, LJ/W;->a0(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    iput-boolean v1, p0, Landroidx/appcompat/app/i;->Z:Z

    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method private H0(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-boolean v0, p1, Landroidx/appcompat/app/i$s;->o:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/app/i;->R0(Landroidx/appcompat/app/i$s;Landroid/view/KeyEvent;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method private K0(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez p1, :cond_2

    .line 13
    .line 14
    iget-object p1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    invoke-interface {p1}, Landroidx/appcompat/widget/G;->h()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 25
    .line 26
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 37
    .line 38
    invoke-interface {p1}, Landroidx/appcompat/widget/G;->b()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    iget-boolean p1, p0, Landroidx/appcompat/app/i;->R:Z

    .line 45
    .line 46
    if-nez p1, :cond_5

    .line 47
    .line 48
    invoke-direct {p0, v2, p2}, Landroidx/appcompat/app/i;->R0(Landroidx/appcompat/app/i$s;Landroid/view/KeyEvent;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    iget-object p1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 55
    .line 56
    invoke-interface {p1}, Landroidx/appcompat/widget/G;->g()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    goto :goto_2

    .line 61
    :cond_1
    iget-object p1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 62
    .line 63
    invoke-interface {p1}, Landroidx/appcompat/widget/G;->f()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    iget-boolean p1, v2, Landroidx/appcompat/app/i$s;->o:Z

    .line 69
    .line 70
    if-nez p1, :cond_6

    .line 71
    .line 72
    iget-boolean v3, v2, Landroidx/appcompat/app/i$s;->n:Z

    .line 73
    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    iget-boolean p1, v2, Landroidx/appcompat/app/i$s;->m:Z

    .line 78
    .line 79
    if-eqz p1, :cond_5

    .line 80
    .line 81
    iget-boolean p1, v2, Landroidx/appcompat/app/i$s;->r:Z

    .line 82
    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    iput-boolean v1, v2, Landroidx/appcompat/app/i$s;->m:Z

    .line 86
    .line 87
    invoke-direct {p0, v2, p2}, Landroidx/appcompat/app/i;->R0(Landroidx/appcompat/app/i$s;Landroid/view/KeyEvent;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    goto :goto_0

    .line 92
    :cond_4
    move p1, v0

    .line 93
    :goto_0
    if-eqz p1, :cond_5

    .line 94
    .line 95
    invoke-direct {p0, v2, p2}, Landroidx/appcompat/app/i;->O0(Landroidx/appcompat/app/i$s;Landroid/view/KeyEvent;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    move v0, v1

    .line 100
    goto :goto_2

    .line 101
    :cond_6
    :goto_1
    invoke-virtual {p0, v2, v0}, Landroidx/appcompat/app/i;->e0(Landroidx/appcompat/app/i$s;Z)V

    .line 102
    .line 103
    .line 104
    move v0, p1

    .line 105
    :goto_2
    if-eqz v0, :cond_8

    .line 106
    .line 107
    iget-object p1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string p2, "audio"

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Landroid/media/AudioManager;

    .line 120
    .line 121
    if-eqz p1, :cond_7

    .line 122
    .line 123
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 124
    .line 125
    .line 126
    return v0

    .line 127
    :cond_7
    const-string p1, "AppCompatDelegate"

    .line 128
    .line 129
    const-string p2, "Couldn\'t get audio manager"

    .line 130
    .line 131
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    :cond_8
    return v0
.end method

.method private O0(Landroidx/appcompat/app/i$s;Landroid/view/KeyEvent;)V
    .locals 11

    .line 1
    iget-boolean v0, p1, Landroidx/appcompat/app/i$s;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->R:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    iget v0, p1, Landroidx/appcompat/app/i$s;->a:I

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 26
    .line 27
    and-int/lit8 v0, v0, 0xf

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    if-ne v0, v1, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->x0()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x1

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget v2, p1, Landroidx/appcompat/app/i$s;->a:I

    .line 41
    .line 42
    iget-object v3, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 43
    .line 44
    invoke-interface {v0, v2, v3}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, p1, v1}, Landroidx/appcompat/app/i;->e0(Landroidx/appcompat/app/i$s;Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 55
    .line 56
    const-string v2, "window"

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroid/view/WindowManager;

    .line 63
    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_3
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/app/i;->R0(Landroidx/appcompat/app/i$s;Landroid/view/KeyEvent;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_4

    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_4
    iget-object p2, p1, Landroidx/appcompat/app/i$s;->g:Landroid/view/ViewGroup;

    .line 77
    .line 78
    const/4 v2, -0x2

    .line 79
    if-eqz p2, :cond_6

    .line 80
    .line 81
    iget-boolean v3, p1, Landroidx/appcompat/app/i$s;->q:Z

    .line 82
    .line 83
    if-eqz v3, :cond_5

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    iget-object p2, p1, Landroidx/appcompat/app/i$s;->i:Landroid/view/View;

    .line 87
    .line 88
    if-eqz p2, :cond_c

    .line 89
    .line 90
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-eqz p2, :cond_c

    .line 95
    .line 96
    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 97
    .line 98
    const/4 v3, -0x1

    .line 99
    if-ne p2, v3, :cond_c

    .line 100
    .line 101
    move v4, v3

    .line 102
    goto :goto_1

    .line 103
    :cond_6
    :goto_0
    if-nez p2, :cond_7

    .line 104
    .line 105
    invoke-direct {p0, p1}, Landroidx/appcompat/app/i;->A0(Landroidx/appcompat/app/i$s;)Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_e

    .line 110
    .line 111
    iget-object p2, p1, Landroidx/appcompat/app/i$s;->g:Landroid/view/ViewGroup;

    .line 112
    .line 113
    if-nez p2, :cond_8

    .line 114
    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :cond_7
    iget-boolean v3, p1, Landroidx/appcompat/app/i$s;->q:Z

    .line 118
    .line 119
    if-eqz v3, :cond_8

    .line 120
    .line 121
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-lez p2, :cond_8

    .line 126
    .line 127
    iget-object p2, p1, Landroidx/appcompat/app/i$s;->g:Landroid/view/ViewGroup;

    .line 128
    .line 129
    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 130
    .line 131
    .line 132
    :cond_8
    invoke-direct {p0, p1}, Landroidx/appcompat/app/i;->z0(Landroidx/appcompat/app/i$s;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_d

    .line 137
    .line 138
    invoke-virtual {p1}, Landroidx/appcompat/app/i$s;->b()Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-nez p2, :cond_9

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_9
    iget-object p2, p1, Landroidx/appcompat/app/i$s;->h:Landroid/view/View;

    .line 146
    .line 147
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    if-nez p2, :cond_a

    .line 152
    .line 153
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    .line 154
    .line 155
    invoke-direct {p2, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 156
    .line 157
    .line 158
    :cond_a
    iget v3, p1, Landroidx/appcompat/app/i$s;->b:I

    .line 159
    .line 160
    iget-object v4, p1, Landroidx/appcompat/app/i$s;->g:Landroid/view/ViewGroup;

    .line 161
    .line 162
    invoke-virtual {v4, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 163
    .line 164
    .line 165
    iget-object v3, p1, Landroidx/appcompat/app/i$s;->h:Landroid/view/View;

    .line 166
    .line 167
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 172
    .line 173
    if-eqz v4, :cond_b

    .line 174
    .line 175
    check-cast v3, Landroid/view/ViewGroup;

    .line 176
    .line 177
    iget-object v4, p1, Landroidx/appcompat/app/i$s;->h:Landroid/view/View;

    .line 178
    .line 179
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 180
    .line 181
    .line 182
    :cond_b
    iget-object v3, p1, Landroidx/appcompat/app/i$s;->g:Landroid/view/ViewGroup;

    .line 183
    .line 184
    iget-object v4, p1, Landroidx/appcompat/app/i$s;->h:Landroid/view/View;

    .line 185
    .line 186
    invoke-virtual {v3, v4, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 187
    .line 188
    .line 189
    iget-object p2, p1, Landroidx/appcompat/app/i$s;->h:Landroid/view/View;

    .line 190
    .line 191
    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    if-nez p2, :cond_c

    .line 196
    .line 197
    iget-object p2, p1, Landroidx/appcompat/app/i$s;->h:Landroid/view/View;

    .line 198
    .line 199
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    .line 200
    .line 201
    .line 202
    :cond_c
    move v4, v2

    .line 203
    :goto_1
    const/4 p2, 0x0

    .line 204
    iput-boolean p2, p1, Landroidx/appcompat/app/i$s;->n:Z

    .line 205
    .line 206
    new-instance v3, Landroid/view/WindowManager$LayoutParams;

    .line 207
    .line 208
    iget v6, p1, Landroidx/appcompat/app/i$s;->d:I

    .line 209
    .line 210
    iget v7, p1, Landroidx/appcompat/app/i$s;->e:I

    .line 211
    .line 212
    const/high16 v9, 0x820000

    .line 213
    .line 214
    const/4 v10, -0x3

    .line 215
    const/4 v5, -0x2

    .line 216
    const/16 v8, 0x3ea

    .line 217
    .line 218
    invoke-direct/range {v3 .. v10}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 219
    .line 220
    .line 221
    iget p2, p1, Landroidx/appcompat/app/i$s;->c:I

    .line 222
    .line 223
    iput p2, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 224
    .line 225
    iget p2, p1, Landroidx/appcompat/app/i$s;->f:I

    .line 226
    .line 227
    iput p2, v3, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 228
    .line 229
    iget-object p2, p1, Landroidx/appcompat/app/i$s;->g:Landroid/view/ViewGroup;

    .line 230
    .line 231
    invoke-interface {v0, p2, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 232
    .line 233
    .line 234
    iput-boolean v1, p1, Landroidx/appcompat/app/i$s;->o:Z

    .line 235
    .line 236
    iget p1, p1, Landroidx/appcompat/app/i$s;->a:I

    .line 237
    .line 238
    if-nez p1, :cond_e

    .line 239
    .line 240
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->f1()V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_d
    :goto_2
    iput-boolean v1, p1, Landroidx/appcompat/app/i$s;->q:Z

    .line 245
    .line 246
    :cond_e
    :goto_3
    return-void
.end method

.method private Q0(Landroidx/appcompat/app/i$s;ILandroid/view/KeyEvent;I)Z
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-boolean v0, p1, Landroidx/appcompat/app/i$s;->m:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-direct {p0, p1, p3}, Landroidx/appcompat/app/i;->R0(Landroidx/appcompat/app/i$s;Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    :cond_1
    iget-object v0, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, p2, p3, p4}, Landroidx/appcompat/view/menu/e;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :cond_2
    if-eqz v1, :cond_3

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    and-int/lit8 p3, p4, 0x1

    .line 31
    .line 32
    if-nez p3, :cond_3

    .line 33
    .line 34
    iget-object p3, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 35
    .line 36
    if-nez p3, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/app/i;->e0(Landroidx/appcompat/app/i$s;Z)V

    .line 39
    .line 40
    .line 41
    :cond_3
    return v1
.end method

.method private R0(Landroidx/appcompat/app/i$s;Landroid/view/KeyEvent;)Z
    .locals 8

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->R:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-boolean v0, p1, Landroidx/appcompat/app/i$s;->m:Z

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    return v2

    .line 13
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/i;->N:Landroidx/appcompat/app/i$s;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    if-eq v0, p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/app/i;->e0(Landroidx/appcompat/app/i$s;Z)V

    .line 20
    .line 21
    .line 22
    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->x0()Landroid/view/Window$Callback;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget v3, p1, Landroidx/appcompat/app/i$s;->a:I

    .line 29
    .line 30
    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iput-object v3, p1, Landroidx/appcompat/app/i$s;->i:Landroid/view/View;

    .line 35
    .line 36
    :cond_3
    iget v3, p1, Landroidx/appcompat/app/i$s;->a:I

    .line 37
    .line 38
    if-eqz v3, :cond_5

    .line 39
    .line 40
    const/16 v4, 0x6c

    .line 41
    .line 42
    if-ne v3, v4, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    move v3, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_5
    :goto_0
    move v3, v2

    .line 48
    :goto_1
    if-eqz v3, :cond_6

    .line 49
    .line 50
    iget-object v4, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 51
    .line 52
    if-eqz v4, :cond_6

    .line 53
    .line 54
    invoke-interface {v4}, Landroidx/appcompat/widget/G;->d()V

    .line 55
    .line 56
    .line 57
    :cond_6
    iget-object v4, p1, Landroidx/appcompat/app/i$s;->i:Landroid/view/View;

    .line 58
    .line 59
    if-nez v4, :cond_15

    .line 60
    .line 61
    if-eqz v3, :cond_7

    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->P0()Landroidx/appcompat/app/a;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    instance-of v4, v4, Landroidx/appcompat/app/F;

    .line 68
    .line 69
    if-nez v4, :cond_15

    .line 70
    .line 71
    :cond_7
    iget-object v4, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    if-eqz v4, :cond_8

    .line 75
    .line 76
    iget-boolean v6, p1, Landroidx/appcompat/app/i$s;->r:Z

    .line 77
    .line 78
    if-eqz v6, :cond_f

    .line 79
    .line 80
    :cond_8
    if-nez v4, :cond_a

    .line 81
    .line 82
    invoke-direct {p0, p1}, Landroidx/appcompat/app/i;->B0(Landroidx/appcompat/app/i$s;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_9

    .line 87
    .line 88
    iget-object v4, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 89
    .line 90
    if-nez v4, :cond_a

    .line 91
    .line 92
    :cond_9
    return v1

    .line 93
    :cond_a
    if-eqz v3, :cond_c

    .line 94
    .line 95
    iget-object v4, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 96
    .line 97
    if-eqz v4, :cond_c

    .line 98
    .line 99
    iget-object v4, p0, Landroidx/appcompat/app/i;->s:Landroidx/appcompat/app/i$h;

    .line 100
    .line 101
    if-nez v4, :cond_b

    .line 102
    .line 103
    new-instance v4, Landroidx/appcompat/app/i$h;

    .line 104
    .line 105
    invoke-direct {v4, p0}, Landroidx/appcompat/app/i$h;-><init>(Landroidx/appcompat/app/i;)V

    .line 106
    .line 107
    .line 108
    iput-object v4, p0, Landroidx/appcompat/app/i;->s:Landroidx/appcompat/app/i$h;

    .line 109
    .line 110
    :cond_b
    iget-object v4, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 111
    .line 112
    iget-object v6, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 113
    .line 114
    iget-object v7, p0, Landroidx/appcompat/app/i;->s:Landroidx/appcompat/app/i$h;

    .line 115
    .line 116
    invoke-interface {v4, v6, v7}, Landroidx/appcompat/widget/G;->a(Landroid/view/Menu;Landroidx/appcompat/view/menu/j$a;)V

    .line 117
    .line 118
    .line 119
    :cond_c
    iget-object v4, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 120
    .line 121
    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->i0()V

    .line 122
    .line 123
    .line 124
    iget v4, p1, Landroidx/appcompat/app/i$s;->a:I

    .line 125
    .line 126
    iget-object v6, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 127
    .line 128
    invoke-interface {v0, v4, v6}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_e

    .line 133
    .line 134
    invoke-virtual {p1, v5}, Landroidx/appcompat/app/i$s;->c(Landroidx/appcompat/view/menu/e;)V

    .line 135
    .line 136
    .line 137
    if-eqz v3, :cond_d

    .line 138
    .line 139
    iget-object p1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 140
    .line 141
    if-eqz p1, :cond_d

    .line 142
    .line 143
    iget-object p2, p0, Landroidx/appcompat/app/i;->s:Landroidx/appcompat/app/i$h;

    .line 144
    .line 145
    invoke-interface {p1, v5, p2}, Landroidx/appcompat/widget/G;->a(Landroid/view/Menu;Landroidx/appcompat/view/menu/j$a;)V

    .line 146
    .line 147
    .line 148
    :cond_d
    return v1

    .line 149
    :cond_e
    iput-boolean v1, p1, Landroidx/appcompat/app/i$s;->r:Z

    .line 150
    .line 151
    :cond_f
    iget-object v4, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 152
    .line 153
    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->i0()V

    .line 154
    .line 155
    .line 156
    iget-object v4, p1, Landroidx/appcompat/app/i$s;->s:Landroid/os/Bundle;

    .line 157
    .line 158
    if-eqz v4, :cond_10

    .line 159
    .line 160
    iget-object v6, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 161
    .line 162
    invoke-virtual {v6, v4}, Landroidx/appcompat/view/menu/e;->S(Landroid/os/Bundle;)V

    .line 163
    .line 164
    .line 165
    iput-object v5, p1, Landroidx/appcompat/app/i$s;->s:Landroid/os/Bundle;

    .line 166
    .line 167
    :cond_10
    iget-object v4, p1, Landroidx/appcompat/app/i$s;->i:Landroid/view/View;

    .line 168
    .line 169
    iget-object v6, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 170
    .line 171
    invoke-interface {v0, v1, v4, v6}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_12

    .line 176
    .line 177
    if-eqz v3, :cond_11

    .line 178
    .line 179
    iget-object p2, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 180
    .line 181
    if-eqz p2, :cond_11

    .line 182
    .line 183
    iget-object v0, p0, Landroidx/appcompat/app/i;->s:Landroidx/appcompat/app/i$h;

    .line 184
    .line 185
    invoke-interface {p2, v5, v0}, Landroidx/appcompat/widget/G;->a(Landroid/view/Menu;Landroidx/appcompat/view/menu/j$a;)V

    .line 186
    .line 187
    .line 188
    :cond_11
    iget-object p1, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 189
    .line 190
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->h0()V

    .line 191
    .line 192
    .line 193
    return v1

    .line 194
    :cond_12
    if-eqz p2, :cond_13

    .line 195
    .line 196
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    goto :goto_2

    .line 201
    :cond_13
    const/4 p2, -0x1

    .line 202
    :goto_2
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    if-eq p2, v2, :cond_14

    .line 211
    .line 212
    move p2, v2

    .line 213
    goto :goto_3

    .line 214
    :cond_14
    move p2, v1

    .line 215
    :goto_3
    iput-boolean p2, p1, Landroidx/appcompat/app/i$s;->p:Z

    .line 216
    .line 217
    iget-object v0, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 218
    .line 219
    invoke-virtual {v0, p2}, Landroidx/appcompat/view/menu/e;->setQwertyMode(Z)V

    .line 220
    .line 221
    .line 222
    iget-object p2, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 223
    .line 224
    invoke-virtual {p2}, Landroidx/appcompat/view/menu/e;->h0()V

    .line 225
    .line 226
    .line 227
    :cond_15
    iput-boolean v2, p1, Landroidx/appcompat/app/i$s;->m:Z

    .line 228
    .line 229
    iput-boolean v1, p1, Landroidx/appcompat/app/i$s;->n:Z

    .line 230
    .line 231
    iput-object p1, p0, Landroidx/appcompat/app/i;->N:Landroidx/appcompat/app/i$s;

    .line 232
    .line 233
    return v2
.end method

.method private S0(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/appcompat/widget/G;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 26
    .line 27
    invoke-interface {v0}, Landroidx/appcompat/widget/G;->e()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->x0()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v3, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 38
    .line 39
    invoke-interface {v3}, Landroidx/appcompat/widget/G;->b()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/16 v4, 0x6c

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object p1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 51
    .line 52
    invoke-interface {p1}, Landroidx/appcompat/widget/G;->f()Z

    .line 53
    .line 54
    .line 55
    iget-boolean p1, p0, Landroidx/appcompat/app/i;->R:Z

    .line 56
    .line 57
    if-nez p1, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0, v2, v1}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p1, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 64
    .line 65
    invoke-interface {v0, v4, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    :goto_0
    if-eqz v0, :cond_4

    .line 70
    .line 71
    iget-boolean p1, p0, Landroidx/appcompat/app/i;->R:Z

    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    iget-boolean p1, p0, Landroidx/appcompat/app/i;->Z:Z

    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    iget p1, p0, Landroidx/appcompat/app/i;->a0:I

    .line 80
    .line 81
    and-int/2addr p1, v1

    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    iget-object p1, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object v3, p0, Landroidx/appcompat/app/i;->b0:Ljava/lang/Runnable;

    .line 91
    .line 92
    invoke-virtual {p1, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Landroidx/appcompat/app/i;->b0:Ljava/lang/Runnable;

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {p0, v2, v1}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object v1, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 105
    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    iget-boolean v3, p1, Landroidx/appcompat/app/i$s;->r:Z

    .line 109
    .line 110
    if-nez v3, :cond_4

    .line 111
    .line 112
    iget-object v3, p1, Landroidx/appcompat/app/i$s;->i:Landroid/view/View;

    .line 113
    .line 114
    invoke-interface {v0, v2, v3, v1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_4

    .line 119
    .line 120
    iget-object p1, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 121
    .line 122
    invoke-interface {v0, v4, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 126
    .line 127
    invoke-interface {p1}, Landroidx/appcompat/widget/G;->g()Z

    .line 128
    .line 129
    .line 130
    :cond_4
    return-void

    .line 131
    :cond_5
    invoke-virtual {p0, v2, v1}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-boolean v1, p1, Landroidx/appcompat/app/i$s;->q:Z

    .line 136
    .line 137
    invoke-virtual {p0, p1, v2}, Landroidx/appcompat/app/i;->e0(Landroidx/appcompat/app/i$s;Z)V

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/app/i;->O0(Landroidx/appcompat/app/i$s;Landroid/view/KeyEvent;)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method private T0(I)I
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const-string v1, "AppCompatDelegate"

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    .line 8
    .line 9
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    const/16 p1, 0x6c

    .line 13
    .line 14
    return p1

    .line 15
    :cond_0
    const/16 v0, 0x9

    .line 16
    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    .line 20
    .line 21
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    const/16 p1, 0x6d

    .line 25
    .line 26
    :cond_1
    return p1
.end method

.method private U(Z)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/app/i;->V(ZZ)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method private V(ZZ)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->R:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-direct {p0}, Landroidx/appcompat/app/i;->Z()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/app/i;->E0(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v3, 0x21

    .line 20
    .line 21
    if-ge v2, v3, :cond_1

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Landroidx/appcompat/app/i;->Y(Landroid/content/Context;)LE/i;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v2, 0x0

    .line 31
    :goto_0
    if-nez p2, :cond_2

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object p2, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p0, p2}, Landroidx/appcompat/app/i;->u0(Landroid/content/res/Configuration;)LE/i;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :cond_2
    invoke-direct {p0, v1, v2, p1}, Landroidx/appcompat/app/i;->e1(ILE/i;Z)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    iget-object p2, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 56
    .line 57
    invoke-direct {p0, p2}, Landroidx/appcompat/app/i;->t0(Landroid/content/Context;)Landroidx/appcompat/app/i$p;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p2}, Landroidx/appcompat/app/i$p;->e()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    iget-object p2, p0, Landroidx/appcompat/app/i;->X:Landroidx/appcompat/app/i$p;

    .line 66
    .line 67
    if-eqz p2, :cond_4

    .line 68
    .line 69
    invoke-virtual {p2}, Landroidx/appcompat/app/i$p;->a()V

    .line 70
    .line 71
    .line 72
    :cond_4
    :goto_1
    const/4 p2, 0x3

    .line 73
    if-ne v0, p2, :cond_5

    .line 74
    .line 75
    iget-object p2, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 76
    .line 77
    invoke-direct {p0, p2}, Landroidx/appcompat/app/i;->s0(Landroid/content/Context;)Landroidx/appcompat/app/i$p;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p2}, Landroidx/appcompat/app/i$p;->e()V

    .line 82
    .line 83
    .line 84
    return p1

    .line 85
    :cond_5
    iget-object p2, p0, Landroidx/appcompat/app/i;->Y:Landroidx/appcompat/app/i$p;

    .line 86
    .line 87
    if-eqz p2, :cond_6

    .line 88
    .line 89
    invoke-virtual {p2}, Landroidx/appcompat/app/i$p;->a()V

    .line 90
    .line 91
    .line 92
    :cond_6
    return p1
.end method

.method private W()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 2
    .line 3
    const v1, 0x1020002

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0, v2, v3, v4, v1}, Landroidx/appcompat/widget/ContentFrameLayout;->a(IIII)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 38
    .line 39
    sget-object v2, Ld/j;->y0:[I

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget v2, Ld/j;->K0:I

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 52
    .line 53
    .line 54
    sget v2, Ld/j;->L0:I

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 61
    .line 62
    .line 63
    sget v2, Ld/j;->I0:I

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 76
    .line 77
    .line 78
    :cond_0
    sget v2, Ld/j;->J0:I

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 91
    .line 92
    .line 93
    :cond_1
    sget v2, Ld/j;->G0:I

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_2

    .line 100
    .line 101
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 106
    .line 107
    .line 108
    :cond_2
    sget v2, Ld/j;->H0:I

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_3

    .line 115
    .line 116
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 121
    .line 122
    .line 123
    :cond_3
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method private X(Landroid/view/Window;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 2
    .line 3
    const-string v1, "AppCompat has already installed itself into the Window"

    .line 4
    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v2, v0, Landroidx/appcompat/app/i$n;

    .line 12
    .line 13
    if-nez v2, :cond_2

    .line 14
    .line 15
    new-instance v1, Landroidx/appcompat/app/i$n;

    .line 16
    .line 17
    invoke-direct {v1, p0, v0}, Landroidx/appcompat/app/i$n;-><init>(Landroidx/appcompat/app/i;Landroid/view/Window$Callback;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Landroidx/appcompat/app/i;->m:Landroidx/appcompat/app/i$n;

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 26
    .line 27
    sget-object v1, Landroidx/appcompat/app/i;->l0:[I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static {v0, v2, v1}, Landroidx/appcompat/widget/e0;->u(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/appcompat/widget/e0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/e0;->h(I)Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/widget/e0;->x()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 48
    .line 49
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 50
    .line 51
    const/16 v0, 0x21

    .line 52
    .line 53
    if-lt p1, v0, :cond_1

    .line 54
    .line 55
    iget-object p1, p0, Landroidx/appcompat/app/i;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 56
    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p0, v2}, Landroidx/appcompat/app/i;->O(Landroid/window/OnBackInvokedDispatcher;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void

    .line 63
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method

.method private X0(Landroid/view/ViewParent;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_1
    if-eq p1, v1, :cond_3

    .line 16
    .line 17
    instance-of v2, p1, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    move-object v2, p1

    .line 22
    check-cast v2, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    :goto_1
    return v0
.end method

.method private Z()I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/app/i;->T:I

    .line 2
    .line 3
    const/16 v1, -0x64

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-static {}, Landroidx/appcompat/app/g;->o()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method private b1()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 7
    .line 8
    const-string v1, "Window feature must be requested before adding content"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method private c0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->X:Landroidx/appcompat/app/i$p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/i$p;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->Y:Landroidx/appcompat/app/i$p;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/appcompat/app/i$p;->a()V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method

.method private c1()Landroidx/appcompat/app/d;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 2
    .line 3
    :goto_0
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    instance-of v2, v0, Landroidx/appcompat/app/d;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroidx/appcompat/app/d;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    instance-of v2, v0, Landroid/content/ContextWrapper;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    check-cast v0, Landroid/content/ContextWrapper;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-object v1
.end method

.method private d1(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Activity;

    .line 4
    .line 5
    instance-of v1, v0, Landroidx/lifecycle/n;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Landroidx/lifecycle/n;

    .line 11
    .line 12
    invoke-interface {v1}, Landroidx/lifecycle/n;->getLifecycle()Landroidx/lifecycle/h;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroidx/lifecycle/h;->b()Landroidx/lifecycle/h$b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v2, Landroidx/lifecycle/h$b;->f:Landroidx/lifecycle/h$b;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroidx/lifecycle/h$b;->b(Landroidx/lifecycle/h$b;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->Q:Z

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->R:Z

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method private e1(ILE/i;Z)Z
    .locals 10

    .line 1
    iget-object v1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move v2, p1

    .line 7
    move-object v3, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/app/i;->f0(Landroid/content/Context;ILE/i;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, v0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 13
    .line 14
    invoke-direct {p0, p2}, Landroidx/appcompat/app/i;->r0(Landroid/content/Context;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v1, v0, Landroidx/appcompat/app/i;->S:Landroid/content/res/Configuration;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iget-object v1, v0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_0
    iget v4, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 33
    .line 34
    and-int/lit8 v4, v4, 0x30

    .line 35
    .line 36
    iget v5, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 37
    .line 38
    and-int/lit8 v5, v5, 0x30

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/i;->u0(Landroid/content/res/Configuration;)LE/i;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v6, 0x0

    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    move-object v7, v6

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/i;->u0(Landroid/content/res/Configuration;)LE/i;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    :goto_0
    const/4 v8, 0x0

    .line 54
    if-eq v4, v5, :cond_2

    .line 55
    .line 56
    const/16 v4, 0x200

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v4, v8

    .line 60
    :goto_1
    if-eqz v7, :cond_3

    .line 61
    .line 62
    invoke-virtual {v1, v7}, LE/i;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    or-int/lit16 v4, v4, 0x2004

    .line 69
    .line 70
    :cond_3
    not-int v1, p2

    .line 71
    and-int/2addr v1, v4

    .line 72
    const/4 v9, 0x1

    .line 73
    if-eqz v1, :cond_6

    .line 74
    .line 75
    if-eqz p3, :cond_6

    .line 76
    .line 77
    iget-boolean p3, v0, Landroidx/appcompat/app/i;->P:Z

    .line 78
    .line 79
    if-eqz p3, :cond_6

    .line 80
    .line 81
    sget-boolean p3, Landroidx/appcompat/app/i;->m0:Z

    .line 82
    .line 83
    if-nez p3, :cond_4

    .line 84
    .line 85
    iget-boolean p3, v0, Landroidx/appcompat/app/i;->Q:Z

    .line 86
    .line 87
    if-eqz p3, :cond_6

    .line 88
    .line 89
    :cond_4
    iget-object p3, v0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 90
    .line 91
    instance-of v1, p3, Landroid/app/Activity;

    .line 92
    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    check-cast p3, Landroid/app/Activity;

    .line 96
    .line 97
    invoke-virtual {p3}, Landroid/app/Activity;->isChild()Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-nez p3, :cond_6

    .line 102
    .line 103
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 104
    .line 105
    const/16 v1, 0x1f

    .line 106
    .line 107
    if-lt p3, v1, :cond_5

    .line 108
    .line 109
    and-int/lit16 p3, v4, 0x2000

    .line 110
    .line 111
    if-eqz p3, :cond_5

    .line 112
    .line 113
    iget-object p3, v0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p3, Landroid/app/Activity;

    .line 116
    .line 117
    invoke-virtual {p3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-virtual {p3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-virtual {p3, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 130
    .line 131
    .line 132
    :cond_5
    iget-object p1, v0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p1, Landroid/app/Activity;

    .line 135
    .line 136
    invoke-static {p1}, Lx/b;->c(Landroid/app/Activity;)V

    .line 137
    .line 138
    .line 139
    move p1, v9

    .line 140
    goto :goto_2

    .line 141
    :cond_6
    move p1, v8

    .line 142
    :goto_2
    if-nez p1, :cond_8

    .line 143
    .line 144
    if-eqz v4, :cond_8

    .line 145
    .line 146
    and-int p1, v4, p2

    .line 147
    .line 148
    if-ne p1, v4, :cond_7

    .line 149
    .line 150
    move v8, v9

    .line 151
    :cond_7
    invoke-direct {p0, v5, v7, v8, v6}, Landroidx/appcompat/app/i;->g1(ILE/i;ZLandroid/content/res/Configuration;)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_8
    move v9, p1

    .line 156
    :goto_3
    if-eqz v9, :cond_a

    .line 157
    .line 158
    iget-object p1, v0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 159
    .line 160
    instance-of p2, p1, Landroidx/appcompat/app/d;

    .line 161
    .line 162
    if-eqz p2, :cond_a

    .line 163
    .line 164
    and-int/lit16 p2, v4, 0x200

    .line 165
    .line 166
    if-eqz p2, :cond_9

    .line 167
    .line 168
    check-cast p1, Landroidx/appcompat/app/d;

    .line 169
    .line 170
    invoke-virtual {p1, v2}, Landroidx/appcompat/app/d;->o0(I)V

    .line 171
    .line 172
    .line 173
    :cond_9
    and-int/lit8 p1, v4, 0x4

    .line 174
    .line 175
    if-eqz p1, :cond_a

    .line 176
    .line 177
    iget-object p1, v0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p1, Landroidx/appcompat/app/d;

    .line 180
    .line 181
    invoke-virtual {p1, v3}, Landroidx/appcompat/app/d;->n0(LE/i;)V

    .line 182
    .line 183
    .line 184
    :cond_a
    if-eqz v7, :cond_b

    .line 185
    .line 186
    iget-object p1, v0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 187
    .line 188
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/i;->u0(Landroid/content/res/Configuration;)LE/i;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/i;->V0(LE/i;)V

    .line 201
    .line 202
    .line 203
    :cond_b
    return v9
.end method

.method private f0(Landroid/content/Context;ILE/i;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p2, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p2, v0, :cond_1

    .line 6
    .line 7
    if-eqz p5, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 24
    .line 25
    and-int/lit8 p1, p1, 0x30

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/16 p1, 0x20

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/16 p1, 0x10

    .line 32
    .line 33
    :goto_0
    new-instance p2, Landroid/content/res/Configuration;

    .line 34
    .line 35
    invoke-direct {p2}, Landroid/content/res/Configuration;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 p5, 0x0

    .line 39
    iput p5, p2, Landroid/content/res/Configuration;->fontScale:F

    .line 40
    .line 41
    if-eqz p4, :cond_3

    .line 42
    .line 43
    invoke-virtual {p2, p4}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget p4, p2, Landroid/content/res/Configuration;->uiMode:I

    .line 47
    .line 48
    and-int/lit8 p4, p4, -0x31

    .line 49
    .line 50
    or-int/2addr p1, p4

    .line 51
    iput p1, p2, Landroid/content/res/Configuration;->uiMode:I

    .line 52
    .line 53
    if-eqz p3, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0, p2, p3}, Landroidx/appcompat/app/i;->U0(Landroid/content/res/Configuration;LE/i;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    return-object p2
.end method

.method private g0()Landroid/view/ViewGroup;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, Ld/j;->y0:[I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Ld/j;->D0:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_10

    .line 16
    .line 17
    sget v2, Ld/j;->M0:I

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v4, 0x1

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, v4}, Landroidx/appcompat/app/i;->I(I)Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    const/16 v1, 0x6c

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/i;->I(I)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    sget v1, Ld/j;->E0:I

    .line 43
    .line 44
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/16 v2, 0x6d

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Landroidx/appcompat/app/i;->I(I)Z

    .line 53
    .line 54
    .line 55
    :cond_2
    sget v1, Ld/j;->F0:I

    .line 56
    .line 57
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    const/16 v1, 0xa

    .line 64
    .line 65
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/i;->I(I)Z

    .line 66
    .line 67
    .line 68
    :cond_3
    sget v1, Ld/j;->z0:I

    .line 69
    .line 70
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iput-boolean v1, p0, Landroidx/appcompat/app/i;->J:Z

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0}, Landroidx/appcompat/app/i;->n0()V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 88
    .line 89
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->K:Z

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    if-nez v1, :cond_9

    .line 97
    .line 98
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->J:Z

    .line 99
    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    sget v1, Ld/g;->f:I

    .line 103
    .line 104
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Landroid/view/ViewGroup;

    .line 109
    .line 110
    iput-boolean v3, p0, Landroidx/appcompat/app/i;->H:Z

    .line 111
    .line 112
    iput-boolean v3, p0, Landroidx/appcompat/app/i;->G:Z

    .line 113
    .line 114
    goto/16 :goto_2

    .line 115
    .line 116
    :cond_4
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->G:Z

    .line 117
    .line 118
    if-eqz v0, :cond_8

    .line 119
    .line 120
    new-instance v0, Landroid/util/TypedValue;

    .line 121
    .line 122
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 126
    .line 127
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    sget v6, Ld/a;->d:I

    .line 132
    .line 133
    invoke-virtual {v1, v6, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 134
    .line 135
    .line 136
    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    .line 137
    .line 138
    if-eqz v1, :cond_5

    .line 139
    .line 140
    new-instance v1, Landroidx/appcompat/view/d;

    .line 141
    .line 142
    iget-object v4, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 143
    .line 144
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    .line 145
    .line 146
    invoke-direct {v1, v4, v0}, Landroidx/appcompat/view/d;-><init>(Landroid/content/Context;I)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_5
    iget-object v1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 151
    .line 152
    :goto_1
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget v1, Ld/g;->p:I

    .line 157
    .line 158
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Landroid/view/ViewGroup;

    .line 163
    .line 164
    sget v1, Ld/f;->p:I

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Landroidx/appcompat/widget/G;

    .line 171
    .line 172
    iput-object v1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 173
    .line 174
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->x0()Landroid/view/Window$Callback;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-interface {v1, v4}, Landroidx/appcompat/widget/G;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 179
    .line 180
    .line 181
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->H:Z

    .line 182
    .line 183
    if-eqz v1, :cond_6

    .line 184
    .line 185
    iget-object v1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 186
    .line 187
    invoke-interface {v1, v2}, Landroidx/appcompat/widget/G;->k(I)V

    .line 188
    .line 189
    .line 190
    :cond_6
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->E:Z

    .line 191
    .line 192
    if-eqz v1, :cond_7

    .line 193
    .line 194
    iget-object v1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 195
    .line 196
    const/4 v2, 0x2

    .line 197
    invoke-interface {v1, v2}, Landroidx/appcompat/widget/G;->k(I)V

    .line 198
    .line 199
    .line 200
    :cond_7
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->F:Z

    .line 201
    .line 202
    if-eqz v1, :cond_b

    .line 203
    .line 204
    iget-object v1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 205
    .line 206
    const/4 v2, 0x5

    .line 207
    invoke-interface {v1, v2}, Landroidx/appcompat/widget/G;->k(I)V

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_8
    move-object v0, v5

    .line 212
    goto :goto_2

    .line 213
    :cond_9
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->I:Z

    .line 214
    .line 215
    if-eqz v1, :cond_a

    .line 216
    .line 217
    sget v1, Ld/g;->o:I

    .line 218
    .line 219
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Landroid/view/ViewGroup;

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_a
    sget v1, Ld/g;->n:I

    .line 227
    .line 228
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, Landroid/view/ViewGroup;

    .line 233
    .line 234
    :cond_b
    :goto_2
    if-eqz v0, :cond_f

    .line 235
    .line 236
    new-instance v1, Landroidx/appcompat/app/i$b;

    .line 237
    .line 238
    invoke-direct {v1, p0}, Landroidx/appcompat/app/i$b;-><init>(Landroidx/appcompat/app/i;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v0, v1}, LJ/W;->s0(Landroid/view/View;LJ/F;)V

    .line 242
    .line 243
    .line 244
    iget-object v1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 245
    .line 246
    if-nez v1, :cond_c

    .line 247
    .line 248
    sget v1, Ld/f;->M:I

    .line 249
    .line 250
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    check-cast v1, Landroid/widget/TextView;

    .line 255
    .line 256
    iput-object v1, p0, Landroidx/appcompat/app/i;->C:Landroid/widget/TextView;

    .line 257
    .line 258
    :cond_c
    invoke-static {v0}, Landroidx/appcompat/widget/p0;->c(Landroid/view/View;)V

    .line 259
    .line 260
    .line 261
    sget v1, Ld/f;->b:I

    .line 262
    .line 263
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    check-cast v1, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 268
    .line 269
    iget-object v2, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 270
    .line 271
    const v4, 0x1020002

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    check-cast v2, Landroid/view/ViewGroup;

    .line 279
    .line 280
    if-eqz v2, :cond_e

    .line 281
    .line 282
    :goto_3
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-lez v6, :cond_d

    .line 287
    .line 288
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 296
    .line 297
    .line 298
    goto :goto_3

    .line 299
    :cond_d
    const/4 v3, -0x1

    .line 300
    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v4}, Landroid/view/View;->setId(I)V

    .line 304
    .line 305
    .line 306
    instance-of v3, v2, Landroid/widget/FrameLayout;

    .line 307
    .line 308
    if-eqz v3, :cond_e

    .line 309
    .line 310
    check-cast v2, Landroid/widget/FrameLayout;

    .line 311
    .line 312
    invoke-virtual {v2, v5}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 313
    .line 314
    .line 315
    :cond_e
    iget-object v2, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 316
    .line 317
    invoke-virtual {v2, v0}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 318
    .line 319
    .line 320
    new-instance v2, Landroidx/appcompat/app/i$c;

    .line 321
    .line 322
    invoke-direct {v2, p0}, Landroidx/appcompat/app/i$c;-><init>(Landroidx/appcompat/app/i;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Landroidx/appcompat/widget/ContentFrameLayout$a;)V

    .line 326
    .line 327
    .line 328
    return-object v0

    .line 329
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 330
    .line 331
    new-instance v1, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    .line 337
    .line 338
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    iget-boolean v2, p0, Landroidx/appcompat/app/i;->G:Z

    .line 342
    .line 343
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v2, ", windowActionBarOverlay: "

    .line 347
    .line 348
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    iget-boolean v2, p0, Landroidx/appcompat/app/i;->H:Z

    .line 352
    .line 353
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    const-string v2, ", android:windowIsFloating: "

    .line 357
    .line 358
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    iget-boolean v2, p0, Landroidx/appcompat/app/i;->J:Z

    .line 362
    .line 363
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    const-string v2, ", windowActionModeOverlay: "

    .line 367
    .line 368
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    iget-boolean v2, p0, Landroidx/appcompat/app/i;->I:Z

    .line 372
    .line 373
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string v2, ", windowNoTitle: "

    .line 377
    .line 378
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    iget-boolean v2, p0, Landroidx/appcompat/app/i;->K:Z

    .line 382
    .line 383
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v2, " }"

    .line 387
    .line 388
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw v0

    .line 399
    :cond_10
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 400
    .line 401
    .line 402
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 403
    .line 404
    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    .line 405
    .line 406
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    throw v0
.end method

.method private g1(ILE/i;ZLandroid/content/res/Configuration;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Landroid/content/res/Configuration;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 14
    .line 15
    .line 16
    if-eqz p4, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, p4}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    iget p4, p4, Landroid/content/res/Configuration;->uiMode:I

    .line 26
    .line 27
    and-int/lit8 p4, p4, -0x31

    .line 28
    .line 29
    or-int/2addr p1, p4

    .line 30
    iput p1, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1, p2}, Landroidx/appcompat/app/i;->U0(Landroid/content/res/Configuration;LE/i;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 39
    .line 40
    .line 41
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 p2, 0x1a

    .line 44
    .line 45
    if-ge p1, p2, :cond_2

    .line 46
    .line 47
    invoke-static {v0}, Landroidx/appcompat/app/D;->a(Landroid/content/res/Resources;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget p1, p0, Landroidx/appcompat/app/i;->U:I

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iget-object p2, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 55
    .line 56
    invoke-virtual {p2, p1}, Landroid/content/Context;->setTheme(I)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget p2, p0, Landroidx/appcompat/app/i;->U:I

    .line 66
    .line 67
    const/4 p4, 0x1

    .line 68
    invoke-virtual {p1, p2, p4}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 69
    .line 70
    .line 71
    :cond_3
    if-eqz p3, :cond_4

    .line 72
    .line 73
    iget-object p1, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 74
    .line 75
    instance-of p1, p1, Landroid/app/Activity;

    .line 76
    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    invoke-direct {p0, v1}, Landroidx/appcompat/app/i;->d1(Landroid/content/res/Configuration;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    return-void
.end method

.method private i1(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {p1}, LJ/W;->I(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0x2000

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 10
    .line 11
    sget v1, Ld/c;->b:I

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 19
    .line 20
    sget v1, Ld/c;->a:I

    .line 21
    .line 22
    invoke-static {v0, v1}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private m0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/appcompat/app/i;->g0()Landroid/view/ViewGroup;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->w0()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v1, v0}, Landroidx/appcompat/widget/G;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->P0()Landroidx/appcompat/app/a;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->P0()Landroidx/appcompat/app/a;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v0}, Landroidx/appcompat/app/a;->y(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v1, p0, Landroidx/appcompat/app/i;->C:Landroid/widget/TextView;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    invoke-direct {p0}, Landroidx/appcompat/app/i;->W()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/i;->N0(Landroid/view/ViewGroup;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, Landroidx/appcompat/app/i;->A:Z

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-virtual {p0, v0, v0}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->R:Z

    .line 67
    .line 68
    if-nez v1, :cond_4

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object v0, v0, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 73
    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    :cond_3
    const/16 v0, 0x6c

    .line 77
    .line 78
    invoke-direct {p0, v0}, Landroidx/appcompat/app/i;->C0(I)V

    .line 79
    .line 80
    .line 81
    :cond_4
    return-void
.end method

.method private n0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p0, v0}, Landroidx/appcompat/app/i;->X(Landroid/view/Window;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "We have not been given a Window"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method private static p0(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;
    .locals 5

    .line 1
    new-instance v0, Landroid/content/res/Configuration;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/res/Configuration;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput v1, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 8
    .line 9
    if-eqz p1, :cond_16

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    iget v1, p0, Landroid/content/res/Configuration;->fontScale:F

    .line 20
    .line 21
    iget v2, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 22
    .line 23
    cmpl-float v1, v1, v2

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iput v2, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 28
    .line 29
    :cond_1
    iget v1, p0, Landroid/content/res/Configuration;->mcc:I

    .line 30
    .line 31
    iget v2, p1, Landroid/content/res/Configuration;->mcc:I

    .line 32
    .line 33
    if-eq v1, v2, :cond_2

    .line 34
    .line 35
    iput v2, v0, Landroid/content/res/Configuration;->mcc:I

    .line 36
    .line 37
    :cond_2
    iget v1, p0, Landroid/content/res/Configuration;->mnc:I

    .line 38
    .line 39
    iget v2, p1, Landroid/content/res/Configuration;->mnc:I

    .line 40
    .line 41
    if-eq v1, v2, :cond_3

    .line 42
    .line 43
    iput v2, v0, Landroid/content/res/Configuration;->mnc:I

    .line 44
    .line 45
    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v2, 0x18

    .line 48
    .line 49
    if-lt v1, v2, :cond_4

    .line 50
    .line 51
    invoke-static {p0, p1, v0}, Landroidx/appcompat/app/i$k;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    iget-object v2, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 56
    .line 57
    iget-object v3, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 58
    .line 59
    invoke-static {v2, v3}, LI/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_5

    .line 64
    .line 65
    iget-object v2, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 66
    .line 67
    iput-object v2, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 68
    .line 69
    :cond_5
    :goto_0
    iget v2, p0, Landroid/content/res/Configuration;->touchscreen:I

    .line 70
    .line 71
    iget v3, p1, Landroid/content/res/Configuration;->touchscreen:I

    .line 72
    .line 73
    if-eq v2, v3, :cond_6

    .line 74
    .line 75
    iput v3, v0, Landroid/content/res/Configuration;->touchscreen:I

    .line 76
    .line 77
    :cond_6
    iget v2, p0, Landroid/content/res/Configuration;->keyboard:I

    .line 78
    .line 79
    iget v3, p1, Landroid/content/res/Configuration;->keyboard:I

    .line 80
    .line 81
    if-eq v2, v3, :cond_7

    .line 82
    .line 83
    iput v3, v0, Landroid/content/res/Configuration;->keyboard:I

    .line 84
    .line 85
    :cond_7
    iget v2, p0, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 86
    .line 87
    iget v3, p1, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 88
    .line 89
    if-eq v2, v3, :cond_8

    .line 90
    .line 91
    iput v3, v0, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 92
    .line 93
    :cond_8
    iget v2, p0, Landroid/content/res/Configuration;->navigation:I

    .line 94
    .line 95
    iget v3, p1, Landroid/content/res/Configuration;->navigation:I

    .line 96
    .line 97
    if-eq v2, v3, :cond_9

    .line 98
    .line 99
    iput v3, v0, Landroid/content/res/Configuration;->navigation:I

    .line 100
    .line 101
    :cond_9
    iget v2, p0, Landroid/content/res/Configuration;->navigationHidden:I

    .line 102
    .line 103
    iget v3, p1, Landroid/content/res/Configuration;->navigationHidden:I

    .line 104
    .line 105
    if-eq v2, v3, :cond_a

    .line 106
    .line 107
    iput v3, v0, Landroid/content/res/Configuration;->navigationHidden:I

    .line 108
    .line 109
    :cond_a
    iget v2, p0, Landroid/content/res/Configuration;->orientation:I

    .line 110
    .line 111
    iget v3, p1, Landroid/content/res/Configuration;->orientation:I

    .line 112
    .line 113
    if-eq v2, v3, :cond_b

    .line 114
    .line 115
    iput v3, v0, Landroid/content/res/Configuration;->orientation:I

    .line 116
    .line 117
    :cond_b
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    .line 118
    .line 119
    and-int/lit8 v2, v2, 0xf

    .line 120
    .line 121
    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    .line 122
    .line 123
    and-int/lit8 v4, v3, 0xf

    .line 124
    .line 125
    if-eq v2, v4, :cond_c

    .line 126
    .line 127
    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 128
    .line 129
    and-int/lit8 v3, v3, 0xf

    .line 130
    .line 131
    or-int/2addr v2, v3

    .line 132
    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 133
    .line 134
    :cond_c
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    .line 135
    .line 136
    and-int/lit16 v2, v2, 0xc0

    .line 137
    .line 138
    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    .line 139
    .line 140
    and-int/lit16 v4, v3, 0xc0

    .line 141
    .line 142
    if-eq v2, v4, :cond_d

    .line 143
    .line 144
    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 145
    .line 146
    and-int/lit16 v3, v3, 0xc0

    .line 147
    .line 148
    or-int/2addr v2, v3

    .line 149
    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 150
    .line 151
    :cond_d
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    .line 152
    .line 153
    and-int/lit8 v2, v2, 0x30

    .line 154
    .line 155
    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    .line 156
    .line 157
    and-int/lit8 v4, v3, 0x30

    .line 158
    .line 159
    if-eq v2, v4, :cond_e

    .line 160
    .line 161
    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 162
    .line 163
    and-int/lit8 v3, v3, 0x30

    .line 164
    .line 165
    or-int/2addr v2, v3

    .line 166
    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 167
    .line 168
    :cond_e
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    .line 169
    .line 170
    and-int/lit16 v2, v2, 0x300

    .line 171
    .line 172
    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    .line 173
    .line 174
    and-int/lit16 v4, v3, 0x300

    .line 175
    .line 176
    if-eq v2, v4, :cond_f

    .line 177
    .line 178
    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 179
    .line 180
    and-int/lit16 v3, v3, 0x300

    .line 181
    .line 182
    or-int/2addr v2, v3

    .line 183
    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 184
    .line 185
    :cond_f
    const/16 v2, 0x1a

    .line 186
    .line 187
    if-lt v1, v2, :cond_10

    .line 188
    .line 189
    invoke-static {p0, p1, v0}, Landroidx/appcompat/app/i$l;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 190
    .line 191
    .line 192
    :cond_10
    iget v1, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 193
    .line 194
    and-int/lit8 v1, v1, 0xf

    .line 195
    .line 196
    iget v2, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 197
    .line 198
    and-int/lit8 v3, v2, 0xf

    .line 199
    .line 200
    if-eq v1, v3, :cond_11

    .line 201
    .line 202
    iget v1, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 203
    .line 204
    and-int/lit8 v2, v2, 0xf

    .line 205
    .line 206
    or-int/2addr v1, v2

    .line 207
    iput v1, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 208
    .line 209
    :cond_11
    iget v1, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 210
    .line 211
    and-int/lit8 v1, v1, 0x30

    .line 212
    .line 213
    iget v2, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 214
    .line 215
    and-int/lit8 v3, v2, 0x30

    .line 216
    .line 217
    if-eq v1, v3, :cond_12

    .line 218
    .line 219
    iget v1, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 220
    .line 221
    and-int/lit8 v2, v2, 0x30

    .line 222
    .line 223
    or-int/2addr v1, v2

    .line 224
    iput v1, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 225
    .line 226
    :cond_12
    iget v1, p0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 227
    .line 228
    iget v2, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 229
    .line 230
    if-eq v1, v2, :cond_13

    .line 231
    .line 232
    iput v2, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 233
    .line 234
    :cond_13
    iget v1, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 235
    .line 236
    iget v2, p1, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 237
    .line 238
    if-eq v1, v2, :cond_14

    .line 239
    .line 240
    iput v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 241
    .line 242
    :cond_14
    iget v1, p0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 243
    .line 244
    iget v2, p1, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 245
    .line 246
    if-eq v1, v2, :cond_15

    .line 247
    .line 248
    iput v2, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 249
    .line 250
    :cond_15
    iget p0, p0, Landroid/content/res/Configuration;->densityDpi:I

    .line 251
    .line 252
    iget p1, p1, Landroid/content/res/Configuration;->densityDpi:I

    .line 253
    .line 254
    if-eq p0, p1, :cond_16

    .line 255
    .line 256
    iput p1, v0, Landroid/content/res/Configuration;->densityDpi:I

    .line 257
    .line 258
    :cond_16
    :goto_1
    return-object v0
.end method

.method private r0(Landroid/content/Context;)I
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->W:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v0, v0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v3, 0x1d

    .line 22
    .line 23
    if-lt v2, v3, :cond_1

    .line 24
    .line 25
    const/high16 v2, 0x100c0000

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/16 v3, 0x18

    .line 29
    .line 30
    if-lt v2, v3, :cond_2

    .line 31
    .line 32
    const/high16 v2, 0xc0000

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move v2, v1

    .line 36
    :goto_0
    new-instance v3, Landroid/content/ComponentName;

    .line 37
    .line 38
    iget-object v4, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v3, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    iget p1, p1, Landroid/content/pm/ActivityInfo;->configChanges:I

    .line 54
    .line 55
    iput p1, p0, Landroidx/appcompat/app/i;->V:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catch_0
    move-exception p1

    .line 59
    const-string v0, "AppCompatDelegate"

    .line 60
    .line 61
    const-string v2, "Exception while getting ActivityInfo"

    .line 62
    .line 63
    invoke-static {v0, v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 64
    .line 65
    .line 66
    iput v1, p0, Landroidx/appcompat/app/i;->V:I

    .line 67
    .line 68
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 69
    iput-boolean p1, p0, Landroidx/appcompat/app/i;->W:Z

    .line 70
    .line 71
    iget p1, p0, Landroidx/appcompat/app/i;->V:I

    .line 72
    .line 73
    return p1
.end method

.method private s0(Landroid/content/Context;)Landroidx/appcompat/app/i$p;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->Y:Landroidx/appcompat/app/i$p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/app/i$o;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/i$o;-><init>(Landroidx/appcompat/app/i;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/app/i;->Y:Landroidx/appcompat/app/i$p;

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/i;->Y:Landroidx/appcompat/app/i$p;

    .line 13
    .line 14
    return-object p1
.end method

.method private t0(Landroid/content/Context;)Landroidx/appcompat/app/i$p;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->X:Landroidx/appcompat/app/i$p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/app/i$q;

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/appcompat/app/H;->a(Landroid/content/Context;)Landroidx/appcompat/app/H;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/i$q;-><init>(Landroidx/appcompat/app/i;Landroidx/appcompat/app/H;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/appcompat/app/i;->X:Landroidx/appcompat/app/i$p;

    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/i;->X:Landroidx/appcompat/app/i$p;

    .line 17
    .line 18
    return-object p1
.end method

.method private y0()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/i;->m0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->G:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/appcompat/app/i;->o:Landroidx/appcompat/app/a;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Landroidx/appcompat/app/I;

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Landroid/app/Activity;

    .line 24
    .line 25
    iget-boolean v2, p0, Landroidx/appcompat/app/i;->H:Z

    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, Landroidx/appcompat/app/I;-><init>(Landroid/app/Activity;Z)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Landroidx/appcompat/app/i;->o:Landroidx/appcompat/app/a;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    instance-of v0, v0, Landroid/app/Dialog;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    new-instance v0, Landroidx/appcompat/app/I;

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Landroid/app/Dialog;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Landroidx/appcompat/app/I;-><init>(Landroid/app/Dialog;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Landroidx/appcompat/app/i;->o:Landroidx/appcompat/app/a;

    .line 47
    .line 48
    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->o:Landroidx/appcompat/app/a;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->c0:Z

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a;->s(Z)V

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_1
    return-void
.end method

.method private z0(Landroidx/appcompat/app/i$s;)Z
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/appcompat/app/i$s;->i:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v0, p1, Landroidx/appcompat/app/i$s;->h:Landroid/view/View;

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    return v2

    .line 15
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/i;->t:Landroidx/appcompat/app/i$t;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    new-instance v0, Landroidx/appcompat/app/i$t;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Landroidx/appcompat/app/i$t;-><init>(Landroidx/appcompat/app/i;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/appcompat/app/i;->t:Landroidx/appcompat/app/i$t;

    .line 25
    .line 26
    :cond_2
    iget-object v0, p0, Landroidx/appcompat/app/i;->t:Landroidx/appcompat/app/i$t;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/i$s;->a(Landroidx/appcompat/view/menu/j$a;)Landroidx/appcompat/view/menu/k;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/view/View;

    .line 33
    .line 34
    iput-object v0, p1, Landroidx/appcompat/app/i$s;->h:Landroid/view/View;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    return v1

    .line 39
    :cond_3
    return v2
.end method


# virtual methods
.method public A()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Landroidx/appcompat/app/g;->G(Landroidx/appcompat/app/g;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->Z:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Landroidx/appcompat/app/i;->b0:Ljava/lang/Runnable;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_1
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Landroidx/appcompat/app/i;->R:Z

    .line 27
    .line 28
    iget v0, p0, Landroidx/appcompat/app/i;->T:I

    .line 29
    .line 30
    const/16 v1, -0x64

    .line 31
    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 35
    .line 36
    instance-of v1, v0, Landroid/app/Activity;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    check-cast v0, Landroid/app/Activity;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    sget-object v0, Landroidx/appcompat/app/i;->j0:Landroidx/collection/i;

    .line 49
    .line 50
    iget-object v1, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget v2, p0, Landroidx/appcompat/app/i;->T:I

    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0, v1, v2}, Landroidx/collection/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    sget-object v0, Landroidx/appcompat/app/i;->j0:Landroidx/collection/i;

    .line 71
    .line 72
    iget-object v1, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Landroidx/collection/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->o:Landroidx/appcompat/app/a;

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->o()V

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-direct {p0}, Landroidx/appcompat/app/i;->c0()V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public B(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/i;->m0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public C()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->u()Landroidx/appcompat/app/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a;->x(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public D(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public D0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->z:Z

    .line 2
    .line 3
    return v0
.end method

.method public E()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Landroidx/appcompat/app/i;->V(ZZ)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method E0(Landroid/content/Context;I)I
    .locals 2

    .line 1
    const/16 v0, -0x64

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq p2, v0, :cond_4

    .line 5
    .line 6
    if-eq p2, v1, :cond_3

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eq p2, v0, :cond_3

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    if-eq p2, v0, :cond_3

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    if-ne p2, v0, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, p1}, Landroidx/appcompat/app/i;->s0(Landroid/content/Context;)Landroidx/appcompat/app/i$p;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroidx/appcompat/app/i$p;->c()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    const-string v0, "uimode"

    .line 41
    .line 42
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Landroid/app/UiModeManager;

    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-nez p2, :cond_2

    .line 53
    .line 54
    return v1

    .line 55
    :cond_2
    invoke-direct {p0, p1}, Landroidx/appcompat/app/i;->t0(Landroid/content/Context;)Landroidx/appcompat/app/i$p;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Landroidx/appcompat/app/i$p;->c()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1

    .line 64
    :cond_3
    return p2

    .line 65
    :cond_4
    return v1
.end method

.method public F()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->u()Landroidx/appcompat/app/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a;->x(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method F0()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->O:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Landroidx/appcompat/app/i;->O:Z

    .line 5
    .line 6
    invoke-virtual {p0, v1, v1}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-boolean v4, v2, Landroidx/appcompat/app/i$s;->o:Z

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v2, v3}, Landroidx/appcompat/app/i;->e0(Landroidx/appcompat/app/i$s;Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return v3

    .line 23
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/appcompat/view/b;->c()V

    .line 28
    .line 29
    .line 30
    return v3

    .line 31
    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->u()Landroidx/appcompat/app/a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->h()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    return v3

    .line 44
    :cond_3
    return v1
.end method

.method G0(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/16 v0, 0x52

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-direct {p0, v2, p2}, Landroidx/appcompat/app/i;->H0(ILandroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    return v1

    .line 15
    :cond_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getFlags()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    and-int/lit16 p1, p1, 0x80

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    move v1, v2

    .line 25
    :goto_0
    iput-boolean v1, p0, Landroidx/appcompat/app/i;->O:Z

    .line 26
    .line 27
    :goto_1
    return v2
.end method

.method public I(I)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/app/i;->T0(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->K:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0x6c

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-ne p1, v2, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->G:Z

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne p1, v3, :cond_1

    .line 21
    .line 22
    iput-boolean v1, p0, Landroidx/appcompat/app/i;->G:Z

    .line 23
    .line 24
    :cond_1
    if-eq p1, v3, :cond_7

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    if-eq p1, v0, :cond_6

    .line 28
    .line 29
    const/4 v0, 0x5

    .line 30
    if-eq p1, v0, :cond_5

    .line 31
    .line 32
    const/16 v0, 0xa

    .line 33
    .line 34
    if-eq p1, v0, :cond_4

    .line 35
    .line 36
    if-eq p1, v2, :cond_3

    .line 37
    .line 38
    const/16 v0, 0x6d

    .line 39
    .line 40
    if-eq p1, v0, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_2
    invoke-direct {p0}, Landroidx/appcompat/app/i;->b1()V

    .line 50
    .line 51
    .line 52
    iput-boolean v3, p0, Landroidx/appcompat/app/i;->H:Z

    .line 53
    .line 54
    return v3

    .line 55
    :cond_3
    invoke-direct {p0}, Landroidx/appcompat/app/i;->b1()V

    .line 56
    .line 57
    .line 58
    iput-boolean v3, p0, Landroidx/appcompat/app/i;->G:Z

    .line 59
    .line 60
    return v3

    .line 61
    :cond_4
    invoke-direct {p0}, Landroidx/appcompat/app/i;->b1()V

    .line 62
    .line 63
    .line 64
    iput-boolean v3, p0, Landroidx/appcompat/app/i;->I:Z

    .line 65
    .line 66
    return v3

    .line 67
    :cond_5
    invoke-direct {p0}, Landroidx/appcompat/app/i;->b1()V

    .line 68
    .line 69
    .line 70
    iput-boolean v3, p0, Landroidx/appcompat/app/i;->F:Z

    .line 71
    .line 72
    return v3

    .line 73
    :cond_6
    invoke-direct {p0}, Landroidx/appcompat/app/i;->b1()V

    .line 74
    .line 75
    .line 76
    iput-boolean v3, p0, Landroidx/appcompat/app/i;->E:Z

    .line 77
    .line 78
    return v3

    .line 79
    :cond_7
    invoke-direct {p0}, Landroidx/appcompat/app/i;->b1()V

    .line 80
    .line 81
    .line 82
    iput-boolean v3, p0, Landroidx/appcompat/app/i;->K:Z

    .line 83
    .line 84
    return v3
.end method

.method I0(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->u()Landroidx/appcompat/app/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/a;->p(ILandroid/view/KeyEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/i;->N:Landroidx/appcompat/app/i$s;

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-direct {p0, p1, v0, p2, v1}, Landroidx/appcompat/app/i;->Q0(Landroidx/appcompat/app/i$s;ILandroid/view/KeyEvent;I)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    iget-object p1, p0, Landroidx/appcompat/app/i;->N:Landroidx/appcompat/app/i$s;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iput-boolean v1, p1, Landroidx/appcompat/app/i$s;->n:Z

    .line 34
    .line 35
    :cond_1
    return v1

    .line 36
    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/i;->N:Landroidx/appcompat/app/i$s;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/app/i;->R0(Landroidx/appcompat/app/i$s;Landroid/view/KeyEvent;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-direct {p0, p1, v2, p2, v1}, Landroidx/appcompat/app/i;->Q0(Landroidx/appcompat/app/i$s;ILandroid/view/KeyEvent;I)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    iput-boolean v0, p1, Landroidx/appcompat/app/i$s;->m:Z

    .line 57
    .line 58
    if-eqz p2, :cond_3

    .line 59
    .line 60
    return v1

    .line 61
    :cond_3
    return v0
.end method

.method J0(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/16 v0, 0x52

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-direct {p0, v2, p2}, Landroidx/appcompat/app/i;->K0(ILandroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    return v1

    .line 15
    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->F0()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    return v1

    .line 22
    :cond_2
    :goto_0
    return v2
.end method

.method public K(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/i;->m0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/appcompat/app/i;->m:Landroidx/appcompat/app/i$n;

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/i$n;->c(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public L(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/i;->m0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/appcompat/app/i;->m:Landroidx/appcompat/app/i$n;

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/i$n;->c(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method L0(I)V
    .locals 1

    .line 1
    const/16 v0, 0x6c

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->u()Landroidx/appcompat/app/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/a;->i(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public M(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/i;->m0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/appcompat/app/i;->m:Landroidx/appcompat/app/i$n;

    .line 22
    .line 23
    iget-object p2, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p1, p2}, Landroidx/appcompat/app/i$n;->c(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method M0(I)V
    .locals 2

    .line 1
    const/16 v0, 0x6c

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->u()Landroidx/appcompat/app/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Landroidx/appcompat/app/a;->i(Z)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-boolean v0, p1, Landroidx/appcompat/app/i$s;->o:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1, v1}, Landroidx/appcompat/app/i;->e0(Landroidx/appcompat/app/i$s;Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method N0(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    return-void
.end method

.method public O(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/g;->O(Landroid/window/OnBackInvokedDispatcher;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/i;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/appcompat/app/i;->i0:Landroid/window/OnBackInvokedCallback;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-static {v0, v1}, Landroidx/appcompat/app/i$m;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Landroidx/appcompat/app/i;->i0:Landroid/window/OnBackInvokedCallback;

    .line 17
    .line 18
    :cond_0
    if-nez p1, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 21
    .line 22
    instance-of v1, v0, Landroid/app/Activity;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    check-cast v0, Landroid/app/Activity;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Landroid/app/Activity;

    .line 37
    .line 38
    invoke-static {p1}, Landroidx/appcompat/app/i$m;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Landroidx/appcompat/app/i;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput-object p1, p0, Landroidx/appcompat/app/i;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 46
    .line 47
    :goto_0
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->f1()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public P(Landroidx/appcompat/widget/Toolbar;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->u()Landroidx/appcompat/app/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v1, v0, Landroidx/appcompat/app/I;

    .line 13
    .line 14
    if-nez v1, :cond_3

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, Landroidx/appcompat/app/i;->p:Landroid/view/MenuInflater;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->o()V

    .line 22
    .line 23
    .line 24
    :cond_1
    iput-object v1, p0, Landroidx/appcompat/app/i;->o:Landroidx/appcompat/app/a;

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    new-instance v0, Landroidx/appcompat/app/F;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->w0()Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, p0, Landroidx/appcompat/app/i;->m:Landroidx/appcompat/app/i$n;

    .line 35
    .line 36
    invoke-direct {v0, p1, v1, v2}, Landroidx/appcompat/app/F;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Landroidx/appcompat/app/i;->o:Landroidx/appcompat/app/a;

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/appcompat/app/i;->m:Landroidx/appcompat/app/i$n;

    .line 42
    .line 43
    iget-object v0, v0, Landroidx/appcompat/app/F;->c:Landroidx/appcompat/app/i$g;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Landroidx/appcompat/app/i$n;->e(Landroidx/appcompat/app/i$g;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setBackInvokedCallbackEnabled(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/i;->m:Landroidx/appcompat/app/i$n;

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Landroidx/appcompat/app/i$n;->e(Landroidx/appcompat/app/i$g;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->w()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1
.end method

.method final P0()Landroidx/appcompat/app/a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->o:Landroidx/appcompat/app/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public Q(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/app/i;->U:I

    .line 2
    .line 3
    return-void
.end method

.method public final R(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/appcompat/app/i;->q:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Landroidx/appcompat/widget/G;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->P0()Landroidx/appcompat/app/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->P0()Landroidx/appcompat/app/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/a;->y(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/i;->C:Landroid/widget/TextView;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method U0(Landroid/content/res/Configuration;LE/i;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Landroidx/appcompat/app/i$k;->d(Landroid/content/res/Configuration;LE/i;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p2, v0}, LE/i;->d(I)Ljava/util/Locale;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1, v1}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v0}, LE/i;->d(I)Ljava/util/Locale;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method V0(LE/i;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/appcompat/app/i$k;->c(LE/i;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, LE/i;->d(I)Ljava/util/Locale;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method final W0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method Y(Landroid/content/Context;)LE/i;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    invoke-static {}, Landroidx/appcompat/app/g;->t()LE/i;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    return-object v2

    .line 16
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/i;->u0(Landroid/content/res/Configuration;)LE/i;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/16 v2, 0x18

    .line 33
    .line 34
    if-lt v0, v2, :cond_2

    .line 35
    .line 36
    invoke-static {v1, p1}, Landroidx/appcompat/app/C;->b(LE/i;LE/i;)LE/i;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {v1}, LE/i;->f()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-static {}, LE/i;->e()LE/i;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/4 v0, 0x0

    .line 53
    invoke-virtual {v1, v0}, LE/i;->d(I)Ljava/util/Locale;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Landroidx/appcompat/app/i$j;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, LE/i;->c(Ljava/lang/String;)LE/i;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :goto_0
    invoke-virtual {v0}, LE/i;->f()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_4
    return-object v0
.end method

.method Y0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0, v1, v1}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-boolean v0, v0, Landroidx/appcompat/app/i$s;->o:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return v2

    .line 19
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v1
.end method

.method public Z0(Landroidx/appcompat/view/b$a;)Landroidx/appcompat/view/b;
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/appcompat/view/b;->c()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Landroidx/appcompat/app/i$i;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/i$i;-><init>(Landroidx/appcompat/app/i;Landroidx/appcompat/view/b$a;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->u()Landroidx/appcompat/app/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/a;->A(Landroidx/appcompat/view/b$a;)Landroidx/appcompat/view/b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/appcompat/app/i;->n:Landroidx/appcompat/app/e;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v1, p1}, Landroidx/appcompat/app/e;->g(Landroidx/appcompat/view/b;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object p1, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 37
    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/i;->a1(Landroidx/appcompat/view/b$a;)Landroidx/appcompat/view/b;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->f1()V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    const-string v0, "ActionMode callback can not be null."

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public a(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->x0()Landroid/view/Window$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->R:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->F()Landroidx/appcompat/view/menu/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/i;->o0(Landroid/view/Menu;)Landroidx/appcompat/app/i$s;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget p1, p1, Landroidx/appcompat/app/i$s;->a:I

    .line 22
    .line 23
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method a0(ILandroidx/appcompat/app/i$s;Landroid/view/Menu;)V
    .locals 2

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/app/i;->M:[Landroidx/appcompat/app/i$s;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-ge p1, v1, :cond_0

    .line 11
    .line 12
    aget-object p2, v0, p1

    .line 13
    .line 14
    :cond_0
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-object p3, p2, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 17
    .line 18
    :cond_1
    if-eqz p2, :cond_2

    .line 19
    .line 20
    iget-boolean p2, p2, Landroidx/appcompat/app/i$s;->o:Z

    .line 21
    .line 22
    if-nez p2, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean p2, p0, Landroidx/appcompat/app/i;->R:Z

    .line 26
    .line 27
    if-nez p2, :cond_3

    .line 28
    .line 29
    iget-object p2, p0, Landroidx/appcompat/app/i;->m:Landroidx/appcompat/app/i$n;

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p2, v0, p1, p3}, Landroidx/appcompat/app/i$n;->d(Landroid/view/Window$Callback;ILandroid/view/Menu;)V

    .line 38
    .line 39
    .line 40
    :cond_3
    :goto_0
    return-void
.end method

.method a1(Landroidx/appcompat/view/b$a;)Landroidx/appcompat/view/b;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->l0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/appcompat/view/b;->c()V

    .line 9
    .line 10
    .line 11
    :cond_0
    instance-of v0, p1, Landroidx/appcompat/app/i$i;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Landroidx/appcompat/app/i$i;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/i$i;-><init>(Landroidx/appcompat/app/i;Landroidx/appcompat/view/b$a;)V

    .line 18
    .line 19
    .line 20
    move-object p1, v0

    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/i;->n:Landroidx/appcompat/app/e;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-boolean v2, p0, Landroidx/appcompat/app/i;->R:Z

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    :try_start_0
    invoke-interface {v0, p1}, Landroidx/appcompat/app/e;->u(Landroidx/appcompat/view/b$a;)Landroidx/appcompat/view/b;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    :cond_2
    move-object v0, v1

    .line 36
    :goto_0
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iput-object v0, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_3
    iget-object v0, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v3, 0x1

    .line 46
    if-nez v0, :cond_6

    .line 47
    .line 48
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->J:Z

    .line 49
    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    new-instance v0, Landroid/util/TypedValue;

    .line 53
    .line 54
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object v4, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 58
    .line 59
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    sget v5, Ld/a;->d:I

    .line 64
    .line 65
    invoke-virtual {v4, v5, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 66
    .line 67
    .line 68
    iget v5, v0, Landroid/util/TypedValue;->resourceId:I

    .line 69
    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    iget-object v5, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 73
    .line 74
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v5}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v5, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 83
    .line 84
    .line 85
    iget v4, v0, Landroid/util/TypedValue;->resourceId:I

    .line 86
    .line 87
    invoke-virtual {v5, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 88
    .line 89
    .line 90
    new-instance v4, Landroidx/appcompat/view/d;

    .line 91
    .line 92
    iget-object v6, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 93
    .line 94
    invoke-direct {v4, v6, v2}, Landroidx/appcompat/view/d;-><init>(Landroid/content/Context;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v6, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    iget-object v4, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 106
    .line 107
    :goto_1
    new-instance v5, Landroidx/appcompat/widget/ActionBarContextView;

    .line 108
    .line 109
    invoke-direct {v5, v4}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    iput-object v5, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 113
    .line 114
    new-instance v5, Landroid/widget/PopupWindow;

    .line 115
    .line 116
    sget v6, Ld/a;->f:I

    .line 117
    .line 118
    invoke-direct {v5, v4, v1, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 119
    .line 120
    .line 121
    iput-object v5, p0, Landroidx/appcompat/app/i;->w:Landroid/widget/PopupWindow;

    .line 122
    .line 123
    const/4 v6, 0x2

    .line 124
    invoke-static {v5, v6}, Landroidx/core/widget/h;->b(Landroid/widget/PopupWindow;I)V

    .line 125
    .line 126
    .line 127
    iget-object v5, p0, Landroidx/appcompat/app/i;->w:Landroid/widget/PopupWindow;

    .line 128
    .line 129
    iget-object v6, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 130
    .line 131
    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    iget-object v5, p0, Landroidx/appcompat/app/i;->w:Landroid/widget/PopupWindow;

    .line 135
    .line 136
    const/4 v6, -0x1

    .line 137
    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    sget v6, Ld/a;->b:I

    .line 145
    .line 146
    invoke-virtual {v5, v6, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 147
    .line 148
    .line 149
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 150
    .line 151
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-static {v0, v4}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    iget-object v4, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 164
    .line 165
    invoke-virtual {v4, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Landroidx/appcompat/app/i;->w:Landroid/widget/PopupWindow;

    .line 169
    .line 170
    const/4 v4, -0x2

    .line 171
    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 172
    .line 173
    .line 174
    new-instance v0, Landroidx/appcompat/app/i$d;

    .line 175
    .line 176
    invoke-direct {v0, p0}, Landroidx/appcompat/app/i$d;-><init>(Landroidx/appcompat/app/i;)V

    .line 177
    .line 178
    .line 179
    iput-object v0, p0, Landroidx/appcompat/app/i;->x:Ljava/lang/Runnable;

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    iget-object v0, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 183
    .line 184
    sget v4, Ld/f;->h:I

    .line 185
    .line 186
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Landroidx/appcompat/widget/ViewStubCompat;

    .line 191
    .line 192
    if-eqz v0, :cond_6

    .line 193
    .line 194
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->q0()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    .line 210
    .line 211
    iput-object v0, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 212
    .line 213
    :cond_6
    :goto_2
    iget-object v0, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 214
    .line 215
    if-eqz v0, :cond_b

    .line 216
    .line 217
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->l0()V

    .line 218
    .line 219
    .line 220
    iget-object v0, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 221
    .line 222
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    .line 223
    .line 224
    .line 225
    new-instance v0, Landroidx/appcompat/view/e;

    .line 226
    .line 227
    iget-object v4, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 228
    .line 229
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    iget-object v5, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 234
    .line 235
    iget-object v6, p0, Landroidx/appcompat/app/i;->w:Landroid/widget/PopupWindow;

    .line 236
    .line 237
    if-nez v6, :cond_7

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_7
    move v3, v2

    .line 241
    :goto_3
    invoke-direct {v0, v4, v5, p1, v3}, Landroidx/appcompat/view/e;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Landroidx/appcompat/view/b$a;Z)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Landroidx/appcompat/view/b;->e()Landroid/view/Menu;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-interface {p1, v0, v3}, Landroidx/appcompat/view/b$a;->d(Landroidx/appcompat/view/b;Landroid/view/Menu;)Z

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    if-eqz p1, :cond_a

    .line 253
    .line 254
    invoke-virtual {v0}, Landroidx/appcompat/view/b;->k()V

    .line 255
    .line 256
    .line 257
    iget-object p1, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 258
    .line 259
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->h(Landroidx/appcompat/view/b;)V

    .line 260
    .line 261
    .line 262
    iput-object v0, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 263
    .line 264
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->W0()Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    const/high16 v0, 0x3f800000    # 1.0f

    .line 269
    .line 270
    if-eqz p1, :cond_8

    .line 271
    .line 272
    iget-object p1, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 273
    .line 274
    const/4 v1, 0x0

    .line 275
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 276
    .line 277
    .line 278
    iget-object p1, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 279
    .line 280
    invoke-static {p1}, LJ/W;->e(Landroid/view/View;)LJ/e0;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-virtual {p1, v0}, LJ/e0;->b(F)LJ/e0;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    iput-object p1, p0, Landroidx/appcompat/app/i;->y:LJ/e0;

    .line 289
    .line 290
    new-instance v0, Landroidx/appcompat/app/i$e;

    .line 291
    .line 292
    invoke-direct {v0, p0}, Landroidx/appcompat/app/i$e;-><init>(Landroidx/appcompat/app/i;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1, v0}, LJ/e0;->g(LJ/f0;)LJ/e0;

    .line 296
    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_8
    iget-object p1, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 300
    .line 301
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 302
    .line 303
    .line 304
    iget-object p1, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 305
    .line 306
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 307
    .line 308
    .line 309
    iget-object p1, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 310
    .line 311
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    instance-of p1, p1, Landroid/view/View;

    .line 316
    .line 317
    if-eqz p1, :cond_9

    .line 318
    .line 319
    iget-object p1, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 320
    .line 321
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    check-cast p1, Landroid/view/View;

    .line 326
    .line 327
    invoke-static {p1}, LJ/W;->f0(Landroid/view/View;)V

    .line 328
    .line 329
    .line 330
    :cond_9
    :goto_4
    iget-object p1, p0, Landroidx/appcompat/app/i;->w:Landroid/widget/PopupWindow;

    .line 331
    .line 332
    if-eqz p1, :cond_b

    .line 333
    .line 334
    iget-object p1, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 335
    .line 336
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    iget-object v0, p0, Landroidx/appcompat/app/i;->x:Ljava/lang/Runnable;

    .line 341
    .line 342
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 343
    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_a
    iput-object v1, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 347
    .line 348
    :cond_b
    :goto_5
    iget-object p1, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 349
    .line 350
    if-eqz p1, :cond_c

    .line 351
    .line 352
    iget-object v0, p0, Landroidx/appcompat/app/i;->n:Landroidx/appcompat/app/e;

    .line 353
    .line 354
    if-eqz v0, :cond_c

    .line 355
    .line 356
    invoke-interface {v0, p1}, Landroidx/appcompat/app/e;->g(Landroidx/appcompat/view/b;)V

    .line 357
    .line 358
    .line 359
    :cond_c
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->f1()V

    .line 360
    .line 361
    .line 362
    iget-object p1, p0, Landroidx/appcompat/app/i;->u:Landroidx/appcompat/view/b;

    .line 363
    .line 364
    return-object p1
.end method

.method public b(Landroidx/appcompat/view/menu/e;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Landroidx/appcompat/app/i;->S0(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method b0(Landroidx/appcompat/view/menu/e;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->L:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/appcompat/app/i;->L:Z

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/appcompat/widget/G;->l()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->x0()Landroid/view/Window$Callback;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-boolean v1, p0, Landroidx/appcompat/app/i;->R:Z

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    const/16 v1, 0x6c

    .line 25
    .line 26
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    iput-boolean p1, p0, Landroidx/appcompat/app/i;->L:Z

    .line 31
    .line 32
    return-void
.end method

.method d0(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/i;->e0(Landroidx/appcompat/app/i$s;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public e(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/i;->m0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Landroidx/appcompat/app/i;->m:Landroidx/appcompat/app/i$n;

    .line 19
    .line 20
    iget-object p2, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p1, p2}, Landroidx/appcompat/app/i$n;->c(Landroid/view/Window$Callback;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method e0(Landroidx/appcompat/app/i$s;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget v0, p1, Landroidx/appcompat/app/i$s;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/appcompat/widget/G;->b()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/i;->b0(Landroidx/appcompat/view/menu/e;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 24
    .line 25
    const-string v1, "window"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/view/WindowManager;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-boolean v2, p1, Landroidx/appcompat/app/i$s;->o:Z

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    iget-object v2, p1, Landroidx/appcompat/app/i$s;->g:Landroid/view/ViewGroup;

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    iget p2, p1, Landroidx/appcompat/app/i$s;->a:I

    .line 50
    .line 51
    invoke-virtual {p0, p2, p1, v1}, Landroidx/appcompat/app/i;->a0(ILandroidx/appcompat/app/i$s;Landroid/view/Menu;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    const/4 p2, 0x0

    .line 55
    iput-boolean p2, p1, Landroidx/appcompat/app/i$s;->m:Z

    .line 56
    .line 57
    iput-boolean p2, p1, Landroidx/appcompat/app/i$s;->n:Z

    .line 58
    .line 59
    iput-boolean p2, p1, Landroidx/appcompat/app/i$s;->o:Z

    .line 60
    .line 61
    iput-object v1, p1, Landroidx/appcompat/app/i$s;->h:Landroid/view/View;

    .line 62
    .line 63
    const/4 p2, 0x1

    .line 64
    iput-boolean p2, p1, Landroidx/appcompat/app/i$s;->q:Z

    .line 65
    .line 66
    iget-object p2, p0, Landroidx/appcompat/app/i;->N:Landroidx/appcompat/app/i$s;

    .line 67
    .line 68
    if-ne p2, p1, :cond_2

    .line 69
    .line 70
    iput-object v1, p0, Landroidx/appcompat/app/i;->N:Landroidx/appcompat/app/i$s;

    .line 71
    .line 72
    :cond_2
    iget p1, p1, Landroidx/appcompat/app/i$s;->a:I

    .line 73
    .line 74
    if-nez p1, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->f1()V

    .line 77
    .line 78
    .line 79
    :cond_3
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Landroidx/appcompat/app/i;->U(Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
.end method

.method f1()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->Y0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/appcompat/app/i;->i0:Landroid/window/OnBackInvokedCallback;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/appcompat/app/i;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 18
    .line 19
    invoke-static {v0, p0}, Landroidx/appcompat/app/i$m;->b(Ljava/lang/Object;Landroidx/appcompat/app/i;)Landroid/window/OnBackInvokedCallback;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Landroidx/appcompat/app/i;->i0:Landroid/window/OnBackInvokedCallback;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/appcompat/app/i;->i0:Landroid/window/OnBackInvokedCallback;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Landroidx/appcompat/app/i;->h0:Landroid/window/OnBackInvokedDispatcher;

    .line 33
    .line 34
    invoke-static {v1, v0}, Landroidx/appcompat/app/i$m;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Landroidx/appcompat/app/i;->i0:Landroid/window/OnBackInvokedCallback;

    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public h0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->f0:Landroidx/appcompat/app/z;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 6
    .line 7
    sget-object v1, Ld/j;->y0:[I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget v1, Ld/j;->C0:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 20
    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    new-instance v0, Landroidx/appcompat/app/z;

    .line 25
    .line 26
    invoke-direct {v0}, Landroidx/appcompat/app/z;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Landroidx/appcompat/app/i;->f0:Landroidx/appcompat/app/z;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroidx/appcompat/app/z;

    .line 52
    .line 53
    iput-object v0, p0, Landroidx/appcompat/app/i;->f0:Landroidx/appcompat/app/z;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v3, "Failed to instantiate custom view inflater "

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ". Falling back to default."

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v2, "AppCompatDelegate"

    .line 80
    .line 81
    invoke-static {v2, v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 82
    .line 83
    .line 84
    new-instance v0, Landroidx/appcompat/app/z;

    .line 85
    .line 86
    invoke-direct {v0}, Landroidx/appcompat/app/z;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Landroidx/appcompat/app/i;->f0:Landroidx/appcompat/app/z;

    .line 90
    .line 91
    :cond_1
    :goto_0
    sget-boolean v7, Landroidx/appcompat/app/i;->k0:Z

    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    if-eqz v7, :cond_5

    .line 95
    .line 96
    iget-object v1, p0, Landroidx/appcompat/app/i;->g0:Landroidx/appcompat/app/B;

    .line 97
    .line 98
    if-nez v1, :cond_2

    .line 99
    .line 100
    new-instance v1, Landroidx/appcompat/app/B;

    .line 101
    .line 102
    invoke-direct {v1}, Landroidx/appcompat/app/B;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object v1, p0, Landroidx/appcompat/app/i;->g0:Landroidx/appcompat/app/B;

    .line 106
    .line 107
    :cond_2
    iget-object v1, p0, Landroidx/appcompat/app/i;->g0:Landroidx/appcompat/app/B;

    .line 108
    .line 109
    invoke-virtual {v1, p4}, Landroidx/appcompat/app/B;->a(Landroid/util/AttributeSet;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    const/4 v2, 0x1

    .line 114
    if-eqz v1, :cond_3

    .line 115
    .line 116
    move v6, v2

    .line 117
    goto :goto_2

    .line 118
    :cond_3
    instance-of v1, p4, Lorg/xmlpull/v1/XmlPullParser;

    .line 119
    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    move-object v1, p4

    .line 123
    check-cast v1, Lorg/xmlpull/v1/XmlPullParser;

    .line 124
    .line 125
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-le v1, v2, :cond_5

    .line 130
    .line 131
    move v0, v2

    .line 132
    goto :goto_1

    .line 133
    :cond_4
    move-object v0, p1

    .line 134
    check-cast v0, Landroid/view/ViewParent;

    .line 135
    .line 136
    invoke-direct {p0, v0}, Landroidx/appcompat/app/i;->X0(Landroid/view/ViewParent;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    :cond_5
    :goto_1
    move v6, v0

    .line 141
    :goto_2
    iget-object v1, p0, Landroidx/appcompat/app/i;->f0:Landroidx/appcompat/app/z;

    .line 142
    .line 143
    const/4 v8, 0x1

    .line 144
    invoke-static {}, Landroidx/appcompat/widget/o0;->d()Z

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    move-object v2, p1

    .line 149
    move-object v3, p2

    .line 150
    move-object v4, p3

    .line 151
    move-object v5, p4

    .line 152
    invoke-virtual/range {v1 .. v9}, Landroidx/appcompat/app/z;->r(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    return-object p1
.end method

.method final h1(LJ/w0;Landroid/graphics/Rect;)I
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, LJ/w0;->l()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    if-eqz p2, :cond_1

    .line 10
    .line 11
    iget v1, p2, Landroid/graphics/Rect;->top:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v1, v0

    .line 15
    :goto_0
    iget-object v2, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 16
    .line 17
    const/16 v3, 0x8

    .line 18
    .line 19
    if-eqz v2, :cond_10

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    instance-of v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 26
    .line 27
    if-eqz v2, :cond_10

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 36
    .line 37
    iget-object v4, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x1

    .line 44
    if-eqz v4, :cond_e

    .line 45
    .line 46
    iget-object v4, p0, Landroidx/appcompat/app/i;->d0:Landroid/graphics/Rect;

    .line 47
    .line 48
    if-nez v4, :cond_2

    .line 49
    .line 50
    new-instance v4, Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v4, p0, Landroidx/appcompat/app/i;->d0:Landroid/graphics/Rect;

    .line 56
    .line 57
    new-instance v4, Landroid/graphics/Rect;

    .line 58
    .line 59
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v4, p0, Landroidx/appcompat/app/i;->e0:Landroid/graphics/Rect;

    .line 63
    .line 64
    :cond_2
    iget-object v4, p0, Landroidx/appcompat/app/i;->d0:Landroid/graphics/Rect;

    .line 65
    .line 66
    iget-object v6, p0, Landroidx/appcompat/app/i;->e0:Landroid/graphics/Rect;

    .line 67
    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    invoke-virtual {v4, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {p1}, LJ/w0;->j()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    invoke-virtual {p1}, LJ/w0;->l()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    invoke-virtual {p1}, LJ/w0;->k()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    invoke-virtual {p1}, LJ/w0;->i()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-virtual {v4, p2, v7, v8, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object p1, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 94
    .line 95
    invoke-static {p1, v4, v6}, Landroidx/appcompat/widget/p0;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 96
    .line 97
    .line 98
    iget p1, v4, Landroid/graphics/Rect;->top:I

    .line 99
    .line 100
    iget p2, v4, Landroid/graphics/Rect;->left:I

    .line 101
    .line 102
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 103
    .line 104
    iget-object v6, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 105
    .line 106
    invoke-static {v6}, LJ/W;->D(Landroid/view/View;)LJ/w0;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    if-nez v6, :cond_4

    .line 111
    .line 112
    move v7, v0

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-virtual {v6}, LJ/w0;->j()I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    :goto_2
    if-nez v6, :cond_5

    .line 119
    .line 120
    move v6, v0

    .line 121
    goto :goto_3

    .line 122
    :cond_5
    invoke-virtual {v6}, LJ/w0;->k()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    :goto_3
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 127
    .line 128
    if-ne v8, p1, :cond_7

    .line 129
    .line 130
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 131
    .line 132
    if-ne v8, p2, :cond_7

    .line 133
    .line 134
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 135
    .line 136
    if-eq v8, v4, :cond_6

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    move p2, v0

    .line 140
    goto :goto_5

    .line 141
    :cond_7
    :goto_4
    iput p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 142
    .line 143
    iput p2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 144
    .line 145
    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 146
    .line 147
    move p2, v5

    .line 148
    :goto_5
    if-lez p1, :cond_8

    .line 149
    .line 150
    iget-object p1, p0, Landroidx/appcompat/app/i;->D:Landroid/view/View;

    .line 151
    .line 152
    if-nez p1, :cond_8

    .line 153
    .line 154
    new-instance p1, Landroid/view/View;

    .line 155
    .line 156
    iget-object v4, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 157
    .line 158
    invoke-direct {p1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 159
    .line 160
    .line 161
    iput-object p1, p0, Landroidx/appcompat/app/i;->D:Landroid/view/View;

    .line 162
    .line 163
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 164
    .line 165
    .line 166
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 167
    .line 168
    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 169
    .line 170
    const/16 v8, 0x33

    .line 171
    .line 172
    const/4 v9, -0x1

    .line 173
    invoke-direct {p1, v9, v4, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 174
    .line 175
    .line 176
    iput v7, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 177
    .line 178
    iput v6, p1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 179
    .line 180
    iget-object v4, p0, Landroidx/appcompat/app/i;->B:Landroid/view/ViewGroup;

    .line 181
    .line 182
    iget-object v6, p0, Landroidx/appcompat/app/i;->D:Landroid/view/View;

    .line 183
    .line 184
    invoke-virtual {v4, v6, v9, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_8
    iget-object p1, p0, Landroidx/appcompat/app/i;->D:Landroid/view/View;

    .line 189
    .line 190
    if-eqz p1, :cond_a

    .line 191
    .line 192
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 197
    .line 198
    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 199
    .line 200
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 201
    .line 202
    if-ne v4, v8, :cond_9

    .line 203
    .line 204
    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 205
    .line 206
    if-ne v4, v7, :cond_9

    .line 207
    .line 208
    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 209
    .line 210
    if-eq v4, v6, :cond_a

    .line 211
    .line 212
    :cond_9
    iput v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 213
    .line 214
    iput v7, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 215
    .line 216
    iput v6, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 217
    .line 218
    iget-object v4, p0, Landroidx/appcompat/app/i;->D:Landroid/view/View;

    .line 219
    .line 220
    invoke-virtual {v4, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 221
    .line 222
    .line 223
    :cond_a
    :goto_6
    iget-object p1, p0, Landroidx/appcompat/app/i;->D:Landroid/view/View;

    .line 224
    .line 225
    if-eqz p1, :cond_b

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_b
    move v5, v0

    .line 229
    :goto_7
    if-eqz v5, :cond_c

    .line 230
    .line 231
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    if-eqz p1, :cond_c

    .line 236
    .line 237
    iget-object p1, p0, Landroidx/appcompat/app/i;->D:Landroid/view/View;

    .line 238
    .line 239
    invoke-direct {p0, p1}, Landroidx/appcompat/app/i;->i1(Landroid/view/View;)V

    .line 240
    .line 241
    .line 242
    :cond_c
    iget-boolean p1, p0, Landroidx/appcompat/app/i;->I:Z

    .line 243
    .line 244
    if-nez p1, :cond_d

    .line 245
    .line 246
    if-eqz v5, :cond_d

    .line 247
    .line 248
    move v1, v0

    .line 249
    :cond_d
    move p1, v5

    .line 250
    move v5, p2

    .line 251
    goto :goto_8

    .line 252
    :cond_e
    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 253
    .line 254
    if-eqz p1, :cond_f

    .line 255
    .line 256
    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 257
    .line 258
    move p1, v0

    .line 259
    goto :goto_8

    .line 260
    :cond_f
    move p1, v0

    .line 261
    move v5, p1

    .line 262
    :goto_8
    if-eqz v5, :cond_11

    .line 263
    .line 264
    iget-object p2, p0, Landroidx/appcompat/app/i;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 265
    .line 266
    invoke-virtual {p2, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 267
    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_10
    move p1, v0

    .line 271
    :cond_11
    :goto_9
    iget-object p2, p0, Landroidx/appcompat/app/i;->D:Landroid/view/View;

    .line 272
    .line 273
    if-eqz p2, :cond_13

    .line 274
    .line 275
    if-eqz p1, :cond_12

    .line 276
    .line 277
    goto :goto_a

    .line 278
    :cond_12
    move v0, v3

    .line 279
    :goto_a
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 280
    .line 281
    .line 282
    :cond_13
    return v1
.end method

.method public i(Landroid/content/Context;)Landroid/content/Context;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/appcompat/app/i;->P:Z

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/appcompat/app/i;->Z()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/i;->E0(Landroid/content/Context;I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-static {p1}, Landroidx/appcompat/app/g;->x(Landroid/content/Context;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/appcompat/app/g;->T(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/i;->Y(Landroid/content/Context;)LE/i;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    instance-of v0, p1, Landroid/view/ContextThemeWrapper;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    move-object v1, p0

    .line 32
    move-object v2, p1

    .line 33
    invoke-direct/range {v1 .. v6}, Landroidx/appcompat/app/i;->f0(Landroid/content/Context;ILE/i;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :try_start_0
    move-object v0, v2

    .line 38
    check-cast v0, Landroid/view/ContextThemeWrapper;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return-object v2

    .line 44
    :cond_1
    move-object v2, p1

    .line 45
    :catch_0
    nop

    .line 46
    instance-of p1, v2, Landroidx/appcompat/view/d;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    move-object v1, p0

    .line 53
    invoke-direct/range {v1 .. v6}, Landroidx/appcompat/app/i;->f0(Landroid/content/Context;ILE/i;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :try_start_1
    move-object v0, v2

    .line 58
    check-cast v0, Landroidx/appcompat/view/d;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Landroidx/appcompat/view/d;->a(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    :catch_1
    :cond_2
    sget-boolean p1, Landroidx/appcompat/app/i;->m0:Z

    .line 65
    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    invoke-super {p0, v2}, Landroidx/appcompat/app/g;->i(Landroid/content/Context;)Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_3
    new-instance p1, Landroid/content/res/Configuration;

    .line 74
    .line 75
    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    .line 76
    .line 77
    .line 78
    const/4 v0, -0x1

    .line 79
    iput v0, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    iput v0, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 83
    .line 84
    invoke-virtual {v2, p1}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget v1, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 105
    .line 106
    iput v1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_4

    .line 113
    .line 114
    invoke-static {p1, v0}, Landroidx/appcompat/app/i;->p0(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :goto_0
    move-object v5, p1

    .line 119
    goto :goto_1

    .line 120
    :cond_4
    const/4 p1, 0x0

    .line 121
    goto :goto_0

    .line 122
    :goto_1
    const/4 v6, 0x1

    .line 123
    move-object v1, p0

    .line 124
    invoke-direct/range {v1 .. v6}, Landroidx/appcompat/app/i;->f0(Landroid/content/Context;ILE/i;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance v0, Landroidx/appcompat/view/d;

    .line 129
    .line 130
    sget v3, Ld/i;->e:I

    .line 131
    .line 132
    invoke-direct {v0, v2, v3}, Landroidx/appcompat/view/d;-><init>(Landroid/content/Context;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, p1}, Landroidx/appcompat/view/d;->a(Landroid/content/res/Configuration;)V

    .line 136
    .line 137
    .line 138
    :try_start_2
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 139
    .line 140
    .line 141
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_2

    .line 142
    if-eqz p1, :cond_5

    .line 143
    .line 144
    invoke-virtual {v0}, Landroidx/appcompat/view/d;->getTheme()Landroid/content/res/Resources$Theme;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-static {p1}, Ly/k$f;->a(Landroid/content/res/Resources$Theme;)V

    .line 149
    .line 150
    .line 151
    :catch_2
    :cond_5
    invoke-super {p0, v0}, Landroidx/appcompat/app/g;->i(Landroid/content/Context;)Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    return-object p1
.end method

.method i0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/appcompat/widget/G;->l()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->w:Landroid/widget/PopupWindow;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Landroidx/appcompat/app/i;->x:Ljava/lang/Runnable;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/appcompat/app/i;->w:Landroid/widget/PopupWindow;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->w:Landroid/widget/PopupWindow;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    :catch_0
    :cond_1
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Landroidx/appcompat/app/i;->w:Landroid/widget/PopupWindow;

    .line 38
    .line 39
    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->l0()V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0, v0}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    iget-object v0, v0, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->close()V

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void
.end method

.method j0(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, LJ/t$a;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    instance-of v0, v0, Landroidx/appcompat/app/y;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {v0, p1}, LJ/t;->d(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/16 v1, 0x52

    .line 32
    .line 33
    if-ne v0, v1, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/appcompat/app/i;->m:Landroidx/appcompat/app/i$n;

    .line 36
    .line 37
    iget-object v1, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1, p1}, Landroidx/appcompat/app/i$n;->b(Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    return v2

    .line 50
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0, v0, p1}, Landroidx/appcompat/app/i;->G0(ILandroid/view/KeyEvent;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    return p1

    .line 65
    :cond_3
    invoke-virtual {p0, v0, p1}, Landroidx/appcompat/app/i;->J0(ILandroid/view/KeyEvent;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1
.end method

.method k0(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, v1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    new-instance v2, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Landroidx/appcompat/view/menu/e;->U(Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-lez v3, :cond_0

    .line 25
    .line 26
    iput-object v2, v1, Landroidx/appcompat/app/i$s;->s:Landroid/os/Bundle;

    .line 27
    .line 28
    :cond_0
    iget-object v2, v1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroidx/appcompat/view/menu/e;->i0()V

    .line 31
    .line 32
    .line 33
    iget-object v2, v1, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroidx/appcompat/view/menu/e;->clear()V

    .line 36
    .line 37
    .line 38
    :cond_1
    iput-boolean v0, v1, Landroidx/appcompat/app/i$s;->r:Z

    .line 39
    .line 40
    iput-boolean v0, v1, Landroidx/appcompat/app/i$s;->q:Z

    .line 41
    .line 42
    const/16 v0, 0x6c

    .line 43
    .line 44
    if-eq p1, v0, :cond_2

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/i;->r:Landroidx/appcompat/widget/G;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {p0, p1, p1}, Landroidx/appcompat/app/i;->v0(IZ)Landroidx/appcompat/app/i$s;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    iput-boolean p1, v0, Landroidx/appcompat/app/i$s;->m:Z

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-direct {p0, v0, p1}, Landroidx/appcompat/app/i;->R0(Landroidx/appcompat/app/i$s;Landroid/view/KeyEvent;)Z

    .line 63
    .line 64
    .line 65
    :cond_3
    return-void
.end method

.method public l(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/i;->m0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method l0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->y:LJ/e0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LJ/e0;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public n()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method o0(Landroid/view/Menu;)Landroidx/appcompat/app/i$s;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->M:[Landroidx/appcompat/app/i$s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v1

    .line 9
    :goto_0
    if-ge v1, v2, :cond_2

    .line 10
    .line 11
    aget-object v3, v0, v1

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    iget-object v4, v3, Landroidx/appcompat/app/i$s;->j:Landroidx/appcompat/view/menu/e;

    .line 16
    .line 17
    if-ne v4, p1, :cond_1

    .line 18
    .line 19
    return-object v3

    .line 20
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/appcompat/app/i;->h0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/appcompat/app/i;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final p()Landroidx/appcompat/app/b$b;
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/app/i$f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/appcompat/app/i$f;-><init>(Landroidx/appcompat/app/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public q()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/app/i;->T:I

    .line 2
    .line 3
    return v0
.end method

.method final q0()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->u()Landroidx/appcompat/app/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->k()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 16
    .line 17
    :cond_1
    return-object v0
.end method

.method public s()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->p:Landroid/view/MenuInflater;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/appcompat/app/i;->y0()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroidx/appcompat/view/g;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/appcompat/app/i;->o:Landroidx/appcompat/app/a;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Landroidx/appcompat/app/a;->k()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 20
    .line 21
    :goto_0
    invoke-direct {v0, v1}, Landroidx/appcompat/view/g;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/appcompat/app/i;->p:Landroid/view/MenuInflater;

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/i;->p:Landroid/view/MenuInflater;

    .line 27
    .line 28
    return-object v0
.end method

.method public u()Landroidx/appcompat/app/a;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/i;->y0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/app/i;->o:Landroidx/appcompat/app/a;

    .line 5
    .line 6
    return-object v0
.end method

.method u0(Landroid/content/res/Configuration;)LE/i;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/appcompat/app/i$k;->b(Landroid/content/res/Configuration;)LE/i;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 13
    .line 14
    invoke-static {p1}, Landroidx/appcompat/app/i$j;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, LE/i;->c(Ljava/lang/String;)LE/i;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public v()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v0, p0}, LJ/u;->a(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v0, v0, Landroidx/appcompat/app/i;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "AppCompatDelegate"

    .line 26
    .line 27
    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    .line 28
    .line 29
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method protected v0(IZ)Landroidx/appcompat/app/i$s;
    .locals 3

    .line 1
    iget-object p2, p0, Landroidx/appcompat/app/i;->M:[Landroidx/appcompat/app/i$s;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    array-length v0, p2

    .line 6
    if-gt v0, p1, :cond_2

    .line 7
    .line 8
    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 9
    .line 10
    new-array v0, v0, [Landroidx/appcompat/app/i$s;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    array-length v1, p2

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iput-object v0, p0, Landroidx/appcompat/app/i;->M:[Landroidx/appcompat/app/i$s;

    .line 20
    .line 21
    move-object p2, v0

    .line 22
    :cond_2
    aget-object v0, p2, p1

    .line 23
    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    new-instance v0, Landroidx/appcompat/app/i$s;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Landroidx/appcompat/app/i$s;-><init>(I)V

    .line 29
    .line 30
    .line 31
    aput-object v0, p2, p1

    .line 32
    .line 33
    :cond_3
    return-object v0
.end method

.method public w()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->P0()Landroidx/appcompat/app/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->u()Landroidx/appcompat/app/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->m()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, v0}, Landroidx/appcompat/app/i;->C0(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method final w0()Ljava/lang/CharSequence;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/i;->q:Ljava/lang/CharSequence;

    .line 15
    .line 16
    return-object v0
.end method

.method final x0()Landroid/view/Window$Callback;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/i;->l:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public y(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->G:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/appcompat/app/i;->A:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->u()Landroidx/appcompat/app/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/a;->n(Landroid/content/res/Configuration;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Landroidx/appcompat/widget/j;->b()Landroidx/appcompat/widget/j;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/j;->g(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Landroid/content/res/Configuration;

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Landroidx/appcompat/app/i;->S:Landroid/content/res/Configuration;

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-direct {p0, p1, p1}, Landroidx/appcompat/app/i;->V(ZZ)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public z(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Landroidx/appcompat/app/i;->P:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Landroidx/appcompat/app/i;->U(Z)Z

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/appcompat/app/i;->n0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/app/i;->j:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of v1, v0, Landroid/app/Activity;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    :try_start_0
    check-cast v0, Landroid/app/Activity;

    .line 18
    .line 19
    invoke-static {v0}, Lx/j;->c(Landroid/app/Activity;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/appcompat/app/i;->P0()Landroidx/appcompat/app/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iput-boolean p1, p0, Landroidx/appcompat/app/i;->c0:Z

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/a;->s(Z)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_1
    invoke-static {p0}, Landroidx/appcompat/app/g;->d(Landroidx/appcompat/app/g;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    new-instance v0, Landroid/content/res/Configuration;

    .line 43
    .line 44
    iget-object v1, p0, Landroidx/appcompat/app/i;->k:Landroid/content/Context;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Landroidx/appcompat/app/i;->S:Landroid/content/res/Configuration;

    .line 58
    .line 59
    iput-boolean p1, p0, Landroidx/appcompat/app/i;->Q:Z

    .line 60
    .line 61
    return-void
.end method
