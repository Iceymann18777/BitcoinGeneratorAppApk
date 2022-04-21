package p000a.p011c.p012a;

/* renamed from: a.c.a.a */
/* loaded from: classes.dex */
public class C0056a extends android.widget.FrameLayout {

    /* renamed from: f */
    private static final p000a.p011c.p012a.AbstractC0063f f178f = null;

    /* renamed from: b */
    private boolean f179b;

    /* renamed from: c */
    private boolean f180c;

    /* renamed from: d */
    final android.graphics.Rect f181d;

    /* renamed from: e */
    private final p000a.p011c.p012a.AbstractC0062e f182e;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r0[r1] = r2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0017
            a.c.a.c r0 = new a.c.a.c
            r0.<init>()
        L_0x0014:
            p000a.p011c.p012a.C0056a.f178f = r0
            goto L_0x0027
        L_0x0017:
            r1 = 17
            if (r0 < r1) goto L_0x0021
            a.c.a.b r0 = new a.c.a.b
            r0.<init>()
            goto L_0x0014
        L_0x0021:
            a.c.a.d r0 = new a.c.a.d
            r0.<init>()
            goto L_0x0014
        L_0x0027:
            a.c.a.f r0 = p000a.p011c.p012a.C0056a.f178f
            r0.mo4122a()
            return
    }

    public android.content.res.ColorStateList getCardBackgroundColor() {
            r2 = this;
            a.c.a.f r0 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r1 = r2.f182e
            android.content.res.ColorStateList r0 = r0.mo4110h(r1)
            return r0
    }

    public float getCardElevation() {
            r2 = this;
            a.c.a.f r0 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r1 = r2.f182e
            float r0 = r0.mo4113e(r1)
            return r0
    }

    public int getContentPaddingBottom() {
            r1 = this;
            android.graphics.Rect r0 = r1.f181d
            int r0 = r0.bottom
            return r0
    }

    public int getContentPaddingLeft() {
            r1 = this;
            android.graphics.Rect r0 = r1.f181d
            int r0 = r0.left
            return r0
    }

    public int getContentPaddingRight() {
            r1 = this;
            android.graphics.Rect r0 = r1.f181d
            int r0 = r0.right
            return r0
    }

    public int getContentPaddingTop() {
            r1 = this;
            android.graphics.Rect r0 = r1.f181d
            int r0 = r0.top
            return r0
    }

    public float getMaxCardElevation() {
            r2 = this;
            a.c.a.f r0 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r1 = r2.f182e
            float r0 = r0.mo4121a(r1)
            return r0
    }

    public boolean getPreventCornerOverlap() {
            r1 = this;
            boolean r0 = r1.f180c
            return r0
    }

    public float getRadius() {
            r2 = this;
            a.c.a.f r0 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r1 = r2.f182e
            float r0 = r0.mo4118b(r1)
            return r0
    }

    public boolean getUseCompatPadding() {
            r1 = this;
            boolean r0 = r1.f179b
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            a.c.a.f r0 = p000a.p011c.p012a.C0056a.f178f
            boolean r0 = r0 instanceof p000a.p011c.p012a.C0059c
            if (r0 != 0) goto L_0x0050
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x0013
            if (r0 == r1) goto L_0x0013
            goto L_0x002d
        L_0x0013:
            a.c.a.f r3 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r4 = r5.f182e
            float r3 = r3.mo4112f(r4)
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r6 = java.lang.Math.max(r3, r6)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
        L_0x002d:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            if (r0 == r2) goto L_0x0036
            if (r0 == r1) goto L_0x0036
            goto L_0x0050
        L_0x0036:
            a.c.a.f r1 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r2 = r5.f182e
            float r1 = r1.mo4114d(r2)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.max(r1, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)
        L_0x0050:
            super.onMeasure(r6, r7)
            return
    }

    public void setCardBackgroundColor(int r3) {
            r2 = this;
            a.c.a.f r0 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r1 = r2.f182e
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r0.mo4119a(r1, r3)
            return
    }

    public void setCardBackgroundColor(android.content.res.ColorStateList r3) {
            r2 = this;
            a.c.a.f r0 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r1 = r2.f182e
            r0.mo4119a(r1, r3)
            return
    }

    public void setCardElevation(float r3) {
            r2 = this;
            a.c.a.f r0 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r1 = r2.f182e
            r0.mo4120a(r1, r3)
            return
    }

    public void setMaxCardElevation(float r3) {
            r2 = this;
            a.c.a.f r0 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r1 = r2.f182e
            r0.mo4117b(r1, r3)
            return
    }

    @Override // android.view.View
    public void setMinimumHeight(int r1) {
            r0 = this;
            super.setMinimumHeight(r1)
            return
    }

    @Override // android.view.View
    public void setMinimumWidth(int r1) {
            r0 = this;
            super.setMinimumWidth(r1)
            return
    }

    @Override // android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setPaddingRelative(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public void setPreventCornerOverlap(boolean r2) {
            r1 = this;
            boolean r0 = r1.f180c
            if (r2 == r0) goto L_0x000d
            r1.f180c = r2
            a.c.a.f r2 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r0 = r1.f182e
            r2.mo4116c(r0)
        L_0x000d:
            return
    }

    public void setRadius(float r3) {
            r2 = this;
            a.c.a.f r0 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r1 = r2.f182e
            r0.mo4115c(r1, r3)
            return
    }

    public void setUseCompatPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.f179b
            if (r0 == r2) goto L_0x000d
            r1.f179b = r2
            a.c.a.f r2 = p000a.p011c.p012a.C0056a.f178f
            a.c.a.e r0 = r1.f182e
            r2.mo4111g(r0)
        L_0x000d:
            return
    }
}
