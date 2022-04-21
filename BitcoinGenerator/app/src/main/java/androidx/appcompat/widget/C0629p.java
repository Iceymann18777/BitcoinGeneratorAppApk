package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
public class C0629p extends android.widget.MultiAutoCompleteTextView implements p000a.p018g.p029l.AbstractC0215q {

    /* renamed from: d */
    private static final int[] f2260d = null;

    /* renamed from: b */
    private final androidx.appcompat.widget.C0585e f2261b;

    /* renamed from: c */
    private final androidx.appcompat.widget.C0655x f2262c;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843126(0x1010176, float:2.3694606E-38)
            r0[r1] = r2
            androidx.appcompat.widget.C0629p.f2260d = r0
            return
    }

    public C0629p(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.autoCompleteTextViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public C0629p(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            android.content.Context r3 = androidx.appcompat.widget.C0632q0.m1914b(r3)
            r2.<init>(r3, r4, r5)
            android.content.Context r3 = r2.getContext()
            int[] r0 = androidx.appcompat.widget.C0629p.f2260d
            r1 = 0
            androidx.appcompat.widget.t0 r3 = androidx.appcompat.widget.C0638t0.m1900a(r3, r4, r0, r5, r1)
            boolean r0 = r3.m1889g(r1)
            if (r0 == 0) goto L_0x001f
            android.graphics.drawable.Drawable r0 = r3.m1899b(r1)
            r2.setDropDownBackgroundDrawable(r0)
        L_0x001f:
            r3.m1908a()
            androidx.appcompat.widget.e r3 = new androidx.appcompat.widget.e
            r3.<init>(r2)
            r2.f2261b = r3
            androidx.appcompat.widget.e r3 = r2.f2261b
            r3.m2084a(r4, r5)
            androidx.appcompat.widget.x r3 = new androidx.appcompat.widget.x
            r3.<init>(r2)
            r2.f2262c = r3
            androidx.appcompat.widget.x r3 = r2.f2262c
            r3.m1814a(r4, r5)
            androidx.appcompat.widget.x r3 = r2.f2262c
            r3.m1822a()
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.e r0 = r1.f2261b
            if (r0 == 0) goto L_0x000a
            r0.m2089a()
        L_0x000a:
            androidx.appcompat.widget.x r0 = r1.f2262c
            if (r0 == 0) goto L_0x0011
            r0.m1822a()
        L_0x0011:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2261b
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
            androidx.appcompat.widget.e r0 = r1.f2261b
            if (r0 == 0) goto L_0x0009
            android.graphics.PorterDuff$Mode r0 = r0.m2080c()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            androidx.appcompat.widget.C0616l.m1972a(r0, r2, r1)
            return r0
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            androidx.appcompat.widget.e r0 = r1.f2261b
            if (r0 == 0) goto L_0x000a
            r0.m2085a(r2)
        L_0x000a:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.e r0 = r1.f2261b
            if (r0 == 0) goto L_0x000a
            r0.m2088a(r2)
        L_0x000a:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
            r1.setDropDownBackgroundDrawable(r2)
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2261b
            if (r0 == 0) goto L_0x0007
            r0.m2082b(r2)
        L_0x0007:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2261b
            if (r0 == 0) goto L_0x0007
            r0.m2086a(r2)
        L_0x0007:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.x r0 = r1.f2262c
            if (r0 == 0) goto L_0x000a
            r0.m1818a(r2, r3)
        L_0x000a:
            return
    }
}
