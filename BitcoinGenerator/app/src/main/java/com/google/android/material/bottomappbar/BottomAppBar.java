package com.google.android.material.bottomappbar;

/* loaded from: classes.dex */
public class BottomAppBar extends androidx.appcompat.widget.Toolbar implements androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0676b {

    /* renamed from: Q */
    private final int f3426Q;

    /* renamed from: R */
    private final p050b.p051a.p052a.p053a.p063r.C0911b f3427R;

    /* renamed from: S */
    private final com.google.android.material.bottomappbar.C0935a f3428S;

    /* renamed from: T */
    private android.animation.Animator f3429T;

    /* renamed from: U */
    private android.animation.Animator f3430U;

    /* renamed from: V */
    private android.animation.Animator f3431V;

    /* renamed from: W */
    private int f3432W;

    /* renamed from: a0 */
    private boolean f3433a0;

    /* renamed from: b0 */
    private boolean f3434b0;

    /* renamed from: c0 */
    android.animation.AnimatorListenerAdapter f3435c0;

    /* loaded from: classes.dex */
    public static class Behavior extends com.google.android.material.behavior.HideBottomViewOnScrollBehavior<com.google.android.material.bottomappbar.BottomAppBar> {

        /* renamed from: d */
        private final android.graphics.Rect f3436d;

        public Behavior() {
                r1 = this;
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f3436d = r0
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f3436d = r1
                return
        }

