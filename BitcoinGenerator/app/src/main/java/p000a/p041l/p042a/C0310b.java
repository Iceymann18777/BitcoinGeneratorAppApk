package p000a.p041l.p042a;

/* renamed from: a.l.a.b */
/* loaded from: classes.dex */
class C0310b extends p000a.p041l.p042a.AbstractC0309a {

    /* renamed from: c */
    static boolean f1003c = false;

    /* renamed from: a */
    private final androidx.lifecycle.AbstractC0746g f1004a;

    /* renamed from: b */
    private final p000a.p041l.p042a.C0310b.C0313c f1005b;

    /* renamed from: a.l.a.b$a */
    /* loaded from: classes.dex */
    public static class C0311a<D> extends androidx.lifecycle.C0753l<D> implements p000a.p041l.p043b.C0315a.AbstractC0316a<D> {

        /* renamed from: j */
        private final int f1006j;

        /* renamed from: k */
        private final android.os.Bundle f1007k;

        /* renamed from: l */
        private final p000a.p041l.p043b.C0315a<D> f1008l;

        /* renamed from: m */
        private androidx.lifecycle.AbstractC0746g f1009m;

        /* renamed from: n */
        private p000a.p041l.p042a.C0310b.C0312b<D> f1010n;

        /* renamed from: o */
        private p000a.p041l.p043b.C0315a<D> f1011o;

