package p000a.p046o.p047a.p048a;

/* renamed from: a.o.a.a.e */
/* loaded from: classes.dex */
public class C0399e {

    /* renamed from: a.o.a.a.e$a */
    /* loaded from: classes.dex */
    private static class C0400a implements android.animation.TypeEvaluator<p000a.p018g.p021e.C0142b.C0144b[]> {

        /* renamed from: a */
        private p000a.p018g.p021e.C0142b.C0144b[] f1204a;

        C0400a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public p000a.p018g.p021e.C0142b.C0144b[] m2735a(float r5, p000a.p018g.p021e.C0142b.C0144b[] r6, p000a.p018g.p021e.C0142b.C0144b[] r7) {
                r4 = this;
                boolean r0 = p000a.p018g.p021e.C0142b.m3661a(r6, r7)
                if (r0 == 0) goto L_0x002b
                a.g.e.b$b[] r0 = r4.f1204a
                if (r0 == 0) goto L_0x0010
                boolean r0 = p000a.p018g.p021e.C0142b.m3661a(r0, r6)
                if (r0 != 0) goto L_0x0016
            L_0x0010:
                a.g.e.b$b[] r0 = p000a.p018g.p021e.C0142b.m3662a(r6)
                r4.f1204a = r0
            L_0x0016:
                r0 = 0
            L_0x0017:
                int r1 = r6.length
                if (r0 >= r1) goto L_0x0028
                a.g.e.b$b[] r1 = r4.f1204a
                r1 = r1[r0]
                r2 = r6[r0]
                r3 = r7[r0]
                r1.m3657a(r2, r3, r5)
                int r0 = r0 + 1
                goto L_0x0017
            L_0x0028:
                a.g.e.b$b[] r5 = r4.f1204a
                return r5
            L_0x002b:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Can't interpolate between two incompatible pathData"
                r5.<init>(r6)
                goto L_0x0034
            L_0x0033:
                throw r5
            L_0x0034:
                goto L_0x0033
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ p000a.p018g.p021e.C0142b.C0144b[] evaluate(float r1, p000a.p018g.p021e.C0142b.C0144b[] r2, p000a.p018g.p021e.C0142b.C0144b[] r3) {
                r0 = this;
                a.g.e.b$b[] r2 = (p000a.p018g.p021e.C0142b.C0144b[]) r2
                a.g.e.b$b[] r3 = (p000a.p018g.p021e.C0142b.C0144b[]) r3
                a.g.e.b$b[] r1 = r0.m2735a(r1, r2, r3)
                return r1
        }
    }

    /* renamed from: a */
    private static int m2740a(android.content.res.Resources r1, android.content.res.Resources.Theme r2, android.util.AttributeSet r3, org.xmlpull.v1.XmlPullParser r4) {
            int[] r0 = p000a.p046o.p047a.p048a.C0392a.f1190j
            android.content.res.TypedArray r1 = p000a.p018g.p019d.p020c.C0140g.m3681a(r1, r2, r3, r0)
            r2 = 0
            java.lang.String r3 = "value"
            android.util.TypedValue r3 = p000a.p018g.p019d.p020c.C0140g.m3674b(r1, r4, r3, r2)
            if (r3 == 0) goto L_0x0011
            r4 = 1
            goto L_0x0012
        L_0x0011:
            r4 = 0
        L_0x0012:
            if (r4 == 0) goto L_0x001d
            int r3 = r3.type
            boolean r3 = m2754a(r3)
            if (r3 == 0) goto L_0x001d
            r2 = 3
        L_0x001d:
            r1.recycle()
            return r2
    }

    /* renamed from: a */
    private static int m2739a(android.content.res.TypedArray r3, int r4, int r5) {
            android.util.TypedValue r4 = r3.peekValue(r4)
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x000a
            r2 = 1
            goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            if (r2 == 0) goto L_0x0010
            int r4 = r4.type
            goto L_0x0011
        L_0x0010:
            r4 = 0
        L_0x0011:
            android.util.TypedValue r3 = r3.peekValue(r5)
            if (r3 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x001e
            int r3 = r3.type
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r2 == 0) goto L_0x0027
            boolean r4 = m2754a(r4)
            if (r4 != 0) goto L_0x002f
        L_0x0027:
            if (r0 == 0) goto L_0x0030
            boolean r3 = m2754a(r3)
            if (r3 == 0) goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            return r1
    }

