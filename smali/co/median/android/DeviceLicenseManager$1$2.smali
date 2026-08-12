.class Lco/median/android/DeviceLicenseManager$1$2;
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

.field final synthetic val$downloadUrl:Ljava/lang/String;

.field final synthetic val$forceUpdate:Z

.field final synthetic val$updateMsg:Ljava/lang/String;

.field final synthetic val$updateTitle:Ljava/lang/String;


# direct methods
.method constructor <init>(Lco/median/android/DeviceLicenseManager$1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 108
    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$1$2;->this$0:Lco/median/android/DeviceLicenseManager$1;

    iput-object p2, p0, Lco/median/android/DeviceLicenseManager$1$2;->val$updateTitle:Ljava/lang/String;

    iput-object p3, p0, Lco/median/android/DeviceLicenseManager$1$2;->val$updateMsg:Ljava/lang/String;

    iput-object p4, p0, Lco/median/android/DeviceLicenseManager$1$2;->val$downloadUrl:Ljava/lang/String;

    iput-boolean p5, p0, Lco/median/android/DeviceLicenseManager$1$2;->val$forceUpdate:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 111
    iget-object v0, p0, Lco/median/android/DeviceLicenseManager$1$2;->this$0:Lco/median/android/DeviceLicenseManager$1;

    iget-object v0, v0, Lco/median/android/DeviceLicenseManager$1;->val$activity:Landroid/app/Activity;

    iget-object v1, p0, Lco/median/android/DeviceLicenseManager$1$2;->val$updateTitle:Ljava/lang/String;

    iget-object v2, p0, Lco/median/android/DeviceLicenseManager$1$2;->val$updateMsg:Ljava/lang/String;

    iget-object v3, p0, Lco/median/android/DeviceLicenseManager$1$2;->val$downloadUrl:Ljava/lang/String;

    iget-boolean v4, p0, Lco/median/android/DeviceLicenseManager$1$2;->val$forceUpdate:Z

    invoke-static {v0, v1, v2, v3, v4}, Lco/median/android/DeviceLicenseManager;->-$$Nest$smshowUpdateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 112
    return-void
.end method
