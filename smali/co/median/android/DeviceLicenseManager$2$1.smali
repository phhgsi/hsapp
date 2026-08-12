.class Lco/median/android/DeviceLicenseManager$2$1;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"
.implements Landroid/content/DialogInterface$OnClickListener;

# instance fields
.field final synthetic this$1:Lco/median/android/DeviceLicenseManager$2;
.field final synthetic val$activity:Landroid/app/Activity;

# direct methods
.method constructor <init>(Lco/median/android/DeviceLicenseManager$2;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$2$1;->this$1:Lco/median/android/DeviceLicenseManager$2;

    iput-object p2, p0, Lco/median/android/DeviceLicenseManager$2$1;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$2$1;->val$activity:Landroid/app/Activity;

    const-string v0, "clipboard"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ClipboardManager;

    const-string v0, "Device ID"

    iget-object v1, p0, Lco/median/android/DeviceLicenseManager$2$1;->this$1:Lco/median/android/DeviceLicenseManager$2;

    iget-object v1, v1, Lco/median/android/DeviceLicenseManager$2;->val$deviceId:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$2$1;->val$activity:Landroid/app/Activity;

    const-string v0, "Device ID copied to clipboard!"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_0
    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$2$1;->val$activity:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finishAffinity()V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    return-void
.end method
