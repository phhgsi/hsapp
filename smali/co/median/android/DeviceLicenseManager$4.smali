.class Lco/median/android/DeviceLicenseManager$4;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/DeviceLicenseManager;->showUpdateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;

.field final synthetic val$downloadUrl:Ljava/lang/String;

.field final synthetic val$forceUpdate:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/app/Activity;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 194
    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$4;->val$downloadUrl:Ljava/lang/String;

    iput-object p2, p0, Lco/median/android/DeviceLicenseManager$4;->val$activity:Landroid/app/Activity;

    iput-boolean p3, p0, Lco/median/android/DeviceLicenseManager$4;->val$forceUpdate:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 198
    :try_start_0
    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.VIEW"

    iget-object v0, p0, Lco/median/android/DeviceLicenseManager$4;->val$downloadUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 199
    iget-object p2, p0, Lco/median/android/DeviceLicenseManager$4;->val$activity:Landroid/app/Activity;

    invoke-virtual {p2, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 200
    :catch_0
    move-exception p1

    :goto_0
    nop

    .line 201
    iget-boolean p1, p0, Lco/median/android/DeviceLicenseManager$4;->val$forceUpdate:Z

    if-eqz p1, :cond_0

    .line 202
    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$4;->val$activity:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finishAffinity()V

    .line 203
    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    .line 205
    :cond_0
    return-void
.end method
