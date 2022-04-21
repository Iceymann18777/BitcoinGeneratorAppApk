package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.v0 */
/* loaded from: classes.dex */
public class C0644v0 {
    /* renamed from: a */
    public static void m1841a(android.view.View r2, java.lang.CharSequence r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x000a
            r2.setTooltipText(r3)
            goto L_0x000d
        L_0x000a:
            androidx.appcompat.widget.View$OnLongClickListenerC0652w0.m1828a(r2, r3)
        L_0x000d:
            return
    }
}
