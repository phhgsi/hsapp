.class public final synthetic Lm0/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:Lco/median/android/B;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/l1;->a:Lco/median/android/B;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/l1;->a:Lco/median/android/B;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lco/median/android/B;->a(Lco/median/android/B;Ljava/lang/String;)V

    return-void
.end method
