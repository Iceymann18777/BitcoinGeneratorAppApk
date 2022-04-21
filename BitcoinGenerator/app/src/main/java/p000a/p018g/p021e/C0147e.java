package p000a.p018g.p021e;

/* renamed from: a.g.e.e */
/* loaded from: classes.dex */
class C0147e extends p000a.p018g.p021e.C0150h {

    /* renamed from: a */
    private static final java.lang.Class f562a = null;

    /* renamed from: b */
    private static final java.lang.reflect.Constructor f563b = null;

    /* renamed from: c */
    private static final java.lang.reflect.Method f564c = null;

    /* renamed from: d */
    private static final java.lang.reflect.Method f565d = null;

    static {
            java.lang.String r0 = "android.graphics.FontFamily"
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            java.lang.reflect.Constructor r3 = r0.getConstructor(r3)     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            java.lang.String r4 = "addFontWeightStyle"
            r5 = 5
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            r5[r2] = r6     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            r7 = 1
            r5[r7] = r6     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            r6 = 2
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r5[r6] = r8     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            r6 = 3
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            r5[r6] = r8     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            r6 = 4
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            r5[r6] = r8     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            java.lang.reflect.Method r4 = r0.getMethod(r4, r5)     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r0, r7)     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            java.lang.Class<android.graphics.Typeface> r6 = android.graphics.Typeface.class
            java.lang.String r8 = "createFromFamiliesWithDefault"
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            java.lang.Class r5 = r5.getClass()     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            r7[r2] = r5     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            java.lang.reflect.Method r1 = r6.getMethod(r8, r7)     // Catch: NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x0048
            r2 = r1
            r1 = r3
            goto L_0x0059
        L_0x0046:
            r0 = move-exception
            goto L_0x0049
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi24Impl"
            android.util.Log.e(r3, r2, r0)
            r0 = r1
            r2 = r0
            r4 = r2
        L_0x0059:
            p000a.p018g.p021e.C0147e.f563b = r1
            p000a.p018g.p021e.C0147e.f562a = r0
            p000a.p018g.p021e.C0147e.f564c = r4
            p000a.p018g.p021e.C0147e.f565d = r2
            return
    }

    C0147e() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    private static android.graphics.Typeface m3645a(java.lang.Object r4) {
            java.lang.Class r0 = p000a.p018g.p021e.C0147e.f562a     // Catch: InvocationTargetException -> 0x0019, IllegalAccessException -> 0x001b
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: InvocationTargetException -> 0x0019, IllegalAccessException -> 0x001b
            r2 = 0
            java.lang.reflect.Array.set(r0, r2, r4)     // Catch: InvocationTargetException -> 0x0019, IllegalAccessException -> 0x001b
            java.lang.reflect.Method r4 = p000a.p018g.p021e.C0147e.f565d     // Catch: InvocationTargetException -> 0x0019, IllegalAccessException -> 0x001b
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x0019, IllegalAccessException -> 0x001b
            r1[r2] = r0     // Catch: InvocationTargetException -> 0x0019, IllegalAccessException -> 0x001b
            java.lang.Object r4 = r4.invoke(r3, r1)     // Catch: InvocationTargetException -> 0x0019, IllegalAccessException -> 0x001b
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: InvocationTargetException -> 0x0019, IllegalAccessException -> 0x001b
            return r4
        L_0x0019:
            r4 = move-exception
            goto L_0x001c
        L_0x001b:
            r4 = move-exception
        L_0x001c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: a */
    public static boolean m3646a() {
            java.lang.reflect.Method r0 = p000a.p018g.p021e.C0147e.f564c
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "TypefaceCompatApi24Impl"
            java.lang.String r1 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r0, r1)
        L_0x000b:
            java.lang.reflect.Method r0 = p000a.p018g.p021e.C0147e.f564c
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
    }

    /* renamed from: a */
    private static boolean m3644a(java.lang.Object r3, java.nio.ByteBuffer r4, int r5, int r6, boolean r7) {
            java.lang.reflect.Method r0 = p000a.p018g.p021e.C0147e.f564c     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r2 = 0
            r1[r2] = r4     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r1[r4] = r5     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r4 = 2
            r5 = 0
            r1[r4] = r5     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r1[r4] = r5     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r4 = 4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r1[r4] = r5     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            boolean r3 = r3.booleanValue()     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            return r3
        L_0x002c:
            r3 = move-exception
            goto L_0x002f
        L_0x002e:
            r3 = move-exception
        L_0x002f:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    /* renamed from: b */
    private static java.lang.Object m3643b() {
            java.lang.reflect.Constructor r0 = p000a.p018g.p021e.C0147e.f563b     // Catch: InvocationTargetException -> 0x000a, InstantiationException -> 0x000c, IllegalAccessException -> 0x000e
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x000a, InstantiationException -> 0x000c, IllegalAccessException -> 0x000e
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: InvocationTargetException -> 0x000a, InstantiationException -> 0x000c, IllegalAccessException -> 0x000e
            return r0
        L_0x000a:
            r0 = move-exception
            goto L_0x000f
        L_0x000c:
            r0 = move-exception
            goto L_0x000f
        L_0x000e:
            r0 = move-exception
        L_0x000f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @Override // p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public android.graphics.Typeface mo3627a(android.content.Context r8, p000a.p018g.p019d.p020c.C0128c.C0130b r9, android.content.res.Resources r10, int r11) {
            r7 = this;
            java.lang.Object r11 = m3643b()
            a.g.d.c.c$c[] r9 = r9.m3704a()
            int r0 = r9.length
            r1 = 0
        L_0x000a:
            if (r1 >= r0) goto L_0x0030
            r2 = r9[r1]
            int r3 = r2.m3702b()
            java.nio.ByteBuffer r3 = p000a.p018g.p021e.C0154i.m3614a(r8, r10, r3)
            r4 = 0
            if (r3 != 0) goto L_0x001a
            return r4
        L_0x001a:
            int r5 = r2.m3701c()
            int r6 = r2.m3699e()
            boolean r2 = r2.m3698f()
            boolean r2 = m3644a(r11, r3, r5, r6, r2)
            if (r2 != 0) goto L_0x002d
            return r4
        L_0x002d:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x0030:
            android.graphics.Typeface r8 = m3645a(r11)
            return r8
    }

    @Override // p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public android.graphics.Typeface mo3625a(android.content.Context r9, android.os.CancellationSignal r10, p000a.p018g.p026i.C0161b.C0167f[] r11, int r12) {
            r8 = this;
            java.lang.Object r0 = m3643b()
            a.d.g r1 = new a.d.g
            r1.<init>()
            int r2 = r11.length
            r3 = 0
        L_0x000b:
            if (r3 >= r2) goto L_0x0039
            r4 = r11[r3]
            android.net.Uri r5 = r4.m3583c()
            java.lang.Object r6 = r1.get(r5)
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            if (r6 != 0) goto L_0x0022
            java.nio.ByteBuffer r6 = p000a.p018g.p021e.C0154i.m3613a(r9, r10, r5)
            r1.put(r5, r6)
        L_0x0022:
            int r5 = r4.m3584b()
            int r7 = r4.m3582d()
            boolean r4 = r4.m3581e()
            boolean r4 = m3644a(r0, r6, r5, r7, r4)
            if (r4 != 0) goto L_0x0036
            r9 = 0
            return r9
        L_0x0036:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0039:
            android.graphics.Typeface r9 = m3645a(r0)
            android.graphics.Typeface r9 = android.graphics.Typeface.create(r9, r12)
            return r9
    }
}
