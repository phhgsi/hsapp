.class final Ld1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/a;


# instance fields
.field final synthetic a:Landroid/app/Activity;


# direct methods
.method constructor <init>(Ld1/l;Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p2, p0, Ld1/k;->a:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ld1/k;->a:Landroid/app/Activity;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move v4, p4

    .line 7
    move v5, p5

    .line 8
    move v6, p6

    .line 9
    move-object v7, p7

    .line 10
    invoke-virtual/range {v0 .. v7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
