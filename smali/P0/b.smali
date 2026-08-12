.class public LP0/b;
.super Landroidx/appcompat/app/c$a;
.source "SourceFile"


# static fields
.field private static final e:I

.field private static final f:I

.field private static final g:I


# instance fields
.field private c:Landroid/graphics/drawable/Drawable;

.field private final d:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Ld/a;->k:I

    .line 2
    .line 3
    sput v0, LP0/b;->e:I

    .line 4
    .line 5
    sget v0, LF0/j;->a:I

    .line 6
    .line 7
    sput v0, LP0/b;->f:I

    .line 8
    .line 9
    sget v0, LF0/a;->p:I

    .line 10
    .line 11
    sput v0, LP0/b;->g:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LP0/b;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 6

    .line 2
    invoke-static {p1}, LP0/b;->o(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    .line 3
    invoke-static {p1, p2}, LP0/b;->q(Landroid/content/Context;I)I

    move-result p1

    .line 4
    invoke-direct {p0, v0, p1}, Landroidx/appcompat/app/c$a;-><init>(Landroid/content/Context;I)V

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/app/c$a;->b()Landroid/content/Context;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p2

    .line 7
    sget v0, LP0/b;->e:I

    sget v1, LP0/b;->f:I

    .line 8
    invoke-static {p1, v0, v1}, LP0/c;->a(Landroid/content/Context;II)Landroid/graphics/Rect;

    move-result-object v2

    iput-object v2, p0, LP0/b;->d:Landroid/graphics/Rect;

    .line 9
    sget v2, LF0/a;->i:I

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v2, v3}, LO0/a;->c(Landroid/content/Context;ILjava/lang/String;)I

    move-result v2

    .line 11
    sget-object v3, LF0/k;->j2:[I

    const/4 v4, 0x0

    .line 12
    invoke-virtual {p1, v4, v3, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 13
    sget v5, LF0/k;->o2:I

    invoke-virtual {v3, v5, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 14
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 15
    new-instance v3, LZ0/h;

    invoke-direct {v3, p1, v4, v0, v1}, LZ0/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 16
    invoke-virtual {v3, p1}, LZ0/h;->Q(Landroid/content/Context;)V

    .line 17
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v3, p1}, LZ0/h;->c0(Landroid/content/res/ColorStateList;)V

    .line 18
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p1, v0, :cond_0

    .line 19
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    const v0, 0x1010571

    const/4 v1, 0x1

    .line 20
    invoke-virtual {p2, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 21
    invoke-virtual {p0}, Landroidx/appcompat/app/c$a;->b()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result p2

    .line 22
    iget p1, p1, Landroid/util/TypedValue;->type:I

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    cmpl-float p1, p2, p1

    if-ltz p1, :cond_0

    .line 23
    invoke-virtual {v3, p2}, LZ0/h;->Y(F)V

    .line 24
    :cond_0
    iput-object v3, p0, LP0/b;->c:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method private static o(Landroid/content/Context;)Landroid/content/Context;
    .locals 4

    .line 1
    invoke-static {p0}, LP0/b;->p(Landroid/content/Context;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget v1, LP0/b;->e:I

    .line 6
    .line 7
    sget v2, LP0/b;->f:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {p0, v3, v1, v2}, Lc1/a;->d(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance v1, Landroidx/appcompat/view/d;

    .line 18
    .line 19
    invoke-direct {v1, p0, v0}, Landroidx/appcompat/view/d;-><init>(Landroid/content/Context;I)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method private static p(Landroid/content/Context;)I
    .locals 1

    .line 1
    sget v0, LP0/b;->g:I

    .line 2
    .line 3
    invoke-static {p0, v0}, LW0/b;->a(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    iget p0, p0, Landroid/util/TypedValue;->data:I

    .line 12
    .line 13
    return p0
.end method

.method private static q(Landroid/content/Context;I)I
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, LP0/b;->p(Landroid/content/Context;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0

    .line 8
    :cond_0
    return p1
.end method


# virtual methods
.method public A(Ljava/lang/CharSequence;)LP0/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/c$a;->l(Ljava/lang/CharSequence;)Landroidx/appcompat/app/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP0/b;

    .line 6
    .line 7
    return-object p1
.end method

.method public B(Landroid/view/View;)LP0/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/c$a;->m(Landroid/view/View;)Landroidx/appcompat/app/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP0/b;

    .line 6
    .line 7
    return-object p1
.end method

.method public a()Landroidx/appcompat/app/c;
    .locals 5

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/c$a;->a()Landroidx/appcompat/app/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, LP0/b;->c:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    instance-of v4, v3, LZ0/h;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    check-cast v3, LZ0/h;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getElevation()F

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {v3, v4}, LZ0/h;->b0(F)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v3, p0, LP0/b;->c:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    iget-object v4, p0, LP0/b;->d:Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-static {v3, v4}, LP0/c;->b(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)Landroid/graphics/drawable/InsetDrawable;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    new-instance v1, LP0/a;

    .line 40
    .line 41
    iget-object v3, p0, LP0/b;->d:Landroid/graphics/Rect;

    .line 42
    .line 43
    invoke-direct {v1, v0, v3}, LP0/a;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public bridge synthetic c(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/c$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LP0/b;->r(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)LP0/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic d(Landroid/view/View;)Landroidx/appcompat/app/c$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP0/b;->s(Landroid/view/View;)LP0/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic e(Landroid/graphics/drawable/Drawable;)Landroidx/appcompat/app/c$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP0/b;->t(Landroid/graphics/drawable/Drawable;)LP0/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic i(Landroid/content/DialogInterface$OnKeyListener;)Landroidx/appcompat/app/c$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP0/b;->x(Landroid/content/DialogInterface$OnKeyListener;)LP0/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic k(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/c$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, LP0/b;->z(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)LP0/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/CharSequence;)Landroidx/appcompat/app/c$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP0/b;->A(Ljava/lang/CharSequence;)LP0/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public r(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)LP0/b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/c$a;->c(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP0/b;

    .line 6
    .line 7
    return-object p1
.end method

.method public s(Landroid/view/View;)LP0/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/c$a;->d(Landroid/view/View;)Landroidx/appcompat/app/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP0/b;

    .line 6
    .line 7
    return-object p1
.end method

.method public t(Landroid/graphics/drawable/Drawable;)LP0/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/c$a;->e(Landroid/graphics/drawable/Drawable;)Landroidx/appcompat/app/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP0/b;

    .line 6
    .line 7
    return-object p1
.end method

.method public u(Ljava/lang/CharSequence;)LP0/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/c$a;->f(Ljava/lang/CharSequence;)Landroidx/appcompat/app/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP0/b;

    .line 6
    .line 7
    return-object p1
.end method

.method public v(ILandroid/content/DialogInterface$OnClickListener;)LP0/b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/c$a;->g(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP0/b;

    .line 6
    .line 7
    return-object p1
.end method

.method public w(Landroid/content/DialogInterface$OnDismissListener;)LP0/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/c$a;->h(Landroid/content/DialogInterface$OnDismissListener;)Landroidx/appcompat/app/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP0/b;

    .line 6
    .line 7
    return-object p1
.end method

.method public x(Landroid/content/DialogInterface$OnKeyListener;)LP0/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/c$a;->i(Landroid/content/DialogInterface$OnKeyListener;)Landroidx/appcompat/app/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP0/b;

    .line 6
    .line 7
    return-object p1
.end method

.method public y(ILandroid/content/DialogInterface$OnClickListener;)LP0/b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/c$a;->j(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP0/b;

    .line 6
    .line 7
    return-object p1
.end method

.method public z(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)LP0/b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/appcompat/app/c$a;->k(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP0/b;

    .line 6
    .line 7
    return-object p1
.end method
