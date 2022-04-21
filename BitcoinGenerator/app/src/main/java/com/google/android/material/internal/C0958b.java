package com.google.android.material.internal;

/* renamed from: com.google.android.material.internal.b */
/* loaded from: classes.dex */
public class C0958b {

    /* renamed from: a */
    private static final java.lang.ThreadLocal<android.graphics.Matrix> f3564a = null;

    /* renamed from: b */
    private static final java.lang.ThreadLocal<android.graphics.RectF> f3565b = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.android.material.internal.C0958b.f3564a = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.android.material.internal.C0958b.f3565b = r0
            return
    }

    /* renamed from: a */
    public static void m139a(android.view.ViewGroup r3, android.view.View r4, android.graphics.Rect r5) {
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            r2 = 0
            r5.set(r2, r2, r0, r1)
            m137b(r3, r4, r5)
            return
    }

    /* renamed from: a */
    private static void m138a(android.view.ViewParent r2, android.view.View r3, android.graphics.Matrix r4) {
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x001e
            if (r0 == r2) goto L_0x001e
            android.view.View r0 = (android.view.View) r0
            m138a(r2, r0, r4)
            int r2 = r0.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r0 = r0.getScrollY()
            int r0 = -r0
            float r0 = (float) r0
            r4.preTranslate(r2, r0)
        L_0x001e:
            int r2 = r3.getLeft()
            float r2 = (float) r2
            int r0 = r3.getTop()
            float r0 = (float) r0
            r4.preTranslate(r2, r0)
            android.graphics.Matrix r2 = r3.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 != 0) goto L_0x003c
            android.graphics.Matrix r2 = r3.getMatrix()
            r4.preConcat(r2)
        L_0x003c:
            return
    }

    /* renamed from: b */
    public static void m137b(android.view.ViewGroup r3, android.view.View r4, android.graphics.Rect r5) {
            java.lang.ThreadLocal<android.graphics.Matrix> r0 = com.google.android.material.internal.C0958b.f3564a
            java.lang.Object r0 = r0.get()
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            if (r0 != 0) goto L_0x0015
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            java.lang.ThreadLocal<android.graphics.Matrix> r1 = com.google.android.material.internal.C0958b.f3564a
            r1.set(r0)
            goto L_0x0018
        L_0x0015:
            r0.reset()
        L_0x0018:
            m138a(r3, r4, r0)
            java.lang.ThreadLocal<android.graphics.RectF> r3 = com.google.android.material.internal.C0958b.f3565b
            java.lang.Object r3 = r3.get()
            android.graphics.RectF r3 = (android.graphics.RectF) r3
            if (r3 != 0) goto L_0x002f
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            java.lang.ThreadLocal<android.graphics.RectF> r4 = com.google.android.material.internal.C0958b.f3565b
            r4.set(r3)
        L_0x002f:
            r3.set(r5)
            r0.mapRect(r3)
            float r4 = r3.left
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r4 = (int) r4
            float r1 = r3.top
            float r1 = r1 + r0
            int r1 = (int) r1
            float r2 = r3.right
            float r2 = r2 + r0
            int r2 = (int) r2
            float r3 = r3.bottom
            float r3 = r3 + r0
            int r3 = (int) r3
            r5.set(r4, r1, r2, r3)
            return
    }
}
