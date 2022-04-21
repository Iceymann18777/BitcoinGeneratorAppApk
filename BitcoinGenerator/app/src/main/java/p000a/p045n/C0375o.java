package p000a.p045n;

/* renamed from: a.n.o */
/* loaded from: classes.dex */
public class C0375o {

    /* renamed from: a */
    private static p000a.p045n.AbstractC0367m f1149a;

    /* renamed from: b */
    private static java.lang.ThreadLocal<java.lang.ref.WeakReference<p000a.p013d.C0067a<android.view.ViewGroup, java.util.ArrayList<p000a.p045n.AbstractC0367m>>>> f1150b;

    /* renamed from: c */
    static java.util.ArrayList<android.view.ViewGroup> f1151c;

    /* renamed from: a.n.o$a */
    /* loaded from: classes.dex */
    private static class ViewTreeObserver$OnPreDrawListenerC0376a implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

        /* renamed from: b */
        p000a.p045n.AbstractC0367m f1152b;

        /* renamed from: c */
        android.view.ViewGroup f1153c;

        /* renamed from: a.n.o$a$a */
        /* loaded from: classes.dex */
        class C0377a extends p000a.p045n.C0374n {

            /* renamed from: a */
            final /* synthetic */ p000a.p013d.C0067a f1154a;

            /* renamed from: b */
            final /* synthetic */ p000a.p045n.C0375o.ViewTreeObserver$OnPreDrawListenerC0376a f1155b;

            C0377a(p000a.p045n.C0375o.ViewTreeObserver$OnPreDrawListenerC0376a r1, p000a.p013d.C0067a r2) {
                    r0 = this;
                    r0.f1155b = r1
                    r0.f1154a = r2
                    r0.<init>()
                    return
            }

            @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
            /* renamed from: b */
            public void mo2775b(p000a.p045n.AbstractC0367m r3) {
                    r2 = this;
                    a.d.a r0 = r2.f1154a
                    a.n.o$a r1 = r2.f1155b
                    android.view.ViewGroup r1 = r1.f1153c
                    java.lang.Object r0 = r0.get(r1)
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    r0.remove(r3)
                    return
            }
        }

        ViewTreeObserver$OnPreDrawListenerC0376a(p000a.p045n.AbstractC0367m r1, android.view.ViewGroup r2) {
                r0 = this;
                r0.<init>()
                r0.f1152b = r1
                r0.f1153c = r2
                return
        }

