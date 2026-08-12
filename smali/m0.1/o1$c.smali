.class Lm0/o1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/o1;->q(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Landroid/app/Activity;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lm0/o1;


# direct methods
.method constructor <init>(Lm0/o1;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/o1$c;->f:Lm0/o1;

    .line 2
    .line 3
    iput-object p2, p0, Lm0/o1$c;->d:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p3, p0, Lm0/o1$c;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    new-instance v0, Lco/median/android/s;

    .line 2
    .line 3
    iget-object v1, p0, Lm0/o1$c;->d:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lco/median/android/s;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lm0/o1$c;->f:Lm0/o1;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lm0/o1;->h(Lm0/o1;Lo0/h;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lm0/o1$c;->f:Lm0/o1;

    .line 14
    .line 15
    invoke-static {v1}, Lm0/o1;->e(Lm0/o1;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lm0/o1$c;->e:Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lm0/o1$c;->d:Landroid/app/Activity;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lco/median/android/D;->b(Lo0/h;Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lm0/o1$c;->d:Landroid/app/Activity;

    .line 30
    .line 31
    const-string v2, "window"

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroid/view/WindowManager;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v2, Landroid/graphics/Point;

    .line 46
    .line 47
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 51
    .line 52
    .line 53
    iget v1, v2, Landroid/graphics/Point;->x:I

    .line 54
    .line 55
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 59
    .line 60
    .line 61
    :cond_0
    new-instance v1, Lm0/T0;

    .line 62
    .line 63
    iget-object v2, p0, Lm0/o1$c;->d:Landroid/app/Activity;

    .line 64
    .line 65
    iget-object v3, p0, Lm0/o1$c;->f:Lm0/o1;

    .line 66
    .line 67
    invoke-static {v3}, Lm0/o1;->f(Lm0/o1;)Lm0/o1$d;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-direct {v1, v2, v3, v0}, Lm0/T0;-><init>(Landroid/app/Activity;Lm0/o1$d;Lco/median/android/s;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lm0/o1$c;->f:Lm0/o1;

    .line 75
    .line 76
    invoke-static {v1, v0}, Lm0/o1;->h(Lm0/o1;Lo0/h;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lm0/o1$c;->f:Lm0/o1;

    .line 80
    .line 81
    invoke-static {v0}, Lm0/o1;->e(Lm0/o1;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v1, p0, Lm0/o1$c;->e:Ljava/lang/String;

    .line 86
    .line 87
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lm0/o1$c;->f:Lm0/o1;

    .line 91
    .line 92
    invoke-static {v0}, Lm0/o1;->b(Lm0/o1;)Lo0/h;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v1, p0, Lm0/o1$c;->e:Ljava/lang/String;

    .line 97
    .line 98
    invoke-interface {v0, v1}, Lo0/h;->loadUrl(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method
