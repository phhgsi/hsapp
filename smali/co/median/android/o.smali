.class public final synthetic Lco/median/android/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/webkit/JsResult;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/JsResult;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/median/android/o;->a:Landroid/webkit/JsResult;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/o;->a:Landroid/webkit/JsResult;

    invoke-static {v0, p1, p2}, Lco/median/android/q;->d(Landroid/webkit/JsResult;Landroid/content/DialogInterface;I)V

    return-void
.end method
