package androidx.constraintlayout.widget;

/* renamed from: androidx.constraintlayout.widget.f */
/* loaded from: classes.dex */
public class C0672f extends android.view.View {

    /* renamed from: b */
    private int f2565b;

    /* renamed from: c */
    private android.view.View f2566c;

    /* renamed from: d */
    private int f2567d;

    /* renamed from: a */
    public void m1728a(androidx.constraintlayout.widget.ConstraintLayout r4) {
            r3 = this;
            android.view.View r4 = r3.f2566c
            if (r4 != 0) goto L_0x0005
            return
        L_0x0005:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r4 = (androidx.constraintlayout.widget.ConstraintLayout.C0662a) r4
            android.view.View r0 = r3.f2566c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.C0662a) r0
            a.e.a.j.f r1 = r0.f2447k0
            r2 = 0
            r1.m3829n(r2)
            a.e.a.j.f r1 = r4.f2447k0
            a.e.a.j.f r2 = r0.f2447k0
            int r2 = r2.m3820s()
            r1.m3827o(r2)
            a.e.a.j.f r4 = r4.f2447k0
            a.e.a.j.f r1 = r0.f2447k0
            int r1 = r1.m3840i()
            r4.m3843g(r1)
            a.e.a.j.f r4 = r0.f2447k0
            r0 = 8
            r4.m3829n(r0)
            return
    }

    /* renamed from: b */
    public void m1727b(androidx.constraintlayout.widget.ConstraintLayout r3) {
            r2 = this;
            int r0 = r2.f2565b
            r1 = -1
            if (r0 != r1) goto L_0x0010
            boolean r0 = r2.isInEditMode()
            if (r0 != 0) goto L_0x0010
            int r0 = r2.f2567d
            r2.setVisibility(r0)
        L_0x0010:
            int r0 = r2.f2565b
            android.view.View r3 = r3.findViewById(r0)
            r2.f2566c = r3
            android.view.View r3 = r2.f2566c
            if (r3 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r3 = (androidx.constraintlayout.widget.ConstraintLayout.C0662a) r3
            r0 = 1
            r3.f2425Z = r0
            android.view.View r3 = r2.f2566c
            r0 = 0
            r3.setVisibility(r0)
            r2.setVisibility(r0)
        L_0x002e:
            return
    }

    public android.view.View getContent() {
            r1 = this;
            android.view.View r0 = r1.f2566c
            return r0
    }

    public int getEmptyVisibility() {
            r1 = this;
            int r0 = r1.f2567d
            return r0
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            boolean r0 = r7.isInEditMode()
            if (r0 == 0) goto L_0x0068
            r0 = 223(0xdf, float:3.12E-43)
            r8.drawRGB(r0, r0, r0)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 210(0xd2, float:2.94E-43)
            r0.setARGB(r1, r2, r2, r2)
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            r2 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r2)
            r0.setTypeface(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r8.getClipBounds(r1)
            int r3 = r1.height()
            float r3 = (float) r3
            r0.setTextSize(r3)
            int r3 = r1.height()
            int r4 = r1.width()
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r5)
            java.lang.String r5 = "?"
            r6 = 1
            r0.getTextBounds(r5, r2, r6, r1)
            float r2 = (float) r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            int r6 = r1.width()
            float r6 = (float) r6
            float r6 = r6 / r4
            float r2 = r2 - r6
            int r6 = r1.left
            float r6 = (float) r6
            float r2 = r2 - r6
            float r3 = (float) r3
            float r3 = r3 / r4
            int r6 = r1.height()
            float r6 = (float) r6
            float r6 = r6 / r4
            float r3 = r3 + r6
            int r1 = r1.bottom
            float r1 = (float) r1
            float r3 = r3 - r1
            r8.drawText(r5, r2, r3, r0)
        L_0x0068:
            return
    }

    public void setContentId(int r3) {
            r2 = this;
            int r0 = r2.f2565b
            if (r0 != r3) goto L_0x0005
            return
        L_0x0005:
            android.view.View r0 = r2.f2566c
            if (r0 == 0) goto L_0x001a
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r2.f2566c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.C0662a) r0
            r0.f2425Z = r1
            r0 = 0
            r2.f2566c = r0
        L_0x001a:
            r2.f2565b = r3
            r0 = -1
            if (r3 == r0) goto L_0x0030
            android.view.ViewParent r0 = r2.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r3 = r0.findViewById(r3)
            if (r3 == 0) goto L_0x0030
            r0 = 8
            r3.setVisibility(r0)
        L_0x0030:
            return
    }

    public void setEmptyVisibility(int r1) {
            r0 = this;
            r0.f2567d = r1
            return
    }
}