        /* renamed from: a */
        p000a.p041l.p043b.C0315a<D> m2945a(boolean r2) {
                r1 = this;
                boolean r2 = p000a.p041l.p042a.C0310b.f1003c
                if (r2 == 0) goto L_0x001a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "  Destroying: "
                r2.append(r0)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "LoaderManager"
                android.util.Log.v(r0, r2)
            L_0x001a:
                a.l.b.a<D> r2 = r1.f1008l
                r2.m2940a()
                r2 = 0
                throw r2
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: a */
        protected void mo1414a() {
                r2 = this;
                boolean r0 = p000a.p041l.p042a.C0310b.f1003c
                if (r0 == 0) goto L_0x001a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Starting: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L_0x001a:
                a.l.b.a<D> r0 = r2.f1008l
                r0.m2937c()
                r0 = 0
                throw r0
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: a */
        public void mo1411a(androidx.lifecycle.AbstractC0754m<? super D> r1) {
                r0 = this;
                super.mo1411a(r1)
                r1 = 0
                r0.f1009m = r1
                r0.f1010n = r1
                return
        }

        @Override // androidx.lifecycle.C0753l, androidx.lifecycle.LiveData
        /* renamed from: a */
        public void mo1360a(D r1) {
                r0 = this;
                super.mo1360a(r1)
                a.l.b.a<D> r1 = r0.f1011o
                if (r1 != 0) goto L_0x0008
                return
            L_0x0008:
                r1.m2938b()
                r1 = 0
                throw r1
        }

        /* renamed from: a */
        public void m2946a(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
                r2 = this;
                r5.print(r3)
                java.lang.String r0 = "mId="
                r5.print(r0)
                int r0 = r2.f1006j
                r5.print(r0)
                java.lang.String r0 = " mArgs="
                r5.print(r0)
                android.os.Bundle r0 = r2.f1007k
                r5.println(r0)
                r5.print(r3)
                java.lang.String r0 = "mLoader="
                r5.print(r0)
                a.l.b.a<D> r0 = r2.f1008l
                r5.println(r0)
                a.l.b.a<D> r0 = r2.f1008l
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = "  "
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.m2939a(r3, r4, r5, r6)
                r3 = 0
                throw r3
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: b */
        protected void mo1409b() {
                r2 = this;
                boolean r0 = p000a.p041l.p042a.C0310b.f1003c
                if (r0 == 0) goto L_0x001a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "  Stopping: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LoaderManager"
                android.util.Log.v(r1, r0)
            L_0x001a:
                a.l.b.a<D> r0 = r2.f1008l
                r0.m2936d()
                r0 = 0
                throw r0
        }

        /* renamed from: c */
        void m2944c() {
                r2 = this;
                androidx.lifecycle.g r0 = r2.f1009m
                a.l.a.b$b<D> r1 = r2.f1010n
                if (r0 == 0) goto L_0x000e
                if (r1 == 0) goto L_0x000e
                super.mo1411a(r1)
                r2.m1412a(r0, r1)
            L_0x000e:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 64
                r0.<init>(r1)
                java.lang.String r1 = "LoaderInfo{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " #"
                r0.append(r1)
                int r1 = r2.f1006j
                r0.append(r1)
                java.lang.String r1 = " : "
                r0.append(r1)
                a.l.b.a<D> r1 = r2.f1008l
                p000a.p018g.p028k.C0178a.m3564a(r1, r0)
                java.lang.String r1 = "}}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: a.l.a.b$b */
    /* loaded from: classes.dex */
    static class C0312b<D> implements androidx.lifecycle.AbstractC0754m<D> {
    }

    /* renamed from: a.l.a.b$c */
    /* loaded from: classes.dex */
    static class C0313c extends androidx.lifecycle.AbstractC0758p {

        /* renamed from: b */
        private static final androidx.lifecycle.C0759q.AbstractC0760a f1012b = null;

        /* renamed from: a */
        private p000a.p013d.C0081h<p000a.p041l.p042a.C0310b.C0311a> f1013a;

        /* renamed from: a.l.a.b$c$a */
        /* loaded from: classes.dex */
        static class C0314a implements androidx.lifecycle.C0759q.AbstractC0760a {
            C0314a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // androidx.lifecycle.C0759q.AbstractC0760a
            /* renamed from: a */
            public <T extends androidx.lifecycle.AbstractC0758p> T mo1347a(java.lang.Class<T> r1) {
                    r0 = this;
                    a.l.a.b$c r1 = new a.l.a.b$c
                    r1.<init>()
                    return r1
            }
        }

        static {
                a.l.a.b$c$a r0 = new a.l.a.b$c$a
                r0.<init>()
                p000a.p041l.p042a.C0310b.C0313c.f1012b = r0
                return
        }

        C0313c() {
                r1 = this;
                r1.<init>()
                a.d.h r0 = new a.d.h
                r0.<init>()
                r1.f1013a = r0
                return
        }

        /* renamed from: a */
        static p000a.p041l.p042a.C0310b.C0313c m2943a(androidx.lifecycle.C0761r r2) {
                androidx.lifecycle.q r0 = new androidx.lifecycle.q
                androidx.lifecycle.q$a r1 = p000a.p041l.p042a.C0310b.C0313c.f1012b
                r0.<init>(r2, r1)
                java.lang.Class<a.l.a.b$c> r2 = p000a.p041l.p042a.C0310b.C0313c.class
                androidx.lifecycle.p r2 = r0.m1349a(r2)
                a.l.a.b$c r2 = (p000a.p041l.p042a.C0310b.C0313c) r2
                return r2
        }

        @Override // androidx.lifecycle.AbstractC0758p
        /* renamed from: a */
        protected void mo1350a() {
                r2 = this;
                super.mo1350a()
                a.d.h<a.l.a.b$a> r0 = r2.f1013a
                int r0 = r0.m4008b()
                if (r0 > 0) goto L_0x0011
                a.d.h<a.l.a.b$a> r0 = r2.f1013a
                r0.m4011a()
                return
            L_0x0011:
                a.d.h<a.l.a.b$a> r0 = r2.f1013a
                r1 = 0
                java.lang.Object r0 = r0.m4000f(r1)
                a.l.a.b$a r0 = (p000a.p041l.p042a.C0310b.C0311a) r0
                r1 = 1
                r0.m2945a(r1)
                r0 = 0
                throw r0
        }

        /* renamed from: a */
        public void m2942a(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
                r3 = this;
                a.d.h<a.l.a.b$a> r0 = r3.f1013a
                int r0 = r0.m4008b()
                if (r0 <= 0) goto L_0x0055
                r6.print(r4)
                java.lang.String r0 = "Loaders:"
                r6.println(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                java.lang.String r1 = "    "
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                a.d.h<a.l.a.b$a> r2 = r3.f1013a
                int r2 = r2.m4008b()
                if (r2 > 0) goto L_0x002b
                goto L_0x0055
            L_0x002b:
                a.d.h<a.l.a.b$a> r2 = r3.f1013a
                java.lang.Object r2 = r2.m4000f(r1)
                a.l.a.b$a r2 = (p000a.p041l.p042a.C0310b.C0311a) r2
                r6.print(r4)
                java.lang.String r4 = "  #"
                r6.print(r4)
                a.d.h<a.l.a.b$a> r4 = r3.f1013a
                int r4 = r4.m4002d(r1)
                r6.print(r4)
                java.lang.String r4 = ": "
                r6.print(r4)
                java.lang.String r4 = r2.toString()
                r6.println(r4)
                r2.m2946a(r0, r5, r6, r7)
                r4 = 0
                throw r4
            L_0x0055:
                return
        }

        /* renamed from: b */
        void m2941b() {
                r3 = this;
                a.d.h<a.l.a.b$a> r0 = r3.f1013a
                int r0 = r0.m4008b()
                r1 = 0
            L_0x0007:
                if (r1 >= r0) goto L_0x0017
                a.d.h<a.l.a.b$a> r2 = r3.f1013a
                java.lang.Object r2 = r2.m4000f(r1)
                a.l.a.b$a r2 = (p000a.p041l.p042a.C0310b.C0311a) r2
                r2.m2944c()
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0017:
                return
        }
    }

    C0310b(androidx.lifecycle.AbstractC0746g r1, androidx.lifecycle.C0761r r2) {
            r0 = this;
            r0.<init>()
            r0.f1004a = r1
            a.l.a.b$c r1 = p000a.p041l.p042a.C0310b.C0313c.m2943a(r2)
            r0.f1005b = r1
            return
    }

    @Override // p000a.p041l.p042a.AbstractC0309a
    /* renamed from: a */
    public void mo2948a() {
            r1 = this;
            a.l.a.b$c r0 = r1.f1005b
            r0.m2941b()
            return
    }

    @Override // p000a.p041l.p042a.AbstractC0309a
    @java.lang.Deprecated
    /* renamed from: a */
    public void mo2947a(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
            r1 = this;
            a.l.a.b$c r0 = r1.f1005b
            r0.m2942a(r2, r3, r4, r5)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            java.lang.String r1 = "LoaderManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.lifecycle.g r1 = r2.f1004a
            p000a.p018g.p028k.C0178a.m3564a(r1, r0)
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
