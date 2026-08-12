.class public final synthetic Lm0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lco/median/android/MainActivity;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/m;->a:Ljava/lang/Object;

    iput-object p2, p0, Lm0/m;->b:Lco/median/android/MainActivity;

    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/m;->a:Ljava/lang/Object;

    iget-object v1, p0, Lm0/m;->b:Lco/median/android/MainActivity;

    invoke-static {v0, v1, p1}, Lm0/o;->b(Ljava/lang/Object;Lco/median/android/MainActivity;I)V

    return-void
.end method
