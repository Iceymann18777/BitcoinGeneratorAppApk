package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public class C0495g extends android.widget.BaseAdapter {

    /* renamed from: b */
    androidx.appcompat.view.menu.C0496h f1696b;

    /* renamed from: c */
    private int f1697c;

    /* renamed from: d */
    private boolean f1698d;

    /* renamed from: e */
    private final boolean f1699e;

    /* renamed from: f */
    private final android.view.LayoutInflater f1700f;

    /* renamed from: g */
    private final int f1701g;

    public C0495g(androidx.appcompat.view.menu.C0496h r2, android.view.LayoutInflater r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1697c = r0
            r1.f1699e = r4
            r1.f1700f = r3
            r1.f1696b = r2
            r1.f1701g = r5
            r1.m2425a()
            return
    }

    /* renamed from: a */
    void m2425a() {
            r5 = this;
            androidx.appcompat.view.menu.h r0 = r5.f1696b
            androidx.appcompat.view.menu.k r0 = r0.m2384f()
            if (r0 == 0) goto L_0x0023
            androidx.appcompat.view.menu.h r1 = r5.f1696b
            java.util.ArrayList r1 = r1.m2378j()
            int r2 = r1.size()
            r3 = 0
        L_0x0013:
            if (r3 >= r2) goto L_0x0023
            java.lang.Object r4 = r1.get(r3)
            androidx.appcompat.view.menu.k r4 = (androidx.appcompat.view.menu.C0501k) r4
            if (r4 != r0) goto L_0x0020
            r5.f1697c = r3
            return
        L_0x0020:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0023:
            r0 = -1
            r5.f1697c = r0
            return
    }

    /* renamed from: a */
    public void m2424a(boolean r1) {
            r0 = this;
            r0.f1698d = r1
            return
    }

    /* renamed from: b */
    public androidx.appcompat.view.menu.C0496h m2423b() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f1696b
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r2 = this;
            boolean r0 = r2.f1699e
            if (r0 == 0) goto L_0x000b
            androidx.appcompat.view.menu.h r0 = r2.f1696b
            java.util.ArrayList r0 = r0.m2378j()
            goto L_0x0011
        L_0x000b:
            androidx.appcompat.view.menu.h r0 = r2.f1696b
            java.util.ArrayList r0 = r0.m2375n()
        L_0x0011:
            int r1 = r2.f1697c
            int r0 = r0.size()
            if (r1 >= 0) goto L_0x001a
            return r0
        L_0x001a:
            int r0 = r0 + (-1)
            return r0
    }

    @Override // android.widget.Adapter
    public androidx.appcompat.view.menu.C0501k getItem(int r3) {
            r2 = this;
            boolean r0 = r2.f1699e
            if (r0 == 0) goto L_0x000b
            androidx.appcompat.view.menu.h r0 = r2.f1696b
            java.util.ArrayList r0 = r0.m2378j()
            goto L_0x0011
        L_0x000b:
            androidx.appcompat.view.menu.h r0 = r2.f1696b
            java.util.ArrayList r0 = r0.m2375n()
        L_0x0011:
            int r1 = r2.f1697c
            if (r1 < 0) goto L_0x0019
            if (r3 < r1) goto L_0x0019
            int r3 = r3 + 1
        L_0x0019:
            java.lang.Object r3 = r0.get(r3)
            androidx.appcompat.view.menu.k r3 = (androidx.appcompat.view.menu.C0501k) r3
            return r3
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            androidx.appcompat.view.menu.k r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L_0x000b
            android.view.LayoutInflater r7 = r5.f1700f
            int r1 = r5.f1701g
            android.view.View r7 = r7.inflate(r1, r8, r0)
        L_0x000b:
            androidx.appcompat.view.menu.k r8 = r5.getItem(r6)
            int r8 = r8.getGroupId()
            int r1 = r6 + (-1)
            if (r1 < 0) goto L_0x0020
            androidx.appcompat.view.menu.k r1 = r5.getItem(r1)
            int r1 = r1.getGroupId()
            goto L_0x0021
        L_0x0020:
            r1 = r8
        L_0x0021:
            r2 = r7
            androidx.appcompat.view.menu.ListMenuItemView r2 = (androidx.appcompat.view.menu.ListMenuItemView) r2
            androidx.appcompat.view.menu.h r3 = r5.f1696b
            boolean r3 = r3.mo2296o()
            r4 = 1
            if (r3 == 0) goto L_0x0031
            if (r8 == r1) goto L_0x0031
            r8 = 1
            goto L_0x0032
        L_0x0031:
            r8 = 0
        L_0x0032:
            r2.setGroupDividerEnabled(r8)
            r8 = r7
            androidx.appcompat.view.menu.q$a r8 = (androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a) r8
            boolean r1 = r5.f1698d
            if (r1 == 0) goto L_0x003f
            r2.setForceShowIcon(r4)
        L_0x003f:
            androidx.appcompat.view.menu.k r6 = r5.getItem(r6)
            r8.mo148a(r6, r0)
            return r7
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r0 = this;
            r0.m2425a()
            super.notifyDataSetChanged()
            return
    }
}
