package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0428a {

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class C0429a extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1393a;

        public C0429a(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f1393a = r1
                r1 = 8388627(0x800013, float:1.175497E-38)
                r0.f1393a = r1
                return
        }

        public C0429a(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 0
                r2.f1393a = r0
                int[] r1 = p000a.p001a.C0009j.ActionBarLayout
                android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
                int r4 = p000a.p001a.C0009j.ActionBarLayout_android_layout_gravity
                int r4 = r3.getInt(r4, r0)
                r2.f1393a = r4
                r3.recycle()
                return
        }

        public C0429a(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f1393a = r1
                return
        }

        public C0429a(androidx.appcompat.app.AbstractC0428a.C0429a r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f1393a = r0
                int r2 = r2.f1393a
                r1.f1393a = r2
                return
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes.dex */
    public interface AbstractC0430b {
        /* renamed from: a */
        void m2660a(boolean r1);
    }

    @java.lang.Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0431c {
        public AbstractC0431c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract java.lang.CharSequence m2659a();

        /* renamed from: b */
        public abstract android.view.View m2658b();

        /* renamed from: c */
        public abstract android.graphics.drawable.Drawable m2657c();

        /* renamed from: d */
        public abstract java.lang.CharSequence m2656d();

        /* renamed from: e */
        public abstract void m2655e();
    }

    public AbstractC0428a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public p000a.p001a.p006m.AbstractC0029b mo2500a(p000a.p001a.p006m.AbstractC0029b.AbstractC0030a r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: a */
    public void mo2499a(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    /* renamed from: a */
    public abstract void mo2498a(android.graphics.drawable.Drawable r1);

    /* renamed from: a */
    public abstract void mo2496a(java.lang.CharSequence r1);

    /* renamed from: a */
    public abstract boolean mo2501a(int r1, android.view.KeyEvent r2);

    /* renamed from: a */
    public boolean mo2519a(android.view.KeyEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public abstract void mo2494b(int r1);

    /* renamed from: b */
    public abstract void mo2492b(boolean r1);

    /* renamed from: c */
    public abstract void mo2491c(boolean r1);

    /* renamed from: d */
    public abstract void mo2490d(boolean r1);

    /* renamed from: e */
    public boolean mo2518e() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: f */
    public abstract boolean mo2488f();

    /* renamed from: g */
    public abstract int mo2486g();

    /* renamed from: h */
    public abstract android.content.Context mo2484h();

    /* renamed from: i */
    public boolean mo2517i() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: j */
    void mo2516j() {
            r0 = this;
            return
    }

    /* renamed from: k */
    public boolean mo2515k() {
            r1 = this;
            r0 = 0
            return r0
    }
}
