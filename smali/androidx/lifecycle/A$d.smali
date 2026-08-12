.class final Landroidx/lifecycle/A$d;
.super LX1/l;
.source "SourceFile"

# interfaces
.implements LW1/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/A;->e(Landroidx/lifecycle/K;)Landroidx/lifecycle/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final e:Landroidx/lifecycle/A$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/A$d;

    invoke-direct {v0}, Landroidx/lifecycle/A$d;-><init>()V

    sput-object v0, Landroidx/lifecycle/A$d;->e:Landroidx/lifecycle/A$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LX1/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(LX/a;)Landroidx/lifecycle/C;
    .locals 1

    .line 1
    const-string v0, "$this$initializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroidx/lifecycle/C;

    .line 7
    .line 8
    invoke-direct {p1}, Landroidx/lifecycle/C;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LX/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/lifecycle/A$d;->c(LX/a;)Landroidx/lifecycle/C;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
