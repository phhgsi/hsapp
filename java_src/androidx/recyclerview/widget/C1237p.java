package androidx.recyclerview.widget;

import androidx.collection.C0926f;
import androidx.collection.C0929i;
import androidx.recyclerview.widget.RecyclerView;
import p024I.C0209f;
import p024I.InterfaceC0208e;

/* JADX INFO: renamed from: androidx.recyclerview.widget.p */
/* JADX INFO: loaded from: classes.dex */
class C1237p {

    /* JADX INFO: renamed from: a */
    final C0929i f6034a = new C0929i();

    /* JADX INFO: renamed from: b */
    final C0926f f6035b = new C0926f();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$a */
    static class a {

        /* JADX INFO: renamed from: d */
        static InterfaceC0208e f6036d = new C0209f(20);

        /* JADX INFO: renamed from: a */
        int f6037a;

        /* JADX INFO: renamed from: b */
        RecyclerView.AbstractC1202m.b f6038b;

        /* JADX INFO: renamed from: c */
        RecyclerView.AbstractC1202m.b f6039c;

        private a() {
        }

        /* JADX INFO: renamed from: a */
        static void m6283a() {
            while (f6036d.mo602b() != null) {
            }
        }

        /* JADX INFO: renamed from: b */
        static a m6284b() {
            a aVar = (a) f6036d.mo602b();
            return aVar == null ? new a() : aVar;
        }

