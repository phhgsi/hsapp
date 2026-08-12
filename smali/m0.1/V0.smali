.class public final synthetic Lm0/V0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/navigation/NavigationView$d;


# instance fields
.field public final synthetic a:Lm0/W0;


# direct methods
.method public synthetic constructor <init>(Lm0/W0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/V0;->a:Lm0/W0;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/V0;->a:Lm0/W0;

    invoke-static {v0, p1}, Lm0/W0;->a(Lm0/W0;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
