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

.field final synthetic val$finalId:Ljava/lang/String;

.field final synthetic val$finalMsg:Ljava/lang/String;


# direct methods
.method constructor <init>(Lco/median/android/DeviceLicenseManager$1;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 82
    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$1$1;->this$0:Lco/median/android/DeviceLicenseManager$1;

    iput-object p2, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalId:Ljava/lang/String;

    iput-object p3, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalMsg:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 85
    iget-object v0, p0, Lco/median/android/DeviceLicenseManager$1$1;->this$0:Lco/median/android/DeviceLicenseManager$1;

    iget-object v0, v0, Lco/median/android/DeviceLicenseManager$1;->val$activity:Landroid/app/Activity;

    iget-object v1, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalId:Ljava/lang/String;

    iget-object v2, p0, Lco/median/android/DeviceLicenseManager$1$1;->val$finalMsg:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lco/median/android/DeviceLicenseManager;->-$$Nest$smshowUnauthorizedDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    return-void
.end method