        /* JADX INFO: renamed from: c */
        static void m6285c(a aVar) {
            aVar.f6037a = 0;
            aVar.f6038b = null;
            aVar.f6039c = null;
            f6036d.mo601a(aVar);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$b */
    interface b {
        /* JADX INFO: renamed from: a */
        void mo5688a(RecyclerView.AbstractC1188C abstractC1188C);

        /* JADX INFO: renamed from: b */
        void mo5689b(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1202m.b bVar, RecyclerView.AbstractC1202m.b bVar2);

        /* JADX INFO: renamed from: c */
        void mo5690c(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1202m.b bVar, RecyclerView.AbstractC1202m.b bVar2);

        /* JADX INFO: renamed from: d */
        void mo5691d(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1202m.b bVar, RecyclerView.AbstractC1202m.b bVar2);
    }

    C1237p() {
    }

    /* JADX INFO: renamed from: l */
    private RecyclerView.AbstractC1202m.b m6266l(RecyclerView.AbstractC1188C abstractC1188C, int i3) {
        a aVar;
        RecyclerView.AbstractC1202m.b bVar;
        int iM3943d = this.f6034a.m3943d(abstractC1188C);
        if (iM3943d >= 0 && (aVar = (a) this.f6034a.m3948j(iM3943d)) != null) {
            int i4 = aVar.f6037a;
            if ((i4 & i3) != 0) {
                int i5 = (~i3) & i4;
                aVar.f6037a = i5;
                if (i3 == 4) {
                    bVar = aVar.f6038b;
                } else {
                    if (i3 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f6039c;
                }
                if ((i5 & 12) == 0) {
                    this.f6034a.m3946h(iM3943d);
                    a.m6285c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    void m6267a(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1202m.b bVar) {
        a aVarM6284b = (a) this.f6034a.get(abstractC1188C);
        if (aVarM6284b == null) {
            aVarM6284b = a.m6284b();
            this.f6034a.put(abstractC1188C, aVarM6284b);
        }
        aVarM6284b.f6037a |= 2;
        aVarM6284b.f6038b = bVar;
    }

    /* JADX INFO: renamed from: b */
    void m6268b(RecyclerView.AbstractC1188C abstractC1188C) {
        a aVarM6284b = (a) this.f6034a.get(abstractC1188C);
        if (aVarM6284b == null) {
            aVarM6284b = a.m6284b();
            this.f6034a.put(abstractC1188C, aVarM6284b);
        }
        aVarM6284b.f6037a |= 1;
    }

    /* JADX INFO: renamed from: c */
    void m6269c(long j3, RecyclerView.AbstractC1188C abstractC1188C) {
        this.f6035b.m3932h(j3, abstractC1188C);
    }

    /* JADX INFO: renamed from: d */
    void m6270d(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1202m.b bVar) {
        a aVarM6284b = (a) this.f6034a.get(abstractC1188C);
        if (aVarM6284b == null) {
            aVarM6284b = a.m6284b();
            this.f6034a.put(abstractC1188C, aVarM6284b);
        }
        aVarM6284b.f6039c = bVar;
        aVarM6284b.f6037a |= 8;
    }

    /* JADX INFO: renamed from: e */
    void m6271e(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1202m.b bVar) {
        a aVarM6284b = (a) this.f6034a.get(abstractC1188C);
        if (aVarM6284b == null) {
            aVarM6284b = a.m6284b();
            this.f6034a.put(abstractC1188C, aVarM6284b);
        }
        aVarM6284b.f6038b = bVar;
        aVarM6284b.f6037a |= 4;
    }

    /* JADX INFO: renamed from: f */
    void m6272f() {
        this.f6034a.clear();
        this.f6035b.m3926b();
    }

    /* JADX INFO: renamed from: g */
    RecyclerView.AbstractC1188C m6273g(long j3) {
        return (RecyclerView.AbstractC1188C) this.f6035b.m3928d(j3);
    }

    /* JADX INFO: renamed from: h */
    boolean m6274h(RecyclerView.AbstractC1188C abstractC1188C) {
        a aVar = (a) this.f6034a.get(abstractC1188C);
        return (aVar == null || (aVar.f6037a & 1) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    boolean m6275i(RecyclerView.AbstractC1188C abstractC1188C) {
        a aVar = (a) this.f6034a.get(abstractC1188C);
        return (aVar == null || (aVar.f6037a & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    void m6276j() {
        a.m6283a();
    }

    /* JADX INFO: renamed from: k */
    public void m6277k(RecyclerView.AbstractC1188C abstractC1188C) {
        m6281p(abstractC1188C);
    }

    /* JADX INFO: renamed from: m */
    RecyclerView.AbstractC1202m.b m6278m(RecyclerView.AbstractC1188C abstractC1188C) {
        return m6266l(abstractC1188C, 8);
    }

    /* JADX INFO: renamed from: n */
    RecyclerView.AbstractC1202m.b m6279n(RecyclerView.AbstractC1188C abstractC1188C) {
        return m6266l(abstractC1188C, 4);
    }

    /* JADX INFO: renamed from: o */
    void m6280o(b bVar) {
        for (int size = this.f6034a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC1188C abstractC1188C = (RecyclerView.AbstractC1188C) this.f6034a.m3944f(size);
            a aVar = (a) this.f6034a.m3946h(size);
            int i3 = aVar.f6037a;
            if ((i3 & 3) == 3) {
                bVar.mo5688a(abstractC1188C);
            } else if ((i3 & 1) != 0) {
                RecyclerView.AbstractC1202m.b bVar2 = aVar.f6038b;
                if (bVar2 == null) {
                    bVar.mo5688a(abstractC1188C);
                } else {
                    bVar.mo5690c(abstractC1188C, bVar2, aVar.f6039c);
                }
            } else if ((i3 & 14) == 14) {
                bVar.mo5689b(abstractC1188C, aVar.f6038b, aVar.f6039c);
            } else if ((i3 & 12) == 12) {
                bVar.mo5691d(abstractC1188C, aVar.f6038b, aVar.f6039c);
            } else if ((i3 & 4) != 0) {
                bVar.mo5690c(abstractC1188C, aVar.f6038b, null);
            } else if ((i3 & 8) != 0) {
                bVar.mo5689b(abstractC1188C, aVar.f6038b, aVar.f6039c);
            }
            a.m6285c(aVar);
        }
    }

    /* JADX INFO: renamed from: p */
    void m6281p(RecyclerView.AbstractC1188C abstractC1188C) {
        a aVar = (a) this.f6034a.get(abstractC1188C);
        if (aVar == null) {
            return;
        }
        aVar.f6037a &= -2;
    }

    /* JADX INFO: renamed from: q */
    void m6282q(RecyclerView.AbstractC1188C abstractC1188C) {
        int iM3935k = this.f6035b.m3935k() - 1;
        while (true) {
            if (iM3935k < 0) {
                break;
            }
            if (abstractC1188C == this.f6035b.m3936l(iM3935k)) {
                this.f6035b.m3934j(iM3935k);
                break;
            }
            iM3935k--;
        }
        a aVar = (a) this.f6034a.remove(abstractC1188C);
        if (aVar != null) {
            a.m6285c(aVar);
        }
    }
}
