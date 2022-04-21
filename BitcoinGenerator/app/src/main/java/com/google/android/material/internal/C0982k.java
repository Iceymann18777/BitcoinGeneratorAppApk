package com.google.android.material.internal;

/* renamed from: com.google.android.material.internal.k */
/* loaded from: classes.dex */
public class C0982k {
    /* renamed from: a */
    public static android.graphics.PorterDuff.Mode m71a(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L_0x001d
            r0 = 5
            if (r1 == r0) goto L_0x001a
            r0 = 9
            if (r1 == r0) goto L_0x0017
            switch(r1) {
                case 14: goto L_0x0014;
                case 15: goto L_0x0011;
                case 16: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r2
        L_0x000e:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L_0x0011:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L_0x0014:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L_0x0017:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L_0x001a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L_0x001d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }
}
