.class public final synthetic Lz0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lz0/c;

.field public final synthetic e:Lt0/o;

.field public final synthetic f:Lr0/j;

.field public final synthetic g:Lt0/i;


# direct methods
.method public synthetic constructor <init>(Lz0/c;Lt0/o;Lr0/j;Lt0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz0/a;->d:Lz0/c;

    iput-object p2, p0, Lz0/a;->e:Lt0/o;

    iput-object p3, p0, Lz0/a;->f:Lr0/j;

    iput-object p4, p0, Lz0/a;->g:Lt0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lz0/a;->d:Lz0/c;

    iget-object v1, p0, Lz0/a;->e:Lt0/o;

    iget-object v2, p0, Lz0/a;->f:Lr0/j;

    iget-object v3, p0, Lz0/a;->g:Lt0/i;

    invoke-static {v0, v1, v2, v3}, Lz0/c;->c(Lz0/c;Lt0/o;Lr0/j;Lt0/i;)V

    return-void
.end method
