package p000a.p018g.p026i;

/* renamed from: a.g.i.c */
/* loaded from: classes.dex */
public class C0169c {

    /* renamed from: a */
    private final java.lang.Object f600a;

    /* renamed from: b */
    private android.os.HandlerThread f601b;

    /* renamed from: c */
    private android.os.Handler f602c;

    /* renamed from: d */
    private int f603d;

    /* renamed from: e */
    private android.os.Handler.Callback f604e;

    /* renamed from: f */
    private final int f605f;

    /* renamed from: g */
    private final int f606g;

    /* renamed from: h */
    private final java.lang.String f607h;

    /* renamed from: a.g.i.c$a */
    /* loaded from: classes.dex */
    class C0170a implements android.os.Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ p000a.p018g.p026i.C0169c f608a;

        C0170a(p000a.p018g.p026i.C0169c r1) {
                r0 = this;
                r0.f608a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r1) goto L_0x0008
                return r1
            L_0x0008:
                a.g.i.c r0 = r2.f608a
                java.lang.Object r3 = r3.obj
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                r0.m3579a(r3)
                return r1
            L_0x0012:
                a.g.i.c r3 = r2.f608a
                r3.m3580a()
                return r1
        }
    }

    /* renamed from: a.g.i.c$b */
    /* loaded from: classes.dex */
    class RunnableC0171b implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ java.util.concurrent.Callable f609b;

        /* renamed from: c */
        final /* synthetic */ android.os.Handler f610c;

        /* renamed from: d */
        final /* synthetic */ p000a.p018g.p026i.C0169c.AbstractC0174d f611d;

        /* renamed from: a.g.i.c$b$a */
        /* loaded from: classes.dex */
        class RunnableC0172a implements java.lang.Runnable {

            /* renamed from: b */
            final /* synthetic */ java.lang.Object f612b;

            /* renamed from: c */
            final /* synthetic */ p000a.p018g.p026i.C0169c.RunnableC0171b f613c;

            RunnableC0172a(p000a.p018g.p026i.C0169c.RunnableC0171b r1, java.lang.Object r2) {
                    r0 = this;
                    r0.f613c = r1
                    r0.f612b = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    a.g.i.c$b r0 = r2.f613c
                    a.g.i.c$d r0 = r0.f611d
                    java.lang.Object r1 = r2.f612b
                    r0.mo3575a(r1)
                    return
            }
        }

        RunnableC0171b(p000a.p018g.p026i.C0169c r1, java.util.concurrent.Callable r2, android.os.Handler r3, p000a.p018g.p026i.C0169c.AbstractC0174d r4) {
                r0 = this;
                r0.f609b = r2
                r0.f610c = r3
                r0.f611d = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.util.concurrent.Callable r0 = r3.f609b     // Catch: Exception -> 0x0007
                java.lang.Object r0 = r0.call()     // Catch: Exception -> 0x0007
                goto L_0x0008
            L_0x0007:
                r0 = 0
            L_0x0008:
                android.os.Handler r1 = r3.f610c
                a.g.i.c$b$a r2 = new a.g.i.c$b$a
                r2.<init>(r3, r0)
                r1.post(r2)
                return
        }
    }

    /* renamed from: a.g.i.c$c */
    /* loaded from: classes.dex */
    class RunnableC0173c implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference f614b;

        /* renamed from: c */
        final /* synthetic */ java.util.concurrent.Callable f615c;

        /* renamed from: d */
        final /* synthetic */ java.util.concurrent.locks.ReentrantLock f616d;

        /* renamed from: e */
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f617e;

        /* renamed from: f */
        final /* synthetic */ java.util.concurrent.locks.Condition f618f;

        RunnableC0173c(p000a.p018g.p026i.C0169c r1, java.util.concurrent.atomic.AtomicReference r2, java.util.concurrent.Callable r3, java.util.concurrent.locks.ReentrantLock r4, java.util.concurrent.atomic.AtomicBoolean r5, java.util.concurrent.locks.Condition r6) {
                r0 = this;
                r0.f614b = r2
                r0.f615c = r3
                r0.f616d = r4
                r0.f617e = r5
                r0.f618f = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r2.f614b     // Catch: Exception -> 0x000b
                java.util.concurrent.Callable r1 = r2.f615c     // Catch: Exception -> 0x000b
                java.lang.Object r1 = r1.call()     // Catch: Exception -> 0x000b
                r0.set(r1)     // Catch: Exception -> 0x000b
            L_0x000b:
                java.util.concurrent.locks.ReentrantLock r0 = r2.f616d
                r0.lock()
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.f617e     // Catch: all -> 0x0021
                r1 = 0
                r0.set(r1)     // Catch: all -> 0x0021
                java.util.concurrent.locks.Condition r0 = r2.f618f     // Catch: all -> 0x0021
                r0.signal()     // Catch: all -> 0x0021
                java.util.concurrent.locks.ReentrantLock r0 = r2.f616d
                r0.unlock()
                return
            L_0x0021:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r1 = r2.f616d
                r1.unlock()
                throw r0
        }
    }

    /* renamed from: a.g.i.c$d */
    /* loaded from: classes.dex */
    public interface AbstractC0174d<T> {
        /* renamed from: a */
        void mo3575a(T r1);
    }

    public C0169c(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f600a = r0
            a.g.i.c$a r0 = new a.g.i.c$a
            r0.<init>(r1)
            r1.f604e = r0
            r1.f607h = r2
            r1.f606g = r3
            r1.f605f = r4
            r2 = 0
            r1.f603d = r2
            return
    }

    /* renamed from: b */
    private void m3576b(java.lang.Runnable r6) {
            r5 = this;
            java.lang.Object r0 = r5.f600a
            monitor-enter(r0)
            android.os.HandlerThread r1 = r5.f601b     // Catch: all -> 0x003f
            r2 = 1
            if (r1 != 0) goto L_0x002c
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: all -> 0x003f
            java.lang.String r3 = r5.f607h     // Catch: all -> 0x003f
            int r4 = r5.f606g     // Catch: all -> 0x003f
            r1.<init>(r3, r4)     // Catch: all -> 0x003f
            r5.f601b = r1     // Catch: all -> 0x003f
            android.os.HandlerThread r1 = r5.f601b     // Catch: all -> 0x003f
            r1.start()     // Catch: all -> 0x003f
            android.os.Handler r1 = new android.os.Handler     // Catch: all -> 0x003f
            android.os.HandlerThread r3 = r5.f601b     // Catch: all -> 0x003f
            android.os.Looper r3 = r3.getLooper()     // Catch: all -> 0x003f
            android.os.Handler$Callback r4 = r5.f604e     // Catch: all -> 0x003f
            r1.<init>(r3, r4)     // Catch: all -> 0x003f
            r5.f602c = r1     // Catch: all -> 0x003f
            int r1 = r5.f603d     // Catch: all -> 0x003f
            int r1 = r1 + r2
            r5.f603d = r1     // Catch: all -> 0x003f
        L_0x002c:
            android.os.Handler r1 = r5.f602c     // Catch: all -> 0x003f
            r3 = 0
            r1.removeMessages(r3)     // Catch: all -> 0x003f
            android.os.Handler r1 = r5.f602c     // Catch: all -> 0x003f
            android.os.Handler r3 = r5.f602c     // Catch: all -> 0x003f
            android.os.Message r6 = r3.obtainMessage(r2, r6)     // Catch: all -> 0x003f
            r1.sendMessage(r6)     // Catch: all -> 0x003f
            monitor-exit(r0)     // Catch: all -> 0x003f
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x003f
            throw r6
    }

    /* renamed from: a */
    public <T> T m3578a(java.util.concurrent.Callable<T> r13, int r14) {
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            a.g.i.c$c r11 = new a.g.i.c$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.m3576b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch: all -> 0x005c
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch: all -> 0x005c
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: all -> 0x005c
            long r0 = (long) r14     // Catch: all -> 0x005c
            long r13 = r13.toNanos(r0)     // Catch: all -> 0x005c
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch: InterruptedException -> 0x003f, all -> 0x005c
        L_0x003f:
            boolean r0 = r10.get()     // Catch: all -> 0x005c
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch: all -> 0x005c
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch: all -> 0x005c
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch: all -> 0x005c
            throw r13     // Catch: all -> 0x005c
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            goto L_0x0062
        L_0x0061:
            throw r13
        L_0x0062:
            goto L_0x0061
    }

    /* renamed from: a */
    void m3580a() {
            r3 = this;
            java.lang.Object r0 = r3.f600a
            monitor-enter(r0)
            android.os.Handler r1 = r3.f602c     // Catch: all -> 0x001a
            r2 = 1
            boolean r1 = r1.hasMessages(r2)     // Catch: all -> 0x001a
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch: all -> 0x001a
            return
        L_0x000e:
            android.os.HandlerThread r1 = r3.f601b     // Catch: all -> 0x001a
            r1.quit()     // Catch: all -> 0x001a
            r1 = 0
            r3.f601b = r1     // Catch: all -> 0x001a
            r3.f602c = r1     // Catch: all -> 0x001a
            monitor-exit(r0)     // Catch: all -> 0x001a
            return
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x001a
            throw r1
    }

    /* renamed from: a */
    void m3579a(java.lang.Runnable r5) {
            r4 = this;
            r5.run()
            java.lang.Object r5 = r4.f600a
            monitor-enter(r5)
            android.os.Handler r0 = r4.f602c     // Catch: all -> 0x001c
            r1 = 0
            r0.removeMessages(r1)     // Catch: all -> 0x001c
            android.os.Handler r0 = r4.f602c     // Catch: all -> 0x001c
            android.os.Handler r2 = r4.f602c     // Catch: all -> 0x001c
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch: all -> 0x001c
            int r2 = r4.f605f     // Catch: all -> 0x001c
            long r2 = (long) r2     // Catch: all -> 0x001c
            r0.sendMessageDelayed(r1, r2)     // Catch: all -> 0x001c
            monitor-exit(r5)     // Catch: all -> 0x001c
            return
        L_0x001c:
            r0 = move-exception
            monitor-exit(r5)     // Catch: all -> 0x001c
            throw r0
    }

    /* renamed from: a */
    public <T> void m3577a(java.util.concurrent.Callable<T> r3, p000a.p018g.p026i.C0169c.AbstractC0174d<T> r4) {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            a.g.i.c$b r1 = new a.g.i.c$b
            r1.<init>(r2, r3, r0, r4)
            r2.m3576b(r1)
            return
    }
}
