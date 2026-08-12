.class public final synthetic LB1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA1/b;


# instance fields
.field public final synthetic a:Lm1/e;


# direct methods
.method public synthetic constructor <init>(Lm1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB1/a;->a:Lm1/e;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LB1/a;->a:Lm1/e;

    invoke-static {v0}, Lcom/google/firebase/installations/c;->f(Lm1/e;)LC1/b;

    move-result-object v0

    return-object v0
.end method
