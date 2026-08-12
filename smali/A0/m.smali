.class public final synthetic LA0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/b$a;


# instance fields
.field public final synthetic a:LA0/r;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Lt0/o;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(LA0/r;Ljava/lang/Iterable;Lt0/o;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/m;->a:LA0/r;

    iput-object p2, p0, LA0/m;->b:Ljava/lang/Iterable;

    iput-object p3, p0, LA0/m;->c:Lt0/o;

    iput-wide p4, p0, LA0/m;->d:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, LA0/m;->a:LA0/r;

    iget-object v1, p0, LA0/m;->b:Ljava/lang/Iterable;

    iget-object v2, p0, LA0/m;->c:Lt0/o;

    iget-wide v3, p0, LA0/m;->d:J

    invoke-static {v0, v1, v2, v3, v4}, LA0/r;->b(LA0/r;Ljava/lang/Iterable;Lt0/o;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
