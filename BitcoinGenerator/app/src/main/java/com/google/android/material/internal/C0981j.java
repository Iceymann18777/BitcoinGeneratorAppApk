package com.google.android.material.internal;

/* renamed from: com.google.android.material.internal.j */
/* loaded from: classes.dex */
public final class C0981j {

    /* renamed from: a */
    private static final int[] f3609a = null;

    /* renamed from: b */
    private static final int[] f3610b = null;

    static {
            r0 = 1
            int[] r1 = new int[r0]
            int r2 = p050b.p051a.p052a.p053a.C0869b.colorPrimary
            r3 = 0
            r1[r3] = r2
            com.google.android.material.internal.C0981j.f3609a = r1
            int[] r0 = new int[r0]
            int r1 = p050b.p051a.p052a.p053a.C0869b.colorSecondary
            r0[r3] = r1
            com.google.android.material.internal.C0981j.f3610b = r0
            return
    }

    /* renamed from: a */
    public static void m80a(android.content.Context r2) {
            int[] r0 = com.google.android.material.internal.C0981j.f3609a
            java.lang.String r1 = "Theme.AppCompat"
            m76a(r2, r0, r1)
            return
    }

    /* renamed from: a */
    private static void m79a(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            int[] r0 = p050b.p051a.p052a.p053a.C0876i.ThemeEnforcement
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r0, r3, r4)
            int r3 = p050b.p051a.p052a.p053a.C0876i.ThemeEnforcement_enforceMaterialTheme
            r4 = 0
            boolean r3 = r2.getBoolean(r3, r4)
            r2.recycle()
            if (r3 == 0) goto L_0x0015
            m75b(r1)
        L_0x0015:
            m80a(r1)
            return
    }

    /* renamed from: a */
    private static void m78a(android.content.Context r3, android.util.AttributeSet r4, int[] r5, int r6, int r7, int... r8) {
            int[] r0 = p050b.p051a.p052a.p053a.C0876i.ThemeEnforcement
            android.content.res.TypedArray r0 = r3.obtainStyledAttributes(r4, r0, r6, r7)
            int r1 = p050b.p051a.p052a.p053a.C0876i.ThemeEnforcement_enforceTextAppearance
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0013
            r0.recycle()
            return
        L_0x0013:
            if (r8 == 0) goto L_0x001e
            int r1 = r8.length
            if (r1 != 0) goto L_0x0019
            goto L_0x001e
        L_0x0019:
            boolean r3 = m74b(r3, r4, r5, r6, r7, r8)
            goto L_0x002b
        L_0x001e:
            int r3 = p050b.p051a.p052a.p053a.C0876i.ThemeEnforcement_android_textAppearance
            r4 = -1
            int r3 = r0.getResourceId(r3, r4)
            if (r3 == r4) goto L_0x002a
            r2 = 1
            r3 = 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            r0.recycle()
            if (r3 == 0) goto L_0x0031
            return
        L_0x0031:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: a */
    private static void m76a(android.content.Context r1, int[] r2, java.lang.String r3) {
            boolean r1 = m77a(r1, r2)
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "The style on this component requires your app theme to be "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = " (or a descendant)."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: a */
    private static boolean m77a(android.content.Context r0, int[] r1) {
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            boolean r1 = r0.hasValue(r1)
            r0.recycle()
            return r1
    }

    /* renamed from: b */
    public static void m75b(android.content.Context r2) {
            int[] r0 = com.google.android.material.internal.C0981j.f3610b
            java.lang.String r1 = "Theme.MaterialComponents"
            m76a(r2, r0, r1)
            return
    }

    /* renamed from: b */
    private static boolean m74b(android.content.Context r1, android.util.AttributeSet r2, int[] r3, int r4, int r5, int... r6) {
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            int r2 = r6.length
            r3 = 0
            r4 = 0
        L_0x0007:
            if (r4 >= r2) goto L_0x0019
            r5 = r6[r4]
            r0 = -1
            int r5 = r1.getResourceId(r5, r0)
            if (r5 != r0) goto L_0x0016
            r1.recycle()
            return r3
        L_0x0016:
            int r4 = r4 + 1
            goto L_0x0007
        L_0x0019:
            r1.recycle()
            r1 = 1
            return r1
    }

    /* renamed from: c */
    public static android.content.res.TypedArray m73c(android.content.Context r0, android.util.AttributeSet r1, int[] r2, int r3, int r4, int... r5) {
            m79a(r0, r1, r3, r4)
            m78a(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            return r0
    }

    /* renamed from: d */
    public static androidx.appcompat.widget.C0638t0 m72d(android.content.Context r0, android.util.AttributeSet r1, int[] r2, int r3, int r4, int... r5) {
            m79a(r0, r1, r3, r4)
            m78a(r0, r1, r2, r3, r4, r5)
            androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.C0638t0.m1900a(r0, r1, r2, r3, r4)
            return r0
    }
}
