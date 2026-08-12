.class public final synthetic Lm0/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lco/median/android/z;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lco/median/android/z;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/b1;->d:Lco/median/android/z;

    iput p2, p0, Lm0/b1;->e:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/b1;->d:Lco/median/android/z;

    iget v1, p0, Lm0/b1;->e:I

    invoke-static {v0, v1}, Lco/median/android/z;->c(Lco/median/android/z;I)V

    return-void
.end method
