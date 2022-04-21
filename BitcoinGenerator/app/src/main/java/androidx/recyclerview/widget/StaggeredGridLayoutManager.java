package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends androidx.recyclerview.widget.C0813j.AbstractC0835o implements androidx.recyclerview.widget.C0813j.AbstractC0852z.AbstractC0853a {

    /* renamed from: A */
    boolean f2881A;

    /* renamed from: B */
    private java.util.BitSet f2882B;

    /* renamed from: C */
    int f2883C;

    /* renamed from: D */
    int f2884D;

    /* renamed from: E */
    androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d f2885E;

    /* renamed from: F */
    private int f2886F;

    /* renamed from: G */
    private boolean f2887G;

    /* renamed from: H */
    private boolean f2888H;

    /* renamed from: I */
    private androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e f2889I;

    /* renamed from: J */
    private int f2890J;

    /* renamed from: K */
    private final android.graphics.Rect f2891K;

    /* renamed from: L */
    private final androidx.recyclerview.widget.StaggeredGridLayoutManager.C0772b f2892L;

    /* renamed from: M */
    private boolean f2893M;

    /* renamed from: N */
    private boolean f2894N;

    /* renamed from: O */
    private int[] f2895O;

    /* renamed from: P */
    private final java.lang.Runnable f2896P;

    /* renamed from: s */
    private int f2897s;

    /* renamed from: t */
    androidx.recyclerview.widget.StaggeredGridLayoutManager.C0779f[] f2898t;

    /* renamed from: u */
    androidx.recyclerview.widget.AbstractC0810i f2899u;

    /* renamed from: v */
    androidx.recyclerview.widget.AbstractC0810i f2900v;

    /* renamed from: w */
    private int f2901w;

    /* renamed from: x */
    private int f2902x;

    /* renamed from: y */
    private final androidx.recyclerview.widget.C0807g f2903y;

    /* renamed from: z */
    boolean f2904z;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes.dex */
    class RunnableC0771a implements java.lang.Runnable {

        /* renamed from: b */
        final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f2905b;

        RunnableC0771a(androidx.recyclerview.widget.StaggeredGridLayoutManager r1) {
                r0 = this;
                r0.f2905b = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.f2905b
                r0.m1252F()
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes.dex */
    class C0772b {

        /* renamed from: a */
        int f2906a;

        /* renamed from: b */
        int f2907b;

        /* renamed from: c */
        boolean f2908c;

        /* renamed from: d */
        boolean f2909d;

        /* renamed from: e */
        boolean f2910e;

        /* renamed from: f */
        int[] f2911f;

        /* renamed from: g */
        final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f2912g;

        C0772b(androidx.recyclerview.widget.StaggeredGridLayoutManager r1) {
                r0 = this;
                r0.f2912g = r1
                r0.<init>()
                r0.m1193b()
                return
        }

        /* renamed from: a */
        void m1196a() {
                r1 = this;
                boolean r0 = r1.f2908c
                if (r0 == 0) goto L_0x000d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.f2912g
                androidx.recyclerview.widget.i r0 = r0.f2899u
                int r0 = r0.mo1038b()
                goto L_0x0015
            L_0x000d:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.f2912g
                androidx.recyclerview.widget.i r0 = r0.f2899u
                int r0 = r0.mo1030f()
            L_0x0015:
                r1.f2907b = r0
                return
        }

        /* renamed from: a */
        void m1195a(int r2) {
                r1 = this;
                boolean r0 = r1.f2908c
                if (r0 == 0) goto L_0x000e
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.f2912g
                androidx.recyclerview.widget.i r0 = r0.f2899u
                int r0 = r0.mo1038b()
                int r0 = r0 - r2
                goto L_0x0017
            L_0x000e:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.f2912g
                androidx.recyclerview.widget.i r0 = r0.f2899u
                int r0 = r0.mo1030f()
                int r0 = r0 + r2
            L_0x0017:
                r1.f2907b = r0
                return
        }

        /* renamed from: a */
        void m1194a(androidx.recyclerview.widget.StaggeredGridLayoutManager.C0779f[] r6) {
                r5 = this;
                int r0 = r6.length
                int[] r1 = r5.f2911f
                if (r1 == 0) goto L_0x0008
                int r1 = r1.length
                if (r1 >= r0) goto L_0x0011
            L_0x0008:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r5.f2912g
                androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r1.f2898t
                int r1 = r1.length
                int[] r1 = new int[r1]
                r5.f2911f = r1
            L_0x0011:
                r1 = 0
            L_0x0012:
                if (r1 >= r0) goto L_0x0023
                int[] r2 = r5.f2911f
                r3 = r6[r1]
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                int r3 = r3.m1165b(r4)
                r2[r1] = r3
                int r1 = r1 + 1
                goto L_0x0012
            L_0x0023:
                return
        }

        /* renamed from: b */
        void m1193b() {
                r2 = this;
                r0 = -1
                r2.f2906a = r0
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2.f2907b = r1
                r1 = 0
                r2.f2908c = r1
                r2.f2909d = r1
                r2.f2910e = r1
                int[] r1 = r2.f2911f
                if (r1 == 0) goto L_0x0015
                java.util.Arrays.fill(r1, r0)
            L_0x0015:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0773c extends androidx.recyclerview.widget.C0813j.C0840p {

        /* renamed from: e */
        androidx.recyclerview.widget.StaggeredGridLayoutManager.C0779f f2913e;

        /* renamed from: f */
        boolean f2914f;

        public C0773c(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0773c(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0773c(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public C0773c(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* renamed from: e */
        public final int m1192e() {
                r1 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r1.f2913e
                if (r0 != 0) goto L_0x0006
                r0 = -1
                return r0
            L_0x0006:
                int r0 = r0.f2935e
                return r0
        }

        /* renamed from: f */
        public boolean m1191f() {
                r1 = this;
                boolean r0 = r1.f2914f
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes.dex */
    static class C0774d {

        /* renamed from: a */
        int[] f2915a;

        /* renamed from: b */
        java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a> f2916b;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        /* loaded from: classes.dex */
        static class C0775a implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a> CREATOR = null;

            /* renamed from: b */
            int f2917b;

            /* renamed from: c */
            int f2918c;

            /* renamed from: d */
            int[] f2919d;

            /* renamed from: e */
            boolean f2920e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: classes.dex */
            static class C0776a implements android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a> {
                C0776a() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a createFromParcel(android.os.Parcel r2) {
                        r1 = this;
                        androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a
                        r0.<init>(r2)
                        return r0
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a createFromParcel(android.os.Parcel r1) {
                        r0 = this;
                        androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r1 = r0.createFromParcel(r1)
                        return r1
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a[] newArray(int r1) {
                        r0 = this;
                        androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a[] r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a[r1]
                        return r1
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a[] newArray(int r1) {
                        r0 = this;
                        androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a[] r1 = r0.newArray(r1)
                        return r1
                }
            }

            static {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a
                    r0.<init>()
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a.CREATOR = r0
                    return
            }

            C0775a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            C0775a(android.os.Parcel r3) {
                    r2 = this;
                    r2.<init>()
                    int r0 = r3.readInt()
                    r2.f2917b = r0
                    int r0 = r3.readInt()
                    r2.f2918c = r0
                    int r0 = r3.readInt()
                    r1 = 1
                    if (r0 != r1) goto L_0x0017
                    goto L_0x0018
                L_0x0017:
                    r1 = 0
                L_0x0018:
                    r2.f2920e = r1
                    int r0 = r3.readInt()
                    if (r0 <= 0) goto L_0x0029
                    int[] r0 = new int[r0]
                    r2.f2919d = r0
                    int[] r0 = r2.f2919d
                    r3.readIntArray(r0)
                L_0x0029:
                    return
            }

            /* renamed from: a */
            int m1175a(int r2) {
                    r1 = this;
                    int[] r0 = r1.f2919d
                    if (r0 != 0) goto L_0x0006
                    r2 = 0
                    goto L_0x0008
                L_0x0006:
                    r2 = r0[r2]
                L_0x0008:
                    return r2
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "FullSpanItem{mPosition="
                    r0.append(r1)
                    int r1 = r2.f2917b
                    r0.append(r1)
                    java.lang.String r1 = ", mGapDir="
                    r0.append(r1)
                    int r1 = r2.f2918c
                    r0.append(r1)
                    java.lang.String r1 = ", mHasUnwantedGapAfter="
                    r0.append(r1)
                    boolean r1 = r2.f2920e
                    r0.append(r1)
                    java.lang.String r1 = ", mGapPerSpan="
                    r0.append(r1)
                    int[] r1 = r2.f2919d
                    java.lang.String r1 = java.util.Arrays.toString(r1)
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel r2, int r3) {
                    r1 = this;
                    int r3 = r1.f2917b
                    r2.writeInt(r3)
                    int r3 = r1.f2918c
                    r2.writeInt(r3)
                    boolean r3 = r1.f2920e
                    r2.writeInt(r3)
                    int[] r3 = r1.f2919d
                    if (r3 == 0) goto L_0x0020
                    int r0 = r3.length
                    if (r0 <= 0) goto L_0x0020
                    int r3 = r3.length
                    r2.writeInt(r3)
                    int[] r3 = r1.f2919d
                    r2.writeIntArray(r3)
                    goto L_0x0024
                L_0x0020:
                    r3 = 0
                    r2.writeInt(r3)
                L_0x0024:
                    return
            }
        }

        C0774d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: c */
        private void m1181c(int r4, int r5) {
                r3 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r3.f2916b
                if (r0 != 0) goto L_0x0005
                return
            L_0x0005:
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L_0x000b:
                if (r0 < 0) goto L_0x0020
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = r3.f2916b
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a) r1
                int r2 = r1.f2917b
                if (r2 >= r4) goto L_0x001a
                goto L_0x001d
            L_0x001a:
                int r2 = r2 + r5
                r1.f2917b = r2
            L_0x001d:
                int r0 = r0 + (-1)
                goto L_0x000b
            L_0x0020:
                return
        }

        /* renamed from: d */
        private void m1179d(int r5, int r6) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2916b
                if (r0 != 0) goto L_0x0005
                return
            L_0x0005:
                int r1 = r5 + r6
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L_0x000d:
                if (r0 < 0) goto L_0x002a
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f2916b
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a) r2
                int r3 = r2.f2917b
                if (r3 >= r5) goto L_0x001c
                goto L_0x0027
            L_0x001c:
                if (r3 >= r1) goto L_0x0024
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f2916b
                r2.remove(r0)
                goto L_0x0027
            L_0x0024:
                int r3 = r3 - r6
                r2.f2917b = r3
            L_0x0027:
                int r0 = r0 + (-1)
                goto L_0x000d
            L_0x002a:
                return
        }

        /* renamed from: g */
        private int m1176g(int r5) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2916b
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.m1182c(r5)
                if (r0 == 0) goto L_0x0011
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f2916b
                r2.remove(r0)
            L_0x0011:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2916b
                int r0 = r0.size()
                r2 = 0
            L_0x0018:
                if (r2 >= r0) goto L_0x002a
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f2916b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a) r3
                int r3 = r3.f2917b
                if (r3 < r5) goto L_0x0027
                goto L_0x002b
            L_0x0027:
                int r2 = r2 + 1
                goto L_0x0018
            L_0x002a:
                r2 = -1
            L_0x002b:
                if (r2 == r1) goto L_0x003d
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r5 = r4.f2916b
                java.lang.Object r5 = r5.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a) r5
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2916b
                r0.remove(r2)
                int r5 = r5.f2917b
                return r5
            L_0x003d:
                return r1
        }

        /* renamed from: a */
        public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a m1187a(int r6, int r7, int r8, boolean r9) {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2916b
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.size()
                r2 = 0
            L_0x000b:
                if (r2 >= r0) goto L_0x002c
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f2916b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a) r3
                int r4 = r3.f2917b
                if (r4 < r7) goto L_0x001a
                return r1
            L_0x001a:
                if (r4 < r6) goto L_0x0029
                if (r8 == 0) goto L_0x0028
                int r4 = r3.f2918c
                if (r4 == r8) goto L_0x0028
                if (r9 == 0) goto L_0x0029
                boolean r4 = r3.f2920e
                if (r4 == 0) goto L_0x0029
            L_0x0028:
                return r3
            L_0x0029:
                int r2 = r2 + 1
                goto L_0x000b
            L_0x002c:
                return r1
        }

        /* renamed from: a */
        void m1190a() {
                r2 = this;
                int[] r0 = r2.f2915a
                if (r0 == 0) goto L_0x0008
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            L_0x0008:
                r0 = 0
                r2.f2916b = r0
                return
        }

        /* renamed from: a */
        void m1189a(int r5) {
                r4 = this;
                int[] r0 = r4.f2915a
                r1 = -1
                if (r0 != 0) goto L_0x0017
                r0 = 10
                int r5 = java.lang.Math.max(r5, r0)
                int r5 = r5 + 1
                int[] r5 = new int[r5]
                r4.f2915a = r5
                int[] r5 = r4.f2915a
                java.util.Arrays.fill(r5, r1)
                goto L_0x0030
            L_0x0017:
                int r2 = r0.length
                if (r5 < r2) goto L_0x0030
                int r5 = r4.m1177f(r5)
                int[] r5 = new int[r5]
                r4.f2915a = r5
                int[] r5 = r4.f2915a
                int r2 = r0.length
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r5, r3, r2)
                int[] r5 = r4.f2915a
                int r0 = r0.length
                int r2 = r5.length
                java.util.Arrays.fill(r5, r0, r2, r1)
            L_0x0030:
                return
        }

        /* renamed from: a */
        void m1188a(int r4, int r5) {
                r3 = this;
                int[] r0 = r3.f2915a
                if (r0 == 0) goto L_0x001e
                int r0 = r0.length
                if (r4 < r0) goto L_0x0008
                goto L_0x001e
            L_0x0008:
                int r0 = r4 + r5
                r3.m1189a(r0)
                int[] r1 = r3.f2915a
                int r2 = r1.length
                int r2 = r2 - r4
                int r2 = r2 - r5
                java.lang.System.arraycopy(r1, r4, r1, r0, r2)
                int[] r1 = r3.f2915a
                r2 = -1
                java.util.Arrays.fill(r1, r4, r0, r2)
                r3.m1181c(r4, r5)
            L_0x001e:
                return
        }

        /* renamed from: a */
        void m1186a(int r2, androidx.recyclerview.widget.StaggeredGridLayoutManager.C0779f r3) {
                r1 = this;
                r1.m1189a(r2)
                int[] r0 = r1.f2915a
                int r3 = r3.f2935e
                r0[r2] = r3
                return
        }

        /* renamed from: a */
        public void m1185a(androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a r6) {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2916b
                if (r0 != 0) goto L_0x000b
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.f2916b = r0
            L_0x000b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2916b
                int r0 = r0.size()
                r1 = 0
            L_0x0012:
                if (r1 >= r0) goto L_0x0036
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r5.f2916b
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a) r2
                int r3 = r2.f2917b
                int r4 = r6.f2917b
                if (r3 != r4) goto L_0x0027
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f2916b
                r3.remove(r1)
            L_0x0027:
                int r2 = r2.f2917b
                int r3 = r6.f2917b
                if (r2 < r3) goto L_0x0033
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2916b
                r0.add(r1, r6)
                return
            L_0x0033:
                int r1 = r1 + 1
                goto L_0x0012
            L_0x0036:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2916b
                r0.add(r6)
                return
        }

        /* renamed from: b */
        int m1184b(int r3) {
                r2 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r2.f2916b
                if (r0 == 0) goto L_0x0020
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L_0x000a:
                if (r0 < 0) goto L_0x0020
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = r2.f2916b
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a) r1
                int r1 = r1.f2917b
                if (r1 < r3) goto L_0x001d
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = r2.f2916b
                r1.remove(r0)
            L_0x001d:
                int r0 = r0 + (-1)
                goto L_0x000a
            L_0x0020:
                int r3 = r2.m1178e(r3)
                return r3
        }

        /* renamed from: b */
        void m1183b(int r5, int r6) {
                r4 = this;
                int[] r0 = r4.f2915a
                if (r0 == 0) goto L_0x0021
                int r0 = r0.length
                if (r5 < r0) goto L_0x0008
                goto L_0x0021
            L_0x0008:
                int r0 = r5 + r6
                r4.m1189a(r0)
                int[] r1 = r4.f2915a
                int r2 = r1.length
                int r2 = r2 - r5
                int r2 = r2 - r6
                java.lang.System.arraycopy(r1, r0, r1, r5, r2)
                int[] r0 = r4.f2915a
                int r1 = r0.length
                int r1 = r1 - r6
                int r2 = r0.length
                r3 = -1
                java.util.Arrays.fill(r0, r1, r2, r3)
                r4.m1179d(r5, r6)
            L_0x0021:
                return
        }

        /* renamed from: c */
        public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a m1182c(int r5) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2916b
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L_0x000c:
                if (r0 < 0) goto L_0x001e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f2916b
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a) r2
                int r3 = r2.f2917b
                if (r3 != r5) goto L_0x001b
                return r2
            L_0x001b:
                int r0 = r0 + (-1)
                goto L_0x000c
            L_0x001e:
                return r1
        }

        /* renamed from: d */
        int m1180d(int r3) {
                r2 = this;
                int[] r0 = r2.f2915a
                if (r0 == 0) goto L_0x000b
                int r1 = r0.length
                if (r3 < r1) goto L_0x0008
                goto L_0x000b
            L_0x0008:
                r3 = r0[r3]
                return r3
            L_0x000b:
                r3 = -1
                return r3
        }

        /* renamed from: e */
        int m1178e(int r4) {
                r3 = this;
                int[] r0 = r3.f2915a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r4 < r0) goto L_0x000a
                return r1
            L_0x000a:
                int r0 = r3.m1176g(r4)
                if (r0 != r1) goto L_0x001a
                int[] r0 = r3.f2915a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r4, r2, r1)
                int[] r4 = r3.f2915a
                int r4 = r4.length
                return r4
            L_0x001a:
                int[] r2 = r3.f2915a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r4, r0, r1)
                return r0
        }

        /* renamed from: f */
        int m1177f(int r2) {
                r1 = this;
                int[] r0 = r1.f2915a
                int r0 = r0.length
            L_0x0003:
                if (r0 > r2) goto L_0x0008
                int r0 = r0 * 2
                goto L_0x0003
            L_0x0008:
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    /* loaded from: classes.dex */
    public static class C0777e implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e> CREATOR = null;

        /* renamed from: b */
        int f2921b;

        /* renamed from: c */
        int f2922c;

        /* renamed from: d */
        int f2923d;

        /* renamed from: e */
        int[] f2924e;

        /* renamed from: f */
        int f2925f;

        /* renamed from: g */
        int[] f2926g;

        /* renamed from: h */
        java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a> f2927h;

        /* renamed from: i */
        boolean f2928i;

        /* renamed from: j */
        boolean f2929j;

        /* renamed from: k */
        boolean f2930k;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        /* loaded from: classes.dex */
        static class C0778a implements android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e> {
            C0778a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r0.createFromParcel(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e[r1]
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r1 = r0.newArray(r1)
                    return r1
            }
        }

        static {
                androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a
                r0.<init>()
                androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e.CREATOR = r0
                return
        }

        public C0777e() {
                r0 = this;
                r0.<init>()
                return
        }

        C0777e(android.os.Parcel r4) {
                r3 = this;
                r3.<init>()
                int r0 = r4.readInt()
                r3.f2921b = r0
                int r0 = r4.readInt()
                r3.f2922c = r0
                int r0 = r4.readInt()
                r3.f2923d = r0
                int r0 = r3.f2923d
                if (r0 <= 0) goto L_0x0022
                int[] r0 = new int[r0]
                r3.f2924e = r0
                int[] r0 = r3.f2924e
                r4.readIntArray(r0)
            L_0x0022:
                int r0 = r4.readInt()
                r3.f2925f = r0
                int r0 = r3.f2925f
                if (r0 <= 0) goto L_0x0035
                int[] r0 = new int[r0]
                r3.f2926g = r0
                int[] r0 = r3.f2926g
                r4.readIntArray(r0)
            L_0x0035:
                int r0 = r4.readInt()
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L_0x003f
                r0 = 1
                goto L_0x0040
            L_0x003f:
                r0 = 0
            L_0x0040:
                r3.f2928i = r0
                int r0 = r4.readInt()
                if (r0 != r2) goto L_0x004a
                r0 = 1
                goto L_0x004b
            L_0x004a:
                r0 = 0
            L_0x004b:
                r3.f2929j = r0
                int r0 = r4.readInt()
                if (r0 != r2) goto L_0x0054
                r1 = 1
            L_0x0054:
                r3.f2930k = r1
                java.lang.Class<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.util.ArrayList r4 = r4.readArrayList(r0)
                r3.f2927h = r4
                return
        }

        public C0777e(androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.f2923d
                r1.f2923d = r0
                int r0 = r2.f2921b
                r1.f2921b = r0
                int r0 = r2.f2922c
                r1.f2922c = r0
                int[] r0 = r2.f2924e
                r1.f2924e = r0
                int r0 = r2.f2925f
                r1.f2925f = r0
                int[] r0 = r2.f2926g
                r1.f2926g = r0
                boolean r0 = r2.f2928i
                r1.f2928i = r0
                boolean r0 = r2.f2929j
                r1.f2929j = r0
                boolean r0 = r2.f2930k
                r1.f2930k = r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r2.f2927h
                r1.f2927h = r2
                return
        }

        /* renamed from: a */
        void m1174a() {
                r2 = this;
                r0 = 0
                r2.f2924e = r0
                r1 = 0
                r2.f2923d = r1
                r2.f2925f = r1
                r2.f2926g = r0
                r2.f2927h = r0
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
                int r2 = r0.f2921b
                r1.writeInt(r2)
                int r2 = r0.f2922c
                r1.writeInt(r2)
                int r2 = r0.f2923d
                r1.writeInt(r2)
                int r2 = r0.f2923d
                if (r2 <= 0) goto L_0x0018
                int[] r2 = r0.f2924e
                r1.writeIntArray(r2)
            L_0x0018:
                int r2 = r0.f2925f
                r1.writeInt(r2)
                int r2 = r0.f2925f
                if (r2 <= 0) goto L_0x0026
                int[] r2 = r0.f2926g
                r1.writeIntArray(r2)
            L_0x0026:
                boolean r2 = r0.f2928i
                r1.writeInt(r2)
                boolean r2 = r0.f2929j
                r1.writeInt(r2)
                boolean r2 = r0.f2930k
                r1.writeInt(r2)
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r0.f2927h
                r1.writeList(r2)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    /* loaded from: classes.dex */
    class C0779f {

        /* renamed from: a */
        java.util.ArrayList<android.view.View> f2931a;

        /* renamed from: b */
        int f2932b;

        /* renamed from: c */
        int f2933c;

        /* renamed from: d */
        int f2934d;

        /* renamed from: e */
        final int f2935e;

        /* renamed from: f */
        final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f2936f;

        C0779f(androidx.recyclerview.widget.StaggeredGridLayoutManager r1, int r2) {
                r0 = this;
                r0.f2936f = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f2931a = r1
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0.f2932b = r1
                r0.f2933c = r1
                r1 = 0
                r0.f2934d = r1
                r0.f2935e = r2
                return
        }

        /* renamed from: a */
        int m1172a(int r3) {
                r2 = this;
                int r0 = r2.f2933c
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L_0x0007
                return r0
            L_0x0007:
                java.util.ArrayList<android.view.View> r0 = r2.f2931a
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0010
                return r3
            L_0x0010:
                r2.m1173a()
                int r3 = r2.f2933c
                return r3
        }

        /* renamed from: a */
        int m1170a(int r7, int r8, boolean r9) {
                r6 = this;
                r3 = 0
                r4 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r5 = r9
                int r7 = r0.m1169a(r1, r2, r3, r4, r5)
                return r7
        }

        /* renamed from: a */
        int m1169a(int r11, int r12, boolean r13, boolean r14, boolean r15) {
                r10 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r10.f2936f
                androidx.recyclerview.widget.i r0 = r0.f2899u
                int r0 = r0.mo1030f()
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r10.f2936f
                androidx.recyclerview.widget.i r1 = r1.f2899u
                int r1 = r1.mo1038b()
                r2 = -1
                r3 = 1
                if (r12 <= r11) goto L_0x0016
                r4 = 1
                goto L_0x0017
            L_0x0016:
                r4 = -1
            L_0x0017:
                if (r11 == r12) goto L_0x0061
                java.util.ArrayList<android.view.View> r5 = r10.f2931a
                java.lang.Object r5 = r5.get(r11)
                android.view.View r5 = (android.view.View) r5
                androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r10.f2936f
                androidx.recyclerview.widget.i r6 = r6.f2899u
                int r6 = r6.mo1033d(r5)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = r10.f2936f
                androidx.recyclerview.widget.i r7 = r7.f2899u
                int r7 = r7.mo1039a(r5)
                r8 = 0
                if (r15 == 0) goto L_0x0037
                if (r6 > r1) goto L_0x003b
                goto L_0x0039
            L_0x0037:
                if (r6 >= r1) goto L_0x003b
            L_0x0039:
                r9 = 1
                goto L_0x003c
            L_0x003b:
                r9 = 0
            L_0x003c:
                if (r15 == 0) goto L_0x0041
                if (r7 < r0) goto L_0x0044
                goto L_0x0043
            L_0x0041:
                if (r7 <= r0) goto L_0x0044
            L_0x0043:
                r8 = 1
            L_0x0044:
                if (r9 == 0) goto L_0x005f
                if (r8 == 0) goto L_0x005f
                if (r13 == 0) goto L_0x0057
                if (r14 == 0) goto L_0x0057
                if (r6 < r0) goto L_0x005f
                if (r7 > r1) goto L_0x005f
            L_0x0050:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = r10.f2936f
                int r11 = r11.m673l(r5)
                return r11
            L_0x0057:
                if (r14 == 0) goto L_0x005a
                goto L_0x0050
            L_0x005a:
                if (r6 < r0) goto L_0x0050
                if (r7 <= r1) goto L_0x005f
                goto L_0x0050
            L_0x005f:
                int r11 = r11 + r4
                goto L_0x0017
            L_0x0061:
                return r2
        }

        /* renamed from: a */
        public android.view.View m1171a(int r6, int r7) {
                r5 = this;
                r0 = -1
                r1 = 0
                if (r7 != r0) goto L_0x0038
                java.util.ArrayList<android.view.View> r7 = r5.f2931a
                int r7 = r7.size()
                r0 = 0
            L_0x000b:
                if (r0 >= r7) goto L_0x006d
                java.util.ArrayList<android.view.View> r2 = r5.f2931a
                java.lang.Object r2 = r2.get(r0)
                android.view.View r2 = (android.view.View) r2
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r5.f2936f
                boolean r4 = r3.f2904z
                if (r4 == 0) goto L_0x0021
                int r3 = r3.m673l(r2)
                if (r3 <= r6) goto L_0x006d
            L_0x0021:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r5.f2936f
                boolean r4 = r3.f2904z
                if (r4 != 0) goto L_0x002e
                int r3 = r3.m673l(r2)
                if (r3 < r6) goto L_0x002e
                goto L_0x006d
            L_0x002e:
                boolean r3 = r2.hasFocusable()
                if (r3 == 0) goto L_0x006d
                int r0 = r0 + 1
                r1 = r2
                goto L_0x000b
            L_0x0038:
                java.util.ArrayList<android.view.View> r7 = r5.f2931a
                int r7 = r7.size()
                int r7 = r7 + (-1)
            L_0x0040:
                if (r7 < 0) goto L_0x006d
                java.util.ArrayList<android.view.View> r0 = r5.f2931a
                java.lang.Object r0 = r0.get(r7)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r5.f2936f
                boolean r3 = r2.f2904z
                if (r3 == 0) goto L_0x0056
                int r2 = r2.m673l(r0)
                if (r2 >= r6) goto L_0x006d
            L_0x0056:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r5.f2936f
                boolean r3 = r2.f2904z
                if (r3 != 0) goto L_0x0063
                int r2 = r2.m673l(r0)
                if (r2 > r6) goto L_0x0063
                goto L_0x006d
            L_0x0063:
                boolean r2 = r0.hasFocusable()
                if (r2 == 0) goto L_0x006d
                int r7 = r7 + (-1)
                r1 = r0
                goto L_0x0040
            L_0x006d:
                return r1
        }

        /* renamed from: a */
        void m1173a() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.f2931a
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object r0 = r0.get(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = r4.m1164b(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r4.f2936f
                androidx.recyclerview.widget.i r3 = r3.f2899u
                int r0 = r3.mo1039a(r0)
                r4.f2933c = r0
                boolean r0 = r1.f2914f
                if (r0 == 0) goto L_0x003d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r4.f2936f
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r0.f2885E
                int r1 = r1.m654a()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r0.m1182c(r1)
                if (r0 == 0) goto L_0x003d
                int r1 = r0.f2918c
                if (r1 != r2) goto L_0x003d
                int r1 = r4.f2933c
                int r2 = r4.f2935e
                int r0 = r0.m1175a(r2)
                int r1 = r1 + r0
                r4.f2933c = r1
            L_0x003d:
                return
        }

        /* renamed from: a */
        void m1168a(android.view.View r5) {
                r4 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = r4.m1164b(r5)
                r0.f2913e = r4
                java.util.ArrayList<android.view.View> r1 = r4.f2931a
                r1.add(r5)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r4.f2933c = r1
                java.util.ArrayList<android.view.View> r2 = r4.f2931a
                int r2 = r2.size()
                r3 = 1
                if (r2 != r3) goto L_0x001a
                r4.f2932b = r1
            L_0x001a:
                boolean r1 = r0.m652c()
                if (r1 != 0) goto L_0x0026
                boolean r0 = r0.m653b()
                if (r0 == 0) goto L_0x0033
            L_0x0026:
                int r0 = r4.f2934d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r4.f2936f
                androidx.recyclerview.widget.i r1 = r1.f2899u
                int r5 = r1.mo1037b(r5)
                int r0 = r0 + r5
                r4.f2934d = r0
            L_0x0033:
                return
        }

        /* renamed from: a */
        void m1167a(boolean r4, int r5) {
                r3 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r4 == 0) goto L_0x0009
                int r1 = r3.m1172a(r0)
                goto L_0x000d
            L_0x0009:
                int r1 = r3.m1165b(r0)
            L_0x000d:
                r3.m1163c()
                if (r1 != r0) goto L_0x0013
                return
            L_0x0013:
                if (r4 == 0) goto L_0x001f
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r3.f2936f
                androidx.recyclerview.widget.i r2 = r2.f2899u
                int r2 = r2.mo1038b()
                if (r1 < r2) goto L_0x002b
            L_0x001f:
                if (r4 != 0) goto L_0x002c
                androidx.recyclerview.widget.StaggeredGridLayoutManager r4 = r3.f2936f
                androidx.recyclerview.widget.i r4 = r4.f2899u
                int r4 = r4.mo1030f()
                if (r1 <= r4) goto L_0x002c
            L_0x002b:
                return
            L_0x002c:
                if (r5 == r0) goto L_0x002f
                int r1 = r1 + r5
            L_0x002f:
                r3.f2933c = r1
                r3.f2932b = r1
                return
        }

        /* renamed from: b */
        int m1165b(int r3) {
                r2 = this;
                int r0 = r2.f2932b
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L_0x0007
                return r0
            L_0x0007:
                java.util.ArrayList<android.view.View> r0 = r2.f2931a
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0010
                return r3
            L_0x0010:
                r2.m1166b()
                int r3 = r2.f2932b
                return r3
        }

        /* renamed from: b */
        androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c m1164b(android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r1
                return r1
        }

        /* renamed from: b */
        void m1166b() {
                r3 = this;
                java.util.ArrayList<android.view.View> r0 = r3.f2931a
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = r3.m1164b(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r3.f2936f
                androidx.recyclerview.widget.i r2 = r2.f2899u
                int r0 = r2.mo1033d(r0)
                r3.f2932b = r0
                boolean r0 = r1.f2914f
                if (r0 == 0) goto L_0x0039
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.f2936f
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r0.f2885E
                int r1 = r1.m654a()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r0.m1182c(r1)
                if (r0 == 0) goto L_0x0039
                int r1 = r0.f2918c
                r2 = -1
                if (r1 != r2) goto L_0x0039
                int r1 = r3.f2932b
                int r2 = r3.f2935e
                int r0 = r0.m1175a(r2)
                int r1 = r1 - r0
                r3.f2932b = r1
            L_0x0039:
                return
        }

        /* renamed from: c */
        void m1163c() {
                r1 = this;
                java.util.ArrayList<android.view.View> r0 = r1.f2931a
                r0.clear()
                r1.m1154i()
                r0 = 0
                r1.f2934d = r0
                return
        }

        /* renamed from: c */
        void m1162c(int r3) {
                r2 = this;
                int r0 = r2.f2932b
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L_0x0009
                int r0 = r0 + r3
                r2.f2932b = r0
            L_0x0009:
                int r0 = r2.f2933c
                if (r0 == r1) goto L_0x0010
                int r0 = r0 + r3
                r2.f2933c = r0
            L_0x0010:
                return
        }

        /* renamed from: c */
        void m1161c(android.view.View r5) {
                r4 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = r4.m1164b(r5)
                r0.f2913e = r4
                java.util.ArrayList<android.view.View> r1 = r4.f2931a
                r2 = 0
                r1.add(r2, r5)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r4.f2932b = r1
                java.util.ArrayList<android.view.View> r2 = r4.f2931a
                int r2 = r2.size()
                r3 = 1
                if (r2 != r3) goto L_0x001b
                r4.f2933c = r1
            L_0x001b:
                boolean r1 = r0.m652c()
                if (r1 != 0) goto L_0x0027
                boolean r0 = r0.m653b()
                if (r0 == 0) goto L_0x0034
            L_0x0027:
                int r0 = r4.f2934d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r4.f2936f
                androidx.recyclerview.widget.i r1 = r1.f2899u
                int r5 = r1.mo1037b(r5)
                int r0 = r0 + r5
                r4.f2934d = r0
            L_0x0034:
                return
        }

        /* renamed from: d */
        public int m1160d() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.f2936f
                boolean r0 = r0.f2904z
                r1 = 1
                if (r0 == 0) goto L_0x0010
                java.util.ArrayList<android.view.View> r0 = r3.f2931a
                int r0 = r0.size()
                int r0 = r0 - r1
                r2 = -1
                goto L_0x0017
            L_0x0010:
                r0 = 0
                java.util.ArrayList<android.view.View> r2 = r3.f2931a
                int r2 = r2.size()
            L_0x0017:
                int r0 = r3.m1170a(r0, r2, r1)
                return r0
        }

        /* renamed from: d */
        void m1159d(int r1) {
                r0 = this;
                r0.f2932b = r1
                r0.f2933c = r1
                return
        }

        /* renamed from: e */
        public int m1158e() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.f2936f
                boolean r0 = r0.f2904z
                r1 = 1
                if (r0 == 0) goto L_0x000f
                r0 = 0
                java.util.ArrayList<android.view.View> r2 = r3.f2931a
                int r2 = r2.size()
                goto L_0x0017
            L_0x000f:
                java.util.ArrayList<android.view.View> r0 = r3.f2931a
                int r0 = r0.size()
                int r0 = r0 - r1
                r2 = -1
            L_0x0017:
                int r0 = r3.m1170a(r0, r2, r1)
                return r0
        }

        /* renamed from: f */
        public int m1157f() {
                r1 = this;
                int r0 = r1.f2934d
                return r0
        }

        /* renamed from: g */
        int m1156g() {
                r2 = this;
                int r0 = r2.f2933c
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L_0x0007
                return r0
            L_0x0007:
                r2.m1173a()
                int r0 = r2.f2933c
                return r0
        }

        /* renamed from: h */
        int m1155h() {
                r2 = this;
                int r0 = r2.f2932b
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L_0x0007
                return r0
            L_0x0007:
                r2.m1166b()
                int r0 = r2.f2932b
                return r0
        }

        /* renamed from: i */
        void m1154i() {
                r1 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.f2932b = r0
                r1.f2933c = r0
                return
        }

        /* renamed from: j */
        void m1153j() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.f2931a
                int r0 = r0.size()
                java.util.ArrayList<android.view.View> r1 = r4.f2931a
                int r2 = r0 + (-1)
                java.lang.Object r1 = r1.remove(r2)
                android.view.View r1 = (android.view.View) r1
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r2 = r4.m1164b(r1)
                r3 = 0
                r2.f2913e = r3
                boolean r3 = r2.m652c()
                if (r3 != 0) goto L_0x0023
                boolean r2 = r2.m653b()
                if (r2 == 0) goto L_0x0030
            L_0x0023:
                int r2 = r4.f2934d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r4.f2936f
                androidx.recyclerview.widget.i r3 = r3.f2899u
                int r1 = r3.mo1037b(r1)
                int r2 = r2 - r1
                r4.f2934d = r2
            L_0x0030:
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 1
                if (r0 != r2) goto L_0x0037
                r4.f2932b = r1
            L_0x0037:
                r4.f2933c = r1
                return
        }

        /* renamed from: k */
        void m1152k() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.f2931a
                r1 = 0
                java.lang.Object r0 = r0.remove(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = r4.m1164b(r0)
                r2 = 0
                r1.f2913e = r2
                java.util.ArrayList<android.view.View> r2 = r4.f2931a
                int r2 = r2.size()
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != 0) goto L_0x001c
                r4.f2933c = r3
            L_0x001c:
                boolean r2 = r1.m652c()
                if (r2 != 0) goto L_0x0028
                boolean r1 = r1.m653b()
                if (r1 == 0) goto L_0x0035
            L_0x0028:
                int r1 = r4.f2934d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r4.f2936f
                androidx.recyclerview.widget.i r2 = r2.f2899u
                int r0 = r2.mo1037b(r0)
                int r1 = r1 - r0
                r4.f2934d = r1
            L_0x0035:
                r4.f2932b = r3
                return
        }
    }

    public StaggeredGridLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f2897s = r0
            r1 = 0
            r2.f2904z = r1
            r2.f2881A = r1
            r2.f2883C = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f2884D = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d
            r0.<init>()
            r2.f2885E = r0
            r0 = 2
            r2.f2886F = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f2891K = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$b
            r0.<init>(r2)
            r2.f2892L = r0
            r2.f2893M = r1
            r0 = 1
            r2.f2894N = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$a
            r0.<init>(r2)
            r2.f2896P = r0
            androidx.recyclerview.widget.j$o$d r3 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m775a(r3, r4, r5, r6)
            int r4 = r3.f3230a
            r2.m1216h(r4)
            int r4 = r3.f3231b
            r2.m1214i(r4)
            boolean r3 = r3.f3232c
            r2.m1218c(r3)
            androidx.recyclerview.widget.g r3 = new androidx.recyclerview.widget.g
            r3.<init>()
            r2.f2903y = r3
            r2.m1245M()
            return
    }

    /* renamed from: M */
    private void m1245M() {
            r1 = this;
            int r0 = r1.f2901w
            androidx.recyclerview.widget.i r0 = androidx.recyclerview.widget.AbstractC0810i.m1045a(r1, r0)
            r1.f2899u = r0
            int r0 = r1.f2901w
            int r0 = 1 - r0
            androidx.recyclerview.widget.i r0 = androidx.recyclerview.widget.AbstractC0810i.m1045a(r1, r0)
            r1.f2900v = r0
            return
    }

    /* renamed from: N */
    private void m1244N() {
            r9 = this;
            androidx.recyclerview.widget.i r0 = r9.f2900v
            int r0 = r0.mo1034d()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            r0 = 0
            int r1 = r9.m697e()
            r2 = 0
            r0 = 0
            r3 = 0
        L_0x0013:
            if (r0 >= r1) goto L_0x0040
            android.view.View r4 = r9.m715c(r0)
            androidx.recyclerview.widget.i r5 = r9.f2900v
            int r5 = r5.mo1037b(r4)
            float r5 = (float) r5
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x0025
            goto L_0x003d
        L_0x0025:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r4
            boolean r4 = r4.m1191f()
            if (r4 == 0) goto L_0x0039
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r4
            int r4 = r9.f2897s
            float r4 = (float) r4
            float r5 = r5 / r4
        L_0x0039:
            float r3 = java.lang.Math.max(r3, r5)
        L_0x003d:
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0040:
            int r0 = r9.f2902x
            int r4 = r9.f2897s
            float r4 = (float) r4
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            androidx.recyclerview.widget.i r4 = r9.f2900v
            int r4 = r4.mo1034d()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r5) goto L_0x005f
            androidx.recyclerview.widget.i r4 = r9.f2900v
            int r4 = r4.mo1028g()
            int r3 = java.lang.Math.min(r3, r4)
        L_0x005f:
            r9.m1212j(r3)
            int r3 = r9.f2902x
            if (r3 != r0) goto L_0x0067
            return
        L_0x0067:
            if (r2 >= r1) goto L_0x00b4
            android.view.View r3 = r9.m715c(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r4
            boolean r5 = r4.f2914f
            if (r5 == 0) goto L_0x0078
            goto L_0x00b1
        L_0x0078:
            boolean r5 = r9.m1246L()
            r6 = 1
            if (r5 == 0) goto L_0x009b
            int r5 = r9.f2901w
            if (r5 != r6) goto L_0x009b
            int r5 = r9.f2897s
            int r7 = r5 + (-1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r4 = r4.f2913e
            int r4 = r4.f2935e
            int r7 = r7 - r4
            int r7 = -r7
            int r8 = r9.f2902x
            int r7 = r7 * r8
            int r5 = r5 - r6
            int r5 = r5 - r4
            int r4 = -r5
            int r4 = r4 * r0
            int r7 = r7 - r4
            r3.offsetLeftAndRight(r7)
            goto L_0x00b1
        L_0x009b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r4 = r4.f2913e
            int r4 = r4.f2935e
            int r5 = r9.f2902x
            int r5 = r5 * r4
            int r4 = r4 * r0
            int r7 = r9.f2901w
            int r5 = r5 - r4
            if (r7 != r6) goto L_0x00ae
            r3.offsetLeftAndRight(r5)
            goto L_0x00b1
        L_0x00ae:
            r3.offsetTopAndBottom(r5)
        L_0x00b1:
            int r2 = r2 + 1
            goto L_0x0067
        L_0x00b4:
            return
    }

    /* renamed from: O */
    private void m1243O() {
            r2 = this;
            int r0 = r2.f2901w
            r1 = 1
            if (r0 == r1) goto L_0x0010
            boolean r0 = r2.m1246L()
            if (r0 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            boolean r0 = r2.f2904z
            r0 = r0 ^ r1
            goto L_0x0012
        L_0x0010:
            boolean r0 = r2.f2904z
        L_0x0012:
            r2.f2881A = r0
            return
    }

    /* renamed from: a */
    private int m1231a(androidx.recyclerview.widget.C0813j.C0847v r17, androidx.recyclerview.widget.C0807g r18, androidx.recyclerview.widget.C0813j.C0815a0 r19) {
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            java.util.BitSet r0 = r6.f2882B
            int r1 = r6.f2897s
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            androidx.recyclerview.widget.g r0 = r6.f2903y
            boolean r0 = r0.f3064i
            if (r0 == 0) goto L_0x0025
            int r0 = r8.f3060e
            if (r0 != r10) goto L_0x0020
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0035
        L_0x0020:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0035
        L_0x0025:
            int r0 = r8.f3060e
            if (r0 != r10) goto L_0x002f
            int r0 = r8.f3062g
            int r1 = r8.f3057b
            int r0 = r0 + r1
            goto L_0x0034
        L_0x002f:
            int r0 = r8.f3061f
            int r1 = r8.f3057b
            int r0 = r0 - r1
        L_0x0034:
            r11 = r0
        L_0x0035:
            int r0 = r8.f3060e
            r6.m1217e(r0, r11)
            boolean r0 = r6.f2881A
            if (r0 == 0) goto L_0x0045
            androidx.recyclerview.widget.i r0 = r6.f2899u
            int r0 = r0.mo1038b()
            goto L_0x004b
        L_0x0045:
            androidx.recyclerview.widget.i r0 = r6.f2899u
            int r0 = r0.mo1030f()
        L_0x004b:
            r12 = r0
            r0 = 0
        L_0x004d:
            boolean r1 = r18.m1056a(r19)
            r2 = -1
            if (r1 == 0) goto L_0x01ca
            androidx.recyclerview.widget.g r1 = r6.f2903y
            boolean r1 = r1.f3064i
            if (r1 != 0) goto L_0x0062
            java.util.BitSet r1 = r6.f2882B
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01ca
        L_0x0062:
            android.view.View r13 = r8.m1055a(r7)
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r14 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r14 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r14
            int r0 = r14.m654a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.f2885E
            int r1 = r1.m1180d(r0)
            if (r1 != r2) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x0091
            boolean r1 = r14.f2914f
            if (r1 == 0) goto L_0x0087
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.f2898t
            r1 = r1[r9]
            goto L_0x008b
        L_0x0087:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r1 = r6.m1235a(r8)
        L_0x008b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f2885E
            r4.m1186a(r0, r1)
            goto L_0x0095
        L_0x0091:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r4 = r6.f2898t
            r1 = r4[r1]
        L_0x0095:
            r15 = r1
            r14.f2913e = r15
            int r1 = r8.f3060e
            if (r1 != r10) goto L_0x00a0
            r6.m727b(r13)
            goto L_0x00a3
        L_0x00a0:
            r6.m726b(r13, r9)
        L_0x00a3:
            r6.m1239a(r13, r14, r9)
            int r1 = r8.f3060e
            if (r1 != r10) goto L_0x00d4
            boolean r1 = r14.f2914f
            if (r1 == 0) goto L_0x00b3
            int r1 = r6.m1203q(r12)
            goto L_0x00b7
        L_0x00b3:
            int r1 = r15.m1172a(r12)
        L_0x00b7:
            androidx.recyclerview.widget.i r4 = r6.f2899u
            int r4 = r4.mo1037b(r13)
            int r4 = r4 + r1
            if (r3 == 0) goto L_0x00d1
            boolean r5 = r14.f2914f
            if (r5 == 0) goto L_0x00d1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r5 = r6.m1208m(r1)
            r5.f2918c = r2
            r5.f2917b = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2885E
            r9.m1185a(r5)
        L_0x00d1:
            r5 = r4
            r4 = r1
            goto L_0x00fd
        L_0x00d4:
            boolean r1 = r14.f2914f
            if (r1 == 0) goto L_0x00dd
            int r1 = r6.m1199t(r12)
            goto L_0x00e1
        L_0x00dd:
            int r1 = r15.m1165b(r12)
        L_0x00e1:
            androidx.recyclerview.widget.i r4 = r6.f2899u
            int r4 = r4.mo1037b(r13)
            int r4 = r1 - r4
            if (r3 == 0) goto L_0x00fc
            boolean r5 = r14.f2914f
            if (r5 == 0) goto L_0x00fc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r5 = r6.m1207n(r1)
            r5.f2918c = r10
            r5.f2917b = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2885E
            r9.m1185a(r5)
        L_0x00fc:
            r5 = r1
        L_0x00fd:
            boolean r1 = r14.f2914f
            if (r1 == 0) goto L_0x0125
            int r1 = r8.f3059d
            if (r1 != r2) goto L_0x0125
            if (r3 == 0) goto L_0x010a
        L_0x0107:
            r6.f2893M = r10
            goto L_0x0125
        L_0x010a:
            int r1 = r8.f3060e
            if (r1 != r10) goto L_0x0113
            boolean r1 = r16.m1254D()
            goto L_0x0117
        L_0x0113:
            boolean r1 = r16.m1253E()
        L_0x0117:
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x0125
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.f2885E
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r1.m1182c(r0)
            if (r0 == 0) goto L_0x0107
            r0.f2920e = r10
            goto L_0x0107
        L_0x0125:
            r6.m1240a(r13, r14, r8)
            boolean r0 = r16.m1246L()
            if (r0 == 0) goto L_0x0159
            int r0 = r6.f2901w
            if (r0 != r10) goto L_0x0159
            boolean r0 = r14.f2914f
            if (r0 == 0) goto L_0x013d
            androidx.recyclerview.widget.i r0 = r6.f2900v
            int r0 = r0.mo1038b()
            goto L_0x014e
        L_0x013d:
            androidx.recyclerview.widget.i r0 = r6.f2900v
            int r0 = r0.mo1038b()
            int r1 = r6.f2897s
            int r1 = r1 - r10
            int r2 = r15.f2935e
            int r1 = r1 - r2
            int r2 = r6.f2902x
            int r1 = r1 * r2
            int r0 = r0 - r1
        L_0x014e:
            androidx.recyclerview.widget.i r1 = r6.f2900v
            int r1 = r1.mo1037b(r13)
            int r1 = r0 - r1
            r9 = r0
            r3 = r1
            goto L_0x017a
        L_0x0159:
            boolean r0 = r14.f2914f
            if (r0 == 0) goto L_0x0164
            androidx.recyclerview.widget.i r0 = r6.f2900v
            int r0 = r0.mo1030f()
            goto L_0x0171
        L_0x0164:
            int r0 = r15.f2935e
            int r1 = r6.f2902x
            int r0 = r0 * r1
            androidx.recyclerview.widget.i r1 = r6.f2900v
            int r1 = r1.mo1030f()
            int r0 = r0 + r1
        L_0x0171:
            androidx.recyclerview.widget.i r1 = r6.f2900v
            int r1 = r1.mo1037b(r13)
            int r1 = r1 + r0
            r3 = r0
            r9 = r1
        L_0x017a:
            int r0 = r6.f2901w
            if (r0 != r10) goto L_0x0185
            r0 = r16
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r9
            goto L_0x018b
        L_0x0185:
            r0 = r16
            r1 = r13
            r2 = r4
            r4 = r5
            r5 = r9
        L_0x018b:
            r0.m769a(r1, r2, r3, r4, r5)
            boolean r0 = r14.f2914f
            if (r0 == 0) goto L_0x019a
            androidx.recyclerview.widget.g r0 = r6.f2903y
            int r0 = r0.f3060e
            r6.m1217e(r0, r11)
            goto L_0x01a1
        L_0x019a:
            androidx.recyclerview.widget.g r0 = r6.f2903y
            int r0 = r0.f3060e
            r6.m1236a(r15, r0, r11)
        L_0x01a1:
            androidx.recyclerview.widget.g r0 = r6.f2903y
            r6.m1232a(r7, r0)
            androidx.recyclerview.widget.g r0 = r6.f2903y
            boolean r0 = r0.f3063h
            if (r0 == 0) goto L_0x01c5
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x01c5
            boolean r0 = r14.f2914f
            if (r0 == 0) goto L_0x01bc
            java.util.BitSet r0 = r6.f2882B
            r0.clear()
            goto L_0x01c5
        L_0x01bc:
            java.util.BitSet r0 = r6.f2882B
            int r1 = r15.f2935e
            r3 = 0
            r0.set(r1, r3)
            goto L_0x01c6
        L_0x01c5:
            r3 = 0
        L_0x01c6:
            r0 = 1
            r9 = 0
            goto L_0x004d
        L_0x01ca:
            r3 = 0
            if (r0 != 0) goto L_0x01d2
            androidx.recyclerview.widget.g r0 = r6.f2903y
            r6.m1232a(r7, r0)
        L_0x01d2:
            androidx.recyclerview.widget.g r0 = r6.f2903y
            int r0 = r0.f3060e
            if (r0 != r2) goto L_0x01ea
            androidx.recyclerview.widget.i r0 = r6.f2899u
            int r0 = r0.mo1030f()
            int r0 = r6.m1199t(r0)
            androidx.recyclerview.widget.i r1 = r6.f2899u
            int r1 = r1.mo1030f()
            int r1 = r1 - r0
            goto L_0x01fc
        L_0x01ea:
            androidx.recyclerview.widget.i r0 = r6.f2899u
            int r0 = r0.mo1038b()
            int r0 = r6.m1203q(r0)
            androidx.recyclerview.widget.i r1 = r6.f2899u
            int r1 = r1.mo1038b()
            int r1 = r0 - r1
        L_0x01fc:
            if (r1 <= 0) goto L_0x0205
            int r0 = r8.f3057b
            int r9 = java.lang.Math.min(r0, r1)
            r3 = r9
        L_0x0205:
            return r3
    }

    /* renamed from: a */
    private androidx.recyclerview.widget.StaggeredGridLayoutManager.C0779f m1235a(androidx.recyclerview.widget.C0807g r8) {
            r7 = this;
            int r0 = r8.f3060e
            boolean r0 = r7.m1198u(r0)
            r1 = -1
            r2 = 1
            if (r0 == 0) goto L_0x000f
            int r0 = r7.f2897s
            int r0 = r0 - r2
            r3 = -1
            goto L_0x0013
        L_0x000f:
            r0 = 0
            int r1 = r7.f2897s
            r3 = 1
        L_0x0013:
            int r8 = r8.f3060e
            r4 = 0
            if (r8 != r2) goto L_0x0032
            r8 = 2147483647(0x7fffffff, float:NaN)
            androidx.recyclerview.widget.i r2 = r7.f2899u
            int r2 = r2.mo1030f()
        L_0x0021:
            if (r0 == r1) goto L_0x0031
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r7.f2898t
            r5 = r5[r0]
            int r6 = r5.m1172a(r2)
            if (r6 >= r8) goto L_0x002f
            r4 = r5
            r8 = r6
        L_0x002f:
            int r0 = r0 + r3
            goto L_0x0021
        L_0x0031:
            return r4
        L_0x0032:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            androidx.recyclerview.widget.i r2 = r7.f2899u
            int r2 = r2.mo1038b()
        L_0x003a:
            if (r0 == r1) goto L_0x004a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r7.f2898t
            r5 = r5[r0]
            int r6 = r5.m1165b(r2)
            if (r6 <= r8) goto L_0x0048
            r4 = r5
            r8 = r6
        L_0x0048:
            int r0 = r0 + r3
            goto L_0x003a
        L_0x004a:
            return r4
    }

    /* renamed from: a */
    private void m1241a(android.view.View r5, int r6, int r7, boolean r8) {
            r4 = this;
            android.graphics.Rect r0 = r4.f2891K
            r4.m762a(r5, r0)
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r0
            int r1 = r0.leftMargin
            android.graphics.Rect r2 = r4.f2891K
            int r3 = r2.left
            int r1 = r1 + r3
            int r3 = r0.rightMargin
            int r2 = r2.right
            int r3 = r3 + r2
            int r6 = r4.m1222c(r6, r1, r3)
            int r1 = r0.topMargin
            android.graphics.Rect r2 = r4.f2891K
            int r3 = r2.top
            int r1 = r1 + r3
            int r3 = r0.bottomMargin
            int r2 = r2.bottom
            int r3 = r3 + r2
            int r7 = r4.m1222c(r7, r1, r3)
            if (r8 == 0) goto L_0x0032
            boolean r8 = r4.m725b(r5, r6, r7, r0)
            goto L_0x0036
        L_0x0032:
            boolean r8 = r4.m768a(r5, r6, r7, r0)
        L_0x0036:
            if (r8 == 0) goto L_0x003b
            r5.measure(r6, r7)
        L_0x003b:
            return
    }

    /* renamed from: a */
    private void m1240a(android.view.View r2, androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c r3, androidx.recyclerview.widget.C0807g r4) {
            r1 = this;
            int r4 = r4.f3060e
            r0 = 1
            if (r4 != r0) goto L_0x0013
            boolean r4 = r3.f2914f
            if (r4 == 0) goto L_0x000d
            r1.m1204p(r2)
            goto L_0x0020
        L_0x000d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r3 = r3.f2913e
            r3.m1168a(r2)
            goto L_0x0020
        L_0x0013:
            boolean r4 = r3.f2914f
            if (r4 == 0) goto L_0x001b
            r1.m1202q(r2)
            goto L_0x0020
        L_0x001b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r3 = r3.f2913e
            r3.m1161c(r2)
        L_0x0020:
            return
    }

    /* renamed from: a */
    private void m1239a(android.view.View r7, androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c r8, boolean r9) {
            r6 = this;
            boolean r0 = r8.f2914f
            r1 = 1
            if (r0 == 0) goto L_0x0029
            int r0 = r6.f2901w
            if (r0 != r1) goto L_0x000c
            int r0 = r6.f2890J
            goto L_0x003a
        L_0x000c:
            int r0 = r6.m665q()
            int r2 = r6.m664r()
            int r3 = r6.m670n()
            int r4 = r6.m668o()
            int r3 = r3 + r4
            int r8 = r8.width
            int r8 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m784a(r0, r2, r3, r8, r1)
            int r0 = r6.f2890J
            r6.m1241a(r7, r8, r0, r9)
            goto L_0x0078
        L_0x0029:
            int r0 = r6.f2901w
            r2 = 0
            if (r0 != r1) goto L_0x0052
            int r0 = r6.f2902x
            int r3 = r6.m664r()
            int r4 = r8.width
            int r0 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m784a(r0, r3, r2, r4, r2)
        L_0x003a:
            int r2 = r6.m682h()
            int r3 = r6.m680i()
            int r4 = r6.m666p()
            int r5 = r6.m672m()
            int r4 = r4 + r5
            int r8 = r8.height
            int r8 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m784a(r2, r3, r4, r8, r1)
            goto L_0x0075
        L_0x0052:
            int r0 = r6.m665q()
            int r3 = r6.m664r()
            int r4 = r6.m670n()
            int r5 = r6.m668o()
            int r4 = r4 + r5
            int r5 = r8.width
            int r0 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m784a(r0, r3, r4, r5, r1)
            int r1 = r6.f2902x
            int r3 = r6.m680i()
            int r8 = r8.height
            int r8 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m784a(r1, r3, r2, r8, r2)
        L_0x0075:
            r6.m1241a(r7, r0, r8, r9)
        L_0x0078:
            return
    }

    /* renamed from: a */
    private void m1238a(androidx.recyclerview.widget.StaggeredGridLayoutManager.C0772b r5) {
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r4.f2889I
            int r1 = r0.f2923d
            if (r1 <= 0) goto L_0x0045
            int r2 = r4.f2897s
            if (r1 != r2) goto L_0x003c
            r0 = 0
        L_0x000b:
            int r1 = r4.f2897s
            if (r0 >= r1) goto L_0x0045
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2898t
            r1 = r1[r0]
            r1.m1163c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r4.f2889I
            int[] r2 = r1.f2924e
            r2 = r2[r0]
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L_0x0032
            boolean r1 = r1.f2929j
            if (r1 == 0) goto L_0x002b
            androidx.recyclerview.widget.i r1 = r4.f2899u
            int r1 = r1.mo1038b()
            goto L_0x0031
        L_0x002b:
            androidx.recyclerview.widget.i r1 = r4.f2899u
            int r1 = r1.mo1030f()
        L_0x0031:
            int r2 = r2 + r1
        L_0x0032:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2898t
            r1 = r1[r0]
            r1.m1159d(r2)
            int r0 = r0 + 1
            goto L_0x000b
        L_0x003c:
            r0.m1174a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r4.f2889I
            int r1 = r0.f2922c
            r0.f2921b = r1
        L_0x0045:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r4.f2889I
            boolean r1 = r0.f2930k
            r4.f2888H = r1
            boolean r0 = r0.f2928i
            r4.m1218c(r0)
            r4.m1243O()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r4.f2889I
            int r1 = r0.f2921b
            r2 = -1
            if (r1 == r2) goto L_0x005f
            r4.f2883C = r1
            boolean r0 = r0.f2929j
            goto L_0x0061
        L_0x005f:
            boolean r0 = r4.f2881A
        L_0x0061:
            r5.f2908c = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r4.f2889I
            int r0 = r5.f2925f
            r1 = 1
            if (r0 <= r1) goto L_0x0074
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r4.f2885E
            int[] r1 = r5.f2926g
            r0.f2915a = r1
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r5 = r5.f2927h
            r0.f2916b = r5
        L_0x0074:
            return
    }

    /* renamed from: a */
    private void m1236a(androidx.recyclerview.widget.StaggeredGridLayoutManager.C0779f r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.m1157f()
            r1 = 0
            r2 = -1
            if (r5 != r2) goto L_0x0010
            int r5 = r4.m1155h()
            int r5 = r5 + r0
            if (r5 > r6) goto L_0x001e
            goto L_0x0017
        L_0x0010:
            int r5 = r4.m1156g()
            int r5 = r5 - r0
            if (r5 < r6) goto L_0x001e
        L_0x0017:
            java.util.BitSet r5 = r3.f2882B
            int r4 = r4.f2935e
            r5.set(r4, r1)
        L_0x001e:
            return
    }

    /* renamed from: a */
    private void m1233a(androidx.recyclerview.widget.C0813j.C0847v r7, int r8) {
            r6 = this;
            int r0 = r6.m697e()
            r1 = 1
            int r0 = r0 - r1
        L_0x0006:
            if (r0 < 0) goto L_0x0060
            android.view.View r2 = r6.m715c(r0)
            androidx.recyclerview.widget.i r3 = r6.f2899u
            int r3 = r3.mo1033d(r2)
            if (r3 < r8) goto L_0x0060
            androidx.recyclerview.widget.i r3 = r6.f2899u
            int r3 = r3.mo1029f(r2)
            if (r3 < r8) goto L_0x0060
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r3
            boolean r4 = r3.f2914f
            if (r4 == 0) goto L_0x004a
            r3 = 0
            r4 = 0
        L_0x0028:
            int r5 = r6.f2897s
            if (r4 >= r5) goto L_0x003c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r6.f2898t
            r5 = r5[r4]
            java.util.ArrayList<android.view.View> r5 = r5.f2931a
            int r5 = r5.size()
            if (r5 != r1) goto L_0x0039
            return
        L_0x0039:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x003c:
            int r4 = r6.f2897s
            if (r3 >= r4) goto L_0x005a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r4 = r6.f2898t
            r4 = r4[r3]
            r4.m1153j()
            int r3 = r3 + 1
            goto L_0x003c
        L_0x004a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r4 = r3.f2913e
            java.util.ArrayList<android.view.View> r4 = r4.f2931a
            int r4 = r4.size()
            if (r4 != r1) goto L_0x0055
            return
        L_0x0055:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r3 = r3.f2913e
            r3.m1153j()
        L_0x005a:
            r6.m761a(r2, r7)
            int r0 = r0 + (-1)
            goto L_0x0006
        L_0x0060:
            return
    }

    /* renamed from: a */
    private void m1232a(androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.C0807g r4) {
            r2 = this;
            boolean r0 = r4.f3056a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f3064i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f3057b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f3060e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f3062g
        L_0x0014:
            r2.m1233a(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f3061f
        L_0x001a:
            r2.m1225b(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f3060e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f3061f
            int r1 = r2.m1201r(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f3062g
            int r4 = r4.f3057b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f3062g
            int r0 = r2.m1200s(r0)
            int r1 = r4.f3062g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f3061f
            int r4 = r4.f3057b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
    }

    /* renamed from: a */
    private void m1230a(androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.C0813j.C0815a0 r4, boolean r5) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.m1203q(r0)
            if (r1 != r0) goto L_0x0009
            return
        L_0x0009:
            androidx.recyclerview.widget.i r0 = r2.f2899u
            int r0 = r0.mo1038b()
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0022
            int r1 = -r0
            int r3 = r2.m1221c(r1, r3, r4)
            int r3 = -r3
            int r0 = r0 - r3
            if (r5 == 0) goto L_0x0022
            if (r0 <= 0) goto L_0x0022
            androidx.recyclerview.widget.i r3 = r2.f2899u
            r3.mo1040a(r0)
        L_0x0022:
            return
    }

    /* renamed from: a */
    private boolean m1237a(androidx.recyclerview.widget.StaggeredGridLayoutManager.C0779f r4) {
            r3 = this;
            boolean r0 = r3.f2881A
            r1 = 0
            if (r0 == 0) goto L_0x0028
            int r0 = r4.m1156g()
            androidx.recyclerview.widget.i r2 = r3.f2899u
            int r2 = r2.mo1038b()
            if (r0 >= r2) goto L_0x0045
            java.util.ArrayList<android.view.View> r0 = r4.f2931a
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = r4.m1164b(r0)
            boolean r4 = r4.f2914f
            r4 = r4 ^ 1
            return r4
        L_0x0028:
            int r0 = r4.m1155h()
            androidx.recyclerview.widget.i r2 = r3.f2899u
            int r2 = r2.mo1030f()
            if (r0 <= r2) goto L_0x0045
            java.util.ArrayList<android.view.View> r0 = r4.f2931a
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = r4.m1164b(r0)
            boolean r4 = r4.f2914f
            r4 = r4 ^ 1
            return r4
        L_0x0045:
            return r1
    }

    /* renamed from: b */
    private void m1228b(int r7, int r8, int r9) {
            r6 = this;
            boolean r0 = r6.f2881A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.m1249I()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.m1250H()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r7 + 1
            r3 = r2
            r2 = r8
            goto L_0x001f
        L_0x001b:
            int r2 = r7 + r8
        L_0x001d:
            r3 = r2
            r2 = r7
        L_0x001f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f2885E
            r4.m1178e(r2)
            r4 = 1
            if (r9 == r4) goto L_0x003e
            r5 = 2
            if (r9 == r5) goto L_0x0038
            if (r9 == r1) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2885E
            r9.m1183b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f2885E
            r7.m1188a(r8, r4)
            goto L_0x0043
        L_0x0038:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2885E
            r9.m1183b(r7, r8)
            goto L_0x0043
        L_0x003e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2885E
            r9.m1188a(r7, r8)
        L_0x0043:
            if (r3 > r0) goto L_0x0046
            return
        L_0x0046:
            boolean r7 = r6.f2881A
            if (r7 == 0) goto L_0x004f
            int r7 = r6.m1250H()
            goto L_0x0053
        L_0x004f:
            int r7 = r6.m1249I()
        L_0x0053:
            if (r2 > r7) goto L_0x0058
            r6.m657y()
        L_0x0058:
            return
    }

    /* renamed from: b */
    private void m1227b(int r5, androidx.recyclerview.widget.C0813j.C0815a0 r6) {
            r4 = this;
            androidx.recyclerview.widget.g r0 = r4.f2903y
            r1 = 0
            r0.f3057b = r1
            r0.f3058c = r5
            boolean r0 = r4.m659w()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.m904b()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f2881A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.i r5 = r4.f2899u
            int r5 = r5.mo1028g()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.i r5 = r4.f2899u
            int r5 = r5.mo1028g()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.m691f()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.g r0 = r4.f2903y
            androidx.recyclerview.widget.i r3 = r4.f2899u
            int r3 = r3.mo1030f()
            int r3 = r3 - r6
            r0.f3061f = r3
            androidx.recyclerview.widget.g r6 = r4.f2903y
            androidx.recyclerview.widget.i r0 = r4.f2899u
            int r0 = r0.mo1038b()
            int r0 = r0 + r5
            r6.f3062g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.g r0 = r4.f2903y
            androidx.recyclerview.widget.i r3 = r4.f2899u
            int r3 = r3.mo1041a()
            int r3 = r3 + r5
            r0.f3062g = r3
            androidx.recyclerview.widget.g r5 = r4.f2903y
            int r6 = -r6
            r5.f3061f = r6
        L_0x005d:
            androidx.recyclerview.widget.g r5 = r4.f2903y
            r5.f3063h = r1
            r5.f3056a = r2
            androidx.recyclerview.widget.i r6 = r4.f2899u
            int r6 = r6.mo1034d()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.i r6 = r4.f2899u
            int r6 = r6.mo1041a()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f3064i = r1
            return
    }

    /* renamed from: b */
    private void m1225b(androidx.recyclerview.widget.C0813j.C0847v r6, int r7) {
            r5 = this;
        L_0x0000:
            int r0 = r5.m697e()
            if (r0 <= 0) goto L_0x005d
            r0 = 0
            android.view.View r1 = r5.m715c(r0)
            androidx.recyclerview.widget.i r2 = r5.f2899u
            int r2 = r2.mo1039a(r1)
            if (r2 > r7) goto L_0x005d
            androidx.recyclerview.widget.i r2 = r5.f2899u
            int r2 = r2.mo1031e(r1)
            if (r2 > r7) goto L_0x005d
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r2
            boolean r3 = r2.f2914f
            r4 = 1
            if (r3 == 0) goto L_0x0049
            r2 = 0
        L_0x0027:
            int r3 = r5.f2897s
            if (r2 >= r3) goto L_0x003b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r5.f2898t
            r3 = r3[r2]
            java.util.ArrayList<android.view.View> r3 = r3.f2931a
            int r3 = r3.size()
            if (r3 != r4) goto L_0x0038
            return
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0027
        L_0x003b:
            int r2 = r5.f2897s
            if (r0 >= r2) goto L_0x0059
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r5.f2898t
            r2 = r2[r0]
            r2.m1152k()
            int r0 = r0 + 1
            goto L_0x003b
        L_0x0049:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r2.f2913e
            java.util.ArrayList<android.view.View> r0 = r0.f2931a
            int r0 = r0.size()
            if (r0 != r4) goto L_0x0054
            return
        L_0x0054:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r2.f2913e
            r0.m1152k()
        L_0x0059:
            r5.m761a(r1, r6)
            goto L_0x0000
        L_0x005d:
            return
    }

    /* renamed from: b */
    private void m1224b(androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.C0813j.C0815a0 r4, boolean r5) {
            r2 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r2.m1199t(r0)
            if (r1 != r0) goto L_0x000a
            return
        L_0x000a:
            androidx.recyclerview.widget.i r0 = r2.f2899u
            int r0 = r0.mo1030f()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0022
            int r3 = r2.m1221c(r1, r3, r4)
            int r1 = r1 - r3
            if (r5 == 0) goto L_0x0022
            if (r1 <= 0) goto L_0x0022
            androidx.recyclerview.widget.i r3 = r2.f2899u
            int r4 = -r1
            r3.mo1040a(r4)
        L_0x0022:
            return
    }

    /* renamed from: c */
    private int m1222c(int r3, int r4, int r5) {
            r2 = this;
            if (r4 != 0) goto L_0x0005
            if (r5 != 0) goto L_0x0005
            return r3
        L_0x0005:
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0013
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            return r3
        L_0x0013:
            r1 = 0
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = r3 - r4
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r1, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            return r3
    }

    /* renamed from: c */
    private void m1219c(androidx.recyclerview.widget.C0813j.C0847v r9, androidx.recyclerview.widget.C0813j.C0815a0 r10, boolean r11) {
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f2892L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f2889I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f2883C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.m907a()
            if (r1 != 0) goto L_0x0018
            r8.m722b(r9)
            r0.m1193b()
            return
        L_0x0018:
            boolean r1 = r0.f2910e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f2883C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f2889I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.m1193b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2889I
            if (r5 == 0) goto L_0x0037
            r8.m1238a(r0)
            goto L_0x003e
        L_0x0037:
            r8.m1243O()
            boolean r5 = r8.f2881A
            r0.f2908c = r5
        L_0x003e:
            r8.m1226b(r10, r0)
            r0.f2910e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2889I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f2883C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f2908c
            boolean r6 = r8.f2887G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.m1246L()
            boolean r6 = r8.f2888H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f2885E
            r5.m1190a()
            r0.f2909d = r4
        L_0x0060:
            int r5 = r8.m697e()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2889I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f2923d
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f2909d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f2897s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2898t
            r5 = r5[r1]
            r5.m1163c()
            int r5 = r0.f2907b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f2898t
            r6 = r6[r1]
            r6.m1159d(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f2892L
            int[] r1 = r1.f2911f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f2897s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2898t
            r5 = r5[r1]
            r5.m1163c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f2892L
            int[] r6 = r6.f2911f
            r6 = r6[r1]
            r5.m1159d(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f2897s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2898t
            r5 = r5[r1]
            boolean r6 = r8.f2881A
            int r7 = r0.f2907b
            r5.m1167a(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f2892L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2898t
            r1.m1194a(r5)
        L_0x00c9:
            r8.m753a(r9)
            androidx.recyclerview.widget.g r1 = r8.f2903y
            r1.f3056a = r3
            r8.f2893M = r3
            androidx.recyclerview.widget.i r1 = r8.f2900v
            int r1 = r1.mo1028g()
            r8.m1212j(r1)
            int r1 = r0.f2906a
            r8.m1227b(r1, r10)
            boolean r1 = r0.f2908c
            if (r1 == 0) goto L_0x00f0
            r8.m1197v(r2)
            androidx.recyclerview.widget.g r1 = r8.f2903y
            r8.m1231a(r9, r1, r10)
            r8.m1197v(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.m1197v(r4)
            androidx.recyclerview.widget.g r1 = r8.f2903y
            r8.m1231a(r9, r1, r10)
            r8.m1197v(r2)
        L_0x00fb:
            androidx.recyclerview.widget.g r1 = r8.f2903y
            int r2 = r0.f2906a
            int r5 = r1.f3059d
            int r2 = r2 + r5
            r1.f3058c = r2
            r8.m1231a(r9, r1, r10)
            r8.m1244N()
            int r1 = r8.m697e()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.f2881A
            if (r1 == 0) goto L_0x011b
            r8.m1230a(r9, r10, r4)
            r8.m1224b(r9, r10, r3)
            goto L_0x0121
        L_0x011b:
            r8.m1224b(r9, r10, r4)
            r8.m1230a(r9, r10, r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.m902d()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.f2886F
            if (r11 == 0) goto L_0x013f
            int r11 = r8.m697e()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.f2893M
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.m1248J()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = 1
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.f2896P
            r8.m734a(r11)
            boolean r11 = r8.m1252F()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            boolean r11 = r10.m902d()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f2892L
            r11.m1193b()
        L_0x015a:
            boolean r11 = r0.f2908c
            r8.f2887G = r11
            boolean r11 = r8.m1246L()
            r8.f2888H = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f2892L
            r11.m1193b()
            r8.m1219c(r9, r10, r3)
        L_0x016e:
            return
    }

    /* renamed from: c */
    private boolean m1220c(androidx.recyclerview.widget.C0813j.C0815a0 r2, androidx.recyclerview.widget.StaggeredGridLayoutManager.C0772b r3) {
            r1 = this;
            boolean r0 = r1.f2887G
            int r2 = r2.m907a()
            if (r0 == 0) goto L_0x000d
            int r2 = r1.m1205p(r2)
            goto L_0x0011
        L_0x000d:
            int r2 = r1.m1206o(r2)
        L_0x0011:
            r3.f2906a = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.f2907b = r2
            r2 = 1
            return r2
    }

    /* renamed from: e */
    private void m1217e(int r3, int r4) {
            r2 = this;
            r0 = 0
        L_0x0001:
            int r1 = r2.f2897s
            if (r0 >= r1) goto L_0x001c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r2.f2898t
            r1 = r1[r0]
            java.util.ArrayList<android.view.View> r1 = r1.f2931a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0012
            goto L_0x0019
        L_0x0012:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r2.f2898t
            r1 = r1[r0]
            r2.m1236a(r1, r3, r4)
        L_0x0019:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x001c:
            return
    }

    /* renamed from: h */
    private int m1215h(androidx.recyclerview.widget.C0813j.C0815a0 r7) {
            r6 = this;
            int r0 = r6.m697e()
            if (r0 != 0) goto L_0x0008
            r7 = 0
            return r7
        L_0x0008:
            androidx.recyclerview.widget.i r1 = r6.f2899u
            boolean r0 = r6.f2894N
            r0 = r0 ^ 1
            android.view.View r2 = r6.m1223b(r0)
            boolean r0 = r6.f2894N
            r0 = r0 ^ 1
            android.view.View r3 = r6.m1229a(r0)
            boolean r5 = r6.f2894N
            r0 = r7
            r4 = r6
            int r7 = androidx.recyclerview.widget.C0856l.m578a(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: i */
    private int m1213i(androidx.recyclerview.widget.C0813j.C0815a0 r8) {
            r7 = this;
            int r0 = r7.m697e()
            if (r0 != 0) goto L_0x0008
            r8 = 0
            return r8
        L_0x0008:
            androidx.recyclerview.widget.i r1 = r7.f2899u
            boolean r0 = r7.f2894N
            r0 = r0 ^ 1
            android.view.View r2 = r7.m1223b(r0)
            boolean r0 = r7.f2894N
            r0 = r0 ^ 1
            android.view.View r3 = r7.m1229a(r0)
            boolean r5 = r7.f2894N
            boolean r6 = r7.f2881A
            r0 = r8
            r4 = r7
            int r8 = androidx.recyclerview.widget.C0856l.m577a(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    /* renamed from: j */
    private int m1211j(androidx.recyclerview.widget.C0813j.C0815a0 r7) {
            r6 = this;
            int r0 = r6.m697e()
            if (r0 != 0) goto L_0x0008
            r7 = 0
            return r7
        L_0x0008:
            androidx.recyclerview.widget.i r1 = r6.f2899u
            boolean r0 = r6.f2894N
            r0 = r0 ^ 1
            android.view.View r2 = r6.m1223b(r0)
            boolean r0 = r6.f2894N
            r0 = r0 ^ 1
            android.view.View r3 = r6.m1229a(r0)
            boolean r5 = r6.f2894N
            r0 = r7
            r4 = r6
            int r7 = androidx.recyclerview.widget.C0856l.m576b(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: k */
    private int m1210k(int r4) {
            r3 = this;
            int r0 = r3.m697e()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto L_0x000e
            boolean r4 = r3.f2881A
            if (r4 == 0) goto L_0x000d
            r1 = 1
        L_0x000d:
            return r1
        L_0x000e:
            int r0 = r3.m1250H()
            if (r4 >= r0) goto L_0x0016
            r4 = 1
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            boolean r0 = r3.f2881A
            if (r4 == r0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            return r1
    }

    /* renamed from: l */
    private int m1209l(int r5) {
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
            int r5 = r4.f2901w
            if (r5 != r1) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0021:
            return r1
        L_0x0022:
            int r5 = r4.f2901w
            if (r5 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0029:
            return r1
        L_0x002a:
            int r5 = r4.f2901w
            if (r5 != r1) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0031:
            return r0
        L_0x0032:
            int r5 = r4.f2901w
            if (r5 != 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0039:
            return r0
        L_0x003a:
            int r5 = r4.f2901w
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            boolean r5 = r4.m1246L()
            if (r5 == 0) goto L_0x0046
            return r0
        L_0x0046:
            return r1
        L_0x0047:
            int r5 = r4.f2901w
            if (r5 != r1) goto L_0x004c
            return r0
        L_0x004c:
            boolean r5 = r4.m1246L()
            if (r5 == 0) goto L_0x0053
            return r1
        L_0x0053:
            return r0
    }

    /* renamed from: m */
    private androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a m1208m(int r5) {
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a
            r0.<init>()
            int r1 = r4.f2897s
            int[] r1 = new int[r1]
            r0.f2919d = r1
            r1 = 0
        L_0x000c:
            int r2 = r4.f2897s
            if (r1 >= r2) goto L_0x0021
            int[] r2 = r0.f2919d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r4.f2898t
            r3 = r3[r1]
            int r3 = r3.m1172a(r5)
            int r3 = r5 - r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0021:
            return r0
    }

    /* renamed from: n */
    private androidx.recyclerview.widget.StaggeredGridLayoutManager.C0774d.C0775a m1207n(int r5) {
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a
            r0.<init>()
            int r1 = r4.f2897s
            int[] r1 = new int[r1]
            r0.f2919d = r1
            r1 = 0
        L_0x000c:
            int r2 = r4.f2897s
            if (r1 >= r2) goto L_0x0020
            int[] r2 = r0.f2919d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r4.f2898t
            r3 = r3[r1]
            int r3 = r3.m1165b(r5)
            int r3 = r3 - r5
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0020:
            return r0
    }

    /* renamed from: o */
    private int m1206o(int r5) {
            r4 = this;
            int r0 = r4.m697e()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x0018
            android.view.View r3 = r4.m715c(r2)
            int r3 = r4.m673l(r3)
            if (r3 < 0) goto L_0x0015
            if (r3 >= r5) goto L_0x0015
            return r3
        L_0x0015:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0018:
            return r1
    }

    /* renamed from: p */
    private int m1205p(int r3) {
            r2 = this;
            int r0 = r2.m697e()
            int r0 = r0 + (-1)
        L_0x0006:
            if (r0 < 0) goto L_0x0018
            android.view.View r1 = r2.m715c(r0)
            int r1 = r2.m673l(r1)
            if (r1 < 0) goto L_0x0015
            if (r1 >= r3) goto L_0x0015
            return r1
        L_0x0015:
            int r0 = r0 + (-1)
            goto L_0x0006
        L_0x0018:
            r3 = 0
            return r3
    }

    /* renamed from: p */
    private void m1204p(android.view.View r3) {
            r2 = this;
            int r0 = r2.f2897s
            int r0 = r0 + (-1)
        L_0x0004:
            if (r0 < 0) goto L_0x0010
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r2.f2898t
            r1 = r1[r0]
            r1.m1168a(r3)
            int r0 = r0 + (-1)
            goto L_0x0004
        L_0x0010:
            return
    }

    /* renamed from: q */
    private int m1203q(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r3.f2898t
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.m1172a(r4)
            r1 = 1
        L_0x000a:
            int r2 = r3.f2897s
            if (r1 >= r2) goto L_0x001c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r3.f2898t
            r2 = r2[r1]
            int r2 = r2.m1172a(r4)
            if (r2 <= r0) goto L_0x0019
            r0 = r2
        L_0x0019:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001c:
            return r0
    }

    /* renamed from: q */
    private void m1202q(android.view.View r3) {
            r2 = this;
            int r0 = r2.f2897s
            int r0 = r0 + (-1)
        L_0x0004:
            if (r0 < 0) goto L_0x0010
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r2.f2898t
            r1 = r1[r0]
            r1.m1161c(r3)
            int r0 = r0 + (-1)
            goto L_0x0004
        L_0x0010:
            return
    }

    /* renamed from: r */
    private int m1201r(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r3.f2898t
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.m1165b(r4)
            r1 = 1
        L_0x000a:
            int r2 = r3.f2897s
            if (r1 >= r2) goto L_0x001c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r3.f2898t
            r2 = r2[r1]
            int r2 = r2.m1165b(r4)
            if (r2 <= r0) goto L_0x0019
            r0 = r2
        L_0x0019:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001c:
            return r0
    }

    /* renamed from: s */
    private int m1200s(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r3.f2898t
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.m1172a(r4)
            r1 = 1
        L_0x000a:
            int r2 = r3.f2897s
            if (r1 >= r2) goto L_0x001c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r3.f2898t
            r2 = r2[r1]
            int r2 = r2.m1172a(r4)
            if (r2 >= r0) goto L_0x0019
            r0 = r2
        L_0x0019:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001c:
            return r0
    }

    /* renamed from: t */
    private int m1199t(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r3.f2898t
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.m1165b(r4)
            r1 = 1
        L_0x000a:
            int r2 = r3.f2897s
            if (r1 >= r2) goto L_0x001c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r3.f2898t
            r2 = r2[r1]
            int r2 = r2.m1165b(r4)
            if (r2 >= r0) goto L_0x0019
            r0 = r2
        L_0x0019:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001c:
            return r0
    }

    /* renamed from: u */
    private boolean m1198u(int r5) {
            r4 = this;
            int r0 = r4.f2901w
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0013
            if (r5 != r1) goto L_0x000b
            r5 = 1
            goto L_0x000c
        L_0x000b:
            r5 = 0
        L_0x000c:
            boolean r0 = r4.f2881A
            if (r5 == r0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            return r2
        L_0x0013:
            if (r5 != r1) goto L_0x0017
            r5 = 1
            goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            boolean r0 = r4.f2881A
            if (r5 != r0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            boolean r0 = r4.m1246L()
            if (r5 != r0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            return r2
    }

    /* renamed from: v */
    private void m1197v(int r5) {
            r4 = this;
            androidx.recyclerview.widget.g r0 = r4.f2903y
            r0.f3060e = r5
            boolean r1 = r4.f2881A
            r2 = 1
            r3 = -1
            if (r5 != r3) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != r5) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r2 = -1
        L_0x0011:
            r0.f3059d = r2
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: C */
    public boolean mo789C() {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r1.f2889I
            if (r0 != 0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            return r0
    }

    /* renamed from: D */
    boolean m1254D() {
            r6 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r6.f2898t
            r1 = 0
            r0 = r0[r1]
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r0.m1172a(r2)
            r3 = 1
            r4 = 1
        L_0x000d:
            int r5 = r6.f2897s
            if (r4 >= r5) goto L_0x001f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r6.f2898t
            r5 = r5[r4]
            int r5 = r5.m1172a(r2)
            if (r5 == r0) goto L_0x001c
            return r1
        L_0x001c:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x001f:
            return r3
    }

    /* renamed from: E */
    boolean m1253E() {
            r6 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r6.f2898t
            r1 = 0
            r0 = r0[r1]
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r0.m1165b(r2)
            r3 = 1
            r4 = 1
        L_0x000d:
            int r5 = r6.f2897s
            if (r4 >= r5) goto L_0x001f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r6.f2898t
            r5 = r5[r4]
            int r5 = r5.m1165b(r2)
            if (r5 == r0) goto L_0x001c
            return r1
        L_0x001c:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x001f:
            return r3
    }

    /* renamed from: F */
    boolean m1252F() {
            r7 = this;
            int r0 = r7.m697e()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            int r0 = r7.f2886F
            if (r0 == 0) goto L_0x0077
            boolean r0 = r7.m662t()
            if (r0 != 0) goto L_0x0012
            goto L_0x0077
        L_0x0012:
            boolean r0 = r7.f2881A
            if (r0 == 0) goto L_0x001f
            int r0 = r7.m1249I()
            int r2 = r7.m1250H()
            goto L_0x0027
        L_0x001f:
            int r0 = r7.m1250H()
            int r2 = r7.m1249I()
        L_0x0027:
            r3 = 1
            if (r0 != 0) goto L_0x003c
            android.view.View r4 = r7.m1248J()
            if (r4 == 0) goto L_0x003c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r7.f2885E
            r0.m1190a()
        L_0x0035:
            r7.m656z()
            r7.m657y()
            return r3
        L_0x003c:
            boolean r4 = r7.f2893M
            if (r4 != 0) goto L_0x0041
            return r1
        L_0x0041:
            boolean r4 = r7.f2881A
            r5 = -1
            if (r4 == 0) goto L_0x0048
            r4 = -1
            goto L_0x0049
        L_0x0048:
            r4 = 1
        L_0x0049:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r6 = r7.f2885E
            int r2 = r2 + r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r6 = r6.m1187a(r0, r2, r4, r3)
            if (r6 != 0) goto L_0x005a
            r7.f2893M = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r7.f2885E
            r0.m1184b(r2)
            return r1
        L_0x005a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r7.f2885E
            int r2 = r6.f2917b
            int r4 = r4 * (-1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r1.m1187a(r0, r2, r4, r3)
            if (r0 != 0) goto L_0x006e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r7.f2885E
            int r1 = r6.f2917b
            r0.m1184b(r1)
            goto L_0x0035
        L_0x006e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r7.f2885E
            int r0 = r0.f2917b
            int r0 = r0 + r3
            r1.m1184b(r0)
            goto L_0x0035
        L_0x0077:
            return r1
    }

    /* renamed from: G */
    int m1251G() {
            r2 = this;
            boolean r0 = r2.f2881A
            r1 = 1
            if (r0 == 0) goto L_0x000a
            android.view.View r0 = r2.m1229a(r1)
            goto L_0x000e
        L_0x000a:
            android.view.View r0 = r2.m1223b(r1)
        L_0x000e:
            if (r0 != 0) goto L_0x0012
            r0 = -1
            goto L_0x0016
        L_0x0012:
            int r0 = r2.m673l(r0)
        L_0x0016:
            return r0
    }

    /* renamed from: H */
    int m1250H() {
            r2 = this;
            int r0 = r2.m697e()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x0010
        L_0x0008:
            android.view.View r0 = r2.m715c(r1)
            int r1 = r2.m673l(r0)
        L_0x0010:
            return r1
    }

    /* renamed from: I */
    int m1249I() {
            r1 = this;
            int r0 = r1.m697e()
            if (r0 != 0) goto L_0x0008
            r0 = 0
            goto L_0x0012
        L_0x0008:
            int r0 = r0 + (-1)
            android.view.View r0 = r1.m715c(r0)
            int r0 = r1.m673l(r0)
        L_0x0012:
            return r0
    }

    /* renamed from: J */
    android.view.View m1248J() {
            r12 = this;
            int r0 = r12.m697e()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2897s
            r2.<init>(r3)
            int r3 = r12.f2897s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2901w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.m1246L()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f2881A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.m715c(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2913e
            int r9 = r9.f2935e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2913e
            boolean r9 = r12.m1237a(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2913e
            int r9 = r9.f2935e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f2914f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.m715c(r9)
            boolean r10 = r12.f2881A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.i r10 = r12.f2899u
            int r10 = r10.mo1039a(r7)
            androidx.recyclerview.widget.i r11 = r12.f2899u
            int r11 = r11.mo1039a(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.i r10 = r12.f2899u
            int r10 = r10.mo1033d(r7)
            androidx.recyclerview.widget.i r11 = r12.f2899u
            int r11 = r11.mo1033d(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2913e
            int r8 = r8.f2935e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2913e
            int r9 = r9.f2935e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
    }

    /* renamed from: K */
    public void m1247K() {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r1.f2885E
            r0.m1190a()
            r1.m657y()
            return
    }

    /* renamed from: L */
    boolean m1246L() {
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

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo778a(int r1, androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r0 = this;
            int r1 = r0.m1221c(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo756a(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1215h(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo751a(androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.C0813j.C0815a0 r4) {
            r2 = this;
            int r0 = r2.f2901w
            r1 = 1
            if (r0 != r1) goto L_0x0008
            int r3 = r2.f2897s
            return r3
        L_0x0008:
            int r3 = super.mo751a(r3, r4)
            return r3
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public android.view.View mo765a(android.view.View r9, int r10, androidx.recyclerview.widget.C0813j.C0847v r11, androidx.recyclerview.widget.C0813j.C0815a0 r12) {
            r8 = this;
            int r0 = r8.m697e()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r9 = r8.m713c(r9)
            if (r9 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r8.m1243O()
            int r10 = r8.m1209l(r10)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r0) goto L_0x001b
            return r1
        L_0x001b:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r0
            boolean r2 = r0.f2914f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r0.f2913e
            r3 = 1
            if (r10 != r3) goto L_0x002d
            int r4 = r8.m1249I()
            goto L_0x0031
        L_0x002d:
            int r4 = r8.m1250H()
        L_0x0031:
            r8.m1227b(r4, r12)
            r8.m1197v(r10)
            androidx.recyclerview.widget.g r5 = r8.f2903y
            int r6 = r5.f3059d
            int r6 = r6 + r4
            r5.f3058c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.i r7 = r8.f2899u
            int r7 = r7.mo1028g()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.f3057b = r6
            androidx.recyclerview.widget.g r5 = r8.f2903y
            r5.f3063h = r3
            r6 = 0
            r5.f3056a = r6
            r8.m1231a(r11, r5, r12)
            boolean r11 = r8.f2881A
            r8.f2887G = r11
            if (r2 != 0) goto L_0x0066
            android.view.View r11 = r0.m1171a(r4, r10)
            if (r11 == 0) goto L_0x0066
            if (r11 == r9) goto L_0x0066
            return r11
        L_0x0066:
            boolean r11 = r8.m1198u(r10)
            if (r11 == 0) goto L_0x0081
            int r11 = r8.f2897s
            int r11 = r11 - r3
        L_0x006f:
            if (r11 < 0) goto L_0x0096
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2898t
            r12 = r12[r11]
            android.view.View r12 = r12.m1171a(r4, r10)
            if (r12 == 0) goto L_0x007e
            if (r12 == r9) goto L_0x007e
            return r12
        L_0x007e:
            int r11 = r11 + (-1)
            goto L_0x006f
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r8.f2897s
            if (r11 >= r12) goto L_0x0096
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2898t
            r12 = r12[r11]
            android.view.View r12 = r12.m1171a(r4, r10)
            if (r12 == 0) goto L_0x0093
            if (r12 == r9) goto L_0x0093
            return r12
        L_0x0093:
            int r11 = r11 + 1
            goto L_0x0082
        L_0x0096:
            boolean r11 = r8.f2904z
            r11 = r11 ^ r3
            r12 = -1
            if (r10 != r12) goto L_0x009e
            r12 = 1
            goto L_0x009f
        L_0x009e:
            r12 = 0
        L_0x009f:
            if (r11 != r12) goto L_0x00a3
            r11 = 1
            goto L_0x00a4
        L_0x00a3:
            r11 = 0
        L_0x00a4:
            if (r2 != 0) goto L_0x00ba
            if (r11 == 0) goto L_0x00ad
            int r12 = r0.m1160d()
            goto L_0x00b1
        L_0x00ad:
            int r12 = r0.m1158e()
        L_0x00b1:
            android.view.View r12 = r8.mo731b(r12)
            if (r12 == 0) goto L_0x00ba
            if (r12 == r9) goto L_0x00ba
            return r12
        L_0x00ba:
            boolean r10 = r8.m1198u(r10)
            if (r10 == 0) goto L_0x00e7
            int r10 = r8.f2897s
            int r10 = r10 - r3
        L_0x00c3:
            if (r10 < 0) goto L_0x0108
            int r12 = r0.f2935e
            if (r10 != r12) goto L_0x00ca
            goto L_0x00e4
        L_0x00ca:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2898t
            if (r11 == 0) goto L_0x00d5
            r12 = r12[r10]
            int r12 = r12.m1160d()
            goto L_0x00db
        L_0x00d5:
            r12 = r12[r10]
            int r12 = r12.m1158e()
        L_0x00db:
            android.view.View r12 = r8.mo731b(r12)
            if (r12 == 0) goto L_0x00e4
            if (r12 == r9) goto L_0x00e4
            return r12
        L_0x00e4:
            int r10 = r10 + (-1)
            goto L_0x00c3
        L_0x00e7:
            int r10 = r8.f2897s
            if (r6 >= r10) goto L_0x0108
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f2898t
            if (r11 == 0) goto L_0x00f6
            r10 = r10[r6]
            int r10 = r10.m1160d()
            goto L_0x00fc
        L_0x00f6:
            r10 = r10[r6]
            int r10 = r10.m1158e()
        L_0x00fc:
            android.view.View r10 = r8.mo731b(r10)
            if (r10 == 0) goto L_0x0105
            if (r10 == r9) goto L_0x0105
            return r10
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00e7
        L_0x0108:
            return r1
    }

    /* renamed from: a */
    android.view.View m1229a(boolean r8) {
            r7 = this;
            androidx.recyclerview.widget.i r0 = r7.f2899u
            int r0 = r0.mo1030f()
            androidx.recyclerview.widget.i r1 = r7.f2899u
            int r1 = r1.mo1038b()
            int r2 = r7.m697e()
            int r2 = r2 + (-1)
            r3 = 0
        L_0x0013:
            if (r2 < 0) goto L_0x0037
            android.view.View r4 = r7.m715c(r2)
            androidx.recyclerview.widget.i r5 = r7.f2899u
            int r5 = r5.mo1033d(r4)
            androidx.recyclerview.widget.i r6 = r7.f2899u
            int r6 = r6.mo1039a(r4)
            if (r6 <= r0) goto L_0x0034
            if (r5 < r1) goto L_0x002a
            goto L_0x0034
        L_0x002a:
            if (r6 <= r1) goto L_0x0033
            if (r8 != 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            if (r3 != 0) goto L_0x0034
            r3 = r4
            goto L_0x0034
        L_0x0033:
            return r4
        L_0x0034:
            int r2 = r2 + (-1)
            goto L_0x0013
        L_0x0037:
            return r3
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public androidx.recyclerview.widget.C0813j.C0840p mo776a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public androidx.recyclerview.widget.C0813j.C0840p mo758a(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x000c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L_0x000c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo783a(int r5, int r6, androidx.recyclerview.widget.C0813j.C0815a0 r7, androidx.recyclerview.widget.C0813j.AbstractC0835o.AbstractC0838c r8) {
            r4 = this;
            int r0 = r4.f2901w
            if (r0 != 0) goto L_0x0005
            goto L_0x0006
        L_0x0005:
            r5 = r6
        L_0x0006:
            int r6 = r4.m697e()
            if (r6 == 0) goto L_0x007a
            if (r5 != 0) goto L_0x000f
            goto L_0x007a
        L_0x000f:
            r4.m1242a(r5, r7)
            int[] r5 = r4.f2895O
            if (r5 == 0) goto L_0x001b
            int r5 = r5.length
            int r6 = r4.f2897s
            if (r5 >= r6) goto L_0x0021
        L_0x001b:
            int r5 = r4.f2897s
            int[] r5 = new int[r5]
            r4.f2895O = r5
        L_0x0021:
            r5 = 0
            r6 = 0
            r0 = 0
        L_0x0024:
            int r1 = r4.f2897s
            if (r6 >= r1) goto L_0x0054
            androidx.recyclerview.widget.g r1 = r4.f2903y
            int r2 = r1.f3059d
            r3 = -1
            if (r2 != r3) goto L_0x003a
            int r1 = r1.f3061f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f2898t
            r2 = r2[r6]
            int r2 = r2.m1165b(r1)
            goto L_0x0048
        L_0x003a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f2898t
            r2 = r2[r6]
            int r1 = r1.f3062g
            int r1 = r2.m1172a(r1)
            androidx.recyclerview.widget.g r2 = r4.f2903y
            int r2 = r2.f3062g
        L_0x0048:
            int r1 = r1 - r2
            if (r1 < 0) goto L_0x0051
            int[] r2 = r4.f2895O
            r2[r0] = r1
            int r0 = r0 + 1
        L_0x0051:
            int r6 = r6 + 1
            goto L_0x0024
        L_0x0054:
            int[] r6 = r4.f2895O
            java.util.Arrays.sort(r6, r5, r0)
        L_0x0059:
            if (r5 >= r0) goto L_0x007a
            androidx.recyclerview.widget.g r6 = r4.f2903y
            boolean r6 = r6.m1056a(r7)
            if (r6 == 0) goto L_0x007a
            androidx.recyclerview.widget.g r6 = r4.f2903y
            int r6 = r6.f3058c
            int[] r1 = r4.f2895O
            r1 = r1[r5]
            r8.mo655a(r6, r1)
            androidx.recyclerview.widget.g r6 = r4.f2903y
            int r1 = r6.f3058c
            int r2 = r6.f3059d
            int r1 = r1 + r2
            r6.f3058c = r1
            int r5 = r5 + 1
            goto L_0x0059
        L_0x007a:
            return
    }

    /* renamed from: a */
    void m1242a(int r5, androidx.recyclerview.widget.C0813j.C0815a0 r6) {
            r4 = this;
            r0 = 1
            if (r5 <= 0) goto L_0x0009
            int r1 = r4.m1249I()
            r2 = 1
            goto L_0x0010
        L_0x0009:
            r1 = -1
            int r2 = r4.m1250H()
            r1 = r2
            r2 = -1
        L_0x0010:
            androidx.recyclerview.widget.g r3 = r4.f2903y
            r3.f3056a = r0
            r4.m1227b(r1, r6)
            r4.m1197v(r2)
            androidx.recyclerview.widget.g r6 = r4.f2903y
            int r0 = r6.f3059d
            int r1 = r1 + r0
            r6.f3058c = r1
            int r5 = java.lang.Math.abs(r5)
            r6.f3057b = r5
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo774a(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.m670n()
            int r1 = r4.m668o()
            int r0 = r0 + r1
            int r1 = r4.m666p()
            int r2 = r4.m672m()
            int r1 = r1 + r2
            int r2 = r4.f2901w
            r3 = 1
            if (r2 != r3) goto L_0x0034
            int r5 = r5.height()
            int r5 = r5 + r1
            int r1 = r4.m676k()
            int r5 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m785a(r7, r5, r1)
            int r7 = r4.f2902x
            int r1 = r4.f2897s
            int r7 = r7 * r1
            int r7 = r7 + r0
            int r0 = r4.m674l()
            int r6 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m785a(r6, r7, r0)
            goto L_0x0050
        L_0x0034:
            int r5 = r5.width()
            int r5 = r5 + r0
            int r0 = r4.m674l()
            int r6 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m785a(r6, r5, r0)
            int r5 = r4.f2902x
            int r0 = r4.f2897s
            int r5 = r5 * r0
            int r5 = r5 + r1
            int r0 = r4.m676k()
            int r5 = androidx.recyclerview.widget.C0813j.AbstractC0835o.m785a(r7, r5, r0)
        L_0x0050:
            r4.m714c(r6, r5)
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo773a(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e
            if (r0 == 0) goto L_0x000b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0777e) r2
            r1.f2889I = r2
            r1.m657y()
        L_0x000b:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo757a(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.mo757a(r3)
            int r0 = r2.m697e()
            if (r0 <= 0) goto L_0x002f
            r0 = 0
            android.view.View r1 = r2.m1223b(r0)
            android.view.View r0 = r2.m1229a(r0)
            if (r1 == 0) goto L_0x002f
            if (r0 != 0) goto L_0x0017
            goto L_0x002f
        L_0x0017:
            int r1 = r2.m673l(r1)
            int r0 = r2.m673l(r0)
            if (r1 >= r0) goto L_0x0028
            r3.setFromIndex(r1)
            r3.setToIndex(r0)
            goto L_0x002f
        L_0x0028:
            r3.setFromIndex(r0)
            r3.setToIndex(r1)
        L_0x002f:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo746a(androidx.recyclerview.widget.C0813j.C0847v r7, androidx.recyclerview.widget.C0813j.C0815a0 r8, android.view.View r9, p000a.p018g.p029l.p030a0.C0191c r10) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r7 = r9.getLayoutParams()
            boolean r8 = r7 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c
            if (r8 != 0) goto L_0x000c
            super.m763a(r9, r10)
            return
        L_0x000c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r7
            int r8 = r6.f2901w
            r9 = 1
            if (r8 != 0) goto L_0x0023
            int r0 = r7.m1192e()
            boolean r8 = r7.f2914f
            if (r8 == 0) goto L_0x001f
            int r9 = r6.f2897s
            r1 = r9
            goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            r2 = -1
            r3 = -1
            goto L_0x0032
        L_0x0023:
            r0 = -1
            r1 = -1
            int r2 = r7.m1192e()
            boolean r8 = r7.f2914f
            if (r8 == 0) goto L_0x0031
            int r9 = r6.f2897s
            r3 = r9
            goto L_0x0032
        L_0x0031:
            r3 = 1
        L_0x0032:
            boolean r4 = r7.f2914f
            r5 = 0
            a.g.l.a0.c$c r7 = p000a.p018g.p029l.p030a0.C0191c.C0194c.m3496a(r0, r1, r2, r3, r4, r5)
            r10.m3530b(r7)
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo743a(androidx.recyclerview.widget.C0813j r1, int r2, int r3) {
            r0 = this;
            r1 = 1
            r0.m1228b(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo742a(androidx.recyclerview.widget.C0813j r1, int r2, int r3, int r4) {
            r0 = this;
            r1 = 8
            r0.m1228b(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo741a(androidx.recyclerview.widget.C0813j r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            r1 = 4
            r0.m1228b(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo733a(java.lang.String r2) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r1.f2889I
            if (r0 != 0) goto L_0x0007
            super.mo733a(r2)
        L_0x0007:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public boolean mo788a() {
            r1 = this;
            int r0 = r1.f2901w
            if (r0 != 0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            return r0
    }

    /* renamed from: a */
    boolean m1234a(androidx.recyclerview.widget.C0813j.C0815a0 r6, androidx.recyclerview.widget.StaggeredGridLayoutManager.C0772b r7) {
            r5 = this;
            boolean r0 = r6.m902d()
            r1 = 0
            if (r0 != 0) goto L_0x00dd
            int r0 = r5.f2883C
            r2 = -1
            if (r0 != r2) goto L_0x000e
            goto L_0x00dd
        L_0x000e:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 < 0) goto L_0x00d9
            int r6 = r6.m907a()
            if (r0 < r6) goto L_0x001a
            goto L_0x00d9
        L_0x001a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r5.f2889I
            r0 = 1
            if (r6 == 0) goto L_0x0030
            int r4 = r6.f2921b
            if (r4 == r2) goto L_0x0030
            int r6 = r6.f2923d
            if (r6 >= r0) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            r7.f2907b = r3
            int r6 = r5.f2883C
            r7.f2906a = r6
            goto L_0x00d8
        L_0x0030:
            int r6 = r5.f2883C
            android.view.View r6 = r5.mo731b(r6)
            if (r6 == 0) goto L_0x00bc
            boolean r1 = r5.f2881A
            if (r1 == 0) goto L_0x0041
            int r1 = r5.m1249I()
            goto L_0x0045
        L_0x0041:
            int r1 = r5.m1250H()
        L_0x0045:
            r7.f2906a = r1
            int r1 = r5.f2884D
            if (r1 == r3) goto L_0x0072
            boolean r1 = r7.f2908c
            if (r1 == 0) goto L_0x005f
            androidx.recyclerview.widget.i r1 = r5.f2899u
            int r1 = r1.mo1038b()
            int r2 = r5.f2884D
            int r1 = r1 - r2
            androidx.recyclerview.widget.i r2 = r5.f2899u
            int r6 = r2.mo1039a(r6)
            goto L_0x006e
        L_0x005f:
            androidx.recyclerview.widget.i r1 = r5.f2899u
            int r1 = r1.mo1030f()
            int r2 = r5.f2884D
            int r1 = r1 + r2
            androidx.recyclerview.widget.i r2 = r5.f2899u
            int r6 = r2.mo1033d(r6)
        L_0x006e:
            int r1 = r1 - r6
            r7.f2907b = r1
            return r0
        L_0x0072:
            androidx.recyclerview.widget.i r1 = r5.f2899u
            int r1 = r1.mo1037b(r6)
            androidx.recyclerview.widget.i r2 = r5.f2899u
            int r2 = r2.mo1028g()
            if (r1 <= r2) goto L_0x0094
            boolean r6 = r7.f2908c
            if (r6 == 0) goto L_0x008b
            androidx.recyclerview.widget.i r6 = r5.f2899u
            int r6 = r6.mo1038b()
            goto L_0x0091
        L_0x008b:
            androidx.recyclerview.widget.i r6 = r5.f2899u
            int r6 = r6.mo1030f()
        L_0x0091:
            r7.f2907b = r6
            return r0
        L_0x0094:
            androidx.recyclerview.widget.i r1 = r5.f2899u
            int r1 = r1.mo1033d(r6)
            androidx.recyclerview.widget.i r2 = r5.f2899u
            int r2 = r2.mo1030f()
            int r1 = r1 - r2
            if (r1 >= 0) goto L_0x00a7
            int r6 = -r1
            r7.f2907b = r6
            return r0
        L_0x00a7:
            androidx.recyclerview.widget.i r1 = r5.f2899u
            int r1 = r1.mo1038b()
            androidx.recyclerview.widget.i r2 = r5.f2899u
            int r6 = r2.mo1039a(r6)
            int r1 = r1 - r6
            if (r1 >= 0) goto L_0x00b9
            r7.f2907b = r1
            return r0
        L_0x00b9:
            r7.f2907b = r3
            goto L_0x00d8
        L_0x00bc:
            int r6 = r5.f2883C
            r7.f2906a = r6
            int r6 = r5.f2884D
            if (r6 != r3) goto L_0x00d3
            int r6 = r7.f2906a
            int r6 = r5.m1210k(r6)
            if (r6 != r0) goto L_0x00cd
            r1 = 1
        L_0x00cd:
            r7.f2908c = r1
            r7.m1196a()
            goto L_0x00d6
        L_0x00d3:
            r7.m1195a(r6)
        L_0x00d6:
            r7.f2909d = r0
        L_0x00d8:
            return r0
        L_0x00d9:
            r5.f2883C = r2
            r5.f2884D = r3
        L_0x00dd:
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public boolean mo754a(androidx.recyclerview.widget.C0813j.C0840p r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo728b(int r1, androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r0 = this;
            int r1 = r0.m1221c(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo723b(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1213i(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo721b(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r1 = this;
            int r0 = r1.f2901w
            if (r0 != 0) goto L_0x0007
            int r2 = r1.f2897s
            return r2
        L_0x0007:
            int r2 = super.mo721b(r2, r3)
            return r2
    }

    /* renamed from: b */
    android.view.View m1223b(boolean r9) {
            r8 = this;
            androidx.recyclerview.widget.i r0 = r8.f2899u
            int r0 = r0.mo1030f()
            androidx.recyclerview.widget.i r1 = r8.f2899u
            int r1 = r1.mo1038b()
            int r2 = r8.m697e()
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r2) goto L_0x0036
            android.view.View r5 = r8.m715c(r4)
            androidx.recyclerview.widget.i r6 = r8.f2899u
            int r6 = r6.mo1033d(r5)
            androidx.recyclerview.widget.i r7 = r8.f2899u
            int r7 = r7.mo1039a(r5)
            if (r7 <= r0) goto L_0x0033
            if (r6 < r1) goto L_0x0029
            goto L_0x0033
        L_0x0029:
            if (r6 >= r0) goto L_0x0032
            if (r9 != 0) goto L_0x002e
            goto L_0x0032
        L_0x002e:
            if (r3 != 0) goto L_0x0033
            r3 = r5
            goto L_0x0033
        L_0x0032:
            return r5
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0036:
            return r3
    }

    /* renamed from: b */
    void m1226b(androidx.recyclerview.widget.C0813j.C0815a0 r2, androidx.recyclerview.widget.StaggeredGridLayoutManager.C0772b r3) {
            r1 = this;
            boolean r0 = r1.m1234a(r2, r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            boolean r2 = r1.m1220c(r2, r3)
            if (r2 == 0) goto L_0x000e
            return
        L_0x000e:
            r3.m1196a()
            r2 = 0
            r3.f2906a = r2
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public void mo719b(androidx.recyclerview.widget.C0813j r1, int r2, int r3) {
            r0 = this;
            r1 = 2
            r0.m1228b(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public void mo717b(androidx.recyclerview.widget.C0813j r2, androidx.recyclerview.widget.C0813j.C0847v r3) {
            r1 = this;
            super.mo717b(r2, r3)
            java.lang.Runnable r3 = r1.f2896P
            r1.m734a(r3)
            r3 = 0
        L_0x0009:
            int r0 = r1.f2897s
            if (r3 >= r0) goto L_0x0017
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r1.f2898t
            r0 = r0[r3]
            r0.m1163c()
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0017:
            r2.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public boolean mo732b() {
            r2 = this;
            int r0 = r2.f2901w
            r1 = 1
            if (r0 != r1) goto L_0x0006
            goto L_0x0007
        L_0x0006:
            r1 = 0
        L_0x0007:
            return r1
    }

    /* renamed from: c */
    int m1221c(int r3, androidx.recyclerview.widget.C0813j.C0847v r4, androidx.recyclerview.widget.C0813j.C0815a0 r5) {
            r2 = this;
            int r0 = r2.m697e()
            r1 = 0
            if (r0 == 0) goto L_0x0031
            if (r3 != 0) goto L_0x000a
            goto L_0x0031
        L_0x000a:
            r2.m1242a(r3, r5)
            androidx.recyclerview.widget.g r0 = r2.f2903y
            int r5 = r2.m1231a(r4, r0, r5)
            androidx.recyclerview.widget.g r0 = r2.f2903y
            int r0 = r0.f3057b
            if (r0 >= r5) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            if (r3 >= 0) goto L_0x001e
            int r3 = -r5
            goto L_0x001f
        L_0x001e:
            r3 = r5
        L_0x001f:
            androidx.recyclerview.widget.i r5 = r2.f2899u
            int r0 = -r3
            r5.mo1040a(r0)
            boolean r5 = r2.f2881A
            r2.f2887G = r5
            androidx.recyclerview.widget.g r5 = r2.f2903y
            r5.f3057b = r1
            r2.m1232a(r4, r5)
            return r3
        L_0x0031:
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: c */
    public int mo711c(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1211j(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: c */
    public androidx.recyclerview.widget.C0813j.C0840p mo716c() {
            r3 = this;
            int r0 = r3.f2901w
            r1 = -2
            r2 = -1
            if (r0 != 0) goto L_0x000c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r1, r2)
            return r0
        L_0x000c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: c */
    public void m1218c(boolean r3) {
            r2 = this;
            r0 = 0
            r2.mo733a(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r2.f2889I
            if (r0 == 0) goto L_0x000e
            boolean r1 = r0.f2928i
            if (r1 == r3) goto L_0x000e
            r0.f2928i = r3
        L_0x000e:
            r2.f2904z = r3
            r2.m657y()
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: d */
    public int mo701d(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1215h(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: d */
    public void mo705d(int r3) {
            r2 = this;
            super.mo705d(r3)
            r0 = 0
        L_0x0004:
            int r1 = r2.f2897s
            if (r0 >= r1) goto L_0x0012
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r2.f2898t
            r1 = r1[r0]
            r1.m1162c(r3)
            int r0 = r0 + 1
            goto L_0x0004
        L_0x0012:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: d */
    public void mo699d(androidx.recyclerview.widget.C0813j r1) {
            r0 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r0.f2885E
            r1.m1190a()
            r0.m657y()
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public int mo694e(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1213i(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public void mo696e(int r3) {
            r2 = this;
            super.mo696e(r3)
            r0 = 0
        L_0x0004:
            int r1 = r2.f2897s
            if (r0 >= r1) goto L_0x0012
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r2.f2898t
            r1 = r1[r0]
            r1.m1162c(r3)
            int r0 = r0 + 1
            goto L_0x0004
        L_0x0012:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public void mo693e(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3) {
            r1 = this;
            r0 = 1
            r1.m1219c(r2, r3, r0)
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: f */
    public int mo688f(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            int r1 = r0.m1211j(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: f */
    public void mo690f(int r1) {
            r0 = this;
            if (r1 != 0) goto L_0x0005
            r0.m1252F()
        L_0x0005:
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: g */
    public void mo683g(androidx.recyclerview.widget.C0813j.C0815a0 r1) {
            r0 = this;
            super.mo683g(r1)
            r1 = -1
            r0.f2883C = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f2884D = r1
            r1 = 0
            r0.f2889I = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r0.f2892L
            r1.m1193b()
            return
    }

    /* renamed from: h */
    public void m1216h(int r2) {
            r1 = this;
            if (r2 == 0) goto L_0x000e
            r0 = 1
            if (r2 != r0) goto L_0x0006
            goto L_0x000e
        L_0x0006:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid orientation."
            r2.<init>(r0)
            throw r2
        L_0x000e:
            r0 = 0
            r1.mo733a(r0)
            int r0 = r1.f2901w
            if (r2 != r0) goto L_0x0017
            return
        L_0x0017:
            r1.f2901w = r2
            androidx.recyclerview.widget.i r2 = r1.f2899u
            androidx.recyclerview.widget.i r0 = r1.f2900v
            r1.f2899u = r0
            r1.f2900v = r2
            r1.m657y()
            return
    }

    /* renamed from: i */
    public void m1214i(int r3) {
            r2 = this;
            r0 = 0
            r2.mo733a(r0)
            int r0 = r2.f2897s
            if (r3 == r0) goto L_0x0030
            r2.m1247K()
            r2.f2897s = r3
            java.util.BitSet r3 = new java.util.BitSet
            int r0 = r2.f2897s
            r3.<init>(r0)
            r2.f2882B = r3
            int r3 = r2.f2897s
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.C0779f[r3]
            r2.f2898t = r3
            r3 = 0
        L_0x001d:
            int r0 = r2.f2897s
            if (r3 >= r0) goto L_0x002d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r2.f2898t
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$f
            r1.<init>(r2, r3)
            r0[r3] = r1
            int r3 = r3 + 1
            goto L_0x001d
        L_0x002d:
            r2.m657y()
        L_0x0030:
            return
    }

    /* renamed from: j */
    void m1212j(int r2) {
            r1 = this;
            int r0 = r1.f2897s
            int r0 = r2 / r0
            r1.f2902x = r0
            androidx.recyclerview.widget.i r0 = r1.f2900v
            int r0 = r0.mo1034d()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r1.f2890J = r2
            return
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: u */
    public boolean mo661u() {
            r1 = this;
            int r0 = r1.f2886F
            if (r0 == 0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            return r0
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: x */
    public android.os.Parcelable mo658x() {
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r4.f2889I
            if (r0 == 0) goto L_0x000a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            r1.<init>(r0)
            return r1
        L_0x000a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            r0.<init>()
            boolean r1 = r4.f2904z
            r0.f2928i = r1
            boolean r1 = r4.f2887G
            r0.f2929j = r1
            boolean r1 = r4.f2888H
            r0.f2930k = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r4.f2885E
            r2 = 0
            if (r1 == 0) goto L_0x0030
            int[] r3 = r1.f2915a
            if (r3 == 0) goto L_0x0030
            r0.f2926g = r3
            int[] r3 = r0.f2926g
            int r3 = r3.length
            r0.f2925f = r3
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = r1.f2916b
            r0.f2927h = r1
            goto L_0x0032
        L_0x0030:
            r0.f2925f = r2
        L_0x0032:
            int r1 = r4.m697e()
            if (r1 <= 0) goto L_0x0088
            boolean r1 = r4.f2887G
            if (r1 == 0) goto L_0x0041
            int r1 = r4.m1249I()
            goto L_0x0045
        L_0x0041:
            int r1 = r4.m1250H()
        L_0x0045:
            r0.f2921b = r1
            int r1 = r4.m1251G()
            r0.f2922c = r1
            int r1 = r4.f2897s
            r0.f2923d = r1
            int[] r1 = new int[r1]
            r0.f2924e = r1
        L_0x0055:
            int r1 = r4.f2897s
            if (r2 >= r1) goto L_0x008f
            boolean r1 = r4.f2887G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0070
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2898t
            r1 = r1[r2]
            int r1 = r1.m1172a(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.i r3 = r4.f2899u
            int r3 = r3.mo1038b()
            goto L_0x0080
        L_0x0070:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2898t
            r1 = r1[r2]
            int r1 = r1.m1165b(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.i r3 = r4.f2899u
            int r3 = r3.mo1030f()
        L_0x0080:
            int r1 = r1 - r3
        L_0x0081:
            int[] r3 = r0.f2924e
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0088:
            r1 = -1
            r0.f2921b = r1
            r0.f2922c = r1
            r0.f2923d = r2
        L_0x008f:
            return r0
    }
}
