.class public final Lm0/R0;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Z)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "items"

    .line 7
    .line 8
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 13
    .line 14
    .line 15
    iput-boolean p3, p0, Lm0/R0;->a:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 1
    const-string v0, "parent"

    .line 2
    .line 3
    invoke-static {p3, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const v1, 0x7f0c0074

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    :cond_0
    invoke-interface {p0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lorg/json/JSONObject;

    .line 29
    .line 30
    const p3, 0x7f09017e

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    check-cast p3, Landroid/widget/TextView;

    .line 38
    .line 39
    const v1, 0x7f09017c

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Landroid/widget/ImageView;

    .line 47
    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    const-string v2, "label"

    .line 51
    .line 52
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const v4, 0x7f070055

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const v5, 0x7f0603d4

    .line 76
    .line 77
    .line 78
    invoke-static {v4, v5}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    iget-boolean p3, p0, Lm0/R0;->a:Z

    .line 86
    .line 87
    if-eqz p3, :cond_2

    .line 88
    .line 89
    const-string p3, "icon"

    .line 90
    .line 91
    invoke-virtual {p1, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p1}, LX1/k;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    if-nez p3, :cond_1

    .line 103
    .line 104
    new-instance p3, Ln0/a;

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-direct {p3, v2, p1, v3, v4}, Ln0/a;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p3}, Ln0/a;->a()Landroid/graphics/drawable/Drawable;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    const/4 p1, 0x4

    .line 125
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    const/16 p1, 0x8

    .line 130
    .line 131
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    :cond_3
    :goto_0
    invoke-static {p2}, LX1/k;->b(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return-object p2
.end method
