package p050b.p051a.p052a.p053a.p054j;

/* renamed from: b.a.a.a.j.g */
/* loaded from: classes.dex */
public class C0883g implements android.animation.TypeEvaluator<android.graphics.Matrix> {

    /* renamed from: a */
    private final float[] f3290a;

    /* renamed from: b */
    private final float[] f3291b;

    /* renamed from: c */
    private final android.graphics.Matrix f3292c;

    public C0883g() {
            r2 = this;
            r2.<init>()
            r0 = 9
            float[] r1 = new float[r0]
            r2.f3290a = r1
            float[] r0 = new float[r0]
            r2.f3291b = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f3292c = r0
            return
    }

    /* renamed from: a */
    public android.graphics.Matrix m474a(float r4, android.graphics.Matrix r5, android.graphics.Matrix r6) {
            r3 = this;
            float[] r0 = r3.f3290a
            r5.getValues(r0)
            float[] r5 = r3.f3291b
            r6.getValues(r5)
            r5 = 0
        L_0x000b:
            r6 = 9
            if (r5 >= r6) goto L_0x0022
            float[] r6 = r3.f3291b
            r0 = r6[r5]
            float[] r1 = r3.f3290a
            r2 = r1[r5]
            float r0 = r0 - r2
            r1 = r1[r5]
            float r0 = r0 * r4
            float r1 = r1 + r0
            r6[r5] = r1
            int r5 = r5 + 1
            goto L_0x000b
        L_0x0022:
            android.graphics.Matrix r4 = r3.f3292c
            float[] r5 = r3.f3291b
            r4.setValues(r5)
            android.graphics.Matrix r4 = r3.f3292c
            return r4
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ android.graphics.Matrix evaluate(float r1, android.graphics.Matrix r2, android.graphics.Matrix r3) {
            r0 = this;
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            android.graphics.Matrix r3 = (android.graphics.Matrix) r3
            android.graphics.Matrix r1 = r0.m474a(r1, r2, r3)
            return r1
    }
}
