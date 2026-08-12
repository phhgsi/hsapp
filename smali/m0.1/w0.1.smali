.class public final synthetic Lm0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lco/median/android/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/w0;->a:Lco/median/android/MainActivity;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/w0;->a:Lco/median/android/MainActivity;

    invoke-static {v0, p1}, Lco/median/android/MainActivity;->U0(Lco/median/android/MainActivity;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