    /* renamed from: a */
    public static android.animation.Animator m2750a(android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x000b
            android.animation.Animator r2 = android.animation.AnimatorInflater.loadAnimator(r2, r3)
            goto L_0x0017
        L_0x000b:
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Resources$Theme r1 = r2.getTheme()
            android.animation.Animator r2 = m2749a(r2, r0, r1, r3)
        L_0x0017:
            return r2
    }

    /* renamed from: a */
    public static android.animation.Animator m2749a(android.content.Context r1, android.content.res.Resources r2, android.content.res.Resources.Theme r3, int r4) {
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.Animator r1 = m2748a(r1, r2, r3, r4, r0)
            return r1
    }

    /* renamed from: a */
    public static android.animation.Animator m2748a(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, int r5, float r6) {
            java.lang.String r0 = "Can't load animation resource ID #0x"
            r1 = 0
            android.content.res.XmlResourceParser r1 = r3.getAnimation(r5)     // Catch: all -> 0x0011, IOException -> 0x0013, XmlPullParserException -> 0x0030
            android.animation.Animator r2 = m2744a(r2, r3, r4, r1, r6)     // Catch: all -> 0x0011, IOException -> 0x0013, XmlPullParserException -> 0x0030
            if (r1 == 0) goto L_0x0010
            r1.close()
        L_0x0010:
            return r2
        L_0x0011:
            r2 = move-exception
            goto L_0x004d
        L_0x0013:
            r2 = move-exception
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch: all -> 0x0011
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0011
            r4.<init>()     // Catch: all -> 0x0011
            r4.append(r0)     // Catch: all -> 0x0011
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: all -> 0x0011
            r4.append(r5)     // Catch: all -> 0x0011
            java.lang.String r4 = r4.toString()     // Catch: all -> 0x0011
            r3.<init>(r4)     // Catch: all -> 0x0011
            r3.initCause(r2)     // Catch: all -> 0x0011
            throw r3     // Catch: all -> 0x0011
        L_0x0030:
            r2 = move-exception
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch: all -> 0x0011
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0011
            r4.<init>()     // Catch: all -> 0x0011
            r4.append(r0)     // Catch: all -> 0x0011
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: all -> 0x0011
            r4.append(r5)     // Catch: all -> 0x0011
            java.lang.String r4 = r4.toString()     // Catch: all -> 0x0011
            r3.<init>(r4)     // Catch: all -> 0x0011
            r3.initCause(r2)     // Catch: all -> 0x0011
            throw r3     // Catch: all -> 0x0011
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.close()
        L_0x0052:
            throw r2
    }

