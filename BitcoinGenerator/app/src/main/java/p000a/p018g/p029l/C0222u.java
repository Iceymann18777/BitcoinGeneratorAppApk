package p000a.p018g.p029l;

/* renamed from: a.g.l.u */
/* loaded from: classes.dex */
public final class C0222u {
    /* renamed from: a */
    public static void m3378a(android.view.ViewParent r1, android.view.View r2, int r3) {
            boolean r0 = r1 instanceof p000a.p018g.p029l.AbstractC0210l
            if (r0 == 0) goto L_0x000a
            a.g.l.l r1 = (p000a.p018g.p029l.AbstractC0210l) r1
            r1.mo1571a(r2, r3)
            goto L_0x0041
        L_0x000a:
            if (r3 != 0) goto L_0x0041
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r3 < r0) goto L_0x0038
            r1.onStopNestedScroll(r2)     // Catch: AbstractMethodError -> 0x0016
            goto L_0x0041
        L_0x0016:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "ViewParent "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = " does not implement interface "
            r3.append(r1)
            java.lang.String r1 = "method onStopNestedScroll"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "ViewParentCompat"
            android.util.Log.e(r3, r1, r2)
            goto L_0x0041
        L_0x0038:
            boolean r3 = r1 instanceof p000a.p018g.p029l.AbstractC0211m
            if (r3 == 0) goto L_0x0041
            a.g.l.m r1 = (p000a.p018g.p029l.AbstractC0211m) r1
            r1.onStopNestedScroll(r2)
        L_0x0041:
            return
    }

    /* renamed from: a */
    public static void m3377a(android.view.ViewParent r8, android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            boolean r0 = r8 instanceof p000a.p018g.p029l.AbstractC0210l
            if (r0 == 0) goto L_0x0011
            r1 = r8
            a.g.l.l r1 = (p000a.p018g.p029l.AbstractC0210l) r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.mo1569a(r2, r3, r4, r5, r6, r7)
            goto L_0x004e
        L_0x0011:
            if (r14 != 0) goto L_0x004e
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r14 < r0) goto L_0x003f
            r8.onNestedScroll(r9, r10, r11, r12, r13)     // Catch: AbstractMethodError -> 0x001d
            goto L_0x004e
        L_0x001d:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "ViewParent "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = " does not implement interface "
            r10.append(r8)
            java.lang.String r8 = "method onNestedScroll"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r10 = "ViewParentCompat"
            android.util.Log.e(r10, r8, r9)
            goto L_0x004e
        L_0x003f:
            boolean r14 = r8 instanceof p000a.p018g.p029l.AbstractC0211m
            if (r14 == 0) goto L_0x004e
            r0 = r8
            a.g.l.m r0 = (p000a.p018g.p029l.AbstractC0211m) r0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L_0x004e:
            return
    }

    /* renamed from: a */
    public static void m3376a(android.view.ViewParent r7, android.view.View r8, int r9, int r10, int[] r11, int r12) {
            boolean r0 = r7 instanceof p000a.p018g.p029l.AbstractC0210l
            if (r0 == 0) goto L_0x0010
            r1 = r7
            a.g.l.l r1 = (p000a.p018g.p029l.AbstractC0210l) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.mo1568a(r2, r3, r4, r5, r6)
            goto L_0x0047
        L_0x0010:
            if (r12 != 0) goto L_0x0047
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r12 < r0) goto L_0x003e
            r7.onNestedPreScroll(r8, r9, r10, r11)     // Catch: AbstractMethodError -> 0x001c
            goto L_0x0047
        L_0x001c:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "ViewParent "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = " does not implement interface "
            r9.append(r7)
            java.lang.String r7 = "method onNestedPreScroll"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "ViewParentCompat"
            android.util.Log.e(r9, r7, r8)
            goto L_0x0047
        L_0x003e:
            boolean r12 = r7 instanceof p000a.p018g.p029l.AbstractC0211m
            if (r12 == 0) goto L_0x0047
            a.g.l.m r7 = (p000a.p018g.p029l.AbstractC0211m) r7
            r7.onNestedPreScroll(r8, r9, r10, r11)
        L_0x0047:
            return
    }

    /* renamed from: a */
    public static void m3375a(android.view.ViewParent r1, android.view.View r2, android.view.View r3, int r4, int r5) {
            boolean r0 = r1 instanceof p000a.p018g.p029l.AbstractC0210l
            if (r0 == 0) goto L_0x000a
            a.g.l.l r1 = (p000a.p018g.p029l.AbstractC0210l) r1
            r1.mo1566a(r2, r3, r4, r5)
            goto L_0x0041
        L_0x000a:
            if (r5 != 0) goto L_0x0041
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r5 < r0) goto L_0x0038
            r1.onNestedScrollAccepted(r2, r3, r4)     // Catch: AbstractMethodError -> 0x0016
            goto L_0x0041
        L_0x0016:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ViewParent "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " does not implement interface "
            r3.append(r1)
            java.lang.String r1 = "method onNestedScrollAccepted"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "ViewParentCompat"
            android.util.Log.e(r3, r1, r2)
            goto L_0x0041
        L_0x0038:
            boolean r5 = r1 instanceof p000a.p018g.p029l.AbstractC0211m
            if (r5 == 0) goto L_0x0041
            a.g.l.m r1 = (p000a.p018g.p029l.AbstractC0211m) r1
            r1.onNestedScrollAccepted(r2, r3, r4)
        L_0x0041:
            return
    }

    /* renamed from: a */
    public static boolean m3380a(android.view.ViewParent r2, android.view.View r3, float r4, float r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x002d
            boolean r2 = r2.onNestedPreFling(r3, r4, r5)     // Catch: AbstractMethodError -> 0x000b
            return r2
        L_0x000b:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ViewParent "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " does not implement interface "
            r4.append(r2)
            java.lang.String r2 = "method onNestedPreFling"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "ViewParentCompat"
            android.util.Log.e(r4, r2, r3)
            goto L_0x0038
        L_0x002d:
            boolean r0 = r2 instanceof p000a.p018g.p029l.AbstractC0211m
            if (r0 == 0) goto L_0x0038
            a.g.l.m r2 = (p000a.p018g.p029l.AbstractC0211m) r2
            boolean r2 = r2.onNestedPreFling(r3, r4, r5)
            return r2
        L_0x0038:
            r2 = 0
            return r2
    }

    /* renamed from: a */
    public static boolean m3379a(android.view.ViewParent r2, android.view.View r3, float r4, float r5, boolean r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x002d
            boolean r2 = r2.onNestedFling(r3, r4, r5, r6)     // Catch: AbstractMethodError -> 0x000b
            return r2
        L_0x000b:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ViewParent "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " does not implement interface "
            r4.append(r2)
            java.lang.String r2 = "method onNestedFling"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "ViewParentCompat"
            android.util.Log.e(r4, r2, r3)
            goto L_0x0038
        L_0x002d:
            boolean r0 = r2 instanceof p000a.p018g.p029l.AbstractC0211m
            if (r0 == 0) goto L_0x0038
            a.g.l.m r2 = (p000a.p018g.p029l.AbstractC0211m) r2
            boolean r2 = r2.onNestedFling(r3, r4, r5, r6)
            return r2
        L_0x0038:
            r2 = 0
            return r2
    }

    /* renamed from: b */
    public static boolean m3374b(android.view.ViewParent r1, android.view.View r2, android.view.View r3, int r4, int r5) {
            boolean r0 = r1 instanceof p000a.p018g.p029l.AbstractC0210l
            if (r0 == 0) goto L_0x000b
            a.g.l.l r1 = (p000a.p018g.p029l.AbstractC0210l) r1
            boolean r1 = r1.mo1559b(r2, r3, r4, r5)
            return r1
        L_0x000b:
            if (r5 != 0) goto L_0x0045
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r5 < r0) goto L_0x003a
            boolean r1 = r1.onStartNestedScroll(r2, r3, r4)     // Catch: AbstractMethodError -> 0x0018
            return r1
        L_0x0018:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ViewParent "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " does not implement interface "
            r3.append(r1)
            java.lang.String r1 = "method onStartNestedScroll"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "ViewParentCompat"
            android.util.Log.e(r3, r1, r2)
            goto L_0x0045
        L_0x003a:
            boolean r5 = r1 instanceof p000a.p018g.p029l.AbstractC0211m
            if (r5 == 0) goto L_0x0045
            a.g.l.m r1 = (p000a.p018g.p029l.AbstractC0211m) r1
            boolean r1 = r1.onStartNestedScroll(r2, r3, r4)
            return r1
        L_0x0045:
            r1 = 0
            return r1
    }
}
