package p000a.p018g.p029l;

/* renamed from: a.g.l.z */
/* loaded from: classes.dex */
public class C0230z {

    /* renamed from: a */
    private final java.lang.Object f685a;

    private C0230z(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f685a = r1
            return
    }

    /* renamed from: a */
    static p000a.p018g.p029l.C0230z m3359a(java.lang.Object r1) {
            if (r1 != 0) goto L_0x0004
            r1 = 0
            goto L_0x000a
        L_0x0004:
            a.g.l.z r0 = new a.g.l.z
            r0.<init>(r1)
            r1 = r0
        L_0x000a:
            return r1
    }

    /* renamed from: a */
    static java.lang.Object m3360a(p000a.p018g.p029l.C0230z r0) {
            if (r0 != 0) goto L_0x0004
            r0 = 0
            goto L_0x0006
        L_0x0004:
            java.lang.Object r0 = r0.f685a
        L_0x0006:
            return r0
    }

    /* renamed from: a */
    public p000a.p018g.p029l.C0230z m3362a() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto L_0x0014
            a.g.l.z r0 = new a.g.l.z
            java.lang.Object r1 = r2.f685a
            android.view.WindowInsets r1 = (android.view.WindowInsets) r1
            android.view.WindowInsets r1 = r1.consumeSystemWindowInsets()
            r0.<init>(r1)
            return r0
        L_0x0014:
            r0 = 0
            return r0
    }

    /* renamed from: a */
    public p000a.p018g.p029l.C0230z m3361a(int r3, int r4, int r5, int r6) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto L_0x0014
            a.g.l.z r0 = new a.g.l.z
            java.lang.Object r1 = r2.f685a
            android.view.WindowInsets r1 = (android.view.WindowInsets) r1
            android.view.WindowInsets r3 = r1.replaceSystemWindowInsets(r3, r4, r5, r6)
            r0.<init>(r3)
            return r0
        L_0x0014:
            r3 = 0
            return r3
    }

    /* renamed from: b */
    public int m3358b() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto L_0x000f
            java.lang.Object r0 = r2.f685a
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetBottom()
            return r0
        L_0x000f:
            r0 = 0
            return r0
    }

    /* renamed from: c */
    public int m3357c() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto L_0x000f
            java.lang.Object r0 = r2.f685a
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetLeft()
            return r0
        L_0x000f:
            r0 = 0
            return r0
    }

    /* renamed from: d */
    public int m3356d() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto L_0x000f
            java.lang.Object r0 = r2.f685a
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetRight()
            return r0
        L_0x000f:
            r0 = 0
            return r0
    }

    /* renamed from: e */
    public int m3355e() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto L_0x000f
            java.lang.Object r0 = r2.f685a
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            return r0
        L_0x000f:
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r5 == 0) goto L_0x0022
            java.lang.Class<a.g.l.z> r2 = p000a.p018g.p029l.C0230z.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L_0x0010
            goto L_0x0022
        L_0x0010:
            a.g.l.z r5 = (p000a.p018g.p029l.C0230z) r5
            java.lang.Object r2 = r4.f685a
            java.lang.Object r5 = r5.f685a
            if (r2 != 0) goto L_0x001d
            if (r5 != 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            r0 = 0
            goto L_0x0021
        L_0x001d:
            boolean r0 = r2.equals(r5)
        L_0x0021:
            return r0
        L_0x0022:
            return r1
    }

    /* renamed from: f */
    public boolean m3354f() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto L_0x000f
            java.lang.Object r0 = r2.f685a
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            boolean r0 = r0.hasSystemWindowInsets()
            return r0
        L_0x000f:
            r0 = 0
            return r0
    }

    /* renamed from: g */
    public boolean m3353g() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000f
            java.lang.Object r0 = r2.f685a
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            boolean r0 = r0.isConsumed()
            return r0
        L_0x000f:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f685a
            if (r0 != 0) goto L_0x0006
            r0 = 0
            goto L_0x000a
        L_0x0006:
            int r0 = r0.hashCode()
        L_0x000a:
            return r0
    }
}
