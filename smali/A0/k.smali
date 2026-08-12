.class public final synthetic LA0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/b$a;


# instance fields
.field public final synthetic a:LA0/r;

.field public final synthetic b:Lt0/o;


# direct methods
.method public synthetic constructor <init>(LA0/r;Lt0/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/k;->a:LA0/r;

    iput-object p2, p0, LA0/k;->b:Lt0/o;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LA0/k;->a:LA0/r;

    iget-object v1, p0, LA0/k;->b:Lt0/o;

    invoke-static {v0, v1}, LA0/r;->d(LA0/r;Lt0/o;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
