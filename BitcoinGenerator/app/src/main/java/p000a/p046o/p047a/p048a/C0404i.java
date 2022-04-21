package p000a.p046o.p047a.p048a;

/* renamed from: a.o.a.a.i */
/* loaded from: classes.dex */
public class C0404i extends p000a.p046o.p047a.p048a.AbstractC0403h {

    /* renamed from: k */
    static final android.graphics.PorterDuff.Mode f1209k = null;

    /* renamed from: c */
    private p000a.p046o.p047a.p048a.C0404i.C0412h f1210c;

    /* renamed from: d */
    private android.graphics.PorterDuffColorFilter f1211d;

    /* renamed from: e */
    private android.graphics.ColorFilter f1212e;

    /* renamed from: f */
    private boolean f1213f;

    /* renamed from: g */
    private boolean f1214g;

    /* renamed from: h */
    private final float[] f1215h;

    /* renamed from: i */
    private final android.graphics.Matrix f1216i;

    /* renamed from: j */
    private final android.graphics.Rect f1217j;

    /* renamed from: a.o.a.a.i$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0405a {
    }

    /* renamed from: a.o.a.a.i$b */
    /* loaded from: classes.dex */
    private static class C0406b extends p000a.p046o.p047a.p048a.C0404i.AbstractC0410f {
        public C0406b() {
                r0 = this;
                r0.<init>()
                return
        }

