.class public final synthetic LB0/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/M$b;


# instance fields
.field public final synthetic a:LB0/M;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Lw0/a$a;


# direct methods
.method public synthetic constructor <init>(LB0/M;Ljava/util/Map;Lw0/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/A;->a:LB0/M;

    iput-object p2, p0, LB0/A;->b:Ljava/util/Map;

    iput-object p3, p0, LB0/A;->c:Lw0/a$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LB0/A;->a:LB0/M;

    iget-object v1, p0, LB0/A;->b:Ljava/util/Map;

    iget-object v2, p0, LB0/A;->c:Lw0/a$a;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, LB0/M;->w(LB0/M;Ljava/util/Map;Lw0/a$a;Landroid/database/Cursor;)Lw0/a;

    move-result-object p1

    return-object p1
.end method
