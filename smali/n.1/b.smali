.class public final Ln/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/b$d;,
        Ln/b$c;,
        Ln/b$b;,
        Ln/b$a;,
        Ln/b$e;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Intent;

.field public final b:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln/b;->a:Landroid/content/Intent;

    .line 5
    .line 6
    iput-object p2, p0, Ln/b;->b:Landroid/os/Bundle;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    const-string v0, "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    xor-int/lit8 p0, p0, 0x1

    .line 9
    .line 10
    return p0
.end method
