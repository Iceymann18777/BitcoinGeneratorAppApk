package p000a.p045n;

/* renamed from: a.n.h */
/* loaded from: classes.dex */
class C0354h<T> extends android.util.Property<T, java.lang.Float> {

    /* renamed from: a */
    private final android.util.Property<T, android.graphics.PointF> f1079a;

    /* renamed from: b */
    private final android.graphics.PathMeasure f1080b;

    /* renamed from: c */
    private final float f1081c;

    /* renamed from: d */
    private final float[] f1082d;

    /* renamed from: e */
    private final android.graphics.PointF f1083e;

    /* renamed from: f */
    private float f1084f;

    C0354h(android.util.Property<T, android.graphics.PointF> r3, android.graphics.Path r4) {
            r2 = this;
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            java.lang.String r1 = r3.getName()
            r2.<init>(r0, r1)
            r0 = 2
            float[] r0 = new float[r0]
            r2.f1082d = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r2.f1083e = r0
            r2.f1079a = r3
            android.graphics.PathMeasure r3 = new android.graphics.PathMeasure
            r0 = 0
            r3.<init>(r4, r0)
            r2.f1080b = r3
            android.graphics.PathMeasure r3 = r2.f1080b
            float r3 = r3.getLength()
            r2.f1081c = r3
            return
    }

    /* renamed from: a */
    public void m2866a(T r4, java.lang.Float r5) {
            r3 = this;
            float r0 = r5.floatValue()
            r3.f1084f = r0
            android.graphics.PathMeasure r0 = r3.f1080b
            float r1 = r3.f1081c
            float r5 = r5.floatValue()
            float r1 = r1 * r5
            float[] r5 = r3.f1082d
            r2 = 0
            r0.getPosTan(r1, r5, r2)
            android.graphics.PointF r5 = r3.f1083e
            float[] r0 = r3.f1082d
            r1 = 0
            r1 = r0[r1]
            r5.x = r1
            r1 = 1
            r0 = r0[r1]
            r5.y = r0
            android.util.Property<T, android.graphics.PointF> r0 = r3.f1079a
            r0.set(r4, r5)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public java.lang.Float get(T r1) {
            r0 = this;
            float r1 = r0.f1084f
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Float get(java.lang.Object r1) {
            r0 = this;
            java.lang.Float r1 = r0.get(r1)
            return r1
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(java.lang.Object r1, java.lang.Float r2) {
            r0 = this;
            java.lang.Float r2 = (java.lang.Float) r2
            r0.m2866a(r1, r2)
            return
    }
}
