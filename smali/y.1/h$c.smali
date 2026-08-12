.class public final Ly/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:[Ly/h$d;


# direct methods
.method public constructor <init>([Ly/h$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly/h$c;->a:[Ly/h$d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()[Ly/h$d;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/h$c;->a:[Ly/h$d;

    .line 2
    .line 3
    return-object v0
.end method
