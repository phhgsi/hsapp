.class public final synthetic Lm0/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a;


# instance fields
.field public final synthetic a:Lco/median/android/t;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/Z;->a:Lco/median/android/t;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/Z;->a:Lco/median/android/t;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, p1}, Lco/median/android/t;->d(Lco/median/android/t;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