        public C0406b(p000a.p046o.p047a.p048a.C0404i.C0406b r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* renamed from: a */
        private void m2719a(android.content.res.TypedArray r2) {
                r1 = this;
                r0 = 0
                java.lang.String r0 = r2.getString(r0)
                if (r0 == 0) goto L_0x0009
                r1.f1245b = r0
            L_0x0009:
                r0 = 1
                java.lang.String r2 = r2.getString(r0)
                if (r2 == 0) goto L_0x0016
                a.g.e.b$b[] r2 = p000a.p018g.p021e.C0142b.m3667a(r2)
                r1.f1244a = r2
            L_0x0016:
                return
        }

        /* renamed from: a */
        public void m2720a(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                java.lang.String r0 = "pathData"
                boolean r5 = p000a.p018g.p019d.p020c.C0140g.m3675a(r5, r0)
                if (r5 != 0) goto L_0x0009
                return
            L_0x0009:
                int[] r5 = p000a.p046o.p047a.p048a.C0392a.f1184d
                android.content.res.TypedArray r2 = p000a.p018g.p019d.p020c.C0140g.m3681a(r2, r4, r3, r5)
                r1.m2719a(r2)
                r2.recycle()
                return
        }

        @Override // p000a.p046o.p047a.p048a.C0404i.AbstractC0410f
        /* renamed from: b */
        public boolean mo2708b() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* renamed from: a.o.a.a.i$c */
    /* loaded from: classes.dex */
    private static class C0407c extends p000a.p046o.p047a.p048a.C0404i.AbstractC0410f {

        /* renamed from: d */
        private int[] f1218d;

        /* renamed from: e */
        p000a.p018g.p019d.p020c.C0127b f1219e;

        /* renamed from: f */
        float f1220f;

        /* renamed from: g */
        p000a.p018g.p019d.p020c.C0127b f1221g;

        /* renamed from: h */
        float f1222h;

        /* renamed from: i */
        int f1223i;

        /* renamed from: j */
        float f1224j;

        /* renamed from: k */
        float f1225k;

        /* renamed from: l */
        float f1226l;

        /* renamed from: m */
        float f1227m;

        /* renamed from: n */
        android.graphics.Paint.Cap f1228n;

        /* renamed from: o */
        android.graphics.Paint.Join f1229o;

        /* renamed from: p */
        float f1230p;

        public C0407c() {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f1220f = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r3.f1222h = r1
                r2 = 0
                r3.f1223i = r2
                r3.f1224j = r1
                r3.f1225k = r0
                r3.f1226l = r1
                r3.f1227m = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r3.f1228n = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r3.f1229o = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r3.f1230p = r0
                return
        }

        public C0407c(p000a.p046o.p047a.p048a.C0404i.C0407c r4) {
                r3 = this;
                r3.<init>(r4)
                r0 = 0
                r3.f1220f = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r3.f1222h = r1
                r2 = 0
                r3.f1223i = r2
                r3.f1224j = r1
                r3.f1225k = r0
                r3.f1226l = r1
                r3.f1227m = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r3.f1228n = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r3.f1229o = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r3.f1230p = r0
                int[] r0 = r4.f1218d
                r3.f1218d = r0
                a.g.d.c.b r0 = r4.f1219e
                r3.f1219e = r0
                float r0 = r4.f1220f
                r3.f1220f = r0
                float r0 = r4.f1222h
                r3.f1222h = r0
                a.g.d.c.b r0 = r4.f1221g
                r3.f1221g = r0
                int r0 = r4.f1223i
                r3.f1223i = r0
                float r0 = r4.f1224j
                r3.f1224j = r0
                float r0 = r4.f1225k
                r3.f1225k = r0
                float r0 = r4.f1226l
                r3.f1226l = r0
                float r0 = r4.f1227m
                r3.f1227m = r0
                android.graphics.Paint$Cap r0 = r4.f1228n
                r3.f1228n = r0
                android.graphics.Paint$Join r0 = r4.f1229o
                r3.f1229o = r0
                float r4 = r4.f1230p
                r3.f1230p = r4
                return
        }

        /* renamed from: a */
        private android.graphics.Paint.Cap m2718a(int r2, android.graphics.Paint.Cap r3) {
                r1 = this;
                if (r2 == 0) goto L_0x000f
                r0 = 1
                if (r2 == r0) goto L_0x000c
                r0 = 2
                if (r2 == r0) goto L_0x0009
                return r3
            L_0x0009:
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.SQUARE
                return r2
            L_0x000c:
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.ROUND
                return r2
            L_0x000f:
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT
                return r2
        }

        /* renamed from: a */
        private android.graphics.Paint.Join m2717a(int r2, android.graphics.Paint.Join r3) {
                r1 = this;
                if (r2 == 0) goto L_0x000f
                r0 = 1
                if (r2 == r0) goto L_0x000c
                r0 = 2
                if (r2 == r0) goto L_0x0009
                return r3
            L_0x0009:
                android.graphics.Paint$Join r2 = android.graphics.Paint.Join.BEVEL
                return r2
            L_0x000c:
                android.graphics.Paint$Join r2 = android.graphics.Paint.Join.ROUND
                return r2
            L_0x000f:
                android.graphics.Paint$Join r2 = android.graphics.Paint.Join.MITER
                return r2
        }

        /* renamed from: a */
        private void m2715a(android.content.res.TypedArray r8, org.xmlpull.v1.XmlPullParser r9, android.content.res.Resources.Theme r10) {
                r7 = this;
                r0 = 0
                r7.f1218d = r0
                java.lang.String r0 = "pathData"
                boolean r0 = p000a.p018g.p019d.p020c.C0140g.m3675a(r9, r0)
                if (r0 != 0) goto L_0x000c
                return
            L_0x000c:
                r0 = 0
                java.lang.String r0 = r8.getString(r0)
                if (r0 == 0) goto L_0x0015
                r7.f1245b = r0
            L_0x0015:
                r0 = 2
                java.lang.String r0 = r8.getString(r0)
                if (r0 == 0) goto L_0x0022
                a.g.e.b$b[] r0 = p000a.p018g.p021e.C0142b.m3667a(r0)
                r7.f1244a = r0
            L_0x0022:
                r5 = 1
                r6 = 0
                java.lang.String r4 = "fillColor"
                r1 = r8
                r2 = r9
                r3 = r10
                a.g.d.c.b r0 = p000a.p018g.p019d.p020c.C0140g.m3680a(r1, r2, r3, r4, r5, r6)
                r7.f1221g = r0
                r0 = 12
                float r1 = r7.f1224j
                java.lang.String r2 = "fillAlpha"
                float r0 = p000a.p018g.p019d.p020c.C0140g.m3678a(r8, r9, r2, r0, r1)
                r7.f1224j = r0
                r0 = 8
                r1 = -1
                java.lang.String r2 = "strokeLineCap"
                int r0 = p000a.p018g.p019d.p020c.C0140g.m3673b(r8, r9, r2, r0, r1)
                android.graphics.Paint$Cap r2 = r7.f1228n
                android.graphics.Paint$Cap r0 = r7.m2718a(r0, r2)
                r7.f1228n = r0
                r0 = 9
                java.lang.String r2 = "strokeLineJoin"
                int r0 = p000a.p018g.p019d.p020c.C0140g.m3673b(r8, r9, r2, r0, r1)
                android.graphics.Paint$Join r1 = r7.f1229o
                android.graphics.Paint$Join r0 = r7.m2717a(r0, r1)
                r7.f1229o = r0
                r0 = 10
                float r1 = r7.f1230p
                java.lang.String r2 = "strokeMiterLimit"
                float r0 = p000a.p018g.p019d.p020c.C0140g.m3678a(r8, r9, r2, r0, r1)
                r7.f1230p = r0
                r5 = 3
                java.lang.String r4 = "strokeColor"
                r1 = r8
                r2 = r9
                a.g.d.c.b r10 = p000a.p018g.p019d.p020c.C0140g.m3680a(r1, r2, r3, r4, r5, r6)
                r7.f1219e = r10
                r10 = 11
                float r0 = r7.f1222h
                java.lang.String r1 = "strokeAlpha"
                float r10 = p000a.p018g.p019d.p020c.C0140g.m3678a(r8, r9, r1, r10, r0)
                r7.f1222h = r10
                r10 = 4
                float r0 = r7.f1220f
                java.lang.String r1 = "strokeWidth"
                float r10 = p000a.p018g.p019d.p020c.C0140g.m3678a(r8, r9, r1, r10, r0)
                r7.f1220f = r10
                r10 = 6
                float r0 = r7.f1226l
                java.lang.String r1 = "trimPathEnd"
                float r10 = p000a.p018g.p019d.p020c.C0140g.m3678a(r8, r9, r1, r10, r0)
                r7.f1226l = r10
                r10 = 7
                float r0 = r7.f1227m
                java.lang.String r1 = "trimPathOffset"
                float r10 = p000a.p018g.p019d.p020c.C0140g.m3678a(r8, r9, r1, r10, r0)
                r7.f1227m = r10
                r10 = 5
                float r0 = r7.f1225k
                java.lang.String r1 = "trimPathStart"
                float r10 = p000a.p018g.p019d.p020c.C0140g.m3678a(r8, r9, r1, r10, r0)
                r7.f1225k = r10
                r10 = 13
                int r0 = r7.f1223i
                java.lang.String r1 = "fillType"
                int r8 = p000a.p018g.p019d.p020c.C0140g.m3673b(r8, r9, r1, r10, r0)
                r7.f1223i = r8
                return
        }

        /* renamed from: a */
        public void m2716a(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                int[] r0 = p000a.p046o.p047a.p048a.C0392a.f1183c
                android.content.res.TypedArray r2 = p000a.p018g.p019d.p020c.C0140g.m3681a(r2, r4, r3, r0)
                r1.m2715a(r2, r5, r4)
                r2.recycle()
                return
        }

        @Override // p000a.p046o.p047a.p048a.C0404i.AbstractC0409e
        /* renamed from: a */
        public boolean mo2711a() {
                r1 = this;
                a.g.d.c.b r0 = r1.f1221g
                boolean r0 = r0.m3714d()
                if (r0 != 0) goto L_0x0013
                a.g.d.c.b r0 = r1.f1219e
                boolean r0 = r0.m3714d()
                if (r0 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r0 = 0
                goto L_0x0014
            L_0x0013:
                r0 = 1
            L_0x0014:
                return r0
        }

        @Override // p000a.p046o.p047a.p048a.C0404i.AbstractC0409e
        /* renamed from: a */
        public boolean mo2710a(int[] r3) {
                r2 = this;
                a.g.d.c.b r0 = r2.f1221g
                boolean r0 = r0.m3719a(r3)
                a.g.d.c.b r1 = r2.f1219e
                boolean r3 = r1.m3719a(r3)
                r3 = r3 | r0
                return r3
        }

        float getFillAlpha() {
                r1 = this;
                float r0 = r1.f1224j
                return r0
        }

        int getFillColor() {
                r1 = this;
                a.g.d.c.b r0 = r1.f1221g
                int r0 = r0.m3724a()
                return r0
        }

        float getStrokeAlpha() {
                r1 = this;
                float r0 = r1.f1222h
                return r0
        }

        int getStrokeColor() {
                r1 = this;
                a.g.d.c.b r0 = r1.f1219e
                int r0 = r0.m3724a()
                return r0
        }

        float getStrokeWidth() {
                r1 = this;
                float r0 = r1.f1220f
                return r0
        }

        float getTrimPathEnd() {
                r1 = this;
                float r0 = r1.f1226l
                return r0
        }

        float getTrimPathOffset() {
                r1 = this;
                float r0 = r1.f1227m
                return r0
        }

        float getTrimPathStart() {
                r1 = this;
                float r0 = r1.f1225k
                return r0
        }

        void setFillAlpha(float r1) {
                r0 = this;
                r0.f1224j = r1
                return
        }

        void setFillColor(int r2) {
                r1 = this;
                a.g.d.c.b r0 = r1.f1221g
                r0.m3723a(r2)
                return
        }

        void setStrokeAlpha(float r1) {
                r0 = this;
                r0.f1222h = r1
                return
        }

        void setStrokeColor(int r2) {
                r1 = this;
                a.g.d.c.b r0 = r1.f1219e
                r0.m3723a(r2)
                return
        }

        void setStrokeWidth(float r1) {
                r0 = this;
                r0.f1220f = r1
                return
        }

        void setTrimPathEnd(float r1) {
                r0 = this;
                r0.f1226l = r1
                return
        }

        void setTrimPathOffset(float r1) {
                r0 = this;
                r0.f1227m = r1
                return
        }

        void setTrimPathStart(float r1) {
                r0 = this;
                r0.f1225k = r1
                return
        }
    }

    /* renamed from: a.o.a.a.i$d */
    /* loaded from: classes.dex */
    private static class C0408d extends p000a.p046o.p047a.p048a.C0404i.AbstractC0409e {

        /* renamed from: a */
        final android.graphics.Matrix f1231a;

        /* renamed from: b */
        final java.util.ArrayList<p000a.p046o.p047a.p048a.C0404i.AbstractC0409e> f1232b;

        /* renamed from: c */
        float f1233c;

        /* renamed from: d */
        private float f1234d;

        /* renamed from: e */
        private float f1235e;

        /* renamed from: f */
        private float f1236f;

        /* renamed from: g */
        private float f1237g;

        /* renamed from: h */
        private float f1238h;

        /* renamed from: i */
        private float f1239i;

        /* renamed from: j */
        final android.graphics.Matrix f1240j;

        /* renamed from: k */
        int f1241k;

        /* renamed from: l */
        private int[] f1242l;

        /* renamed from: m */
        private java.lang.String f1243m;

        public C0408d() {
                r3 = this;
                r0 = 0
                r3.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.f1231a = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r3.f1232b = r1
                r1 = 0
                r3.f1233c = r1
                r3.f1234d = r1
                r3.f1235e = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r3.f1236f = r2
                r3.f1237g = r2
                r3.f1238h = r1
                r3.f1239i = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.f1240j = r1
                r3.f1243m = r0
                return
        }

        public C0408d(p000a.p046o.p047a.p048a.C0404i.C0408d r5, p000a.p013d.C0067a<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                r0 = 0
                r4.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r4.f1231a = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r4.f1232b = r1
                r1 = 0
                r4.f1233c = r1
                r4.f1234d = r1
                r4.f1235e = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r4.f1236f = r2
                r4.f1237g = r2
                r4.f1238h = r1
                r4.f1239i = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r4.f1240j = r1
                r4.f1243m = r0
                float r0 = r5.f1233c
                r4.f1233c = r0
                float r0 = r5.f1234d
                r4.f1234d = r0
                float r0 = r5.f1235e
                r4.f1235e = r0
                float r0 = r5.f1236f
                r4.f1236f = r0
                float r0 = r5.f1237g
                r4.f1237g = r0
                float r0 = r5.f1238h
                r4.f1238h = r0
                float r0 = r5.f1239i
                r4.f1239i = r0
                int[] r0 = r5.f1242l
                r4.f1242l = r0
                java.lang.String r0 = r5.f1243m
                r4.f1243m = r0
                int r0 = r5.f1241k
                r4.f1241k = r0
                java.lang.String r0 = r4.f1243m
                if (r0 == 0) goto L_0x005b
                r6.put(r0, r4)
            L_0x005b:
                android.graphics.Matrix r0 = r4.f1240j
                android.graphics.Matrix r1 = r5.f1240j
                r0.set(r1)
                java.util.ArrayList<a.o.a.a.i$e> r5 = r5.f1232b
                r0 = 0
            L_0x0065:
                int r1 = r5.size()
                if (r0 >= r1) goto L_0x00ae
                java.lang.Object r1 = r5.get(r0)
                boolean r2 = r1 instanceof p000a.p046o.p047a.p048a.C0404i.C0408d
                if (r2 == 0) goto L_0x0080
                a.o.a.a.i$d r1 = (p000a.p046o.p047a.p048a.C0404i.C0408d) r1
                java.util.ArrayList<a.o.a.a.i$e> r2 = r4.f1232b
                a.o.a.a.i$d r3 = new a.o.a.a.i$d
                r3.<init>(r1, r6)
                r2.add(r3)
                goto L_0x00a3
            L_0x0080:
                boolean r2 = r1 instanceof p000a.p046o.p047a.p048a.C0404i.C0407c
                if (r2 == 0) goto L_0x008c
                a.o.a.a.i$c r2 = new a.o.a.a.i$c
                a.o.a.a.i$c r1 = (p000a.p046o.p047a.p048a.C0404i.C0407c) r1
                r2.<init>(r1)
                goto L_0x0097
            L_0x008c:
                boolean r2 = r1 instanceof p000a.p046o.p047a.p048a.C0404i.C0406b
                if (r2 == 0) goto L_0x00a6
                a.o.a.a.i$b r2 = new a.o.a.a.i$b
                a.o.a.a.i$b r1 = (p000a.p046o.p047a.p048a.C0404i.C0406b) r1
                r2.<init>(r1)
            L_0x0097:
                java.util.ArrayList<a.o.a.a.i$e> r1 = r4.f1232b
                r1.add(r2)
                java.lang.String r1 = r2.f1245b
                if (r1 == 0) goto L_0x00a3
                r6.put(r1, r2)
            L_0x00a3:
                int r0 = r0 + 1
                goto L_0x0065
            L_0x00a6:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Unknown object in the tree!"
                r5.<init>(r6)
                throw r5
            L_0x00ae:
                return
        }

        /* renamed from: a */
        private void m2713a(android.content.res.TypedArray r4, org.xmlpull.v1.XmlPullParser r5) {
                r3 = this;
                r0 = 0
                r3.f1242l = r0
                float r0 = r3.f1233c
                java.lang.String r1 = "rotation"
                r2 = 5
                float r0 = p000a.p018g.p019d.p020c.C0140g.m3678a(r4, r5, r1, r2, r0)
                r3.f1233c = r0
                float r0 = r3.f1234d
                r1 = 1
                float r0 = r4.getFloat(r1, r0)
                r3.f1234d = r0
                float r0 = r3.f1235e
                r1 = 2
                float r0 = r4.getFloat(r1, r0)
                r3.f1235e = r0
                float r0 = r3.f1236f
                java.lang.String r1 = "scaleX"
                r2 = 3
                float r0 = p000a.p018g.p019d.p020c.C0140g.m3678a(r4, r5, r1, r2, r0)
                r3.f1236f = r0
                float r0 = r3.f1237g
                java.lang.String r1 = "scaleY"
                r2 = 4
                float r0 = p000a.p018g.p019d.p020c.C0140g.m3678a(r4, r5, r1, r2, r0)
                r3.f1237g = r0
                float r0 = r3.f1238h
                java.lang.String r1 = "translateX"
                r2 = 6
                float r0 = p000a.p018g.p019d.p020c.C0140g.m3678a(r4, r5, r1, r2, r0)
                r3.f1238h = r0
                float r0 = r3.f1239i
                java.lang.String r1 = "translateY"
                r2 = 7
                float r5 = p000a.p018g.p019d.p020c.C0140g.m3678a(r4, r5, r1, r2, r0)
                r3.f1239i = r5
                r5 = 0
                java.lang.String r4 = r4.getString(r5)
                if (r4 == 0) goto L_0x0055
                r3.f1243m = r4
            L_0x0055:
                r3.m2712b()
                return
        }

        /* renamed from: b */
        private void m2712b() {
                r4 = this;
                android.graphics.Matrix r0 = r4.f1240j
                r0.reset()
                android.graphics.Matrix r0 = r4.f1240j
                float r1 = r4.f1234d
                float r1 = -r1
                float r2 = r4.f1235e
                float r2 = -r2
                r0.postTranslate(r1, r2)
                android.graphics.Matrix r0 = r4.f1240j
                float r1 = r4.f1236f
                float r2 = r4.f1237g
                r0.postScale(r1, r2)
                android.graphics.Matrix r0 = r4.f1240j
                float r1 = r4.f1233c
                r2 = 0
                r0.postRotate(r1, r2, r2)
                android.graphics.Matrix r0 = r4.f1240j
                float r1 = r4.f1238h
                float r2 = r4.f1234d
                float r1 = r1 + r2
                float r2 = r4.f1239i
                float r3 = r4.f1235e
                float r2 = r2 + r3
                r0.postTranslate(r1, r2)
                return
        }

        /* renamed from: a */
        public void m2714a(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                int[] r0 = p000a.p046o.p047a.p048a.C0392a.f1182b
                android.content.res.TypedArray r2 = p000a.p018g.p019d.p020c.C0140g.m3681a(r2, r4, r3, r0)
                r1.m2713a(r2, r5)
                r2.recycle()
                return
        }

        @Override // p000a.p046o.p047a.p048a.C0404i.AbstractC0409e
        /* renamed from: a */
        public boolean mo2711a() {
                r3 = this;
                r0 = 0
                r1 = 0
            L_0x0002:
                java.util.ArrayList<a.o.a.a.i$e> r2 = r3.f1232b
                int r2 = r2.size()
                if (r1 >= r2) goto L_0x001d
                java.util.ArrayList<a.o.a.a.i$e> r2 = r3.f1232b
                java.lang.Object r2 = r2.get(r1)
                a.o.a.a.i$e r2 = (p000a.p046o.p047a.p048a.C0404i.AbstractC0409e) r2
                boolean r2 = r2.mo2711a()
                if (r2 == 0) goto L_0x001a
                r0 = 1
                return r0
            L_0x001a:
                int r1 = r1 + 1
                goto L_0x0002
            L_0x001d:
                return r0
        }

        @Override // p000a.p046o.p047a.p048a.C0404i.AbstractC0409e
        /* renamed from: a */
        public boolean mo2710a(int[] r4) {
                r3 = this;
                r0 = 0
                r1 = 0
            L_0x0002:
                java.util.ArrayList<a.o.a.a.i$e> r2 = r3.f1232b
                int r2 = r2.size()
                if (r0 >= r2) goto L_0x001a
                java.util.ArrayList<a.o.a.a.i$e> r2 = r3.f1232b
                java.lang.Object r2 = r2.get(r0)
                a.o.a.a.i$e r2 = (p000a.p046o.p047a.p048a.C0404i.AbstractC0409e) r2
                boolean r2 = r2.mo2710a(r4)
                r1 = r1 | r2
                int r0 = r0 + 1
                goto L_0x0002
            L_0x001a:
                return r1
        }

        public java.lang.String getGroupName() {
                r1 = this;
                java.lang.String r0 = r1.f1243m
                return r0
        }

        public android.graphics.Matrix getLocalMatrix() {
                r1 = this;
                android.graphics.Matrix r0 = r1.f1240j
                return r0
        }

        public float getPivotX() {
                r1 = this;
                float r0 = r1.f1234d
                return r0
        }

        public float getPivotY() {
                r1 = this;
                float r0 = r1.f1235e
                return r0
        }

        public float getRotation() {
                r1 = this;
                float r0 = r1.f1233c
                return r0
        }

        public float getScaleX() {
                r1 = this;
                float r0 = r1.f1236f
                return r0
        }

        public float getScaleY() {
                r1 = this;
                float r0 = r1.f1237g
                return r0
        }

        public float getTranslateX() {
                r1 = this;
                float r0 = r1.f1238h
                return r0
        }

        public float getTranslateY() {
                r1 = this;
                float r0 = r1.f1239i
                return r0
        }

        public void setPivotX(float r2) {
                r1 = this;
                float r0 = r1.f1234d
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x000b
                r1.f1234d = r2
                r1.m2712b()
            L_0x000b:
                return
        }

        public void setPivotY(float r2) {
                r1 = this;
                float r0 = r1.f1235e
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x000b
                r1.f1235e = r2
                r1.m2712b()
            L_0x000b:
                return
        }

        public void setRotation(float r2) {
                r1 = this;
                float r0 = r1.f1233c
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x000b
                r1.f1233c = r2
                r1.m2712b()
            L_0x000b:
                return
        }

        public void setScaleX(float r2) {
                r1 = this;
                float r0 = r1.f1236f
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x000b
                r1.f1236f = r2
                r1.m2712b()
            L_0x000b:
                return
        }

        public void setScaleY(float r2) {
                r1 = this;
                float r0 = r1.f1237g
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x000b
                r1.f1237g = r2
                r1.m2712b()
            L_0x000b:
                return
        }

        public void setTranslateX(float r2) {
                r1 = this;
                float r0 = r1.f1238h
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x000b
                r1.f1238h = r2
                r1.m2712b()
            L_0x000b:
                return
        }

        public void setTranslateY(float r2) {
                r1 = this;
                float r0 = r1.f1239i
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x000b
                r1.f1239i = r2
                r1.m2712b()
            L_0x000b:
                return
        }
    }

    /* renamed from: a.o.a.a.i$e */
    /* loaded from: classes.dex */
    private static abstract class AbstractC0409e {
        private AbstractC0409e() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AbstractC0409e(p000a.p046o.p047a.p048a.C0404i.C0405a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public boolean mo2711a() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: a */
        public boolean mo2710a(int[] r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* renamed from: a.o.a.a.i$f */
    /* loaded from: classes.dex */
    private static abstract class AbstractC0410f extends p000a.p046o.p047a.p048a.C0404i.AbstractC0409e {

        /* renamed from: a */
        protected p000a.p018g.p021e.C0142b.C0144b[] f1244a;

        /* renamed from: b */
        java.lang.String f1245b;

        /* renamed from: c */
        int f1246c;

        public AbstractC0410f() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f1244a = r0
                return
        }

        public AbstractC0410f(p000a.p046o.p047a.p048a.C0404i.AbstractC0410f r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f1244a = r0
                java.lang.String r0 = r2.f1245b
                r1.f1245b = r0
                int r0 = r2.f1246c
                r1.f1246c = r0
                a.g.e.b$b[] r2 = r2.f1244a
                a.g.e.b$b[] r2 = p000a.p018g.p021e.C0142b.m3662a(r2)
                r1.f1244a = r2
                return
        }

        /* renamed from: a */
        public void m2709a(android.graphics.Path r2) {
                r1 = this;
                r2.reset()
                a.g.e.b$b[] r0 = r1.f1244a
                if (r0 == 0) goto L_0x000a
                p000a.p018g.p021e.C0142b.C0144b.m3653a(r0, r2)
            L_0x000a:
                return
        }

        /* renamed from: b */
        public boolean mo2708b() {
                r1 = this;
                r0 = 0
                return r0
        }

        public p000a.p018g.p021e.C0142b.C0144b[] getPathData() {
                r1 = this;
                a.g.e.b$b[] r0 = r1.f1244a
                return r0
        }

        public java.lang.String getPathName() {
                r1 = this;
                java.lang.String r0 = r1.f1245b
                return r0
        }

        public void setPathData(p000a.p018g.p021e.C0142b.C0144b[] r2) {
                r1 = this;
                a.g.e.b$b[] r0 = r1.f1244a
                boolean r0 = p000a.p018g.p021e.C0142b.m3661a(r0, r2)
                if (r0 != 0) goto L_0x000f
                a.g.e.b$b[] r2 = p000a.p018g.p021e.C0142b.m3662a(r2)
                r1.f1244a = r2
                goto L_0x0014
            L_0x000f:
                a.g.e.b$b[] r0 = r1.f1244a
                p000a.p018g.p021e.C0142b.m3659b(r0, r2)
            L_0x0014:
                return
        }
    }

    /* renamed from: a.o.a.a.i$g */
    /* loaded from: classes.dex */
    private static class C0411g {

        /* renamed from: q */
        private static final android.graphics.Matrix f1247q = null;

        /* renamed from: a */
        private final android.graphics.Path f1248a;

        /* renamed from: b */
        private final android.graphics.Path f1249b;

        /* renamed from: c */
        private final android.graphics.Matrix f1250c;

        /* renamed from: d */
        android.graphics.Paint f1251d;

        /* renamed from: e */
        android.graphics.Paint f1252e;

        /* renamed from: f */
        private android.graphics.PathMeasure f1253f;

        /* renamed from: g */
        private int f1254g;

        /* renamed from: h */
        final p000a.p046o.p047a.p048a.C0404i.C0408d f1255h;

        /* renamed from: i */
        float f1256i;

        /* renamed from: j */
        float f1257j;

        /* renamed from: k */
        float f1258k;

        /* renamed from: l */
        float f1259l;

        /* renamed from: m */
        int f1260m;

        /* renamed from: n */
        java.lang.String f1261n;

        /* renamed from: o */
        java.lang.Boolean f1262o;

        /* renamed from: p */
        final p000a.p013d.C0067a<java.lang.String, java.lang.Object> f1263p;

        static {
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                p000a.p046o.p047a.p048a.C0404i.C0411g.f1247q = r0
                return
        }

        public C0411g() {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.f1250c = r0
                r0 = 0
                r1.f1256i = r0
                r1.f1257j = r0
                r1.f1258k = r0
                r1.f1259l = r0
                r0 = 255(0xff, float:3.57E-43)
                r1.f1260m = r0
                r0 = 0
                r1.f1261n = r0
                r1.f1262o = r0
                a.d.a r0 = new a.d.a
                r0.<init>()
                r1.f1263p = r0
                a.o.a.a.i$d r0 = new a.o.a.a.i$d
                r0.<init>()
                r1.f1255h = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.f1248a = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.f1249b = r0
                return
        }

        public C0411g(p000a.p046o.p047a.p048a.C0404i.C0411g r4) {
                r3 = this;
                r3.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r3.f1250c = r0
                r0 = 0
                r3.f1256i = r0
                r3.f1257j = r0
                r3.f1258k = r0
                r3.f1259l = r0
                r0 = 255(0xff, float:3.57E-43)
                r3.f1260m = r0
                r0 = 0
                r3.f1261n = r0
                r3.f1262o = r0
                a.d.a r0 = new a.d.a
                r0.<init>()
                r3.f1263p = r0
                a.o.a.a.i$d r0 = new a.o.a.a.i$d
                a.o.a.a.i$d r1 = r4.f1255h
                a.d.a<java.lang.String, java.lang.Object> r2 = r3.f1263p
                r0.<init>(r1, r2)
                r3.f1255h = r0
                android.graphics.Path r0 = new android.graphics.Path
                android.graphics.Path r1 = r4.f1248a
                r0.<init>(r1)
                r3.f1248a = r0
                android.graphics.Path r0 = new android.graphics.Path
                android.graphics.Path r1 = r4.f1249b
                r0.<init>(r1)
                r3.f1249b = r0
                float r0 = r4.f1256i
                r3.f1256i = r0
                float r0 = r4.f1257j
                r3.f1257j = r0
                float r0 = r4.f1258k
                r3.f1258k = r0
                float r0 = r4.f1259l
                r3.f1259l = r0
                int r0 = r4.f1254g
                r3.f1254g = r0
                int r0 = r4.f1260m
                r3.f1260m = r0
                java.lang.String r0 = r4.f1261n
                r3.f1261n = r0
                java.lang.String r0 = r4.f1261n
                if (r0 == 0) goto L_0x0065
                a.d.a<java.lang.String, java.lang.Object> r1 = r3.f1263p
                r1.put(r0, r3)
            L_0x0065:
                java.lang.Boolean r4 = r4.f1262o
                r3.f1262o = r4
                return
        }

        /* renamed from: a */
        private static float m2706a(float r0, float r1, float r2, float r3) {
                float r0 = r0 * r3
                float r1 = r1 * r2
                float r0 = r0 - r1
                return r0
        }

        /* renamed from: a */
        private float m2702a(android.graphics.Matrix r10) {
                r9 = this;
                r0 = 4
                float[] r0 = new float[r0]
                r0 = {x0040: FILL_ARRAY_DATA  , data: [0, 1065353216, 1065353216, 0} // fill-array
                r10.mapVectors(r0)
                r10 = 0
                r1 = r0[r10]
                double r1 = (double) r1
                r3 = 1
                r4 = r0[r3]
                double r4 = (double) r4
                double r1 = java.lang.Math.hypot(r1, r4)
                float r1 = (float) r1
                r2 = 2
                r4 = r0[r2]
                double r4 = (double) r4
                r6 = 3
                r7 = r0[r6]
                double r7 = (double) r7
                double r4 = java.lang.Math.hypot(r4, r7)
                float r4 = (float) r4
                r10 = r0[r10]
                r3 = r0[r3]
                r2 = r0[r2]
                r0 = r0[r6]
                float r10 = m2706a(r10, r3, r2, r0)
                float r0 = java.lang.Math.max(r1, r4)
                r1 = 0
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 <= 0) goto L_0x003e
                float r10 = java.lang.Math.abs(r10)
                float r1 = r10 / r0
            L_0x003e:
                return r1
        }

        /* renamed from: a */
        private void m2705a(p000a.p046o.p047a.p048a.C0404i.C0408d r8, p000a.p046o.p047a.p048a.C0404i.AbstractC0410f r9, android.graphics.Canvas r10, int r11, int r12, android.graphics.ColorFilter r13) {
                r7 = this;
                float r11 = (float) r11
                float r0 = r7.f1258k
                float r11 = r11 / r0
                float r12 = (float) r12
                float r0 = r7.f1259l
                float r12 = r12 / r0
                float r0 = java.lang.Math.min(r11, r12)
                android.graphics.Matrix r8 = r8.f1231a
                android.graphics.Matrix r1 = r7.f1250c
                r1.set(r8)
                android.graphics.Matrix r1 = r7.f1250c
                r1.postScale(r11, r12)
                float r8 = r7.m2702a(r8)
                r11 = 0
                int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r12 != 0) goto L_0x0022
                return
            L_0x0022:
                android.graphics.Path r12 = r7.f1248a
                r9.m2709a(r12)
                android.graphics.Path r12 = r7.f1248a
                android.graphics.Path r1 = r7.f1249b
                r1.reset()
                boolean r1 = r9.mo2708b()
                if (r1 == 0) goto L_0x0042
                android.graphics.Path r8 = r7.f1249b
                android.graphics.Matrix r9 = r7.f1250c
                r8.addPath(r12, r9)
                android.graphics.Path r8 = r7.f1249b
                r10.clipPath(r8)
                goto L_0x0169
            L_0x0042:
                a.o.a.a.i$c r9 = (p000a.p046o.p047a.p048a.C0404i.C0407c) r9
                float r1 = r9.f1225k
                r2 = 1065353216(0x3f800000, float:1.0)
                r3 = 1
                int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r1 != 0) goto L_0x0053
                float r1 = r9.f1226l
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 == 0) goto L_0x0094
            L_0x0053:
                float r1 = r9.f1225k
                float r4 = r9.f1227m
                float r1 = r1 + r4
                float r1 = r1 % r2
                float r5 = r9.f1226l
                float r5 = r5 + r4
                float r5 = r5 % r2
                android.graphics.PathMeasure r2 = r7.f1253f
                if (r2 != 0) goto L_0x0068
                android.graphics.PathMeasure r2 = new android.graphics.PathMeasure
                r2.<init>()
                r7.f1253f = r2
            L_0x0068:
                android.graphics.PathMeasure r2 = r7.f1253f
                android.graphics.Path r4 = r7.f1248a
                r6 = 0
                r2.setPath(r4, r6)
                android.graphics.PathMeasure r2 = r7.f1253f
                float r2 = r2.getLength()
                float r1 = r1 * r2
                float r5 = r5 * r2
                r12.reset()
                int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r4 <= 0) goto L_0x008c
                android.graphics.PathMeasure r4 = r7.f1253f
                r4.getSegment(r1, r2, r12, r3)
                android.graphics.PathMeasure r1 = r7.f1253f
                r1.getSegment(r11, r5, r12, r3)
                goto L_0x0091
            L_0x008c:
                android.graphics.PathMeasure r2 = r7.f1253f
                r2.getSegment(r1, r5, r12, r3)
            L_0x0091:
                r12.rLineTo(r11, r11)
            L_0x0094:
                android.graphics.Path r11 = r7.f1249b
                android.graphics.Matrix r1 = r7.f1250c
                r11.addPath(r12, r1)
                a.g.d.c.b r11 = r9.f1221g
                boolean r11 = r11.m3713e()
                r12 = 1132396544(0x437f0000, float:255.0)
                if (r11 == 0) goto L_0x00fc
                a.g.d.c.b r11 = r9.f1221g
                android.graphics.Paint r1 = r7.f1252e
                if (r1 != 0) goto L_0x00b9
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>(r3)
                r7.f1252e = r1
                android.graphics.Paint r1 = r7.f1252e
                android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
                r1.setStyle(r2)
            L_0x00b9:
                android.graphics.Paint r1 = r7.f1252e
                boolean r2 = r11.m3715c()
                if (r2 == 0) goto L_0x00d9
                android.graphics.Shader r11 = r11.m3718b()
                android.graphics.Matrix r2 = r7.f1250c
                r11.setLocalMatrix(r2)
                r1.setShader(r11)
                float r11 = r9.f1224j
                float r11 = r11 * r12
                int r11 = java.lang.Math.round(r11)
                r1.setAlpha(r11)
                goto L_0x00e6
            L_0x00d9:
                int r11 = r11.m3724a()
                float r2 = r9.f1224j
                int r11 = p000a.p046o.p047a.p048a.C0404i.m2728a(r11, r2)
                r1.setColor(r11)
            L_0x00e6:
                r1.setColorFilter(r13)
                android.graphics.Path r11 = r7.f1249b
                int r2 = r9.f1223i
                if (r2 != 0) goto L_0x00f2
                android.graphics.Path$FillType r2 = android.graphics.Path.FillType.WINDING
                goto L_0x00f4
            L_0x00f2:
                android.graphics.Path$FillType r2 = android.graphics.Path.FillType.EVEN_ODD
            L_0x00f4:
                r11.setFillType(r2)
                android.graphics.Path r11 = r7.f1249b
                r10.drawPath(r11, r1)
            L_0x00fc:
                a.g.d.c.b r11 = r9.f1219e
                boolean r11 = r11.m3713e()
                if (r11 == 0) goto L_0x0169
                a.g.d.c.b r11 = r9.f1219e
                android.graphics.Paint r1 = r7.f1251d
                if (r1 != 0) goto L_0x0118
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>(r3)
                r7.f1251d = r1
                android.graphics.Paint r1 = r7.f1251d
                android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
                r1.setStyle(r2)
            L_0x0118:
                android.graphics.Paint r1 = r7.f1251d
                android.graphics.Paint$Join r2 = r9.f1229o
                if (r2 == 0) goto L_0x0121
                r1.setStrokeJoin(r2)
            L_0x0121:
                android.graphics.Paint$Cap r2 = r9.f1228n
                if (r2 == 0) goto L_0x0128
                r1.setStrokeCap(r2)
            L_0x0128:
                float r2 = r9.f1230p
                r1.setStrokeMiter(r2)
                boolean r2 = r11.m3715c()
                if (r2 == 0) goto L_0x014b
                android.graphics.Shader r11 = r11.m3718b()
                android.graphics.Matrix r2 = r7.f1250c
                r11.setLocalMatrix(r2)
                r1.setShader(r11)
                float r11 = r9.f1222h
                float r11 = r11 * r12
                int r11 = java.lang.Math.round(r11)
                r1.setAlpha(r11)
                goto L_0x0158
            L_0x014b:
                int r11 = r11.m3724a()
                float r12 = r9.f1222h
                int r11 = p000a.p046o.p047a.p048a.C0404i.m2728a(r11, r12)
                r1.setColor(r11)
            L_0x0158:
                r1.setColorFilter(r13)
                float r0 = r0 * r8
                float r8 = r9.f1220f
                float r8 = r8 * r0
                r1.setStrokeWidth(r8)
                android.graphics.Path r8 = r7.f1249b
                r10.drawPath(r8, r1)
            L_0x0169:
                return
        }

        /* renamed from: a */
        private void m2704a(p000a.p046o.p047a.p048a.C0404i.C0408d r10, android.graphics.Matrix r11, android.graphics.Canvas r12, int r13, int r14, android.graphics.ColorFilter r15) {
                r9 = this;
                android.graphics.Matrix r0 = r10.f1231a
                r0.set(r11)
                android.graphics.Matrix r11 = r10.f1231a
                android.graphics.Matrix r0 = r10.f1240j
                r11.preConcat(r0)
                r12.save()
                r11 = 0
            L_0x0010:
                java.util.ArrayList<a.o.a.a.i$e> r0 = r10.f1232b
                int r0 = r0.size()
                if (r11 >= r0) goto L_0x0045
                java.util.ArrayList<a.o.a.a.i$e> r0 = r10.f1232b
                java.lang.Object r0 = r0.get(r11)
                a.o.a.a.i$e r0 = (p000a.p046o.p047a.p048a.C0404i.AbstractC0409e) r0
                boolean r1 = r0 instanceof p000a.p046o.p047a.p048a.C0404i.C0408d
                if (r1 == 0) goto L_0x0032
                r3 = r0
                a.o.a.a.i$d r3 = (p000a.p046o.p047a.p048a.C0404i.C0408d) r3
                android.graphics.Matrix r4 = r10.f1231a
                r2 = r9
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r2.m2704a(r3, r4, r5, r6, r7, r8)
                goto L_0x0042
            L_0x0032:
                boolean r1 = r0 instanceof p000a.p046o.p047a.p048a.C0404i.AbstractC0410f
                if (r1 == 0) goto L_0x0042
                r4 = r0
                a.o.a.a.i$f r4 = (p000a.p046o.p047a.p048a.C0404i.AbstractC0410f) r4
                r2 = r9
                r3 = r10
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r2.m2705a(r3, r4, r5, r6, r7, r8)
            L_0x0042:
                int r11 = r11 + 1
                goto L_0x0010
            L_0x0045:
                r12.restore()
                return
        }

        /* renamed from: a */
        public void m2703a(android.graphics.Canvas r8, int r9, int r10, android.graphics.ColorFilter r11) {
                r7 = this;
                a.o.a.a.i$d r1 = r7.f1255h
                android.graphics.Matrix r2 = p000a.p046o.p047a.p048a.C0404i.C0411g.f1247q
                r0 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r6 = r11
                r0.m2704a(r1, r2, r3, r4, r5, r6)
                return
        }

        /* renamed from: a */
        public boolean m2707a() {
                r1 = this;
                java.lang.Boolean r0 = r1.f1262o
                if (r0 != 0) goto L_0x0010
                a.o.a.a.i$d r0 = r1.f1255h
                boolean r0 = r0.mo2711a()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.f1262o = r0
            L_0x0010:
                java.lang.Boolean r0 = r1.f1262o
                boolean r0 = r0.booleanValue()
                return r0
        }

        /* renamed from: a */
        public boolean m2701a(int[] r2) {
                r1 = this;
                a.o.a.a.i$d r0 = r1.f1255h
                boolean r2 = r0.mo2710a(r2)
                return r2
        }

        public float getAlpha() {
                r2 = this;
                int r0 = r2.getRootAlpha()
                float r0 = (float) r0
                r1 = 1132396544(0x437f0000, float:255.0)
                float r0 = r0 / r1
                return r0
        }

        public int getRootAlpha() {
                r1 = this;
                int r0 = r1.f1260m
                return r0
        }

        public void setAlpha(float r2) {
                r1 = this;
                r0 = 1132396544(0x437f0000, float:255.0)
                float r2 = r2 * r0
                int r2 = (int) r2
                r1.setRootAlpha(r2)
                return
        }

        public void setRootAlpha(int r1) {
                r0 = this;
                r0.f1260m = r1
                return
        }
    }

