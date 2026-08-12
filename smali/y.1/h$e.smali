.class public final Ly/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:I

.field private final c:I

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly/h$e;->a:Ljava/util/List;

    .line 5
    .line 6
    iput p2, p0, Ly/h$e;->c:I

    .line 7
    .line 8
    iput p3, p0, Ly/h$e;->b:I

    .line 9
    .line 10
    iput-object p4, p0, Ly/h$e;->d:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Ly/h$e;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/h$e;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/h$e;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Ly/h$e;->b:I

    .line 2
    .line 3
    return v0
.end method
