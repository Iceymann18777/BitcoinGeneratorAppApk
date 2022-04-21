package p050b.p051a.p052a.p053a.p055k;

@android.annotation.TargetApi(21)
/* renamed from: b.a.a.a.k.b */
/* loaded from: classes.dex */
class C0888b extends android.graphics.drawable.RippleDrawable {
    C0888b(android.content.res.ColorStateList r1, android.graphics.drawable.InsetDrawable r2, android.graphics.drawable.Drawable r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r3) {
            r2 = this;
            r0 = 0
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x001c
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            android.graphics.drawable.InsetDrawable r1 = (android.graphics.drawable.InsetDrawable) r1
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r0.setColorFilter(r3)
        L_0x001c:
            return
    }
}
