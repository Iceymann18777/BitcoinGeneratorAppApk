package p000a.p045n;

/* renamed from: a.n.b0 */
/* loaded from: classes.dex */
class C0324b0 implements p000a.p045n.AbstractC0337c0 {

    /* renamed from: a */
    private final android.view.ViewOverlay f1019a;

    C0324b0(android.view.View r1) {
            r0 = this;
            r0.<init>()
            android.view.ViewOverlay r1 = r1.getOverlay()
            r0.f1019a = r1
            return
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: a */
    public void mo2770a(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewOverlay r0 = r1.f1019a
            r0.remove(r2)
            return
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: b */
    public void mo2769b(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewOverlay r0 = r1.f1019a
            r0.add(r2)
            return
    }
}
