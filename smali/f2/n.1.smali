.class public final Lf2/n;
.super Lf2/h0;
.source "SourceFile"

# interfaces
.implements Lf2/m;


# instance fields
.field public final e:Lf2/o;


# direct methods
.method public constructor <init>(Lf2/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf2/h0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf2/n;->e:Lf2/o;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf2/l0;->w()Lf2/m0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lf2/m0;->G(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lf2/n;->e:Lf2/o;

    .line 2
    .line 3
    invoke-virtual {p0}, Lf2/l0;->w()Lf2/m0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1, v0}, Lf2/o;->y(Lf2/u0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
