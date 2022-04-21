package androidx.core.widget;

/* renamed from: androidx.core.widget.h */
/* loaded from: classes.dex */
public final class C0719h {

    /* renamed from: a */
    private static java.lang.reflect.Method f2712a;

    /* renamed from: b */
    private static boolean f2713b;

    /* renamed from: c */
    private static java.lang.reflect.Field f2714c;

    /* renamed from: d */
    private static boolean f2715d;

    /* renamed from: a */
    public static void m1500a(android.widget.PopupWindow r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000a
            r5.setWindowLayoutType(r6)
            return
        L_0x000a:
            boolean r0 = androidx.core.widget.C0719h.f2713b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: Exception -> 0x0025
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: Exception -> 0x0025
            r3[r1] = r4     // Catch: Exception -> 0x0025
            java.lang.String r4 = "setWindowLayoutType"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r3)     // Catch: Exception -> 0x0025
            androidx.core.widget.C0719h.f2712a = r0     // Catch: Exception -> 0x0025
            java.lang.reflect.Method r0 = androidx.core.widget.C0719h.f2712a     // Catch: Exception -> 0x0025
            r0.setAccessible(r2)     // Catch: Exception -> 0x0025
        L_0x0025:
            androidx.core.widget.C0719h.f2713b = r2
        L_0x0027:
            java.lang.reflect.Method r0 = androidx.core.widget.C0719h.f2712a
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: Exception -> 0x0036
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: Exception -> 0x0036
            r2[r1] = r6     // Catch: Exception -> 0x0036
            r0.invoke(r5, r2)     // Catch: Exception -> 0x0036
        L_0x0036:
            return
    }

    /* renamed from: a */
    public static void m1499a(android.widget.PopupWindow r2, android.view.View r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000a
            r2.showAsDropDown(r3, r4, r5, r6)
            goto L_0x0024
        L_0x000a:
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r3)
            int r6 = p000a.p018g.p029l.C0200c.m3490a(r6, r0)
            r6 = r6 & 7
            r0 = 5
            if (r6 != r0) goto L_0x0021
            int r6 = r2.getWidth()
            int r0 = r3.getWidth()
            int r6 = r6 - r0
            int r4 = r4 - r6
        L_0x0021:
            r2.showAsDropDown(r3, r4, r5)
        L_0x0024:
            return
    }

    /* renamed from: a */
    public static void m1498a(android.widget.PopupWindow r4, boolean r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000a
            r4.setOverlapAnchor(r5)
            goto L_0x003f
        L_0x000a:
            r1 = 21
            if (r0 < r1) goto L_0x003f
            boolean r0 = androidx.core.widget.C0719h.f2715d
            java.lang.String r1 = "PopupWindowCompatApi21"
            if (r0 != 0) goto L_0x002d
            r0 = 1
            java.lang.Class<android.widget.PopupWindow> r2 = android.widget.PopupWindow.class
            java.lang.String r3 = "mOverlapAnchor"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: NoSuchFieldException -> 0x0025
            androidx.core.widget.C0719h.f2714c = r2     // Catch: NoSuchFieldException -> 0x0025
            java.lang.reflect.Field r2 = androidx.core.widget.C0719h.f2714c     // Catch: NoSuchFieldException -> 0x0025
            r2.setAccessible(r0)     // Catch: NoSuchFieldException -> 0x0025
            goto L_0x002b
        L_0x0025:
            r2 = move-exception
            java.lang.String r3 = "Could not fetch mOverlapAnchor field from PopupWindow"
            android.util.Log.i(r1, r3, r2)
        L_0x002b:
            androidx.core.widget.C0719h.f2715d = r0
        L_0x002d:
            java.lang.reflect.Field r0 = androidx.core.widget.C0719h.f2714c
            if (r0 == 0) goto L_0x003f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: IllegalAccessException -> 0x0039
            r0.set(r4, r5)     // Catch: IllegalAccessException -> 0x0039
            goto L_0x003f
        L_0x0039:
            r4 = move-exception
            java.lang.String r5 = "Could not set overlap anchor field in PopupWindow"
            android.util.Log.i(r1, r5, r4)
        L_0x003f:
            return
    }
}
