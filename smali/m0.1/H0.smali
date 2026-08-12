.class public final synthetic Lm0/H0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG/g$e;


# instance fields
.field public final synthetic a:Lco/median/android/MainActivity;

.field public final synthetic b:Lco/median/android/GoNativeApplication;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MainActivity;Lco/median/android/GoNativeApplication;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/H0;->a:Lco/median/android/MainActivity;

    iput-object p2, p0, Lm0/H0;->b:Lco/median/android/GoNativeApplication;

    return-void
.end method


# virtual methods
.method public final a(LG/u;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/H0;->a:Lco/median/android/MainActivity;

    iget-object v1, p0, Lm0/H0;->b:Lco/median/android/GoNativeApplication;

    invoke-static {v0, v1, p1}, Lco/median/android/MainActivity;->L0(Lco/median/android/MainActivity;Lco/median/android/GoNativeApplication;LG/u;)V

    return-void
.end method
