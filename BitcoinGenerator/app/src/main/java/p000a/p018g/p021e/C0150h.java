package p000a.p018g.p021e;

/* renamed from: a.g.e.h */
/* loaded from: classes.dex */
class C0150h {

    /* renamed from: a.g.e.h$a */
    /* loaded from: classes.dex */
    class C0151a implements p000a.p018g.p021e.C0150h.AbstractC0153c<p000a.p018g.p026i.C0161b.C0167f> {
        C0151a(p000a.p018g.p021e.C0150h r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public int m3621a(p000a.p018g.p026i.C0161b.C0167f r1) {
                r0 = this;
                int r1 = r1.m3582d()
                return r1
        }

        @Override // p000a.p018g.p021e.C0150h.AbstractC0153c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo3617a(p000a.p018g.p026i.C0161b.C0167f r1) {
                r0 = this;
                a.g.i.b$f r1 = (p000a.p018g.p026i.C0161b.C0167f) r1
                int r1 = r0.m3621a(r1)
                return r1
        }

        /* renamed from: b  reason: avoid collision after fix types in other method */
        public boolean m3620b(p000a.p018g.p026i.C0161b.C0167f r1) {
                r0 = this;
                boolean r1 = r1.m3581e()
                return r1
        }

        @Override // p000a.p018g.p021e.C0150h.AbstractC0153c
        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo3616b(p000a.p018g.p026i.C0161b.C0167f r1) {
                r0 = this;
                a.g.i.b$f r1 = (p000a.p018g.p026i.C0161b.C0167f) r1
                boolean r1 = r0.m3620b(r1)
                return r1
        }
    }

    /* renamed from: a.g.e.h$b */
    /* loaded from: classes.dex */
    class C0152b implements p000a.p018g.p021e.C0150h.AbstractC0153c<p000a.p018g.p019d.p020c.C0128c.C0131c> {
        C0152b(p000a.p018g.p021e.C0150h r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public int m3619a(p000a.p018g.p019d.p020c.C0128c.C0131c r1) {
                r0 = this;
                int r1 = r1.m3699e()
                return r1
        }

        @Override // p000a.p018g.p021e.C0150h.AbstractC0153c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo3617a(p000a.p018g.p019d.p020c.C0128c.C0131c r1) {
                r0 = this;
                a.g.d.c.c$c r1 = (p000a.p018g.p019d.p020c.C0128c.C0131c) r1
                int r1 = r0.m3619a(r1)
                return r1
        }

        /* renamed from: b  reason: avoid collision after fix types in other method */
        public boolean m3618b(p000a.p018g.p019d.p020c.C0128c.C0131c r1) {
                r0 = this;
                boolean r1 = r1.m3698f()
                return r1
        }

        @Override // p000a.p018g.p021e.C0150h.AbstractC0153c
        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo3616b(p000a.p018g.p019d.p020c.C0128c.C0131c r1) {
                r0 = this;
                a.g.d.c.c$c r1 = (p000a.p018g.p019d.p020c.C0128c.C0131c) r1
                boolean r1 = r0.m3618b(r1)
                return r1
        }
    }

    /* renamed from: a.g.e.h$c */
    /* loaded from: classes.dex */
    private interface AbstractC0153c<T> {
        /* renamed from: a */
        int mo3617a(T r1);

        /* renamed from: b */
        boolean mo3616b(T r1);
    }

    C0150h() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    private p000a.p018g.p019d.p020c.C0128c.C0131c m3628a(p000a.p018g.p019d.p020c.C0128c.C0130b r2, int r3) {
            r1 = this;
            a.g.d.c.c$c[] r2 = r2.m3704a()
            a.g.e.h$b r0 = new a.g.e.h$b
            r0.<init>(r1)
            java.lang.Object r2 = m3622a(r2, r3, r0)
            a.g.d.c.c$c r2 = (p000a.p018g.p019d.p020c.C0128c.C0131c) r2
            return r2
    }

    /* renamed from: a */
    private static <T> T m3622a(T[] r10, int r11, p000a.p018g.p021e.C0150h.AbstractC0153c<T> r12) {
            r0 = r11 & 1
            if (r0 != 0) goto L_0x0007
            r0 = 400(0x190, float:5.6E-43)
            goto L_0x0009
        L_0x0007:
            r0 = 700(0x2bc, float:9.81E-43)
        L_0x0009:
            r11 = r11 & 2
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L_0x0011
            r11 = 1
            goto L_0x0012
        L_0x0011:
            r11 = 0
        L_0x0012:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r10.length
            r4 = r3
            r3 = 0
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x001c:
            if (r3 >= r5) goto L_0x003e
            r7 = r10[r3]
            int r8 = r12.mo3617a(r7)
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 * 2
            boolean r9 = r12.mo3616b(r7)
            if (r9 != r11) goto L_0x0033
            r9 = 0
            goto L_0x0034
        L_0x0033:
            r9 = 1
        L_0x0034:
            int r8 = r8 + r9
            if (r4 == 0) goto L_0x0039
            if (r6 <= r8) goto L_0x003b
        L_0x0039:
            r4 = r7
            r6 = r8
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x003e:
            return r4
    }

