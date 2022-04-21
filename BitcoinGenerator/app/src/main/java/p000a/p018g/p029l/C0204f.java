package p000a.p018g.p029l;

/* renamed from: a.g.l.f */
/* loaded from: classes.dex */
public final class C0204f {
    /* renamed from: a */
    public static int m3480a(android.view.ViewGroup.MarginLayoutParams r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getMarginEnd()
            return r2
        L_0x000b:
            int r2 = r2.rightMargin
            return r2
    }

    /* renamed from: b */
    public static int m3479b(android.view.ViewGroup.MarginLayoutParams r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x000b
            int r2 = r2.getMarginStart()
            return r2
        L_0x000b:
            int r2 = r2.leftMargin
            return r2
    }
}
