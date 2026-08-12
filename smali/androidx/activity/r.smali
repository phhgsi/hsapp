.class public abstract Landroidx/activity/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I

.field private static final b:I

.field private static c:Landroidx/activity/B;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0xe6

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sput v0, Landroidx/activity/r;->a:I

    .line 10
    .line 11
    const/16 v0, 0x80

    .line 12
    .line 13
    const/16 v1, 0x1b

    .line 14
    .line 15
    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sput v0, Landroidx/activity/r;->b:I

    .line 20
    .line 21
    return-void
.end method

.method public static final a(Landroidx/activity/ComponentActivity;Landroidx/activity/K;Landroidx/activity/K;)V
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "statusBarStyle"

    .line 7
    .line 8
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "navigationBarStyle"

    .line 12
    .line 13
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const-string v0, "window.decorView"

    .line 25
    .line 26
    invoke-static {v5, v0}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/activity/K;->b()LW1/l;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, "view.resources"

    .line 38
    .line 39
    invoke-static {v1, v2}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v1}, LW1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {p2}, Landroidx/activity/K;->b()LW1/l;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1, v2}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v1}, LW1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    sget-object v0, Landroidx/activity/r;->c:Landroidx/activity/B;

    .line 74
    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 78
    .line 79
    const/16 v1, 0x1e

    .line 80
    .line 81
    if-lt v0, v1, :cond_0

    .line 82
    .line 83
    new-instance v0, Landroidx/activity/z;

    .line 84
    .line 85
    invoke-direct {v0}, Landroidx/activity/z;-><init>()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    const/16 v1, 0x1d

    .line 90
    .line 91
    if-lt v0, v1, :cond_1

    .line 92
    .line 93
    new-instance v0, Landroidx/activity/y;

    .line 94
    .line 95
    invoke-direct {v0}, Landroidx/activity/y;-><init>()V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    const/16 v1, 0x1c

    .line 100
    .line 101
    if-lt v0, v1, :cond_2

    .line 102
    .line 103
    new-instance v0, Landroidx/activity/v;

    .line 104
    .line 105
    invoke-direct {v0}, Landroidx/activity/v;-><init>()V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    const/16 v1, 0x1a

    .line 110
    .line 111
    if-lt v0, v1, :cond_3

    .line 112
    .line 113
    new-instance v0, Landroidx/activity/t;

    .line 114
    .line 115
    invoke-direct {v0}, Landroidx/activity/t;-><init>()V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    new-instance v0, Landroidx/activity/s;

    .line 120
    .line 121
    invoke-direct {v0}, Landroidx/activity/s;-><init>()V

    .line 122
    .line 123
    .line 124
    :cond_4
    :goto_0
    move-object v1, v0

    .line 125
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    const-string v0, "window"

    .line 130
    .line 131
    invoke-static {v4, v0}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    move-object v2, p1

    .line 135
    move-object v3, p2

    .line 136
    invoke-interface/range {v1 .. v7}, Landroidx/activity/B;->a(Landroidx/activity/K;Landroidx/activity/K;Landroid/view/Window;Landroid/view/View;ZZ)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-static {p0, v0}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v1, p0}, Landroidx/activity/B;->b(Landroid/view/Window;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method
