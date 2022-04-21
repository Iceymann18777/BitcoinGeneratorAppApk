package p000a.p018g.p021e;

/* renamed from: a.g.e.f */
/* loaded from: classes.dex */
public class C0148f extends p000a.p018g.p021e.C0146d {

    /* renamed from: a */
    protected final java.lang.Class f566a;

    /* renamed from: b */
    protected final java.lang.reflect.Constructor f567b;

    /* renamed from: c */
    protected final java.lang.reflect.Method f568c;

    /* renamed from: d */
    protected final java.lang.reflect.Method f569d;

    /* renamed from: e */
    protected final java.lang.reflect.Method f570e;

    /* renamed from: f */
    protected final java.lang.reflect.Method f571f;

    /* renamed from: g */
    protected final java.lang.reflect.Method f572g;

    public C0148f() {
            r8 = this;
            r8.<init>()
            r0 = 0
            java.lang.Class r1 = r8.m3642a()     // Catch: NoSuchMethodException -> 0x0024, ClassNotFoundException -> 0x0026
            java.lang.reflect.Constructor r2 = r8.m3632e(r1)     // Catch: NoSuchMethodException -> 0x0024, ClassNotFoundException -> 0x0026
            java.lang.reflect.Method r3 = r8.m3637b(r1)     // Catch: NoSuchMethodException -> 0x0024, ClassNotFoundException -> 0x0026
            java.lang.reflect.Method r4 = r8.m3634c(r1)     // Catch: NoSuchMethodException -> 0x0024, ClassNotFoundException -> 0x0026
            java.lang.reflect.Method r5 = r8.m3631f(r1)     // Catch: NoSuchMethodException -> 0x0024, ClassNotFoundException -> 0x0026
            java.lang.reflect.Method r6 = r8.m3640a(r1)     // Catch: NoSuchMethodException -> 0x0024, ClassNotFoundException -> 0x0026
            java.lang.reflect.Method r0 = r8.mo3629d(r1)     // Catch: NoSuchMethodException -> 0x0024, ClassNotFoundException -> 0x0026
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x004b
        L_0x0024:
            r1 = move-exception
            goto L_0x0027
        L_0x0026:
            r1 = move-exception
        L_0x0027:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to collect necessary methods for class "
            r2.append(r3)
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r3, r2, r1)
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L_0x004b:
            r8.f566a = r0
            r8.f567b = r2
            r8.f568c = r3
            r8.f569d = r4
            r8.f570e = r5
            r8.f571f = r6
            r8.f572g = r1
            return
    }

    /* renamed from: a */
    private boolean m3641a(android.content.Context r4, java.lang.Object r5, java.lang.String r6, int r7, int r8, int r9, android.graphics.fonts.FontVariationAxis[] r10) {
            r3 = this;
            java.lang.reflect.Method r0 = r3.f568c     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r1 = 8
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r2 = 0
            r1[r2] = r4     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r4 = 1
            r1[r4] = r6     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r1[r4] = r6     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r4 = 3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r1[r4] = r6     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r4 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r1[r4] = r6     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r4 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r1[r4] = r6     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r4 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r1[r4] = r6     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            r4 = 7
            r1[r4] = r10     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            java.lang.Object r4 = r0.invoke(r5, r1)     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            boolean r4 = r4.booleanValue()     // Catch: InvocationTargetException -> 0x0041, IllegalAccessException -> 0x0043
            return r4
        L_0x0041:
            r4 = move-exception
            goto L_0x0044
        L_0x0043:
            r4 = move-exception
        L_0x0044:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    /* renamed from: a */
    private boolean m3639a(java.lang.Object r4, java.nio.ByteBuffer r5, int r6, int r7, int r8) {
            r3 = this;
            java.lang.reflect.Method r0 = r3.f569d     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r2 = 0
            r1[r2] = r5     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r1[r5] = r6     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r5 = 2
            r6 = 0
            r1[r5] = r6     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r1[r5] = r6     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            r1[r5] = r6     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            java.lang.Object r4 = r0.invoke(r4, r1)     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            boolean r4 = r4.booleanValue()     // Catch: InvocationTargetException -> 0x002c, IllegalAccessException -> 0x002e
            return r4
        L_0x002c:
            r4 = move-exception
            goto L_0x002f
        L_0x002e:
            r4 = move-exception
        L_0x002f:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    /* renamed from: b */
    private void m3636b(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f571f     // Catch: InvocationTargetException -> 0x0009, IllegalAccessException -> 0x000b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x0009, IllegalAccessException -> 0x000b
            r0.invoke(r3, r1)     // Catch: InvocationTargetException -> 0x0009, IllegalAccessException -> 0x000b
            return
        L_0x0009:
            r3 = move-exception
            goto L_0x000c
        L_0x000b:
            r3 = move-exception
        L_0x000c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: b */
    private boolean m3638b() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f568c
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "TypefaceCompatApi26Impl"
            java.lang.String r1 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r0, r1)
        L_0x000b:
            java.lang.reflect.Method r0 = r2.f568c
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
    }

    /* renamed from: c */
    private java.lang.Object m3635c() {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.f567b     // Catch: InvocationTargetException -> 0x000a, InstantiationException -> 0x000c, IllegalAccessException -> 0x000e
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

    /* renamed from: c */
    private boolean m3633c(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f570e     // Catch: InvocationTargetException -> 0x0010, IllegalAccessException -> 0x0012
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: InvocationTargetException -> 0x0010, IllegalAccessException -> 0x0012
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: InvocationTargetException -> 0x0010, IllegalAccessException -> 0x0012
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: InvocationTargetException -> 0x0010, IllegalAccessException -> 0x0012
            boolean r3 = r3.booleanValue()     // Catch: InvocationTargetException -> 0x0010, IllegalAccessException -> 0x0012
            return r3
        L_0x0010:
            r3 = move-exception
            goto L_0x0013
        L_0x0012:
            r3 = move-exception
        L_0x0013:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    @Override // p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public android.graphics.Typeface mo3627a(android.content.Context r11, p000a.p018g.p019d.p020c.C0128c.C0130b r12, android.content.res.Resources r13, int r14) {
            r10 = this;
            boolean r0 = r10.m3638b()
            if (r0 != 0) goto L_0x000b
            android.graphics.Typeface r11 = super.mo3627a(r11, r12, r13, r14)
            return r11
        L_0x000b:
            java.lang.Object r13 = r10.m3635c()
            a.g.d.c.c$c[] r12 = r12.m3704a()
            int r14 = r12.length
            r0 = 0
            r8 = 0
        L_0x0016:
            r9 = 0
            if (r8 >= r14) goto L_0x0043
            r0 = r12[r8]
            java.lang.String r3 = r0.m3703a()
            int r4 = r0.m3701c()
            int r5 = r0.m3699e()
            boolean r6 = r0.m3698f()
            java.lang.String r0 = r0.m3700d()
            android.graphics.fonts.FontVariationAxis[] r7 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r0)
            r0 = r10
            r1 = r11
            r2 = r13
            boolean r0 = r0.m3641a(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x0040
            r10.m3636b(r13)
            return r9
        L_0x0040:
            int r8 = r8 + 1
            goto L_0x0016
        L_0x0043:
            boolean r11 = r10.m3633c(r13)
            if (r11 != 0) goto L_0x004a
            return r9
        L_0x004a:
            android.graphics.Typeface r11 = r10.mo3630a(r13)
            return r11
    }

    @Override // p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public android.graphics.Typeface mo3626a(android.content.Context r9, android.content.res.Resources r10, int r11, java.lang.String r12, int r13) {
            r8 = this;
            boolean r0 = r8.m3638b()
            if (r0 != 0) goto L_0x000b
            android.graphics.Typeface r9 = super.mo3626a(r9, r10, r11, r12, r13)
            return r9
        L_0x000b:
            java.lang.Object r10 = r8.m3635c()
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            boolean r9 = r0.m3641a(r1, r2, r3, r4, r5, r6, r7)
            r11 = 0
            if (r9 != 0) goto L_0x0022
            r8.m3636b(r10)
            return r11
        L_0x0022:
            boolean r9 = r8.m3633c(r10)
            if (r9 != 0) goto L_0x0029
            return r11
        L_0x0029:
            android.graphics.Typeface r9 = r8.mo3630a(r10)
            return r9
    }

    @Override // p000a.p018g.p021e.C0146d, p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public android.graphics.Typeface mo3625a(android.content.Context r11, android.os.CancellationSignal r12, p000a.p018g.p026i.C0161b.C0167f[] r13, int r14) {
            r10 = this;
            int r0 = r13.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r10.m3638b()
            if (r0 != 0) goto L_0x0058
            a.g.i.b$f r13 = r10.m3623a(r13, r14)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r14 = r13.m3583c()     // Catch: IOException -> 0x0057
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r14, r0, r12)     // Catch: IOException -> 0x0057
            if (r11 != 0) goto L_0x0026
            if (r11 == 0) goto L_0x0025
            r11.close()     // Catch: IOException -> 0x0057
        L_0x0025:
            return r2
        L_0x0026:
            android.graphics.Typeface$Builder r12 = new android.graphics.Typeface$Builder     // Catch: all -> 0x0049
            java.io.FileDescriptor r14 = r11.getFileDescriptor()     // Catch: all -> 0x0049
            r12.<init>(r14)     // Catch: all -> 0x0049
            int r14 = r13.m3582d()     // Catch: all -> 0x0049
            android.graphics.Typeface$Builder r12 = r12.setWeight(r14)     // Catch: all -> 0x0049
            boolean r13 = r13.m3581e()     // Catch: all -> 0x0049
            android.graphics.Typeface$Builder r12 = r12.setItalic(r13)     // Catch: all -> 0x0049
            android.graphics.Typeface r12 = r12.build()     // Catch: all -> 0x0049
            if (r11 == 0) goto L_0x0048
            r11.close()     // Catch: IOException -> 0x0057
        L_0x0048:
            return r12
        L_0x0049:
            r12 = move-exception
            throw r12     // Catch: all -> 0x004b
        L_0x004b:
            r13 = move-exception
            if (r11 == 0) goto L_0x0056
            r11.close()     // Catch: all -> 0x0052
            goto L_0x0056
        L_0x0052:
            r11 = move-exception
            r12.addSuppressed(r11)     // Catch: IOException -> 0x0057
        L_0x0056:
            throw r13     // Catch: IOException -> 0x0057
        L_0x0057:
            return r2
        L_0x0058:
            java.util.Map r11 = p000a.p018g.p026i.C0161b.m3594a(r11, r13, r12)
            java.lang.Object r12 = r10.m3635c()
            int r0 = r13.length
            r3 = 0
            r9 = 0
        L_0x0063:
            if (r9 >= r0) goto L_0x0090
            r4 = r13[r9]
            android.net.Uri r5 = r4.m3583c()
            java.lang.Object r5 = r11.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L_0x0074
            goto L_0x008d
        L_0x0074:
            int r6 = r4.m3584b()
            int r7 = r4.m3582d()
            boolean r8 = r4.m3581e()
            r3 = r10
            r4 = r12
            boolean r3 = r3.m3639a(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L_0x008c
            r10.m3636b(r12)
            return r2
        L_0x008c:
            r3 = 1
        L_0x008d:
            int r9 = r9 + 1
            goto L_0x0063
        L_0x0090:
            if (r3 != 0) goto L_0x0096
            r10.m3636b(r12)
            return r2
        L_0x0096:
            boolean r11 = r10.m3633c(r12)
            if (r11 != 0) goto L_0x009d
            return r2
        L_0x009d:
            android.graphics.Typeface r11 = r10.mo3630a(r12)
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r14)
            return r11
    }

    /* renamed from: a */
    protected android.graphics.Typeface mo3630a(java.lang.Object r6) {
            r5 = this;
            java.lang.Class r0 = r5.f566a     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            r2 = 0
            java.lang.reflect.Array.set(r0, r2, r6)     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            java.lang.reflect.Method r6 = r5.f572g     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            r3 = 0
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            r4[r2] = r0     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            r0 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            r4[r1] = r2     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            r4[r1] = r0     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            java.lang.Object r6 = r6.invoke(r3, r4)     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6     // Catch: InvocationTargetException -> 0x0028, IllegalAccessException -> 0x002a
            return r6
        L_0x0028:
            r6 = move-exception
            goto L_0x002b
        L_0x002a:
            r6 = move-exception
        L_0x002b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            throw r0
    }

    /* renamed from: a */
    protected java.lang.Class m3642a() {
            r1 = this;
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            return r0
    }

    /* renamed from: a */
    protected java.lang.reflect.Method m3640a(java.lang.Class r3) {
            r2 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.String r1 = "abortCreation"
            java.lang.reflect.Method r3 = r3.getMethod(r1, r0)
            return r3
    }

    /* renamed from: b */
    protected java.lang.reflect.Method m3637b(java.lang.Class r4) {
            r3 = this;
            r0 = 8
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.res.AssetManager> r1 = android.content.res.AssetManager.class
            r2 = 0
            r0[r2] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 1
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 2
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 3
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            r2 = 5
            r0[r2] = r1
            r2 = 6
            r0[r2] = r1
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r1 = android.graphics.fonts.FontVariationAxis[].class
            r2 = 7
            r0[r2] = r1
            java.lang.String r1 = "addFontFromAssetManager"
            java.lang.reflect.Method r4 = r4.getMethod(r1, r0)
            return r4
    }

    /* renamed from: c */
    protected java.lang.reflect.Method m3634c(java.lang.Class r5) {
            r4 = this;
            r0 = 5
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            r2 = 0
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 1
            r0[r2] = r1
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r2 = android.graphics.fonts.FontVariationAxis[].class
            r3 = 2
            r0[r3] = r2
            r2 = 3
            r0[r2] = r1
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = "addFontFromBuffer"
            java.lang.reflect.Method r5 = r5.getMethod(r1, r0)
            return r5
    }

    /* renamed from: d */
    protected java.lang.reflect.Method mo3629d(java.lang.Class r5) {
            r4 = this;
            r0 = 1
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r0)
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class r5 = r5.getClass()
            r3 = 0
            r2[r3] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r2[r0] = r5
            r3 = 2
            r2[r3] = r5
            java.lang.String r5 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r2)
            r5.setAccessible(r0)
            return r5
    }

    /* renamed from: e */
    protected java.lang.reflect.Constructor m3632e(java.lang.Class r2) {
            r1 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r2 = r2.getConstructor(r0)
            return r2
    }

    /* renamed from: f */
    protected java.lang.reflect.Method m3631f(java.lang.Class r3) {
            r2 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.String r1 = "freeze"
            java.lang.reflect.Method r3 = r3.getMethod(r1, r0)
            return r3
    }
}
