package p000a.p014e.p015a.p016j;

/* renamed from: a.e.a.j.p */
/* loaded from: classes.dex */
public class C0115p {

    /* renamed from: a */
    private int f524a;

    /* renamed from: b */
    private int f525b;

    /* renamed from: c */
    private int f526c;

    /* renamed from: d */
    private int f527d;

    /* renamed from: e */
    private java.util.ArrayList<p000a.p014e.p015a.p016j.C0115p.C0116a> f528e;

    /* renamed from: a.e.a.j.p$a */
    /* loaded from: classes.dex */
    static class C0116a {

        /* renamed from: a */
        private p000a.p014e.p015a.p016j.C0097e f529a;

        /* renamed from: b */
        private p000a.p014e.p015a.p016j.C0097e f530b;

        /* renamed from: c */
        private int f531c;

        /* renamed from: d */
        private p000a.p014e.p015a.p016j.C0097e.EnumC0100c f532d;

        /* renamed from: e */
        private int f533e;

        public C0116a(p000a.p014e.p015a.p016j.C0097e r2) {
                r1 = this;
                r1.<init>()
                r1.f529a = r2
                a.e.a.j.e r0 = r2.m3890g()
                r1.f530b = r0
                int r0 = r2.m3895b()
                r1.f531c = r0
                a.e.a.j.e$c r0 = r2.m3891f()
                r1.f532d = r0
                int r2 = r2.m3900a()
                r1.f533e = r2
                return
        }

        /* renamed from: a */
        public void m3745a(p000a.p014e.p015a.p016j.C0102f r5) {
                r4 = this;
                a.e.a.j.e r0 = r4.f529a
                a.e.a.j.e$d r0 = r0.m3889h()
                a.e.a.j.e r5 = r5.mo3780a(r0)
                a.e.a.j.e r0 = r4.f530b
                int r1 = r4.f531c
                a.e.a.j.e$c r2 = r4.f532d
                int r3 = r4.f533e
                r5.m3896a(r0, r1, r2, r3)
                return
        }

        /* renamed from: b */
        public void m3744b(p000a.p014e.p015a.p016j.C0102f r2) {
                r1 = this;
                a.e.a.j.e r0 = r1.f529a
                a.e.a.j.e$d r0 = r0.m3889h()
                a.e.a.j.e r2 = r2.mo3780a(r0)
                r1.f529a = r2
                a.e.a.j.e r2 = r1.f529a
                if (r2 == 0) goto L_0x002d
                a.e.a.j.e r2 = r2.m3890g()
                r1.f530b = r2
                a.e.a.j.e r2 = r1.f529a
                int r2 = r2.m3895b()
                r1.f531c = r2
                a.e.a.j.e r2 = r1.f529a
                a.e.a.j.e$c r2 = r2.m3891f()
                r1.f532d = r2
                a.e.a.j.e r2 = r1.f529a
                int r2 = r2.m3900a()
                goto L_0x0037
            L_0x002d:
                r2 = 0
                r1.f530b = r2
                r2 = 0
                r1.f531c = r2
                a.e.a.j.e$c r0 = p000a.p014e.p015a.p016j.C0097e.EnumC0100c.f386c
                r1.f532d = r0
            L_0x0037:
                r1.f533e = r2
                return
        }
    }

    public C0115p(p000a.p014e.p015a.p016j.C0102f r6) {
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f528e = r0
            int r0 = r6.m3815v()
            r5.f524a = r0
            int r0 = r6.m3814w()
            r5.f525b = r0
            int r0 = r6.m3820s()
            r5.f526c = r0
            int r0 = r6.m3840i()
            r5.f527d = r0
            java.util.ArrayList r6 = r6.mo3779b()
            int r0 = r6.size()
            r1 = 0
        L_0x002b:
            if (r1 >= r0) goto L_0x0040
            java.lang.Object r2 = r6.get(r1)
            a.e.a.j.e r2 = (p000a.p014e.p015a.p016j.C0097e) r2
            java.util.ArrayList<a.e.a.j.p$a> r3 = r5.f528e
            a.e.a.j.p$a r4 = new a.e.a.j.p$a
            r4.<init>(r2)
            r3.add(r4)
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0040:
            return
    }

    /* renamed from: a */
    public void m3747a(p000a.p014e.p015a.p016j.C0102f r4) {
            r3 = this;
            int r0 = r3.f524a
            r4.m3821r(r0)
            int r0 = r3.f525b
            r4.m3819s(r0)
            int r0 = r3.f526c
            r4.m3827o(r0)
            int r0 = r3.f527d
            r4.m3843g(r0)
            java.util.ArrayList<a.e.a.j.p$a> r0 = r3.f528e
            int r0 = r0.size()
            r1 = 0
        L_0x001b:
            if (r1 >= r0) goto L_0x002b
            java.util.ArrayList<a.e.a.j.p$a> r2 = r3.f528e
            java.lang.Object r2 = r2.get(r1)
            a.e.a.j.p$a r2 = (p000a.p014e.p015a.p016j.C0115p.C0116a) r2
            r2.m3745a(r4)
            int r1 = r1 + 1
            goto L_0x001b
        L_0x002b:
            return
    }

    /* renamed from: b */
    public void m3746b(p000a.p014e.p015a.p016j.C0102f r4) {
            r3 = this;
            int r0 = r4.m3815v()
            r3.f524a = r0
            int r0 = r4.m3814w()
            r3.f525b = r0
            int r0 = r4.m3820s()
            r3.f526c = r0
            int r0 = r4.m3840i()
            r3.f527d = r0
            java.util.ArrayList<a.e.a.j.p$a> r0 = r3.f528e
            int r0 = r0.size()
            r1 = 0
        L_0x001f:
            if (r1 >= r0) goto L_0x002f
            java.util.ArrayList<a.e.a.j.p$a> r2 = r3.f528e
            java.lang.Object r2 = r2.get(r1)
            a.e.a.j.p$a r2 = (p000a.p014e.p015a.p016j.C0115p.C0116a) r2
            r2.m3744b(r4)
            int r1 = r1 + 1
            goto L_0x001f
        L_0x002f:
            return
    }
}
