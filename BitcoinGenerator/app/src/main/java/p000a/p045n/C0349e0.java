package p000a.p045n;

/* renamed from: a.n.e0 */
/* loaded from: classes.dex */
class C0349e0 extends p000a.p045n.C0355h0 {

    /* renamed from: a */
    private static java.lang.reflect.Method f1069a;

    /* renamed from: b */
    private static boolean f1070b;

    /* renamed from: c */
    private static java.lang.reflect.Method f1071c;

    /* renamed from: d */
    private static boolean f1072d;

    C0349e0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    private void m2872a() {
            r4 = this;
            boolean r0 = p000a.p045n.C0349e0.f1072d
            if (r0 != 0) goto L_0x0022
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "getTransitionAlpha"
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: NoSuchMethodException -> 0x0018
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: NoSuchMethodException -> 0x0018
            p000a.p045n.C0349e0.f1071c = r1     // Catch: NoSuchMethodException -> 0x0018
            java.lang.reflect.Method r1 = p000a.p045n.C0349e0.f1071c     // Catch: NoSuchMethodException -> 0x0018
            r1.setAccessible(r0)     // Catch: NoSuchMethodException -> 0x0018
            goto L_0x0020
        L_0x0018:
            r1 = move-exception
            java.lang.String r2 = "ViewUtilsApi19"
            java.lang.String r3 = "Failed to retrieve getTransitionAlpha method"
            android.util.Log.i(r2, r3, r1)
        L_0x0020:
            p000a.p045n.C0349e0.f1072d = r0
        L_0x0022:
            return
    }

    /* renamed from: b */
    private void m2871b() {
            r6 = this;
            boolean r0 = p000a.p045n.C0349e0.f1070b
            if (r0 != 0) goto L_0x0026
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "setTransitionAlpha"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: NoSuchMethodException -> 0x001c
            r4 = 0
            java.lang.Class r5 = java.lang.Float.TYPE     // Catch: NoSuchMethodException -> 0x001c
            r3[r4] = r5     // Catch: NoSuchMethodException -> 0x001c
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: NoSuchMethodException -> 0x001c
            p000a.p045n.C0349e0.f1069a = r1     // Catch: NoSuchMethodException -> 0x001c
            java.lang.reflect.Method r1 = p000a.p045n.C0349e0.f1069a     // Catch: NoSuchMethodException -> 0x001c
            r1.setAccessible(r0)     // Catch: NoSuchMethodException -> 0x001c
            goto L_0x0024
        L_0x001c:
            r1 = move-exception
            java.lang.String r2 = "ViewUtilsApi19"
            java.lang.String r3 = "Failed to retrieve setTransitionAlpha method"
            android.util.Log.i(r2, r3, r1)
        L_0x0024:
            p000a.p045n.C0349e0.f1070b = r0
        L_0x0026:
            return
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: a */
    public void mo2865a(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: a */
    public void mo2864a(android.view.View r4, float r5) {
            r3 = this;
            r3.m2871b()
            java.lang.reflect.Method r0 = p000a.p045n.C0349e0.f1069a
            if (r0 == 0) goto L_0x0020
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x0015, IllegalAccessException -> 0x0023
            r2 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: InvocationTargetException -> 0x0015, IllegalAccessException -> 0x0023
            r1[r2] = r5     // Catch: InvocationTargetException -> 0x0015, IllegalAccessException -> 0x0023
            r0.invoke(r4, r1)     // Catch: InvocationTargetException -> 0x0015, IllegalAccessException -> 0x0023
            goto L_0x0023
        L_0x0015:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.Throwable r4 = r4.getCause()
            r5.<init>(r4)
            throw r5
        L_0x0020:
            r4.setAlpha(r5)
        L_0x0023:
            return
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: b */
    public float mo2861b(android.view.View r3) {
            r2 = this;
            r2.m2872a()
            java.lang.reflect.Method r0 = p000a.p045n.C0349e0.f1071c
            if (r0 == 0) goto L_0x0020
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x0015, IllegalAccessException -> 0x0020
            java.lang.Object r0 = r0.invoke(r3, r1)     // Catch: InvocationTargetException -> 0x0015, IllegalAccessException -> 0x0020
            java.lang.Float r0 = (java.lang.Float) r0     // Catch: InvocationTargetException -> 0x0015, IllegalAccessException -> 0x0020
            float r3 = r0.floatValue()     // Catch: InvocationTargetException -> 0x0015, IllegalAccessException -> 0x0020
            return r3
        L_0x0015:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Throwable r3 = r3.getCause()
            r0.<init>(r3)
            throw r0
        L_0x0020:
            float r3 = super.mo2861b(r3)
            return r3
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: c */
    public void mo2859c(android.view.View r1) {
            r0 = this;
            return
    }
}
