package com.google.android.material.appbar;

@androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0678d(com.google.android.material.appbar.AppBarLayout.Behavior.class)
/* loaded from: classes.dex */
public class AppBarLayout extends android.widget.LinearLayout {

    /* renamed from: b */
    private int f3356b;

    /* renamed from: c */
    private int f3357c;

    /* renamed from: d */
    private int f3358d;

    /* renamed from: e */
    private boolean f3359e;

    /* renamed from: f */
    private int f3360f;

    /* renamed from: g */
    private p000a.p018g.p029l.C0230z f3361g;

    /* renamed from: h */
    private java.util.List<com.google.android.material.appbar.AppBarLayout.AbstractC0918a> f3362h;

    /* renamed from: i */
    private boolean f3363i;

    /* renamed from: j */
    private boolean f3364j;

    /* renamed from: k */
    private boolean f3365k;

    /* renamed from: l */
    private boolean f3366l;

    /* renamed from: m */
    private int[] f3367m;

    /* loaded from: classes.dex */
    protected static class BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> extends com.google.android.material.appbar.AbstractC0920a<T> {

        /* renamed from: k */
        private int f3368k;

        /* renamed from: l */
        private int f3369l;

        /* renamed from: m */
        private android.animation.ValueAnimator f3370m;

        /* renamed from: n */
        private int f3371n;

        /* renamed from: o */
        private boolean f3372o;

        /* renamed from: p */
        private float f3373p;

        /* renamed from: q */
        private java.lang.ref.WeakReference<android.view.View> f3374q;

        /* renamed from: r */
        private com.google.android.material.appbar.AppBarLayout.BaseBehavior.AbstractC0915b f3375r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes.dex */
        class C0914a implements android.animation.ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f3376a;

            /* renamed from: b */
            final /* synthetic */ com.google.android.material.appbar.AppBarLayout f3377b;

            /* renamed from: c */
            final /* synthetic */ com.google.android.material.appbar.AppBarLayout.BaseBehavior f3378c;

