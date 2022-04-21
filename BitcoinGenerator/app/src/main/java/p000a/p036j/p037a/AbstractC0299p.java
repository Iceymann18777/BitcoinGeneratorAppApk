package p000a.p036j.p037a;

/* renamed from: a.j.a.p */
/* loaded from: classes.dex */
public abstract class AbstractC0299p {

    /* renamed from: a.j.a.p$a */
    /* loaded from: classes.dex */
    class RunnableC0300a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ int f986b;

        /* renamed from: c */
        final /* synthetic */ java.util.ArrayList f987c;

        /* renamed from: d */
        final /* synthetic */ java.util.ArrayList f988d;

        /* renamed from: e */
        final /* synthetic */ java.util.ArrayList f989e;

        /* renamed from: f */
        final /* synthetic */ java.util.ArrayList f990f;

        RunnableC0300a(p000a.p036j.p037a.AbstractC0299p r1, int r2, java.util.ArrayList r3, java.util.ArrayList r4, java.util.ArrayList r5, java.util.ArrayList r6) {
                r0 = this;
                r0.f986b = r2
                r0.f987c = r3
                r0.f988d = r4
                r0.f989e = r5
                r0.f990f = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                r0 = 0
            L_0x0001:
                int r1 = r3.f986b
                if (r0 >= r1) goto L_0x002e
                java.util.ArrayList r1 = r3.f987c
                java.lang.Object r1 = r1.get(r0)
                android.view.View r1 = (android.view.View) r1
                java.util.ArrayList r2 = r3.f988d
                java.lang.Object r2 = r2.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                p000a.p018g.p029l.C0216r.m3430a(r1, r2)
                java.util.ArrayList r1 = r3.f989e
                java.lang.Object r1 = r1.get(r0)
                android.view.View r1 = (android.view.View) r1
                java.util.ArrayList r2 = r3.f990f
                java.lang.Object r2 = r2.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                p000a.p018g.p029l.C0216r.m3430a(r1, r2)
                int r0 = r0 + 1
                goto L_0x0001
            L_0x002e:
                return
        }
    }

    /* renamed from: a.j.a.p$b */
    /* loaded from: classes.dex */
    class RunnableC0301b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ java.util.ArrayList f991b;

        /* renamed from: c */
        final /* synthetic */ java.util.Map f992c;

        RunnableC0301b(p000a.p036j.p037a.AbstractC0299p r1, java.util.ArrayList r2, java.util.Map r3) {
                r0 = this;
                r0.f991b = r2
                r0.f992c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.util.ArrayList r0 = r5.f991b
                int r0 = r0.size()
                r1 = 0
            L_0x0007:
                if (r1 >= r0) goto L_0x0023
                java.util.ArrayList r2 = r5.f991b
                java.lang.Object r2 = r2.get(r1)
                android.view.View r2 = (android.view.View) r2
                java.lang.String r3 = p000a.p018g.p029l.C0216r.m3405p(r2)
                if (r3 == 0) goto L_0x0020
                java.util.Map r4 = r5.f992c
                java.lang.String r3 = p000a.p036j.p037a.AbstractC0299p.m2952a(r4, r3)
                p000a.p018g.p029l.C0216r.m3430a(r2, r3)
            L_0x0020:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0023:
                return
        }
    }

    /* renamed from: a.j.a.p$c */
    /* loaded from: classes.dex */
    class RunnableC0302c implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ java.util.ArrayList f993b;

        /* renamed from: c */
        final /* synthetic */ java.util.Map f994c;

        RunnableC0302c(p000a.p036j.p037a.AbstractC0299p r1, java.util.ArrayList r2, java.util.Map r3) {
                r0 = this;
                r0.f993b = r2
                r0.f994c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.util.ArrayList r0 = r5.f993b
                int r0 = r0.size()
                r1 = 0
            L_0x0007:
                if (r1 >= r0) goto L_0x0023
                java.util.ArrayList r2 = r5.f993b
                java.lang.Object r2 = r2.get(r1)
                android.view.View r2 = (android.view.View) r2
                java.lang.String r3 = p000a.p018g.p029l.C0216r.m3405p(r2)
                java.util.Map r4 = r5.f994c
                java.lang.Object r3 = r4.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                p000a.p018g.p029l.C0216r.m3430a(r2, r3)
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0023:
                return
        }
    }

    public AbstractC0299p() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    static java.lang.String m2952a(java.util.Map<java.lang.String, java.lang.String> r2, java.lang.String r3) {
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0008
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L_0x0025:
            r2 = 0
            return r2
    }

    /* renamed from: a */
    protected static void m2955a(java.util.List<android.view.View> r6, android.view.View r7) {
            int r0 = r6.size()
            boolean r1 = m2954a(r6, r7, r0)
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            r6.add(r7)
            r7 = r0
        L_0x000f:
            int r1 = r6.size()
            if (r7 >= r1) goto L_0x003b
            java.lang.Object r1 = r6.get(r7)
            android.view.View r1 = (android.view.View) r1
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0038
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            r3 = 0
        L_0x0026:
            if (r3 >= r2) goto L_0x0038
            android.view.View r4 = r1.getChildAt(r3)
            boolean r5 = m2954a(r6, r4, r0)
            if (r5 != 0) goto L_0x0035
            r6.add(r4)
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x0026
        L_0x0038:
            int r7 = r7 + 1
            goto L_0x000f
        L_0x003b:
            return
    }

    /* renamed from: a */
    protected static boolean m2956a(java.util.List r0) {
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = 0
            goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            return r0
    }

    /* renamed from: a */
    private static boolean m2954a(java.util.List<android.view.View> r3, android.view.View r4, int r5) {
            r0 = 0
            r1 = 0
        L_0x0002:
            if (r1 >= r5) goto L_0x000f
            java.lang.Object r2 = r3.get(r1)
            if (r2 != r4) goto L_0x000c
            r3 = 1
            return r3
        L_0x000c:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x000f:
            return r0
    }

    /* renamed from: a */
    public abstract java.lang.Object mo2883a(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    /* renamed from: a */
    java.util.ArrayList<java.lang.String> m2958a(java.util.ArrayList<android.view.View> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        L_0x000a:
            if (r2 >= r1) goto L_0x0020
            java.lang.Object r3 = r6.get(r2)
            android.view.View r3 = (android.view.View) r3
            java.lang.String r4 = p000a.p018g.p029l.C0216r.m3405p(r3)
            r0.add(r4)
            r4 = 0
            p000a.p018g.p029l.C0216r.m3430a(r3, r4)
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0020:
            return r0
    }

    /* renamed from: a */
    protected void m2962a(android.view.View r7, android.graphics.Rect r8) {
            r6 = this;
            r0 = 2
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            r1 = r0[r1]
            int r5 = r7.getWidth()
            int r1 = r1 + r5
            r0 = r0[r3]
            int r7 = r7.getHeight()
            int r0 = r0 + r7
            r8.set(r2, r4, r1, r0)
            return
    }

    /* renamed from: a */
    void m2961a(android.view.View r9, java.util.ArrayList<android.view.View> r10, java.util.ArrayList<android.view.View> r11, java.util.ArrayList<java.lang.String> r12, java.util.Map<java.lang.String, java.lang.String> r13) {
            r8 = this;
            int r2 = r11.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
            r1 = 0
        L_0x000b:
            if (r1 >= r2) goto L_0x0044
            java.lang.Object r3 = r10.get(r1)
            android.view.View r3 = (android.view.View) r3
            java.lang.String r4 = p000a.p018g.p029l.C0216r.m3405p(r3)
            r6.add(r4)
            if (r4 != 0) goto L_0x001d
            goto L_0x0041
        L_0x001d:
            r5 = 0
            p000a.p018g.p029l.C0216r.m3430a(r3, r5)
            java.lang.Object r3 = r13.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
        L_0x0028:
            if (r5 >= r2) goto L_0x0041
            java.lang.Object r7 = r12.get(r5)
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x003e
            java.lang.Object r3 = r11.get(r5)
            android.view.View r3 = (android.view.View) r3
            p000a.p018g.p029l.C0216r.m3430a(r3, r4)
            goto L_0x0041
        L_0x003e:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0044:
            a.j.a.p$a r13 = new a.j.a.p$a
            r0 = r13
            r1 = r8
            r3 = r11
            r4 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            p000a.p036j.p037a.ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(r9, r13)
            return
    }

    /* renamed from: a */
    void m2960a(android.view.View r2, java.util.ArrayList<android.view.View> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r1 = this;
            a.j.a.p$b r0 = new a.j.a.p$b
            r0.<init>(r1, r3, r4)
            p000a.p036j.p037a.ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(r2, r0)
            return
    }

    /* renamed from: a */
    public abstract void mo2888a(android.view.ViewGroup r1, java.lang.Object r2);

    /* renamed from: a */
    void m2959a(android.view.ViewGroup r2, java.util.ArrayList<android.view.View> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r1 = this;
            a.j.a.p$c r0 = new a.j.a.p$c
            r0.<init>(r1, r3, r4)
            p000a.p036j.p037a.ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(r2, r0)
            return
    }

    /* renamed from: a */
    public abstract void mo2886a(java.lang.Object r1, android.graphics.Rect r2);

    /* renamed from: a */
    public abstract void mo2885a(java.lang.Object r1, android.view.View r2);

    /* renamed from: a */
    public abstract void mo2884a(java.lang.Object r1, android.view.View r2, java.util.ArrayList<android.view.View> r3);

    /* renamed from: a */
    public abstract void mo2882a(java.lang.Object r1, java.lang.Object r2, java.util.ArrayList<android.view.View> r3, java.lang.Object r4, java.util.ArrayList<android.view.View> r5, java.lang.Object r6, java.util.ArrayList<android.view.View> r7);

    /* renamed from: a */
    public abstract void mo2881a(java.lang.Object r1, java.util.ArrayList<android.view.View> r2);

    /* renamed from: a */
    public abstract void mo2880a(java.lang.Object r1, java.util.ArrayList<android.view.View> r2, java.util.ArrayList<android.view.View> r3);

    /* renamed from: a */
    void m2957a(java.util.ArrayList<android.view.View> r4, android.view.View r5) {
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0027
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0024
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            boolean r0 = p000a.p018g.p029l.C0221t.m3381a(r5)
            if (r0 == 0) goto L_0x0013
            goto L_0x0024
        L_0x0013:
            int r0 = r5.getChildCount()
            r1 = 0
        L_0x0018:
            if (r1 >= r0) goto L_0x0027
            android.view.View r2 = r5.getChildAt(r1)
            r3.m2957a(r4, r2)
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0024:
            r4.add(r5)
        L_0x0027:
            return
    }

    /* renamed from: a */
    void m2953a(java.util.Map<java.lang.String, android.view.View> r4, android.view.View r5) {
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = p000a.p018g.p029l.C0216r.m3405p(r5)
            if (r0 == 0) goto L_0x000f
            r4.put(r0, r5)
        L_0x000f:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0026
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            r1 = 0
        L_0x001a:
            if (r1 >= r0) goto L_0x0026
            android.view.View r2 = r5.getChildAt(r1)
            r3.m2953a(r4, r2)
            int r1 = r1 + 1
            goto L_0x001a
        L_0x0026:
            return
    }

    /* renamed from: a */
    public abstract boolean mo2887a(java.lang.Object r1);

    /* renamed from: b */
    public abstract java.lang.Object mo2879b(java.lang.Object r1);

    /* renamed from: b */
    public abstract java.lang.Object mo2876b(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    /* renamed from: b */
    public abstract void mo2878b(java.lang.Object r1, android.view.View r2);

    /* renamed from: b */
    public abstract void mo2877b(java.lang.Object r1, android.view.View r2, java.util.ArrayList<android.view.View> r3);

    /* renamed from: b */
    public abstract void mo2875b(java.lang.Object r1, java.util.ArrayList<android.view.View> r2, java.util.ArrayList<android.view.View> r3);

    /* renamed from: c */
    public abstract java.lang.Object mo2874c(java.lang.Object r1);

    /* renamed from: c */
    public abstract void mo2873c(java.lang.Object r1, android.view.View r2);
}
