.class public final synthetic Lm0/A0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lco/median/android/MainActivity;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lo0/b;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MainActivity;Ljava/lang/String;Lo0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/A0;->d:Lco/median/android/MainActivity;

    iput-object p2, p0, Lm0/A0;->e:Ljava/lang/String;

    iput-object p3, p0, Lm0/A0;->f:Lo0/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/A0;->d:Lco/median/android/MainActivity;

    iget-object v1, p0, Lm0/A0;->e:Ljava/lang/String;

    iget-object v2, p0, Lm0/A0;->f:Lo0/b;

    invoke-static {v0, v1, v2}, Lco/median/android/MainActivity;->T0(Lco/median/android/MainActivity;Ljava/lang/String;Lo0/b;)V

    return-void
.end method
