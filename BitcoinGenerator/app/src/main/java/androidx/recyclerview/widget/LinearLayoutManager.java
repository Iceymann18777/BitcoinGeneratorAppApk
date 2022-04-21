package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class LinearLayoutManager extends androidx.recyclerview.widget.C0813j.AbstractC0835o implements androidx.recyclerview.widget.AbstractC0806f, androidx.recyclerview.widget.C0813j.AbstractC0852z.AbstractC0853a {

    /* renamed from: A */
    int f2842A;

    /* renamed from: B */
    int f2843B;

    /* renamed from: C */
    private boolean f2844C;

    /* renamed from: D */
    androidx.recyclerview.widget.LinearLayoutManager.C0769d f2845D;

    /* renamed from: E */
    final androidx.recyclerview.widget.LinearLayoutManager.C0766a f2846E;

    /* renamed from: F */
    private final androidx.recyclerview.widget.LinearLayoutManager.C0767b f2847F;

    /* renamed from: G */
    private int f2848G;

    /* renamed from: s */
    int f2849s;

    /* renamed from: t */
    private androidx.recyclerview.widget.LinearLayoutManager.C0768c f2850t;

    /* renamed from: u */
    androidx.recyclerview.widget.AbstractC0810i f2851u;

    /* renamed from: v */
    private boolean f2852v;

    /* renamed from: w */
    private boolean f2853w;

    /* renamed from: x */
    boolean f2854x;

    /* renamed from: y */
    private boolean f2855y;

    /* renamed from: z */
    private boolean f2856z;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    static class C0766a {

        /* renamed from: a */
        androidx.recyclerview.widget.AbstractC0810i f2857a;

        /* renamed from: b */
        int f2858b;

        /* renamed from: c */
        int f2859c;

        /* renamed from: d */
        boolean f2860d;

        /* renamed from: e */
        boolean f2861e;

        C0766a() {
                r0 = this;
                r0.<init>()
                r0.m1265b()
                return
        }

        /* renamed from: a */
        void m1268a() {
                r1 = this;
                boolean r0 = r1.f2860d
                if (r0 == 0) goto L_0x000b
                androidx.recyclerview.widget.i r0 = r1.f2857a
                int r0 = r0.mo1038b()
                goto L_0x0011
            L_0x000b:
                androidx.recyclerview.widget.i r0 = r1.f2857a
                int r0 = r0.mo1030f()
            L_0x0011:
                r1.f2859c = r0
                return
        }

        /* renamed from: a */
        public void m1267a(android.view.View r2, int r3) {
                r1 = this;
                boolean r0 = r1.f2860d
                if (r0 == 0) goto L_0x0012
                androidx.recyclerview.widget.i r0 = r1.f2857a
                int r2 = r0.mo1039a(r2)
                androidx.recyclerview.widget.i r0 = r1.f2857a
                int r0 = r0.m1043h()
                int r2 = r2 + r0
                goto L_0x0018
            L_0x0012:
                androidx.recyclerview.widget.i r0 = r1.f2857a
                int r2 = r0.mo1033d(r2)
            L_0x0018:
                r1.f2859c = r2
                r1.f2858b = r3
                return
        }

        /* renamed from: a */
        boolean m1266a(android.view.View r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
                r1 = this;
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.recyclerview.widget.j$p r2 = (androidx.recyclerview.widget.C0813j.C0840p) r2
                boolean r0 = r2.m652c()
                if (r0 != 0) goto L_0x001e
                int r0 = r2.m654a()
                if (r0 < 0) goto L_0x001e
                int r2 = r2.m654a()
                int r3 = r3.m907a()
                if (r2 >= r3) goto L_0x001e
                r2 = 1
                goto L_0x001f
            L_0x001e:
                r2 = 0
            L_0x001f:
                return r2
        }

        /* renamed from: b */
        void m1265b() {
                r1 = this;
                r0 = -1
                r1.f2858b = r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.f2859c = r0
                r0 = 0
                r1.f2860d = r0
                r1.f2861e = r0
                return
        }

        /* renamed from: b */
        public void m1264b(android.view.View r5, int r6) {
                r4 = this;
                androidx.recyclerview.widget.i r0 = r4.f2857a
                int r0 = r0.m1043h()
                if (r0 < 0) goto L_0x000c
                r4.m1267a(r5, r6)
                return
            L_0x000c:
                r4.f2858b = r6
                boolean r6 = r4.f2860d
                r1 = 0
                if (r6 == 0) goto L_0x0055
                androidx.recyclerview.widget.i r6 = r4.f2857a
                int r6 = r6.mo1038b()
                int r6 = r6 - r0
                androidx.recyclerview.widget.i r0 = r4.f2857a
                int r0 = r0.mo1039a(r5)
                int r6 = r6 - r0
                androidx.recyclerview.widget.i r0 = r4.f2857a
                int r0 = r0.mo1038b()
                int r0 = r0 - r6
                r4.f2859c = r0
                if (r6 <= 0) goto L_0x0094
                androidx.recyclerview.widget.i r0 = r4.f2857a
                int r0 = r0.mo1037b(r5)
                int r2 = r4.f2859c
                int r2 = r2 - r0
                androidx.recyclerview.widget.i r0 = r4.f2857a
                int r0 = r0.mo1030f()
                androidx.recyclerview.widget.i r3 = r4.f2857a
                int r5 = r3.mo1033d(r5)
                int r5 = r5 - r0
                int r5 = java.lang.Math.min(r5, r1)
                int r0 = r0 + r5
                int r2 = r2 - r0
                if (r2 >= 0) goto L_0x0094
                int r5 = r4.f2859c
                int r0 = -r2
                int r6 = java.lang.Math.min(r6, r0)
                int r5 = r5 + r6
                r4.f2859c = r5
                goto L_0x0094
            L_0x0055:
                androidx.recyclerview.widget.i r6 = r4.f2857a
                int r6 = r6.mo1033d(r5)
                androidx.recyclerview.widget.i r2 = r4.f2857a
                int r2 = r2.mo1030f()
                int r2 = r6 - r2
                r4.f2859c = r6
                if (r2 <= 0) goto L_0x0094
                androidx.recyclerview.widget.i r3 = r4.f2857a
                int r3 = r3.mo1037b(r5)
                int r6 = r6 + r3
                androidx.recyclerview.widget.i r3 = r4.f2857a
                int r3 = r3.mo1038b()
                int r3 = r3 - r0
                androidx.recyclerview.widget.i r0 = r4.f2857a
                int r5 = r0.mo1039a(r5)
                int r3 = r3 - r5
                androidx.recyclerview.widget.i r5 = r4.f2857a
                int r5 = r5.mo1038b()
                int r0 = java.lang.Math.min(r1, r3)
                int r5 = r5 - r0
                int r5 = r5 - r6
                if (r5 >= 0) goto L_0x0094
                int r6 = r4.f2859c
                int r5 = -r5
                int r5 = java.lang.Math.min(r2, r5)
                int r6 = r6 - r5
                r4.f2859c = r6
            L_0x0094:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AnchorInfo{mPosition="
                r0.append(r1)
                int r1 = r2.f2858b
                r0.append(r1)
                java.lang.String r1 = ", mCoordinate="
                r0.append(r1)
                int r1 = r2.f2859c
                r0.append(r1)
                java.lang.String r1 = ", mLayoutFromEnd="
                r0.append(r1)
                boolean r1 = r2.f2860d
                r0.append(r1)
                java.lang.String r1 = ", mValid="
                r0.append(r1)
                boolean r1 = r2.f2861e
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    protected static class C0767b {

        /* renamed from: a */
        public int f2862a;

        /* renamed from: b */
        public boolean f2863b;

        /* renamed from: c */
        public boolean f2864c;

        /* renamed from: d */
        public boolean f2865d;

        protected C0767b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        void m1263a() {
                r1 = this;
                r0 = 0
                r1.f2862a = r0
                r1.f2863b = r0
                r1.f2864c = r0
                r1.f2865d = r0
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes.dex */
    static class C0768c {

        /* renamed from: a */
        boolean f2866a;

        /* renamed from: b */
        int f2867b;

        /* renamed from: c */
        int f2868c;

        /* renamed from: d */
        int f2869d;

        /* renamed from: e */
        int f2870e;

        /* renamed from: f */
        int f2871f;

        /* renamed from: g */
        int f2872g;

        /* renamed from: h */
        int f2873h;

        /* renamed from: i */
        boolean f2874i;

        /* renamed from: j */
        int f2875j;

        /* renamed from: k */
        java.util.List<androidx.recyclerview.widget.C0813j.AbstractC0821d0> f2876k;

        /* renamed from: l */
        boolean f2877l;

        C0768c() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f2866a = r0
                r0 = 0
                r1.f2873h = r0
                r0 = 0
                r1.f2876k = r0
                return
        }

        /* renamed from: b */
        private android.view.View m1258b() {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.j$d0> r0 = r5.f2876k
                int r0 = r0.size()
                r1 = 0
            L_0x0007:
                if (r1 >= r0) goto L_0x002f
                java.util.List<androidx.recyclerview.widget.j$d0> r2 = r5.f2876k
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.j$d0 r2 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r2
                android.view.View r2 = r2.f3179a
                android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
                androidx.recyclerview.widget.j$p r3 = (androidx.recyclerview.widget.C0813j.C0840p) r3
                boolean r4 = r3.m652c()
                if (r4 == 0) goto L_0x0020
                goto L_0x002c
            L_0x0020:
                int r4 = r5.f2869d
                int r3 = r3.m654a()
                if (r4 != r3) goto L_0x002c
                r5.m1261a(r2)
                return r2
            L_0x002c:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x002f:
                r0 = 0
                return r0
        }

        /* renamed from: a */
        android.view.View m1259a(androidx.recyclerview.widget.C0813j.C0847v r3) {
                r2 = this;
                java.util.List<androidx.recyclerview.widget.j$d0> r0 = r2.f2876k
                if (r0 == 0) goto L_0x0009
                android.view.View r3 = r2.m1258b()
                return r3
            L_0x0009:
                int r0 = r2.f2869d
                android.view.View r3 = r3.m603d(r0)
                int r0 = r2.f2869d
                int r1 = r2.f2870e
                int r0 = r0 + r1
                r2.f2869d = r0
                return r3
        }

        /* renamed from: a */
        public void m1262a() {
                r1 = this;
                r0 = 0
                r1.m1261a(r0)
                return
        }

        /* renamed from: a */
        public void m1261a(android.view.View r1) {
                r0 = this;
                android.view.View r1 = r0.m1257b(r1)
                if (r1 != 0) goto L_0x0008
                r1 = -1
                goto L_0x0012
            L_0x0008:
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.j$p r1 = (androidx.recyclerview.widget.C0813j.C0840p) r1
                int r1 = r1.m654a()
            L_0x0012:
                r0.f2869d = r1
                return
        }

        /* renamed from: a */
        boolean m1260a(androidx.recyclerview.widget.C0813j.C0815a0 r2) {
                r1 = this;
                int r0 = r1.f2869d
                if (r0 < 0) goto L_0x000c
                int r2 = r2.m907a()
                if (r0 >= r2) goto L_0x000c
                r2 = 1
                goto L_0x000d
            L_0x000c:
                r2 = 0
            L_0x000d:
                return r2
        }

        /* renamed from: b */
        public android.view.View m1257b(android.view.View r8) {
                r7 = this;
                java.util.List<androidx.recyclerview.widget.j$d0> r0 = r7.f2876k
                int r0 = r0.size()
                r1 = 0
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 0
            L_0x000b:
                if (r3 >= r0) goto L_0x003e
                java.util.List<androidx.recyclerview.widget.j$d0> r4 = r7.f2876k
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.j$d0 r4 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r4
                android.view.View r4 = r4.f3179a
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                androidx.recyclerview.widget.j$p r5 = (androidx.recyclerview.widget.C0813j.C0840p) r5
                if (r4 == r8) goto L_0x003b
                boolean r6 = r5.m652c()
                if (r6 == 0) goto L_0x0026
                goto L_0x003b
            L_0x0026:
                int r5 = r5.m654a()
                int r6 = r7.f2869d
                int r5 = r5 - r6
                int r6 = r7.f2870e
                int r5 = r5 * r6
                if (r5 >= 0) goto L_0x0034
                goto L_0x003b
            L_0x0034:
                if (r5 >= r2) goto L_0x003b
                r1 = r4
                if (r5 != 0) goto L_0x003a
                goto L_0x003e
            L_0x003a:
                r2 = r5
            L_0x003b:
                int r3 = r3 + 1
                goto L_0x000b
            L_0x003e:
                return r1
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    /* loaded from: classes.dex */
    public static class C0769d implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.LinearLayoutManager.C0769d> CREATOR = null;

        /* renamed from: b */
        int f2878b;

        /* renamed from: c */
        int f2879c;

        /* renamed from: d */
        boolean f2880d;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        /* loaded from: classes.dex */
        static class C0770a implements android.os.Parcelable.Creator<androidx.recyclerview.widget.LinearLayoutManager.C0769d> {
            C0770a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.LinearLayoutManager.C0769d createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$d r0 = new androidx.recyclerview.widget.LinearLayoutManager$d
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager.C0769d createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$d r1 = r0.createFromParcel(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.LinearLayoutManager.C0769d[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$d[] r1 = new androidx.recyclerview.widget.LinearLayoutManager.C0769d[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager.C0769d[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$d[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                androidx.recyclerview.widget.LinearLayoutManager$d$a r0 = new androidx.recyclerview.widget.LinearLayoutManager$d$a
                r0.<init>()
                androidx.recyclerview.widget.LinearLayoutManager.C0769d.CREATOR = r0
                return
        }

        public C0769d() {
                r0 = this;
                r0.<init>()
                return
        }

        C0769d(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.f2878b = r0
                int r0 = r2.readInt()
                r1.f2879c = r0
                int r2 = r2.readInt()
                r0 = 1
                if (r2 != r0) goto L_0x0017
                goto L_0x0018
            L_0x0017:
                r0 = 0
            L_0x0018:
                r1.f2880d = r0
                return
        }

        public C0769d(androidx.recyclerview.widget.LinearLayoutManager.C0769d r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.f2878b
                r1.f2878b = r0
                int r0 = r2.f2879c
                r1.f2879c = r0
                boolean r2 = r2.f2880d
                r1.f2880d = r2
                return
        }

        /* renamed from: a */
        boolean m1256a() {
                r1 = this;
                int r0 = r1.f2878b
                if (r0 < 0) goto L_0x0006
                r0 = 1
                goto L_0x0007
            L_0x0006:
                r0 = 0
            L_0x0007:
                return r0
        }

        /* renamed from: b */
        void m1255b() {
                r1 = this;
                r0 = -1
                r1.f2878b = r0
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.f2878b
                r1.writeInt(r2)
                int r2 = r0.f2879c
                r1.writeInt(r2)
                boolean r2 = r0.f2880d
                r1.writeInt(r2)
                return
        }
    }

    public LinearLayoutManager(android.content.Context r2, int r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r2 = 1
            r1.f2849s = r2
            r0 = 0
            r1.f2853w = r0
            r1.f2854x = r0
            r1.f2855y = r0
            r1.f2856z = r2
            r2 = -1
            r1.f2842A = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f2843B = r2
            r2 = 0
            r1.f2845D = r2
            androidx.recyclerview.widget.LinearLayoutManager$a r2 = new androidx.recyclerview.widget.LinearLayoutManager$a
            r2.<init>()
            r1.f2846E = r2
            androidx.recyclerview.widget.LinearLayoutManager$b r2 = new androidx.recyclerview.widget.LinearLayoutManager$b
            r2.<init>()
            r1.f2847F = r2
            r2 = 2
            r1.f2848G = r2
            r1.m1277i(r3)
            r1.m1295a(r4)
            return
    }

    public LinearLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f2849s = r0
            r1 = 0
            r2.f2853w = r1
            r2.f2854x = r1
            r2.f2855y = r1
            r2.f2856z = r0
            r0 = -1
            r2.f2842A = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f2843B = r0
            r0 = 0
            r2.f2845D = r0
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = new androidx.recyclerview.widget.LinearLayoutManager$a
            r0.<init>()
            r2.f2846E = r0
            androidx.recyclerview.widget.LinearLayoutManager$b r0 = new androidx.recyclerview.widget.LinearLayoutManager$b
            r0.<init>()
            r2.f2847F = r0
            r0 = 2
            r2.f2848G = r0
            androidx.recyclerview.widget.j$o$d r3 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m775a(r3, r4, r5, r6)
            int r4 = r3.f3230a
            r2.m1277i(r4)
            boolean r4 = r3.f3232c
            r2.m1295a(r4)
            boolean r3 = r3.f3233d
            r2.mo1288b(r3)
            return
    }

    /* renamed from: K */
    private android.view.View m1312K() {
            r1 = this;
            boolean r0 = r1.f2854x
            if (r0 == 0) goto L_0x0006
            r0 = 0
            goto L_0x000c
        L_0x0006:
            int r0 = r1.m697e()
            int r0 = r0 + (-1)
        L_0x000c:
            android.view.View r0 = r1.m715c(r0)
            return r0
    }

    /* renamed from: L */
    private android.view.View m1311L() {
            r1 = this;
            boolean r0 = r1.f2854x
            if (r0 == 0) goto L_0x000b
            int r0 = r1.m697e()
            int r0 = r0 + (-1)
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            android.view.View r0 = r1.m715c(r0)
            return r0
    }

    /* renamed from: M */
    private void m1310M() {
            r2 = this;
            int r0 = r2.f2849s
            r1 = 1
            if (r0 == r1) goto L_0x0010
            boolean r0 = r2.m1314I()
            if (r0 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            boolean r0 = r2.f2853w
            r0 = r0 ^ r1
            goto L_0x0012
        L_0x0010:
            boolean r0 = r2.f2853w
        L_0x0012:
            r2.f2854x = r0
            return
    }

    /* renamed from: a */
    private int m1307a(int r2, androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.C0813j.C0815a0 r4, boolean r5) {
            r1 = this;
            androidx.recyclerview.widget.i r0 = r1.f2851u
            int r0 = r0.mo1038b()
            int r0 = r0 - r2
            if (r0 <= 0) goto L_0x0023
            int r0 = -r0
            int r3 = r1.m1286c(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L_0x0022
            androidx.recyclerview.widget.i r4 = r1.f2851u
            int r4 = r4.mo1038b()
            int r4 = r4 - r2
            if (r4 <= 0) goto L_0x0022
            androidx.recyclerview.widget.i r2 = r1.f2851u
            r2.mo1040a(r4)
            int r4 = r4 + r3
            return r4
        L_0x0022:
            return r3
        L_0x0023:
            r2 = 0
            return r2
    }

    /* renamed from: a */
    private android.view.View m1294a(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.f2854x
            if (r0 == 0) goto L_0x000e
            r0 = 0
            int r1 = r2.m697e()
        L_0x0009:
            android.view.View r3 = r2.m1308a(r0, r1, r3, r4)
            return r3
        L_0x000e:
            int r0 = r2.m697e()
            int r0 = r0 + (-1)
            r1 = -1
            goto L_0x0009
    }

    /* renamed from: a */
    private void m1309a(int r5, int r6, boolean r7, androidx.recyclerview.widget.C0813j.C0815a0 r8) {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.f2850t
            boolean r1 = r4.m1313J()
            r0.f2877l = r1
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.f2850t
            int r8 = r4.m1279h(r8)
            r0.f2873h = r8
            androidx.recyclerview.widget.LinearLayoutManager$c r8 = r4.f2850t
            r8.f2871f = r5
            r0 = -1
            r1 = 1
            if (r5 != r1) goto L_0x0054
            int r5 = r8.f2873h
            androidx.recyclerview.widget.i r2 = r4.f2851u
            int r2 = r2.mo1036c()
            int r5 = r5 + r2
            r8.f2873h = r5
            android.view.View r5 = r4.m1312K()
            androidx.recyclerview.widget.LinearLayoutManager$c r8 = r4.f2850t
            boolean r2 = r4.f2854x
            if (r2 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            r8.f2870e = r0
            androidx.recyclerview.widget.LinearLayoutManager$c r8 = r4.f2850t
            int r0 = r4.m673l(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r4.f2850t
            int r2 = r1.f2870e
            int r0 = r0 + r2
            r8.f2869d = r0
            androidx.recyclerview.widget.i r8 = r4.f2851u
            int r8 = r8.mo1039a(r5)
            r1.f2867b = r8
            androidx.recyclerview.widget.i r8 = r4.f2851u
            int r5 = r8.mo1039a(r5)
            androidx.recyclerview.widget.i r8 = r4.f2851u
            int r8 = r8.mo1038b()
            int r5 = r5 - r8
            goto L_0x0091
        L_0x0054:
            android.view.View r5 = r4.m1311L()
            androidx.recyclerview.widget.LinearLayoutManager$c r8 = r4.f2850t
            int r2 = r8.f2873h
            androidx.recyclerview.widget.i r3 = r4.f2851u
            int r3 = r3.mo1030f()
            int r2 = r2 + r3
            r8.f2873h = r2
            androidx.recyclerview.widget.LinearLayoutManager$c r8 = r4.f2850t
            boolean r2 = r4.f2854x
            if (r2 == 0) goto L_0x006c
            r0 = 1
        L_0x006c:
            r8.f2870e = r0
            androidx.recyclerview.widget.LinearLayoutManager$c r8 = r4.f2850t
            int r0 = r4.m673l(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r4.f2850t
            int r2 = r1.f2870e
            int r0 = r0 + r2
            r8.f2869d = r0
            androidx.recyclerview.widget.i r8 = r4.f2851u
            int r8 = r8.mo1033d(r5)
            r1.f2867b = r8
            androidx.recyclerview.widget.i r8 = r4.f2851u
            int r5 = r8.mo1033d(r5)
            int r5 = -r5
            androidx.recyclerview.widget.i r8 = r4.f2851u
            int r8 = r8.mo1030f()
            int r5 = r5 + r8
        L_0x0091:
            androidx.recyclerview.widget.LinearLayoutManager$c r8 = r4.f2850t
            r8.f2868c = r6
            if (r7 == 0) goto L_0x009c
            int r6 = r8.f2868c
            int r6 = r6 - r5
            r8.f2868c = r6
        L_0x009c:
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r4.f2850t
            r6.f2872g = r5
            return
    }

    /* renamed from: a */
    private void m1306a(androidx.recyclerview.widget.LinearLayoutManager.C0766a r2) {
            r1 = this;
            int r0 = r2.f2858b
            int r2 = r2.f2859c
            r1.m1284f(r0, r2)
            return
    }

    /* renamed from: a */
    private void m1303a(androidx.recyclerview.widget.C0813j.C0847v r6, int r7) {
            r5 = this;
            int r0 = r5.m697e()
            if (r7 >= 0) goto L_0x0007
            return
        L_0x0007:
            androidx.recyclerview.widget.i r1 = r5.f2851u
            int r1 = r1.mo1041a()
            int r1 = r1 - r7
            boolean r7 = r5.f2854x
            if (r7 == 0) goto L_0x0032
            r7 = 0
            r2 = 0
        L_0x0014:
            if (r2 >= r0) goto L_0x0052
            android.view.View r3 = r5.m715c(r2)
            androidx.recyclerview.widget.i r4 = r5.f2851u
            int r4 = r4.mo1033d(r3)
            if (r4 < r1) goto L_0x002e
            androidx.recyclerview.widget.i r4 = r5.f2851u
            int r3 = r4.mo1029f(r3)
            if (r3 >= r1) goto L_0x002b
            goto L_0x002e
        L_0x002b:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x002e:
            r5.m1302a(r6, r7, r2)
            return
        L_0x0032:
            int r0 = r0 + (-1)
            r7 = r0
        L_0x0035:
            if (r7 < 0) goto L_0x0052
            android.view.View r2 = r5.m715c(r7)
            androidx.recyclerview.widget.i r3 = r5.f2851u
            int r3 = r3.mo1033d(r2)
            if (r3 < r1) goto L_0x004f
            androidx.recyclerview.widget.i r3 = r5.f2851u
            int r2 = r3.mo1029f(r2)
            if (r2 >= r1) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            int r7 = r7 + (-1)
            goto L_0x0035
        L_0x004f:
            r5.m1302a(r6, r0, r7)
        L_0x0052:
            return
    }

    /* renamed from: a */
    private void m1302a(androidx.recyclerview.widget.C0813j.C0847v r1, int r2, int r3) {
            r0 = this;
            if (r2 != r3) goto L_0x0003
            return
        L_0x0003:
            if (r3 <= r2) goto L_0x000f
            int r3 = r3 + (-1)
        L_0x0007:
            if (r3 < r2) goto L_0x0017
            r0.m779a(r3, r1)
            int r3 = r3 + (-1)
            goto L_0x0007
        L_0x000f:
            if (r2 <= r3) goto L_0x0017
            r0.m779a(r2, r1)
            int r2 = r2 + (-1)
            goto L_0x000f
        L_0x0017:
            return
    }

    /* renamed from: a */
    private void m1301a(androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.LinearLayoutManager.C0768c r4) {
            r2 = this;
            boolean r0 = r4.f2866a
            if (r0 == 0) goto L_0x0017
            boolean r0 = r4.f2877l
            if (r0 == 0) goto L_0x0009
            goto L_0x0017
        L_0x0009:
            int r0 = r4.f2871f
            r1 = -1
            int r4 = r4.f2872g
            if (r0 != r1) goto L_0x0014
            r2.m1303a(r3, r4)
            goto L_0x0017
        L_0x0014:
            r2.m1291b(r3, r4)
        L_0x0017:
            return
    }

    /* renamed from: a */
    private boolean m1305a(androidx.recyclerview.widget.C0813j.C0815a0 r5, androidx.recyclerview.widget.LinearLayoutManager.C0766a r6) {
            r4 = this;
            boolean r0 = r5.m902d()
            r1 = 0
            if (r0 != 0) goto L_0x00fa
            int r0 = r4.f2842A
            r2 = -1
            if (r0 != r2) goto L_0x000e
            goto L_0x00fa
        L_0x000e:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 < 0) goto L_0x00f6
            int r5 = r5.m907a()
            if (r0 < r5) goto L_0x001a
            goto L_0x00f6
        L_0x001a:
            int r5 = r4.f2842A
            r6.f2858b = r5
            androidx.recyclerview.widget.LinearLayoutManager$d r5 = r4.f2845D
            r0 = 1
            if (r5 == 0) goto L_0x004d
            boolean r5 = r5.m1256a()
            if (r5 == 0) goto L_0x004d
            androidx.recyclerview.widget.LinearLayoutManager$d r5 = r4.f2845D
            boolean r5 = r5.f2880d
            r6.f2860d = r5
            boolean r5 = r6.f2860d
            if (r5 == 0) goto L_0x003f
            androidx.recyclerview.widget.i r5 = r4.f2851u
            int r5 = r5.mo1038b()
            androidx.recyclerview.widget.LinearLayoutManager$d r1 = r4.f2845D
            int r1 = r1.f2879c
            int r5 = r5 - r1
            goto L_0x004a
        L_0x003f:
            androidx.recyclerview.widget.i r5 = r4.f2851u
            int r5 = r5.mo1030f()
            androidx.recyclerview.widget.LinearLayoutManager$d r1 = r4.f2845D
            int r1 = r1.f2879c
            int r5 = r5 + r1
        L_0x004a:
            r6.f2859c = r5
            return r0
        L_0x004d:
            int r5 = r4.f2843B
            if (r5 != r3) goto L_0x00da
            int r5 = r4.f2842A
            android.view.View r5 = r4.mo731b(r5)
            if (r5 == 0) goto L_0x00ba
            androidx.recyclerview.widget.i r2 = r4.f2851u
            int r2 = r2.mo1037b(r5)
            androidx.recyclerview.widget.i r3 = r4.f2851u
            int r3 = r3.mo1028g()
            if (r2 <= r3) goto L_0x006b
            r6.m1268a()
            return r0
        L_0x006b:
            androidx.recyclerview.widget.i r2 = r4.f2851u
            int r2 = r2.mo1033d(r5)
            androidx.recyclerview.widget.i r3 = r4.f2851u
            int r3 = r3.mo1030f()
            int r2 = r2 - r3
            if (r2 >= 0) goto L_0x0085
            androidx.recyclerview.widget.i r5 = r4.f2851u
            int r5 = r5.mo1030f()
            r6.f2859c = r5
            r6.f2860d = r1
            return r0
        L_0x0085:
            androidx.recyclerview.widget.i r1 = r4.f2851u
            int r1 = r1.mo1038b()
            androidx.recyclerview.widget.i r2 = r4.f2851u
            int r2 = r2.mo1039a(r5)
            int r1 = r1 - r2
            if (r1 >= 0) goto L_0x009f
            androidx.recyclerview.widget.i r5 = r4.f2851u
            int r5 = r5.mo1038b()
            r6.f2859c = r5
            r6.f2860d = r0
            return r0
        L_0x009f:
            boolean r1 = r6.f2860d
            if (r1 == 0) goto L_0x00b1
            androidx.recyclerview.widget.i r1 = r4.f2851u
            int r5 = r1.mo1039a(r5)
            androidx.recyclerview.widget.i r1 = r4.f2851u
            int r1 = r1.m1043h()
            int r5 = r5 + r1
            goto L_0x00b7
        L_0x00b1:
            androidx.recyclerview.widget.i r1 = r4.f2851u
            int r5 = r1.mo1033d(r5)
        L_0x00b7:
            r6.f2859c = r5
            goto L_0x00d9
        L_0x00ba:
            int r5 = r4.m697e()
            if (r5 <= 0) goto L_0x00d6
            android.view.View r5 = r4.m715c(r1)
            int r5 = r4.m673l(r5)
            int r2 = r4.f2842A
            if (r2 >= r5) goto L_0x00ce
            r5 = 1
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            boolean r2 = r4.f2854x
            if (r5 != r2) goto L_0x00d4
            r1 = 1
        L_0x00d4:
            r6.f2860d = r1
        L_0x00d6:
            r6.m1268a()
        L_0x00d9:
            return r0
        L_0x00da:
            boolean r5 = r4.f2854x
            r6.f2860d = r5
            if (r5 == 0) goto L_0x00ea
            androidx.recyclerview.widget.i r5 = r4.f2851u
            int r5 = r5.mo1038b()
            int r1 = r4.f2843B
            int r5 = r5 - r1
            goto L_0x00f3
        L_0x00ea:
            androidx.recyclerview.widget.i r5 = r4.f2851u
            int r5 = r5.mo1030f()
            int r1 = r4.f2843B
            int r5 = r5 + r1
        L_0x00f3:
            r6.f2859c = r5
            return r0
        L_0x00f6:
            r4.f2842A = r2
            r4.f2843B = r3
        L_0x00fa:
            return r1
    }

    /* renamed from: a */
    private boolean m1298a(androidx.recyclerview.widget.C0813j.C0847v r5, androidx.recyclerview.widget.C0813j.C0815a0 r6, androidx.recyclerview.widget.LinearLayoutManager.C0766a r7) {
            r4 = this;
            int r0 = r4.m697e()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r0 = r4.m686g()
            r2 = 1
            if (r0 == 0) goto L_0x001d
            boolean r3 = r7.m1266a(r0, r6)
            if (r3 == 0) goto L_0x001d
            int r5 = r4.m673l(r0)
            r7.m1264b(r0, r5)
            return r2
        L_0x001d:
            boolean r0 = r4.f2852v
            boolean r3 = r4.f2855y
            if (r0 == r3) goto L_0x0024
            return r1
        L_0x0024:
            boolean r0 = r7.f2860d
            if (r0 == 0) goto L_0x002d
            android.view.View r5 = r4.m1270l(r5, r6)
            goto L_0x0031
        L_0x002d:
            android.view.View r5 = r4.m1269m(r5, r6)
        L_0x0031:
            if (r5 == 0) goto L_0x0079
            int r0 = r4.m673l(r5)
            r7.m1267a(r5, r0)
            boolean r6 = r6.m902d()
            if (r6 != 0) goto L_0x0078
            boolean r6 = r4.mo789C()
            if (r6 == 0) goto L_0x0078
            androidx.recyclerview.widget.i r6 = r4.f2851u
            int r6 = r6.mo1033d(r5)
            androidx.recyclerview.widget.i r0 = r4.f2851u
            int r0 = r0.mo1038b()
            if (r6 >= r0) goto L_0x0062
            androidx.recyclerview.widget.i r6 = r4.f2851u
            int r5 = r6.mo1039a(r5)
            androidx.recyclerview.widget.i r6 = r4.f2851u
            int r6 = r6.mo1030f()
            if (r5 >= r6) goto L_0x0063
        L_0x0062:
            r1 = 1
        L_0x0063:
            if (r1 == 0) goto L_0x0078
            boolean r5 = r7.f2860d
            if (r5 == 0) goto L_0x0070
            androidx.recyclerview.widget.i r5 = r4.f2851u
            int r5 = r5.mo1038b()
            goto L_0x0076
        L_0x0070:
            androidx.recyclerview.widget.i r5 = r4.f2851u
            int r5 = r5.mo1030f()
        L_0x0076:
            r7.f2859c = r5
        L_0x0078:
            return r2
        L_0x0079:
            return r1
    }

    /* renamed from: b */
    private int m1293b(int r2, androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.C0813j.C0815a0 r4, boolean r5) {
            r1 = this;
            androidx.recyclerview.widget.i r0 = r1.f2851u
            int r0 = r0.mo1030f()
            int r0 = r2 - r0
            if (r0 <= 0) goto L_0x0023
            int r3 = r1.m1286c(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L_0x0022
            androidx.recyclerview.widget.i r4 = r1.f2851u
            int r4 = r4.mo1030f()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0022
            androidx.recyclerview.widget.i r4 = r1.f2851u
            int r5 = -r2
            r4.mo1040a(r5)
            int r3 = r3 - r2
        L_0x0022:
            return r3
        L_0x0023:
            r2 = 0
            return r2
    }

    /* renamed from: b */
    private android.view.View m1287b(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.f2854x
            if (r0 == 0) goto L_0x0010
            int r0 = r2.m697e()
            int r0 = r0 + (-1)
            r1 = -1
        L_0x000b:
            android.view.View r3 = r2.m1308a(r0, r1, r3, r4)
            return r3
        L_0x0010:
            r0 = 0
            int r1 = r2.m697e()
            goto L_0x000b
    }

    /* renamed from: b */
    private void m1292b(androidx.recyclerview.widget.LinearLayoutManager.C0766a r2) {
            r1 = this;
            int r0 = r2.f2858b
            int r2 = r2.f2859c
            r1.m1282g(r0, r2)
            return
    }

    /* renamed from: b */
    private void m1291b(androidx.recyclerview.widget.C0813j.C0847v r6, int r7) {
            r5 = this;
            if (r7 >= 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.m697e()
            boolean r1 = r5.f2854x
            if (r1 == 0) goto L_0x002c
            int r0 = r0 + (-1)
            r1 = r0
        L_0x000e:
            if (r1 < 0) goto L_0x004b
            android.view.View r2 = r5.m715c(r1)
            androidx.recyclerview.widget.i r3 = r5.f2851u
            int r3 = r3.mo1039a(r2)
            if (r3 > r7) goto L_0x0028
            androidx.recyclerview.widget.i r3 = r5.f2851u
            int r2 = r3.mo1031e(r2)
            if (r2 <= r7) goto L_0x0025
            goto L_0x0028
        L_0x0025:
            int r1 = r1 + (-1)
            goto L_0x000e
        L_0x0028:
            r5.m1302a(r6, r0, r1)
            return
        L_0x002c:
            r1 = 0
            r2 = 0
        L_0x002e:
            if (r2 >= r0) goto L_0x004b
            android.view.View r3 = r5.m715c(r2)
            androidx.recyclerview.widget.i r4 = r5.f2851u
            int r4 = r4.mo1039a(r3)
            if (r4 > r7) goto L_0x0048
            androidx.recyclerview.widget.i r4 = r5.f2851u
            int r3 = r4.mo1031e(r3)
            if (r3 <= r7) goto L_0x0045
            goto L_0x0048
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x002e
        L_0x0048:
            r5.m1302a(r6, r1, r2)
        L_0x004b:
            return
    }

    /* renamed from: b */
    private void m1290b(androidx.recyclerview.widget.C0813j.C0847v r16, androidx.recyclerview.widget.C0813j.C0815a0 r17, int r18, int r19) {
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            boolean r3 = r17.m901e()
            if (r3 == 0) goto L_0x00a5
            int r3 = r15.m697e()
            if (r3 == 0) goto L_0x00a5
            boolean r3 = r17.m902d()
            if (r3 != 0) goto L_0x00a5
            boolean r3 = r15.mo789C()
            if (r3 != 0) goto L_0x001f
            goto L_0x00a5
        L_0x001f:
            java.util.List r3 = r16.m598f()
            int r4 = r3.size()
            r5 = 0
            android.view.View r6 = r15.m715c(r5)
            int r6 = r15.m673l(r6)
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0033:
            if (r7 >= r4) goto L_0x0062
            java.lang.Object r10 = r3.get(r7)
            androidx.recyclerview.widget.j$d0 r10 = (androidx.recyclerview.widget.C0813j.AbstractC0821d0) r10
            boolean r11 = r10.m864p()
            if (r11 == 0) goto L_0x0042
            goto L_0x005f
        L_0x0042:
            int r11 = r10.m871i()
            r12 = 1
            if (r11 >= r6) goto L_0x004b
            r11 = 1
            goto L_0x004c
        L_0x004b:
            r11 = 0
        L_0x004c:
            boolean r13 = r0.f2854x
            r14 = -1
            if (r11 == r13) goto L_0x0052
            r12 = -1
        L_0x0052:
            androidx.recyclerview.widget.i r11 = r0.f2851u
            android.view.View r10 = r10.f3179a
            int r10 = r11.mo1037b(r10)
            if (r12 != r14) goto L_0x005e
            int r8 = r8 + r10
            goto L_0x005f
        L_0x005e:
            int r9 = r9 + r10
        L_0x005f:
            int r7 = r7 + 1
            goto L_0x0033
        L_0x0062:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2850t
            r4.f2876k = r3
            if (r8 <= 0) goto L_0x0083
            android.view.View r3 = r15.m1311L()
            int r3 = r15.m673l(r3)
            r4 = r18
            r15.m1282g(r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2850t
            r3.f2873h = r8
            r3.f2868c = r5
            r3.m1262a()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2850t
            r15.m1300a(r1, r3, r2, r5)
        L_0x0083:
            if (r9 <= 0) goto L_0x00a0
            android.view.View r3 = r15.m1312K()
            int r3 = r15.m673l(r3)
            r4 = r19
            r15.m1284f(r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2850t
            r3.f2873h = r9
            r3.f2868c = r5
            r3.m1262a()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2850t
            r15.m1300a(r1, r3, r2, r5)
        L_0x00a0:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f2850t
            r2 = 0
            r1.f2876k = r2
        L_0x00a5:
            return
    }

    /* renamed from: b */
    private void m1289b(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3, androidx.recyclerview.widget.LinearLayoutManager.C0766a r4) {
            r1 = this;
            boolean r0 = r1.m1305a(r3, r4)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            boolean r2 = r1.m1298a(r2, r3, r4)
            if (r2 == 0) goto L_0x000e
            return
        L_0x000e:
            r4.m1268a()
            boolean r2 = r1.f2855y
            if (r2 == 0) goto L_0x001c
            int r2 = r3.m907a()
            int r2 = r2 + (-1)
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            r4.f2858b = r2
            return
    }

    /* renamed from: f */
    private android.view.View m1283f(androidx.recyclerview.widget.C0813j.C0847v r1, androidx.recyclerview.widget.C0813j.C0815a0 r2) {
            r0 = this;
            int r1 = r0.m697e()
            r2 = 0
            android.view.View r1 = r0.m1285e(r2, r1)
            return r1
    }

    /* renamed from: f */
    private void m1284f(int r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r3.f2850t
            androidx.recyclerview.widget.i r1 = r3.f2851u
            int r1 = r1.mo1038b()
            int r1 = r1 - r5
            r0.f2868c = r1
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r3.f2850t
            boolean r1 = r3.f2854x
            r2 = 1
            if (r1 == 0) goto L_0x0014
            r1 = -1
            goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            r0.f2870e = r1
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r3.f2850t
            r0.f2869d = r4
            r0.f2871f = r2
            r0.f2867b = r5
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f2872g = r4
            return
    }

    /* renamed from: g */
    private android.view.View m1281g(androidx.recyclerview.widget.C0813j.C0847v r7, androidx.recyclerview.widget.C0813j.C0815a0 r8) {
            r6 = this;
            int r4 = r6.m697e()
            int r5 = r8.m907a()
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            android.view.View r7 = r0.mo1299a(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: g */
    private void m1282g(int r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r2.f2850t
            androidx.recyclerview.widget.i r1 = r2.f2851u
            int r1 = r1.mo1030f()
            int r1 = r4 - r1
            r0.f2868c = r1
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r2.f2850t
            r0.f2869d = r3
            boolean r3 = r2.f2854x
            r1 = -1
            if (r3 == 0) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0017:
            r3 = -1
        L_0x0018:
            r0.f2870e = r3
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r2.f2850t
            r3.f2871f = r1
            r3.f2867b = r4
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.f2872g = r4
            return
    }

    /* renamed from: h */
    private android.view.View m1278h(androidx.recyclerview.widget.C0813j.C0847v r1, androidx.recyclerview.widget.C0813j.C0815a0 r2) {
            r0 = this;
            int r1 = r0.m697e()
            int r1 = r1 + (-1)
            r2 = -1
            android.view.View r1 = r0.m1285e(r1, r2)
            return r1
    }

    /* renamed from: i */
    private int m1276i(androidx.recyclerview.widget.C0813j.C0815a0 r7) {
            r6 = this;
            int r0 = r6.m697e()
            if (r0 != 0) goto L_0x0008
            r7 = 0
            return r7
        L_0x0008:
            r6.m1318E()
            androidx.recyclerview.widget.i r1 = r6.f2851u
            boolean r0 = r6.f2856z
            r2 = 1
            r0 = r0 ^ r2
            android.view.View r3 = r6.m1287b(r0, r2)
            boolean r0 = r6.f2856z
            r0 = r0 ^ r2
            android.view.View r4 = r6.m1294a(r0, r2)
            boolean r5 = r6.f2856z
            r0 = r7
            r2 = r3
            r3 = r4
            r4 = r6
            int r7 = androidx.recyclerview.widget.C0856l.m578a(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: i */
    private android.view.View m1275i(androidx.recyclerview.widget.C0813j.C0847v r8, androidx.recyclerview.widget.C0813j.C0815a0 r9) {
            r7 = this;
            int r0 = r7.m697e()
            int r4 = r0 + (-1)
            int r6 = r9.m907a()
            r5 = -1
            r1 = r7
            r2 = r8
            r3 = r9
            android.view.View r8 = r1.mo1299a(r2, r3, r4, r5, r6)
            return r8
    }

    /* renamed from: j */
    private int m1274j(androidx.recyclerview.widget.C0813j.C0815a0 r8) {
            r7 = this;
            int r0 = r7.m697e()
            if (r0 != 0) goto L_0x0008
            r8 = 0
            return r8
        L_0x0008:
            r7.m1318E()
            androidx.recyclerview.widget.i r1 = r7.f2851u
            boolean r0 = r7.f2856z
            r2 = 1
            r0 = r0 ^ r2
            android.view.View r3 = r7.m1287b(r0, r2)
            boolean r0 = r7.f2856z
            r0 = r0 ^ r2
            android.view.View r4 = r7.m1294a(r0, r2)
            boolean r5 = r7.f2856z
            boolean r6 = r7.f2854x
            r0 = r8
            r2 = r3
            r3 = r4
            r4 = r7
            int r8 = androidx.recyclerview.widget.C0856l.m577a(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    /* renamed from: j */
    private android.view.View m1273j(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r1 = this;
            boolean r0 = r1.f2854x
            if (r0 == 0) goto L_0x0009
            android.view.View r2 = r1.m1283f(r2, r3)
            goto L_0x000d
        L_0x0009:
            android.view.View r2 = r1.m1278h(r2, r3)
        L_0x000d:
            return r2
    }

    /* renamed from: k */
    private int m1272k(androidx.recyclerview.widget.C0813j.C0815a0 r7) {
            r6 = this;
            int r0 = r6.m697e()
            if (r0 != 0) goto L_0x0008
            r7 = 0
            return r7
        L_0x0008:
            r6.m1318E()
            androidx.recyclerview.widget.i r1 = r6.f2851u
            boolean r0 = r6.f2856z
            r2 = 1
            r0 = r0 ^ r2
            android.view.View r3 = r6.m1287b(r0, r2)
            boolean r0 = r6.f2856z
            r0 = r0 ^ r2
            android.view.View r4 = r6.m1294a(r0, r2)
            boolean r5 = r6.f2856z
            r0 = r7
            r2 = r3
            r3 = r4
            r4 = r6
            int r7 = androidx.recyclerview.widget.C0856l.m576b(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: k */
    private android.view.View m1271k(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r1 = this;
            boolean r0 = r1.f2854x
            if (r0 == 0) goto L_0x0009
            android.view.View r2 = r1.m1278h(r2, r3)
            goto L_0x000d
        L_0x0009:
            android.view.View r2 = r1.m1283f(r2, r3)
        L_0x000d:
            return r2
    }

    /* renamed from: l */
    private android.view.View m1270l(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r1 = this;
            boolean r0 = r1.f2854x
            if (r0 == 0) goto L_0x0009
            android.view.View r2 = r1.m1281g(r2, r3)
            goto L_0x000d
        L_0x0009:
            android.view.View r2 = r1.m1275i(r2, r3)
        L_0x000d:
            return r2
    }

    /* renamed from: m */
    private android.view.View m1269m(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r1 = this;
            boolean r0 = r1.f2854x
            if (r0 == 0) goto L_0x0009
            android.view.View r2 = r1.m1275i(r2, r3)
            goto L_0x000d
        L_0x0009:
            android.view.View r2 = r1.m1281g(r2, r3)
        L_0x000d:
            return r2
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: A */
    boolean mo791A() {
            r2 = this;
            int r0 = r2.m680i()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0016
            int r0 = r2.m664r()
            if (r0 == r1) goto L_0x0016
            boolean r0 = r2.m663s()
            if (r0 == 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: C */
    public boolean mo789C() {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r2.f2845D
            if (r0 != 0) goto L_0x000c
            boolean r0 = r2.f2852v
            boolean r1 = r2.f2855y
            if (r0 != r1) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
    }

    /* renamed from: D */
    androidx.recyclerview.widget.LinearLayoutManager.C0768c m1319D() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = new androidx.recyclerview.widget.LinearLayoutManager$c
            r0.<init>()
            return r0
    }

    /* renamed from: E */
    void m1318E() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r1.f2850t
            if (r0 != 0) goto L_0x000a
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r1.m1319D()
            r1.f2850t = r0
        L_0x000a:
            return
    }

    /* renamed from: F */
    public int m1317F() {
            r3 = this;
            int r0 = r3.m697e()
            r1 = 0
            r2 = 1
            android.view.View r0 = r3.m1308a(r1, r0, r1, r2)
            if (r0 != 0) goto L_0x000e
            r0 = -1
            goto L_0x0012
        L_0x000e:
            int r0 = r3.m673l(r0)
        L_0x0012:
            return r0
    }

    /* renamed from: G */
    public int m1316G() {
            r4 = this;
            int r0 = r4.m697e()
            r1 = 1
            int r0 = r0 - r1
            r2 = -1
            r3 = 0
            android.view.View r0 = r4.m1308a(r0, r2, r3, r1)
            if (r0 != 0) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            int r2 = r4.m673l(r0)
        L_0x0013:
            return r2
    }

    /* renamed from: H */
    public int m1315H() {
            r1 = this;
            int r0 = r1.f2849s
            return r0
    }

    /* renamed from: I */
    protected boolean m1314I() {
            r2 = this;
            int r0 = r2.m678j()
            r1 = 1
            if (r0 != r1) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            return r1
    }

    /* renamed from: J */
    boolean m1313J() {
            r1 = this;
            androidx.recyclerview.widget.i r0 = r1.f2851u
            int r0 = r0.mo1034d()
            if (r0 != 0) goto L_0x0012
            androidx.recyclerview.widget.i r0 = r1.f2851u
            int r0 = r0.mo1041a()
            if (r0 != 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo778a(int r3, androidx.recyclerview.widget.C0813j.C0847v r4, androidx.recyclerview.widget.C0813j.C0815a0 r5) {
            r2 = this;
            int r0 = r2.f2849s
            r1 = 1
            if (r0 != r1) goto L_0x0007
            r3 = 0
            return r3
        L_0x0007:
            int r3 = r2.m1286c(r3, r4, r5)
            return r3
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo756a(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1276i(r1)
            return r1
    }

    /* renamed from: a */
    int m1300a(androidx.recyclerview.widget.C0813j.C0847v r8, androidx.recyclerview.widget.LinearLayoutManager.C0768c r9, androidx.recyclerview.widget.C0813j.C0815a0 r10, boolean r11) {
            r7 = this;
            int r0 = r9.f2868c
            int r1 = r9.f2872g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L_0x0010
            if (r0 >= 0) goto L_0x000d
            int r1 = r1 + r0
            r9.f2872g = r1
        L_0x000d:
            r7.m1301a(r8, r9)
        L_0x0010:
            int r1 = r9.f2868c
            int r3 = r9.f2873h
            int r1 = r1 + r3
            androidx.recyclerview.widget.LinearLayoutManager$b r3 = r7.f2847F
        L_0x0017:
            boolean r4 = r9.f2877l
            if (r4 != 0) goto L_0x001d
            if (r1 <= 0) goto L_0x006c
        L_0x001d:
            boolean r4 = r9.m1260a(r10)
            if (r4 == 0) goto L_0x006c
            r3.m1263a()
            r7.mo1296a(r8, r10, r9, r3)
            boolean r4 = r3.f2863b
            if (r4 == 0) goto L_0x002e
            goto L_0x006c
        L_0x002e:
            int r4 = r9.f2867b
            int r5 = r3.f2862a
            int r6 = r9.f2871f
            int r5 = r5 * r6
            int r4 = r4 + r5
            r9.f2867b = r4
            boolean r4 = r3.f2864c
            if (r4 == 0) goto L_0x0049
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r7.f2850t
            java.util.List<androidx.recyclerview.widget.j$d0> r4 = r4.f2876k
            if (r4 != 0) goto L_0x0049
            boolean r4 = r10.m902d()
            if (r4 != 0) goto L_0x0051
        L_0x0049:
            int r4 = r9.f2868c
            int r5 = r3.f2862a
            int r4 = r4 - r5
            r9.f2868c = r4
            int r1 = r1 - r5
        L_0x0051:
            int r4 = r9.f2872g
            if (r4 == r2) goto L_0x0066
            int r5 = r3.f2862a
            int r4 = r4 + r5
            r9.f2872g = r4
            int r4 = r9.f2868c
            if (r4 >= 0) goto L_0x0063
            int r5 = r9.f2872g
            int r5 = r5 + r4
            r9.f2872g = r5
        L_0x0063:
            r7.m1301a(r8, r9)
        L_0x0066:
            if (r11 == 0) goto L_0x0017
            boolean r4 = r3.f2865d
            if (r4 == 0) goto L_0x0017
        L_0x006c:
            int r8 = r9.f2868c
            int r0 = r0 - r8
            return r0
    }

    /* renamed from: a */
    android.view.View m1308a(int r2, int r3, boolean r4, boolean r5) {
            r1 = this;
            r1.m1318E()
            r0 = 320(0x140, float:4.48E-43)
            if (r4 == 0) goto L_0x000a
            r4 = 24579(0x6003, float:3.4443E-41)
            goto L_0x000c
        L_0x000a:
            r4 = 320(0x140, float:4.48E-43)
        L_0x000c:
            if (r5 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            int r5 = r1.f2849s
            if (r5 != 0) goto L_0x0017
            androidx.recyclerview.widget.n r5 = r1.f3214e
            goto L_0x0019
        L_0x0017:
            androidx.recyclerview.widget.n r5 = r1.f3215f
        L_0x0019:
            android.view.View r2 = r5.m550a(r2, r3, r4, r0)
            return r2
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public android.view.View mo765a(android.view.View r4, int r5, androidx.recyclerview.widget.C0813j.C0847v r6, androidx.recyclerview.widget.C0813j.C0815a0 r7) {
            r3 = this;
            r3.m1310M()
            int r4 = r3.m697e()
            r0 = 0
            if (r4 != 0) goto L_0x000b
            return r0
        L_0x000b:
            int r4 = r3.m1280h(r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r5) goto L_0x0014
            return r0
        L_0x0014:
            r3.m1318E()
            r3.m1318E()
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.i r2 = r3.f2851u
            int r2 = r2.mo1028g()
            float r2 = (float) r2
            float r2 = r2 * r1
            int r1 = (int) r2
            r2 = 0
            r3.m1309a(r4, r1, r2, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r3.f2850t
            r1.f2872g = r5
            r1.f2866a = r2
            r5 = 1
            r3.m1300a(r6, r1, r7, r5)
            r5 = -1
            if (r4 != r5) goto L_0x003d
            android.view.View r6 = r3.m1271k(r6, r7)
            goto L_0x0041
        L_0x003d:
            android.view.View r6 = r3.m1273j(r6, r7)
        L_0x0041:
            if (r4 != r5) goto L_0x0048
            android.view.View r4 = r3.m1311L()
            goto L_0x004c
        L_0x0048:
            android.view.View r4 = r3.m1312K()
        L_0x004c:
            boolean r5 = r4.hasFocusable()
            if (r5 == 0) goto L_0x0056
            if (r6 != 0) goto L_0x0055
            return r0
        L_0x0055:
            return r4
        L_0x0056:
            return r6
    }

    /* renamed from: a */
    android.view.View mo1299a(androidx.recyclerview.widget.C0813j.C0847v r6, androidx.recyclerview.widget.C0813j.C0815a0 r7, int r8, int r9, int r10) {
            r5 = this;
            r5.m1318E()
            androidx.recyclerview.widget.i r6 = r5.f2851u
            int r6 = r6.mo1030f()
            androidx.recyclerview.widget.i r7 = r5.f2851u
            int r7 = r7.mo1038b()
            if (r9 <= r8) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = -1
        L_0x0014:
            r1 = 0
            r2 = r1
        L_0x0016:
            if (r8 == r9) goto L_0x004b
            android.view.View r3 = r5.m715c(r8)
            int r4 = r5.m673l(r3)
            if (r4 < 0) goto L_0x0049
            if (r4 >= r10) goto L_0x0049
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.j$p r4 = (androidx.recyclerview.widget.C0813j.C0840p) r4
            boolean r4 = r4.m652c()
            if (r4 == 0) goto L_0x0034
            if (r2 != 0) goto L_0x0049
            r2 = r3
            goto L_0x0049
        L_0x0034:
            androidx.recyclerview.widget.i r4 = r5.f2851u
            int r4 = r4.mo1033d(r3)
            if (r4 >= r7) goto L_0x0046
            androidx.recyclerview.widget.i r4 = r5.f2851u
            int r4 = r4.mo1039a(r3)
            if (r4 >= r6) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            return r3
        L_0x0046:
            if (r1 != 0) goto L_0x0049
            r1 = r3
        L_0x0049:
            int r8 = r8 + r0
            goto L_0x0016
        L_0x004b:
            if (r1 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r1 = r2
        L_0x004f:
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo783a(int r2, int r3, androidx.recyclerview.widget.C0813j.C0815a0 r4, androidx.recyclerview.widget.C0813j.AbstractC0835o.AbstractC0838c r5) {
            r1 = this;
            int r0 = r1.f2849s
            if (r0 != 0) goto L_0x0005
            goto L_0x0006
        L_0x0005:
            r2 = r3
        L_0x0006:
            int r3 = r1.m697e()
            if (r3 == 0) goto L_0x0024
            if (r2 != 0) goto L_0x000f
            goto L_0x0024
        L_0x000f:
            r1.m1318E()
            r3 = 1
            if (r2 <= 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = -1
        L_0x0018:
            int r2 = java.lang.Math.abs(r2)
            r1.m1309a(r0, r2, r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r1.f2850t
            r1.mo1304a(r4, r2, r5)
        L_0x0024:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo780a(int r6, androidx.recyclerview.widget.C0813j.AbstractC0835o.AbstractC0838c r7) {
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r5.f2845D
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.m1256a()
            if (r0 == 0) goto L_0x0013
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r5.f2845D
            boolean r3 = r0.f2880d
            int r0 = r0.f2878b
            goto L_0x0022
        L_0x0013:
            r5.m1310M()
            boolean r3 = r5.f2854x
            int r0 = r5.f2842A
            if (r0 != r1) goto L_0x0022
            if (r3 == 0) goto L_0x0021
            int r0 = r6 + (-1)
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r3 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            r3 = r0
            r0 = 0
        L_0x0028:
            int r4 = r5.f2848G
            if (r0 >= r4) goto L_0x0037
            if (r3 < 0) goto L_0x0037
            if (r3 >= r6) goto L_0x0037
            r7.mo655a(r3, r2)
            int r3 = r3 + r1
            int r0 = r0 + 1
            goto L_0x0028
        L_0x0037:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo773a(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager.C0769d
            if (r0 == 0) goto L_0x000b
            androidx.recyclerview.widget.LinearLayoutManager$d r2 = (androidx.recyclerview.widget.LinearLayoutManager.C0769d) r2
            r1.f2845D = r2
            r1.m657y()
        L_0x000b:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo757a(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.mo757a(r2)
            int r0 = r1.m697e()
            if (r0 <= 0) goto L_0x0017
            int r0 = r1.m1317F()
            r2.setFromIndex(r0)
            int r0 = r1.m1316G()
            r2.setToIndex(r0)
        L_0x0017:
            return
    }

    /* renamed from: a */
    void mo1304a(androidx.recyclerview.widget.C0813j.C0815a0 r2, androidx.recyclerview.widget.LinearLayoutManager.C0768c r3, androidx.recyclerview.widget.C0813j.AbstractC0835o.AbstractC0838c r4) {
            r1 = this;
            int r0 = r3.f2869d
            if (r0 < 0) goto L_0x0014
            int r2 = r2.m907a()
            if (r0 >= r2) goto L_0x0014
            r2 = 0
            int r3 = r3.f2872g
            int r2 = java.lang.Math.max(r2, r3)
            r4.mo655a(r0, r2)
        L_0x0014:
            return
    }

    /* renamed from: a */
    void mo1297a(androidx.recyclerview.widget.C0813j.C0847v r1, androidx.recyclerview.widget.C0813j.C0815a0 r2, androidx.recyclerview.widget.LinearLayoutManager.C0766a r3, int r4) {
            r0 = this;
            return
    }

    /* renamed from: a */
    void mo1296a(androidx.recyclerview.widget.C0813j.C0847v r8, androidx.recyclerview.widget.C0813j.C0815a0 r9, androidx.recyclerview.widget.LinearLayoutManager.C0768c r10, androidx.recyclerview.widget.LinearLayoutManager.C0767b r11) {
            r7 = this;
            android.view.View r8 = r10.m1259a(r8)
            r9 = 1
            if (r8 != 0) goto L_0x000a
            r11.f2863b = r9
            return
        L_0x000a:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r6 = r0
            androidx.recyclerview.widget.j$p r6 = (androidx.recyclerview.widget.C0813j.C0840p) r6
            java.util.List<androidx.recyclerview.widget.j$d0> r0 = r10.f2876k
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L_0x002a
            boolean r0 = r7.f2854x
            int r3 = r10.f2871f
            if (r3 != r1) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r0 != r3) goto L_0x0026
            r7.m727b(r8)
            goto L_0x003c
        L_0x0026:
            r7.m726b(r8, r2)
            goto L_0x003c
        L_0x002a:
            boolean r0 = r7.f2854x
            int r3 = r10.f2871f
            if (r3 != r1) goto L_0x0032
            r3 = 1
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r0 != r3) goto L_0x0039
            r7.m772a(r8)
            goto L_0x003c
        L_0x0039:
            r7.m771a(r8, r2)
        L_0x003c:
            r7.m770a(r8, r2, r2)
            androidx.recyclerview.widget.i r0 = r7.f2851u
            int r0 = r0.mo1037b(r8)
            r11.f2862a = r0
            int r0 = r7.f2849s
            if (r0 != r9) goto L_0x0083
            boolean r0 = r7.m1314I()
            if (r0 == 0) goto L_0x0063
            int r0 = r7.m665q()
            int r2 = r7.m668o()
            int r0 = r0 - r2
            androidx.recyclerview.widget.i r2 = r7.f2851u
            int r2 = r2.mo1035c(r8)
            int r2 = r0 - r2
            goto L_0x006e
        L_0x0063:
            int r2 = r7.m670n()
            androidx.recyclerview.widget.i r0 = r7.f2851u
            int r0 = r0.mo1035c(r8)
            int r0 = r0 + r2
        L_0x006e:
            int r3 = r10.f2871f
            int r10 = r10.f2867b
            if (r3 != r1) goto L_0x007c
            int r1 = r11.f2862a
            int r1 = r10 - r1
            r5 = r10
            r4 = r0
            r3 = r1
            goto L_0x00a4
        L_0x007c:
            int r1 = r11.f2862a
            int r1 = r1 + r10
            r3 = r10
            r4 = r0
            r5 = r1
            goto L_0x00a4
        L_0x0083:
            int r0 = r7.m666p()
            androidx.recyclerview.widget.i r2 = r7.f2851u
            int r2 = r2.mo1035c(r8)
            int r2 = r2 + r0
            int r3 = r10.f2871f
            int r10 = r10.f2867b
            if (r3 != r1) goto L_0x009d
            int r1 = r11.f2862a
            int r1 = r10 - r1
            r4 = r10
            r3 = r0
            r5 = r2
            r2 = r1
            goto L_0x00a4
        L_0x009d:
            int r1 = r11.f2862a
            int r1 = r1 + r10
            r3 = r0
            r4 = r1
            r5 = r2
            r2 = r10
        L_0x00a4:
            r0 = r7
            r1 = r8
            r0.m769a(r1, r2, r3, r4, r5)
            boolean r10 = r6.m652c()
            if (r10 != 0) goto L_0x00b5
            boolean r10 = r6.m653b()
            if (r10 == 0) goto L_0x00b7
        L_0x00b5:
            r11.f2864c = r9
        L_0x00b7:
            boolean r8 = r8.hasFocusable()
            r11.f2865d = r8
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo733a(java.lang.String r2) {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r1.f2845D
            if (r0 != 0) goto L_0x0007
            super.mo733a(r2)
        L_0x0007:
            return
    }

    /* renamed from: a */
    public void m1295a(boolean r2) {
            r1 = this;
            r0 = 0
            r1.mo733a(r0)
            boolean r0 = r1.f2853w
            if (r2 != r0) goto L_0x0009
            return
        L_0x0009:
            r1.f2853w = r2
            r1.m657y()
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public boolean mo788a() {
            r1 = this;
            int r0 = r1.f2849s
            if (r0 != 0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            return r0
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo728b(int r2, androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.C0813j.C0815a0 r4) {
            r1 = this;
            int r0 = r1.f2849s
            if (r0 != 0) goto L_0x0006
            r2 = 0
            return r2
        L_0x0006:
            int r2 = r1.m1286c(r2, r3, r4)
            return r2
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo723b(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1274j(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public android.view.View mo731b(int r3) {
            r2 = this;
            int r0 = r2.m697e()
            if (r0 != 0) goto L_0x0008
            r3 = 0
            return r3
        L_0x0008:
            r1 = 0
            android.view.View r1 = r2.m715c(r1)
            int r1 = r2.m673l(r1)
            int r1 = r3 - r1
            if (r1 < 0) goto L_0x0022
            if (r1 >= r0) goto L_0x0022
            android.view.View r0 = r2.m715c(r1)
            int r1 = r2.m673l(r0)
            if (r1 != r3) goto L_0x0022
            return r0
        L_0x0022:
            android.view.View r3 = super.mo731b(r3)
            return r3
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public void mo717b(androidx.recyclerview.widget.C0813j r1, androidx.recyclerview.widget.C0813j.C0847v r2) {
            r0 = this;
            super.mo717b(r1, r2)
            boolean r1 = r0.f2844C
            if (r1 == 0) goto L_0x000d
            r0.m722b(r2)
            r2.m630a()
        L_0x000d:
            return
    }

    /* renamed from: b */
    public void mo1288b(boolean r2) {
            r1 = this;
            r0 = 0
            r1.mo733a(r0)
            boolean r0 = r1.f2855y
            if (r0 != r2) goto L_0x0009
            return
        L_0x0009:
            r1.f2855y = r2
            r1.m657y()
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public boolean mo732b() {
            r2 = this;
            int r0 = r2.f2849s
            r1 = 1
            if (r0 != r1) goto L_0x0006
            goto L_0x0007
        L_0x0006:
            r1 = 0
        L_0x0007:
            return r1
    }

    /* renamed from: c */
    int m1286c(int r6, androidx.recyclerview.widget.C0813j.C0847v r7, androidx.recyclerview.widget.C0813j.C0815a0 r8) {
            r5 = this;
            int r0 = r5.m697e()
            r1 = 0
            if (r0 == 0) goto L_0x0039
            if (r6 != 0) goto L_0x000a
            goto L_0x0039
        L_0x000a:
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r5.f2850t
            r2 = 1
            r0.f2866a = r2
            r5.m1318E()
            if (r6 <= 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = -1
        L_0x0017:
            int r3 = java.lang.Math.abs(r6)
            r5.m1309a(r0, r3, r2, r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r5.f2850t
            int r4 = r2.f2872g
            int r7 = r5.m1300a(r7, r2, r8, r1)
            int r4 = r4 + r7
            if (r4 >= 0) goto L_0x002a
            return r1
        L_0x002a:
            if (r3 <= r4) goto L_0x002e
            int r6 = r0 * r4
        L_0x002e:
            androidx.recyclerview.widget.i r7 = r5.f2851u
            int r8 = -r6
            r7.mo1040a(r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r5.f2850t
            r7.f2875j = r6
            return r6
        L_0x0039:
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: c */
    public int mo711c(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1272k(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: c */
    public androidx.recyclerview.widget.C0813j.C0840p mo716c() {
            r2 = this;
            androidx.recyclerview.widget.j$p r0 = new androidx.recyclerview.widget.j$p
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: d */
    public int mo701d(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1276i(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public int mo694e(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1274j(r1)
            return r1
    }

    /* renamed from: e */
    android.view.View m1285e(int r4, int r5) {
            r3 = this;
            r3.m1318E()
            if (r5 <= r4) goto L_0x0007
            r0 = 1
            goto L_0x000c
        L_0x0007:
            if (r5 >= r4) goto L_0x000b
            r0 = -1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0013
            android.view.View r4 = r3.m715c(r4)
            return r4
        L_0x0013:
            androidx.recyclerview.widget.i r0 = r3.f2851u
            android.view.View r1 = r3.m715c(r4)
            int r0 = r0.mo1033d(r1)
            androidx.recyclerview.widget.i r1 = r3.f2851u
            int r1 = r1.mo1030f()
            if (r0 >= r1) goto L_0x002a
            r0 = 16644(0x4104, float:2.3323E-41)
            r1 = 16388(0x4004, float:2.2964E-41)
            goto L_0x002e
        L_0x002a:
            r0 = 4161(0x1041, float:5.831E-42)
            r1 = 4097(0x1001, float:5.741E-42)
        L_0x002e:
            int r2 = r3.f2849s
            if (r2 != 0) goto L_0x0035
            androidx.recyclerview.widget.n r2 = r3.f3214e
            goto L_0x0037
        L_0x0035:
            androidx.recyclerview.widget.n r2 = r3.f3215f
        L_0x0037:
            android.view.View r4 = r2.m550a(r4, r5, r0, r1)
            return r4
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public void mo693e(androidx.recyclerview.widget.C0813j.C0847v r9, androidx.recyclerview.widget.C0813j.C0815a0 r10) {
            r8 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r8.f2845D
            r1 = -1
            if (r0 != 0) goto L_0x0009
            int r0 = r8.f2842A
            if (r0 == r1) goto L_0x0013
        L_0x0009:
            int r0 = r10.m907a()
            if (r0 != 0) goto L_0x0013
            r8.m722b(r9)
            return
        L_0x0013:
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r8.f2845D
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.m1256a()
            if (r0 == 0) goto L_0x0023
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r8.f2845D
            int r0 = r0.f2878b
            r8.f2842A = r0
        L_0x0023:
            r8.m1318E()
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r8.f2850t
            r2 = 0
            r0.f2866a = r2
            r8.m1310M()
            android.view.View r0 = r8.m686g()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r8.f2846E
            boolean r3 = r3.f2861e
            r4 = 1
            if (r3 == 0) goto L_0x006a
            int r3 = r8.f2842A
            if (r3 != r1) goto L_0x006a
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r8.f2845D
            if (r3 == 0) goto L_0x0042
            goto L_0x006a
        L_0x0042:
            if (r0 == 0) goto L_0x007f
            androidx.recyclerview.widget.i r3 = r8.f2851u
            int r3 = r3.mo1033d(r0)
            androidx.recyclerview.widget.i r5 = r8.f2851u
            int r5 = r5.mo1038b()
            if (r3 >= r5) goto L_0x0060
            androidx.recyclerview.widget.i r3 = r8.f2851u
            int r3 = r3.mo1039a(r0)
            androidx.recyclerview.widget.i r5 = r8.f2851u
            int r5 = r5.mo1030f()
            if (r3 > r5) goto L_0x007f
        L_0x0060:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r8.f2846E
            int r5 = r8.m673l(r0)
            r3.m1264b(r0, r5)
            goto L_0x007f
        L_0x006a:
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r8.f2846E
            r0.m1265b()
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r8.f2846E
            boolean r3 = r8.f2854x
            boolean r5 = r8.f2855y
            r3 = r3 ^ r5
            r0.f2860d = r3
            r8.m1289b(r9, r10, r0)
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r8.f2846E
            r0.f2861e = r4
        L_0x007f:
            int r0 = r8.m1279h(r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r8.f2850t
            int r3 = r3.f2875j
            if (r3 < 0) goto L_0x008c
            r3 = r0
            r0 = 0
            goto L_0x008d
        L_0x008c:
            r3 = 0
        L_0x008d:
            androidx.recyclerview.widget.i r5 = r8.f2851u
            int r5 = r5.mo1030f()
            int r0 = r0 + r5
            androidx.recyclerview.widget.i r5 = r8.f2851u
            int r5 = r5.mo1036c()
            int r3 = r3 + r5
            boolean r5 = r10.m902d()
            if (r5 == 0) goto L_0x00da
            int r5 = r8.f2842A
            if (r5 == r1) goto L_0x00da
            int r6 = r8.f2843B
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r7) goto L_0x00da
            android.view.View r5 = r8.mo731b(r5)
            if (r5 == 0) goto L_0x00da
            boolean r6 = r8.f2854x
            if (r6 == 0) goto L_0x00c5
            androidx.recyclerview.widget.i r6 = r8.f2851u
            int r6 = r6.mo1038b()
            androidx.recyclerview.widget.i r7 = r8.f2851u
            int r5 = r7.mo1039a(r5)
            int r6 = r6 - r5
            int r5 = r8.f2843B
            goto L_0x00d4
        L_0x00c5:
            androidx.recyclerview.widget.i r6 = r8.f2851u
            int r5 = r6.mo1033d(r5)
            androidx.recyclerview.widget.i r6 = r8.f2851u
            int r6 = r6.mo1030f()
            int r5 = r5 - r6
            int r6 = r8.f2843B
        L_0x00d4:
            int r6 = r6 - r5
            if (r6 <= 0) goto L_0x00d9
            int r0 = r0 + r6
            goto L_0x00da
        L_0x00d9:
            int r3 = r3 - r6
        L_0x00da:
            androidx.recyclerview.widget.LinearLayoutManager$a r5 = r8.f2846E
            boolean r5 = r5.f2860d
            if (r5 == 0) goto L_0x00e6
            boolean r5 = r8.f2854x
            if (r5 == 0) goto L_0x00ea
        L_0x00e4:
            r1 = 1
            goto L_0x00ea
        L_0x00e6:
            boolean r5 = r8.f2854x
            if (r5 == 0) goto L_0x00e4
        L_0x00ea:
            androidx.recyclerview.widget.LinearLayoutManager$a r5 = r8.f2846E
            r8.mo1297a(r9, r10, r5, r1)
            r8.m753a(r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r8.f2850t
            boolean r5 = r8.m1313J()
            r1.f2877l = r5
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r8.f2850t
            boolean r5 = r10.m902d()
            r1.f2874i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r8.f2846E
            boolean r5 = r1.f2860d
            if (r5 == 0) goto L_0x0147
            r8.m1292b(r1)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r8.f2850t
            r1.f2873h = r0
            r8.m1300a(r9, r1, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r8.f2850t
            int r1 = r0.f2867b
            int r5 = r0.f2869d
            int r0 = r0.f2868c
            if (r0 <= 0) goto L_0x011d
            int r3 = r3 + r0
        L_0x011d:
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r8.f2846E
            r8.m1306a(r0)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r8.f2850t
            r0.f2873h = r3
            int r3 = r0.f2869d
            int r6 = r0.f2870e
            int r3 = r3 + r6
            r0.f2869d = r3
            r8.m1300a(r9, r0, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r8.f2850t
            int r3 = r0.f2867b
            int r0 = r0.f2868c
            if (r0 <= 0) goto L_0x0185
            r8.m1282g(r5, r1)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r8.f2850t
            r1.f2873h = r0
            r8.m1300a(r9, r1, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r8.f2850t
            int r1 = r0.f2867b
            goto L_0x0185
        L_0x0147:
            r8.m1306a(r1)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r8.f2850t
            r1.f2873h = r3
            r8.m1300a(r9, r1, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r8.f2850t
            int r3 = r1.f2867b
            int r5 = r1.f2869d
            int r1 = r1.f2868c
            if (r1 <= 0) goto L_0x015c
            int r0 = r0 + r1
        L_0x015c:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r8.f2846E
            r8.m1292b(r1)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r8.f2850t
            r1.f2873h = r0
            int r0 = r1.f2869d
            int r6 = r1.f2870e
            int r0 = r0 + r6
            r1.f2869d = r0
            r8.m1300a(r9, r1, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r8.f2850t
            int r1 = r0.f2867b
            int r0 = r0.f2868c
            if (r0 <= 0) goto L_0x0185
            r8.m1284f(r5, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r8.f2850t
            r3.f2873h = r0
            r8.m1300a(r9, r3, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r8.f2850t
            int r3 = r0.f2867b
        L_0x0185:
            int r0 = r8.m697e()
            if (r0 <= 0) goto L_0x01a9
            boolean r0 = r8.f2854x
            boolean r5 = r8.f2855y
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x019d
            int r0 = r8.m1307a(r3, r9, r10, r4)
            int r1 = r1 + r0
            int r3 = r3 + r0
            int r0 = r8.m1293b(r1, r9, r10, r2)
            goto L_0x01a7
        L_0x019d:
            int r0 = r8.m1293b(r1, r9, r10, r4)
            int r1 = r1 + r0
            int r3 = r3 + r0
            int r0 = r8.m1307a(r3, r9, r10, r2)
        L_0x01a7:
            int r1 = r1 + r0
            int r3 = r3 + r0
        L_0x01a9:
            r8.m1290b(r9, r10, r1, r3)
            boolean r9 = r10.m902d()
            if (r9 != 0) goto L_0x01b8
            androidx.recyclerview.widget.i r9 = r8.f2851u
            r9.m1042i()
            goto L_0x01bd
        L_0x01b8:
            androidx.recyclerview.widget.LinearLayoutManager$a r9 = r8.f2846E
            r9.m1265b()
        L_0x01bd:
            boolean r9 = r8.f2855y
            r8.f2852v = r9
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: f */
    public int mo688f(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1272k(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: g */
    public void mo683g(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            super.mo683g(r1)
            r1 = 0
            r0.f2845D = r1
            r1 = -1
            r0.f2842A = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f2843B = r1
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.f2846E
            r1.m1265b()
            return
    }

    /* renamed from: h */
    int m1280h(int r5) {
            r4 = this;
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L_0x0047
            r2 = 2
            if (r5 == r2) goto L_0x003a
            r2 = 17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L_0x0032
            r2 = 33
            if (r5 == r2) goto L_0x002a
            r0 = 66
            if (r5 == r0) goto L_0x0022
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L_0x001a
            return r3
        L_0x001a:
            int r5 = r4.f2849s
            if (r5 != r1) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0021:
            return r1
        L_0x0022:
            int r5 = r4.f2849s
            if (r5 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0029:
            return r1
        L_0x002a:
            int r5 = r4.f2849s
            if (r5 != r1) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0031:
            return r0
        L_0x0032:
            int r5 = r4.f2849s
            if (r5 != 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0039:
            return r0
        L_0x003a:
            int r5 = r4.f2849s
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            boolean r5 = r4.m1314I()
            if (r5 == 0) goto L_0x0046
            return r0
        L_0x0046:
            return r1
        L_0x0047:
            int r5 = r4.f2849s
            if (r5 != r1) goto L_0x004c
            return r0
        L_0x004c:
            boolean r5 = r4.m1314I()
            if (r5 == 0) goto L_0x0053
            return r1
        L_0x0053:
            return r0
    }

    /* renamed from: h */
    protected int m1279h(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            boolean r1 = r1.m903c()
            if (r1 == 0) goto L_0x000d
            androidx.recyclerview.widget.i r1 = r0.f2851u
            int r1 = r1.mo1028g()
            return r1
        L_0x000d:
            r1 = 0
            return r1
    }

    /* renamed from: i */
    public void m1277i(int r4) {
            r3 = this;
            if (r4 == 0) goto L_0x001d
            r0 = 1
            if (r4 != r0) goto L_0x0006
            goto L_0x001d
        L_0x0006:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid orientation:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x001d:
            r0 = 0
            r3.mo733a(r0)
            int r0 = r3.f2849s
            if (r4 != r0) goto L_0x0029
            androidx.recyclerview.widget.i r0 = r3.f2851u
            if (r0 != 0) goto L_0x003a
        L_0x0029:
            androidx.recyclerview.widget.i r0 = androidx.recyclerview.widget.AbstractC0810i.m1045a(r3, r4)
            r3.f2851u = r0
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r3.f2846E
            androidx.recyclerview.widget.i r1 = r3.f2851u
            r0.f2857a = r1
            r3.f2849s = r4
            r3.m657y()
        L_0x003a:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: u */
    public boolean mo661u() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: x */
    public android.os.Parcelable mo658x() {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r4.f2845D
            if (r0 == 0) goto L_0x000a
            androidx.recyclerview.widget.LinearLayoutManager$d r1 = new androidx.recyclerview.widget.LinearLayoutManager$d
            r1.<init>(r0)
            return r1
        L_0x000a:
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = new androidx.recyclerview.widget.LinearLayoutManager$d
            r0.<init>()
            int r1 = r4.m697e()
            if (r1 <= 0) goto L_0x0055
            r4.m1318E()
            boolean r1 = r4.f2852v
            boolean r2 = r4.f2854x
            r1 = r1 ^ r2
            r0.f2880d = r1
            if (r1 == 0) goto L_0x003b
            android.view.View r1 = r4.m1312K()
            androidx.recyclerview.widget.i r2 = r4.f2851u
            int r2 = r2.mo1038b()
            androidx.recyclerview.widget.i r3 = r4.f2851u
            int r3 = r3.mo1039a(r1)
            int r2 = r2 - r3
            r0.f2879c = r2
            int r1 = r4.m673l(r1)
            r0.f2878b = r1
            goto L_0x0058
        L_0x003b:
            android.view.View r1 = r4.m1311L()
            int r2 = r4.m673l(r1)
            r0.f2878b = r2
            androidx.recyclerview.widget.i r2 = r4.f2851u
            int r1 = r2.mo1033d(r1)
            androidx.recyclerview.widget.i r2 = r4.f2851u
            int r2 = r2.mo1030f()
            int r1 = r1 - r2
            r0.f2879c = r1
            goto L_0x0058
        L_0x0055:
            r0.m1255b()
        L_0x0058:
            return r0
    }
}
