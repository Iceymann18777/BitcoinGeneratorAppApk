package androidx.versionedparcelable;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
public abstract class AbstractC0865a {
    public AbstractC0865a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    protected static <T extends androidx.versionedparcelable.AbstractC0867c> T m508a(java.lang.String r5, androidx.versionedparcelable.AbstractC0865a r6) {
            java.lang.Class<androidx.versionedparcelable.a> r0 = androidx.versionedparcelable.AbstractC0865a.class
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: ClassNotFoundException -> 0x0022, NoSuchMethodException -> 0x0024, InvocationTargetException -> 0x0026, IllegalAccessException -> 0x0028
            r2 = 1
            java.lang.Class r5 = java.lang.Class.forName(r5, r2, r1)     // Catch: ClassNotFoundException -> 0x0022, NoSuchMethodException -> 0x0024, InvocationTargetException -> 0x0026, IllegalAccessException -> 0x0028
            java.lang.String r1 = "read"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: ClassNotFoundException -> 0x0022, NoSuchMethodException -> 0x0024, InvocationTargetException -> 0x0026, IllegalAccessException -> 0x0028
            r4 = 0
            r3[r4] = r0     // Catch: ClassNotFoundException -> 0x0022, NoSuchMethodException -> 0x0024, InvocationTargetException -> 0x0026, IllegalAccessException -> 0x0028
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r1, r3)     // Catch: ClassNotFoundException -> 0x0022, NoSuchMethodException -> 0x0024, InvocationTargetException -> 0x0026, IllegalAccessException -> 0x0028
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: ClassNotFoundException -> 0x0022, NoSuchMethodException -> 0x0024, InvocationTargetException -> 0x0026, IllegalAccessException -> 0x0028
            r1[r4] = r6     // Catch: ClassNotFoundException -> 0x0022, NoSuchMethodException -> 0x0024, InvocationTargetException -> 0x0026, IllegalAccessException -> 0x0028
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: ClassNotFoundException -> 0x0022, NoSuchMethodException -> 0x0024, InvocationTargetException -> 0x0026, IllegalAccessException -> 0x0028
            androidx.versionedparcelable.c r5 = (androidx.versionedparcelable.AbstractC0867c) r5     // Catch: ClassNotFoundException -> 0x0022, NoSuchMethodException -> 0x0024, InvocationTargetException -> 0x0026, IllegalAccessException -> 0x0028
            return r5
        L_0x0022:
            r5 = move-exception
            goto L_0x002a
        L_0x0024:
            r5 = move-exception
            goto L_0x0032
        L_0x0026:
            r5 = move-exception
            goto L_0x003a
        L_0x0028:
            r5 = move-exception
            goto L_0x0051
        L_0x002a:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            r6.<init>(r0, r5)
            throw r6
        L_0x0032:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            r6.<init>(r0, r5)
            throw r6
        L_0x003a:
            java.lang.Throwable r6 = r5.getCause()
            boolean r6 = r6 instanceof java.lang.RuntimeException
            if (r6 == 0) goto L_0x0049
            java.lang.Throwable r5 = r5.getCause()
            java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
            throw r5
        L_0x0049:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            r6.<init>(r0, r5)
            throw r6
        L_0x0051:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            r6.<init>(r0, r5)
            throw r6
    }

    /* renamed from: a */
    private static java.lang.Class m510a(java.lang.Class<? extends androidx.versionedparcelable.AbstractC0867c> r4) {
            java.lang.Package r0 = r4.getPackage()
            java.lang.String r0 = r0.getName()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r4.getSimpleName()
            r3 = 1
            r1[r3] = r0
            java.lang.String r0 = "%s.%sParcelizer"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Class r4 = java.lang.Class.forName(r0, r2, r4)
            return r4
    }

    /* renamed from: a */
    protected static <T extends androidx.versionedparcelable.AbstractC0867c> void m511a(T r7, androidx.versionedparcelable.AbstractC0865a r8) {
            java.lang.Class r0 = m503b(r7)     // Catch: ClassNotFoundException -> 0x0024, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x004e
            java.lang.String r1 = "write"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: ClassNotFoundException -> 0x0024, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x004e
            java.lang.Class r4 = r7.getClass()     // Catch: ClassNotFoundException -> 0x0024, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x004e
            r5 = 0
            r3[r5] = r4     // Catch: ClassNotFoundException -> 0x0024, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x004e
            java.lang.Class<androidx.versionedparcelable.a> r4 = androidx.versionedparcelable.AbstractC0865a.class
            r6 = 1
            r3[r6] = r4     // Catch: ClassNotFoundException -> 0x0024, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x004e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: ClassNotFoundException -> 0x0024, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x004e
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: ClassNotFoundException -> 0x0024, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x004e
            r2[r5] = r7     // Catch: ClassNotFoundException -> 0x0024, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x004e
            r2[r6] = r8     // Catch: ClassNotFoundException -> 0x0024, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x004e
            r0.invoke(r1, r2)     // Catch: ClassNotFoundException -> 0x0024, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0036, IllegalAccessException -> 0x004e
            return
        L_0x0024:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            r8.<init>(r0, r7)
            throw r8
        L_0x002d:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            r8.<init>(r0, r7)
            throw r8
        L_0x0036:
            r7 = move-exception
            java.lang.Throwable r8 = r7.getCause()
            boolean r8 = r8 instanceof java.lang.RuntimeException
            if (r8 == 0) goto L_0x0046
            java.lang.Throwable r7 = r7.getCause()
            java.lang.RuntimeException r7 = (java.lang.RuntimeException) r7
            throw r7
        L_0x0046:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            r8.<init>(r0, r7)
            throw r8
        L_0x004e:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            r8.<init>(r0, r7)
            throw r8
    }

    /* renamed from: b */
    private static <T extends androidx.versionedparcelable.AbstractC0867c> java.lang.Class m503b(T r0) {
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r0 = m510a(r0)
            return r0
    }

    /* renamed from: c */
    private void m499c(androidx.versionedparcelable.AbstractC0867c r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()     // Catch: ClassNotFoundException -> 0x0010
            java.lang.Class r4 = m510a(r0)     // Catch: ClassNotFoundException -> 0x0010
            java.lang.String r4 = r4.getName()
            r3.mo494a(r4)
            return
        L_0x0010:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            java.lang.String r4 = " does not have a Parcelizer"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    /* renamed from: a */
    public int m514a(int r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo496a(r2)
            if (r2 != 0) goto L_0x0007
            return r1
        L_0x0007:
            int r1 = r0.mo487e()
            return r1
    }

    /* renamed from: a */
    public <T extends android.os.Parcelable> T m513a(T r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo496a(r2)
            if (r2 != 0) goto L_0x0007
            return r1
        L_0x0007:
            android.os.Parcelable r1 = r0.mo486f()
            return r1
    }

    /* renamed from: a */
    public java.lang.String m509a(java.lang.String r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo496a(r2)
            if (r2 != 0) goto L_0x0007
            return r1
        L_0x0007:
            java.lang.String r1 = r0.mo485g()
            return r1
    }

    /* renamed from: a */
    protected abstract void mo497a();

    /* renamed from: a */
    protected abstract void mo495a(android.os.Parcelable r1);

    /* renamed from: a */
    protected void m512a(androidx.versionedparcelable.AbstractC0867c r2) {
            r1 = this;
            if (r2 != 0) goto L_0x0007
            r2 = 0
            r1.mo494a(r2)
            return
        L_0x0007:
            r1.m499c(r2)
            androidx.versionedparcelable.a r0 = r1.mo492b()
            m511a(r2, r0)
            r0.mo497a()
            return
    }

    /* renamed from: a */
    protected abstract void mo494a(java.lang.String r1);

    /* renamed from: a */
    public void m507a(boolean r1, boolean r2) {
            r0 = this;
            return
    }

    /* renamed from: a */
    protected abstract void mo493a(byte[] r1);

    /* renamed from: a */
    protected abstract boolean mo496a(int r1);

    /* renamed from: a */
    public byte[] m506a(byte[] r1, int r2) {
            r0 = this;
            boolean r2 = r0.mo496a(r2)
            if (r2 != 0) goto L_0x0007
            return r1
        L_0x0007:
            byte[] r1 = r0.mo489d()
            return r1
    }

    /* renamed from: b */
    protected abstract androidx.versionedparcelable.AbstractC0865a mo492b();

    /* renamed from: b */
    protected abstract void mo491b(int r1);

    /* renamed from: b */
    public void m505b(int r1, int r2) {
            r0 = this;
            r0.mo491b(r2)
            r0.mo490c(r1)
            return
    }

    /* renamed from: b */
    public void m504b(android.os.Parcelable r1, int r2) {
            r0 = this;
            r0.mo491b(r2)
            r0.mo495a(r1)
            return
    }

    /* renamed from: b */
    public void m502b(java.lang.String r1, int r2) {
            r0 = this;
            r0.mo491b(r2)
            r0.mo494a(r1)
            return
    }

    /* renamed from: b */
    public void m501b(byte[] r1, int r2) {
            r0 = this;
            r0.mo491b(r2)
            r0.mo493a(r1)
            return
    }

    /* renamed from: c */
    protected abstract void mo490c(int r1);

    /* renamed from: c */
    public boolean m500c() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: d */
    protected abstract byte[] mo489d();

    /* renamed from: e */
    protected abstract int mo487e();

    /* renamed from: f */
    protected abstract <T extends android.os.Parcelable> T mo486f();

    /* renamed from: g */
    protected abstract java.lang.String mo485g();

    /* renamed from: h */
    protected <T extends androidx.versionedparcelable.AbstractC0867c> T m498h() {
            r2 = this;
            java.lang.String r0 = r2.mo485g()
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            androidx.versionedparcelable.a r1 = r2.mo492b()
            androidx.versionedparcelable.c r0 = m508a(r0, r1)
            return r0
    }
}
