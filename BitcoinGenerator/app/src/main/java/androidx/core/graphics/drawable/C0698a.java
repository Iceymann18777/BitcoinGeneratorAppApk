package androidx.core.graphics.drawable;

/* renamed from: androidx.core.graphics.drawable.a */
/* loaded from: classes.dex */
public final class C0698a {

    /* renamed from: a */
    private static java.lang.reflect.Method f2633a;

    /* renamed from: b */
    private static boolean f2634b;

    /* renamed from: c */
    private static java.lang.reflect.Method f2635c;

    /* renamed from: d */
    private static boolean f2636d;

    /* renamed from: a */
    public static void m1606a(android.graphics.drawable.Drawable r2, float r3, float r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0009
            r2.setHotspot(r3, r4)
        L_0x0009:
            return
    }

    /* renamed from: a */
    public static void m1604a(android.graphics.drawable.Drawable r2, int r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0009
            r2.setHotspotBounds(r3, r4, r5, r6)
        L_0x0009:
            return
    }

    /* renamed from: a */
    public static void m1603a(android.graphics.drawable.Drawable r2, android.content.res.ColorStateList r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000a
            r2.setTintList(r3)
            goto L_0x0013
        L_0x000a:
            boolean r0 = r2 instanceof androidx.core.graphics.drawable.AbstractC0699b
            if (r0 == 0) goto L_0x0013
            androidx.core.graphics.drawable.b r2 = (androidx.core.graphics.drawable.AbstractC0699b) r2
            r2.setTintList(r3)
        L_0x0013:
            return
    }

    /* renamed from: a */
    public static void m1602a(android.graphics.drawable.Drawable r2, android.content.res.Resources.Theme r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0009
            r2.applyTheme(r3)
        L_0x0009:
            return
    }

    /* renamed from: a */
    public static void m1601a(android.graphics.drawable.Drawable r2, android.content.res.Resources r3, org.xmlpull.v1.XmlPullParser r4, android.util.AttributeSet r5, android.content.res.Resources.Theme r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000a
            r2.inflate(r3, r4, r5, r6)
            goto L_0x000d
        L_0x000a:
            r2.inflate(r3, r4, r5)
        L_0x000d:
            return
    }

    /* renamed from: a */
    public static void m1600a(android.graphics.drawable.Drawable r2, android.graphics.PorterDuff.Mode r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000a
            r2.setTintMode(r3)
            goto L_0x0013
        L_0x000a:
            boolean r0 = r2 instanceof androidx.core.graphics.drawable.AbstractC0699b
            if (r0 == 0) goto L_0x0013
            androidx.core.graphics.drawable.b r2 = (androidx.core.graphics.drawable.AbstractC0699b) r2
            r2.setTintMode(r3)
        L_0x0013:
            return
    }

    /* renamed from: a */
    public static void m1599a(android.graphics.drawable.Drawable r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x0009
            r2.setAutoMirrored(r3)
        L_0x0009:
            return
    }

    /* renamed from: a */
    public static boolean m1607a(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.canApplyTheme()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: a */
    public static boolean m1605a(android.graphics.drawable.Drawable r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000b
            boolean r6 = r6.setLayoutDirection(r7)
            return r6
        L_0x000b:
            r1 = 17
            r2 = 0
            if (r0 < r1) goto L_0x004e
            boolean r0 = androidx.core.graphics.drawable.C0698a.f2634b
            java.lang.String r1 = "DrawableCompat"
            r3 = 1
            if (r0 != 0) goto L_0x0035
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: NoSuchMethodException -> 0x002d
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x002d
            r4[r2] = r5     // Catch: NoSuchMethodException -> 0x002d
            java.lang.String r5 = "setLayoutDirection"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r4)     // Catch: NoSuchMethodException -> 0x002d
            androidx.core.graphics.drawable.C0698a.f2633a = r0     // Catch: NoSuchMethodException -> 0x002d
            java.lang.reflect.Method r0 = androidx.core.graphics.drawable.C0698a.f2633a     // Catch: NoSuchMethodException -> 0x002d
            r0.setAccessible(r3)     // Catch: NoSuchMethodException -> 0x002d
            goto L_0x0033
        L_0x002d:
            r0 = move-exception
            java.lang.String r4 = "Failed to retrieve setLayoutDirection(int) method"
            android.util.Log.i(r1, r4, r0)
        L_0x0033:
            androidx.core.graphics.drawable.C0698a.f2634b = r3
        L_0x0035:
            java.lang.reflect.Method r0 = androidx.core.graphics.drawable.C0698a.f2633a
            if (r0 == 0) goto L_0x004e
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: Exception -> 0x0045
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: Exception -> 0x0045
            r4[r2] = r7     // Catch: Exception -> 0x0045
            r0.invoke(r6, r4)     // Catch: Exception -> 0x0045
            return r3
        L_0x0045:
            r6 = move-exception
            java.lang.String r7 = "Failed to invoke setLayoutDirection(int) via reflection"
            android.util.Log.i(r1, r7, r6)
            r6 = 0
            androidx.core.graphics.drawable.C0698a.f2633a = r6
        L_0x004e:
            return r2
    }

