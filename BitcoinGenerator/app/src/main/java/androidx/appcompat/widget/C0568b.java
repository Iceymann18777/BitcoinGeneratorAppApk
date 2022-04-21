package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
class C0568b extends android.graphics.drawable.Drawable {

    /* renamed from: a */
    final androidx.appcompat.widget.ActionBarContainer f2039a;

    public C0568b(androidx.appcompat.widget.ActionBarContainer r1) {
            r0 = this;
            r0.<init>()
            r0.f2039a = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f2039a
            boolean r1 = r0.f1818i
            if (r1 == 0) goto L_0x000e
            android.graphics.drawable.Drawable r0 = r0.f1817h
            if (r0 == 0) goto L_0x0022
            r0.draw(r3)
            goto L_0x0022
        L_0x000e:
            android.graphics.drawable.Drawable r0 = r0.f1815f
            if (r0 == 0) goto L_0x0015
            r0.draw(r3)
        L_0x0015:
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f2039a
            android.graphics.drawable.Drawable r1 = r0.f1816g
            if (r1 == 0) goto L_0x0022
            boolean r0 = r0.f1819j
            if (r0 == 0) goto L_0x0022
            r1.draw(r3)
        L_0x0022:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f2039a
            boolean r1 = r0.f1818i
            if (r1 == 0) goto L_0x000b
            android.graphics.drawable.Drawable r0 = r0.f1817h
            if (r0 == 0) goto L_0x0012
            goto L_0x000f
        L_0x000b:
            android.graphics.drawable.Drawable r0 = r0.f1815f
            if (r0 == 0) goto L_0x0012
        L_0x000f:
            r0.getOutline(r3)
        L_0x0012:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }
}
