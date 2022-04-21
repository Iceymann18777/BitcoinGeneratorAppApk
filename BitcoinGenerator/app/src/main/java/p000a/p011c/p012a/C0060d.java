package p000a.p011c.p012a;

/* renamed from: a.c.a.d */
/* loaded from: classes.dex */
class C0060d implements p000a.p011c.p012a.AbstractC0063f {

    /* renamed from: a */
    final android.graphics.RectF f183a;

    /* renamed from: a.c.a.d$a */
    /* loaded from: classes.dex */
    class C0061a implements p000a.p011c.p012a.C0065h.AbstractC0066a {

        /* renamed from: a */
        final /* synthetic */ p000a.p011c.p012a.C0060d f184a;

        C0061a(p000a.p011c.p012a.C0060d r1) {
                r0 = this;
                r0.f184a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p011c.p012a.C0065h.AbstractC0066a
        /* renamed from: a */
        public void mo4080a(android.graphics.Canvas r17, android.graphics.RectF r18, float r19, android.graphics.Paint r20) {
                r16 = this;
                r0 = r16
                r7 = r17
                r8 = r18
                r1 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 * r19
                float r2 = r18.width()
                float r2 = r2 - r1
                r9 = 1065353216(0x3f800000, float:1.0)
                float r10 = r2 - r9
                float r2 = r18.height()
                float r2 = r2 - r1
                float r11 = r2 - r9
                int r1 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
                if (r1 < 0) goto L_0x00a0
                r1 = 1056964608(0x3f000000, float:0.5)
                float r12 = r19 + r1
                a.c.a.d r1 = r0.f184a
                android.graphics.RectF r1 = r1.f183a
                float r2 = -r12
                r1.set(r2, r2, r12, r12)
                int r13 = r17.save()
                float r1 = r8.left
                float r1 = r1 + r12
                float r2 = r8.top
                float r2 = r2 + r12
                r7.translate(r1, r2)
                a.c.a.d r1 = r0.f184a
                android.graphics.RectF r2 = r1.f183a
                r3 = 1127481344(0x43340000, float:180.0)
                r4 = 1119092736(0x42b40000, float:90.0)
                r5 = 1
                r1 = r17
                r6 = r20
                r1.drawArc(r2, r3, r4, r5, r6)
                r14 = 0
                r7.translate(r10, r14)
                r15 = 1119092736(0x42b40000, float:90.0)
                r7.rotate(r15)
                a.c.a.d r1 = r0.f184a
                android.graphics.RectF r2 = r1.f183a
                r1 = r17
                r1.drawArc(r2, r3, r4, r5, r6)
                r7.translate(r11, r14)
                r7.rotate(r15)
                a.c.a.d r1 = r0.f184a
                android.graphics.RectF r2 = r1.f183a
                r1 = r17
                r1.drawArc(r2, r3, r4, r5, r6)
                r7.translate(r10, r14)
                r7.rotate(r15)
                a.c.a.d r1 = r0.f184a
                android.graphics.RectF r2 = r1.f183a
                r1 = r17
                r1.drawArc(r2, r3, r4, r5, r6)
                r7.restoreToCount(r13)
                float r1 = r8.left
                float r1 = r1 + r12
                float r2 = r1 - r9
                float r3 = r8.top
                float r1 = r8.right
                float r1 = r1 - r12
                float r4 = r1 + r9
                float r5 = r3 + r12
                r1 = r17
                r1.drawRect(r2, r3, r4, r5, r6)
                float r1 = r8.left
                float r1 = r1 + r12
                float r2 = r1 - r9
                float r5 = r8.bottom
                float r3 = r5 - r12
                float r1 = r8.right
                float r1 = r1 - r12
                float r4 = r1 + r9
                r1 = r17
                r1.drawRect(r2, r3, r4, r5, r6)
            L_0x00a0:
                float r2 = r8.left
                float r1 = r8.top
                float r3 = r1 + r19
                float r4 = r8.right
                float r1 = r8.bottom
                float r5 = r1 - r19
                r1 = r17
                r6 = r20
                r1.drawRect(r2, r3, r4, r5, r6)
                return
        }
    }

