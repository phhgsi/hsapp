.class public final synthetic LA0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/b$a;


# instance fields
.field public final synthetic a:LA0/v;


# direct methods
.method public synthetic constructor <init>(LA0/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/u;->a:LA0/v;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA0/u;->a:LA0/v;

    invoke-static {v0}, LA0/v;->a(LA0/v;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
