.class public final synthetic Lm0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lm0/e;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lm0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/b;->a:Ljava/util/List;

    iput-object p2, p0, Lm0/b;->b:Lm0/e;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lm0/b;->a:Ljava/util/List;

    iget-object v1, p0, Lm0/b;->b:Lm0/e;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, Lm0/e;->d(Ljava/util/List;Lm0/e;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method
