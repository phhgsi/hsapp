.class Lco/median/android/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/List;

.field final synthetic c:Lco/median/android/y;


# direct methods
.method constructor <init>(Lco/median/android/y;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/y$a;->c:Lco/median/android/y;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lco/median/android/y$a;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lco/median/android/y$a;->b:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method

.method static bridge synthetic a(Lco/median/android/y$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/y$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic b(Lco/median/android/y$a;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/y$a;->b:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method c()V
    .locals 3

    .line 1
    new-instance v0, Lco/median/android/y$b;

    .line 2
    .line 3
    iget-object v1, p0, Lco/median/android/y$a;->c:Lco/median/android/y;

    .line 4
    .line 5
    invoke-static {v1}, Lco/median/android/y;->a(Lco/median/android/y;)Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lco/median/android/y$a;->c:Lco/median/android/y;

    .line 10
    .line 11
    invoke-direct {v0, v1, p0, v2}, Lco/median/android/y$b;-><init>(Landroid/content/Context;Lco/median/android/y$a;Lco/median/android/y;)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    new-array v1, v1, [Ljava/lang/Void;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 18
    .line 19
    .line 20
    return-void
.end method
