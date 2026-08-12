.class public final synthetic Lm0/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lco/median/android/t;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/c0;->a:Lco/median/android/t;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/c0;->a:Lco/median/android/t;

    invoke-static {v0, p1}, Lco/median/android/t;->c(Lco/median/android/t;Ljava/lang/Exception;)V

    return-void
.end method
