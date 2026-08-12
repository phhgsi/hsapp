.class Lco/median/android/DeviceLicenseManager$2$2;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"
.implements Landroid/content/DialogInterface$OnClickListener;

# instance fields
.field final synthetic this$1:Lco/median/android/DeviceLicenseManager$2;
.field final synthetic val$activity:Landroid/app/Activity;

# direct methods
.method constructor <init>(Lco/median/android/DeviceLicenseManager$2;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$2$2;->this$1:Lco/median/android/DeviceLicenseManager$2;

    iput-object p2, p0, Lco/median/android/DeviceLicenseManager$2$2;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lco/median/android/DeviceLicenseManager$2$2;->val$activity:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finishAffinity()V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    return-void
.end method
