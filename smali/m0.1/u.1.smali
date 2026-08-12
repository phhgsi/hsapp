.class public final synthetic Lm0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lo0/g;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lo0/g;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/u;->d:Lo0/g;

    iput-object p2, p0, Lm0/u;->e:Ljava/lang/String;

    iput-object p3, p0, Lm0/u;->f:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/u;->d:Lo0/g;

    iget-object v1, p0, Lm0/u;->e:Ljava/lang/String;

    iget-object v2, p0, Lm0/u;->f:Lorg/json/JSONObject;

    invoke-static {v0, v1, v2}, Lco/median/android/d;->a(Lo0/g;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
