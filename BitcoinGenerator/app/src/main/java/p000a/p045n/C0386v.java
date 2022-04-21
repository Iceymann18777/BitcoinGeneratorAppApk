package p000a.p045n;

/* renamed from: a.n.v */
/* loaded from: classes.dex */
class C0386v implements p000a.p045n.AbstractC0387w {

    /* renamed from: a */
    private final android.view.ViewGroupOverlay f1173a;

    C0386v(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            android.view.ViewGroupOverlay r1 = r1.getOverlay()
            r0.f1173a = r1
            return
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: a */
    public void mo2770a(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.f1173a
            r0.remove(r2)
            return
    }

    @Override // p000a.p045n.AbstractC0387w
    /* renamed from: a */
    public void mo2768a(android.view.View r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.f1173a
            r0.remove(r2)
            return
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: b */
    public void mo2769b(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.f1173a
            r0.add(r2)
            return
    }

    @Override // p000a.p045n.AbstractC0387w
    /* renamed from: b */
    public void mo2767b(android.view.View r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.f1173a
            r0.add(r2)
            return
    }
}
