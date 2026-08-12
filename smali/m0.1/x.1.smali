.class public final synthetic Lm0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Landroid/app/Activity;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/x;->d:Landroid/app/Activity;

    iput-object p2, p0, Lm0/x;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/x;->d:Landroid/app/Activity;

    iget-object v1, p0, Lm0/x;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lco/median/android/d;->e(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
