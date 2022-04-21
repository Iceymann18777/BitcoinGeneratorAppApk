package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.q0 */
/* loaded from: classes.dex */
public class C0632q0 extends android.content.ContextWrapper {

    /* renamed from: c */
    private static final java.lang.Object f2265c = null;

    /* renamed from: d */
    private static java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.C0632q0>> f2266d;

    /* renamed from: a */
    private final android.content.res.Resources f2267a;

    /* renamed from: b */
    private final android.content.res.Resources.Theme f2268b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.widget.C0632q0.f2265c = r0
            return
    }

    private C0632q0(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            boolean r0 = androidx.appcompat.widget.C0659y0.m1791b()
            if (r0 == 0) goto L_0x0026
            androidx.appcompat.widget.y0 r0 = new androidx.appcompat.widget.y0
            android.content.res.Resources r1 = r3.getResources()
            r0.<init>(r2, r1)
            r2.f2267a = r0
            android.content.res.Resources r0 = r2.f2267a
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r2.f2268b = r0
            android.content.res.Resources$Theme r0 = r2.f2268b
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r0.setTo(r3)
            goto L_0x0034
        L_0x0026:
            androidx.appcompat.widget.s0 r0 = new androidx.appcompat.widget.s0
            android.content.res.Resources r3 = r3.getResources()
            r0.<init>(r2, r3)
            r2.f2267a = r0
            r3 = 0
            r2.f2268b = r3
        L_0x0034:
            return
    }

    /* renamed from: a */
    private static boolean m1915a(android.content.Context r2) {
            boolean r0 = r2 instanceof androidx.appcompat.widget.C0632q0
            r1 = 0
            if (r0 != 0) goto L_0x0023
            android.content.res.Resources r0 = r2.getResources()
            boolean r0 = r0 instanceof androidx.appcompat.widget.C0636s0
            if (r0 != 0) goto L_0x0023
            android.content.res.Resources r2 = r2.getResources()
            boolean r2 = r2 instanceof androidx.appcompat.widget.C0659y0
            if (r2 == 0) goto L_0x0016
            goto L_0x0023
        L_0x0016:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r2 < r0) goto L_0x0022
            boolean r2 = androidx.appcompat.widget.C0659y0.m1791b()
            if (r2 == 0) goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            return r1
    }

    /* renamed from: b */
    public static android.content.Context m1914b(android.content.Context r4) {
            boolean r0 = m1915a(r4)
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = androidx.appcompat.widget.C0632q0.f2265c
            monitor-enter(r0)
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.q0>> r1 = androidx.appcompat.widget.C0632q0.f2266d     // Catch: all -> 0x0071
            if (r1 != 0) goto L_0x0015
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: all -> 0x0071
            r1.<init>()     // Catch: all -> 0x0071
            androidx.appcompat.widget.C0632q0.f2266d = r1     // Catch: all -> 0x0071
            goto L_0x0060
        L_0x0015:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.q0>> r1 = androidx.appcompat.widget.C0632q0.f2266d     // Catch: all -> 0x0071
            int r1 = r1.size()     // Catch: all -> 0x0071
            int r1 = r1 + (-1)
        L_0x001d:
            if (r1 < 0) goto L_0x0037
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.q0>> r2 = androidx.appcompat.widget.C0632q0.f2266d     // Catch: all -> 0x0071
            java.lang.Object r2 = r2.get(r1)     // Catch: all -> 0x0071
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: all -> 0x0071
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r2.get()     // Catch: all -> 0x0071
            if (r2 != 0) goto L_0x0034
        L_0x002f:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.q0>> r2 = androidx.appcompat.widget.C0632q0.f2266d     // Catch: all -> 0x0071
            r2.remove(r1)     // Catch: all -> 0x0071
        L_0x0034:
            int r1 = r1 + (-1)
            goto L_0x001d
        L_0x0037:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.q0>> r1 = androidx.appcompat.widget.C0632q0.f2266d     // Catch: all -> 0x0071
            int r1 = r1.size()     // Catch: all -> 0x0071
            int r1 = r1 + (-1)
        L_0x003f:
            if (r1 < 0) goto L_0x0060
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.q0>> r2 = androidx.appcompat.widget.C0632q0.f2266d     // Catch: all -> 0x0071
            java.lang.Object r2 = r2.get(r1)     // Catch: all -> 0x0071
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: all -> 0x0071
            if (r2 == 0) goto L_0x0052
            java.lang.Object r2 = r2.get()     // Catch: all -> 0x0071
            androidx.appcompat.widget.q0 r2 = (androidx.appcompat.widget.C0632q0) r2     // Catch: all -> 0x0071
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            if (r2 == 0) goto L_0x005d
            android.content.Context r3 = r2.getBaseContext()     // Catch: all -> 0x0071
            if (r3 != r4) goto L_0x005d
            monitor-exit(r0)     // Catch: all -> 0x0071
            return r2
        L_0x005d:
            int r1 = r1 + (-1)
            goto L_0x003f
        L_0x0060:
            androidx.appcompat.widget.q0 r1 = new androidx.appcompat.widget.q0     // Catch: all -> 0x0071
            r1.<init>(r4)     // Catch: all -> 0x0071
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.q0>> r4 = androidx.appcompat.widget.C0632q0.f2266d     // Catch: all -> 0x0071
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: all -> 0x0071
            r2.<init>(r1)     // Catch: all -> 0x0071
            r4.add(r2)     // Catch: all -> 0x0071
            monitor-exit(r0)     // Catch: all -> 0x0071
            return r1
        L_0x0071:
            r4 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0071
            throw r4
        L_0x0074:
            return r4
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r1 = this;
            android.content.res.Resources r0 = r1.f2267a
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.f2267a
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.f2268b
            if (r0 != 0) goto L_0x0008
            android.content.res.Resources$Theme r0 = super.getTheme()
        L_0x0008:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r3) {
            r2 = this;
            android.content.res.Resources$Theme r0 = r2.f2268b
            if (r0 != 0) goto L_0x0008
            super.setTheme(r3)
            goto L_0x000c
        L_0x0008:
            r1 = 1
            r0.applyStyle(r3, r1)
        L_0x000c:
            return
    }
}
