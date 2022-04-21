package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.o */
/* loaded from: classes.dex */
public class C0511o implements androidx.appcompat.view.menu.AbstractC0500j {

    /* renamed from: a */
    private final android.content.Context f1773a;

    /* renamed from: b */
    private final androidx.appcompat.view.menu.C0496h f1774b;

    /* renamed from: c */
    private final boolean f1775c;

    /* renamed from: d */
    private final int f1776d;

    /* renamed from: e */
    private final int f1777e;

    /* renamed from: f */
    private android.view.View f1778f;

    /* renamed from: g */
    private int f1779g;

    /* renamed from: h */
    private boolean f1780h;

    /* renamed from: i */
    private androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a f1781i;

    /* renamed from: j */
    private androidx.appcompat.view.menu.AbstractC0510n f1782j;

    /* renamed from: k */
    private android.widget.PopupWindow.OnDismissListener f1783k;

    /* renamed from: l */
    private final android.widget.PopupWindow.OnDismissListener f1784l;

    /* renamed from: androidx.appcompat.view.menu.o$a */
    /* loaded from: classes.dex */
    class C0512a implements android.widget.PopupWindow.OnDismissListener {

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.view.menu.C0511o f1785b;

        C0512a(androidx.appcompat.view.menu.C0511o r1) {
                r0 = this;
                r0.f1785b = r1
                r0.<init>()
                return
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
                r1 = this;
                androidx.appcompat.view.menu.o r0 = r1.f1785b
                r0.mo2110d()
                return
        }
    }

