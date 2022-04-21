package p000a.p018g.p029l;

/* renamed from: a.g.l.s */
/* loaded from: classes.dex */
public final class C0220s {

    /* renamed from: a */
    private static java.lang.reflect.Method f674a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 != r1) goto L_0x001b
            java.lang.Class<android.view.ViewConfiguration> r0 = android.view.ViewConfiguration.class
            java.lang.String r1 = "getScaledScrollFactor"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: Exception -> 0x0014
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: Exception -> 0x0014
            p000a.p018g.p029l.C0220s.f674a = r0     // Catch: Exception -> 0x0014
            goto L_0x001b
        L_0x0014:
            java.lang.String r0 = "ViewConfigCompat"
            java.lang.String r1 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r0, r1)
        L_0x001b:
            return
    }

    /* renamed from: a */
    private static float m3385a(android.view.ViewConfiguration r3, android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L_0x0020
            java.lang.reflect.Method r0 = p000a.p018g.p029l.C0220s.f674a
            if (r0 == 0) goto L_0x0020
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: Exception -> 0x0019
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: Exception -> 0x0019
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: Exception -> 0x0019
            int r3 = r3.intValue()     // Catch: Exception -> 0x0019
            float r3 = (float) r3
            return r3
        L_0x0019:
            java.lang.String r3 = "ViewConfigCompat"
            java.lang.String r0 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r3, r0)
        L_0x0020:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r1 = 16842829(0x101004d, float:2.3693774E-38)
            r2 = 1
            boolean r0 = r0.resolveAttribute(r1, r3, r2)
            if (r0 == 0) goto L_0x0040
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r3 = r3.getDimension(r4)
            return r3
        L_0x0040:
            r3 = 0
            return r3
    }

    /* renamed from: a */
    public static int m3386a(android.view.ViewConfiguration r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getScaledHoverSlop()
            return r2
        L_0x000b:
            int r2 = r2.getScaledTouchSlop()
            int r2 = r2 / 2
            return r2
    }

    /* renamed from: b */
    public static float m3384b(android.view.ViewConfiguration r2, android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x000b
            float r2 = r2.getScaledHorizontalScrollFactor()
            return r2
        L_0x000b:
            float r2 = m3385a(r2, r3)
            return r2
    }

    /* renamed from: c */
    public static float m3383c(android.view.ViewConfiguration r2, android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x000b
            float r2 = r2.getScaledVerticalScrollFactor()
            return r2
        L_0x000b:
            float r2 = m3385a(r2, r3)
            return r2
    }

    /* renamed from: d */
    public static boolean m3382d(android.view.ViewConfiguration r2, android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.shouldShowMenuShortcutsWhenKeyboardPresent()
            return r2
        L_0x000b:
            android.content.res.Resources r2 = r3.getResources()
            java.lang.String r3 = "config_showMenuShortcutsWhenKeyboardPresent"
            java.lang.String r0 = "bool"
            java.lang.String r1 = "android"
            int r3 = r2.getIdentifier(r3, r0, r1)
            if (r3 == 0) goto L_0x0023
            boolean r2 = r2.getBoolean(r3)
            if (r2 == 0) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            return r2
    }
}
