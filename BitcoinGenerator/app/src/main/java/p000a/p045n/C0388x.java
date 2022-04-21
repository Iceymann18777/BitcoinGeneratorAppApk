package p000a.p045n;

/* renamed from: a.n.x */
/* loaded from: classes.dex */
class C0388x {
    /* renamed from: a */
    static p000a.p045n.AbstractC0387w m2766a(android.view.ViewGroup r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L_0x000c
            a.n.v r0 = new a.n.v
            r0.<init>(r2)
            return r0
        L_0x000c:
            a.n.u r2 = p000a.p045n.C0385u.m2771a(r2)
            return r2
    }

    /* renamed from: a */
    static void m2765a(android.view.ViewGroup r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L_0x000a
            p000a.p045n.C0391z.m2761a(r2, r3)
            goto L_0x000d
        L_0x000a:
            p000a.p045n.C0389y.m2763a(r2, r3)
        L_0x000d:
            return
    }
}
