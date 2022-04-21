package p000a.p001a.p006m;

/* renamed from: a.a.m.h */
/* loaded from: classes.dex */
public class C0039h {

    /* renamed from: a */
    final java.util.ArrayList<p000a.p018g.p029l.C0223v> f147a;

    /* renamed from: b */
    private long f148b;

    /* renamed from: c */
    private android.view.animation.Interpolator f149c;

    /* renamed from: d */
    p000a.p018g.p029l.AbstractC0227w f150d;

    /* renamed from: e */
    private boolean f151e;

    /* renamed from: f */
    private final p000a.p018g.p029l.C0228x f152f;

    /* renamed from: a.a.m.h$a */
    /* loaded from: classes.dex */
    class C0040a extends p000a.p018g.p029l.C0228x {

        /* renamed from: a */
        private boolean f153a;

        /* renamed from: b */
        private int f154b;

        /* renamed from: c */
        final /* synthetic */ p000a.p001a.p006m.C0039h f155c;

        C0040a(p000a.p001a.p006m.C0039h r1) {
                r0 = this;
                r0.f155c = r1
                r0.<init>()
                r1 = 0
                r0.f153a = r1
                r0.f154b = r1
                return
        }

        /* renamed from: a */
        void m4149a() {
                r1 = this;
                r0 = 0
                r1.f154b = r0
                r1.f153a = r0
                a.a.m.h r0 = r1.f155c
                r0.m4151b()
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(android.view.View r2) {
                r1 = this;
                int r2 = r1.f154b
                int r2 = r2 + 1
                r1.f154b = r2
                a.a.m.h r0 = r1.f155c
                java.util.ArrayList<a.g.l.v> r0 = r0.f147a
                int r0 = r0.size()
                if (r2 != r0) goto L_0x001d
                a.a.m.h r2 = r1.f155c
                a.g.l.w r2 = r2.f150d
                if (r2 == 0) goto L_0x001a
                r0 = 0
                r2.mo1850a(r0)
            L_0x001a:
                r1.m4149a()
            L_0x001d:
                return
        }

        @Override // p000a.p018g.p029l.C0228x, p000a.p018g.p029l.AbstractC0227w
        /* renamed from: b */
        public void mo1849b(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.f153a
                if (r2 == 0) goto L_0x0005
                return
            L_0x0005:
                r2 = 1
                r1.f153a = r2
                a.a.m.h r2 = r1.f155c
                a.g.l.w r2 = r2.f150d
                if (r2 == 0) goto L_0x0012
                r0 = 0
                r2.mo1849b(r0)
            L_0x0012:
                return
        }
    }

    public C0039h() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f148b = r0
            a.a.m.h$a r0 = new a.a.m.h$a
            r0.<init>(r2)
            r2.f152f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f147a = r0
            return
    }

    /* renamed from: a */
    public p000a.p001a.p006m.C0039h m4156a(long r2) {
            r1 = this;
            boolean r0 = r1.f151e
            if (r0 != 0) goto L_0x0006
            r1.f148b = r2
        L_0x0006:
            return r1
    }

    /* renamed from: a */
    public p000a.p001a.p006m.C0039h m4155a(p000a.p018g.p029l.C0223v r2) {
            r1 = this;
            boolean r0 = r1.f151e
            if (r0 != 0) goto L_0x0009
            java.util.ArrayList<a.g.l.v> r0 = r1.f147a
            r0.add(r2)
        L_0x0009:
            return r1
    }

    /* renamed from: a */
    public p000a.p001a.p006m.C0039h m4154a(p000a.p018g.p029l.C0223v r3, p000a.p018g.p029l.C0223v r4) {
            r2 = this;
            java.util.ArrayList<a.g.l.v> r0 = r2.f147a
            r0.add(r3)
            long r0 = r3.m3366b()
            r4.m3364b(r0)
            java.util.ArrayList<a.g.l.v> r3 = r2.f147a
            r3.add(r4)
            return r2
    }

    /* renamed from: a */
    public p000a.p001a.p006m.C0039h m4153a(p000a.p018g.p029l.AbstractC0227w r2) {
            r1 = this;
            boolean r0 = r1.f151e
            if (r0 != 0) goto L_0x0006
            r1.f150d = r2
        L_0x0006:
            return r1
    }

    /* renamed from: a */
    public p000a.p001a.p006m.C0039h m4152a(android.view.animation.Interpolator r2) {
            r1 = this;
            boolean r0 = r1.f151e
            if (r0 != 0) goto L_0x0006
            r1.f149c = r2
        L_0x0006:
            return r1
    }

    /* renamed from: a */
    public void m4157a() {
            r2 = this;
            boolean r0 = r2.f151e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.ArrayList<a.g.l.v> r0 = r2.f147a
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r0.next()
            a.g.l.v r1 = (p000a.p018g.p029l.C0223v) r1
            r1.m3373a()
            goto L_0x000b
        L_0x001b:
            r0 = 0
            r2.f151e = r0
            return
    }

    /* renamed from: b */
    void m4151b() {
            r1 = this;
            r0 = 0
            r1.f151e = r0
            return
    }

    /* renamed from: c */
    public void m4150c() {
            r7 = this;
            boolean r0 = r7.f151e
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.util.ArrayList<a.g.l.v> r0 = r7.f147a
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            a.g.l.v r1 = (p000a.p018g.p029l.C0223v) r1
            long r2 = r7.f148b
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0022
            r1.m3371a(r2)
        L_0x0022:
            android.view.animation.Interpolator r2 = r7.f149c
            if (r2 == 0) goto L_0x0029
            r1.m3367a(r2)
        L_0x0029:
            a.g.l.w r2 = r7.f150d
            if (r2 == 0) goto L_0x0032
            a.g.l.x r2 = r7.f152f
            r1.m3370a(r2)
        L_0x0032:
            r1.m3363c()
            goto L_0x000b
        L_0x0036:
            r0 = 1
            r7.f151e = r0
            return
    }
}