    /* renamed from: a */
    protected p000a.p018g.p026i.C0161b.C0167f m3623a(p000a.p018g.p026i.C0161b.C0167f[] r2, int r3) {
            r1 = this;
            a.g.e.h$a r0 = new a.g.e.h$a
            r0.<init>(r1)
            java.lang.Object r2 = m3622a(r2, r3, r0)
            a.g.i.b$f r2 = (p000a.p018g.p026i.C0161b.C0167f) r2
            return r2
    }

    /* renamed from: a */
    public android.graphics.Typeface mo3627a(android.content.Context r2, p000a.p018g.p019d.p020c.C0128c.C0130b r3, android.content.res.Resources r4, int r5) {
            r1 = this;
            a.g.d.c.c$c r3 = r1.m3628a(r3, r5)
            if (r3 != 0) goto L_0x0008
            r2 = 0
            return r2
        L_0x0008:
            int r0 = r3.m3702b()
            java.lang.String r3 = r3.m3703a()
            android.graphics.Typeface r2 = p000a.p018g.p021e.C0145c.m3651a(r2, r4, r0, r3, r5)
            return r2
    }

    /* renamed from: a */
    public android.graphics.Typeface mo3626a(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            java.io.File r1 = p000a.p018g.p021e.C0154i.m3615a(r1)
            r4 = 0
            if (r1 != 0) goto L_0x0008
            return r4
        L_0x0008:
            boolean r2 = p000a.p018g.p021e.C0154i.m3610a(r1, r2, r3)     // Catch: all -> 0x001e, RuntimeException -> 0x0023
            if (r2 != 0) goto L_0x0012
            r1.delete()
            return r4
        L_0x0012:
            java.lang.String r2 = r1.getPath()     // Catch: all -> 0x001e, RuntimeException -> 0x0023
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)     // Catch: all -> 0x001e, RuntimeException -> 0x0023
            r1.delete()
            return r2
        L_0x001e:
            r2 = move-exception
            r1.delete()
            throw r2
        L_0x0023:
            r1.delete()
            return r4
    }

    /* renamed from: a */
    public android.graphics.Typeface mo3625a(android.content.Context r3, android.os.CancellationSignal r4, p000a.p018g.p026i.C0161b.C0167f[] r5, int r6) {
            r2 = this;
            int r4 = r5.length
            r0 = 0
            r1 = 1
            if (r4 >= r1) goto L_0x0006
            return r0
        L_0x0006:
            a.g.i.b$f r4 = r2.m3623a(r5, r6)
            android.content.ContentResolver r5 = r3.getContentResolver()     // Catch: all -> 0x0021, IOException -> 0x0026
            android.net.Uri r4 = r4.m3583c()     // Catch: all -> 0x0021, IOException -> 0x0026
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch: all -> 0x0021, IOException -> 0x0026
            android.graphics.Typeface r3 = r2.m3624a(r3, r4)     // Catch: all -> 0x001e, IOException -> 0x0027
            p000a.p018g.p021e.C0154i.m3612a(r4)
            return r3
        L_0x001e:
            r3 = move-exception
            r0 = r4
            goto L_0x0022
        L_0x0021:
            r3 = move-exception
        L_0x0022:
            p000a.p018g.p021e.C0154i.m3612a(r0)
            throw r3
        L_0x0026:
            r4 = r0
        L_0x0027:
            p000a.p018g.p021e.C0154i.m3612a(r4)
            return r0
    }

    /* renamed from: a */
    protected android.graphics.Typeface m3624a(android.content.Context r2, java.io.InputStream r3) {
            r1 = this;
            java.io.File r2 = p000a.p018g.p021e.C0154i.m3615a(r2)
            r0 = 0
            if (r2 != 0) goto L_0x0008
            return r0
        L_0x0008:
            boolean r3 = p000a.p018g.p021e.C0154i.m3609a(r2, r3)     // Catch: all -> 0x001e, RuntimeException -> 0x0023
            if (r3 != 0) goto L_0x0012
            r2.delete()
            return r0
        L_0x0012:
            java.lang.String r3 = r2.getPath()     // Catch: all -> 0x001e, RuntimeException -> 0x0023
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r3)     // Catch: all -> 0x001e, RuntimeException -> 0x0023
            r2.delete()
            return r3
        L_0x001e:
            r3 = move-exception
            r2.delete()
            throw r3
        L_0x0023:
            r2.delete()
            return r0
    }
}
