package p000a.p031h.p032a;

/* renamed from: a.h.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC0236c extends p000a.p031h.p032a.AbstractC0231a {

    /* renamed from: j */
    private int f697j;

    /* renamed from: k */
    private int f698k;

    /* renamed from: l */
    private android.view.LayoutInflater f699l;

    @java.lang.Deprecated
    public AbstractC0236c(android.content.Context r1, int r2, android.database.Cursor r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0.f698k = r2
            r0.f697j = r2
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r0.f699l = r1
            return
    }

    @Override // p000a.p031h.p032a.AbstractC0231a
    /* renamed from: a */
    public android.view.View mo3348a(android.content.Context r2, android.database.Cursor r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.LayoutInflater r2 = r1.f699l
            int r3 = r1.f698k
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r4, r0)
            return r2
    }

    @Override // p000a.p031h.p032a.AbstractC0231a
    /* renamed from: b */
    public android.view.View mo1931b(android.content.Context r2, android.database.Cursor r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.LayoutInflater r2 = r1.f699l
            int r3 = r1.f697j
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r4, r0)
            return r2
    }
}
