.class LF/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/i;->e(Landroid/content/Context;LF/f;LF/a;II)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:LF/f;

.field final synthetic d:I


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;LF/f;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/i$a;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, LF/i$a;->b:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, LF/i$a;->c:LF/f;

    .line 6
    .line 7
    iput p4, p0, LF/i$a;->d:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()LF/i$e;
    .locals 4

    .line 1
    iget-object v0, p0, LF/i$a;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LF/i$a;->b:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, LF/i$a;->c:LF/f;

    .line 6
    .line 7
    invoke-static {v2}, LF/g;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget v3, p0, LF/i$a;->d:I

    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3}, LF/i;->c(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)LF/i$e;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF/i$a;->a()LF/i$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
