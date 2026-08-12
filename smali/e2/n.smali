.class public final synthetic Le2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le2/n;->d:Ljava/util/List;

    iput-boolean p2, p0, Le2/n;->e:Z

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Le2/n;->d:Ljava/util/List;

    iget-boolean v1, p0, Le2/n;->e:Z

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Le2/o;->j(Ljava/util/List;ZLjava/lang/CharSequence;I)LL1/l;

    move-result-object p1

    return-object p1
.end method
