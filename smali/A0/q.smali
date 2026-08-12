.class public final synthetic LA0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/b$a;


# instance fields
.field public final synthetic a:LA0/r;

.field public final synthetic b:Lt0/o;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(LA0/r;Lt0/o;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/q;->a:LA0/r;

    iput-object p2, p0, LA0/q;->b:Lt0/o;

    iput-wide p3, p0, LA0/q;->c:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LA0/q;->a:LA0/r;

    iget-object v1, p0, LA0/q;->b:Lt0/o;

    iget-wide v2, p0, LA0/q;->c:J

    invoke-static {v0, v1, v2, v3}, LA0/r;->g(LA0/r;Lt0/o;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
