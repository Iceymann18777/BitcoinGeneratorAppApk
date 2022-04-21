package p000a.p018g.p021e;

/* renamed from: a.g.e.g */
/* loaded from: classes.dex */
public class C0149g extends p000a.p018g.p021e.C0148f {
    public C0149g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p000a.p018g.p021e.C0148f
    /* renamed from: a */
    protected android.graphics.Typeface mo3630a(java.lang.Object r6) {
            r5 = this;
            java.lang.Class r0 = r5.f566a     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            r2 = 0
            java.lang.reflect.Array.set(r0, r2, r6)     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            java.lang.reflect.Method r6 = r5.f572g     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            r3 = 0
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            r4[r2] = r0     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            java.lang.String r0 = "sans-serif"
            r4[r1] = r0     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            r0 = 2
            r1 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            r4[r0] = r2     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            r4[r0] = r1     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            java.lang.Object r6 = r6.invoke(r3, r4)     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6     // Catch: InvocationTargetException -> 0x002d, IllegalAccessException -> 0x002f
            return r6
        L_0x002d:
            r6 = move-exception
            goto L_0x0030
        L_0x002f:
            r6 = move-exception
        L_0x0030:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            throw r0
    }

    @Override // p000a.p018g.p021e.C0148f
    /* renamed from: d */
    protected java.lang.reflect.Method mo3629d(java.lang.Class r5) {
            r4 = this;
            r0 = 1
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r0)
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            r2 = 4
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class r5 = r5.getClass()
            r3 = 0
            r2[r3] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r2[r0] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r3 = 2
            r2[r3] = r5
            r3 = 3
            r2[r3] = r5
            java.lang.String r5 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r2)
            r5.setAccessible(r0)
            return r5
    }
}
