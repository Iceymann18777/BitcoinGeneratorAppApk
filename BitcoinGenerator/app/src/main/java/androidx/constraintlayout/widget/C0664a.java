package androidx.constraintlayout.widget;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public class C0664a extends androidx.constraintlayout.widget.AbstractC0665b {

    /* renamed from: h */
    private int f2465h;

    /* renamed from: i */
    private int f2466i;

    /* renamed from: j */
    private p000a.p014e.p015a.p016j.C0094b f2467j;

    public C0664a(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC0665b
    /* renamed from: a */
    protected void mo1746a(android.util.AttributeSet r7) {
            r6 = this;
            super.mo1746a(r7)
            a.e.a.j.b r0 = new a.e.a.j.b
            r0.<init>()
            r6.f2467j = r0
            if (r7 == 0) goto L_0x003f
            android.content.Context r0 = r6.getContext()
            int[] r1 = androidx.constraintlayout.widget.C0674h.ConstraintLayout_Layout
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            r1 = 0
            r2 = 0
        L_0x001c:
            if (r2 >= r0) goto L_0x003f
            int r3 = r7.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.C0674h.ConstraintLayout_Layout_barrierDirection
            if (r3 != r4) goto L_0x002e
            int r3 = r7.getInt(r3, r1)
            r6.setType(r3)
            goto L_0x003c
        L_0x002e:
            int r4 = androidx.constraintlayout.widget.C0674h.ConstraintLayout_Layout_barrierAllowsGoneWidgets
            if (r3 != r4) goto L_0x003c
            a.e.a.j.b r4 = r6.f2467j
            r5 = 1
            boolean r3 = r7.getBoolean(r3, r5)
            r4.m3907c(r3)
        L_0x003c:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x003f:
            a.e.a.j.b r7 = r6.f2467j
            r6.f2471e = r7
            r6.m1747a()
            return
    }

    public int getType() {
            r1 = this;
            int r0 = r1.f2465h
            return r0
    }

    public void setAllowsGoneWidget(boolean r2) {
            r1 = this;
            a.e.a.j.b r0 = r1.f2467j
            r0.m3907c(r2)
            return
    }

    public void setType(int r6) {
            r5 = this;
            r5.f2465h = r6
            r5.f2466i = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 6
            r1 = 5
            r2 = 0
            r3 = 1
            r4 = 17
            if (r6 >= r4) goto L_0x001a
            int r6 = r5.f2465h
            if (r6 != r1) goto L_0x0015
        L_0x0012:
            r5.f2466i = r2
            goto L_0x003d
        L_0x0015:
            if (r6 != r0) goto L_0x003d
        L_0x0017:
            r5.f2466i = r3
            goto L_0x003d
        L_0x001a:
            android.content.res.Resources r6 = r5.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.getLayoutDirection()
            if (r3 != r6) goto L_0x002a
            r6 = 1
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            if (r6 == 0) goto L_0x0035
            int r6 = r5.f2465h
            if (r6 != r1) goto L_0x0032
            goto L_0x0017
        L_0x0032:
            if (r6 != r0) goto L_0x003d
            goto L_0x0012
        L_0x0035:
            int r6 = r5.f2465h
            if (r6 != r1) goto L_0x003a
            goto L_0x0012
        L_0x003a:
            if (r6 != r0) goto L_0x003d
            goto L_0x0017
        L_0x003d:
            a.e.a.j.b r6 = r5.f2467j
            int r0 = r5.f2466i
            r6.m3906t(r0)
            return
    }
}
