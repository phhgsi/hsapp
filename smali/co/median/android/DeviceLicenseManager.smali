.class public Lco/median/android/DeviceLicenseManager;
.super Ljava/lang/Object;
.source "DeviceLicenseManager.java"


# static fields
.field public static API_URL:Ljava/lang/String; = null

.field public static RAW_URL:Ljava/lang/String; = null

.field private static final TAG:Ljava/lang/String; = "DeviceLicenseManager"


# direct methods
.method static bridge synthetic -$$Nest$smfetchContentFromGitHub()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lco/median/android/DeviceLicenseManager;->fetchContentFromGitHub()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic -$$Nest$smshowThemedUnauthorizedDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/median/android/DeviceLicenseManager;->showThemedUnauthorizedDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static bridge synthetic -$$Nest$smshowThemedUpdateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lco/median/android/DeviceLicenseManager;->showThemedUpdateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-string v0, "https://api.github.com/repos/phhgsi/hsapp/contents/allowed_devices.json"

    sput-object v0, Lco/median/android/DeviceLicenseManager;->API_URL:Ljava/lang/String;

    .line 37
    const-string v0, "https://raw.githubusercontent.com/phhgsi/hsapp/refs/heads/main/allowed_devices.json"

    sput-object v0, Lco/median/android/DeviceLicenseManager;->RAW_URL:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkLicense(Landroid/app/Activity;)V
    .locals 2

    .line 41
    if-nez p0, :cond_0

    return-void

    .line 43
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 44
    const-string v1, "LaunchActivity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    return-void

    .line 48
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lco/median/android/DeviceLicenseManager$1;

    invoke-direct {v1, p0}, Lco/median/android/DeviceLicenseManager$1;-><init>(Landroid/app/Activity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 136
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 137
    return-void
.end method

.method private static dpToPx(Landroid/content/Context;F)I
    .locals 1

    .line 494
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method private static fetchContentFromGitHub()Ljava/lang/String;
    .locals 12

    .line 142
    const-string v0, "content"

    const-string v1, "no-cache, no-store, must-revalidate"

    const-string v2, "Cache-Control"

    const-string v3, "GET"

    const-string v4, "?t="

    const-string v5, "DeviceLicenseManager"

    const/16 v6, 0xc8

    :try_start_0
    new-instance v7, Ljava/net/URL;

    sget-object v8, Lco/median/android/DeviceLicenseManager;->API_URL:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 143
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v7

    check-cast v7, Ljava/net/HttpURLConnection;

    .line 144
    invoke-virtual {v7, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 145
    const-string v8, "User-Agent"

    const-string v9, "DeviceLicenseManager/1.0"

    invoke-virtual {v7, v8, v9}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const-string v8, "Accept"

    const-string v9, "application/vnd.github.v3+json"

    invoke-virtual {v7, v8, v9}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    invoke-virtual {v7, v2, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const/16 v8, 0xbb8

    invoke-virtual {v7, v8}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 149
    invoke-virtual {v7, v8}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 151
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    if-ne v8, v6, :cond_1

    .line 152
    new-instance v8, Ljava/io/BufferedReader;

    new-instance v9, Ljava/io/InputStreamReader;

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v8, v9}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 153
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    :goto_0
    invoke-virtual {v8}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_0

    .line 156
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 158
    :cond_0
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V

    .line 159
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 161
    new-instance v8, Lorg/json/JSONObject;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 163
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v7, "\\s+"

    const-string v8, ""

    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 164
    const/4 v7, 0x0

    invoke-static {v0, v7}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 165
    new-instance v7, Ljava/lang/String;

    const-string v8, "UTF-8"

    invoke-direct {v7, v0, v8}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v7

    .line 168
    :cond_1
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    goto :goto_1

    .line 169
    :catch_0
    move-exception v0

    .line 170
    const-string v7, "GitHub API fetch exception, falling back to RAW URL"

    invoke-static {v5, v7, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 175
    :goto_1
    :try_start_1
    new-instance v0, Ljava/net/URL;

    sget-object v7, Lco/median/android/DeviceLicenseManager;->RAW_URL:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 176
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 177
    invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 178
    invoke-virtual {v0, v2, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    const/16 v1, 0xfa0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 180
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 182
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    if-ne v1, v6, :cond_3

    .line 183
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 184
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    :goto_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 187
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 189
    :cond_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 190
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 191
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 193
    :cond_3
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 196
    goto :goto_3

    .line 194
    :catch_1
    move-exception v0

    .line 195
    const-string v1, "GitHub RAW URL fetch exception"

    invoke-static {v5, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 198
    :goto_3
    const/4 v0, 0x0

    return-object v0
.end method

.method private static showThemedUnauthorizedDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 17

    .line 203
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "#2F9AC7"

    const/4 v3, 0x0

    :try_start_0
    new-instance v4, Landroid/app/AlertDialog$Builder;

    invoke-direct {v4, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v4

    .line 204
    invoke-virtual {v4, v3}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 205
    invoke-virtual {v4, v3}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 208
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 209
    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 210
    invoke-virtual {v5, v3, v3, v3, v3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 212
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 213
    const/4 v8, -0x1

    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 214
    const/high16 v9, 0x41800000    # 16.0f

    invoke-static {v1, v9}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v7, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 215
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 218
    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 219
    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 220
    const/high16 v10, 0x41a00000    # 20.0f

    invoke-static {v1, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v11

    invoke-static {v1, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v12

    invoke-static {v1, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v13

    invoke-static {v1, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v14

    invoke-virtual {v7, v11, v12, v13, v14}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 221
    const/16 v11, 0x11

    invoke-virtual {v7, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 223
    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    sget-object v13, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 225
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    const-string v15, "#1D80A8"

    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v15

    filled-new-array {v14, v15}, [I

    move-result-object v14

    invoke-direct {v12, v13, v14}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 227
    nop

    .line 228
    invoke-static {v1, v9}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v13

    int-to-float v13, v13

    invoke-static {v1, v9}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v14

    int-to-float v14, v14

    .line 229
    invoke-static {v1, v9}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v15

    int-to-float v15, v15

    const/16 v16, 0x0

    invoke-static {v1, v9}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v3

    int-to-float v3, v3

    const/16 v9, 0x8

    new-array v9, v9, [F

    aput v13, v9, v16

    aput v14, v9, v6

    const/4 v13, 0x2

    aput v15, v9, v13

    const/4 v14, 0x3

    aput v3, v9, v14

    const/4 v3, 0x4

    const/4 v14, 0x0

    aput v14, v9, v3

    const/4 v3, 0x5

    aput v14, v9, v3

    const/4 v3, 0x6

    aput v14, v9, v3

    const/4 v3, 0x7

    aput v14, v9, v3

    .line 227
    invoke-virtual {v12, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 232
    invoke-virtual {v7, v12}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 234
    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 235
    const-string v9, "Security Alert"

    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 237
    invoke-virtual {v3, v13, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 238
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 239
    invoke-virtual {v3, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 240
    invoke-virtual {v7, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 242
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 245
    new-instance v3, Landroid/widget/ScrollView;

    invoke-direct {v3, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 246
    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 247
    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 248
    invoke-static {v1, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v9

    const/high16 v11, 0x41800000    # 16.0f

    invoke-static {v1, v11}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v12

    invoke-static {v1, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v15

    invoke-static {v1, v11}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v11

    invoke-virtual {v7, v9, v12, v15, v11}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 250
    new-instance v9, Landroid/widget/TextView;

    invoke-direct {v9, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 251
    move-object/from16 v11, p2

    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    const-string v11, "#333333"

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 253
    const/high16 v11, 0x41700000    # 15.0f

    invoke-virtual {v9, v13, v11}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 254
    const v12, 0x3f99999a    # 1.2f

    invoke-virtual {v9, v14, v12}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 255
    invoke-virtual {v7, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 258
    new-instance v9, Landroid/widget/LinearLayout;

    invoke-direct {v9, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 259
    invoke-virtual {v9, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 260
    const/high16 v12, 0x41400000    # 12.0f

    invoke-static {v1, v12}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v14

    const/high16 v15, 0x41200000    # 10.0f

    invoke-static {v1, v15}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v10

    invoke-static {v1, v12}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v12

    invoke-static {v1, v15}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v6

    invoke-virtual {v9, v14, v10, v12, v6}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 261
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x2

    invoke-direct {v6, v8, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 265
    const/high16 v10, 0x41600000    # 14.0f

    invoke-static {v1, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v12

    invoke-static {v1, v15}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v14

    const/4 v10, 0x0

    invoke-virtual {v6, v10, v12, v10, v14}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 266
    invoke-virtual {v9, v6}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 268
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 269
    const-string v10, "#F4F8FA"

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v6, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 270
    invoke-static {v1, v15}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v6, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 271
    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v1, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v10

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v6, v10, v12}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 272
    invoke-virtual {v9, v6}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 274
    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 275
    const-string v10, "YOUR DEVICE ID:"

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 276
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 277
    const/high16 v10, 0x41300000    # 11.0f

    invoke-virtual {v6, v13, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 278
    sget-object v10, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 279
    invoke-virtual {v9, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 281
    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 282
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    const-string v10, "#111111"

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 284
    invoke-virtual {v6, v13, v11}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 285
    sget-object v10, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    const/4 v11, 0x1

    invoke-virtual {v6, v10, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 286
    invoke-virtual {v9, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 288
    invoke-virtual {v7, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 289
    invoke-virtual {v3, v7}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 290
    invoke-virtual {v5, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 293
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 294
    const/4 v11, 0x1

    invoke-virtual {v3, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 295
    const/high16 v6, 0x41a00000    # 20.0f

    invoke-static {v1, v6}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v7

    invoke-static {v1, v6}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v9

    invoke-static {v1, v6}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v6

    const/4 v10, 0x0

    invoke-virtual {v3, v7, v10, v9, v6}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 298
    new-instance v6, Landroid/widget/Button;

    invoke-direct {v6, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 299
    const-string v7, "Copy Device ID & Exit"

    invoke-virtual {v6, v7}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 300
    invoke-virtual {v6, v8}, Landroid/widget/Button;->setTextColor(I)V

    .line 301
    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v6, v13, v7}, Landroid/widget/Button;->setTextSize(IF)V

    .line 302
    sget-object v7, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v6, v7}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;)V

    .line 304
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 305
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v7, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 306
    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v7, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 307
    invoke-virtual {v6, v7}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 309
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 311
    const/high16 v7, 0x42380000    # 46.0f

    invoke-static {v1, v7}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v7

    invoke-direct {v2, v8, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 313
    invoke-virtual {v6, v2}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 315
    new-instance v2, Lco/median/android/DeviceLicenseManager$2;

    invoke-direct {v2, v1, v0}, Lco/median/android/DeviceLicenseManager$2;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 330
    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 333
    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 334
    const-string v2, "Close App"

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 335
    const-string v2, "#666666"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setTextColor(I)V

    .line 336
    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v0, v13, v7}, Landroid/widget/Button;->setTextSize(IF)V

    .line 337
    const/4 v10, 0x0

    invoke-virtual {v0, v10}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 339
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 341
    const/high16 v6, 0x42280000    # 42.0f

    invoke-static {v1, v6}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v6

    invoke-direct {v2, v8, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 343
    const/high16 v6, 0x40c00000    # 6.0f

    invoke-static {v1, v6}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v6

    const/4 v10, 0x0

    invoke-virtual {v2, v10, v6, v10, v10}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 344
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 346
    new-instance v2, Lco/median/android/DeviceLicenseManager$3;

    invoke-direct {v2, v1}, Lco/median/android/DeviceLicenseManager$3;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 353
    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 355
    invoke-virtual {v5, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 357
    invoke-virtual {v4, v5}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    .line 358
    invoke-virtual {v4}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 362
    goto :goto_0

    .line 359
    :catch_0
    move-exception v0

    .line 360
    invoke-virtual {v1}, Landroid/app/Activity;->finishAffinity()V

    .line 361
    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/System;->exit(I)V

    .line 363
    :goto_0
    return-void
.end method

.method private static showThemedUpdateDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 17

    .line 367
    move-object/from16 v0, p0

    move/from16 v1, p4

    const-string v2, "#9169F3"

    :try_start_0
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v3

    .line 368
    const/4 v4, 0x0

    if-eqz v1, :cond_0

    .line 369
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 370
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 373
    :cond_0
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 374
    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 376
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 377
    const/4 v8, -0x1

    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 378
    const/high16 v9, 0x41800000    # 16.0f

    invoke-static {v0, v9}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v7, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 379
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 382
    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 383
    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 384
    const/high16 v10, 0x41a00000    # 20.0f

    invoke-static {v0, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v11

    invoke-static {v0, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v12

    invoke-static {v0, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v13

    invoke-static {v0, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v14

    invoke-virtual {v7, v11, v12, v13, v14}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 385
    const/16 v11, 0x11

    invoke-virtual {v7, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 387
    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    sget-object v13, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 389
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    const-string v15, "#7444E8"

    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v15

    filled-new-array {v14, v15}, [I

    move-result-object v14

    invoke-direct {v12, v13, v14}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 391
    nop

    .line 392
    invoke-static {v0, v9}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v13

    int-to-float v13, v13

    invoke-static {v0, v9}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v14

    int-to-float v14, v14

    .line 393
    invoke-static {v0, v9}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v15

    int-to-float v15, v15

    const/16 v16, 0x0

    invoke-static {v0, v9}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v4

    int-to-float v4, v4

    const/16 v9, 0x8

    new-array v9, v9, [F

    aput v13, v9, v16

    aput v14, v9, v6

    const/4 v13, 0x2

    aput v15, v9, v13

    const/4 v14, 0x3

    aput v4, v9, v14

    const/4 v4, 0x4

    const/4 v14, 0x0

    aput v14, v9, v4

    const/4 v4, 0x5

    aput v14, v9, v4

    const/4 v4, 0x6

    aput v14, v9, v4

    const/4 v4, 0x7

    aput v14, v9, v4

    .line 391
    invoke-virtual {v12, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 396
    invoke-virtual {v7, v12}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 398
    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 399
    move-object/from16 v9, p1

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 400
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 401
    invoke-virtual {v4, v13, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 402
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 403
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 404
    invoke-virtual {v7, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 406
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 409
    new-instance v4, Landroid/widget/ScrollView;

    invoke-direct {v4, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 410
    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 411
    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 412
    invoke-static {v0, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v9

    const/high16 v11, 0x41800000    # 16.0f

    invoke-static {v0, v11}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v12

    invoke-static {v0, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v15

    invoke-static {v0, v11}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v11

    invoke-virtual {v7, v9, v12, v15, v11}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 414
    new-instance v9, Landroid/widget/TextView;

    invoke-direct {v9, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 415
    move-object/from16 v11, p2

    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 416
    const-string v11, "#333333"

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 417
    const/high16 v11, 0x41700000    # 15.0f

    invoke-virtual {v9, v13, v11}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 418
    const v11, 0x3f99999a    # 1.2f

    invoke-virtual {v9, v14, v11}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 419
    invoke-virtual {v7, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 421
    invoke-virtual {v4, v7}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 422
    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 425
    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 426
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 427
    invoke-static {v0, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v6

    invoke-static {v0, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v7

    invoke-static {v0, v10}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v9

    const/4 v10, 0x0

    invoke-virtual {v4, v6, v10, v7, v9}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 429
    new-instance v6, Landroid/widget/Button;

    invoke-direct {v6, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 430
    const-string v7, "Update Now"

    invoke-virtual {v6, v7}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 431
    invoke-virtual {v6, v8}, Landroid/widget/Button;->setTextColor(I)V

    .line 432
    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v6, v13, v7}, Landroid/widget/Button;->setTextSize(IF)V

    .line 433
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v6, v9}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;)V

    .line 435
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 436
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v9, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 437
    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v0, v2}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v9, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 438
    invoke-virtual {v6, v9}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 440
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 442
    const/high16 v9, 0x42380000    # 46.0f

    invoke-static {v0, v9}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v9

    invoke-direct {v2, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 444
    invoke-virtual {v6, v2}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 446
    new-instance v2, Lco/median/android/DeviceLicenseManager$4;

    move-object/from16 v9, p3

    invoke-direct {v2, v9, v0, v1, v3}, Lco/median/android/DeviceLicenseManager$4;-><init>(Ljava/lang/String;Landroid/app/Activity;ZLandroid/app/AlertDialog;)V

    invoke-virtual {v6, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 461
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 463
    if-nez v1, :cond_1

    .line 464
    new-instance v1, Landroid/widget/Button;

    invoke-direct {v1, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 465
    const-string v2, "Later"

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 466
    const-string v2, "#666666"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V

    .line 467
    invoke-virtual {v1, v13, v7}, Landroid/widget/Button;->setTextSize(IF)V

    .line 468
    const/4 v10, 0x0

    invoke-virtual {v1, v10}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 470
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 472
    const/high16 v6, 0x42280000    # 42.0f

    invoke-static {v0, v6}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v6

    invoke-direct {v2, v8, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 474
    const/high16 v6, 0x40c00000    # 6.0f

    invoke-static {v0, v6}, Lco/median/android/DeviceLicenseManager;->dpToPx(Landroid/content/Context;F)I

    move-result v0

    const/4 v10, 0x0

    invoke-virtual {v2, v10, v0, v10, v10}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 475
    invoke-virtual {v1, v2}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 477
    new-instance v0, Lco/median/android/DeviceLicenseManager$5;

    invoke-direct {v0, v3}, Lco/median/android/DeviceLicenseManager$5;-><init>(Landroid/app/AlertDialog;)V

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 483
    invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 486
    :cond_1
    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 488
    invoke-virtual {v3, v5}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    .line 489
    invoke-virtual {v3}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 490
    :catch_0
    move-exception v0

    :goto_0
    nop

    .line 491
    return-void
.end method