            C0914a(com.google.android.material.appbar.AppBarLayout.BaseBehavior r1, androidx.coordinatorlayout.widget.CoordinatorLayout r2, com.google.android.material.appbar.AppBarLayout r3) {
                    r0 = this;
                    r0.f3378c = r1
                    r0.f3376a = r2
                    r0.f3377b = r3
                    r0.<init>()
                    return
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator r4) {
                    r3 = this;
                    com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = r3.f3378c
                    androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r3.f3376a
                    com.google.android.material.appbar.AppBarLayout r2 = r3.f3377b
                    java.lang.Object r4 = r4.getAnimatedValue()
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    int r4 = r4.intValue()
                    r0.m335c(r1, r2, r4)
                    return
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0915b<T extends com.google.android.material.appbar.AppBarLayout> {
            /* renamed from: a */
            public abstract boolean m351a(T r1);
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: classes.dex */
        protected static class C0916c extends p000a.p033i.p034a.AbstractC0237a {
            public static final android.os.Parcelable.Creator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.C0916c> CREATOR = null;

            /* renamed from: d */
            int f3379d;

            /* renamed from: e */
            float f3380e;

            /* renamed from: f */
            boolean f3381f;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c$a */
            /* loaded from: classes.dex */
            static class C0917a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.C0916c> {
                C0917a() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // android.os.Parcelable.Creator
                public com.google.android.material.appbar.AppBarLayout.BaseBehavior.C0916c createFromParcel(android.os.Parcel r3) {
                        r2 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$c r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$c
                        r1 = 0
                        r0.<init>(r3, r1)
                        return r0
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public com.google.android.material.appbar.AppBarLayout.BaseBehavior.C0916c createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                        r1 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$c r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$c
                        r0.<init>(r2, r3)
                        return r0
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                        r0 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$c r1 = r0.createFromParcel(r1)
                        return r1
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public /* bridge */ /* synthetic */ com.google.android.material.appbar.AppBarLayout.BaseBehavior.C0916c createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                        r0 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$c r1 = r0.createFromParcel(r1, r2)
                        return r1
                }

                @Override // android.os.Parcelable.Creator
                public com.google.android.material.appbar.AppBarLayout.BaseBehavior.C0916c[] newArray(int r1) {
                        r0 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$c[] r1 = new com.google.android.material.appbar.AppBarLayout.BaseBehavior.C0916c[r1]
                        return r1
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                        r0 = this;
                        com.google.android.material.appbar.AppBarLayout$BaseBehavior$c[] r1 = r0.newArray(r1)
                        return r1
                }
            }

            static {
                    com.google.android.material.appbar.AppBarLayout$BaseBehavior$c$a r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$c$a
                    r0.<init>()
                    com.google.android.material.appbar.AppBarLayout.BaseBehavior.C0916c.CREATOR = r0
                    return
            }

            public C0916c(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    int r2 = r1.readInt()
                    r0.f3379d = r2
                    float r2 = r1.readFloat()
                    r0.f3380e = r2
                    byte r1 = r1.readByte()
                    if (r1 == 0) goto L_0x0017
                    r1 = 1
                    goto L_0x0018
                L_0x0017:
                    r1 = 0
                L_0x0018:
                    r0.f3381f = r1
                    return
            }

            public C0916c(android.os.Parcelable r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
            public void writeToParcel(android.os.Parcel r1, int r2) {
                    r0 = this;
                    super.writeToParcel(r1, r2)
                    int r2 = r0.f3379d
                    r1.writeInt(r2)
                    float r2 = r0.f3380e
                    r1.writeFloat(r2)
                    boolean r2 = r0.f3381f
                    byte r2 = (byte) r2
                    r1.writeByte(r2)
                    return
            }
        }

        public BaseBehavior() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f3371n = r0
                return
        }

        public BaseBehavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.f3371n = r1
                return
        }

        /* renamed from: a */
        static /* synthetic */ int m361a(com.google.android.material.appbar.AppBarLayout.BaseBehavior r0) {
                int r0 = r0.f3368k
                return r0
        }

        /* renamed from: a */
        private android.view.View m376a(androidx.coordinatorlayout.widget.CoordinatorLayout r5) {
                r4 = this;
                int r0 = r5.getChildCount()
                r1 = 0
            L_0x0005:
                if (r1 >= r0) goto L_0x0013
                android.view.View r2 = r5.getChildAt(r1)
                boolean r3 = r2 instanceof p000a.p018g.p029l.AbstractC0208j
                if (r3 == 0) goto L_0x0010
                return r2
            L_0x0010:
                int r1 = r1 + 1
                goto L_0x0005
            L_0x0013:
                r5 = 0
                return r5
        }

        /* renamed from: a */
        private static android.view.View m359a(com.google.android.material.appbar.AppBarLayout r4, int r5) {
                int r5 = java.lang.Math.abs(r5)
                int r0 = r4.getChildCount()
                r1 = 0
            L_0x0009:
                if (r1 >= r0) goto L_0x001f
                android.view.View r2 = r4.getChildAt(r1)
                int r3 = r2.getTop()
                if (r5 < r3) goto L_0x001c
                int r3 = r2.getBottom()
                if (r5 > r3) goto L_0x001c
                return r2
            L_0x001c:
                int r1 = r1 + 1
                goto L_0x0009
            L_0x001f:
                r4 = 0
                return r4
        }

        /* renamed from: a */
        private void m377a(int r2, T r3, android.view.View r4, int r5) {
                r1 = this;
                r0 = 1
                if (r5 != r0) goto L_0x0017
                int r5 = r1.mo337c()
                if (r2 >= 0) goto L_0x000b
                if (r5 == 0) goto L_0x0014
            L_0x000b:
                if (r2 <= 0) goto L_0x0017
                int r2 = r3.getDownNestedScrollRange()
                int r2 = -r2
                if (r5 != r2) goto L_0x0017
            L_0x0014:
                p000a.p018g.p029l.C0216r.m3414g(r4, r0)
            L_0x0017:
                return
        }

        /* renamed from: a */
        private void m372a(androidx.coordinatorlayout.widget.CoordinatorLayout r3, T r4, int r5, float r6) {
                r2 = this;
                int r0 = r2.mo337c()
                int r0 = r0 - r5
                int r0 = java.lang.Math.abs(r0)
                float r6 = java.lang.Math.abs(r6)
                r1 = 0
                int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x001f
                r1 = 1148846080(0x447a0000, float:1000.0)
                float r0 = (float) r0
                float r0 = r0 / r6
                float r0 = r0 * r1
                int r6 = java.lang.Math.round(r0)
                int r6 = r6 * 3
                goto L_0x002e
            L_0x001f:
                float r6 = (float) r0
                int r0 = r4.getHeight()
                float r0 = (float) r0
                float r6 = r6 / r0
                r0 = 1065353216(0x3f800000, float:1.0)
                float r6 = r6 + r0
                r0 = 1125515264(0x43160000, float:150.0)
                float r6 = r6 * r0
                int r6 = (int) r6
            L_0x002e:
                r2.m371a(r3, r4, r5, r6)
                return
        }

        /* renamed from: a */
        private void m371a(androidx.coordinatorlayout.widget.CoordinatorLayout r4, T r5, int r6, int r7) {
                r3 = this;
                int r0 = r3.mo337c()
                if (r0 != r6) goto L_0x0016
                android.animation.ValueAnimator r4 = r3.f3370m
                if (r4 == 0) goto L_0x0015
                boolean r4 = r4.isRunning()
                if (r4 == 0) goto L_0x0015
                android.animation.ValueAnimator r4 = r3.f3370m
                r4.cancel()
            L_0x0015:
                return
            L_0x0016:
                android.animation.ValueAnimator r1 = r3.f3370m
                if (r1 != 0) goto L_0x0033
                android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
                r1.<init>()
                r3.f3370m = r1
                android.animation.ValueAnimator r1 = r3.f3370m
                android.animation.TimeInterpolator r2 = p050b.p051a.p052a.p053a.p054j.C0877a.f3284d
                r1.setInterpolator(r2)
                android.animation.ValueAnimator r1 = r3.f3370m
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r2 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$a
                r2.<init>(r3, r4, r5)
                r1.addUpdateListener(r2)
                goto L_0x0036
            L_0x0033:
                r1.cancel()
            L_0x0036:
                android.animation.ValueAnimator r4 = r3.f3370m
                r5 = 600(0x258, float:8.41E-43)
                int r5 = java.lang.Math.min(r7, r5)
                long r1 = (long) r5
                r4.setDuration(r1)
                android.animation.ValueAnimator r4 = r3.f3370m
                r5 = 2
                int[] r5 = new int[r5]
                r7 = 0
                r5[r7] = r0
                r7 = 1
                r5[r7] = r6
                r4.setIntValues(r5)
                android.animation.ValueAnimator r4 = r3.f3370m
                r4.start()
                return
        }

        /* renamed from: a */
        private void m368a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
                r5 = this;
                android.view.View r0 = m359a(r7, r8)
                if (r0 == 0) goto L_0x006e
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$b r1 = (com.google.android.material.appbar.AppBarLayout.C0919b) r1
                int r1 = r1.m345a()
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0041
                int r2 = p000a.p018g.p029l.C0216r.m3410k(r0)
                if (r9 <= 0) goto L_0x002f
                r9 = r1 & 12
                if (r9 == 0) goto L_0x002f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
            L_0x002d:
                r8 = 1
                goto L_0x0042
            L_0x002f:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x0041
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
                goto L_0x002d
            L_0x0041:
                r8 = 0
            L_0x0042:
                boolean r9 = r7.m382c()
                if (r9 == 0) goto L_0x0057
                android.view.View r9 = r5.m376a(r6)
                if (r9 == 0) goto L_0x0057
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L_0x0056
                r8 = 1
                goto L_0x0057
            L_0x0056:
                r8 = 0
            L_0x0057:
                boolean r8 = r7.m387a(r8)
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r9 < r0) goto L_0x006e
                if (r10 != 0) goto L_0x006b
                if (r8 == 0) goto L_0x006e
                boolean r6 = r5.m355c(r6, r7)
                if (r6 == 0) goto L_0x006e
            L_0x006b:
                r7.jumpDrawablesToCurrentState()
            L_0x006e:
                return
        }

        /* renamed from: a */
        private static boolean m378a(int r0, int r1) {
                r0 = r0 & r1
                if (r0 != r1) goto L_0x0005
                r0 = 1
                goto L_0x0006
            L_0x0005:
                r0 = 0
            L_0x0006:
                return r0
        }

