.class public final synthetic Lm0/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lco/median/android/MainActivity;

.field public final synthetic b:Ld1/b;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MainActivity;Ld1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/x0;->a:Lco/median/android/MainActivity;

    iput-object p2, p0, Lm0/x0;->b:Ld1/b;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/x0;->a:Lco/median/android/MainActivity;

    iget-object v1, p0, Lm0/x0;->b:Ld1/b;

    check-cast p1, Ld1/a;

    invoke-static {v0, v1, p1}, Lco/median/android/MainActivity;->y0(Lco/median/android/MainActivity;Ld1/b;Ld1/a;)V

    return-void
.end method
