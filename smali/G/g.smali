.class public final LG/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG/g$a;,
        LG/g$b;,
        LG/g$c;,
        LG/g$d;,
        LG/g$e;
    }
.end annotation


# static fields
.field public static final b:LG/g$a;


# instance fields
.field private final a:LG/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LG/g$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LG/g$a;-><init>(LX1/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LG/g;->b:LG/g$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    new-instance v0, LG/g$c;

    invoke-direct {v0, p1}, LG/g$c;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, LG/g$b;

    invoke-direct {v0, p1}, LG/g$b;-><init>(Landroid/app/Activity;)V

    .line 5
    :goto_0
    iput-object v0, p0, LG/g;->a:LG/g$b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;LX1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LG/g;-><init>(Landroid/app/Activity;)V

    return-void
.end method

.method public static final synthetic a(LG/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LG/g;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final b()V
    .locals 1

    .line 1
    iget-object v0, p0, LG/g;->a:LG/g$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LG/g$b;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final c(Landroid/app/Activity;)LG/g;
    .locals 1

    .line 1
    sget-object v0, LG/g;->b:LG/g$a;

    invoke-virtual {v0, p0}, LG/g$a;->a(Landroid/app/Activity;)LG/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(LG/g$d;)V
    .locals 1

    .line 1
    const-string v0, "condition"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG/g;->a:LG/g$b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LG/g$b;->k(LG/g$d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e(LG/g$e;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG/g;->a:LG/g$b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LG/g$b;->l(LG/g$e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
