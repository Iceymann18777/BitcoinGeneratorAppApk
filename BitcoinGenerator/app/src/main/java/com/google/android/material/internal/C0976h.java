package com.google.android.material.internal;

/* renamed from: com.google.android.material.internal.h */
/* loaded from: classes.dex */
public class C0976h extends android.widget.FrameLayout {

    /* renamed from: b */
    android.graphics.drawable.Drawable f3598b;

    /* renamed from: c */
    android.graphics.Rect f3599c;

    /* renamed from: d */
    private android.graphics.Rect f3600d;

    /* renamed from: com.google.android.material.internal.h$a */
    /* loaded from: classes.dex */
    class C0977a implements p000a.p018g.p029l.AbstractC0213o {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.internal.C0976h f3601a;

        C0977a(com.google.android.material.internal.C0976h r1) {
                r0 = this;
                r0.f3601a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.AbstractC0213o
        /* renamed from: a */
        public p000a.p018g.p029l.C0230z mo86a(android.view.View r5, p000a.p018g.p029l.C0230z r6) {
                r4 = this;
                com.google.android.material.internal.h r5 = r4.f3601a
                android.graphics.Rect r0 = r5.f3599c
                if (r0 != 0) goto L_0x000d
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r5.f3599c = r0
            L_0x000d:
                com.google.android.material.internal.h r5 = r4.f3601a
                android.graphics.Rect r5 = r5.f3599c
                int r0 = r6.m3357c()
                int r1 = r6.m3355e()
                int r2 = r6.m3356d()
                int r3 = r6.m3358b()
                r5.set(r0, r1, r2, r3)
                com.google.android.material.internal.h r5 = r4.f3601a
                r5.mo68a(r6)
                com.google.android.material.internal.h r5 = r4.f3601a
                boolean r0 = r6.m3354f()
                if (r0 == 0) goto L_0x003a
                com.google.android.material.internal.h r0 = r4.f3601a
                android.graphics.drawable.Drawable r0 = r0.f3598b
                if (r0 != 0) goto L_0x0038
                goto L_0x003a
            L_0x0038:
                r0 = 0
                goto L_0x003b
            L_0x003a:
                r0 = 1
            L_0x003b:
                r5.setWillNotDraw(r0)
                com.google.android.material.internal.h r5 = r4.f3601a
                p000a.p018g.p029l.C0216r.m3450A(r5)
                a.g.l.z r5 = r6.m3362a()
                return r5
        }
    }

    public C0976h(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0976h(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C0976h(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f3600d = r0
            int[] r3 = p050b.p051a.p052a.p053a.C0876i.ScrimInsetsFrameLayout
            int r5 = p050b.p051a.p052a.p053a.C0875h.Widget_Design_ScrimInsetsFrameLayout
            r0 = 0
            int[] r6 = new int[r0]
            r1 = r8
            r2 = r9
            r4 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.C0981j.m73c(r1, r2, r3, r4, r5, r6)
            int r9 = p050b.p051a.p052a.p053a.C0876i.ScrimInsetsFrameLayout_insetForeground
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r7.f3598b = r9
            r8.recycle()
            r8 = 1
            r7.setWillNotDraw(r8)
            com.google.android.material.internal.h$a r8 = new com.google.android.material.internal.h$a
            r8.<init>(r7)
            p000a.p018g.p029l.C0216r.m3439a(r7, r8)
            return
    }

    /* renamed from: a */
    protected void mo68a(p000a.p018g.p029l.C0230z r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r9) {
            r8 = this;
            super.draw(r9)
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            android.graphics.Rect r2 = r8.f3599c
            if (r2 == 0) goto L_0x008b
            android.graphics.drawable.Drawable r2 = r8.f3598b
            if (r2 == 0) goto L_0x008b
            int r2 = r9.save()
            int r3 = r8.getScrollX()
            float r3 = (float) r3
            int r4 = r8.getScrollY()
            float r4 = (float) r4
            r9.translate(r3, r4)
            android.graphics.Rect r3 = r8.f3600d
            android.graphics.Rect r4 = r8.f3599c
            int r4 = r4.top
            r5 = 0
            r3.set(r5, r5, r0, r4)
            android.graphics.drawable.Drawable r3 = r8.f3598b
            android.graphics.Rect r4 = r8.f3600d
            r3.setBounds(r4)
            android.graphics.drawable.Drawable r3 = r8.f3598b
            r3.draw(r9)
            android.graphics.Rect r3 = r8.f3600d
            android.graphics.Rect r4 = r8.f3599c
            int r4 = r4.bottom
            int r4 = r1 - r4
            r3.set(r5, r4, r0, r1)
            android.graphics.drawable.Drawable r3 = r8.f3598b
            android.graphics.Rect r4 = r8.f3600d
            r3.setBounds(r4)
            android.graphics.drawable.Drawable r3 = r8.f3598b
            r3.draw(r9)
            android.graphics.Rect r3 = r8.f3600d
            android.graphics.Rect r4 = r8.f3599c
            int r6 = r4.top
            int r7 = r4.left
            int r4 = r4.bottom
            int r4 = r1 - r4
            r3.set(r5, r6, r7, r4)
            android.graphics.drawable.Drawable r3 = r8.f3598b
            android.graphics.Rect r4 = r8.f3600d
            r3.setBounds(r4)
            android.graphics.drawable.Drawable r3 = r8.f3598b
            r3.draw(r9)
            android.graphics.Rect r3 = r8.f3600d
            android.graphics.Rect r4 = r8.f3599c
            int r5 = r4.right
            int r5 = r0 - r5
            int r6 = r4.top
            int r4 = r4.bottom
            int r1 = r1 - r4
            r3.set(r5, r6, r0, r1)
            android.graphics.drawable.Drawable r0 = r8.f3598b
            android.graphics.Rect r1 = r8.f3600d
            r0.setBounds(r1)
            android.graphics.drawable.Drawable r0 = r8.f3598b
            r0.draw(r9)
            r9.restoreToCount(r2)
        L_0x008b:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            android.graphics.drawable.Drawable r0 = r1.f3598b
            if (r0 == 0) goto L_0x000a
            r0.setCallback(r1)
        L_0x000a:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.graphics.drawable.Drawable r0 = r2.f3598b
            if (r0 == 0) goto L_0x000b
            r1 = 0
            r0.setCallback(r1)
        L_0x000b:
            return
    }
}