    /* renamed from: a.o.a.a.i$h */
    /* loaded from: classes.dex */
    private static class C0412h extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: a */
        int f1264a;

        /* renamed from: b */
        p000a.p046o.p047a.p048a.C0404i.C0411g f1265b;

        /* renamed from: c */
        android.content.res.ColorStateList f1266c;

        /* renamed from: d */
        android.graphics.PorterDuff.Mode f1267d;

        /* renamed from: e */
        boolean f1268e;

        /* renamed from: f */
        android.graphics.Bitmap f1269f;

        /* renamed from: g */
        android.content.res.ColorStateList f1270g;

        /* renamed from: h */
        android.graphics.PorterDuff.Mode f1271h;

        /* renamed from: i */
        int f1272i;

        /* renamed from: j */
        boolean f1273j;

        /* renamed from: k */
        boolean f1274k;

        /* renamed from: l */
        android.graphics.Paint f1275l;

        public C0412h() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f1266c = r0
                android.graphics.PorterDuff$Mode r0 = p000a.p046o.p047a.p048a.C0404i.f1209k
                r1.f1267d = r0
                a.o.a.a.i$g r0 = new a.o.a.a.i$g
                r0.<init>()
                r1.f1265b = r0
                return
        }

        public C0412h(p000a.p046o.p047a.p048a.C0404i.C0412h r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f1266c = r0
                android.graphics.PorterDuff$Mode r0 = p000a.p046o.p047a.p048a.C0404i.f1209k
                r3.f1267d = r0
                if (r4 == 0) goto L_0x0043
                int r0 = r4.f1264a
                r3.f1264a = r0
                a.o.a.a.i$g r0 = new a.o.a.a.i$g
                a.o.a.a.i$g r1 = r4.f1265b
                r0.<init>(r1)
                r3.f1265b = r0
                a.o.a.a.i$g r0 = r4.f1265b
                android.graphics.Paint r0 = r0.f1252e
                if (r0 == 0) goto L_0x0028
                a.o.a.a.i$g r1 = r3.f1265b
                android.graphics.Paint r2 = new android.graphics.Paint
                r2.<init>(r0)
                r1.f1252e = r2
            L_0x0028:
                a.o.a.a.i$g r0 = r4.f1265b
                android.graphics.Paint r0 = r0.f1251d
                if (r0 == 0) goto L_0x0037
                a.o.a.a.i$g r1 = r3.f1265b
                android.graphics.Paint r2 = new android.graphics.Paint
                r2.<init>(r0)
                r1.f1251d = r2
            L_0x0037:
                android.content.res.ColorStateList r0 = r4.f1266c
                r3.f1266c = r0
                android.graphics.PorterDuff$Mode r0 = r4.f1267d
                r3.f1267d = r0
                boolean r4 = r4.f1268e
                r3.f1268e = r4
            L_0x0043:
                return
        }

