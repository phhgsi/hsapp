.class Lco/median/android/DeviceLicenseManager$1$1;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/DeviceLicenseManager$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lco/median/android/DeviceLicenseManager$1;

.field final synthetic val$allowed:Z

.field final synthetic val$deviceId:Ljava/lang/String;

.field final synthetic val$finalDownloadUrl:Ljava/lang/String;

.field final synthetic val$finalForceUpdate:Z

.field final synthetic val$finalUpdateMsg:Ljava/lang/String;

.field final synthetic val$finalUpdateTitle:Ljava/lang/String;

.field final synthetic val$hasNewUpdate:Z

.field final synthetic val$messageToShow:Ljava/lang/String;


# direct methods
.method constructor <init>(Lco/median/android/DeviceLicenseManager$1;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 126
    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$1$1;->this$0:Lco/median/android/DeviceLicenseManager$1;

    iput-boolean p2, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$allowed:Z

    iput-object p3, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$deviceId:Ljava/lang/String;

    iput-object p4, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$messageToShow:Ljava/lang/String;

    iput-boolean p5, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$hasNewUpdate:Z

    iput-object p6, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalUpdateTitle:Ljava/lang/String;

    iput-object p7, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalUpdateMsg:Ljava/lang/String;

    iput-object p8, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalDownloadUrl:Ljava/lang/String;

    iput-boolean p9, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalForceUpdate:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 129
    iget-boolean v0, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$allowed:Z

    if-nez v0, :cond_0

    .line 130
    iget-object v0, p0, Lco/median/android/DeviceLicenseManager$1$1;->this$0:Lco/median/android/DeviceLicenseManager$1;

    iget-object v0, v0, Lco/median/android/DeviceLicenseManager$1;->val$activity:Landroid/app/Activity;

    iget-object v1, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$deviceId:Ljava/lang/String;

    iget-object v2, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$messageToShow:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lco/median/android/DeviceLicenseManager;->-$$Nest$smshowUnauthorizedDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 131
    :cond_0
    iget-boolean v0, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$hasNewUpdate:Z

    if-eqz v0, :cond_1

    .line 132
    iget-object v0, p0, Lco/median/android/DeviceLicenseManager$1$1;->this$0:Lco/median/android/DeviceLicenseManager$1;

    iget-object v0, v0, Lco/median/android/DeviceLicenseManager$1;->val$activity:Landroid/app/Activity;

    iget-object v1, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalUpdateTitle:Ljava/lang/String;

    iget-object v2, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalUpdateMsg:Ljava/lang/String;

    iget-object v3, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalDownloadUrl:Ljava/lang/String;

    iget-boolean v4, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalForceUpdate:Z

    invoke-static {v0, v1, v2, v3, v4}, Lco/median/android/DeviceLicenseManager;->-$$Nest$smshowUpdateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 134
    :cond_1
    :goto_0
    return-void
.end method
