.class Lco/median/android/DeviceLicenseManager$4;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/DeviceLicenseManager;->showThemedUpdateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;

.field final synthetic val$dialog:Landroid/app/AlertDialog;

.field final synthetic val$downloadUrl:Ljava/lang/String;

.field final synthetic val$forceUpdate:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/app/Activity;ZLandroid/app/AlertDialog;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 446
    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$4;->val$downloadUrl:Ljava/lang/String;

    iput-object p2, p0, Lco/median/android/DeviceLicenseManager$4;->val$activity:Landroid/app/Activity;

    iput-boolean p3, p0, Lco/median/android/DeviceLicenseManager$4;->val$forceUpdate:Z

    iput-object p4, p0, Lco/median/android/DeviceLicenseManager$4;->val$dialog:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 450
    :try_start_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    iget-object v1, p0, Lco/median/android/DeviceLicenseManager$4;->val$downloadUrl:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 451
    iget-object v0, p0, Lco/median/android/DeviceLicenseManager$4;->val$activity:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 452
    :catch_0
    move-exception p1

    :goto_0
    nop

    .line 453
    iget-boolean p1, p0, Lco/median/android/DeviceLicenseManager$4;->val$forceUpdate:Z

    if-eqz p1, :cond_0

    .line 454
    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$4;->val$activity:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finishAffinity()V

    .line 455
    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    goto :goto_1

    .line 457
    :cond_0
    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$4;->val$dialog:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V

    .line 459
    :goto_1
    return-void
.end method
