package p000a.p046o.p047a.p048a;

/* renamed from: a.o.a.a.d */
/* loaded from: classes.dex */
public class C0398d {
    /* renamed from: a */
    public static android.view.animation.Interpolator m2756a(android.content.Context r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r5)
            return r4
        L_0x000b:
            r0 = 0
            r1 = 17563663(0x10c000f, float:2.571398E-38)
            java.lang.String r2 = "Can't load animation resource ID #0x"
            if (r5 != r1) goto L_0x001f
            a.k.a.a.a r4 = new a.k.a.a.a     // Catch: all -> 0x0019, IOException -> 0x001b, XmlPullParserException -> 0x001d
            r4.<init>()     // Catch: all -> 0x0019, IOException -> 0x001b, XmlPullParserException -> 0x001d
            return r4
        L_0x0019:
            r4 = move-exception
            goto L_0x0087
        L_0x001b:
            r4 = move-exception
            goto L_0x004f
        L_0x001d:
            r4 = move-exception
            goto L_0x006b
        L_0x001f:
            r1 = 17563661(0x10c000d, float:2.5713975E-38)
            if (r5 != r1) goto L_0x002a
            a.k.a.a.b r4 = new a.k.a.a.b     // Catch: all -> 0x0019, IOException -> 0x001b, XmlPullParserException -> 0x001d
            r4.<init>()     // Catch: all -> 0x0019, IOException -> 0x001b, XmlPullParserException -> 0x001d
            return r4
        L_0x002a:
            r1 = 17563662(0x10c000e, float:2.5713978E-38)
            if (r5 != r1) goto L_0x0035
            a.k.a.a.c r4 = new a.k.a.a.c     // Catch: all -> 0x0019, IOException -> 0x001b, XmlPullParserException -> 0x001d
            r4.<init>()     // Catch: all -> 0x0019, IOException -> 0x001b, XmlPullParserException -> 0x001d
            return r4
        L_0x0035:
            android.content.res.Resources r1 = r4.getResources()     // Catch: all -> 0x0019, IOException -> 0x001b, XmlPullParserException -> 0x001d
            android.content.res.XmlResourceParser r0 = r1.getAnimation(r5)     // Catch: all -> 0x0019, IOException -> 0x001b, XmlPullParserException -> 0x001d
            android.content.res.Resources r1 = r4.getResources()     // Catch: all -> 0x0019, IOException -> 0x001b, XmlPullParserException -> 0x001d
            android.content.res.Resources$Theme r3 = r4.getTheme()     // Catch: all -> 0x0019, IOException -> 0x001b, XmlPullParserException -> 0x001d
            android.view.animation.Interpolator r4 = m2755a(r4, r1, r3, r0)     // Catch: all -> 0x0019, IOException -> 0x001b, XmlPullParserException -> 0x001d
            if (r0 == 0) goto L_0x004e
            r0.close()
        L_0x004e:
            return r4
        L_0x004f:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException     // Catch: all -> 0x0019
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0019
            r3.<init>()     // Catch: all -> 0x0019
            r3.append(r2)     // Catch: all -> 0x0019
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: all -> 0x0019
            r3.append(r5)     // Catch: all -> 0x0019
            java.lang.String r5 = r3.toString()     // Catch: all -> 0x0019
            r1.<init>(r5)     // Catch: all -> 0x0019
            r1.initCause(r4)     // Catch: all -> 0x0019
            throw r1     // Catch: all -> 0x0019
        L_0x006b:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException     // Catch: all -> 0x0019
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0019
            r3.<init>()     // Catch: all -> 0x0019
            r3.append(r2)     // Catch: all -> 0x0019
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: all -> 0x0019
            r3.append(r5)     // Catch: all -> 0x0019
            java.lang.String r5 = r3.toString()     // Catch: all -> 0x0019
            r1.<init>(r5)     // Catch: all -> 0x0019
            r1.initCause(r4)     // Catch: all -> 0x0019
            throw r1     // Catch: all -> 0x0019
        L_0x0087:
            if (r0 == 0) goto L_0x008c
            r0.close()
        L_0x008c:
            throw r4
    }

    /* renamed from: a */
    private static android.view.animation.Interpolator m2755a(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
            int r3 = r5.getDepth()
            r4 = 0
        L_0x0005:
            int r0 = r5.next()
            r1 = 3
            if (r0 != r1) goto L_0x0012
            int r1 = r5.getDepth()
            if (r1 <= r3) goto L_0x00ca
        L_0x0012:
            r1 = 1
            if (r0 == r1) goto L_0x00ca
            r1 = 2
            if (r0 == r1) goto L_0x0019
            goto L_0x0005
        L_0x0019:
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r5)
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "linearInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x002f
            android.view.animation.LinearInterpolator r4 = new android.view.animation.LinearInterpolator
            r4.<init>()
            goto L_0x0005
        L_0x002f:
            java.lang.String r1 = "accelerateInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003e
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r2, r4)
        L_0x003c:
            r4 = r0
            goto L_0x0005
        L_0x003e:
            java.lang.String r1 = "decelerateInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x004c
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r2, r4)
            goto L_0x003c
        L_0x004c:
            java.lang.String r1 = "accelerateDecelerateInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x005a
            android.view.animation.AccelerateDecelerateInterpolator r4 = new android.view.animation.AccelerateDecelerateInterpolator
            r4.<init>()
            goto L_0x0005
        L_0x005a:
            java.lang.String r1 = "cycleInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0068
            android.view.animation.CycleInterpolator r0 = new android.view.animation.CycleInterpolator
            r0.<init>(r2, r4)
            goto L_0x003c
        L_0x0068:
            java.lang.String r1 = "anticipateInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0076
            android.view.animation.AnticipateInterpolator r0 = new android.view.animation.AnticipateInterpolator
            r0.<init>(r2, r4)
            goto L_0x003c
        L_0x0076:
            java.lang.String r1 = "overshootInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0084
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>(r2, r4)
            goto L_0x003c
        L_0x0084:
            java.lang.String r1 = "anticipateOvershootInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0092
            android.view.animation.AnticipateOvershootInterpolator r0 = new android.view.animation.AnticipateOvershootInterpolator
            r0.<init>(r2, r4)
            goto L_0x003c
        L_0x0092:
            java.lang.String r1 = "bounceInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00a1
            android.view.animation.BounceInterpolator r4 = new android.view.animation.BounceInterpolator
            r4.<init>()
            goto L_0x0005
        L_0x00a1:
            java.lang.String r1 = "pathInterpolator"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            a.o.a.a.g r0 = new a.o.a.a.g
            r0.<init>(r2, r4, r5)
            goto L_0x003c
        L_0x00af:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown interpolator name: "
            r3.append(r4)
            java.lang.String r4 = r5.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x00ca:
            return r4
    }
}
