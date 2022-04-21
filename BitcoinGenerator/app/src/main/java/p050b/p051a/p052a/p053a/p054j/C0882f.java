package p050b.p051a.p052a.p053a.p054j;

/* renamed from: b.a.a.a.j.f */
/* loaded from: classes.dex */
public class C0882f extends android.util.Property<android.widget.ImageView, android.graphics.Matrix> {

    /* renamed from: a */
    private final android.graphics.Matrix f3289a;

    public C0882f() {
            r2 = this;
            java.lang.Class<android.graphics.Matrix> r0 = android.graphics.Matrix.class
            java.lang.String r1 = "imageMatrixProperty"
            r2.<init>(r0, r1)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f3289a = r0
            return
    }

    /* renamed from: a */
    public android.graphics.Matrix m476a(android.widget.ImageView r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.f3289a
            android.graphics.Matrix r2 = r2.getImageMatrix()
            r0.set(r2)
            android.graphics.Matrix r2 = r1.f3289a
            return r2
    }

    /* renamed from: a */
    public void m475a(android.widget.ImageView r1, android.graphics.Matrix r2) {
            r0 = this;
            r1.setImageMatrix(r2)
            return
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ android.graphics.Matrix get(android.widget.ImageView r1) {
            r0 = this;
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.Matrix r1 = r0.m476a(r1)
            return r1
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(android.widget.ImageView r1, android.graphics.Matrix r2) {
            r0 = this;
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            r0.m475a(r1, r2)
            return
    }
}
