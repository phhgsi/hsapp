.class public final synthetic Lm0/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:Lco/median/android/B;

.field public final synthetic b:Lo0/a;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/B;Lo0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/j1;->a:Lco/median/android/B;

    iput-object p2, p0, Lm0/j1;->b:Lo0/a;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/j1;->a:Lco/median/android/B;

    iget-object v1, p0, Lm0/j1;->b:Lo0/a;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lco/median/android/B;->c(Lco/median/android/B;Lo0/a;Ljava/lang/String;)V

    return-void
.end method
