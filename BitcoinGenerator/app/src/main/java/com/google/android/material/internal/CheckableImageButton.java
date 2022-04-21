package com.google.android.material.internal;

/* loaded from: classes.dex */
public class CheckableImageButton extends androidx.appcompat.widget.C0618m implements android.widget.Checkable {

    /* renamed from: e */
    private static final int[] f3549e = null;

    /* renamed from: d */
    private boolean f3550d;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes.dex */
    class C0955a extends p000a.p018g.p029l.C0185a {

        /* renamed from: c */
        final /* synthetic */ com.google.android.material.internal.CheckableImageButton f3551c;

        C0955a(com.google.android.material.internal.CheckableImageButton r1) {
                r0 = this;
                r0.f3551c = r1
                r0.<init>()
                return
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(android.view.View r1, p000a.p018g.p029l.p030a0.C0191c r2) {
                r0 = this;
                super.mo143a(r1, r2)
                r1 = 1
                r2.m3529b(r1)
                com.google.android.material.internal.CheckableImageButton r1 = r0.f3551c
                boolean r1 = r1.isChecked()
                r2.m3524c(r1)
                return
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: b */
        public void mo150b(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
                r0 = this;
                super.mo150b(r1, r2)
                com.google.android.material.internal.CheckableImageButton r1 = r0.f3551c
                boolean r1 = r1.isChecked()
                r2.setChecked(r1)
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            com.google.android.material.internal.CheckableImageButton.f3549e = r0
            return
    }

    public CheckableImageButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CheckableImageButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = p000a.p001a.C0000a.imageButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CheckableImageButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.google.android.material.internal.CheckableImageButton$a r1 = new com.google.android.material.internal.CheckableImageButton$a
            r1.<init>(r0)
            p000a.p018g.p029l.C0216r.m3440a(r0, r1)
            return
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.f3550d
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int r2) {
            r1 = this;
            boolean r0 = r1.f3550d
            if (r0 == 0) goto L_0x0013
            int[] r0 = com.google.android.material.internal.CheckableImageButton.f3549e
            int r0 = r0.length
            int r2 = r2 + r0
            int[] r2 = super.onCreateDrawableState(r2)
            int[] r0 = com.google.android.material.internal.CheckableImageButton.f3549e
            int[] r2 = android.widget.ImageButton.mergeDrawableStates(r2, r0)
            return r2
        L_0x0013:
            int[] r2 = super.onCreateDrawableState(r2)
            return r2
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.f3550d
            if (r0 == r2) goto L_0x000e
            r1.f3550d = r2
            r1.refreshDrawableState()
            r2 = 2048(0x800, float:2.87E-42)
            r1.sendAccessibilityEvent(r2)
        L_0x000e:
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.f3550d
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
