package p000a.p001a.p006m;

/* renamed from: a.a.m.a */
/* loaded from: classes.dex */
public class C0028a {

    /* renamed from: a */
    private android.content.Context f86a;

    private C0028a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f86a = r1
            return
    }

    /* renamed from: a */
    public static p000a.p001a.p006m.C0028a m4185a(android.content.Context r1) {
            a.a.m.a r0 = new a.a.m.a
            r0.<init>(r1)
            return r0
    }

    /* renamed from: a */
    public boolean m4186a() {
            r2 = this;
            android.content.Context r0 = r2.f86a
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r1 = 14
            if (r0 >= r1) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
    }

    /* renamed from: b */
    public int m4184b() {
            r1 = this;
            android.content.Context r0 = r1.f86a
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 2
            return r0
    }

    /* renamed from: c */
    public int m4183c() {
            r4 = this;
            android.content.Context r0 = r4.f86a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            int r0 = r0.smallestScreenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r0 > r3) goto L_0x003e
            if (r1 > r3) goto L_0x003e
            r0 = 720(0x2d0, float:1.009E-42)
            r3 = 960(0x3c0, float:1.345E-42)
            if (r1 <= r3) goto L_0x001e
            if (r2 > r0) goto L_0x003e
        L_0x001e:
            if (r1 <= r0) goto L_0x0023
            if (r2 <= r3) goto L_0x0023
            goto L_0x003e
        L_0x0023:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L_0x003c
            r0 = 480(0x1e0, float:6.73E-43)
            r3 = 640(0x280, float:8.97E-43)
            if (r1 <= r3) goto L_0x002f
            if (r2 > r0) goto L_0x003c
        L_0x002f:
            if (r1 <= r0) goto L_0x0034
            if (r2 <= r3) goto L_0x0034
            goto L_0x003c
        L_0x0034:
            r0 = 360(0x168, float:5.04E-43)
            if (r1 < r0) goto L_0x003a
            r0 = 3
            return r0
        L_0x003a:
            r0 = 2
            return r0
        L_0x003c:
            r0 = 4
            return r0
        L_0x003e:
            r0 = 5
            return r0
    }

    /* renamed from: d */
    public int m4182d() {
            r2 = this;
            android.content.Context r0 = r2.f86a
            android.content.res.Resources r0 = r0.getResources()
            int r1 = p000a.p001a.C0003d.abc_action_bar_stacked_tab_max_width
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    /* renamed from: e */
    public int m4181e() {
            r5 = this;
            android.content.Context r0 = r5.f86a
            int[] r1 = p000a.p001a.C0009j.ActionBar
            int r2 = p000a.p001a.C0000a.actionBarStyle
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r4, r1, r2, r3)
            int r1 = p000a.p001a.C0009j.ActionBar_height
            int r1 = r0.getLayoutDimension(r1, r3)
            android.content.Context r2 = r5.f86a
            android.content.res.Resources r2 = r2.getResources()
            boolean r3 = r5.m4180f()
            if (r3 != 0) goto L_0x0028
            int r3 = p000a.p001a.C0003d.abc_action_bar_stacked_max_height
            int r2 = r2.getDimensionPixelSize(r3)
            int r1 = java.lang.Math.min(r1, r2)
        L_0x0028:
            r0.recycle()
            return r1
    }

    /* renamed from: f */
    public boolean m4180f() {
            r2 = this;
            android.content.Context r0 = r2.f86a
            android.content.res.Resources r0 = r0.getResources()
            int r1 = p000a.p001a.C0001b.abc_action_bar_embed_tabs
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    /* renamed from: g */
    public boolean m4179g() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 19
            if (r0 < r2) goto L_0x0008
            return r1
        L_0x0008:
            android.content.Context r0 = r3.f86a
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            r0 = r0 ^ r1
            return r0
    }
}