        /* renamed from: a */
        public android.graphics.Paint m2697a(android.graphics.ColorFilter r3) {
                r2 = this;
                boolean r0 = r2.m2695b()
                if (r0 != 0) goto L_0x000a
                if (r3 != 0) goto L_0x000a
                r3 = 0
                return r3
            L_0x000a:
                android.graphics.Paint r0 = r2.f1275l
                if (r0 != 0) goto L_0x001b
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r2.f1275l = r0
                android.graphics.Paint r0 = r2.f1275l
                r1 = 1
                r0.setFilterBitmap(r1)
            L_0x001b:
                android.graphics.Paint r0 = r2.f1275l
                a.o.a.a.i$g r1 = r2.f1265b
                int r1 = r1.getRootAlpha()
                r0.setAlpha(r1)
                android.graphics.Paint r0 = r2.f1275l
                r0.setColorFilter(r3)
                android.graphics.Paint r3 = r2.f1275l
                return r3
        }

        /* renamed from: a */
        public void m2698a(android.graphics.Canvas r3, android.graphics.ColorFilter r4, android.graphics.Rect r5) {
                r2 = this;
                android.graphics.Paint r4 = r2.m2697a(r4)
                android.graphics.Bitmap r0 = r2.f1269f
                r1 = 0
                r3.drawBitmap(r0, r1, r5, r4)
                return
        }

