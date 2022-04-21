package p000a.p036j.p037a;

/* renamed from: a.j.a.g */
/* loaded from: classes.dex */
public abstract class AbstractC0261g<E> extends p000a.p036j.p037a.AbstractC0259e {

    /* renamed from: a */
    private final android.app.Activity f851a;

    /* renamed from: b */
    private final android.content.Context f852b;

    /* renamed from: c */
    private final android.os.Handler f853c;

    /* renamed from: d */
    final p000a.p036j.p037a.LayoutInflater$Factory2C0266i f854d;

    AbstractC0261g(p000a.p036j.p037a.ActivityC0255d r3) {
            r2 = this;
            android.os.Handler r0 = r3.f836c
            r1 = 0
            r2.<init>(r3, r3, r0, r1)
            return
    }

    AbstractC0261g(android.app.Activity r1, android.content.Context r2, android.os.Handler r3, int r4) {
            r0 = this;
            r0.<init>()
            a.j.a.i r4 = new a.j.a.i
            r4.<init>()
            r0.f854d = r4
            r0.f851a = r1
            java.lang.String r1 = "context == null"
            p000a.p018g.p028k.C0184g.m3555a(r2, r1)
            android.content.Context r2 = (android.content.Context) r2
            r0.f852b = r2
            java.lang.String r1 = "handler == null"
            p000a.p018g.p028k.C0184g.m3555a(r3, r1)
            android.os.Handler r3 = (android.os.Handler) r3
            r0.f853c = r3
            return
    }

    /* renamed from: a */
    abstract void mo3141a(p000a.p036j.p037a.ComponentCallbacksC0248c r1);

    /* renamed from: a */
    public abstract void mo3140a(p000a.p036j.p037a.ComponentCallbacksC0248c r1, android.content.Intent r2, int r3, android.os.Bundle r4);

    /* renamed from: a */
    public abstract void mo3139a(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4);

    /* renamed from: b */
    android.app.Activity m3138b() {
            r1 = this;
            android.app.Activity r0 = r1.f851a
            return r0
    }

    /* renamed from: b */
    public abstract boolean mo3137b(p000a.p036j.p037a.ComponentCallbacksC0248c r1);

    /* renamed from: c */
    android.content.Context m3136c() {
            r1 = this;
            android.content.Context r0 = r1.f852b
            return r0
    }

    /* renamed from: d */
    p000a.p036j.p037a.LayoutInflater$Factory2C0266i m3135d() {
            r1 = this;
            a.j.a.i r0 = r1.f854d
            return r0
    }

    /* renamed from: e */
    android.os.Handler m3134e() {
            r1 = this;
            android.os.Handler r0 = r1.f853c
            return r0
    }

    /* renamed from: f */
    public abstract android.view.LayoutInflater mo3133f();

    /* renamed from: g */
    public abstract int mo3132g();

    /* renamed from: h */
    public abstract boolean mo3131h();

    /* renamed from: i */
    public abstract void mo3130i();
}
