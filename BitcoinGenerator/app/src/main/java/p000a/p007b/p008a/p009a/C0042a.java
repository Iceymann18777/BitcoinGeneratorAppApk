package p000a.p007b.p008a.p009a;

/* renamed from: a.b.a.a.a */
/* loaded from: classes.dex */
public class C0042a extends p000a.p007b.p008a.p009a.AbstractC0047c {

    /* renamed from: c */
    private static volatile p000a.p007b.p008a.p009a.C0042a f157c;

    /* renamed from: a */
    private p000a.p007b.p008a.p009a.AbstractC0047c f158a;

    /* renamed from: b */
    private p000a.p007b.p008a.p009a.AbstractC0047c f159b;

    /* renamed from: a.b.a.a.a$a */
    /* loaded from: classes.dex */
    static class ExecutorC0043a implements java.util.concurrent.Executor {
        ExecutorC0043a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                a.b.a.a.a r0 = p000a.p007b.p008a.p009a.C0042a.m4148b()
                r0.mo4145b(r2)
                return
        }
    }

    /* renamed from: a.b.a.a.a$b */
    /* loaded from: classes.dex */
    static class ExecutorC0044b implements java.util.concurrent.Executor {
        ExecutorC0044b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                a.b.a.a.a r0 = p000a.p007b.p008a.p009a.C0042a.m4148b()
                r0.mo4146a(r2)
                return
        }
    }

    static {
            a.b.a.a.a$a r0 = new a.b.a.a.a$a
            r0.<init>()
            a.b.a.a.a$b r0 = new a.b.a.a.a$b
            r0.<init>()
            return
    }

    private C0042a() {
            r1 = this;
            r1.<init>()
            a.b.a.a.b r0 = new a.b.a.a.b
            r0.<init>()
            r1.f159b = r0
            a.b.a.a.c r0 = r1.f159b
            r1.f158a = r0
            return
    }

    /* renamed from: b */
    public static p000a.p007b.p008a.p009a.C0042a m4148b() {
            a.b.a.a.a r0 = p000a.p007b.p008a.p009a.C0042a.f157c
            if (r0 == 0) goto L_0x0007
            a.b.a.a.a r0 = p000a.p007b.p008a.p009a.C0042a.f157c
            return r0
        L_0x0007:
            java.lang.Class<a.b.a.a.a> r0 = p000a.p007b.p008a.p009a.C0042a.class
            monitor-enter(r0)
            a.b.a.a.a r1 = p000a.p007b.p008a.p009a.C0042a.f157c     // Catch: all -> 0x0019
            if (r1 != 0) goto L_0x0015
            a.b.a.a.a r1 = new a.b.a.a.a     // Catch: all -> 0x0019
            r1.<init>()     // Catch: all -> 0x0019
            p000a.p007b.p008a.p009a.C0042a.f157c = r1     // Catch: all -> 0x0019
        L_0x0015:
            monitor-exit(r0)     // Catch: all -> 0x0019
            a.b.a.a.a r0 = p000a.p007b.p008a.p009a.C0042a.f157c
            return r0
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0019
            throw r1
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: a */
    public void mo4146a(java.lang.Runnable r2) {
            r1 = this;
            a.b.a.a.c r0 = r1.f158a
            r0.mo4146a(r2)
            return
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: a */
    public boolean mo4147a() {
            r1 = this;
            a.b.a.a.c r0 = r1.f158a
            boolean r0 = r0.mo4147a()
            return r0
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: b */
    public void mo4145b(java.lang.Runnable r2) {
            r1 = this;
            a.b.a.a.c r0 = r1.f158a
            r0.mo4145b(r2)
            return
    }
}
