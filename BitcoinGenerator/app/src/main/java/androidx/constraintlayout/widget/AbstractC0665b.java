package androidx.constraintlayout.widget;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public abstract class AbstractC0665b extends android.view.View {

    /* renamed from: b */
    protected int[] f2468b;

    /* renamed from: c */
    protected int f2469c;

    /* renamed from: d */
    protected android.content.Context f2470d;

    /* renamed from: e */
    protected p000a.p014e.p015a.p016j.C0109j f2471e;

    /* renamed from: f */
    protected boolean f2472f;

    /* renamed from: g */
    private java.lang.String f2473g;

    public AbstractC0665b(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 32
            int[] r0 = new int[r0]
            r1.f2468b = r0
            r0 = 0
            r1.f2472f = r0
            r1.f2470d = r2
            r2 = 0
            r1.mo1746a(r2)
            return
    }

    /* renamed from: a */
    private void m1744a(java.lang.String r6) {
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r5.f2470d
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            java.lang.String r6 = r6.trim()
            r0 = 0
            r1 = 0
            java.lang.Class<androidx.constraintlayout.widget.g> r2 = androidx.constraintlayout.widget.C0673g.class
            java.lang.reflect.Field r2 = r2.getField(r6)     // Catch: Exception -> 0x0019
            int r2 = r2.getInt(r0)     // Catch: Exception -> 0x0019
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            if (r2 != 0) goto L_0x002e
            android.content.Context r2 = r5.f2470d
            android.content.res.Resources r2 = r2.getResources()
            android.content.Context r3 = r5.f2470d
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = "id"
            int r2 = r2.getIdentifier(r6, r4, r3)
        L_0x002e:
            if (r2 != 0) goto L_0x0054
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L_0x0054
            android.view.ViewParent r3 = r5.getParent()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r3 == 0) goto L_0x0054
            android.view.ViewParent r3 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            java.lang.Object r1 = r3.m1758a(r1, r6)
            if (r1 == 0) goto L_0x0054
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0054
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
        L_0x0054:
            if (r2 == 0) goto L_0x005a
            r5.setTag(r2, r0)
            goto L_0x0075
        L_0x005a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not find id of \""
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L_0x0075:
            return
    }

    private void setIds(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
        L_0x0004:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L_0x0015
            java.lang.String r4 = r4.substring(r0)
            r3.m1744a(r4)
            return
        L_0x0015:
            java.lang.String r0 = r4.substring(r0, r1)
            r3.m1744a(r0)
            int r0 = r1 + 1
            goto L_0x0004
    }

    /* renamed from: a */
    public void m1747a() {
            r2 = this;
            a.e.a.j.j r0 = r2.f2471e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0662a
            if (r1 == 0) goto L_0x0013
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.C0662a) r0
            a.e.a.j.j r1 = r2.f2471e
            r0.f2447k0 = r1
        L_0x0013:
            return
    }

    /* renamed from: a */
    protected void mo1746a(android.util.AttributeSet r5) {
            r4 = this;
            if (r5 == 0) goto L_0x0029
            android.content.Context r0 = r4.getContext()
            int[] r1 = androidx.constraintlayout.widget.C0674h.ConstraintLayout_Layout
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L_0x0011:
            if (r1 >= r0) goto L_0x0029
            int r2 = r5.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C0674h.ConstraintLayout_Layout_constraint_referenced_ids
            if (r2 != r3) goto L_0x0026
            java.lang.String r2 = r5.getString(r2)
            r4.f2473g = r2
            java.lang.String r2 = r4.f2473g
            r4.setIds(r2)
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x0011
        L_0x0029:
            return
    }

    /* renamed from: a */
    public void m1745a(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            return
    }

    /* renamed from: b */
    public void m1743b(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            return
    }

    /* renamed from: c */
    public void m1742c(androidx.constraintlayout.widget.ConstraintLayout r4) {
            r3 = this;
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r3.f2473g
            r3.setIds(r0)
        L_0x000b:
            a.e.a.j.j r0 = r3.f2471e
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.m3773J()
            r0 = 0
        L_0x0014:
            int r1 = r3.f2469c
            if (r0 >= r1) goto L_0x002e
            int[] r1 = r3.f2468b
            r1 = r1[r0]
            android.view.View r1 = r4.m1760a(r1)
            if (r1 == 0) goto L_0x002b
            a.e.a.j.j r2 = r3.f2471e
            a.e.a.j.f r1 = r4.m1755a(r1)
            r2.m3772b(r1)
        L_0x002b:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x002e:
            return
    }

    public int[] getReferencedIds() {
            r2 = this;
            int[] r0 = r2.f2468b
            int r1 = r2.f2469c
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.f2472f
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r2, r3)
            goto L_0x000c
        L_0x0008:
            r2 = 0
            r1.setMeasuredDimension(r2, r2)
        L_0x000c:
            return
    }

    public void setReferencedIds(int[] r4) {
            r3 = this;
            r0 = 0
            r3.f2469c = r0
        L_0x0003:
            int r1 = r4.length
            if (r0 >= r1) goto L_0x000f
            r1 = r4[r0]
            r2 = 0
            r3.setTag(r1, r2)
            int r0 = r0 + 1
            goto L_0x0003
        L_0x000f:
            return
    }

    @Override // android.view.View
    public void setTag(int r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.f2469c
            int r4 = r4 + 1
            int[] r0 = r2.f2468b
            int r1 = r0.length
            if (r4 <= r1) goto L_0x0012
            int r4 = r0.length
            int r4 = r4 * 2
            int[] r4 = java.util.Arrays.copyOf(r0, r4)
            r2.f2468b = r4
        L_0x0012:
            int[] r4 = r2.f2468b
            int r0 = r2.f2469c
            r4[r0] = r3
            int r0 = r0 + 1
            r2.f2469c = r0
            return
    }
}
