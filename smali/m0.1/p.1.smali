.class public Lm0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/p;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method

.method private b()Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/p;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm0/p;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0}, LZ/b;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lm0/p;->b:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lm0/p;->b:Landroid/content/SharedPreferences;

    .line 14
    .line 15
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-direct {p0}, Lm0/p;->b()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "io.gonative.android.appTheme"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lm0/p;->b()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, "io.gonative.android.appTheme"

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 34
    .line 35
    .line 36
    return-void
.end method
