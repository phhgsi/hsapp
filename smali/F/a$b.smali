.class LF/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/a;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LF/j$c;

.field final synthetic e:I

.field final synthetic f:LF/a;


# direct methods
.method constructor <init>(LF/a;LF/j$c;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/a$b;->f:LF/a;

    .line 2
    .line 3
    iput-object p2, p0, LF/a$b;->d:LF/j$c;

    .line 4
    .line 5
    iput p3, p0, LF/a$b;->e:I

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
    .locals 2

    .line 1
    iget-object v0, p0, LF/a$b;->d:LF/j$c;

    .line 2
    .line 3
    iget v1, p0, LF/a$b;->e:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LF/j$c;->a(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
