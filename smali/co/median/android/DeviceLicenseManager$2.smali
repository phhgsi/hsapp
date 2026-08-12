.class Lco/median/android/DeviceLicenseManager$2;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/DeviceLicenseManager;->showUnauthorizedDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;

.field final synthetic val$deviceId:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 151
    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$2;->val$activity:Landroid/app/Activity;

    iput-object p2, p0, Lco/median/android/DeviceLicenseManager$2;->val$deviceId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 155
    const/4 p1, 0x0

    :try_start_0
    iget-object p2, p0, Lco/median/android/DeviceLicenseManager$2;->val$activity:Landroid/app/Activity;

    const-string v0, "clipboard"

    invoke-virtual {p2, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/ClipboardManager;

    .line 156
    const-string v0, "Device ID"

    iget-object v1, p0, Lco/median/android/DeviceLicenseManager$2;->val$deviceId:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    .line 157
    if-eqz p2, :cond_0

    .line 158
    invoke-virtual {p2, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 159
    iget-object p2, p0, Lco/median/android/DeviceLicenseManager$2;->val$activity:Landroid/app/Activity;

    const-string v0, "Device ID copied to clipboard!"

    invoke-static {p2, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 161
    :catch_0
    move-exception p2

    :cond_0
    :goto_0
    nop

    .line 162
    iget-object p2, p0, Lco/median/android/DeviceLicenseManager$2;->val$activity:Landroid/app/Activity;

    invoke-virtual {p2}, Landroid/app/Activity;->finishAffinity()V

    .line 163
    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    .line 164
    return-void
.end method
