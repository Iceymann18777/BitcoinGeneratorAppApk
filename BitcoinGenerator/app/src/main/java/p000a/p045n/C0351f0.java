package p000a.p045n;

/* renamed from: a.n.f0 */
/* loaded from: classes.dex */
class C0351f0 extends p000a.p045n.C0349e0 {

    /* renamed from: e */
    private static java.lang.reflect.Method f1073e;

    /* renamed from: f */
    private static boolean f1074f;

    /* renamed from: g */
    private static java.lang.reflect.Method f1075g;

    /* renamed from: h */
    private static boolean f1076h;

    C0351f0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    private void m2869a() {
            r6 = this;
            boolean r0 = p000a.p045n.C0351f0.f1074f
            if (r0 != 0) goto L_0x0026
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "transformMatrixToGlobal"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: NoSuchMethodException -> 0x001c
            r4 = 0
            java.lang.Class<android.graphics.Matrix> r5 = android.graphics.Matrix.class
            r3[r4] = r5     // Catch: NoSuchMethodException -> 0x001c
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: NoSuchMethodException -> 0x001c
            p000a.p045n.C0351f0.f1073e = r1     // Catch: NoSuchMethodException -> 0x001c
            java.lang.reflect.Method r1 = p000a.p045n.C0351f0.f1073e     // Catch: NoSuchMethodException -> 0x001c
            r1.setAccessible(r0)     // Catch: NoSuchMethodException -> 0x001c
            goto L_0x0024
        L_0x001c:
            r1 = move-exception
            java.lang.String r2 = "ViewUtilsApi21"
            java.lang.String r3 = "Failed to retrieve transformMatrixToGlobal method"
            android.util.Log.i(r2, r3, r1)
        L_0x0024:
            p000a.p045n.C0351f0.f1074f = r0
        L_0x0026:
            return
    }

    /* renamed from: b */
    private void m2868b() {
            r6 = this;
            boolean r0 = p000a.p045n.C0351f0.f1076h
            if (r0 != 0) goto L_0x0026
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "transformMatrixToLocal"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: NoSuchMethodException -> 0x001c
            r4 = 0
            java.lang.Class<android.graphics.Matrix> r5 = android.graphics.Matrix.class
            r3[r4] = r5     // Catch: NoSuchMethodException -> 0x001c
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: NoSuchMethodException -> 0x001c
            p000a.p045n.C0351f0.f1075g = r1     // Catch: NoSuchMethodException -> 0x001c
            java.lang.reflect.Method r1 = p000a.p045n.C0351f0.f1075g     // Catch: NoSuchMethodException -> 0x001c
            r1.setAccessible(r0)     // Catch: NoSuchMethodException -> 0x001c
            goto L_0x0024
        L_0x001c:
            r1 = move-exception
            java.lang.String r2 = "ViewUtilsApi21"
            java.lang.String r3 = "Failed to retrieve transformMatrixToLocal method"
            android.util.Log.i(r2, r3, r1)
        L_0x0024:
            p000a.p045n.C0351f0.f1076h = r0
        L_0x0026:
            return
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: a */
    public void mo2862a(android.view.View r4, android.graphics.Matrix r5) {
            r3 = this;
            r3.m2869a()
            java.lang.reflect.Method r0 = p000a.p045n.C0351f0.f1073e
            if (r0 == 0) goto L_0x001c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x0011, IllegalAccessException -> 0x001c
            r2 = 0
            r1[r2] = r5     // Catch: InvocationTargetException -> 0x0011, IllegalAccessException -> 0x001c
            r0.invoke(r4, r1)     // Catch: InvocationTargetException -> 0x0011, IllegalAccessException -> 0x001c
            goto L_0x001c
        L_0x0011:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.Throwable r4 = r4.getCause()
            r5.<init>(r4)
            throw r5
        L_0x001c:
            return
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: b */
    public void mo2860b(android.view.View r4, android.graphics.Matrix r5) {
            r3 = this;
            r3.m2868b()
            java.lang.reflect.Method r0 = p000a.p045n.C0351f0.f1075g
            if (r0 == 0) goto L_0x001c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x0011, IllegalAccessException -> 0x001c
            r2 = 0
            r1[r2] = r5     // Catch: InvocationTargetException -> 0x0011, IllegalAccessException -> 0x001c
            r0.invoke(r4, r1)     // Catch: InvocationTargetException -> 0x0011, IllegalAccessException -> 0x001c
            goto L_0x001c
        L_0x0011:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.Throwable r4 = r4.getCause()
            r5.<init>(r4)
            throw r5
        L_0x001c:
            return
    }
}
