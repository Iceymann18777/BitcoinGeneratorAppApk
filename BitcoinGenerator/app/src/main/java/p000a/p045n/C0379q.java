package p000a.p045n;

/* renamed from: a.n.q */
/* loaded from: classes.dex */
public class C0379q extends p000a.p045n.AbstractC0367m {

    /* renamed from: K */
    private java.util.ArrayList<p000a.p045n.AbstractC0367m> f1156K;

    /* renamed from: L */
    private boolean f1157L;

    /* renamed from: M */
    int f1158M;

    /* renamed from: N */
    boolean f1159N;

    /* renamed from: O */
    private int f1160O;

    /* renamed from: a.n.q$a */
    /* loaded from: classes.dex */
    class C0380a extends p000a.p045n.C0374n {

        /* renamed from: a */
        final /* synthetic */ p000a.p045n.AbstractC0367m f1161a;

        C0380a(p000a.p045n.C0379q r1, p000a.p045n.AbstractC0367m r2) {
                r0 = this;
                r0.f1161a = r2
                r0.<init>()
                return
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(p000a.p045n.AbstractC0367m r2) {
                r1 = this;
                a.n.m r0 = r1.f1161a
                r0.mo2779n()
                r2.mo2785b(r1)
                return
        }
    }

    /* renamed from: a.n.q$b */
    /* loaded from: classes.dex */
    static class C0381b extends p000a.p045n.C0374n {

        /* renamed from: a */
        p000a.p045n.C0379q f1162a;

        C0381b(p000a.p045n.C0379q r1) {
                r0 = this;
                r0.<init>()
                r0.f1162a = r1
                return
        }

        @Override // p000a.p045n.C0374n, p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: a */
        public void mo2776a(p000a.p045n.AbstractC0367m r2) {
                r1 = this;
                a.n.q r2 = r1.f1162a
                boolean r0 = r2.f1159N
                if (r0 != 0) goto L_0x000e
                r2.m2812o()
                a.n.q r2 = r1.f1162a
                r0 = 1
                r2.f1159N = r0
            L_0x000e:
                return
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(p000a.p045n.AbstractC0367m r3) {
                r2 = this;
                a.n.q r0 = r2.f1162a
                int r1 = r0.f1158M
                int r1 = r1 + (-1)
                r0.f1158M = r1
                int r1 = r0.f1158M
                if (r1 != 0) goto L_0x0012
                r1 = 0
                r0.f1159N = r1
                r0.m2844a()
            L_0x0012:
                r3.mo2785b(r2)
                return
        }
    }

    public C0379q() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1156K = r0
            r0 = 1
            r1.f1157L = r0
            r0 = 0
            r1.f1159N = r0
            r1.f1160O = r0
            return
    }

    /* renamed from: q */
    private void m2777q() {
            r3 = this;
            a.n.q$b r0 = new a.n.q$b
            r0.<init>(r3)
            java.util.ArrayList<a.n.m> r1 = r3.f1156K
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x001b
            java.lang.Object r2 = r1.next()
            a.n.m r2 = (p000a.p045n.AbstractC0367m) r2
            r2.mo2795a(r0)
            goto L_0x000b
        L_0x001b:
            java.util.ArrayList<a.n.m> r0 = r3.f1156K
            int r0 = r0.size()
            r3.f1158M = r0
            return
    }

