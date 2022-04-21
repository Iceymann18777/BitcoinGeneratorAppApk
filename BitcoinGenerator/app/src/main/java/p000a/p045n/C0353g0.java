package p000a.p045n;

/* renamed from: a.n.g0 */
/* loaded from: classes.dex */
class C0353g0 extends p000a.p045n.C0351f0 {

    /* renamed from: i */
    private static java.lang.reflect.Method f1077i;

    /* renamed from: j */
    private static boolean f1078j;

    C0353g0() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m2867a() {
            r6 = this;
            boolean r0 = p000a.p045n.C0353g0.f1078j
            if (r0 != 0) goto L_0x0035
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "setLeftTopRightBottom"
            r3 = 4
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: NoSuchMethodException -> 0x002b
            r4 = 0
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x002b
            r3[r4] = r5     // Catch: NoSuchMethodException -> 0x002b
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x002b
            r3[r0] = r4     // Catch: NoSuchMethodException -> 0x002b
            r4 = 2
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x002b
            r3[r4] = r5     // Catch: NoSuchMethodException -> 0x002b
            r4 = 3
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x002b
            r3[r4] = r5     // Catch: NoSuchMethodException -> 0x002b
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: NoSuchMethodException -> 0x002b
            p000a.p045n.C0353g0.f1077i = r1     // Catch: NoSuchMethodException -> 0x002b
            java.lang.reflect.Method r1 = p000a.p045n.C0353g0.f1077i     // Catch: NoSuchMethodException -> 0x002b
            r1.setAccessible(r0)     // Catch: NoSuchMethodException -> 0x002b
            goto L_0x0033
        L_0x002b:
            r1 = move-exception
            java.lang.String r2 = "ViewUtilsApi22"
            java.lang.String r3 = "Failed to retrieve setLeftTopRightBottom method"
            android.util.Log.i(r2, r3, r1)
        L_0x0033:
            p000a.p045n.C0353g0.f1078j = r0
        L_0x0035:
            return
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: a */
    public void mo2863a(android.view.View r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r3.m2867a()
            java.lang.reflect.Method r0 = p000a.p045n.C0353g0.f1077i
            if (r0 == 0) goto L_0x0035
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0035
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0035
            r1[r2] = r5     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0035
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0035
            r1[r5] = r6     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0035
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0035
            r1[r5] = r6     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0035
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0035
            r1[r5] = r6     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0035
            r0.invoke(r4, r1)     // Catch: InvocationTargetException -> 0x002a, IllegalAccessException -> 0x0035
            goto L_0x0035
        L_0x002a:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.Throwable r4 = r4.getCause()
            r5.<init>(r4)
            throw r5
        L_0x0035:
            return
    }
}
