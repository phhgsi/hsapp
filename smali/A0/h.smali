.class public final synthetic LA0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/b$a;


# instance fields
.field public final synthetic a:LB0/c;


# direct methods
.method public synthetic constructor <init>(LB0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/h;->a:LB0/c;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA0/h;->a:LB0/c;

    invoke-interface {v0}, LB0/c;->a()Lw0/a;

    move-result-object v0

    return-object v0
.end method
