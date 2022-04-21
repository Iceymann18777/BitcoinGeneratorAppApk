package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
class C0631q extends android.widget.PopupWindow {

    /* renamed from: b */
    private static final boolean f2263b = false;

    /* renamed from: a */
    private boolean f2264a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            androidx.appcompat.widget.C0631q.f2263b = r0
            return
    }

    public C0631q(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.m1917a(r1, r2, r3, r4)
            return
    }

    /* renamed from: a */
    private void m1917a(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            int[] r0 = p000a.p001a.C0009j.PopupWindow
            androidx.appcompat.widget.t0 r2 = androidx.appcompat.widget.C0638t0.m1900a(r2, r3, r0, r4, r5)
            int r3 = p000a.p001a.C0009j.PopupWindow_overlapAnchor
            boolean r3 = r2.m1889g(r3)
            if (r3 == 0) goto L_0x0018
            int r3 = p000a.p001a.C0009j.PopupWindow_overlapAnchor
            r4 = 0
            boolean r3 = r2.m1903a(r3, r4)
            r1.m1916a(r3)
        L_0x0018:
            int r3 = p000a.p001a.C0009j.PopupWindow_android_popupBackground
            android.graphics.drawable.Drawable r3 = r2.m1899b(r3)
            r1.setBackgroundDrawable(r3)
            r2.m1908a()
            return
    }

    /* renamed from: a */
    private void m1916a(boolean r2) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.C0631q.f2263b
            if (r0 == 0) goto L_0x0007
            r1.f2264a = r2
            goto L_0x000a
        L_0x0007:
            androidx.core.widget.C0719h.m1498a(r1, r2)
        L_0x000a:
            return
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View r2, int r3, int r4) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.C0631q.f2263b
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.f2264a
            if (r0 == 0) goto L_0x000d
            int r0 = r2.getHeight()
            int r4 = r4 - r0
        L_0x000d:
            super.showAsDropDown(r2, r3, r4)
            return
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.C0631q.f2263b
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.f2264a
            if (r0 == 0) goto L_0x000d
            int r0 = r2.getHeight()
            int r4 = r4 - r0
        L_0x000d:
            super.showAsDropDown(r2, r3, r4, r5)
            return
    }

    @Override // android.widget.PopupWindow
    public void update(android.view.View r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            boolean r0 = androidx.appcompat.widget.C0631q.f2263b
            if (r0 == 0) goto L_0x000d
            boolean r0 = r6.f2264a
            if (r0 == 0) goto L_0x000d
            int r0 = r7.getHeight()
            int r9 = r9 - r0
        L_0x000d:
            r3 = r9
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            super.update(r1, r2, r3, r4, r5)
            return
    }
}
