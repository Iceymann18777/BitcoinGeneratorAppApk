package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {

    /* renamed from: b */
    private int f2023b;

    /* renamed from: c */
    private int f2024c;

    /* renamed from: d */
    private java.lang.ref.WeakReference<android.view.View> f2025d;

    /* renamed from: e */
    private android.view.LayoutInflater f2026e;

    /* renamed from: f */
    private androidx.appcompat.widget.ViewStubCompat.AbstractC0563a f2027f;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: classes.dex */
    public interface AbstractC0563a {
        /* renamed from: a */
        void m2155a(androidx.appcompat.widget.ViewStubCompat r1, android.view.View r2);
    }

    public ViewStubCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ViewStubCompat(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r0 = 0
            r2.f2023b = r0
            int[] r1 = p000a.p001a.C0009j.ViewStubCompat
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1, r5, r0)
            int r4 = p000a.p001a.C0009j.ViewStubCompat_android_inflatedId
            r5 = -1
            int r4 = r3.getResourceId(r4, r5)
            r2.f2024c = r4
            int r4 = p000a.p001a.C0009j.ViewStubCompat_android_layout
            int r4 = r3.getResourceId(r4, r0)
            r2.f2023b = r4
            int r4 = p000a.p001a.C0009j.ViewStubCompat_android_id
            int r4 = r3.getResourceId(r4, r5)
            r2.setId(r4)
            r3.recycle()
            r3 = 8
            r2.setVisibility(r3)
            r3 = 1
            r2.setWillNotDraw(r3)
            return
    }

    /* renamed from: a */
    public android.view.View m2156a() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0057
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0057
            int r1 = r4.f2023b
            if (r1 == 0) goto L_0x004f
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.LayoutInflater r1 = r4.f2026e
            if (r1 == 0) goto L_0x0015
            goto L_0x001d
        L_0x0015:
            android.content.Context r1 = r4.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
        L_0x001d:
            int r2 = r4.f2023b
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r0, r3)
            int r2 = r4.f2024c
            r3 = -1
            if (r2 == r3) goto L_0x002c
            r1.setId(r2)
        L_0x002c:
            int r2 = r0.indexOfChild(r4)
            r0.removeViewInLayout(r4)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            if (r3 == 0) goto L_0x003d
            r0.addView(r1, r2, r3)
            goto L_0x0040
        L_0x003d:
            r0.addView(r1, r2)
        L_0x0040:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r4.f2025d = r0
            androidx.appcompat.widget.ViewStubCompat$a r0 = r4.f2027f
            if (r0 == 0) goto L_0x004e
            r0.m2155a(r4, r1)
        L_0x004e:
            return r1
        L_0x004f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "ViewStub must have a valid layoutResource"
            r0.<init>(r1)
            throw r0
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ViewStub must have a non-null ViewGroup viewParent"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"MissingSuperCall"})
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    public int getInflatedId() {
            r1 = this;
            int r0 = r1.f2024c
            return r0
    }

    public android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f2026e
            return r0
    }

    public int getLayoutResource() {
            r1 = this;
            int r0 = r1.f2023b
            return r0
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setInflatedId(int r1) {
            r0 = this;
            r0.f2024c = r1
            return
    }

    public void setLayoutInflater(android.view.LayoutInflater r1) {
            r0 = this;
            r0.f2026e = r1
            return
    }

    public void setLayoutResource(int r1) {
            r0 = this;
            r0.f2023b = r1
            return
    }

    public void setOnInflateListener(androidx.appcompat.widget.ViewStubCompat.AbstractC0563a r1) {
            r0 = this;
            r0.f2027f = r1
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f2025d
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0010
            r0.setVisibility(r2)
            goto L_0x0023
        L_0x0010:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "setVisibility called on un-referenced view"
            r2.<init>(r0)
            throw r2
        L_0x0018:
            super.setVisibility(r2)
            if (r2 == 0) goto L_0x0020
            r0 = 4
            if (r2 != r0) goto L_0x0023
        L_0x0020:
            r1.m2156a()
        L_0x0023:
            return
    }
}