    /* renamed from: a */
    private static android.animation.Animator m2744a(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, org.xmlpull.v1.XmlPullParser r11, float r12) {
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r11)
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r12
            android.animation.Animator r8 = m2742a(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    /* renamed from: a */
    private static android.animation.Animator m2742a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        L_0x000e:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto L_0x00df
        L_0x001c:
            r2 = 1
            if (r1 == r2) goto L_0x00df
            r3 = 2
            if (r1 == r3) goto L_0x0023
            goto L_0x000e
        L_0x0023:
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0043
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = m2747a(r0, r1, r2, r3, r4, r5)
        L_0x003f:
            r3 = r18
            goto L_0x00b4
        L_0x0043:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005d
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = m2745a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x003f
        L_0x005d:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0093
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = p000a.p046o.p047a.p048a.C0392a.f1188h
            r7 = r22
            android.content.res.TypedArray r6 = p000a.p018g.p019d.p020c.C0140g.m3681a(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = p000a.p018g.p019d.p020c.C0140g.m3673b(r6, r10, r0, r14, r14)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r15
            r17 = r6
            r6 = r16
            r7 = r25
            m2742a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto L_0x00b4
        L_0x0093:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c4
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = m2743a(r3, r8, r9, r10, r1)
            if (r1 == 0) goto L_0x00b3
            if (r0 == 0) goto L_0x00b3
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00b3
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00b3:
            r14 = 1
        L_0x00b4:
            if (r11 == 0) goto L_0x000e
            if (r14 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x00bf
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00bf:
            r13.add(r0)
            goto L_0x000e
        L_0x00c4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown animator name: "
            r1.append(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00df:
            if (r11 == 0) goto L_0x0108
            if (r13 == 0) goto L_0x0108
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x00ed:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ff
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x00ed
        L_0x00ff:
            if (r24 != 0) goto L_0x0105
            r11.playTogether(r1)
            goto L_0x0108
        L_0x0105:
            r11.playSequentially(r1)
        L_0x0108:
            return r0
    }

    /* renamed from: a */
    private static android.animation.Keyframe m2753a(android.animation.Keyframe r2, float r3) {
            java.lang.Class r0 = r2.getType()
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L_0x000d
            android.animation.Keyframe r2 = android.animation.Keyframe.ofFloat(r3)
            goto L_0x001e
        L_0x000d:
            java.lang.Class r2 = r2.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto L_0x001a
            android.animation.Keyframe r2 = android.animation.Keyframe.ofInt(r3)
            goto L_0x001e
        L_0x001a:
            android.animation.Keyframe r2 = android.animation.Keyframe.ofObject(r3)
        L_0x001e:
            return r2
    }

    /* renamed from: a */
    private static android.animation.Keyframe m2746a(android.content.Context r6, android.content.res.Resources r7, android.content.res.Resources.Theme r8, android.util.AttributeSet r9, int r10, org.xmlpull.v1.XmlPullParser r11) {
            int[] r0 = p000a.p046o.p047a.p048a.C0392a.f1190j
            android.content.res.TypedArray r7 = p000a.p018g.p019d.p020c.C0140g.m3681a(r7, r8, r9, r0)
            r8 = 3
            java.lang.String r9 = "fraction"
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r9 = p000a.p018g.p019d.p020c.C0140g.m3678a(r7, r11, r9, r8, r0)
            java.lang.String r0 = "value"
            r1 = 0
            android.util.TypedValue r2 = p000a.p018g.p019d.p020c.C0140g.m3674b(r7, r11, r0, r1)
            r3 = 1
            if (r2 == 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            r5 = 4
            if (r10 != r5) goto L_0x002c
            if (r4 == 0) goto L_0x002b
            int r10 = r2.type
            boolean r10 = m2754a(r10)
            if (r10 == 0) goto L_0x002b
            r10 = 3
            goto L_0x002c
        L_0x002b:
            r10 = 0
        L_0x002c:
            if (r4 == 0) goto L_0x0049
            if (r10 == 0) goto L_0x003f
            if (r10 == r3) goto L_0x0036
            if (r10 == r8) goto L_0x0036
            r8 = 0
            goto L_0x0054
        L_0x0036:
            int r8 = p000a.p018g.p019d.p020c.C0140g.m3673b(r7, r11, r0, r1, r1)
            android.animation.Keyframe r8 = android.animation.Keyframe.ofInt(r9, r8)
            goto L_0x0054
        L_0x003f:
            r8 = 0
            float r8 = p000a.p018g.p019d.p020c.C0140g.m3678a(r7, r11, r0, r1, r8)
            android.animation.Keyframe r8 = android.animation.Keyframe.ofFloat(r9, r8)
            goto L_0x0054
        L_0x0049:
            if (r10 != 0) goto L_0x0050
            android.animation.Keyframe r8 = android.animation.Keyframe.ofFloat(r9)
            goto L_0x0054
        L_0x0050:
            android.animation.Keyframe r8 = android.animation.Keyframe.ofInt(r9)
        L_0x0054:
            java.lang.String r9 = "interpolator"
            int r9 = p000a.p018g.p019d.p020c.C0140g.m3672c(r7, r11, r9, r3, r1)
            if (r9 <= 0) goto L_0x0063
            android.view.animation.Interpolator r6 = p000a.p046o.p047a.p048a.C0398d.m2756a(r6, r9)
            r8.setInterpolator(r6)
        L_0x0063:
            r7.recycle()
            return r8
    }

    /* renamed from: a */
    private static android.animation.ObjectAnimator m2747a(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, android.util.AttributeSet r11, float r12, org.xmlpull.v1.XmlPullParser r13) {
            android.animation.ObjectAnimator r7 = new android.animation.ObjectAnimator
            r7.<init>()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r7
            r5 = r12
            r6 = r13
            m2745a(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* renamed from: a */
    private static android.animation.PropertyValuesHolder m2741a(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) {
            r0 = 0
            r1 = r14
            r14 = r0
        L_0x0003:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L_0x0041
            r4 = 1
            if (r2 == r4) goto L_0x0041
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0003
            r2 = 4
            if (r1 != r2) goto L_0x0024
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r12)
            int r1 = m2740a(r10, r11, r1, r12)
        L_0x0024:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r1
            r7 = r12
            android.animation.Keyframe r2 = m2746a(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x003d
            if (r14 != 0) goto L_0x003a
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x003a:
            r14.add(r2)
        L_0x003d:
            r12.next()
            goto L_0x0003
        L_0x0041:
            if (r14 == 0) goto L_0x00ea
            int r9 = r14.size()
            if (r9 <= 0) goto L_0x00ea
            r10 = 0
            java.lang.Object r11 = r14.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + (-1)
            java.lang.Object r12 = r14.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0078
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
            r12.setFraction(r2)
            goto L_0x0078
        L_0x006b:
            int r0 = r14.size()
            android.animation.Keyframe r12 = m2753a(r12, r2)
            r14.add(r0, r12)
            int r9 = r9 + 1
        L_0x0078:
            float r12 = r11.getFraction()
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0091
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0088
            r11.setFraction(r4)
            goto L_0x0091
        L_0x0088:
            android.animation.Keyframe r11 = m2753a(r11, r4)
            r14.add(r10, r11)
            int r9 = r9 + 1
        L_0x0091:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r14.toArray(r11)
        L_0x0096:
            if (r10 >= r9) goto L_0x00dd
            r12 = r11[r10]
            float r14 = r12.getFraction()
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00da
            if (r10 != 0) goto L_0x00a8
            r12.setFraction(r4)
            goto L_0x00da
        L_0x00a8:
            int r14 = r9 + (-1)
            if (r10 != r14) goto L_0x00b0
            r12.setFraction(r2)
            goto L_0x00da
        L_0x00b0:
            int r12 = r10 + 1
            r0 = r10
        L_0x00b3:
            if (r12 >= r14) goto L_0x00c6
            r5 = r11[r12]
            float r5 = r5.getFraction()
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 < 0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            int r0 = r12 + 1
            r8 = r0
            r0 = r12
            r12 = r8
            goto L_0x00b3
        L_0x00c6:
            int r12 = r0 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r14 = r10 + (-1)
            r14 = r11[r14]
            float r14 = r14.getFraction()
            float r12 = r12 - r14
            m2736a(r11, r12, r10, r0)
        L_0x00da:
            int r10 = r10 + 1
            goto L_0x0096
        L_0x00dd:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r1 != r3) goto L_0x00ea
            a.o.a.a.f r9 = p000a.p046o.p047a.p048a.C0401f.m2734a()
            r0.setEvaluator(r9)
        L_0x00ea:
            return r0
    }

    /* renamed from: a */
    private static android.animation.PropertyValuesHolder m2738a(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = m2754a(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = m2754a(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = 3
            goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x00a9
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            a.g.e.b$b[] r13 = p000a.p018g.p021e.C0142b.m3667a(r12)
            a.g.e.b$b[] r14 = p000a.p018g.p021e.C0142b.m3667a(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0167
        L_0x0054:
            if (r13 == 0) goto L_0x0098
            a.o.a.a.e$a r0 = new a.o.a.a.e$a
            r0.<init>()
            if (r14 == 0) goto L_0x008d
            boolean r3 = p000a.p018g.p021e.C0142b.m3661a(r13, r14)
            if (r3 == 0) goto L_0x006e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0095
        L_0x006e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008d:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
        L_0x0095:
            r8 = r11
            goto L_0x0167
        L_0x0098:
            if (r14 == 0) goto L_0x0167
            a.o.a.a.e$a r11 = new a.o.a.a.e$a
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0167
        L_0x00a9:
            if (r12 != r7) goto L_0x00b0
            a.o.a.a.f r12 = p000a.p046o.p047a.p048a.C0401f.m2734a()
            goto L_0x00b1
        L_0x00b0:
            r12 = r8
        L_0x00b1:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00f9
            if (r3 == 0) goto L_0x00e3
            if (r0 != r7) goto L_0x00be
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00c2
        L_0x00be:
            float r13 = r11.getFloat(r13, r10)
        L_0x00c2:
            if (r5 == 0) goto L_0x00da
            if (r4 != r7) goto L_0x00cb
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00cf
        L_0x00cb:
            float r11 = r11.getFloat(r14, r10)
        L_0x00cf:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x00f6
        L_0x00da:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x00f6
        L_0x00e3:
            if (r4 != r7) goto L_0x00ea
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00ee
        L_0x00ea:
            float r11 = r11.getFloat(r14, r10)
        L_0x00ee:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
        L_0x00f6:
            r8 = r11
            goto L_0x0160
        L_0x00f9:
            if (r3 == 0) goto L_0x013f
            if (r0 != r7) goto L_0x0103
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0112
        L_0x0103:
            boolean r0 = m2754a(r0)
            if (r0 == 0) goto L_0x010e
            int r13 = r11.getColor(r13, r2)
            goto L_0x0112
        L_0x010e:
            int r13 = r11.getInt(r13, r2)
        L_0x0112:
            if (r5 == 0) goto L_0x0136
            if (r4 != r7) goto L_0x011c
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x012b
        L_0x011c:
            boolean r0 = m2754a(r4)
            if (r0 == 0) goto L_0x0127
            int r11 = r11.getColor(r14, r2)
            goto L_0x012b
        L_0x0127:
            int r11 = r11.getInt(r14, r2)
        L_0x012b:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x0160
        L_0x0136:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x0160
        L_0x013f:
            if (r5 == 0) goto L_0x0160
            if (r4 != r7) goto L_0x0149
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0158
        L_0x0149:
            boolean r13 = m2754a(r4)
            if (r13 == 0) goto L_0x0154
            int r11 = r11.getColor(r14, r2)
            goto L_0x0158
        L_0x0154:
            int r11 = r11.getInt(r14, r2)
        L_0x0158:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x0160:
            if (r8 == 0) goto L_0x0167
            if (r12 == 0) goto L_0x0167
            r8.setEvaluator(r12)
        L_0x0167:
            return r8
    }

    /* renamed from: a */
    private static android.animation.ValueAnimator m2745a(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, android.util.AttributeSet r5, android.animation.ValueAnimator r6, float r7, org.xmlpull.v1.XmlPullParser r8) {
            int[] r0 = p000a.p046o.p047a.p048a.C0392a.f1187g
            android.content.res.TypedArray r0 = p000a.p018g.p019d.p020c.C0140g.m3681a(r3, r4, r5, r0)
            int[] r1 = p000a.p046o.p047a.p048a.C0392a.f1191k
            android.content.res.TypedArray r3 = p000a.p018g.p019d.p020c.C0140g.m3681a(r3, r4, r5, r1)
            if (r6 != 0) goto L_0x0013
            android.animation.ValueAnimator r6 = new android.animation.ValueAnimator
            r6.<init>()
        L_0x0013:
            m2751a(r6, r0, r3, r7, r8)
            r4 = 0
            java.lang.String r5 = "interpolator"
            int r4 = p000a.p018g.p019d.p020c.C0140g.m3672c(r0, r8, r5, r4, r4)
            if (r4 <= 0) goto L_0x0026
            android.view.animation.Interpolator r2 = p000a.p046o.p047a.p048a.C0398d.m2756a(r2, r4)
            r6.setInterpolator(r2)
        L_0x0026:
            r0.recycle()
            if (r3 == 0) goto L_0x002e
            r3.recycle()
        L_0x002e:
            return r6
    }

    /* renamed from: a */
    private static void m2752a(android.animation.ValueAnimator r5, android.content.res.TypedArray r6, int r7, float r8, org.xmlpull.v1.XmlPullParser r9) {
            android.animation.ObjectAnimator r5 = (android.animation.ObjectAnimator) r5
            java.lang.String r0 = "pathData"
            r1 = 1
            java.lang.String r0 = p000a.p018g.p019d.p020c.C0140g.m3679a(r6, r9, r0, r1)
            if (r0 == 0) goto L_0x0048
            r1 = 2
            java.lang.String r2 = "propertyXName"
            java.lang.String r2 = p000a.p018g.p019d.p020c.C0140g.m3679a(r6, r9, r2, r1)
            r3 = 3
            java.lang.String r4 = "propertyYName"
            java.lang.String r9 = p000a.p018g.p019d.p020c.C0140g.m3679a(r6, r9, r4, r3)
            if (r7 == r1) goto L_0x001c
            r1 = 4
        L_0x001c:
            if (r2 != 0) goto L_0x003c
            if (r9 == 0) goto L_0x0021
            goto L_0x003c
        L_0x0021:
            android.view.InflateException r5 = new android.view.InflateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            r7.append(r6)
            java.lang.String r6 = " propertyXName or propertyYName is needed for PathData"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L_0x003c:
            android.graphics.Path r6 = p000a.p018g.p021e.C0142b.m3660b(r0)
            r7 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r7
            m2737a(r6, r5, r8, r2, r9)
            goto L_0x0052
        L_0x0048:
            r7 = 0
            java.lang.String r8 = "propertyName"
            java.lang.String r6 = p000a.p018g.p019d.p020c.C0140g.m3679a(r6, r9, r8, r7)
            r5.setPropertyName(r6)
        L_0x0052:
            return
    }

    /* renamed from: a */
    private static void m2751a(android.animation.ValueAnimator r11, android.content.res.TypedArray r12, android.content.res.TypedArray r13, float r14, org.xmlpull.v1.XmlPullParser r15) {
            r0 = 1
            java.lang.String r1 = "duration"
            r2 = 300(0x12c, float:4.2E-43)
            int r1 = p000a.p018g.p019d.p020c.C0140g.m3673b(r12, r15, r1, r0, r2)
            long r1 = (long) r1
            r3 = 0
            java.lang.String r4 = "startOffset"
            r5 = 2
            int r4 = p000a.p018g.p019d.p020c.C0140g.m3673b(r12, r15, r4, r5, r3)
            long r4 = (long) r4
            r6 = 4
            java.lang.String r7 = "valueType"
            r8 = 7
            int r7 = p000a.p018g.p019d.p020c.C0140g.m3673b(r12, r15, r7, r8, r6)
            java.lang.String r8 = "valueFrom"
            boolean r8 = p000a.p018g.p019d.p020c.C0140g.m3675a(r15, r8)
            if (r8 == 0) goto L_0x0042
            java.lang.String r8 = "valueTo"
            boolean r8 = p000a.p018g.p019d.p020c.C0140g.m3675a(r15, r8)
            if (r8 == 0) goto L_0x0042
            r8 = 6
            r9 = 5
            if (r7 != r6) goto L_0x0033
            int r7 = m2739a(r12, r9, r8)
        L_0x0033:
            java.lang.String r10 = ""
            android.animation.PropertyValuesHolder r8 = m2738a(r12, r7, r9, r8, r10)
            if (r8 == 0) goto L_0x0042
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[r0]
            r9[r3] = r8
            r11.setValues(r9)
        L_0x0042:
            r11.setDuration(r1)
            r11.setStartDelay(r4)
            r1 = 3
            java.lang.String r2 = "repeatCount"
            int r1 = p000a.p018g.p019d.p020c.C0140g.m3673b(r12, r15, r2, r1, r3)
            r11.setRepeatCount(r1)
            java.lang.String r1 = "repeatMode"
            int r12 = p000a.p018g.p019d.p020c.C0140g.m3673b(r12, r15, r1, r6, r0)
            r11.setRepeatMode(r12)
            if (r13 == 0) goto L_0x0060
            m2752a(r11, r13, r7, r14, r15)
        L_0x0060:
            return
    }

    /* renamed from: a */
    private static void m2737a(android.graphics.Path r17, android.animation.ObjectAnimator r18, float r19, java.lang.String r20, java.lang.String r21) {
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
            r5 = 0
            r4.<init>(r0, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            r6.add(r8)
            r8 = 0
        L_0x001c:
            float r9 = r4.getLength()
            float r8 = r8 + r9
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            r6.add(r9)
            boolean r9 = r4.nextContour()
            if (r9 != 0) goto L_0x001c
            android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
            r4.<init>(r0, r5)
            r0 = 100
            float r9 = r8 / r19
            int r9 = (int) r9
            r10 = 1
            int r9 = r9 + r10
            int r0 = java.lang.Math.min(r0, r9)
            float[] r9 = new float[r0]
            float[] r11 = new float[r0]
            r12 = 2
            float[] r13 = new float[r12]
            int r14 = r0 + (-1)
            float r14 = (float) r14
            float r8 = r8 / r14
            r7 = 0
            r14 = 0
            r15 = 0
        L_0x004c:
            r12 = 0
            if (r7 >= r0) goto L_0x0086
            java.lang.Object r16 = r6.get(r15)
            java.lang.Float r16 = (java.lang.Float) r16
            float r16 = r16.floatValue()
            float r10 = r14 - r16
            r4.getPosTan(r10, r13, r12)
            r10 = r13[r5]
            r9[r7] = r10
            r10 = 1
            r12 = r13[r10]
            r11[r7] = r12
            float r14 = r14 + r8
            int r10 = r15 + 1
            int r12 = r6.size()
            if (r10 >= r12) goto L_0x0082
            java.lang.Object r12 = r6.get(r10)
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0082
            r4.nextContour()
            r15 = r10
        L_0x0082:
            int r7 = r7 + 1
            r10 = 1
            goto L_0x004c
        L_0x0086:
            if (r2 == 0) goto L_0x008d
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r2, r9)
            goto L_0x008e
        L_0x008d:
            r0 = r12
        L_0x008e:
            if (r3 == 0) goto L_0x0094
            android.animation.PropertyValuesHolder r12 = android.animation.PropertyValuesHolder.ofFloat(r3, r11)
        L_0x0094:
            r2 = 1
            if (r0 != 0) goto L_0x009f
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r2]
            r0[r5] = r12
            r1.setValues(r0)
            goto L_0x00b3
        L_0x009f:
            if (r12 != 0) goto L_0x00a9
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r2]
            r2[r5] = r0
            r1.setValues(r2)
            goto L_0x00b3
        L_0x00a9:
            r3 = 2
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[r3]
            r3[r5] = r0
            r3[r2] = r12
            r1.setValues(r3)
        L_0x00b3:
            return
    }

    /* renamed from: a */
    private static void m2736a(android.animation.Keyframe[] r2, float r3, int r4, int r5) {
            int r0 = r5 - r4
            int r0 = r0 + 2
            float r0 = (float) r0
            float r3 = r3 / r0
        L_0x0006:
            if (r4 > r5) goto L_0x0019
            r0 = r2[r4]
            int r1 = r4 + (-1)
            r1 = r2[r1]
            float r1 = r1.getFraction()
            float r1 = r1 + r3
            r0.setFraction(r1)
            int r4 = r4 + 1
            goto L_0x0006
        L_0x0019:
            return
    }

    /* renamed from: a */
    private static boolean m2754a(int r1) {
            r0 = 28
            if (r1 < r0) goto L_0x000a
            r0 = 31
            if (r1 > r0) goto L_0x000a
            r1 = 1
            goto L_0x000b
        L_0x000a:
            r1 = 0
        L_0x000b:
            return r1
    }

    /* renamed from: a */
    private static android.animation.PropertyValuesHolder[] m2743a(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) {
            r6 = r20
            r7 = 0
            r8 = r7
        L_0x0004:
            int r0 = r20.getEventType()
            r9 = 0
            r1 = 3
            if (r0 == r1) goto L_0x006a
            r10 = 1
            if (r0 == r10) goto L_0x006a
            r2 = 2
            if (r0 == r2) goto L_0x0016
        L_0x0012:
            r20.next()
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0063
            int[] r0 = p000a.p046o.p047a.p048a.C0392a.f1189i
            r11 = r18
            r12 = r19
            r13 = r21
            android.content.res.TypedArray r14 = p000a.p018g.p019d.p020c.C0140g.m3681a(r11, r12, r13, r0)
            java.lang.String r0 = "propertyName"
            java.lang.String r15 = p000a.p018g.p019d.p020c.C0140g.m3679a(r14, r6, r0, r1)
            r0 = 4
            java.lang.String r1 = "valueType"
            int r5 = p000a.p018g.p019d.p020c.C0140g.m3673b(r14, r6, r1, r2, r0)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = m2741a(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0052
            r1 = r16
            android.animation.PropertyValuesHolder r0 = m2738a(r14, r1, r9, r10, r15)
        L_0x0052:
            if (r0 == 0) goto L_0x005f
            if (r8 != 0) goto L_0x005c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8 = r1
        L_0x005c:
            r8.add(r0)
        L_0x005f:
            r14.recycle()
            goto L_0x0012
        L_0x0063:
            r11 = r18
            r12 = r19
            r13 = r21
            goto L_0x0012
        L_0x006a:
            if (r8 == 0) goto L_0x007f
            int r0 = r8.size()
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[r0]
        L_0x0072:
            if (r9 >= r0) goto L_0x007f
            java.lang.Object r1 = r8.get(r9)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r7[r9] = r1
            int r9 = r9 + 1
            goto L_0x0072
        L_0x007f:
            return r7
    }
}
