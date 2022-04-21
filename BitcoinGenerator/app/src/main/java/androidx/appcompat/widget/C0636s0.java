package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.s0 */
/* loaded from: classes.dex */
class C0636s0 extends androidx.appcompat.widget.C0615k0 {

    /* renamed from: b */
    private final java.lang.ref.WeakReference<android.content.Context> f2278b;

    public C0636s0(android.content.Context r1, android.content.res.Resources r2) {
            r0 = this;
            r0.<init>(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.f2278b = r2
            return
    }

    @Override // androidx.appcompat.widget.C0615k0, android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = super.getDrawable(r3)
            java.lang.ref.WeakReference<android.content.Context> r1 = r2.f2278b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r0 == 0) goto L_0x0016
            if (r1 == 0) goto L_0x0016
            androidx.appcompat.widget.C0606j.m2013a()
            androidx.appcompat.widget.C0606j.m2007a(r1, r3, r0)
        L_0x0016:
            return r0
    }
}
