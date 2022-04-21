package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: i */
    static final java.lang.Object f2781i = null;

    /* renamed from: a */
    final java.lang.Object f2782a;

    /* renamed from: b */
    private p000a.p007b.p008a.p010b.C0049b<androidx.lifecycle.AbstractC0754m<? super T>, androidx.lifecycle.LiveData<T>.AbstractC0735b> f2783b;

    /* renamed from: c */
    int f2784c;

    /* renamed from: d */
    private volatile java.lang.Object f2785d;

    /* renamed from: e */
    volatile java.lang.Object f2786e;

    /* renamed from: f */
    private int f2787f;

    /* renamed from: g */
    private boolean f2788g;

    /* renamed from: h */
    private boolean f2789h;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends androidx.lifecycle.LiveData<T>.AbstractC0735b implements androidx.lifecycle.AbstractC0741d {

        /* renamed from: e */
        final androidx.lifecycle.AbstractC0746g f2790e;

        /* renamed from: f */
        final /* synthetic */ androidx.lifecycle.LiveData f2791f;

        LifecycleBoundObserver(androidx.lifecycle.LiveData r1, androidx.lifecycle.AbstractC0746g r2, androidx.lifecycle.AbstractC0754m<? super T> r3) {
                r0 = this;
                r0.f2791f = r1
                r0.<init>(r1, r3)
                r0.f2790e = r2
                return
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0735b
        /* renamed from: a */
        void mo1407a() {
                r1 = this;
                androidx.lifecycle.g r0 = r1.f2790e
                androidx.lifecycle.e r0 = r0.mo1368a()
                r0.mo1377b(r1)
                return
        }

        @Override // androidx.lifecycle.AbstractC0741d
        /* renamed from: a */
        public void mo1388a(androidx.lifecycle.AbstractC0746g r1, androidx.lifecycle.AbstractC0742e.EnumC0743a r2) {
                r0 = this;
                androidx.lifecycle.g r1 = r0.f2790e
                androidx.lifecycle.e r1 = r1.mo1368a()
                androidx.lifecycle.e$b r1 = r1.mo1386a()
                androidx.lifecycle.e$b r2 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2807b
                if (r1 != r2) goto L_0x0016
                androidx.lifecycle.LiveData r1 = r0.f2791f
                androidx.lifecycle.m<? super T> r2 = r0.f2793a
                r1.mo1411a(r2)
                return
            L_0x0016:
                boolean r1 = r0.mo1404b()
                r0.m1405a(r1)
                return
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0735b
        /* renamed from: a */
        boolean mo1406a(androidx.lifecycle.AbstractC0746g r2) {
                r1 = this;
                androidx.lifecycle.g r0 = r1.f2790e
                if (r0 != r2) goto L_0x0006
                r2 = 1
                goto L_0x0007
            L_0x0006:
                r2 = 0
            L_0x0007:
                return r2
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0735b
        /* renamed from: b */
        boolean mo1404b() {
                r2 = this;
                androidx.lifecycle.g r0 = r2.f2790e
                androidx.lifecycle.e r0 = r0.mo1368a()
                androidx.lifecycle.e$b r0 = r0.mo1386a()
                androidx.lifecycle.e$b r1 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2810e
                boolean r0 = r0.m1387a(r1)
                return r0
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    class RunnableC0734a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.lifecycle.LiveData f2792b;

        RunnableC0734a(androidx.lifecycle.LiveData r1) {
                r0 = this;
                r0.f2792b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                androidx.lifecycle.LiveData r0 = r4.f2792b
                java.lang.Object r0 = r0.f2782a
                monitor-enter(r0)
                androidx.lifecycle.LiveData r1 = r4.f2792b     // Catch: all -> 0x0016
                java.lang.Object r1 = r1.f2786e     // Catch: all -> 0x0016
                androidx.lifecycle.LiveData r2 = r4.f2792b     // Catch: all -> 0x0016
                java.lang.Object r3 = androidx.lifecycle.LiveData.f2781i     // Catch: all -> 0x0016
                r2.f2786e = r3     // Catch: all -> 0x0016
                monitor-exit(r0)     // Catch: all -> 0x0016
                androidx.lifecycle.LiveData r0 = r4.f2792b
                r0.mo1360a(r1)
                return
            L_0x0016:
                r1 = move-exception
                monitor-exit(r0)     // Catch: all -> 0x0016
                throw r1
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes.dex */
    private abstract class AbstractC0735b {

        /* renamed from: a */
        final androidx.lifecycle.AbstractC0754m<? super T> f2793a;

        /* renamed from: b */
        boolean f2794b;

        /* renamed from: c */
        int f2795c;

        /* renamed from: d */
        final /* synthetic */ androidx.lifecycle.LiveData f2796d;

        AbstractC0735b(androidx.lifecycle.LiveData r1, androidx.lifecycle.AbstractC0754m<? super T> r2) {
                r0 = this;
                r0.f2796d = r1
                r0.<init>()
                r1 = -1
                r0.f2795c = r1
                r0.f2793a = r2
                return
        }

        /* renamed from: a */
        void mo1407a() {
                r0 = this;
                return
        }

        /* renamed from: a */
        void m1405a(boolean r5) {
                r4 = this;
                boolean r0 = r4.f2794b
                if (r5 != r0) goto L_0x0005
                return
            L_0x0005:
                r4.f2794b = r5
                androidx.lifecycle.LiveData r5 = r4.f2796d
                int r5 = r5.f2784c
                r0 = 1
                if (r5 != 0) goto L_0x0010
                r5 = 1
                goto L_0x0011
            L_0x0010:
                r5 = 0
            L_0x0011:
                androidx.lifecycle.LiveData r1 = r4.f2796d
                int r2 = r1.f2784c
                boolean r3 = r4.f2794b
                if (r3 == 0) goto L_0x001a
                goto L_0x001b
            L_0x001a:
                r0 = -1
            L_0x001b:
                int r2 = r2 + r0
                r1.f2784c = r2
                if (r5 == 0) goto L_0x0029
                boolean r5 = r4.f2794b
                if (r5 == 0) goto L_0x0029
                androidx.lifecycle.LiveData r5 = r4.f2796d
                r5.mo1414a()
            L_0x0029:
                androidx.lifecycle.LiveData r5 = r4.f2796d
                int r0 = r5.f2784c
                if (r0 != 0) goto L_0x0036
                boolean r0 = r4.f2794b
                if (r0 != 0) goto L_0x0036
                r5.mo1409b()
            L_0x0036:
                boolean r5 = r4.f2794b
                if (r5 == 0) goto L_0x003f
                androidx.lifecycle.LiveData r5 = r4.f2796d
                r5.m1413a(r4)
            L_0x003f:
                return
        }

        /* renamed from: a */
        boolean mo1406a(androidx.lifecycle.AbstractC0746g r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: b */
        abstract boolean mo1404b();
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.lifecycle.LiveData.f2781i = r0
            return
    }

    public LiveData() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f2782a = r0
            a.b.a.b.b r0 = new a.b.a.b.b
            r0.<init>()
            r1.f2783b = r0
            r0 = 0
            r1.f2784c = r0
            java.lang.Object r0 = androidx.lifecycle.LiveData.f2781i
            r1.f2785d = r0
            r1.f2786e = r0
            r0 = -1
            r1.f2787f = r0
            androidx.lifecycle.LiveData$a r0 = new androidx.lifecycle.LiveData$a
            r0.<init>(r1)
            return
    }

    /* renamed from: a */
    private static void m1410a(java.lang.String r3) {
            a.b.a.a.a r0 = p000a.p007b.p008a.p009a.C0042a.m4148b()
            boolean r0 = r0.mo4147a()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot invoke "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " on a background"
            r1.append(r3)
            java.lang.String r3 = " thread"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: b */
    private void m1408b(androidx.lifecycle.LiveData<T>.AbstractC0735b r3) {
            r2 = this;
            boolean r0 = r3.f2794b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r3.mo1404b()
            if (r0 != 0) goto L_0x0010
            r0 = 0
            r3.m1405a(r0)
            return
        L_0x0010:
            int r0 = r3.f2795c
            int r1 = r2.f2787f
            if (r0 < r1) goto L_0x0017
            return
        L_0x0017:
            r3.f2795c = r1
            androidx.lifecycle.m<? super T> r3 = r3.f2793a
            java.lang.Object r0 = r2.f2785d
            r3.m1359a(r0)
            return
    }

    /* renamed from: a */
    protected void mo1414a() {
            r0 = this;
            return
    }

    /* renamed from: a */
    void m1413a(androidx.lifecycle.LiveData<T>.AbstractC0735b r4) {
            r3 = this;
            boolean r0 = r3.f2788g
            r1 = 1
            if (r0 == 0) goto L_0x0008
            r3.f2789h = r1
            return
        L_0x0008:
            r3.f2788g = r1
        L_0x000a:
            r0 = 0
            r3.f2789h = r0
            if (r4 == 0) goto L_0x0014
            r3.m1408b(r4)
            r4 = 0
            goto L_0x0033
        L_0x0014:
            a.b.a.b.b<androidx.lifecycle.m<? super T>, androidx.lifecycle.LiveData<T>$b> r1 = r3.f2783b
            a.b.a.b.b$d r1 = r1.m4138c()
        L_0x001a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LiveData$b r2 = (androidx.lifecycle.LiveData.AbstractC0735b) r2
            r3.m1408b(r2)
            boolean r2 = r3.f2789h
            if (r2 == 0) goto L_0x001a
        L_0x0033:
            boolean r1 = r3.f2789h
            if (r1 != 0) goto L_0x000a
            r3.f2788g = r0
            return
    }

    /* renamed from: a */
    public void m1412a(androidx.lifecycle.AbstractC0746g r3, androidx.lifecycle.AbstractC0754m<? super T> r4) {
            r2 = this;
            java.lang.String r0 = "observe"
            m1410a(r0)
            androidx.lifecycle.e r0 = r3.mo1368a()
            androidx.lifecycle.e$b r0 = r0.mo1386a()
            androidx.lifecycle.e$b r1 = androidx.lifecycle.AbstractC0742e.EnumC0744b.f2807b
            if (r0 != r1) goto L_0x0012
            return
        L_0x0012:
            androidx.lifecycle.LiveData$LifecycleBoundObserver r0 = new androidx.lifecycle.LiveData$LifecycleBoundObserver
            r0.<init>(r2, r3, r4)
            a.b.a.b.b<androidx.lifecycle.m<? super T>, androidx.lifecycle.LiveData<T>$b> r1 = r2.f2783b
            java.lang.Object r4 = r1.mo4139b(r4, r0)
            androidx.lifecycle.LiveData$b r4 = (androidx.lifecycle.LiveData.AbstractC0735b) r4
            if (r4 == 0) goto L_0x0030
            boolean r1 = r4.mo1406a(r3)
            if (r1 == 0) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot add the same observer with different lifecycles"
            r3.<init>(r4)
            throw r3
        L_0x0030:
            if (r4 == 0) goto L_0x0033
            return
        L_0x0033:
            androidx.lifecycle.e r3 = r3.mo1368a()
            r3.mo1382a(r0)
            return
    }

    /* renamed from: a */
    public void mo1411a(androidx.lifecycle.AbstractC0754m<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "removeObserver"
            m1410a(r0)
            a.b.a.b.b<androidx.lifecycle.m<? super T>, androidx.lifecycle.LiveData<T>$b> r0 = r1.f2783b
            java.lang.Object r2 = r0.remove(r2)
            androidx.lifecycle.LiveData$b r2 = (androidx.lifecycle.LiveData.AbstractC0735b) r2
            if (r2 != 0) goto L_0x0010
            return
        L_0x0010:
            r2.mo1407a()
            r0 = 0
            r2.m1405a(r0)
            return
    }

    /* renamed from: a */
    protected void mo1360a(T r2) {
            r1 = this;
            java.lang.String r0 = "setValue"
            m1410a(r0)
            int r0 = r1.f2787f
            int r0 = r0 + 1
            r1.f2787f = r0
            r1.f2785d = r2
            r2 = 0
            r1.m1413a(r2)
            return
    }

    /* renamed from: b */
    protected void mo1409b() {
            r0 = this;
            return
    }
}
