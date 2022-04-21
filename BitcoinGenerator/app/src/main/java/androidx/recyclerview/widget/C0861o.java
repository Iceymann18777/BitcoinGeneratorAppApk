package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
class C0861o {

    /* renamed from: a */
    final p000a.p013d.C0067a<androidx.recyclerview.widget.C0813j.AbstractC0821d0, androidx.recyclerview.widget.C0861o.C0862a> f3266a;

    /* renamed from: b */
    final p000a.p013d.C0072d<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f3267b;

    /* renamed from: androidx.recyclerview.widget.o$a */
    /* loaded from: classes.dex */
    static class C0862a {

        /* renamed from: d */
        static p000a.p018g.p028k.AbstractC0181d<androidx.recyclerview.widget.C0861o.C0862a> f3268d;

        /* renamed from: a */
        int f3269a;

        /* renamed from: b */
        androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c f3270b;

        /* renamed from: c */
        androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c f3271c;

        static {
                a.g.k.e r0 = new a.g.k.e
                r1 = 20
                r0.<init>(r1)
                androidx.recyclerview.widget.C0861o.C0862a.f3268d = r0
                return
        }

        private C0862a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        static void m521a() {
            L_0x0000:
                a.g.k.d<androidx.recyclerview.widget.o$a> r0 = androidx.recyclerview.widget.C0861o.C0862a.f3268d
                java.lang.Object r0 = r0.mo3559a()
                if (r0 == 0) goto L_0x0009
                goto L_0x0000
            L_0x0009:
                return
        }

        /* renamed from: a */
        static void m520a(androidx.recyclerview.widget.C0861o.C0862a r1) {
                r0 = 0
                r1.f3269a = r0
                r0 = 0
                r1.f3270b = r0
                r1.f3271c = r0
                a.g.k.d<androidx.recyclerview.widget.o$a> r0 = androidx.recyclerview.widget.C0861o.C0862a.f3268d
                r0.mo3558a(r1)
                return
        }

        /* renamed from: b */
        static androidx.recyclerview.widget.C0861o.C0862a m519b() {
                a.g.k.d<androidx.recyclerview.widget.o$a> r0 = androidx.recyclerview.widget.C0861o.C0862a.f3268d
                java.lang.Object r0 = r0.mo3559a()
                androidx.recyclerview.widget.o$a r0 = (androidx.recyclerview.widget.C0861o.C0862a) r0
                if (r0 != 0) goto L_0x000f
                androidx.recyclerview.widget.o$a r0 = new androidx.recyclerview.widget.o$a
                r0.<init>()
            L_0x000f:
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    /* loaded from: classes.dex */
    interface AbstractC0863b {
        /* renamed from: a */
        void mo518a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1);

        /* renamed from: a */
        void mo517a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r2, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r3);

        /* renamed from: b */
        void mo516b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r2, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r3);

