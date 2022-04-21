package p000a.p045n;

/* renamed from: a.n.z */
/* loaded from: classes.dex */
class C0391z {

    /* renamed from: a */
    private static java.lang.reflect.Method f1179a;

    /* renamed from: b */
    private static boolean f1180b;

    /* renamed from: a */
    private static void m2762a() {
            boolean r0 = p000a.p045n.C0391z.f1180b
            if (r0 != 0) goto L_0x0026
            r0 = 1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            java.lang.String r2 = "suppressLayout"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: NoSuchMethodException -> 0x001c
            r4 = 0
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: NoSuchMethodException -> 0x001c
            r3[r4] = r5     // Catch: NoSuchMethodException -> 0x001c
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: NoSuchMethodException -> 0x001c
            p000a.p045n.C0391z.f1179a = r1     // Catch: NoSuchMethodException -> 0x001c
            java.lang.reflect.Method r1 = p000a.p045n.C0391z.f1179a     // Catch: NoSuchMethodException -> 0x001c
            r1.setAccessible(r0)     // Catch: NoSuchMethodException -> 0x001c
            goto L_0x0024
        L_0x001c:
            r1 = move-exception
            java.lang.String r2 = "ViewUtilsApi18"
            java.lang.String r3 = "Failed to retrieve suppressLayout method"
            android.util.Log.i(r2, r3, r1)
        L_0x0024:
            p000a.p045n.C0391z.f1180b = r0
        L_0x0026:
            return
    }

    /* renamed from: a */
    static void m2761a(android.view.ViewGroup r4, boolean r5) {
            java.lang.String r0 = "ViewUtilsApi18"
            m2762a()
            java.lang.reflect.Method r1 = p000a.p045n.C0391z.f1179a
            if (r1 == 0) goto L_0x0021
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: InvocationTargetException -> 0x0017, IllegalAccessException -> 0x001b
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: InvocationTargetException -> 0x0017, IllegalAccessException -> 0x001b
            r2[r3] = r5     // Catch: InvocationTargetException -> 0x0017, IllegalAccessException -> 0x001b
            r1.invoke(r4, r2)     // Catch: InvocationTargetException -> 0x0017, IllegalAccessException -> 0x001b
            goto L_0x0021
        L_0x0017:
            r4 = move-exception
            java.lang.String r5 = "Error invoking suppressLayout method"
            goto L_0x001e
        L_0x001b:
            r4 = move-exception
            java.lang.String r5 = "Failed to invoke suppressLayout method"
        L_0x001e:
            android.util.Log.i(r0, r5, r4)
        L_0x0021:
            return
    }
}
