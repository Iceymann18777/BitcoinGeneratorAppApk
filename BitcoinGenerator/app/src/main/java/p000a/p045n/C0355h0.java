package p000a.p045n;

/* renamed from: a.n.h0 */
/* loaded from: classes.dex */
class C0355h0 {
    C0355h0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public void mo2865a(android.view.View r3) {
            r2 = this;
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x000c
            int r0 = p000a.p045n.C0361j.save_non_transition_alpha
            r1 = 0
            r3.setTag(r0, r1)
        L_0x000c:
            return
    }

    /* renamed from: a */
    public void mo2864a(android.view.View r2, float r3) {
            r1 = this;
            int r0 = p000a.p045n.C0361j.save_non_transition_alpha
            java.lang.Object r0 = r2.getTag(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L_0x0014
            float r0 = r0.floatValue()
            float r0 = r0 * r3
            r2.setAlpha(r0)
            goto L_0x0017
        L_0x0014:
            r2.setAlpha(r3)
        L_0x0017:
            return
    }

    /* renamed from: a */
    public void mo2863a(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r1.setLeft(r2)
            r1.setTop(r3)
            r1.setRight(r4)
            r1.setBottom(r5)
            return
    }

    /* renamed from: a */
    public void mo2862a(android.view.View r3, android.graphics.Matrix r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x001c
            android.view.View r0 = (android.view.View) r0
            r2.mo2862a(r0, r4)
            int r1 = r0.getScrollX()
            int r1 = -r1
            float r1 = (float) r1
            int r0 = r0.getScrollY()
            int r0 = -r0
            float r0 = (float) r0
            r4.preTranslate(r1, r0)
        L_0x001c:
            int r0 = r3.getLeft()
            float r0 = (float) r0
            int r1 = r3.getTop()
            float r1 = (float) r1
            r4.preTranslate(r0, r1)
            android.graphics.Matrix r3 = r3.getMatrix()
            boolean r0 = r3.isIdentity()
            if (r0 != 0) goto L_0x0036
            r4.preConcat(r3)
        L_0x0036:
            return
    }

    /* renamed from: b */
    public float mo2861b(android.view.View r2) {
            r1 = this;
            int r0 = p000a.p045n.C0361j.save_non_transition_alpha
            java.lang.Object r0 = r2.getTag(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            float r2 = r2.getAlpha()
            if (r0 == 0) goto L_0x0013
            float r0 = r0.floatValue()
            float r2 = r2 / r0
        L_0x0013:
            return r2
    }

    /* renamed from: b */
    public void mo2860b(android.view.View r3, android.graphics.Matrix r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x001a
            android.view.View r0 = (android.view.View) r0
            r2.mo2860b(r0, r4)
            int r1 = r0.getScrollX()
            float r1 = (float) r1
            int r0 = r0.getScrollY()
            float r0 = (float) r0
            r4.postTranslate(r1, r0)
        L_0x001a:
            int r0 = r3.getLeft()
            float r0 = (float) r0
            int r1 = r3.getTop()
            float r1 = (float) r1
            r4.postTranslate(r0, r1)
            android.graphics.Matrix r3 = r3.getMatrix()
            boolean r0 = r3.isIdentity()
            if (r0 != 0) goto L_0x003f
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            boolean r3 = r3.invert(r0)
            if (r3 == 0) goto L_0x003f
            r4.postConcat(r0)
        L_0x003f:
            return
    }

    /* renamed from: c */
    public void mo2859c(android.view.View r3) {
            r2 = this;
            int r0 = p000a.p045n.C0361j.save_non_transition_alpha
            java.lang.Object r0 = r3.getTag(r0)
            if (r0 != 0) goto L_0x0015
            int r0 = p000a.p045n.C0361j.save_non_transition_alpha
            float r1 = r3.getAlpha()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3.setTag(r0, r1)
        L_0x0015:
            return
    }
}
