.class public final synthetic LB0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/M$b;


# instance fields
.field public final synthetic a:LB0/M;

.field public final synthetic b:Lt0/i;

.field public final synthetic c:Lt0/o;


# direct methods
.method public synthetic constructor <init>(LB0/M;Lt0/i;Lt0/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/z;->a:LB0/M;

    iput-object p2, p0, LB0/z;->b:Lt0/i;

    iput-object p3, p0, LB0/z;->c:Lt0/o;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LB0/z;->a:LB0/M;

    iget-object v1, p0, LB0/z;->b:Lt0/i;

    iget-object v2, p0, LB0/z;->c:Lt0/o;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, LB0/M;->y(LB0/M;Lt0/i;Lt0/o;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
