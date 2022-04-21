package p000a.p045n;

/* renamed from: a.n.i */
/* loaded from: classes.dex */
class C0356i {
    /* renamed from: a */
    static android.animation.PropertyValuesHolder m2858a(android.util.Property<?, android.graphics.PointF> r2, android.graphics.Path r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000c
            r0 = 0
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofObject(r2, r0, r3)
            return r2
        L_0x000c:
            a.n.h r0 = new a.n.h
            r0.<init>(r2, r3)
            r2 = 2
            float[] r2 = new float[r2]
            r2 = {x001c: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r0, r2)
            return r2
    }
}
