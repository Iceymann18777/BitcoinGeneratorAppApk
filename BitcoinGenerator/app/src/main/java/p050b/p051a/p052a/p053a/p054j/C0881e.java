package p050b.p051a.p052a.p053a.p054j;

/* renamed from: b.a.a.a.j.e */
/* loaded from: classes.dex */
public class C0881e extends android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> {

    /* renamed from: b */
    public static final android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> f3287b = null;

    /* renamed from: a */
    private final java.util.WeakHashMap<android.graphics.drawable.Drawable, java.lang.Integer> f3288a;

    static {
            b.a.a.a.j.e r0 = new b.a.a.a.j.e
            r0.<init>()
            p050b.p051a.p052a.p053a.p054j.C0881e.f3287b = r0
            return
    }

    private C0881e() {
            r2 = this;
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.String r1 = "drawableAlphaCompat"
            r2.<init>(r0, r1)
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.f3288a = r0
            return
    }

    /* renamed from: a */
    public java.lang.Integer m478a(android.graphics.drawable.Drawable r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000f
            int r3 = r3.getAlpha()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L_0x000f:
            java.util.WeakHashMap<android.graphics.drawable.Drawable, java.lang.Integer> r0 = r2.f3288a
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0020
            java.util.WeakHashMap<android.graphics.drawable.Drawable, java.lang.Integer> r0 = r2.f3288a
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            return r3
        L_0x0020:
            r3 = 255(0xff, float:3.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
    }

    /* renamed from: a */
    public void m477a(android.graphics.drawable.Drawable r3, java.lang.Integer r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 >= r1) goto L_0x000b
            java.util.WeakHashMap<android.graphics.drawable.Drawable, java.lang.Integer> r0 = r2.f3288a
            r0.put(r3, r4)
        L_0x000b:
            int r4 = r4.intValue()
            r3.setAlpha(r4)
            return
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Integer get(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            java.lang.Integer r1 = r0.m478a(r1)
            return r1
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(android.graphics.drawable.Drawable r1, java.lang.Integer r2) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.m477a(r1, r2)
            return
    }
}
