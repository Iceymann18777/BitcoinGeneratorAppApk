package androidx.core.widget;

/* renamed from: androidx.core.widget.d */
/* loaded from: classes.dex */
public final class C0715d {
    /* renamed from: a */
    public static void m1509a(android.widget.EdgeEffect r2, float r3, float r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000a
            r2.onPull(r3, r4)
            goto L_0x000d
        L_0x000a:
            r2.onPull(r3)
        L_0x000d:
            return
    }
}
