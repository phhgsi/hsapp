.class Lu0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LD0/a;

.field private final c:LD0/a;


# direct methods
.method constructor <init>(Landroid/content/Context;LD0/a;LD0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu0/i;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lu0/i;->b:LD0/a;

    .line 7
    .line 8
    iput-object p3, p0, Lu0/i;->c:LD0/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Lu0/h;
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/i;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lu0/i;->b:LD0/a;

    .line 4
    .line 5
    iget-object v2, p0, Lu0/i;->c:LD0/a;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Lu0/h;->a(Landroid/content/Context;LD0/a;LD0/a;Ljava/lang/String;)Lu0/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
