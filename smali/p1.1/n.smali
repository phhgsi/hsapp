.class public final synthetic Lp1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lp1/y;

.field public final synthetic e:LA1/b;


# direct methods
.method public synthetic constructor <init>(Lp1/y;LA1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/n;->d:Lp1/y;

    iput-object p2, p0, Lp1/n;->e:LA1/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp1/n;->d:Lp1/y;

    iget-object v1, p0, Lp1/n;->e:LA1/b;

    invoke-static {v0, v1}, Lp1/o;->j(Lp1/y;LA1/b;)V

    return-void
.end method
