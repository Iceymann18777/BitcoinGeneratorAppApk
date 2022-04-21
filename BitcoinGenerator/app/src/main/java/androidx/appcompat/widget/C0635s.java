package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes.dex */
public class C0635s extends android.widget.RadioButton implements androidx.core.widget.AbstractC0722j {

    /* renamed from: b */
    private final androidx.appcompat.widget.C0604i f2276b;

    /* renamed from: c */
    private final androidx.appcompat.widget.C0655x f2277c;

    public C0635s(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.radioButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public C0635s(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = androidx.appcompat.widget.C0632q0.m1914b(r1)
            r0.<init>(r1, r2, r3)
            androidx.appcompat.widget.i r1 = new androidx.appcompat.widget.i
            r1.<init>(r0)
            r0.f2276b = r1
            androidx.appcompat.widget.i r1 = r0.f2276b
            r1.m2017a(r2, r3)
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x
            r1.<init>(r0)
            r0.f2277c = r1
            androidx.appcompat.widget.x r1 = r0.f2277c
            r1.m1814a(r2, r3)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r2 = this;
            int r0 = super.getCompoundPaddingLeft()
            androidx.appcompat.widget.i r1 = r2.f2276b
            if (r1 == 0) goto L_0x000c
            int r0 = r1.m2020a(r0)
        L_0x000c:
            return r0
    }

    public android.content.res.ColorStateList getSupportButtonTintList() {
            r1 = this;
            androidx.appcompat.widget.i r0 = r1.f2276b
            if (r0 == 0) goto L_0x0009
            android.content.res.ColorStateList r0 = r0.m2016b()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
            r1 = this;
            androidx.appcompat.widget.i r0 = r1.f2276b
            if (r0 == 0) goto L_0x0009
            android.graphics.PorterDuff$Mode r0 = r0.m2015c()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setButtonDrawable(r1)
            androidx.appcompat.widget.i r1 = r0.f2276b
            if (r1 == 0) goto L_0x000a
            r1.m2014d()
        L_0x000a:
            return
    }

    @Override // androidx.core.widget.AbstractC0722j
    public void setSupportButtonTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.i r0 = r1.f2276b
            if (r0 == 0) goto L_0x0007
            r0.m2019a(r2)
        L_0x0007:
            return
    }

    @Override // androidx.core.widget.AbstractC0722j
    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.i r0 = r1.f2276b
            if (r0 == 0) goto L_0x0007
            r0.m2018a(r2)
        L_0x0007:
            return
    }
}
