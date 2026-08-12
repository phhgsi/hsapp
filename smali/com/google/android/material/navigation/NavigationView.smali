.class public Lcom/google/android/material/navigation/NavigationView;
.super Lcom/google/android/material/internal/k;
.source "SourceFile"

# interfaces
.implements LT0/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/navigation/NavigationView$SavedState;,
        Lcom/google/android/material/navigation/NavigationView$d;
    }
.end annotation


# static fields
.field private static final A:[I

.field private static final B:I

.field private static final z:[I


# instance fields
.field private final h:Lcom/google/android/material/internal/h;

.field private final i:Lcom/google/android/material/internal/i;

.field j:Lcom/google/android/material/navigation/NavigationView$d;

.field private final k:I

.field private final l:[I

.field private m:Landroid/view/MenuInflater;

.field private n:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:I

.field private final t:Z

.field private final u:I

.field private final v:LZ0/p;

.field private final w:LT0/g;

.field private final x:LT0/c;

.field private final y:Landroidx/drawerlayout/widget/DrawerLayout$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->z:[I

    .line 9
    .line 10
    const v0, -0x101009e

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->A:[I

    .line 18
    .line 19
    sget v0, LF0/j;->h:I

    .line 20
    .line 21
    sput v0, Lcom/google/android/material/navigation/NavigationView;->B:I

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, LF0/a;->L:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v4, p3

    .line 2
    sget v5, Lcom/google/android/material/navigation/NavigationView;->B:I

    move-object/from16 v1, p1

    invoke-static {v1, v2, v4, v5}, Lc1/a;->d(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v2, v4}, Lcom/google/android/material/internal/k;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance v7, Lcom/google/android/material/internal/i;

    invoke-direct {v7}, Lcom/google/android/material/internal/i;-><init>()V

    iput-object v7, v0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    const/4 v1, 0x2

    .line 4
    new-array v1, v1, [I

    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->l:[I

    const/4 v8, 0x1

    .line 5
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->o:Z

    .line 6
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->p:Z

    .line 7
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->q:Z

    .line 8
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->r:Z

    const/4 v9, 0x0

    .line 9
    iput v9, v0, Lcom/google/android/material/navigation/NavigationView;->s:I

    .line 10
    invoke-static {v0}, LZ0/p;->a(Landroid/view/View;)LZ0/p;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->v:LZ0/p;

    .line 11
    new-instance v1, LT0/g;

    invoke-direct {v1, v0}, LT0/g;-><init>(Landroid/view/View;)V

    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->w:LT0/g;

    .line 12
    new-instance v1, LT0/c;

    invoke-direct {v1, v0}, LT0/c;-><init>(Landroid/view/View;)V

    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->x:LT0/c;

    .line 13
    new-instance v1, Lcom/google/android/material/navigation/NavigationView$a;

    invoke-direct {v1, v0}, Lcom/google/android/material/navigation/NavigationView$a;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->y:Landroidx/drawerlayout/widget/DrawerLayout$d;

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 15
    new-instance v10, Lcom/google/android/material/internal/h;

    invoke-direct {v10, v1}, Lcom/google/android/material/internal/h;-><init>(Landroid/content/Context;)V

    iput-object v10, v0, Lcom/google/android/material/navigation/NavigationView;->h:Lcom/google/android/material/internal/h;

    .line 16
    sget-object v3, LF0/k;->j5:[I

    new-array v6, v9, [I

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/google/android/material/internal/q;->j(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroidx/appcompat/widget/e0;

    move-result-object v3

    .line 18
    sget v6, LF0/k;->k5:I

    invoke-virtual {v3, v6}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v11

    if-eqz v11, :cond_0

    .line 19
    invoke-virtual {v3, v6}, Landroidx/appcompat/widget/e0;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 20
    :cond_0
    sget v6, LF0/k;->q5:I

    .line 21
    invoke-virtual {v3, v6, v9}, Landroidx/appcompat/widget/e0;->f(II)I

    move-result v6

    iput v6, v0, Lcom/google/android/material/navigation/NavigationView;->s:I

    if-nez v6, :cond_1

    move v6, v8

    goto :goto_0

    :cond_1
    move v6, v9

    .line 22
    :goto_0
    iput-boolean v6, v0, Lcom/google/android/material/navigation/NavigationView;->t:Z

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v11, LF0/c;->C:I

    invoke-virtual {v6, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    iput v6, v0, Lcom/google/android/material/navigation/NavigationView;->u:I

    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 25
    invoke-static {v6}, Lcom/google/android/material/drawable/d;->f(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    move-result-object v11

    if-eqz v6, :cond_2

    if-eqz v11, :cond_4

    .line 26
    :cond_2
    invoke-static {v1, v2, v4, v5}, LZ0/l;->e(Landroid/content/Context;Landroid/util/AttributeSet;II)LZ0/l$b;

    move-result-object v2

    invoke-virtual {v2}, LZ0/l$b;->m()LZ0/l;

    move-result-object v2

    .line 27
    new-instance v4, LZ0/h;

    invoke-direct {v4, v2}, LZ0/h;-><init>(LZ0/l;)V

    if-eqz v11, :cond_3

    .line 28
    invoke-virtual {v4, v11}, LZ0/h;->c0(Landroid/content/res/ColorStateList;)V

    .line 29
    :cond_3
    invoke-virtual {v4, v1}, LZ0/h;->Q(Landroid/content/Context;)V

    .line 30
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 31
    :cond_4
    sget v2, LF0/k;->r5:I

    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 32
    invoke-virtual {v3, v2, v9}, Landroidx/appcompat/widget/e0;->f(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationView;->setElevation(F)V

    .line 33
    :cond_5
    sget v2, LF0/k;->l5:I

    invoke-virtual {v3, v2, v9}, Landroidx/appcompat/widget/e0;->a(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 34
    sget v2, LF0/k;->m5:I

    invoke-virtual {v3, v2, v9}, Landroidx/appcompat/widget/e0;->f(II)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/navigation/NavigationView;->k:I

    .line 35
    sget v2, LF0/k;->O5:I

    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_6

    .line 36
    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/e0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    goto :goto_1

    :cond_6
    move-object v2, v5

    .line 37
    :goto_1
    sget v4, LF0/k;->R5:I

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 38
    invoke-virtual {v3, v4, v9}, Landroidx/appcompat/widget/e0;->n(II)I

    move-result v4

    goto :goto_2

    :cond_7
    move v4, v9

    :goto_2
    const v6, 0x1010038

    if-nez v4, :cond_8

    if-nez v2, :cond_8

    .line 39
    invoke-direct {v0, v6}, Lcom/google/android/material/navigation/NavigationView;->k(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    .line 40
    :cond_8
    sget v11, LF0/k;->y5:I

    invoke-virtual {v3, v11}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v12

    if-eqz v12, :cond_9

    .line 41
    invoke-virtual {v3, v11}, Landroidx/appcompat/widget/e0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    goto :goto_3

    .line 42
    :cond_9
    invoke-direct {v0, v6}, Lcom/google/android/material/navigation/NavigationView;->k(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    .line 43
    :goto_3
    sget v11, LF0/k;->I5:I

    invoke-virtual {v3, v11}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v12

    if-eqz v12, :cond_a

    .line 44
    invoke-virtual {v3, v11, v9}, Landroidx/appcompat/widget/e0;->n(II)I

    move-result v11

    goto :goto_4

    :cond_a
    move v11, v9

    .line 45
    :goto_4
    sget v12, LF0/k;->J5:I

    .line 46
    invoke-virtual {v3, v12, v8}, Landroidx/appcompat/widget/e0;->a(IZ)Z

    move-result v12

    .line 47
    sget v13, LF0/k;->x5:I

    invoke-virtual {v3, v13}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v14

    if-eqz v14, :cond_b

    .line 48
    invoke-virtual {v3, v13, v9}, Landroidx/appcompat/widget/e0;->f(II)I

    move-result v13

    invoke-virtual {v0, v13}, Lcom/google/android/material/navigation/NavigationView;->setItemIconSize(I)V

    .line 49
    :cond_b
    sget v13, LF0/k;->K5:I

    invoke-virtual {v3, v13}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v14

    if-eqz v14, :cond_c

    .line 50
    invoke-virtual {v3, v13}, Landroidx/appcompat/widget/e0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v13

    goto :goto_5

    :cond_c
    move-object v13, v5

    :goto_5
    if-nez v11, :cond_d

    if-nez v13, :cond_d

    const v13, 0x1010036

    .line 51
    invoke-direct {v0, v13}, Lcom/google/android/material/navigation/NavigationView;->k(I)Landroid/content/res/ColorStateList;

    move-result-object v13

    .line 52
    :cond_d
    sget v14, LF0/k;->u5:I

    invoke-virtual {v3, v14}, Landroidx/appcompat/widget/e0;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    if-nez v14, :cond_e

    .line 53
    invoke-direct {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->n(Landroidx/appcompat/widget/e0;)Z

    move-result v15

    if-eqz v15, :cond_e

    .line 54
    invoke-direct {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->l(Landroidx/appcompat/widget/e0;)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    .line 55
    sget v15, LF0/k;->A5:I

    .line 56
    invoke-static {v1, v3, v15}, LW0/c;->b(Landroid/content/Context;Landroidx/appcompat/widget/e0;I)Landroid/content/res/ColorStateList;

    move-result-object v15

    if-eqz v15, :cond_e

    .line 57
    invoke-direct {v0, v3, v5}, Lcom/google/android/material/navigation/NavigationView;->m(Landroidx/appcompat/widget/e0;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 58
    new-instance v9, Landroid/graphics/drawable/RippleDrawable;

    .line 59
    invoke-static {v15}, LX0/a;->d(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v15

    invoke-direct {v9, v15, v5, v8}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 60
    invoke-virtual {v7, v9}, Lcom/google/android/material/internal/i;->K(Landroid/graphics/drawable/RippleDrawable;)V

    .line 61
    :cond_e
    sget v5, LF0/k;->v5:I

    invoke-virtual {v3, v5}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v8

    if-eqz v8, :cond_f

    const/4 v8, 0x0

    .line 62
    invoke-virtual {v3, v5, v8}, Landroidx/appcompat/widget/e0;->f(II)I

    move-result v5

    .line 63
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->setItemHorizontalPadding(I)V

    goto :goto_6

    :cond_f
    const/4 v8, 0x0

    .line 64
    :goto_6
    sget v5, LF0/k;->L5:I

    invoke-virtual {v3, v5}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v9

    if-eqz v9, :cond_10

    .line 65
    invoke-virtual {v3, v5, v8}, Landroidx/appcompat/widget/e0;->f(II)I

    move-result v5

    .line 66
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->setItemVerticalPadding(I)V

    .line 67
    :cond_10
    sget v5, LF0/k;->p5:I

    .line 68
    invoke-virtual {v3, v5, v8}, Landroidx/appcompat/widget/e0;->f(II)I

    move-result v5

    .line 69
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetStart(I)V

    .line 70
    sget v5, LF0/k;->o5:I

    .line 71
    invoke-virtual {v3, v5, v8}, Landroidx/appcompat/widget/e0;->f(II)I

    move-result v5

    .line 72
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetEnd(I)V

    .line 73
    sget v5, LF0/k;->Q5:I

    .line 74
    invoke-virtual {v3, v5, v8}, Landroidx/appcompat/widget/e0;->f(II)I

    move-result v5

    .line 75
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetStart(I)V

    .line 76
    sget v5, LF0/k;->P5:I

    .line 77
    invoke-virtual {v3, v5, v8}, Landroidx/appcompat/widget/e0;->f(II)I

    move-result v5

    .line 78
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetEnd(I)V

    .line 79
    sget v5, LF0/k;->S5:I

    iget-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->o:Z

    .line 80
    invoke-virtual {v3, v5, v8}, Landroidx/appcompat/widget/e0;->a(IZ)Z

    move-result v5

    .line 81
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->setTopInsetScrimEnabled(Z)V

    .line 82
    sget v5, LF0/k;->n5:I

    iget-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->p:Z

    .line 83
    invoke-virtual {v3, v5, v8}, Landroidx/appcompat/widget/e0;->a(IZ)Z

    move-result v5

    .line 84
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->setBottomInsetScrimEnabled(Z)V

    .line 85
    sget v5, LF0/k;->N5:I

    iget-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->q:Z

    .line 86
    invoke-virtual {v3, v5, v8}, Landroidx/appcompat/widget/e0;->a(IZ)Z

    move-result v5

    .line 87
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->setStartInsetScrimEnabled(Z)V

    .line 88
    sget v5, LF0/k;->s5:I

    iget-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->r:Z

    .line 89
    invoke-virtual {v3, v5, v8}, Landroidx/appcompat/widget/e0;->a(IZ)Z

    move-result v5

    .line 90
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->setEndInsetScrimEnabled(Z)V

    .line 91
    sget v5, LF0/k;->w5:I

    const/4 v8, 0x0

    .line 92
    invoke-virtual {v3, v5, v8}, Landroidx/appcompat/widget/e0;->f(II)I

    move-result v5

    .line 93
    sget v8, LF0/k;->z5:I

    const/4 v9, 0x1

    invoke-virtual {v3, v8, v9}, Landroidx/appcompat/widget/e0;->k(II)I

    move-result v8

    invoke-virtual {v0, v8}, Lcom/google/android/material/navigation/NavigationView;->setItemMaxLines(I)V

    .line 94
    new-instance v8, Lcom/google/android/material/navigation/NavigationView$b;

    invoke-direct {v8, v0}, Lcom/google/android/material/navigation/NavigationView$b;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    invoke-virtual {v10, v8}, Landroidx/appcompat/view/menu/e;->W(Landroidx/appcompat/view/menu/e$a;)V

    .line 95
    invoke-virtual {v7, v9}, Lcom/google/android/material/internal/i;->I(I)V

    .line 96
    invoke-virtual {v7, v1, v10}, Lcom/google/android/material/internal/i;->d(Landroid/content/Context;Landroidx/appcompat/view/menu/e;)V

    if-eqz v4, :cond_11

    .line 97
    invoke-virtual {v7, v4}, Lcom/google/android/material/internal/i;->Y(I)V

    .line 98
    :cond_11
    invoke-virtual {v7, v2}, Lcom/google/android/material/internal/i;->V(Landroid/content/res/ColorStateList;)V

    .line 99
    invoke-virtual {v7, v6}, Lcom/google/android/material/internal/i;->O(Landroid/content/res/ColorStateList;)V

    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getOverScrollMode()I

    move-result v1

    invoke-virtual {v7, v1}, Lcom/google/android/material/internal/i;->U(I)V

    if-eqz v11, :cond_12

    .line 101
    invoke-virtual {v7, v11}, Lcom/google/android/material/internal/i;->Q(I)V

    .line 102
    :cond_12
    invoke-virtual {v7, v12}, Lcom/google/android/material/internal/i;->R(Z)V

    .line 103
    invoke-virtual {v7, v13}, Lcom/google/android/material/internal/i;->S(Landroid/content/res/ColorStateList;)V

    .line 104
    invoke-virtual {v7, v14}, Lcom/google/android/material/internal/i;->J(Landroid/graphics/drawable/Drawable;)V

    .line 105
    invoke-virtual {v7, v5}, Lcom/google/android/material/internal/i;->M(I)V

    .line 106
    invoke-virtual {v10, v7}, Landroidx/appcompat/view/menu/e;->b(Landroidx/appcompat/view/menu/j;)V

    .line 107
    invoke-virtual {v7, v0}, Lcom/google/android/material/internal/i;->z(Landroid/view/ViewGroup;)Landroidx/appcompat/view/menu/k;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 108
    sget v1, LF0/k;->M5:I

    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v2

    const/4 v8, 0x0

    if-eqz v2, :cond_13

    .line 109
    invoke-virtual {v3, v1, v8}, Landroidx/appcompat/widget/e0;->n(II)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/navigation/NavigationView;->p(I)V

    .line 110
    :cond_13
    sget v1, LF0/k;->t5:I

    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/e0;->s(I)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 111
    invoke-virtual {v3, v1, v8}, Landroidx/appcompat/widget/e0;->n(II)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/navigation/NavigationView;->o(I)Landroid/view/View;

    .line 112
    :cond_14
    invoke-virtual {v3}, Landroidx/appcompat/widget/e0;->x()V

    .line 113
    invoke-direct {v0}, Lcom/google/android/material/navigation/NavigationView;->x()V

    return-void
.end method

.method public static synthetic f(Lcom/google/android/material/navigation/NavigationView;Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic g(Lcom/google/android/material/navigation/NavigationView;)LT0/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->x:LT0/c;

    .line 2
    .line 3
    return-object p0
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->m:Landroid/view/MenuInflater;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/view/g;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/appcompat/view/g;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->m:Landroid/view/MenuInflater;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->m:Landroid/view/MenuInflater;

    .line 17
    .line 18
    return-object v0
.end method

.method static synthetic h(Lcom/google/android/material/navigation/NavigationView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->u()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic i(Lcom/google/android/material/navigation/NavigationView;)[I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->l:[I

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic j(Lcom/google/android/material/navigation/NavigationView;)Lcom/google/android/material/internal/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    return-object p0
.end method

.method private k(I)Landroid/content/res/ColorStateList;
    .locals 7

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v1, 0x0

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget v3, v0, Landroid/util/TypedValue;->resourceId:I

    .line 28
    .line 29
    invoke-static {p1, v3}, Le/a;->a(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    sget v4, Ld/a;->w:I

    .line 42
    .line 43
    invoke-virtual {v3, v4, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_1
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    new-instance v3, Landroid/content/res/ColorStateList;

    .line 57
    .line 58
    sget-object v4, Lcom/google/android/material/navigation/NavigationView;->A:[I

    .line 59
    .line 60
    const/4 v5, 0x3

    .line 61
    new-array v5, v5, [[I

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    aput-object v4, v5, v6

    .line 65
    .line 66
    sget-object v6, Lcom/google/android/material/navigation/NavigationView;->z:[I

    .line 67
    .line 68
    aput-object v6, v5, v2

    .line 69
    .line 70
    sget-object v2, Landroid/widget/FrameLayout;->EMPTY_STATE_SET:[I

    .line 71
    .line 72
    const/4 v6, 0x2

    .line 73
    aput-object v2, v5, v6

    .line 74
    .line 75
    invoke-virtual {p1, v4, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    filled-new-array {p1, v0, v1}, [I

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {v3, v5, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 84
    .line 85
    .line 86
    return-object v3
.end method

.method private l(Landroidx/appcompat/widget/e0;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, LF0/k;->D5:I

    .line 6
    .line 7
    invoke-static {v0, p1, v1}, LW0/c;->b(Landroid/content/Context;Landroidx/appcompat/widget/e0;I)Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/navigation/NavigationView;->m(Landroidx/appcompat/widget/e0;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method private m(Landroidx/appcompat/widget/e0;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;
    .locals 9

    .line 1
    sget v0, LF0/k;->B5:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/widget/e0;->n(II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sget v2, LF0/k;->C5:I

    .line 9
    .line 10
    invoke-virtual {p1, v2, v1}, Landroidx/appcompat/widget/e0;->n(II)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    new-instance v4, LZ0/h;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v3, v0, v2}, LZ0/l;->b(Landroid/content/Context;II)LZ0/l$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, LZ0/l$b;->m()LZ0/l;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {v4, v0}, LZ0/h;-><init>(LZ0/l;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, p2}, LZ0/h;->c0(Landroid/content/res/ColorStateList;)V

    .line 32
    .line 33
    .line 34
    sget p2, LF0/k;->G5:I

    .line 35
    .line 36
    invoke-virtual {p1, p2, v1}, Landroidx/appcompat/widget/e0;->f(II)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    sget p2, LF0/k;->H5:I

    .line 41
    .line 42
    invoke-virtual {p1, p2, v1}, Landroidx/appcompat/widget/e0;->f(II)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    sget p2, LF0/k;->F5:I

    .line 47
    .line 48
    invoke-virtual {p1, p2, v1}, Landroidx/appcompat/widget/e0;->f(II)I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    sget p2, LF0/k;->E5:I

    .line 53
    .line 54
    invoke-virtual {p1, p2, v1}, Landroidx/appcompat/widget/e0;->f(II)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    new-instance v3, Landroid/graphics/drawable/InsetDrawable;

    .line 59
    .line 60
    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 61
    .line 62
    .line 63
    return-object v3
.end method

.method private n(Landroidx/appcompat/widget/e0;)Z
    .locals 1

    .line 1
    sget v0, LF0/k;->B5:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    sget v0, LF0/k;->C5:I

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    return p1
.end method

.method private u()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->s:I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/google/android/material/navigation/NavigationView;->s:I

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-direct {p0, v0, v1}, Lcom/google/android/material/navigation/NavigationView;->v(II)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private v(II)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, Landroidx/drawerlayout/widget/DrawerLayout$e;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->s:I

    .line 18
    .line 19
    if-gtz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->t:Z

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v0, v0, LZ0/h;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout$e;

    .line 38
    .line 39
    iget v0, v0, Landroidx/drawerlayout/widget/DrawerLayout$e;->a:I

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v0, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x3

    .line 50
    const/4 v2, 0x1

    .line 51
    if-ne v0, v1, :cond_1

    .line 52
    .line 53
    move v0, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v0, 0x0

    .line 56
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, LZ0/h;

    .line 61
    .line 62
    invoke-virtual {v1}, LZ0/h;->H()LZ0/l;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, LZ0/l;->w()LZ0/l$b;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iget v4, p0, Lcom/google/android/material/navigation/NavigationView;->s:I

    .line 71
    .line 72
    int-to-float v4, v4

    .line 73
    invoke-virtual {v3, v4}, LZ0/l$b;->o(F)LZ0/l$b;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const/4 v4, 0x0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-virtual {v3, v4}, LZ0/l$b;->C(F)LZ0/l$b;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v4}, LZ0/l$b;->u(F)LZ0/l$b;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    invoke-virtual {v3, v4}, LZ0/l$b;->G(F)LZ0/l$b;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v4}, LZ0/l$b;->y(F)LZ0/l$b;

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-virtual {v3}, LZ0/l$b;->m()LZ0/l;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v1, v0}, LZ0/h;->setShapeAppearanceModel(LZ0/l;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->v:LZ0/p;

    .line 101
    .line 102
    invoke-virtual {v1, p0, v0}, LZ0/p;->f(Landroid/view/View;LZ0/l;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:LZ0/p;

    .line 106
    .line 107
    new-instance v1, Landroid/graphics/RectF;

    .line 108
    .line 109
    int-to-float p1, p1

    .line 110
    int-to-float p2, p2

    .line 111
    invoke-direct {v1, v4, v4, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p0, v1}, LZ0/p;->e(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->v:LZ0/p;

    .line 118
    .line 119
    invoke-virtual {p1, p0, v2}, LZ0/p;->h(Landroid/view/View;Z)V

    .line 120
    .line 121
    .line 122
    :cond_3
    return-void
.end method

.method private w()Landroid/util/Pair;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    instance-of v2, v1, Landroidx/drawerlayout/widget/DrawerLayout$e;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    new-instance v2, Landroid/util/Pair;

    .line 18
    .line 19
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 20
    .line 21
    check-cast v1, Landroidx/drawerlayout/widget/DrawerLayout$e;

    .line 22
    .line 23
    invoke-direct {v2, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "NavigationView back progress requires the direct parent view to be a DrawerLayout."

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method

.method private x()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/navigation/NavigationView$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/material/navigation/NavigationView$c;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->n:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->w()Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->w:LT0/g;

    .line 10
    .line 11
    invoke-virtual {v2}, LT0/a;->c()Landroidx/activity/b;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v4, 0x22

    .line 20
    .line 21
    if-ge v3, v4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout$e;

    .line 27
    .line 28
    iget v0, v0, Landroidx/drawerlayout/widget/DrawerLayout$e;->a:I

    .line 29
    .line 30
    invoke-static {v1, p0}, Lcom/google/android/material/navigation/c;->b(Landroidx/drawerlayout/widget/DrawerLayout;Landroid/view/View;)Landroid/animation/Animator$AnimatorListener;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v1}, Lcom/google/android/material/navigation/c;->c(Landroidx/drawerlayout/widget/DrawerLayout;)Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationView;->w:LT0/g;

    .line 39
    .line 40
    invoke-virtual {v4, v2, v0, v3, v1}, LT0/g;->h(Landroidx/activity/b;ILandroid/animation/Animator$AnimatorListener;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    :goto_0
    invoke-virtual {v1, p0}, Landroidx/drawerlayout/widget/DrawerLayout;->h(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public b(Landroidx/activity/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->w()Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->w:LT0/g;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LT0/g;->j(Landroidx/activity/b;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public c(Landroidx/activity/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->w()Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->w:LT0/g;

    .line 6
    .line 7
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout$e;

    .line 10
    .line 11
    iget v0, v0, Landroidx/drawerlayout/widget/DrawerLayout$e;->a:I

    .line 12
    .line 13
    invoke-virtual {v1, p1, v0}, LT0/g;->l(Landroidx/activity/b;I)V

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->t:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->w:LT0/g;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/activity/b;->a()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v0, p1}, LT0/a;->a(F)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/4 v0, 0x0

    .line 31
    iget v1, p0, Lcom/google/android/material/navigation/NavigationView;->u:I

    .line 32
    .line 33
    invoke-static {v0, v1, p1}, LG0/a;->c(IIF)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, Lcom/google/android/material/navigation/NavigationView;->s:I

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/navigation/NavigationView;->v(II)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->w()Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->w:LT0/g;

    .line 5
    .line 6
    invoke-virtual {v0}, LT0/g;->f()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->u()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:LZ0/p;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/material/navigation/n;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/google/android/material/navigation/n;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, v1}, LZ0/p;->d(Landroid/graphics/Canvas;LK0/a$a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected e(LJ/w0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->g(LJ/w0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method getBackHelper()LT0/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->w:LT0/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCheckedItem()Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->o()Landroidx/appcompat/view/menu/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getDividerInsetEnd()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getDividerInsetStart()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->q()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getHeaderCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->r()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->s()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemHorizontalPadding()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->t()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemIconPadding()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->u()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->x()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemMaxLines()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->v()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->w()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemVerticalPadding()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->y()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Lcom/google/android/material/internal/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSubheaderInsetEnd()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->A()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getSubheaderInsetStart()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/internal/i;->B()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public o(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->D(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/android/material/internal/k;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, LZ0/i;->e(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->x:LT0/c;

    .line 16
    .line 17
    invoke-virtual {v1}, LT0/c;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->y:Landroidx/drawerlayout/widget/DrawerLayout$d;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->Q(Landroidx/drawerlayout/widget/DrawerLayout$d;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->y:Landroidx/drawerlayout/widget/DrawerLayout$d;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->c(Landroidx/drawerlayout/widget/DrawerLayout$d;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0}, Landroidx/drawerlayout/widget/DrawerLayout;->F(Landroid/view/View;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->x:LT0/c;

    .line 42
    .line 43
    invoke-virtual {v0}, LT0/c;->d()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/android/material/internal/k;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->n:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v1, v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->y:Landroidx/drawerlayout/widget/DrawerLayout$d;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->Q(Landroidx/drawerlayout/widget/DrawerLayout$d;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->x:LT0/c;

    .line 29
    .line 30
    invoke-virtual {v0}, LT0/c;->e()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    const/high16 v2, 0x40000000    # 2.0f

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget p1, p0, Lcom/google/android/material/navigation/NavigationView;->k:I

    .line 15
    .line 16
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->k:I

    .line 26
    .line 27
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->a()Landroid/os/Parcelable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Lcom/google/android/material/internal/h;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;->f:Landroid/os/Bundle;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/e;->T(Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/google/android/material/navigation/NavigationView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, v1, Lcom/google/android/material/navigation/NavigationView$SavedState;->f:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->h:Lcom/google/android/material/internal/h;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/e;->V(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/navigation/NavigationView;->v(II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public p(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/material/internal/i;->Z(Z)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->getMenuInflater()Landroid/view/MenuInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->h:Lcom/google/android/material/internal/h;

    .line 12
    .line 13
    invoke-virtual {v0, p1, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/i;->Z(Z)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/i;->i(Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->r:Z

    .line 2
    .line 3
    return v0
.end method

.method public s()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public setBottomInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->p:Z

    .line 2
    .line 3
    return-void
.end method

.method public setCheckedItem(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Lcom/google/android/material/internal/h;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/e;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    check-cast p1, Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->F(Landroidx/appcompat/view/menu/g;)V

    :cond_0
    return-void
.end method

.method public setCheckedItem(Landroid/view/MenuItem;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->h:Lcom/google/android/material/internal/h;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/e;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    check-cast p1, Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->F(Landroidx/appcompat/view/menu/g;)V

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Called setCheckedItem(MenuItem) with an item that is not in the current menu."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDividerInsetEnd(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->G(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDividerInsetStart(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->H(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setElevation(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setElevation(F)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, LZ0/i;->d(Landroid/view/View;F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setEndInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->r:Z

    .line 2
    .line 3
    return-void
.end method

.method public setForceCompatClippingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:LZ0/p;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, LZ0/p;->g(Landroid/view/View;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->J(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setItemHorizontalPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->L(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemHorizontalPaddingResource(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->L(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setItemIconPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->M(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemIconPaddingResource(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->M(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->N(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->O(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemMaxLines(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->P(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearance(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->Q(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->R(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->S(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemVerticalPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->T(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemVerticalPaddingResource(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->T(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setNavigationItemSelectedListener(Lcom/google/android/material/navigation/NavigationView$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->j:Lcom/google/android/material/navigation/NavigationView$d;

    .line 2
    .line 3
    return-void
.end method

.method public setOverScrollMode(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setOverScrollMode(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->U(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setStartInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->q:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSubheaderInsetEnd(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->W(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSubheaderInsetStart(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/i;->X(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTopInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->o:Z

    .line 2
    .line 3
    return-void
.end method

.method public t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->o:Z

    .line 2
    .line 3
    return v0
.end method
