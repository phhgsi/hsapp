.class public Lco/median/android/DeviceLicenseManager;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"

# static fields
.field public static LICENSE_URL:Ljava/lang/String; = "https://raw.githubusercontent.com/phhgsi/hsapp/refs/heads/main/allowed_devices.json"

# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkLicense(Landroid/app/Activity;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lco/median/android/DeviceLicenseManager$1;

    invoke-direct {v1, p0}, Lco/median/android/DeviceLicenseManager$1;-><init>(Landroid/app/Activity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
