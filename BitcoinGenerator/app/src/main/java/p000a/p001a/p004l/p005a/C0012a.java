package p000a.p001a.p004l.p005a;

/* renamed from: a.a.l.a.a */
/* loaded from: classes.dex */
public class C0012a extends p000a.p001a.p004l.p005a.C0026e {

    /* renamed from: p */
    private p000a.p001a.p004l.p005a.C0012a.C0015c f6p;

    /* renamed from: q */
    private p000a.p001a.p004l.p005a.C0012a.AbstractC0019g f7q;

    /* renamed from: r */
    private int f8r;

    /* renamed from: s */
    private int f9s;

    /* renamed from: t */
    private boolean f10t;

    /* renamed from: a.a.l.a.a$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0013a {
    }

    /* renamed from: a.a.l.a.a$b */
    /* loaded from: classes.dex */
    private static class C0014b extends p000a.p001a.p004l.p005a.C0012a.AbstractC0019g {

        /* renamed from: a */
        private final android.graphics.drawable.Animatable f11a;

        C0014b(android.graphics.drawable.Animatable r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f11a = r2
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: c */
        public void mo4236c() {
                r1 = this;
                android.graphics.drawable.Animatable r0 = r1.f11a
                r0.start()
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: d */
        public void mo4235d() {
                r1 = this;
                android.graphics.drawable.Animatable r0 = r1.f11a
                r0.stop()
                return
        }
    }

    /* renamed from: a.a.l.a.a$c */
    /* loaded from: classes.dex */
    static class C0015c extends p000a.p001a.p004l.p005a.C0026e.C0027a {

        /* renamed from: K */
        p000a.p013d.C0072d<java.lang.Long> f12K;

        /* renamed from: L */
        p000a.p013d.C0081h<java.lang.Integer> f13L;

        C0015c(p000a.p001a.p004l.p005a.C0012a.C0015c r1, p000a.p001a.p004l.p005a.C0012a r2, android.content.res.Resources r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                if (r1 == 0) goto L_0x000c
                a.d.d<java.lang.Long> r2 = r1.f12K
                r0.f12K = r2
                a.d.h<java.lang.Integer> r1 = r1.f13L
                goto L_0x0018
            L_0x000c:
                a.d.d r1 = new a.d.d
                r1.<init>()
                r0.f12K = r1
                a.d.h r1 = new a.d.h
                r1.<init>()
            L_0x0018:
                r0.f13L = r1
                return
        }

        /* renamed from: f */
        private static long m4241f(int r2, int r3) {
                long r0 = (long) r2
                r2 = 32
                long r0 = r0 << r2
                long r2 = (long) r3
                long r2 = r2 | r0
                return r2
        }

        /* renamed from: a */
        int m4248a(int r10, int r11, android.graphics.drawable.Drawable r12, boolean r13) {
                r9 = this;
                int r12 = super.m4221a(r12)
                long r0 = m4241f(r10, r11)
                if (r13 == 0) goto L_0x0010
                r2 = 8589934592(0x200000000, double:4.243991582E-314)
                goto L_0x0012
            L_0x0010:
                r2 = 0
            L_0x0012:
                a.d.d<java.lang.Long> r4 = r9.f12K
                long r5 = (long) r12
                long r7 = r5 | r2
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r4.m4059a(r0, r7)
                if (r13 == 0) goto L_0x0034
                long r10 = m4241f(r11, r10)
                a.d.d<java.lang.Long> r13 = r9.f12K
                r0 = 4294967296(0x100000000, double:2.121995791E-314)
                long r0 = r0 | r5
                long r0 = r0 | r2
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r13.m4059a(r10, r0)
            L_0x0034:
                return r12
        }

        /* renamed from: a */
        int m4247a(int[] r1, android.graphics.drawable.Drawable r2, int r3) {
                r0 = this;
                int r1 = super.m4188a(r1, r2)
                a.d.h<java.lang.Integer> r2 = r0.f13L
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.m4003c(r1, r3)
                return r1
        }

        /* renamed from: b */
        int m4246b(int[] r1) {
                r0 = this;
                int r1 = super.m4189a(r1)
                if (r1 < 0) goto L_0x0007
                return r1
            L_0x0007:
                int[] r1 = android.util.StateSet.WILD_CARD
                int r1 = super.m4189a(r1)
                return r1
        }

        /* renamed from: c */
        int m4245c(int r4, int r5) {
                r3 = this;
                long r4 = m4241f(r4, r5)
                a.d.d<java.lang.Long> r0 = r3.f12K
                r1 = -1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.Object r4 = r0.m4055b(r4, r1)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                int r5 = (int) r4
                return r5
        }

        /* renamed from: d */
        int m4244d(int r3) {
                r2 = this;
                r0 = 0
                if (r3 >= 0) goto L_0x0004
                goto L_0x0014
            L_0x0004:
                a.d.h<java.lang.Integer> r1 = r2.f13L
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r3 = r1.m4006b(r3, r0)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r0 = r3.intValue()
            L_0x0014:
                return r0
        }

        /* renamed from: d */
        boolean m4243d(int r4, int r5) {
                r3 = this;
                long r4 = m4241f(r4, r5)
                a.d.d<java.lang.Long> r0 = r3.f12K
                r1 = -1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.Object r4 = r0.m4055b(r4, r1)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r0 = 4294967296(0x100000000, double:2.121995791E-314)
                long r4 = r4 & r0
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto L_0x0024
                r4 = 1
                goto L_0x0025
            L_0x0024:
                r4 = 0
            L_0x0025:
                return r4
        }

        /* renamed from: e */
        boolean m4242e(int r4, int r5) {
                r3 = this;
                long r4 = m4241f(r4, r5)
                a.d.d<java.lang.Long> r0 = r3.f12K
                r1 = -1
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.Object r4 = r0.m4055b(r4, r1)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r0 = 8589934592(0x200000000, double:4.243991582E-314)
                long r4 = r4 & r0
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto L_0x0024
                r4 = 1
                goto L_0x0025
            L_0x0024:
                r4 = 0
            L_0x0025:
                return r4
        }

        @Override // p000a.p001a.p004l.p005a.C0026e.C0027a, p000a.p001a.p004l.p005a.C0020b.AbstractC0023c
        /* renamed from: m */
        void mo4187m() {
                r1 = this;
                a.d.d<java.lang.Long> r0 = r1.f12K
                a.d.d r0 = r0.clone()
                r1.f12K = r0
                a.d.h<java.lang.Integer> r0 = r1.f13L
                a.d.h r0 = r0.clone()
                r1.f13L = r0
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0026e.C0027a, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                a.a.l.a.a r0 = new a.a.l.a.a
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // p000a.p001a.p004l.p005a.C0026e.C0027a, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                a.a.l.a.a r0 = new a.a.l.a.a
                r0.<init>(r1, r2)
                return r0
        }
    }

    /* renamed from: a.a.l.a.a$d */
    /* loaded from: classes.dex */
    private static class C0016d extends p000a.p001a.p004l.p005a.C0012a.AbstractC0019g {

        /* renamed from: a */
        private final p000a.p046o.p047a.p048a.C0394c f14a;

        C0016d(p000a.p046o.p047a.p048a.C0394c r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f14a = r2
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: c */
        public void mo4236c() {
                r1 = this;
                a.o.a.a.c r0 = r1.f14a
                r0.start()
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: d */
        public void mo4235d() {
                r1 = this;
                a.o.a.a.c r0 = r1.f14a
                r0.stop()
                return
        }
    }

    /* renamed from: a.a.l.a.a$e */
    /* loaded from: classes.dex */
    private static class C0017e extends p000a.p001a.p004l.p005a.C0012a.AbstractC0019g {

        /* renamed from: a */
        private final android.animation.ObjectAnimator f15a;

        /* renamed from: b */
        private final boolean f16b;

        C0017e(android.graphics.drawable.AnimationDrawable r6, boolean r7, boolean r8) {
                r5 = this;
                r0 = 0
                r5.<init>(r0)
                int r0 = r6.getNumberOfFrames()
                r1 = 0
                if (r7 == 0) goto L_0x000e
                int r2 = r0 + (-1)
                goto L_0x000f
            L_0x000e:
                r2 = 0
            L_0x000f:
                r3 = 1
                if (r7 == 0) goto L_0x0014
                r0 = 0
                goto L_0x0015
            L_0x0014:
                int r0 = r0 - r3
            L_0x0015:
                a.a.l.a.a$f r4 = new a.a.l.a.a$f
                r4.<init>(r6, r7)
                r7 = 2
                int[] r7 = new int[r7]
                r7[r1] = r2
                r7[r3] = r0
                java.lang.String r0 = "currentIndex"
                android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofInt(r6, r0, r7)
                int r7 = android.os.Build.VERSION.SDK_INT
                r0 = 18
                if (r7 < r0) goto L_0x0030
                r6.setAutoCancel(r3)
            L_0x0030:
                int r7 = r4.m4240a()
                long r0 = (long) r7
                r6.setDuration(r0)
                r6.setInterpolator(r4)
                r5.f16b = r8
                r5.f15a = r6
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: a */
        public boolean mo4238a() {
                r1 = this;
                boolean r0 = r1.f16b
                return r0
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: b */
        public void mo4237b() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.f15a
                r0.reverse()
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: c */
        public void mo4236c() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.f15a
                r0.start()
                return
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: d */
        public void mo4235d() {
                r1 = this;
                android.animation.ObjectAnimator r0 = r1.f15a
                r0.cancel()
                return
        }
    }

    /* renamed from: a.a.l.a.a$f */
    /* loaded from: classes.dex */
    private static class C0018f implements android.animation.TimeInterpolator {

        /* renamed from: a */
        private int[] f17a;

        /* renamed from: b */
        private int f18b;

        /* renamed from: c */
        private int f19c;

        C0018f(android.graphics.drawable.AnimationDrawable r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.m4239a(r1, r2)
                return
        }

        /* renamed from: a */
        int m4240a() {
                r1 = this;
                int r0 = r1.f19c
                return r0
        }

        /* renamed from: a */
        int m4239a(android.graphics.drawable.AnimationDrawable r6, boolean r7) {
                r5 = this;
                int r0 = r6.getNumberOfFrames()
                r5.f18b = r0
                int[] r1 = r5.f17a
                if (r1 == 0) goto L_0x000d
                int r1 = r1.length
                if (r1 >= r0) goto L_0x0011
            L_0x000d:
                int[] r1 = new int[r0]
                r5.f17a = r1
            L_0x0011:
                int[] r1 = r5.f17a
                r2 = 0
                r3 = 0
            L_0x0015:
                if (r2 >= r0) goto L_0x0029
                if (r7 == 0) goto L_0x001e
                int r4 = r0 - r2
                int r4 = r4 + (-1)
                goto L_0x001f
            L_0x001e:
                r4 = r2
            L_0x001f:
                int r4 = r6.getDuration(r4)
                r1[r2] = r4
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto L_0x0015
            L_0x0029:
                r5.f19c = r3
                return r3
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float r5) {
                r4 = this;
                int r0 = r4.f19c
                float r0 = (float) r0
                float r5 = r5 * r0
                r0 = 1056964608(0x3f000000, float:0.5)
                float r5 = r5 + r0
                int r5 = (int) r5
                int r0 = r4.f18b
                int[] r1 = r4.f17a
                r2 = 0
            L_0x000e:
                if (r2 >= r0) goto L_0x001a
                r3 = r1[r2]
                if (r5 < r3) goto L_0x001a
                r3 = r1[r2]
                int r5 = r5 - r3
                int r2 = r2 + 1
                goto L_0x000e
            L_0x001a:
                if (r2 >= r0) goto L_0x0022
                float r5 = (float) r5
                int r1 = r4.f19c
                float r1 = (float) r1
                float r5 = r5 / r1
                goto L_0x0023
            L_0x0022:
                r5 = 0
            L_0x0023:
                float r1 = (float) r2
                float r0 = (float) r0
                float r1 = r1 / r0
                float r1 = r1 + r5
                return r1
        }
    }

    /* renamed from: a.a.l.a.a$g */
    /* loaded from: classes.dex */
    private static abstract class AbstractC0019g {
        private AbstractC0019g() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AbstractC0019g(p000a.p001a.p004l.p005a.C0012a.C0013a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public boolean mo4238a() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: b */
        public void mo4237b() {
                r0 = this;
                return
        }

        /* renamed from: c */
        public abstract void mo4236c();

        /* renamed from: d */
        public abstract void mo4235d();
    }

    static {
            java.lang.Class<a.a.l.a.a> r0 = p000a.p001a.p004l.p005a.C0012a.class
            return
    }

    public C0012a() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    C0012a(p000a.p001a.p004l.p005a.C0012a.C0015c r2, android.content.res.Resources r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = -1
            r1.f8r = r0
            r1.f9s = r0
            a.a.l.a.a$c r0 = new a.a.l.a.a$c
            r0.<init>(r2, r1, r3)
            r1.mo4192a(r0)
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
            r1.jumpToCurrentState()
            return
    }

    /* renamed from: a */
    private void m4255a(android.content.res.TypedArray r4) {
            r3 = this;
            a.a.l.a.a$c r0 = r3.f6p
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0011
            int r1 = r0.f46d
            int r2 = r4.getChangingConfigurations()
            r1 = r1 | r2
            r0.f46d = r1
        L_0x0011:
            int r1 = p000a.p001a.C0009j.AnimatedStateListDrawableCompat_android_variablePadding
            boolean r2 = r0.f51i
            boolean r1 = r4.getBoolean(r1, r2)
            r0.m4215b(r1)
            int r1 = p000a.p001a.C0009j.AnimatedStateListDrawableCompat_android_constantSize
            boolean r2 = r0.f54l
            boolean r1 = r4.getBoolean(r1, r2)
            r0.m4220a(r1)
            int r1 = p000a.p001a.C0009j.AnimatedStateListDrawableCompat_android_enterFadeDuration
            int r2 = r0.f34A
            int r1 = r4.getInt(r1, r2)
            r0.m4218b(r1)
            int r1 = p000a.p001a.C0009j.AnimatedStateListDrawableCompat_android_exitFadeDuration
            int r2 = r0.f35B
            int r1 = r4.getInt(r1, r2)
            r0.m4213c(r1)
            int r1 = p000a.p001a.C0009j.AnimatedStateListDrawableCompat_android_dither
            boolean r0 = r0.f66x
            boolean r4 = r4.getBoolean(r1, r0)
            r3.setDither(r4)
            return
    }

    /* renamed from: b */
    public static p000a.p001a.p004l.p005a.C0012a m4253b(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
            java.lang.String r0 = r10.getName()
            java.lang.String r1 = "animated-selector"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x001b
            a.a.l.a.a r0 = new a.a.l.a.a
            r0.<init>()
            r2 = r0
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.m4256a(r3, r4, r5, r6, r7)
            return r0
        L_0x001b:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": invalid animated-selector tag "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    /* renamed from: b */
    private boolean m4254b(int r10) {
            r9 = this;
            a.a.l.a.a$g r0 = r9.f7q
            r1 = 1
            if (r0 == 0) goto L_0x0024
            int r2 = r9.f8r
            if (r10 != r2) goto L_0x000a
            return r1
        L_0x000a:
            int r2 = r9.f9s
            if (r10 != r2) goto L_0x001e
            boolean r2 = r0.mo4238a()
            if (r2 == 0) goto L_0x001e
            r0.mo4237b()
            int r0 = r9.f9s
            r9.f8r = r0
            r9.f9s = r10
            return r1
        L_0x001e:
            int r2 = r9.f8r
            r0.mo4235d()
            goto L_0x0028
        L_0x0024:
            int r2 = r9.m4229b()
        L_0x0028:
            r0 = 0
            r9.f7q = r0
            r0 = -1
            r9.f9s = r0
            r9.f8r = r0
            a.a.l.a.a$c r0 = r9.f6p
            int r3 = r0.m4244d(r2)
            int r4 = r0.m4244d(r10)
            r5 = 0
            if (r4 == 0) goto L_0x0083
            if (r3 != 0) goto L_0x0040
            goto L_0x0083
        L_0x0040:
            int r6 = r0.m4245c(r3, r4)
            if (r6 >= 0) goto L_0x0047
            return r5
        L_0x0047:
            boolean r7 = r0.m4242e(r3, r4)
            r9.m4234a(r6)
            android.graphics.drawable.Drawable r6 = r9.getCurrent()
            boolean r8 = r6 instanceof android.graphics.drawable.AnimationDrawable
            if (r8 == 0) goto L_0x0062
            boolean r0 = r0.m4243d(r3, r4)
            a.a.l.a.a$e r3 = new a.a.l.a.a$e
            android.graphics.drawable.AnimationDrawable r6 = (android.graphics.drawable.AnimationDrawable) r6
            r3.<init>(r6, r0, r7)
            goto L_0x0079
        L_0x0062:
            boolean r0 = r6 instanceof p000a.p046o.p047a.p048a.C0394c
            if (r0 == 0) goto L_0x006e
            a.a.l.a.a$d r3 = new a.a.l.a.a$d
            a.o.a.a.c r6 = (p000a.p046o.p047a.p048a.C0394c) r6
            r3.<init>(r6)
            goto L_0x0079
        L_0x006e:
            boolean r0 = r6 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L_0x0083
            a.a.l.a.a$b r3 = new a.a.l.a.a$b
            android.graphics.drawable.Animatable r6 = (android.graphics.drawable.Animatable) r6
            r3.<init>(r6)
        L_0x0079:
            r3.mo4236c()
            r9.f7q = r3
            r9.f9s = r2
            r9.f8r = r10
            return r1
        L_0x0083:
            return r5
    }

    /* renamed from: c */
    private void m4252c() {
            r1 = this;
            int[] r0 = r1.getState()
            r1.onStateChange(r0)
            return
    }

    /* renamed from: c */
    private void m4251c(android.content.Context r6, android.content.res.Resources r7, org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, android.content.res.Resources.Theme r10) {
            r5 = this;
            int r0 = r8.getDepth()
            r1 = 1
            int r0 = r0 + r1
        L_0x0006:
            int r2 = r8.next()
            if (r2 == r1) goto L_0x003c
            int r3 = r8.getDepth()
            if (r3 >= r0) goto L_0x0015
            r4 = 3
            if (r2 == r4) goto L_0x003c
        L_0x0015:
            r4 = 2
            if (r2 == r4) goto L_0x0019
            goto L_0x0006
        L_0x0019:
            if (r3 <= r0) goto L_0x001c
            goto L_0x0006
        L_0x001c:
            java.lang.String r2 = r8.getName()
            java.lang.String r3 = "item"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002c
            r5.m4250d(r6, r7, r8, r9, r10)
            goto L_0x0006
        L_0x002c:
            java.lang.String r2 = r8.getName()
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0006
            r5.m4249e(r6, r7, r8, r9, r10)
            goto L_0x0006
        L_0x003c:
            return
    }

    /* renamed from: d */
    private int m4250d(android.content.Context r5, android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) {
            r4 = this;
            int[] r0 = p000a.p001a.C0009j.AnimatedStateListDrawableItem
            android.content.res.TypedArray r0 = p000a.p018g.p019d.p020c.C0140g.m3681a(r6, r9, r8, r0)
            int r1 = p000a.p001a.C0009j.AnimatedStateListDrawableItem_android_id
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = p000a.p001a.C0009j.AnimatedStateListDrawableItem_android_drawable
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L_0x001b
            android.graphics.drawable.Drawable r5 = p000a.p001a.p002k.p003a.C0010a.m4259c(r5, r2)
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            r0.recycle()
            int[] r0 = r4.m4191a(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L_0x006c
        L_0x0027:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L_0x002f
            goto L_0x0027
        L_0x002f:
            r3 = 2
            if (r5 != r3) goto L_0x0053
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0043
            a.o.a.a.i r5 = p000a.p046o.p047a.p048a.C0404i.createFromXmlInner(r6, r7, r8, r9)
            goto L_0x006c
        L_0x0043:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r5 < r3) goto L_0x004e
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9)
            goto L_0x006c
        L_0x004e:
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8)
            goto L_0x006c
        L_0x0053:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x006c:
            if (r5 == 0) goto L_0x0075
            a.a.l.a.a$c r6 = r4.f6p
            int r5 = r6.m4247a(r0, r5, r1)
            return r5
        L_0x0075:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            goto L_0x008f
        L_0x008e:
            throw r5
        L_0x008f:
            goto L_0x008e
    }

    /* renamed from: e */
    private int m4249e(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
            r7 = this;
            int[] r0 = p000a.p001a.C0009j.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r0 = p000a.p018g.p019d.p020c.C0140g.m3681a(r9, r12, r11, r0)
            int r1 = p000a.p001a.C0009j.AnimatedStateListDrawableTransition_android_fromId
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = p000a.p001a.C0009j.AnimatedStateListDrawableTransition_android_toId
            int r3 = r0.getResourceId(r3, r2)
            int r4 = p000a.p001a.C0009j.AnimatedStateListDrawableTransition_android_drawable
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L_0x0020
            android.graphics.drawable.Drawable r4 = p000a.p001a.p002k.p003a.C0010a.m4259c(r8, r4)
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            int r5 = p000a.p001a.C0009j.AnimatedStateListDrawableTransition_android_reversible
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L_0x0074
        L_0x002f:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L_0x0037
            goto L_0x002f
        L_0x0037:
            r6 = 2
            if (r4 != r6) goto L_0x005b
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x004b
            a.o.a.a.c r4 = p000a.p046o.p047a.p048a.C0394c.m2759a(r8, r9, r10, r11, r12)
            goto L_0x0074
        L_0x004b:
            int r8 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r8 < r4) goto L_0x0056
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12)
            goto L_0x0074
        L_0x0056:
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11)
            goto L_0x0074
        L_0x005b:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0074:
            if (r4 == 0) goto L_0x009c
            if (r1 == r2) goto L_0x0081
            if (r3 == r2) goto L_0x0081
            a.a.l.a.a$c r8 = r7.f6p
            int r8 = r8.m4248a(r1, r3, r4, r5)
            return r8
        L_0x0081:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x009c:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            goto L_0x00b6
        L_0x00b5:
            throw r8
        L_0x00b6:
            goto L_0x00b5
    }

    @Override // p000a.p001a.p004l.p005a.C0026e, p000a.p001a.p004l.p005a.C0020b
    /* renamed from: a */
    p000a.p001a.p004l.p005a.C0012a.C0015c mo4193a() {
            r3 = this;
            a.a.l.a.a$c r0 = new a.a.l.a.a$c
            a.a.l.a.a$c r1 = r3.f6p
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // p000a.p001a.p004l.p005a.C0026e, p000a.p001a.p004l.p005a.C0020b
    /* renamed from: a */
    /* bridge */ /* synthetic */ p000a.p001a.p004l.p005a.C0020b.AbstractC0023c mo4193a() {
            r1 = this;
            a.a.l.a.a$c r0 = r1.mo4193a()
            return r0
    }

    @Override // p000a.p001a.p004l.p005a.C0026e, p000a.p001a.p004l.p005a.C0020b
    /* renamed from: a */
    /* bridge */ /* synthetic */ p000a.p001a.p004l.p005a.C0026e.C0027a mo4193a() {
            r1 = this;
            a.a.l.a.a$c r0 = r1.mo4193a()
            return r0
    }

    @Override // p000a.p001a.p004l.p005a.C0026e, p000a.p001a.p004l.p005a.C0020b
    /* renamed from: a */
    protected void mo4192a(p000a.p001a.p004l.p005a.C0020b.AbstractC0023c r2) {
            r1 = this;
            super.mo4192a(r2)
            boolean r0 = r2 instanceof p000a.p001a.p004l.p005a.C0012a.C0015c
            if (r0 == 0) goto L_0x000b
            a.a.l.a.a$c r2 = (p000a.p001a.p004l.p005a.C0012a.C0015c) r2
            r1.f6p = r2
        L_0x000b:
            return
    }

    /* renamed from: a */
    public void m4256a(android.content.Context r4, android.content.res.Resources r5, org.xmlpull.v1.XmlPullParser r6, android.util.AttributeSet r7, android.content.res.Resources.Theme r8) {
            r3 = this;
            int[] r0 = p000a.p001a.C0009j.AnimatedStateListDrawableCompat
            android.content.res.TypedArray r0 = p000a.p018g.p019d.p020c.C0140g.m3681a(r5, r8, r7, r0)
            int r1 = p000a.p001a.C0009j.AnimatedStateListDrawableCompat_android_visible
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            r3.setVisible(r1, r2)
            r3.m4255a(r0)
            r3.m4233a(r5)
            r0.recycle()
            r3.m4251c(r4, r5, r6, r7, r8)
            r3.m4252c()
            return
    }

    @Override // p000a.p001a.p004l.p005a.C0026e, android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            super.jumpToCurrentState()
            a.a.l.a.a$g r0 = r1.f7q
            if (r0 == 0) goto L_0x0017
            r0.mo4235d()
            r0 = 0
            r1.f7q = r0
            int r0 = r1.f8r
            r1.m4234a(r0)
            r0 = -1
            r1.f8r = r0
            r1.f9s = r0
        L_0x0017:
            return
    }

    @Override // p000a.p001a.p004l.p005a.C0026e, p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.f10t
            if (r0 != 0) goto L_0x0011
            super.mutate()
            if (r1 != r1) goto L_0x0011
            a.a.l.a.a$c r0 = r1.f6p
            r0.mo4187m()
            r0 = 1
            r1.f10t = r0
        L_0x0011:
            return r1
    }

    @Override // p000a.p001a.p004l.p005a.C0026e, p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
            r2 = this;
            a.a.l.a.a$c r0 = r2.f6p
            int r0 = r0.m4246b(r3)
            int r1 = r2.m4229b()
            if (r0 == r1) goto L_0x001a
            boolean r1 = r2.m4254b(r0)
            if (r1 != 0) goto L_0x0018
            boolean r0 = r2.m4234a(r0)
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            android.graphics.drawable.Drawable r1 = r2.getCurrent()
            if (r1 == 0) goto L_0x0026
            boolean r3 = r1.setState(r3)
            r0 = r0 | r3
        L_0x0026:
            return r0
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            a.a.l.a.a$g r1 = r2.f7q
            if (r1 == 0) goto L_0x0017
            if (r0 != 0) goto L_0x000c
            if (r4 == 0) goto L_0x0017
        L_0x000c:
            if (r3 == 0) goto L_0x0014
            a.a.l.a.a$g r3 = r2.f7q
            r3.mo4236c()
            goto L_0x0017
        L_0x0014:
            r2.jumpToCurrentState()
        L_0x0017:
            return r0
    }
}
