package p000a.p007b.p008a.p009a;

/* renamed from: a.b.a.a.b */
/* loaded from: classes.dex */
public class C0045b extends p000a.p007b.p008a.p009a.AbstractC0047c {

    /* renamed from: a */
    private final java.lang.Object f160a;

    /* renamed from: b */
    private final java.util.concurrent.ExecutorService f161b;

    /* renamed from: c */
    private volatile android.os.Handler f162c;

    /* renamed from: a.b.a.a.b$a */
    /* loaded from: classes.dex */
    class ThreadFactoryC0046a implements java.util.concurrent.ThreadFactory {

        /* renamed from: a */
        private final java.util.concurrent.atomic.AtomicInteger f163a;

        ThreadFactoryC0046a(p000a.p007b.p008a.p009a.C0045b r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r0 = 0
                r2.<init>(r0)
                r1.f163a = r2
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r4)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.util.concurrent.atomic.AtomicInteger r1 = r3.f163a
                int r1 = r1.getAndIncrement()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 0
                r4[r2] = r1
                java.lang.String r1 = "arch_disk_io_%d"
                java.lang.String r4 = java.lang.String.format(r1, r4)
                r0.setName(r4)
                return r0
        }
    }

    public C0045b() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f160a = r0
            a.b.a.a.b$a r0 = new a.b.a.a.b$a
            r0.<init>(r2)
            r1 = 2
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r2.f161b = r0
            return
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: a */
    public void mo4146a(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f161b
            r0.execute(r2)
            return
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: a */
    public boolean mo4147a() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: b */
    public void mo4145b(java.lang.Runnable r4) {
            r3 = this;
            android.os.Handler r0 = r3.f162c
            if (r0 != 0) goto L_0x001b
            java.lang.Object r0 = r3.f160a
            monitor-enter(r0)
            android.os.Handler r1 = r3.f162c     // Catch: all -> 0x0018
            if (r1 != 0) goto L_0x0016
            android.os.Handler r1 = new android.os.Handler     // Catch: all -> 0x0018
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: all -> 0x0018
            r1.<init>(r2)     // Catch: all -> 0x0018
            r3.f162c = r1     // Catch: all -> 0x0018
        L_0x0016:
            monitor-exit(r0)     // Catch: all -> 0x0018
            goto L_0x001b
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0018
            throw r4
        L_0x001b:
            android.os.Handler r0 = r3.f162c
            r0.post(r4)
            return
    }
}