        /* renamed from: c */
        void mo515c(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r2, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r3);
    }

    C0861o() {
            r1 = this;
            r1.<init>()
            a.d.a r0 = new a.d.a
            r0.<init>()
            r1.f3266a = r0
            a.d.d r0 = new a.d.d
            r0.<init>()
            r1.f3267b = r0
            return
    }

    /* renamed from: a */
    private androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c m534a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r5, int r6) {
            r4 = this;
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r4.f3266a
            int r5 = r0.m4020a(r5)
            r0 = 0
            if (r5 >= 0) goto L_0x000a
            return r0
        L_0x000a:
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r1 = r4.f3266a
            java.lang.Object r1 = r1.m4013d(r5)
            androidx.recyclerview.widget.o$a r1 = (androidx.recyclerview.widget.C0861o.C0862a) r1
            if (r1 == 0) goto L_0x0042
            int r2 = r1.f3269a
            r3 = r2 & r6
            if (r3 == 0) goto L_0x0042
            r0 = r6 ^ (-1)
            r0 = r0 & r2
            r1.f3269a = r0
            r0 = 4
            if (r6 != r0) goto L_0x0025
            androidx.recyclerview.widget.j$l$c r6 = r1.f3270b
            goto L_0x002b
        L_0x0025:
            r0 = 8
            if (r6 != r0) goto L_0x003a
            androidx.recyclerview.widget.j$l$c r6 = r1.f3271c
        L_0x002b:
            int r0 = r1.f3269a
            r0 = r0 & 12
            if (r0 != 0) goto L_0x0039
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r4.f3266a
            r0.m4014c(r5)
            androidx.recyclerview.widget.C0861o.C0862a.m520a(r1)
        L_0x0039:
            return r6
        L_0x003a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Must provide flag PRE or POST"
            r5.<init>(r6)
            throw r5
        L_0x0042:
            return r0
    }

    /* renamed from: a */
    androidx.recyclerview.widget.C0813j.AbstractC0821d0 m537a(long r2) {
            r1 = this;
            a.d.d<androidx.recyclerview.widget.j$d0> r0 = r1.f3267b
            java.lang.Object r2 = r0.m4056b(r2)
            androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
            return r2
    }

    /* renamed from: a */
    void m538a() {
            r1 = this;
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r1.f3266a
            r0.clear()
            a.d.d<androidx.recyclerview.widget.j$d0> r0 = r1.f3267b
            r0.m4062a()
            return
    }

    /* renamed from: a */
    void m536a(long r2, androidx.recyclerview.widget.C0813j.AbstractC0821d0 r4) {
            r1 = this;
            a.d.d<androidx.recyclerview.widget.j$d0> r0 = r1.f3267b
            r0.m4051c(r2, r4)
            return
    }

    /* renamed from: a */
    void m535a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
            r2 = this;
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r2.f3266a
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.o$a r0 = (androidx.recyclerview.widget.C0861o.C0862a) r0
            if (r0 != 0) goto L_0x0013
            androidx.recyclerview.widget.o$a r0 = androidx.recyclerview.widget.C0861o.C0862a.m519b()
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r1 = r2.f3266a
            r1.put(r3, r0)
        L_0x0013:
            int r3 = r0.f3269a
            r3 = r3 | 1
            r0.f3269a = r3
            return
    }

    /* renamed from: a */
    void m533a(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r4) {
            r2 = this;
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r2.f3266a
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.o$a r0 = (androidx.recyclerview.widget.C0861o.C0862a) r0
            if (r0 != 0) goto L_0x0013
            androidx.recyclerview.widget.o$a r0 = androidx.recyclerview.widget.C0861o.C0862a.m519b()
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r1 = r2.f3266a
            r1.put(r3, r0)
        L_0x0013:
            int r3 = r0.f3269a
            r3 = r3 | 2
            r0.f3269a = r3
            r0.f3270b = r4
            return
    }

    /* renamed from: a */
    void m532a(androidx.recyclerview.widget.C0861o.AbstractC0863b r7) {
            r6 = this;
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r6.f3266a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L_0x0008:
            if (r0 < 0) goto L_0x0063
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r1 = r6.f3266a
            java.lang.Object r1 = r1.m4016b(r0)
            androidx.recyclerview.widget.j$d0 r1 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r1
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r2 = r6.f3266a
            java.lang.Object r2 = r2.m4014c(r0)
            androidx.recyclerview.widget.o$a r2 = (androidx.recyclerview.widget.C0861o.C0862a) r2
            int r3 = r2.f3269a
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L_0x0025
        L_0x0021:
            r7.mo518a(r1)
            goto L_0x005d
        L_0x0025:
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0034
            androidx.recyclerview.widget.j$l$c r3 = r2.f3270b
            if (r3 != 0) goto L_0x002e
            goto L_0x0021
        L_0x002e:
            androidx.recyclerview.widget.j$l$c r4 = r2.f3271c
        L_0x0030:
            r7.mo517a(r1, r3, r4)
            goto L_0x005d
        L_0x0034:
            r4 = r3 & 14
            r5 = 14
            if (r4 != r5) goto L_0x0042
        L_0x003a:
            androidx.recyclerview.widget.j$l$c r3 = r2.f3270b
            androidx.recyclerview.widget.j$l$c r4 = r2.f3271c
            r7.mo515c(r1, r3, r4)
            goto L_0x005d
        L_0x0042:
            r4 = r3 & 12
            r5 = 12
            if (r4 != r5) goto L_0x0050
            androidx.recyclerview.widget.j$l$c r3 = r2.f3270b
            androidx.recyclerview.widget.j$l$c r4 = r2.f3271c
            r7.mo516b(r1, r3, r4)
            goto L_0x005d
        L_0x0050:
            r4 = r3 & 4
            if (r4 == 0) goto L_0x0058
            androidx.recyclerview.widget.j$l$c r3 = r2.f3270b
            r4 = 0
            goto L_0x0030
        L_0x0058:
            r3 = r3 & 8
            if (r3 == 0) goto L_0x005d
            goto L_0x003a
        L_0x005d:
            androidx.recyclerview.widget.C0861o.C0862a.m520a(r2)
            int r0 = r0 + (-1)
            goto L_0x0008
        L_0x0063:
            return
    }

    /* renamed from: b */
    void m531b() {
            r0 = this;
            androidx.recyclerview.widget.C0861o.C0862a.m521a()
            return
    }

    /* renamed from: b */
    void m529b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r4) {
            r2 = this;
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r2.f3266a
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.o$a r0 = (androidx.recyclerview.widget.C0861o.C0862a) r0
            if (r0 != 0) goto L_0x0013
            androidx.recyclerview.widget.o$a r0 = androidx.recyclerview.widget.C0861o.C0862a.m519b()
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r1 = r2.f3266a
            r1.put(r3, r0)
        L_0x0013:
            r0.f3271c = r4
            int r3 = r0.f3269a
            r3 = r3 | 8
            r0.f3269a = r3
            return
    }

    /* renamed from: b */
    boolean m530b(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
            r1 = this;
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r1.f3266a
            java.lang.Object r2 = r0.get(r2)
            androidx.recyclerview.widget.o$a r2 = (androidx.recyclerview.widget.C0861o.C0862a) r2
            r0 = 1
            if (r2 == 0) goto L_0x0011
            int r2 = r2.f3269a
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
    }

    /* renamed from: c */
    void m527c(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3, androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c r4) {
            r2 = this;
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r2.f3266a
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.o$a r0 = (androidx.recyclerview.widget.C0861o.C0862a) r0
            if (r0 != 0) goto L_0x0013
            androidx.recyclerview.widget.o$a r0 = androidx.recyclerview.widget.C0861o.C0862a.m519b()
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r1 = r2.f3266a
            r1.put(r3, r0)
        L_0x0013:
            r0.f3270b = r4
            int r3 = r0.f3269a
            r3 = r3 | 4
            r0.f3269a = r3
            return
    }

    /* renamed from: c */
    boolean m528c(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
            r1 = this;
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r1.f3266a
            java.lang.Object r2 = r0.get(r2)
            androidx.recyclerview.widget.o$a r2 = (androidx.recyclerview.widget.C0861o.C0862a) r2
            if (r2 == 0) goto L_0x0012
            int r2 = r2.f3269a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            return r2
    }

    /* renamed from: d */
    public void m526d(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r1) {
            r0 = this;
            r0.m523g(r1)
            return
    }

    /* renamed from: e */
    androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c m525e(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
            r1 = this;
            r0 = 8
            androidx.recyclerview.widget.j$l$c r2 = r1.m534a(r2, r0)
            return r2
    }

    /* renamed from: f */
    androidx.recyclerview.widget.C0813j.AbstractC0829l.C0832c m524f(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
            r1 = this;
            r0 = 4
            androidx.recyclerview.widget.j$l$c r2 = r1.m534a(r2, r0)
            return r2
    }

    /* renamed from: g */
    void m523g(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r2) {
            r1 = this;
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r1.f3266a
            java.lang.Object r2 = r0.get(r2)
            androidx.recyclerview.widget.o$a r2 = (androidx.recyclerview.widget.C0861o.C0862a) r2
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            int r0 = r2.f3269a
            r0 = r0 & (-2)
            r2.f3269a = r0
            return
    }

    /* renamed from: h */
    void m522h(androidx.recyclerview.widget.C0813j.AbstractC0821d0 r3) {
            r2 = this;
            a.d.d<androidx.recyclerview.widget.j$d0> r0 = r2.f3267b
            int r0 = r0.m4058b()
            int r0 = r0 + (-1)
        L_0x0008:
            if (r0 < 0) goto L_0x001b
            a.d.d<androidx.recyclerview.widget.j$d0> r1 = r2.f3267b
            java.lang.Object r1 = r1.m4053c(r0)
            if (r3 != r1) goto L_0x0018
            a.d.d<androidx.recyclerview.widget.j$d0> r1 = r2.f3267b
            r1.m4057b(r0)
            goto L_0x001b
        L_0x0018:
            int r0 = r0 + (-1)
            goto L_0x0008
        L_0x001b:
            a.d.a<androidx.recyclerview.widget.j$d0, androidx.recyclerview.widget.o$a> r0 = r2.f3266a
            java.lang.Object r3 = r0.remove(r3)
            androidx.recyclerview.widget.o$a r3 = (androidx.recyclerview.widget.C0861o.C0862a) r3
            if (r3 == 0) goto L_0x0028
            androidx.recyclerview.widget.C0861o.C0862a.m520a(r3)
        L_0x0028:
            return
    }
}
