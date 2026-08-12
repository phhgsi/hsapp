.class public final synthetic Lz0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/b$a;


# instance fields
.field public final synthetic a:Lz0/c;

.field public final synthetic b:Lt0/o;

.field public final synthetic c:Lt0/i;


# direct methods
.method public synthetic constructor <init>(Lz0/c;Lt0/o;Lt0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz0/b;->a:Lz0/c;

    iput-object p2, p0, Lz0/b;->b:Lt0/o;

    iput-object p3, p0, Lz0/b;->c:Lt0/i;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz0/b;->a:Lz0/c;

    iget-object v1, p0, Lz0/b;->b:Lt0/o;

    iget-object v2, p0, Lz0/b;->c:Lt0/i;

    invoke-static {v0, v1, v2}, Lz0/c;->b(Lz0/c;Lt0/o;Lt0/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
