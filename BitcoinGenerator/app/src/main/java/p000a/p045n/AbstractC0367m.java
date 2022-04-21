package p000a.p045n;

/* renamed from: a.n.m */
/* loaded from: classes.dex */
public abstract class AbstractC0367m implements java.lang.Cloneable {

    /* renamed from: H */
    private static final int[] f1106H = null;

    /* renamed from: I */
    private static final p000a.p045n.AbstractC0352g f1107I = null;

    /* renamed from: J */
    private static java.lang.ThreadLocal<p000a.p013d.C0067a<android.animation.Animator, p000a.p045n.AbstractC0367m.C0371d>> f1108J;

    /* renamed from: A */
    private boolean f1109A;

    /* renamed from: B */
    private java.util.ArrayList<p000a.p045n.AbstractC0367m.AbstractC0373f> f1110B;

    /* renamed from: C */
    private java.util.ArrayList<android.animation.Animator> f1111C;

    /* renamed from: D */
    p000a.p045n.AbstractC0378p f1112D;

    /* renamed from: E */
    private p000a.p045n.AbstractC0367m.AbstractC0372e f1113E;

    /* renamed from: F */
    private p000a.p013d.C0067a<java.lang.String, java.lang.String> f1114F;

    /* renamed from: G */
    private p000a.p045n.AbstractC0352g f1115G;

    /* renamed from: b */
    private java.lang.String f1116b;

    /* renamed from: c */
    private long f1117c;

    /* renamed from: d */
    long f1118d;

    /* renamed from: e */
    private android.animation.TimeInterpolator f1119e;

    /* renamed from: f */
    java.util.ArrayList<java.lang.Integer> f1120f;

    /* renamed from: g */
    java.util.ArrayList<android.view.View> f1121g;

    /* renamed from: h */
    private java.util.ArrayList<java.lang.String> f1122h;

    /* renamed from: i */
    private java.util.ArrayList<java.lang.Class> f1123i;

    /* renamed from: j */
    private java.util.ArrayList<java.lang.Integer> f1124j;

    /* renamed from: k */
    private java.util.ArrayList<android.view.View> f1125k;

    /* renamed from: l */
    private java.util.ArrayList<java.lang.Class> f1126l;

    /* renamed from: m */
    private java.util.ArrayList<java.lang.String> f1127m;

    /* renamed from: n */
    private java.util.ArrayList<java.lang.Integer> f1128n;

    /* renamed from: o */
    private java.util.ArrayList<android.view.View> f1129o;

    /* renamed from: p */
    private java.util.ArrayList<java.lang.Class> f1130p;

    /* renamed from: q */
    private p000a.p045n.C0384t f1131q;

    /* renamed from: r */
    private p000a.p045n.C0384t f1132r;

    /* renamed from: s */
    p000a.p045n.C0379q f1133s;

    /* renamed from: t */
    private int[] f1134t;

    /* renamed from: u */
    private java.util.ArrayList<p000a.p045n.C0383s> f1135u;

    /* renamed from: v */
    private java.util.ArrayList<p000a.p045n.C0383s> f1136v;

    /* renamed from: w */
    boolean f1137w;

    /* renamed from: x */
    java.util.ArrayList<android.animation.Animator> f1138x;

    /* renamed from: y */
    private int f1139y;

    /* renamed from: z */
    private boolean f1140z;

    /* renamed from: a.n.m$a */
    /* loaded from: classes.dex */
    static class C0368a extends p000a.p045n.AbstractC0352g {
        C0368a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p000a.p045n.AbstractC0352g
        /* renamed from: a */
        public android.graphics.Path mo2810a(float r2, float r3, float r4, float r5) {
                r1 = this;
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r0.moveTo(r2, r3)
                r0.lineTo(r4, r5)
                return r0
        }
    }

    /* renamed from: a.n.m$b */
    /* loaded from: classes.dex */
    class C0369b extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ p000a.p013d.C0067a f1141a;

        /* renamed from: b */
        final /* synthetic */ p000a.p045n.AbstractC0367m f1142b;

