package p000a.p018g.p019d;

/* renamed from: a.g.d.a */
/* loaded from: classes.dex */
public class C0124a {

    /* renamed from: a */
    private static final java.lang.Object f535a = null;

    /* renamed from: b */
    private static android.util.TypedValue f536b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000a.p018g.p019d.C0124a.f535a = r0
            return
    }

    /* renamed from: a */
    public static android.content.res.ColorStateList m3734a(android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000b
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)
            return r2
        L_0x000b:
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)
            return r2
    }

    /* renamed from: a */
    public static boolean m3733a(android.content.Context r2, android.content.Intent[] r3, android.os.Bundle r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x000a
            r2.startActivities(r3, r4)
            goto L_0x000d
        L_0x000a:
            r2.startActivities(r3)
        L_0x000d:
            r2 = 1
            return r2
    }

    /* renamed from: b */
    public static android.graphics.drawable.Drawable m3732b(android.content.Context r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            return r4
        L_0x000b:
            r1 = 16
            if (r0 < r1) goto L_0x0018
        L_0x000f:
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            return r4
        L_0x0018:
            java.lang.Object r0 = p000a.p018g.p019d.C0124a.f535a
            monitor-enter(r0)
            android.util.TypedValue r1 = p000a.p018g.p019d.C0124a.f536b     // Catch: all -> 0x0036
            if (r1 != 0) goto L_0x0026
            android.util.TypedValue r1 = new android.util.TypedValue     // Catch: all -> 0x0036
            r1.<init>()     // Catch: all -> 0x0036
            p000a.p018g.p019d.C0124a.f536b = r1     // Catch: all -> 0x0036
        L_0x0026:
            android.content.res.Resources r1 = r4.getResources()     // Catch: all -> 0x0036
            android.util.TypedValue r2 = p000a.p018g.p019d.C0124a.f536b     // Catch: all -> 0x0036
            r3 = 1
            r1.getValue(r5, r2, r3)     // Catch: all -> 0x0036
            android.util.TypedValue r5 = p000a.p018g.p019d.C0124a.f536b     // Catch: all -> 0x0036
            int r5 = r5.resourceId     // Catch: all -> 0x0036
            monitor-exit(r0)     // Catch: all -> 0x0036
            goto L_0x000f
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0036
            goto L_0x003a
        L_0x0039:
            throw r4
        L_0x003a:
            goto L_0x0039
    }
}
