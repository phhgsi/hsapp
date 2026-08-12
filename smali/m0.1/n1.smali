.class public final synthetic Lm0/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/median/android/MainActivity$j;


# instance fields
.field public final synthetic a:Lco/median/android/B;

.field public final synthetic b:Landroid/webkit/WebChromeClient$FileChooserParams;

.field public final synthetic c:Lm0/F;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/B;Landroid/webkit/WebChromeClient$FileChooserParams;Lm0/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/n1;->a:Lco/median/android/B;

    iput-object p2, p0, Lm0/n1;->b:Landroid/webkit/WebChromeClient$FileChooserParams;

    iput-object p3, p0, Lm0/n1;->c:Lm0/F;

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/String;[I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/n1;->a:Lco/median/android/B;

    iget-object v1, p0, Lm0/n1;->b:Landroid/webkit/WebChromeClient$FileChooserParams;

    iget-object v2, p0, Lm0/n1;->c:Lm0/F;

    invoke-static {v0, v1, v2, p1, p2}, Lco/median/android/B;->h(Lco/median/android/B;Landroid/webkit/WebChromeClient$FileChooserParams;Lm0/F;[Ljava/lang/String;[I)V

    return-void
.end method
