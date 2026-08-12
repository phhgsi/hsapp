.class final LZ0/m$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ0/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field public final a:LZ0/l;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/RectF;

.field public final d:LZ0/m$b;

.field public final e:F


# direct methods
.method constructor <init>(LZ0/l;FLandroid/graphics/RectF;LZ0/m$b;Landroid/graphics/Path;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, LZ0/m$c;->d:LZ0/m$b;

    .line 5
    .line 6
    iput-object p1, p0, LZ0/m$c;->a:LZ0/l;

    .line 7
    .line 8
    iput p2, p0, LZ0/m$c;->e:F

    .line 9
    .line 10
    iput-object p3, p0, LZ0/m$c;->c:Landroid/graphics/RectF;

    .line 11
    .line 12
    iput-object p5, p0, LZ0/m$c;->b:Landroid/graphics/Path;

    .line 13
    .line 14
    return-void
.end method
