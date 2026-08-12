.class public final synthetic Lm0/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lo0/h;


# direct methods
.method public synthetic constructor <init>(Lo0/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/m1;->d:Lo0/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/m1;->d:Lo0/h;

    invoke-static {v0}, Lco/median/android/B;->e(Lo0/h;)V

    return-void
.end method