        /* renamed from: a */
        public boolean m2700a() {
                r2 = this;
                boolean r0 = r2.f1274k
                if (r0 != 0) goto L_0x0022
                android.content.res.ColorStateList r0 = r2.f1270g
                android.content.res.ColorStateList r1 = r2.f1266c
                if (r0 != r1) goto L_0x0022
                android.graphics.PorterDuff$Mode r0 = r2.f1271h
                android.graphics.PorterDuff$Mode r1 = r2.f1267d
                if (r0 != r1) goto L_0x0022
                boolean r0 = r2.f1273j
                boolean r1 = r2.f1268e
                if (r0 != r1) goto L_0x0022
                int r0 = r2.f1272i
                a.o.a.a.i$g r1 = r2.f1265b
                int r1 = r1.getRootAlpha()
                if (r0 != r1) goto L_0x0022
                r0 = 1
                return r0
            L_0x0022:
                r0 = 0
                return r0
        }

        /* renamed from: a */
        public boolean m2699a(int r2, int r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.f1269f
                int r0 = r0.getWidth()
                if (r2 != r0) goto L_0x0012
                android.graphics.Bitmap r2 = r1.f1269f
                int r2 = r2.getHeight()
                if (r3 != r2) goto L_0x0012
                r2 = 1
                return r2
            L_0x0012:
                r2 = 0
                return r2
        }

