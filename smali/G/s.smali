.class public final synthetic LG/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW1/a;


# instance fields
.field public final synthetic d:LG/u$b;


# direct methods
.method public synthetic constructor <init>(LG/u$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG/s;->d:LG/u$b;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LG/s;->d:LG/u$b;

    invoke-static {v0}, LG/u$b;->a(LG/u$b;)Landroid/view/ViewGroup;

    move-result-object v0

    return-object v0
.end method
