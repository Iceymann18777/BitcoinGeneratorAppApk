package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes.dex */
public class C0614k extends android.widget.EditText implements p000a.p018g.p029l.AbstractC0215q {

    /* renamed from: b */
    private final androidx.appcompat.widget.C0585e f2196b;

    /* renamed from: c */
    private final androidx.appcompat.widget.C0655x f2197c;

    public C0614k(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.editTextStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public C0614k(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = androidx.appcompat.widget.C0632q0.m1914b(r1)
            r0.<init>(r1, r2, r3)
            androidx.appcompat.widget.e r1 = new androidx.appcompat.widget.e
            r1.<init>(r0)
            r0.f2196b = r1
            androidx.appcompat.widget.e r1 = r0.f2196b
            r1.m2084a(r2, r3)
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x
            r1.<init>(r0)
            r0.f2197c = r1
            androidx.appcompat.widget.x r1 = r0.f2197c
            r1.m1814a(r2, r3)
            androidx.appcompat.widget.x r1 = r0.f2197c
            r1.m1822a()
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.e r0 = r1.f2196b
            if (r0 == 0) goto L_0x000a
            r0.m2089a()
        L_0x000a:
            androidx.appcompat.widget.x r0 = r1.f2197c
            if (r0 == 0) goto L_0x0011
            r0.m1822a()
        L_0x0011:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2196b
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
            androidx.appcompat.widget.e r0 = r1.f2196b
            if (r0 == 0) goto L_0x0009
            android.graphics.PorterDuff$Mode r0 = r0.m2080c()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000b
            android.text.Editable r0 = super.getText()
            return r0
        L_0x000b:
            android.text.Editable r0 = super.getEditableText()
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText() {
            r1 = this;
            android.text.Editable r0 = r1.getText()
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
            androidx.appcompat.widget.e r0 = r1.f2196b
            if (r0 == 0) goto L_0x000a
            r0.m2085a(r2)
        L_0x000a:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.e r0 = r1.f2196b
            if (r0 == 0) goto L_0x000a
            r0.m2088a(r2)
        L_0x000a:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = androidx.core.widget.C0720i.m1491a(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2196b
            if (r0 == 0) goto L_0x0007
            r0.m2082b(r2)
        L_0x0007:
            return
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.e r0 = r1.f2196b
            if (r0 == 0) goto L_0x0007
            r0.m2086a(r2)
        L_0x0007:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.x r0 = r1.f2197c
            if (r0 == 0) goto L_0x000a
            r0.m1818a(r2, r3)
        L_0x000a:
            return
    }
}
