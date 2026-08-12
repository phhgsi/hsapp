.class public abstract Lh2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lh2/y;

.field public static final b:Lh2/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh2/y;

    .line 2
    .line 3
    const-string v1, "UNDEFINED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lh2/y;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lh2/i;->a:Lh2/y;

    .line 9
    .line 10
    new-instance v0, Lh2/y;

    .line 11
    .line 12
    const-string v1, "REUSABLE_CLAIMED"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lh2/y;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lh2/i;->b:Lh2/y;

    .line 18
    .line 19
    return-void
.end method

.method public static final synthetic a()Lh2/y;
    .locals 1

    .line 1
    sget-object v0, Lh2/i;->a:Lh2/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b(LN1/e;Ljava/lang/Object;LW1/l;)V
    .locals 6

    .line 1
    instance-of v0, p0, Lh2/h;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    check-cast p0, Lh2/h;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lf2/u;->b(Ljava/lang/Object;LW1/l;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-object v0, p0, Lh2/h;->g:Lf2/w;

    .line 12
    .line 13
    invoke-virtual {p0}, Lh2/h;->c()LN1/i;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lf2/w;->E(LN1/i;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iput-object p2, p0, Lh2/h;->i:Ljava/lang/Object;

    .line 25
    .line 26
    iput v1, p0, Lf2/K;->f:I

    .line 27
    .line 28
    iget-object p1, p0, Lh2/h;->g:Lf2/w;

    .line 29
    .line 30
    invoke-virtual {p0}, Lh2/h;->c()LN1/i;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1, p2, p0}, Lf2/w;->D(LN1/i;Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_0
    sget-object v0, Lf2/x0;->a:Lf2/x0;

    .line 40
    .line 41
    invoke-virtual {v0}, Lf2/x0;->a()Lf2/P;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lf2/P;->M()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    iput-object p2, p0, Lh2/h;->i:Ljava/lang/Object;

    .line 52
    .line 53
    iput v1, p0, Lf2/K;->f:I

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Lf2/P;->I(Lf2/K;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_1
    invoke-virtual {v0, v1}, Lf2/P;->K(Z)V

    .line 61
    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    :try_start_0
    invoke-virtual {p0}, Lh2/h;->c()LN1/i;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    sget-object v4, Lf2/f0;->c:Lf2/f0$b;

    .line 69
    .line 70
    invoke-interface {v3, v4}, LN1/i;->b(LN1/i$c;)LN1/i$b;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Lf2/f0;

    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    invoke-interface {v3}, Lf2/f0;->a()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    invoke-interface {v3}, Lf2/f0;->v()Ljava/util/concurrent/CancellationException;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p0, p2, p1}, Lh2/h;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    sget-object p2, LL1/m;->d:LL1/m$a;

    .line 92
    .line 93
    invoke-static {p1}, LL1/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, LL1/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-interface {p0, p1}, LN1/e;->j(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catchall_0
    move-exception p1

    .line 106
    goto :goto_3

    .line 107
    :cond_2
    iget-object p2, p0, Lh2/h;->h:LN1/e;

    .line 108
    .line 109
    iget-object v3, p0, Lh2/h;->j:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-interface {p2}, LN1/e;->c()LN1/i;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-static {v4, v3}, Lh2/C;->c(LN1/i;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    sget-object v5, Lh2/C;->a:Lh2/y;

    .line 120
    .line 121
    if-eq v3, v5, :cond_3

    .line 122
    .line 123
    invoke-static {p2, v4, v3}, Lf2/v;->g(LN1/e;LN1/i;Ljava/lang/Object;)Lf2/z0;

    .line 124
    .line 125
    .line 126
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    goto :goto_0

    .line 128
    :cond_3
    move-object p2, v2

    .line 129
    :goto_0
    :try_start_1
    iget-object v5, p0, Lh2/h;->h:LN1/e;

    .line 130
    .line 131
    invoke-interface {v5, p1}, LN1/e;->j(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object p1, LL1/t;->a:LL1/t;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 135
    .line 136
    if-eqz p2, :cond_4

    .line 137
    .line 138
    :try_start_2
    invoke-virtual {p2}, Lf2/z0;->E0()Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-eqz p1, :cond_5

    .line 143
    .line 144
    :cond_4
    invoke-static {v4, v3}, Lh2/C;->a(LN1/i;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_5
    :goto_1
    invoke-virtual {v0}, Lf2/P;->O()Z

    .line 148
    .line 149
    .line 150
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 151
    if-nez p1, :cond_5

    .line 152
    .line 153
    :goto_2
    invoke-virtual {v0, v1}, Lf2/P;->G(Z)V

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :catchall_1
    move-exception p1

    .line 158
    if-eqz p2, :cond_6

    .line 159
    .line 160
    :try_start_3
    invoke-virtual {p2}, Lf2/z0;->E0()Z

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    if-eqz p2, :cond_7

    .line 165
    .line 166
    :cond_6
    invoke-static {v4, v3}, Lh2/C;->a(LN1/i;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_7
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 170
    :goto_3
    :try_start_4
    invoke-virtual {p0, p1, v2}, Lf2/K;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :goto_4
    return-void

    .line 175
    :catchall_2
    move-exception p0

    .line 176
    invoke-virtual {v0, v1}, Lf2/P;->G(Z)V

    .line 177
    .line 178
    .line 179
    throw p0

    .line 180
    :cond_8
    invoke-interface {p0, p1}, LN1/e;->j(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public static synthetic c(LN1/e;Ljava/lang/Object;LW1/l;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2}, Lh2/i;->b(LN1/e;Ljava/lang/Object;LW1/l;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
