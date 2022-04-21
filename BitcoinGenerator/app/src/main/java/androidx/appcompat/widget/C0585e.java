package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
class C0585e {

    /* renamed from: a */
    private final android.view.View f2089a;

    /* renamed from: b */
    private final androidx.appcompat.widget.C0606j f2090b;

    /* renamed from: c */
    private int f2091c;

    /* renamed from: d */
    private androidx.appcompat.widget.C0634r0 f2092d;

    /* renamed from: e */
    private androidx.appcompat.widget.C0634r0 f2093e;

    /* renamed from: f */
    private androidx.appcompat.widget.C0634r0 f2094f;

    C0585e(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f2091c = r0
            r1.f2089a = r2
            androidx.appcompat.widget.j r2 = androidx.appcompat.widget.C0606j.m2013a()
            r1.f2090b = r2
            return
    }

    /* renamed from: b */
    private boolean m2081b(android.graphics.drawable.Drawable r4) {
            r3 = this;
            androidx.appcompat.widget.r0 r0 = r3.f2094f
            if (r0 != 0) goto L_0x000b
            androidx.appcompat.widget.r0 r0 = new androidx.appcompat.widget.r0
            r0.<init>()
            r3.f2094f = r0
        L_0x000b:
            androidx.appcompat.widget.r0 r0 = r3.f2094f
            r0.m1909a()
            android.view.View r1 = r3.f2089a
            android.content.res.ColorStateList r1 = p000a.p018g.p029l.C0216r.m3428b(r1)
            r2 = 1
            if (r1 == 0) goto L_0x001d
            r0.f2275d = r2
            r0.f2272a = r1
        L_0x001d:
            android.view.View r1 = r3.f2089a
            android.graphics.PorterDuff$Mode r1 = p000a.p018g.p029l.C0216r.m3423c(r1)
            if (r1 == 0) goto L_0x0029
            r0.f2274c = r2
            r0.f2273b = r1
        L_0x0029:
            boolean r1 = r0.f2275d
            if (r1 != 0) goto L_0x0034
            boolean r1 = r0.f2274c
            if (r1 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r4 = 0
            return r4
        L_0x0034:
            android.view.View r1 = r3.f2089a
            int[] r1 = r1.getDrawableState()
            androidx.appcompat.widget.C0606j.m1998a(r4, r0, r1)
            return r2
    }

    /* renamed from: d */
    private boolean m2079d() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 21
            if (r0 <= r3) goto L_0x000f
            androidx.appcompat.widget.r0 r0 = r4.f2092d
            if (r0 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            return r1
        L_0x000f:
            if (r0 != r3) goto L_0x0012
            return r1
        L_0x0012:
            return r2
    }

    /* renamed from: a */
    void m2089a() {
            r3 = this;
            android.view.View r0 = r3.f2089a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x0030
            boolean r1 = r3.m2079d()
            if (r1 == 0) goto L_0x0015
            boolean r1 = r3.m2081b(r0)
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            androidx.appcompat.widget.r0 r1 = r3.f2093e
            if (r1 == 0) goto L_0x0023
            android.view.View r2 = r3.f2089a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.C0606j.m1998a(r0, r1, r2)
            goto L_0x0030
        L_0x0023:
            androidx.appcompat.widget.r0 r1 = r3.f2092d
            if (r1 == 0) goto L_0x0030
            android.view.View r2 = r3.f2089a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.C0606j.m1998a(r0, r1, r2)
        L_0x0030:
            return
    }

    /* renamed from: a */
    void m2088a(int r3) {
            r2 = this;
            r2.f2091c = r3
            androidx.appcompat.widget.j r0 = r2.f2090b
            if (r0 == 0) goto L_0x0011
            android.view.View r1 = r2.f2089a
            android.content.Context r1 = r1.getContext()
            android.content.res.ColorStateList r3 = r0.m1992b(r1, r3)
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            r2.m2087a(r3)
            r2.m2089a()
            return
    }

    /* renamed from: a */
    void m2087a(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L_0x0015
            androidx.appcompat.widget.r0 r0 = r1.f2092d
            if (r0 != 0) goto L_0x000d
            androidx.appcompat.widget.r0 r0 = new androidx.appcompat.widget.r0
            r0.<init>()
            r1.f2092d = r0
        L_0x000d:
            androidx.appcompat.widget.r0 r0 = r1.f2092d
            r0.f2272a = r2
            r2 = 1
            r0.f2275d = r2
            goto L_0x0018
        L_0x0015:
            r2 = 0
            r1.f2092d = r2
        L_0x0018:
            r1.m2089a()
            return
    }

    /* renamed from: a */
    void m2086a(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.r0 r0 = r1.f2093e
            if (r0 != 0) goto L_0x000b
            androidx.appcompat.widget.r0 r0 = new androidx.appcompat.widget.r0
            r0.<init>()
            r1.f2093e = r0
        L_0x000b:
            androidx.appcompat.widget.r0 r0 = r1.f2093e
            r0.f2273b = r2
            r2 = 1
            r0.f2274c = r2
            r1.m2089a()
            return
    }

    /* renamed from: a */
    void m2085a(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r1 = -1
            r0.f2091c = r1
            r1 = 0
            r0.m2087a(r1)
            r0.m2089a()
            return
    }

    /* renamed from: a */
    void m2084a(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.view.View r0 = r3.f2089a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p000a.p001a.C0009j.ViewBackgroundHelper
            r2 = 0
            androidx.appcompat.widget.t0 r4 = androidx.appcompat.widget.C0638t0.m1900a(r0, r4, r1, r5, r2)
            int r5 = p000a.p001a.C0009j.ViewBackgroundHelper_android_background     // Catch: all -> 0x0060
            boolean r5 = r4.m1889g(r5)     // Catch: all -> 0x0060
            r0 = -1
            if (r5 == 0) goto L_0x0031
            int r5 = p000a.p001a.C0009j.ViewBackgroundHelper_android_background     // Catch: all -> 0x0060
            int r5 = r4.m1888g(r5, r0)     // Catch: all -> 0x0060
            r3.f2091c = r5     // Catch: all -> 0x0060
            androidx.appcompat.widget.j r5 = r3.f2090b     // Catch: all -> 0x0060
            android.view.View r1 = r3.f2089a     // Catch: all -> 0x0060
            android.content.Context r1 = r1.getContext()     // Catch: all -> 0x0060
            int r2 = r3.f2091c     // Catch: all -> 0x0060
            android.content.res.ColorStateList r5 = r5.m1992b(r1, r2)     // Catch: all -> 0x0060
            if (r5 == 0) goto L_0x0031
            r3.m2087a(r5)     // Catch: all -> 0x0060
        L_0x0031:
            int r5 = p000a.p001a.C0009j.ViewBackgroundHelper_backgroundTint     // Catch: all -> 0x0060
            boolean r5 = r4.m1889g(r5)     // Catch: all -> 0x0060
            if (r5 == 0) goto L_0x0044
            android.view.View r5 = r3.f2089a     // Catch: all -> 0x0060
            int r1 = p000a.p001a.C0009j.ViewBackgroundHelper_backgroundTint     // Catch: all -> 0x0060
            android.content.res.ColorStateList r1 = r4.m1907a(r1)     // Catch: all -> 0x0060
            p000a.p018g.p029l.C0216r.m3437a(r5, r1)     // Catch: all -> 0x0060
        L_0x0044:
            int r5 = p000a.p001a.C0009j.ViewBackgroundHelper_backgroundTintMode     // Catch: all -> 0x0060
            boolean r5 = r4.m1889g(r5)     // Catch: all -> 0x0060
            if (r5 == 0) goto L_0x005c
            android.view.View r5 = r3.f2089a     // Catch: all -> 0x0060
            int r1 = p000a.p001a.C0009j.ViewBackgroundHelper_backgroundTintMode     // Catch: all -> 0x0060
            int r0 = r4.m1894d(r1, r0)     // Catch: all -> 0x0060
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0580c0.m2107a(r0, r1)     // Catch: all -> 0x0060
            p000a.p018g.p029l.C0216r.m3436a(r5, r0)     // Catch: all -> 0x0060
        L_0x005c:
            r4.m1908a()
            return
        L_0x0060:
            r5 = move-exception
            r4.m1908a()
            throw r5
    }

    /* renamed from: b */
    android.content.res.ColorStateList m2083b() {
            r1 = this;
            androidx.appcompat.widget.r0 r0 = r1.f2093e
            if (r0 == 0) goto L_0x0007
            android.content.res.ColorStateList r0 = r0.f2272a
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            return r0
    }

    /* renamed from: b */
    void m2082b(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.r0 r0 = r1.f2093e
            if (r0 != 0) goto L_0x000b
            androidx.appcompat.widget.r0 r0 = new androidx.appcompat.widget.r0
            r0.<init>()
            r1.f2093e = r0
        L_0x000b:
            androidx.appcompat.widget.r0 r0 = r1.f2093e
            r0.f2272a = r2
            r2 = 1
            r0.f2275d = r2
            r1.m2089a()
            return
    }

    /* renamed from: c */
    android.graphics.PorterDuff.Mode m2080c() {
            r1 = this;
            androidx.appcompat.widget.r0 r0 = r1.f2093e
            if (r0 == 0) goto L_0x0007
            android.graphics.PorterDuff$Mode r0 = r0.f2273b
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            return r0
    }
}
