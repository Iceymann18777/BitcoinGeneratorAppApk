package p050b.p051a.p052a.p053a.p056l;

/* renamed from: b.a.a.a.l.d */
/* loaded from: classes.dex */
public interface AbstractC0895d extends p050b.p051a.p052a.p053a.p056l.C0893c.AbstractC0894a {

    /* renamed from: b.a.a.a.l.d$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0896a {
    }

    /* renamed from: b.a.a.a.l.d$b */
    /* loaded from: classes.dex */
    public static class C0897b implements android.animation.TypeEvaluator<p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e> {

        /* renamed from: b */
        public static final android.animation.TypeEvaluator<p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e> f3336b = null;

        /* renamed from: a */
        private final p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e f3337a;

        static {
                b.a.a.a.l.d$b r0 = new b.a.a.a.l.d$b
                r0.<init>()
                p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0897b.f3336b = r0
                return
        }

        public C0897b() {
                r2 = this;
                r2.<init>()
                b.a.a.a.l.d$e r0 = new b.a.a.a.l.d$e
                r1 = 0
                r0.<init>(r1)
                r2.f3337a = r0
                return
        }

        /* renamed from: a */
        public p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e m418a(float r5, p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e r6, p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e r7) {
                r4 = this;
                b.a.a.a.l.d$e r0 = r4.f3337a
                float r1 = r6.f3340a
                float r2 = r7.f3340a
                float r1 = p050b.p051a.p052a.p053a.p059n.C0905a.m405a(r1, r2, r5)
                float r2 = r6.f3341b
                float r3 = r7.f3341b
                float r2 = p050b.p051a.p052a.p053a.p059n.C0905a.m405a(r2, r3, r5)
                float r6 = r6.f3342c
                float r7 = r7.f3342c
                float r5 = p050b.p051a.p052a.p053a.p059n.C0905a.m405a(r6, r7, r5)
                r0.m413a(r1, r2, r5)
                b.a.a.a.l.d$e r5 = r4.f3337a
                return r5
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e evaluate(float r1, p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e r2, p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e r3) {
                r0 = this;
                b.a.a.a.l.d$e r2 = (p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e) r2
                b.a.a.a.l.d$e r3 = (p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e) r3
                b.a.a.a.l.d$e r1 = r0.m418a(r1, r2, r3)
                return r1
        }
    }

    /* renamed from: b.a.a.a.l.d$c */
    /* loaded from: classes.dex */
    public static class C0898c extends android.util.Property<p050b.p051a.p052a.p053a.p056l.AbstractC0895d, p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e> {

        /* renamed from: a */
        public static final android.util.Property<p050b.p051a.p052a.p053a.p056l.AbstractC0895d, p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e> f3338a = null;

        static {
                b.a.a.a.l.d$c r0 = new b.a.a.a.l.d$c
                java.lang.String r1 = "circularReveal"
                r0.<init>(r1)
                p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0898c.f3338a = r0
                return
        }

        private C0898c(java.lang.String r2) {
                r1 = this;
                java.lang.Class<b.a.a.a.l.d$e> r0 = p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e.class
                r1.<init>(r0, r2)
                return
        }

        /* renamed from: a */
        public p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e m417a(p050b.p051a.p052a.p053a.p056l.AbstractC0895d r1) {
                r0 = this;
                b.a.a.a.l.d$e r1 = r1.getRevealInfo()
                return r1
        }

        /* renamed from: a */
        public void m416a(p050b.p051a.p052a.p053a.p056l.AbstractC0895d r1, p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e r2) {
                r0 = this;
                r1.setRevealInfo(r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e get(p050b.p051a.p052a.p053a.p056l.AbstractC0895d r1) {
                r0 = this;
                b.a.a.a.l.d r1 = (p050b.p051a.p052a.p053a.p056l.AbstractC0895d) r1
                b.a.a.a.l.d$e r1 = r0.m417a(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(p050b.p051a.p052a.p053a.p056l.AbstractC0895d r1, p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e r2) {
                r0 = this;
                b.a.a.a.l.d r1 = (p050b.p051a.p052a.p053a.p056l.AbstractC0895d) r1
                b.a.a.a.l.d$e r2 = (p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e) r2
                r0.m416a(r1, r2)
                return
        }
    }

    /* renamed from: b.a.a.a.l.d$d */
    /* loaded from: classes.dex */
    public static class C0899d extends android.util.Property<p050b.p051a.p052a.p053a.p056l.AbstractC0895d, java.lang.Integer> {

        /* renamed from: a */
        public static final android.util.Property<p050b.p051a.p052a.p053a.p056l.AbstractC0895d, java.lang.Integer> f3339a = null;

        static {
                b.a.a.a.l.d$d r0 = new b.a.a.a.l.d$d
                java.lang.String r1 = "circularRevealScrimColor"
                r0.<init>(r1)
                p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0899d.f3339a = r0
                return
        }

        private C0899d(java.lang.String r2) {
                r1 = this;
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                r1.<init>(r0, r2)
                return
        }

        /* renamed from: a */
        public java.lang.Integer m415a(p050b.p051a.p052a.p053a.p056l.AbstractC0895d r1) {
                r0 = this;
                int r1 = r1.getCircularRevealScrimColor()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }

        /* renamed from: a */
        public void m414a(p050b.p051a.p052a.p053a.p056l.AbstractC0895d r1, java.lang.Integer r2) {
                r0 = this;
                int r2 = r2.intValue()
                r1.setCircularRevealScrimColor(r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ java.lang.Integer get(p050b.p051a.p052a.p053a.p056l.AbstractC0895d r1) {
                r0 = this;
                b.a.a.a.l.d r1 = (p050b.p051a.p052a.p053a.p056l.AbstractC0895d) r1
                java.lang.Integer r1 = r0.m415a(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(p050b.p051a.p052a.p053a.p056l.AbstractC0895d r1, java.lang.Integer r2) {
                r0 = this;
                b.a.a.a.l.d r1 = (p050b.p051a.p052a.p053a.p056l.AbstractC0895d) r1
                java.lang.Integer r2 = (java.lang.Integer) r2
                r0.m414a(r1, r2)
                return
        }
    }

    /* renamed from: b.a.a.a.l.d$e */
    /* loaded from: classes.dex */
    public static class C0900e {

        /* renamed from: a */
        public float f3340a;

        /* renamed from: b */
        public float f3341b;

        /* renamed from: c */
        public float f3342c;

        private C0900e() {
                r0 = this;
                r0.<init>()
                return
        }

        public C0900e(float r1, float r2, float r3) {
                r0 = this;
                r0.<init>()
                r0.f3340a = r1
                r0.f3341b = r2
                r0.f3342c = r3
                return
        }

        /* synthetic */ C0900e(p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0896a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m413a(float r1, float r2, float r3) {
                r0 = this;
                r0.f3340a = r1
                r0.f3341b = r2
                r0.f3342c = r3
                return
        }
    }

    /* renamed from: a */
    void mo412a();

    /* renamed from: b */
    void mo411b();

    int getCircularRevealScrimColor();

    p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e getRevealInfo();

    void setCircularRevealOverlayDrawable(android.graphics.drawable.Drawable r1);

    void setCircularRevealScrimColor(int r1);

    void setRevealInfo(p050b.p051a.p052a.p053a.p056l.AbstractC0895d.C0900e r1);
}
