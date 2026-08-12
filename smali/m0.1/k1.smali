.class public final synthetic Lm0/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/security/KeyChainAliasCallback;


# instance fields
.field public final synthetic a:Lco/median/android/B;

.field public final synthetic b:Landroid/webkit/ClientCertRequest;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/B;Landroid/webkit/ClientCertRequest;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/k1;->a:Lco/median/android/B;

    iput-object p2, p0, Lm0/k1;->b:Landroid/webkit/ClientCertRequest;

    return-void
.end method


# virtual methods
.method public final alias(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/k1;->a:Lco/median/android/B;

    iget-object v1, p0, Lm0/k1;->b:Landroid/webkit/ClientCertRequest;

    invoke-static {v0, v1, p1}, Lco/median/android/B;->d(Lco/median/android/B;Landroid/webkit/ClientCertRequest;Ljava/lang/String;)V

    return-void
.end method