        /* renamed from: a */
        private boolean m271a(com.google.android.material.floatingactionbutton.FloatingActionButton r3, com.google.android.material.bottomappbar.BottomAppBar r4) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r0
                r1 = 17
                r0.f2597d = r1
                com.google.android.material.bottomappbar.BottomAppBar.m290a(r4, r3)
                r3 = 1
                return r3
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        /* renamed from: a */
        protected /* bridge */ /* synthetic */ void mo275a(com.google.android.material.bottomappbar.BottomAppBar r1) {
                r0 = this;
                com.google.android.material.bottomappbar.BottomAppBar r1 = (com.google.android.material.bottomappbar.BottomAppBar) r1
                r0.m272a(r1)
                return
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        protected void m272a(com.google.android.material.bottomappbar.BottomAppBar r3) {
                r2 = this;
                super.mo275a(r3)
                com.google.android.material.floatingactionbutton.FloatingActionButton r3 = com.google.android.material.bottomappbar.BottomAppBar.m293a(r3)
                if (r3 == 0) goto L_0x0037
                android.graphics.Rect r0 = r2.f3436d
                r3.m225a(r0)
                int r0 = r3.getMeasuredHeight()
                android.graphics.Rect r1 = r2.f3436d
                int r1 = r1.height()
                int r0 = r0 - r1
                float r0 = (float) r0
                r3.clearAnimation()
                android.view.ViewPropertyAnimator r1 = r3.animate()
                int r3 = r3.getPaddingBottom()
                int r3 = -r3
                float r3 = (float) r3
                float r3 = r3 + r0
                android.view.ViewPropertyAnimator r3 = r1.translationY(r3)
                android.animation.TimeInterpolator r0 = p050b.p051a.p052a.p053a.p054j.C0877a.f3282b
                android.view.ViewPropertyAnimator r3 = r3.setInterpolator(r0)
                r0 = 175(0xaf, double:8.65E-322)
                r3.setDuration(r0)
            L_0x0037:
                return
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo46a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3) {
                r0 = this;
                com.google.android.material.bottomappbar.BottomAppBar r2 = (com.google.android.material.bottomappbar.BottomAppBar) r2
                boolean r1 = r0.m274a(r1, r2, r3)
                return r1
        }

        /* renamed from: a */
        public boolean m274a(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.bottomappbar.BottomAppBar r4, int r5) {
                r2 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = com.google.android.material.bottomappbar.BottomAppBar.m293a(r4)
                if (r0 == 0) goto L_0x0017
                r2.m271a(r0, r4)
                android.graphics.Rect r1 = r2.f3436d
                r0.m218b(r1)
                android.graphics.Rect r0 = r2.f3436d
                int r0 = r0.height()
                r4.setFabDiameter(r0)
            L_0x0017:
                boolean r0 = com.google.android.material.bottomappbar.BottomAppBar.m285b(r4)
                if (r0 == 0) goto L_0x0025
                r3.m1697c(r4, r5)
                boolean r3 = super.mo46a(r3, r4, r5)
                return r3
            L_0x0025:
                com.google.android.material.bottomappbar.BottomAppBar.m282c(r4)
                r3 = 0
                throw r3
        }

        /* renamed from: a */
        public boolean m273a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, com.google.android.material.bottomappbar.BottomAppBar r3, android.view.View r4, android.view.View r5, int r6, int r7) {
                r1 = this;
                boolean r0 = r3.getHideOnScroll()
                if (r0 == 0) goto L_0x000e
                boolean r2 = super.mo248b(r2, r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x000e
                r2 = 1
                goto L_0x000f
            L_0x000e:
                r2 = 0
            L_0x000f:
                return r2
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        /* renamed from: b */
        protected /* bridge */ /* synthetic */ void mo270b(com.google.android.material.bottomappbar.BottomAppBar r1) {
                r0 = this;
                com.google.android.material.bottomappbar.BottomAppBar r1 = (com.google.android.material.bottomappbar.BottomAppBar) r1
                r0.m269b(r1)
                return
        }

        /* renamed from: b  reason: avoid collision after fix types in other method */
        protected void m269b(com.google.android.material.bottomappbar.BottomAppBar r3) {
                r2 = this;
                super.mo270b(r3)
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = com.google.android.material.bottomappbar.BottomAppBar.m293a(r3)
                if (r0 == 0) goto L_0x0023
                r0.clearAnimation()
                android.view.ViewPropertyAnimator r0 = r0.animate()
                float r3 = com.google.android.material.bottomappbar.BottomAppBar.m281d(r3)
                android.view.ViewPropertyAnimator r3 = r0.translationY(r3)
                android.animation.TimeInterpolator r0 = p050b.p051a.p052a.p053a.p054j.C0877a.f3283c
                android.view.ViewPropertyAnimator r3 = r3.setInterpolator(r0)
                r0 = 225(0xe1, double:1.11E-321)
                r3.setDuration(r0)
            L_0x0023:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo248b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                com.google.android.material.bottomappbar.BottomAppBar r2 = (com.google.android.material.bottomappbar.BottomAppBar) r2
                boolean r1 = r0.m273a(r1, r2, r3, r4, r5, r6)
                return r1
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes.dex */
    class C0930a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f3437a;

        C0930a(com.google.android.material.bottomappbar.BottomAppBar r1) {
                r0 = this;
                r0.f3437a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.google.android.material.bottomappbar.BottomAppBar r2 = r1.f3437a
                r0 = 0
                com.google.android.material.bottomappbar.BottomAppBar.m292a(r2, r0)
                return
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes.dex */
    class C0931b extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f3438a;

        C0931b(com.google.android.material.bottomappbar.BottomAppBar r1) {
                r0 = this;
                r0.f3438a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.google.android.material.bottomappbar.BottomAppBar r2 = r1.f3438a
                r0 = 0
                com.google.android.material.bottomappbar.BottomAppBar.m284b(r2, r0)
                return
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes.dex */
    class C0932c extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f3439a;

        /* renamed from: b */
        final /* synthetic */ androidx.appcompat.widget.ActionMenuView f3440b;

        /* renamed from: c */
        final /* synthetic */ int f3441c;

        /* renamed from: d */
        final /* synthetic */ boolean f3442d;

        /* renamed from: e */
        final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f3443e;

        C0932c(com.google.android.material.bottomappbar.BottomAppBar r1, androidx.appcompat.widget.ActionMenuView r2, int r3, boolean r4) {
                r0 = this;
                r0.f3443e = r1
                r0.f3440b = r2
                r0.f3441c = r3
                r0.f3442d = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.f3439a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r4) {
                r3 = this;
                boolean r4 = r3.f3439a
                if (r4 != 0) goto L_0x000f
                com.google.android.material.bottomappbar.BottomAppBar r4 = r3.f3443e
                androidx.appcompat.widget.ActionMenuView r0 = r3.f3440b
                int r1 = r3.f3441c
                boolean r2 = r3.f3442d
                com.google.android.material.bottomappbar.BottomAppBar.m291a(r4, r0, r1, r2)
            L_0x000f:
                return
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: classes.dex */
    static class C0933d extends p000a.p033i.p034a.AbstractC0237a {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomappbar.BottomAppBar.C0933d> CREATOR = null;

        /* renamed from: d */
        int f3444d;

        /* renamed from: e */
        boolean f3445e;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d$a */
        /* loaded from: classes.dex */
        static class C0934a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.bottomappbar.BottomAppBar.C0933d> {
            C0934a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomappbar.BottomAppBar.C0933d createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$d r0 = new com.google.android.material.bottomappbar.BottomAppBar$d
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.bottomappbar.BottomAppBar.C0933d createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$d r0 = new com.google.android.material.bottomappbar.BottomAppBar$d
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$d r1 = r0.createFromParcel(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar.C0933d createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$d r1 = r0.createFromParcel(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomappbar.BottomAppBar.C0933d[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$d[] r1 = new com.google.android.material.bottomappbar.BottomAppBar.C0933d[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$d[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                com.google.android.material.bottomappbar.BottomAppBar$d$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$d$a
                r0.<init>()
                com.google.android.material.bottomappbar.BottomAppBar.C0933d.CREATOR = r0
                return
        }

        public C0933d(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r2 = r1.readInt()
                r0.f3444d = r2
                int r1 = r1.readInt()
                if (r1 == 0) goto L_0x0011
                r1 = 1
                goto L_0x0012
            L_0x0011:
                r1 = 0
            L_0x0012:
                r0.f3445e = r1
                return
        }

        public C0933d(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.f3444d
                r1.writeInt(r2)
                boolean r2 = r0.f3445e
                r1.writeInt(r2)
                return
        }
    }

    /* renamed from: a */
    private float m288a(boolean r7) {
            r6 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r6.m279m()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.m225a(r2)
            int r3 = r2.height()
            float r3 = (float) r3
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x001e
            int r1 = r0.getMeasuredHeight()
            float r3 = (float) r1
        L_0x001e:
            int r1 = r0.getHeight()
            int r4 = r2.bottom
            int r1 = r1 - r4
            float r1 = (float) r1
            int r4 = r0.getHeight()
            int r2 = r2.height()
            int r4 = r4 - r2
            float r2 = (float) r4
            float r4 = r6.getCradleVerticalOffset()
            float r4 = -r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r5
            float r4 = r4 + r3
            float r4 = r4 + r1
            int r0 = r0.getPaddingBottom()
            float r0 = (float) r0
            float r0 = r2 - r0
            int r1 = r6.getMeasuredHeight()
            int r1 = -r1
            float r1 = (float) r1
            if (r7 == 0) goto L_0x004a
            r0 = r4
        L_0x004a:
            float r1 = r1 + r0
            return r1
    }

    /* renamed from: a */
    private int m298a(int r4) {
            r3 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r3)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r4 != r2) goto L_0x001b
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 / 2
            int r1 = r3.f3426Q
            int r4 = r4 - r1
            if (r0 == 0) goto L_0x0019
            r2 = -1
        L_0x0019:
            int r1 = r4 * r2
        L_0x001b:
            return r1
    }

    /* renamed from: a */
    static /* synthetic */ android.animation.Animator m292a(com.google.android.material.bottomappbar.BottomAppBar r0, android.animation.Animator r1) {
            r0.f3430U = r1
            return r1
    }

    /* renamed from: a */
    static /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton m293a(com.google.android.material.bottomappbar.BottomAppBar r0) {
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.m279m()
            return r0
    }

    /* renamed from: a */
    private void m297a(int r1, java.util.List<android.animation.Animator> r2) {
            r0 = this;
            boolean r1 = r0.f3434b0
            if (r1 != 0) goto L_0x0005
            return
        L_0x0005:
            com.google.android.material.bottomappbar.a r1 = r0.f3428S
            r1.m260e()
            r1 = 0
            throw r1
    }

    /* renamed from: a */
    private void m296a(int r4, boolean r5) {
            r3 = this;
            boolean r0 = p000a.p018g.p029l.C0216r.m3397x(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.animation.Animator r0 = r3.f3431V
            if (r0 == 0) goto L_0x000e
            r0.cancel()
        L_0x000e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r3.m277o()
            r2 = 0
            if (r1 != 0) goto L_0x001c
            r4 = 0
            r5 = 0
        L_0x001c:
            r3.m295a(r4, r5, r0)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r4.playTogether(r0)
            r3.f3431V = r4
            android.animation.Animator r4 = r3.f3431V
            com.google.android.material.bottomappbar.BottomAppBar$b r5 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r5.<init>(r3)
            r4.addListener(r5)
            android.animation.Animator r4 = r3.f3431V
            r4.start()
            return
    }

    /* renamed from: a */
    private void m295a(int r8, boolean r9, java.util.List<android.animation.Animator> r10) {
            r7 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r7.getActionMenuView()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            r1 = 1
            float[] r2 = new float[r1]
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r2[r4] = r3
            java.lang.String r5 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r0, r5, r2)
            boolean r6 = r7.f3434b0
            if (r6 != 0) goto L_0x0021
            if (r9 == 0) goto L_0x0028
            boolean r6 = r7.m277o()
            if (r6 == 0) goto L_0x0028
        L_0x0021:
            int r6 = r7.f3432W
            if (r6 == r1) goto L_0x0034
            if (r8 != r1) goto L_0x0028
            goto L_0x0034
        L_0x0028:
            float r8 = r0.getAlpha()
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x005c
            r10.add(r2)
            goto L_0x005c
        L_0x0034:
            float[] r3 = new float[r1]
            r6 = 0
            r3[r4] = r6
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r0, r5, r3)
            com.google.android.material.bottomappbar.BottomAppBar$c r5 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r5.<init>(r7, r0, r8, r9)
            r3.addListener(r5)
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            r5 = 150(0x96, double:7.4E-322)
            r8.setDuration(r5)
            r9 = 2
            android.animation.Animator[] r9 = new android.animation.Animator[r9]
            r9[r4] = r3
            r9[r1] = r2
            r8.playSequentially(r9)
            r10.add(r8)
        L_0x005c:
            return
    }

    /* renamed from: a */
    private void m294a(androidx.appcompat.widget.ActionMenuView r9, int r10, boolean r11) {
            r8 = this;
            int r0 = p000a.p018g.p029l.C0216r.m3411j(r8)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            r3 = 0
            r4 = 0
        L_0x000d:
            int r5 = r8.getChildCount()
            if (r3 >= r5) goto L_0x0047
            android.view.View r5 = r8.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            boolean r6 = r6 instanceof androidx.appcompat.widget.Toolbar.C0559e
            if (r6 == 0) goto L_0x0032
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r6 = (androidx.appcompat.widget.Toolbar.C0559e) r6
            int r6 = r6.f1393a
            r7 = 8388615(0x800007, float:1.1754953E-38)
            r6 = r6 & r7
            r7 = 8388611(0x800003, float:1.1754948E-38)
            if (r6 != r7) goto L_0x0032
            r6 = 1
            goto L_0x0033
        L_0x0032:
            r6 = 0
        L_0x0033:
            if (r6 == 0) goto L_0x0044
            if (r0 == 0) goto L_0x003c
            int r5 = r5.getLeft()
            goto L_0x0040
        L_0x003c:
            int r5 = r5.getRight()
        L_0x0040:
            int r4 = java.lang.Math.max(r4, r5)
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0047:
            if (r0 == 0) goto L_0x004e
            int r0 = r9.getRight()
            goto L_0x0052
        L_0x004e:
            int r0 = r9.getLeft()
        L_0x0052:
            int r4 = r4 - r0
            if (r10 != r2) goto L_0x0059
            if (r11 == 0) goto L_0x0059
            float r10 = (float) r4
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            r9.setTranslationX(r10)
            return
    }

    /* renamed from: a */
    static /* synthetic */ void m291a(com.google.android.material.bottomappbar.BottomAppBar r0, androidx.appcompat.widget.ActionMenuView r1, int r2, boolean r3) {
            r0.m294a(r1, r2, r3)
            return
    }

    /* renamed from: a */
    static /* synthetic */ void m290a(com.google.android.material.bottomappbar.BottomAppBar r0, com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
            r0.m289a(r1)
            return
    }

    /* renamed from: a */
    private void m289a(com.google.android.material.floatingactionbutton.FloatingActionButton r2) {
            r1 = this;
            r1.m283b(r2)
            android.animation.AnimatorListenerAdapter r0 = r1.f3435c0
            r2.m226a(r0)
            android.animation.AnimatorListenerAdapter r0 = r1.f3435c0
            r2.m219b(r0)
            return
    }

    /* renamed from: b */
    static /* synthetic */ android.animation.Animator m284b(com.google.android.material.bottomappbar.BottomAppBar r0, android.animation.Animator r1) {
            r0.f3431V = r1
            return r1
    }

    /* renamed from: b */
    private void m287b(int r2) {
            r1 = this;
            int r0 = r1.f3432W
            if (r0 == r2) goto L_0x0036
            boolean r0 = p000a.p018g.p029l.C0216r.m3397x(r1)
            if (r0 != 0) goto L_0x000b
            goto L_0x0036
        L_0x000b:
            android.animation.Animator r0 = r1.f3430U
            if (r0 == 0) goto L_0x0012
            r0.cancel()
        L_0x0012:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m297a(r2, r0)
            r1.m286b(r2, r0)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r2.playTogether(r0)
            r1.f3430U = r2
            android.animation.Animator r2 = r1.f3430U
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>(r1)
            r2.addListener(r0)
            android.animation.Animator r2 = r1.f3430U
            r2.start()
        L_0x0036:
            return
    }

    /* renamed from: b */
    private void m286b(int r4, java.util.List<android.animation.Animator> r5) {
            r3 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r3.m279m()
            r1 = 1
            float[] r1 = new float[r1]
            int r4 = r3.m298a(r4)
            float r4 = (float) r4
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "translationX"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r0, r4, r1)
            r0 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r0)
            r5.add(r4)
            return
    }

    /* renamed from: b */
    private void m283b(com.google.android.material.floatingactionbutton.FloatingActionButton r2) {
            r1 = this;
            android.animation.AnimatorListenerAdapter r0 = r1.f3435c0
            r2.m215c(r0)
            android.animation.AnimatorListenerAdapter r0 = r1.f3435c0
            r2.m212d(r0)
            return
    }

    /* renamed from: b */
    static /* synthetic */ boolean m285b(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.m278n()
            return r0
    }

    /* renamed from: c */
    static /* synthetic */ void m282c(com.google.android.material.bottomappbar.BottomAppBar r0) {
            r0.m276p()
            r0 = 0
            throw r0
    }

    /* renamed from: d */
    static /* synthetic */ float m281d(com.google.android.material.bottomappbar.BottomAppBar r0) {
            float r0 = r0.getFabTranslationY()
            return r0
    }

    private androidx.appcompat.widget.ActionMenuView getActionMenuView() {
            r3 = this;
            r0 = 0
        L_0x0001:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L_0x0015
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.appcompat.widget.ActionMenuView
            if (r2 == 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            return r1
        L_0x0012:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0015:
            r0 = 0
            return r0
    }

    private float getFabTranslationX() {
            r1 = this;
            int r0 = r1.f3432W
            int r0 = r1.m298a(r0)
            float r0 = (float) r0
            return r0
    }

    private float getFabTranslationY() {
            r1 = this;
            boolean r0 = r1.f3434b0
            float r0 = r1.m288a(r0)
            return r0
    }

    /* renamed from: l */
    private void m280l() {
            r1 = this;
            android.animation.Animator r0 = r1.f3429T
            if (r0 == 0) goto L_0x0007
            r0.cancel()
        L_0x0007:
            android.animation.Animator r0 = r1.f3431V
            if (r0 == 0) goto L_0x000e
            r0.cancel()
        L_0x000e:
            android.animation.Animator r0 = r1.f3430U
            if (r0 == 0) goto L_0x0015
            r0.cancel()
        L_0x0015:
            return
    }

    /* renamed from: m */
    private com.google.android.material.floatingactionbutton.FloatingActionButton m279m() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.m1698c(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 == 0) goto L_0x0018
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            return r2
        L_0x002b:
            return r1
    }

    /* renamed from: n */
    private boolean m278n() {
            r1 = this;
            android.animation.Animator r0 = r1.f3429T
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001e
        L_0x000a:
            android.animation.Animator r0 = r1.f3431V
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001e
        L_0x0014:
            android.animation.Animator r0 = r1.f3430U
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
    }

    /* renamed from: o */
    private boolean m277o() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.m279m()
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.m220b()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
    }

    /* renamed from: p */
    private void m276p() {
            r2 = this;
            com.google.android.material.bottomappbar.a r0 = r2.f3428S
            float r1 = r2.getFabTranslationX()
            r0.m261d(r1)
            r0 = 0
            throw r0
    }

    public android.content.res.ColorStateList getBackgroundTint() {
            r1 = this;
            b.a.a.a.r.b r0 = r1.f3427R
            r0.m390a()
            r0 = 0
            throw r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0676b
    public androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c<com.google.android.material.bottomappbar.BottomAppBar> getBehavior() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior
            r0.<init>()
            return r0
    }

    public float getCradleVerticalOffset() {
            r1 = this;
            com.google.android.material.bottomappbar.a r0 = r1.f3428S
            r0.m268a()
            r0 = 0
            throw r0
    }

    public int getFabAlignmentMode() {
            r1 = this;
            int r0 = r1.f3432W
            return r0
    }

    public float getFabCradleMargin() {
            r1 = this;
            com.google.android.material.bottomappbar.a r0 = r1.f3428S
            r0.m266b()
            r0 = 0
            throw r0
    }

    public float getFabCradleRoundedCornerRadius() {
            r1 = this;
            com.google.android.material.bottomappbar.a r0 = r1.f3428S
            r0.m264c()
            r0 = 0
            throw r0
    }

    public boolean getHideOnScroll() {
            r1 = this;
            boolean r0 = r1.f3433a0
            return r0
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.m280l()
            r0.m276p()
            r1 = 0
            throw r1
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.bottomappbar.BottomAppBar.C0933d
            if (r0 != 0) goto L_0x0008
            super.onRestoreInstanceState(r2)
            return
        L_0x0008:
            com.google.android.material.bottomappbar.BottomAppBar$d r2 = (com.google.android.material.bottomappbar.BottomAppBar.C0933d) r2
            android.os.Parcelable r0 = r2.m3347a()
            super.onRestoreInstanceState(r0)
            int r0 = r2.f3444d
            r1.f3432W = r0
            boolean r2 = r2.f3445e
            r1.f3434b0 = r2
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.bottomappbar.BottomAppBar$d r1 = new com.google.android.material.bottomappbar.BottomAppBar$d
            r1.<init>(r0)
            int r0 = r2.f3432W
            r1.f3444d = r0
            boolean r0 = r2.f3434b0
            r1.f3445e = r0
            return r1
    }

    public void setBackgroundTint(android.content.res.ColorStateList r2) {
            r1 = this;
            b.a.a.a.r.b r0 = r1.f3427R
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r2)
            return
    }

    public void setCradleVerticalOffset(float r2) {
            r1 = this;
            float r0 = r1.getCradleVerticalOffset()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.material.bottomappbar.a r0 = r1.f3428S
            r0.m267a(r2)
            r2 = 0
            throw r2
    }

    public void setFabAlignmentMode(int r2) {
            r1 = this;
            r1.m287b(r2)
            boolean r0 = r1.f3434b0
            r1.m296a(r2, r0)
            r1.f3432W = r2
            return
    }

    public void setFabCradleMargin(float r2) {
            r1 = this;
            float r0 = r1.getFabCradleMargin()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.material.bottomappbar.a r0 = r1.f3428S
            r0.m265b(r2)
            r2 = 0
            throw r2
    }

    public void setFabCradleRoundedCornerRadius(float r2) {
            r1 = this;
            float r0 = r1.getFabCradleRoundedCornerRadius()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.material.bottomappbar.a r0 = r1.f3428S
            r0.m263c(r2)
            r2 = 0
            throw r2
    }

    void setFabDiameter(int r1) {
            r0 = this;
            com.google.android.material.bottomappbar.a r1 = r0.f3428S
            r1.m262d()
            r1 = 0
            throw r1
    }

    public void setHideOnScroll(boolean r1) {
            r0 = this;
            r0.f3433a0 = r1
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }
}
