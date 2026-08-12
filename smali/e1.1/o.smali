.class public abstract Le1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final a:Le1/p;

.field private final b:Landroid/content/IntentFilter;

.field private final c:Landroid/content/Context;

.field protected final d:Ljava/util/Set;

.field private volatile e:Z


# direct methods
.method protected constructor <init>(Le1/p;Landroid/content/IntentFilter;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Le1/o;->d:Ljava/util/Set;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Le1/o;->e:Z

    .line 13
    .line 14
    iput-object p1, p0, Le1/o;->a:Le1/p;

    .line 15
    .line 16
    iput-object p2, p0, Le1/o;->b:Landroid/content/IntentFilter;

    .line 17
    .line 18
    invoke-static {p3}, Le1/C;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Le1/o;->c:Landroid/content/Context;

    .line 23
    .line 24
    return-void
.end method
