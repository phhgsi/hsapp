.class public final synthetic Lm0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lco/median/android/MainActivity;

.field public final synthetic c:Landroid/media/AudioManager;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lco/median/android/MainActivity;Landroid/media/AudioManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/n;->a:Ljava/lang/Object;

    iput-object p2, p0, Lm0/n;->b:Lco/median/android/MainActivity;

    iput-object p3, p0, Lm0/n;->c:Landroid/media/AudioManager;

    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/n;->a:Ljava/lang/Object;

    iget-object v1, p0, Lm0/n;->b:Lco/median/android/MainActivity;

    iget-object v2, p0, Lm0/n;->c:Landroid/media/AudioManager;

    invoke-static {v0, v1, v2, p1}, Lm0/o;->a(Ljava/lang/Object;Lco/median/android/MainActivity;Landroid/media/AudioManager;I)V

    return-void
.end method
