.class public final synthetic Lco/median/android/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/median/android/t$a;


# instance fields
.field public final synthetic a:Lco/median/android/q;

.field public final synthetic b:Landroid/webkit/GeolocationPermissions$Callback;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/q;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/median/android/h;->a:Lco/median/android/q;

    iput-object p2, p0, Lco/median/android/h;->b:Landroid/webkit/GeolocationPermissions$Callback;

    iput-object p3, p0, Lco/median/android/h;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/h;->a:Lco/median/android/q;

    iget-object v1, p0, Lco/median/android/h;->b:Landroid/webkit/GeolocationPermissions$Callback;

    iget-object v2, p0, Lco/median/android/h;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lco/median/android/q;->g(Lco/median/android/q;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;Z)V

    return-void
.end method
