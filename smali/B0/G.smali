.class public final synthetic LB0/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/M$b;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {p1}, LB0/M;->v(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
