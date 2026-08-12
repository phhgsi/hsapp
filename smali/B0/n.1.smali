.class public final synthetic LB0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/M$b;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lt0/o;


# direct methods
.method public synthetic constructor <init>(JLt0/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LB0/n;->a:J

    iput-object p3, p0, LB0/n;->b:Lt0/o;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-wide v0, p0, LB0/n;->a:J

    iget-object v2, p0, LB0/n;->b:Lt0/o;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, LB0/M;->s(JLt0/o;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
