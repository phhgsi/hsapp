.class public final synthetic Landroidx/activity/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Landroidx/activity/ComponentActivity$f;

.field public final synthetic e:I

.field public final synthetic f:Lc/a$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/ComponentActivity$f;ILc/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/k;->d:Landroidx/activity/ComponentActivity$f;

    iput p2, p0, Landroidx/activity/k;->e:I

    iput-object p3, p0, Landroidx/activity/k;->f:Lc/a$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/activity/k;->d:Landroidx/activity/ComponentActivity$f;

    iget v1, p0, Landroidx/activity/k;->e:I

    iget-object v2, p0, Landroidx/activity/k;->f:Lc/a$a;

    invoke-static {v0, v1, v2}, Landroidx/activity/ComponentActivity$f;->r(Landroidx/activity/ComponentActivity$f;ILc/a$a;)V

    return-void
.end method
