package com.google.android.material.appbar;

/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes.dex */
class C0924d {

    /* renamed from: a */
    private final android.view.View f3401a;

    /* renamed from: b */
    private int f3402b;

    /* renamed from: c */
    private int f3403c;

    /* renamed from: d */
    private int f3404d;

    /* renamed from: e */
    private int f3405e;

    public C0924d(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.f3401a = r1
            return
    }

    /* renamed from: c */
    private void m316c() {
            r4 = this;
            android.view.View r0 = r4.f3401a
            int r1 = r4.f3404d
            int r2 = r0.getTop()
            int r3 = r4.f3402b
            int r2 = r2 - r3
            int r1 = r1 - r2
            p000a.p018g.p029l.C0216r.m3420d(r0, r1)
            android.view.View r0 = r4.f3401a
            int r1 = r4.f3405e
            int r2 = r0.getLeft()
            int r3 = r4.f3403c
            int r2 = r2 - r3
            int r1 = r1 - r2
            p000a.p018g.p029l.C0216r.m3422c(r0, r1)
            return
    }

    /* renamed from: a */
    public int m320a() {
            r1 = this;
            int r0 = r1.f3404d
            return r0
    }

    /* renamed from: a */
    public boolean m319a(int r2) {
            r1 = this;
            int r0 = r1.f3405e
            if (r0 == r2) goto L_0x000b
            r1.f3405e = r2
            r1.m316c()
            r2 = 1
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: b */
    public void m318b() {
            r1 = this;
            android.view.View r0 = r1.f3401a
            int r0 = r0.getTop()
            r1.f3402b = r0
            android.view.View r0 = r1.f3401a
            int r0 = r0.getLeft()
            r1.f3403c = r0
            r1.m316c()
            return
    }

    /* renamed from: b */
    public boolean m317b(int r2) {
            r1 = this;
            int r0 = r1.f3404d
            if (r0 == r2) goto L_0x000b
            r1.f3404d = r2
            r1.m316c()
            r2 = 1
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }
}
