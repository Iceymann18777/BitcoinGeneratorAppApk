package p000a.p046o.p047a.p048a;

/* renamed from: a.o.a.a.c */
/* loaded from: classes.dex */
public class C0394c extends p000a.p046o.p047a.p048a.AbstractC0403h implements p000a.p046o.p047a.p048a.AbstractC0393b {

    /* renamed from: c */
    private p000a.p046o.p047a.p048a.C0394c.C0396b f1193c;

    /* renamed from: d */
    private android.content.Context f1194d;

    /* renamed from: e */
    private android.animation.ArgbEvaluator f1195e;

    /* renamed from: f */
    final android.graphics.drawable.Drawable.Callback f1196f;

    /* renamed from: a.o.a.a.c$a */
    /* loaded from: classes.dex */
    class C0395a implements android.graphics.drawable.Drawable.Callback {

        /* renamed from: b */
        final /* synthetic */ p000a.p046o.p047a.p048a.C0394c f1197b;

        C0395a(p000a.p046o.p047a.p048a.C0394c r1) {
                r0 = this;
                r0.f1197b = r1
                r0.<init>()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                a.o.a.a.c r1 = r0.f1197b
                r1.invalidateSelf()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
                r0 = this;
                a.o.a.a.c r1 = r0.f1197b
                r1.scheduleSelf(r2, r3)
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
                r0 = this;
                a.o.a.a.c r1 = r0.f1197b
                r1.unscheduleSelf(r2)
                return
        }
    }

    /* renamed from: a.o.a.a.c$b */
    /* loaded from: classes.dex */
    private static class C0396b extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: a */
        int f1198a;

        /* renamed from: b */
        p000a.p046o.p047a.p048a.C0404i f1199b;

        /* renamed from: c */
        android.animation.AnimatorSet f1200c;

        /* renamed from: d */
        java.util.ArrayList<android.animation.Animator> f1201d;

        /* renamed from: e */
        p000a.p013d.C0067a<android.animation.Animator, java.lang.String> f1202e;

        public C0396b(android.content.Context r3, p000a.p046o.p047a.p048a.C0394c.C0396b r4, android.graphics.drawable.Drawable.Callback r5, android.content.res.Resources r6) {
                r2 = this;
                r2.<init>()
                if (r4 == 0) goto L_0x0084
                int r3 = r4.f1198a
                r2.f1198a = r3
                a.o.a.a.i r3 = r4.f1199b
                r0 = 0
                if (r3 == 0) goto L_0x003f
                android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
                if (r6 == 0) goto L_0x0019
                android.graphics.drawable.Drawable r3 = r3.newDrawable(r6)
                goto L_0x001d
            L_0x0019:
                android.graphics.drawable.Drawable r3 = r3.newDrawable()
            L_0x001d:
                a.o.a.a.i r3 = (p000a.p046o.p047a.p048a.C0404i) r3
                r2.f1199b = r3
                a.o.a.a.i r3 = r2.f1199b
                r3.mutate()
                a.o.a.a.i r3 = (p000a.p046o.p047a.p048a.C0404i) r3
                r2.f1199b = r3
                a.o.a.a.i r3 = r2.f1199b
                r3.setCallback(r5)
                a.o.a.a.i r3 = r2.f1199b
                a.o.a.a.i r5 = r4.f1199b
                android.graphics.Rect r5 = r5.getBounds()
                r3.setBounds(r5)
                a.o.a.a.i r3 = r2.f1199b
                r3.m2721a(r0)
            L_0x003f:
                java.util.ArrayList<android.animation.Animator> r3 = r4.f1201d
                if (r3 == 0) goto L_0x0084
                int r3 = r3.size()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                r2.f1201d = r5
                a.d.a r5 = new a.d.a
                r5.<init>(r3)
                r2.f1202e = r5
            L_0x0055:
                if (r0 >= r3) goto L_0x0081
                java.util.ArrayList<android.animation.Animator> r5 = r4.f1201d
                java.lang.Object r5 = r5.get(r0)
                android.animation.Animator r5 = (android.animation.Animator) r5
                android.animation.Animator r6 = r5.clone()
                a.d.a<android.animation.Animator, java.lang.String> r1 = r4.f1202e
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                a.o.a.a.i r1 = r2.f1199b
                java.lang.Object r1 = r1.m2722a(r5)
                r6.setTarget(r1)
                java.util.ArrayList<android.animation.Animator> r1 = r2.f1201d
                r1.add(r6)
                a.d.a<android.animation.Animator, java.lang.String> r1 = r2.f1202e
                r1.put(r6, r5)
                int r0 = r0 + 1
                goto L_0x0055
            L_0x0081:
                r2.m2757a()
            L_0x0084:
                return
        }

