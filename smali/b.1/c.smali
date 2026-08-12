.class public final synthetic Lb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/l;


# instance fields
.field public final synthetic d:Lb/d;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lb/a;

.field public final synthetic g:Lc/a;


# direct methods
.method public synthetic constructor <init>(Lb/d;Ljava/lang/String;Lb/a;Lc/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/c;->d:Lb/d;

    iput-object p2, p0, Lb/c;->e:Ljava/lang/String;

    iput-object p3, p0, Lb/c;->f:Lb/a;

    iput-object p4, p0, Lb/c;->g:Lc/a;

    return-void
.end method


# virtual methods
.method public final d(Landroidx/lifecycle/n;Landroidx/lifecycle/h$a;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lb/c;->d:Lb/d;

    iget-object v1, p0, Lb/c;->e:Ljava/lang/String;

    iget-object v2, p0, Lb/c;->f:Lb/a;

    iget-object v3, p0, Lb/c;->g:Lc/a;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lb/d;->a(Lb/d;Ljava/lang/String;Lb/a;Lc/a;Landroidx/lifecycle/n;Landroidx/lifecycle/h$a;)V

    return-void
.end method