        /* renamed from: a */
        private void m2803a() {
                r1 = this;
                android.view.ViewGroup r0 = r1.f1153c
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnPreDrawListener(r1)
                android.view.ViewGroup r0 = r1.f1153c
                r0.removeOnAttachStateChangeListener(r1)
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r5 = this;
                r5.m2803a()
                java.util.ArrayList<android.view.ViewGroup> r0 = p000a.p045n.C0375o.f1151c
                android.view.ViewGroup r1 = r5.f1153c
                boolean r0 = r0.remove(r1)
                r1 = 1
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                a.d.a r0 = p000a.p045n.C0375o.m2807a()
                android.view.ViewGroup r2 = r5.f1153c
                java.lang.Object r2 = r0.get(r2)
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r3 = 0
                if (r2 != 0) goto L_0x0029
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                android.view.ViewGroup r4 = r5.f1153c
                r0.put(r4, r2)
                goto L_0x0034
            L_0x0029:
                int r4 = r2.size()
                if (r4 <= 0) goto L_0x0034
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r2)
            L_0x0034:
                a.n.m r4 = r5.f1152b
                r2.add(r4)
                a.n.m r2 = r5.f1152b
                a.n.o$a$a r4 = new a.n.o$a$a
                r4.<init>(r5, r0)
                r2.mo2795a(r4)
                a.n.m r0 = r5.f1152b
                android.view.ViewGroup r2 = r5.f1153c
                r4 = 0
                r0.m2830a(r2, r4)
                if (r3 == 0) goto L_0x0063
                java.util.Iterator r0 = r3.iterator()
            L_0x0051:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0063
                java.lang.Object r2 = r0.next()
                a.n.m r2 = (p000a.p045n.AbstractC0367m) r2
                android.view.ViewGroup r3 = r5.f1153c
                r2.mo2780e(r3)
                goto L_0x0051
            L_0x0063:
                a.n.m r0 = r5.f1152b
                android.view.ViewGroup r2 = r5.f1153c
                r0.m2832a(r2)
                return r1
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                r2.m2803a()
                java.util.ArrayList<android.view.ViewGroup> r3 = p000a.p045n.C0375o.f1151c
                android.view.ViewGroup r0 = r2.f1153c
                r3.remove(r0)
                a.d.a r3 = p000a.p045n.C0375o.m2807a()
                android.view.ViewGroup r0 = r2.f1153c
                java.lang.Object r3 = r3.get(r0)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 == 0) goto L_0x0034
                int r0 = r3.size()
                if (r0 <= 0) goto L_0x0034
                java.util.Iterator r3 = r3.iterator()
            L_0x0022:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0034
                java.lang.Object r0 = r3.next()
                a.n.m r0 = (p000a.p045n.AbstractC0367m) r0
                android.view.ViewGroup r1 = r2.f1153c
                r0.mo2780e(r1)
                goto L_0x0022
            L_0x0034:
                a.n.m r3 = r2.f1152b
                r0 = 1
                r3.m2829a(r0)
                return
        }
    }

    static {
            a.n.b r0 = new a.n.b
            r0.<init>()
            p000a.p045n.C0375o.f1149a = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000a.p045n.C0375o.f1150b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p000a.p045n.C0375o.f1151c = r0
            return
    }

    /* renamed from: a */
    static p000a.p013d.C0067a<android.view.ViewGroup, java.util.ArrayList<p000a.p045n.AbstractC0367m>> m2807a() {
            java.lang.ThreadLocal<java.lang.ref.WeakReference<a.d.a<android.view.ViewGroup, java.util.ArrayList<a.n.m>>>> r0 = p000a.p045n.C0375o.f1150b
            java.lang.Object r0 = r0.get()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.get()
            a.d.a r0 = (p000a.p013d.C0067a) r0
            if (r0 == 0) goto L_0x0013
            return r0
        L_0x0013:
            a.d.a r0 = new a.d.a
            r0.<init>()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            java.lang.ThreadLocal<java.lang.ref.WeakReference<a.d.a<android.view.ViewGroup, java.util.ArrayList<a.n.m>>>> r2 = p000a.p045n.C0375o.f1150b
            r2.set(r1)
            return r0
    }

    /* renamed from: a */
    public static void m2806a(android.view.ViewGroup r1, p000a.p045n.AbstractC0367m r2) {
            java.util.ArrayList<android.view.ViewGroup> r0 = p000a.p045n.C0375o.f1151c
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0025
            boolean r0 = p000a.p018g.p029l.C0216r.m3397x(r1)
            if (r0 == 0) goto L_0x0025
            java.util.ArrayList<android.view.ViewGroup> r0 = p000a.p045n.C0375o.f1151c
            r0.add(r1)
            if (r2 != 0) goto L_0x0017
            a.n.m r2 = p000a.p045n.C0375o.f1149a
        L_0x0017:
            a.n.m r2 = r2.clone()
            m2804c(r1, r2)
            r0 = 0
            p000a.p045n.C0365l.m2845a(r1, r0)
            m2805b(r1, r2)
        L_0x0025:
            return
    }

    /* renamed from: b */
    private static void m2805b(android.view.ViewGroup r1, p000a.p045n.AbstractC0367m r2) {
            if (r2 == 0) goto L_0x0013
            if (r1 == 0) goto L_0x0013
            a.n.o$a r0 = new a.n.o$a
            r0.<init>(r2, r1)
            r1.addOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.addOnPreDrawListener(r0)
        L_0x0013:
            return
    }

    /* renamed from: c */
    private static void m2804c(android.view.ViewGroup r2, p000a.p045n.AbstractC0367m r3) {
            a.d.a r0 = m2807a()
            java.lang.Object r0 = r0.get(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x0026
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x0026
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            a.n.m r1 = (p000a.p045n.AbstractC0367m) r1
            r1.mo2782c(r2)
            goto L_0x0016
        L_0x0026:
            if (r3 == 0) goto L_0x002c
            r0 = 1
            r3.m2830a(r2, r0)
        L_0x002c:
            a.n.l r2 = p000a.p045n.C0365l.m2846a(r2)
            if (r2 == 0) goto L_0x0035
            r2.m2847a()
        L_0x0035:
            return
    }
}