        /* renamed from: a */
        private boolean m366a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.view.View r4) {
                r1 = this;
                boolean r0 = r3.m384b()
                if (r0 == 0) goto L_0x0017
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0017
                r2 = 1
                goto L_0x0018
            L_0x0017:
                r2 = 0
            L_0x0018:
                return r2
        }

        /* renamed from: b */
        private int m356b(T r8, int r9) {
                r7 = this;
                int r0 = r8.getChildCount()
                r1 = 0
            L_0x0005:
                if (r1 >= r0) goto L_0x0034
                android.view.View r2 = r8.getChildAt(r1)
                int r3 = r2.getTop()
                int r4 = r2.getBottom()
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$b r2 = (com.google.android.material.appbar.AppBarLayout.C0919b) r2
                int r5 = r2.m345a()
                r6 = 32
                boolean r5 = m378a(r5, r6)
                if (r5 == 0) goto L_0x002b
                int r5 = r2.topMargin
                int r3 = r3 - r5
                int r2 = r2.bottomMargin
                int r4 = r4 + r2
            L_0x002b:
                int r2 = -r9
                if (r3 > r2) goto L_0x0031
                if (r4 < r2) goto L_0x0031
                return r1
            L_0x0031:
                int r1 = r1 + 1
                goto L_0x0005
            L_0x0034:
                r8 = -1
                return r8
        }

        /* renamed from: c */
        private int m353c(T r9, int r10) {
                r8 = this;
                int r0 = java.lang.Math.abs(r10)
                int r1 = r9.getChildCount()
                r2 = 0
                r3 = 0
            L_0x000a:
                if (r3 >= r1) goto L_0x0072
                android.view.View r4 = r9.getChildAt(r3)
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$b r5 = (com.google.android.material.appbar.AppBarLayout.C0919b) r5
                android.view.animation.Interpolator r6 = r5.m344b()
                int r7 = r4.getTop()
                if (r0 < r7) goto L_0x006f
                int r7 = r4.getBottom()
                if (r0 > r7) goto L_0x006f
                if (r6 == 0) goto L_0x0072
                int r1 = r5.m345a()
                r3 = r1 & 1
                if (r3 == 0) goto L_0x0044
                int r3 = r4.getHeight()
                int r7 = r5.topMargin
                int r3 = r3 + r7
                int r5 = r5.bottomMargin
                int r3 = r3 + r5
                int r2 = r2 + r3
                r1 = r1 & 2
                if (r1 == 0) goto L_0x0044
                int r1 = p000a.p018g.p029l.C0216r.m3410k(r4)
                int r2 = r2 - r1
            L_0x0044:
                boolean r1 = p000a.p018g.p029l.C0216r.m3415g(r4)
                if (r1 == 0) goto L_0x004f
                int r9 = r9.getTopInset()
                int r2 = r2 - r9
            L_0x004f:
                if (r2 <= 0) goto L_0x0072
                int r9 = r4.getTop()
                int r0 = r0 - r9
                float r9 = (float) r2
                float r0 = (float) r0
                float r0 = r0 / r9
                float r0 = r6.getInterpolation(r0)
                float r9 = r9 * r0
                int r9 = java.lang.Math.round(r9)
                int r10 = java.lang.Integer.signum(r10)
                int r0 = r4.getTop()
                int r0 = r0 + r9
                int r10 = r10 * r0
                return r10
            L_0x006f:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0072:
                return r10
        }

        /* renamed from: c */
        private boolean m355c(androidx.coordinatorlayout.widget.CoordinatorLayout r5, T r6) {
                r4 = this;
                java.util.List r5 = r5.m1698c(r6)
                int r6 = r5.size()
                r0 = 0
                r1 = 0
            L_0x000a:
                if (r1 >= r6) goto L_0x002d
                java.lang.Object r2 = r5.get(r1)
                android.view.View r2 = (android.view.View) r2
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r2
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.m1659d()
                boolean r3 = r2 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r3 == 0) goto L_0x002a
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r2 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r2
                int r5 = r2.m327c()
                if (r5 == 0) goto L_0x0029
                r0 = 1
            L_0x0029:
                return r0
            L_0x002a:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x002d:
                return r0
        }

        /* renamed from: d */
        private void m352d(androidx.coordinatorlayout.widget.CoordinatorLayout r9, T r10) {
                r8 = this;
                int r0 = r8.mo337c()
                int r1 = r8.m356b(r10, r0)
                if (r1 < 0) goto L_0x0075
                android.view.View r2 = r10.getChildAt(r1)
                android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$b r3 = (com.google.android.material.appbar.AppBarLayout.C0919b) r3
                int r4 = r3.m345a()
                r5 = r4 & 17
                r6 = 17
                if (r5 != r6) goto L_0x0075
                int r5 = r2.getTop()
                int r5 = -r5
                int r6 = r2.getBottom()
                int r6 = -r6
                int r7 = r10.getChildCount()
                int r7 = r7 + (-1)
                if (r1 != r7) goto L_0x0035
                int r1 = r10.getTopInset()
                int r6 = r6 + r1
            L_0x0035:
                r1 = 2
                boolean r7 = m378a(r4, r1)
                if (r7 == 0) goto L_0x0042
                int r2 = p000a.p018g.p029l.C0216r.m3410k(r2)
                int r6 = r6 + r2
                goto L_0x0053
            L_0x0042:
                r7 = 5
                boolean r7 = m378a(r4, r7)
                if (r7 == 0) goto L_0x0053
                int r2 = p000a.p018g.p029l.C0216r.m3410k(r2)
                int r2 = r2 + r6
                if (r0 >= r2) goto L_0x0052
                r5 = r2
                goto L_0x0053
            L_0x0052:
                r6 = r2
            L_0x0053:
                r2 = 32
                boolean r2 = m378a(r4, r2)
                if (r2 == 0) goto L_0x0061
                int r2 = r3.topMargin
                int r5 = r5 + r2
                int r2 = r3.bottomMargin
                int r6 = r6 - r2
            L_0x0061:
                int r2 = r6 + r5
                int r2 = r2 / r1
                if (r0 >= r2) goto L_0x0067
                r5 = r6
            L_0x0067:
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                r1 = 0
                int r0 = p000a.p018g.p024g.C0158a.m3608a(r5, r0, r1)
                r1 = 0
                r8.m372a(r9, r10, r0, r1)
            L_0x0075:
                return
        }

        /* renamed from: a */
        int m370a(androidx.coordinatorlayout.widget.CoordinatorLayout r9, T r10, int r11, int r12, int r13) {
                r8 = this;
                int r0 = r8.mo337c()
                r1 = 0
                if (r12 == 0) goto L_0x0048
                if (r0 < r12) goto L_0x0048
                if (r0 > r13) goto L_0x0048
                int r5 = p000a.p018g.p024g.C0158a.m3608a(r11, r12, r13)
                if (r0 == r5) goto L_0x004a
                boolean r11 = r10.m389a()
                if (r11 == 0) goto L_0x001c
                int r11 = r8.m353c(r10, r5)
                goto L_0x001d
            L_0x001c:
                r11 = r5
            L_0x001d:
                boolean r12 = r8.m323a(r11)
                int r1 = r0 - r5
                int r11 = r5 - r11
                r8.f3368k = r11
                if (r12 != 0) goto L_0x0032
                boolean r11 = r10.m389a()
                if (r11 == 0) goto L_0x0032
                r9.m1719a(r10)
            L_0x0032:
                int r11 = r8.m322b()
                r10.m388a(r11)
                if (r5 >= r0) goto L_0x003e
                r11 = -1
                r6 = -1
                goto L_0x0040
            L_0x003e:
                r11 = 1
                r6 = 1
            L_0x0040:
                r7 = 0
                r2 = r8
                r3 = r9
                r4 = r10
                r2.m368a(r3, r4, r5, r6, r7)
                goto L_0x004a
            L_0x0048:
                r8.f3368k = r1
            L_0x004a:
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo256a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.os.Parcelable r3) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.m367a(r1, r2, r3)
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo254a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, int r4) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.m365a(r1, r2, r3, r4)
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo375a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.m364a(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo253a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, int r4, int r5, int[] r6, int r7) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.m363a(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        /* renamed from: a */
        void m374a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, T r2) {
                r0 = this;
                r0.m352d(r1, r2)
                return
        }

        /* renamed from: a */
        public void m367a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.os.Parcelable r4) {
                r1 = this;
                boolean r0 = r4 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior.C0916c
                if (r0 == 0) goto L_0x001a
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$c r4 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior.C0916c) r4
                android.os.Parcelable r0 = r4.m3347a()
                super.mo256a(r2, r3, r0)
                int r2 = r4.f3379d
                r1.f3371n = r2
                float r2 = r4.f3380e
                r1.f3373p = r2
                boolean r2 = r4.f3381f
                r1.f3372o = r2
                goto L_0x0020
            L_0x001a:
                super.mo256a(r2, r3, r4)
                r2 = -1
                r1.f3371n = r2
            L_0x0020:
                return
        }

        /* renamed from: a */
        public void m365a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.view.View r4, int r5) {
                r1 = this;
                int r0 = r1.f3369l
                if (r0 == 0) goto L_0x0007
                r0 = 1
                if (r5 != r0) goto L_0x000a
            L_0x0007:
                r1.m352d(r2, r3)
            L_0x000a:
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r4)
                r1.f3374q = r2
                return
        }

        /* renamed from: a */
        public void m364a(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
                r6 = this;
                if (r13 >= 0) goto L_0x0012
                int r10 = r8.getDownNestedScrollRange()
                int r4 = -r10
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r13
                r0.m340a(r1, r2, r3, r4, r5)
                r6.m377a(r13, r8, r9, r14)
            L_0x0012:
                boolean r7 = r8.m382c()
                if (r7 == 0) goto L_0x0024
                int r7 = r9.getScrollY()
                if (r7 <= 0) goto L_0x0020
                r7 = 1
                goto L_0x0021
            L_0x0020:
                r7 = 0
            L_0x0021:
                r8.m387a(r7)
            L_0x0024:
                return
        }

        /* renamed from: a */
        public void m363a(androidx.coordinatorlayout.widget.CoordinatorLayout r8, T r9, android.view.View r10, int r11, int r12, int[] r13, int r14) {
                r7 = this;
                if (r12 == 0) goto L_0x0029
                if (r12 >= 0) goto L_0x0011
                int r11 = r9.getTotalScrollRange()
                int r11 = -r11
                int r0 = r9.getDownNestedPreScrollRange()
                int r0 = r0 + r11
                r5 = r11
                r6 = r0
                goto L_0x0019
            L_0x0011:
                int r11 = r9.getUpNestedPreScrollRange()
                int r11 = -r11
                r0 = 0
                r5 = r11
                r6 = 0
            L_0x0019:
                if (r5 == r6) goto L_0x0029
                r11 = 1
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r12
                int r8 = r1.m340a(r2, r3, r4, r5, r6)
                r13[r11] = r8
                r7.m377a(r12, r9, r10, r14)
            L_0x0029:
                return
        }

        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: a */
        /* bridge */ /* synthetic */ boolean mo342a(android.view.View r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                boolean r1 = r0.m360a(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.C0923c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo46a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                boolean r1 = r0.m373a(r1, r2, r3)
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo331a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                boolean r1 = r0.m369a(r1, r2, r3, r4, r5, r6)
                return r1
        }

        /* renamed from: a */
        public boolean m373a(androidx.coordinatorlayout.widget.CoordinatorLayout r8, T r9, int r10) {
                r7 = this;
                boolean r10 = super.mo46a(r8, r9, r10)
                int r0 = r9.getPendingAction()
                int r1 = r7.f3371n
                r2 = 0
                if (r1 < 0) goto L_0x003a
                r3 = r0 & 8
                if (r3 != 0) goto L_0x003a
                android.view.View r0 = r9.getChildAt(r1)
                int r1 = r0.getBottom()
                int r1 = -r1
                boolean r3 = r7.f3372o
                if (r3 == 0) goto L_0x0028
                int r0 = p000a.p018g.p029l.C0216r.m3410k(r0)
                int r3 = r9.getTopInset()
                int r0 = r0 + r3
                goto L_0x0035
            L_0x0028:
                int r0 = r0.getHeight()
                float r0 = (float) r0
                float r3 = r7.f3373p
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
            L_0x0035:
                int r1 = r1 + r0
                r7.m335c(r8, r9, r1)
                goto L_0x0064
            L_0x003a:
                if (r0 == 0) goto L_0x0064
                r1 = r0 & 4
                r3 = 1
                if (r1 == 0) goto L_0x0043
                r1 = 1
                goto L_0x0044
            L_0x0043:
                r1 = 0
            L_0x0044:
                r4 = r0 & 2
                r5 = 0
                if (r4 == 0) goto L_0x0058
                int r0 = r9.getUpNestedPreScrollRange()
                int r0 = -r0
                if (r1 == 0) goto L_0x0054
                r7.m372a(r8, r9, r0, r5)
                goto L_0x0064
            L_0x0054:
                r7.m335c(r8, r9, r0)
                goto L_0x0064
            L_0x0058:
                r0 = r0 & r3
                if (r0 == 0) goto L_0x0064
                if (r1 == 0) goto L_0x0061
                r7.m372a(r8, r9, r2, r5)
                goto L_0x0064
            L_0x0061:
                r7.m335c(r8, r9, r2)
            L_0x0064:
                r9.m381d()
                r0 = -1
                r7.f3371n = r0
                int r0 = r7.m322b()
                int r1 = r9.getTotalScrollRange()
                int r1 = -r1
                int r0 = p000a.p018g.p024g.C0158a.m3608a(r0, r1, r2)
                r7.m323a(r0)
                int r4 = r7.m322b()
                r5 = 0
                r6 = 1
                r1 = r7
                r2 = r8
                r3 = r9
                r1.m368a(r2, r3, r4, r5, r6)
                int r8 = r7.m322b()
                r9.m388a(r8)
                return r10
        }

        /* renamed from: a */
        public boolean m369a(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, int r11, int r12) {
                r6 = this;
                android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
                int r0 = r0.height
                r1 = -2
                if (r0 != r1) goto L_0x001a
                r11 = 0
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r11)
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r5 = r12
                r0.m1717a(r1, r2, r3, r4, r5)
                r7 = 1
                return r7
            L_0x001a:
                boolean r7 = super.mo331a(r7, r8, r9, r10, r11, r12)
                return r7
        }

        /* renamed from: a */
        public boolean m362a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, T r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                r4 = r5 & 2
                if (r4 == 0) goto L_0x0012
                boolean r4 = r2.m382c()
                if (r4 != 0) goto L_0x0010
                boolean r1 = r0.m366a(r1, r2, r3)
                if (r1 == 0) goto L_0x0012
            L_0x0010:
                r1 = 1
                goto L_0x0013
            L_0x0012:
                r1 = 0
            L_0x0013:
                if (r1 == 0) goto L_0x001c
                android.animation.ValueAnimator r2 = r0.f3370m
                if (r2 == 0) goto L_0x001c
                r2.cancel()
            L_0x001c:
                r2 = 0
                r0.f3374q = r2
                r0.f3369l = r6
                return r1
        }

        /* renamed from: a */
        boolean m360a(T r3) {
                r2 = this;
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$b r0 = r2.f3375r
                if (r0 == 0) goto L_0x0009
                boolean r3 = r0.m351a(r3)
                return r3
            L_0x0009:
                java.lang.ref.WeakReference<android.view.View> r3 = r2.f3374q
                r0 = 1
                if (r3 == 0) goto L_0x0025
                java.lang.Object r3 = r3.get()
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x0024
                boolean r1 = r3.isShown()
                if (r1 == 0) goto L_0x0024
                r1 = -1
                boolean r3 = r3.canScrollVertically(r1)
                if (r3 != 0) goto L_0x0024
                goto L_0x0025
            L_0x0024:
                r0 = 0
            L_0x0025:
                return r0
        }

        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: b */
        /* bridge */ /* synthetic */ int mo339b(android.view.View r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                int r1 = r0.m357b(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: b */
        /* bridge */ /* synthetic */ int mo338b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                int r1 = r0.m370a(r1, r2, r3, r4, r5)
                return r1
        }

        /* renamed from: b */
        int m357b(T r1) {
                r0 = this;
                int r1 = r1.getDownNestedScrollRange()
                int r1 = -r1
                return r1
        }

        /* renamed from: b */
        public android.os.Parcelable m358b(androidx.coordinatorlayout.widget.CoordinatorLayout r8, T r9) {
                r7 = this;
                android.os.Parcelable r8 = super.mo241d(r8, r9)
                int r0 = r7.m322b()
                int r1 = r9.getChildCount()
                r2 = 0
                r3 = 0
            L_0x000e:
                if (r3 >= r1) goto L_0x0044
                android.view.View r4 = r9.getChildAt(r3)
                int r5 = r4.getBottom()
                int r5 = r5 + r0
                int r6 = r4.getTop()
                int r6 = r6 + r0
                if (r6 > 0) goto L_0x0041
                if (r5 < 0) goto L_0x0041
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$c r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$c
                r0.<init>(r8)
                r0.f3379d = r3
                int r8 = p000a.p018g.p029l.C0216r.m3410k(r4)
                int r9 = r9.getTopInset()
                int r8 = r8 + r9
                if (r5 != r8) goto L_0x0035
                r2 = 1
            L_0x0035:
                r0.f3381f = r2
                float r8 = (float) r5
                int r9 = r4.getHeight()
                float r9 = (float) r9
                float r8 = r8 / r9
                r0.f3380e = r8
                return r0
            L_0x0041:
                int r3 = r3 + 1
                goto L_0x000e
            L_0x0044:
                return r8
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo248b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                boolean r1 = r0.m362a(r1, r2, r3, r4, r5, r6)
                return r1
        }

        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: c */
        int mo337c() {
                r2 = this;
                int r0 = r2.m322b()
                int r1 = r2.f3368k
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: c */
        /* bridge */ /* synthetic */ int mo336c(android.view.View r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                int r1 = r0.m354c(r1)
                return r1
        }

        /* renamed from: c */
        int m354c(T r1) {
                r0 = this;
                int r1 = r1.getTotalScrollRange()
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: d */
        public /* bridge */ /* synthetic */ android.os.Parcelable mo241d(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                android.os.Parcelable r1 = r0.m358b(r1, r2)
                return r1
        }

        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: e */
        /* bridge */ /* synthetic */ void mo333e(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.m374a(r1, r2)
                return
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends com.google.android.material.appbar.AppBarLayout.BaseBehavior<com.google.android.material.appbar.AppBarLayout> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.AbstractC0922b {
        public ScrollingViewBehavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public ScrollingViewBehavior(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = p050b.p051a.p052a.p053a.C0876i.ScrollingViewBehavior_Layout
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = p050b.p051a.p052a.p053a.C0876i.ScrollingViewBehavior_Layout_behavior_overlapTop
                r0 = 0
                int r3 = r2.getDimensionPixelSize(r3, r0)
                r1.m329b(r3)
                r2.recycle()
                return
        }

        /* renamed from: a */
        private static int m348a(com.google.android.material.appbar.AppBarLayout r1) {
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r1
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r1.m1659d()
                boolean r0 = r1 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
                if (r0 == 0) goto L_0x0015
                com.google.android.material.appbar.AppBarLayout$BaseBehavior r1 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r1
                int r1 = r1.mo337c()
                return r1
            L_0x0015:
                r1 = 0
                return r1
        }

        /* renamed from: a */
        private void m350a(android.view.View r4, android.view.View r5) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.m1659d()
                boolean r1 = r0 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
                if (r1 == 0) goto L_0x002b
                com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
                int r1 = r5.getBottom()
                int r2 = r4.getTop()
                int r1 = r1 - r2
                int r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.m361a(r0)
                int r1 = r1 + r0
                int r0 = r3.m324d()
                int r1 = r1 + r0
                int r5 = r3.m332a(r5)
                int r1 = r1 - r5
                p000a.p018g.p029l.C0216r.m3420d(r4, r1)
            L_0x002b:
                return
        }

        /* renamed from: b */
        private void m347b(android.view.View r2, android.view.View r3) {
                r1 = this;
                boolean r0 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto L_0x0018
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                boolean r0 = r3.m382c()
                if (r0 == 0) goto L_0x0018
                int r2 = r2.getScrollY()
                if (r2 <= 0) goto L_0x0014
                r2 = 1
                goto L_0x0015
            L_0x0014:
                r2 = 0
            L_0x0015:
                r3.m387a(r2)
            L_0x0018:
                return
        }

        @Override // com.google.android.material.appbar.AbstractC0922b
        /* renamed from: a */
        /* bridge */ /* synthetic */ android.view.View mo330a(java.util.List r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = r0.mo330a(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.AbstractC0922b
        /* renamed from: a */
        com.google.android.material.appbar.AppBarLayout mo330a(java.util.List<android.view.View> r5) {
                r4 = this;
                int r0 = r5.size()
                r1 = 0
            L_0x0005:
                if (r1 >= r0) goto L_0x0017
                java.lang.Object r2 = r5.get(r1)
                android.view.View r2 = (android.view.View) r2
                boolean r3 = r2 instanceof com.google.android.material.appbar.AppBarLayout
                if (r3 == 0) goto L_0x0014
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                return r2
            L_0x0014:
                int r1 = r1 + 1
                goto L_0x0005
            L_0x0017:
                r5 = 0
                return r5
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public boolean mo349a(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.graphics.Rect r6, boolean r7) {
                r3 = this;
                java.util.List r0 = r4.m1704b(r5)
                com.google.android.material.appbar.AppBarLayout r0 = r3.mo330a(r0)
                r1 = 0
                if (r0 == 0) goto L_0x0030
                int r2 = r5.getLeft()
                int r5 = r5.getTop()
                r6.offset(r2, r5)
                android.graphics.Rect r5 = r3.f3394d
                int r2 = r4.getWidth()
                int r4 = r4.getHeight()
                r5.set(r1, r1, r2, r4)
                boolean r4 = r5.contains(r6)
                if (r4 != 0) goto L_0x0030
                r4 = 1
                r5 = r7 ^ 1
                r0.m386a(r1, r5)
                return r4
            L_0x0030:
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public boolean mo20a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                boolean r1 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                return r1
        }

        @Override // com.google.android.material.appbar.AbstractC0922b
        /* renamed from: b */
        float mo328b(android.view.View r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.google.android.material.appbar.AppBarLayout
                r1 = 0
                if (r0 == 0) goto L_0x0024
                com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
                int r0 = r5.getTotalScrollRange()
                int r2 = r5.getDownNestedPreScrollRange()
                int r5 = m348a(r5)
                if (r2 == 0) goto L_0x001a
                int r3 = r0 + r5
                if (r3 > r2) goto L_0x001a
                return r1
            L_0x001a:
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x0024
                r1 = 1065353216(0x3f800000, float:1.0)
                float r5 = (float) r5
                float r0 = (float) r0
                float r5 = r5 / r0
                float r5 = r5 + r1
                return r5
            L_0x0024:
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: b */
        public boolean mo43b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.m350a(r2, r3)
                r0.m347b(r2, r3)
                r1 = 0
                return r1
        }

        @Override // com.google.android.material.appbar.AbstractC0922b
        /* renamed from: c */
        int mo325c(android.view.View r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto L_0x000b
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                int r2 = r2.getTotalScrollRange()
                return r2
            L_0x000b:
                int r2 = super.mo325c(r2)
                return r2
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes.dex */
    public interface AbstractC0918a<T extends com.google.android.material.appbar.AppBarLayout> {
        /* renamed from: a */
        void m346a(T r1, int r2);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes.dex */
    public static class C0919b extends android.widget.LinearLayout.LayoutParams {

        /* renamed from: a */
        int f3382a;

        /* renamed from: b */
        android.view.animation.Interpolator f3383b;

        public C0919b(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 1
                r0.f3382a = r1
                return
        }

        public C0919b(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 1
                r2.f3382a = r0
                int[] r0 = p050b.p051a.p052a.p053a.C0876i.AppBarLayout_Layout
                android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
                int r0 = p050b.p051a.p052a.p053a.C0876i.AppBarLayout_Layout_layout_scrollFlags
                r1 = 0
                int r0 = r4.getInt(r0, r1)
                r2.f3382a = r0
                int r0 = p050b.p051a.p052a.p053a.C0876i.AppBarLayout_Layout_layout_scrollInterpolator
                boolean r0 = r4.hasValue(r0)
                if (r0 == 0) goto L_0x0029
                int r0 = p050b.p051a.p052a.p053a.C0876i.AppBarLayout_Layout_layout_scrollInterpolator
                int r0 = r4.getResourceId(r0, r1)
                android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r3, r0)
                r2.f3383b = r3
            L_0x0029:
                r4.recycle()
                return
        }

        public C0919b(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.f3382a = r1
                return
        }

        public C0919b(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.f3382a = r1
                return
        }

        public C0919b(android.widget.LinearLayout.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.f3382a = r1
                return
        }

        /* renamed from: a */
        public int m345a() {
                r1 = this;
                int r0 = r1.f3382a
                return r0
        }

        /* renamed from: b */
        public android.view.animation.Interpolator m344b() {
                r1 = this;
                android.view.animation.Interpolator r0 = r1.f3383b
                return r0
        }

        /* renamed from: c */
        boolean m343c() {
                r3 = this;
                int r0 = r3.f3382a
                r1 = r0 & 1
                r2 = 1
                if (r1 != r2) goto L_0x000c
                r0 = r0 & 10
                if (r0 == 0) goto L_0x000c
                goto L_0x000d
            L_0x000c:
                r2 = 0
            L_0x000d:
                return r2
        }
    }

    /* renamed from: a */
    private void m385a(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            if (r2 == 0) goto L_0x0004
            r2 = 1
            goto L_0x0005
        L_0x0004:
            r2 = 2
        L_0x0005:
            r0 = 0
            if (r3 == 0) goto L_0x000a
            r3 = 4
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            r2 = r2 | r3
            if (r4 == 0) goto L_0x0010
            r0 = 8
        L_0x0010:
            r2 = r2 | r0
            r1.f3360f = r2
            r1.requestLayout()
            return
    }

    /* renamed from: b */
    private boolean m383b(boolean r2) {
            r1 = this;
            boolean r0 = r1.f3364j
            if (r0 == r2) goto L_0x000b
            r1.f3364j = r2
            r1.refreshDrawableState()
            r2 = 1
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: e */
    private boolean m380e() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x001d
            android.view.View r3 = r4.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$b r3 = (com.google.android.material.appbar.AppBarLayout.C0919b) r3
            boolean r3 = r3.m343c()
            if (r3 == 0) goto L_0x001a
            r0 = 1
            return r0
        L_0x001a:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x001d:
            return r1
    }

    /* renamed from: f */
    private void m379f() {
            r1 = this;
            r0 = -1
            r1.f3356b = r0
            r1.f3357c = r0
            r1.f3358d = r0
            return
    }

    /* renamed from: a */
    void m388a(int r4) {
            r3 = this;
            java.util.List<com.google.android.material.appbar.AppBarLayout$a> r0 = r3.f3362h
            if (r0 == 0) goto L_0x001b
            r1 = 0
            int r0 = r0.size()
        L_0x0009:
            if (r1 >= r0) goto L_0x001b
            java.util.List<com.google.android.material.appbar.AppBarLayout$a> r2 = r3.f3362h
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.appbar.AppBarLayout$a r2 = (com.google.android.material.appbar.AppBarLayout.AbstractC0918a) r2
            if (r2 == 0) goto L_0x0018
            r2.m346a(r3, r4)
        L_0x0018:
            int r1 = r1 + 1
            goto L_0x0009
        L_0x001b:
            return
    }

    /* renamed from: a */
    public void m386a(boolean r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.m385a(r2, r3, r0)
            return
    }

    /* renamed from: a */
    boolean m389a() {
            r1 = this;
            boolean r0 = r1.f3359e
            return r0
    }

    /* renamed from: a */
    boolean m387a(boolean r2) {
            r1 = this;
            boolean r0 = r1.f3365k
            if (r0 == r2) goto L_0x000b
            r1.f3365k = r2
            r1.refreshDrawableState()
            r2 = 1
            return r2
        L_0x000b:
            r2 = 0
            return r2
    }

    /* renamed from: b */
    boolean m384b() {
            r1 = this;
            int r0 = r1.getTotalScrollRange()
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            return r0
    }

    /* renamed from: c */
    public boolean m382c() {
            r1 = this;
            boolean r0 = r1.f3366l
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.google.android.material.appbar.AppBarLayout.C0919b
            return r1
    }

    /* renamed from: d */
    void m381d() {
            r1 = this;
            r0 = 0
            r1.f3360f = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            com.google.android.material.appbar.AppBarLayout$b r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            com.google.android.material.appbar.AppBarLayout$b r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected com.google.android.material.appbar.AppBarLayout.C0919b generateDefaultLayoutParams() {
            r3 = this;
            com.google.android.material.appbar.AppBarLayout$b r0 = new com.google.android.material.appbar.AppBarLayout$b
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$b r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$b r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$b r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$b r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public com.google.android.material.appbar.AppBarLayout.C0919b generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            com.google.android.material.appbar.AppBarLayout$b r0 = new com.google.android.material.appbar.AppBarLayout$b
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected com.google.android.material.appbar.AppBarLayout.C0919b generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x0012
            boolean r0 = r3 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0012
            com.google.android.material.appbar.AppBarLayout$b r0 = new com.google.android.material.appbar.AppBarLayout$b
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            r0.<init>(r3)
            return r0
        L_0x0012:
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x001e
            com.google.android.material.appbar.AppBarLayout$b r0 = new com.google.android.material.appbar.AppBarLayout$b
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r0.<init>(r3)
            return r0
        L_0x001e:
            com.google.android.material.appbar.AppBarLayout$b r0 = new com.google.android.material.appbar.AppBarLayout$b
            r0.<init>(r3)
            return r0
    }

    int getDownNestedPreScrollRange() {
            r9 = this;
            int r0 = r9.f3357c
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = 0
        L_0x000e:
            if (r0 < 0) goto L_0x004b
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$b r4 = (com.google.android.material.appbar.AppBarLayout.C0919b) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f3382a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x0045
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            int r2 = r2 + r7
            r4 = r6 & 8
            if (r4 == 0) goto L_0x0035
            int r3 = p000a.p018g.p029l.C0216r.m3410k(r3)
            int r2 = r2 + r3
            goto L_0x0048
        L_0x0035:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x003e
            int r3 = p000a.p018g.p029l.C0216r.m3410k(r3)
            goto L_0x0042
        L_0x003e:
            int r3 = r9.getTopInset()
        L_0x0042:
            int r5 = r5 - r3
            int r2 = r2 + r5
            goto L_0x0048
        L_0x0045:
            if (r2 <= 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            int r0 = r0 + (-1)
            goto L_0x000e
        L_0x004b:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f3357c = r0
            return r0
    }

    int getDownNestedScrollRange() {
            r9 = this;
            int r0 = r9.f3358d
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000d:
            if (r2 >= r0) goto L_0x003c
            android.view.View r4 = r9.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$b r5 = (com.google.android.material.appbar.AppBarLayout.C0919b) r5
            int r6 = r4.getMeasuredHeight()
            int r7 = r5.topMargin
            int r8 = r5.bottomMargin
            int r7 = r7 + r8
            int r6 = r6 + r7
            int r5 = r5.f3382a
            r7 = r5 & 1
            if (r7 == 0) goto L_0x003c
            int r3 = r3 + r6
            r5 = r5 & 2
            if (r5 == 0) goto L_0x0039
            int r0 = p000a.p018g.p029l.C0216r.m3410k(r4)
            int r2 = r9.getTopInset()
            int r0 = r0 + r2
            int r3 = r3 - r0
            goto L_0x003c
        L_0x0039:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x003c:
            int r0 = java.lang.Math.max(r1, r3)
            r9.f3358d = r0
            return r0
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
            r3 = this;
            int r0 = r3.getTopInset()
            int r1 = p000a.p018g.p029l.C0216r.m3410k(r3)
            if (r1 == 0) goto L_0x000e
        L_0x000a:
            int r1 = r1 * 2
            int r1 = r1 + r0
            return r1
        L_0x000e:
            int r1 = r3.getChildCount()
            r2 = 1
            if (r1 < r2) goto L_0x001f
            int r1 = r1 - r2
            android.view.View r1 = r3.getChildAt(r1)
            int r1 = p000a.p018g.p029l.C0216r.m3410k(r1)
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x0023
            goto L_0x000a
        L_0x0023:
            int r0 = r3.getHeight()
            int r0 = r0 / 3
            return r0
    }

    int getPendingAction() {
            r1 = this;
            int r0 = r1.f3360f
            return r0
    }

    @java.lang.Deprecated
    public float getTargetElevation() {
            r1 = this;
            r0 = 0
            return r0
    }

    final int getTopInset() {
            r1 = this;
            a.g.l.z r0 = r1.f3361g
            if (r0 == 0) goto L_0x0009
            int r0 = r0.m3355e()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            return r0
    }

    public final int getTotalScrollRange() {
            r9 = this;
            int r0 = r9.f3356b
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000d:
            if (r2 >= r0) goto L_0x0037
            android.view.View r4 = r9.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$b r5 = (com.google.android.material.appbar.AppBarLayout.C0919b) r5
            int r6 = r4.getMeasuredHeight()
            int r7 = r5.f3382a
            r8 = r7 & 1
            if (r8 == 0) goto L_0x0037
            int r8 = r5.topMargin
            int r6 = r6 + r8
            int r5 = r5.bottomMargin
            int r6 = r6 + r5
            int r3 = r3 + r6
            r5 = r7 & 2
            if (r5 == 0) goto L_0x0034
            int r0 = p000a.p018g.p029l.C0216r.m3410k(r4)
            int r3 = r3 - r0
            goto L_0x0037
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0037:
            int r0 = r9.getTopInset()
            int r3 = r3 - r0
            int r0 = java.lang.Math.max(r1, r3)
            r9.f3356b = r0
            return r0
    }

    int getUpNestedPreScrollRange() {
            r1 = this;
            int r0 = r1.getTotalScrollRange()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int r4) {
            r3 = this;
            int[] r0 = r3.f3367m
            if (r0 != 0) goto L_0x0009
            r0 = 4
            int[] r0 = new int[r0]
            r3.f3367m = r0
        L_0x0009:
            int[] r0 = r3.f3367m
            int r1 = r0.length
            int r4 = r4 + r1
            int[] r4 = super.onCreateDrawableState(r4)
            r1 = 0
            boolean r2 = r3.f3364j
            if (r2 == 0) goto L_0x0019
            int r2 = p050b.p051a.p052a.p053a.C0869b.state_liftable
            goto L_0x001c
        L_0x0019:
            int r2 = p050b.p051a.p052a.p053a.C0869b.state_liftable
            int r2 = -r2
        L_0x001c:
            r0[r1] = r2
            r1 = 1
            boolean r2 = r3.f3364j
            if (r2 == 0) goto L_0x002a
            boolean r2 = r3.f3365k
            if (r2 == 0) goto L_0x002a
            int r2 = p050b.p051a.p052a.p053a.C0869b.state_lifted
            goto L_0x002d
        L_0x002a:
            int r2 = p050b.p051a.p052a.p053a.C0869b.state_lifted
            int r2 = -r2
        L_0x002d:
            r0[r1] = r2
            r1 = 2
            boolean r2 = r3.f3364j
            if (r2 == 0) goto L_0x0037
            int r2 = p050b.p051a.p052a.p053a.C0869b.state_collapsible
            goto L_0x003a
        L_0x0037:
            int r2 = p050b.p051a.p052a.p053a.C0869b.state_collapsible
            int r2 = -r2
        L_0x003a:
            r0[r1] = r2
            r1 = 3
            boolean r2 = r3.f3364j
            if (r2 == 0) goto L_0x0048
            boolean r2 = r3.f3365k
            if (r2 == 0) goto L_0x0048
            int r2 = p050b.p051a.p052a.p053a.C0869b.state_collapsed
            goto L_0x004b
        L_0x0048:
            int r2 = p050b.p051a.p052a.p053a.C0869b.state_collapsed
            int r2 = -r2
        L_0x004b:
            r0[r1] = r2
            int[] r4 = android.widget.LinearLayout.mergeDrawableStates(r4, r0)
            return r4
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.m379f()
            r1 = 0
            r0.f3359e = r1
            int r2 = r0.getChildCount()
            r3 = 0
        L_0x000e:
            r4 = 1
            if (r3 >= r2) goto L_0x0027
            android.view.View r5 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$b r5 = (com.google.android.material.appbar.AppBarLayout.C0919b) r5
            android.view.animation.Interpolator r5 = r5.m344b()
            if (r5 == 0) goto L_0x0024
            r0.f3359e = r4
            goto L_0x0027
        L_0x0024:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0027:
            boolean r2 = r0.f3363i
            if (r2 != 0) goto L_0x0039
            boolean r2 = r0.f3366l
            if (r2 != 0) goto L_0x0035
            boolean r2 = r0.m380e()
            if (r2 == 0) goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            r0.m383b(r1)
        L_0x0039:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            r0.m379f()
            return
    }

    public void setExpanded(boolean r2) {
            r1 = this;
            boolean r0 = p000a.p018g.p029l.C0216r.m3397x(r1)
            r1.m386a(r2, r0)
            return
    }

    public void setLiftOnScroll(boolean r1) {
            r0 = this;
            r0.f3366l = r1
            return
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L_0x0007
            super.setOrientation(r2)
            return
        L_0x0007:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "AppBarLayout is always vertical and does not support horizontal orientation"
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setTargetElevation(float r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0009
            com.google.android.material.appbar.C0925e.m315a(r2, r3)
        L_0x0009:
            return
    }
}
