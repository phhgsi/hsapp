.class public final synthetic Lm0/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lco/median/android/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/z0;->a:Lco/median/android/MainActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/z0;->a:Lco/median/android/MainActivity;

    invoke-static {v0, p1, p2}, Lco/median/android/MainActivity;->Q0(Lco/median/android/MainActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method
