package androidx.core.widget;

/* renamed from: androidx.core.widget.g */
/* loaded from: classes.dex */
public final class C0718g {
    /* renamed from: a */
    public static void m1501a(android.widget.ListView r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000a
            r2.scrollListBy(r3)
            goto L_0x0022
        L_0x000a:
            int r0 = r2.getFirstVisiblePosition()
            r1 = -1
            if (r0 != r1) goto L_0x0012
            return
        L_0x0012:
            r1 = 0
            android.view.View r1 = r2.getChildAt(r1)
            if (r1 != 0) goto L_0x001a
            return
        L_0x001a:
            int r1 = r1.getTop()
            int r1 = r1 - r3
            r2.setSelectionFromTop(r0, r1)
        L_0x0022:
            return
    }
}
