.class public final synthetic LA0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/b$a;


# instance fields
.field public final synthetic a:LA0/r;

.field public final synthetic b:Lt0/o;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LA0/r;Lt0/o;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/j;->a:LA0/r;

    iput-object p2, p0, LA0/j;->b:Lt0/o;

    iput p3, p0, LA0/j;->c:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LA0/j;->a:LA0/r;

    iget-object v1, p0, LA0/j;->b:Lt0/o;

    iget v2, p0, LA0/j;->c:I

    invoke-static {v0, v1, v2}, LA0/r;->f(LA0/r;Lt0/o;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
