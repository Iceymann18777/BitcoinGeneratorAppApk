package com.google.android.material.floatingactionbutton;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes.dex */
class C0954b extends com.google.android.material.floatingactionbutton.C0944a {

    /* renamed from: I */
    private android.graphics.drawable.InsetDrawable f3547I;

    C0954b(com.google.android.material.internal.C0983l r1, p050b.p051a.p052a.p053a.p062q.AbstractC0909b r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: a */
    private android.animation.Animator m160a(float r8, float r9) {
            r7 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            com.google.android.material.internal.l r1 = r7.f3526u
            r2 = 1
            float[] r3 = new float[r2]
            r4 = 0
            r3[r4] = r8
            java.lang.String r8 = "elevation"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r8, r3)
            r5 = 0
            android.animation.ObjectAnimator r8 = r8.setDuration(r5)
            android.animation.AnimatorSet$Builder r8 = r0.play(r8)
            com.google.android.material.internal.l r1 = r7.f3526u
            android.util.Property r3 = android.view.View.TRANSLATION_Z
            float[] r2 = new float[r2]
            r2[r4] = r9
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r1, r3, r2)
            r1 = 100
            android.animation.ObjectAnimator r9 = r9.setDuration(r1)
            r8.with(r9)
            android.animation.TimeInterpolator r8 = com.google.android.material.floatingactionbutton.C0944a.f3498B
            r0.setInterpolator(r8)
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: a */
    void mo159a(float r9, float r10, float r11) {
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 != r1) goto L_0x000d
            com.google.android.material.internal.l r9 = r8.f3526u
            r9.refreshDrawableState()
            goto L_0x00b1
        L_0x000d:
            android.animation.StateListAnimator r0 = new android.animation.StateListAnimator
            r0.<init>()
            int[] r1 = com.google.android.material.floatingactionbutton.C0944a.f3499C
            android.animation.Animator r11 = r8.m160a(r9, r11)
            r0.addState(r1, r11)
            int[] r11 = com.google.android.material.floatingactionbutton.C0944a.f3500D
            android.animation.Animator r1 = r8.m160a(r9, r10)
            r0.addState(r11, r1)
            int[] r11 = com.google.android.material.floatingactionbutton.C0944a.f3501E
            android.animation.Animator r1 = r8.m160a(r9, r10)
            r0.addState(r11, r1)
            int[] r11 = com.google.android.material.floatingactionbutton.C0944a.f3502F
            android.animation.Animator r10 = r8.m160a(r9, r10)
            r0.addState(r11, r10)
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.material.internal.l r1 = r8.f3526u
            r2 = 1
            float[] r3 = new float[r2]
            r4 = 0
            r3[r4] = r9
            java.lang.String r9 = "elevation"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r1, r9, r3)
            r5 = 0
            android.animation.ObjectAnimator r9 = r9.setDuration(r5)
            r11.add(r9)
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            r5 = 100
            if (r9 < r1) goto L_0x007a
            r1 = 24
            if (r9 > r1) goto L_0x007a
            com.google.android.material.internal.l r9 = r8.f3526u
            android.util.Property r1 = android.view.View.TRANSLATION_Z
            float[] r3 = new float[r2]
            float r7 = r9.getTranslationZ()
            r3[r4] = r7
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r1, r3)
            android.animation.ObjectAnimator r9 = r9.setDuration(r5)
            r11.add(r9)
        L_0x007a:
            com.google.android.material.internal.l r9 = r8.f3526u
            android.util.Property r1 = android.view.View.TRANSLATION_Z
            float[] r2 = new float[r2]
            r3 = 0
            r2[r4] = r3
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r1, r2)
            android.animation.ObjectAnimator r9 = r9.setDuration(r5)
            r11.add(r9)
            android.animation.Animator[] r9 = new android.animation.Animator[r4]
            java.lang.Object[] r9 = r11.toArray(r9)
            android.animation.Animator[] r9 = (android.animation.Animator[]) r9
            r10.playSequentially(r9)
            android.animation.TimeInterpolator r9 = com.google.android.material.floatingactionbutton.C0944a.f3498B
            r10.setInterpolator(r9)
            int[] r9 = com.google.android.material.floatingactionbutton.C0944a.f3503G
            r0.addState(r9, r10)
            int[] r9 = com.google.android.material.floatingactionbutton.C0944a.f3504H
            android.animation.Animator r10 = r8.m160a(r3, r3)
            r0.addState(r9, r10)
            com.google.android.material.internal.l r9 = r8.f3526u
            r9.setStateListAnimator(r0)
        L_0x00b1:
            b.a.a.a.q.b r9 = r8.f3527v
            boolean r9 = r9.mo200a()
            if (r9 == 0) goto L_0x00bc
            r8.m168p()
        L_0x00bc:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: a */
    void mo158a(android.graphics.Rect r6) {
            r5 = this;
            b.a.a.a.q.b r0 = r5.f3527v
            boolean r0 = r0.mo200a()
            r1 = 0
            if (r0 == 0) goto L_0x002e
            b.a.a.a.q.b r0 = r5.f3527v
            float r0 = r0.mo197b()
            float r2 = r5.mo156b()
            float r3 = r5.f3521p
            float r2 = r2 + r3
            float r3 = p050b.p051a.p052a.p053a.p062q.C0908a.m394a(r2, r0, r1)
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            float r0 = p050b.p051a.p052a.p053a.p062q.C0908a.m391b(r2, r0, r1)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r6.set(r3, r0, r3, r0)
            goto L_0x0031
        L_0x002e:
            r6.set(r1, r1, r1, r1)
        L_0x0031:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: a */
    void mo157a(int[] r3) {
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r3 != r0) goto L_0x0042
            com.google.android.material.internal.l r3 = r2.f3526u
            boolean r3 = r3.isEnabled()
            r0 = 0
            if (r3 == 0) goto L_0x0038
            com.google.android.material.internal.l r3 = r2.f3526u
            float r1 = r2.f3519n
            r3.setElevation(r1)
            com.google.android.material.internal.l r3 = r2.f3526u
            boolean r3 = r3.isPressed()
            if (r3 == 0) goto L_0x0023
            com.google.android.material.internal.l r3 = r2.f3526u
            float r0 = r2.f3521p
            goto L_0x003f
        L_0x0023:
            com.google.android.material.internal.l r3 = r2.f3526u
            boolean r3 = r3.isFocused()
            if (r3 != 0) goto L_0x0033
            com.google.android.material.internal.l r3 = r2.f3526u
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x003d
        L_0x0033:
            com.google.android.material.internal.l r3 = r2.f3526u
            float r0 = r2.f3520o
            goto L_0x003f
        L_0x0038:
            com.google.android.material.internal.l r3 = r2.f3526u
            r3.setElevation(r0)
        L_0x003d:
            com.google.android.material.internal.l r3 = r2.f3526u
        L_0x003f:
            r3.setTranslationZ(r0)
        L_0x0042:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: b */
    public float mo156b() {
            r1 = this;
            com.google.android.material.internal.l r0 = r1.f3526u
            float r0 = r0.getElevation()
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: b */
    void mo155b(android.content.res.ColorStateList r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f3516k
            boolean r1 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r1 == 0) goto L_0x0010
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            android.content.res.ColorStateList r3 = p050b.p051a.p052a.p053a.p061p.C0907a.m398a(r3)
            r0.setColor(r3)
            goto L_0x0013
        L_0x0010:
            super.mo155b(r3)
        L_0x0013:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: b */
    void mo154b(android.graphics.Rect r8) {
            r7 = this;
            b.a.a.a.q.b r0 = r7.f3527v
            boolean r0 = r0.mo200a()
            if (r0 == 0) goto L_0x001f
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.f3516k
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f3547I = r0
            b.a.a.a.q.b r8 = r7.f3527v
            android.graphics.drawable.InsetDrawable r0 = r7.f3547I
            goto L_0x0023
        L_0x001f:
            b.a.a.a.q.b r8 = r7.f3527v
            android.graphics.drawable.Drawable r0 = r7.f3516k
        L_0x0023:
            r8.mo198a(r0)
            return
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: i */
    void mo153i() {
            r0 = this;
            return
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: k */
    void mo152k() {
            r0 = this;
            r0.m168p()
            return
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: n */
    boolean mo151n() {
            r1 = this;
            r0 = 0
            return r0
    }
}
