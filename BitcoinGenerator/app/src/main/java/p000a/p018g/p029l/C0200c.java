package p000a.p018g.p029l;

/* renamed from: a.g.l.c */
/* loaded from: classes.dex */
public final class C0200c {
    /* renamed from: a */
    public static int m3490a(int r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x000b
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r3)
            return r2
        L_0x000b:
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2 = r2 & r3
            return r2
    }

    /* renamed from: a */
    public static void m3489a(int r2, int r3, int r4, android.graphics.Rect r5, android.graphics.Rect r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x000a
            android.view.Gravity.apply(r2, r3, r4, r5, r6, r7)
            goto L_0x000d
        L_0x000a:
            android.view.Gravity.apply(r2, r3, r4, r5, r6)
        L_0x000d:
            return
    }
}
