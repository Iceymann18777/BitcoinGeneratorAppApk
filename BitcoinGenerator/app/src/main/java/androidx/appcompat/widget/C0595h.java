package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
public class C0595h extends android.widget.CheckedTextView {

    /* renamed from: c */
    private static final int[] f2126c = null;

    /* renamed from: b */
    private final androidx.appcompat.widget.C0655x f2127b;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843016(0x1010108, float:2.3694298E-38)
            r0[r1] = r2
            androidx.appcompat.widget.C0595h.f2126c = r0
            return
    }

    public C0595h(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16843720(0x10103c8, float:2.369627E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public C0595h(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            android.content.Context r3 = androidx.appcompat.widget.C0632q0.m1914b(r3)
            r2.<init>(r3, r4, r5)
            androidx.appcompat.widget.x r3 = new androidx.appcompat.widget.x
            r3.<init>(r2)
            r2.f2127b = r3
            androidx.appcompat.widget.x r3 = r2.f2127b
            r3.m1814a(r4, r5)
            androidx.appcompat.widget.x r3 = r2.f2127b
            r3.m1822a()
            android.content.Context r3 = r2.getContext()
            int[] r0 = androidx.appcompat.widget.C0595h.f2126c
            r1 = 0
            androidx.appcompat.widget.t0 r3 = androidx.appcompat.widget.C0638t0.m1900a(r3, r4, r0, r5, r1)
            android.graphics.drawable.Drawable r4 = r3.m1899b(r1)
            r2.setCheckMarkDrawable(r4)
            r3.m1908a()
            return
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.x r0 = r1.f2127b
            if (r0 == 0) goto L_0x000a
            r0.m1822a()
        L_0x000a:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            androidx.appcompat.widget.C0616l.m1972a(r0, r2, r1)
            return r0
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000a.p001a.p002k.p003a.C0010a.m4259c(r0, r2)
            r1.setCheckMarkDrawable(r2)
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = androidx.core.widget.C0720i.m1491a(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.x r0 = r1.f2127b
            if (r0 == 0) goto L_0x000a
            r0.m1818a(r2, r3)
        L_0x000a:
            return
    }
}
