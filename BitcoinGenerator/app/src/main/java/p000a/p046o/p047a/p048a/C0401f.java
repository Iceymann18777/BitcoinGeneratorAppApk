package p000a.p046o.p047a.p048a;

/* renamed from: a.o.a.a.f */
/* loaded from: classes.dex */
public class C0401f implements android.animation.TypeEvaluator {

    /* renamed from: a */
    private static final p000a.p046o.p047a.p048a.C0401f f1205a = null;

    static {
            a.o.a.a.f r0 = new a.o.a.a.f
            r0.<init>()
            p000a.p046o.p047a.p048a.C0401f.f1205a = r0
            return
    }

    public C0401f() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static p000a.p046o.p047a.p048a.C0401f m2734a() {
            a.o.a.a.f r0 = p000a.p046o.p047a.p048a.C0401f.f1205a
            return r0
    }

    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float r12, java.lang.Object r13, java.lang.Object r14) {
            r11 = this;
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            int r0 = r13 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            int r2 = r13 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r3 = r13 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r1
            r13 = r13 & 255(0xff, float:3.57E-43)
            float r13 = (float) r13
            float r13 = r13 / r1
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            int r4 = r14 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r1
            int r5 = r14 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r1
            int r6 = r14 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r1
            r14 = r14 & 255(0xff, float:3.57E-43)
            float r14 = (float) r14
            float r14 = r14 / r1
            double r7 = (double) r2
            r9 = 4612136378390124954(0x400199999999999a, double:2.2)
            double r7 = java.lang.Math.pow(r7, r9)
            float r2 = (float) r7
            double r7 = (double) r3
            double r7 = java.lang.Math.pow(r7, r9)
            float r3 = (float) r7
            double r7 = (double) r13
            double r7 = java.lang.Math.pow(r7, r9)
            float r13 = (float) r7
            double r7 = (double) r5
            double r7 = java.lang.Math.pow(r7, r9)
            float r5 = (float) r7
            double r6 = (double) r6
            double r6 = java.lang.Math.pow(r6, r9)
            float r6 = (float) r6
            double r7 = (double) r14
            double r7 = java.lang.Math.pow(r7, r9)
            float r14 = (float) r7
            float r4 = r4 - r0
            float r4 = r4 * r12
            float r0 = r0 + r4
            float r5 = r5 - r2
            float r5 = r5 * r12
            float r2 = r2 + r5
            float r6 = r6 - r3
            float r6 = r6 * r12
            float r3 = r3 + r6
            float r14 = r14 - r13
            float r12 = r12 * r14
            float r13 = r13 + r12
            float r0 = r0 * r1
            double r4 = (double) r2
            r6 = 4601859982876761367(0x3fdd1745d1745d17, double:0.45454545454545453)
            double r4 = java.lang.Math.pow(r4, r6)
            float r12 = (float) r4
            float r12 = r12 * r1
            double r2 = (double) r3
            double r2 = java.lang.Math.pow(r2, r6)
            float r14 = (float) r2
            float r14 = r14 * r1
            double r2 = (double) r13
            double r2 = java.lang.Math.pow(r2, r6)
            float r13 = (float) r2
            float r13 = r13 * r1
            int r0 = java.lang.Math.round(r0)
            int r0 = r0 << 24
            int r12 = java.lang.Math.round(r12)
            int r12 = r12 << 16
            r12 = r12 | r0
            int r14 = java.lang.Math.round(r14)
            int r14 = r14 << 8
            r12 = r12 | r14
            int r13 = java.lang.Math.round(r13)
            r12 = r12 | r13
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
    }
}
