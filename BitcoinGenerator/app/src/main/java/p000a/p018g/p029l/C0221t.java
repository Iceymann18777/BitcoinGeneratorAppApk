package p000a.p018g.p029l;

/* renamed from: a.g.l.t */
/* loaded from: classes.dex */
public final class C0221t {
    /* renamed from: a */
    public static boolean m3381a(android.view.ViewGroup r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            boolean r2 = r2.isTransitionGroup()
            return r2
        L_0x000b:
            int r0 = p000a.p018g.C0122b.tag_transition_group
            java.lang.Object r0 = r2.getTag(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002a
        L_0x001b:
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            if (r0 != 0) goto L_0x002a
            java.lang.String r2 = p000a.p018g.p029l.C0216r.m3405p(r2)
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            return r2
    }
}
