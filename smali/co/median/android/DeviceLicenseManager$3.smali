.class Lco/median/android/DeviceLicenseManager$3;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"
.implements Ljava/lang/Runnable;

# instance fields
.field final synthetic this$0:Lco/median/android/DeviceLicenseManager$1;

.field final synthetic val$title:Ljava/lang/String;

.field final synthetic val$msg:Ljava/lang/String;

.field final synthetic val$url:Ljava/lang/String;

.field final synthetic val$force:Z

# direct methods
.method constructor <init>(Lco/median/android/DeviceLicenseManager$1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$3;->this$0:Lco/median/android/DeviceLicenseManager$1;

    iput-object p2, p0, Lco/median/android/DeviceLicenseManager$3;->val$title:Ljava/lang/String;

    iput-object p3, p0, Lco/median/android/DeviceLicenseManager$3;->val$msg:Ljava/lang/String;

    iput-object p4, p0, Lco/median/android/DeviceLicenseManager$3;->val$url:Ljava/lang/String;

    iput-boolean p5, p0, Lco/median/android/DeviceLicenseManager$3;->val$force:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lco/median/android/DeviceLicenseManager$3;->this$0:Lco/median/android/DeviceLicenseManager$1;

    iget-object v0, v0, Lco/median/android/DeviceLicenseManager$1;->val$activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lco/median/android/DeviceLicenseManager$3;->val$title:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lco/median/android/DeviceLicenseManager$3;->val$msg:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    iget-boolean v2, p0, Lco/median/android/DeviceLicenseManager$3;->val$force:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    :cond_0
    new-instance v2, Lco/median/android/DeviceLicenseManager$3$1;

    invoke-direct {v2, p0, v0}, Lco/median/android/DeviceLicenseManager$3$1;-><init>(Lco/median/android/DeviceLicenseManager$3;Landroid/app/Activity;)V

    const-string v3, "Update Now"

    invoke-virtual {v1, v3, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    iget-boolean v2, p0, Lco/median/android/DeviceLicenseManager$3;->val$force:Z

    if-nez v2, :cond_0_later

    const-string v3, "Later"

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_0_later
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iget-boolean v1, p0, Lco/median/android/DeviceLicenseManager$3;->val$force:Z

    if-eqz v1, :cond_0_touch

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    :cond_0_touch
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_1
    return-void
.end method