        /* renamed from: a */
        public void m2757a() {
                r2 = this;
                android.animation.AnimatorSet r0 = r2.f1200c
                if (r0 != 0) goto L_0x000b
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                r2.f1200c = r0
            L_0x000b:
                android.animation.AnimatorSet r0 = r2.f1200c
                java.util.ArrayList<android.animation.Animator> r1 = r2.f1201d
                r0.playTogether(r1)
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.f1198a
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "No constant state support for SDK < 24."
                r0.<init>(r1)
                throw r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "No constant state support for SDK < 24."
                r2.<init>(r0)
                throw r2
        }
    }

    /* renamed from: a.o.a.a.c$c */
    /* loaded from: classes.dex */
    private static class C0397c extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: a */
        private final android.graphics.drawable.Drawable.ConstantState f1203a;

        public C0397c(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.f1203a = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f1203a
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f1203a
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r3 = this;
                a.o.a.a.c r0 = new a.o.a.a.c
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r3.f1203a
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                r0.f1208b = r1
                android.graphics.drawable.Drawable r1 = r0.f1208b
                android.graphics.drawable.Drawable$Callback r2 = r0.f1196f
                r1.setCallback(r2)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                a.o.a.a.c r0 = new a.o.a.a.c
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f1203a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
                r0.f1208b = r3
                android.graphics.drawable.Drawable r3 = r0.f1208b
                android.graphics.drawable.Drawable$Callback r1 = r0.f1196f
                r3.setCallback(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                a.o.a.a.c r0 = new a.o.a.a.c
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f1203a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3, r4)
                r0.f1208b = r3
                android.graphics.drawable.Drawable r3 = r0.f1208b
                android.graphics.drawable.Drawable$Callback r4 = r0.f1196f
                r3.setCallback(r4)
                return r0
        }
    }

    C0394c() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r0)
            return
    }

    private C0394c(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    private C0394c(android.content.Context r3, p000a.p046o.p047a.p048a.C0394c.C0396b r4, android.content.res.Resources r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1195e = r0
            a.o.a.a.c$a r0 = new a.o.a.a.c$a
            r0.<init>(r2)
            r2.f1196f = r0
            r2.f1194d = r3
            if (r4 == 0) goto L_0x0014
            r2.f1193c = r4
            goto L_0x001d
        L_0x0014:
            a.o.a.a.c$b r0 = new a.o.a.a.c$b
            android.graphics.drawable.Drawable$Callback r1 = r2.f1196f
            r0.<init>(r3, r4, r1, r5)
            r2.f1193c = r0
        L_0x001d:
            return
    }

    /* renamed from: a */
    public static p000a.p046o.p047a.p048a.C0394c m2759a(android.content.Context r1, android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4, android.content.res.Resources.Theme r5) {
            a.o.a.a.c r0 = new a.o.a.a.c
            r0.<init>(r1)
            r0.inflate(r2, r3, r4, r5)
            return r0
    }

    /* renamed from: a */
    private void m2760a(android.animation.Animator r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.animation.AnimatorSet
            if (r0 == 0) goto L_0x0020
            r0 = r4
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            java.util.ArrayList r0 = r0.getChildAnimations()
            if (r0 == 0) goto L_0x0020
            r1 = 0
        L_0x000e:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x0020
            java.lang.Object r2 = r0.get(r1)
            android.animation.Animator r2 = (android.animation.Animator) r2
            r3.m2760a(r2)
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0020:
            boolean r0 = r4 instanceof android.animation.ObjectAnimator
            if (r0 == 0) goto L_0x004a
            android.animation.ObjectAnimator r4 = (android.animation.ObjectAnimator) r4
            java.lang.String r0 = r4.getPropertyName()
            java.lang.String r1 = "fillColor"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = "strokeColor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
        L_0x003a:
            android.animation.ArgbEvaluator r0 = r3.f1195e
            if (r0 != 0) goto L_0x0045
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            r3.f1195e = r0
        L_0x0045:
            android.animation.ArgbEvaluator r0 = r3.f1195e
            r4.setEvaluator(r0)
        L_0x004a:
            return
    }

    /* renamed from: a */
    private void m2758a(java.lang.String r3, android.animation.Animator r4) {
            r2 = this;
            a.o.a.a.c$b r0 = r2.f1193c
            a.o.a.a.i r0 = r0.f1199b
            java.lang.Object r0 = r0.m2722a(r3)
            r4.setTarget(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x0014
            r2.m2760a(r4)
        L_0x0014:
            a.o.a.a.c$b r0 = r2.f1193c
            java.util.ArrayList<android.animation.Animator> r1 = r0.f1201d
            if (r1 != 0) goto L_0x002a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f1201d = r1
            a.o.a.a.c$b r0 = r2.f1193c
            a.d.a r1 = new a.d.a
            r1.<init>()
            r0.f1202e = r1
        L_0x002a:
            a.o.a.a.c$b r0 = r2.f1193c
            java.util.ArrayList<android.animation.Animator> r0 = r0.f1201d
            r0.add(r4)
            a.o.a.a.c$b r0 = r2.f1193c
            a.d.a<android.animation.Animator, java.lang.String> r0 = r0.f1202e
            r0.put(r4, r3)
            return
    }

    @Override // p000a.p046o.p047a.p048a.AbstractC0403h, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0007
            androidx.core.graphics.drawable.C0698a.m1602a(r0, r2)
        L_0x0007:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            boolean r0 = androidx.core.graphics.drawable.C0698a.m1607a(r0)
            return r0
        L_0x0009:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.draw(r2)
            return
        L_0x0008:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            r0.draw(r2)
            a.o.a.a.c$b r2 = r1.f1193c
            android.animation.AnimatorSet r2 = r2.f1200c
            boolean r2 = r2.isStarted()
            if (r2 == 0) goto L_0x001c
            r1.invalidateSelf()
        L_0x001c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            int r0 = androidx.core.graphics.drawable.C0698a.m1596c(r0)
            return r0
        L_0x0009:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1208b
            if (r0 == 0) goto L_0x0009
            int r0 = r0.getChangingConfigurations()
            return r0
        L_0x0009:
            int r0 = super.getChangingConfigurations()
            a.o.a.a.c$b r1 = r2.f1193c
            int r1 = r1.f1198a
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f1208b
            if (r0 == 0) goto L_0x0014
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L_0x0014
            a.o.a.a.c$c r1 = new a.o.a.a.c$c
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            r1.<init>(r0)
            return r1
        L_0x0014:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            int r0 = r0.getIntrinsicHeight()
            return r0
        L_0x0009:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            int r0 = r0.getIntrinsicWidth()
            return r0
        L_0x0009:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            int r0 = r0.getOpacity()
            return r0
        L_0x0009:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r7, org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, android.content.res.Resources.Theme r10) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f1208b
            if (r0 == 0) goto L_0x0008
            androidx.core.graphics.drawable.C0698a.m1601a(r0, r7, r8, r9, r10)
            return
        L_0x0008:
            int r0 = r8.getEventType()
            int r1 = r8.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L_0x0012:
            if (r0 == r2) goto L_0x008b
            int r3 = r8.getDepth()
            if (r3 >= r1) goto L_0x001d
            r3 = 3
            if (r0 == r3) goto L_0x008b
        L_0x001d:
            r3 = 2
            if (r0 != r3) goto L_0x0086
            java.lang.String r0 = r8.getName()
            java.lang.String r3 = "animated-vector"
            boolean r3 = r3.equals(r0)
            r4 = 0
            if (r3 == 0) goto L_0x0057
            int[] r0 = p000a.p046o.p047a.p048a.C0392a.f1185e
            android.content.res.TypedArray r0 = p000a.p018g.p019d.p020c.C0140g.m3681a(r7, r10, r9, r0)
            int r3 = r0.getResourceId(r4, r4)
            if (r3 == 0) goto L_0x0053
            a.o.a.a.i r3 = p000a.p046o.p047a.p048a.C0404i.m2726a(r7, r3, r10)
            r3.m2721a(r4)
            android.graphics.drawable.Drawable$Callback r4 = r6.f1196f
            r3.setCallback(r4)
            a.o.a.a.c$b r4 = r6.f1193c
            a.o.a.a.i r4 = r4.f1199b
            if (r4 == 0) goto L_0x004f
            r5 = 0
            r4.setCallback(r5)
        L_0x004f:
            a.o.a.a.c$b r4 = r6.f1193c
            r4.f1199b = r3
        L_0x0053:
            r0.recycle()
            goto L_0x0086
        L_0x0057:
            java.lang.String r3 = "target"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0086
            int[] r0 = p000a.p046o.p047a.p048a.C0392a.f1186f
            android.content.res.TypedArray r0 = r7.obtainAttributes(r9, r0)
            java.lang.String r3 = r0.getString(r4)
            int r4 = r0.getResourceId(r2, r4)
            if (r4 == 0) goto L_0x0053
            android.content.Context r5 = r6.f1194d
            if (r5 == 0) goto L_0x007b
            android.animation.Animator r4 = p000a.p046o.p047a.p048a.C0399e.m2750a(r5, r4)
            r6.m2758a(r3, r4)
            goto L_0x0053
        L_0x007b:
            r0.recycle()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Context can't be null when inflating animators"
            r7.<init>(r8)
            throw r7
        L_0x0086:
            int r0 = r8.next()
            goto L_0x0012
        L_0x008b:
            a.o.a.a.c$b r7 = r6.f1193c
            r7.m2757a()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            boolean r0 = androidx.core.graphics.drawable.C0698a.m1593f(r0)
            return r0
        L_0x0009:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x000b
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            boolean r0 = r0.isRunning()
            return r0
        L_0x000b:
            a.o.a.a.c$b r0 = r1.f1193c
            android.animation.AnimatorSet r0 = r0.f1200c
            boolean r0 = r0.isRunning()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0007
            r0.mutate()
        L_0x0007:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.setBounds(r2)
            return
        L_0x0008:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            r0.setBounds(r2)
            return
    }

    @Override // p000a.p046o.p047a.p048a.AbstractC0403h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            boolean r2 = r0.setLevel(r2)
            return r2
        L_0x0009:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            boolean r2 = r0.setLevel(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            boolean r2 = r0.setState(r2)
            return r2
        L_0x0009:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            boolean r2 = r0.setState(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.setAlpha(r2)
            return
        L_0x0008:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            androidx.core.graphics.drawable.C0698a.m1599a(r0, r2)
            return
        L_0x0008:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            r0.setAutoMirrored(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.setColorFilter(r2)
            return
        L_0x0008:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            androidx.core.graphics.drawable.C0698a.m1597b(r0, r2)
            return
        L_0x0008:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            r0.setTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r2)
            return
        L_0x0008:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            r0.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            androidx.core.graphics.drawable.C0698a.m1600a(r0, r2)
            return
        L_0x0008:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            r0.setTintMode(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0009
            boolean r2 = r0.setVisible(r2, r3)
            return r2
        L_0x0009:
            a.o.a.a.c$b r0 = r1.f1193c
            a.o.a.a.i r0 = r0.f1199b
            r0.setVisible(r2, r3)
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x000a
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.start()
            return
        L_0x000a:
            a.o.a.a.c$b r0 = r1.f1193c
            android.animation.AnimatorSet r0 = r0.f1200c
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L_0x0015
            return
        L_0x0015:
            a.o.a.a.c$b r0 = r1.f1193c
            android.animation.AnimatorSet r0 = r0.f1200c
            r0.start()
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x000a
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.stop()
            return
        L_0x000a:
            a.o.a.a.c$b r0 = r1.f1193c
            android.animation.AnimatorSet r0 = r0.f1200c
            r0.end()
            return
    }
}
