.class public interface abstract annotation Lw1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lw1/d;
        intEncoding = .enum Lw1/d$a;->d:Lw1/d$a;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw1/d$a;
    }
.end annotation


# virtual methods
.method public abstract intEncoding()Lw1/d$a;
.end method

.method public abstract tag()I
.end method
