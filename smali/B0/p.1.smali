.class public final synthetic LB0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/M$b;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lw0/c$b;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lw0/c$b;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/p;->a:Ljava/lang/String;

    iput-object p2, p0, LB0/p;->b:Lw0/c$b;

    iput-wide p3, p0, LB0/p;->c:J

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LB0/p;->a:Ljava/lang/String;

    iget-object v1, p0, LB0/p;->b:Lw0/c$b;

    iget-wide v2, p0, LB0/p;->c:J

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, v3, p1}, LB0/M;->E(Ljava/lang/String;Lw0/c$b;JLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
