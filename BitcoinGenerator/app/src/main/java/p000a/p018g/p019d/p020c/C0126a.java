package p000a.p018g.p019d.p020c;

/* renamed from: a.g.d.c.a */
/* loaded from: classes.dex */
public final class C0126a {
    /* renamed from: a */
    private static int m3729a(int r1, float r2) {
            int r0 = android.graphics.Color.alpha(r1)
            float r0 = (float) r0
            float r0 = r0 * r2
            int r2 = java.lang.Math.round(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            int r2 = r2 << 24
            r1 = r1 | r2
            return r1
    }

    /* renamed from: a */
    public static android.content.res.ColorStateList m3727a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = m3726a(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            goto L_0x001f
        L_0x001e:
            throw r4
        L_0x001f:
            goto L_0x001e
    }

    /* renamed from: a */
    public static android.content.res.ColorStateList m3726a(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4, android.content.res.Resources.Theme r5) {
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "selector"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0011
            android.content.res.ColorStateList r2 = m3725b(r2, r3, r4, r5)
            return r2
        L_0x0011:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r4.append(r3)
            java.lang.String r3 = ": invalid color state list tag "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: a */
    private static android.content.res.TypedArray m3728a(android.content.res.Resources r0, android.content.res.Resources.Theme r1, android.util.AttributeSet r2, int[] r3) {
            if (r1 != 0) goto L_0x0007
            android.content.res.TypedArray r0 = r0.obtainAttributes(r2, r3)
            goto L_0x000c
        L_0x0007:
            r0 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r0, r0)
        L_0x000c:
            return r0
    }

    /* renamed from: b */
    private static android.content.res.ColorStateList m3725b(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
            r0 = r19
            int r1 = r18.getDepth()
            r2 = 1
            int r1 = r1 + r2
            r3 = 20
            int[][] r3 = new int[r3]
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 0
            r6 = 0
        L_0x0011:
            int r7 = r18.next()
            if (r7 == r2) goto L_0x00b2
            int r8 = r18.getDepth()
            if (r8 >= r1) goto L_0x0020
            r9 = 3
            if (r7 == r9) goto L_0x00b2
        L_0x0020:
            r9 = 2
            if (r7 != r9) goto L_0x00ab
            if (r8 > r1) goto L_0x00ab
            java.lang.String r7 = r18.getName()
            java.lang.String r8 = "item"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0033
            goto L_0x00ab
        L_0x0033:
            int[] r7 = p000a.p018g.C0123c.ColorStateListItem
            r8 = r17
            r9 = r20
            android.content.res.TypedArray r7 = m3728a(r8, r9, r0, r7)
            int r10 = p000a.p018g.C0123c.ColorStateListItem_android_color
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r7.getColor(r10, r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = p000a.p018g.C0123c.ColorStateListItem_android_alpha
            boolean r12 = r7.hasValue(r12)
            if (r12 == 0) goto L_0x0057
            int r12 = p000a.p018g.C0123c.ColorStateListItem_android_alpha
        L_0x0052:
            float r11 = r7.getFloat(r12, r11)
            goto L_0x0062
        L_0x0057:
            int r12 = p000a.p018g.C0123c.ColorStateListItem_alpha
            boolean r12 = r7.hasValue(r12)
            if (r12 == 0) goto L_0x0062
            int r12 = p000a.p018g.C0123c.ColorStateListItem_alpha
            goto L_0x0052
        L_0x0062:
            r7.recycle()
            int r7 = r19.getAttributeCount()
            int[] r12 = new int[r7]
            r13 = 0
            r14 = 0
        L_0x006d:
            if (r13 >= r7) goto L_0x0092
            int r15 = r0.getAttributeNameResource(r13)
            r2 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r2) goto L_0x008e
            r2 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r2) goto L_0x008e
            int r2 = p000a.p018g.C0121a.alpha
            if (r15 == r2) goto L_0x008e
            int r2 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r13, r5)
            if (r16 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            int r15 = -r15
        L_0x008b:
            r12[r14] = r15
            r14 = r2
        L_0x008e:
            int r13 = r13 + 1
            r2 = 1
            goto L_0x006d
        L_0x0092:
            int[] r2 = android.util.StateSet.trimStateSet(r12, r14)
            int r7 = m3729a(r10, r11)
            if (r6 == 0) goto L_0x009d
            int r10 = r2.length
        L_0x009d:
            int[] r4 = p000a.p018g.p019d.p020c.C0135e.m3689a(r4, r6, r7)
            java.lang.Object[] r2 = p000a.p018g.p019d.p020c.C0135e.m3688a(r3, r6, r2)
            r3 = r2
            int[][] r3 = (int[][]) r3
            int r6 = r6 + 1
            goto L_0x00af
        L_0x00ab:
            r8 = r17
            r9 = r20
        L_0x00af:
            r2 = 1
            goto L_0x0011
        L_0x00b2:
            int[] r0 = new int[r6]
            int[][] r1 = new int[r6]
            java.lang.System.arraycopy(r4, r5, r0, r5, r6)
            java.lang.System.arraycopy(r3, r5, r1, r5, r6)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
    }
}
