.class public Lco/median/android/DeviceLicenseManager;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"


# static fields
.field public static LICENSE_URL:Ljava/lang/String; = null

.field private static final TAG:Ljava/lang/String; = "DeviceLicenseManager"


# direct methods
.method static bridge synthetic -$$Nest$smshowUnauthorizedDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/median/android/DeviceLicenseManager;->showUnauthorizedDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static bridge synthetic -$$Nest$smshowUpdateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lco/median/android/DeviceLicenseManager;->showUpdateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 25
    const-string v0, "https://raw.githubusercontent.com/phhgsi/hsapp/refs/heads/main/allowed_devices.json"

    sput-object v0, Lco/median/android/DeviceLicenseManager;->LICENSE_URL:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkLicense(Landroid/app/Activity;)V
    .locals 2

    .line 29
    if-nez p0, :cond_0

    return-void

    .line 32
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 33
    const-string v1, "LaunchActivity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 34
    return-void

    .line 37
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lco/median/android/DeviceLicenseManager$1;

    invoke-direct {v1, p0}, Lco/median/android/DeviceLicenseManager$1;-><init>(Landroid/app/Activity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 141
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 142
    return-void
.end method

.method private static showUnauthorizedDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 146
    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 147
    const-string v2, "Device Unauthorized"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 148
    invoke-virtual {v1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 149
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 151
    const-string p2, "Copy Device ID & Exit"

    new-instance v2, Lco/median/android/DeviceLicenseManager$2;

    invoke-direct {v2, p0, p1}, Lco/median/android/DeviceLicenseManager$2;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v1, p2, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 167
    const-string p1, "Close App"

    new-instance p2, Lco/median/android/DeviceLicenseManager$3;

    invoke-direct {p2, p0}, Lco/median/android/DeviceLicenseManager$3;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v1, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 175
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 176
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 177
    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    goto :goto_0

    .line 178
    :catch_0
    move-exception p1

    .line 179
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    .line 180
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 182
    :goto_0
    return-void
.end method

.method private static showUpdateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 186
    :try_start_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 187
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 188
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 189
    const/4 p1, 0x0

    if-eqz p4, :cond_0

    .line 190
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 193
    :cond_0
    const-string p2, "Update Now"

    new-instance v1, Lco/median/android/DeviceLicenseManager$4;

    invoke-direct {v1, p3, p0, p4}, Lco/median/android/DeviceLicenseManager$4;-><init>(Ljava/lang/String;Landroid/app/Activity;Z)V

    invoke-virtual {v0, p2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 207
    if-nez p4, :cond_1

    .line 208
    const-string p0, "Later"

    const/4 p2, 0x0

    invoke-virtual {v0, p0, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 211
    :cond_1
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    .line 212
    if-eqz p4, :cond_2

    .line 213
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 215
    :cond_2
    invoke-virtual {p0}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 216
    :catch_0
    move-exception p0

    :goto_0
    nop

    .line 217
    return-void
.end method
