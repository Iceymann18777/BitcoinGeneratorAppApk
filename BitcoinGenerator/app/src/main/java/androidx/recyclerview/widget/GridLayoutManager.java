package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: H */
    boolean f2830H;

    /* renamed from: I */
    int f2831I;

    /* renamed from: J */
    int[] f2832J;

    /* renamed from: K */
    android.view.View[] f2833K;

    /* renamed from: L */
    final android.util.SparseIntArray f2834L;

    /* renamed from: M */
    final android.util.SparseIntArray f2835M;

    /* renamed from: N */
    androidx.recyclerview.widget.GridLayoutManager.AbstractC0765c f2836N;

    /* renamed from: O */
    final android.graphics.Rect f2837O;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes.dex */
    public static final class C0763a extends androidx.recyclerview.widget.GridLayoutManager.AbstractC0765c {
        public C0763a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0765c
        /* renamed from: a */
        public int mo1323a(int r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0765c
        /* renamed from: c */
        public int mo1320c(int r1, int r2) {
                r0 = this;
                int r1 = r1 % r2
                return r1
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0764b extends androidx.recyclerview.widget.C0813j.C0840p {

        /* renamed from: e */
        int f2838e;

        /* renamed from: f */
        int f2839f;

        public C0764b(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.f2838e = r1
                r1 = 0
                r0.f2839f = r1
                return
        }

        public C0764b(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.f2838e = r1
                r1 = 0
                r0.f2839f = r1
                return
        }

        public C0764b(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.f2838e = r1
                r1 = 0
                r0.f2839f = r1
                return
        }

        public C0764b(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.f2838e = r1
                r1 = 0
                r0.f2839f = r1
                return
        }

        /* renamed from: e */
        public int m1326e() {
                r1 = this;
                int r0 = r1.f2838e
                return r0
        }

        /* renamed from: f */
        public int m1325f() {
                r1 = this;
                int r0 = r1.f2839f
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0765c {

        /* renamed from: a */
        final android.util.SparseIntArray f2840a;

        /* renamed from: b */
        private boolean f2841b;

        public AbstractC0765c() {
                r1 = this;
                r1.<init>()
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                r1.f2840a = r0
                r0 = 0
                r1.f2841b = r0
                return
        }

        /* renamed from: a */
        public abstract int mo1323a(int r1);

        /* renamed from: a */
        int m1322a(int r3, int r4) {
                r2 = this;
                boolean r0 = r2.f2841b
                if (r0 != 0) goto L_0x0009
                int r3 = r2.mo1320c(r3, r4)
                return r3
            L_0x0009:
                android.util.SparseIntArray r0 = r2.f2840a
                r1 = -1
                int r0 = r0.get(r3, r1)
                if (r0 == r1) goto L_0x0013
                return r0
            L_0x0013:
                int r4 = r2.mo1320c(r3, r4)
                android.util.SparseIntArray r0 = r2.f2840a
                r0.put(r3, r4)
                return r4
        }

        /* renamed from: a */
        public void m1324a() {
                r1 = this;
                android.util.SparseIntArray r0 = r1.f2840a
                r0.clear()
                return
        }

        /* renamed from: b */
        public int m1321b(int r7, int r8) {
                r6 = this;
                int r0 = r6.mo1323a(r7)
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
            L_0x0008:
                if (r2 >= r7) goto L_0x001d
                int r5 = r6.mo1323a(r2)
                int r3 = r3 + r5
                if (r3 != r8) goto L_0x0015
                int r4 = r4 + 1
                r3 = 0
                goto L_0x001a
            L_0x0015:
                if (r3 <= r8) goto L_0x001a
                int r4 = r4 + 1
                r3 = r5
            L_0x001a:
                int r2 = r2 + 1
                goto L_0x0008
            L_0x001d:
                int r3 = r3 + r0
                if (r3 <= r8) goto L_0x0022
                int r4 = r4 + 1
            L_0x0022:
                return r4
        }

        /* renamed from: c */
        public abstract int mo1320c(int r1, int r2);
    }

    public GridLayoutManager(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            r0 = 0
            r1.f2830H = r0
            r0 = -1
            r1.f2831I = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.f2834L = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.f2835M = r0
            androidx.recyclerview.widget.GridLayoutManager$a r0 = new androidx.recyclerview.widget.GridLayoutManager$a
            r0.<init>()
            r1.f2836N = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f2837O = r0
            androidx.recyclerview.widget.j$o$d r2 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m775a(r2, r3, r4, r5)
            int r2 = r2.f3231b
            r1.m1328j(r2)
            return
    }

    /* renamed from: K */
    private void m1342K() {
            r6 = this;
            int r0 = r6.m697e()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x002a
            android.view.View r2 = r6.m715c(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r2 = (androidx.recyclerview.widget.GridLayoutManager.C0764b) r2
            int r3 = r2.m654a()
            android.util.SparseIntArray r4 = r6.f2834L
            int r5 = r2.m1325f()
            r4.put(r3, r5)
            android.util.SparseIntArray r4 = r6.f2835M
            int r2 = r2.m1326e()
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto L_0x0005
        L_0x002a:
            return
    }

    /* renamed from: L */
    private void m1341L() {
            r1 = this;
            android.util.SparseIntArray r0 = r1.f2834L
            r0.clear()
            android.util.SparseIntArray r0 = r1.f2835M
            r0.clear()
            return
    }

    /* renamed from: M */
    private void m1340M() {
            r2 = this;
            android.view.View[] r0 = r2.f2833K
            if (r0 == 0) goto L_0x0009
            int r0 = r0.length
            int r1 = r2.f2831I
            if (r0 == r1) goto L_0x000f
        L_0x0009:
            int r0 = r2.f2831I
            android.view.View[] r0 = new android.view.View[r0]
            r2.f2833K = r0
        L_0x000f:
            return
    }

    /* renamed from: N */
    private void m1339N() {
            r2 = this;
            int r0 = r2.m1315H()
            r1 = 1
            if (r0 != r1) goto L_0x0015
            int r0 = r2.m665q()
            int r1 = r2.m668o()
            int r0 = r0 - r1
            int r1 = r2.m670n()
            goto L_0x0022
        L_0x0015:
            int r0 = r2.m682h()
            int r1 = r2.m672m()
            int r0 = r0 - r1
            int r1 = r2.m666p()
        L_0x0022:
            int r0 = r0 - r1
            r2.m1327k(r0)
            return
    }

    /* renamed from: a */
    private int m1335a(androidx.recyclerview.widget.C0813j.C0847v r1, androidx.recyclerview.widget.C0813j.C0815a0 r2, int r3) {
            r0 = this;
            boolean r2 = r2.m902d()
            if (r2 != 0) goto L_0x000f
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f2836N
            int r2 = r0.f2831I
            int r1 = r1.m1321b(r3, r2)
            return r1
        L_0x000f:
            int r1 = r1.m629a(r3)
            r2 = -1
            if (r1 != r2) goto L_0x002e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find span size for pre layout position. "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GridLayoutManager"
            android.util.Log.w(r2, r1)
            r1 = 0
            return r1
        L_0x002e:
            androidx.recyclerview.widget.GridLayoutManager$c r2 = r0.f2836N
            int r3 = r0.f2831I
            int r1 = r2.m1321b(r1, r3)
            return r1
    }

    /* renamed from: a */
    private void m1338a(float r2, int r3) {
            r1 = this;
            int r0 = r1.f2831I
            float r0 = (float) r0
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            int r2 = java.lang.Math.max(r2, r3)
            r1.m1327k(r2)
            return
    }

    /* renamed from: a */
    private void m1337a(android.view.View r2, int r3, int r4, boolean r5) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.recyclerview.widget.j$p r0 = (androidx.recyclerview.widget.C0813j.C0840p) r0
            if (r5 == 0) goto L_0x000d
            boolean r5 = r1.m725b(r2, r3, r4, r0)
            goto L_0x0011
        L_0x000d:
            boolean r5 = r1.m768a(r2, r3, r4, r0)
        L_0x0011:
            if (r5 == 0) goto L_0x0016
            r2.measure(r3, r4)
        L_0x0016:
            return
    }

    /* renamed from: a */
    private void m1336a(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r0 = (androidx.recyclerview.widget.GridLayoutManager.C0764b) r0
            android.graphics.Rect r1 = r0.f3235b
            int r2 = r1.top
            int r3 = r1.bottom
            int r2 = r2 + r3
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r3 = r1.left
            int r1 = r1.right
            int r3 = r3 + r1
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r1 = r0.rightMargin
            int r3 = r3 + r1
            int r1 = r0.f2838e
            int r4 = r0.f2839f
            int r1 = r8.m1329f(r1, r4)
            int r4 = r8.f2849s
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L_0x0043
            int r4 = r0.width
            int r10 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m784a(r1, r10, r3, r4, r5)
            androidx.recyclerview.widget.i r1 = r8.f2851u
            int r1 = r1.mo1028g()
            int r3 = r8.m680i()
            int r0 = r0.height
            int r0 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m784a(r1, r3, r2, r0, r6)
            goto L_0x005c
        L_0x0043:
            int r4 = r0.height
            int r10 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m784a(r1, r10, r2, r4, r5)
            androidx.recyclerview.widget.i r1 = r8.f2851u
            int r1 = r1.mo1028g()
            int r2 = r8.m664r()
            int r0 = r0.width
            int r0 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m784a(r1, r2, r3, r0, r6)
            r7 = r0
            r0 = r10
            r10 = r7
        L_0x005c:
            r8.m1337a(r9, r10, r0, r11)
            return
    }

    /* renamed from: a */
    private void m1334a(androidx.recyclerview.widget.C0813j.C0847v r4, androidx.recyclerview.widget.C0813j.C0815a0 r5, int r6, int r7, boolean r8) {
            r3 = this;
            r7 = 0
            r0 = -1
            if (r8 == 0) goto L_0x0009
            r0 = 1
            r0 = r6
            r6 = 0
            r8 = 1
            goto L_0x000c
        L_0x0009:
            int r6 = r6 + (-1)
            r8 = -1
        L_0x000c:
            if (r6 == r0) goto L_0x0029
            android.view.View[] r1 = r3.f2833K
            r1 = r1[r6]
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r2 = (androidx.recyclerview.widget.GridLayoutManager.C0764b) r2
            int r1 = r3.m673l(r1)
            int r1 = r3.m1330c(r4, r5, r1)
            r2.f2839f = r1
            r2.f2838e = r7
            int r1 = r2.f2839f
            int r7 = r7 + r1
            int r6 = r6 + r8
            goto L_0x000c
        L_0x0029:
            return
    }

    /* renamed from: a */
    static int[] m1333a(int[] r5, int r6, int r7) {
            r0 = 1
            if (r5 == 0) goto L_0x000e
            int r1 = r5.length
            int r2 = r6 + 1
            if (r1 != r2) goto L_0x000e
            int r1 = r5.length
            int r1 = r1 - r0
            r1 = r5[r1]
            if (r1 == r7) goto L_0x0012
        L_0x000e:
            int r5 = r6 + 1
            int[] r5 = new int[r5]
        L_0x0012:
            r1 = 0
            r5[r1] = r1
            int r2 = r7 / r6
            int r7 = r7 % r6
            r3 = 0
        L_0x0019:
            if (r0 > r6) goto L_0x002d
            int r1 = r1 + r7
            if (r1 <= 0) goto L_0x0026
            int r4 = r6 - r1
            if (r4 >= r7) goto L_0x0026
            int r4 = r2 + 1
            int r1 = r1 - r6
            goto L_0x0027
        L_0x0026:
            r4 = r2
        L_0x0027:
            int r3 = r3 + r4
            r5[r0] = r3
            int r0 = r0 + 1
            goto L_0x0019
        L_0x002d:
            return r5
    }

    /* renamed from: b */
    private int m1332b(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3, int r4) {
            r1 = this;
            boolean r3 = r3.m902d()
            if (r3 != 0) goto L_0x000f
            androidx.recyclerview.widget.GridLayoutManager$c r2 = r1.f2836N
            int r3 = r1.f2831I
            int r2 = r2.m1322a(r4, r3)
            return r2
        L_0x000f:
            android.util.SparseIntArray r3 = r1.f2835M
            r0 = -1
            int r3 = r3.get(r4, r0)
            if (r3 == r0) goto L_0x0019
            return r3
        L_0x0019:
            int r2 = r2.m629a(r4)
            if (r2 != r0) goto L_0x0037
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
        L_0x0037:
            androidx.recyclerview.widget.GridLayoutManager$c r3 = r1.f2836N
            int r4 = r1.f2831I
            int r2 = r3.m1322a(r2, r4)
            return r2
    }

    /* renamed from: b */
    private void m1331b(androidx.recyclerview.widget.C0813j.C0847v r5, androidx.recyclerview.widget.C0813j.C0815a0 r6, androidx.recyclerview.widget.LinearLayoutManager.C0766a r7, int r8) {
            r4 = this;
            r0 = 1
            if (r8 != r0) goto L_0x0005
            r8 = 1
            goto L_0x0006
        L_0x0005:
            r8 = 0
        L_0x0006:
            int r1 = r7.f2858b
            int r1 = r4.m1332b(r5, r6, r1)
            if (r8 == 0) goto L_0x001f
        L_0x000e:
            if (r1 <= 0) goto L_0x0035
            int r8 = r7.f2858b
            if (r8 <= 0) goto L_0x0035
            int r8 = r8 + (-1)
            r7.f2858b = r8
            int r8 = r7.f2858b
            int r1 = r4.m1332b(r5, r6, r8)
            goto L_0x000e
        L_0x001f:
            int r8 = r6.m907a()
            int r8 = r8 - r0
            int r0 = r7.f2858b
        L_0x0026:
            if (r0 >= r8) goto L_0x0033
            int r2 = r0 + 1
            int r3 = r4.m1332b(r5, r6, r2)
            if (r3 <= r1) goto L_0x0033
            r0 = r2
            r1 = r3
            goto L_0x0026
        L_0x0033:
            r7.f2858b = r0
        L_0x0035:
            return
    }

    /* renamed from: c */
    private int m1330c(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3, int r4) {
            r1 = this;
            boolean r3 = r3.m902d()
            if (r3 != 0) goto L_0x000d
            androidx.recyclerview.widget.GridLayoutManager$c r2 = r1.f2836N
            int r2 = r2.mo1323a(r4)
            return r2
        L_0x000d:
            android.util.SparseIntArray r3 = r1.f2834L
            r0 = -1
            int r3 = r3.get(r4, r0)
            if (r3 == r0) goto L_0x0017
            return r3
        L_0x0017:
            int r2 = r2.m629a(r4)
            if (r2 != r0) goto L_0x0035
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 1
            return r2
        L_0x0035:
            androidx.recyclerview.widget.GridLayoutManager$c r3 = r1.f2836N
            int r2 = r3.mo1323a(r2)
            return r2
    }

    /* renamed from: k */
    private void m1327k(int r3) {
            r2 = this;
            int[] r0 = r2.f2832J
            int r1 = r2.f2831I
            int[] r3 = m1333a(r0, r1, r3)
            r2.f2832J = r3
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: C */
    public boolean mo789C() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r1.f2845D
            if (r0 != 0) goto L_0x000a
            boolean r0 = r1.f2830H
            if (r0 != 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo778a(int r1, androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r0 = this;
            r0.m1339N()
            r0.m1340M()
            int r1 = super.mo778a(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo751a(androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.C0813j.C0815a0 r4) {
            r2 = this;
            int r0 = r2.f2849s
            r1 = 1
            if (r0 != r1) goto L_0x0008
            int r3 = r2.f2831I
            return r3
        L_0x0008:
            int r0 = r4.m907a()
            if (r0 >= r1) goto L_0x0010
            r3 = 0
            return r3
        L_0x0010:
            int r0 = r4.m907a()
            int r0 = r0 - r1
            int r3 = r2.m1335a(r3, r4, r0)
            int r3 = r3 + r1
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public android.view.View mo765a(android.view.View r24, int r25, androidx.recyclerview.widget.C0813j.C0847v r26, androidx.recyclerview.widget.C0813j.C0815a0 r27) {
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.m713c(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C0764b) r5
            int r6 = r5.f2838e
            int r5 = r5.f2839f
            int r5 = r5 + r6
            android.view.View r7 = super.mo765a(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.m1280h(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f2854x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.m697e()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.m697e()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f2849s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.m1314I()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m1335a(r1, r2, r7)
            r10 = r4
            r8 = -1
            r15 = 0
            r16 = 0
            r17 = -1
        L_0x005d:
            if (r7 == r11) goto L_0x0147
            int r9 = r0.m1335a(r1, r2, r7)
            android.view.View r1 = r0.m715c(r7)
            if (r1 != r3) goto L_0x006b
            goto L_0x0147
        L_0x006b:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r9 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x0077
            goto L_0x0147
        L_0x0077:
            r18 = r3
            r19 = r8
            r21 = r10
            r20 = r11
            r8 = r16
            r10 = r17
            goto L_0x0133
        L_0x0085:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C0764b) r9
            int r2 = r9.f2838e
            r18 = r3
            int r3 = r9.f2839f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009d
            if (r2 != r6) goto L_0x009d
            if (r3 != r5) goto L_0x009d
            return r1
        L_0x009d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00ad
        L_0x00a5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b9
            if (r10 != 0) goto L_0x00b9
        L_0x00ad:
            r19 = r8
            r21 = r10
        L_0x00b1:
            r20 = r11
            r8 = r16
            r10 = r17
        L_0x00b7:
            r11 = 1
            goto L_0x0103
        L_0x00b9:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00da
            if (r10 <= r15) goto L_0x00d0
        L_0x00cd:
            r19 = r8
            goto L_0x00b1
        L_0x00d0:
            if (r10 != r15) goto L_0x00fa
            if (r2 <= r8) goto L_0x00d6
            r10 = 1
            goto L_0x00d7
        L_0x00d6:
            r10 = 0
        L_0x00d7:
            if (r13 != r10) goto L_0x00fa
            goto L_0x00cd
        L_0x00da:
            if (r4 != 0) goto L_0x00fa
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.m759a(r1, r8, r11)
            r8 = r16
            if (r22 == 0) goto L_0x0100
            if (r10 <= r8) goto L_0x00ef
            r10 = r17
            goto L_0x0103
        L_0x00ef:
            if (r10 != r8) goto L_0x0100
            r10 = r17
            if (r2 <= r10) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r11 = 0
        L_0x00f7:
            if (r13 != r11) goto L_0x0102
            goto L_0x00b7
        L_0x00fa:
            r19 = r8
            r20 = r11
            r8 = r16
        L_0x0100:
            r10 = r17
        L_0x0102:
            r11 = 0
        L_0x0103:
            if (r11 == 0) goto L_0x0133
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0120
            int r4 = r9.f2838e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r15 = r3
            r16 = r8
            r17 = r10
            r10 = r21
            r8 = r4
            r4 = r1
            goto L_0x013b
        L_0x0120:
            int r8 = r9.f2838e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r16 = r3
            r17 = r8
            r8 = r19
            goto L_0x013b
        L_0x0133:
            r16 = r8
            r17 = r10
            r8 = r19
            r10 = r21
        L_0x013b:
            int r7 = r7 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005d
        L_0x0147:
            r21 = r10
            if (r4 == 0) goto L_0x014c
            goto L_0x014e
        L_0x014c:
            r4 = r21
        L_0x014e:
            return r4
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    android.view.View mo1299a(androidx.recyclerview.widget.C0813j.C0847v r8, androidx.recyclerview.widget.C0813j.C0815a0 r9, int r10, int r11, int r12) {
            r7 = this;
            r7.m1318E()
            androidx.recyclerview.widget.i r0 = r7.f2851u
            int r0 = r0.mo1030f()
            androidx.recyclerview.widget.i r1 = r7.f2851u
            int r1 = r1.mo1038b()
            if (r11 <= r10) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = -1
        L_0x0014:
            r3 = 0
            r4 = r3
        L_0x0016:
            if (r10 == r11) goto L_0x0052
            android.view.View r5 = r7.m715c(r10)
            int r6 = r7.m673l(r5)
            if (r6 < 0) goto L_0x0050
            if (r6 >= r12) goto L_0x0050
            int r6 = r7.m1332b(r8, r9, r6)
            if (r6 == 0) goto L_0x002b
            goto L_0x0050
        L_0x002b:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.recyclerview.widget.j$p r6 = (androidx.recyclerview.widget.C0813j.C0840p) r6
            boolean r6 = r6.m652c()
            if (r6 == 0) goto L_0x003b
            if (r4 != 0) goto L_0x0050
            r4 = r5
            goto L_0x0050
        L_0x003b:
            androidx.recyclerview.widget.i r6 = r7.f2851u
            int r6 = r6.mo1033d(r5)
            if (r6 >= r1) goto L_0x004d
            androidx.recyclerview.widget.i r6 = r7.f2851u
            int r6 = r6.mo1039a(r5)
            if (r6 >= r0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            return r5
        L_0x004d:
            if (r3 != 0) goto L_0x0050
            r3 = r5
        L_0x0050:
            int r10 = r10 + r2
            goto L_0x0016
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r3 = r4
        L_0x0056:
            return r3
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public androidx.recyclerview.widget.C0813j.C0840p mo776a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public androidx.recyclerview.widget.C0813j.C0840p mo758a(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x000c
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L_0x000c:
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo774a(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.f2832J
            if (r0 != 0) goto L_0x0007
            super.mo774a(r5, r6, r7)
        L_0x0007:
            int r0 = r4.m670n()
            int r1 = r4.m668o()
            int r0 = r0 + r1
            int r1 = r4.m666p()
            int r2 = r4.m672m()
            int r1 = r1 + r2
            int r2 = r4.f2849s
            r3 = 1
            if (r2 != r3) goto L_0x003b
            int r5 = r5.height()
            int r5 = r5 + r1
            int r1 = r4.m676k()
            int r5 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m785a(r7, r5, r1)
            int[] r7 = r4.f2832J
            int r1 = r7.length
            int r1 = r1 - r3
            r7 = r7[r1]
            int r7 = r7 + r0
            int r0 = r4.m674l()
            int r6 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m785a(r6, r7, r0)
            goto L_0x0057
        L_0x003b:
            int r5 = r5.width()
            int r5 = r5 + r0
            int r0 = r4.m674l()
            int r6 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m785a(r6, r5, r0)
            int[] r5 = r4.f2832J
            int r0 = r5.length
            int r0 = r0 - r3
            r5 = r5[r0]
            int r5 = r5 + r1
            int r0 = r4.m676k()
            int r5 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m785a(r7, r5, r0)
        L_0x0057:
            r4.m714c(r6, r5)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    void mo1304a(androidx.recyclerview.widget.C0813j.C0815a0 r6, androidx.recyclerview.widget.LinearLayoutManager.C0768c r7, androidx.recyclerview.widget.C0813j.AbstractC0835o.AbstractC0838c r8) {
            r5 = this;
            int r0 = r5.f2831I
            r1 = 0
            r2 = r0
            r0 = 0
        L_0x0005:
            int r3 = r5.f2831I
            if (r0 >= r3) goto L_0x002d
            boolean r3 = r7.m1260a(r6)
            if (r3 == 0) goto L_0x002d
            if (r2 <= 0) goto L_0x002d
            int r3 = r7.f2869d
            int r4 = r7.f2872g
            int r4 = java.lang.Math.max(r1, r4)
            r8.mo655a(r3, r4)
            androidx.recyclerview.widget.GridLayoutManager$c r4 = r5.f2836N
            int r3 = r4.mo1323a(r3)
            int r2 = r2 - r3
            int r3 = r7.f2869d
            int r4 = r7.f2870e
            int r3 = r3 + r4
            r7.f2869d = r3
            int r0 = r0 + 1
            goto L_0x0005
        L_0x002d:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo746a(androidx.recyclerview.widget.C0813j.C0847v r8, androidx.recyclerview.widget.C0813j.C0815a0 r9, android.view.View r10, p000a.p018g.p029l.p030a0.C0191c r11) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager.C0764b
            if (r1 != 0) goto L_0x000c
            super.m763a(r10, r11)
            return
        L_0x000c:
            androidx.recyclerview.widget.GridLayoutManager$b r0 = (androidx.recyclerview.widget.GridLayoutManager.C0764b) r0
            int r10 = r0.m654a()
            int r8 = r7.m1335a(r8, r9, r10)
            int r9 = r7.f2849s
            r10 = 0
            r1 = 1
            if (r9 != 0) goto L_0x0038
            int r9 = r0.m1326e()
            int r2 = r0.m1325f()
            r4 = 1
            int r3 = r7.f2831I
            if (r3 <= r1) goto L_0x0033
            int r0 = r0.m1325f()
            int r3 = r7.f2831I
            if (r0 != r3) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            r6 = 0
            r1 = r9
            r3 = r8
            goto L_0x0052
        L_0x0038:
            r2 = 1
            int r3 = r0.m1326e()
            int r4 = r0.m1325f()
            int r9 = r7.f2831I
            if (r9 <= r1) goto L_0x004f
            int r9 = r0.m1325f()
            int r0 = r7.f2831I
            if (r9 != r0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            r6 = 0
            r1 = r8
        L_0x0052:
            a.g.l.a0.c$c r8 = p000a.p018g.p029l.p030a0.C0191c.C0194c.m3496a(r1, r2, r3, r4, r5, r6)
            r11.m3530b(r8)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    void mo1297a(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3, androidx.recyclerview.widget.LinearLayoutManager.C0766a r4, int r5) {
            r1 = this;
            super.mo1297a(r2, r3, r4, r5)
            r1.m1339N()
            int r0 = r3.m907a()
            if (r0 <= 0) goto L_0x0015
            boolean r0 = r3.m902d()
            if (r0 != 0) goto L_0x0015
            r1.m1331b(r2, r3, r4, r5)
        L_0x0015:
            r1.m1340M()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    void mo1296a(androidx.recyclerview.widget.C0813j.C0847v r19, androidx.recyclerview.widget.C0813j.C0815a0 r20, androidx.recyclerview.widget.LinearLayoutManager.C0768c r21, androidx.recyclerview.widget.LinearLayoutManager.C0767b r22) {
            r18 = this;
            r6 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            r8 = r22
            androidx.recyclerview.widget.i r0 = r6.f2851u
            int r9 = r0.mo1032e()
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 1
            if (r9 == r10) goto L_0x0017
            r13 = 1
            goto L_0x0018
        L_0x0017:
            r13 = 0
        L_0x0018:
            int r0 = r18.m697e()
            if (r0 <= 0) goto L_0x0026
            int[] r0 = r6.f2832J
            int r3 = r6.f2831I
            r0 = r0[r3]
            r14 = r0
            goto L_0x0027
        L_0x0026:
            r14 = 0
        L_0x0027:
            if (r13 == 0) goto L_0x002c
            r18.m1339N()
        L_0x002c:
            int r0 = r7.f2870e
            if (r0 != r11) goto L_0x0032
            r15 = 1
            goto L_0x0033
        L_0x0032:
            r15 = 0
        L_0x0033:
            int r0 = r6.f2831I
            if (r15 != 0) goto L_0x0044
            int r0 = r7.f2869d
            int r0 = r6.m1332b(r1, r2, r0)
            int r3 = r7.f2869d
            int r3 = r6.m1330c(r1, r2, r3)
            int r0 = r0 + r3
        L_0x0044:
            r4 = 0
            r5 = 0
        L_0x0046:
            int r3 = r6.f2831I
            if (r5 >= r3) goto L_0x009f
            boolean r3 = r7.m1260a(r2)
            if (r3 == 0) goto L_0x009f
            if (r0 <= 0) goto L_0x009f
            int r3 = r7.f2869d
            int r10 = r6.m1330c(r1, r2, r3)
            int r12 = r6.f2831I
            if (r10 > r12) goto L_0x0071
            int r0 = r0 - r10
            if (r0 >= 0) goto L_0x0060
            goto L_0x009f
        L_0x0060:
            android.view.View r3 = r7.m1259a(r1)
            if (r3 != 0) goto L_0x0067
            goto L_0x009f
        L_0x0067:
            int r4 = r4 + r10
            android.view.View[] r10 = r6.f2833K
            r10[r5] = r3
            int r5 = r5 + 1
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0046
        L_0x0071:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f2831I
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009f:
            if (r5 != 0) goto L_0x00a4
            r8.f2863b = r11
            return
        L_0x00a4:
            r10 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r5
            r12 = r5
            r5 = r15
            r0.m1334a(r1, r2, r3, r4, r5)
            r0 = 0
            r1 = 0
        L_0x00b3:
            if (r0 >= r12) goto L_0x0101
            android.view.View[] r2 = r6.f2833K
            r2 = r2[r0]
            java.util.List<androidx.recyclerview.widget.j$d0> r3 = r7.f2876k
            if (r3 != 0) goto L_0x00c9
            if (r15 == 0) goto L_0x00c4
            r6.m727b(r2)
            r3 = 0
            goto L_0x00d3
        L_0x00c4:
            r3 = 0
            r6.m726b(r2, r3)
            goto L_0x00d3
        L_0x00c9:
            r3 = 0
            if (r15 == 0) goto L_0x00d0
            r6.m772a(r2)
            goto L_0x00d3
        L_0x00d0:
            r6.m771a(r2, r3)
        L_0x00d3:
            android.graphics.Rect r4 = r6.f2837O
            r6.m762a(r2, r4)
            r6.m1336a(r2, r9, r3)
            androidx.recyclerview.widget.i r3 = r6.f2851u
            int r3 = r3.mo1037b(r2)
            if (r3 <= r1) goto L_0x00e4
            r1 = r3
        L_0x00e4:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r3 = (androidx.recyclerview.widget.GridLayoutManager.C0764b) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.i r5 = r6.f2851u
            int r2 = r5.mo1035c(r2)
            float r2 = (float) r2
            float r2 = r2 * r4
            int r3 = r3.f2839f
            float r3 = (float) r3
            float r2 = r2 / r3
            int r3 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fe
            r10 = r2
        L_0x00fe:
            int r0 = r0 + 1
            goto L_0x00b3
        L_0x0101:
            if (r13 == 0) goto L_0x011f
            r6.m1338a(r10, r14)
            r0 = 0
            r1 = 0
        L_0x0108:
            if (r0 >= r12) goto L_0x011f
            android.view.View[] r2 = r6.f2833K
            r2 = r2[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r6.m1336a(r2, r3, r11)
            androidx.recyclerview.widget.i r3 = r6.f2851u
            int r2 = r3.mo1037b(r2)
            if (r2 <= r1) goto L_0x011c
            r1 = r2
        L_0x011c:
            int r0 = r0 + 1
            goto L_0x0108
        L_0x011f:
            r0 = 0
        L_0x0120:
            if (r0 >= r12) goto L_0x0182
            android.view.View[] r2 = r6.f2833K
            r2 = r2[r0]
            androidx.recyclerview.widget.i r3 = r6.f2851u
            int r3 = r3.mo1037b(r2)
            if (r3 == r1) goto L_0x017c
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r3 = (androidx.recyclerview.widget.GridLayoutManager.C0764b) r3
            android.graphics.Rect r4 = r3.f3235b
            int r5 = r4.top
            int r9 = r4.bottom
            int r5 = r5 + r9
            int r9 = r3.topMargin
            int r5 = r5 + r9
            int r9 = r3.bottomMargin
            int r5 = r5 + r9
            int r9 = r4.left
            int r4 = r4.right
            int r9 = r9 + r4
            int r4 = r3.leftMargin
            int r9 = r9 + r4
            int r4 = r3.rightMargin
            int r9 = r9 + r4
            int r4 = r3.f2838e
            int r10 = r3.f2839f
            int r4 = r6.m1329f(r4, r10)
            int r10 = r6.f2849s
            if (r10 != r11) goto L_0x0168
            int r3 = r3.width
            r10 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r3 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m784a(r4, r10, r9, r3, r13)
            int r4 = r1 - r5
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r10)
            goto L_0x0178
        L_0x0168:
            r10 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r9 = r1 - r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r3 = r3.height
            int r4 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m784a(r4, r10, r5, r3, r13)
            r3 = r9
        L_0x0178:
            r6.m1337a(r2, r3, r4, r11)
            goto L_0x017f
        L_0x017c:
            r10 = 1073741824(0x40000000, float:2.0)
            r13 = 0
        L_0x017f:
            int r0 = r0 + 1
            goto L_0x0120
        L_0x0182:
            r13 = 0
            r8.f2862a = r1
            int r0 = r6.f2849s
            r2 = -1
            if (r0 != r11) goto L_0x019d
            int r0 = r7.f2871f
            if (r0 != r2) goto L_0x0195
            int r0 = r7.f2867b
            int r1 = r0 - r1
            r3 = r0
            r2 = r1
            goto L_0x019a
        L_0x0195:
            int r0 = r7.f2867b
            int r1 = r1 + r0
            r2 = r0
            r3 = r1
        L_0x019a:
            r0 = 0
            r1 = 0
            goto L_0x01b2
        L_0x019d:
            int r0 = r7.f2871f
            if (r0 != r2) goto L_0x01ad
            int r0 = r7.f2867b
            int r1 = r0 - r1
            r2 = 0
            r3 = 0
            r17 = r1
            r1 = r0
            r0 = r17
            goto L_0x01b2
        L_0x01ad:
            int r0 = r7.f2867b
            int r1 = r1 + r0
            r2 = 0
            r3 = 0
        L_0x01b2:
            if (r13 >= r12) goto L_0x0237
            android.view.View[] r4 = r6.f2833K
            r7 = r4[r13]
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            r9 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C0764b) r9
            int r4 = r6.f2849s
            if (r4 != r11) goto L_0x01f5
            boolean r0 = r18.m1314I()
            if (r0 == 0) goto L_0x01e2
            int r0 = r18.m670n()
            int[] r1 = r6.f2832J
            int r4 = r6.f2831I
            int r5 = r9.f2838e
            int r4 = r4 - r5
            r1 = r1[r4]
            int r0 = r0 + r1
            androidx.recyclerview.widget.i r1 = r6.f2851u
            int r1 = r1.mo1035c(r7)
            int r1 = r0 - r1
            r15 = r0
            r10 = r1
            goto L_0x0209
        L_0x01e2:
            int r0 = r18.m670n()
            int[] r1 = r6.f2832J
            int r4 = r9.f2838e
            r1 = r1[r4]
            int r0 = r0 + r1
            androidx.recyclerview.widget.i r1 = r6.f2851u
            int r1 = r1.mo1035c(r7)
            int r1 = r1 + r0
            goto L_0x0207
        L_0x01f5:
            int r2 = r18.m666p()
            int[] r3 = r6.f2832J
            int r4 = r9.f2838e
            r3 = r3[r4]
            int r2 = r2 + r3
            androidx.recyclerview.widget.i r3 = r6.f2851u
            int r3 = r3.mo1035c(r7)
            int r3 = r3 + r2
        L_0x0207:
            r10 = r0
            r15 = r1
        L_0x0209:
            r14 = r2
            r16 = r3
            r0 = r18
            r1 = r7
            r2 = r10
            r3 = r14
            r4 = r15
            r5 = r16
            r0.m769a(r1, r2, r3, r4, r5)
            boolean r0 = r9.m652c()
            if (r0 != 0) goto L_0x0223
            boolean r0 = r9.m653b()
            if (r0 == 0) goto L_0x0225
        L_0x0223:
            r8.f2864c = r11
        L_0x0225:
            boolean r0 = r8.f2865d
            boolean r1 = r7.hasFocusable()
            r0 = r0 | r1
            r8.f2865d = r0
            int r13 = r13 + 1
            r0 = r10
            r2 = r14
            r1 = r15
            r3 = r16
            goto L_0x01b2
        L_0x0237:
            android.view.View[] r0 = r6.f2833K
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo743a(androidx.recyclerview.widget.C0813j r1, int r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f2836N
            r1.m1324a()
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo742a(androidx.recyclerview.widget.C0813j r1, int r2, int r3, int r4) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f2836N
            r1.m1324a()
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo741a(androidx.recyclerview.widget.C0813j r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f2836N
            r1.m1324a()
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public boolean mo754a(androidx.recyclerview.widget.C0813j.C0840p r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager.C0764b
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo728b(int r1, androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r0 = this;
            r0.m1339N()
            r0.m1340M()
            int r1 = super.mo728b(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo721b(androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.C0813j.C0815a0 r4) {
            r2 = this;
            int r0 = r2.f2849s
            if (r0 != 0) goto L_0x0007
            int r3 = r2.f2831I
            return r3
        L_0x0007:
            int r0 = r4.m907a()
            r1 = 1
            if (r0 >= r1) goto L_0x0010
            r3 = 0
            return r3
        L_0x0010:
            int r0 = r4.m907a()
            int r0 = r0 - r1
            int r3 = r2.m1335a(r3, r4, r0)
            int r3 = r3 + r1
            return r3
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public void mo719b(androidx.recyclerview.widget.C0813j r1, int r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f2836N
            r1.m1324a()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: b */
    public void mo1288b(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L_0x0007
            r2 = 0
            super.mo1288b(r2)
            return
        L_0x0007:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "GridLayoutManager does not support stack from end. Consider using reverse layout"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: c */
    public androidx.recyclerview.widget.C0813j.C0840p mo716c() {
            r3 = this;
            int r0 = r3.f2849s
            r1 = -2
            r2 = -1
            if (r0 != 0) goto L_0x000c
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r1, r2)
            return r0
        L_0x000c:
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r2, r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: d */
    public void mo699d(androidx.recyclerview.widget.C0813j r1) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f2836N
            r1.m1324a()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public void mo693e(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r1 = this;
            boolean r0 = r3.m902d()
            if (r0 == 0) goto L_0x0009
            r1.m1342K()
        L_0x0009:
            super.mo693e(r2, r3)
            r1.m1341L()
            return
    }

    /* renamed from: f */
    int m1329f(int r4, int r5) {
            r3 = this;
            int r0 = r3.f2849s
            r1 = 1
            if (r0 != r1) goto L_0x0019
            boolean r0 = r3.m1314I()
            if (r0 == 0) goto L_0x0019
            int[] r0 = r3.f2832J
            int r1 = r3.f2831I
            int r2 = r1 - r4
            r2 = r0[r2]
            int r1 = r1 - r4
            int r1 = r1 - r5
            r4 = r0[r1]
            int r2 = r2 - r4
            return r2
        L_0x0019:
            int[] r0 = r3.f2832J
            int r5 = r5 + r4
            r5 = r0[r5]
            r4 = r0[r4]
            int r5 = r5 - r4
            return r5
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: g */
    public void mo683g(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            super.mo683g(r1)
            r1 = 0
            r0.f2830H = r1
            return
    }

    /* renamed from: j */
    public void m1328j(int r4) {
            r3 = this;
            int r0 = r3.f2831I
            if (r4 != r0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r3.f2830H = r0
            if (r4 < r0) goto L_0x0015
            r3.f2831I = r4
            androidx.recyclerview.widget.GridLayoutManager$c r4 = r3.f2836N
            r4.m1324a()
            r3.m657y()
            return
        L_0x0015:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Span count should be at least 1. Provided "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