        /* renamed from: a */
        public boolean m2696a(int[] r2) {
                r1 = this;
                a.o.a.a.i$g r0 = r1.f1265b
                boolean r2 = r0.m2701a(r2)
                boolean r0 = r1.f1274k
                r0 = r0 | r2
                r1.f1274k = r0
                return r2
        }

        /* renamed from: b */
        public void m2694b(int r2, int r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.f1269f
                if (r0 == 0) goto L_0x000a
                boolean r0 = r1.m2699a(r2, r3)
                if (r0 != 0) goto L_0x0015
            L_0x000a:
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
                r1.f1269f = r2
                r2 = 1
                r1.f1274k = r2
            L_0x0015:
                return
        }

        /* renamed from: b */
        public boolean m2695b() {
                r2 = this;
                a.o.a.a.i$g r0 = r2.f1265b
                int r0 = r0.getRootAlpha()
                r1 = 255(0xff, float:3.57E-43)
                if (r0 >= r1) goto L_0x000c
                r0 = 1
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                return r0
        }

        /* renamed from: c */
        public void m2692c(int r4, int r5) {
                r3 = this;
                android.graphics.Bitmap r0 = r3.f1269f
                r1 = 0
                r0.eraseColor(r1)
                android.graphics.Canvas r0 = new android.graphics.Canvas
                android.graphics.Bitmap r1 = r3.f1269f
                r0.<init>(r1)
                a.o.a.a.i$g r1 = r3.f1265b
                r2 = 0
                r1.m2703a(r0, r4, r5, r2)
                return
        }

        /* renamed from: c */
        public boolean m2693c() {
                r1 = this;
                a.o.a.a.i$g r0 = r1.f1265b
                boolean r0 = r0.m2707a()
                return r0
        }

        /* renamed from: d */
        public void m2691d() {
                r1 = this;
                android.content.res.ColorStateList r0 = r1.f1266c
                r1.f1270g = r0
                android.graphics.PorterDuff$Mode r0 = r1.f1267d
                r1.f1271h = r0
                a.o.a.a.i$g r0 = r1.f1265b
                int r0 = r0.getRootAlpha()
                r1.f1272i = r0
                boolean r0 = r1.f1268e
                r1.f1273j = r0
                r0 = 0
                r1.f1274k = r0
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.f1264a
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                a.o.a.a.i r0 = new a.o.a.a.i
                r0.<init>(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
                r0 = this;
                a.o.a.a.i r1 = new a.o.a.a.i
                r1.<init>(r0)
                return r1
        }
    }

    /* renamed from: a.o.a.a.i$i */
    /* loaded from: classes.dex */
    private static class C0413i extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: a */
        private final android.graphics.drawable.Drawable.ConstantState f1276a;

