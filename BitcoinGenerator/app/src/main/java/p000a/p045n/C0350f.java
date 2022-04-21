package p000a.p045n;

/* renamed from: a.n.f */
/* loaded from: classes.dex */
class C0350f {
    /* renamed from: a */
    static <T> android.animation.ObjectAnimator m2870a(T r2, android.util.Property<T, android.graphics.PointF> r3, android.graphics.Path r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000c
            r0 = 0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofObject(r2, r3, r0, r4)
            return r2
        L_0x000c:
            a.n.h r0 = new a.n.h
            r0.<init>(r3, r4)
            r3 = 2
            float[] r3 = new float[r3]
            r3 = {x001c: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r0, r3)
            return r2
    }
}
