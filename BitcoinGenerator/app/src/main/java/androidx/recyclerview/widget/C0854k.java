package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public class C0854k extends p000a.p018g.p029l.C0185a {

    /* renamed from: c */
    final androidx.recyclerview.widget.C0813j f3255c;

    /* renamed from: d */
    final p000a.p018g.p029l.C0185a f3256d;

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes.dex */
    public static class C0855a extends p000a.p018g.p029l.C0185a {

        /* renamed from: c */
        final androidx.recyclerview.widget.C0854k f3257c;

        public C0855a(androidx.recyclerview.widget.C0854k r1) {
                r0 = this;
                r0.<init>()
                r0.f3257c = r1
                return
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(android.view.View r2, p000a.p018g.p029l.p030a0.C0191c r3) {
                r1 = this;
                super.mo143a(r2, r3)
                androidx.recyclerview.widget.k r0 = r1.f3257c
                boolean r0 = r0.m580c()
                if (r0 != 0) goto L_0x0020
                androidx.recyclerview.widget.k r0 = r1.f3257c
                androidx.recyclerview.widget.j r0 = r0.f3255c
                androidx.recyclerview.widget.j$o r0 = r0.getLayoutManager()
                if (r0 == 0) goto L_0x0020
                androidx.recyclerview.widget.k r0 = r1.f3257c
                androidx.recyclerview.widget.j r0 = r0.f3255c
                androidx.recyclerview.widget.j$o r0 = r0.getLayoutManager()
                r0.m763a(r2, r3)
            L_0x0020:
                return
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public boolean mo579a(android.view.View r2, int r3, android.os.Bundle r4) {
                r1 = this;
                boolean r0 = super.mo579a(r2, r3, r4)
                if (r0 == 0) goto L_0x0008
                r2 = 1
                return r2
            L_0x0008:
                androidx.recyclerview.widget.k r0 = r1.f3257c
                boolean r0 = r0.m580c()
                if (r0 != 0) goto L_0x0027
                androidx.recyclerview.widget.k r0 = r1.f3257c
                androidx.recyclerview.widget.j r0 = r0.f3255c
                androidx.recyclerview.widget.j$o r0 = r0.getLayoutManager()
                if (r0 == 0) goto L_0x0027
                androidx.recyclerview.widget.k r0 = r1.f3257c
                androidx.recyclerview.widget.j r0 = r0.f3255c
                androidx.recyclerview.widget.j$o r0 = r0.getLayoutManager()
                boolean r2 = r0.m767a(r2, r3, r4)
                return r2
            L_0x0027:
                r2 = 0
                return r2
        }
    }

    public C0854k(androidx.recyclerview.widget.C0813j r1) {
            r0 = this;
            r0.<init>()
            r0.f3255c = r1
            androidx.recyclerview.widget.k$a r1 = new androidx.recyclerview.widget.k$a
            r1.<init>(r0)
            r0.f3256d = r1
            return
    }

    @Override // p000a.p018g.p029l.C0185a
    /* renamed from: a */
    public void mo143a(android.view.View r1, p000a.p018g.p029l.p030a0.C0191c r2) {
            r0 = this;
            super.mo143a(r1, r2)
            java.lang.Class<androidx.recyclerview.widget.j> r1 = androidx.recyclerview.widget.C0813j.class
            java.lang.String r1 = r1.getName()
            r2.m3538a(r1)
            boolean r1 = r0.m580c()
            if (r1 != 0) goto L_0x0023
            androidx.recyclerview.widget.j r1 = r0.f3255c
            androidx.recyclerview.widget.j$o r1 = r1.getLayoutManager()
            if (r1 == 0) goto L_0x0023
            androidx.recyclerview.widget.j r1 = r0.f3255c
            androidx.recyclerview.widget.j$o r1 = r1.getLayoutManager()
            r1.m777a(r2)
        L_0x0023:
            return
    }

    @Override // p000a.p018g.p029l.C0185a
    /* renamed from: a */
    public boolean mo579a(android.view.View r1, int r2, android.os.Bundle r3) {
            r0 = this;
            boolean r1 = super.mo579a(r1, r2, r3)
            if (r1 == 0) goto L_0x0008
            r1 = 1
            return r1
        L_0x0008:
            boolean r1 = r0.m580c()
            if (r1 != 0) goto L_0x0021
            androidx.recyclerview.widget.j r1 = r0.f3255c
            androidx.recyclerview.widget.j$o r1 = r1.getLayoutManager()
            if (r1 == 0) goto L_0x0021
            androidx.recyclerview.widget.j r1 = r0.f3255c
            androidx.recyclerview.widget.j$o r1 = r1.getLayoutManager()
            boolean r1 = r1.m782a(r2, r3)
            return r1
        L_0x0021:
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public p000a.p018g.p029l.C0185a m581b() {
            r1 = this;
            a.g.l.a r0 = r1.f3256d
            return r0
    }

    @Override // p000a.p018g.p029l.C0185a
    /* renamed from: b */
    public void mo150b(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            super.mo150b(r2, r3)
            java.lang.Class<androidx.recyclerview.widget.j> r0 = androidx.recyclerview.widget.C0813j.class
            java.lang.String r0 = r0.getName()
            r3.setClassName(r0)
            boolean r0 = r2 instanceof androidx.recyclerview.widget.C0813j
            if (r0 == 0) goto L_0x0025
            boolean r0 = r1.m580c()
            if (r0 != 0) goto L_0x0025
            androidx.recyclerview.widget.j r2 = (androidx.recyclerview.widget.C0813j) r2
            androidx.recyclerview.widget.j$o r0 = r2.getLayoutManager()
            if (r0 == 0) goto L_0x0025
            androidx.recyclerview.widget.j$o r2 = r2.getLayoutManager()
            r2.mo757a(r3)
        L_0x0025:
            return
    }

    /* renamed from: c */
    boolean m580c() {
            r1 = this;
            androidx.recyclerview.widget.j r0 = r1.f3255c
            boolean r0 = r0.m929j()
            return r0
    }
}
