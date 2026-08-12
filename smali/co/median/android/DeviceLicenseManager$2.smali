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

    .line 133
    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$2;->val$activity:Landroid/app/Activity;

    iput-object p2, p0, Lco/median/android/DeviceLicenseManager$2;->val$deviceId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 136
    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$2;->val$activity:Landroid/app/Activity;

    const-string p2, "clipboard"

    invoke-virtual {p1, p2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ClipboardManager;

    .line 137
    const-string p2, "Device ID"

    iget-object v0, p0, Lco/median/android/DeviceLicenseManager$2;->val$deviceId:Ljava/lang/String;

    invoke-static {p2, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p2

    .line 138
    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 139
    invoke-virtual {p1, p2}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 140
    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$2;->val$activity:Landroid/app/Activity;

    const-string p2, "Device ID copied to clipboard!"

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 142
    :cond_0
    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$2;->val$activity:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finishAffinity()V

    .line 143
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 144
    return-void
.end method
