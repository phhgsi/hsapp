.class public final synthetic Lm0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:LW1/l;


# direct methods
.method public synthetic constructor <init>(LW1/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/b0;->a:LW1/l;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/b0;->a:LW1/l;

    invoke-static {v0, p1}, Lco/median/android/t;->a(LW1/l;Ljava/lang/Object;)V

    return-void
.end method
