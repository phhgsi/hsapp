.class public final LG1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG1/a$c;,
        LG1/a$d;,
        LG1/a$b;,
        LG1/a$a;
    }
.end annotation


# static fields
.field private static final p:LG1/a;


# instance fields
.field private final a:J

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:LG1/a$c;

.field private final e:LG1/a$d;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:I

.field private final i:I

.field private final j:Ljava/lang/String;

.field private final k:J

.field private final l:LG1/a$b;

.field private final m:Ljava/lang/String;

.field private final n:J

.field private final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LG1/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, LG1/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LG1/a$a;->a()LG1/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, LG1/a;->p:LG1/a;

    .line 11
    .line 12
    return-void
.end method

.method constructor <init>(JLjava/lang/String;Ljava/lang/String;LG1/a$c;LG1/a$d;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;JLG1/a$b;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LG1/a;->a:J

    .line 5
    .line 6
    iput-object p3, p0, LG1/a;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, LG1/a;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, LG1/a;->d:LG1/a$c;

    .line 11
    .line 12
    iput-object p6, p0, LG1/a;->e:LG1/a$d;

    .line 13
    .line 14
    iput-object p7, p0, LG1/a;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p8, p0, LG1/a;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput p9, p0, LG1/a;->h:I

    .line 19
    .line 20
    iput p10, p0, LG1/a;->i:I

    .line 21
    .line 22
    iput-object p11, p0, LG1/a;->j:Ljava/lang/String;

    .line 23
    .line 24
    iput-wide p12, p0, LG1/a;->k:J

    .line 25
    .line 26
    iput-object p14, p0, LG1/a;->l:LG1/a$b;

    .line 27
    .line 28
    iput-object p15, p0, LG1/a;->m:Ljava/lang/String;

    .line 29
    .line 30
    move-wide/from16 p1, p16

    .line 31
    .line 32
    iput-wide p1, p0, LG1/a;->n:J

    .line 33
    .line 34
    move-object/from16 p1, p18

    .line 35
    .line 36
    iput-object p1, p0, LG1/a;->o:Ljava/lang/String;

    .line 37
    .line 38
    return-void
.end method

.method public static p()LG1/a$a;
    .locals 1

    .line 1
    new-instance v0, LG1/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, LG1/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/a;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, LG1/a;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, LG1/a;->n:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/a;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/a;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()LG1/a$b;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/a;->l:LG1/a$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()LG1/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/a;->d:LG1/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/a;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, LG1/a;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, LG1/a;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public m()LG1/a$d;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/a;->e:LG1/a$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/a;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget v0, p0, LG1/a;->i:I

    .line 2
    .line 3
    return v0
.end method
