package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.y0 */
/* loaded from: classes.dex */
public class C0659y0 extends android.content.res.Resources {

    /* renamed from: b */
    private static boolean f2369b = false;

    /* renamed from: a */
    private final java.lang.ref.WeakReference<android.content.Context> f2370a;

    public C0659y0(android.content.Context r3, android.content.res.Resources r4) {
            r2 = this;
            android.content.res.AssetManager r0 = r4.getAssets()
            android.util.DisplayMetrics r1 = r4.getDisplayMetrics()
            android.content.res.Configuration r4 = r4.getConfiguration()
            r2.<init>(r0, r1, r4)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r2.f2370a = r4
            return
    }

    /* renamed from: a */
    public static boolean m1793a() {
            boolean r0 = androidx.appcompat.widget.C0659y0.f2369b
            return r0
    }

    /* renamed from: b */
    public static boolean m1791b() {
            boolean r0 = m1793a()
            if (r0 == 0) goto L_0x000e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 > r1) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
    }

    /* renamed from: a */
    final android.graphics.drawable.Drawable m1792a(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = super.getDrawable(r1)
            return r1
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.f2370a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.widget.j r1 = androidx.appcompat.widget.C0606j.m2013a()
            android.graphics.drawable.Drawable r3 = r1.m2002a(r0, r2, r3)
            return r3
        L_0x0013:
            android.graphics.drawable.Drawable r3 = super.getDrawable(r3)
            return r3
    }
}
