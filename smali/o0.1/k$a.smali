.class Lo0/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/util/regex/Pattern;

.field final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/util/regex/Pattern;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo0/k$a;->a:Ljava/util/regex/Pattern;

    .line 5
    .line 6
    iput-object p2, p0, Lo0/k$a;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