        C0369b(p000a.p045n.AbstractC0367m r1, p000a.p013d.C0067a r2) {
                r0 = this;
                r0.f1142b = r1
                r0.f1141a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                a.d.a r0 = r1.f1141a
                r0.remove(r2)
                a.n.m r0 = r1.f1142b
                java.util.ArrayList<android.animation.Animator> r0 = r0.f1138x
                r0.remove(r2)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                a.n.m r0 = r1.f1142b
                java.util.ArrayList<android.animation.Animator> r0 = r0.f1138x
                r0.add(r2)
                return
        }
    }

    /* renamed from: a.n.m$c */
    /* loaded from: classes.dex */
    class C0370c extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ p000a.p045n.AbstractC0367m f1143a;

        C0370c(p000a.p045n.AbstractC0367m r1) {
                r0 = this;
                r0.f1143a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                a.n.m r0 = r1.f1143a
                r0.m2844a()
                r2.removeListener(r1)
                return
        }
    }

    /* renamed from: a.n.m$d */
    /* loaded from: classes.dex */
    private static class C0371d {

        /* renamed from: a */
        android.view.View f1144a;

        /* renamed from: b */
        java.lang.String f1145b;

        /* renamed from: c */
        p000a.p045n.C0383s f1146c;

        /* renamed from: d */
        p000a.p045n.AbstractC0366l0 f1147d;

        /* renamed from: e */
        p000a.p045n.AbstractC0367m f1148e;

        C0371d(android.view.View r1, java.lang.String r2, p000a.p045n.AbstractC0367m r3, p000a.p045n.AbstractC0366l0 r4, p000a.p045n.C0383s r5) {
                r0 = this;
                r0.<init>()
                r0.f1144a = r1
                r0.f1145b = r2
                r0.f1146c = r5
                r0.f1147d = r4
                r0.f1148e = r3
                return
        }
    }

    /* renamed from: a.n.m$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0372e {
        public AbstractC0372e() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: a.n.m$f */
    /* loaded from: classes.dex */
    public interface AbstractC0373f {
        /* renamed from: a */
        void mo2776a(p000a.p045n.AbstractC0367m r1);

        /* renamed from: b */
        void mo2775b(p000a.p045n.AbstractC0367m r1);

        /* renamed from: c */
        void mo2809c(p000a.p045n.AbstractC0367m r1);

        /* renamed from: d */
        void mo2808d(p000a.p045n.AbstractC0367m r1);
    }

    static {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA  , data: [2, 1, 3, 4} // fill-array
            p000a.p045n.AbstractC0367m.f1106H = r0
            a.n.m$a r0 = new a.n.m$a
            r0.<init>()
            p000a.p045n.AbstractC0367m.f1107I = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000a.p045n.AbstractC0367m.f1108J = r0
            return
    }

    public AbstractC0367m() {
            r3 = this;
            r3.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r3.f1116b = r0
            r0 = -1
            r3.f1117c = r0
            r3.f1118d = r0
            r0 = 0
            r3.f1119e = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f1120f = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f1121g = r1
            r3.f1122h = r0
            r3.f1123i = r0
            r3.f1124j = r0
            r3.f1125k = r0
            r3.f1126l = r0
            r3.f1127m = r0
            r3.f1128n = r0
            r3.f1129o = r0
            r3.f1130p = r0
            a.n.t r1 = new a.n.t
            r1.<init>()
            r3.f1131q = r1
            a.n.t r1 = new a.n.t
            r1.<init>()
            r3.f1132r = r1
            r3.f1133s = r0
            int[] r1 = p000a.p045n.AbstractC0367m.f1106H
            r3.f1134t = r1
            r1 = 0
            r3.f1137w = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.f1138x = r2
            r3.f1139y = r1
            r3.f1140z = r1
            r3.f1109A = r1
            r3.f1110B = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f1111C = r0
            a.n.g r0 = p000a.p045n.AbstractC0367m.f1107I
            r3.f1115G = r0
            return
    }

    /* renamed from: a */
    private void m2843a(p000a.p013d.C0067a<android.view.View, p000a.p045n.C0383s> r6, p000a.p013d.C0067a<android.view.View, p000a.p045n.C0383s> r7) {
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r6.size()
            r3 = 0
            if (r1 >= r2) goto L_0x0024
            java.lang.Object r2 = r6.m4013d(r1)
            a.n.s r2 = (p000a.p045n.C0383s) r2
            android.view.View r4 = r2.f1167b
            boolean r4 = r5.m2826b(r4)
            if (r4 == 0) goto L_0x0021
            java.util.ArrayList<a.n.s> r4 = r5.f1135u
            r4.add(r2)
            java.util.ArrayList<a.n.s> r2 = r5.f1136v
            r2.add(r3)
        L_0x0021:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0024:
            int r6 = r7.size()
            if (r0 >= r6) goto L_0x0045
            java.lang.Object r6 = r7.m4013d(r0)
            a.n.s r6 = (p000a.p045n.C0383s) r6
            android.view.View r1 = r6.f1167b
            boolean r1 = r5.m2826b(r1)
            if (r1 == 0) goto L_0x0042
            java.util.ArrayList<a.n.s> r1 = r5.f1136v
            r1.add(r6)
            java.util.ArrayList<a.n.s> r6 = r5.f1135u
            r6.add(r3)
        L_0x0042:
            int r0 = r0 + 1
            goto L_0x0024
        L_0x0045:
            return
    }

    /* renamed from: a */
    private void m2842a(p000a.p013d.C0067a<android.view.View, p000a.p045n.C0383s> r8, p000a.p013d.C0067a<android.view.View, p000a.p045n.C0383s> r9, p000a.p013d.C0067a<java.lang.String, android.view.View> r10, p000a.p013d.C0067a<java.lang.String, android.view.View> r11) {
            r7 = this;
            int r0 = r10.size()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x004a
            java.lang.Object r2 = r10.m4013d(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0047
            boolean r3 = r7.m2826b(r2)
            if (r3 == 0) goto L_0x0047
            java.lang.Object r3 = r10.m4016b(r1)
            java.lang.Object r3 = r11.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0047
            boolean r4 = r7.m2826b(r3)
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r8.get(r2)
            a.n.s r4 = (p000a.p045n.C0383s) r4
            java.lang.Object r5 = r9.get(r3)
            a.n.s r5 = (p000a.p045n.C0383s) r5
            if (r4 == 0) goto L_0x0047
            if (r5 == 0) goto L_0x0047
            java.util.ArrayList<a.n.s> r6 = r7.f1135u
            r6.add(r4)
            java.util.ArrayList<a.n.s> r4 = r7.f1136v
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x004a:
            return
    }

    /* renamed from: a */
    private void m2841a(p000a.p013d.C0067a<android.view.View, p000a.p045n.C0383s> r8, p000a.p013d.C0067a<android.view.View, p000a.p045n.C0383s> r9, p000a.p013d.C0072d<android.view.View> r10, p000a.p013d.C0072d<android.view.View> r11) {
            r7 = this;
            int r0 = r10.m4058b()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x004a
            java.lang.Object r2 = r10.m4053c(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0047
            boolean r3 = r7.m2826b(r2)
            if (r3 == 0) goto L_0x0047
            long r3 = r10.m4061a(r1)
            java.lang.Object r3 = r11.m4056b(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0047
            boolean r4 = r7.m2826b(r3)
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r8.get(r2)
            a.n.s r4 = (p000a.p045n.C0383s) r4
            java.lang.Object r5 = r9.get(r3)
            a.n.s r5 = (p000a.p045n.C0383s) r5
            if (r4 == 0) goto L_0x0047
            if (r5 == 0) goto L_0x0047
            java.util.ArrayList<a.n.s> r6 = r7.f1135u
            r6.add(r4)
            java.util.ArrayList<a.n.s> r4 = r7.f1136v
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x004a:
            return
    }

    /* renamed from: a */
    private void m2840a(p000a.p013d.C0067a<android.view.View, p000a.p045n.C0383s> r8, p000a.p013d.C0067a<android.view.View, p000a.p045n.C0383s> r9, android.util.SparseArray<android.view.View> r10, android.util.SparseArray<android.view.View> r11) {
            r7 = this;
            int r0 = r10.size()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x004a
            java.lang.Object r2 = r10.valueAt(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0047
            boolean r3 = r7.m2826b(r2)
            if (r3 == 0) goto L_0x0047
            int r3 = r10.keyAt(r1)
            java.lang.Object r3 = r11.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0047
            boolean r4 = r7.m2826b(r3)
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r8.get(r2)
            a.n.s r4 = (p000a.p045n.C0383s) r4
            java.lang.Object r5 = r9.get(r3)
            a.n.s r5 = (p000a.p045n.C0383s) r5
            if (r4 == 0) goto L_0x0047
            if (r5 == 0) goto L_0x0047
            java.util.ArrayList<a.n.s> r6 = r7.f1135u
            r6.add(r4)
            java.util.ArrayList<a.n.s> r4 = r7.f1136v
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x004a:
            return
    }

    /* renamed from: a */
    private void m2837a(p000a.p045n.C0384t r6, p000a.p045n.C0384t r7) {
            r5 = this;
            a.d.a r0 = new a.d.a
            a.d.a<android.view.View, a.n.s> r1 = r6.f1169a
            r0.<init>(r1)
            a.d.a r1 = new a.d.a
            a.d.a<android.view.View, a.n.s> r2 = r7.f1169a
            r1.<init>(r2)
            r2 = 0
        L_0x000f:
            int[] r3 = r5.f1134t
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0041
            r3 = r3[r2]
            r4 = 1
            if (r3 == r4) goto L_0x003b
            r4 = 2
            if (r3 == r4) goto L_0x0033
            r4 = 3
            if (r3 == r4) goto L_0x002b
            r4 = 4
            if (r3 == r4) goto L_0x0023
            goto L_0x003e
        L_0x0023:
            a.d.d<android.view.View> r3 = r6.f1171c
            a.d.d<android.view.View> r4 = r7.f1171c
            r5.m2841a(r0, r1, r3, r4)
            goto L_0x003e
        L_0x002b:
            android.util.SparseArray<android.view.View> r3 = r6.f1170b
            android.util.SparseArray<android.view.View> r4 = r7.f1170b
            r5.m2840a(r0, r1, r3, r4)
            goto L_0x003e
        L_0x0033:
            a.d.a<java.lang.String, android.view.View> r3 = r6.f1172d
            a.d.a<java.lang.String, android.view.View> r4 = r7.f1172d
            r5.m2842a(r0, r1, r3, r4)
            goto L_0x003e
        L_0x003b:
            r5.m2827b(r0, r1)
        L_0x003e:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0041:
            r5.m2843a(r0, r1)
            return
    }

    /* renamed from: a */
    private static void m2836a(p000a.p045n.C0384t r3, android.view.View r4, p000a.p045n.C0383s r5) {
            a.d.a<android.view.View, a.n.s> r0 = r3.f1169a
            r0.put(r4, r5)
            int r5 = r4.getId()
            r0 = 0
            if (r5 < 0) goto L_0x001f
            android.util.SparseArray<android.view.View> r1 = r3.f1170b
            int r1 = r1.indexOfKey(r5)
            if (r1 < 0) goto L_0x001a
            android.util.SparseArray<android.view.View> r1 = r3.f1170b
            r1.put(r5, r0)
            goto L_0x001f
        L_0x001a:
            android.util.SparseArray<android.view.View> r1 = r3.f1170b
            r1.put(r5, r4)
        L_0x001f:
            java.lang.String r5 = p000a.p018g.p029l.C0216r.m3405p(r4)
            if (r5 == 0) goto L_0x0038
            a.d.a<java.lang.String, android.view.View> r1 = r3.f1172d
            boolean r1 = r1.containsKey(r5)
            if (r1 == 0) goto L_0x0033
            a.d.a<java.lang.String, android.view.View> r1 = r3.f1172d
            r1.put(r5, r0)
            goto L_0x0038
        L_0x0033:
            a.d.a<java.lang.String, android.view.View> r1 = r3.f1172d
            r1.put(r5, r4)
        L_0x0038:
            android.view.ViewParent r5 = r4.getParent()
            boolean r5 = r5 instanceof android.widget.ListView
            if (r5 == 0) goto L_0x007d
            android.view.ViewParent r5 = r4.getParent()
            android.widget.ListView r5 = (android.widget.ListView) r5
            android.widget.ListAdapter r1 = r5.getAdapter()
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L_0x007d
            int r1 = r5.getPositionForView(r4)
            long r1 = r5.getItemIdAtPosition(r1)
            a.d.d<android.view.View> r5 = r3.f1171c
            int r5 = r5.m4052c(r1)
            if (r5 < 0) goto L_0x0074
            a.d.d<android.view.View> r4 = r3.f1171c
            java.lang.Object r4 = r4.m4056b(r1)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x007d
            r5 = 0
            p000a.p018g.p029l.C0216r.m3424b(r4, r5)
            a.d.d<android.view.View> r3 = r3.f1171c
            r3.m4051c(r1, r0)
            goto L_0x007d
        L_0x0074:
            r5 = 1
            p000a.p018g.p029l.C0216r.m3424b(r4, r5)
            a.d.d<android.view.View> r3 = r3.f1171c
            r3.m4051c(r1, r4)
        L_0x007d:
            return
    }

    /* renamed from: a */
    private void m2834a(android.animation.Animator r2, p000a.p013d.C0067a<android.animation.Animator, p000a.p045n.AbstractC0367m.C0371d> r3) {
            r1 = this;
            if (r2 == 0) goto L_0x000d
            a.n.m$b r0 = new a.n.m$b
            r0.<init>(r1, r3)
            r2.addListener(r0)
            r1.m2835a(r2)
        L_0x000d:
            return
    }

    /* renamed from: a */
    private static boolean m2838a(p000a.p045n.C0383s r0, p000a.p045n.C0383s r1, java.lang.String r2) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f1166a
            java.lang.Object r0 = r0.get(r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f1166a
            java.lang.Object r1 = r1.get(r2)
            r2 = 1
            if (r0 != 0) goto L_0x0013
            if (r1 != 0) goto L_0x0013
            r2 = 0
            goto L_0x001d
        L_0x0013:
            if (r0 == 0) goto L_0x001d
            if (r1 != 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            boolean r0 = r0.equals(r1)
            r2 = r2 ^ r0
        L_0x001d:
            return r2
    }

    /* renamed from: b */
    private void m2827b(p000a.p013d.C0067a<android.view.View, p000a.p045n.C0383s> r5, p000a.p013d.C0067a<android.view.View, p000a.p045n.C0383s> r6) {
            r4 = this;
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L_0x0006:
            if (r0 < 0) goto L_0x003b
            java.lang.Object r1 = r5.m4016b(r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0038
            boolean r2 = r4.m2826b(r1)
            if (r2 == 0) goto L_0x0038
            java.lang.Object r1 = r6.remove(r1)
            a.n.s r1 = (p000a.p045n.C0383s) r1
            if (r1 == 0) goto L_0x0038
            android.view.View r2 = r1.f1167b
            if (r2 == 0) goto L_0x0038
            boolean r2 = r4.m2826b(r2)
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r5.m4014c(r0)
            a.n.s r2 = (p000a.p045n.C0383s) r2
            java.util.ArrayList<a.n.s> r3 = r4.f1135u
            r3.add(r2)
            java.util.ArrayList<a.n.s> r2 = r4.f1136v
            r2.add(r1)
        L_0x0038:
            int r0 = r0 + (-1)
            goto L_0x0006
        L_0x003b:
            return
    }

    /* renamed from: c */
    private void m2823c(android.view.View r6, boolean r7) {
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r6.getId()
            java.util.ArrayList<java.lang.Integer> r1 = r5.f1124j
            if (r1 == 0) goto L_0x0016
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0016
            return
        L_0x0016:
            java.util.ArrayList<android.view.View> r1 = r5.f1125k
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L_0x0021
            return
        L_0x0021:
            java.util.ArrayList<java.lang.Class> r1 = r5.f1126l
            r2 = 0
            if (r1 == 0) goto L_0x003f
            int r1 = r1.size()
            r3 = 0
        L_0x002b:
            if (r3 >= r1) goto L_0x003f
            java.util.ArrayList<java.lang.Class> r4 = r5.f1126l
            java.lang.Object r4 = r4.get(r3)
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto L_0x003c
            return
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003f:
            android.view.ViewParent r1 = r6.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0069
            a.n.s r1 = new a.n.s
            r1.<init>()
            r1.f1167b = r6
            if (r7 == 0) goto L_0x0054
            r5.mo2783c(r1)
            goto L_0x0057
        L_0x0054:
            r5.mo2792a(r1)
        L_0x0057:
            java.util.ArrayList<a.n.m> r3 = r1.f1168c
            r3.add(r5)
            r5.mo2784b(r1)
            if (r7 == 0) goto L_0x0064
            a.n.t r3 = r5.f1131q
            goto L_0x0066
        L_0x0064:
            a.n.t r3 = r5.f1132r
        L_0x0066:
            m2836a(r3, r6, r1)
        L_0x0069:
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x00b6
            java.util.ArrayList<java.lang.Integer> r1 = r5.f1128n
            if (r1 == 0) goto L_0x007c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x007c
            return
        L_0x007c:
            java.util.ArrayList<android.view.View> r0 = r5.f1129o
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0087
            return
        L_0x0087:
            java.util.ArrayList<java.lang.Class> r0 = r5.f1130p
            if (r0 == 0) goto L_0x00a4
            int r0 = r0.size()
            r1 = 0
        L_0x0090:
            if (r1 >= r0) goto L_0x00a4
            java.util.ArrayList<java.lang.Class> r3 = r5.f1130p
            java.lang.Object r3 = r3.get(r1)
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isInstance(r6)
            if (r3 == 0) goto L_0x00a1
            return
        L_0x00a1:
            int r1 = r1 + 1
            goto L_0x0090
        L_0x00a4:
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
        L_0x00a6:
            int r0 = r6.getChildCount()
            if (r2 >= r0) goto L_0x00b6
            android.view.View r0 = r6.getChildAt(r2)
            r5.m2823c(r0, r7)
            int r2 = r2 + 1
            goto L_0x00a6
        L_0x00b6:
            return
    }

    /* renamed from: p */
    private static p000a.p013d.C0067a<android.animation.Animator, p000a.p045n.AbstractC0367m.C0371d> m2811p() {
            java.lang.ThreadLocal<a.d.a<android.animation.Animator, a.n.m$d>> r0 = p000a.p045n.AbstractC0367m.f1108J
            java.lang.Object r0 = r0.get()
            a.d.a r0 = (p000a.p013d.C0067a) r0
            if (r0 != 0) goto L_0x0014
            a.d.a r0 = new a.d.a
            r0.<init>()
            java.lang.ThreadLocal<a.d.a<android.animation.Animator, a.n.m$d>> r1 = p000a.p045n.AbstractC0367m.f1108J
            r1.set(r0)
        L_0x0014:
            return r0
    }

    /* renamed from: a */
    public p000a.p045n.AbstractC0367m mo2798a(long r1) {
            r0 = this;
            r0.f1118d = r1
            return r0
    }

    /* renamed from: a */
    public p000a.p045n.AbstractC0367m mo2795a(p000a.p045n.AbstractC0367m.AbstractC0373f r2) {
            r1 = this;
            java.util.ArrayList<a.n.m$f> r0 = r1.f1110B
            if (r0 != 0) goto L_0x000b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1110B = r0
        L_0x000b:
            java.util.ArrayList<a.n.m$f> r0 = r1.f1110B
            r0.add(r2)
            return r1
    }

    /* renamed from: a */
    public p000a.p045n.AbstractC0367m mo2791a(android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.f1119e = r1
            return r0
    }

    /* renamed from: a */
    public p000a.p045n.AbstractC0367m mo2790a(android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.f1121g
            r0.add(r2)
            return r1
    }

    /* renamed from: a */
    p000a.p045n.C0383s m2833a(android.view.View r7, boolean r8) {
            r6 = this;
            a.n.q r0 = r6.f1133s
            if (r0 == 0) goto L_0x0009
            a.n.s r7 = r0.m2833a(r7, r8)
            return r7
        L_0x0009:
            if (r8 == 0) goto L_0x000e
            java.util.ArrayList<a.n.s> r0 = r6.f1135u
            goto L_0x0010
        L_0x000e:
            java.util.ArrayList<a.n.s> r0 = r6.f1136v
        L_0x0010:
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            int r2 = r0.size()
            r3 = -1
            r4 = 0
        L_0x001a:
            if (r4 >= r2) goto L_0x002e
            java.lang.Object r5 = r0.get(r4)
            a.n.s r5 = (p000a.p045n.C0383s) r5
            if (r5 != 0) goto L_0x0025
            return r1
        L_0x0025:
            android.view.View r5 = r5.f1167b
            if (r5 != r7) goto L_0x002b
            r3 = r4
            goto L_0x002e
        L_0x002b:
            int r4 = r4 + 1
            goto L_0x001a
        L_0x002e:
            if (r3 < 0) goto L_0x003e
            if (r8 == 0) goto L_0x0035
            java.util.ArrayList<a.n.s> r7 = r6.f1136v
            goto L_0x0037
        L_0x0035:
            java.util.ArrayList<a.n.s> r7 = r6.f1135u
        L_0x0037:
            java.lang.Object r7 = r7.get(r3)
            r1 = r7
            a.n.s r1 = (p000a.p045n.C0383s) r1
        L_0x003e:
            return r1
    }

    /* renamed from: a */
    public android.animation.Animator mo2831a(android.view.ViewGroup r1, p000a.p045n.C0383s r2, p000a.p045n.C0383s r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: a */
    java.lang.String mo2788a(java.lang.String r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.Class r8 = r7.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r0.append(r8)
            java.lang.String r8 = "@"
            r0.append(r8)
            int r8 = r7.hashCode()
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            r0.append(r8)
            java.lang.String r8 = ": "
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            long r0 = r7.f1118d
            r2 = -1
            java.lang.String r4 = ") "
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x004f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "dur("
            r0.append(r8)
            long r5 = r7.f1118d
            r0.append(r5)
            r0.append(r4)
            java.lang.String r8 = r0.toString()
        L_0x004f:
            long r0 = r7.f1117c
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x006e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "dly("
            r0.append(r8)
            long r1 = r7.f1117c
            r0.append(r1)
            r0.append(r4)
            java.lang.String r8 = r0.toString()
        L_0x006e:
            android.animation.TimeInterpolator r0 = r7.f1119e
            if (r0 == 0) goto L_0x008b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "interp("
            r0.append(r8)
            android.animation.TimeInterpolator r8 = r7.f1119e
            r0.append(r8)
            r0.append(r4)
            java.lang.String r8 = r0.toString()
        L_0x008b:
            java.util.ArrayList<java.lang.Integer> r0 = r7.f1120f
            int r0 = r0.size()
            if (r0 > 0) goto L_0x009b
            java.util.ArrayList<android.view.View> r0 = r7.f1121g
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0135
        L_0x009b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "tgts("
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.util.ArrayList<java.lang.Integer> r0 = r7.f1120f
            int r0 = r0.size()
            java.lang.String r1 = ", "
            r2 = 0
            if (r0 <= 0) goto L_0x00eb
            r0 = r8
            r8 = 0
        L_0x00b9:
            java.util.ArrayList<java.lang.Integer> r3 = r7.f1120f
            int r3 = r3.size()
            if (r8 >= r3) goto L_0x00ea
            if (r8 <= 0) goto L_0x00d2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
        L_0x00d2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.util.ArrayList<java.lang.Integer> r0 = r7.f1120f
            java.lang.Object r0 = r0.get(r8)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r8 = r8 + 1
            goto L_0x00b9
        L_0x00ea:
            r8 = r0
        L_0x00eb:
            java.util.ArrayList<android.view.View> r0 = r7.f1121g
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0124
        L_0x00f3:
            java.util.ArrayList<android.view.View> r0 = r7.f1121g
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0124
            if (r2 <= 0) goto L_0x010c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r1)
            java.lang.String r8 = r0.toString()
        L_0x010c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.util.ArrayList<android.view.View> r8 = r7.f1121g
            java.lang.Object r8 = r8.get(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0124:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = ")"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L_0x0135:
            return r8
    }

    /* renamed from: a */
    protected void m2844a() {
            r6 = this;
            int r0 = r6.f1139y
            r1 = 1
            int r0 = r0 - r1
            r6.f1139y = r0
            int r0 = r6.f1139y
            if (r0 != 0) goto L_0x006c
            java.util.ArrayList<a.n.m$f> r0 = r6.f1110B
            r2 = 0
            if (r0 == 0) goto L_0x0030
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0030
            java.util.ArrayList<a.n.m$f> r0 = r6.f1110B
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
            r4 = 0
        L_0x0022:
            if (r4 >= r3) goto L_0x0030
            java.lang.Object r5 = r0.get(r4)
            a.n.m$f r5 = (p000a.p045n.AbstractC0367m.AbstractC0373f) r5
            r5.mo2775b(r6)
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0030:
            r0 = 0
        L_0x0031:
            a.n.t r3 = r6.f1131q
            a.d.d<android.view.View> r3 = r3.f1171c
            int r3 = r3.m4058b()
            if (r0 >= r3) goto L_0x004d
            a.n.t r3 = r6.f1131q
            a.d.d<android.view.View> r3 = r3.f1171c
            java.lang.Object r3 = r3.m4053c(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x004a
            p000a.p018g.p029l.C0216r.m3424b(r3, r2)
        L_0x004a:
            int r0 = r0 + 1
            goto L_0x0031
        L_0x004d:
            r0 = 0
        L_0x004e:
            a.n.t r3 = r6.f1132r
            a.d.d<android.view.View> r3 = r3.f1171c
            int r3 = r3.m4058b()
            if (r0 >= r3) goto L_0x006a
            a.n.t r3 = r6.f1132r
            a.d.d<android.view.View> r3 = r3.f1171c
            java.lang.Object r3 = r3.m4053c(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0067
            p000a.p018g.p029l.C0216r.m3424b(r3, r2)
        L_0x0067:
            int r0 = r0 + 1
            goto L_0x004e
        L_0x006a:
            r6.f1109A = r1
        L_0x006c:
            return
    }

    /* renamed from: a */
    public void mo2797a(p000a.p045n.AbstractC0352g r1) {
            r0 = this;
            if (r1 != 0) goto L_0x0004
            a.n.g r1 = p000a.p045n.AbstractC0367m.f1107I
        L_0x0004:
            r0.f1115G = r1
            return
    }

    /* renamed from: a */
    public void mo2796a(p000a.p045n.AbstractC0367m.AbstractC0372e r1) {
            r0 = this;
            r0.f1113E = r1
            return
    }

    /* renamed from: a */
    public void mo2793a(p000a.p045n.AbstractC0378p r1) {
            r0 = this;
            r0.f1112D = r1
            return
    }

    /* renamed from: a */
    public abstract void mo2792a(p000a.p045n.C0383s r1);

    /* renamed from: a */
    protected void m2835a(android.animation.Animator r6) {
            r5 = this;
            if (r6 != 0) goto L_0x0006
            r5.m2844a()
            goto L_0x003e
        L_0x0006:
            long r0 = r5.m2828b()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0017
            long r0 = r5.m2828b()
            r6.setDuration(r0)
        L_0x0017:
            long r0 = r5.m2818h()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0026
            long r0 = r5.m2818h()
            r6.setStartDelay(r0)
        L_0x0026:
            android.animation.TimeInterpolator r0 = r5.m2822d()
            if (r0 == 0) goto L_0x0033
            android.animation.TimeInterpolator r0 = r5.m2822d()
            r6.setInterpolator(r0)
        L_0x0033:
            a.n.m$c r0 = new a.n.m$c
            r0.<init>(r5)
            r6.addListener(r0)
            r6.start()
        L_0x003e:
            return
    }

    /* renamed from: a */
    void m2832a(android.view.ViewGroup r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1135u = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1136v = r0
            a.n.t r0 = r10.f1131q
            a.n.t r1 = r10.f1132r
            r10.m2837a(r0, r1)
            a.d.a r0 = m2811p()
            int r1 = r0.size()
            a.n.l0 r2 = p000a.p045n.C0341d0.m2895d(r11)
            r3 = 1
            int r1 = r1 - r3
        L_0x0023:
            if (r1 < 0) goto L_0x0075
            java.lang.Object r4 = r0.m4016b(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x0072
            java.lang.Object r5 = r0.get(r4)
            a.n.m$d r5 = (p000a.p045n.AbstractC0367m.C0371d) r5
            if (r5 == 0) goto L_0x0072
            android.view.View r6 = r5.f1144a
            if (r6 == 0) goto L_0x0072
            a.n.l0 r6 = r5.f1147d
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x0072
            a.n.s r6 = r5.f1146c
            android.view.View r7 = r5.f1144a
            a.n.s r8 = r10.m2825b(r7, r3)
            a.n.s r7 = r10.m2833a(r7, r3)
            if (r8 != 0) goto L_0x0051
            if (r7 == 0) goto L_0x005b
        L_0x0051:
            a.n.m r5 = r5.f1148e
            boolean r5 = r5.mo2839a(r6, r7)
            if (r5 == 0) goto L_0x005b
            r5 = 1
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            if (r5 == 0) goto L_0x0072
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x006f
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            r0.remove(r4)
            goto L_0x0072
        L_0x006f:
            r4.cancel()
        L_0x0072:
            int r1 = r1 + (-1)
            goto L_0x0023
        L_0x0075:
            a.n.t r6 = r10.f1131q
            a.n.t r7 = r10.f1132r
            java.util.ArrayList<a.n.s> r8 = r10.f1135u
            java.util.ArrayList<a.n.s> r9 = r10.f1136v
            r4 = r10
            r5 = r11
            r4.mo2789a(r5, r6, r7, r8, r9)
            r10.mo2779n()
            return
    }

    /* renamed from: a */
    protected void mo2789a(android.view.ViewGroup r21, p000a.p045n.C0384t r22, p000a.p045n.C0384t r23, java.util.ArrayList<p000a.p045n.C0383s> r24, java.util.ArrayList<p000a.p045n.C0383s> r25) {
            r20 = this;
            r6 = r20
            r7 = r21
            a.d.a r8 = m2811p()
            android.util.SparseIntArray r9 = new android.util.SparseIntArray
            r9.<init>()
            int r10 = r24.size()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 0
        L_0x0017:
            if (r12 >= r10) goto L_0x012f
            r13 = r24
            java.lang.Object r2 = r13.get(r12)
            a.n.s r2 = (p000a.p045n.C0383s) r2
            r14 = r25
            java.lang.Object r3 = r14.get(r12)
            a.n.s r3 = (p000a.p045n.C0383s) r3
            if (r2 == 0) goto L_0x0034
            java.util.ArrayList<a.n.m> r5 = r2.f1168c
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x0034
            r2 = 0
        L_0x0034:
            if (r3 == 0) goto L_0x003f
            java.util.ArrayList<a.n.m> r5 = r3.f1168c
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x003f
            r3 = 0
        L_0x003f:
            if (r2 != 0) goto L_0x0049
            if (r3 != 0) goto L_0x0049
        L_0x0043:
            r16 = r10
            r18 = r12
            goto L_0x0129
        L_0x0049:
            if (r2 == 0) goto L_0x0056
            if (r3 == 0) goto L_0x0056
            boolean r5 = r6.mo2839a(r2, r3)
            if (r5 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r5 = 0
            goto L_0x0057
        L_0x0056:
            r5 = 1
        L_0x0057:
            if (r5 == 0) goto L_0x0043
            android.animation.Animator r5 = r6.mo2831a(r7, r2, r3)
            if (r5 == 0) goto L_0x0043
            if (r3 == 0) goto L_0x00ea
            android.view.View r15 = r3.f1167b
            java.lang.String[] r4 = r20.mo2813m()
            if (r15 == 0) goto L_0x00de
            if (r4 == 0) goto L_0x00de
            int r11 = r4.length
            if (r11 <= 0) goto L_0x00de
            a.n.s r11 = new a.n.s
            r11.<init>()
            r11.f1167b = r15
            r17 = r5
            r16 = r10
            r10 = r23
            a.d.a<android.view.View, a.n.s> r5 = r10.f1169a
            java.lang.Object r5 = r5.get(r15)
            a.n.s r5 = (p000a.p045n.C0383s) r5
            if (r5 == 0) goto L_0x00a5
            r10 = 0
        L_0x0086:
            int r13 = r4.length
            if (r10 >= r13) goto L_0x00a5
            java.util.Map<java.lang.String, java.lang.Object> r13 = r11.f1166a
            r14 = r4[r10]
            r18 = r12
            java.util.Map<java.lang.String, java.lang.Object> r12 = r5.f1166a
            r19 = r5
            r5 = r4[r10]
            java.lang.Object r5 = r12.get(r5)
            r13.put(r14, r5)
            int r10 = r10 + 1
            r14 = r25
            r12 = r18
            r5 = r19
            goto L_0x0086
        L_0x00a5:
            r18 = r12
            int r4 = r8.size()
            r5 = 0
        L_0x00ac:
            if (r5 >= r4) goto L_0x00db
            java.lang.Object r10 = r8.m4016b(r5)
            android.animation.Animator r10 = (android.animation.Animator) r10
            java.lang.Object r10 = r8.get(r10)
            a.n.m$d r10 = (p000a.p045n.AbstractC0367m.C0371d) r10
            a.n.s r12 = r10.f1146c
            if (r12 == 0) goto L_0x00d8
            android.view.View r12 = r10.f1144a
            if (r12 != r15) goto L_0x00d8
            java.lang.String r12 = r10.f1145b
            java.lang.String r13 = r20.m2821e()
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x00d8
            a.n.s r10 = r10.f1146c
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00d8
            r5 = 0
            goto L_0x00e7
        L_0x00d8:
            int r5 = r5 + 1
            goto L_0x00ac
        L_0x00db:
            r5 = r17
            goto L_0x00e7
        L_0x00de:
            r17 = r5
            r16 = r10
            r18 = r12
            r5 = r17
            r11 = 0
        L_0x00e7:
            r10 = r5
            r5 = r11
            goto L_0x00f6
        L_0x00ea:
            r17 = r5
            r16 = r10
            r18 = r12
            android.view.View r4 = r2.f1167b
            r15 = r4
            r10 = r17
            r5 = 0
        L_0x00f6:
            if (r10 == 0) goto L_0x0129
            a.n.p r4 = r6.f1112D
            if (r4 == 0) goto L_0x010e
            long r2 = r4.m2800a(r7, r6, r2, r3)
            java.util.ArrayList<android.animation.Animator> r4 = r6.f1111C
            int r4 = r4.size()
            int r11 = (int) r2
            r9.put(r4, r11)
            long r0 = java.lang.Math.min(r2, r0)
        L_0x010e:
            r11 = r0
            a.n.m$d r13 = new a.n.m$d
            java.lang.String r2 = r20.m2821e()
            a.n.l0 r4 = p000a.p045n.C0341d0.m2895d(r21)
            r0 = r13
            r1 = r15
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r8.put(r10, r13)
            java.util.ArrayList<android.animation.Animator> r0 = r6.f1111C
            r0.add(r10)
            r0 = r11
        L_0x0129:
            int r12 = r18 + 1
            r10 = r16
            goto L_0x0017
        L_0x012f:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0159
            r2 = 0
        L_0x0136:
            int r3 = r9.size()
            if (r2 >= r3) goto L_0x0159
            int r3 = r9.keyAt(r2)
            java.util.ArrayList<android.animation.Animator> r4 = r6.f1111C
            java.lang.Object r3 = r4.get(r3)
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r9.valueAt(r2)
            long r4 = (long) r4
            long r4 = r4 - r0
            long r7 = r3.getStartDelay()
            long r4 = r4 + r7
            r3.setStartDelay(r4)
            int r2 = r2 + 1
            goto L_0x0136
        L_0x0159:
            return
    }

    /* renamed from: a */
    void m2830a(android.view.ViewGroup r6, boolean r7) {
            r5 = this;
            r5.m2829a(r7)
            java.util.ArrayList<java.lang.Integer> r0 = r5.f1120f
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L_0x0014
            java.util.ArrayList<android.view.View> r0 = r5.f1121g
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0029
        L_0x0014:
            java.util.ArrayList<java.lang.String> r0 = r5.f1122h
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
        L_0x001e:
            java.util.ArrayList<java.lang.Class> r0 = r5.f1123i
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r5.m2823c(r6, r7)
            goto L_0x00a4
        L_0x002e:
            r0 = 0
        L_0x002f:
            java.util.ArrayList<java.lang.Integer> r2 = r5.f1120f
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x006e
            java.util.ArrayList<java.lang.Integer> r2 = r5.f1120f
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.view.View r2 = r6.findViewById(r2)
            if (r2 == 0) goto L_0x006b
            a.n.s r3 = new a.n.s
            r3.<init>()
            r3.f1167b = r2
            if (r7 == 0) goto L_0x0056
            r5.mo2783c(r3)
            goto L_0x0059
        L_0x0056:
            r5.mo2792a(r3)
        L_0x0059:
            java.util.ArrayList<a.n.m> r4 = r3.f1168c
            r4.add(r5)
            r5.mo2784b(r3)
            if (r7 == 0) goto L_0x0066
            a.n.t r4 = r5.f1131q
            goto L_0x0068
        L_0x0066:
            a.n.t r4 = r5.f1132r
        L_0x0068:
            m2836a(r4, r2, r3)
        L_0x006b:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x006e:
            r6 = 0
        L_0x006f:
            java.util.ArrayList<android.view.View> r0 = r5.f1121g
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x00a4
            java.util.ArrayList<android.view.View> r0 = r5.f1121g
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            a.n.s r2 = new a.n.s
            r2.<init>()
            r2.f1167b = r0
            if (r7 == 0) goto L_0x008c
            r5.mo2783c(r2)
            goto L_0x008f
        L_0x008c:
            r5.mo2792a(r2)
        L_0x008f:
            java.util.ArrayList<a.n.m> r3 = r2.f1168c
            r3.add(r5)
            r5.mo2784b(r2)
            if (r7 == 0) goto L_0x009c
            a.n.t r3 = r5.f1131q
            goto L_0x009e
        L_0x009c:
            a.n.t r3 = r5.f1132r
        L_0x009e:
            m2836a(r3, r0, r2)
            int r6 = r6 + 1
            goto L_0x006f
        L_0x00a4:
            if (r7 != 0) goto L_0x00e8
            a.d.a<java.lang.String, java.lang.String> r6 = r5.f1114F
            if (r6 == 0) goto L_0x00e8
            int r6 = r6.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            r0 = 0
        L_0x00b4:
            if (r0 >= r6) goto L_0x00cc
            a.d.a<java.lang.String, java.lang.String> r2 = r5.f1114F
            java.lang.Object r2 = r2.m4016b(r0)
            java.lang.String r2 = (java.lang.String) r2
            a.n.t r3 = r5.f1131q
            a.d.a<java.lang.String, android.view.View> r3 = r3.f1172d
            java.lang.Object r2 = r3.remove(r2)
            r7.add(r2)
            int r0 = r0 + 1
            goto L_0x00b4
        L_0x00cc:
            if (r1 >= r6) goto L_0x00e8
            java.lang.Object r0 = r7.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00e5
            a.d.a<java.lang.String, java.lang.String> r2 = r5.f1114F
            java.lang.Object r2 = r2.m4013d(r1)
            java.lang.String r2 = (java.lang.String) r2
            a.n.t r3 = r5.f1131q
            a.d.a<java.lang.String, android.view.View> r3 = r3.f1172d
            r3.put(r2, r0)
        L_0x00e5:
            int r1 = r1 + 1
            goto L_0x00cc
        L_0x00e8:
            return
    }

    /* renamed from: a */
    void m2829a(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L_0x0013
            a.n.t r1 = r0.f1131q
            a.d.a<android.view.View, a.n.s> r1 = r1.f1169a
            r1.clear()
            a.n.t r1 = r0.f1131q
            android.util.SparseArray<android.view.View> r1 = r1.f1170b
            r1.clear()
            a.n.t r1 = r0.f1131q
            goto L_0x0023
        L_0x0013:
            a.n.t r1 = r0.f1132r
            a.d.a<android.view.View, a.n.s> r1 = r1.f1169a
            r1.clear()
            a.n.t r1 = r0.f1132r
            android.util.SparseArray<android.view.View> r1 = r1.f1170b
            r1.clear()
            a.n.t r1 = r0.f1132r
        L_0x0023:
            a.d.d<android.view.View> r1 = r1.f1171c
            r1.m4062a()
            return
    }

    /* renamed from: a */
    public boolean mo2839a(p000a.p045n.C0383s r7, p000a.p045n.C0383s r8) {
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x0039
            if (r8 == 0) goto L_0x0039
            java.lang.String[] r2 = r6.mo2813m()
            if (r2 == 0) goto L_0x001c
            int r3 = r2.length
            r4 = 0
        L_0x000e:
            if (r4 >= r3) goto L_0x0039
            r5 = r2[r4]
            boolean r5 = m2838a(r7, r8, r5)
            if (r5 == 0) goto L_0x0019
            goto L_0x0038
        L_0x0019:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x001c:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.f1166a
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0026:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = m2838a(r7, r8, r3)
            if (r3 == 0) goto L_0x0026
        L_0x0038:
            r0 = 1
        L_0x0039:
            return r0
    }

    /* renamed from: b */
    public long m2828b() {
            r2 = this;
            long r0 = r2.f1118d
            return r0
    }

    /* renamed from: b */
    public p000a.p045n.AbstractC0367m mo2786b(long r1) {
            r0 = this;
            r0.f1117c = r1
            return r0
    }

    /* renamed from: b */
    public p000a.p045n.AbstractC0367m mo2785b(p000a.p045n.AbstractC0367m.AbstractC0373f r2) {
            r1 = this;
            java.util.ArrayList<a.n.m$f> r0 = r1.f1110B
            if (r0 != 0) goto L_0x0005
            return r1
        L_0x0005:
            r0.remove(r2)
            java.util.ArrayList<a.n.m$f> r2 = r1.f1110B
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0013
            r2 = 0
            r1.f1110B = r2
        L_0x0013:
            return r1
    }

    /* renamed from: b */
    public p000a.p045n.C0383s m2825b(android.view.View r2, boolean r3) {
            r1 = this;
            a.n.q r0 = r1.f1133s
            if (r0 == 0) goto L_0x0009
            a.n.s r2 = r0.m2825b(r2, r3)
            return r2
        L_0x0009:
            if (r3 == 0) goto L_0x000e
            a.n.t r3 = r1.f1131q
            goto L_0x0010
        L_0x000e:
            a.n.t r3 = r1.f1132r
        L_0x0010:
            a.d.a<android.view.View, a.n.s> r3 = r3.f1169a
            java.lang.Object r2 = r3.get(r2)
            a.n.s r2 = (p000a.p045n.C0383s) r2
            return r2
    }

    /* renamed from: b */
    void mo2784b(p000a.p045n.C0383s r6) {
            r5 = this;
            a.n.p r0 = r5.f1112D
            if (r0 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.f1166a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0030
            a.n.p r0 = r5.f1112D
            java.lang.String[] r0 = r0.m2802a()
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            r1 = 0
            r2 = 0
        L_0x0017:
            int r3 = r0.length
            if (r2 >= r3) goto L_0x0028
            java.util.Map<java.lang.String, java.lang.Object> r3 = r6.f1166a
            r4 = r0[r2]
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0028:
            r1 = 1
        L_0x0029:
            if (r1 != 0) goto L_0x0030
            a.n.p r0 = r5.f1112D
            r0.m2801a(r6)
        L_0x0030:
            return
    }

    /* renamed from: b */
    boolean m2826b(android.view.View r6) {
            r5 = this;
            int r0 = r6.getId()
            java.util.ArrayList<java.lang.Integer> r1 = r5.f1124j
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x0014
            return r2
        L_0x0014:
            java.util.ArrayList<android.view.View> r1 = r5.f1125k
            if (r1 == 0) goto L_0x001f
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L_0x001f
            return r2
        L_0x001f:
            java.util.ArrayList<java.lang.Class> r1 = r5.f1126l
            if (r1 == 0) goto L_0x003c
            int r1 = r1.size()
            r3 = 0
        L_0x0028:
            if (r3 >= r1) goto L_0x003c
            java.util.ArrayList<java.lang.Class> r4 = r5.f1126l
            java.lang.Object r4 = r4.get(r3)
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto L_0x0039
            return r2
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x003c:
            java.util.ArrayList<java.lang.String> r1 = r5.f1127m
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = p000a.p018g.p029l.C0216r.m3405p(r6)
            if (r1 == 0) goto L_0x0053
            java.util.ArrayList<java.lang.String> r1 = r5.f1127m
            java.lang.String r3 = p000a.p018g.p029l.C0216r.m3405p(r6)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x0053
            return r2
        L_0x0053:
            java.util.ArrayList<java.lang.Integer> r1 = r5.f1120f
            int r1 = r1.size()
            r3 = 1
            if (r1 != 0) goto L_0x0079
            java.util.ArrayList<android.view.View> r1 = r5.f1121g
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0079
            java.util.ArrayList<java.lang.Class> r1 = r5.f1123i
            if (r1 == 0) goto L_0x006e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0079
        L_0x006e:
            java.util.ArrayList<java.lang.String> r1 = r5.f1122h
            if (r1 == 0) goto L_0x0078
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0079
        L_0x0078:
            return r3
        L_0x0079:
            java.util.ArrayList<java.lang.Integer> r1 = r5.f1120f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00bd
            java.util.ArrayList<android.view.View> r0 = r5.f1121g
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x008e
            goto L_0x00bd
        L_0x008e:
            java.util.ArrayList<java.lang.String> r0 = r5.f1122h
            if (r0 == 0) goto L_0x009d
            java.lang.String r1 = p000a.p018g.p029l.C0216r.m3405p(r6)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x009d
            return r3
        L_0x009d:
            java.util.ArrayList<java.lang.Class> r0 = r5.f1123i
            if (r0 == 0) goto L_0x00bc
            r0 = 0
        L_0x00a2:
            java.util.ArrayList<java.lang.Class> r1 = r5.f1123i
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x00bc
            java.util.ArrayList<java.lang.Class> r1 = r5.f1123i
            java.lang.Object r1 = r1.get(r0)
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isInstance(r6)
            if (r1 == 0) goto L_0x00b9
            return r3
        L_0x00b9:
            int r0 = r0 + 1
            goto L_0x00a2
        L_0x00bc:
            return r2
        L_0x00bd:
            return r3
    }

    /* renamed from: c */
    public p000a.p045n.AbstractC0367m.AbstractC0372e m2824c() {
            r1 = this;
            a.n.m$e r0 = r1.f1113E
            return r0
    }

    /* renamed from: c */
    public abstract void mo2783c(p000a.p045n.C0383s r1);

    /* renamed from: c */
    public void mo2782c(android.view.View r6) {
            r5 = this;
            boolean r0 = r5.f1109A
            if (r0 != 0) goto L_0x0059
            a.d.a r0 = m2811p()
            int r1 = r0.size()
            a.n.l0 r6 = p000a.p045n.C0341d0.m2895d(r6)
            r2 = 1
            int r1 = r1 - r2
        L_0x0012:
            if (r1 < 0) goto L_0x0032
            java.lang.Object r3 = r0.m4013d(r1)
            a.n.m$d r3 = (p000a.p045n.AbstractC0367m.C0371d) r3
            android.view.View r4 = r3.f1144a
            if (r4 == 0) goto L_0x002f
            a.n.l0 r3 = r3.f1147d
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r0.m4016b(r1)
            android.animation.Animator r3 = (android.animation.Animator) r3
            p000a.p045n.C0319a.m2935a(r3)
        L_0x002f:
            int r1 = r1 + (-1)
            goto L_0x0012
        L_0x0032:
            java.util.ArrayList<a.n.m$f> r6 = r5.f1110B
            if (r6 == 0) goto L_0x0057
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0057
            java.util.ArrayList<a.n.m$f> r6 = r5.f1110B
            java.lang.Object r6 = r6.clone()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r0 = r6.size()
            r1 = 0
        L_0x0049:
            if (r1 >= r0) goto L_0x0057
            java.lang.Object r3 = r6.get(r1)
            a.n.m$f r3 = (p000a.p045n.AbstractC0367m.AbstractC0373f) r3
            r3.mo2809c(r5)
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0057:
            r5.f1140z = r2
        L_0x0059:
            return
    }

    public p000a.p045n.AbstractC0367m clone() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = super.clone()     // Catch: CloneNotSupportedException -> 0x0021
            a.n.m r1 = (p000a.p045n.AbstractC0367m) r1     // Catch: CloneNotSupportedException -> 0x0021
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: CloneNotSupportedException -> 0x0021
            r2.<init>()     // Catch: CloneNotSupportedException -> 0x0021
            r1.f1111C = r2     // Catch: CloneNotSupportedException -> 0x0021
            a.n.t r2 = new a.n.t     // Catch: CloneNotSupportedException -> 0x0021
            r2.<init>()     // Catch: CloneNotSupportedException -> 0x0021
            r1.f1131q = r2     // Catch: CloneNotSupportedException -> 0x0021
            a.n.t r2 = new a.n.t     // Catch: CloneNotSupportedException -> 0x0021
            r2.<init>()     // Catch: CloneNotSupportedException -> 0x0021
            r1.f1132r = r2     // Catch: CloneNotSupportedException -> 0x0021
            r1.f1135u = r0     // Catch: CloneNotSupportedException -> 0x0021
            r1.f1136v = r0     // Catch: CloneNotSupportedException -> 0x0021
            return r1
        L_0x0021:
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            a.n.m r0 = r1.clone()
            return r0
    }

    /* renamed from: d */
    public p000a.p045n.AbstractC0367m mo2781d(android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.f1121g
            r0.remove(r2)
            return r1
    }

    /* renamed from: d */
    public android.animation.TimeInterpolator m2822d() {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.f1119e
            return r0
    }

    /* renamed from: e */
    public java.lang.String m2821e() {
            r1 = this;
            java.lang.String r0 = r1.f1116b
            return r0
    }

    /* renamed from: e */
    public void mo2780e(android.view.View r6) {
            r5 = this;
            boolean r0 = r5.f1140z
            if (r0 == 0) goto L_0x005e
            boolean r0 = r5.f1109A
            r1 = 0
            if (r0 != 0) goto L_0x005c
            a.d.a r0 = m2811p()
            int r2 = r0.size()
            a.n.l0 r6 = p000a.p045n.C0341d0.m2895d(r6)
            int r2 = r2 + (-1)
        L_0x0017:
            if (r2 < 0) goto L_0x0037
            java.lang.Object r3 = r0.m4013d(r2)
            a.n.m$d r3 = (p000a.p045n.AbstractC0367m.C0371d) r3
            android.view.View r4 = r3.f1144a
            if (r4 == 0) goto L_0x0034
            a.n.l0 r3 = r3.f1147d
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.m4016b(r2)
            android.animation.Animator r3 = (android.animation.Animator) r3
            p000a.p045n.C0319a.m2933b(r3)
        L_0x0034:
            int r2 = r2 + (-1)
            goto L_0x0017
        L_0x0037:
            java.util.ArrayList<a.n.m$f> r6 = r5.f1110B
            if (r6 == 0) goto L_0x005c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x005c
            java.util.ArrayList<a.n.m$f> r6 = r5.f1110B
            java.lang.Object r6 = r6.clone()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r0 = r6.size()
            r2 = 0
        L_0x004e:
            if (r2 >= r0) goto L_0x005c
            java.lang.Object r3 = r6.get(r2)
            a.n.m$f r3 = (p000a.p045n.AbstractC0367m.AbstractC0373f) r3
            r3.mo2808d(r5)
            int r2 = r2 + 1
            goto L_0x004e
        L_0x005c:
            r5.f1140z = r1
        L_0x005e:
            return
    }

    /* renamed from: f */
    public p000a.p045n.AbstractC0352g m2820f() {
            r1 = this;
            a.n.g r0 = r1.f1115G
            return r0
    }

    /* renamed from: g */
    public p000a.p045n.AbstractC0378p m2819g() {
            r1 = this;
            a.n.p r0 = r1.f1112D
            return r0
    }

    /* renamed from: h */
    public long m2818h() {
            r2 = this;
            long r0 = r2.f1117c
            return r0
    }

    /* renamed from: i */
    public java.util.List<java.lang.Integer> m2817i() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.f1120f
            return r0
    }

    /* renamed from: j */
    public java.util.List<java.lang.String> m2816j() {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.f1122h
            return r0
    }

    /* renamed from: k */
    public java.util.List<java.lang.Class> m2815k() {
            r1 = this;
            java.util.ArrayList<java.lang.Class> r0 = r1.f1123i
            return r0
    }

    /* renamed from: l */
    public java.util.List<android.view.View> m2814l() {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.f1121g
            return r0
    }

    /* renamed from: m */
    public java.lang.String[] mo2813m() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: n */
    protected void mo2779n() {
            r4 = this;
            r4.m2812o()
            a.d.a r0 = m2811p()
            java.util.ArrayList<android.animation.Animator> r1 = r4.f1111C
            java.util.Iterator r1 = r1.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r1.next()
            android.animation.Animator r2 = (android.animation.Animator) r2
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x000d
            r4.m2812o()
            r4.m2834a(r2, r0)
            goto L_0x000d
        L_0x0026:
            java.util.ArrayList<android.animation.Animator> r0 = r4.f1111C
            r0.clear()
            r4.m2844a()
            return
    }

    /* renamed from: o */
    protected void m2812o() {
            r5 = this;
            int r0 = r5.f1139y
            if (r0 != 0) goto L_0x002c
            java.util.ArrayList<a.n.m$f> r0 = r5.f1110B
            r1 = 0
            if (r0 == 0) goto L_0x002a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x002a
            java.util.ArrayList<a.n.m$f> r0 = r5.f1110B
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            r3 = 0
        L_0x001c:
            if (r3 >= r2) goto L_0x002a
            java.lang.Object r4 = r0.get(r3)
            a.n.m$f r4 = (p000a.p045n.AbstractC0367m.AbstractC0373f) r4
            r4.mo2776a(r5)
            int r3 = r3 + 1
            goto L_0x001c
        L_0x002a:
            r5.f1109A = r1
        L_0x002c:
            int r0 = r5.f1139y
            int r0 = r0 + 1
            r5.f1139y = r0
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r0 = r1.mo2788a(r0)
            return r0
    }
}
