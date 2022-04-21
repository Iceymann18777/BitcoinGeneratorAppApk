package p000a.p001a.p002k.p003a;

/* renamed from: a.a.k.a.a */
/* loaded from: classes.dex */
public final class C0010a {

    /* renamed from: a */
    private static final java.lang.ThreadLocal<android.util.TypedValue> f1a = null;

    /* renamed from: b */
    private static final java.util.WeakHashMap<android.content.Context, android.util.SparseArray<p000a.p001a.p002k.p003a.C0010a.C0011a>> f2b = null;

    /* renamed from: c */
    private static final java.lang.Object f3c = null;

    /* renamed from: a.a.k.a.a$a */
    /* loaded from: classes.dex */
    private static class C0011a {

        /* renamed from: a */
        final android.content.res.ColorStateList f4a;

        /* renamed from: b */
        final android.content.res.Configuration f5b;

        C0011a(android.content.res.ColorStateList r1, android.content.res.Configuration r2) {
                r0 = this;
                r0.<init>()
                r0.f4a = r1
                r0.f5b = r2
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000a.p001a.p002k.p003a.C0010a.f1a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            p000a.p001a.p002k.p003a.C0010a.f2b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000a.p001a.p002k.p003a.C0010a.f3c = r0
            return
    }

    /* renamed from: a */
    private static android.content.res.ColorStateList m4262a(android.content.Context r4, int r5) {
            java.lang.Object r0 = p000a.p001a.p002k.p003a.C0010a.f3c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<a.a.k.a.a$a>> r1 = p000a.p001a.p002k.p003a.C0010a.f2b     // Catch: all -> 0x0035
            java.lang.Object r1 = r1.get(r4)     // Catch: all -> 0x0035
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: all -> 0x0035
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch: all -> 0x0035
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch: all -> 0x0035
            a.a.k.a.a$a r2 = (p000a.p001a.p002k.p003a.C0010a.C0011a) r2     // Catch: all -> 0x0035
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f5b     // Catch: all -> 0x0035
            android.content.res.Resources r4 = r4.getResources()     // Catch: all -> 0x0035
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: all -> 0x0035
            boolean r4 = r3.equals(r4)     // Catch: all -> 0x0035
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f4a     // Catch: all -> 0x0035
            monitor-exit(r0)     // Catch: all -> 0x0035
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch: all -> 0x0035
        L_0x0032:
            monitor-exit(r0)     // Catch: all -> 0x0035
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0035
            throw r4
    }

    /* renamed from: a */
    private static android.util.TypedValue m4263a() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = p000a.p001a.p002k.p003a.C0010a.f1a
            java.lang.Object r0 = r0.get()
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L_0x0014
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r1 = p000a.p001a.p002k.p003a.C0010a.f1a
            r1.set(r0)
        L_0x0014:
            return r0
    }

    /* renamed from: a */
    private static void m4261a(android.content.Context r3, int r4, android.content.res.ColorStateList r5) {
            java.lang.Object r0 = p000a.p001a.p002k.p003a.C0010a.f3c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<a.a.k.a.a$a>> r1 = p000a.p001a.p002k.p003a.C0010a.f2b     // Catch: all -> 0x0029
            java.lang.Object r1 = r1.get(r3)     // Catch: all -> 0x0029
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: all -> 0x0029
            if (r1 != 0) goto L_0x0017
            android.util.SparseArray r1 = new android.util.SparseArray     // Catch: all -> 0x0029
            r1.<init>()     // Catch: all -> 0x0029
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<a.a.k.a.a$a>> r2 = p000a.p001a.p002k.p003a.C0010a.f2b     // Catch: all -> 0x0029
            r2.put(r3, r1)     // Catch: all -> 0x0029
        L_0x0017:
            a.a.k.a.a$a r2 = new a.a.k.a.a$a     // Catch: all -> 0x0029
            android.content.res.Resources r3 = r3.getResources()     // Catch: all -> 0x0029
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: all -> 0x0029
            r2.<init>(r5, r3)     // Catch: all -> 0x0029
            r1.append(r4, r2)     // Catch: all -> 0x0029
            monitor-exit(r0)     // Catch: all -> 0x0029
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0029
            throw r3
    }

    /* renamed from: b */
    public static android.content.res.ColorStateList m4260b(android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000b
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)
            return r2
        L_0x000b:
            android.content.res.ColorStateList r0 = m4262a(r2, r3)
            if (r0 == 0) goto L_0x0012
            return r0
        L_0x0012:
            android.content.res.ColorStateList r0 = m4258d(r2, r3)
            if (r0 == 0) goto L_0x001c
            m4261a(r2, r3, r0)
            return r0
        L_0x001c:
            android.content.res.ColorStateList r2 = p000a.p018g.p019d.C0124a.m3734a(r2, r3)
            return r2
    }

    /* renamed from: c */
    public static android.graphics.drawable.Drawable m4259c(android.content.Context r1, int r2) {
            androidx.appcompat.widget.j r0 = androidx.appcompat.widget.C0606j.m2013a()
            android.graphics.drawable.Drawable r1 = r0.m2009a(r1, r2)
            return r1
    }

    /* renamed from: d */
    private static android.content.res.ColorStateList m4258d(android.content.Context r2, int r3) {
            boolean r0 = m4257e(r2, r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.XmlResourceParser r3 = r0.getXml(r3)
            android.content.res.Resources$Theme r2 = r2.getTheme()     // Catch: Exception -> 0x0019
            android.content.res.ColorStateList r2 = p000a.p018g.p019d.p020c.C0126a.m3727a(r0, r3, r2)     // Catch: Exception -> 0x0019
            return r2
        L_0x0019:
            r2 = move-exception
            java.lang.String r3 = "AppCompatResources"
            java.lang.String r0 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.e(r3, r0, r2)
            return r1
    }

    /* renamed from: e */
    private static boolean m4257e(android.content.Context r2, int r3) {
            android.content.res.Resources r2 = r2.getResources()
            android.util.TypedValue r0 = m4263a()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L_0x0017
            r3 = 31
            if (r2 > r3) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            return r1
    }
}
