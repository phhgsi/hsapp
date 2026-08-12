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

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lco/median/android/DeviceLicenseManager$1;

    invoke-direct {v1, p0}, Lco/median/android/DeviceLicenseManager$1;-><init>(Landroid/app/Activity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 122
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 123
    return-void
.end method

.method private static showUnauthorizedDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 126
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 128
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 129
    const-string v1, "Device Unauthorized"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 130
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 131
    const/4 p2, 0x0

    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 133
    new-instance v1, Lco/median/android/DeviceLicenseManager$2;

    invoke-direct {v1, p0, p1}, Lco/median/android/DeviceLicenseManager$2;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    const-string p1, "Copy Device ID & Exit"

    invoke-virtual {v0, p1, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 147
    new-instance p1, Lco/median/android/DeviceLicenseManager$3;

    invoke-direct {p1, p0}, Lco/median/android/DeviceLicenseManager$3;-><init>(Landroid/app/Activity;)V

    const-string p0, "Close App"

    invoke-virtual {v0, p0, p1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 155
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    .line 156
    invoke-virtual {p0, p2}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 157
    invoke-virtual {p0}, Landroid/app/AlertDialog;->show()V

    .line 158
    return-void

    .line 126
    :cond_1
    :goto_0
    return-void
.end method

.method private static showUpdateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 161
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 163
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 164
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 165
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 166
    const/4 p1, 0x0

    if-eqz p4, :cond_1

    .line 167
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 170
    :cond_1
    new-instance p2, Lco/median/android/DeviceLicenseManager$4;

    invoke-direct {p2, p3, p0, p4}, Lco/median/android/DeviceLicenseManager$4;-><init>(Ljava/lang/String;Landroid/app/Activity;Z)V

    const-string p0, "Update Now"

    invoke-virtual {v0, p0, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 184
    if-nez p4, :cond_2

    .line 185
    const-string p0, "Later"

    const/4 p2, 0x0

    invoke-virtual {v0, p0, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 188
    :cond_2
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    .line 189
    if-eqz p4, :cond_3

    .line 190
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 192
    :cond_3
    invoke-virtual {p0}, Landroid/app/AlertDialog;->show()V

    .line 193
    return-void

    .line 161
    :cond_4
    :goto_0
    return-void
.end method
