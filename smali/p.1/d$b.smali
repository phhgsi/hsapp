.class Lp/d$b;
.super Lp/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic g:Lp/d;


# direct methods
.method public constructor <init>(Lp/d;Lp/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp/d$b;->g:Lp/d;

    .line 2
    .line 3
    invoke-direct {p0}, Lp/b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lp/j;

    .line 7
    .line 8
    invoke-direct {p1, p0, p2}, Lp/j;-><init>(Lp/b;Lp/c;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lp/b;->e:Lp/b$a;

    .line 12
    .line 13
    return-void
.end method
