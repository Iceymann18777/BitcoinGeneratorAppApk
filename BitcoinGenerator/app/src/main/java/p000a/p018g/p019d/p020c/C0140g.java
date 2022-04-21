package p000a.p018g.p019d.p020c;

/* renamed from: a.g.d.c.g */
/* loaded from: classes.dex */
public class C0140g {
    /* renamed from: a */
    public static float m3678a(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3, float r4) {
            boolean r1 = m3675a(r1, r2)
            if (r1 != 0) goto L_0x0007
            return r4
        L_0x0007:
            float r0 = r0.getFloat(r3, r4)
            return r0
    }

    /* renamed from: a */
    public static int m3677a(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3, int r4) {
            boolean r1 = m3675a(r1, r2)
            if (r1 != 0) goto L_0x0007
            return r4
        L_0x0007:
            int r0 = r0.getColor(r3, r4)
            return r0
    }

    /* renamed from: a */
    public static p000a.p018g.p019d.p020c.C0127b m3680a(android.content.res.TypedArray r1, org.xmlpull.v1.XmlPullParser r2, android.content.res.Resources.Theme r3, java.lang.String r4, int r5, int r6) {
            boolean r2 = m3675a(r2, r4)
            if (r2 == 0) goto L_0x002f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.getValue(r5, r2)
            int r4 = r2.type
            r0 = 28
            if (r4 < r0) goto L_0x001f
            r0 = 31
            if (r4 > r0) goto L_0x001f
            int r1 = r2.data
            a.g.d.c.b r1 = p000a.p018g.p019d.p020c.C0127b.m3717b(r1)
            return r1
        L_0x001f:
            android.content.res.Resources r2 = r1.getResources()
            r4 = 0
            int r1 = r1.getResourceId(r5, r4)
            a.g.d.c.b r1 = p000a.p018g.p019d.p020c.C0127b.m3716b(r2, r1, r3)
            if (r1 == 0) goto L_0x002f
            return r1
        L_0x002f:
            a.g.d.c.b r1 = p000a.p018g.p019d.p020c.C0127b.m3717b(r6)
            return r1
    }

    /* renamed from: a */
    public static android.content.res.TypedArray m3681a(android.content.res.Resources r0, android.content.res.Resources.Theme r1, android.util.AttributeSet r2, int[] r3) {
            if (r1 != 0) goto L_0x0007
            android.content.res.TypedArray r0 = r0.obtainAttributes(r2, r3)
            return r0
        L_0x0007:
            r0 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r0, r0)
            return r0
    }

    /* renamed from: a */
    public static java.lang.String m3679a(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3) {
            boolean r1 = m3675a(r1, r2)
            if (r1 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            java.lang.String r0 = r0.getString(r3)
            return r0
    }

    /* renamed from: a */
    public static boolean m3676a(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3, boolean r4) {
            boolean r1 = m3675a(r1, r2)
            if (r1 != 0) goto L_0x0007
            return r4
        L_0x0007:
            boolean r0 = r0.getBoolean(r3, r4)
            return r0
    }

    /* renamed from: a */
    public static boolean m3675a(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 == 0) goto L_0x000a
            r1 = 1
            goto L_0x000b
        L_0x000a:
            r1 = 0
        L_0x000b:
            return r1
    }

    /* renamed from: b */
    public static int m3673b(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3, int r4) {
            boolean r1 = m3675a(r1, r2)
            if (r1 != 0) goto L_0x0007
            return r4
        L_0x0007:
            int r0 = r0.getInt(r3, r4)
            return r0
    }

    /* renamed from: b */
    public static android.util.TypedValue m3674b(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3) {
            boolean r1 = m3675a(r1, r2)
            if (r1 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            android.util.TypedValue r0 = r0.peekValue(r3)
            return r0
    }

    /* renamed from: c */
    public static int m3672c(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3, int r4) {
            boolean r1 = m3675a(r1, r2)
            if (r1 != 0) goto L_0x0007
            return r4
        L_0x0007:
            int r0 = r0.getResourceId(r3, r4)
            return r0
    }
}
