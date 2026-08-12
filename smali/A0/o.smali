.class public final synthetic LA0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/b$a;


# instance fields
.field public final synthetic a:LA0/r;


# direct methods
.method public synthetic constructor <init>(LA0/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/o;->a:LA0/r;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA0/o;->a:LA0/r;

    invoke-static {v0}, LA0/r;->c(LA0/r;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
