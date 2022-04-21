package com.google.android.material.bottomsheet;

import android.view.View;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c<V> {

    /* renamed from: a */
    private boolean f3446a;

    /* renamed from: b */
    private float f3447b;

    /* renamed from: c */
    private int f3448c;

    /* renamed from: d */
    private boolean f3449d;

    /* renamed from: e */
    private int f3450e;

    /* renamed from: f */
    private int f3451f;

    /* renamed from: g */
    int f3452g;

    /* renamed from: h */
    int f3453h;

    /* renamed from: i */
    int f3454i;

    /* renamed from: j */
    boolean f3455j;

    /* renamed from: k */
    private boolean f3456k;

    /* renamed from: l */
    int f3457l;

    /* renamed from: m */
    p000a.p033i.p035b.C0240a f3458m;

    /* renamed from: n */
    private boolean f3459n;

    /* renamed from: o */
    private int f3460o;

    /* renamed from: p */
    private boolean f3461p;

    /* renamed from: q */
    int f3462q;

    /* renamed from: r */
    java.lang.ref.WeakReference<V> f3463r;

    /* renamed from: s */
    java.lang.ref.WeakReference<android.view.View> f3464s;

    /* renamed from: t */
    private com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC0937b f3465t;

    /* renamed from: u */
    private android.view.VelocityTracker f3466u;

    /* renamed from: v */
    int f3467v;

    /* renamed from: w */
    private int f3468w;

    /* renamed from: x */
    boolean f3469x;

    /* renamed from: y */
    private java.util.Map<android.view.View, java.lang.Integer> f3470y;

    /* renamed from: z */
    private final p000a.p033i.p035b.C0240a.AbstractC0243c f3471z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes.dex */
    class C0936a extends p000a.p033i.p035b.C0240a.AbstractC0243c {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f3472a;

        C0936a(com.google.android.material.bottomsheet.BottomSheetBehavior r1) {
                r0 = this;
                r0.f3472a = r1
                r0.<init>()
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public int mo237a(android.view.View r1, int r2, int r3) {
                r0 = this;
                int r1 = r1.getLeft()
                return r1
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo238a(android.view.View r8, float r9, float r10) {
                r7 = this;
                r0 = 0
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0028
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f3472a
                boolean r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.m252a(r9)
                if (r9 == 0) goto L_0x0018
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f3472a
                int r9 = r9.f3452g
            L_0x0015:
                r2 = 3
                goto L_0x00bd
            L_0x0018:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f3472a
                int r10 = r10.f3453h
                if (r9 <= r10) goto L_0x0026
                r9 = r10
            L_0x0023:
                r2 = 6
                goto L_0x00bd
            L_0x0026:
                r9 = 0
                goto L_0x0015
            L_0x0028:
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r7.f3472a
                boolean r6 = r5.f3455j
                if (r6 == 0) goto L_0x0051
                boolean r5 = r5.m257a(r8, r10)
                if (r5 == 0) goto L_0x0051
                int r5 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = r7.f3472a
                int r6 = r6.f3454i
                if (r5 > r6) goto L_0x004a
                float r5 = java.lang.Math.abs(r9)
                float r6 = java.lang.Math.abs(r10)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x0051
            L_0x004a:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f3472a
                int r9 = r9.f3462q
                r2 = 5
                goto L_0x00bd
            L_0x0051:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0067
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0062
                goto L_0x0067
            L_0x0062:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f3472a
                int r9 = r9.f3454i
                goto L_0x00bd
            L_0x0067:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f3472a
                boolean r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.m252a(r10)
                if (r10 == 0) goto L_0x0094
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f3472a
                int r10 = r10.f3452g
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.f3472a
                int r0 = r0.f3454i
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x008e
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f3472a
                int r0 = r9.f3452g
                r9 = r0
                goto L_0x0015
            L_0x008e:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f3472a
                int r0 = r9.f3454i
                r9 = r0
                goto L_0x00bd
            L_0x0094:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f3472a
                int r1 = r10.f3453h
                if (r9 >= r1) goto L_0x00a5
                int r10 = r10.f3454i
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00b6
                goto L_0x0026
            L_0x00a5:
                int r10 = r9 - r1
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.f3472a
                int r0 = r0.f3454i
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x008e
            L_0x00b6:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f3472a
                int r0 = r9.f3453h
                r9 = r0
                goto L_0x0023
            L_0x00bd:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f3472a
                a.i.b.a r10 = r10.f3458m
                int r0 = r8.getLeft()
                boolean r9 = r10.m3312d(r0, r9)
                if (r9 == 0) goto L_0x00dc
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f3472a
                r10 = 2
                r9.m244c(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior$d r9 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f3472a
                r9.<init>(r10, r8, r2)
                p000a.p018g.p029l.C0216r.m3432a(r8, r9)
                goto L_0x00e1
            L_0x00dc:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r7.f3472a
                r8.m244c(r2)
            L_0x00e1:
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo236a(android.view.View r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.f3472a
                r1.m259a(r3)
                return
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public int mo235b(android.view.View r2) {
                r1 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r1.f3472a
                boolean r0 = r2.f3455j
                if (r0 == 0) goto L_0x0009
                int r2 = r2.f3462q
                return r2
            L_0x0009:
                int r2 = r2.f3454i
                return r2
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public int mo233b(android.view.View r2, int r3, int r4) {
                r1 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r1.f3472a
                int r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.m247b(r2)
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r1.f3472a
                boolean r0 = r4.f3455j
                if (r0 == 0) goto L_0x000f
                int r4 = r4.f3462q
                goto L_0x0011
            L_0x000f:
                int r4 = r4.f3454i
            L_0x0011:
                int r2 = p000a.p018g.p024g.C0158a.m3608a(r3, r2, r4)
                return r2
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public boolean mo234b(android.view.View r6, int r7) {
                r5 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.f3472a
                int r1 = r0.f3457l
                r2 = 1
                r3 = 0
                if (r1 != r2) goto L_0x0009
                return r3
            L_0x0009:
                boolean r4 = r0.f3469x
                if (r4 == 0) goto L_0x000e
                return r3
            L_0x000e:
                r4 = 3
                if (r1 != r4) goto L_0x0027
                int r1 = r0.f3467v
                if (r1 != r7) goto L_0x0027
                java.lang.ref.WeakReference<android.view.View> r7 = r0.f3464s
                java.lang.Object r7 = r7.get()
                android.view.View r7 = (android.view.View) r7
                if (r7 == 0) goto L_0x0027
                r0 = -1
                boolean r7 = r7.canScrollVertically(r0)
                if (r7 == 0) goto L_0x0027
                return r3
            L_0x0027:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r5.f3472a
                java.lang.ref.WeakReference<V extends android.view.View> r7 = r7.f3463r
                if (r7 == 0) goto L_0x0034
                java.lang.Object r7 = r7.get()
                if (r7 != r6) goto L_0x0034
                goto L_0x0035
            L_0x0034:
                r2 = 0
            L_0x0035:
                return r2
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: c */
        public void mo232c(int r2) {
                r1 = this;
                r0 = 1
                if (r2 != r0) goto L_0x0008
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r1.f3472a
                r2.m244c(r0)
            L_0x0008:
                return
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0937b {
        /* renamed from: a */
        public abstract void m231a(android.view.View r1, float r2);

        /* renamed from: a */
        public abstract void m230a(android.view.View r1, int r2);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes.dex */
    protected static class C0938c extends p000a.p033i.p034a.AbstractC0237a {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomsheet.BottomSheetBehavior.C0938c> CREATOR = null;

        /* renamed from: d */
        final int f3473d;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c$a */
        /* loaded from: classes.dex */
        static class C0939a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.bottomsheet.BottomSheetBehavior.C0938c> {
            C0939a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomsheet.BottomSheetBehavior.C0938c createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$c r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.bottomsheet.BottomSheetBehavior.C0938c createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$c r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$c r1 = r0.createFromParcel(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior.C0938c createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$c r1 = r0.createFromParcel(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomsheet.BottomSheetBehavior.C0938c[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$c[] r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior.C0938c[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$c[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                com.google.android.material.bottomsheet.BottomSheetBehavior$c$a r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c$a
                r0.<init>()
                com.google.android.material.bottomsheet.BottomSheetBehavior.C0938c.CREATOR = r0
                return
        }

        public C0938c(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r1 = r1.readInt()
                r0.f3473d = r1
                return
        }

        public C0938c(android.os.Parcelable r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f3473d = r2
                return
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.f3473d
                r1.writeInt(r2)
                return
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes.dex */
    private class RunnableC0940d implements java.lang.Runnable {

        /* renamed from: b */
        private final android.view.View f3474b;

        /* renamed from: c */
        private final int f3475c;

        /* renamed from: d */
        final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f3476d;

        RunnableC0940d(com.google.android.material.bottomsheet.BottomSheetBehavior r1, android.view.View r2, int r3) {
                r0 = this;
                r0.f3476d = r1
                r0.<init>()
                r0.f3474b = r2
                r0.f3475c = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.f3476d
                a.i.b.a r0 = r0.f3458m
                if (r0 == 0) goto L_0x0013
                r1 = 1
                boolean r0 = r0.m3329a(r1)
                if (r0 == 0) goto L_0x0013
                android.view.View r0 = r2.f3474b
                p000a.p018g.p029l.C0216r.m3432a(r0, r2)
                goto L_0x001a
            L_0x0013:
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.f3476d
                int r1 = r2.f3475c
                r0.m244c(r1)
            L_0x001a:
                return
        }
    }

    public BottomSheetBehavior() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f3446a = r0
            r0 = 4
            r1.f3457l = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r0.<init>(r1)
            r1.f3471z = r0
            return
    }

    public BottomSheetBehavior(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r0 = 1
            r3.f3446a = r0
            r1 = 4
            r3.f3457l = r1
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r1.<init>(r3)
            r3.f3471z = r1
            int[] r1 = p050b.p051a.p052a.p053a.C0876i.BottomSheetBehavior_Layout
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1)
            int r1 = p050b.p051a.p052a.p053a.C0876i.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r1 = r5.peekValue(r1)
            r2 = -1
            if (r1 == 0) goto L_0x0024
            int r1 = r1.data
            if (r1 != r2) goto L_0x0024
            goto L_0x002a
        L_0x0024:
            int r1 = p050b.p051a.p052a.p053a.C0876i.BottomSheetBehavior_Layout_behavior_peekHeight
            int r1 = r5.getDimensionPixelSize(r1, r2)
        L_0x002a:
            r3.m249b(r1)
            int r1 = p050b.p051a.p052a.p053a.C0876i.BottomSheetBehavior_Layout_behavior_hideable
            r2 = 0
            boolean r1 = r5.getBoolean(r1, r2)
            r3.m246b(r1)
            int r1 = p050b.p051a.p052a.p053a.C0876i.BottomSheetBehavior_Layout_behavior_fitToContents
            boolean r0 = r5.getBoolean(r1, r0)
            r3.m251a(r0)
            int r0 = p050b.p051a.p052a.p053a.C0876i.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r0 = r5.getBoolean(r0, r2)
            r3.m243c(r0)
            r5.recycle()
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            int r4 = r4.getScaledMaximumFlingVelocity()
            float r4 = (float) r4
            r3.f3447b = r4
            return
    }

    /* renamed from: a */
    static /* synthetic */ boolean m252a(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.f3446a
            return r0
    }

    /* renamed from: b */
    static /* synthetic */ int m247b(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            int r0 = r0.m245c()
            return r0
    }

    /* renamed from: b */
    private void m250b() {
            r2 = this;
            boolean r0 = r2.f3446a
            if (r0 == 0) goto L_0x0010
            int r0 = r2.f3462q
            int r1 = r2.f3451f
            int r0 = r0 - r1
            int r1 = r2.f3452g
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0015
        L_0x0010:
            int r0 = r2.f3462q
            int r1 = r2.f3451f
            int r0 = r0 - r1
        L_0x0015:
            r2.f3454i = r0
            return
    }

    /* renamed from: c */
    private int m245c() {
            r1 = this;
            boolean r0 = r1.f3446a
            if (r0 == 0) goto L_0x0007
            int r0 = r1.f3452g
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            return r0
    }

    /* renamed from: d */
    private float m242d() {
            r3 = this;
            android.view.VelocityTracker r0 = r3.f3466u
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f3447b
            r0.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r0 = r3.f3466u
            int r1 = r3.f3467v
            float r0 = r0.getYVelocity(r1)
            return r0
    }

    /* renamed from: d */
    private void m240d(boolean r8) {
            r7 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r7.f3463r
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r1 != 0) goto L_0x0014
            return
        L_0x0014:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            int r1 = r0.getChildCount()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r2 < r3) goto L_0x002f
            if (r8 == 0) goto L_0x002f
            java.util.Map<android.view.View, java.lang.Integer> r2 = r7.f3470y
            if (r2 != 0) goto L_0x002e
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            r7.f3470y = r2
            goto L_0x002f
        L_0x002e:
            return
        L_0x002f:
            r2 = 0
        L_0x0030:
            if (r2 >= r1) goto L_0x0070
            android.view.View r4 = r0.getChildAt(r2)
            java.lang.ref.WeakReference<V extends android.view.View> r5 = r7.f3463r
            java.lang.Object r5 = r5.get()
            if (r4 != r5) goto L_0x003f
            goto L_0x006d
        L_0x003f:
            if (r8 != 0) goto L_0x0058
            java.util.Map<android.view.View, java.lang.Integer> r5 = r7.f3470y
            if (r5 == 0) goto L_0x006d
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x006d
            java.util.Map<android.view.View, java.lang.Integer> r5 = r7.f3470y
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x006a
        L_0x0058:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r3) goto L_0x0069
            java.util.Map<android.view.View, java.lang.Integer> r5 = r7.f3470y
            int r6 = r4.getImportantForAccessibility()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.put(r4, r6)
        L_0x0069:
            r5 = 4
        L_0x006a:
            p000a.p018g.p029l.C0216r.m3418e(r4, r5)
        L_0x006d:
            int r2 = r2 + 1
            goto L_0x0030
        L_0x0070:
            if (r8 != 0) goto L_0x0075
            r8 = 0
            r7.f3470y = r8
        L_0x0075:
            return
    }

    /* renamed from: e */
    private void m239e() {
            r1 = this;
            r0 = -1
            r1.f3467v = r0
            android.view.VelocityTracker r0 = r1.f3466u
            if (r0 == 0) goto L_0x000d
            r0.recycle()
            r0 = 0
            r1.f3466u = r0
        L_0x000d:
            return
    }

    /* renamed from: a */
    android.view.View m258a(android.view.View r4) {
            r3 = this;
            boolean r0 = p000a.p018g.p029l.C0216r.m3396y(r4)
            if (r0 == 0) goto L_0x0007
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0022
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0 = 0
            int r1 = r4.getChildCount()
        L_0x0012:
            if (r0 >= r1) goto L_0x0022
            android.view.View r2 = r4.getChildAt(r0)
            android.view.View r2 = r3.m258a(r2)
            if (r2 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r0 + 1
            goto L_0x0012
        L_0x0022:
            r4 = 0
            return r4
    }

    /* renamed from: a */
    void m259a(int r5) {
            r4 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.f3463r
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0027
            com.google.android.material.bottomsheet.BottomSheetBehavior$b r1 = r4.f3465t
            if (r1 == 0) goto L_0x0027
            int r2 = r4.f3454i
            if (r5 <= r2) goto L_0x001a
            int r5 = r2 - r5
            float r5 = (float) r5
            int r3 = r4.f3462q
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x0023
        L_0x001a:
            int r5 = r2 - r5
            float r5 = (float) r5
            int r3 = r4.m245c()
            int r2 = r2 - r3
            float r2 = (float) r2
        L_0x0023:
            float r5 = r5 / r2
            r1.m231a(r0, r5)
        L_0x0027:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public void mo256a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.os.Parcelable r4) {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior.C0938c) r4
            android.os.Parcelable r0 = r4.m3347a()
            super.mo256a(r2, r3, r0)
            int r2 = r4.f3473d
            r3 = 1
            if (r2 == r3) goto L_0x0011
            r3 = 2
            if (r2 != r3) goto L_0x0012
        L_0x0011:
            r2 = 4
        L_0x0012:
            r1.f3457l = r2
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public void mo254a(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.m245c()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.m244c(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f3464s
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x009f
            boolean r4 = r3.f3461p
            if (r4 != 0) goto L_0x001d
            goto L_0x009f
        L_0x001d:
            int r4 = r3.f3460o
            r6 = 0
            r7 = 4
            if (r4 <= 0) goto L_0x0028
            int r4 = r3.m245c()
            goto L_0x0081
        L_0x0028:
            boolean r4 = r3.f3455j
            if (r4 == 0) goto L_0x003a
            float r4 = r3.m242d()
            boolean r4 = r3.m257a(r5, r4)
            if (r4 == 0) goto L_0x003a
            int r4 = r3.f3462q
            r0 = 5
            goto L_0x0081
        L_0x003a:
            int r4 = r3.f3460o
            if (r4 != 0) goto L_0x007e
            int r4 = r5.getTop()
            boolean r1 = r3.f3446a
            r2 = 6
            if (r1 == 0) goto L_0x005b
            int r1 = r3.f3452g
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f3454i
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r1 >= r4) goto L_0x007e
            int r4 = r3.f3452g
            goto L_0x0081
        L_0x005b:
            int r1 = r3.f3453h
            if (r4 >= r1) goto L_0x006b
            int r7 = r3.f3454i
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r4 >= r7) goto L_0x007a
            r4 = 0
            goto L_0x0081
        L_0x006b:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f3454i
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x007e
        L_0x007a:
            int r4 = r3.f3453h
            r0 = 6
            goto L_0x0081
        L_0x007e:
            int r4 = r3.f3454i
            r0 = 4
        L_0x0081:
            a.i.b.a r7 = r3.f3458m
            int r1 = r5.getLeft()
            boolean r4 = r7.m3319b(r5, r1, r4)
            if (r4 == 0) goto L_0x009a
            r4 = 2
            r3.m244c(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior$d r4 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
            r4.<init>(r3, r5, r0)
            p000a.p018g.p029l.C0216r.m3432a(r5, r4)
            goto L_0x009d
        L_0x009a:
            r3.m244c(r0)
        L_0x009d:
            r3.f3461p = r6
        L_0x009f:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public void mo253a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5, int r6, int[] r7, int r8) {
            r1 = this;
            r2 = 1
            if (r8 != r2) goto L_0x0004
            return
        L_0x0004:
            java.lang.ref.WeakReference<android.view.View> r5 = r1.f3464s
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r4 == r5) goto L_0x000f
            return
        L_0x000f:
            int r5 = r3.getTop()
            int r8 = r5 - r6
            if (r6 <= 0) goto L_0x0039
            int r4 = r1.m245c()
            if (r8 >= r4) goto L_0x002f
            int r4 = r1.m245c()
            int r5 = r5 - r4
            r7[r2] = r5
            r4 = r7[r2]
            int r4 = -r4
            p000a.p018g.p029l.C0216r.m3420d(r3, r4)
            r4 = 3
        L_0x002b:
            r1.m244c(r4)
            goto L_0x0059
        L_0x002f:
            r7[r2] = r6
        L_0x0031:
            int r4 = -r6
            p000a.p018g.p029l.C0216r.m3420d(r3, r4)
            r1.m244c(r2)
            goto L_0x0059
        L_0x0039:
            if (r6 >= 0) goto L_0x0059
            r0 = -1
            boolean r4 = r4.canScrollVertically(r0)
            if (r4 != 0) goto L_0x0059
            int r4 = r1.f3454i
            if (r8 <= r4) goto L_0x0056
            boolean r8 = r1.f3455j
            if (r8 == 0) goto L_0x004b
            goto L_0x0056
        L_0x004b:
            int r5 = r5 - r4
            r7[r2] = r5
            r4 = r7[r2]
            int r4 = -r4
            p000a.p018g.p029l.C0216r.m3420d(r3, r4)
            r4 = 4
            goto L_0x002b
        L_0x0056:
            r7[r2] = r6
            goto L_0x0031
        L_0x0059:
            int r3 = r3.getTop()
            r1.m259a(r3)
            r1.f3460o = r6
            r1.f3461p = r2
            return
    }

    /* renamed from: a */
    public void m251a(boolean r2) {
            r1 = this;
            boolean r0 = r1.f3446a
            if (r0 != r2) goto L_0x0005
            return
        L_0x0005:
            r1.f3446a = r2
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r1.f3463r
            if (r2 == 0) goto L_0x000e
            r1.m250b()
        L_0x000e:
            boolean r2 = r1.f3446a
            if (r2 == 0) goto L_0x0019
            int r2 = r1.f3457l
            r0 = 6
            if (r2 != r0) goto L_0x0019
            r2 = 3
            goto L_0x001b
        L_0x0019:
            int r2 = r1.f3457l
        L_0x001b:
            r1.m244c(r2)
            return
    }

    /* renamed from: a */
    boolean m257a(android.view.View r5, float r6) {
            r4 = this;
            boolean r0 = r4.f3456k
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r5.getTop()
            int r2 = r4.f3454i
            r3 = 0
            if (r0 >= r2) goto L_0x0010
            return r3
        L_0x0010:
            int r5 = r5.getTop()
            float r5 = (float) r5
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r6 = r6 * r0
            float r5 = r5 + r6
            int r6 = r4.f3454i
            float r6 = (float) r6
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            int r6 = r4.f3448c
            float r6 = (float) r6
            float r5 = r5 / r6
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo46a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, int r7) {
            r4 = this;
            boolean r0 = p000a.p018g.p029l.C0216r.m3415g(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = p000a.p018g.p029l.C0216r.m3415g(r6)
            if (r0 != 0) goto L_0x0010
            r6.setFitsSystemWindows(r1)
        L_0x0010:
            int r0 = r6.getTop()
            r5.m1697c(r6, r7)
            int r7 = r5.getHeight()
            r4.f3462q = r7
            boolean r7 = r4.f3449d
            if (r7 == 0) goto L_0x0043
            int r7 = r4.f3450e
            if (r7 != 0) goto L_0x0031
            android.content.res.Resources r7 = r5.getResources()
            int r2 = p050b.p051a.p052a.p053a.C0870c.design_bottom_sheet_peek_height_min
            int r7 = r7.getDimensionPixelSize(r2)
            r4.f3450e = r7
        L_0x0031:
            int r7 = r4.f3450e
            int r2 = r4.f3462q
            int r3 = r5.getWidth()
            int r3 = r3 * 9
            int r3 = r3 / 16
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            goto L_0x0045
        L_0x0043:
            int r7 = r4.f3448c
        L_0x0045:
            r4.f3451f = r7
            r7 = 0
            int r2 = r4.f3462q
            int r3 = r6.getHeight()
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            r4.f3452g = r7
            int r7 = r4.f3462q
            r2 = 2
            int r7 = r7 / r2
            r4.f3453h = r7
            r4.m250b()
            int r7 = r4.f3457l
            r3 = 3
            if (r7 != r3) goto L_0x006b
            int r7 = r4.m245c()
        L_0x0067:
            p000a.p018g.p029l.C0216r.m3420d(r6, r7)
            goto L_0x008f
        L_0x006b:
            r3 = 6
            if (r7 != r3) goto L_0x0071
            int r7 = r4.f3453h
            goto L_0x0067
        L_0x0071:
            boolean r3 = r4.f3455j
            if (r3 == 0) goto L_0x007b
            r3 = 5
            if (r7 != r3) goto L_0x007b
            int r7 = r4.f3462q
            goto L_0x0067
        L_0x007b:
            int r7 = r4.f3457l
            r3 = 4
            if (r7 != r3) goto L_0x0083
            int r7 = r4.f3454i
            goto L_0x0067
        L_0x0083:
            if (r7 == r1) goto L_0x0087
            if (r7 != r2) goto L_0x008f
        L_0x0087:
            int r7 = r6.getTop()
            int r0 = r0 - r7
            p000a.p018g.p029l.C0216r.m3420d(r6, r0)
        L_0x008f:
            a.i.b.a r7 = r4.f3458m
            if (r7 != 0) goto L_0x009b
            a.i.b.a$c r7 = r4.f3471z
            a.i.b.a r5 = p000a.p033i.p035b.C0240a.m3330a(r5, r7)
            r4.f3458m = r5
        L_0x009b:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r6)
            r4.f3463r = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.view.View r6 = r4.m258a(r6)
            r5.<init>(r6)
            r4.f3464s = r5
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo62a(androidx.coordinatorlayout.widget.CoordinatorLayout r9, V r10, android.view.MotionEvent r11) {
            r8 = this;
            boolean r0 = r10.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000b
            r8.f3459n = r2
            return r1
        L_0x000b:
            int r0 = r11.getActionMasked()
            if (r0 != 0) goto L_0x0014
            r8.m239e()
        L_0x0014:
            android.view.VelocityTracker r3 = r8.f3466u
            if (r3 != 0) goto L_0x001e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r8.f3466u = r3
        L_0x001e:
            android.view.VelocityTracker r3 = r8.f3466u
            r3.addMovement(r11)
            r3 = 0
            r4 = -1
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x002d
            r10 = 3
            if (r0 == r10) goto L_0x002d
            goto L_0x0077
        L_0x002d:
            r8.f3469x = r1
            r8.f3467v = r4
            boolean r10 = r8.f3459n
            if (r10 == 0) goto L_0x0077
            r8.f3459n = r1
            return r1
        L_0x0038:
            float r5 = r11.getX()
            int r5 = (int) r5
            float r6 = r11.getY()
            int r6 = (int) r6
            r8.f3468w = r6
            java.lang.ref.WeakReference<android.view.View> r6 = r8.f3464s
            if (r6 == 0) goto L_0x004f
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L_0x0050
        L_0x004f:
            r6 = r3
        L_0x0050:
            if (r6 == 0) goto L_0x0066
            int r7 = r8.f3468w
            boolean r6 = r9.m1718a(r6, r5, r7)
            if (r6 == 0) goto L_0x0066
            int r6 = r11.getActionIndex()
            int r6 = r11.getPointerId(r6)
            r8.f3467v = r6
            r8.f3469x = r2
        L_0x0066:
            int r6 = r8.f3467v
            if (r6 != r4) goto L_0x0074
            int r4 = r8.f3468w
            boolean r10 = r9.m1718a(r10, r5, r4)
            if (r10 != 0) goto L_0x0074
            r10 = 1
            goto L_0x0075
        L_0x0074:
            r10 = 0
        L_0x0075:
            r8.f3459n = r10
        L_0x0077:
            boolean r10 = r8.f3459n
            if (r10 != 0) goto L_0x0086
            a.i.b.a r10 = r8.f3458m
            if (r10 == 0) goto L_0x0086
            boolean r10 = r10.m3321b(r11)
            if (r10 == 0) goto L_0x0086
            return r2
        L_0x0086:
            java.lang.ref.WeakReference<android.view.View> r10 = r8.f3464s
            if (r10 == 0) goto L_0x0091
            java.lang.Object r10 = r10.get()
            r3 = r10
            android.view.View r3 = (android.view.View) r3
        L_0x0091:
            r10 = 2
            if (r0 != r10) goto L_0x00ca
            if (r3 == 0) goto L_0x00ca
            boolean r10 = r8.f3459n
            if (r10 != 0) goto L_0x00ca
            int r10 = r8.f3457l
            if (r10 == r2) goto L_0x00ca
            float r10 = r11.getX()
            int r10 = (int) r10
            float r0 = r11.getY()
            int r0 = (int) r0
            boolean r9 = r9.m1718a(r3, r10, r0)
            if (r9 != 0) goto L_0x00ca
            a.i.b.a r9 = r8.f3458m
            if (r9 == 0) goto L_0x00ca
            int r9 = r8.f3468w
            float r9 = (float) r9
            float r10 = r11.getY()
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            a.i.b.a r10 = r8.f3458m
            int r10 = r10.m3314d()
            float r10 = (float) r10
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ca
            r1 = 1
        L_0x00ca:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo255a(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, float r6, float r7) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.f3464s
            java.lang.Object r0 = r0.get()
            if (r5 != r0) goto L_0x0015
            int r0 = r2.f3457l
            r1 = 3
            if (r0 != r1) goto L_0x0013
            boolean r3 = super.mo255a(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L_0x0015
        L_0x0013:
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            return r3
    }

    /* renamed from: b */
    public final void m249b(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f3449d
            if (r4 != 0) goto L_0x0015
            r3.f3449d = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f3449d
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f3448c
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f3449d = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f3448c = r1
            int r1 = r3.f3462q
            int r1 = r1 - r4
            r3.f3454i = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f3457l
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.f3463r
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
    }

    /* renamed from: b */
    public void m246b(boolean r1) {
            r0 = this;
            r0.f3455j = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo18b(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.MotionEvent r5) {
            r2 = this;
            boolean r3 = r4.isShown()
            if (r3 != 0) goto L_0x0008
            r3 = 0
            return r3
        L_0x0008:
            int r3 = r5.getActionMasked()
            int r0 = r2.f3457l
            r1 = 1
            if (r0 != r1) goto L_0x0014
            if (r3 != 0) goto L_0x0014
            return r1
        L_0x0014:
            a.i.b.a r0 = r2.f3458m
            if (r0 == 0) goto L_0x001b
            r0.m3336a(r5)
        L_0x001b:
            if (r3 != 0) goto L_0x0020
            r2.m239e()
        L_0x0020:
            android.view.VelocityTracker r0 = r2.f3466u
            if (r0 != 0) goto L_0x002a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r2.f3466u = r0
        L_0x002a:
            android.view.VelocityTracker r0 = r2.f3466u
            r0.addMovement(r5)
            r0 = 2
            if (r3 != r0) goto L_0x005a
            boolean r3 = r2.f3459n
            if (r3 != 0) goto L_0x005a
            int r3 = r2.f3468w
            float r3 = (float) r3
            float r0 = r5.getY()
            float r3 = r3 - r0
            float r3 = java.lang.Math.abs(r3)
            a.i.b.a r0 = r2.f3458m
            int r0 = r0.m3314d()
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x005a
            a.i.b.a r3 = r2.f3458m
            int r0 = r5.getActionIndex()
            int r5 = r5.getPointerId(r0)
            r3.m3334a(r4, r5)
        L_0x005a:
            boolean r3 = r2.f3459n
            r3 = r3 ^ r1
            return r3
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo248b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.f3460o = r1
            r0.f3461p = r1
            r2 = r5 & 2
            if (r2 == 0) goto L_0x000a
            r1 = 1
        L_0x000a:
            return r1
    }

    /* renamed from: c */
    void m244c(int r3) {
            r2 = this;
            int r0 = r2.f3457l
            if (r0 != r3) goto L_0x0005
            return
        L_0x0005:
            r2.f3457l = r3
            r0 = 6
            if (r3 == r0) goto L_0x0016
            r0 = 3
            if (r3 != r0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            r0 = 5
            if (r3 == r0) goto L_0x0014
            r0 = 4
            if (r3 != r0) goto L_0x001a
        L_0x0014:
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            r2.m240d(r0)
        L_0x001a:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.f3463r
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x002b
            com.google.android.material.bottomsheet.BottomSheetBehavior$b r1 = r2.f3465t
            if (r1 == 0) goto L_0x002b
            r1.m230a(r0, r3)
        L_0x002b:
            return
    }

    /* renamed from: c */
    public void m243c(boolean r1) {
            r0 = this;
            r0.f3456k = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: d */
    public android.os.Parcelable mo241d(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
            android.os.Parcelable r2 = super.mo241d(r2, r3)
            int r3 = r1.f3457l
            r0.<init>(r2, r3)
            return r0
    }
}
