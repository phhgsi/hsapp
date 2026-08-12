.class public final synthetic Lco/median/android/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/median/android/r$b;


# instance fields
.field public final synthetic a:Lco/median/android/MainActivity;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lco/median/android/r;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MainActivity;Ljava/lang/String;Lco/median/android/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/median/android/w;->a:Lco/median/android/MainActivity;

    iput-object p2, p0, Lco/median/android/w;->b:Ljava/lang/String;

    iput-object p3, p0, Lco/median/android/w;->c:Lco/median/android/r;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/w;->a:Lco/median/android/MainActivity;

    iget-object v1, p0, Lco/median/android/w;->b:Ljava/lang/String;

    iget-object v2, p0, Lco/median/android/w;->c:Lco/median/android/r;

    invoke-static {v0, v1, v2}, Lco/median/android/MainActivity;->x0(Lco/median/android/MainActivity;Ljava/lang/String;Lco/median/android/r;)V

    return-void
.end method
