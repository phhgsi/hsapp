.class Lco/median/android/DeviceLicenseManager$3$1;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"
.implements Landroid/content/DialogInterface$OnClickListener;

# instance fields
.field final synthetic this$1:Lco/median/android/DeviceLicenseManager$3;
.field final synthetic val$activity:Landroid/app/Activity;

# direct methods
.method constructor <init>(Lco/median/android/DeviceLicenseManager$3;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$3$1;->this$1:Lco/median/android/DeviceLicenseManager$3;

    iput-object p2, p0, Lco/median/android/DeviceLicenseManager$3$1;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    :try_start_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    iget-object v1, p0, Lco/median/android/DeviceLicenseManager$3$1;->this$1:Lco/median/android/DeviceLicenseManager$3;

    iget-object v1, v1, Lco/median/android/DeviceLicenseManager$3;->val$url:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object v0, p0, Lco/median/android/DeviceLicenseManager$3$1;->val$activity:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$3$1;->this$1:Lco/median/android/DeviceLicenseManager$3;

    iget-boolean p1, p1, Lco/median/android/DeviceLicenseManager$3;->val$force:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$3$1;->val$activity:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finishAffinity()V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    :cond_0
    return-void
.end method
