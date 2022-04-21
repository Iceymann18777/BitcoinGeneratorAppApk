package p050b.p051a.p052a.p053a.p054j;

/* renamed from: b.a.a.a.j.d */
/* loaded from: classes.dex */
public class C0880d extends android.util.Property<android.view.ViewGroup, java.lang.Float> {

    /* renamed from: a */
    public static final android.util.Property<android.view.ViewGroup, java.lang.Float> f3286a = null;

    static {
            b.a.a.a.j.d r0 = new b.a.a.a.j.d
            java.lang.String r1 = "childrenAlpha"
            r0.<init>(r1)
            p050b.p051a.p052a.p053a.p054j.C0880d.f3286a = r0
            return
    }

    private C0880d(java.lang.String r2) {
            r1 = this;
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            r1.<init>(r0, r2)
            return
    }

    /* renamed from: a */
    public java.lang.Float m480a(android.view.ViewGroup r2) {
            r1 = this;
            int r0 = p050b.p051a.p052a.p053a.C0872e.mtrl_internal_children_alpha_tag
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L_0x000b
            return r2
        L_0x000b:
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
    }

    /* renamed from: a */
    public void m479a(android.view.ViewGroup r4, java.lang.Float r5) {
            r3 = this;
            float r5 = r5.floatValue()
            int r0 = p050b.p051a.p052a.p053a.C0872e.mtrl_internal_children_alpha_tag
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r4.setTag(r0, r1)
            int r0 = r4.getChildCount()
            r1 = 0
        L_0x0012:
            if (r1 >= r0) goto L_0x001e
            android.view.View r2 = r4.getChildAt(r1)
            r2.setAlpha(r5)
            int r1 = r1 + 1
            goto L_0x0012
        L_0x001e:
            return
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Float get(android.view.ViewGroup r1) {
            r0 = this;
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.Float r1 = r0.m480a(r1)
            return r1
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(android.view.ViewGroup r1, java.lang.Float r2) {
            r0 = this;
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.Float r2 = (java.lang.Float) r2
            r0.m479a(r1, r2)
            return
    }
}
