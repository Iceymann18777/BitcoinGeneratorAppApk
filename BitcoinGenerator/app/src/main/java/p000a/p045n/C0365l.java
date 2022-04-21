package p000a.p045n;

/* renamed from: a.n.l */
/* loaded from: classes.dex */
public class C0365l {

    /* renamed from: a */
    private android.view.ViewGroup f1104a;

    /* renamed from: b */
    private java.lang.Runnable f1105b;

    /* renamed from: a */
    static p000a.p045n.C0365l m2846a(android.view.View r1) {
            int r0 = p000a.p045n.C0361j.transition_current_scene
            java.lang.Object r1 = r1.getTag(r0)
            a.n.l r1 = (p000a.p045n.C0365l) r1
            return r1
    }

    /* renamed from: a */
    static void m2845a(android.view.View r1, p000a.p045n.C0365l r2) {
            int r0 = p000a.p045n.C0361j.transition_current_scene
            r1.setTag(r0, r2)
            return
    }

    /* renamed from: a */
    public void m2847a() {
            r1 = this;
            android.view.ViewGroup r0 = r1.f1104a
            a.n.l r0 = m2846a(r0)
            if (r0 != r1) goto L_0x000f
            java.lang.Runnable r0 = r1.f1105b
            if (r0 == 0) goto L_0x000f
            r0.run()
        L_0x000f:
            return
    }
}
