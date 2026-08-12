.class public final Lu0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv0/b;


# instance fields
.field private final a:LK1/a;

.field private final b:LK1/a;


# direct methods
.method public constructor <init>(LK1/a;LK1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu0/l;->a:LK1/a;

    .line 5
    .line 6
    iput-object p2, p0, Lu0/l;->b:LK1/a;

    .line 7
    .line 8
    return-void
.end method

.method public static a(LK1/a;LK1/a;)Lu0/l;
    .locals 1

    .line 1
    new-instance v0, Lu0/l;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lu0/l;-><init>(LK1/a;LK1/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Lu0/k;
    .locals 1

    .line 1
    new-instance v0, Lu0/k;

    .line 2
    .line 3
    check-cast p1, Lu0/i;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lu0/k;-><init>(Landroid/content/Context;Lu0/i;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public b()Lu0/k;
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/l;->a:LK1/a;

    .line 2
    .line 3
    invoke-interface {v0}, LK1/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    iget-object v1, p0, Lu0/l;->b:LK1/a;

    .line 10
    .line 11
    invoke-interface {v1}, LK1/a;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lu0/l;->c(Landroid/content/Context;Ljava/lang/Object;)Lu0/k;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu0/l;->b()Lu0/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