    /* renamed from: a */
    public p000a.p045n.AbstractC0367m m2799a(int r2) {
            r1 = this;
            if (r2 < 0) goto L_0x0014
            java.util.ArrayList<a.n.m> r0 = r1.f1156K
            int r0 = r0.size()
            if (r2 < r0) goto L_0x000b
            goto L_0x0014
        L_0x000b:
            java.util.ArrayList<a.n.m> r0 = r1.f1156K
            java.lang.Object r2 = r0.get(r2)
            a.n.m r2 = (p000a.p045n.AbstractC0367m) r2
            return r2
        L_0x0014:
            r2 = 0
            return r2
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public /* bridge */ /* synthetic */ p000a.p045n.AbstractC0367m mo2798a(long r1) {
            r0 = this;
            r0.mo2798a(r1)
            return r0
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public /* bridge */ /* synthetic */ p000a.p045n.AbstractC0367m mo2795a(p000a.p045n.AbstractC0367m.AbstractC0373f r1) {
            r0 = this;
            a.n.q r1 = r0.mo2795a(r1)
            return r1
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public /* bridge */ /* synthetic */ p000a.p045n.AbstractC0367m mo2791a(android.animation.TimeInterpolator r1) {
            r0 = this;
            a.n.q r1 = r0.mo2791a(r1)
            return r1
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public /* bridge */ /* synthetic */ p000a.p045n.AbstractC0367m mo2790a(android.view.View r1) {
            r0 = this;
            a.n.q r1 = r0.mo2790a(r1)
            return r1
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public p000a.p045n.C0379q mo2798a(long r6) {
            r5 = this;
            super.mo2798a(r6)
            long r0 = r5.f1118d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0022
            java.util.ArrayList<a.n.m> r0 = r5.f1156K
            int r0 = r0.size()
            r1 = 0
        L_0x0012:
            if (r1 >= r0) goto L_0x0022
            java.util.ArrayList<a.n.m> r2 = r5.f1156K
            java.lang.Object r2 = r2.get(r1)
            a.n.m r2 = (p000a.p045n.AbstractC0367m) r2
            r2.mo2798a(r6)
            int r1 = r1 + 1
            goto L_0x0012
        L_0x0022:
            return r5
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public p000a.p045n.C0379q mo2795a(p000a.p045n.AbstractC0367m.AbstractC0373f r1) {
            r0 = this;
            super.mo2795a(r1)
            r1 = r0
            a.n.q r1 = (p000a.p045n.C0379q) r1
            return r1
    }

    /* renamed from: a */
    public p000a.p045n.C0379q m2794a(p000a.p045n.AbstractC0367m r6) {
            r5 = this;
            java.util.ArrayList<a.n.m> r0 = r5.f1156K
            r0.add(r6)
            r6.f1133s = r5
            long r0 = r5.f1118d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0012
            r6.mo2798a(r0)
        L_0x0012:
            int r0 = r5.f1160O
            r0 = r0 & 1
            if (r0 == 0) goto L_0x001f
            android.animation.TimeInterpolator r0 = r5.m2822d()
            r6.mo2791a(r0)
        L_0x001f:
            int r0 = r5.f1160O
            r0 = r0 & 2
            if (r0 == 0) goto L_0x002c
            a.n.p r0 = r5.m2819g()
            r6.mo2793a(r0)
        L_0x002c:
            int r0 = r5.f1160O
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0039
            a.n.g r0 = r5.m2820f()
            r6.mo2797a(r0)
        L_0x0039:
            int r0 = r5.f1160O
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0046
            a.n.m$e r0 = r5.m2824c()
            r6.mo2796a(r0)
        L_0x0046:
            return r5
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public p000a.p045n.C0379q mo2791a(android.animation.TimeInterpolator r4) {
            r3 = this;
            int r0 = r3.f1160O
            r0 = r0 | 1
            r3.f1160O = r0
            java.util.ArrayList<a.n.m> r0 = r3.f1156K
            if (r0 == 0) goto L_0x001f
            int r0 = r0.size()
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x001f
            java.util.ArrayList<a.n.m> r2 = r3.f1156K
            java.lang.Object r2 = r2.get(r1)
            a.n.m r2 = (p000a.p045n.AbstractC0367m) r2
            r2.mo2791a(r4)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x001f:
            super.mo2791a(r4)
            r4 = r3
            a.n.q r4 = (p000a.p045n.C0379q) r4
            return r4
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public p000a.p045n.C0379q mo2790a(android.view.View r3) {
            r2 = this;
            r0 = 0
        L_0x0001:
            java.util.ArrayList<a.n.m> r1 = r2.f1156K
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0017
            java.util.ArrayList<a.n.m> r1 = r2.f1156K
            java.lang.Object r1 = r1.get(r0)
            a.n.m r1 = (p000a.p045n.AbstractC0367m) r1
            r1.mo2790a(r3)
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0017:
            super.mo2790a(r3)
            r3 = r2
            a.n.q r3 = (p000a.p045n.C0379q) r3
            return r3
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    java.lang.String mo2788a(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = super.mo2788a(r6)
            r1 = 0
        L_0x0005:
            java.util.ArrayList<a.n.m> r2 = r5.f1156K
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0041
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            java.util.ArrayList<a.n.m> r0 = r5.f1156K
            java.lang.Object r0 = r0.get(r1)
            a.n.m r0 = (p000a.p045n.AbstractC0367m) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = "  "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = r0.mo2788a(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0041:
            return r0
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2797a(p000a.p045n.AbstractC0352g r3) {
            r2 = this;
            super.mo2797a(r3)
            int r0 = r2.f1160O
            r0 = r0 | 4
            r2.f1160O = r0
            r0 = 0
        L_0x000a:
            java.util.ArrayList<a.n.m> r1 = r2.f1156K
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0020
            java.util.ArrayList<a.n.m> r1 = r2.f1156K
            java.lang.Object r1 = r1.get(r0)
            a.n.m r1 = (p000a.p045n.AbstractC0367m) r1
            r1.mo2797a(r3)
            int r0 = r0 + 1
            goto L_0x000a
        L_0x0020:
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2796a(p000a.p045n.AbstractC0367m.AbstractC0372e r4) {
            r3 = this;
            super.mo2796a(r4)
            int r0 = r3.f1160O
            r0 = r0 | 8
            r3.f1160O = r0
            java.util.ArrayList<a.n.m> r0 = r3.f1156K
            int r0 = r0.size()
            r1 = 0
        L_0x0010:
            if (r1 >= r0) goto L_0x0020
            java.util.ArrayList<a.n.m> r2 = r3.f1156K
            java.lang.Object r2 = r2.get(r1)
            a.n.m r2 = (p000a.p045n.AbstractC0367m) r2
            r2.mo2796a(r4)
            int r1 = r1 + 1
            goto L_0x0010
        L_0x0020:
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2793a(p000a.p045n.AbstractC0378p r4) {
            r3 = this;
            super.mo2793a(r4)
            int r0 = r3.f1160O
            r0 = r0 | 2
            r3.f1160O = r0
            java.util.ArrayList<a.n.m> r0 = r3.f1156K
            int r0 = r0.size()
            r1 = 0
        L_0x0010:
            if (r1 >= r0) goto L_0x0020
            java.util.ArrayList<a.n.m> r2 = r3.f1156K
            java.lang.Object r2 = r2.get(r1)
            a.n.m r2 = (p000a.p045n.AbstractC0367m) r2
            r2.mo2793a(r4)
            int r1 = r1 + 1
            goto L_0x0010
        L_0x0020:
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2792a(p000a.p045n.C0383s r4) {
            r3 = this;
            android.view.View r0 = r4.f1167b
            boolean r0 = r3.m2826b(r0)
            if (r0 == 0) goto L_0x002b
            java.util.ArrayList<a.n.m> r0 = r3.f1156K
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r0.next()
            a.n.m r1 = (p000a.p045n.AbstractC0367m) r1
            android.view.View r2 = r4.f1167b
            boolean r2 = r1.m2826b(r2)
            if (r2 == 0) goto L_0x000e
            r1.mo2792a(r4)
            java.util.ArrayList<a.n.m> r2 = r4.f1168c
            r2.add(r1)
            goto L_0x000e
        L_0x002b:
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    protected void mo2789a(android.view.ViewGroup r13, p000a.p045n.C0384t r14, p000a.p045n.C0384t r15, java.util.ArrayList<p000a.p045n.C0383s> r16, java.util.ArrayList<p000a.p045n.C0383s> r17) {
            r12 = this;
            r0 = r12
            long r1 = r12.m2818h()
            java.util.ArrayList<a.n.m> r3 = r0.f1156K
            int r3 = r3.size()
            r4 = 0
        L_0x000c:
            if (r4 >= r3) goto L_0x0040
            java.util.ArrayList<a.n.m> r5 = r0.f1156K
            java.lang.Object r5 = r5.get(r4)
            r6 = r5
            a.n.m r6 = (p000a.p045n.AbstractC0367m) r6
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            boolean r5 = r0.f1157L
            if (r5 != 0) goto L_0x0023
            if (r4 != 0) goto L_0x0033
        L_0x0023:
            long r9 = r6.m2818h()
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0030
            long r9 = r9 + r1
            r6.mo2786b(r9)
            goto L_0x0033
        L_0x0030:
            r6.mo2786b(r1)
        L_0x0033:
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r6.mo2789a(r7, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0040:
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: b */
    public /* bridge */ /* synthetic */ p000a.p045n.AbstractC0367m mo2786b(long r1) {
            r0 = this;
            a.n.q r1 = r0.mo2786b(r1)
            return r1
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: b */
    public /* bridge */ /* synthetic */ p000a.p045n.AbstractC0367m mo2785b(p000a.p045n.AbstractC0367m.AbstractC0373f r1) {
            r0 = this;
            a.n.q r1 = r0.mo2785b(r1)
            return r1
    }

    /* renamed from: b */
    public p000a.p045n.C0379q m2787b(int r4) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L_0x0020
            if (r4 != r0) goto L_0x0009
            r4 = 0
            r3.f1157L = r4
            goto L_0x0022
        L_0x0009:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid parameter for TransitionSet ordering: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0020:
            r3.f1157L = r0
        L_0x0022:
            return r3
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: b */
    public p000a.p045n.C0379q mo2786b(long r1) {
            r0 = this;
            super.mo2786b(r1)
            r1 = r0
            a.n.q r1 = (p000a.p045n.C0379q) r1
            return r1
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: b */
    public p000a.p045n.C0379q mo2785b(p000a.p045n.AbstractC0367m.AbstractC0373f r1) {
            r0 = this;
            super.mo2785b(r1)
            r1 = r0
            a.n.q r1 = (p000a.p045n.C0379q) r1
            return r1
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: b */
    void mo2784b(p000a.p045n.C0383s r4) {
            r3 = this;
            super.mo2784b(r4)
            java.util.ArrayList<a.n.m> r0 = r3.f1156K
            int r0 = r0.size()
            r1 = 0
        L_0x000a:
            if (r1 >= r0) goto L_0x001a
            java.util.ArrayList<a.n.m> r2 = r3.f1156K
            java.lang.Object r2 = r2.get(r1)
            a.n.m r2 = (p000a.p045n.AbstractC0367m) r2
            r2.mo2784b(r4)
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001a:
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: c */
    public void mo2783c(p000a.p045n.C0383s r4) {
            r3 = this;
            android.view.View r0 = r4.f1167b
            boolean r0 = r3.m2826b(r0)
            if (r0 == 0) goto L_0x002b
            java.util.ArrayList<a.n.m> r0 = r3.f1156K
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r0.next()
            a.n.m r1 = (p000a.p045n.AbstractC0367m) r1
            android.view.View r2 = r4.f1167b
            boolean r2 = r1.m2826b(r2)
            if (r2 == 0) goto L_0x000e
            r1.mo2783c(r4)
            java.util.ArrayList<a.n.m> r2 = r4.f1168c
            r2.add(r1)
            goto L_0x000e
        L_0x002b:
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: c */
    public void mo2782c(android.view.View r4) {
            r3 = this;
            super.mo2782c(r4)
            java.util.ArrayList<a.n.m> r0 = r3.f1156K
            int r0 = r0.size()
            r1 = 0
        L_0x000a:
            if (r1 >= r0) goto L_0x001a
            java.util.ArrayList<a.n.m> r2 = r3.f1156K
            java.lang.Object r2 = r2.get(r1)
            a.n.m r2 = (p000a.p045n.AbstractC0367m) r2
            r2.mo2782c(r4)
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001a:
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    public p000a.p045n.AbstractC0367m clone() {
            r4 = this;
            a.n.m r0 = super.clone()
            a.n.q r0 = (p000a.p045n.C0379q) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f1156K = r1
            java.util.ArrayList<a.n.m> r1 = r4.f1156K
            int r1 = r1.size()
            r2 = 0
        L_0x0014:
            if (r2 >= r1) goto L_0x0028
            java.util.ArrayList<a.n.m> r3 = r4.f1156K
            java.lang.Object r3 = r3.get(r2)
            a.n.m r3 = (p000a.p045n.AbstractC0367m) r3
            a.n.m r3 = r3.clone()
            r0.m2794a(r3)
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0028:
            return r0
    }

    @Override // p000a.p045n.AbstractC0367m
    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            a.n.m r0 = r1.clone()
            return r0
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: d */
    public /* bridge */ /* synthetic */ p000a.p045n.AbstractC0367m mo2781d(android.view.View r1) {
            r0 = this;
            a.n.q r1 = r0.mo2781d(r1)
            return r1
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: d */
    public p000a.p045n.C0379q mo2781d(android.view.View r3) {
            r2 = this;
            r0 = 0
        L_0x0001:
            java.util.ArrayList<a.n.m> r1 = r2.f1156K
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0017
            java.util.ArrayList<a.n.m> r1 = r2.f1156K
            java.lang.Object r1 = r1.get(r0)
            a.n.m r1 = (p000a.p045n.AbstractC0367m) r1
            r1.mo2781d(r3)
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0017:
            super.mo2781d(r3)
            r3 = r2
            a.n.q r3 = (p000a.p045n.C0379q) r3
            return r3
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: e */
    public void mo2780e(android.view.View r4) {
            r3 = this;
            super.mo2780e(r4)
            java.util.ArrayList<a.n.m> r0 = r3.f1156K
            int r0 = r0.size()
            r1 = 0
        L_0x000a:
            if (r1 >= r0) goto L_0x001a
            java.util.ArrayList<a.n.m> r2 = r3.f1156K
            java.lang.Object r2 = r2.get(r1)
            a.n.m r2 = (p000a.p045n.AbstractC0367m) r2
            r2.mo2780e(r4)
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001a:
            return
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: n */
    protected void mo2779n() {
            r4 = this;
            java.util.ArrayList<a.n.m> r0 = r4.f1156K
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000f
            r4.m2812o()
            r4.m2844a()
            return
        L_0x000f:
            r4.m2777q()
            boolean r0 = r4.f1157L
            if (r0 != 0) goto L_0x004b
            r0 = 1
        L_0x0017:
            java.util.ArrayList<a.n.m> r1 = r4.f1156K
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x003c
            java.util.ArrayList<a.n.m> r1 = r4.f1156K
            int r2 = r0 + (-1)
            java.lang.Object r1 = r1.get(r2)
            a.n.m r1 = (p000a.p045n.AbstractC0367m) r1
            java.util.ArrayList<a.n.m> r2 = r4.f1156K
            java.lang.Object r2 = r2.get(r0)
            a.n.m r2 = (p000a.p045n.AbstractC0367m) r2
            a.n.q$a r3 = new a.n.q$a
            r3.<init>(r4, r2)
            r1.mo2795a(r3)
            int r0 = r0 + 1
            goto L_0x0017
        L_0x003c:
            java.util.ArrayList<a.n.m> r0 = r4.f1156K
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            a.n.m r0 = (p000a.p045n.AbstractC0367m) r0
            if (r0 == 0) goto L_0x0061
            r0.mo2779n()
            goto L_0x0061
        L_0x004b:
            java.util.ArrayList<a.n.m> r0 = r4.f1156K
            java.util.Iterator r0 = r0.iterator()
        L_0x0051:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0061
            java.lang.Object r1 = r0.next()
            a.n.m r1 = (p000a.p045n.AbstractC0367m) r1
            r1.mo2779n()
            goto L_0x0051
        L_0x0061:
            return
    }

    /* renamed from: p */
    public int m2778p() {
            r1 = this;
            java.util.ArrayList<a.n.m> r0 = r1.f1156K
            int r0 = r0.size()
            return r0
    }
}
