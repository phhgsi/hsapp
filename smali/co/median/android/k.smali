.class public final synthetic Lco/median/android/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:Landroid/webkit/JsPromptResult;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/JsPromptResult;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/median/android/k;->a:Landroid/webkit/JsPromptResult;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/k;->a:Landroid/webkit/JsPromptResult;

    invoke-static {v0, p1}, Lco/median/android/q;->c(Landroid/webkit/JsPromptResult;Landroid/content/DialogInterface;)V

    return-void
.end method
