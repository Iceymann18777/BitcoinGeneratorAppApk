package p000a.p045n;

/* renamed from: a.n.r */
/* loaded from: classes.dex */
class C0382r {

    /* renamed from: a */
    private static final boolean f1163a = false;

    /* renamed from: b */
    private static final boolean f1164b = false;

    /* renamed from: c */
    private static final boolean f1165c = false;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 19
            if (r0 < r3) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            p000a.p045n.C0382r.f1163a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 18
            if (r0 < r3) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            p000a.p045n.C0382r.f1164b = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r0 < r3) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            p000a.p045n.C0382r.f1165c = r1
            return
    }

    /* renamed from: a */
    static android.animation.Animator m2774a(android.animation.Animator r3, android.animation.Animator r4) {
            if (r3 != 0) goto L_0x0003
            return r4
        L_0x0003:
            if (r4 != 0) goto L_0x0006
            return r3
        L_0x0006:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 2
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r0.playTogether(r1)
            return r0
    }

    /* renamed from: a */
    private static android.graphics.Bitmap m2773a(android.view.View r9, android.graphics.Matrix r10, android.graphics.RectF r11, android.view.ViewGroup r12) {
            boolean r0 = p000a.p045n.C0382r.f1163a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            boolean r0 = r9.isAttachedToWindow()
            r0 = r0 ^ 1
            if (r12 != 0) goto L_0x000e
            goto L_0x0014
        L_0x000e:
            boolean r2 = r12.isAttachedToWindow()
            goto L_0x0015
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2 = 0
        L_0x0015:
            boolean r3 = p000a.p045n.C0382r.f1164b
            r4 = 0
            if (r3 == 0) goto L_0x0034
            if (r0 == 0) goto L_0x0034
            if (r2 != 0) goto L_0x001f
            return r4
        L_0x001f:
            android.view.ViewParent r1 = r9.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r9)
            android.view.ViewGroupOverlay r3 = r12.getOverlay()
            r3.add(r9)
            r8 = r2
            r2 = r1
            r1 = r8
            goto L_0x0035
        L_0x0034:
            r2 = r4
        L_0x0035:
            float r3 = r11.width()
            int r3 = java.lang.Math.round(r3)
            float r5 = r11.height()
            int r5 = java.lang.Math.round(r5)
            if (r3 <= 0) goto L_0x009b
            if (r5 <= 0) goto L_0x009b
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 1233125376(0x49800000, float:1048576.0)
            int r7 = r3 * r5
            float r7 = (float) r7
            float r6 = r6 / r7
            float r4 = java.lang.Math.min(r4, r6)
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            float r5 = (float) r5
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)
            float r6 = r11.left
            float r6 = -r6
            float r11 = r11.top
            float r11 = -r11
            r10.postTranslate(r6, r11)
            r10.postScale(r4, r4)
            boolean r11 = p000a.p045n.C0382r.f1165c
            if (r11 == 0) goto L_0x008a
            android.graphics.Picture r11 = new android.graphics.Picture
            r11.<init>()
            android.graphics.Canvas r3 = r11.beginRecording(r3, r5)
            r3.concat(r10)
            r9.draw(r3)
            r11.endRecording()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r11)
            goto L_0x009b
        L_0x008a:
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r5, r11)
            android.graphics.Canvas r11 = new android.graphics.Canvas
            r11.<init>(r4)
            r11.concat(r10)
            r9.draw(r11)
        L_0x009b:
            boolean r10 = p000a.p045n.C0382r.f1164b
            if (r10 == 0) goto L_0x00ab
            if (r0 == 0) goto L_0x00ab
            android.view.ViewGroupOverlay r10 = r12.getOverlay()
            r10.remove(r9)
            r2.addView(r9, r1)
        L_0x00ab:
            return r4
    }

    /* renamed from: a */
    static android.view.View m2772a(android.view.ViewGroup r7, android.view.View r8, android.view.View r9) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r9.getScrollX()
            int r1 = -r1
            float r1 = (float) r1
            int r9 = r9.getScrollY()
            int r9 = -r9
            float r9 = (float) r9
            r0.setTranslate(r1, r9)
            p000a.p045n.C0341d0.m2899a(r8, r0)
            p000a.p045n.C0341d0.m2897b(r7, r0)
            android.graphics.RectF r9 = new android.graphics.RectF
            int r1 = r8.getWidth()
            float r1 = (float) r1
            int r2 = r8.getHeight()
            float r2 = (float) r2
            r3 = 0
            r9.<init>(r3, r3, r1, r2)
            r0.mapRect(r9)
            float r1 = r9.left
            int r1 = java.lang.Math.round(r1)
            float r2 = r9.top
            int r2 = java.lang.Math.round(r2)
            float r3 = r9.right
            int r3 = java.lang.Math.round(r3)
            float r4 = r9.bottom
            int r4 = java.lang.Math.round(r4)
            android.widget.ImageView r5 = new android.widget.ImageView
            android.content.Context r6 = r8.getContext()
            r5.<init>(r6)
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.setScaleType(r6)
            android.graphics.Bitmap r7 = m2773a(r8, r0, r9, r7)
            if (r7 == 0) goto L_0x005c
            r5.setImageBitmap(r7)
        L_0x005c:
            int r7 = r3 - r1
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            int r9 = r4 - r2
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
            r5.measure(r7, r8)
            r5.layout(r1, r2, r3, r4)
            return r5
    }
}
