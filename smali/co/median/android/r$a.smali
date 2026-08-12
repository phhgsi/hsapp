.class public Lco/median/android/r$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Z

.field private c:I

.field private d:I

.field private e:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lco/median/android/r$a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lco/median/android/r$a;->b:Z

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lco/median/android/r$a;->c:I

    .line 10
    .line 11
    iput p1, p0, Lco/median/android/r$a;->d:I

    .line 12
    .line 13
    return-void
.end method

.method static bridge synthetic a(Lco/median/android/r$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/r$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic b(Lco/median/android/r$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lco/median/android/r$a;->e:Z

    return p0
.end method

.method static bridge synthetic c(Lco/median/android/r$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lco/median/android/r$a;->b:Z

    return p0
.end method

.method static bridge synthetic d(Lco/median/android/r$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lco/median/android/r$a;->d:I

    return p0
.end method

.method static bridge synthetic e(Lco/median/android/r$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lco/median/android/r$a;->c:I

    return p0
.end method

.method static bridge synthetic f(Lco/median/android/r$a;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lco/median/android/r$a;->e:Z

    return-void
.end method

.method static bridge synthetic g(Lco/median/android/r$a;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lco/median/android/r$a;->b:Z

    return-void
.end method


# virtual methods
.method public h(II)V
    .locals 0

    .line 1
    iput p1, p0, Lco/median/android/r$a;->c:I

    .line 2
    .line 3
    iput p2, p0, Lco/median/android/r$a;->d:I

    .line 4
    .line 5
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "id="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lco/median/android/r$a;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "\nisRoot="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-boolean v1, p0, Lco/median/android/r$a;->b:Z

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, "\nurlLevel="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lco/median/android/r$a;->c:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, "\nparentUrlLevel="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lco/median/android/r$a;->d:I

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method
