package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.z0 */
/* loaded from: classes.dex */
public class C0661z0 {

    /* renamed from: a */
    private static java.lang.reflect.Method f2383a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 < r1) goto L_0x0032
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "computeFitSystemWindows"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: NoSuchMethodException -> 0x002b
            r3 = 0
            java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
            r2[r3] = r4     // Catch: NoSuchMethodException -> 0x002b
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            r4 = 1
            r2[r4] = r3     // Catch: NoSuchMethodException -> 0x002b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: NoSuchMethodException -> 0x002b
            androidx.appcompat.widget.C0661z0.f2383a = r0     // Catch: NoSuchMethodException -> 0x002b
            java.lang.reflect.Method r0 = androidx.appcompat.widget.C0661z0.f2383a     // Catch: NoSuchMethodException -> 0x002b
            boolean r0 = r0.isAccessible()     // Catch: NoSuchMethodException -> 0x002b
            if (r0 != 0) goto L_0x0032
            java.lang.reflect.Method r0 = androidx.appcompat.widget.C0661z0.f2383a     // Catch: NoSuchMethodException -> 0x002b
            r0.setAccessible(r4)     // Catch: NoSuchMethodException -> 0x002b
            goto L_0x0032
        L_0x002b:
            java.lang.String r0 = "ViewUtils"
            java.lang.String r1 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r0, r1)
        L_0x0032:
            return
    }

    /* renamed from: a */
    public static void m1763a(android.view.View r3, android.graphics.Rect r4, android.graphics.Rect r5) {
            java.lang.reflect.Method r0 = androidx.appcompat.widget.C0661z0.f2383a
            if (r0 == 0) goto L_0x0019
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: Exception -> 0x0011
            r2 = 0
            r1[r2] = r4     // Catch: Exception -> 0x0011
            r4 = 1
            r1[r4] = r5     // Catch: Exception -> 0x0011
            r0.invoke(r3, r1)     // Catch: Exception -> 0x0011
            goto L_0x0019
        L_0x0011:
            r3 = move-exception
            java.lang.String r4 = "ViewUtils"
            java.lang.String r5 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r4, r5, r3)
        L_0x0019:
            return
    }

    /* renamed from: a */
    public static boolean m1764a(android.view.View r1) {
            int r1 = p000a.p018g.p029l.C0216r.m3411j(r1)
            r0 = 1
            if (r1 != r0) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            return r0
    }

    /* renamed from: b */
    public static void m1762b(android.view.View r6) {
            java.lang.String r0 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r1 = "ViewUtils"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r2 < r3) goto L_0x0033
            java.lang.Class r2 = r6.getClass()     // Catch: IllegalAccessException -> 0x0027, InvocationTargetException -> 0x0029, NoSuchMethodException -> 0x002e
            java.lang.String r3 = "makeOptionalFitsSystemWindows"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: IllegalAccessException -> 0x0027, InvocationTargetException -> 0x0029, NoSuchMethodException -> 0x002e
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: IllegalAccessException -> 0x0027, InvocationTargetException -> 0x0029, NoSuchMethodException -> 0x002e
            boolean r3 = r2.isAccessible()     // Catch: IllegalAccessException -> 0x0027, InvocationTargetException -> 0x0029, NoSuchMethodException -> 0x002e
            if (r3 != 0) goto L_0x0021
            r3 = 1
            r2.setAccessible(r3)     // Catch: IllegalAccessException -> 0x0027, InvocationTargetException -> 0x0029, NoSuchMethodException -> 0x002e
        L_0x0021:
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: IllegalAccessException -> 0x0027, InvocationTargetException -> 0x0029, NoSuchMethodException -> 0x002e
            r2.invoke(r6, r3)     // Catch: IllegalAccessException -> 0x0027, InvocationTargetException -> 0x0029, NoSuchMethodException -> 0x002e
            goto L_0x0033
        L_0x0027:
            r6 = move-exception
            goto L_0x002a
        L_0x0029:
            r6 = move-exception
        L_0x002a:
            android.util.Log.d(r1, r0, r6)
            goto L_0x0033
        L_0x002e:
            java.lang.String r6 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r1, r6)
        L_0x0033:
            return
    }
}
