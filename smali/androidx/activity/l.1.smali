.class public final synthetic Landroidx/activity/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Landroidx/activity/ComponentActivity$f;

.field public final synthetic e:I

.field public final synthetic f:Landroid/content/IntentSender$SendIntentException;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/ComponentActivity$f;ILandroid/content/IntentSender$SendIntentException;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/l;->d:Landroidx/activity/ComponentActivity$f;

    iput p2, p0, Landroidx/activity/l;->e:I

    iput-object p3, p0, Landroidx/activity/l;->f:Landroid/content/IntentSender$SendIntentException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/activity/l;->d:Landroidx/activity/ComponentActivity$f;

    iget v1, p0, Landroidx/activity/l;->e:I

    iget-object v2, p0, Landroidx/activity/l;->f:Landroid/content/IntentSender$SendIntentException;

    invoke-static {v0, v1, v2}, Landroidx/activity/ComponentActivity$f;->q(Landroidx/activity/ComponentActivity$f;ILandroid/content/IntentSender$SendIntentException;)V

    return-void
.end method
