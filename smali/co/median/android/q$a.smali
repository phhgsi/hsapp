.class Lco/median/android/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/median/android/MainActivity$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/q;->onPermissionRequest(Landroid/webkit/PermissionRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/webkit/PermissionRequest;

.field final synthetic b:Lco/median/android/q;


# direct methods
.method constructor <init>(Lco/median/android/q;Landroid/webkit/PermissionRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/q$a;->b:Lco/median/android/q;

    .line 2
    .line 3
    iput-object p2, p0, Lco/median/android/q$a;->a:Landroid/webkit/PermissionRequest;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;[I)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p2

    .line 8
    if-ge v1, v2, :cond_3

    .line 9
    .line 10
    aget v2, p2, v1

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    aget-object v2, p1, v1

    .line 16
    .line 17
    const-string v3, "android.permission.RECORD_AUDIO"

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const-string v2, "android.webkit.resource.AUDIO_CAPTURE"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    aget-object v2, p1, v1

    .line 32
    .line 33
    const-string v3, "android.permission.CAMERA"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    const-string v2, "android.webkit.resource.VIDEO_CAPTURE"

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    iget-object p1, p0, Lco/median/android/q$a;->a:Landroid/webkit/PermissionRequest;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->deny()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    new-array p1, p1, [Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, [Ljava/lang/String;

    .line 72
    .line 73
    iget-object p2, p0, Lco/median/android/q$a;->a:Landroid/webkit/PermissionRequest;

    .line 74
    .line 75
    invoke-virtual {p2, p1}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method
