.class final Lt0/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt1/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# static fields
.field static final a:Lt0/a$e;

.field private static final b:Lt1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lt0/a$e;

    .line 2
    .line 3
    invoke-direct {v0}, Lt0/a$e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt0/a$e;->a:Lt0/a$e;

    .line 7
    .line 8
    const-string v0, "clientMetrics"

    .line 9
    .line 10
    invoke-static {v0}, Lt1/c;->d(Ljava/lang/String;)Lt1/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lt0/a$e;->b:Lt1/c;

    .line 15
    .line 16
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/appcompat/app/E;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    check-cast p2, Lt1/e;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1, p2}, Lt0/a$e;->b(Lt0/l;Lt1/e;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b(Lt0/l;Lt1/e;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method