    public C0511o(android.content.Context r8, androidx.appcompat.view.menu.C0496h r9, android.view.View r10, boolean r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C0511o(android.content.Context r2, androidx.appcompat.view.menu.C0496h r3, android.view.View r4, boolean r5, int r6, int r7) {
            r1 = this;
            r1.<init>()
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.f1779g = r0
            androidx.appcompat.view.menu.o$a r0 = new androidx.appcompat.view.menu.o$a
            r0.<init>(r1)
            r1.f1784l = r0
            r1.f1773a = r2
            r1.f1774b = r3
            r1.f1778f = r4
            r1.f1775c = r5
            r1.f1776d = r6
            r1.f1777e = r7
            return
    }

    /* renamed from: a */
    private void m2325a(int r4, int r5, boolean r6, boolean r7) {
            r3 = this;
            androidx.appcompat.view.menu.n r0 = r3.m2320b()
            r0.mo2304c(r7)
            if (r6 == 0) goto L_0x0049
            int r6 = r3.f1779g
            android.view.View r7 = r3.f1778f
            int r7 = p000a.p018g.p029l.C0216r.m3411j(r7)
            int r6 = p000a.p018g.p029l.C0200c.m3490a(r6, r7)
            r6 = r6 & 7
            r7 = 5
            if (r6 != r7) goto L_0x0021
            android.view.View r6 = r3.f1778f
            int r6 = r6.getWidth()
            int r4 = r4 - r6
        L_0x0021:
            r0.mo2307b(r4)
            r0.mo2305c(r5)
            android.content.Context r6 = r3.f1773a
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1111490560(0x42400000, float:48.0)
            float r6 = r6 * r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            int r6 = (int) r6
            android.graphics.Rect r7 = new android.graphics.Rect
            int r1 = r4 - r6
            int r2 = r5 - r6
            int r4 = r4 + r6
            int r5 = r5 + r6
            r7.<init>(r1, r2, r4, r5)
            r0.m2334a(r7)
        L_0x0049:
            r0.mo1833f()
            return
    }

    /* renamed from: g */
    private androidx.appcompat.view.menu.AbstractC0510n m2316g() {
            r14 = this;
            android.content.Context r0 = r14.f1773a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1773a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p000a.p001a.C0003d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.e r0 = new androidx.appcompat.view.menu.e
            android.content.Context r2 = r14.f1773a
            android.view.View r3 = r14.f1778f
            int r4 = r14.f1776d
            int r5 = r14.f1777e
            boolean r6 = r14.f1775c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.u r0 = new androidx.appcompat.view.menu.u
            android.content.Context r8 = r14.f1773a
            androidx.appcompat.view.menu.h r9 = r14.f1774b
            android.view.View r10 = r14.f1778f
            int r11 = r14.f1776d
            int r12 = r14.f1777e
            boolean r13 = r14.f1775c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.h r1 = r14.f1774b
            r0.mo2309a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1784l
            r0.mo2310a(r1)
            android.view.View r1 = r14.f1778f
            r0.mo2311a(r1)
            androidx.appcompat.view.menu.p$a r1 = r14.f1781i
            r0.mo2308a(r1)
            boolean r1 = r14.f1780h
            r0.mo2306b(r1)
            int r1 = r14.f1779g
            r0.mo2312a(r1)
            return r0
    }

    /* renamed from: a */
    public void m2328a() {
            r1 = this;
            boolean r0 = r1.m2319c()
            if (r0 == 0) goto L_0x000b
            androidx.appcompat.view.menu.n r0 = r1.f1782j
            r0.dismiss()
        L_0x000b:
            return
    }

    /* renamed from: a */
    public void m2327a(int r1) {
            r0 = this;
            r0.f1779g = r1
            return
    }

    /* renamed from: a */
    public void m2324a(android.view.View r1) {
            r0 = this;
            r0.f1778f = r1
            return
    }

    /* renamed from: a */
    public void m2323a(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f1783k = r1
            return
    }

    /* renamed from: a */
    public void m2322a(androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a r2) {
            r1 = this;
            r1.f1781i = r2
            androidx.appcompat.view.menu.n r0 = r1.f1782j
            if (r0 == 0) goto L_0x0009
            r0.mo2308a(r2)
        L_0x0009:
            return
    }

    /* renamed from: a */
    public void m2321a(boolean r2) {
            r1 = this;
            r1.f1780h = r2
            androidx.appcompat.view.menu.n r0 = r1.f1782j
            if (r0 == 0) goto L_0x0009
            r0.mo2306b(r2)
        L_0x0009:
            return
    }

    /* renamed from: a */
    public boolean m2326a(int r3, int r4) {
            r2 = this;
            boolean r0 = r2.m2319c()
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r0 = r2.f1778f
            if (r0 != 0) goto L_0x000e
            r3 = 0
            return r3
        L_0x000e:
            r2.m2325a(r3, r4, r1, r1)
            return r1
    }

    /* renamed from: b */
    public androidx.appcompat.view.menu.AbstractC0510n m2320b() {
            r1 = this;
            androidx.appcompat.view.menu.n r0 = r1.f1782j
            if (r0 != 0) goto L_0x000a
            androidx.appcompat.view.menu.n r0 = r1.m2316g()
            r1.f1782j = r0
        L_0x000a:
            androidx.appcompat.view.menu.n r0 = r1.f1782j
            return r0
    }

    /* renamed from: c */
    public boolean m2319c() {
            r1 = this;
            androidx.appcompat.view.menu.n r0 = r1.f1782j
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.mo2036d()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    /* renamed from: d */
    protected void mo2110d() {
            r1 = this;
            r0 = 0
            r1.f1782j = r0
            android.widget.PopupWindow$OnDismissListener r0 = r1.f1783k
            if (r0 == 0) goto L_0x000a
            r0.onDismiss()
        L_0x000a:
            return
    }

    /* renamed from: e */
    public void m2318e() {
            r2 = this;
            boolean r0 = r2.m2317f()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MenuPopupHelper cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: f */
    public boolean m2317f() {
            r3 = this;
            boolean r0 = r3.m2319c()
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r0 = r3.f1778f
            r2 = 0
            if (r0 != 0) goto L_0x000e
            return r2
        L_0x000e:
            r3.m2325a(r2, r2, r2, r2)
            return r1
    }
}
