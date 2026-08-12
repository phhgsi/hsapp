.class public abstract LJ/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ/b0$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/view/WindowInsets;

.field static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LJ/w0;->b:LJ/w0;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0;->x()Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LJ/b0;->a:Landroid/view/WindowInsets;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput-boolean v0, LJ/b0;->b:Z

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a([Landroid/view/WindowInsets;Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1, p2, p3}, Landroid/view/View$OnApplyWindowInsetsListener;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p2, p3}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    const/4 p2, 0x0

    .line 13
    aput-object p1, p0, p2

    .line 14
    .line 15
    sget-object p0, LJ/b0;->a:Landroid/view/WindowInsets;

    .line 16
    .line 17
    return-object p0
.end method

.method static b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget v2, Lw/c;->M:I

    .line 4
    .line 5
    invoke-virtual {p0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sget v3, Lw/c;->T:I

    .line 10
    .line 11
    invoke-virtual {p0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    instance-of v4, v2, Landroid/view/View$OnApplyWindowInsetsListener;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    check-cast v2, Landroid/view/View$OnApplyWindowInsetsListener;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of v2, v3, Landroid/view/View$OnApplyWindowInsetsListener;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move-object v2, v3

    .line 27
    check-cast v2, Landroid/view/View$OnApplyWindowInsetsListener;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v2, 0x0

    .line 31
    :goto_0
    new-array v3, v1, [Landroid/view/WindowInsets;

    .line 32
    .line 33
    sget-object v4, LJ/b0;->a:Landroid/view/WindowInsets;

    .line 34
    .line 35
    aput-object v4, v3, v0

    .line 36
    .line 37
    new-instance v4, LJ/a0;

    .line 38
    .line 39
    invoke-direct {v4, v3, v2}, LJ/a0;-><init>([Landroid/view/WindowInsets;Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v4}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 46
    .line 47
    .line 48
    sget p1, Lw/c;->L:I

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    instance-of v4, p1, Landroid/view/View$OnApplyWindowInsetsListener;

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    move-object v2, p1

    .line 59
    check-cast v2, Landroid/view/View$OnApplyWindowInsetsListener;

    .line 60
    .line 61
    :cond_2
    invoke-virtual {p0, v2}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 62
    .line 63
    .line 64
    aget-object p1, v3, v0

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/WindowInsets;->isConsumed()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_3

    .line 73
    .line 74
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    check-cast p0, Landroid/view/ViewGroup;

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    move v2, v0

    .line 85
    :goto_1
    if-ge v2, p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    aget-object v5, v3, v0

    .line 92
    .line 93
    invoke-static {v4, v5}, LJ/b0;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 94
    .line 95
    .line 96
    add-int/2addr v2, v1

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    aget-object p0, v3, v0

    .line 99
    .line 100
    if-eqz p0, :cond_4

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_4
    sget-object p0, LJ/b0;->a:Landroid/view/WindowInsets;

    .line 104
    .line 105
    return-object p0
.end method

.method public static c(Landroid/view/ViewGroup;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LJ/b0$a;->a(Landroid/view/ViewGroup;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
