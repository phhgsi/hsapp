.class Lco/median/android/DeviceLicenseManager$1;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/DeviceLicenseManager;->checkLicense(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 48
    iput-object p1, p0, Lco/median/android/DeviceLicenseManager$1;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 52
    const-string v0, "update_config"

    const-string v1, "contact_message"

    const-string v2, "DeviceLicenseManager"

    :try_start_0
    iget-object v3, p0, Lco/median/android/DeviceLicenseManager$1;->val$activity:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "android_id"

    invoke-static {v3, v4}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 53
    if-nez v3, :cond_0

    const-string v3, "UNKNOWN_DEVICE"

    .line 54
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 56
    invoke-static {}, Lco/median/android/DeviceLicenseManager;->-$$Nest$smfetchContentFromGitHub()Ljava/lang/String;

    move-result-object v3

    .line 57
    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_7

    .line 62
    :cond_1
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 65
    nop

    .line 66
    const-string v3, "global_access"

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 67
    const/4 v6, 0x1

    if-eqz v3, :cond_2

    .line 68
    const/4 v3, 0x1

    goto :goto_1

    .line 70
    :cond_2
    const-string v3, "allowed_devices"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 71
    if-eqz v3, :cond_4

    .line 72
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-ge v8, v9, :cond_4

    .line 73
    const-string v9, ""

    invoke-virtual {v3, v8, v9}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    .line 74
    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 75
    nop

    .line 76
    const/4 v3, 0x1

    goto :goto_1

    .line 72
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 82
    :cond_4
    const/4 v3, 0x1

    const/4 v6, 0x0

    :goto_1
    nop

    .line 83
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 84
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "{DEVICE_ID}"

    invoke-virtual {v1, v8, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 83
    :cond_5
    const/4 v1, 0x0

    .line 88
    :goto_2
    nop

    .line 89
    const-string v8, "New Update Available!"

    .line 90
    const-string v9, "A new version of the app is available. Please update to continue using the app."

    .line 91
    const-string v10, "https://github.com/phhgsi/hsapp/releases"

    .line 92
    nop

    .line 93
    nop

    .line 95
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 96
    nop

    .line 97
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 98
    const-string v4, "latest_version_code"

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    .line 99
    const-string v11, "update_title"

    invoke-virtual {v0, v11, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 100
    const-string v11, "update_message"

    invoke-virtual {v0, v11, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 101
    const-string v11, "apk_download_url"

    invoke-virtual {v0, v11, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 102
    const-string v11, "force_update"

    invoke-virtual {v0, v11, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    move v13, v0

    move-object v12, v10

    move-object v10, v8

    const/4 v8, 0x1

    move-object v11, v9

    goto :goto_3

    .line 95
    :cond_6
    move-object v12, v10

    const/4 v4, 0x0

    const/4 v13, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    move-object v11, v9

    .line 105
    :goto_3
    nop

    .line 106
    if-eqz v1, :cond_7

    goto :goto_4

    .line 107
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Access Denied!\n\nYour Device ID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\nThis device is not authorized to use this app. Please contact the developer to activate access."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 109
    :goto_4
    nop

    .line 111
    :try_start_1
    iget-object v0, p0, Lco/median/android/DeviceLicenseManager$1;->val$activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v9, p0, Lco/median/android/DeviceLicenseManager$1;->val$activity:Landroid/app/Activity;

    invoke-virtual {v9}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 112
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 113
    goto :goto_5

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    .line 115
    :goto_5
    if-eqz v8, :cond_8

    if-le v4, v0, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    const/4 v9, 0x0

    .line 116
    :goto_6
    nop

    .line 117
    nop

    .line 118
    nop

    .line 119
    nop

    .line 121
    :try_start_2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v4, Lco/median/android/DeviceLicenseManager$1$1;

    move-object v5, p0

    move-object v8, v1

    invoke-direct/range {v4 .. v13}, Lco/median/android/DeviceLicenseManager$1$1;-><init>(Lco/median/android/DeviceLicenseManager$1;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 134
    goto :goto_8

    .line 58
    :cond_9
    :goto_7
    const-string v0, "Empty JSON response from GitHub endpoints"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 59
    return-void

    .line 132
    :catch_1
    move-exception v0

    .line 133
    const-string v1, "Error checking license/updates"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 135
    :goto_8
    return-void
.end method
