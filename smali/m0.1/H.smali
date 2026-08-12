.class public final synthetic Lm0/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lco/median/android/g;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/H;->d:Lco/median/android/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/H;->d:Lco/median/android/g;

    invoke-static {v0}, Lco/median/android/g;->c(Lco/median/android/g;)V

    return-void
.end method