        public C0413i(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.f1276a = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f1276a
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f1276a
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                a.o.a.a.i r0 = new a.o.a.a.i
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f1276a
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
                r0.f1208b = r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                a.o.a.a.i r0 = new a.o.a.a.i
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f1276a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
                android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
                r0.f1208b = r3
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                a.o.a.a.i r0 = new a.o.a.a.i
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f1276a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3, r4)
                android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
                r0.f1208b = r3
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            p000a.p046o.p047a.p048a.C0404i.f1209k = r0
            return
    }

    C0404i() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1214g = r0
            r0 = 9
            float[] r0 = new float[r0]
            r1.f1215h = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f1216i = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f1217j = r0
            a.o.a.a.i$h r0 = new a.o.a.a.i$h
            r0.<init>()
            r1.f1210c = r0
            return
    }

    C0404i(p000a.p046o.p047a.p048a.C0404i.C0412h r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f1214g = r0
            r0 = 9
            float[] r0 = new float[r0]
            r2.f1215h = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f1216i = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f1217j = r0
            r2.f1210c = r3
            android.graphics.PorterDuffColorFilter r0 = r2.f1211d
            android.content.res.ColorStateList r1 = r3.f1266c
            android.graphics.PorterDuff$Mode r3 = r3.f1267d
            android.graphics.PorterDuffColorFilter r3 = r2.m2723a(r0, r1, r3)
            r2.f1211d = r3
            return
    }

    /* renamed from: a */
    static int m2728a(int r2, float r3) {
            int r0 = android.graphics.Color.alpha(r2)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            int r3 = r3 << 24
            r2 = r2 | r3
            return r2
    }

    /* renamed from: a */
    public static p000a.p046o.p047a.p048a.C0404i m2726a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            a.o.a.a.i r0 = new a.o.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = p000a.p018g.p019d.p020c.C0136f.m3684a(r6, r7, r8)
            r0.f1208b = r6
            a.o.a.a.i$i r6 = new a.o.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f1208b
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch: IOException -> 0x0043, XmlPullParserException -> 0x0045
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch: IOException -> 0x0043, XmlPullParserException -> 0x0045
        L_0x0029:
            int r3 = r7.next()     // Catch: IOException -> 0x0043, XmlPullParserException -> 0x0045
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            a.o.a.a.i r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch: IOException -> 0x0043, XmlPullParserException -> 0x0045
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch: IOException -> 0x0043, XmlPullParserException -> 0x0045
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch: IOException -> 0x0043, XmlPullParserException -> 0x0045
            throw r6     // Catch: IOException -> 0x0043, XmlPullParserException -> 0x0045
        L_0x0043:
            r6 = move-exception
            goto L_0x0046
        L_0x0045:
            r6 = move-exception
        L_0x0046:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
    }

    /* renamed from: a */
    private static android.graphics.PorterDuff.Mode m2727a(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L_0x001d
            r0 = 5
            if (r1 == r0) goto L_0x001a
            r0 = 9
            if (r1 == r0) goto L_0x0017
            switch(r1) {
                case 14: goto L_0x0014;
                case 15: goto L_0x0011;
                case 16: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r2
        L_0x000e:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L_0x0011:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L_0x0014:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L_0x0017:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L_0x001a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L_0x001d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }

    /* renamed from: a */
    private void m2725a(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) {
            r10 = this;
            a.o.a.a.i$h r0 = r10.f1210c
            a.o.a.a.i$g r1 = r0.f1265b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            a.o.a.a.i$d r3 = r1.f1255h
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = 1
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            a.o.a.a.i$d r7 = (p000a.p046o.p047a.p048a.C0404i.C0408d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            a.o.a.a.i$c r3 = new a.o.a.a.i$c
            r3.<init>()
            r3.m2716a(r11, r13, r14, r12)
            java.util.ArrayList<a.o.a.a.i$e> r6 = r7.f1232b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            a.d.a<java.lang.String, java.lang.Object> r6 = r1.f1263p
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            a.o.a.a.i$b r3 = new a.o.a.a.i$b
            r3.<init>()
            r3.m2720a(r11, r13, r14, r12)
            java.util.ArrayList<a.o.a.a.i$e> r7 = r7.f1232b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            a.d.a<java.lang.String, java.lang.Object> r7 = r1.f1263p
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.f1264a
            int r3 = r3.f1246c
        L_0x0081:
            r3 = r3 | r7
            r0.f1264a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            a.o.a.a.i$d r3 = new a.o.a.a.i$d
            r3.<init>()
            r3.m2714a(r11, r13, r14, r12)
            java.util.ArrayList<a.o.a.a.i$e> r7 = r7.f1232b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            a.d.a<java.lang.String, java.lang.Object> r7 = r1.f1263p
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.f1264a
            int r3 = r3.f1241k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            goto L_0x00d0
        L_0x00cf:
            throw r11
        L_0x00d0:
            goto L_0x00cf
    }

    /* renamed from: a */
    private void m2724a(android.content.res.TypedArray r6, org.xmlpull.v1.XmlPullParser r7) {
            r5 = this;
            a.o.a.a.i$h r0 = r5.f1210c
            a.o.a.a.i$g r1 = r0.f1265b
            java.lang.String r2 = "tintMode"
            r3 = 6
            r4 = -1
            int r2 = p000a.p018g.p019d.p020c.C0140g.m3673b(r6, r7, r2, r3, r4)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r2 = m2727a(r2, r3)
            r0.f1267d = r2
            r2 = 1
            android.content.res.ColorStateList r2 = r6.getColorStateList(r2)
            if (r2 == 0) goto L_0x001d
            r0.f1266c = r2
        L_0x001d:
            r2 = 5
            boolean r3 = r0.f1268e
            java.lang.String r4 = "autoMirrored"
            boolean r2 = p000a.p018g.p019d.p020c.C0140g.m3676a(r6, r7, r4, r2, r3)
            r0.f1268e = r2
            r0 = 7
            float r2 = r1.f1258k
            java.lang.String r3 = "viewportWidth"
            float r0 = p000a.p018g.p019d.p020c.C0140g.m3678a(r6, r7, r3, r0, r2)
            r1.f1258k = r0
            r0 = 8
            float r2 = r1.f1259l
            java.lang.String r3 = "viewportHeight"
            float r0 = p000a.p018g.p019d.p020c.C0140g.m3678a(r6, r7, r3, r0, r2)
            r1.f1259l = r0
            float r0 = r1.f1258k
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            float r0 = r1.f1259l
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bd
            r0 = 3
            float r3 = r1.f1256i
            float r0 = r6.getDimension(r0, r3)
            r1.f1256i = r0
            r0 = 2
            float r3 = r1.f1257j
            float r0 = r6.getDimension(r0, r3)
            r1.f1257j = r0
            float r0 = r1.f1256i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a2
            float r0 = r1.f1257j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r0 = 4
            float r2 = r1.getAlpha()
            java.lang.String r3 = "alpha"
            float r7 = p000a.p018g.p019d.p020c.C0140g.m3678a(r6, r7, r3, r0, r2)
            r1.setAlpha(r7)
            r7 = 0
            java.lang.String r6 = r6.getString(r7)
            if (r6 == 0) goto L_0x0086
            r1.f1261n = r6
            a.d.a<java.lang.String, java.lang.Object> r7 = r1.f1263p
            r7.put(r6, r1)
        L_0x0086:
            return
        L_0x0087:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            r0.append(r6)
            java.lang.String r6 = "<vector> tag requires height > 0"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x00a2:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            r0.append(r6)
            java.lang.String r6 = "<vector> tag requires width > 0"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x00bd:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            r0.append(r6)
            java.lang.String r6 = "<vector> tag requires viewportHeight > 0"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x00d8:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            r0.append(r6)
            java.lang.String r6 = "<vector> tag requires viewportWidth > 0"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
    }

    /* renamed from: a */
    private boolean m2729a() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 17
            if (r0 < r2) goto L_0x0015
            boolean r0 = r3.isAutoMirrored()
            r2 = 1
            if (r0 == 0) goto L_0x0015
            int r0 = androidx.core.graphics.drawable.C0698a.m1594e(r3)
            if (r0 != r2) goto L_0x0015
            r1 = 1
        L_0x0015:
            return r1
    }

    public static p000a.p046o.p047a.p048a.C0404i createFromXmlInner(android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) {
            a.o.a.a.i r0 = new a.o.a.a.i
            r0.<init>()
            r0.inflate(r1, r2, r3, r4)
            return r0
    }

    /* renamed from: a */
    android.graphics.PorterDuffColorFilter m2723a(android.graphics.PorterDuffColorFilter r2, android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r1 = this;
            if (r3 == 0) goto L_0x0014
            if (r4 != 0) goto L_0x0005
            goto L_0x0014
        L_0x0005:
            int[] r2 = r1.getState()
            r0 = 0
            int r2 = r3.getColorForState(r2, r0)
            android.graphics.PorterDuffColorFilter r3 = new android.graphics.PorterDuffColorFilter
            r3.<init>(r2, r4)
            return r3
        L_0x0014:
            r2 = 0
            return r2
    }

    /* renamed from: a */
    java.lang.Object m2722a(java.lang.String r2) {
            r1 = this;
            a.o.a.a.i$h r0 = r1.f1210c
            a.o.a.a.i$g r0 = r0.f1265b
            a.d.a<java.lang.String, java.lang.Object> r0 = r0.f1263p
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    /* renamed from: a */
    void m2721a(boolean r1) {
            r0 = this;
            r0.f1214g = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0007
            androidx.core.graphics.drawable.C0698a.m1607a(r0)
        L_0x0007:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r10) {
            r9 = this;
            android.graphics.drawable.Drawable r0 = r9.f1208b
            if (r0 == 0) goto L_0x0008
            r0.draw(r10)
            return
        L_0x0008:
            android.graphics.Rect r0 = r9.f1217j
            r9.copyBounds(r0)
            android.graphics.Rect r0 = r9.f1217j
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x00db
            android.graphics.Rect r0 = r9.f1217j
            int r0 = r0.height()
            if (r0 > 0) goto L_0x001f
            goto L_0x00db
        L_0x001f:
            android.graphics.ColorFilter r0 = r9.f1212e
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r0 = r9.f1211d
        L_0x0025:
            android.graphics.Matrix r1 = r9.f1216i
            r10.getMatrix(r1)
            android.graphics.Matrix r1 = r9.f1216i
            float[] r2 = r9.f1215h
            r1.getValues(r2)
            float[] r1 = r9.f1215h
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r9.f1215h
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r9.f1215h
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r5 = r9.f1215h
            r6 = 3
            r5 = r5[r6]
            float r5 = java.lang.Math.abs(r5)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0060
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0064
        L_0x0060:
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0064:
            android.graphics.Rect r4 = r9.f1217j
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r9.f1217j
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x00db
            if (r3 > 0) goto L_0x0087
            goto L_0x00db
        L_0x0087:
            int r4 = r10.save()
            android.graphics.Rect r5 = r9.f1217j
            int r8 = r5.left
            float r8 = (float) r8
            int r5 = r5.top
            float r5 = (float) r5
            r10.translate(r8, r5)
            boolean r5 = r9.m2729a()
            if (r5 == 0) goto L_0x00ab
            android.graphics.Rect r5 = r9.f1217j
            int r5 = r5.width()
            float r5 = (float) r5
            r10.translate(r5, r7)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.scale(r5, r6)
        L_0x00ab:
            android.graphics.Rect r5 = r9.f1217j
            r5.offsetTo(r2, r2)
            a.o.a.a.i$h r2 = r9.f1210c
            r2.m2694b(r1, r3)
            boolean r2 = r9.f1214g
            if (r2 != 0) goto L_0x00bf
            a.o.a.a.i$h r2 = r9.f1210c
            r2.m2692c(r1, r3)
            goto L_0x00d1
        L_0x00bf:
            a.o.a.a.i$h r2 = r9.f1210c
            boolean r2 = r2.m2700a()
            if (r2 != 0) goto L_0x00d1
            a.o.a.a.i$h r2 = r9.f1210c
            r2.m2692c(r1, r3)
            a.o.a.a.i$h r1 = r9.f1210c
            r1.m2691d()
        L_0x00d1:
            a.o.a.a.i$h r1 = r9.f1210c
            android.graphics.Rect r2 = r9.f1217j
            r1.m2698a(r10, r0, r2)
            r10.restoreToCount(r4)
        L_0x00db:
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
            a.o.a.a.i$h r0 = r1.f1210c
            a.o.a.a.i$g r0 = r0.f1265b
            int r0 = r0.getRootAlpha()
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
            a.o.a.a.i$h r1 = r2.f1210c
            int r1 = r1.getChangingConfigurations()
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
            a.o.a.a.i$i r1 = new a.o.a.a.i$i
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            r1.<init>(r0)
            return r1
        L_0x0014:
            a.o.a.a.i$h r0 = r3.f1210c
            int r1 = r3.getChangingConfigurations()
            r0.f1264a = r1
            a.o.a.a.i$h r0 = r3.f1210c
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
            a.o.a.a.i$h r0 = r1.f1210c
            a.o.a.a.i$g r0 = r0.f1265b
            float r0 = r0.f1257j
            int r0 = (int) r0
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
            a.o.a.a.i$h r0 = r1.f1210c
            a.o.a.a.i$g r0 = r0.f1265b
            float r0 = r0.f1256i
            int r0 = (int) r0
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
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.inflate(r2, r3, r4)
            return
        L_0x0008:
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r3, org.xmlpull.v1.XmlPullParser r4, android.util.AttributeSet r5, android.content.res.Resources.Theme r6) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1208b
            if (r0 == 0) goto L_0x0008
            androidx.core.graphics.drawable.C0698a.m1601a(r0, r3, r4, r5, r6)
            return
        L_0x0008:
            a.o.a.a.i$h r0 = r2.f1210c
            a.o.a.a.i$g r1 = new a.o.a.a.i$g
            r1.<init>()
            r0.f1265b = r1
            int[] r1 = p000a.p046o.p047a.p048a.C0392a.f1181a
            android.content.res.TypedArray r1 = p000a.p018g.p019d.p020c.C0140g.m3681a(r3, r6, r5, r1)
            r2.m2724a(r1, r4)
            r1.recycle()
            int r1 = r2.getChangingConfigurations()
            r0.f1264a = r1
            r1 = 1
            r0.f1274k = r1
            r2.m2725a(r3, r4, r5, r6)
            android.graphics.PorterDuffColorFilter r3 = r2.f1211d
            android.content.res.ColorStateList r4 = r0.f1266c
            android.graphics.PorterDuff$Mode r5 = r0.f1267d
            android.graphics.PorterDuffColorFilter r3 = r2.m2723a(r3, r4, r5)
            r2.f1211d = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.invalidateSelf()
            return
        L_0x0008:
            super.invalidateSelf()
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
            a.o.a.a.i$h r0 = r1.f1210c
            boolean r0 = r0.f1268e
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
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            a.o.a.a.i$h r0 = r1.f1210c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.m2693c()
            if (r0 != 0) goto L_0x0028
            a.o.a.a.i$h r0 = r1.f1210c
            android.content.res.ColorStateList r0 = r0.f1266c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1208b
            if (r0 == 0) goto L_0x0008
            r0.mutate()
            return r2
        L_0x0008:
            boolean r0 = r2.f1213f
            if (r0 != 0) goto L_0x001e
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L_0x001e
            a.o.a.a.i$h r0 = new a.o.a.a.i$h
            a.o.a.a.i$h r1 = r2.f1210c
            r0.<init>(r1)
            r2.f1210c = r0
            r0 = 1
            r2.f1213f = r0
        L_0x001e:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0007
            r0.setBounds(r2)
        L_0x0007:
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f1208b
            if (r0 == 0) goto L_0x0009
            boolean r6 = r0.setState(r6)
            return r6
        L_0x0009:
            r0 = 0
            a.o.a.a.i$h r1 = r5.f1210c
            android.content.res.ColorStateList r2 = r1.f1266c
            r3 = 1
            if (r2 == 0) goto L_0x0021
            android.graphics.PorterDuff$Mode r4 = r1.f1267d
            if (r4 == 0) goto L_0x0021
            android.graphics.PorterDuffColorFilter r0 = r5.f1211d
            android.graphics.PorterDuffColorFilter r0 = r5.m2723a(r0, r2, r4)
            r5.f1211d = r0
            r5.invalidateSelf()
            r0 = 1
        L_0x0021:
            boolean r2 = r1.m2693c()
            if (r2 == 0) goto L_0x0031
            boolean r6 = r1.m2696a(r6)
            if (r6 == 0) goto L_0x0031
            r5.invalidateSelf()
            r0 = 1
        L_0x0031:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(java.lang.Runnable r2, long r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.scheduleSelf(r2, r3)
            return
        L_0x0008:
            super.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.setAlpha(r2)
            return
        L_0x0008:
            a.o.a.a.i$h r0 = r1.f1210c
            a.o.a.a.i$g r0 = r0.f1265b
            int r0 = r0.getRootAlpha()
            if (r0 == r2) goto L_0x001c
            a.o.a.a.i$h r0 = r1.f1210c
            a.o.a.a.i$g r0 = r0.f1265b
            r0.setRootAlpha(r2)
            r1.invalidateSelf()
        L_0x001c:
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
            a.o.a.a.i$h r0 = r1.f1210c
            r0.f1268e = r2
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
            r1.f1212e = r2
            r1.invalidateSelf()
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
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1208b
            if (r0 == 0) goto L_0x0008
            androidx.core.graphics.drawable.C0698a.m1603a(r0, r3)
            return
        L_0x0008:
            a.o.a.a.i$h r0 = r2.f1210c
            android.content.res.ColorStateList r1 = r0.f1266c
            if (r1 == r3) goto L_0x001d
            r0.f1266c = r3
            android.graphics.PorterDuffColorFilter r1 = r2.f1211d
            android.graphics.PorterDuff$Mode r0 = r0.f1267d
            android.graphics.PorterDuffColorFilter r3 = r2.m2723a(r1, r3, r0)
            r2.f1211d = r3
            r2.invalidateSelf()
        L_0x001d:
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1208b
            if (r0 == 0) goto L_0x0008
            androidx.core.graphics.drawable.C0698a.m1600a(r0, r3)
            return
        L_0x0008:
            a.o.a.a.i$h r0 = r2.f1210c
            android.graphics.PorterDuff$Mode r1 = r0.f1267d
            if (r1 == r3) goto L_0x001d
            r0.f1267d = r3
            android.graphics.PorterDuffColorFilter r1 = r2.f1211d
            android.content.res.ColorStateList r0 = r0.f1266c
            android.graphics.PorterDuffColorFilter r3 = r2.m2723a(r1, r0, r3)
            r2.f1211d = r3
            r2.invalidateSelf()
        L_0x001d:
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
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(java.lang.Runnable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1208b
            if (r0 == 0) goto L_0x0008
            r0.unscheduleSelf(r2)
            return
        L_0x0008:
            super.unscheduleSelf(r2)
            return
    }
}