    /* renamed from: b */
    public static void m1598b(android.graphics.drawable.Drawable r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000a
        L_0x0006:
            r3.clearColorFilter()
            goto L_0x004b
        L_0x000a:
            r1 = 21
            if (r0 < r1) goto L_0x0006
            r3.clearColorFilter()
            boolean r0 = r3 instanceof android.graphics.drawable.InsetDrawable
            if (r0 == 0) goto L_0x001f
            android.graphics.drawable.InsetDrawable r3 = (android.graphics.drawable.InsetDrawable) r3
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
        L_0x001b:
            m1598b(r3)
            goto L_0x004b
        L_0x001f:
            boolean r0 = r3 instanceof androidx.core.graphics.drawable.AbstractC0700c
            if (r0 == 0) goto L_0x002a
            androidx.core.graphics.drawable.c r3 = (androidx.core.graphics.drawable.AbstractC0700c) r3
            android.graphics.drawable.Drawable r3 = r3.mo1590a()
            goto L_0x001b
        L_0x002a:
            boolean r0 = r3 instanceof android.graphics.drawable.DrawableContainer
            if (r0 == 0) goto L_0x004b
            android.graphics.drawable.DrawableContainer r3 = (android.graphics.drawable.DrawableContainer) r3
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            android.graphics.drawable.DrawableContainer$DrawableContainerState r3 = (android.graphics.drawable.DrawableContainer.DrawableContainerState) r3
            if (r3 == 0) goto L_0x004b
            r0 = 0
            int r1 = r3.getChildCount()
        L_0x003d:
            if (r0 >= r1) goto L_0x004b
            android.graphics.drawable.Drawable r2 = r3.getChild(r0)
            if (r2 == 0) goto L_0x0048
            m1598b(r2)
        L_0x0048:
            int r0 = r0 + 1
            goto L_0x003d
        L_0x004b:
            return
    }

    /* renamed from: b */
    public static void m1597b(android.graphics.drawable.Drawable r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000a
            r2.setTint(r3)
            goto L_0x0013
        L_0x000a:
            boolean r0 = r2 instanceof androidx.core.graphics.drawable.AbstractC0699b
            if (r0 == 0) goto L_0x0013
            androidx.core.graphics.drawable.b r2 = (androidx.core.graphics.drawable.AbstractC0699b) r2
            r2.setTint(r3)
        L_0x0013:
            return
    }

    /* renamed from: c */
    public static int m1596c(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getAlpha()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: d */
    public static android.graphics.ColorFilter m1595d(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            android.graphics.ColorFilter r2 = r2.getColorFilter()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: e */
    public static int m1594e(android.graphics.drawable.Drawable r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000b
            int r6 = r6.getLayoutDirection()
            return r6
        L_0x000b:
            r1 = 17
            r2 = 0
            if (r0 < r1) goto L_0x004b
            boolean r0 = androidx.core.graphics.drawable.C0698a.f2636d
            java.lang.String r1 = "DrawableCompat"
            if (r0 != 0) goto L_0x0031
            r0 = 1
            java.lang.Class<android.graphics.drawable.Drawable> r3 = android.graphics.drawable.Drawable.class
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: NoSuchMethodException -> 0x0029
            java.lang.String r5 = "getLayoutDirection"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r4)     // Catch: NoSuchMethodException -> 0x0029
            androidx.core.graphics.drawable.C0698a.f2635c = r3     // Catch: NoSuchMethodException -> 0x0029
            java.lang.reflect.Method r3 = androidx.core.graphics.drawable.C0698a.f2635c     // Catch: NoSuchMethodException -> 0x0029
            r3.setAccessible(r0)     // Catch: NoSuchMethodException -> 0x0029
            goto L_0x002f
        L_0x0029:
            r3 = move-exception
            java.lang.String r4 = "Failed to retrieve getLayoutDirection() method"
            android.util.Log.i(r1, r4, r3)
        L_0x002f:
            androidx.core.graphics.drawable.C0698a.f2636d = r0
        L_0x0031:
            java.lang.reflect.Method r0 = androidx.core.graphics.drawable.C0698a.f2635c
            if (r0 == 0) goto L_0x004b
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: Exception -> 0x0042
            java.lang.Object r6 = r0.invoke(r6, r3)     // Catch: Exception -> 0x0042
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: Exception -> 0x0042
            int r6 = r6.intValue()     // Catch: Exception -> 0x0042
            return r6
        L_0x0042:
            r6 = move-exception
            java.lang.String r0 = "Failed to invoke getLayoutDirection() via reflection"
            android.util.Log.i(r1, r0, r6)
            r6 = 0
            androidx.core.graphics.drawable.C0698a.f2635c = r6
        L_0x004b:
            return r2
    }

    /* renamed from: f */
    public static boolean m1593f(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.isAutoMirrored()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    /* renamed from: g */
    public static void m1592g(android.graphics.drawable.Drawable r0) {
            r0.jumpToCurrentState()
            return
    }

    /* renamed from: h */
    public static android.graphics.drawable.Drawable m1591h(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0007
            return r2
        L_0x0007:
            r1 = 21
            if (r0 < r1) goto L_0x0016
            boolean r0 = r2 instanceof androidx.core.graphics.drawable.AbstractC0699b
            if (r0 != 0) goto L_0x0015
            androidx.core.graphics.drawable.e r0 = new androidx.core.graphics.drawable.e
            r0.<init>(r2)
            return r0
        L_0x0015:
            return r2
        L_0x0016:
            boolean r0 = r2 instanceof androidx.core.graphics.drawable.AbstractC0699b
            if (r0 != 0) goto L_0x0020
            androidx.core.graphics.drawable.d r0 = new androidx.core.graphics.drawable.d
            r0.<init>(r2)
            return r0
        L_0x0020:
            return r2
    }
}
