package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
class C0643v extends androidx.appcompat.widget.C0633r {

    /* renamed from: d */
    private final android.widget.SeekBar f2306d;

    /* renamed from: e */
    private android.graphics.drawable.Drawable f2307e;

    /* renamed from: f */
    private android.content.res.ColorStateList f2308f;

    /* renamed from: g */
    private android.graphics.PorterDuff.Mode f2309g;

    /* renamed from: h */
    private boolean f2310h;

    /* renamed from: i */
    private boolean f2311i;

    C0643v(android.widget.SeekBar r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.f2308f = r0
            r1.f2309g = r0
            r0 = 0
            r1.f2310h = r0
            r1.f2311i = r0
            r1.f2306d = r2
            return
    }

    /* renamed from: d */
    private void m1842d() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f2307e
            if (r0 == 0) goto L_0x0041
            boolean r0 = r2.f2310h
            if (r0 != 0) goto L_0x000c
            boolean r0 = r2.f2311i
            if (r0 == 0) goto L_0x0041
        L_0x000c:
            android.graphics.drawable.Drawable r0 = r2.f2307e
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.C0698a.m1591h(r0)
            r2.f2307e = r0
            boolean r0 = r2.f2310h
            if (r0 == 0) goto L_0x0023
            android.graphics.drawable.Drawable r0 = r2.f2307e
            android.content.res.ColorStateList r1 = r2.f2308f
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r1)
        L_0x0023:
            boolean r0 = r2.f2311i
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r2.f2307e
            android.graphics.PorterDuff$Mode r1 = r2.f2309g
            androidx.core.graphics.drawable.C0698a.m1600a(r0, r1)
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r2.f2307e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0041
            android.graphics.drawable.Drawable r0 = r2.f2307e
            android.widget.SeekBar r1 = r2.f2306d
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L_0x0041:
            return
    }

    /* renamed from: a */
    void m1847a(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f2307e
            if (r0 == 0) goto L_0x006a
            android.widget.SeekBar r0 = r6.f2306d
            int r0 = r0.getMax()
            r1 = 1
            if (r0 <= r1) goto L_0x006a
            android.graphics.drawable.Drawable r2 = r6.f2307e
            int r2 = r2.getIntrinsicWidth()
            android.graphics.drawable.Drawable r3 = r6.f2307e
            int r3 = r3.getIntrinsicHeight()
            if (r2 < 0) goto L_0x001e
            int r2 = r2 / 2
            goto L_0x001f
        L_0x001e:
            r2 = 1
        L_0x001f:
            if (r3 < 0) goto L_0x0023
            int r1 = r3 / 2
        L_0x0023:
            android.graphics.drawable.Drawable r3 = r6.f2307e
            int r4 = -r2
            int r5 = -r1
            r3.setBounds(r4, r5, r2, r1)
            android.widget.SeekBar r1 = r6.f2306d
            int r1 = r1.getWidth()
            android.widget.SeekBar r2 = r6.f2306d
            int r2 = r2.getPaddingLeft()
            int r1 = r1 - r2
            android.widget.SeekBar r2 = r6.f2306d
            int r2 = r2.getPaddingRight()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r2 = (float) r0
            float r1 = r1 / r2
            int r2 = r7.save()
            android.widget.SeekBar r3 = r6.f2306d
            int r3 = r3.getPaddingLeft()
            float r3 = (float) r3
            android.widget.SeekBar r4 = r6.f2306d
            int r4 = r4.getHeight()
            int r4 = r4 / 2
            float r4 = (float) r4
            r7.translate(r3, r4)
            r3 = 0
        L_0x0059:
            if (r3 > r0) goto L_0x0067
            android.graphics.drawable.Drawable r4 = r6.f2307e
            r4.draw(r7)
            r4 = 0
            r7.translate(r1, r4)
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0067:
            r7.restoreToCount(r2)
        L_0x006a:
            return
    }

    /* renamed from: a */
    void m1846a(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f2307e
            if (r0 == 0) goto L_0x0008
            r1 = 0
            r0.setCallback(r1)
        L_0x0008:
            r2.f2307e = r3
            if (r3 == 0) goto L_0x002c
            android.widget.SeekBar r0 = r2.f2306d
            r3.setCallback(r0)
            android.widget.SeekBar r0 = r2.f2306d
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r0)
            androidx.core.graphics.drawable.C0698a.m1605a(r3, r0)
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L_0x0029
            android.widget.SeekBar r0 = r2.f2306d
            int[] r0 = r0.getDrawableState()
            r3.setState(r0)
        L_0x0029:
            r2.m1842d()
        L_0x002c:
            android.widget.SeekBar r3 = r2.f2306d
            r3.invalidate()
            return
    }

    @Override // androidx.appcompat.widget.C0633r
    /* renamed from: a */
    void mo1845a(android.util.AttributeSet r4, int r5) {
            r3 = this;
            super.mo1845a(r4, r5)
            android.widget.SeekBar r0 = r3.f2306d
            android.content.Context r0 = r0.getContext()
            int[] r1 = p000a.p001a.C0009j.AppCompatSeekBar
            r2 = 0
            androidx.appcompat.widget.t0 r4 = androidx.appcompat.widget.C0638t0.m1900a(r0, r4, r1, r5, r2)
            int r5 = p000a.p001a.C0009j.AppCompatSeekBar_android_thumb
            android.graphics.drawable.Drawable r5 = r4.m1897c(r5)
            if (r5 == 0) goto L_0x001d
            android.widget.SeekBar r0 = r3.f2306d
            r0.setThumb(r5)
        L_0x001d:
            int r5 = p000a.p001a.C0009j.AppCompatSeekBar_tickMark
            android.graphics.drawable.Drawable r5 = r4.m1899b(r5)
            r3.m1846a(r5)
            int r5 = p000a.p001a.C0009j.AppCompatSeekBar_tickMarkTintMode
            boolean r5 = r4.m1889g(r5)
            r0 = 1
            if (r5 == 0) goto L_0x0040
            int r5 = p000a.p001a.C0009j.AppCompatSeekBar_tickMarkTintMode
            r1 = -1
            int r5 = r4.m1894d(r5, r1)
            android.graphics.PorterDuff$Mode r1 = r3.f2309g
            android.graphics.PorterDuff$Mode r5 = androidx.appcompat.widget.C0580c0.m2107a(r5, r1)
            r3.f2309g = r5
            r3.f2311i = r0
        L_0x0040:
            int r5 = p000a.p001a.C0009j.AppCompatSeekBar_tickMarkTint
            boolean r5 = r4.m1889g(r5)
            if (r5 == 0) goto L_0x0052
            int r5 = p000a.p001a.C0009j.AppCompatSeekBar_tickMarkTint
            android.content.res.ColorStateList r5 = r4.m1907a(r5)
            r3.f2308f = r5
            r3.f2310h = r0
        L_0x0052:
            r4.m1908a()
            r3.m1842d()
            return
    }

    /* renamed from: b */
    void m1844b() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f2307e
            if (r0 == 0) goto L_0x001b
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L_0x001b
            android.widget.SeekBar r1 = r2.f2306d
            int[] r1 = r1.getDrawableState()
            boolean r1 = r0.setState(r1)
            if (r1 == 0) goto L_0x001b
            android.widget.SeekBar r1 = r2.f2306d
            r1.invalidateDrawable(r0)
        L_0x001b:
            return
    }

    /* renamed from: c */
    void m1843c() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2307e
            if (r0 == 0) goto L_0x0007
            r0.jumpToCurrentState()
        L_0x0007:
            return
    }
}
