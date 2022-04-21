package p000a.p018g.p029l.p030a0;

/* renamed from: a.g.l.a0.a */
/* loaded from: classes.dex */
public final class C0187a {
    /* renamed from: a */
    public static int m3549a(android.view.accessibility.AccessibilityEvent r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getContentChangeTypes()
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: a */
    public static void m3548a(android.view.accessibility.AccessibilityEvent r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x0009
            r2.setContentChangeTypes(r3)
        L_0x0009:
            return
    }
}
