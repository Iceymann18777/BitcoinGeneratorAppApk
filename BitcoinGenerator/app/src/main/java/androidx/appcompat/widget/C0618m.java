package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
public class C0618m extends android.widget.ImageButton implements p000a.p018g.p029l.AbstractC0215q, androidx.core.widget.AbstractC0723k {

    /* renamed from: b */
    private final androidx.appcompat.widget.C0585e f2207b;

    /* renamed from: c */
    private final androidx.appcompat.widget.C0624n f2208c;

    public C0618m(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0618m(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.imageButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public C0618m(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = androidx.appcompat.widget.C0632q0.m1914b(r1)
            r0.<init>(r1, r2, r3)
            androidx.appcompat.widget.e r1 = new androidx.appcompat.widget.e
            r1.<init>(r0)
            r0.f2207b = r1
            androidx.appcompat.widget.e r1 = r0.f2207b
            r1.m2084a(r2, r3)
            androidx.appcompat.widget.n r1 = new androidx.appcompat.widget.n
            r1.<init>(r0)
            r0.f2208c = r1
            androidx.appcompat.widget.n r1 = r0.f2208c
            r1.m1950a(r2, r3)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.e r0 = r1.f2207b
            if (r0 == 0) goto L_0x000a
            r0.m2089a()
        L_0x000a:
            androidx.appcompat.widget.n r0 = r1.f2208c
            if (r0 == 0) goto L_0x0011
            r0.m1955a()
        L_0x0011:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2207b
            if (r0 == 0) goto L_0x0009
            android.content.res.ColorStateList r0 = r0.m2083b()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2207b
            if (r0 == 0) goto L_0x0009
            android.graphics.PorterDuff$Mode r0 = r0.m2080c()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // androidx.core.widget.AbstractC0723k
    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f2208c
            if (r0 == 0) goto L_0x0009
            android.content.res.ColorStateList r0 = r0.m1949b()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // androidx.core.widget.AbstractC0723k
    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f2208c
            if (r0 == 0) goto L_0x0009
            android.graphics.PorterDuff$Mode r0 = r0.m1948c()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f2208c
            boolean r0 = r0.m1947d()
            if (r0 == 0) goto L_0x0010
            boolean r0 = super.hasOverlappingRendering()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            androidx.appcompat.widget.e r0 = r1.f2207b
            if (r0 == 0) goto L_0x000a
            r0.m2085a(r2)
        L_0x000a:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.e r0 = r1.f2207b
            if (r0 == 0) goto L_0x000a
            r0.m2088a(r2)
        L_0x000a:
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            androidx.appcompat.widget.n r1 = r0.f2208c
            if (r1 == 0) goto L_0x000a
            r1.m1955a()
        L_0x000a:
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setImageDrawable(r1)
            androidx.appcompat.widget.n r1 = r0.f2208c
            if (r1 == 0) goto L_0x000a
            r1.m1955a()
        L_0x000a:
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r2) {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f2208c
            r0.m1954a(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            androidx.appcompat.widget.n r1 = r0.f2208c
            if (r1 == 0) goto L_0x000a
            r1.m1955a()
        L_0x000a:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2207b
            if (r0 == 0) goto L_0x0007
            r0.m2082b(r2)
        L_0x0007:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2207b
            if (r0 == 0) goto L_0x0007
            r0.m2086a(r2)
        L_0x0007:
            return
    }

    @Override // androidx.core.widget.AbstractC0723k
    public void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f2208c
            if (r0 == 0) goto L_0x0007
            r0.m1953a(r2)
        L_0x0007:
            return
    }

    @Override // androidx.core.widget.AbstractC0723k
    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f2208c
            if (r0 == 0) goto L_0x0007
            r0.m1952a(r2)
        L_0x0007:
            return
    }
}
