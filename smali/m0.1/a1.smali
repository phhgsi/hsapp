.class public final synthetic Lm0/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lco/median/android/z;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lco/median/android/z;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/a1;->d:Lco/median/android/z;

    iput-boolean p2, p0, Lm0/a1;->e:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/a1;->d:Lco/median/android/z;

    iget-boolean v1, p0, Lm0/a1;->e:Z

    invoke-static {v0, v1}, Lco/median/android/z;->b(Lco/median/android/z;Z)V

    return-void
.end method
