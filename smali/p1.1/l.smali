.class public final synthetic Lp1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA1/b;


# instance fields
.field public final synthetic a:Lp1/o;

.field public final synthetic b:Lp1/c;


# direct methods
.method public synthetic constructor <init>(Lp1/o;Lp1/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/l;->a:Lp1/o;

    iput-object p2, p0, Lp1/l;->b:Lp1/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lp1/l;->a:Lp1/o;

    iget-object v1, p0, Lp1/l;->b:Lp1/c;

    invoke-static {v0, v1}, Lp1/o;->h(Lp1/o;Lp1/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