    C0060d() {
            r1 = this;
            r1.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.f183a = r0
            return
    }

    /* renamed from: j */
    private p000a.p011c.p012a.C0065h m4129j(p000a.p011c.p012a.AbstractC0062e r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r1.m4124c()
            a.c.a.h r1 = (p000a.p011c.p012a.C0065h) r1
            return r1
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public float mo4121a(p000a.p011c.p012a.AbstractC0062e r1) {
            r0 = this;
            a.c.a.h r1 = r0.m4129j(r1)
            float r1 = r1.m4087c()
            return r1
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public void mo4122a() {
            r1 = this;
            a.c.a.d$a r0 = new a.c.a.d$a
            r0.<init>(r1)
            p000a.p011c.p012a.C0065h.f197r = r0
            return
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public void mo4120a(p000a.p011c.p012a.AbstractC0062e r1, float r2) {
            r0 = this;
            a.c.a.h r1 = r0.m4129j(r1)
            r1.m4086c(r2)
            return
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public void mo4119a(p000a.p011c.p012a.AbstractC0062e r1, android.content.res.ColorStateList r2) {
            r0 = this;
            a.c.a.h r1 = r0.m4129j(r1)
            r1.m4096a(r2)
            return
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: b */
    public float mo4118b(p000a.p011c.p012a.AbstractC0062e r1) {
            r0 = this;
            a.c.a.h r1 = r0.m4129j(r1)
            float r1 = r1.m4092b()
            return r1
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: b */
    public void mo4117b(p000a.p011c.p012a.AbstractC0062e r2, float r3) {
            r1 = this;
            a.c.a.h r0 = r1.m4129j(r2)
            r0.m4091b(r3)
            r1.m4130i(r2)
            return
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: c */
    public void mo4116c(p000a.p011c.p012a.AbstractC0062e r3) {
            r2 = this;
            a.c.a.h r0 = r2.m4129j(r3)
            boolean r1 = r3.m4123d()
            r0.m4093a(r1)
            r2.m4130i(r3)
            return
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: c */
    public void mo4115c(p000a.p011c.p012a.AbstractC0062e r2, float r3) {
            r1 = this;
            a.c.a.h r0 = r1.m4129j(r2)
            r0.m4099a(r3)
            r1.m4130i(r2)
            return
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: d */
    public float mo4114d(p000a.p011c.p012a.AbstractC0062e r1) {
            r0 = this;
            a.c.a.h r1 = r0.m4129j(r1)
            float r1 = r1.m4085d()
            return r1
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: e */
    public float mo4113e(p000a.p011c.p012a.AbstractC0062e r1) {
            r0 = this;
            a.c.a.h r1 = r0.m4129j(r1)
            float r1 = r1.m4082f()
            return r1
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: f */
    public float mo4112f(p000a.p011c.p012a.AbstractC0062e r1) {
            r0 = this;
            a.c.a.h r1 = r0.m4129j(r1)
            float r1 = r1.m4083e()
            return r1
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: g */
    public void mo4111g(p000a.p011c.p012a.AbstractC0062e r1) {
            r0 = this;
            return
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: h */
    public android.content.res.ColorStateList mo4110h(p000a.p011c.p012a.AbstractC0062e r1) {
            r0 = this;
            a.c.a.h r1 = r0.m4129j(r1)
            android.content.res.ColorStateList r1 = r1.m4100a()
            return r1
    }

    /* renamed from: i */
    public void m4130i(p000a.p011c.p012a.AbstractC0062e r5) {
            r4 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            a.c.a.h r1 = r4.m4129j(r5)
            r1.m4094a(r0)
            float r1 = r4.mo4112f(r5)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            float r2 = r4.mo4114d(r5)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r5.m4127a(r1, r2)
            int r1 = r0.left
            int r2 = r0.top
            int r3 = r0.right
            int r0 = r0.bottom
            r5.m4126a(r1, r2, r3, r0)
            return
    }
}
