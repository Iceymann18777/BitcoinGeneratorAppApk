package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public abstract class AbstractC0484b implements androidx.appcompat.view.menu.AbstractC0513p {

    /* renamed from: b */
    protected android.content.Context f1634b;

    /* renamed from: c */
    protected android.content.Context f1635c;

    /* renamed from: d */
    protected androidx.appcompat.view.menu.C0496h f1636d;

    /* renamed from: e */
    protected android.view.LayoutInflater f1637e;

    /* renamed from: f */
    private androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a f1638f;

    /* renamed from: g */
    private int f1639g;

    /* renamed from: h */
    private int f1640h;

    /* renamed from: i */
    protected androidx.appcompat.view.menu.AbstractC0515q f1641i;

    /* renamed from: j */
    private int f1642j;

    public AbstractC0484b(android.content.Context r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f1634b = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.f1637e = r1
            r0.f1639g = r2
            r0.f1640h = r3
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public int mo136a() {
            r1 = this;
            int r0 = r1.f1642j
            return r0
    }

    /* renamed from: a */
    public android.view.View mo2132a(androidx.appcompat.view.menu.C0501k r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r3 instanceof androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
            if (r0 == 0) goto L_0x0007
            androidx.appcompat.view.menu.q$a r3 = (androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a) r3
            goto L_0x000b
        L_0x0007:
            androidx.appcompat.view.menu.q$a r3 = r1.m2445a(r4)
        L_0x000b:
            r1.mo2131a(r2, r3)
            android.view.View r3 = (android.view.View) r3
            return r3
    }

    /* renamed from: a */
    public androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a m2445a(android.view.ViewGroup r4) {
            r3 = this;
            android.view.LayoutInflater r0 = r3.f1637e
            int r1 = r3.f1640h
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.appcompat.view.menu.q$a r4 = (androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a) r4
            return r4
    }

    /* renamed from: a */
    public void m2447a(int r1) {
            r0 = this;
            r0.f1642j = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo133a(android.content.Context r1, androidx.appcompat.view.menu.C0496h r2) {
            r0 = this;
            r0.f1635c = r1
            android.content.Context r1 = r0.f1635c
            android.view.LayoutInflater.from(r1)
            r0.f1636d = r2
            return
    }

    /* renamed from: a */
    protected void m2446a(android.view.View r2, int r3) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x000b
            r0.removeView(r2)
        L_0x000b:
            androidx.appcompat.view.menu.q r0 = r1.f1641i
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r2, r3)
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(androidx.appcompat.view.menu.C0496h r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.p$a r0 = r1.f1638f
            if (r0 == 0) goto L_0x0007
            r0.mo2108a(r2, r3)
        L_0x0007:
            return
    }

    /* renamed from: a */
    public abstract void mo2131a(androidx.appcompat.view.menu.C0501k r1, androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a r2);

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo2308a(androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a r1) {
            r0 = this;
            r0.f1638f = r1
            return
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean r10) {
            r9 = this;
            androidx.appcompat.view.menu.q r10 = r9.f1641i
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            if (r10 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.appcompat.view.menu.h r0 = r9.f1636d
            r1 = 0
            if (r0 == 0) goto L_0x0051
            r0.m2401b()
            androidx.appcompat.view.menu.h r0 = r9.f1636d
            java.util.ArrayList r0 = r0.m2375n()
            int r2 = r0.size()
            r3 = 0
            r4 = 0
        L_0x001b:
            if (r3 >= r2) goto L_0x0050
            java.lang.Object r5 = r0.get(r3)
            androidx.appcompat.view.menu.k r5 = (androidx.appcompat.view.menu.C0501k) r5
            boolean r6 = r9.mo2137a(r4, r5)
            if (r6 == 0) goto L_0x004d
            android.view.View r6 = r10.getChildAt(r4)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
            if (r7 == 0) goto L_0x0039
            r7 = r6
            androidx.appcompat.view.menu.q$a r7 = (androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a) r7
            androidx.appcompat.view.menu.k r7 = r7.getItemData()
            goto L_0x003a
        L_0x0039:
            r7 = 0
        L_0x003a:
            android.view.View r8 = r9.mo2132a(r5, r6, r10)
            if (r5 == r7) goto L_0x0046
            r8.setPressed(r1)
            r8.jumpDrawablesToCurrentState()
        L_0x0046:
            if (r8 == r6) goto L_0x004b
            r9.m2446a(r8, r4)
        L_0x004b:
            int r4 = r4 + 1
        L_0x004d:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0050:
            r1 = r4
        L_0x0051:
            int r0 = r10.getChildCount()
            if (r1 >= r0) goto L_0x0060
            boolean r0 = r9.mo2133a(r10, r1)
            if (r0 != 0) goto L_0x0051
            int r1 = r1 + 1
            goto L_0x0051
        L_0x0060:
            return
    }

    /* renamed from: a */
    public abstract boolean mo2137a(int r1, androidx.appcompat.view.menu.C0501k r2);

    /* renamed from: a */
    protected boolean mo2133a(android.view.ViewGroup r1, int r2) {
            r0 = this;
            r1.removeViewAt(r2)
            r1 = 1
            return r1
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo127a(androidx.appcompat.view.menu.C0496h r1, androidx.appcompat.view.menu.C0501k r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo124a(androidx.appcompat.view.menu.SubMenuC0523v r2) {
            r1 = this;
            androidx.appcompat.view.menu.p$a r0 = r1.f1638f
            if (r0 == 0) goto L_0x0009
            boolean r2 = r0.mo2109a(r2)
            return r2
        L_0x0009:
            r2 = 0
            return r2
    }

    /* renamed from: b */
    public androidx.appcompat.view.menu.AbstractC0515q mo2128b(android.view.ViewGroup r4) {
            r3 = this;
            androidx.appcompat.view.menu.q r0 = r3.f1641i
            if (r0 != 0) goto L_0x001c
            android.view.LayoutInflater r0 = r3.f1637e
            int r1 = r3.f1639g
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.appcompat.view.menu.q r4 = (androidx.appcompat.view.menu.AbstractC0515q) r4
            r3.f1641i = r4
            androidx.appcompat.view.menu.q r4 = r3.f1641i
            androidx.appcompat.view.menu.h r0 = r3.f1636d
            r4.mo142a(r0)
            r4 = 1
            r3.mo123a(r4)
        L_0x001c:
            androidx.appcompat.view.menu.q r4 = r3.f1641i
            return r4
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo119b(androidx.appcompat.view.menu.C0496h r1, androidx.appcompat.view.menu.C0501k r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: d */
    public androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a m2444d() {
            r1 = this;
            androidx.appcompat.view.menu.p$a r0 = r1.f1638f
            return r0
    }
}
