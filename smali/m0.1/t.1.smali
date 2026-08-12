.class public final synthetic Lm0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a;


# instance fields
.field public final synthetic a:Lco/median/android/d;

.field public final synthetic b:Lco/median/android/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/d;Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/t;->a:Lco/median/android/d;

    iput-object p2, p0, Lm0/t;->b:Lco/median/android/MainActivity;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/t;->a:Lco/median/android/d;

    iget-object v1, p0, Lm0/t;->b:Lco/median/android/MainActivity;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, v1, p1}, Lco/median/android/d;->b(Lco/median/android/d;Lco/median/android/MainActivity;Ljava/util/Map;)V

    return-void
.end method
